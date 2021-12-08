/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;


import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.HomelessPeopleOrganization;
import Business.Organization.Organization;
import static Business.Organization.Organization.Type.HomelessPeople;
import static Business.Role.Role.RoleType.HomelessPeople;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.HomelessPeopleRole.HomelessPeopleWorkAreaJPanel;
/**
 *
 * @author Dell
 */
public class HomelessPeopleRole extends Role{

    
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new HomelessPeopleWorkAreaJPanel(userProcessContainer, account, (HomelessPeopleOrganization)organization, enterprise);
    }
    
}
