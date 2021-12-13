/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;


import Business.Enterprise.Enterprise;
import Business.Organization.DoctorOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PatientTreatmentWorkRequest;
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
public class DoctorWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private DoctorOrganization doctorOrganization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    //private Map<PatientTreatmentWorkRequest, LabTestWorkRequest> patientToLab = new HashMap<>();

    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public DoctorWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, DoctorOrganization organization, Enterprise enterprise) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.doctorOrganization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        valueLabel.setText(enterprise.getName());
        populateRequestTable();
    }

    public void populateRequestTable() {

        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest request : doctorOrganization.getWorkQueue().getWorkRequests()) {
            Object[] row = new Object[8];
            row[0] = ((PatientTreatmentWorkRequest) request).getRegistrationDate();
            row[1] = String.valueOf(((PatientTreatmentWorkRequest) request).getPatient().getId());
            row[2] = ((PatientTreatmentWorkRequest) request).getPatient().getFirstName() + " " + ((PatientTreatmentWorkRequest) request).getPatient().getLastName();
            row[3] = ((PatientTreatmentWorkRequest) request);
            row[4] = ((PatientTreatmentWorkRequest) request).getAssignedDoctor();
            row[5] = ((PatientTreatmentWorkRequest) request).getLabAssistant();
            row[6] = ((PatientTreatmentWorkRequest) request).getLabResult();
            row[7] = request.getStatus();

            model.addRow(row);

        }
        
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        workRequestJTable.setRowSorter(sorter);
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
        requestTestJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnAssignToMe = new javax.swing.JButton();
        btnProvidePrescription = new javax.swing.JButton();
        btnComplete = new javax.swing.JButton();
        btnViewPatient = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        workRequestJTable.setBackground(new java.awt.Color(0, 153, 255));
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient Registration Date", "Patient Id", "Patient Name", "Illness", "Assigned Doctor", "Lab Assistant", "Lab Result", "Treatment Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        requestTestJButton.setBackground(new java.awt.Color(0, 153, 255));
        requestTestJButton.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        requestTestJButton.setText("Request Lab Test");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });

        enterpriseLabel.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        enterpriseLabel.setText("Enterprise :");

        valueLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        valueLabel.setText("<value>");

        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        jLabel1.setText("Medical Test Work Queue");

        btnAssignToMe.setBackground(new java.awt.Color(0, 153, 255));
        btnAssignToMe.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btnAssignToMe.setText("Assign To Me");
        btnAssignToMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignToMeActionPerformed(evt);
            }
        });

        btnProvidePrescription.setBackground(new java.awt.Color(0, 153, 255));
        btnProvidePrescription.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btnProvidePrescription.setText("Provide Prescription");
        btnProvidePrescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProvidePrescriptionActionPerformed(evt);
            }
        });

        btnComplete.setBackground(new java.awt.Color(0, 153, 255));
        btnComplete.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btnComplete.setText("Complete Treatment");
        btnComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteActionPerformed(evt);
            }
        });

        btnViewPatient.setBackground(new java.awt.Color(0, 153, 255));
        btnViewPatient.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btnViewPatient.setText("View Patient");
        btnViewPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPatientActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("WORKAREA FOR DOCTOR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnViewPatient)
                                .addGap(29, 29, 29)
                                .addComponent(btnAssignToMe)
                                .addGap(31, 31, 31)
                                .addComponent(requestTestJButton)
                                .addGap(30, 30, 30)
                                .addComponent(btnProvidePrescription)
                                .addGap(18, 18, 18)
                                .addComponent(btnComplete))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(260, 260, 260)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(enterpriseLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(241, 241, 241)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(287, 287, 287))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAssignToMe, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProvidePrescription, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(requestTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnComplete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(549, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();
        PatientTreatmentWorkRequest workRequest;

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        } else {
            workRequest = (PatientTreatmentWorkRequest) workRequestJTable.getValueAt(selectedRow, 3);
            if (workRequest.getAssignedDoctor() != null) {
                if (userAccount.equals(workRequest.getAssignedDoctor())) {
                    if (workRequest.getStatus().equalsIgnoreCase("Under Consultation")) {

                        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                        userProcessContainer.add("RequestLabTestJPanel", new RequestLabTestJPanel(userProcessContainer, userAccount, enterprise, workRequest));
                        layout.next(userProcessContainer);
                    } else {
                        JOptionPane.showMessageDialog(null, "Can not create the Lab request as the current status is " + workRequest.getStatus());
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Not Authorised");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please assign the request first");
            }
        }


    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void btnAssignToMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignToMeActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        } else {

            WorkRequest patientTreatmentWorkRequest = (PatientTreatmentWorkRequest) workRequestJTable.getValueAt(selectedRow, 3);
            if (((PatientTreatmentWorkRequest) patientTreatmentWorkRequest).getAssignedDoctor() == null) {

                if (patientTreatmentWorkRequest.getStatus().equalsIgnoreCase("Waiting for Doctor")) {
                    //patientTreatmentWorkRequest.setReceiver(userAccount);
                    ((PatientTreatmentWorkRequest) patientTreatmentWorkRequest).setAssignedDoctor(userAccount);
                    patientTreatmentWorkRequest.setStatus("Under Consultation");
                    populateRequestTable();
                    JOptionPane.showMessageDialog(null, "Success !! Request is assigned to you ");
                } else {
                    JOptionPane.showMessageDialog(null, "Cannot assign this patient as its current state is: " + patientTreatmentWorkRequest.getStatus());
                }

            } else {
                if(userAccount.equals(((PatientTreatmentWorkRequest) patientTreatmentWorkRequest).getAssignedDoctor())) {
                 JOptionPane.showMessageDialog(null, "Request is already assigned to you");
                } else {
                    JOptionPane.showMessageDialog(null, "Not Authorized");
                }
            }
        }
    }//GEN-LAST:event_btnAssignToMeActionPerformed

    private void btnViewPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPatientActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();
        PatientTreatmentWorkRequest patientWorkRequest;

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        } else {
            patientWorkRequest = (PatientTreatmentWorkRequest) workRequestJTable.getValueAt(selectedRow, 3);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            userProcessContainer.add("ViewPatientJPanel", new ViewPatientJPanel(userProcessContainer, userAccount, enterprise, patientWorkRequest));
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_btnViewPatientActionPerformed

    private void btnProvidePrescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProvidePrescriptionActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();
        PatientTreatmentWorkRequest workRequest;

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        } else {
            workRequest = (PatientTreatmentWorkRequest) workRequestJTable.getValueAt(selectedRow, 3);
            if(workRequest.getAssignedDoctor() != null)
            {
            if (userAccount.equals(workRequest.getAssignedDoctor())) {
                if (workRequest.getStatus().equalsIgnoreCase("Lab Test Completed") || workRequest.getStatus().equalsIgnoreCase("Under Consultation")) {

                    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                    userProcessContainer.add("ProvidePrescriptionJPanel", new ProvidePrescriptionJPanel(userProcessContainer, userAccount, enterprise, workRequest));
                    layout.next(userProcessContainer);
                } else {
                    JOptionPane.showMessageDialog(null, "Cannot prescribe the Patient as the status is: " + workRequest.getStatus());
                }
            } else {

                JOptionPane.showMessageDialog(null, "Not Authorised");
            }
        }
            else {
                JOptionPane.showMessageDialog(null, "Please assign the request first");
            }
        }
    }//GEN-LAST:event_btnProvidePrescriptionActionPerformed

    private void btnCompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();
        PatientTreatmentWorkRequest workRequest;

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        } else {
            workRequest = (PatientTreatmentWorkRequest) workRequestJTable.getValueAt(selectedRow, 3);
            if(workRequest.getAssignedDoctor() != null)
            {
            if (userAccount.equals(workRequest.getAssignedDoctor())) {
                if (workRequest.getStatus().equalsIgnoreCase("Prescription Provided")) {

                    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                    userProcessContainer.add("RequestBillingJPanel", new RequestBillingJPanel(userProcessContainer, userAccount, enterprise, workRequest));
                    workRequest.getPatient().setIsTreatmentComplete(true);
                    layout.next(userProcessContainer);
                } else {
                    if(workRequest.getStatus().equalsIgnoreCase("Consultation Completed"))
                    {
                        JOptionPane.showMessageDialog(null, "Treatment is already complete!");
                    }
                    else
                    {
                    JOptionPane.showMessageDialog(null, "Cannot complete the treatment. Please provide Prescription first!");
                }
                }
            } else {

                JOptionPane.showMessageDialog(null, "Not Authorised");
            }
        }
            else {
                JOptionPane.showMessageDialog(null, "Please assign the request first");
            }
        }
    }//GEN-LAST:event_btnCompleteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignToMe;
    private javax.swing.JButton btnComplete;
    private javax.swing.JButton btnProvidePrescription;
    private javax.swing.JButton btnViewPatient;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
