package Question3Package;

public class Question3 extends javax.swing.JFrame {

    // Given code
    PopulateArrays objAssign = new PopulateArrays();
    String[] arrSales = objAssign.populateArrSales();
    String[] arrAgents = objAssign.populateArrAgents();

    public Question3() {
        initComponents();
        setLocationRelativeTo(this);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        pnlContent = new javax.swing.JPanel();
        pnlSalesDetail = new javax.swing.JPanel();
        lblAgentCode = new javax.swing.JLabel();
        btnAgentsName = new javax.swing.JButton();
        lblAgentName = new javax.swing.JLabel();
        txfAgentCode = new javax.swing.JTextField();
        btnAgentsSalesRecord = new javax.swing.JButton();
        pnlDisplay = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaOutput = new javax.swing.JTextArea();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Question3");

        pnlSalesDetail.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true), "Agent's sales details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        lblAgentCode.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblAgentCode.setText("Enter agent's code");

        btnAgentsName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAgentsName.setText("Find agent's name");
        btnAgentsName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgentsNameActionPerformed(evt);
            }
        });

        lblAgentName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txfAgentCode.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnAgentsSalesRecord.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAgentsSalesRecord.setText("Agent's sales");
        btnAgentsSalesRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgentsSalesRecordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSalesDetailLayout = new javax.swing.GroupLayout(pnlSalesDetail);
        pnlSalesDetail.setLayout(pnlSalesDetailLayout);
        pnlSalesDetailLayout.setHorizontalGroup(
            pnlSalesDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSalesDetailLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSalesDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAgentCode)
                    .addGroup(pnlSalesDetailLayout.createSequentialGroup()
                        .addGroup(pnlSalesDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAgentName, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfAgentCode, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlSalesDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlSalesDetailLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(btnAgentsName, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlSalesDetailLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnAgentsSalesRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(245, Short.MAX_VALUE))
        );
        pnlSalesDetailLayout.setVerticalGroup(
            pnlSalesDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSalesDetailLayout.createSequentialGroup()
                .addGroup(pnlSalesDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSalesDetailLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(pnlSalesDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txfAgentCode, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgentsName, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlSalesDetailLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblAgentCode)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlSalesDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAgentName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlSalesDetailLayout.createSequentialGroup()
                        .addComponent(btnAgentsSalesRecord, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pnlDisplay.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true), "Display area", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        txaOutput.setColumns(20);
        txaOutput.setRows(5);
        jScrollPane2.setViewportView(txaOutput);

        javax.swing.GroupLayout pnlDisplayLayout = new javax.swing.GroupLayout(pnlDisplay);
        pnlDisplay.setLayout(pnlDisplayLayout);
        pnlDisplayLayout.setHorizontalGroup(
            pnlDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDisplayLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        pnlDisplayLayout.setVerticalGroup(
            pnlDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDisplayLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlContentLayout = new javax.swing.GroupLayout(pnlContent);
        pnlContent.setLayout(pnlContentLayout);
        pnlContentLayout.setHorizontalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlSalesDetail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlContentLayout.setVerticalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlSalesDetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgentsNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgentsNameActionPerformed
        String agentCode = txfAgentCode.getText();
        boolean found = false;
        for (String agent : arrAgents) {
            String[] agentDetails = agent.split(":");
            String code = agentDetails[0];
            String name = agentDetails[1];
            if (code.equals(agentCode)) {
                lblAgentName.setText(name);
                found = true;
                break;
            }
        }
        if (found == false) {
            lblAgentName.setText("Invalid Agent Code");
        }
    }//GEN-LAST:event_btnAgentsNameActionPerformed

    private void btnAgentsSalesRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgentsSalesRecordActionPerformed
        String monthHeadings = String.format("%35s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s\n\n",
                "", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec");
        txaOutput.setText(monthHeadings);
        int[][] sales = new int[3][13];
        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < 13; j++) {
                sales[i][j] = 0;
            }
        }
        double totalSales = 0.00;
        String agentCode = txfAgentCode.getText();
        for (String sale : arrSales) {
            String[] details = sale.split("#");
            int month = Integer.parseInt(details[0]);
            char type = details[1].charAt(0);
            String[] info = details[2].split(";");
            String code = info[0];
            double saleAmount = Double.parseDouble(info[1]);
            if (code.equals(agentCode)) {
                totalSales += saleAmount;
                switch (type) {
                    case 'C':
                        sales[0][month - 1]++;
                        sales[0][12]++;
                        break;
                    case 'R':
                        sales[1][month - 1]++;
                        sales[1][12]++;
                        break;
                    case 'A':
                        sales[2][month - 1]++;
                        sales[2][12]++;
                        break;
                }
            }

        }
        for (int i = 0; i < 3; i++) {
            switch (i) {
                case 0:
                    txaOutput.append("Commercial");
                    break;
                case 1:
                    txaOutput.append("Residential");
                    break;
                case 2:
                    txaOutput.append("Agricultural");
                    break;
            }
            for (int j = 0; j < 13; j++) {
                txaOutput.append(String.format("%10s", sales[i][j]));
            }
            txaOutput.append("\n\n");
        }
        txaOutput.append(String.format("Total Value of Sales: R %.2f", totalSales));

    }//GEN-LAST:event_btnAgentsSalesRecordActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Question3().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgentsName;
    private javax.swing.JButton btnAgentsSalesRecord;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblAgentCode;
    private javax.swing.JLabel lblAgentName;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JPanel pnlDisplay;
    private javax.swing.JPanel pnlSalesDetail;
    private javax.swing.JTextArea txaOutput;
    private javax.swing.JTextField txfAgentCode;
    // End of variables declaration//GEN-END:variables

}
