package TestQuestion2_GUI;

// Type your examination number here...

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TestQuestion2 extends javax.swing.JFrame {
    
    DanceCouple couple;
    int[] arrScores;

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
        String danceP1 = JOptionPane.showInputDialog(null, "Enter name of dance partner 1:");
        String danceP2 = JOptionPane.showInputDialog(null, "Enter name of dance partner 2:");
        char professional = Character.toUpperCase(JOptionPane.showInputDialog(null, "Enter proffesion type.").charAt(0));
        couple = new DanceCouple(danceP1, danceP2, professional);
        txaQ2.setText(couple.toString());
    }//GEN-LAST:event_mnuOptionAMenuSelected

    private void mnuQuitMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_mnuQuitMenuSelected
        //quit the program
        System.exit(0);
    }//GEN-LAST:event_mnuQuitMenuSelected

    private void mnuOptionBMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_mnuOptionBMenuSelected
        mnuOptionAMenuSelected(evt);
        arrScores = new int[4];
        for (int i=0; i < 4; i++){
            int input = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    String.format("Enter score for judge %d : ", i+1)));
            if (input < 0 || input > 10) {
                arrScores[i] = 0;
            } else {
                arrScores[i] = input;
            }
        }
        txaQ2.setText(couple.scoresToString(arrScores));
    }//GEN-LAST:event_mnuOptionBMenuSelected

    private void mnuOptionCMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_mnuOptionCMenuSelected
        mnuOptionBMenuSelected(evt); 
        try {
            couple.writeToText(arrScores);
            JOptionPane.showMessageDialog(null, "File written successfully to text.");
        } catch (IOException ex) {
           JOptionPane.showMessageDialog(null, "Error.");
        }
    }//GEN-LAST:event_mnuOptionCMenuSelected

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
