package TestQuestion2_GUI;

// Type your examination number here...
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TestQuestion2 extends javax.swing.JFrame {

    public double[] arrScores;

    DanceCouple couple;

    public TestQuestion2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txaQ2 = new javax.swing.JTextArea();
        mnuMain = new javax.swing.JMenuBar();
        mnuOptionA = new javax.swing.JMenu();
        mnuOptionB = new javax.swing.JMenu();
        mnuOptionC = new javax.swing.JMenu();
        mnuQuit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Question 2");

        txaQ2.setColumns(20);
        txaQ2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txaQ2.setRows(5);
        jScrollPane1.setViewportView(txaQ2);

        mnuOptionA.setText("Option A");
        mnuOptionA.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                mnuOptionAMenuSelected(evt);
            }
        });
        mnuMain.add(mnuOptionA);

        mnuOptionB.setText("Option B");
        mnuOptionB.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                mnuOptionBMenuSelected(evt);
            }
        });
        mnuMain.add(mnuOptionB);

        mnuOptionC.setText("Option C");
        mnuOptionC.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                mnuOptionCMenuSelected(evt);
            }
        });
        mnuMain.add(mnuOptionC);

        mnuQuit.setText("Quit");
        mnuQuit.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                mnuQuitMenuSelected(evt);
            }
        });
        mnuMain.add(mnuQuit);

        setJMenuBar(mnuMain);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-487)/2, (screenSize.height-392)/2, 487, 392);
    }// </editor-fold>//GEN-END:initComponents

    private void mnuOptionAMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_mnuOptionAMenuSelected
        String partner1 = JOptionPane.showInputDialog(null, "Enter name of the first dance partner.");
        String partner2 = JOptionPane.showInputDialog(null, "Enter name of the second dance partner.");
        char type = JOptionPane.showInputDialog(null, "Enter the type of couple").charAt(0);
        couple = new DanceCouple(partner1, partner2, type);
        txaQ2.setText(couple.toString());
    }//GEN-LAST:event_mnuOptionAMenuSelected

    private void mnuQuitMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_mnuQuitMenuSelected
        System.exit(0);
    }//GEN-LAST:event_mnuQuitMenuSelected

    private void mnuOptionBMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_mnuOptionBMenuSelected
        this.mnuOptionAMenuSelected(evt);
        double judge1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter Judge 1's score here: "));
        double judge2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter Judge 2's score here: "));
        double judge3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter Judge 3's score here: "));
        double judge4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter Judge 4's score here: "));
        arrScores = new double[]{judge1, judge2, judge3, judge4};
        for (double score : arrScores) {
            if (score > 10.00) {
                score = 0;
            }
        }
        txaQ2.setText(couple.toString() + "\n"
                + "Weighting Value: " + couple.getWeighting() + "\n"
                + "Final Score: " + couple.calculateScore(arrScores));
    }//GEN-LAST:event_mnuOptionBMenuSelected

    private void mnuOptionCMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_mnuOptionCMenuSelected
        this.mnuOptionAMenuSelected(evt);
        this.mnuOptionBMenuSelected(evt); 
        try {
            this.createFile("Score.txt");
        } catch (IOException ex) {
            Logger.getLogger(TestQuestion2.class.getName()).log(Level.SEVERE, null, ex);
        }
        String output = couple.getDancePartner1() + "," + couple.getDancePartner2() + "," 
                + couple.calculateScore(arrScores) + "\n";
        this.writeToText("Score.txt", output);         
    }//GEN-LAST:event_mnuOptionCMenuSelected

    public File createFile(String fileName) throws IOException {
        // Creating A Temporary File
        File myFile = new File(fileName = ".txt");

        // This will output the full path where the file will be written to...
        System.out.print(myFile.getCanonicalPath());
        
        return myFile;
    }

    public void writeToText(String fileName, String output)  {      
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(output);
            JOptionPane.showMessageDialog(null, "Data has been written to file - " + fileName);

        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            // Close the writer regardless of what happens...
            writer.close();
        } catch (Exception e) {

        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TestQuestion2().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuBar mnuMain;
    private javax.swing.JMenu mnuOptionA;
    private javax.swing.JMenu mnuOptionB;
    private javax.swing.JMenu mnuOptionC;
    private javax.swing.JMenu mnuQuit;
    private javax.swing.JTextArea txaQ2;
    // End of variables declaration//GEN-END:variables
}
