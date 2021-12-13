/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class GovernmentEnterprise extends Enterprise {

    public GovernmentEnterprise(String name) {
        super(EnterpriseType.GovernmentAid, name);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    @Override
    public List<Organization.Type> getOrganizationTypes() {
        List<Organization.Type> orgTypes = new ArrayList<>();
        orgTypes.add(Organization.Type.HealthcareChief);
        orgTypes.add(Organization.Type.GovernmentSecretary);
        orgTypes.add(Organization.Type.GovernmentAccountant);

        return orgTypes;
    }

}
