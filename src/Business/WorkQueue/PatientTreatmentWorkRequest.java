/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Patient.Patient;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Dell
 */
public class PatientTreatmentWorkRequest extends WorkRequest {

    private String registrationDate;
    private String reasonForVisit;
    private Patient patient;
    private String labTestType;
    private String labResult;
    private UserAccount labAssistant;
    private String labTestMessage;
    private String prescription;
    private double billAmount;
    private UserAccount assignedDoctor;

    public PatientTreatmentWorkRequest(String Date, String reasonForVisit, Patient patient) {
        this.registrationDate = Date;
        this.reasonForVisit = reasonForVisit;
        this.patient = patient;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String Date) {
        this.registrationDate = Date;
    }

    public String getReasonForVisit() {
        return reasonForVisit;
    }

    public void setReasonForVisit(String reasonForVisit) {
        this.reasonForVisit = reasonForVisit;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getLabTestType() {
        return labTestType;
    }

    public void setLabTestType(String labTestType) {
        this.labTestType = labTestType;
    }

    public String getLabResult() {
        return labResult;
    }

    public void setLabResult(String labResult) {
        this.labResult = labResult;
    }

    public UserAccount getLabAssistant() {
        return labAssistant;
    }

    public void setLabAssistant(UserAccount labAssistant) {
        this.labAssistant = labAssistant;
    }

    public String getLabTestMessage() {
        return labTestMessage;
    }

    public void setLabTestMessage(String labTestMessage) {
        this.labTestMessage = labTestMessage;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public UserAccount getAssignedDoctor() {
        return assignedDoctor;
    }

    public void setAssignedDoctor(UserAccount assignedDoctor) {
        this.assignedDoctor = assignedDoctor;
    }

    @Override
    public String toString() {
        return reasonForVisit;
    }

}
