
import java.awt.Color;
import javax.swing.JOptionPane;
import java.awt.event.KeyEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author doquangminh
 */
public class Frame3_LoginStudent extends javax.swing.JFrame {

    /**
     * Creates new form Frame3_LoginStudent
     */
    public Frame3_LoginStudent() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bg1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        textFieldUsername = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        btnForgotPW = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        passwordField = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnBack2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 113, 164));

        bg1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Avenir Next", 1, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Student");

        textFieldUsername.setFont(new java.awt.Font("Avenir Next", 0, 18)); // NOI18N
        textFieldUsername.setBorder(null);
        textFieldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldUsernameActionPerformed(evt);
            }
        });
        textFieldUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textFieldUsernameKeyPressed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(0, 122, 255));
        btnLogin.setFont(new java.awt.Font("Avenir Next", 1, 24)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLoginMouseExited(evt);
            }
        });
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        btnLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnLoginKeyPressed(evt);
            }
        });

        btnCreate.setFont(new java.awt.Font("Avenir Next", 1, 24)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(0, 122, 255));
        btnCreate.setText("Create an account");
        btnCreate.setBorderPainted(false);
        btnCreate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCreateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCreateMouseExited(evt);
            }
        });
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnForgotPW.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        btnForgotPW.setForeground(new java.awt.Color(64, 156, 255));
        btnForgotPW.setText("Forgot password?");
        btnForgotPW.setBorder(null);
        btnForgotPW.setBorderPainted(false);
        btnForgotPW.setContentAreaFilled(false);
        btnForgotPW.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnForgotPWMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnForgotPWMouseExited(evt);
            }
        });
        btnForgotPW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForgotPWActionPerformed(evt);
            }
        });

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setAlignmentX(0.0F);
        jSeparator3.setAlignmentY(0.0F);

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setAlignmentX(0.0F);
        jSeparator4.setAlignmentY(0.0F);

        passwordField.setFont(new java.awt.Font("Avenir Next", 0, 18)); // NOI18N
        passwordField.setBorder(null);
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordFieldKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Avenir Next", 1, 18)); // NOI18N
        jLabel5.setText("Username");

        jLabel6.setFont(new java.awt.Font("Avenir Next", 1, 18)); // NOI18N
        jLabel6.setText("Password");

        btnBack2.setFont(new java.awt.Font("Avenir Next", 1, 18)); // NOI18N
        btnBack2.setBorderPainted(false);
        btnBack2.setContentAreaFilled(false);

        javax.swing.GroupLayout bg1Layout = new javax.swing.GroupLayout(bg1);
        bg1.setLayout(bg1Layout);
        bg1Layout.setHorizontalGroup(
            bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnForgotPW)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bg1Layout.createSequentialGroup()
                        .addComponent(btnBack2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator3)
                            .addComponent(textFieldUsername)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(passwordField)
                            .addComponent(jSeparator4)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        bg1Layout.setVerticalGroup(
            bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBack2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnForgotPW)
                .addGap(67, 67, 67)
                .addComponent(btnLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCreate)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(bg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(bg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldUsernameActionPerformed

    private void btnLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseEntered
        // TODO add your handling code here:
        btnLogin.setBackground(new Color(0, 64, 221));
    }//GEN-LAST:event_btnLoginMouseEntered

    private void btnLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseExited
        // TODO add your handling code here:
        btnLogin.setBackground(new Color(0, 122, 255));
    }//GEN-LAST:event_btnLoginMouseExited

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        String username = textFieldUsername.getText();
        String pass = String.valueOf(passwordField.getPassword());
        if(ManageData.getManageData().checkLoginStudent(ManageData.getManageData().allStudent, username, pass)==1){
            ManageData.getManageData().setWho_is_using_this_program(username);
            this.dispose();
            Frame7_ProfileStudent frame7 = new Frame7_ProfileStudent();
            frame7.setVisible(true);
            ManageData.getManageData().setType_of_user_using_this_program("student");
        }
        else{
            if(username.equals("")){
                JOptionPane.showMessageDialog(null, "Please enter your username!");
            }
            else{
                JOptionPane.showMessageDialog(null, "Wrong password, please type again!");
            }
        }
        
        
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnCreateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreateMouseEntered
        // TODO add your handling code here:
        btnCreate.setBackground(new Color(20, 142, 255));
        btnCreate.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnCreateMouseEntered

    private void btnCreateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreateMouseExited
        // TODO add your handling code here:
        btnCreate.setBackground(new Color(255, 255, 255));
        btnCreate.setForeground(new Color(0,122,255));
    }//GEN-LAST:event_btnCreateMouseExited

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Frame5_RegisterStudent frame5 = new Frame5_RegisterStudent();
        frame5.setVisible(true);
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnForgotPWMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnForgotPWMouseEntered
        // TODO add your handling code here:
        btnForgotPW.setForeground(new Color(0, 122, 255));
    }//GEN-LAST:event_btnForgotPWMouseEntered

    private void btnForgotPWMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnForgotPWMouseExited
        // TODO add your handling code here:
        btnForgotPW.setForeground(new Color(64, 156, 255));
    }//GEN-LAST:event_btnForgotPWMouseExited

    private void btnForgotPWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForgotPWActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Frame19_ForgotPassword_Student frame19 = new Frame19_ForgotPassword_Student();
        frame19.setVisible(true);
    }//GEN-LAST:event_btnForgotPWActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void btnLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnLoginKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            String username = textFieldUsername.getText();
            String pass = String.valueOf(passwordField.getPassword());
            if(ManageData.getManageData().checkLoginStudent(ManageData.getManageData().allStudent, username, pass)==1){
                ManageData.getManageData().setWho_is_using_this_program(username);
                this.dispose();
                Frame7_ProfileStudent frame7 = new Frame7_ProfileStudent();
                frame7.setVisible(true);
                ManageData.getManageData().setType_of_user_using_this_program("student");
            }
            else{
                JOptionPane.showMessageDialog(null, "Wrong password, please type again!");
            }
        }
    }//GEN-LAST:event_btnLoginKeyPressed

    private void textFieldUsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldUsernameKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            String username = textFieldUsername.getText();
            String pass = String.valueOf(passwordField.getPassword());
            if(ManageData.getManageData().checkLoginStudent(ManageData.getManageData().allStudent, username, pass)==1){
                ManageData.getManageData().setWho_is_using_this_program(username);
                this.dispose();
                Frame7_ProfileStudent frame7 = new Frame7_ProfileStudent();
                frame7.setVisible(true);
                ManageData.getManageData().setType_of_user_using_this_program("student");
            }
            else{
                if(username.equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter your username!");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Wrong password, please type again!");
                }
            }
        }
    }//GEN-LAST:event_textFieldUsernameKeyPressed

    private void passwordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            String username = textFieldUsername.getText();
            String pass = String.valueOf(passwordField.getPassword());
            if(ManageData.getManageData().checkLoginStudent(ManageData.getManageData().allStudent, username, pass)==1){
                ManageData.getManageData().setWho_is_using_this_program(username);
                this.dispose();
                Frame7_ProfileStudent frame7 = new Frame7_ProfileStudent();
                frame7.setVisible(true);
                ManageData.getManageData().setType_of_user_using_this_program("student");
            }
            else{
                if(username.equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter your username!");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Wrong password, please type again!");
                }
            }
        }
    }//GEN-LAST:event_passwordFieldKeyPressed
                        
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
            java.util.logging.Logger.getLogger(Frame2_LoginManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame2_LoginManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame2_LoginManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame2_LoginManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame3_LoginStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg1;
    private javax.swing.JButton btnBack2;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnForgotPW;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField textFieldUsername;
    // End of variables declaration//GEN-END:variables
}
