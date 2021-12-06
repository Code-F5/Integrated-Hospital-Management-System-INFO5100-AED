/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Role.TreasurerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class TreasureOrganization extends Organization{

    public TreasureOrganization() {
        super(Organization.Type.Treasurer.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
      
        ArrayList<Role> roles = new ArrayList();
        roles.add(new TreasurerRole());
        return roles;
    }
     
   
    
    
}
