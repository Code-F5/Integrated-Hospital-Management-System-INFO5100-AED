/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AccountantRole;
import Business.Role.Role;
import java.util.ArrayList;


/**
 *
 * @author Dell
 */
public class AccountantOrganization extends Organization {

    public AccountantOrganization() {
        super(Organization.Type.Accountant.getValue());

    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AccountantRole());
        return roles;
    }

}
