/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.InsuranceAgentRole;

import Business.Enterprise.Enterprise;
import Business.Enterprise.InsuranceCompanyEnterprise;
import Business.Insurance.Insurance;
import Business.InsuranceCustomer.InsuranceCustomer;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Dell
 */

public class AddNewPolicyHolderJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateNewUserJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private InsuranceCompanyEnterprise insuranceCompanyEnterprise;
    private String policyNumber;

    public AddNewPolicyHolderJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, String policyNumber) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.insuranceCompanyEnterprise = (InsuranceCompanyEnterprise) enterprise;
        this.userAccount = userAccount;
        this.policyNumber = policyNumber;
        populateFields();
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

        lblInsuranceMember = new javax.swing.JLabel();
        lblPolicyNumber = new javax.swing.JLabel();
        txtPolicyNumber = new javax.swing.JTextField();
        lblFirstName = new javax.swing.JLabel();
        txtFName = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblSocialSecurityNumber = new javax.swing.JLabel();
        txtSSN = new javax.swing.JTextField();
        lblDOB = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblPolicyName = new javax.swing.JLabel();
        cmbInsurancePolicyName = new javax.swing.JComboBox();
        btnAddCustomer = new javax.swing.JButton();
        jDateChooserDob = new com.toedter.calendar.JDateChooser();
        lblPersonalInformation = new javax.swing.JLabel();
        lblInsuranceInformation = new javax.swing.JLabel();
        lblContact = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        lblPolicyCoverage = new javax.swing.JLabel();
        txtInsuranceCoverage = new javax.swing.JTextField();
        cmbGender = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomerPolicy = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblNewPolicyHolders = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        lblInsuranceMember.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        lblInsuranceMember.setForeground(new java.awt.Color(153, 0, 0));
        lblInsuranceMember.setText("ADD NEW INSURANCE MEMBER");

        lblPolicyNumber.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        lblPolicyNumber.setForeground(new java.awt.Color(0, 51, 51));
        lblPolicyNumber.setText("Policy Number :");

        lblFirstName.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        lblFirstName.setForeground(new java.awt.Color(0, 51, 51));
        lblFirstName.setText("First Name :");

        lblLastName.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        lblLastName.setForeground(new java.awt.Color(0, 51, 51));
        lblLastName.setText("Last Name :");

        lblSocialSecurityNumber.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        lblSocialSecurityNumber.setForeground(new java.awt.Color(0, 51, 51));
        lblSocialSecurityNumber.setText("SSN :");

        lblDOB.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        lblDOB.setForeground(new java.awt.Color(0, 51, 51));
        lblDOB.setText("Date of birth :");

        lblGender.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        lblGender.setForeground(new java.awt.Color(0, 51, 51));
        lblGender.setText("Gender :");

        lblAddress.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        lblAddress.setForeground(new java.awt.Color(0, 51, 51));
        lblAddress.setText("Address :");

        lblPolicyName.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        lblPolicyName.setForeground(new java.awt.Color(0, 51, 51));
        lblPolicyName.setText("Insurance Policy Name :");

        cmbInsurancePolicyName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmbInsurancePolicyNameFocusGained(evt);
            }
        });
        cmbInsurancePolicyName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbInsurancePolicyNameActionPerformed(evt);
            }
        });

        btnAddCustomer.setBackground(new java.awt.Color(0, 153, 255));
        btnAddCustomer.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btnAddCustomer.setText("Add Customer");
        btnAddCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCustomerActionPerformed(evt);
            }
        });

        jDateChooserDob.setMaxSelectableDate(Calendar.getInstance().getTime());

        lblPersonalInformation.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        lblPersonalInformation.setForeground(new java.awt.Color(0, 51, 51));
        lblPersonalInformation.setText("Personal Information");

        lblInsuranceInformation.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        lblInsuranceInformation.setForeground(new java.awt.Color(0, 51, 51));
        lblInsuranceInformation.setText("Insurance  Information");

        lblContact.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        lblContact.setForeground(new java.awt.Color(0, 51, 51));
        lblContact.setText("Phone :");

        lblPolicyCoverage.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        lblPolicyCoverage.setForeground(new java.awt.Color(0, 51, 51));
        lblPolicyCoverage.setText("Insurance Coverage % :");

        cmbGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Female", "Male", "Other" }));

        tblCustomerPolicy.setBackground(new java.awt.Color(204, 204, 255));
        tblCustomerPolicy.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Customer Name", "Policy Number", "Policy Name", "Coverage %"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCustomerPolicy);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("All Customers");

        btnBack.setBackground(new java.awt.Color(0, 153, 255));
        btnBack.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblNewPolicyHolders.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNewPolicyHolders.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/new customer.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(lblAddress)
                        .addGap(56, 56, 56)
                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDOB)
                                    .addComponent(lblSocialSecurityNumber)
                                    .addComponent(lblFirstName))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblGender)
                                    .addComponent(lblContact)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jDateChooserDob, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(28, 28, 28)
                                        .addComponent(lblLastName)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtContact)
                                    .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 813, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(54, 54, 54)
                            .addComponent(jLabel16)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNewPolicyHolders, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(btnBack)
                                    .addGap(297, 297, 297)
                                    .addComponent(lblInsuranceMember))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(117, 117, 117)
                                    .addComponent(lblPolicyNumber)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblPersonalInformation)
                                        .addComponent(txtPolicyNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(31, 31, 31)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnAddCustomer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(lblPolicyCoverage)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(lblPolicyName)
                                                    .addGap(20, 20, 20)))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cmbInsurancePolicyName, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtInsuranceCoverage, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblInsuranceInformation)
                                    .addGap(20, 20, 20))))))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInsuranceMember)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInsuranceInformation)
                    .addComponent(lblPersonalInformation))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPolicyNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPolicyNumber))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFirstName)
                            .addComponent(lblLastName)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbInsurancePolicyName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPolicyName))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtInsuranceCoverage, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPolicyCoverage))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblGender))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblDOB)
                                .addComponent(jDateChooserDob, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblContact)
                            .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSocialSecurityNumber)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnAddCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddress))
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNewPolicyHolders, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1044, 1044, 1044))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCustomerActionPerformed

        if (txtFName.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Enter first name!");
            return;
        }

        if (txtName.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Enter last name!");
            return;
        }

        if (jDateChooserDob.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Please Enter Date of birth!");
            return;
        }

        if (cmbGender.getItemCount() == 0) {
            JOptionPane.showMessageDialog(null, "Please Enter Gender!");
            return;
        }

        if (cmbGender.getItemCount() == 0) {
            JOptionPane.showMessageDialog(null, "Please Enter Gender!");
            return;
        }

        if (txtSSN.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Enter SSN!");
            return;
        }

        if (txtContact.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Enter phone!");
            return;
        }

        if (txtAddress.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Enter address");
            return;
        }

        if (txtInsuranceCoverage.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please provide Insurance Coverage");
            return;
        } else {

            String firstName = txtFName.getText().trim();
            String lastName = txtName.getText().trim();
            SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
            String dateOfBirth = "";
            try {
                dateOfBirth = sdf.format(jDateChooserDob.getDate());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Please select customer's dob");
            }
            String gender = cmbGender.getSelectedItem().toString();

            String ssn ;
            ssn = txtSSN.getText().trim();
            if (!ssnValidate()) {
                JOptionPane.showMessageDialog(null, "/* United States Social Security numbers are nine-digit numbers in the format AAA-GG-SSSS with following rules. */             \n"
                        + "              \"The first three digits called the area number. The area number cannot be 000, 666, or between 900 and 999\",\n"
                        + "                \" Digits four and five are called the group number and range from 01 to 99\",\n"
                        + "              \"The last four digits are serial numbers from 0001 to 9999.\"");
                txtSSN.setBorder(BorderFactory.createLineBorder(Color.RED));

                return;
            }

            if (ssnValidate()) {
                txtSSN.setBorder(BorderFactory.createLineBorder(Color.GRAY));

            }

            String address = txtAddress.getText().trim();

            String phone = txtContact.getText().trim();

            if (!phonePatternCorrect()) {
                JOptionPane.showMessageDialog(null, "/* Following are valid phone number examples */             \n"
                        + "              \"1234567890\", \"123-456-7890\", \"(123)4567890\", \"(123)456-7890\",\n"
                        + "              /* Following are invalid phone numbers */ \n"
                        + "              \"(1234567890)\",\"123)4567890\", \"12345678901\", \"(1)234567890\",");
                txtContact.setBorder(BorderFactory.createLineBorder(Color.RED));

                return;
            }

            if (phonePatternCorrect()) {
                txtContact.setBorder(BorderFactory.createLineBorder(Color.GRAY));

            }

            String policyNumber = txtPolicyNumber.getText().trim();
            String insurancePolicyName = cmbInsurancePolicyName.getSelectedItem().toString();

            double coverage = Double.parseDouble(txtInsuranceCoverage.getText().trim());

            try {
                Double.parseDouble(txtInsuranceCoverage.getText().trim());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please provide numerical values in coverage textfield!");
                return;
            }

            Insurance insurance = new Insurance(insurancePolicyName, insuranceCompanyEnterprise.getName(), coverage);

            InsuranceCustomer insuranceCustomer = new InsuranceCustomer(policyNumber, insurance);

            insuranceCustomer.setFirstName(firstName);
            insuranceCustomer.setLastName(lastName);
            insuranceCustomer.setDob(dateOfBirth);
            insuranceCustomer.setSex(gender);
            insuranceCustomer.setSocialSecurityID(ssn);
            insuranceCustomer.setContactNumber(phone);
            insuranceCustomer.setAddress(address);

            insuranceCustomer.setInsurance(insurance);

            insuranceCompanyEnterprise.getInsuranceCustomerList().getInsuranceHolders().add(insuranceCustomer);

            insuranceCompanyEnterprise.getInsuranceCustomerList().getInsuranceHolders();

            populateTable();
            refresh();
            JOptionPane.showMessageDialog(null, "Customer is created ! ");

        }

    }//GEN-LAST:event_btnAddCustomerActionPerformed

    private void cmbInsurancePolicyNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbInsurancePolicyNameFocusGained
        System.out.println("Gained");
    }//GEN-LAST:event_cmbInsurancePolicyNameFocusGained

    private void cmbInsurancePolicyNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbInsurancePolicyNameActionPerformed

        Insurance selectedPolicy = (Insurance) cmbInsurancePolicyName.getSelectedItem();
        txtInsuranceCoverage.setText(String.valueOf(selectedPolicy.getCoveragepercentage()));
    }//GEN-LAST:event_cmbInsurancePolicyNameActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCustomer;
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox cmbGender;
    private javax.swing.JComboBox cmbInsurancePolicyName;
    private com.toedter.calendar.JDateChooser jDateChooserDob;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblContact;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblInsuranceInformation;
    private javax.swing.JLabel lblInsuranceMember;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblNewPolicyHolders;
    private javax.swing.JLabel lblPersonalInformation;
    private javax.swing.JLabel lblPolicyCoverage;
    private javax.swing.JLabel lblPolicyName;
    private javax.swing.JLabel lblPolicyNumber;
    private javax.swing.JLabel lblSocialSecurityNumber;
    private javax.swing.JTable tblCustomerPolicy;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtInsuranceCoverage;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPolicyNumber;
    private javax.swing.JTextField txtSSN;
    // End of variables declaration//GEN-END:variables

    private boolean phonePatternCorrect() {

        Pattern pattern = Pattern.compile("\\d{10}|(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}");
        Matcher matcher = pattern.matcher(txtContact.getText());

        boolean b = false;

        if (matcher.matches()) {
            b = true;
        } else {
            b = false;
        }

        return b;
    }

    private boolean ssnValidate() {

        Pattern pattern = Pattern.compile("^(?!000|111)[0-8][0-9]{2}-(?!00)[0-9]{2}-(?!0000|1111)[0-9]{4}$");
        
        Matcher matcher = pattern.matcher(txtSSN.getText());

        boolean validate = false;

        if (matcher.matches()) {
            validate = true;
        } else {
            validate = false;
        }

        return validate;
    }

    private void refresh() {

        txtPolicyNumber.setText(UUID.randomUUID().toString().substring(0, 7));
        txtFName.setText("");
        txtName.setText("");
        txtContact.setText("");
        txtSSN.setText("");
        jDateChooserDob.setDate(null);
        txtAddress.setText("");

    }

    private void populateFields() {
        txtPolicyNumber.setText(policyNumber);
        List<Insurance> policies = insuranceCompanyEnterprise.getInsurancePolicyList().getInsurancePolicies();

        for (Insurance policy : policies) {
            cmbInsurancePolicyName.addItem(policy);
        }

        Insurance selectedPolicy = (Insurance) cmbInsurancePolicyName.getSelectedItem();
        
        if(selectedPolicy != null)
        {
        txtInsuranceCoverage.setText(String.valueOf(selectedPolicy.getCoveragepercentage()));
        }
        else{
            JOptionPane.showMessageDialog(null , "No Existing policy!");
            return;
        }

    }

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblCustomerPolicy.getModel();

        dtm.setRowCount(0);
        List<InsuranceCustomer> customers = insuranceCompanyEnterprise.getInsuranceCustomerList().getInsuranceHolders();
        for (InsuranceCustomer customer : customers) {
            Object[] row = new Object[4];
            row[0] = customer.getFirstName() + " " + customer.getLastName();
            row[1] = customer;
            row[2] = customer.getInsurance().getPolicyName();
            row[3] = customer.getInsurance().getCoveragepercentage();

            dtm.addRow(row);
        }
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(dtm);
        tblCustomerPolicy.setRowSorter(sorter);
    }
}
