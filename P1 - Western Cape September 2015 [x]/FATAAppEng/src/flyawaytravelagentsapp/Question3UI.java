// Your name here
package flyawaytravelagentsapp;

import java.util.ArrayList;
import java.util.Random;

public class Question3UI extends javax.swing.JFrame {

    FlyAwayTravelAgentsMain fataMain;
    // Bookings for the first half of September: number of nights, starting date in September, surname
    String[] septemberBookings = {
        "5,10,Bobby", "4,11,Rick", "5,10,Morty", "1,7,Test1", "1,8,Test2",
        "5,1,RVP", "3,2,Jones", "4,7,Khumalo", "5,2,Pieters", "4,8,Morris",
        "6,4,Naidoo", "1,6,Ebrahim", "4,6,Ally", "7,7,Sebe",
        "5,6,Smith", "10,3,Zuma", "6,9,Helper", "4,3,Leppers",
        "3,1,Jack", "5,1,Haigh", "4,4,Thomas", "9,1,Rudd",
        "1,12,Obama", "1,1,Nick", "3,10,Omar", "7,3,Mabida"}; // given data, do NOT change
    // Data structure: 15 days (first half of September) 10 rooms
    String[][] allocations = new String[15][10];

    /*
    
     String[] septemberBookings = {
     "3,2,Jones", "4,7,Khumalo", "5,2,Pieters", "4,8,Morris",
     "6,4,Naidoo", "1,6,Ebrahim", "4,6,Ally", "7,7,Sebe",
     "5,6,Smith", "10,3,Zuma", "6,9,Helper", "4,3,Leppers",
     "3,1,Jack", "5,1,Haigh", "4,4,Thomas", "9,1,Rudd",
     "1,12,Obama", "1,1,Nick", "3,10,Omar", "7,3,Mabida"}; // given data, do NOT change
    
     */
    public Question3UI(FlyAwayTravelAgentsMain fata) {
        initComponents();
        fataMain = fata;
        btnNewGuest.setEnabled(false);
        btnAllocate.setEnabled(false);
    }

    public Question3UI() {
        initComponents();
        btnNewGuest.setEnabled(false);
        btnAllocate.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMain = new javax.swing.JPanel();
        pnlHeader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnAllocate = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnNewGuest = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txfStartingDate = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txfNumNights = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txfSurname = new javax.swing.JTextField();
        btnClearAndDisplay = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaOutput = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fly Away Travel Agents");

        pnlMain.setBackground(new java.awt.Color(255, 255, 153));

        pnlHeader.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Room Allocation");

        javax.swing.GroupLayout pnlHeaderLayout = new javax.swing.GroupLayout(pnlHeader);
        pnlHeader.setLayout(pnlHeaderLayout);
        pnlHeaderLayout.setHorizontalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(402, 402, 402))
        );
        pnlHeaderLayout.setVerticalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnAllocate.setText("Allocate existing bookings 3.2");
        btnAllocate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllocateActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "New Guest", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        jPanel1.setOpaque(false);

        btnNewGuest.setText("Allocate new booking 3.3");
        btnNewGuest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewGuestActionPerformed(evt);
            }
        });

        jLabel4.setText("Starting date");

        jLabel3.setText("Number of nights");

        jLabel2.setText("Surname");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(txfSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(34, 34, 34)
                        .addComponent(txfStartingDate))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNewGuest)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(15, 15, 15)
                        .addComponent(txfNumNights)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txfSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txfNumNights, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txfStartingDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnNewGuest)
                .addContainerGap())
        );

        btnClearAndDisplay.setText("Start new room allocation and display 3.1");
        btnClearAndDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearAndDisplayActionPerformed(evt);
            }
        });

        txaOutput.setColumns(20);
        txaOutput.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txaOutput.setRows(5);
        jScrollPane1.setViewportView(txaOutput);

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 935, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnClearAndDisplay)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAllocate)
                        .addGap(456, 456, 456)
                        .addComponent(btnBack)
                        .addGap(37, 37, 37))))
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addComponent(pnlHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnClearAndDisplay)
                    .addComponent(btnAllocate))
                .addGap(37, 37, 37)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
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
            .addComponent(pnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.setVisible(false);
        fataMain.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAllocateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllocateActionPerformed
        // Memo Code
        allocateBookings();
        this.displayRoomAllocation();
        btnNewGuest.setEnabled(true);

        
        // All Original Code
        /* Newer Method, Based Specifically on Days and Bookings
         ArrayList<Integer> recentRooms = new ArrayList<Integer>();
         int roomCounter = 0;
        
         int sumDuration = 0;
         for (String booking : septemberBookings) {
         String[] details = booking.split(",");
         sumDuration += Integer.parseInt(details[0]);
         }
         int average = (int) Math.ceil(sumDuration / septemberBookings.length); 
        
         for (int day = 0; day < 15; day++) {
            
         for (String booking : septemberBookings) {
                
         String[] details = booking.split(",");
         String name = details[2];
         int numberDays = Integer.parseInt(details[0]);
         int startDate = Integer.parseInt(details[2]) - 1;
         if (startDate == day) {
                    
         if (day == 0) {                        
         Random randomizer = new Random();
         int randomRoom = randomizer.nextInt(10);
         if (!"-".equals(allocations[day][randomRoom])) {
         // Empty Room
         recentRooms.add(randomRoom);
         for (int i = startDate; i < (startDate + numberDays); i++) {
         allocations[i][randomRoom] = name;
         }
         }
         }
                    
                    
                    
         }
         }
         }
         */
        /* New Failed Method, Executed in Terms of Rooms Available for Each Day

         for (int day = 0; day < 15; day++) {
         // Search for Bookings With  Start Day equal to day.
         for (String booking : septemberBookings) {
         String[] details = booking.split(",");
         String name = details[2];
         int startingDate = Integer.parseInt(details[1]) - 1;
         int numberOfDays = Integer.parseInt(details[0]);
         if (startingDate == day) {
         boolean availableRoom = true;
         for (int room = 0; room < 10; room++) {
         // Looping to find room that will acoomodate
         if (allocations[day][room].equals("-")) {
         for (int i = startingDate; i < (startingDate + numberOfDays); i++) {
         if (!"-".equals(allocations[i][room])) {
         availableRoom = false;
         }
         }
         if (availableRoom == true) {
         for (int i = startingDate; i < (startingDate + numberOfDays); i++) {
         allocations[i][room] = name;
         }
         this.updateDisplay();
         }
         }
         }
         }
         }

         } */

        /* Old Method, Executed in terms of Bookings
         boolean allocated = false;
         Random randomizer = new Random();
         while (allocated == false) {
         ArrayList<String> guests = new ArrayList<String>();
         for (String booking : septemberBookings) {

         String[] bookingDetails = booking.split(",");
         int days = Integer.parseInt(bookingDetails[0]);
         int startingDate = Integer.parseInt(bookingDetails[1]);
         String name = bookingDetails[2];
         if (guests.contains(name) == false) {
         guests.add(name);
         }
         boolean localAllocation = false;
         while (localAllocation == false) {
         boolean emptyCheck = true;
         int seed = randomizer.nextInt(10);
         for (int i = (startingDate - 1); i < ((startingDate - 1) + days); i++) {
         if (!allocations[i][seed].equals("-")) {
         emptyCheck = false;
         }
         }
         if (emptyCheck == true) {
         localAllocation = true;
         guests.remove(name);
         for (int i = (startingDate - 1); i < ((startingDate - 1) + days); i++) {
         allocations[i][seed] = name;
         }
         this.updateDisplay();
         }
         }
         }
         if (guests.size() == 0) {
         allocated = true;
         }
         } */
    }//GEN-LAST:event_btnAllocateActionPerformed

    private void btnNewGuestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewGuestActionPerformed
        // Q 3.3
        // Memo Code
        String name = txfSurname.getText();
        int numDays
                = Integer.parseInt(txfNumNights.getText());
        int start = Integer.parseInt(txfStartingDate.getText());
        int room = getEmptyRoomNum(numDays, start);
        for (int j = start - 1; j < start - 1 + numDays; j++) {
            allocations[j][room] = name;
        }
        displayRoomAllocation();
    }//GEN-LAST:event_btnNewGuestActionPerformed

    private void btnClearAndDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearAndDisplayActionPerformed
        
        // Original Code
        for (int i = 0; i < allocations.length; i++) {
            for (int j = 0; j < 10; j++) {
                allocations[i][j] = "-";
            }
        }

        for (int i = 0; i < allocations.length + 1; i++) {
            for (int j = 0; j < 11; j++) {
                if (i == 0 && j == 0) {
                    txaOutput.setText(String.format("%-10s", "Date"));
                } else if (i == 0) {
                    txaOutput.append(String.format("%-10s", String.format("Room %d", j)));
                } else if (j == 0) {
                    txaOutput.append(String.format("%-10d", i));
                } else {
                    txaOutput.append(String.format("%-10s", allocations[i - 1][j - 1]));
                }
            }
            txaOutput.append("\n");
        }
        btnAllocate.setEnabled(true);

    }//GEN-LAST:event_btnClearAndDisplayActionPerformed

    
    // Memo Code
    private void allocateBookings() {
        for (int i = 0; i < septemberBookings.length; i++) {
            String string = septemberBookings[i];
            String[] part = string.split(",");
            int numDays = Integer.parseInt(part[0]);
            int startDate = Integer.parseInt(part[1]);
            String name = part[2];
            int roomNum = getEmptyRoomNum(numDays, startDate);
            for (int j = (startDate - 1); j < (startDate - 1 + numDays); j++) {
                allocations[j][roomNum] = name;
            }
        }
    }

    // Memo Code
    private int getEmptyRoomNum(int numDays, int start) {
        int room = 0;
        int day = start - 1;
        int daysEmpty = 0;
        boolean found = false;
        while (found == false) {
            while (allocations[day][room].equals("-") && (day < 14) && (room < 10)) {
                daysEmpty++;
                day++;
            }
            if (daysEmpty >= numDays) {
                found = true;
            } else {
                room++;
            }
        }
        return room;
    }

    // Memo Code
    private void displayRoomAllocation() {
        String out = "Day ";
        for (int i = 0; i < 10; i++) {
            out += String.format("%-4s %-5d", "Room", (i
                    + 1));
        }
        out += "\n";
        for (int i = 0; i < allocations.length; i++) {
            out += String.format("%-3d", (i + 1));
            for (int j = 0; j < allocations[i].length; j++) {
                out += String.format("%-10s", allocations[i][j]);
            }
            out += "\n";
        }
        txaOutput.setText(out);
    }

    // Original Code
    public void updateDisplay() {
        for (int i = 0; i < allocations.length + 1; i++) {
            for (int j = 0; j < 11; j++) {
                if (i == 0 && j == 0) {
                    txaOutput.setText(String.format("%-10s", "Date"));
                } else if (i == 0) {
                    txaOutput.append(String.format("%-10s", String.format("Room %d", j)));
                } else if (j == 0) {
                    txaOutput.append(String.format("%-10d", i));
                } else {
                    txaOutput.append(String.format("%-10s", allocations[i - 1][j - 1]));
                }
            }
            txaOutput.append("\n");
        }
    }

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
            java.util.logging.Logger.getLogger(Question3UI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Question3UI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Question3UI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Question3UI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Question3UI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAllocate;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClearAndDisplay;
    private javax.swing.JButton btnNewGuest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JTextArea txaOutput;
    private javax.swing.JTextField txfNumNights;
    private javax.swing.JTextField txfStartingDate;
    private javax.swing.JTextField txfSurname;
    // End of variables declaration//GEN-END:variables
}
