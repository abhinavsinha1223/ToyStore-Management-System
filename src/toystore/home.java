/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package toystore;

import javax.swing.JOptionPane;

/**
 *
 * @author Abhinav
 */
public class home extends javax.swing.JFrame {

    public int z = 0;

    /**
     * Creates new form home
     */
    public home() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
setResizable(false);
        jButton11.setVisible(false);
        jButton12.setVisible(false);
        jButton13.setVisible(false);
        jButton14.setVisible(false);
        jButton15.setVisible(false);
        jButton16.setVisible(false);
        jButton17.setVisible(false);
        jButton18.setVisible(false);
        jButton19.setVisible(false);
        jButton22.setVisible(false);
        jButton21.setVisible(false);
        jButton20.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton11 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton11.setBackground(new java.awt.Color(255, 255, 204));
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Abhinav\\Downloads\\icons8-member-30 (1).png")); // NOI18N
        jButton11.setText("New Customer");
        jButton11.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jButton11ComponentShown(evt);
            }
        });
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 480, 239, 56));

        jButton21.setBackground(new java.awt.Color(255, 255, 51));
        jButton21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton21.setIcon(new javax.swing.ImageIcon("C:\\Users\\Abhinav\\Downloads\\icons8-delete-view-48.png")); // NOI18N
        jButton21.setText("Delete Toys");
        jButton21.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jButton21ComponentShown(evt);
            }
        });
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 720, 240, -1));

        jButton12.setBackground(new java.awt.Color(255, 255, 153));
        jButton12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Abhinav\\Downloads\\icons8-toy-car-30.png")); // NOI18N
        jButton12.setText("New Toys");
        jButton12.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jButton12ComponentShown(evt);
            }
        });
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 480, 239, 55));

        jButton19.setBackground(new java.awt.Color(255, 255, 0));
        jButton19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton19.setIcon(new javax.swing.ImageIcon("C:\\Users\\Abhinav\\Downloads\\icons8-folder-bills-32.png")); // NOI18N
        jButton19.setText("Bills");
        jButton19.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jButton19ComponentShown(evt);
            }
        });
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 640, 250, 60));

        jButton20.setBackground(new java.awt.Color(204, 255, 0));
        jButton20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton20.setIcon(new javax.swing.ImageIcon("C:\\Users\\Abhinav\\Downloads\\icons8-sign-out-48.png")); // NOI18N
        jButton20.setText("Logout");
        jButton20.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jButton20ComponentShown(evt);
            }
        });
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 720, 250, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel1.setText("WELCOME TO TOY STORE ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 250, 634, -1));

        jButton16.setBackground(new java.awt.Color(255, 255, 204));
        jButton16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton16.setIcon(new javax.swing.ImageIcon("C:\\Users\\Abhinav\\Downloads\\icons8-customer-insight-30.png")); // NOI18N
        jButton16.setText("Update Customer");
        jButton16.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jButton16ComponentShown(evt);
            }
        });
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 560, 239, 56));

        jButton17.setBackground(new java.awt.Color(255, 255, 204));
        jButton17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton17.setIcon(new javax.swing.ImageIcon("C:\\Users\\Abhinav\\Downloads\\icons8-contact-details-48.png")); // NOI18N
        jButton17.setText("Customer Details");
        jButton17.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jButton17ComponentShown(evt);
            }
        });
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 640, 239, -1));

        jButton15.setBackground(new java.awt.Color(255, 255, 153));
        jButton15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton15.setIcon(new javax.swing.ImageIcon("C:\\Users\\Abhinav\\Downloads\\icons8-kids-school-learning-toys-with-numerical-numbers-48.png")); // NOI18N
        jButton15.setText("Update Toys");
        jButton15.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jButton15ComponentShown(evt);
            }
        });
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 560, 238, -1));

        jButton18.setBackground(new java.awt.Color(255, 255, 153));
        jButton18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton18.setIcon(new javax.swing.ImageIcon("C:\\Users\\Abhinav\\Downloads\\icons8-tire-swing-50.png")); // NOI18N
        jButton18.setText("Toys Details");
        jButton18.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jButton18ComponentShown(evt);
            }
        });
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 640, 238, -1));

        jButton22.setBackground(new java.awt.Color(255, 255, 153));
        jButton22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/toystore/icons8-delete-view-48.png"))); // NOI18N
        jButton22.setText("Delete Customer");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 720, 230, -1));

        jButton14.setBackground(new java.awt.Color(255, 255, 102));
        jButton14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton14.setIcon(new javax.swing.ImageIcon("C:\\Users\\Abhinav\\Downloads\\icons8-rating-48.png")); // NOI18N
        jButton14.setText("Rating");
        jButton14.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jButton14ComponentShown(evt);
            }
        });
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 560, 250, 60));

        jButton13.setBackground(new java.awt.Color(255, 255, 102));
        jButton13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/toystore/icons8-favorite-cart-48.png"))); // NOI18N
        jButton13.setText("Exchange/Return");
        jButton13.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jButton13ComponentShown(evt);
            }
        });
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 480, 250, 60));

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Abhinav\\Downloads\\icons8-details-100.png")); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 320, 190, 110));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Abhinav\\Downloads\\tim-mossholder-GOMhuCj-O9w-unsplash.png")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 1990, 1170));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "CONFIRM EXIT", "SELECT", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            setVisible(false);
            new login().setVisible(true);
        }       // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        new newcustomer().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        new deletetoys().setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        new newtoys().setVisible(true);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jButton11ComponentShown
        // TODO add your handling code here:
        try {
            Thread.sleep(250);
            jButton12.setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton11ComponentShown

    private void jButton16ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jButton16ComponentShown
        // TODO add your handling code here:
 try {
                Thread.sleep(250);
                jButton17.setVisible(true);
            } catch (Exception e) {
            }
    }//GEN-LAST:event_jButton16ComponentShown

    private void jButton17ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jButton17ComponentShown
        // TODO add your handling code here:
 try {
                Thread.sleep(250);
                jButton18.setVisible(true);
            } catch (Exception e) {
            }
    }//GEN-LAST:event_jButton17ComponentShown

    private void jButton12ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jButton12ComponentShown
        // TODO add your handling code here:
 try {
                Thread.sleep(250);
                jButton13.setVisible(true);
            } catch (Exception e) {
            }
    }//GEN-LAST:event_jButton12ComponentShown

    private void jButton15ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jButton15ComponentShown
        // TODO add your handling code here:
 try {
                Thread.sleep(250);
                jButton16.setVisible(true);
            } catch (Exception e) {
            }
    }//GEN-LAST:event_jButton15ComponentShown

    private void jButton18ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jButton18ComponentShown
        // TODO add your handling code here:
 try {
                Thread.sleep(250);
                jButton19.setVisible(true);
            } catch (Exception e) {
            }
    }//GEN-LAST:event_jButton18ComponentShown

    private void jButton21ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jButton21ComponentShown
        // TODO add your handling code here:
 try {
                Thread.sleep(250);
                jButton22.setVisible(true);
            } catch (Exception e) {
            }
    }//GEN-LAST:event_jButton21ComponentShown

    private void jButton19ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jButton19ComponentShown
        // TODO add your handling code here:
 try {
                Thread.sleep(250);
                jButton20.setVisible(true);
            } catch (Exception e) {
            }
    }//GEN-LAST:event_jButton19ComponentShown

    private void jButton20ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jButton20ComponentShown
        // TODO add your handling code here: 
try {
                Thread.sleep(250);
                jButton21.setVisible(true);
            } catch (Exception e) {
            }
    }//GEN-LAST:event_jButton20ComponentShown

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        new updatecustomer().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        new customerdetails().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        new updatetoys().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        new toysdetails().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        new deletecustomer().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        new billorders().setVisible(true);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        new exchange().setVisible(true);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        if (z == 0) {
            try {
                Thread.sleep(250);
                jButton11.setVisible(true);
            } catch (Exception e) {
            }
        } 
else {
            jButton11.setVisible(false);
            jButton12.setVisible(false);
            jButton13.setVisible(false);
            jButton14.setVisible(false);
            jButton15.setVisible(false);
            jButton16.setVisible(false);
            jButton17.setVisible(false);
            jButton18.setVisible(false);
            jButton19.setVisible(false);
            jButton22.setVisible(false);
            jButton21.setVisible(false);
            jButton20.setVisible(false);
            z=0;
        }

    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton14ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jButton14ComponentShown
        // TODO add your handling code here:
 try {
                Thread.sleep(250);
                jButton15.setVisible(true);
            } catch (Exception e) {
            }
    }//GEN-LAST:event_jButton14ComponentShown

    private void jButton13ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jButton13ComponentShown
        // TODO add your handling code here:
 try {
                Thread.sleep(250);
                jButton14.setVisible(true);
            } catch (Exception e) {
            }
    }//GEN-LAST:event_jButton13ComponentShown

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
new rating().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
