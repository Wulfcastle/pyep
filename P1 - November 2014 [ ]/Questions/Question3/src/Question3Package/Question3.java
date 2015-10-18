//Enter your examination number here.
package Question3Package;

import javax.swing.JOptionPane;

public class Question3 extends javax.swing.JFrame {

    String[] fragileShelf = new String[20];
    String[] nonFragileShelf = new String[30];

    public Question3() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setVisible(true);
        rbtFragile.setSelected(true);
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaOutput = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        btnLoad = new javax.swing.JButton();
        btnStatus = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        rbtFragile = new javax.swing.JRadioButton();
        rbtNFragile = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        txfLoadingCode = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txaOutput.setColumns(20);
        txaOutput.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        txaOutput.setLineWrap(true);
        txaOutput.setRows(5);
        txaOutput.setText("Loading progress display area:\n==============================\n\nFragile items:\nNon-fragile items:");
        txaOutput.setBorder(new javax.swing.border.MatteBorder(null));
        txaOutput.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(txaOutput);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Loading zone", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        btnLoad.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnLoad.setText("Load  item");
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });

        btnStatus.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnStatus.setText("Check load status");
        btnStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatusActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtFragile);
        rbtFragile.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rbtFragile.setText("Fragile");
        rbtFragile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtFragileActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtNFragile);
        rbtNFragile.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rbtNFragile.setText("Non-fragile");
        rbtNFragile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtNFragileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtFragile)
                    .addComponent(rbtNFragile, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtFragile)
                .addGap(7, 7, 7)
                .addComponent(rbtNFragile)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Loading Code");

        txfLoadingCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnClear.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnClear.setText("Clear load");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txfLoadingCode)
                    .addComponent(btnLoad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 10, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txfLoadingCode, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed
        //Question 3.1
        // Max fragile = 20
        // ax non-fragile = 30

        String loadingCode = txfLoadingCode.getText();
        if (!"".equals(loadingCode)) {
            if (rbtFragile.isSelected()) {
                if (this.getAvailableSpace(fragileShelf) > 0) {
                    fragileShelf[getFirstEmptyIndex(fragileShelf)] = loadingCode;
                    this.updateDisplay();
                    txfLoadingCode.setText(String.format("F%d", getFirstEmptyIndex(fragileShelf) + 1));
                } else {
                    JOptionPane.showMessageDialog(null, "Loading of item cannot be processed - No loading space.");
                }
            } else if (rbtNFragile.isSelected()) {
                if (this.getAvailableSpace(nonFragileShelf) > 0) {
                    nonFragileShelf[getFirstEmptyIndex(nonFragileShelf)] = loadingCode;
                    this.updateDisplay();
                    txfLoadingCode.setText(String.format("NF%d", getFirstEmptyIndex(nonFragileShelf) + 1));
                } else {
                    JOptionPane.showMessageDialog(null, "Loading of item cannot be processed - No loading space.");

                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "You haven't selected anything yet.");
        }
    }//GEN-LAST:event_btnLoadActionPerformed

    private void btnStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatusActionPerformed
        //Question 3.2
        int fragileItems = getFirstEmptyIndex(fragileShelf);
        int nonFragileItems = getFirstEmptyIndex(nonFragileShelf);
        double percentageFragile = ((double) fragileItems / 20) * 100;
        double percentageNonFragile = ((double) nonFragileItems / 30) * 100;
        if (percentageFragile >= 50 && percentageNonFragile >= 50) {

            String output = String.format("Load Status Report:\n"
                    + "=======================\n\n"
                    + "%-20s%-20s%-15s\n"
                    + "%-20s%-20d%-15.2f\n"
                    + "%-20s%-20d%-15.2f\n\n"
                    + "The delivery may progress.\n",
                    "Item Type", "Number of Items", "Percentage Loaded", "Fragile", fragileItems, percentageFragile, "Non-Fragile"
                    , nonFragileItems, percentageNonFragile);
            txaOutput.setText(output);
        } else {
            int numberFragileRequired = (int) (((50 - percentageFragile) / 100) * 20);
            int numberNonFragileRequired = (int) (((50 - percentageNonFragile) / 100) * 30);
            String output = String.format("Load Status Report:\n"
                    + "=======================\n\n"
                    + "%-20s%-20s%-15s\n"
                    + "%-20s%-20d%-15.2f\n"
                    + "%-20s%-20d%-15.2f\n\n"
                    + "The delivery may not progress.\n"
                    + "Number of fragile items still required: %d\n"
                    + "Number of non-fragile items still required: %d\n",
                    "Item Type", "Number of Items", "Percentage Loaded", "Fragile", fragileItems, percentageFragile,
             "Non-Fragile", nonFragileItems, percentageNonFragile, numberFragileRequired, numberNonFragileRequired);
            txaOutput.setText(output);
        }
    }//GEN-LAST:event_btnStatusActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        //Question 3.3
        fragileShelf = null;
        nonFragileShelf = null;
        txaOutput.setText(null);        
    }//GEN-LAST:event_btnClearActionPerformed

    private void rbtFragileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtFragileActionPerformed
        txfLoadingCode.setText(String.format("F%d", getFirstEmptyIndex(fragileShelf) + 1));
    }//GEN-LAST:event_rbtFragileActionPerformed

    private void rbtNFragileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtNFragileActionPerformed
        txfLoadingCode.setText(String.format("NF%d", getFirstEmptyIndex(nonFragileShelf) + 1));
    }//GEN-LAST:event_rbtNFragileActionPerformed

    public int getAvailableSpace(String[] arrString) {
        int availableSpace = (arrString.length) - getFirstEmptyIndex(arrString);
        return availableSpace;
    }

    public int getFirstEmptyIndex(String[] arrString) {
        int counter = 0;
        try {
            while (arrString[counter] != null) {
                counter++;
            }
            return counter;
        } catch (ArrayIndexOutOfBoundsException e) {
            return arrString.length;
        }
    }

    public void updateDisplay() {
        String heading = String.format("%s\n%s", "Loading progress display area", "================================");
        String fragileItems = "Fragile Items: ";
        int itemsStored = getFirstEmptyIndex(fragileShelf);
        int i = 0;
        while (i < itemsStored) {
            fragileItems += String.format("%-1s", "*");
            i++;
        }

        String nonFragileItems = "Non-Fragile Items: ";
        itemsStored = getFirstEmptyIndex(nonFragileShelf);
        int j = 0;
        while (j < itemsStored) {
            nonFragileItems += String.format("%-1s", "*");
            j++;
        }
        txaOutput.setText(String.format("%s\n\n%s\n%s\n", heading, fragileItems, nonFragileItems));
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://downarrShelfHeadingsLoad.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Question3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Question3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Question3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Question3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnLoad;
    private javax.swing.JButton btnStatus;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbtFragile;
    private javax.swing.JRadioButton rbtNFragile;
    private javax.swing.JTextArea txaOutput;
    private javax.swing.JTextField txfLoadingCode;
    // End of variables declaration//GEN-END:variables
}
