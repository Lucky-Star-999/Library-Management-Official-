
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author doquangminh
 */
public class Frame6_ProfileManager extends javax.swing.JFrame {

    /**
     * Creates new form Frame6_ProfileManager
     */
    public Frame6_ProfileManager() {
        initComponents();
        
        if(ManageData.getManageData().getWho_is_using_this_program()!=null){
            String userIsUsing = ManageData.getManageData().getWho_is_using_this_program();
            textFieldFullName.setText(ManageData.getManageData().allManager.get(userIsUsing).getFullName());
            textFieldEmail.setText(ManageData.getManageData().allManager.get(userIsUsing).getEmail());
            textFieldPhone.setText(ManageData.getManageData().allManager.get(userIsUsing).getPhone());
            
            String linkAvatar = ManageData.getManageData().allManager.get(userIsUsing).getLinkOfAvatar();
            
            Image im = Toolkit.getDefaultToolkit().createImage(linkAvatar);
            im = im.getScaledInstance(textFieldImage.getWidth(), textFieldImage.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon ii = new ImageIcon(im);
            
            if (linkAvatar==null){
                textFieldImage.setText("");
            }
            
            textFieldImage.setIcon(ii);
            
            
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textFieldFullName = new javax.swing.JTextField();
        btnEdit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnManage = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        btnLibrary = new javax.swing.JButton();
        textFieldImage = new javax.swing.JLabel();
        textFieldEmail = new javax.swing.JTextField();
        textFieldPhone = new javax.swing.JTextField();
        btnLibrary1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 113, 164));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Avenir Next", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manager Profile");

        jLabel2.setFont(new java.awt.Font("Avenir Next", 1, 24)); // NOI18N
        jLabel2.setText("Name:");

        textFieldFullName.setEditable(false);
        textFieldFullName.setFont(new java.awt.Font("Avenir", 0, 24)); // NOI18N
        textFieldFullName.setText("Do Quang Minh");
        textFieldFullName.setBorder(null);
        textFieldFullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldFullNameActionPerformed(evt);
            }
        });

        btnEdit.setFont(new java.awt.Font("Avenir Next", 0, 18)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 169, 20));
        btnEdit.setText("Edit profile");
        btnEdit.setBorder(null);
        btnEdit.setBorderPainted(false);
        btnEdit.setContentAreaFilled(false);
        btnEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditMouseExited(evt);
            }
        });
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Avenir Next", 1, 24)); // NOI18N
        jLabel3.setText("Email:");

        jLabel4.setFont(new java.awt.Font("Avenir Next", 1, 24)); // NOI18N
        jLabel4.setText("Phone:");

        btnManage.setFont(new java.awt.Font("Avenir Next", 1, 20)); // NOI18N
        btnManage.setText("Manage Student");
        btnManage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnManageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnManageMouseExited(evt);
            }
        });
        btnManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageActionPerformed(evt);
            }
        });

        btnLogOut.setFont(new java.awt.Font("Avenir Next", 1, 20)); // NOI18N
        btnLogOut.setText("Log Out");
        btnLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLogOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLogOutMouseExited(evt);
            }
        });
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        btnLibrary.setFont(new java.awt.Font("Avenir Next", 1, 20)); // NOI18N
        btnLibrary.setText("Library Access");
        btnLibrary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLibraryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLibraryMouseExited(evt);
            }
        });
        btnLibrary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLibraryActionPerformed(evt);
            }
        });

        textFieldImage.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        textFieldEmail.setEditable(false);
        textFieldEmail.setFont(new java.awt.Font("Avenir", 0, 24)); // NOI18N
        textFieldEmail.setText("abc.123@gmail.com");
        textFieldEmail.setBorder(null);
        textFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldEmailActionPerformed(evt);
            }
        });

        textFieldPhone.setEditable(false);
        textFieldPhone.setFont(new java.awt.Font("Avenir", 0, 24)); // NOI18N
        textFieldPhone.setText("0909000111");
        textFieldPhone.setBorder(null);
        textFieldPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldPhoneActionPerformed(evt);
            }
        });

        btnLibrary1.setFont(new java.awt.Font("Avenir Next", 1, 20)); // NOI18N
        btnLibrary1.setText("Delete Account");
        btnLibrary1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLibrary1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLibrary1MouseExited(evt);
            }
        });
        btnLibrary1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLibrary1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(btnLibrary, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLibrary1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(textFieldImage, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(100, 100, 100)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(textFieldFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnManage, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(248, 248, 248)
                            .addComponent(btnLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(100, 100, 100))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(textFieldFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(textFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(textFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(textFieldImage, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEdit)
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLibrary, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLibrary1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(btnManage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldFullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldFullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldFullNameActionPerformed

    private void btnEditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseEntered
        // TODO add your handling code here:
        btnEdit.setForeground(new Color(255,139,0));
    }//GEN-LAST:event_btnEditMouseEntered

    private void btnEditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseExited
        // TODO add your handling code here:
        btnEdit.setForeground(new Color(255,169,20));
    }//GEN-LAST:event_btnEditMouseExited

    private void textFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldEmailActionPerformed

    private void textFieldPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldPhoneActionPerformed

    private void btnLibraryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLibraryMouseEntered
        // TODO add your handling code here:
        btnLibrary.setBackground(new Color(20, 142, 255));
        btnLibrary.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnLibraryMouseEntered

    private void btnLibraryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLibraryMouseExited
        // TODO add your handling code here:
        btnLibrary.setBackground(new Color(255, 255, 255));
        btnLibrary.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_btnLibraryMouseExited

    private void btnManageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageMouseEntered
        // TODO add your handling code here:
        btnManage.setBackground(new Color(20, 142, 255));
        btnManage.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnManageMouseEntered

    private void btnManageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageMouseExited
        // TODO add your handling code here:
        btnManage.setBackground(new Color(255, 255, 255));
        btnManage.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_btnManageMouseExited

    private void btnLogOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOutMouseEntered
        // TODO add your handling code here:
        btnLogOut.setBackground(new Color(20, 142, 255));
        btnLogOut.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnLogOutMouseEntered

    private void btnLogOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOutMouseExited
        // TODO add your handling code here:
        btnLogOut.setBackground(new Color(255, 255, 255));
        btnLogOut.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_btnLogOutMouseExited

    private void btnLibraryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLibraryActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Frame16_Book_Manager frame16 = new Frame16_Book_Manager();
        frame16.setVisible(true);
    }//GEN-LAST:event_btnLibraryActionPerformed

    private void btnManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Frame10_ManageStudents_General frame10 = new Frame10_ManageStudents_General();
        frame10.setVisible(true);
    }//GEN-LAST:event_btnManageActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Frame2_LoginManager frame2 = new Frame2_LoginManager();
        frame2.setVisible(true);
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Frame8_EditProfile frame8 = new Frame8_EditProfile();
        frame8.setVisible(true);
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnLibrary1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLibrary1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLibrary1MouseEntered

    private void btnLibrary1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLibrary1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLibrary1MouseExited

    private void btnLibrary1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLibrary1ActionPerformed
        // TODO add your handling code here:
        String username = ManageData.getManageData().getWho_is_using_this_program();
        /*ManageData.getManageData().allManager.remove(username);
        ManageData.getManageData().saveAllManager();
        
        this.dispose();
        Frame2_LoginManager frame2 = new Frame2_LoginManager();
        frame2.setVisible(true);*/
        
        
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (null, "Do you want to delete your account?\nAre you sure?","Warning",dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
            // Saving code here
            ManageData.getManageData().allManager.remove(username);
            ManageData.getManageData().saveAllManager();
            this.dispose();
            Frame2_LoginManager frame2 = new Frame2_LoginManager();
            frame2.setVisible(true);
        }
    }//GEN-LAST:event_btnLibrary1ActionPerformed

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
            java.util.logging.Logger.getLogger(Frame6_ProfileManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame6_ProfileManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame6_ProfileManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame6_ProfileManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame6_ProfileManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnLibrary;
    private javax.swing.JButton btnLibrary1;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnManage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField textFieldEmail;
    private javax.swing.JTextField textFieldFullName;
    private javax.swing.JLabel textFieldImage;
    private javax.swing.JTextField textFieldPhone;
    // End of variables declaration//GEN-END:variables
}
