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

import Business.Insurance.Insurance;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;


public class InsuranceCustomer {

    private String firstName;
    private String lastName;
    private String socialSecurityID;
    private String dob;
    private int age;
    private String contactNumber;
    private String address;
    private String sex;
    private String policyInitialDate;
    private String policyEndDate;

    private Insurance insurance;
    private String insurancePolicyNumber;

    public InsuranceCustomer(String policyNumber, Insurance insurance)
    {
        this.insurance = insurance;
        this.insurancePolicyNumber = policyNumber;
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSocialSecurityID() {
        return socialSecurityID;
    }

    public void setSocialSecurityID(String socialSecurityID) {
        this.socialSecurityID = socialSecurityID;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    
    public int getAge() throws ParseException {

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        //String dateOfBirth;
        Date date = formatter.parse(dob);
        Instant instant = date.toInstant();
        ZonedDateTime zone = instant.atZone(ZoneId.systemDefault());
        LocalDate givenDate = zone.toLocalDate();
//Calculating the difference between given date to current date.
        Period period = Period.between(givenDate, LocalDate.now());
        this.age = period.getYears();
return age;
}
 
    public void setAge(int age) {
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPolicyInitialDate() {
        return policyInitialDate;
    }

    public void setPolicyInitialDate(String policyInitialDate) {
        this.policyInitialDate = policyInitialDate;
    }

    public String getPolicyEndDate() {
        return policyEndDate;
    }

    public void setPolicyEndDate(String policyEndDate) {
        this.policyEndDate = policyEndDate;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public String getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }

    public void setInsurancePolicyNumber(String insurancePolicyNumber) {
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public String toString() {
        return insurancePolicyNumber;
    }

}
