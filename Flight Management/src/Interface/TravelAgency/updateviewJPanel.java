/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.TravelAgency;

import Business.Airliner;
import Business.AirlinerDirectory;
import Business.Flight;
import java.awt.CardLayout;
import java.awt.Font;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Apurva
 */
public class updateviewJPanel extends javax.swing.JPanel {

    private JPanel UserProcessContainer;
    private AirlinerDirectory airlinerDirect;

    /**
     * Creates new form updateviewJPanel
     */

    public updateviewJPanel(JPanel UserProcessContainer, final AirlinerDirectory airlinerDirect) {
        initComponents();
        this.airlinerDirect = airlinerDirect;
        this.UserProcessContainer = UserProcessContainer;
        DefaultTableModel dm = (DefaultTableModel) AirlinerjTable.getModel();
        dm.setRowCount(0);
        for (Airliner al : airlinerDirect.getAirlinerList()) {
            Object data[] = new Object[3];
            data[0] = al;
            data[1] = al.getHeadQuarters();
            data[2] = al.getFleetStrength();
            dm.addRow(data);
        }

        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentShown(ComponentEvent evt) {
                DefaultTableModel dm = (DefaultTableModel) AirlinerjTable.getModel();
                dm.setRowCount(0);
                for (Airliner al : airlinerDirect.getAirlinerList()) {
                    Object data[] = new Object[3];
                    data[0] = al;
                    data[1] = al.getHeadQuarters();
                    data[2] = al.getFleetStrength();
                    dm.addRow(data);
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AirlinerjTable = new javax.swing.JTable();
        UpdatejButton = new javax.swing.JButton();
        DeletejButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Update Airliner Details");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 40, -1, -1));

        AirlinerjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Airliner Name", "Headquarters", "Fleet Strength"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(AirlinerjTable);
        if (AirlinerjTable.getColumnModel().getColumnCount() > 0) {
            AirlinerjTable.getColumnModel().getColumn(0).setResizable(false);
            AirlinerjTable.getColumnModel().getColumn(1).setResizable(false);
            AirlinerjTable.getColumnModel().getColumn(2).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 110, -1, 114));

        UpdatejButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        UpdatejButton.setText("View");
        UpdatejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatejButtonActionPerformed(evt);
            }
        });
        add(UpdatejButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 233, -1, -1));

        DeletejButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        DeletejButton.setText("Delete");
        DeletejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletejButtonActionPerformed(evt);
            }
        });
        add(DeletejButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(596, 233, -1, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 539, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void UpdatejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatejButtonActionPerformed
        // TODO add your handling code here:
        int selectedrow = AirlinerjTable.getSelectedRow();
        if (selectedrow >= 0) {
            Airliner airliner = (Airliner) AirlinerjTable.getValueAt(selectedrow, 0);
            UpdateJPanel panel = new UpdateJPanel(UserProcessContainer, airliner);
            UserProcessContainer.add("UpdateJPanel", panel);
            CardLayout layout = (CardLayout) UserProcessContainer.getLayout();
            layout.next(UserProcessContainer);
        } else {
            UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 24));
        }
            //JOptionPane.showMessageDialog(null,"Please select a row from the table", "Warning", JOptionPane.WARNING_MESSAGE);


    }//GEN-LAST:event_UpdatejButtonActionPerformed

    private void DeletejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletejButtonActionPerformed
        // TODO add your handling code here:
        int selectedrow = AirlinerjTable.getSelectedRow();
        if (selectedrow >= 0) {
            Airliner airliner = (Airliner) AirlinerjTable.getValueAt(selectedrow, 0);
            UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 24));
            int cfr = JOptionPane.showConfirmDialog(null, "Are you sure to delete the details");
            if (cfr == 0) {
                airlinerDirect.deleteAirliner(airliner);
                DefaultTableModel dm = (DefaultTableModel) AirlinerjTable.getModel();
                dm.setRowCount(0);
                for (Airliner al : airlinerDirect.getAirlinerList()) {
                    Object data[] = new Object[3];
                    data[0] = al;
                    data[1] = al.getHeadQuarters();
                    data[2] = al.getFleetStrength();
                    dm.addRow(data);
                }
            }
            UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 24));
            JOptionPane.showMessageDialog(null, "Account has been deleted");

        } else {
            UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 24));
        }
            //JOptionPane.showMessageDialog(null,"Please select a row from the table");

    }//GEN-LAST:event_DeletejButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        UserProcessContainer.remove(this);
        CardLayout layout = (CardLayout) UserProcessContainer.getLayout();
        layout.previous(UserProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AirlinerjTable;
    private javax.swing.JButton DeletejButton;
    private javax.swing.JButton UpdatejButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
