/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author adityamulik
 */
public class Emergency extends Enterprise {
    
    public Emergency(String name) {
        super(name, Enterprise.EnterpriseType.Emergency);
    }

    @Override    
    public ArrayList<Role> getSupportedRole() {
        roles = new ArrayList<Role>();
//        roles.add(new FireSafetyHead());
//        roles.add(new PoliceHead());
        return roles;
    }
    
}
