/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Organization.Organization;
import Business.Network.Network;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;



/**
 *
 * @author JANU
 */
public class Ecosystem extends Organization{
    
    private static Ecosystem ecoSystem;
    private ArrayList<Network> netWorks;
    
    public static Ecosystem getInstance(){
        if(ecoSystem==null){
            ecoSystem=new Ecosystem();
        }
        return ecoSystem;
    }
    
    public Network createAndAddNetwork(){
        Network netWork=new Network();
        netWorks.add(netWork);
        return netWork;
    }
    
//    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    
    private Ecosystem(){
//        super(null);
        netWorks=new ArrayList<Network>();
    }
    
    public ArrayList<Network> getNetworks() {
        return netWorks;
    }

    public void setNetworks(ArrayList<Network> netWorks) {
        this.netWorks = netWorks;
    }
    
   
   
}
