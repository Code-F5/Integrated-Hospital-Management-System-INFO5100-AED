/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.EcoSystem;
import Business.Role.Role;
import Business.Role.SocialWorkerRole;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Dell
 */
public class SocialWorkerOrganization extends Organization {
    public SocialWorkerOrganization() {
        super(Organization.Type.SocialWorker.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SocialWorkerRole() {
            @Override
            public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        return roles;
    }
}
