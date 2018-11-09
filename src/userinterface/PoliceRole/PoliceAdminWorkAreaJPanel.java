/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PoliceRole;

import Business.EcoSystem;
import Business.Organization.PoliceOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PoliceRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.text.MessageFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class PoliceAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PoliceAdminWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private PoliceOrganization policeOrganization;

    public PoliceAdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, PoliceOrganization organization, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.policeOrganization = (PoliceOrganization) organization;
        populateTable();
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest request : policeOrganization.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[5];
            row[0] = request;
            row[1] = request.getSender().getEmployee().getName();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[3] = request.getStatus();
            model.addRow(row);
        }
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
        workRequestJTable = new javax.swing.JTable();
        assignJButton2 = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        refreshTestJButton1 = new javax.swing.JButton();

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ZipCode", "Person Name", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        assignJButton2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        assignJButton2.setText("Assign to me");
        assignJButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButton2ActionPerformed(evt);
            }
        });

        processJButton.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        processJButton.setText("Process");
        processJButton.setEnabled(false);
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButton1.setText("Generate Report");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        refreshTestJButton1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        refreshTestJButton1.setText("Refresh");
        refreshTestJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(assignJButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(83, 83, 83)
                            .addComponent(jButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(processJButton))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(refreshTestJButton1))
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(refreshTestJButton1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(assignJButton2)
                        .addComponent(processJButton))
                    .addComponent(jButton1))
                .addContainerGap(103, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assignJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButton2ActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            return;
        }

        WorkRequest request = (WorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatus("Pending");
         processJButton.setEnabled(true);
        populateTable();

    }//GEN-LAST:event_assignJButton2ActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row");
            return;
        }

        PoliceRequest request = (PoliceRequest) workRequestJTable.getValueAt(selectedRow, 0);

        request.setStatus("Processing");

        ReportCaseJPanel processWorkRequestJPanel = new ReportCaseJPanel(userProcessContainer, business, userAccount, request);
        userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_processJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        MessageFormat header = new MessageFormat("Accident Record");
        MessageFormat footer = new MessageFormat("Page(0,number,integer)");
        try {
            workRequestJTable.print(JTable.PrintMode.NORMAL, header, footer);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Cannot print");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void refreshTestJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButton1ActionPerformed
        // TODO add your handling code here
        populateTable();
    }//GEN-LAST:event_refreshTestJButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton2;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshTestJButton1;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}