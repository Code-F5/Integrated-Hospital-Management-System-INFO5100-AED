/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Counselor.CounselorDirectory;
import Business.Donor.DonorDirectory;
import Business.Employee.EmployeeDirectory;
import Business.Enterprise.EnterpriseDirectory;
import Business.HomelessPeople.HomelessPeopleDirectory;
import Business.Instructor.InstructorDirectory;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccountDirectory;

/**
 *
 * @author VIRAJ
 */
public class Environment {
    
    private EnterpriseDirectory enterpriseDirectory;
    private HomelessPeopleDirectory homelessPeopleDirectory;
    private InstructorDirectory instructorDirectory;
    private DonorDirectory donorDirectory;
    private UserAccountDirectory userAccountDirectory;
    private OrganizationDirectory organizationDirectory;
    private EmployeeDirectory employeeDirectory;
    private CounselorDirectory counselorDirectory; 

    public Environment() {
        enterpriseDirectory = new EnterpriseDirectory();
        homelessPeopleDirectory = new HomelessPeopleDirectory();
        instructorDirectory = new InstructorDirectory();
        donorDirectory = new DonorDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationDirectory = new OrganizationDirectory();
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }

    public HomelessPeopleDirectory getHomelessPeopleDirectory() {
        return homelessPeopleDirectory;
    }

    public void setHomelessPeopleDirectory(HomelessPeopleDirectory homelessPeopleDirectory) {
        this.homelessPeopleDirectory = homelessPeopleDirectory;
    }

    public InstructorDirectory getInstructorDirectory() {
        return instructorDirectory;
    }

    public void setInstructorDirectory(InstructorDirectory instructorDirectory) {
        this.instructorDirectory = instructorDirectory;
    }

    public DonorDirectory getDonorDirectory() {
        return donorDirectory;
    }

    public void setDonorDirectory(DonorDirectory donorDirectory) {
        this.donorDirectory = donorDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public CounselorDirectory getCounselorDirectory() {
        return counselorDirectory;
    }

    public void setCounselorDirectory(CounselorDirectory counselorDirectory) {
        this.counselorDirectory = counselorDirectory;
    }
    
    
    
    
        
        
        
        
        
        
    }
    
    
    
    
    


