/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package myApp;
import myLibs.*;

/**
 *
 * @author hardcodehtml
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    
    //admin account 
   
    
    
    
    public Login() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        password_input = new javax.swing.JTextField();
        username_input = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(91, 33, 182));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logo.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 232, 165));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(91, 33, 182));
        jLabel1.setText("LOGIN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, -1, -1));

        password_input.setBackground(new java.awt.Color(255, 255, 255));
        password_input.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(91, 33, 182)));
        password_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_inputActionPerformed(evt);
            }
        });
        jPanel1.add(password_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 382, 45));

        username_input.setBackground(new java.awt.Color(255, 255, 255));
        username_input.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(91, 33, 182)));
        username_input.setMargin(new java.awt.Insets(6, 6, 6, 6));
        username_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_inputActionPerformed(evt);
            }
        });
        jPanel1.add(username_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 382, 45));

        jButton1.setBackground(new java.awt.Color(91, 33, 182));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SIGN-IN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, 123, 37));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, -1, -1));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Incorrect Credentials. Please Try again! ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 770, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void username_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username_inputActionPerformed

    private void password_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password_inputActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
       LogInCreds attempt = new LogInCreds(username_input.getText(),password_input.getText());
       Admin admin = new Admin("1","1");
       
      // String cred_un = "pass";
     // String cred_pas = "pass";
       
      // String username = username_input.getText();
     // String pass = password_input.getText();
       
       
       
     
       if(attempt.getUsername().equals(admin.getUsername()) && attempt.getPassword().equals(admin.getPassword())){
       
          this.setVisible(false);
          new Home().setVisible(true);
       
          
       }
       else if(attempt.getUsername() != admin.getUsername() && attempt.getPassword() != admin.getPassword()){
           
          //jLabel5.setText(attempt.getPassword());
            jLabel5.setForeground(new java.awt.Color(204,0,0));
            
            
       }
       
       
       
       
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
                
            }
        });
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField password_input;
    private javax.swing.JTextField username_input;
    // End of variables declaration//GEN-END:variables
}
