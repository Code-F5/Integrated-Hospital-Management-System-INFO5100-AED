/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.HomelessPeopleRole;
import Business.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author Dell
 */
public class HomelessPeopleOrganization  extends Organization{
    public HomelessPeopleOrganization() {
        super(Organization.Type.HomelessPeople.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
       
        ArrayList<Role> roles = new ArrayList();
        roles.add(new HomelessPeopleRole());
        return roles;
    }
}
