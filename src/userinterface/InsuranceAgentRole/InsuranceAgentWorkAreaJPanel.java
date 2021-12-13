/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.InsuranceAgentRole;

import Business.Enterprise.Enterprise;
import Business.Organization.InsuranceAgentOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.UUID;
import javax.swing.JPanel;

/**
 *
 * @author Dell
 */
public class InsuranceAgentWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form InsuranceAgentWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private InsuranceAgentOrganization insuranceAgentOrganization;
    private Enterprise enterprise;

    public InsuranceAgentWorkAreaJPanel(JPanel jpanel, UserAccount userAccount, Organization organization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = jpanel;
        this.userAccount = userAccount;
        this.insuranceAgentOrganization = (InsuranceAgentOrganization) organization;
        this.enterprise = enterprise;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAddNewUser = new javax.swing.JButton();
        btnProcessInsuranceRequests = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        btnAddNewUser.setBackground(new java.awt.Color(0, 153, 255));
        btnAddNewUser.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btnAddNewUser.setText("Create New Member");
        btnAddNewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewUserActionPerformed(evt);
            }
        });
        add(btnAddNewUser);
        btnAddNewUser.setBounds(20, 30, 184, 41);

        btnProcessInsuranceRequests.setBackground(new java.awt.Color(0, 153, 255));
        btnProcessInsuranceRequests.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btnProcessInsuranceRequests.setText("Process Insurance Requests");
        btnProcessInsuranceRequests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessInsuranceRequestsActionPerformed(evt);
            }
        });
        add(btnProcessInsuranceRequests);
        btnProcessInsuranceRequests.setBounds(460, 370, 220, 39);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/health insurance.gif"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(1, 5, 690, 430);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddNewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewUserActionPerformed
        String policyNumber = UUID.randomUUID().toString().substring(0, 7);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("AddNewPolicyHolderJPanel", new AddNewPolicyHolderJPanel(userProcessContainer, userAccount, enterprise, policyNumber));
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnAddNewUserActionPerformed

    private void btnProcessInsuranceRequestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessInsuranceRequestsActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ProcessInsuranceRequestsJPanel", new AllInsuranceRequestsJPanel(userProcessContainer, userAccount, enterprise, insuranceAgentOrganization));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnProcessInsuranceRequestsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNewUser;
    private javax.swing.JButton btnProcessInsuranceRequests;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
