/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CounselorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class RehabilitationOrganization extends Organization {
    public RehabilitationOrganization() {
        super(Organization.Type.Rehabilitation.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CounselorRole());
        return roles;
    }
}
