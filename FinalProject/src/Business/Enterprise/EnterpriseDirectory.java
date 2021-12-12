/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author adityamulik
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        if (type == Enterprise.EnterpriseType.AccountsManagement) {
            enterprise = new AccountsManagement(name);
            enterpriseList.add(enterprise);
        }else if (type == Enterprise.EnterpriseType.Lab) {
            enterprise = new Lab(name);
            enterpriseList.add(enterprise);
        }else if (type == Enterprise.EnterpriseType.MedicalServices) {
            enterprise = new MedicalServices(name);
            enterpriseList.add(enterprise);
        }else if (type == Enterprise.EnterpriseType.MedicalSupplies) {
            enterprise = new MedicalSupplies(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
}
