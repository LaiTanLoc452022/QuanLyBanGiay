package GUI;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;



     public class createProfilePage extends JFrame implements ActionListener {

        Container container = getContentPane();

        JLabel name = new JLabel("Name: ");
        JTextField nameField = new JTextField();
        JLabel age = new JLabel("Age: ");
        JTextField ageField = new JTextField();
        JLabel interest = new JLabel("Interests: ");
        JTextField interestField = new JTextField();
        JLabel aboutMe = new JLabel("About me: ");
        JTextField aboutMeField = new JTextField();
        JLabel phoneNum = new JLabel("Phone Number: ");
        JTextField phoneNumberField = new JTextField();
        JLabel picLabel = new JLabel();

        JButton submit = new JButton("Save Profile");
        JButton deleteProfile = new JButton("Delete Profile");
        JButton uploadPic = new JButton("Upload Profile Picture");

        createProfilePage() {
            setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
            //setting container
            setLayoutManager();
            setLocationAndSize();
            addComponents();
            addActionEvent();

            setTitle("Welcome");
            setSize(600, 500);
        }

        public void setLayoutManager() {
            container.setLayout(null);
        }

        public void setLocationAndSize() {
            //Setting location and Size of each components using setBounds() method.
            name.setBounds(50, 100, 100, 30);
            age.setBounds(50, 170, 100, 30);
            phoneNum.setBounds(50, 240, 100, 30);
            interest.setBounds(50, 310, 100, 30);
            aboutMe.setBounds(50, 380, 100, 30);

            submit.setBounds(350, 240, 150, 30);
            deleteProfile.setBounds(350, 310, 150, 30);
            uploadPic.setBounds(350, 380, 150, 30);

            nameField.setBounds(150, 100, 150, 30);
            ageField.setBounds(150, 170, 150, 30);
            phoneNumberField.setBounds(150, 240, 150, 30);
            interestField.setBounds(150, 310, 150, 30);
            aboutMeField.setBounds(150, 380, 150, 30);
            picLabel.setBounds(350, 50, 150, 150);
        }

        public void addComponents() {
            container.add(name);
            container.add(age);
            container.add(phoneNum);
            container.add(interest);
            container.add(aboutMe);
            container.add(nameField);
            container.add(ageField);
            container.add(phoneNumberField);
            container.add(interestField);
            container.add(aboutMeField);
            container.add(picLabel);
            container.add(submit);
            container.add(deleteProfile);
            container.add(uploadPic);
        }

        public void addActionEvent() {
            submit.addActionListener(this);
            deleteProfile.addActionListener(this);
            uploadPic.addActionListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == uploadPic) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
                int result = fileChooser.showOpenDialog(getParent());
                if (result == JFileChooser.APPROVE_OPTION) {
                    try {
                        File file = fileChooser.getSelectedFile();
                        BufferedImage picture = ImageIO.read(file);
                        Image image=new ImageIcon(picture).getImage();
                        Image imagescaled=image.getScaledInstance(picLabel.getWidth(),picLabel.getHeight(),Image.SCALE_SMOOTH);
                        ImageIcon imageIcon=new ImageIcon(imagescaled);
                        picLabel.setIcon(imageIcon);
                        add(picLabel);
                    } catch (IOException ioe) {
                        ioe.printStackTrace();
                        JOptionPane.showMessageDialog(null, "ERROR");

                    }
                    catch(NullPointerException npe){
                        JOptionPane.showMessageDialog(null, "ERROR");
                    }
                }
            }
        }

        public static void main(String[] args) {
            Runnable r = () -> {
                new createProfilePage().setVisible(true);
            };
            SwingUtilities.invokeLater(r);
        }
    }

