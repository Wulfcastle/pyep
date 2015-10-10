  //Enter your name and surname here -->
package question2package;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Question2 extends javax.swing.JFrame {

    String[] salespersons = {"Carl", "Jenny", "Ian", "Gerda", "Mariam", "Ighsaan", "Vani", "Rani", "Lindiwe", "Thabo"};
    int[] newSalesNumbers = new int[salespersons.length];

    public Question2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txaSalesTotals = new javax.swing.JTextArea();
        btnSales = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaNewCarSalesTeam = new javax.swing.JTextArea();
        btnNewCarSalesTeam = new javax.swing.JButton();
        cmbMake = new javax.swing.JComboBox();
        lblBanner = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Car Sales Statistics");

        txaSalesTotals.setColumns(20);
        txaSalesTotals.setFont(new java.awt.Font("Courier New", 0, 13)); // NOI18N
        txaSalesTotals.setRows(5);
        jScrollPane1.setViewportView(txaSalesTotals);

        btnSales.setText("Sales Totals per Person");
        btnSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalesActionPerformed(evt);
            }
        });

        txaNewCarSalesTeam.setColumns(20);
        txaNewCarSalesTeam.setRows(5);
        jScrollPane2.setViewportView(txaNewCarSalesTeam);

        btnNewCarSalesTeam.setText("New Car Sales Team");
        btnNewCarSalesTeam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewCarSalesTeamActionPerformed(evt);
            }
        });

        cmbMake.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Toyota", "Volkswagen", "Kia", "Hyundai", "Renault", "Mazda", "Suzuki" }));
        cmbMake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMakeActionPerformed(evt);
            }
        });

        lblBanner.setBackground(new java.awt.Color(0, 0, 0));
        lblBanner.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblBanner.setForeground(new java.awt.Color(255, 255, 255));
        lblBanner.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/question2package/Lightning-McQueen.png"))); // NOI18N
        lblBanner.setText("                Lightning McQueen Inc.");
        lblBanner.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSales, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbMake, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addComponent(btnNewCarSalesTeam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(lblBanner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblBanner, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSales)
                    .addComponent(cmbMake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNewCarSalesTeam))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalesActionPerformed
        txaSalesTotals.setText(null);
        String manufacturer = cmbMake.getSelectedItem().toString();
        String headings = String.format("%-10s%-15s%-10s%-15s%-10s\n\n", "Name", "Cars Sold", "New Cars", "Used Cars", manufacturer);
        String content = "";
        txaSalesTotals.setText(headings);
        try {
            String output = "";
            Scanner textScanner = new Scanner(new FileReader("CarSales.txt"));
            while (textScanner.hasNext()) {
                content += textScanner.next() + "\n";
            }
            textScanner.close();
            String[] lines = content.split("\n");

            int i = 0;
            for (String salesperson : salespersons) {
                Salesperson person = new Salesperson(salesperson, manufacturer);

                for (String line : lines) {
                    String[] details = line.split(",");
                    String personName = details[0];
                    String carManufacturer = details[1];
                    int year = Integer.parseInt(details[2]);
                    if (personName.equals(salesperson)) {
                        person.updateLog(carManufacturer);
                        if (year == 2015) {
                            person.incrementNewCarTotal();
                        } else {
                            person.incrementUsedCarTotal();
                        }
                    }
                }
                newSalesNumbers[i] = person.gerNewCarsSold();
                output += String.format("%s", person.toString());
                i++;
            }

            txaSalesTotals.append(String.format("\n%s", output));

        } catch (FileNotFoundException ex) {
            System.exit(0);
        }

    }//GEN-LAST:event_btnSalesActionPerformed

    private void btnNewCarSalesTeamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewCarSalesTeamActionPerformed
        txaNewCarSalesTeam.setText(null);
        for (int j = salespersons.length - 1; j > 0; j--) {
            int highest = 0;
            int index = 0;
            for (int i = 0; i < j; i++) {
                if (newSalesNumbers[i] > highest) {
                    highest = newSalesNumbers[i];
                    index = i;
                }
            }
            // Swapping [j] and [index] in both arrays.
            String tempPerson = "";
            int tempSales = 0;
            tempPerson = salespersons[j];
            tempSales = newSalesNumbers[j];
            salespersons[j] = salespersons[index];
            newSalesNumbers[j] = newSalesNumbers[index];
            salespersons[index] = tempPerson;
            newSalesNumbers[index] = tempSales;
        }
        for (int i = salespersons.length - 1; i > (salespersons.length - 1 - 4); i--) {
            txaNewCarSalesTeam.append(String.format("%s\n", salespersons[i]));
        }
    }//GEN-LAST:event_btnNewCarSalesTeamActionPerformed

    private void cmbMakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMakeActionPerformed
        btnSalesActionPerformed(evt); 
    }//GEN-LAST:event_cmbMakeActionPerformed

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
            java.util.logging.Logger.getLogger(Question2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Question2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Question2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Question2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Question2().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNewCarSalesTeam;
    private javax.swing.JButton btnSales;
    private javax.swing.JComboBox cmbMake;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBanner;
    private javax.swing.JTextArea txaNewCarSalesTeam;
    private javax.swing.JTextArea txaSalesTotals;
    // End of variables declaration//GEN-END:variables
}
