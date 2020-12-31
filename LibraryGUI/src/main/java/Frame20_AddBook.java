
import java.awt.Color;
import java.awt.Font;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author doquangminh
 */
public class Frame20_AddBook extends javax.swing.JFrame {

    /**
     * Creates new form Frame6_ProfileManager
     */
    public Frame20_AddBook() {
        initComponents();
         DefaultTableCellRenderer headerCellRenderer = new DefaultTableCellRenderer();
         headerCellRenderer.setBackground(Color.WHITE);
         headerCellRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
         headerCellRenderer.setFont(new Font("Avenir Next", Font.BOLD, 16));
        
        
        
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
        btnAddBook = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        textFieldTitle = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textFieldAuthor = new javax.swing.JTextField();
        textFieldId = new javax.swing.JTextField();
        textFieldCategory = new javax.swing.JTextField();
        btnAddBook1 = new javax.swing.JButton();
        btnAddBook2 = new javax.swing.JButton();
        textFieldImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 113, 164));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Avenir Next", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Book ");

        jLabel2.setFont(new java.awt.Font("Avenir", 1, 24)); // NOI18N
        jLabel2.setText("Book ID");

        btnAddBook.setFont(new java.awt.Font("Avenir Next", 1, 18)); // NOI18N
        btnAddBook.setText("Add this book");
        btnAddBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddBookMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddBookMouseExited(evt);
            }
        });
        btnAddBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBookActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Avenir Next", 1, 18)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelMouseExited(evt);
            }
        });
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        textFieldTitle.setFont(new java.awt.Font("Avenir", 0, 18)); // NOI18N
        textFieldTitle.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        textFieldTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldTitleActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Avenir", 1, 24)); // NOI18N
        jLabel3.setText("Catagory");

        jLabel4.setFont(new java.awt.Font("Avenir", 1, 24)); // NOI18N
        jLabel4.setText("Author");

        jLabel5.setFont(new java.awt.Font("Avenir", 1, 24)); // NOI18N
        jLabel5.setText("Title");

        textFieldAuthor.setFont(new java.awt.Font("Avenir", 0, 18)); // NOI18N
        textFieldAuthor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        textFieldAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldAuthorActionPerformed(evt);
            }
        });

        textFieldId.setFont(new java.awt.Font("Avenir", 0, 18)); // NOI18N
        textFieldId.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        textFieldId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldIdActionPerformed(evt);
            }
        });

        textFieldCategory.setFont(new java.awt.Font("Avenir", 0, 18)); // NOI18N
        textFieldCategory.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        textFieldCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCategoryActionPerformed(evt);
            }
        });

        btnAddBook1.setFont(new java.awt.Font("Avenir Next", 1, 16)); // NOI18N
        btnAddBook1.setText("Add Cover");
        btnAddBook1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddBook1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddBook1MouseExited(evt);
            }
        });
        btnAddBook1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBook1ActionPerformed(evt);
            }
        });

        btnAddBook2.setFont(new java.awt.Font("Avenir Next", 1, 16)); // NOI18N
        btnAddBook2.setText("Delete");
        btnAddBook2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddBook2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddBook2MouseExited(evt);
            }
        });
        btnAddBook2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBook2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(60, 60, 60)
                                    .addComponent(textFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(99, 99, 99)
                                    .addComponent(textFieldTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(59, 59, 59)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(btnAddBook)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(textFieldAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(48, 48, 48)
                                .addComponent(textFieldCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(100, 100, 100)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldImage, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAddBook1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAddBook2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(129, 129, 129))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(49, 49, 49))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(textFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(textFieldCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(textFieldTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(textFieldAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(textFieldImage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddBook1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddBook2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddBook, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
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
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Frame16_Book_Manager frame16 = new Frame16_Book_Manager();
        frame16.setVisible(true);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnCancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseExited
        // TODO add your handling code here:
        btnCancel.setBackground(new Color(255, 255, 255));
        btnCancel.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_btnCancelMouseExited

    private void btnCancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseEntered
        // TODO add your handling code here:
        btnCancel.setBackground(new Color(20, 142, 255));
        btnCancel.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnCancelMouseEntered

    private void btnAddBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBookActionPerformed
        // TODO add your handling code here:
        String id = textFieldId.getText();
        ManageData.getManageData().allBook.put(id, new Book());
        ManageData.getManageData().allBook.get(id).setAuthor(textFieldAuthor.getText());
        ManageData.getManageData().allBook.get(id).setCategory(textFieldCategory.getText());
        ManageData.getManageData().allBook.get(id).setIdBook(id);
        ManageData.getManageData().allBook.get(id).setTitle(textFieldTitle.getText());
        ManageData.getManageData().allBook.get(id).setAvailable("Yes");
        
        String path = ManageData.getManageData().getTemporaryAvatar();
        ManageData.getManageData().allBook.get(id).setLink(path);
        
        ManageData.getManageData().saveAllBook();
        JOptionPane.showMessageDialog(null, "Add book successfully!\nPress \"Cancel\" to return");
    }//GEN-LAST:event_btnAddBookActionPerformed

    private void btnAddBookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddBookMouseExited
        // TODO add your handling code here:
        btnAddBook.setBackground(new Color(255, 255, 255));
        btnAddBook.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_btnAddBookMouseExited

    private void btnAddBookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddBookMouseEntered
        // TODO add your handling code here:
        btnAddBook.setBackground(new Color(20, 142, 255));
        btnAddBook.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnAddBookMouseEntered

    private void textFieldTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldTitleActionPerformed

    private void textFieldAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldAuthorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldAuthorActionPerformed

    private void textFieldIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldIdActionPerformed

    private void textFieldCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCategoryActionPerformed

    private void btnAddBook1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddBook1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddBook1MouseEntered

    private void btnAddBook1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddBook1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddBook1MouseExited

    private void btnAddBook1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBook1ActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        if (f!=null){
            String path = f.getAbsolutePath();       
            
            //Create image
            Image im = Toolkit.getDefaultToolkit().createImage(path);
            im = im.getScaledInstance(textFieldImage.getWidth(), textFieldImage.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon ii = new ImageIcon(im);
            
            textFieldImage.setText("");
            textFieldImage.setIcon(ii);
            
            
            File file = new File(path);
            String newPath = "src/main/java/imageBook/" + file.getName();
            File file2 = new File(newPath);
            String userUsing = ManageData.getManageData().getWho_is_using_this_program();
            ManageData.getManageData().setTemporaryAvatar(newPath);
            
            try{
                ManageData.getManageData().copyFileUsingChannel(file, file2);
            }
            catch (Exception e){
                System.out.println("");
            }
        }
    }//GEN-LAST:event_btnAddBook1ActionPerformed

    private void btnAddBook2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddBook2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddBook2MouseEntered

    private void btnAddBook2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddBook2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddBook2MouseExited

    private void btnAddBook2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBook2ActionPerformed
        // TODO add your handling code here:
        //String userUsing = ManageData.getManageData().getWho_is_using_this_program();
        //ManageData.getManageData().allStudent.get(userUsing).setLinkOfAvatar(null);
        //String oldPath = ManageData.getManageData().allManager.get(userUsing).getLinkOfAvatar();

        ManageData.getManageData().setTemporaryAvatar(null);
        //Save ...
        //ManageData.getManageData().saveAllStudent();
        
            String linkAvatar = null;
            Image im = Toolkit.getDefaultToolkit().createImage(linkAvatar);
            im = im.getScaledInstance(textFieldImage.getWidth(), textFieldImage.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon ii = new ImageIcon(im);
            textFieldImage.setText("");
            textFieldImage.setIcon(ii);
    }//GEN-LAST:event_btnAddBook2ActionPerformed

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
                new Frame20_AddBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddBook;
    private javax.swing.JButton btnAddBook1;
    private javax.swing.JButton btnAddBook2;
    private javax.swing.JButton btnCancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField textFieldAuthor;
    private javax.swing.JTextField textFieldCategory;
    private javax.swing.JTextField textFieldId;
    private javax.swing.JLabel textFieldImage;
    private javax.swing.JTextField textFieldTitle;
    // End of variables declaration//GEN-END:variables
}
