/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

/**
 *
 * @author artem
 */
class Engine implements Car {
    
    public void start() {
        System.out.println("Start engine");
    }
    public void stop() {
        System.out.println("Stop engine");
        
    }
}
