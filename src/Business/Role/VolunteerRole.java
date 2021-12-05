/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Business.Volunteer.Volunteer;
import userinterface.VolunteerRole.VolunteerWorkAreaJPanel;
import javax.swing.JPanel;

 
public class VolunteerRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
            for(Volunteer volunteer:business.getVolunteerDirectory().getVolunteerDirectory()){
            if(volunteer.getName().equals(account.getUsername())){
                return new VolunteerWorkAreaJPanel(userProcessContainer,volunteer,business);
            }
        }
       return null;//To change body of generated methods, choose Tools | Templates.
    }
    
}

