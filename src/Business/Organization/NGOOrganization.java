/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.EcoSystem;
import Business.Role.Role;
import Business.Role.VolunteerRole;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Dell
 */
public class NGOOrganization extends Organization{

    public NGOOrganization() {
        super(Organization.Type.NGO.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new VolunteerRole() {
            @Override
            public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        return roles;
    }
     
}