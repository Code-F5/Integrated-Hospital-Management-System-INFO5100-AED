/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.InsuranceAgentRole;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.InsuranceFinanceOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.InsuranceWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class ProcessRequestJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account;
    private Enterprise enterprise;
    private InsuranceWorkRequest insuranceWorkRequest;

    /**
     * Creates new form ProcessRequestJPanel
     */
    public ProcessRequestJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, InsuranceWorkRequest insuranceWorkRequest) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.insuranceWorkRequest = insuranceWorkRequest;
        this.account = userAccount;
        populateFields();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPolicyNumber = new javax.swing.JLabel();
        txtPolicyNumber = new javax.swing.JTextField();
        lblClaimAmount = new javax.swing.JLabel();
        txtClaimAmount = new javax.swing.JTextField();
        lblMassage = new javax.swing.JLabel();
        txtMessage = new javax.swing.JTextField();
        btnAccept = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        lblCustomerName = new javax.swing.JLabel();
        txtCustomerName = new javax.swing.JTextField();
        lblTotalBill = new javax.swing.JLabel();
        txtBillAmount = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        lblPolicyNumber.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        lblPolicyNumber.setText("Policy Number :");
        add(lblPolicyNumber);
        lblPolicyNumber.setBounds(169, 98, 120, 17);

        txtPolicyNumber.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtPolicyNumber.setEnabled(false);
        add(txtPolicyNumber);
        txtPolicyNumber.setBounds(307, 96, 145, 20);

        lblClaimAmount.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        lblClaimAmount.setText("Claim Amount :");
        add(lblClaimAmount);
        lblClaimAmount.setBounds(170, 210, 98, 17);

        txtClaimAmount.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtClaimAmount.setEnabled(false);
        add(txtClaimAmount);
        txtClaimAmount.setBounds(308, 210, 144, 20);

        lblMassage.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        lblMassage.setText("Message :");
        add(lblMassage);
        lblMassage.setBounds(200, 250, 70, 17);

        txtMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMessageActionPerformed(evt);
            }
        });
        add(txtMessage);
        txtMessage.setBounds(309, 248, 265, 23);

        btnAccept.setBackground(new java.awt.Color(0, 153, 255));
        btnAccept.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btnAccept.setText("Route To Finance Department");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });
        add(btnAccept);
        btnAccept.setBounds(240, 300, 250, 34);

        btnReject.setBackground(new java.awt.Color(0, 153, 255));
        btnReject.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btnReject.setText("Reject");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });
        add(btnReject);
        btnReject.setBounds(240, 360, 250, 34);

        lblCustomerName.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        lblCustomerName.setText("Customer Name :");
        add(lblCustomerName);
        lblCustomerName.setBounds(163, 136, 120, 17);

        txtCustomerName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtCustomerName.setEnabled(false);
        add(txtCustomerName);
        txtCustomerName.setBounds(306, 134, 146, 20);

        lblTotalBill.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        lblTotalBill.setText("Total Bill Amount :");
        add(lblTotalBill);
        lblTotalBill.setBounds(130, 170, 140, 17);

        txtBillAmount.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtBillAmount.setEnabled(false);
        add(txtBillAmount);
        txtBillAmount.setBounds(308, 172, 144, 20);

        btnBack.setBackground(new java.awt.Color(0, 153, 255));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(10, 11, 81, 25);

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("FINANCE DEPARTMENT APPROVAL PANEL");
        add(jLabel1);
        jLabel1.setBounds(210, 20, 380, 25);
    }// </editor-fold>//GEN-END:initComponents

    private void txtMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMessageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMessageActionPerformed

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed

        String msg ;
        msg = txtMessage.getText();
        if (msg.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Message is must to be entered!");
            return;
        } else {
            insuranceWorkRequest.setMessage(msg);
            int dialogResult = JOptionPane.showConfirmDialog(null, "Would you like to proceed?");

            if (dialogResult == JOptionPane.YES_OPTION) {
                Organization org = null;
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizations()) {
                    if (organization instanceof InsuranceFinanceOrganization) {
                        org = organization;
                        break;
                    }
                }

                if (org != null) {
                    org.getWorkQueue().getWorkRequests().add(insuranceWorkRequest);
                    account.getWorkQueue().getWorkRequests().add(insuranceWorkRequest);
                }

                JOptionPane.showMessageDialog(null, "Request is approved routed To Finance Department");
                insuranceWorkRequest.setStatus("Sent To Finance Department");
                insuranceWorkRequest.setAgent(account.getEmployee().getEmployeename());
                insuranceWorkRequest.setReceiver(null);

                txtMessage.setText("");
                btnReject.setEnabled(false);
                btnAccept.setEnabled(false);

            }
            txtMessage.setText("");
        }
    }//GEN-LAST:event_btnAcceptActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        AllInsuranceRequestsJPanel allInsuranceRequestsJPanel = (AllInsuranceRequestsJPanel) component;
        allInsuranceRequestsJPanel.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);


    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed

        String message = txtMessage.getText();
        if (message.equals("")) {
            JOptionPane.showMessageDialog(null, "Message is must to be entered!");
            return;
        } else {
            insuranceWorkRequest.setMessage(message);

            int dialogResult = JOptionPane.showConfirmDialog(null, "Would you like to proceed?");
            if (dialogResult == JOptionPane.YES_OPTION) {

                insuranceWorkRequest.setStatus("Rejected");
                insuranceWorkRequest.setMessage(txtMessage.getText().trim());
                insuranceWorkRequest.setAgent(account.getEmployee().getEmployeename());
                txtMessage.setText("");
                btnReject.setEnabled(false);
                btnAccept.setEnabled(false);
            }
            txtMessage.setText("");
        }
    }//GEN-LAST:event_btnRejectActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnReject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblClaimAmount;
    private javax.swing.JLabel lblCustomerName;
    private javax.swing.JLabel lblMassage;
    private javax.swing.JLabel lblPolicyNumber;
    private javax.swing.JLabel lblTotalBill;
    private javax.swing.JTextField txtBillAmount;
    private javax.swing.JTextField txtClaimAmount;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtMessage;
    private javax.swing.JTextField txtPolicyNumber;
    // End of variables declaration//GEN-END:variables

    private void populateFields() {

        txtPolicyNumber.setText(insuranceWorkRequest.getPolicyId());
        txtCustomerName.setText(insuranceWorkRequest.getInsuranceCustomer().getFirstName() + " " + insuranceWorkRequest.getInsuranceCustomer().getLastName());
        txtBillAmount.setText(String.valueOf(insuranceWorkRequest.getAmountBilled()));
        txtClaimAmount.setText(String.valueOf(insuranceWorkRequest.getAmountClaimed()));

    }
}
