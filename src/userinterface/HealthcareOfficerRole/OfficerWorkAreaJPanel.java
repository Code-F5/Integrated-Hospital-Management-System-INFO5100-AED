/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HealthcareOfficerRole;

import Business.Enterprise.Enterprise;
import Business.Organization.HealthCareOfficerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.GovernmentFundRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Dell
 */
public class OfficerWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel jPanel;
    private UserAccount userAccount;
    private HealthCareOfficerOrganization healthCareOfficerOrganization;
    private Enterprise enterprise;

    /**
     * Creates new form OfficerWorkAreaJPanel1
     */
    public OfficerWorkAreaJPanel(JPanel jpanel, UserAccount userAccount, Organization organization, Enterprise enterprise) {
        initComponents();
        this.enterprise = enterprise;

        this.jPanel = jpanel;

        this.healthCareOfficerOrganization = (HealthCareOfficerOrganization) organization;
        this.userAccount = userAccount;

        populateTable();
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
        workRequestJTable = new javax.swing.JTable();
        btnAssign = new javax.swing.JButton();
        processRequestBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("WORK-AREA GOVERNMENT HEALTH OFFICER");

        workRequestJTable.setBackground(new java.awt.Color(0, 153, 255));
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Location", "Sender", "Receiver", "Status", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        btnAssign.setBackground(new java.awt.Color(0, 153, 255));
        btnAssign.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btnAssign.setText("Assign To Self");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        processRequestBtn.setBackground(new java.awt.Color(0, 153, 255));
        processRequestBtn.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        processRequestBtn.setText("Process Request");
        processRequestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processRequestBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(processRequestBtn)))
                .addContainerGap(228, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(processRequestBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(134, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {
        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row first from the table to view details");
            return;
        } else {
            WorkRequest request = (GovernmentFundRequest) workRequestJTable.getValueAt(selectedRow, 0);
            if (request.getStatus().equals("Sent")) {
                request.setReceiver(userAccount);
                request.setStatus("Pending on " + request.getReceiver().getEmployee().getEmployeename());
                populateTable();
                JOptionPane.showMessageDialog(null, "Success !! Request is assigned to you ");
            } else {
                JOptionPane.showMessageDialog(null, "Can't assign this work request, as the work request is in " + request.getStatus() + " status", "Warning!", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    private void processRequestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processRequestBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row first from the table to view details");
            return;
        } else {

            GovernmentFundRequest request = (GovernmentFundRequest) workRequestJTable.getValueAt(selectedRow, 0);

            if (request.getStatus().equals("Rejected")) {
                JOptionPane.showMessageDialog(null, "Cannot process a Rejected Request", "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (request.getStatus().equalsIgnoreCase("Sent to Secretary")) {
                JOptionPane.showMessageDialog(null, "Request already processed", "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (request.getStatus().equalsIgnoreCase("Sent")) {
                JOptionPane.showMessageDialog(null, "Assign the request first");
                return;
            }
            if (!userAccount.equals(request.getReceiver())) {
                JOptionPane.showMessageDialog(null, "Not Authorized", "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            }

            if (!userAccount.getEmployee().equals(request.getReceiver().getEmployee())) {
                JOptionPane.showMessageDialog(null, "Request assigned to other Officer", "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            } else {

                OfficerProcessWorkRequestJPanel panel = new OfficerProcessWorkRequestJPanel(jPanel, userAccount, request, enterprise);
                jPanel.add("OfficerProcessWorkRequestJPanel", panel);
                CardLayout layout = (CardLayout) jPanel.getLayout();
                layout.next(jPanel);

            }
    }//GEN-LAST:event_processRequestBtnActionPerformed
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processRequestBtn;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest request : healthCareOfficerOrganization.getWorkQueue().getWorkRequests()) {
            Object[] row = new Object[5];
            String status = request.getStatus();
            row[0] = ((GovernmentFundRequest) request);
            row[1] = request.getSender().getEmployee().getEmployeename();
            if (status.equalsIgnoreCase("Sent to Treasurer") || status.equalsIgnoreCase("Sent to Secretary")) {
                row[2] = null;
            } else {
                row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getEmployeename();
            }
            row[3] = request.getStatus();
            row[4] = ((GovernmentFundRequest) request).getAmountRequested();

            model.addRow(row);
        }
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        workRequestJTable.setRowSorter(sorter);
    }
}
