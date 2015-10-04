/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package speedingfineapp;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JLabel;

/**
 *
 * @author Examiner
 */
public class MultipleFines extends javax.swing.JFrame {

    SpeedingFineAppMain sfAppMain;
    int max = 76;
    String[] arrRegNums = new String[max];
    double[] arrFines = new double[max];

    /**
     * Creates new form MultipleFines
     */
    public MultipleFines() {
        initComponents();
    }

    public MultipleFines(SpeedingFineAppMain sfam) {
        initComponents();
        sfAppMain = sfam;
        arrRegNums[0] = "CA 123 456";
        arrFines[0] = 300.0;
        arrRegNums[1] = "CAW 234 567";
        arrFines[1] = 100.0;
        arrRegNums[2] = "VFS 087-FS";
        arrFines[2] = 700.0;
        arrRegNums[3] = "CF 456 234";
        arrFines[3] = 100.0;
        arrRegNums[4] = "CY 87645";
        arrFines[4] = 100.0;
        arrRegNums[5] = "CY 789 655";
        arrFines[5] = 700.0;
        arrRegNums[6] = "BB 45 CC-GP";
        arrFines[6] = 300.0;
        arrRegNums[7] = "CJ 89654";
        arrFines[7] = 100.0;
        arrRegNums[8] = "CL 34801";
        arrFines[8] = 300.0;
        arrRegNums[9] = "CEM 4478";
        arrFines[9] = 100.0;
        arrRegNums[10] = "I AM A ROADHOG-WP";
        arrFines[10] = 3100.0;
        arrRegNums[11] = "CBS 6654";
        arrFines[11] = 100.0;
        arrRegNums[12] = "MR RUDE-WP";
        arrFines[12] = 100.0;
        arrRegNums[13] = "CBY 9987";
        arrFines[13] = 300.0;
        arrRegNums[14] = "CCC 345";
        arrFines[14] = 300.0;
        arrRegNums[15] = "ND 453 672";
        arrFines[15] = 300.0;
        arrRegNums[16] = "CCD 765";
        arrFines[16] = 3100.0;
        arrRegNums[17] = "MRS P-ZN";
        arrFines[17] = 700.0;
        arrRegNums[18] = "CEO 7782";
        arrFines[18] = 300.0;
        arrRegNums[19] = "SPAZA-WP";
        arrFines[19] = 100.0;
        arrRegNums[20] = "CEY 4532";
        arrFines[20] = 300.0;
        arrRegNums[21] = "CFG 55621";
        arrFines[21] = 1300.0;
        arrRegNums[22] = "CY 87645";
        arrFines[22] = 100.0;
        arrRegNums[23] = "CFM 287 674";
        arrFines[23] = 300.0;
        arrRegNums[24] = "CK 123 845";
        arrFines[24] = 1300.0;
        arrRegNums[25] = "CN 5520";
        arrFines[25] = 100.0;
        arrRegNums[26] = "MFD 045-LP";
        arrFines[26] = 700.0;
        arrRegNums[27] = "CS 8345";
        arrFines[27] = 100.0;
        arrRegNums[28] = "CX 2398";
        arrFines[28] = 300.0;
        arrRegNums[29] = "ND 453 672";
        arrFines[29] = 1300.0;
        arrRegNums[30] = "NPN 675 342";
        arrFines[30] = 300.0;
        arrRegNums[31] = "NP 530 908";
        arrFines[31] = 700.0;
        arrRegNums[32] = "FRG 768-MP";
        arrFines[32] = 100.0;
        arrRegNums[33] = "JIMMY F-WP";
        arrFines[33] = 1300.0;
        arrRegNums[34] = "CY 2345";
        arrFines[34] = 300.0;
        arrRegNums[35] = "CEM 44667";
        arrFines[35] = 100.0;
        arrRegNums[36] = "RET 321-EC";
        arrFines[36] = 700.0;
        arrRegNums[37] = "CA 3456";
        arrFines[37] = 100.0;
        arrRegNums[38] = "XYZ 333-GP";
        arrFines[38] = 700.0;
        arrRegNums[39] = "GR8 MOM-WP";
        arrFines[39] = 100.0;
        arrRegNums[40] = "KYK VIR MY-WP";
        arrFines[40] = 700.0;
        arrRegNums[41] = "CFM 37565";
        arrFines[41] = 700.0;
        arrRegNums[42] = "I AM A ROADHOG-WP";
        arrFines[42] = 700.0;
        arrRegNums[43] = "FFF 555-FS";
        arrFines[43] = 100.0;
        arrRegNums[44] = "AMANDA-WP";
        arrFines[44] = 300.0;
        arrRegNums[45] = "CG 45312";
        arrFines[45] = 300.0;
        arrRegNums[46] = "I AM A ROADHOG-WP";
        arrFines[46] = 100.0;
        arrRegNums[47] = "CF 765 429";
        arrFines[47] = 300.0;
        arrRegNums[48] = "CW 5674";
        arrFines[48] = 100.0;
        arrRegNums[49] = "I AM A ROADHOG-WP";
        arrFines[49] = 1300.0;
        arrRegNums[50] = "CX 66543";
        arrFines[50] = 100.0;
        arrRegNums[51] = "WP BO-WP";
        arrFines[51] = 300.0;
        arrRegNums[52] = "ABDULLAH-WP";
        arrFines[52] = 300.0;
        arrRegNums[53] = "CY 987 654";
        arrFines[53] = 100.0;
        arrRegNums[54] = "CY 87645";
        arrFines[54] = 300.0;
        arrRegNums[55] = "BIG SHOT-WP";
        arrFines[55] = 100.0;
        arrRegNums[56] = "BJ 56 HH-GP";
        arrFines[56] = 1300.0;
        arrRegNums[57] = "BILTONG BOER-FS";
        arrFines[57] = 300.0;
        arrRegNums[58] = "CT 453";
        arrFines[58] = 100.0;
        arrRegNums[59] = "CEY 456";
        arrFines[59] = 100.0;
        arrRegNums[60] = "SWEET HOME-WP";
        arrFines[60] = 300.0;
        arrRegNums[61] = "CF 56490";
        arrFines[61] = 300.0;
        arrRegNums[62] = "CY 567 296";
        arrFines[62] = 1300.0;
        arrRegNums[63] = "CG 998";
        arrFines[63] = 300.0;
        arrRegNums[64] = "JAMES 007-WP";
        arrFines[64] = 300.0;
        arrRegNums[65] = "DELIVER 05-WP";
        arrFines[65] = 100.0;
        arrRegNums[66] = "JOHANNA V-WP";
        arrFines[66] = 300.0;
        arrRegNums[67] = "CFM 56745";
        arrFines[67] = 100.0;
        arrRegNums[68] = "CY 87645";
        arrFines[68] = 300.0;
        arrRegNums[69] = "NJY 567-EC";
        arrFines[69] = 100.0;
        arrRegNums[70] = "MY TAXI-WP";
        arrFines[70] = 300.0;
        arrRegNums[71] = "JABULANI-WP";
        arrFines[71] = 100.0;
        arrRegNums[72] = "CEM 6784";
        arrFines[72] = 300.0;
        arrRegNums[73] = "FREDDY F-GP";
        arrFines[73] = 700.0;
        arrRegNums[74] = "CA 409 605";
        arrFines[74] = 100.0;
        arrRegNums[75] = "SIBONGILE-WP";
        arrFines[75] = 100.0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMain = new javax.swing.JPanel();
        pnlHeading = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnProcess = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaOutput = new javax.swing.JTextArea();
        btnBack = new javax.swing.JButton();
        btnBirthday = new javax.swing.JButton();
        pnlBirthdayMessage = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Traffic Department");

        pnlHeading.setBackground(new java.awt.Color(0, 51, 255));
        pnlHeading.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Multiple Fines");

        javax.swing.GroupLayout pnlHeadingLayout = new javax.swing.GroupLayout(pnlHeading);
        pnlHeading.setLayout(pnlHeadingLayout);
        pnlHeadingLayout.setHorizontalGroup(
            pnlHeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeadingLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlHeadingLayout.setVerticalGroup(
            pnlHeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeadingLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        btnProcess.setText("Process");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        txaOutput.setColumns(20);
        txaOutput.setFont(new java.awt.Font("Courier New", 0, 10)); // NOI18N
        txaOutput.setRows(5);
        jScrollPane1.setViewportView(txaOutput);

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnBirthday.setText("Birthday");
        btnBirthday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBirthdayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBirthdayMessageLayout = new javax.swing.GroupLayout(pnlBirthdayMessage);
        pnlBirthdayMessage.setLayout(pnlBirthdayMessageLayout);
        pnlBirthdayMessageLayout.setHorizontalGroup(
            pnlBirthdayMessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 511, Short.MAX_VALUE)
        );
        pnlBirthdayMessageLayout.setVerticalGroup(
            pnlBirthdayMessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 111, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHeading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnProcess)
                    .addComponent(btnBack)
                    .addComponent(btnBirthday))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlBirthdayMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addComponent(pnlHeading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addComponent(btnProcess)
                        .addGap(32, 32, 32)
                        .addComponent(btnBirthday)
                        .addGap(39, 39, 39)
                        .addComponent(btnBack))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(pnlBirthdayMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        sfAppMain.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        txaOutput.setText("Offenders with multiple fines\n________________________________\n\n");
        ArrayList<String> regNumbers = new ArrayList<String>();
        for (String car : arrRegNums) {
            if (regNumbers.contains(car) == false) {
                regNumbers.add(car);
            }
        }
        String[][] arrCarFines = new String[regNumbers.size()][3];
        for (int i = 0; i < arrCarFines.length; i++) {
            arrCarFines[i][0] = regNumbers.get(i);
            arrCarFines[i][1] = "0";
            arrCarFines[i][2] = "0";
        }
        for (String[] carFine : arrCarFines) {
            String regNumber = carFine[0];
            int numberFines = Integer.parseInt(carFine[1]);
            double totalOwing = Double.parseDouble(carFine[2]);
            for (int i = 0; i < arrRegNums.length; i++) {
                if (arrRegNums[i].equals(regNumber)) {
                    numberFines++;
                    totalOwing += arrFines[i];
                }
            }
            carFine[1] = numberFines + "";
            carFine[2] = totalOwing + "";
            if (Integer.parseInt(carFine[1]) > 1) {
                txaOutput.append(String.format("%20s %-20s : R%.2f\n", String.format("%s had %d fines", carFine[0], Integer.parseInt(carFine[1])), "Total Owing", Double.parseDouble(carFine[2])));
            }
        }

    }//GEN-LAST:event_btnProcessActionPerformed

    private void btnBirthdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBirthdayActionPerformed
        ArrayList<String> regNumbers = new ArrayList<String>();
        for (String car : arrRegNums) {
            if (regNumbers.contains(car) == false) {
                regNumbers.add(car);
            }
        }
        boolean found = false;
        ArrayList<String> multipleOffendersArray = new ArrayList<String>();
        for (int i=0; i < regNumbers.size(); i++) {
            int counter = 0;
            for (String regNumber : arrRegNums) {
                if (regNumbers.get(i).equals(regNumber)) {
                    counter++;
                }
            }
            if (counter > 1) {
                multipleOffendersArray.add(regNumbers.get(i));
            }
        }
        Random randomizer = new Random();
        while (found == false) {
            int randomNumber = randomizer.nextInt((arrRegNums.length-1));
            boolean multiOffender = false;
            if (multipleOffendersArray.contains(arrRegNums[randomNumber])) {
                multiOffender = true;
            }
            double amountOwing = arrFines[randomNumber];
            if (multiOffender == false && amountOwing == 100.00) {
                found = true;
                JLabel lblMessage = new JLabel();
                lblMessage.setText(String.format("Happy Birthday Chief! %s will not have to pay his fine.", arrRegNums[randomNumber]));
                lblMessage.setBackground(Color.red);
                lblMessage.setForeground(Color.white); 
                pnlBirthdayMessage.add(lblMessage);
                pnlBirthdayMessage.setBackground(Color.red);
                lblMessage.setBounds(30, 20, 500, 30);
                pnlBirthdayMessage.validate();
                break;
            }            
        }

    }//GEN-LAST:event_btnBirthdayActionPerformed
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
            java.util.logging.Logger.getLogger(MultipleFines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MultipleFines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MultipleFines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MultipleFines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MultipleFines().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBirthday;
    private javax.swing.JButton btnProcess;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlBirthdayMessage;
    private javax.swing.JPanel pnlHeading;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JTextArea txaOutput;
    // End of variables declaration//GEN-END:variables
}
