/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Role.VolunteerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author shashwatshrey
 */
public class SocialWorkerOrganization extends Organization {
    public SocialWorkerOrganization() {
        super(Organization.Type.Distribution.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new VolunteerRole());
        return roles;
    }
}
