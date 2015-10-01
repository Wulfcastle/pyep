/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package speedingfineapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Examiner
 */
public class ProcessingFines extends javax.swing.JFrame {

    private int counterFinesOtherProvinces = 0;
    private double totalFinesOtherProvinces = 0.00;
    SpeedingFineAppMain sfAppMain;

    /**
     * Creates new form ProcessingFines
     */
    public ProcessingFines() {
        initComponents();
    }

    public ProcessingFines(SpeedingFineAppMain sfam) {
        initComponents();
        sfAppMain = sfam;
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
        lblHeading = new javax.swing.JLabel();
        btnProcessFines = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaOutput = new javax.swing.JTextArea();
        btnFinesFromOtherProvinces = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Traffic Department");

        pnlHeading.setBackground(new java.awt.Color(0, 51, 255));

        lblHeading.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblHeading.setForeground(new java.awt.Color(255, 255, 255));
        lblHeading.setText("Fines Report");

        javax.swing.GroupLayout pnlHeadingLayout = new javax.swing.GroupLayout(pnlHeading);
        pnlHeading.setLayout(pnlHeadingLayout);
        pnlHeadingLayout.setHorizontalGroup(
            pnlHeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeadingLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(lblHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(288, Short.MAX_VALUE))
        );
        pnlHeadingLayout.setVerticalGroup(
            pnlHeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHeadingLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(lblHeading)
                .addGap(32, 32, 32))
        );

        btnProcessFines.setText("Process fines");
        btnProcessFines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessFinesActionPerformed(evt);
            }
        });

        txaOutput.setColumns(20);
        txaOutput.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txaOutput.setRows(5);
        jScrollPane1.setViewportView(txaOutput);

        btnFinesFromOtherProvinces.setText("Fines other provinces");
        btnFinesFromOtherProvinces.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinesFromOtherProvincesActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnProcessFines)
                    .addComponent(btnFinesFromOtherProvinces)
                    .addComponent(btnBack))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addComponent(pnlHeading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addComponent(pnlHeading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnProcessFines)
                        .addGap(48, 48, 48)
                        .addComponent(btnFinesFromOtherProvinces)
                        .addGap(53, 53, 53)
                        .addComponent(btnBack))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcessFinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessFinesActionPerformed
        String content = "";
        txaOutput.setText(String.format("%-25s%-10s%-10s%-15s\n", "Registration Number", "Type", "Speed", "Fine"));
        try {
            Scanner scanner = new Scanner(new FileReader("SpeedingOffences.txt")).useDelimiter(",\\s*");
            while (scanner.hasNext()) {
                content = scanner.next();
            }
            String[] lines = content.split("\r\n");
            for (String line : lines) {
                String[] data = line.split("#");
                String registrationNumber = data[0];

                int codeLength = data[1].length();
                String code = data[1];
                int speed = Integer.parseInt(data[2]);
                char laneCode = code.charAt(0);
                char areaCode = code.charAt(1);
                char roadCode = ' ';
                if (code.length() == 3) {
                    roadCode = code.charAt(2);
                }
                SpeedingFine fine = new SpeedingFine(registrationNumber, laneCode, areaCode, roadCode, speed);
                txaOutput.append(String.format("%s\n", fine.toString()));
                if (fine.getRegistrationNumber().startsWith("C") || fine.getRegistrationNumber().endsWith("-WP")) {
                    // Do Nothing
                } else {
                    counterFinesOtherProvinces++;
                    totalFinesOtherProvinces += fine.getFine();                    
                }
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnProcessFinesActionPerformed

    private void btnFinesFromOtherProvincesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinesFromOtherProvincesActionPerformed
        txaOutput.setText(String.format("Fines incurred by cars from other provinces\n"
                + "Number = %d\n"
                + "Total Fines = R%.2f\n", counterFinesOtherProvinces, totalFinesOtherProvinces));
    }//GEN-LAST:event_btnFinesFromOtherProvincesActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        sfAppMain.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(ProcessingFines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProcessingFines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProcessingFines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProcessingFines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProcessingFines().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnFinesFromOtherProvinces;
    private javax.swing.JButton btnProcessFines;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JPanel pnlHeading;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JTextArea txaOutput;
    // End of variables declaration//GEN-END:variables
}