/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package librarymanagement;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Vaibhav
 */
public class mgstudents extends javax.swing.JFrame {

    /**
     * Creates new form mgstudents
     */
    public mgstudents() {
        initComponents();
        // Load and set the background image
        ImageIcon backgroundImage = new ImageIcon("C:/Users/HP/Documents/NetBeansProjects/LibraryManagement/src/bg.jpg");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 0, backgroundImage.getIconWidth(), backgroundImage.getIconHeight());
        add(backgroundLabel);
         // Set frame properties
                setTitle("Manage");
                setSize(400, 400);

               // Center the frame on the screen
                 setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewStudents = new javax.swing.JButton();
        addStudents = new javax.swing.JButton();
        removeStudents = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        viewStudents.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        viewStudents.setText("View Students");
        viewStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewStudentsActionPerformed(evt);
            }
        });

        addStudents.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addStudents.setText("Add Students");
        addStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentsActionPerformed(evt);
            }
        });

        removeStudents.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        removeStudents.setText("Remove Students");
        removeStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeStudentsActionPerformed(evt);
            }
        });

        back.setText("<");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(removeStudents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addStudents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewStudents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back)))
                .addGap(146, 146, 146))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back)
                .addGap(46, 46, 46)
                .addComponent(viewStudents)
                .addGap(37, 37, 37)
                .addComponent(addStudents)
                .addGap(38, 38, 38)
                .addComponent(removeStudents)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentsActionPerformed
        // TODO add your handling code here:
        addstud ads = new addstud();
        ads.show();
    }//GEN-LAST:event_addStudentsActionPerformed

    private void viewStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewStudentsActionPerformed
        // TODO add your handling code here:
        dispose();
        ViewStud vs = new ViewStud();
        vs.show();
    }//GEN-LAST:event_viewStudentsActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        dispose();
        dashboard mgs= new dashboard();
        mgs.show();
    }//GEN-LAST:event_backActionPerformed

    private void removeStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeStudentsActionPerformed
        // TODO add your handling code here:
        remStud remS = new remStud();
        remS.show();
        dispose();
        
    }//GEN-LAST:event_removeStudentsActionPerformed

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
            java.util.logging.Logger.getLogger(mgstudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mgstudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mgstudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mgstudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mgstudents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addStudents;
    private javax.swing.JButton back;
    private javax.swing.JButton removeStudents;
    private javax.swing.JButton viewStudents;
    // End of variables declaration//GEN-END:variables
}