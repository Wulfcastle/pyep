package Question3Package;

//Enter your examination number here.
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Question3 extends javax.swing.JFrame {

    String arrEvents[] = {
        "Hockey", "Chess", "Rugby", "Chess", "Debating", "Hockey", "Soccer",
        "Rugby", "Debating", "Chess", "Rugby", "Debating", "Swimming", "Rugby",
        "Soccer", "Rugby", "Chess", "Choir", "Tennis", "Debating",
        "Debating", "Rugby", "Tennis", "Tennis", "Tennis", "Soccer",
        "Chess", "Swimming", "Hockey", "Rugby", "Chess", "Hockey", "Soccer",
        "Swimming", "Chess", "Choir", "Soccer", "Tennis", "Debating",
        "Rugby", "Choir", "Chess", "Choir", "Debating", "Rugby"};
    String arrDates[] = {
        "2015/10/04", "2015/03/20", "2015/09/17", "2015/03/20", "2015/05/24",
        "2015/10/04", "2015/06/03", "2015/07/19", "2015/09/16", "2015/07/01",
        "2015/03/17", "2015/11/19", "2015/07/29", "2015/09/18", "2015/10/23",
        "2015/07/15", "2015/03/07", "2015/06/08", "2015/04/01", "2015/03/07",
        "2015/09/12", "2015/11/12", "2015/10/03", "2015/05/11", "2015/10/03",
        "2015/05/28", "2015/09/28", "2015/05/10", "2015/09/24", "2015/10/14",
        "2015/04/23", "2015/03/23", "2015/06/03", "2015/07/29", "2015/09/18",
        "2015/08/29", "2015/11/10", "2015/04/01", "2015/04/10", "2015/03/23",
        "2015/10/04", "2015/10/07", "2015/05/03", "2015/07/30", "2015/11/25"};

    int count = 45;
    DateFormat df = new SimpleDateFormat("yyyy/MM/dd");

    String[][] eventArray = this.createEventArray(arrEvents, arrDates);

    public Question3() {
        try {
            this.sortArrayByDate(eventArray); // Sorting Array by Date
            this.removeDuplicates(eventArray); // Removing Duplicates in eventArray
            eventArray = this.removeEmptyEntries(eventArray);
        } catch (ParseException ex) {
            System.out.print(ex);
        }
        initComponents();
        setLocationRelativeTo(this);
        cmbEvents.setSelectedIndex(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblHeading = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaOutput = new javax.swing.JTextArea();
        btnClose = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txfMonthNumber = new javax.swing.JTextField();
        lblMonth = new javax.swing.JLabel();
        lblEvent = new javax.swing.JLabel();
        cmbEvents = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        btnExecute = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(544, 488));

        lblHeading.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblHeading.setText("Events: 2015");

        txaOutput.setColumns(20);
        txaOutput.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txaOutput.setRows(5);
        jScrollPane1.setViewportView(txaOutput);

        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("User input:"));

        txfMonthNumber.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txfMonthNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfMonthNumberActionPerformed(evt);
            }
        });

        lblMonth.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblMonth.setText("Month");

        lblEvent.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblEvent.setText("Event");

        cmbEvents.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cmbEvents.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All", "Chess", "Choir", "Debating", "Hockey", "Rugby", "Soccer", "Swimming", "Tennis" }));
        cmbEvents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEventsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lblMonth)
                        .addGap(18, 18, 18)
                        .addComponent(txfMonthNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblEvent)
                        .addGap(18, 18, 18)
                        .addComponent(cmbEvents, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMonth)
                    .addComponent(txfMonthNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbEvents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEvent))
                .addGap(28, 28, 28))
        );

        btnExecute.setLabel("Execute");
        btnExecute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExecuteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnExecute, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnExecute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(lblHeading))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeading)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void txfMonthNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfMonthNumberActionPerformed
    }//GEN-LAST:event_txfMonthNumberActionPerformed

    private void cmbEventsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEventsActionPerformed
    }//GEN-LAST:event_cmbEventsActionPerformed

    private void btnExecuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExecuteActionPerformed
        int month = 0;
        String eventName = cmbEvents.getSelectedItem().toString();
        try {
            month = Integer.parseInt(txfMonthNumber.getText());
            if (month > 0 && month <= 12) {
                try {
                    String[] events = this.getEvents(eventName, month).split("\n");
                    int numberEvents = events.length;
                    if (events[0].equals("")) {
                        // No events were recorded.
                        numberEvents = 0;
                    }
                    txaOutput.setText(String.format("List of %s events for month %d: %d events\n\n"
                            + "%-15s%-20s\n", eventName, month, numberEvents, "EVENTS", "DATES"));
                    for (String event : events) {
                        txaOutput.append(String.format("%s\n", event));
                    }

                } catch (ParseException ex) {
                    Logger.getLogger(Question3.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Month out of range.");
            }
        } catch (NumberFormatException ex) {
            // No number is entered
            String[] events = this.getAll(eventName).split("\n");
            txaOutput.setText(String.format("List of %s events : %d\n\n"
                    + "%s%15s\n", eventName, events.length, "EVENTS", "DATES"));
            for (String event : events) {
                txaOutput.append(String.format("%s\n", event));
            }
        }
    }//GEN-LAST:event_btnExecuteActionPerformed

    public String getAll(String event) {
        String results = "";
        if (event.equals("All")) {
            for (int i = 0; i < eventArray.length; i++) {
                String eventName = eventArray[i][0];
                String date = eventArray[i][1];
                results += String.format("%-15s%-20s\r\n", eventName, date);
            }
        } else {
            for (int i = 0; i < eventArray.length; i++) {
                String eventName = eventArray[i][0];
                String date = eventArray[i][1];
                if (eventName.equals(event)) {
                    results += String.format("%-15s%-20s\r\n", eventName, date);
                }
            }
        }
        return results;
    }

    public void sortArrayByDate(String[][] array) throws ParseException {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                String currentEvent = array[j][1];
                String nextEvent = array[j + 1][1];
                Date currentEventDate = df.parse(currentEvent);
                Date nextEventDate = df.parse(nextEvent);
                if (nextEventDate.before(currentEventDate) == true) {
                    // Swapping events
                    String currentEventName = array[j][0];
                    String nextEventName = array[j + 1][0];
                    array[j][0] = nextEventName;
                    array[j][1] = nextEvent;
                    array[j + 1][0] = currentEventName;
                    array[j + 1][1] = currentEvent;
                }
            }
        }
    }

    public String[][] removeEmptyEntries(String[][] array) {
        int arrayLength = array.length;
        int emptyEntries = 0;
        for (String[] event : array) {
            if (event[0].equals("") && event[1].equals("")) {
                emptyEntries++;
            }
        }
        arrayLength -= emptyEntries;
        String[][] newArray = new String[arrayLength][2]; // Dynamically calculating length of array
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (!"".equals(array[i][0]) && !"".equals(array[i][1])) {
                newArray[counter][0] = array[i][0];
                newArray[counter][1] = array[i][1];
                counter++; /* The counter variable will only increment if an actual entry was entered into the newArray, 
                 this will always be equal to the arrayLength variable calculated earlier.*/

            }
        }
        return newArray;
    }

    public void removeDuplicates(String[][] array) throws ParseException {
        String eventCache = "";
        Date dateCache = null;

        for (int i = 0; i < array.length; i++) {
            /* The outer for-loop will loop through the entire array comparing the items within 
             the inner for-loop against the name and date "caches" for duplicates.*/

            eventCache = array[i][0];
            if (eventCache.equals("")) {
                // Do Nothing
            } else {
                dateCache = df.parse(array[i][1]);
                for (int j = 0; j < array.length; j++) { // Setting j, equal to 1 or the orignal item in the array being checked against will be remvoed.
                    if (j == i) {
                        // Same item in array as being used top check again - Do Nothing
                    } else {
                        String eventName = array[j][0];
                        if (eventName.equals("")) {
                            // Do Nothing
                        } else {
                            Date date = df.parse(array[j][1]);
                            if ((date.equals(dateCache) == true) && (eventName.equals(eventCache))) {// Duplicate  
                                array[j][0] = ""; // Setting eventName to null
                                array[j][1] = ""; // Setting date to null
                            }
                        }
                    }
                }
            }
        }
    }

    public String getEvents(String event, int month) throws ParseException {
        String results = "";

        for (int i = 0; i < eventArray.length; i++) {
            String eventName = eventArray[i][0];
            String date = eventArray[i][1];
            /*
             Date eventDate = df.parse(date);
             int eventMonth = eventDate.getMonth() -1 ;
            
             The above code will not work correctly, the Date.getMonth() method for java.util.Date for some reason always 
             returns an int value that is either 1 or 2 above what it should be.
             */
            int eventMonth = Integer.parseInt(date.substring(5, 7));
            if (eventMonth == month) {
                if (event.equals("All")) {
                    results += String.format("%-15s%-20s\r\n", eventName, date);
                } else {
                    if (event.equals(eventName)) {
                        results += String.format("%-15s%-20s\r\n", eventName, date);
                    }
                }
            }
        }

        return results;
    }

    public String[][] createEventArray(String[] arrEvents, String[] arrDates) {
        String[][] eventArray = new String[arrEvents.length][2];
        for (int i = 0; i < arrEvents.length; i++) {
            eventArray[i][0] = arrEvents[i];
            eventArray[i][1] = arrDates[i];
        }
        return eventArray;
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
    private javax.swing.JButton btnClose;
    private java.awt.Button btnExecute;
    private javax.swing.JComboBox cmbEvents;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEvent;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblMonth;
    private javax.swing.JTextArea txaOutput;
    private javax.swing.JTextField txfMonthNumber;
    // End of variables declaration//GEN-END:variables
}
