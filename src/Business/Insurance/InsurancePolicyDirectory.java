/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Insurance;

/**
 *
 * @author Dell
 */

import java.util.ArrayList;
import java.util.List;

public class InsurancePolicyDirectory {

    private List<Insurance> insurancePolicies = new ArrayList<>();

    public List<Insurance> getInsurancePolicies() {
        return insurancePolicies;
    }

    public void setInsurancePolicies(List<Insurance> insurancePolicies) {
        this.insurancePolicies = insurancePolicies;
    }
    
}
