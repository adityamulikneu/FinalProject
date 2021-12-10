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
import userinterface.PatientView.PatientAreaJPanel_DELETE;
import javax.swing.JPanel;

/**
 *
 * @author adityamulik
 * @author shivanichavan
 * @author divyeshdarji
 * 
 */
public class PatientRole extends Role{

    
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Network network, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new PatientAreaJPanel_DELETE(userProcessContainer, account, network, organization, enterprise, business);
    }
    
    
}
