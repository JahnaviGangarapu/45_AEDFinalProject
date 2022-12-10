/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Network.Network;

/**
 *
 * @author deepshah
 */
public class ConfigureASystem {
    
    public static Ecosystem configure(){
        
        Ecosystem ecosystem = Ecosystem.getInstance();
        
        Network netWork = ecosystem.createAndAddNetwork();
        netWork.setName("Boston");
        
        return ecosystem;
    }
    
}
