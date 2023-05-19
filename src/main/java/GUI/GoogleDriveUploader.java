/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

/**
 *
 * @author ASUS
 */
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.FileContent;
import com.google.api.services.drive.Drive;
import com.google.api.services.drive.DriveScopes;
import com.google.api.services.drive.model.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Collections;
import javax.swing.ImageIcon;

public class GoogleDriveUploader {

    private static final String APPLICATION_NAME = "DoAnJava";
    private static final String CREDENTIALS_FILE_PATH = "/doanjava-386815-188644ee2f3d.json";

    public static ImageIcon pushAnhLenDrive(String pathImage) {
        try {
            // Load credentials
            GoogleCredential credentials = GoogleCredential.fromStream(
                    GoogleDriveUploader.class.getResourceAsStream(CREDENTIALS_FILE_PATH))
                    .createScoped(Collections.singleton(DriveScopes.DRIVE_FILE));

            // Initialize the Drive service
            Drive driveService = new Drive.Builder(
                    GoogleNetHttpTransport.newTrustedTransport(),
                    com.google.api.client.json.jackson2.JacksonFactory.getDefaultInstance(),
                    credentials)
                    .setApplicationName(APPLICATION_NAME)
                    .build();

            // Create the file metadata
            File fileMetadata = new File();
            fileMetadata.setName("HoaDonJava");

            // Set the parent folder ID if needed
            fileMetadata.setParents(Collections.singletonList("1ldZi2N_NlNYbU0nirJmEFhfch9ds2Dwh"));

            // Create the file content
            java.io.File imageFile = new java.io.File(pathImage);

            FileContent mediaContent = new FileContent("image/jpeg", imageFile);

            // Upload the file to Google Drive
            File uploadedFile = driveService.files().create(fileMetadata, mediaContent)
                    .setFields("webViewLink")
                    .execute();

            System.out.println("File ID: " + uploadedFile.getWebViewLink());
           ImageIcon ii=new ImageIcon( QRCodeGenerator.generateQRCodeImage(uploadedFile.getWebViewLink()));
            
            //System.out.println("Image uploaded successfully.");
            return ii;
        } catch (GeneralSecurityException | IOException e) {
            e.printStackTrace();
            Exception exp = new Exception("Khong push duoc nguoi ae oi!");
            return null;
        }
    }
}
