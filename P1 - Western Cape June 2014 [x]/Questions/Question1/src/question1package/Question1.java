//Enter your name and surname here -->
package question1package;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;

public class Question1 extends javax.swing.JFrame {

    private Object obj;

    public Question1() {
        initComponents();
        lblBanner.setBorder(null);
        lblBanner.setBackground(Color.black);
        lblBanner.setForeground(Color.white);
        lblBanner.setFont(new java.awt.Font("Arial", 1, 24));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bngNames = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txfFirstName = new javax.swing.JTextField();
        txfSurname = new javax.swing.JTextField();
        rbnFirstName = new javax.swing.JRadioButton();
        rbnSurname = new javax.swing.JRadioButton();
        rbnBoth = new javax.swing.JRadioButton();
        txfNoVowels = new javax.swing.JTextField();
        btnRemoveVowels = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnGeneratePlate = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        spnChars = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        spnDigits = new javax.swing.JSpinner();
        btnValidateSelection = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        txfNumberPlate = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblCost = new javax.swing.JLabel();
        btnCost = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        lblBanner = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Personalised Number Plate App");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Question 1.2"));

        jLabel1.setText("Firstname:");

        jLabel3.setText("Surname:");

        txfFirstName.setEnabled(false);

        txfSurname.setEnabled(false);

        bngNames.add(rbnFirstName);
        rbnFirstName.setText("Firstname only");
        rbnFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnFirstNameActionPerformed(evt);
            }
        });

        bngNames.add(rbnSurname);
        rbnSurname.setText("Surname Only");
        rbnSurname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnSurnameActionPerformed(evt);
            }
        });

        bngNames.add(rbnBoth);
        rbnBoth.setText("Both Firstname and Surname");
        rbnBoth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnBothActionPerformed(evt);
            }
        });

        txfNoVowels.setEditable(false);

        btnRemoveVowels.setText("Remove Vowels");
        btnRemoveVowels.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveVowelsActionPerformed(evt);
            }
        });

        jLabel4.setText("Plate Chars:");

        jLabel7.setText("Use");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txfFirstName)
                            .addComponent(btnRemoveVowels, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                            .addComponent(txfSurname)
                            .addComponent(txfNoVowels))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbnSurname)
                            .addComponent(rbnFirstName)
                            .addComponent(rbnBoth, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbnFirstName)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbnSurname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbnBoth)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txfFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txfSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnRemoveVowels)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfNoVowels, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(66, 66, 66))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Question 1.3"));

        btnGeneratePlate.setText("Generate Number Plate");
        btnGeneratePlate.setEnabled(false);
        btnGeneratePlate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeneratePlateActionPerformed(evt);
            }
        });

        jLabel5.setText("Number of characters: ");

        spnChars.setModel(new javax.swing.SpinnerNumberModel(0, 0, 7, 1));

        jLabel6.setText("Number of digits:");

        spnDigits.setModel(new javax.swing.SpinnerNumberModel(0, 0, 7, 1));

        btnValidateSelection.setText("Validate Selection");
        btnValidateSelection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidateSelectionActionPerformed(evt);
            }
        });

        txfNumberPlate.setEditable(false);
        txfNumberPlate.setBackground(new java.awt.Color(255, 255, 255));
        txfNumberPlate.setFont(new java.awt.Font("Arial", 1, 32)); // NOI18N
        txfNumberPlate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfNumberPlate.setText("ZZZ 9999 WP");
        txfNumberPlate.setBorder(null);
        txfNumberPlate.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jLayeredPane1.add(txfNumberPlate);
        txfNumberPlate.setBounds(10, 10, 230, 50);
        jLayeredPane1.setLayer(txfNumberPlate, javax.swing.JLayeredPane.PALETTE_LAYER);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/question1package/PlatePic.png"))); // NOI18N
        jLayeredPane1.add(jLabel2);
        jLabel2.setBounds(0, 0, 250, 70);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGeneratePlate, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnValidateSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(spnChars)
                            .addComponent(spnDigits, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(71, 71, 71))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(spnChars, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(spnDigits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnValidateSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGeneratePlate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Question 1.4"));

        lblCost.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblCost.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCost.setText("Cost of number plate:");

        btnCost.setText("Show Cost:");
        btnCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCostActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnCost, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblCost, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblBanner.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/question1package/Lightning-McQueen.png"))); // NOI18N
        lblBanner.setText("             Lighting McQueen Inc.");
        lblBanner.setBorder(javax.swing.BorderFactory.createTitledBorder("Question 1.1"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblBanner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblBanner, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemoveVowelsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveVowelsActionPerformed
        txfNoVowels.setText(null);
        char[] vowels = {'A', 'E', 'I', 'O', 'U'};
        String firstName = txfFirstName.getText();
        String surname = txfSurname.getText();
        char[] firstNameArr = firstName.toCharArray();
        char[] surnameArr = surname.toCharArray();

        for (int i = 0; i < firstNameArr.length; i++) {
            firstNameArr[i] = Character.toUpperCase(firstNameArr[i]);
            for (int j = 0; j < vowels.length; j++) {
                if (firstNameArr[i] == vowels[j]) {
                    firstNameArr[i] = '\u0000';
                }
            }
        }

        for (int i = 0; i < surnameArr.length; i++) {
            surnameArr[i] = Character.toUpperCase(surnameArr[i]);
            for (int j = 0; j < vowels.length; j++) {
                if (surnameArr[i] == vowels[j]) {
                    surnameArr[i] = '\u0000';
                }
            }
        }
        String outfName = "";
        String outSName = "";
        for (char character : firstNameArr) {
            if (character != '\u0000') {
                outfName += character;
            }
        }
        for (char character : surnameArr) {
            if (character != '\u0000') {
                outSName += character;
            }
        }
        String output = outfName + outSName;
        txfNoVowels.setText(output);
    }//GEN-LAST:event_btnRemoveVowelsActionPerformed

    private void btnValidateSelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidateSelectionActionPerformed
        btnRemoveVowelsActionPerformed(evt);
        int numberLetters = (int) spnChars.getValue();
        int numberDigits = (int) spnDigits.getValue();
        int noVowelStringLength = txfNoVowels.getText().trim().length();
        if ((numberLetters <= noVowelStringLength) && ((numberLetters + numberDigits) <= 7)) {
            btnGeneratePlate.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "Test Failed.");
            btnGeneratePlate.setEnabled(false);
        }

    }//GEN-LAST:event_btnValidateSelectionActionPerformed

    private void btnGeneratePlateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeneratePlateActionPerformed
        String noVowel = txfNoVowels.getText();
        int numberLetters = (int) spnChars.getValue();
        int numberDigits = (int) spnDigits.getValue();
        String output = noVowel.substring(0, (numberLetters)) + " ";

        Random randomizer = new Random();
        for (int i = 0; i < numberDigits; i++) {
            output += randomizer.nextInt((9) + 1) + 0;
        }

        output += " WP";
        txfNumberPlate.setText(output);

    }//GEN-LAST:event_btnGeneratePlateActionPerformed

    private void btnCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCostActionPerformed
        double registrationFee = 69.00;
        double plateCost = 0.00;
        int sumCharacters = (int) spnChars.getValue() + (int) spnDigits.getValue();
        switch (sumCharacters) {
            case 1:
                plateCost = 10000;
                break;
            case 2:
                plateCost = 6000;
                break;
            case 3:
                plateCost = 4000;
                break;
        }
        if (sumCharacters >= 4 && sumCharacters <= 7) {
            plateCost = 1750.00;
        }
        lblCost.setText(String.format("Cost of number plate: R%.2f", (registrationFee + plateCost)));

    }//GEN-LAST:event_btnCostActionPerformed

    private void rbnFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnFirstNameActionPerformed
        if (rbnFirstName.isSelected()) {
            txfFirstName.setEnabled(true);
            txfSurname.setEnabled(false);
        }
    }//GEN-LAST:event_rbnFirstNameActionPerformed

    private void rbnSurnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnSurnameActionPerformed
        if (rbnSurname.isSelected()) {
            txfSurname.setEnabled(true);
            txfFirstName.setEnabled(false);
        }
    }//GEN-LAST:event_rbnSurnameActionPerformed

    private void rbnBothActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnBothActionPerformed
        if (rbnBoth.isSelected()) {
            txfFirstName.setEnabled(true);
            txfSurname.setEnabled(true);
        }
    }//GEN-LAST:event_rbnBothActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
    // What's the point of resetting this?
    }//GEN-LAST:event_btnResetActionPerformed

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
    private javax.swing.ButtonGroup bngNames;
    private javax.swing.JButton btnCost;
    private javax.swing.JButton btnGeneratePlate;
    private javax.swing.JButton btnRemoveVowels;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnValidateSelection;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblBanner;
    private javax.swing.JLabel lblCost;
    private javax.swing.JRadioButton rbnBoth;
    private javax.swing.JRadioButton rbnFirstName;
    private javax.swing.JRadioButton rbnSurname;
    private javax.swing.JSpinner spnChars;
    private javax.swing.JSpinner spnDigits;
    private javax.swing.JTextField txfFirstName;
    private javax.swing.JTextField txfNoVowels;
    private javax.swing.JTextField txfNumberPlate;
    private javax.swing.JTextField txfSurname;
    // End of variables declaration//GEN-END:variables
}
