/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.InsurancePolicyPlannerRole;

import Business.Enterprise.Enterprise;
import Business.Enterprise.InsuranceCompanyEnterprise;
import Business.Insurance.Insurance;
import Business.Organization.InsurancePolicyPlannerOrganization;
import Business.UserAccount.UserAccount;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author VIRAJ
 */
public class InsurancePolicyPlannerWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private InsurancePolicyPlannerOrganization insurancePolicyPlannerOrganization;
    private InsuranceCompanyEnterprise insuranceCompanyEnterprise;

    /**
     * Creates new form InsurancePolicyPlannerJPanel
     */
    public InsurancePolicyPlannerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, InsurancePolicyPlannerOrganization insurancePolicyPlannerOrganization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.insurancePolicyPlannerOrganization = insurancePolicyPlannerOrganization;
        this.insuranceCompanyEnterprise = (InsuranceCompanyEnterprise) enterprise;

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

        lblCreateNewPolicy = new javax.swing.JLabel();
        lblPolicyName = new javax.swing.JLabel();
        txtPolicyName = new javax.swing.JTextField();
        txtPolicyCoveragePercentage = new javax.swing.JTextField();
        lblCoverage = new javax.swing.JLabel();
        txtPolicyTC = new javax.swing.JTextField();
        lblTermsAndConditions = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblPolicyPlannerWorkArea = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPolicies = new javax.swing.JTable();
        btnCreatePolicy = new javax.swing.JButton();
        lblMonthyPremium = new javax.swing.JLabel();
        txtMonthlyPremium = new javax.swing.JTextField();
        lblPhoto = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        lblCreateNewPolicy.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        lblCreateNewPolicy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreateNewPolicy.setText("CREATE NEW POLICY");

        lblPolicyName.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        lblPolicyName.setText("Policy Name: ");

        lblCoverage.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        lblCoverage.setText("Policy Coverage: ");

        lblTermsAndConditions.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        lblTermsAndConditions.setText("Policy Terms & Conditions: ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("%");

        lblPolicyPlannerWorkArea.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        lblPolicyPlannerWorkArea.setForeground(new java.awt.Color(153, 0, 0));
        lblPolicyPlannerWorkArea.setText("POLICY PLANNER WORK AREA");

        tblPolicies.setBackground(new java.awt.Color(204, 204, 255));
        tblPolicies.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Policy Name", "Policy Coverage %", "Monthly Premium", "Policy T&C"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPolicies);

        btnCreatePolicy.setBackground(new java.awt.Color(0, 153, 255));
        btnCreatePolicy.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btnCreatePolicy.setText("Create Policy");
        btnCreatePolicy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatePolicyActionPerformed(evt);
            }
        });

        lblMonthyPremium.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        lblMonthyPremium.setText("Monthly Premium(USD):");

        lblPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/policy.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 46, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 963, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(176, 176, 176)
                        .addComponent(lblPolicyPlannerWorkArea))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(439, 439, 439)
                        .addComponent(lblCreateNewPolicy, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPolicyName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPolicyName, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCoverage, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPolicyCoveragePercentage, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblMonthyPremium)
                                .addGap(18, 18, 18)
                                .addComponent(txtMonthlyPremium, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTermsAndConditions, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtPolicyTC, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(434, 434, 434)
                        .addComponent(btnCreatePolicy)))
                .addContainerGap(351, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(lblPolicyPlannerWorkArea, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(lblCreateNewPolicy)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPolicyName)
                    .addComponent(txtPolicyName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCoverage)
                    .addComponent(txtPolicyCoveragePercentage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMonthyPremium)
                    .addComponent(txtMonthlyPremium, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTermsAndConditions)
                    .addComponent(txtPolicyTC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCreatePolicy)
                .addContainerGap(125, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreatePolicyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatePolicyActionPerformed
        String policyName = txtPolicyName.getText().trim();
        String poliCoverageTxt = txtPolicyCoveragePercentage.getText().trim();
        String monthlyPremiumTxt = txtMonthlyPremium.getText().trim();
        String policyTC = txtPolicyTC.getText().trim();
        if (policyName.isEmpty() || poliCoverageTxt.isEmpty() || monthlyPremiumTxt.isEmpty() || policyTC.isEmpty() ){
            JOptionPane.showMessageDialog(null, "All 4 fields are mandatory.");
        }

        double policyCoverage = 0;
        try {
            policyCoverage = Double.parseDouble(poliCoverageTxt);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter numeric values for insurance coverage");

            return;
        }

        double monthlyPremium = 0;
        try {
            monthlyPremium = Double.parseDouble(monthlyPremiumTxt);
        } catch (NumberFormatException ne) {
            JOptionPane.showMessageDialog(null, "Please enter numeric values for monthly premium");
        }

        List<Insurance> policies = insuranceCompanyEnterprise.getInsurancePolicyList().getInsurancePolicies();
        for (Insurance insurance : policies) {
            if (policyName.equalsIgnoreCase(insurance.getPolicyName())) {
                JOptionPane.showMessageDialog(null, "This policy already exists, please provide another policy name.");
                return;
            }
        }
        Insurance insurance = new Insurance(policyName, insuranceCompanyEnterprise.getName(), policyCoverage);
        insurance.setPolicyTC(policyTC);
        insurance.setMonthlyInstallment(monthlyPremium);

        // InsuranceCompanyEnterprise insuranceCompanyEnterprise = insuranceCompanyEnterprise;
        insuranceCompanyEnterprise.getInsurancePolicyList().getInsurancePolicies().add(insurance);
        JOptionPane.showMessageDialog(null, "Policy Added Successfully");
        System.out.println("Policy Added Successfully:" + insuranceCompanyEnterprise.getInsurancePolicyList().getInsurancePolicies());
        populateTable();
        txtPolicyName.setText("");
        txtMonthlyPremium.setText("");
        txtPolicyCoveragePercentage.setText("");
        txtPolicyTC.setText("");

    }//GEN-LAST:event_btnCreatePolicyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreatePolicy;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCoverage;
    private javax.swing.JLabel lblCreateNewPolicy;
    private javax.swing.JLabel lblMonthyPremium;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblPolicyName;
    private javax.swing.JLabel lblPolicyPlannerWorkArea;
    private javax.swing.JLabel lblTermsAndConditions;
    private javax.swing.JTable tblPolicies;
    private javax.swing.JTextField txtMonthlyPremium;
    private javax.swing.JTextField txtPolicyCoveragePercentage;
    private javax.swing.JTextField txtPolicyName;
    private javax.swing.JTextField txtPolicyTC;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
//        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        DefaultTableModel model = (DefaultTableModel) tblPolicies.getModel();
        model.setRowCount(0);
        List<Insurance> policies = insuranceCompanyEnterprise.getInsurancePolicyList().getInsurancePolicies();
        for (Insurance insurancePolicy : policies) {
            Object[] row = new Object[4];
            row[0] = insurancePolicy;
            row[1] = insurancePolicy.getCoveragepercentage();
            row[2] = insurancePolicy.getMonthlyInstallment();
            row[3] = insurancePolicy.getPolicyTC();
            model.addRow(row);
        }
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        tblPolicies.setRowSorter(sorter);
    }
}
