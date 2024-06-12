
package contactmanagement;

import java.awt.Cursor;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ContactManagementFrame extends javax.swing.JFrame {

    private final DefaultTableModel model;

    public ContactManagementFrame() {
        initComponents();

        model = (DefaultTableModel) listContactTable.getModel();

        listContactTable.getColumnModel().getColumn(0).setPreferredWidth(130);
        listContactTable.getColumnModel().getColumn(1).setPreferredWidth(0);
        listContactTable.getColumnModel().getColumn(2).setPreferredWidth(0);
        listContactTable.getColumnModel().getColumn(3).setPreferredWidth(0);
        
        searchClick.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        addNewBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        deleteBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

    }

    @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                addNewBtn = new javax.swing.JButton();
                deleteBtn = new javax.swing.JButton();
                jPanel6 = new javax.swing.JPanel();
                jPanel2 = new javax.swing.JPanel();
                jPanel3 = new javax.swing.JPanel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                jLabel7 = new javax.swing.JLabel();
                jLabel1 = new javax.swing.JLabel();
                jPanel4 = new javax.swing.JPanel();
                jPanel5 = new javax.swing.JPanel();
                jLabel2 = new javax.swing.JLabel();
                searchField = new javax.swing.JTextField();
                searchClick = new javax.swing.JLabel();
                jPanel7 = new javax.swing.JPanel();
                jScrollPane1 = new javax.swing.JScrollPane();
                listContactTable = new javax.swing.JTable();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jPanel1.setBackground(new java.awt.Color(153, 153, 255));
                jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                addNewBtn.setBackground(new java.awt.Color(0, 204, 51));
                addNewBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                addNewBtn.setForeground(new java.awt.Color(255, 255, 255));
                addNewBtn.setText(" Add new");
                addNewBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
                addNewBtn.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                addNewBtnActionPerformed(evt);
                        }
                });
                jPanel1.add(addNewBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 20, 90, 33));

                deleteBtn.setBackground(new java.awt.Color(255, 51, 0));
                deleteBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                deleteBtn.setForeground(new java.awt.Color(255, 255, 255));
                deleteBtn.setText("Delete");
                deleteBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
                deleteBtn.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                deleteBtnActionPerformed(evt);
                        }
                });
                jPanel1.add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 20, 90, 33));

                jPanel6.setBackground(new java.awt.Color(153, 153, 255));

                javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
                jPanel6.setLayout(jPanel6Layout);
                jPanel6Layout.setHorizontalGroup(
                        jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 1330, Short.MAX_VALUE)
                );
                jPanel6Layout.setVerticalGroup(
                        jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 15, Short.MAX_VALUE)
                );

                jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 1330, 15));

                jPanel2.setBackground(new java.awt.Color(153, 153, 255));
                jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));
                jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jPanel3.setBackground(new java.awt.Color(255, 255, 255));

                jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                jLabel3.setForeground(new java.awt.Color(153, 153, 255));
                jLabel3.setText("Name");

                jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                jLabel4.setForeground(new java.awt.Color(153, 153, 255));
                jLabel4.setText("Gender");

                jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                jLabel5.setForeground(new java.awt.Color(153, 153, 255));
                jLabel5.setText("Age");

                jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                jLabel6.setForeground(new java.awt.Color(153, 153, 255));
                jLabel6.setText("Email");

                jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                jLabel7.setForeground(new java.awt.Color(153, 153, 255));
                jLabel7.setText("Phone Number");

                javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
                jPanel3.setLayout(jPanel3Layout);
                jPanel3Layout.setHorizontalGroup(
                        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jLabel3)
                                .addGap(216, 216, 216)
                                .addComponent(jLabel4)
                                .addGap(172, 172, 172)
                                .addComponent(jLabel5)
                                .addGap(190, 190, 190)
                                .addComponent(jLabel7)
                                .addGap(192, 192, 192)
                                .addComponent(jLabel6))
                );
                jPanel3Layout.setVerticalGroup(
                        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                );

                jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1310, 30));

                jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(153, 153, 255));
                jLabel1.setText("Email");
                jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 0, -1, -1));

                jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 1330, 30));

                jPanel4.setBackground(new java.awt.Color(153, 153, 255));
                jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 20, true));
                jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jPanel5.setBackground(new java.awt.Color(255, 255, 255));
                jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(153, 153, 255));
                jLabel2.setText("Contact Management System");
                jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

                jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 530, 50));

                jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 550, 50));

                searchField.setBackground(new java.awt.Color(255, 255, 255));
                searchField.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
                searchField.setForeground(new java.awt.Color(0, 0, 0));
                searchField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));
                jPanel1.add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 350, 30));

                searchClick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Picsart-24-06-06-11-10-14-696.png"))); // NOI18N
                searchClick.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                searchClickMouseClicked(evt);
                        }
                });
                jPanel1.add(searchClick, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 20, -1, -1));

                jPanel7.setBackground(new java.awt.Color(238, 238, 238));
                jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jScrollPane1.setBackground(new java.awt.Color(238, 238, 238));
                jScrollPane1.setBorder(null);
                jScrollPane1.setForeground(new java.awt.Color(238, 238, 238));
                jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(238, 238, 238)));

                listContactTable.setBackground(new java.awt.Color(238, 238, 238));
                listContactTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));
                listContactTable.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
                listContactTable.setForeground(new java.awt.Color(0, 0, 0));
                listContactTable.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {

                        },
                        new String [] {
                                "", "", "", "", ""
                        }
                ) {
                        boolean[] canEdit = new boolean [] {
                                false, false, false, false, false
                        };

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit [columnIndex];
                        }
                });
                listContactTable.setFocusable(false);
                listContactTable.setGridColor(new java.awt.Color(238, 238, 238));
                listContactTable.setRowHeight(25);
                listContactTable.setSelectionBackground(new java.awt.Color(197, 251, 197));
                listContactTable.setSelectionForeground(new java.awt.Color(0, 0, 0));
                jScrollPane1.setViewportView(listContactTable);

                jPanel7.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1330, 450));

                jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 1330, 450));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1350, Short.MAX_VALUE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
                );

                pack();
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

  
    private void addNewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewBtnActionPerformed
        AddContactFrame addContactFrame = new AddContactFrame(model);
        addContactFrame.setVisible(true);
        addContactFrame.pack();
        addContactFrame.setLocationRelativeTo(null);
    }//GEN-LAST:event_addNewBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        int selectedRow = listContactTable.getSelectedRow();
         if (selectedRow != -1) {model.removeRow(selectedRow);} 
          else {JOptionPane.showMessageDialog(this, "Please select a row to delete.");}
    }//GEN-LAST:event_deleteBtnActionPerformed

        private void searchClickMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchClickMouseClicked
         String searchName = searchField.getText().trim();
          if (!searchName.isEmpty()) {
           boolean found = false;
          for (int i = 0; i < model.getRowCount(); i++) {
            String name = (String) model.getValueAt(i, 0);
          if (name.equalsIgnoreCase(searchName)) {
                listContactTable.setRowSelectionInterval(i, i);
                listContactTable.scrollRectToVisible(listContactTable.getCellRect(i, 0, true));
                found = true;
                break;
            }
        }
        if (!found) {
            JOptionPane.showMessageDialog(this, "Contact not found.");
        }
       } else {
        JOptionPane.showMessageDialog(this, "Please enter a name to search.");
       }
        }//GEN-LAST:event_searchClickMouseClicked

 
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
            java.util.logging.Logger.getLogger(ContactManagementFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContactManagementFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContactManagementFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContactManagementFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContactManagementFrame().setVisible(true);
            }
        });
    }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton addNewBtn;
        private javax.swing.JButton deleteBtn;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JPanel jPanel3;
        private javax.swing.JPanel jPanel4;
        private javax.swing.JPanel jPanel5;
        private javax.swing.JPanel jPanel6;
        private javax.swing.JPanel jPanel7;
        private javax.swing.JScrollPane jScrollPane1;
        public javax.swing.JTable listContactTable;
        private javax.swing.JLabel searchClick;
        private javax.swing.JTextField searchField;
        // End of variables declaration//GEN-END:variables
}
