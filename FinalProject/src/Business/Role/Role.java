/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;

import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author adityamulik
 */
public abstract class Role {
    
    public enum RoleType{
        SysAdmin("Sysadmin"),
        HospitalAdmin("HospitalAdmin"),
        LabAdmin("LabAdmin"),
        Accountant("Accountant"),
        Patient("Patient"),
        Nurse("Nurse"),
        Doctor("Doctor"),
        EmergencyUnit("EmergencyUnit");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account,
            Network network,
            Organization organization,
            Enterprise enterprise,
            EcoSystem business
    );

    @Override
    public String toString() {
        return this.getClass().getName();
    }        
}