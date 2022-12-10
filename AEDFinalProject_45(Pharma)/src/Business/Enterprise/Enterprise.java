/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

/**
 *
 * @author JANU
 */
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import java.util.List;

public abstract class Enterprise extends Organization {
    
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private int zipcode;
    private String address;
    private String email;

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public enum EnterpriseType {

        HealthCenter("HealthCenter"),
        InsuranceCompany("InsuranceCompany"),
        Government("Government"),
        Pharma("Pharma");

        private String value;

        private EnterpriseType(String value) {
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

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    public Enterprise(String name, EnterpriseType type,int zip,String address) {
//        super(name);
        this.enterpriseType = type;
        this.zipcode = zip;
        this.address = address;
        this.email = "";
        organizationDirectory = new OrganizationDirectory();
    }
    
    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
//    public abstract List<Organization.Type> getAllOrganizationTypes();
    
}
