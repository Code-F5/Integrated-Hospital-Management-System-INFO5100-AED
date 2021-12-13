/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.GovernmentSecretaries;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class SecretaryOrganization extends Organization {

    public SecretaryOrganization() {
        super(Organization.Type.GovernmentSecretary.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new GovernmentSecretaries());
        return roles;
    }
    
}
