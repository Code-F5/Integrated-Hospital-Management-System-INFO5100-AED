/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.InstructorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class InstructorOrganization extends Organization {
    public InstructorOrganization() {
        super(Organization.Type.Instructor.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new InstructorRole());
        return roles;
    }
}
