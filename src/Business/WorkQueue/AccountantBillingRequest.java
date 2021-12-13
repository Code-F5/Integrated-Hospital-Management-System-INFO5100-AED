/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;


import Business.Patient.Patient;


/**
 *
 * @author Dell
 */

public class AccountantBillingRequest extends WorkRequest {

    private double bill;

    private boolean hasInsurance;
    private boolean insuranceSettled;

    Patient patient;

    public double getBill() {
        return bill;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public boolean isHasInsurance() {
        return hasInsurance;
    }

    public void setHasInsurance(boolean hasInsurance) {
        this.hasInsurance = hasInsurance;
    }

    public boolean isInsuranceSettled() {
        return insuranceSettled;
    }

    public void setInsuranceSettled(boolean insuranceSettled) {
        this.insuranceSettled = insuranceSettled;
    }

    @Override
    public String toString() {
        return String.valueOf(bill);
    }

}
