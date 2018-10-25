/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.manageCust;

import Business.Flight;
import Business.FlightSchedule;
import java.awt.CardLayout;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Apurva
 */
public class searchCustJPanel extends javax.swing.JPanel {

    private JPanel UserProcessContainer;
    private FlightSchedule flightSch;
    private String anumber, anumber1, anumber2, anumber3;
    private int anumber4;

    /**
     * Creates new form searchCustJPanel
     */
    public searchCustJPanel(JPanel UserProcessContainer, FlightSchedule flightSch) {
        initComponents();
        this.flightSch = flightSch;
        this.UserProcessContainer = UserProcessContainer;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fromjTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        DestinationjTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        morningjRadioButton = new javax.swing.JRadioButton();
        EveningjRadioButton = new javax.swing.JRadioButton();
        NightjRadioButton = new javax.swing.JRadioButton();
        serachflightpreferjButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        preferdisplayjTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        airlinerpreferjTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        slotsjTextField = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Enter flight preferences");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 46, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("Source:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 139, -1, -1));
        add(fromjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 142, 221, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setText("Destination:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 184, -1, -1));
        add(DestinationjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 187, 222, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setText("Select the prefered time slots:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 247, -1, -1));

        morningjRadioButton.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        morningjRadioButton.setText("Morning");
        morningjRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                morningjRadioButtonActionPerformed(evt);
            }
        });
        add(morningjRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, -1, -1));

        EveningjRadioButton.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        EveningjRadioButton.setText("Evening");
        EveningjRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EveningjRadioButtonActionPerformed(evt);
            }
        });
        add(EveningjRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 280, -1, -1));

        NightjRadioButton.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        NightjRadioButton.setText("Night");
        NightjRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NightjRadioButtonActionPerformed(evt);
            }
        });
        add(NightjRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 280, -1, -1));

        serachflightpreferjButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        serachflightpreferjButton.setText("Search");
        serachflightpreferjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serachflightpreferjButtonActionPerformed(evt);
            }
        });
        add(serachflightpreferjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 335, -1, 51));

        preferdisplayjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Airliner Name", "Source", "Destination", "Time", "Price (in Dollars)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(preferdisplayjTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 395, 870, 122));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setText("Airliner:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 92, -1, -1));

        airlinerpreferjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airlinerpreferjTextFieldActionPerformed(evt);
            }
        });
        add(airlinerpreferjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 95, 221, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 533, -1, -1));
        add(slotsjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(632, 287, 178, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void EveningjRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EveningjRadioButtonActionPerformed
        // TODO add your handling code here:
        slotsjTextField.setText(EveningjRadioButton.getText());
    }//GEN-LAST:event_EveningjRadioButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        UserProcessContainer.remove(this);
        CardLayout layout = (CardLayout) UserProcessContainer.getLayout();
        layout.previous(UserProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void serachflightpreferjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serachflightpreferjButtonActionPerformed
        // TODO add your handling code here:
        int k = 0;
        System.out.println("search");
        try {
            System.out.println("in try");
            anumber = airlinerpreferjTextField.getText();
            anumber1 = fromjTextField.getText();
            anumber2 = DestinationjTextField.getText();
           anumber3 = slotsjTextField.getText();
            System.out.println(anumber);
        } catch (Exception e) {
            System.out.println("Some Exception");
            UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 24));
            JOptionPane.showMessageDialog(null, "Plese enter correct values");
            //i = 1;
        }
        //System.out.println(ad.getAirplaneDirectory().size());

        for (Flight f : flightSch.getFlightCollection()) {
            System.out.println("In for");

            //String x = ap.getFlightNumber();
            if (anumber.equalsIgnoreCase(f.getFlightName()) && anumber1.equalsIgnoreCase(f.getArrival()) && anumber2.equalsIgnoreCase(f.getDepart())
                    && anumber3.equalsIgnoreCase(f.getTimestamp()                    )
                    ) {
                k = 1;
                DefaultTableModel dm = (DefaultTableModel) preferdisplayjTable.getModel();
                dm.setRowCount(0);
                Object data[] = new Object[5];
                data[0] = f.getFlightName();
                data[1] = f.getArrival();
                data[2] = f.getDepart();
                data[3] = f.getTimestamp();
                data[4] = f.getPrice();
       // data[3] = ap.getAirportName();

                //dm.setRowCount(0);
                dm.addRow(data);
            }
        }
        if (k == 0) {
            UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 24));
            JOptionPane.showMessageDialog(null, "Invalid Input. Plese enter correct values");
        }

    }//GEN-LAST:event_serachflightpreferjButtonActionPerformed

    private void morningjRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_morningjRadioButtonActionPerformed
        // TODO add your handling code here:
        slotsjTextField.setText(morningjRadioButton.getText());
    }//GEN-LAST:event_morningjRadioButtonActionPerformed

    private void NightjRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NightjRadioButtonActionPerformed
        // TODO add your handling code here:
        slotsjTextField.setText(NightjRadioButton.getText());
    }//GEN-LAST:event_NightjRadioButtonActionPerformed

    private void airlinerpreferjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airlinerpreferjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_airlinerpreferjTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DestinationjTextField;
    private javax.swing.JRadioButton EveningjRadioButton;
    private javax.swing.JRadioButton NightjRadioButton;
    private javax.swing.JTextField airlinerpreferjTextField;
    private javax.swing.JTextField fromjTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton morningjRadioButton;
    private javax.swing.JTable preferdisplayjTable;
    private javax.swing.JButton serachflightpreferjButton;
    private javax.swing.JTextField slotsjTextField;
    // End of variables declaration//GEN-END:variables
}
