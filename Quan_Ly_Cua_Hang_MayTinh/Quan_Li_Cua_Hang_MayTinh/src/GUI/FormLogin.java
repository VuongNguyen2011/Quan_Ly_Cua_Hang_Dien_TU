package GUI;

import BUS.Buss;
import DAL.ConnectSQL;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * @Ngay 6/4/2021
 * @author Nguyen
 * @Form Login Do an quan li cua hang ban may tinh 
 */
public class FormLogin extends javax.swing.JFrame {

    /**
     * Creates new form FormLogin
     */
    Connection con = null;
    Buss buss = null;
    static String maNV;

    public static String getMaNV() {
        return maNV;
    }

    public static void setMaNV(String maNV) {
        FormLogin.maNV = maNV;
    }
    public FormLogin() {
        initComponents();
        try {
            buss = new Buss();
        } catch (SQLException ex) {
            Logger.getLogger(FormLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        // hien thi ra giua man hinh 
        this.setLocationRelativeTo(null);

        try {
            con = (Connection) ConnectSQL.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(FormLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        btn_login = new javax.swing.JButton();
        Jtext_User = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Jtetx_Pass = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng Nhập");
        setAlwaysOnTop(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255), 3));

        btn_login.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_login.setText("Đăng Nhập");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        btn_login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_loginKeyPressed(evt);
            }
        });

        Jtext_User.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Jtext_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jtext_UserActionPerformed(evt);
            }
        });
        Jtext_User.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Jtext_UserKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/User.png"))); // NOI18N
        jLabel1.setText("User :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Unlock.png"))); // NOI18N
        jLabel2.setText("Pass :");

        Jtetx_Pass.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Jtetx_Pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jtetx_PassActionPerformed(evt);
            }
        });
        Jtetx_Pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Jtetx_PassKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Đăng Nhập");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/iconuser.png"))); // NOI18N
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabel4.setMinimumSize(new java.awt.Dimension(100, 100));
        jLabel4.setPreferredSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Jtetx_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Jtext_User, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_login)
                        .addGap(74, 74, 74)))
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jtext_User, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jtetx_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(33, 33, 33)
                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Jtext_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jtext_UserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jtext_UserActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed


        try {
            String user = Jtext_User.getText();
            String pass = String.valueOf(Jtetx_Pass.getPassword());
            
            String check = buss.checkLogin(user, pass);
            if (check!="") {
                
                JOptionPane.showMessageDialog(rootPane, "Đăng nhập thành công", "Đăng nhập", 2);
                maNV = check;
                indexForm index = new indexForm(check);
                index.setVisible(true);
                index.setLocale(null);
                index.pack();
                this.setVisible(false);
                
                

            } else {
                JOptionPane.showMessageDialog(rootPane, "Sai Tên Tài Khoản hoặc Mật Khẩu", "Đăng nhập", 2);

            }
            
//            System.out.println(String.valueOf(Jtetx_Pass.getPassword()) + " " + Jtext_User.getText());
        } catch (SQLException ex) {
            Logger.getLogger(FormLogin.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btn_loginActionPerformed

    private void Jtetx_PassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jtetx_PassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jtetx_PassActionPerformed

    private void Jtetx_PassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Jtetx_PassKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

     try {
            String user = Jtext_User.getText();
            String pass = String.valueOf(Jtetx_Pass.getPassword());
            
            String check = buss.checkLogin(user, pass);
            if (check!="") {
                
                JOptionPane.showMessageDialog(rootPane, "Đăng nhập thành công", "Đăng nhập", 2);
                
                indexForm index = new indexForm(check);
                index.setVisible(true);
                index.setLocale(null);
                index.pack();
                this.setVisible(false);
                
                

            } else {
                JOptionPane.showMessageDialog(rootPane, "Sai Tên Tài Khoản hoặc Mật Khẩu", "Đăng nhập", 2);

            }
            
//            System.out.println(String.valueOf(Jtetx_Pass.getPassword()) + " " + Jtext_User.getText());
        } catch (SQLException ex) {
            Logger.getLogger(FormLogin.class.getName()).log(Level.SEVERE, null, ex);
        }

        }
    }//GEN-LAST:event_Jtetx_PassKeyPressed

    private void btn_loginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_loginKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

         try {
            String user = Jtext_User.getText();
            String pass = String.valueOf(Jtetx_Pass.getPassword());
            
            String check = buss.checkLogin(user, pass);
            if (check!="") {
                
                JOptionPane.showMessageDialog(rootPane, "Đăng nhập thành công", "Đăng nhập", 2);
                
                indexForm index = new indexForm(check);
                index.setVisible(true);
                index.setLocale(null);
                index.pack();
                this.setVisible(false);
                
                

            } else {
                JOptionPane.showMessageDialog(rootPane, "Sai Tên Tài Khoản hoặc Mật Khẩu", "Đăng nhập", 2);

            }
            
//            System.out.println(String.valueOf(Jtetx_Pass.getPassword()) + " " + Jtext_User.getText());
        } catch (SQLException ex) {
            Logger.getLogger(FormLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        }

    }//GEN-LAST:event_btn_loginKeyPressed

    private void Jtext_UserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Jtext_UserKeyPressed

        
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

        try {
            String user = Jtext_User.getText();
            String pass = String.valueOf(Jtetx_Pass.getPassword());
            
            String check = buss.checkLogin(user, pass);
            if (check!="") {
                
                JOptionPane.showMessageDialog(rootPane, "Đăng nhập thành công", "Đăng nhập", 2);
                
                indexForm index = new indexForm(check);
                index.setVisible(true);
                index.setLocale(null);
                index.pack();
                this.setVisible(false);
                
                

            } else {
                JOptionPane.showMessageDialog(rootPane, "Sai Tên Tài Khoản hoặc Mật Khẩu", "Đăng nhập", 2);

            }
            
//            System.out.println(String.valueOf(Jtetx_Pass.getPassword()) + " " + Jtext_User.getText());
        } catch (SQLException ex) {
            Logger.getLogger(FormLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        }

    }//GEN-LAST:event_Jtext_UserKeyPressed

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Jtetx_Pass;
    private javax.swing.JTextField Jtext_User;
    private javax.swing.JButton btn_login;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}