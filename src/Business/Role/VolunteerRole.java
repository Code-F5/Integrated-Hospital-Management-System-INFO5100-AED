/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.NGOOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.VolunteerRole.VolunteerWorkAreaJPanel;
import javax.swing.JPanel;

 
public class VolunteerRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new VolunteerWorkAreaJPanel(userProcessContainer, account, (NGOOrganization)organization, enterprise);
    }
    
}

