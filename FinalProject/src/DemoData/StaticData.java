/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoData;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Enterprise.EnterpriseType;
import Business.Network.Network;
import Business.Patient.Employee;
import Business.Role.DoctorRole;
import Business.Role.HospAdminRole;
import Business.Role.NurseRole;
import Business.Role.PatientRole;

/**
 *
 * @author adityamulik
 * 
 */
public class StaticData {            
    
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    public StaticData() {
        system = dB4OUtil.retrieveSystem(); 
    }
    
    public void populateData() {
        populateSysAdmin();
        dB4OUtil.storeSystem(system);
    }
    
    public void createPatient() {
        Employee employee1 = system.getEmployeeDirectory().createEmployee("Patient 1");
        system.getUserAccountDirectory().createUserAccount("patient1", "patient1", employee1, new PatientRole());
        
        Employee employee2 = system.getEmployeeDirectory().createEmployee("Patient 2");
        system.getUserAccountDirectory().createUserAccount("patient2", "patient2", employee2, new PatientRole());
    } 
    
    // Create network
    public void populateSysAdmin() {
        
        // Create Patient
        createPatient();
        
        // Create network
        Network network = system.createAndAddNetwork();
        network.setName("Boston");
        
        Network network2 = system.createAndAddNetwork();
        network2.setName("New York");
        
        Network network3 = system.createAndAddNetwork();
        network3.setName("Los Angeles");
        
        // Create Enterprise
        Enterprise e = network.getEnterpriseDirectory().createAndAddEnterprise("Apollo Clinics", EnterpriseType.MedicalSupplies);
        
        // Create Employee
        Employee employee = e.getEmployeeDirectory().createEmployee("Apollo Admin");
        
        // Create Enterprise Admin
        system.getUserAccountDirectory().createUserAccountEnterpriseAdmin("apollo", "apollo", employee, new HospAdminRole(), e);
    
        // Populate Doctor
        Employee employee1 = system.getEmployeeDirectory().createEmployee("Apollo Doctor 1");
        Employee employee2 = system.getEmployeeDirectory().createEmployee("Apollo Doctor 2");
        system.getUserAccountDirectory().createUserAccountEnterpriseAdmin("doctor1", "doctor1", employee1, new DoctorRole(), e);
        system.getUserAccountDirectory().createUserAccountEnterpriseAdmin("doctor2", "doctor2", employee2, new DoctorRole(), e);
        
        // Populate Nurse
        Employee employee3 = system.getEmployeeDirectory().createEmployee("Apollo Nurse 1");
        Employee employee4 = system.getEmployeeDirectory().createEmployee("Apollo Nurse 2");
        system.getUserAccountDirectory().createUserAccountEnterpriseAdmin("nurse1", "nurse1", employee3, new NurseRole(), e);
        system.getUserAccountDirectory().createUserAccountEnterpriseAdmin("nurse2", "nurse2", employee4, new NurseRole(), e);
    }        
    
}
