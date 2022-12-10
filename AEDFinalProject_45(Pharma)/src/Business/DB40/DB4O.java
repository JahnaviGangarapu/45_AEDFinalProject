/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.DB40;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;
import Business.EcoSystem;
import Business.ConfigureSystem;
import com.db4o.ObjectSet;

import java.nio.file.Paths;

/**
 *
 * @author deepshah
 */
public class DB4O {
    
    private static final String FILENAME = Paths.get("Databank.db4o").toAbsolutePath().toString();// path to the data store
    private static DB4O dB4OUtil;
    
    public synchronized static DB4O getInstance(){
        if (dB4OUtil == null){
            dB4OUtil = new DB4O();
        }
        return dB4OUtil;
    }
    
    protected synchronized static void shutdown(ObjectContainer conn) {
        if (conn != null) {
            conn.close();
        }
    }
    
    private ObjectContainer createConnection() {
        try {

            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
            config.common().add(new TransparentPersistenceSupport());
            //Controls the number of objects in memory
            config.common().activationDepth(Integer.MAX_VALUE);
            //Controls the depth/level of updation of Object
            config.common().updateDepth(Integer.MAX_VALUE);

            //Register your top most Class here
            config.common().objectClass(EcoSystem.class).cascadeOnUpdate(true); // Change to the object you want to save

            ObjectContainer db = Db4oEmbedded.openFile(config, FILENAME);
            return db;
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        return null;
    }
    
    public synchronized void storeSystem(EcoSystem ecoSystem) {
        try{
        ObjectContainer conn = createConnection();
        conn.store(ecoSystem);
        conn.commit();
        conn.close();
        }catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
    }
    
    public EcoSystem retrieveSystem(){
        //try{            
        ObjectContainer conn = createConnection();
        ObjectSet<EcoSystem> ecoSystems;
        //try{
            
         ecoSystems = conn.query(EcoSystem.class); // Change to the object you want to save
        //}catch (Exception ex) {
            //System.out.print(ex.getCause());
        //    ecosystems = conn.query(EcoSystem.class);
        //}
        EcoSystem ecosystem;
        if (ecoSystems.size() == 0){
            ecosystem = ConfigureSystem.configure();  // If there's no System in the record, create a new one
        }
        else{
            ecosystem = ecoSystems.get(ecoSystems.size() - 1);
        }
        conn.close();
        return ecosystem;
        //}catch (Exception ex) {
        //    System.out.print(ex.getMessage());
        //}
        //return null;
    }
    
}
