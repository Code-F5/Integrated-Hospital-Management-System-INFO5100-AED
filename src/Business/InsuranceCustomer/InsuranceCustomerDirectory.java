/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.InsuranceCustomer;

/**
 *
 * @author Dell
 */

import java.util.ArrayList;
import java.util.List;


public class InsuranceCustomerDirectory {

    private List<InsuranceCustomer> insuranceHolders = new ArrayList<>();

    public List<InsuranceCustomer> getInsuranceHolders() {
        return insuranceHolders;
    }

    public void setInsuranceHolders(List<InsuranceCustomer> insuranceHolders) {
        this.insuranceHolders = insuranceHolders;
    }

    @Override
    public String toString() {
        return "InsuranceCustomerDirectory{" + "insuranceCustomers=" + insuranceHolders + '}';
    }

}
