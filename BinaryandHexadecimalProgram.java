
/** Akshith Kandivanam
 *  Mr. Martins
 *  ICS-3U1
 *  2021-01-20
 *  Binary and Hexadecimal Program
 */
public class BinaryandHexadecimalProgram extends javax.swing.JFrame {

    /**
     * Creates new form BinaryandHexadecimalProgram
     */
        
    public BinaryandHexadecimalProgram() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        binTOdec = new javax.swing.JButton();
        decTObin = new javax.swing.JButton();
        lblBinTODec = new javax.swing.JLabel();
        lblDecTOBin = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        decTOhex = new javax.swing.JButton();
        lbldectohex = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        hexTOdec = new javax.swing.JButton();
        lblhexTOdec = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Binary and Hexadecimal Converter");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("NUMBER SYSTEMS");

        jLabel2.setText("Enter a decimal number:");

        jLabel3.setText("Enter a binary number:");

        binTOdec.setText("Bin. to Dec.");
        binTOdec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                binTOdecActionPerformed(evt);
            }
        });

        decTObin.setText("Dec. to Bin.");
        decTObin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decTObinActionPerformed(evt);
            }
        });

        lblBinTODec.setText("...");

        lblDecTOBin.setText("...");

        jLabel4.setText("Enter a decimal number:");

        decTOhex.setText("Dec. to Hex.");
        decTOhex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decTOhexActionPerformed(evt);
            }
        });

        lbldectohex.setText("...");

        jLabel5.setText("Enter a hexadecimal number:");

        hexTOdec.setText("Hex. to Dec.");
        hexTOdec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hexTOdecActionPerformed(evt);
            }
        });

        lblhexTOdec.setText("...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField3)
                            .addComponent(jTextField4))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(binTOdec)
                                .addGap(18, 18, 18)
                                .addComponent(lblBinTODec))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(decTObin)
                                .addGap(18, 18, 18)
                                .addComponent(lblDecTOBin))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(decTOhex)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbldectohex))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(hexTOdec)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblhexTOdec)))))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(decTObin)
                    .addComponent(lblDecTOBin))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(binTOdec)
                    .addComponent(lblBinTODec))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(decTOhex)
                    .addComponent(lbldectohex))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hexTOdec)
                    .addComponent(lblhexTOdec))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void binTOdecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_binTOdecActionPerformed
        
     // declaring variables.
     String binary;
     int decimal;
     
     // code to retrieve the binary number.
     binary = jTextField2.getText();
     
     // predefined method to convert the binary number to decimal number.
     decimal = Integer.parseInt(binary,2);  
    
     // code to display the decimal number to the user.
     lblBinTODec.setText(String.valueOf(decimal));
               
    }//GEN-LAST:event_binTOdecActionPerformed

    private void decTObinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decTObinActionPerformed
                
    // declaring variables.
    String binary;
    int decimal;
     
    // code to retrieve the decimal number.
    decimal = Integer.parseInt(jTextField1.getText());
     
    // predefined method to convert decimal to binary. 
    binary = Integer.toBinaryString(decimal);
    
    // code to display the binary number to the user.
    lblDecTOBin.setText(String.valueOf(binary));
        
    }//GEN-LAST:event_decTObinActionPerformed

    private void decTOhexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decTOhexActionPerformed
            
    // declaring variables.
    String hexadecimal; 
    int decimal; 
       
    // code to retrieve the decimal number.
    decimal = Integer.parseInt(jTextField3.getText());
       
    // code to convert decimal to hexadecimal.
    hexadecimal = Integer.toHexString(decimal);
       
    // code to display the hexadecimal to the user.
    lbldectohex.setText(String.valueOf(hexadecimal));
    }//GEN-LAST:event_decTOhexActionPerformed

    private void hexTOdecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hexTOdecActionPerformed
        
    // declaring variables.
    String hexadecimal; 
    int decimal; 
       
    // code to retrive the hexadecimal number.
    hexadecimal = jTextField4.getText();
      
    // code to convert the string to lowercase. 
    hexadecimal = hexadecimal.toLowerCase();
       
    // code to convert hexadecimal number to decimal number.
    decimal = Integer.parseInt(hexadecimal,16); 
       
    // code to display the decimal to the user.
    lblhexTOdec.setText(String.valueOf(decimal));
    }//GEN-LAST:event_hexTOdecActionPerformed

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
            java.util.logging.Logger.getLogger(BinaryandHexadecimalProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BinaryandHexadecimalProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BinaryandHexadecimalProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BinaryandHexadecimalProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BinaryandHexadecimalProgram().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton binTOdec;
    private javax.swing.JButton decTObin;
    private javax.swing.JButton decTOhex;
    private javax.swing.JButton hexTOdec;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lblBinTODec;
    private javax.swing.JLabel lblDecTOBin;
    private javax.swing.JLabel lbldectohex;
    private javax.swing.JLabel lblhexTOdec;
    // End of variables declaration//GEN-END:variables
}
