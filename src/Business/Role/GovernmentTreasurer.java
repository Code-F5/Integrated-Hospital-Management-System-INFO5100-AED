/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.TreasurerOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.GovernmentTreasurerRole.TreasurerWorkAreaJPanel;

/**
 *
 * @author Dell
 */
public class GovernmentTreasurer extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new TreasurerWorkAreaJPanel(userProcessContainer, userAccount, (TreasurerOrganization)organization, enterprise);
    }
    
}
