/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoData;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Network.Network;

/**
 *
 * @author adityamulik
 */
public class StaticData {        
    
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    public StaticData() {
        system = dB4OUtil.retrieveSystem(); 
    }
    
    public void populateData() {
        populateNetwork();
        dB4OUtil.storeSystem(system);
    }
    
    // Create network
    public void populateNetwork() {
        Network network = system.createAndAddNetwork();
        network.setName("Boston");
        
        Network network2 = system.createAndAddNetwork();
        network.setName("New York");
        
        Network network3 = system.createAndAddNetwork();
        network.setName("Los Angeles");
    }
    
    
}
