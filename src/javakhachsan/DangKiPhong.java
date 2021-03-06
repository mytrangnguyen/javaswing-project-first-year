/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javakhachsan;

import javakhachsan.ROOM;

/**
 *
 * @author thinh.nguyen
 */
public class DangKiPhong extends javax.swing.JFrame {

    /**
     * Creates new form DangKiPhong
     */
    public DangKiPhong() {
        initComponents();
        this.setSize(1000, 650);
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtRoomList = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtID_room = new javax.swing.JTextField();
        Add = new javax.swing.JButton();
        Return = new javax.swing.JButton();
        cbo = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jCheckBoxGYM = new javax.swing.JCheckBox();
        jCheckBoxSPA = new javax.swing.JCheckBox();
        jCheckBoxBBQ = new javax.swing.JCheckBox();
        jCheckBoxPoor = new javax.swing.JCheckBox();
        jCheckBoxRental = new javax.swing.JCheckBox();
        jCheckBoxParty = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jComboBoxNationality = new javax.swing.JComboBox<String>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtPhones = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtAdress = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Registration logo.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(330, 0, 370, 90);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Name:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 110, 80, 30);
        getContentPane().add(txtName);
        txtName.setBounds(230, 110, 270, 30);

        jLabel4.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        jLabel4.setText("Kind");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(560, 160, 120, 30);
        getContentPane().add(txtID);
        txtID.setBounds(230, 160, 270, 30);

        jLabel5.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        jLabel5.setText("Id:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(80, 160, 70, 30);

        jLabel6.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        jLabel6.setText("Room List");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(560, 110, 140, 30);
        getContentPane().add(txtRoomList);
        txtRoomList.setBounds(690, 110, 270, 30);

        jLabel7.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        jLabel7.setText("Price");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(560, 210, 130, 32);
        getContentPane().add(txtPrice);
        txtPrice.setBounds(690, 210, 270, 30);

        jLabel9.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        jLabel9.setText("Id Room ");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(560, 260, 140, 32);
        getContentPane().add(txtID_room);
        txtID_room.setBounds(690, 260, 270, 30);

        Add.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/add.png"))); // NOI18N
        Add.setText("ADD");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        getContentPane().add(Add);
        Add.setBounds(820, 570, 120, 40);

        Return.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Return.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/return.png"))); // NOI18N
        Return.setText("RETURN");
        Return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnActionPerformed(evt);
            }
        });
        getContentPane().add(Return);
        Return.setBounds(680, 570, 120, 40);

        cbo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cbo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Standard (STD)", "Superior (SUP)", "Deluxe(DLX)", "Suite(SUT)" }));
        cbo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboActionPerformed(evt);
            }
        });
        getContentPane().add(cbo);
        cbo.setBounds(690, 160, 180, 23);

        jLabel8.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        jLabel8.setText("Service");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(560, 420, 110, 20);

        jCheckBoxGYM.setText("GYM");
        getContentPane().add(jCheckBoxGYM);
        jCheckBoxGYM.setBounds(700, 430, 47, 23);

        jCheckBoxSPA.setText("SPA");
        getContentPane().add(jCheckBoxSPA);
        jCheckBoxSPA.setBounds(790, 430, 45, 23);

        jCheckBoxBBQ.setText("BBQ");
        getContentPane().add(jCheckBoxBBQ);
        jCheckBoxBBQ.setBounds(880, 430, 45, 23);

        jCheckBoxPoor.setText("POOL");
        getContentPane().add(jCheckBoxPoor);
        jCheckBoxPoor.setBounds(700, 480, 70, 23);

        jCheckBoxRental.setText("Rental Bike");
        getContentPane().add(jCheckBoxRental);
        jCheckBoxRental.setBounds(790, 480, 90, 23);

        jCheckBoxParty.setText("Party");
        getContentPane().add(jCheckBoxParty);
        jCheckBoxParty.setBounds(880, 480, 51, 23);

        jLabel10.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        jLabel10.setText("Day Arrival");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(560, 310, 140, 40);

        jLabel11.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        jLabel11.setText("Day Leave");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(560, 360, 120, 30);

        jComboBoxNationality.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Vietnamese", "Japanese", "Bristish", "American", "Korean", "Mexico", "Chinese" }));
        getContentPane().add(jComboBoxNationality);
        jComboBoxNationality.setBounds(230, 210, 160, 30);

        jLabel12.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        jLabel12.setText("Nationality");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(80, 210, 120, 32);

        jLabel13.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        jLabel13.setText("Addres");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(80, 310, 100, 40);

        jLabel14.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        jLabel14.setText("Phones");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(80, 360, 110, 40);
        getContentPane().add(txtPhones);
        txtPhones.setBounds(230, 370, 270, 30);

        jLabel16.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        jLabel16.setText("Birthday");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(80, 260, 100, 30);
        getContentPane().add(txtAdress);
        txtAdress.setBounds(230, 310, 270, 30);

        jLabel15.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        jLabel15.setText("Email");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(80, 420, 90, 30);
        getContentPane().add(txtEmail);
        txtEmail.setBounds(230, 430, 270, 30);
        getContentPane().add(jDateChooser1);
        jDateChooser1.setBounds(230, 260, 270, 30);
        getContentPane().add(jDateChooser2);
        jDateChooser2.setBounds(690, 310, 270, 30);
        getContentPane().add(jDateChooser3);
        jDateChooser3.setBounds(690, 360, 270, 30);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Gound room.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1010, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        
            
    }//GEN-LAST:event_AddActionPerformed

    private void ReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnActionPerformed
        // TODO add your handling code here:
        ROOM turnRoom = new ROOM();
        turnRoom.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ReturnActionPerformed

    private void cboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboActionPerformed
        int a = cbo.getSelectedIndex();
                if (a == 0) {
                    txtPrice.setText("800,000 VND");
                } else if (a == 1) {
                    txtPrice.setText("1,500,000 VND");
                } else if (a == 2) {
                    txtPrice.setText("2,000,000 VND ");
                } else if (a == 3) {
                    txtPrice.setText("5,000,000 VND");
                }
    }//GEN-LAST:event_cboActionPerformed

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
            java.util.logging.Logger.getLogger(DangKiPhong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangKiPhong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangKiPhong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangKiPhong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangKiPhong().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Return;
    private javax.swing.JComboBox cbo;
    private javax.swing.JCheckBox jCheckBoxBBQ;
    private javax.swing.JCheckBox jCheckBoxGYM;
    private javax.swing.JCheckBox jCheckBoxParty;
    private javax.swing.JCheckBox jCheckBoxPoor;
    private javax.swing.JCheckBox jCheckBoxRental;
    private javax.swing.JCheckBox jCheckBoxSPA;
    private javax.swing.JComboBox<String> jComboBoxNationality;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAdress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtID_room;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhones;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtRoomList;
    // End of variables declaration//GEN-END:variables
}
