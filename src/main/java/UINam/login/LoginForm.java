package UINam.login;

import DAO.NguoidungHome;
import GUIMAN.DEMO;
import static GUIMAN.Login1.nguoiDungLogin;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import entity1.Nguoidung;
import java.awt.BorderLayout;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import uk.co.caprica.vlcj.player.component.EmbeddedMediaPlayerComponent;
import uk.co.caprica.vlcj.player.embedded.EmbeddedMediaPlayer;

public class LoginForm extends javax.swing.JFrame {

    private EmbeddedMediaPlayerComponent mediaPlayerComponent = new EmbeddedMediaPlayerComponent();
    private EmbeddedMediaPlayer mediaPlayer;
    public List<Nguoidung> list;
    public static Nguoidung nguoiDungLogin;
    public DEMO ui;

    private void addVideo() {

        mediaPlayer = mediaPlayerComponent.mediaPlayer();
        videoPane.setLayout(new BorderLayout());
        videoPane.add(mediaPlayerComponent, BorderLayout.CENTER);
        add(videoPane, BorderLayout.CENTER);
        add(loginPanel);

        mediaPlayer.media().play("D:\\Downloads\\ultraboost-1mfinal.mp4");
        mediaPlayer.controls().setRepeat(true);
    }

    public LoginForm() {
        list = NguoidungHome.getAll(Nguoidung.class);

        initComponents();
        addVideo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        videoPane = new javax.swing.JPanel();
        loginPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        usernameTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        LoginBTN = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1244, 790));
        setMinimumSize(new java.awt.Dimension(1244, 790));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1244, 790));

        videoPane.setMaximumSize(new java.awt.Dimension(770, 790));
        videoPane.setMinimumSize(new java.awt.Dimension(770, 790));
        videoPane.setPreferredSize(new java.awt.Dimension(770, 790));

        javax.swing.GroupLayout videoPaneLayout = new javax.swing.GroupLayout(videoPane);
        videoPane.setLayout(videoPaneLayout);
        videoPaneLayout.setHorizontalGroup(
            videoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 784, Short.MAX_VALUE)
        );
        videoPaneLayout.setVerticalGroup(
            videoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        loginPanel.setBackground(new java.awt.Color(0, 0, 0));
        loginPanel.setMaximumSize(new java.awt.Dimension(460, 790));
        loginPanel.setMinimumSize(new java.awt.Dimension(460, 790));
        loginPanel.setPreferredSize(new java.awt.Dimension(460, 790));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\NAM\\OneDrive\\Máy tính\\SHOESING\\QuanLyBanGiay\\src\\main\\java\\UINam\\login\\login3.jpg")); // NOI18N
        jLabel5.setMaximumSize(new java.awt.Dimension(460, 789));
        jLabel5.setMinimumSize(new java.awt.Dimension(460, 789));
        jLabel5.setPreferredSize(new java.awt.Dimension(460, 788));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255, 175));
        jPanel2.setToolTipText("");
        jPanel2.setAlignmentX(1.0F);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LOGIN");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("USERNAME");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("PASSWORD");

        LoginBTN.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LoginBTN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginBTN.setText("SIGN IN");
        LoginBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginBTNMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(LoginBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(usernameTF, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                    .addComponent(jPasswordField1))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(LoginBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                .addGap(84, 84, 84))
        );

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(loginPanelLayout.createSequentialGroup()
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
            .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)))
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("X");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(videoPane, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 1172, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(videoPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE)
                    .addComponent(loginPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel4)
                    .addContainerGap(726, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void LoginBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginBTNMouseClicked
        // TODO add your handling code here:
        boolean state = false;
        if (!this.usernameTF.equals("")) {
            for (Nguoidung temp : list) {
                if (String.valueOf(jPasswordField1.getPassword()).equals(temp.getMatKhau()) && usernameTF.getText().equals(temp.getTenDangNhap())) {
                    state = true;
                    System.out.println("ThanhCong!");
                    this.dispose();
                    ui = new DEMO();
                    this.nguoiDungLogin = temp;
                    ui.nguoiDungLog = nguoiDungLogin;
                    ui.setVisible(true);
                    return;
                } else {
                    state = false;
                }
            }
        }
        if (state == false) {
            // JOptionPane.showMessageDialog(null, "invalid", "NULL", JOptionPane.ERROR_MESSAGE);
            handleLoginFailed();

        }

    }//GEN-LAST:event_LoginBTNMouseClicked
    private int loginAttempts = 0;
    private final int MAX_LOGIN_ATTEMPTS = 3;

    private void handleLoginFailed() {
        this.usernameTF.setText("");
        loginAttempts++;
        if (loginAttempts >= MAX_LOGIN_ATTEMPTS) {
            JOptionPane.showMessageDialog(null, "Số lần thử đăng nhập đã vượt quá giới hạn.");
            // Thực hiện hành động khi vượt quá giới hạn thử đăng nhập
        } else {
            LoginBTNMouseClicked(null);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            UIManager.setLookAndFeel(new FlatMacLightLaf() );
               } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        // Rest of your application code here
    
    //</editor-fold>


    /* Create and display the form */
    java.awt.EventQueue.invokeLater ( new Runnable() {
            

    public void run() {
        new LoginForm().setVisible(true);
    }
}
);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LoginBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JTextField usernameTF;
    private javax.swing.JPanel videoPane;
    // End of variables declaration//GEN-END:variables
}
