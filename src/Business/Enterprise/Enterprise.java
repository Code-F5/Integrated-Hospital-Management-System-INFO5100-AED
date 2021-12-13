/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import java.util.List;

/**
 *
 * @author Dell
 */
public abstract class Enterprise extends Organization {

    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    //Created EnterpriseTpe
    public enum EnterpriseType {

        HealthcareCenter("HealthcareCenter"),
        InsuranceCompany("InsuranceCompany"),
        GovernmentAid("GovernmentAid");

        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }
        
        public String getValue() {
            return value;
        }
        
        

        @Override
        public String toString() {
            return value;
        }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public Enterprise(EnterpriseType type, String name) {
        super(name);
        this.enterpriseType = type;
        organizationDirectory = new OrganizationDirectory();
    }

    public abstract List<Organization.Type> getOrganizationTypes();
}
