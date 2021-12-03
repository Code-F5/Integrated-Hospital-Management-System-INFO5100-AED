/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;

import Business.Organization;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import userinterface.RestaurantAdminRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;


public class AdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        for(Restaurant restaruant:business.getRestaurantDirectory().getRestaurantList()){
            if(restaruant.getName().equals(account.getUsername())){
                return new AdminWorkAreaJPanel(userProcessContainer,restaruant,business);
            }
        }
        return null;
    } 
}
