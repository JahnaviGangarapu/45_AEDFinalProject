/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

/**
 *
 * @author JANU
 */
import Business.Organization.OrganizationDirectory;
import java.util.ArrayList;

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
    
//    Create Enterprise by adding name
//    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type, int zip, String address){
//        Enterprise enterprise=null;
//        if(type==Enterprise.EnterpriseType.HealthCenter){
//            enterprise=new HealthCenterEnterprise(name,zip,address);
//            enterpriseList.add(enterprise);
//        }
//        
//        else if(type == Enterprise.EnterpriseType.Government)
//        {
//            enterprise =  new GovernmentEnterprise(name,zip,address);
//            enterpriseList.add(enterprise);
//            
//        }
//        
//        else if(type == Enterprise.EnterpriseType.InsuranceCompany)
//        {
//            enterprise = new InsuranceCompanyEnterprise(name,zip,address);
//            enterpriseList.add(enterprise);
//            
//            
//        }
//        else if(type == Enterprise.EnterpriseType.Pharma)
//        {
//            enterprise = new PharmaEnterprise(name,zip,address);
//            enterpriseList.add(enterprise);
//            
//            
//        }
//        return enterprise;
//    }
    
}
