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
import userinterface.HospAdmin.HospAdminWorkAreaJPanel;

/**
 *
 * @author adityamulik
 * @author shivanichavan
 * @author divyeshdarji
 * 
 */
public class HospAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Network network, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new HospAdminWorkAreaJPanel(userProcessContainer, account, network, organization, enterprise, business);
    }

    @Override
    public String toString() {
        return RoleType.Doctor.getValue();
    }
    
}
