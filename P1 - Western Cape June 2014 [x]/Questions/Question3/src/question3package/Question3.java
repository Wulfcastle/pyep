//Enter your name and surname here
package question3package;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Question3 extends javax.swing.JFrame {

    String[] vinArr = {"JS2YA5A14A6300312", "1NXBE4EE7AZ268073", "WVWED7AJ1BW244234",
        "3VW1K7AJ0BM029591", "JM1BL1K32B1424046", "5NPDH4AE0CH067880",
        "KM8JT3AB3CU424963", "19XFB2E51CE003005", "WBA3A5C50DF356544",
        "3G1TA5AF6DL103001", "1FADP3E20EL368800", "1HGCR2E30EA029743",
        "KNDPB3AC0E7558044", "2T3BFREV0FW241058", "1VWAS7A38FC028049"};

    public Question3() {
        initComponents();
    }

    public int getNumericalValue(char vin) {
        int numericalValue = 0;
        switch (vin) {
            case 'A':
            case 'J':
                numericalValue = 1;
                break;
            case 'B':
            case 'K':
            case 'S':
                numericalValue = 2;
                break;
            case 'C':
            case 'L':
            case 'T':
                numericalValue = 3;
                break;
            case 'D':
            case 'M':
            case 'U':
                numericalValue = 4;
                break;
            case 'E':
            case 'N':
            case 'V':
                numericalValue = 5;
                break;
            case 'F':
            case 'W':
                numericalValue = 6;
                break;
            case 'G':
            case 'P':
            case 'X':
                numericalValue = 7;
            case 'H':
            case 'Y':
                numericalValue = 8;
            case 'R':
            case 'Z':
                numericalValue = 9;

        }
        return numericalValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBanner = new javax.swing.JLabel();
        btnCars1to2Years = new javax.swing.JButton();
        txfNumberOfCars = new javax.swing.JTextField();
        btnValidateVIN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaVinOK = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VIN app");

        lblBanner.setBackground(new java.awt.Color(0, 0, 0));
        lblBanner.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblBanner.setForeground(new java.awt.Color(255, 255, 255));
        lblBanner.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/question3package/Lightning-McQueen.png"))); // NOI18N
        lblBanner.setText(" Lighting McQueen Inc.");
        lblBanner.setOpaque(true);

        btnCars1to2Years.setText("Number of 1 and 2 year old cars");
        btnCars1to2Years.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCars1to2YearsActionPerformed(evt);
            }
        });

        txfNumberOfCars.setEditable(false);
        txfNumberOfCars.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txfNumberOfCars.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnValidateVIN.setText("Validate VIN");
        btnValidateVIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidateVINActionPerformed(evt);
            }
        });

        txaVinOK.setColumns(20);
        txaVinOK.setFont(new java.awt.Font("Courier New", 0, 13)); // NOI18N
        txaVinOK.setRows(5);
        txaVinOK.setBorder(javax.swing.BorderFactory.createTitledBorder("Valid VIN numbers"));
        jScrollPane1.setViewportView(txaVinOK);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblBanner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnValidateVIN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCars1to2Years, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfNumberOfCars, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBanner)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCars1to2Years)
                    .addComponent(txfNumberOfCars, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnValidateVIN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCars1to2YearsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCars1to2YearsActionPerformed
        int numberTwoYearOldCars = 0;
        for (String vin : vinArr) {
            if (vin.charAt(9) == 'D' || vin.charAt(9) == 'E') {
                numberTwoYearOldCars++;
            }
        }
        txfNumberOfCars.setText(numberTwoYearOldCars + "");
    }//GEN-LAST:event_btnCars1to2YearsActionPerformed

    @SuppressWarnings({"null", "ConstantConditions"})
    private void btnValidateVINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidateVINActionPerformed
        int[] weighting = {8, 7, 6, 5, 4, 3, 1, 10, 0, 9, 8, 7, 6, 5, 4, 3, 2};
        String incorrectVINS = "";
        for (String vin : vinArr) {
            if (vin.contains("I") || vin.contains("O") || vin.contains("Q")) {
                incorrectVINS += vin + "\r\n";
            } else if (vin.charAt(9) == 'U' || vin.charAt(9) == 'Z' || vin.charAt(9) == '0') {
                incorrectVINS += vin + "\r\n";
            } else {
                String convertedVIN = "";
                int checkDigit = Integer.parseInt(vin.charAt(8) + "");
                for (int i = 0; i < vin.length(); i++) {
                    if (Character.isLetter(vin.charAt(i)) == true) {
                        // Letter
                        convertedVIN += this.getNumericalValue(vin.charAt(i));
                    } else {
                        // Integer
                        convertedVIN += vin.charAt(i);
                    }
                }
                int sum = 0;
                for (int i = 0; i < convertedVIN.length(); i++) {
                    int product = Integer.parseInt(convertedVIN.charAt(i) + "") * weighting[i];
                    sum += product;
                }
                int remainder = sum % 11;
                if (checkDigit == remainder) {
                    txaVinOK.append(vin);
                } else {
                    incorrectVINS += vin + "\r\n";
                }
            }
        }
        try {
            FileWriter writer = new FileWriter(new File("Cars.txt"));
            writer.write(incorrectVINS);
            writer.flush();
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(Question3.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnValidateVINActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Question3.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Question3.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Question3.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Question3.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Question3().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCars1to2Years;
    private javax.swing.JButton btnValidateVIN;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBanner;
    private javax.swing.JTextArea txaVinOK;
    private javax.swing.JTextField txfNumberOfCars;
    // End of variables declaration//GEN-END:variables
}
