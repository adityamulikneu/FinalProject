/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;

import Business.Organization;
import Business.UserAccount.UserAccount;
import userinterface.PatientView.PatientAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class PatientRole extends Role{

    
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new PatientAreaJPanel(userProcessContainer, account);
    }
    
    
}
