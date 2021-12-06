/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.EcoSystem;
import Business.Role.TreasurerRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Dell
 */
public class TreasurerOrganization extends Organization{

    public TreasurerOrganization() {
        super(Organization.Type.Treasurer.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
      
        ArrayList<Role> roles = new ArrayList();
        roles.add(new TreasurerRole() {
            @Override
            public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        return roles;
    }
     
   
    
    
}
