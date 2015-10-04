/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package speedingfineapp;

/**
 *
 * @author Examiner
 */
public class Statistics extends javax.swing.JFrame {

    SpeedingFineAppMain sfAppMain;
    String[] headings = {"Town", "January", "February", "March", "Totals"};
    String[] towns = {"Cape Town", "Stellenbosch", "Worcester", "George", "Malmesbury", "Caledon"};
    int[][] stats = {{456726, 398273, 547920},
    {245108, 550147, 412339},
    {123456, 158746, 200145},
    {223541, 195236, 85234},
    {134598, 175206, 224451},
    {34567, 12354, 67234}};
    int[] totals = new int[stats.length];

    /**
     * Creates new form Statistics
     */
    public Statistics(SpeedingFineAppMain sfam) {
        initComponents();
        sfAppMain = sfam;
    }

    public Statistics() {
        initComponents();
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
        btnBack = new javax.swing.JButton();
        btnDisplay = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaOutput = new javax.swing.JTextArea();
        btnTotals = new javax.swing.JButton();
        btnAddAprilFigures = new javax.swing.JButton();
        btnHighest = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Traffic Department");

        pnlHeading.setBackground(new java.awt.Color(0, 51, 255));
        pnlHeading.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Traffic Fine Statistics");

        javax.swing.GroupLayout pnlHeadingLayout = new javax.swing.GroupLayout(pnlHeading);
        pnlHeading.setLayout(pnlHeadingLayout);
        pnlHeadingLayout.setHorizontalGroup(
            pnlHeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeadingLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlHeadingLayout.setVerticalGroup(
            pnlHeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeadingLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnDisplay.setText("Display");
        btnDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayActionPerformed(evt);
            }
        });

        txaOutput.setColumns(20);
        txaOutput.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txaOutput.setRows(5);
        jScrollPane1.setViewportView(txaOutput);

        btnTotals.setText("Totals");
        btnTotals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalsActionPerformed(evt);
            }
        });

        btnAddAprilFigures.setText("Add April");
        btnAddAprilFigures.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAprilFiguresActionPerformed(evt);
            }
        });

        btnHighest.setText("Highest");
        btnHighest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHighestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHeading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addComponent(btnDisplay)
                    .addComponent(btnTotals)
                    .addComponent(btnAddAprilFigures)
                    .addComponent(btnHighest))
                .addGap(60, 60, 60)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addComponent(pnlHeading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addComponent(btnDisplay)
                        .addGap(34, 34, 34)
                        .addComponent(btnTotals)
                        .addGap(39, 39, 39)
                        .addComponent(btnHighest)
                        .addGap(37, 37, 37)
                        .addComponent(btnAddAprilFigures)
                        .addGap(42, 42, 42)
                        .addComponent(btnBack))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        sfAppMain.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayActionPerformed
        String heading = String.format("%-15s%-15s%-15s%-15s%-20s\n------------------------------------------"
                + "--------------------------\n\n", headings[0], headings[1], headings[2], headings[3], headings[4]);
        txaOutput.setText(heading);
        for (int i = 0; i < towns.length; i++) {
            String output = String.format("%-15s%-15s%-15s%-15s%-20s\n", towns[i], stats[i][0], stats[i][1], stats[i][2], totals[i]);
            txaOutput.append(output);
        }
    }//GEN-LAST:event_btnDisplayActionPerformed

    private void btnTotalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalsActionPerformed
        for (int i = 0; i < stats.length; i++) {
            totals[i] = stats[i][0] + stats[i][1] + stats[i][2];
        }
        btnDisplayActionPerformed(evt);
    }//GEN-LAST:event_btnTotalsActionPerformed

    private void btnAddAprilFiguresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAprilFiguresActionPerformed
        headings = new String[]{"Town", "February", "March", "April", "Totals"};
        stats = new int[][]{{398273, 547920, 562873},
        {550147, 412339, 342126},
        {158746, 200145, 23419},
        {195236, 85234, 156321},
        {175206, 224451, 243111},
        {12354, 67234, 101345}};
        btnHighestActionPerformed(evt); 
    }//GEN-LAST:event_btnAddAprilFiguresActionPerformed

    private void btnHighestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHighestActionPerformed
        int highest = 0;
        int counter = 0;
        int month = 0;
        for (int i = 0; i < stats.length; i++) {
            for (int j = 0; j < 3; j++) {
                if (stats[i][j] > highest) {
                    highest = stats[i][j];
                    counter = i;
                    month = j;
                }
            }
        }
        String output = String.format("\n\nThe highest month is R %d recorded in %s for %s", highest, towns[counter], headings[month+1]);
        btnTotalsActionPerformed(evt);
        txaOutput.append(output);
    }//GEN-LAST:event_btnHighestActionPerformed
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
            java.util.logging.Logger.getLogger(Statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Statistics().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddAprilFigures;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDisplay;
    private javax.swing.JButton btnHighest;
    private javax.swing.JButton btnTotals;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlHeading;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JTextArea txaOutput;
    // End of variables declaration//GEN-END:variables
}
