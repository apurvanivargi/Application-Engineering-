/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author owner
 */
import Business.AccountInformation;
import Business.Demographic;
import Business.Address;
import Business.Driverlicense;
import Business.MedicalRecord;

public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private Demographic demographic;
//    private AccountInformation accountInformation;
//    private Address address;
//    private MedicalRecord medicalRecord;
//    private Driverlicense driverLicense;

    public MainJFrame() {
        initComponents();
        demographic = new Demographic();
//        accountInformation = new AccountInformation();
//        address = new Address();
//        medicalRecord = new MedicalRecord();
//        driverLicense = new Driverlicense();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitpane = new javax.swing.JSplitPane();
        controlJPanel = new javax.swing.JPanel();
        createBtn = new javax.swing.JButton();
        viewBtn = new javax.swing.JButton();
        displayJPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        controlJPanel.setBackground(new java.awt.Color(255, 255, 255));

        createBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        viewBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        viewBtn.setText("View");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlJPanelLayout = new javax.swing.GroupLayout(controlJPanel);
        controlJPanel.setLayout(controlJPanelLayout);
        controlJPanelLayout.setHorizontalGroup(
            controlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlJPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(createBtn))
                    .addComponent(viewBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        controlJPanelLayout.setVerticalGroup(
            controlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlJPanelLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(createBtn)
                .addGap(60, 60, 60)
                .addComponent(viewBtn)
                .addContainerGap(268, Short.MAX_VALUE))
        );

        splitpane.setLeftComponent(controlJPanel);

        displayJPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\owner\\Desktop\\Free_Person_Icon_Vector-01.jpg")); // NOI18N
        jLabel1.setText("USER INFORMATION");

        javax.swing.GroupLayout displayJPanelLayout = new javax.swing.GroupLayout(displayJPanel);
        displayJPanel.setLayout(displayJPanelLayout);
        displayJPanelLayout.setHorizontalGroup(
            displayJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        displayJPanelLayout.setVerticalGroup(
            displayJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                .addContainerGap())
        );

        splitpane.setRightComponent(displayJPanel);

        getContentPane().add(splitpane, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
        CreateJPanel createJPanel = new CreateJPanel(demographic);
        splitpane.setRightComponent(createJPanel);
    }//GEN-LAST:event_createBtnActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        // TODO add your handling code here:

        ViewJPanel viewJPanel = new ViewJPanel(demographic);
        splitpane.setRightComponent(viewJPanel);
    }//GEN-LAST:event_viewBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel controlJPanel;
    private javax.swing.JButton createBtn;
    private javax.swing.JPanel displayJPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSplitPane splitpane;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables
}
