package Question1Package;

import java.awt.Color;
import java.awt.color.ColorSpace;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Possible solution for Question 1
 */
public class Question1 extends javax.swing.JFrame {

    public Question1() {
        this.setVisible(true);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlButtons = new javax.swing.JPanel();
        btnQuest1_1 = new javax.swing.JButton();
        btnQuest1_2 = new javax.swing.JButton();
        btnQuest1_3 = new javax.swing.JButton();
        btnQuest1_4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        bntQuit = new javax.swing.JButton();
        lblHeading = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txfFirstNames = new javax.swing.JTextField();
        txfSurname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txfID = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaNameTag = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaPurchases = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Question 1 -");

        pnlButtons.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        btnQuest1_1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnQuest1_1.setText("Question 1.1");
        btnQuest1_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuest1_1ActionPerformed(evt);
            }
        });

        btnQuest1_2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnQuest1_2.setText("Question 1.2");
        btnQuest1_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuest1_2ActionPerformed(evt);
            }
        });

        btnQuest1_3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnQuest1_3.setText("Question 1.3");
        btnQuest1_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuest1_3ActionPerformed(evt);
            }
        });

        btnQuest1_4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnQuest1_4.setText("Question 1.4");
        btnQuest1_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuest1_4ActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Question1Package/logo.PNG"))); // NOI18N

        bntQuit.setText("Quit");
        bntQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntQuitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlButtonsLayout = new javax.swing.GroupLayout(pnlButtons);
        pnlButtons.setLayout(pnlButtonsLayout);
        pnlButtonsLayout.setHorizontalGroup(
            pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlButtonsLayout.createSequentialGroup()
                .addGroup(pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlButtonsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bntQuit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlButtonsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnQuest1_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnQuest1_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnQuest1_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnQuest1_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlButtonsLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        pnlButtonsLayout.setVerticalGroup(
            pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlButtonsLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnQuest1_1)
                .addGap(30, 30, 30)
                .addComponent(btnQuest1_2)
                .addGap(33, 33, 33)
                .addComponent(btnQuest1_3)
                .addGap(38, 38, 38)
                .addComponent(btnQuest1_4)
                .addGap(39, 39, 39)
                .addComponent(bntQuit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblHeading.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblHeading.setForeground(new java.awt.Color(0, 51, 255));
        lblHeading.setText("Heading... <Q 1.1.>");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("First name:");

        txfFirstNames.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txfFirstNames.setText("Tandi Nkandla ");

        txfSurname.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txfSurname.setText("Mbali");

        jLabel2.setText("Surname:");

        jLabel3.setText("ID:");

        txfID.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txfID.setText("9904123456081");

        txaNameTag.setBackground(new java.awt.Color(227, 227, 227));
        txaNameTag.setColumns(20);
        txaNameTag.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txaNameTag.setRows(5);
        txaNameTag.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Name Tag", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 51, 255))); // NOI18N
        jScrollPane2.setViewportView(txaNameTag);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txfSurname, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                            .addComponent(txfFirstNames)
                            .addComponent(txfID))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txfFirstNames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txaPurchases.setBackground(new java.awt.Color(250, 250, 250));
        txaPurchases.setColumns(20);
        txaPurchases.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        txaPurchases.setRows(5);
        txaPurchases.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Purchases", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 51, 255))); // NOI18N
        jScrollPane1.setViewportView(txaPurchases);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblHeading)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeading)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuest1_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuest1_1ActionPerformed
        lblHeading.setText("PC Athletics Championships");
    }//GEN-LAST:event_btnQuest1_1ActionPerformed

    private void btnQuest1_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuest1_2ActionPerformed
        String[] firstNames = txfFirstNames.getText().split(" ");
        String surname = txfSurname.getText();
        int genderCode = Integer.parseInt(txfID.getText().substring(6, 10));
        String gender = "";
        if (genderCode >= 5000) {
            gender = "Male";
        } else {
            gender = "Female";
        }
        String initials = "";
        for (String name : firstNames) {
            initials += name.charAt(0);
        }
        String nameTag = String.format("%s %s.\n%s", surname, initials, gender);
        txaNameTag.setText(nameTag);
    }//GEN-LAST:event_btnQuest1_2ActionPerformed

    private void btnQuest1_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuest1_3ActionPerformed
        btnQuest1_2ActionPerformed(evt);
        DateFormat df = new SimpleDateFormat("yyyyMMdd"); // Check how memo did this.
        String date = txfID.getText().substring(0, 6);
        if ((Integer.parseInt(date.substring(0, 2)) > 14)) {
            date = "19" + date;
        } else {
            date = "20" + date;
        }
        Date birthDate = null;
        String ageGroup = "Age Group : U/";
        try {
            birthDate = df.parse(date);
            int birthYear = birthDate.getYear() + 1900;
            int age = 2014 - birthYear;
            if (age <= 15) {
                ageGroup += "15";
            } else if (age <= 17) {
                ageGroup += "17";
            } else if (age <= 19) {
                ageGroup += "19";
            } else if (age > 20) {
                ageGroup = "Not eligible to participate";
            }
            txaNameTag.append(String.format("\n%s", ageGroup));
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Please double-check your ID Number.");
        }
    }//GEN-LAST:event_btnQuest1_3ActionPerformed

    private void btnQuest1_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuest1_4ActionPerformed
        double price = Double.parseDouble(JOptionPane.showInputDialog("Enter the price of an item : "));
        int quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount of items bought : "));
        double amount = price * quantity;
        double discount = 0.0;
        double totalAmount = 0.00;
        double amountDue = 0.00;
        txaPurchases.setText(String.format("%-10s%-15s%-15s%-15s%-15s\n", "Quantity", "Price", "Total", "Discount", "Amount Due"));
        for (int i = 0; i < quantity; i++) {
            totalAmount = (i + 1) * price;
            if ((((i + 1) % 2) == 0)) {
                // Divisble by two - Grant discount on total amount
                discount = totalAmount * 0.2;
                amountDue = totalAmount - discount;
            } else {
                // Not divisble by two - Grant Discunt on total amount - 1;
                discount = (totalAmount - (1 * price)) * 0.2;
                amountDue = totalAmount - discount;
                if (i == 0) {
                    discount = 0.00;
                    amountDue = totalAmount;
                }

            }

            String output = String.format("%-10d%s%-7.2f%-8s%-15s%-15.2f%-10.2f\n", i + 1, "x", price, "=",
                    String.format("R %.2f", totalAmount), discount, amountDue);
            txaPurchases.append(output);
        }
    }//GEN-LAST:event_btnQuest1_4ActionPerformed

    private void bntQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntQuitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bntQuitActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Question1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Question1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Question1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Question1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Question1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntQuit;
    private javax.swing.JButton btnQuest1_1;
    private javax.swing.JButton btnQuest1_2;
    private javax.swing.JButton btnQuest1_3;
    private javax.swing.JButton btnQuest1_4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JPanel pnlButtons;
    private javax.swing.JTextArea txaNameTag;
    private javax.swing.JTextArea txaPurchases;
    private javax.swing.JTextField txfFirstNames;
    private javax.swing.JTextField txfID;
    private javax.swing.JTextField txfSurname;
    // End of variables declaration//GEN-END:variables
}
