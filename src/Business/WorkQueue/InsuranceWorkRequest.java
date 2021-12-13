/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.InsuranceCustomer.InsuranceCustomer;

/**
 *
 * @author Dell
 */


public class InsuranceWorkRequest extends WorkRequest {

    private String policyId;
    private String ssn;
    private String policyName;
    private String insuranceCompany;
    private double amountClaimed;
    private String agent;
    private String financer;
    private double amountBilled;
    private InsuranceCustomer insuranceCustomer;
    private String healthCenter;

    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyType) {
        this.policyName = policyType;
    }

    public String getInsuranceCompany() {
        return insuranceCompany;
    }

    public void setInsuranceCompany(String insuranceCompany) {
        this.insuranceCompany = insuranceCompany;
    }

    public double getAmountClaimed() {
        return amountClaimed;
    }

    public void setAmountClaimed(double amountClaimed) {
        this.amountClaimed = amountClaimed;
    }

    @Override
    public String toString() {
        return policyId;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public String getFinancer() {
        return financer;
    }

    public void setFinancer(String financer) {
        this.financer = financer;
    }

    public double getAmountBilled() {
        return amountBilled;
    }

    public void setAmountBilled(double amountBilled) {
        this.amountBilled = amountBilled;
    }

    public InsuranceCustomer getInsuranceCustomer() {
        return insuranceCustomer;
    }

    public void setInsuranceCustomer(InsuranceCustomer insuranceCustomer) {
        this.insuranceCustomer = insuranceCustomer;
    }

    public String getHealthCenter() {
        return healthCenter;
    }

    public void setHealthCenter(String healthCenter) {
        this.healthCenter = healthCenter;
    }

}
