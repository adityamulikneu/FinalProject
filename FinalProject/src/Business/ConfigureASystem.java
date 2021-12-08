    package Business;

import Business.Patient.Employee;
import Business.Role.DoctorRole;
import Business.Role.HospAdminRole;
import Business.Role.NurseRole;
import Business.Role.PatientRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("sysadmin");
        
        Employee employee2 = system.getEmployeeDirectory().createEmployee("ADD");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("admin", "admin", employee, new SystemAdminRole());
        UserAccount ub = system.getUserAccountDirectory().createUserAccount("patient", "patient", employee, new PatientRole());
        UserAccount ud = system.getUserAccountDirectory().createUserAccount("doctor", "doctor", employee, new DoctorRole());
        UserAccount un = system.getUserAccountDirectory().createUserAccount("nurse", "nurse", employee, new NurseRole());   
        UserAccount ha = system.getUserAccountDirectory().createUserAccount("hospadmin", "hospadmin", employee, new HospAdminRole());         
        
        return system;
    }
    
}
