package Business;

import Business.Patient.Employee;
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
        UserAccount ub = system.getUserAccountDirectory().createUserAccount("customer", "customer", employee, new PatientRole());
        
        return system;
    }
    
}
