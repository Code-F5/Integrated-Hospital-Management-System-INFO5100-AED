/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import Business.Role.AdminRole;
import Business.Role.Role;
import java.util.ArrayList;


public class AdminOrganization extends Organization{

    public AdminOrganization() {
        super(Type.Admin.getValue());
    }
    
   // @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AdminRole());
        return roles;
    }
     
}
