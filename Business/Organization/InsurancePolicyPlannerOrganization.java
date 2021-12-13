/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.InsurancePolicyPlannerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class InsurancePolicyPlannerOrganization extends Organization {

    public InsurancePolicyPlannerOrganization() {
        super(Organization.Type.PolicyPlanner.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new InsurancePolicyPlannerRole());
        return roles;
    }
    
}
