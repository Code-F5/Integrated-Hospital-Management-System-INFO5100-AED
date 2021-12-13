/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.InsuranceCustomer.InsuranceCustomer;

/**
 *
 * @author Dell
 */
public class Patient {

    private String firstName;
    private String lastName;
    
    private String id;
    private String ssn;
    private String age;
    private String contactNumber;
    private String address;
    private String gender;
    private boolean isTreatmentComplete;
    private String appointmentDate;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private InsuranceCustomer insuranceCustomer;

    public Patient() {

    }

    public String getLastName() {
        return lastName;
    }

   
    
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public InsuranceCustomer getInsuranceCustomer() {
        return insuranceCustomer;
    }

    public void setInsuranceCustomer(InsuranceCustomer insuranceCustomer) {
        this.insuranceCustomer = insuranceCustomer;
    }

    public String getId() {
        return id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSsn() {
        return ssn;
    }

    

    @Override
    public String toString() {
        return String.valueOf(id);
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isIsTreatmentComplete() {
        return isTreatmentComplete;
    }

    public void setIsTreatmentComplete(boolean isTreatmentComplete) {
        this.isTreatmentComplete = isTreatmentComplete;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }
    
     public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {

        return firstName;

    }


    
}
