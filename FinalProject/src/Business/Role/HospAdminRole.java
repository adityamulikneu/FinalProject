/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;

import Business.Organization;
import Business.UserAccount.UserAccount;
import userinterface.RestaurantAdminRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;
import userinterface.HospAdmin.HospAdminWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class HospAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
        return new HospAdminWorkAreaJPanel(userProcessContainer,account,system);
    }

    
    
}
