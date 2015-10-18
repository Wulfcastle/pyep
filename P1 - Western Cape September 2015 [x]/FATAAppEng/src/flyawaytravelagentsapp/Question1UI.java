// Your name here
package flyawaytravelagentsapp;

import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.JOptionPane;

public class Question1UI extends javax.swing.JFrame {

    FlyAwayTravelAgentsMain fataMain;
    double fees = 0.0;
    DecimalFormat df = new DecimalFormat("R00.00");

    public Question1UI(FlyAwayTravelAgentsMain fata) {
        initComponents();
        fataMain = fata;
    }

    public Question1UI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMain = new javax.swing.JPanel();
        pnlHeader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnl1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txfActivity1 = new javax.swing.JTextField();
        cmbAgent1 = new javax.swing.JComboBox();
        btnActivate1 = new javax.swing.JButton();
        lblOutput1 = new javax.swing.JLabel();
        pnl2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txfNumPeople = new javax.swing.JTextField();
        btnCalculateFees2A = new javax.swing.JButton();
        txfFees = new javax.swing.JTextField();
        chbGroup2 = new javax.swing.JCheckBox();
        btnActivateLucky2C = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaOut2 = new javax.swing.JTextArea();
        pnl3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaOut3 = new javax.swing.JTextArea();
        btnCalculatePoints3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txfDeparture3 = new javax.swing.JTextField();
        txfDestination3 = new javax.swing.JTextField();
        pnl4 = new javax.swing.JPanel();
        btnDraw4 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txaOut4 = new javax.swing.JTextArea();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fly Away Travel Agents");

        pnlMain.setBackground(new java.awt.Color(255, 255, 153));

        pnlHeader.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Flight Bookings");

        javax.swing.GroupLayout pnlHeaderLayout = new javax.swing.GroupLayout(pnlHeader);
        pnlHeader.setLayout(pnlHeaderLayout);
        pnlHeaderLayout.setHorizontalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addGap(379, 379, 379)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlHeaderLayout.setVerticalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pnl1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Question 1.1", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        pnl1.setOpaque(false);

        jLabel2.setText("Activity");

        jLabel3.setText("Agent");

        txfActivity1.setText("Booking");

        cmbAgent1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Jonathan", "Susan", "Sibusiso", "Lance", "Fazeela" }));

        btnActivate1.setText("Display 1.1");
        btnActivate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivate1ActionPerformed(evt);
            }
        });

        lblOutput1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOutput1.setText("<Output label 1>");

        javax.swing.GroupLayout pnl1Layout = new javax.swing.GroupLayout(pnl1);
        pnl1.setLayout(pnl1Layout);
        pnl1Layout.setHorizontalGroup(
            pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(btnActivate1))
                .addGap(36, 36, 36)
                .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfActivity1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbAgent1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOutput1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        pnl1Layout.setVerticalGroup(
            pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txfActivity1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbAgent1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActivate1)
                    .addComponent(lblOutput1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Question 1.2", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        pnl2.setOpaque(false);

        jLabel4.setText("Number of people");

        btnCalculateFees2A.setText("Calculate Fees 1.2a");
        btnCalculateFees2A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateFees2AActionPerformed(evt);
            }
        });

        chbGroup2.setText("Group");

        btnActivateLucky2C.setText("I feel that luck is on my side 1.2b");
        btnActivateLucky2C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivateLucky2CActionPerformed(evt);
            }
        });

        txaOut2.setColumns(20);
        txaOut2.setRows(5);
        jScrollPane1.setViewportView(txaOut2);

        javax.swing.GroupLayout pnl2Layout = new javax.swing.GroupLayout(pnl2);
        pnl2.setLayout(pnl2Layout);
        pnl2Layout.setHorizontalGroup(
            pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl2Layout.createSequentialGroup()
                        .addGroup(pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnActivateLucky2C))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnl2Layout.createSequentialGroup()
                        .addGroup(pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txfNumPeople, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnCalculateFees2A))
                        .addGroup(pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chbGroup2)
                                .addGap(97, 97, 97))
                            .addGroup(pnl2Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(txfFees, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        pnl2Layout.setVerticalGroup(
            pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txfNumPeople, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbGroup2))
                .addGap(25, 25, 25)
                .addGroup(pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalculateFees2A)
                    .addComponent(txfFees, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(btnActivateLucky2C)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pnl3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Question 1.3", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        pnl3.setOpaque(false);

        jLabel5.setText("Destination airport");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Loyalty Point Calculation: Use only official airport codes: CPT, JNB, or DUR");
        jLabel6.setToolTipText("");

        txaOut3.setColumns(20);
        txaOut3.setRows(5);
        jScrollPane2.setViewportView(txaOut3);

        btnCalculatePoints3.setText("Calculate Points Needed 1.3");
        btnCalculatePoints3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculatePoints3ActionPerformed(evt);
            }
        });

        jLabel7.setText("Departure airport");

        txfDeparture3.setToolTipText("Use only official flight codes for airports: JNB, CPT or DUR");

        txfDestination3.setToolTipText("Use only official flight codes for airports: JNB, CPT or DUR");

        javax.swing.GroupLayout pnl3Layout = new javax.swing.GroupLayout(pnl3);
        pnl3.setLayout(pnl3Layout);
        pnl3Layout.setHorizontalGroup(
            pnl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl3Layout.createSequentialGroup()
                        .addComponent(btnCalculatePoints3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnl3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 100, Short.MAX_VALUE))
                    .addGroup(pnl3Layout.createSequentialGroup()
                        .addGroup(pnl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(pnl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txfDeparture3)
                            .addComponent(txfDestination3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))))
        );
        pnl3Layout.setVerticalGroup(
            pnl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(pnl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl3Layout.createSequentialGroup()
                        .addGroup(pnl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txfDeparture3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txfDestination3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnCalculatePoints3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl3Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );

        pnl4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Question 1.4", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        pnl4.setOpaque(false);

        btnDraw4.setText("Draw 1.4");
        btnDraw4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDraw4ActionPerformed(evt);
            }
        });

        txaOut4.setColumns(20);
        txaOut4.setFont(new java.awt.Font("Courier New", 0, 8)); // NOI18N
        txaOut4.setRows(5);
        jScrollPane3.setViewportView(txaOut4);

        javax.swing.GroupLayout pnl4Layout = new javax.swing.GroupLayout(pnl4);
        pnl4.setLayout(pnl4Layout);
        pnl4Layout.setHorizontalGroup(
            pnl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDraw4)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );
        pnl4Layout.setVerticalGroup(
            pnl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDraw4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
        );

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
            .addComponent(pnlHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainLayout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(47, 47, 47)))
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addComponent(pnl4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 23, Short.MAX_VALUE))
                    .addComponent(pnl3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addComponent(pnlHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addComponent(pnl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnBack))
                    .addComponent(pnl4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnActivate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivate1ActionPerformed
        // Q 1.1
        String activity = txfActivity1.getText();
        String agent = cmbAgent1.getSelectedItem().toString();
        lblOutput1.setText(String.format("%s: %s", activity.toUpperCase(), agent));
    }//GEN-LAST:event_btnActivate1ActionPerformed

    private void btnCalculateFees2AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateFees2AActionPerformed
        // Q 1.2 A
        int numberPeople = Integer.parseInt(txfNumPeople.getText());
        if (numberPeople == 1) {
            fees = 100.00;
        } else if (numberPeople == 2) {
            fees = 180.00;
        } else if (numberPeople == 3) {
            fees = 245.00;
        } else {
            // numberPeople > 3
            fees = 245.00 + (50 * (numberPeople - 3));
        }
        if (chbGroup2.isSelected() && fees >= 500) {
            fees = 500;
        }
        txfFees.setText(String.format("R%.2f", fees));
    }//GEN-LAST:event_btnCalculateFees2AActionPerformed

    private void btnActivateLucky2CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivateLucky2CActionPerformed
        // Q 1.2 B
        btnActivateLucky2C.setEnabled(false);
        Random randomizer = new Random();
        double newFees = 0.00;
        String output = "";
        // Generating random number between 0 and a 100
        int randomNumber = randomizer.nextInt((100 - 1) + 1) + 1;
        /* To create the 20% "chance"/probability of an event occuring from a randomly generated number, constraints are added
         to the randomly generated number (which is generated from a known and set range), 
         so that if the number falls within a constrained range of the set from which it was gneretaed in (in this case from 0 - 100)
         (which would match the probability of that event happening, i.e. the constrained range 
         is equal to the proability of that event occuring, given that the number is generated within the known set), that event will occur.
         */

        // This works because there's a 20% probability that the randomly generated number lies within the range
        if (randomNumber > 0 && randomNumber <= 20) {
            // 20% chance of 3% discount
            newFees = fees * (1 - 0.03); // Same as : fees - (fees * 0.03)
            output += String.format("You have been lucky, you received a discount of %.1f%\n"
                    + "Your fees are now R%.2f", 3.0, newFees);
        } else if (randomNumber > 20 && randomNumber <= 40) {
            // 20% chance of 1.5% discunt
            newFees = fees * (1 - 0.015);
            output += String.format("You have been lucky, you received a discount of %.1f%\n"
                    + "Your fees are now R%.2f", 1.5, newFees);
        } else {
            // 60% chance of no discount
            output += String.format("Bad luck, try again next time.\n"
                    + "Your fees are still R%.2f", fees);

        }
        txaOut2.setText(output);

    }//GEN-LAST:event_btnActivateLucky2CActionPerformed

    private void btnCalculatePoints3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculatePoints3ActionPerformed
        String[][] flightInfo = {{"CPT - JNB", "1541"},
        {"CPT - DUR", "1973"},
        {"JNB - DUR", "962"}};
        String departure = txfDeparture3.getText();
        String destination = txfDestination3.getText();
        if (departure.equals(destination)) {
            JOptionPane.showMessageDialog(null, "You entered the same city twice.");
        } else {
            String route1 = String.format("%s - %s", departure, destination);
            String route2 = String.format("%s - %s", destination, departure);

            for (String[] flightDetails : flightInfo) {
                if (flightDetails[0].equals(route1) || flightDetails[0].equals(route2)) {
                    int distance = Integer.parseInt(flightDetails[1]);
                    float exactPoints = (float) ((float) distance * 321.17);
                    int pointsNeeded = (int) Math.ceil(exactPoints);
                    txaOut3.setText(String.format("Exact Points = %f\n"
                            + "Points Needed = %d", exactPoints, pointsNeeded));
                }
            }
        }

    }//GEN-LAST:event_btnCalculatePoints3ActionPerformed

    private void btnDraw4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDraw4ActionPerformed
        // Q 1.4
        String output = String.format("%-25s%-10s\n", "ENTRANCE", "COCKPIT");
        for (int i = 0; i < 33; i++) {
            char seatLetter = 'F';
            if (i == 13 || i == 14 || i == 15) {
                output += String.format("%-10s%-7s", " ", "WING");
            } else {
                output += String.format("%-17s", " ");
            }

            for (int j = 0; j < 7; j++) {
                if (j == 3) {
                    output += String.format("%-2s%-4d", " ", (i + 1));
                } else {
                    output += String.format("%-3s", Character.toString(seatLetter));
                    seatLetter -= 1;
                }
            }
            if (i == 13 || i == 14 || i == 15) {
                output += String.format("%-2s%-5s\n", " ", "WING");
            } else {
                output += "\n";
            }

        }
        output += String.format("%31s\n", "TAIL");
        txaOut4.setText(output);
    }//GEN-LAST:event_btnDraw4ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        fataMain.setVisible(true);
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
            java.util.logging.Logger.getLogger(Question1UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Question1UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Question1UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Question1UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Question1UI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActivate1;
    private javax.swing.JButton btnActivateLucky2C;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCalculateFees2A;
    private javax.swing.JButton btnCalculatePoints3;
    private javax.swing.JButton btnDraw4;
    private javax.swing.JCheckBox chbGroup2;
    private javax.swing.JComboBox cmbAgent1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblOutput1;
    private javax.swing.JPanel pnl1;
    private javax.swing.JPanel pnl2;
    private javax.swing.JPanel pnl3;
    private javax.swing.JPanel pnl4;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JTextArea txaOut2;
    private javax.swing.JTextArea txaOut3;
    private javax.swing.JTextArea txaOut4;
    private javax.swing.JTextField txfActivity1;
    private javax.swing.JTextField txfDeparture3;
    private javax.swing.JTextField txfDestination3;
    private javax.swing.JTextField txfFees;
    private javax.swing.JTextField txfNumPeople;
    // End of variables declaration//GEN-END:variables
}
