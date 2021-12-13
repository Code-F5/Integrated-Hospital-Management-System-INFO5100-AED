/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Patient;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class PatientDirectory {
    
    private List<Patient> patientList = new ArrayList<>();

    public List<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(List<Patient> patientList) {
        this.patientList = patientList;
    }
    
}
