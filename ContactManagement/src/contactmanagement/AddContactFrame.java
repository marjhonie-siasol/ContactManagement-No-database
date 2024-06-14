
package contactmanagement;

import java.awt.Cursor;
import javax.swing.table.DefaultTableModel;


public class AddContactFrame extends javax.swing.JFrame {

        private final DefaultTableModel model;


        public AddContactFrame(DefaultTableModel model) {
                initComponents();
                saveBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                this.model = model;     
        }
      
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {
                jPanel1 = new javax.swing.JPanel();
                email = new javax.swing.JTextField();
                name = new javax.swing.JTextField();
                gender = new javax.swing.JTextField();
                age = new javax.swing.JTextField();
                phoneNumber = new javax.swing.JTextField();
                saveBtn = new javax.swing.JButton();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                jPanel4 = new javax.swing.JPanel();
                jPanel5 = new javax.swing.JPanel();
                jLabel7 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jPanel1.setBackground(new java.awt.Color(255, 255, 255));
                jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                email.setBackground(new java.awt.Color(255, 255, 255));
                email.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
                email.setForeground(new java.awt.Color(0, 0, 0));
                email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));
                jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 370, -1));

                name.setBackground(new java.awt.Color(255, 255, 255));
                name.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
                name.setForeground(new java.awt.Color(0, 0, 0));
                name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));
                jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 370, -1));

                gender.setBackground(new java.awt.Color(255, 255, 255));
                gender.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
                gender.setForeground(new java.awt.Color(0, 0, 0));
                gender.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));
                jPanel1.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 370, -1));

                age.setBackground(new java.awt.Color(255, 255, 255));
                age.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
                age.setForeground(new java.awt.Color(0, 0, 0));
                age.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));
                jPanel1.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 370, -1));

                phoneNumber.setBackground(new java.awt.Color(255, 255, 255));
                phoneNumber.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
                phoneNumber.setForeground(new java.awt.Color(0, 0, 0));
                phoneNumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));
                jPanel1.add(phoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 370, -1));

                saveBtn.setBackground(new java.awt.Color(0, 204, 51));
                saveBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                saveBtn.setForeground(new java.awt.Color(255, 255, 255));
                saveBtn.setText("Save");
                saveBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
                saveBtn.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                saveBtnActionPerformed(evt);
                        }
                });
                jPanel1.add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, 90, 33));

                jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(153, 153, 255));
                jLabel2.setText("Email");
                jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));

                jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel3.setForeground(new java.awt.Color(153, 153, 255));
                jLabel3.setText("Name");
                jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

                jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel4.setForeground(new java.awt.Color(153, 153, 255));
                jLabel4.setText("Gender");
                jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

                jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel5.setForeground(new java.awt.Color(153, 153, 255));
                jLabel5.setText("Age");
                jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

                jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel6.setForeground(new java.awt.Color(153, 153, 255));
                jLabel6.setText("Phone Number");
                jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

                jPanel4.setBackground(new java.awt.Color(255, 255, 255));
                jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 20, true));
                jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jPanel5.setBackground(new java.awt.Color(153, 153, 255));
                jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
                jLabel7.setForeground(new java.awt.Color(255, 255, 255));
                jLabel7.setText("Add New Contact");
                jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, -1));

                jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 350, 50));

                jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 370, 50));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                );

                pack();
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

        private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        String[] rowData = {name.getText(), gender.getText(), age.getText(), phoneNumber.getText(), email.getText()};
        model.addRow(rowData);

        name.setText("");
        gender.setText("");
        age.setText("");
        phoneNumber.setText("");
        email.setText("");
        }//GEN-LAST:event_saveBtnActionPerformed

       
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
                        java.util.logging.Logger.getLogger(AddContactFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(AddContactFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(AddContactFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(AddContactFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                //</editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new AddContactFrame(null).setVisible(true);
                        }
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JTextField age;
        private javax.swing.JTextField email;
        private javax.swing.JTextField gender;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel4;
        private javax.swing.JPanel jPanel5;
        private javax.swing.JTextField name;
        private javax.swing.JTextField phoneNumber;
        private javax.swing.JButton saveBtn;
        // End of variables declaration//GEN-END:variables
}
