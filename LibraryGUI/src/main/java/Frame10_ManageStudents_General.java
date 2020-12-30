
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author doquangminh
 */
public class Frame10_ManageStudents_General extends javax.swing.JFrame {

    /**
     * Creates new form Frame6_ProfileManager
     */
    public Frame10_ManageStudents_General() {
        initComponents();
         DefaultTableCellRenderer headerCellRenderer = new DefaultTableCellRenderer();
         headerCellRenderer.setBackground(Color.WHITE);
         headerCellRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
         headerCellRenderer.setFont(new Font("Avenir Next", Font.BOLD, 16));
        jTable1.getTableHeader().setDefaultRenderer(headerCellRenderer);
        
        
        /*DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        
        for(Student value: ManageData.getManageData().allStudent.values()){
            model.addRow( new Object[]{ value.getIdStudent(), value.getFullName(), value.getPhone(), value.getUsername(), "No" } );
        }*/
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
        jTextField_Search = new javax.swing.JTextField();
        btnManage = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnLibrary = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnLibrary1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 113, 164));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Avenir Next", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Students");

        jTextField_Search.setFont(new java.awt.Font("Avenir Next", 0, 20)); // NOI18N
        jTextField_Search.setForeground(new java.awt.Color(102, 102, 102));
        jTextField_Search.setText("Search");
        jTextField_Search.setBorder(null);
        jTextField_Search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_SearchMouseClicked(evt);
            }
        });
        jTextField_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_SearchActionPerformed(evt);
            }
        });
        jTextField_Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_SearchKeyPressed(evt);
            }
        });

        btnManage.setFont(new java.awt.Font("Avenir Next", 1, 18)); // NOI18N
        btnManage.setText("Detail");
        btnManage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnManageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnManageMouseExited(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Avenir Next", 1, 18)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Documents\\GitHub\\Library-Management-Official-\\LibraryGUI\\src\\main\\java\\com\\mycompany\\librarygui\\Library_Icons\\icons8-back_1.png")); // NOI18N
        btnBack.setBorderPainted(false);
        btnBack.setContentAreaFilled(false);
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBackMouseExited(evt);
            }
        });
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnLibrary.setFont(new java.awt.Font("Avenir Next", 1, 18)); // NOI18N
        btnLibrary.setText("Show List");
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

        btnLibrary1.setFont(new java.awt.Font("Avenir Next", 1, 10)); // NOI18N
        btnLibrary1.setForeground(new java.awt.Color(153, 153, 153));
        btnLibrary1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Documents\\GitHub\\Library-Management-Official-\\LibraryGUI\\src\\main\\java\\com\\mycompany\\librarygui\\Library_Icons\\icons8-search_1.png")); // NOI18N
        btnLibrary1.setBorder(null);
        btnLibrary1.setBorderPainted(false);
        btnLibrary1.setContentAreaFilled(false);
        btnLibrary1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLibrary1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLibrary1MouseExited(evt);
            }
        });

        jTable1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jTable1.setFont(new java.awt.Font("Avenir", 0, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"abc", "Minh", "456", "ert", "12"},
                {"xyz", "", "", "", ""},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Student ID", "Name", "Phone", "Username", "Overdue"
            }
        ));
        jTable1.getTableHeader().setBackground(new Color(255, 25, 255));
        jTable1.setGridColor(new java.awt.Color(204, 204, 204));
        jTable1.setPreferredSize(new java.awt.Dimension(375, 100));
        jTable1.setShowGrid(false);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnManage, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLibrary, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnLibrary1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_Search))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLibrary1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnManage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLibrary, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
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
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_SearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_SearchActionPerformed

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

    private void btnBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnBackMouseEntered

    private void btnBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseExited
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnBackMouseExited

    private void jTextField_SearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_SearchMouseClicked
        // TODO add your handling code here:
        jTextField_Search.setText("");
        jTextField_Search.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_jTextField_SearchMouseClicked

    private void jTextField_SearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_SearchKeyPressed
        // TODO add your handling code here:
        // Nhấn Enter để search
        
    }//GEN-LAST:event_jTextField_SearchKeyPressed

    private void btnLibraryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLibraryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLibraryActionPerformed

    private void btnLibrary1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLibrary1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLibrary1MouseExited

    private void btnLibrary1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLibrary1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLibrary1MouseEntered

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Frame6_ProfileManager frame6 = new Frame6_ProfileManager();
        frame6.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

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
                new Frame10_ManageStudents_General().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLibrary;
    private javax.swing.JButton btnLibrary1;
    private javax.swing.JButton btnManage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_Search;
    // End of variables declaration//GEN-END:variables
}
