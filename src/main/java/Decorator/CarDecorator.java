/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author artem
 */
abstract class CarDecorator implements Car {
    protected Car decorated;
    boolean isDecorated;
    public CarDecorator(Car decorated){
        this.decorated = decorated;
        isDecorated = false;
    }
    public void draw(){
        decorated.draw();
    }
    
    public boolean getState(){
        
        return isDecorated;
        
    }
    
}
