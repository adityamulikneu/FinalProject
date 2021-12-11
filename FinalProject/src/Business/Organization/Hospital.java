/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DoctorRole;
import Business.Role.HospAdminRole;
import Business.Role.NurseRole;
import Business.Role.PatientRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author adityamulik
 */
public class Hospital extends Organization{
    
    private String hospital;
    
    public Hospital(String name) {
        super(name);
        hospital = name;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new HospAdminRole());
        roles.add(new DoctorRole());
        roles.add(new NurseRole());
        roles.add(new PatientRole());
        return roles;
    }
}
