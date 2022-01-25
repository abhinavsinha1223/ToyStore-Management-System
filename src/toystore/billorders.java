/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package toystore;

import java.sql.*;
import Project.ConnectionProvider;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import javax.swing.JOptionPane;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import java.text.*;
import java.awt.print.*;
import javax.swing.JTable;

/**
 *
 * @author Abhinav
 */
public class billorders extends javax.swing.JFrame {

    public int total = 0;

    /**
     * Creates new form billorders
     */
    public billorders() {
        initComponents();
        setBounds(325, 125, 1185, 610);
        setResizable(false);
        SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date d = new Date();
        jLabel3.setText(dFormat.format(d));

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        jLabel5.setText(dtf.format(now));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Abhinav\\Downloads\\icons8-billing-64.png")); // NOI18N
        jLabel1.setText("Billing");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(14, 17, 222, 93);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Abhinav\\Downloads\\icons8-date-48.png")); // NOI18N
        jLabel2.setText("DATE :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(627, 80, 117, 48);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ff");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(756, 91, 140, 30);

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Abhinav\\Downloads\\icons8-time-40.png")); // NOI18N
        jLabel4.setText("TIME :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(903, 84, 108, 40);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(1029, 95, 79, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Customer ID");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(36, 172, 89, 17);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Customer Name");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(342, 167, 112, 26);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Mobile");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(775, 172, 44, 17);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Toy ID");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(40, 230, 47, 17);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Toy Name");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(326, 235, 70, 17);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Quantity");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(655, 235, 60, 17);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Rate");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(892, 235, 32, 17);

        jButton1.setBackground(new java.awt.Color(102, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Abhinav\\Downloads\\icons8-add-24.png")); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(1065, 221, 103, 45);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(12, 278, 1127, 2);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(14, 138, 1127, 2);

        jTextField1.setBackground(new java.awt.Color(255, 255, 102));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(131, 169, 205, 23);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Payable Amount ");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(960, 350, 182, 22);

        jTextField2.setBackground(new java.awt.Color(255, 255, 102));
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jTextField2);
        jTextField2.setBounds(468, 168, 289, 26);

        jTextField3.setBackground(new java.awt.Color(255, 255, 102));
        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jTextField3);
        jTextField3.setBounds(825, 169, 262, 23);

        jTextField4.setBackground(new java.awt.Color(255, 255, 102));
        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(131, 232, 181, 23);

        jTextField5.setBackground(new java.awt.Color(255, 255, 102));
        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jTextField5);
        jTextField5.setBounds(733, 232, 141, 23);

        jTextField6.setBackground(new java.awt.Color(255, 255, 102));
        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jTextField6);
        jTextField6.setBounds(930, 232, 121, 23);

        jTextField7.setBackground(new java.awt.Color(255, 255, 102));
        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jTextField7);
        jTextField7.setBounds(402, 233, 225, 23);

        jTextField8.setBackground(new java.awt.Color(255, 255, 51));
        jTextField8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jTextField8);
        jTextField8.setBounds(592, 340, 341, 41);

        jButton2.setBackground(new java.awt.Color(51, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Abhinav\\Downloads\\icons8-save-48.png")); // NOI18N
        jButton2.setText("save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(592, 399, 123, 48);

        jButton3.setBackground(new java.awt.Color(51, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/toystore/icons8-close-30.png"))); // NOI18N
        jButton3.setText("Close");
        jButton3.setToolTipText("");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(592, 488, 123, 45);

        jButton4.setBackground(new java.awt.Color(51, 255, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/toystore/icons8-reset-24.png"))); // NOI18N
        jButton4.setText("Reset");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(748, 487, 161, 46);

        jButton5.setBackground(new java.awt.Color(51, 255, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Abhinav\\Downloads\\icons8-print-50.png")); // NOI18N
        jButton5.setText("Print Table");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(748, 400, 161, 46);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "TOY ID", "QUANTITY", "RATE"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(36, 298, 511, 262);

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\Abhinav\\Downloads\\yulia-matvienko-kgz9vsP5JCU-unsplash.png")); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(0, 0, 1220, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        String cust = jTextField1.getText();
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from customer where cid like '" + cust + "'");
            if (rs.next()) {

                jTextField1.setText(rs.getString(1));
                jTextField2.setText(rs.getString(2));
                jTextField3.setText(rs.getString(4));
            } else {
                jTextField2.setText("null");
                jTextField3.setText("null");

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
        String toys = jTextField4.getText();
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from toy where tid like '" + toys + "'");
            if (rs.next()) {

                jTextField4.setText(rs.getString(1));
                jTextField7.setText(rs.getString(2));
                jTextField6.setText(rs.getString(4));
                jTextField5.setText("1");
            } else {
                jTextField5.setText("null");
                jTextField6.setText("null");
                jTextField7.setText("null");

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "kill");
        }
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int price = Integer.parseInt(jTextField6.getText());
        int quan = Integer.parseInt(jTextField5.getText());
        int total1 = price * quan;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{jTextField2.getText(), jTextField4.getText(), quan, price, total1});
        total = total + total1;
        String total2 = String.valueOf(total);
        jTextField8.setText(total2);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        setVisible(false);
        new billorders().setVisible(true);           // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String name = jTextField2.getText();
        String contact = jTextField3.getText();
        String cid = jTextField1.getText();
        String path = "D:\\";
        com.itextpdf.text.Document doc = new com.itextpdf.text.Document();
        try {
            PdfWriter.getInstance(doc, new FileOutputStream(path + "" + name + ".pdf"));
            doc.open();
            Paragraph p1 = new Paragraph("                          Abhinav & Hashim Toy Store Management System\n                       Contact Number:(+91)9199826293,(+91)6353940851                   \n                    Address: Acharya Institute Of Technology,Bangalore,560107\n\n");
            doc.add(p1);
            Paragraph p2 = new Paragraph("Date & Time: " + jLabel3.getText() + "   " + jLabel5.getText() + "\n\nSCustomer Details:\n\nCUSTOMER NAME: " + name + "\nCUSTOMER ID: " + cid + "\nCONTACT NUMBER: " + contact + "\n\n\n");
            doc.add(p2);
            

            PdfPTable ppt = new PdfPTable(5);
            ppt.addCell("Name:\n" + jTextField2.getText());
            ppt.addCell("Toy ID:\n " + jTextField4.getText());
            ppt.addCell("Rate:\nRs. " + jTextField6.getText());
            ppt.addCell("Quantity:\n " + jTextField5.getText());
            ppt.addCell("Total Amount:\n Rs. " + jTextField8.getText());

            doc.add(ppt);

            Paragraph p3 = new Paragraph("\nTotal Amount To be paid Rs. = " + jTextField8.getText() + "\n\nThank You for Visiting Our Shop !!! Please Visit Us Again\n");
            doc.add(p3);
            Paragraph p34 = new Paragraph("\nFor any complaints Regarding Our Product reach out to us at abhinava.19.becs@acharya.ac.in");
            doc.add(p34);

            JOptionPane.showMessageDialog(null, "CONGRATS!!! \n Your Order Is Booked for Rs." + jTextField8.getText());
            setVisible(true);
           // new billorders().setVisible(true);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "billi ");
        }
        doc.close();


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:

        String name = jTextField2.getText();
        String contact = jTextField3.getText();
        String cid = jTextField1.getText();

        MessageFormat header = new MessageFormat("Abhinav & Hashim Toy Store Management System  Mr./Ms. " + jTextField2.getText());
        MessageFormat foot = new MessageFormat("Thank YOU!! Visit Again!!\nFor any complaints Regarding Our Product reach out to us at abhinava.19.becs@acharya.ac.in");
        try {
            jTable1.print(JTable.PrintMode.NORMAL, header, foot);
        } catch (java.awt.print.PrinterException e) {
            System.err.format("Cannot print", e.getMessage());

        }


    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(billorders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(billorders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(billorders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(billorders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new billorders().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables

}
