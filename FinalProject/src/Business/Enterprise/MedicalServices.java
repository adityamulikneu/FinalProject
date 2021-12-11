/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.HospAdminRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author adityamulik
 */
public class MedicalServices extends Enterprise {
    
    public MedicalServices(String name) {
        super(name, Enterprise.EnterpriseType.MedicalServices);
    }
    
    @Override    
    public ArrayList<Role> getSupportedRole() {
        roles = new ArrayList<Role>();
        roles.add(new HospAdminRole());
//        roles.add(new PoliceHead());
        return roles;
    }
    
    public static void retrieveUserEnterprise(UserAccount user) {
        
    }
}
