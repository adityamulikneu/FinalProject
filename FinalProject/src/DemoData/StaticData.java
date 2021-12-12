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
import Business.Role.LabAdminRole;
import Business.Role.LabDealerRole;
import Business.Role.NurseRole;
import Business.Role.PatientRole;
import Business.Role.PharmacistRole;
import Business.Role.PharmacyAdminRole;

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
        system.getUserAccountDirectory().createUserAccount("patient1", "patient1", employee1, new PatientRole(), null);
        
        Employee employee2 = system.getEmployeeDirectory().createEmployee("Patient 2");
        system.getUserAccountDirectory().createUserAccount("patient2", "patient2", employee2, new PatientRole(), null);
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
        Enterprise e = network.getEnterpriseDirectory().createAndAddEnterprise("Apollo Clinics", EnterpriseType.MedicalServices);
        Enterprise e2 = network.getEnterpriseDirectory().createAndAddEnterprise("CVS", EnterpriseType.MedicalSupplies);
        Enterprise e3 = network.getEnterpriseDirectory().createAndAddEnterprise("Cabot", EnterpriseType.Lab);
        
        
        Enterprise e4 = network2.getEnterpriseDirectory().createAndAddEnterprise("Arihant", EnterpriseType.MedicalServices);
        
        
        
        // Create Employee
        Employee employee = e.getEmployeeDirectory().createEmployee("Apollo Admin");
        Employee cvsEmp = e2.getEmployeeDirectory().createEmployee("Cvs Admin");
        Employee labDeal = e3.getEmployeeDirectory().createEmployee("Cabot Admin");
        
        Employee arihantEmp = e4.getEmployeeDirectory().createEmployee("Arihant Admin");
        
        // Create Enterprise Admin
        system.getUserAccountDirectory().createUserAccountEnterpriseAdmin("apollo", "apollo", employee, new HospAdminRole(), e);
        system.getUserAccountDirectory().createUserAccountEnterpriseAdmin("cvs", "cvs", cvsEmp, new PharmacyAdminRole(), e2);
        system.getUserAccountDirectory().createUserAccountEnterpriseAdmin("cabot", "cabot", labDeal, new LabAdminRole(), e3);
        system.getUserAccountDirectory().createUserAccountEnterpriseAdmin("arihant", "arihant", arihantEmp, new HospAdminRole(), e4);
    
        /*
           Hospital Block
        */
        // Populate Doctor
        Employee employee1 = system.getEmployeeDirectory().createEmployee("Apollo Doctor 1");
        Employee employee2 = system.getEmployeeDirectory().createEmployee("Apollo Doctor 2");
        system.getUserAccountDirectory().createUserAccount("doctor1", "doctor1", employee1, new DoctorRole(), e);
        system.getUserAccountDirectory().createUserAccount("doctor2", "doctor2", employee2, new DoctorRole(), e);
        
        // Populate Nurse
        Employee employee3 = system.getEmployeeDirectory().createEmployee("Apollo Nurse 1");
        Employee employee4 = system.getEmployeeDirectory().createEmployee("Apollo Nurse 2");
        system.getUserAccountDirectory().createUserAccount("nurse1", "nurse1", employee3, new NurseRole(), e);
        system.getUserAccountDirectory().createUserAccount("nurse2", "nurse2", employee4, new NurseRole(), e);
        
        // Populate Doctor for Arhiant
        Employee employee9 = system.getEmployeeDirectory().createEmployee("Arihant Doctor 1");
        Employee employee10 = system.getEmployeeDirectory().createEmployee("Arihant Doctor 2");
        system.getUserAccountDirectory().createUserAccount("arihantdoctor1", "arihantdoctor1", employee9, new DoctorRole(), e4);
        system.getUserAccountDirectory().createUserAccount("arihantdoctor2", "arihantdoctor2", employee10, new DoctorRole(), e4);
        
        // Populate Nurse for Arihant
        Employee employee11 = system.getEmployeeDirectory().createEmployee("Arihant Nurse 1");
        Employee employee12 = system.getEmployeeDirectory().createEmployee("Arihant Nurse 2");
        system.getUserAccountDirectory().createUserAccount("arihantnurse1", "arihantnurse1", employee11, new NurseRole(), e4);
        system.getUserAccountDirectory().createUserAccount("arihantnurse2", "arihantnurse2", employee12, new NurseRole(), e4);
        
        /*
           Pharma Block
        */
        Employee employee5 = system.getEmployeeDirectory().createEmployee("CVS Dealer 1");
        Employee employee6 = system.getEmployeeDirectory().createEmployee("CVS Dealer 2");
        system.getUserAccountDirectory().createUserAccount("cvsdealer1", "cvsdealer1", employee5, new PharmacistRole(), e2);
        system.getUserAccountDirectory().createUserAccount("cvsdealer2", "cvsdealer2", employee6, new PharmacistRole(), e2);
        
        Employee employee13 = system.getEmployeeDirectory().createEmployee("Arihant Dealer 1");
        Employee employee14 = system.getEmployeeDirectory().createEmployee("Arihant Dealer 2");
        system.getUserAccountDirectory().createUserAccount("arihantdealer1", "arihantdealer1", employee13, new PharmacistRole(), e4);
        system.getUserAccountDirectory().createUserAccount("arihnatdealer2", "arihantdealer2", employee14, new PharmacistRole(), e4);
        
        /*
           Lab Tests/ Vital Signs Block
        */
        Employee employee7 = system.getEmployeeDirectory().createEmployee("Cabot 1");
        Employee employee8 = system.getEmployeeDirectory().createEmployee("Cabot 2");
        system.getUserAccountDirectory().createUserAccount("cabot1", "cabot1", employee7, new LabDealerRole(), e3);
        system.getUserAccountDirectory().createUserAccount("cabot2", "cabot2", employee8, new LabDealerRole(), e3);
        
        Employee employee15 = system.getEmployeeDirectory().createEmployee("Arihant Lab 1");
        Employee employee16 = system.getEmployeeDirectory().createEmployee("Arihant Lab 2");
        system.getUserAccountDirectory().createUserAccount("arihantlab1", "arihantlab1", employee15, new LabDealerRole(), e4);
        system.getUserAccountDirectory().createUserAccount("arihantlab2", "arihantlab2", employee16, new LabDealerRole(), e4);
        
    }        
    
}
