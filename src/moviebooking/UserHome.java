/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviebooking;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import moviebooking.entities.User;
import moviebooking.entities.UserDAO;

/**
 *
 * @author Parth Shah
 */
public class UserHome extends javax.swing.JFrame {

    /**
     * Creates new form UserHome
     */
    public UserHome(User user) {
        initComponents();
        welcome.setText("Welcome, " + String.valueOf(user.getName()));
        
        walletLabel.setText("Your Wallet Balance is Rs." + String.valueOf(user.getWalletBalance()) + "/-");
        
        bookTicket.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new BookTicket(user).setVisible(true);
                dispose();
            }
        });
        
        viewHistory.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new History(user).setVisible(true);
                dispose();
            }
        });
        
        addToWalletBalance.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                user.setWalletBalance(user.getWalletBalance() + Integer.valueOf(addValue.getText()));
                UserDAO.update(user);
                walletLabel.setText("Your Wallet Balance is Rs." + String.valueOf(user.getWalletBalance()) + "/-");
            }
        });
        
        userLogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Login().setVisible(true);
            }
        });
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
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        welcome = new javax.swing.JLabel();
        bookTicket = new javax.swing.JButton();
        viewHistory = new javax.swing.JButton();
        walletLabel = new javax.swing.JLabel();
        addValue = new javax.swing.JTextField();
        addToWalletBalance = new javax.swing.JButton();
        userLogout = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/UserHome.png"))); // NOI18N
        jLabel1.setOpaque(true);
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 530));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 530));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        welcome.setBackground(new java.awt.Color(255, 255, 255));
        welcome.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        welcome.setText("Welcome, User");
        jPanel3.add(welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 330, 50));

        bookTicket.setBackground(new java.awt.Color(255, 255, 255));
        bookTicket.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        bookTicket.setText("Book a Ticket");
        bookTicket.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(bookTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 140, 40));

        viewHistory.setBackground(new java.awt.Color(255, 255, 255));
        viewHistory.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        viewHistory.setText("View History");
        viewHistory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(viewHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 140, 40));

        walletLabel.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        walletLabel.setText("Wallet Money Display");
        jPanel3.add(walletLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 340, 40));

        addValue.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        addValue.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        addValue.setText("500");
        addValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addValueActionPerformed(evt);
            }
        });
        jPanel3.add(addValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 100, 40));

        addToWalletBalance.setBackground(new java.awt.Color(255, 255, 255));
        addToWalletBalance.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        addToWalletBalance.setText("<HTML>Add Money<br/>&nbsp to Wallet</HTML>");
        addToWalletBalance.setToolTipText("");
        addToWalletBalance.setActionCommand("<HTML>Add Money<br/>&nbsp &nbsp &nbsp to Wallet</HTML>");
        addToWalletBalance.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(addToWalletBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, 130, 40));

        userLogout.setBackground(new java.awt.Color(255, 255, 255));
        userLogout.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        userLogout.setText("Logout");
        userLogout.setToolTipText("");
        userLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(userLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 100, 30));

        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 340, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 510, 530));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addValueActionPerformed

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
            java.util.logging.Logger.getLogger(UserHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserHome(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToWalletBalance;
    private javax.swing.JTextField addValue;
    private javax.swing.JButton bookTicket;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton userLogout;
    private javax.swing.JButton viewHistory;
    private javax.swing.JLabel walletLabel;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
