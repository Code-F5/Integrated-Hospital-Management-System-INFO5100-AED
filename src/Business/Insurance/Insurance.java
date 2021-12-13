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
public class Insurance {

    private String policyName;
    private String InsuranceCompanyName;
    private double coveragepercentage;
    private String policyTC;
    private double monthlyInstallment;

    public Insurance(String policyName, String InsuranceCompany, double coverage) {
        this.policyName = policyName;
        this.InsuranceCompanyName = InsuranceCompany;
        this.coveragepercentage = coverage;
    }

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyType) {
        this.policyName = policyType;
    }

    public double getMonthlyInstallment() {
        return monthlyInstallment;
    }

    public void setMonthlyInstallment(double monthlyInstallment) {
        this.monthlyInstallment = monthlyInstallment;
    }

    public String getInsuranceCompanyName() {
        return InsuranceCompanyName;
    }

    public void setInsuranceCompanyName(String InsuranceCompanyName) {
        this.InsuranceCompanyName = InsuranceCompanyName;
    }

    public double getCoveragepercentage() {
        return coveragepercentage;
    }

    public void setCoveragepercentage(double coveragepercentage) {
        this.coveragepercentage = coveragepercentage;
    }

    public String getPolicyTC() {
        return policyTC;
    }

    public void setPolicyTC(String policyTC) {
        this.policyTC = policyTC;
    }

    @Override
    public String toString() {
        return policyName;
    }

}
