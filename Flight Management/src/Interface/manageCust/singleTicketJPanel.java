/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.manageCust;

import Business.CustomerDirectory;
import Business.Flight;
import Business.FlightSchedule;
import Business.Person;
import Business.SeatDirectory;
import Business.Seats;
import java.awt.CardLayout;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Apurva
 */
public class singleTicketJPanel extends javax.swing.JPanel {

    private JPanel UserProcessContainer;
    private FlightSchedule flightSch;
    private SeatDirectory sd;
    private CustomerDirectory cd;
    private String anumber, anumber1, anumber2, anumber3, anumber4;

    /**
     * Creates new form singleTicketJPanel
     */

    public singleTicketJPanel(JPanel UserProcessContainer, FlightSchedule flightSch) {
        initComponents();
        this.cd = cd;
        this.flightSch = flightSch;
        this.sd = sd;
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

        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sourcejTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        destinationjTextField = new javax.swing.JTextField();
        searchjButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookjTable = new javax.swing.JTable();
        bookjButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        fnamejTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lnamejTextField1 = new javax.swing.JTextField();
        backjButton = new javax.swing.JButton();

        jLabel6.setText("jLabel6");

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Enter Details");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 16, -1, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Source:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 174, -1, -1));
        add(sourcejTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 163, 204, 42));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Destination:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, -1, -1));

        destinationjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinationjTextFieldActionPerformed(evt);
            }
        });
        add(destinationjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 223, 204, 40));

        searchjButton.setText("Search");
        searchjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchjButtonActionPerformed(evt);
            }
        });
        add(searchjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 284, -1, -1));

        bookjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Airliner Name", "Source", "Destination", "Price(in Dollars)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(bookjTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 650, 111));

        bookjButton.setText("Book");
        bookjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookjButtonActionPerformed(evt);
            }
        });
        add(bookjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(689, 451, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("First Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, -1));
        add(fnamejTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 52, 204, 43));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Last Name:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, -1, -1));
        add(lnamejTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 104, 204, 43));

        backjButton.setText("<< Back");
        backjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButtonActionPerformed(evt);
            }
        });
        add(backjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 505, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void destinationjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinationjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destinationjTextFieldActionPerformed

    private void searchjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchjButtonActionPerformed
        // TODO add your handling code here:
        int k = 0;
        System.out.println("search");
        try {
            System.out.println("in try");
            anumber = sourcejTextField.getText();
            anumber1 = destinationjTextField.getText();
            anumber2 = fnamejTextField.getText();
            anumber3 = lnamejTextField1.getText();
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
            Object data[] = new Object[5];
            //String x = ap.getFlightNumber();
            if (anumber.equalsIgnoreCase(f.getArrival()) && anumber1.equalsIgnoreCase(f.getDepart())) {
                k = 1;
                data[0] = f;
                data[1] = f.getArrival();
                data[2] = f.getDepart();
                data[3] = f.getPrice();
                // data[3] = ap.getAirportName();
                DefaultTableModel dm = (DefaultTableModel) bookjTable.getModel();
                //dm.setRowCount(0);
                dm.addRow(data);
            }
        }
        if (k == 0) {
            UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 24));
            JOptionPane.showMessageDialog(null, "Invalid Input. Plese enter correct values");
        }

    }//GEN-LAST:event_searchjButtonActionPerformed

    private void bookjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookjButtonActionPerformed
        // TODO add your handling code here:
        int selectedrow = bookjTable.getSelectedRow();
        if (selectedrow >= 0) {
            Flight f = (Flight) bookjTable.getValueAt(selectedrow, 0);
            int cfr = JOptionPane.showConfirmDialog(null, "Are you sure to book");
            if (cfr == 0) {
                Random r = new Random();
                char c = (char) (r.nextInt(5) + 'a');
                UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 24));
                JOptionPane.showMessageDialog(null, anumber2 + " " + anumber3 + "  your ticket has been booked. Your seat number is:  " + ThreadLocalRandom.current().nextInt(1, 100 + 1) + c);
            }
            UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 24));
            JOptionPane.showMessageDialog(null, "We wish you a happy journey..!!");

        }


    }//GEN-LAST:event_bookjButtonActionPerformed

    private void backjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButtonActionPerformed
        // TODO add your handling code here:
        UserProcessContainer.remove(this);
        CardLayout layout = (CardLayout) UserProcessContainer.getLayout();
        layout.previous(UserProcessContainer);
    }//GEN-LAST:event_backjButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton;
    private javax.swing.JButton bookjButton;
    private javax.swing.JTable bookjTable;
    private javax.swing.JTextField destinationjTextField;
    private javax.swing.JTextField fnamejTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lnamejTextField1;
    private javax.swing.JButton searchjButton;
    private javax.swing.JTextField sourcejTextField;
    // End of variables declaration//GEN-END:variables
}
