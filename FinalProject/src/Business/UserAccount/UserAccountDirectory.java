/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Enterprise.Enterprise;
import Business.Patient.Employee;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password,Employee employee, Role role, Enterprise enterprise){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccount.setAssociatedEnterprise(enterprise);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public UserAccount createUserAccountEnterpriseAdmin(String username, String password,Employee employee, Role role, Enterprise enterprise){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccount.setAssociatedEnterprise(enterprise);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
    
    public UserAccount findEmployee(Employee employee)
    {
        for(UserAccount ua : userAccountList)
            if(ua.getEmployee() == employee)
            {
                return ua;
            }
        return null;
    }
    
    
}
