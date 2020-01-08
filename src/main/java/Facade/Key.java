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
class Key implements Car {
    public void start() {
        System.out.println("Put key");
    }
    public void stop() {
        System.out.println("Take key");
    }
}
