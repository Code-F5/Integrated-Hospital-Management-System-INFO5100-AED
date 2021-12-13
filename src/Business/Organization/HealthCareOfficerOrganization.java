/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.GovernmentHealthOfficerRole;
import Business.Role.LabAssistantRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class HealthCareOfficerOrganization extends Organization {

    public HealthCareOfficerOrganization() {
        super(Organization.Type.HealthcareChief.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new GovernmentHealthOfficerRole());
        return roles;
    }

}
