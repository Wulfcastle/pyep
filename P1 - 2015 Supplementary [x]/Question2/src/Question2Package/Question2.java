package Question2Package;

//Enter your examintaion number here.
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Question2 extends javax.swing.JFrame {

    Order photoPackage;

    public Question2() {
        initComponents();
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("Unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblSchoolName = new javax.swing.JLabel();
        btnQues2_2_1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txaOutput = new javax.swing.JTextArea();
        cmbNames = new javax.swing.JComboBox();
        btnQues2_2_2 = new javax.swing.JButton();
        btnQues2_2_3 = new javax.swing.JButton();
        lblInstruction = new javax.swing.JLabel();
        lblHeading = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblSchoolName.setBackground(new java.awt.Color(204, 255, 204));
        lblSchoolName.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblSchoolName.setText("<school name>");
        lblSchoolName.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btnQues2_2_1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnQues2_2_1.setText("Question 2.2.1");
        btnQues2_2_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQues2_2_1ActionPerformed(evt);
            }
        });

        txaOutput.setColumns(20);
        txaOutput.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txaOutput.setRows(5);
        txaOutput.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N
        jScrollPane3.setViewportView(txaOutput);

        cmbNames.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cmbNames.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "K Green", "J Naidoo", "D Smith", "P Ally", "S Moonsamy", "L Ndhlovu", "P Smith", "L Mahlangu", "C Naidoo", "P Adams", "T Moonsamy", "J Ally", "V Zulu", "SS Sokraj", "G Masinga", "GC Naidoo", "K Pillay", "S Sokraj", "N Maoce", "H Ndhlovu", "J Motimele", "D Butt", "F Frans", "V Xulu", "R Moodley", "Z Zulu", "B Masinga", "B Butt", "J Adams", "F Garden", "H Green", "D Day", "W Day", "T Masinga" }));

        btnQues2_2_2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnQues2_2_2.setText("Question 2.2.2");
        btnQues2_2_2.setEnabled(false);
        btnQues2_2_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQues2_2_2ActionPerformed(evt);
            }
        });

        btnQues2_2_3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnQues2_2_3.setText("Question 2.2.3");
        btnQues2_2_3.setEnabled(false);
        btnQues2_2_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQues2_2_3ActionPerformed(evt);
            }
        });

        lblInstruction.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblInstruction.setText("Select a name");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInstruction)
                    .addComponent(cmbNames, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQues2_2_1)
                    .addComponent(btnQues2_2_2)
                    .addComponent(btnQues2_2_3))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSchoolName, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInstruction)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbNames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSchoolName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnQues2_2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnQues2_2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnQues2_2_3))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnQues2_2_1, btnQues2_2_2, btnQues2_2_3});

        lblHeading.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblHeading.setText("Report");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblHeading)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeading)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQues2_2_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQues2_2_3ActionPerformed
        txaOutput.append(String.format("\nDiscount: R%.2f", photoPackage.calculateDiscount()));
    }//GEN-LAST:event_btnQues2_2_3ActionPerformed

    private void btnQues2_2_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQues2_2_2ActionPerformed
        if (photoPackage.getPaid() != 'Y') {
            File file = new File(String.format("%s.txt",photoPackage.getName()));
            try {                
                FileWriter writer = new FileWriter(file);
                writer.write(photoPackage.toString());
                writer.flush();
                writer.close();
                
                txaOutput.append("\n\nText file created."); 
            } catch (IOException ex) {
                Logger.getLogger(Question2.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            txaOutput.append("\n\nAccount Paid");
        }
        btnQues2_2_3.setEnabled(true); 
    }//GEN-LAST:event_btnQues2_2_2ActionPerformed

    private void btnQues2_2_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQues2_2_1ActionPerformed
        String input = cmbNames.getSelectedItem().toString();
        File file = new File("Photographs.txt");
        String content = "";
        String[] data = null;
        if (file.exists() == true) {
            try {
                Scanner scanner = new Scanner(file).useDelimiter(",\\s*");
                while (scanner.hasNext()) {
                    content = scanner.next();
                    data = content.split("\r\n");
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Question2.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "File does not exist.");
        }
        for (String line : data) {
            if (line.contains(input)) {
                String[] personDetails = line.split("#");
                String name = personDetails[0];
                String[] information = personDetails[1].split(";");
                int numGroup = Integer.parseInt(information[0]);
                int numSingle = Integer.parseInt(information[1]);
                char paid = information[2].charAt(0);
                photoPackage = new Order(name, numGroup, numSingle, paid);
                txaOutput.setText(String.format("%s\n\nCost: R%.2f",photoPackage.toString(), 
                        photoPackage.calculatCost())); 
                btnQues2_2_2.setEnabled(true); 
            }
        }
    }//GEN-LAST:event_btnQues2_2_1ActionPerformed

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
    private javax.swing.JButton btnQues2_2_1;
    private javax.swing.JButton btnQues2_2_2;
    private javax.swing.JButton btnQues2_2_3;
    private javax.swing.JComboBox cmbNames;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblInstruction;
    private javax.swing.JLabel lblSchoolName;
    private javax.swing.JTextArea txaOutput;
    // End of variables declaration//GEN-END:variables
}
