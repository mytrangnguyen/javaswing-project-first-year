/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javakhachsan;


/**
 *
 * @author thinh.nguyen
 */
public class MENU1 extends javax.swing.JFrame {

    ROOM  ro[]= new ROOM[30];

    /**
     * Creates new form MENU1
     */
    public MENU1() {
        initComponents();
        this.setSize(600, 455);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btEmpoyee = new javax.swing.JButton();
        btRoom = new javax.swing.JButton();
        btService = new javax.swing.JButton();
        btCustomer = new javax.swing.JButton();
        btLogout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Engravers MT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("MENU MANAGER");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 110, 310, 180);

        btEmpoyee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/employee.png"))); // NOI18N
        btEmpoyee.setText("EMPLOYEE");
        btEmpoyee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEmpoyeeActionPerformed(evt);
            }
        });
        getContentPane().add(btEmpoyee);
        btEmpoyee.setBounds(20, 260, 130, 60);

        btRoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/go_home.png"))); // NOI18N
        btRoom.setText("ROOM");
        btRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRoomActionPerformed(evt);
            }
        });
        getContentPane().add(btRoom);
        btRoom.setBounds(170, 260, 130, 60);

        btService.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/service.png"))); // NOI18N
        btService.setText("SERVICE");
        getContentPane().add(btService);
        btService.setBounds(320, 260, 120, 60);

        btCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/khách hàng.png"))); // NOI18N
        btCustomer.setText("CUSTOMER");
        btCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCustomerActionPerformed(evt);
            }
        });
        getContentPane().add(btCustomer);
        btCustomer.setBounds(460, 260, 130, 60);

        btLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/exit.png"))); // NOI18N
        btLogout.setText("Log out");
        btLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btLogout);
        btLogout.setBounds(440, 370, 140, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Menu Ground.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 600, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btEmpoyeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEmpoyeeActionPerformed
        NhanVien nv = new NhanVien();
        nv.setVisible(true);
    }//GEN-LAST:event_btEmpoyeeActionPerformed

    private void btLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLogoutActionPerformed
        // TODO add your handling code here:
        GiaoDien login = new GiaoDien();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btLogoutActionPerformed

    private void btRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRoomActionPerformed
        // TODO add your handling code here:
       ro[0] = new ROOM();
        ro[0].setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btRoomActionPerformed

    private void btCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCustomerActionPerformed
        ListCustomer list = new ListCustomer();
        list.setVisible(true);

    }//GEN-LAST:event_btCustomerActionPerformed

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
            java.util.logging.Logger.getLogger(MENU1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MENU1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MENU1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MENU1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MENU1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCustomer;
    private javax.swing.JButton btEmpoyee;
    private javax.swing.JButton btLogout;
    private javax.swing.JButton btRoom;
    private javax.swing.JButton btService;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}