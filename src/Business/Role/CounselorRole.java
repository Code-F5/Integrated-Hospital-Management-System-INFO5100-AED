/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;


import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.RehabilitationOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.CounselorRole.CounselorWorkAreaJPanel;


public class CounselorRole extends Role{

    
   @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new CounselorWorkAreaJPanel(userProcessContainer, account, (RehabilitationOrganization)organization, enterprise);
    }
}