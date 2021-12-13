/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HealthcareOfficerRole;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.SecretaryOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.GovernmentFundRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Dell
 */
public class OfficerProcessWorkRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    private JPanel jPanel;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private GovernmentFundRequest governmentFundRequest;
    private OfficerWorkAreaJPanel officerWorkAreaJPanel;

    public OfficerProcessWorkRequestJPanel(JPanel jPanel, UserAccount userAccount, GovernmentFundRequest fundRequest, Enterprise enterprise) {
        initComponents();

        this.jPanel = jPanel;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.governmentFundRequest = fundRequest;
        amountTxt.setText(String.valueOf(governmentFundRequest.getAmountRequested()));
        locationTxt.setText(governmentFundRequest.getRegion());
        populationTxt.setText(String.valueOf(governmentFundRequest.getPopulation()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        amountTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        messageTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        sendRequestToSecretaryBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        locationTxt = new javax.swing.JTextField();
        populationTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnReject = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        amountTxt.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel1.setText("Amount");

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel2.setText("Message");

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("PROCESSING THE REQUEST");

        sendRequestToSecretaryBtn.setBackground(new java.awt.Color(0, 153, 255));
        sendRequestToSecretaryBtn.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        sendRequestToSecretaryBtn.setText("Transfer Request to Secretary");
        sendRequestToSecretaryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendRequestToSecretaryBtnActionPerformed(evt);
            }
        });

        backBtn.setBackground(new java.awt.Color(0, 153, 255));
        backBtn.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        backBtn.setText("<<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel4.setText("Location");

        locationTxt.setEnabled(false);

        populationTxt.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel5.setText("Population");

        btnReject.setBackground(new java.awt.Color(0, 153, 255));
        btnReject.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btnReject.setText("Reject");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGap(38, 38, 38)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(amountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(locationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel5))
                            .addGap(38, 38, 38)
                            .addComponent(populationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(messageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addContainerGap(182, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sendRequestToSecretaryBtn)
                .addGap(48, 48, 48)
                .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn)))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(locationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(populationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(messageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sendRequestToSecretaryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(117, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        jPanel.remove(this);
        Component[] componentArray = jPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        OfficerWorkAreaJPanel owjp = (OfficerWorkAreaJPanel) component;
        owjp.populateTable();
        CardLayout layout = (CardLayout) jPanel.getLayout();
        layout.previous(jPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void sendRequestToSecretaryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendRequestToSecretaryBtnActionPerformed
        // TODO add your handling code here:

        String message = messageTxt.getText();
        if (message.equals("")) {
            JOptionPane.showMessageDialog(null, "Message is mandatory!");
            return;
        } else {
            governmentFundRequest.setMessage(message);

            int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to proceed?");

            if (dialogResult == JOptionPane.YES_OPTION) {

                governmentFundRequest.setSender(userAccount);
                governmentFundRequest.setStatus("Sent to Secretary");

                Organization org = null;
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizations()) {
                    if (organization instanceof SecretaryOrganization) {
                        org = organization;
                        break;
                    }
                }
                if (org != null) {
                    org.getWorkQueue().getWorkRequests().add(governmentFundRequest);
                    userAccount.getWorkQueue().getWorkRequests().add(governmentFundRequest);
                }
                JOptionPane.showMessageDialog(null, "Request to Secretary Successful!!!");
                messageTxt.setText("");
                btnReject.setEnabled(false);
                sendRequestToSecretaryBtn.setEnabled(false);
            }
            messageTxt.setText("");
        }

    }//GEN-LAST:event_sendRequestToSecretaryBtnActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        String message = messageTxt.getText();
        if (message.equals("")) {
            JOptionPane.showMessageDialog(null, "Message is mandatory!");
            return;
        } else {
            governmentFundRequest.setMessage(message);
            int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to proceed?");

            if (dialogResult == JOptionPane.YES_OPTION) {
                governmentFundRequest.setStatus("Rejected");
                messageTxt.setText("");
                btnReject.setEnabled(false);
                sendRequestToSecretaryBtn.setEnabled(false);
            }

            messageTxt.setText("");
        }
    }//GEN-LAST:event_btnRejectActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountTxt;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton btnReject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField locationTxt;
    private javax.swing.JTextField messageTxt;
    private javax.swing.JTextField populationTxt;
    private javax.swing.JButton sendRequestToSecretaryBtn;
    // End of variables declaration//GEN-END:variables
}
