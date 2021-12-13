/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Insurance.InsurancePolicyDirectory;
import Business.InsuranceCustomer.InsuranceCustomerDirectory;
import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */

public class InsuranceCompanyEnterprise extends Enterprise {

    private InsuranceCustomerDirectory insuranceCustomerList;
    private InsurancePolicyDirectory insurancePolicyList;

    public InsuranceCompanyEnterprise(String name) {
        super(EnterpriseType.InsuranceCompany, name);
        insuranceCustomerList = new InsuranceCustomerDirectory();
        insurancePolicyList = new InsurancePolicyDirectory();

    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    @Override
    public List<Organization.Type> getOrganizationTypes() {
        List<Organization.Type> orgTypes = new ArrayList<>();
        orgTypes.add(Organization.Type.InsuranceAgent);
        orgTypes.add(Organization.Type.PolicyPlanner);
        orgTypes.add(Organization.Type.InsuranceFundOrganization);

        return orgTypes;
    }

    public InsuranceCustomerDirectory getInsuranceCustomerList() {
        return insuranceCustomerList;
    }

    public void setInsuranceCustomerList(InsuranceCustomerDirectory insuranceCustomerList) {
        this.insuranceCustomerList = insuranceCustomerList;
    }

    public InsurancePolicyDirectory getInsurancePolicyList() {
        return insurancePolicyList;
    }

    public void setInsurancePolicyList(InsurancePolicyDirectory insurancePolicyList) {
        this.insurancePolicyList = insurancePolicyList;
    }

}
