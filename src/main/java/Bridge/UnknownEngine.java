/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bridge;

/**
 *
 * @author artem
 */
class UnknownEngine implements Engine {
    public void setEngine(){
        System.out.println("unknown");
    }
}