/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Customer.Customer;
import Business.EcoSystem;

import Business.Organization;
import Business.UserAccount.UserAccount;
import userinterface.CustomerRole.CustomerAreaJPanel;
import javax.swing.JPanel;


public class CaretakerRole extends Role{

    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
          for(Customer customer:business.getCustomerDirectory().getCustomerDirectory()){
            if(customer.getName().equals(account.getUsername())){
                return new CustomerAreaJPanel(userProcessContainer,customer,business);
            }
        }
       return null;
    }
}
