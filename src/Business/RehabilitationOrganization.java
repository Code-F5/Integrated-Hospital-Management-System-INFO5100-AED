/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Role.CaretakerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author shashwatshrey
 */
public class RehabilitationOrganization extends Organization {
    public RehabilitationOrganization() {
        super(Organization.Type.Treasurer.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CaretakerRole());
        return roles;
    }
}
