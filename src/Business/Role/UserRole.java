/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.DeliveryManRole.DeliveryManWorkAreaJPanel;


public class UserRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
            for(DeliveryMan deliveryMan:business.getDeliveryManDirectory().getDeliveryManDirectory()){
            if(deliveryMan.getName().equals(account.getUsername())){
                return new DeliveryManWorkAreaJPanel(userProcessContainer,deliveryMan,business);
            }
        }
       return null;//To change body of generated methods, choose Tools | Templates.
    }
    
}





