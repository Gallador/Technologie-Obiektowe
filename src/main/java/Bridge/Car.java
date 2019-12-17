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
abstract class Car {
    protected Engine engine;
    boolean isSetted;
    public Car(Engine engine){
        this.engine = engine;
        isSetted = true;
    }
    abstract public void setEngine();
    public boolean isSetted() {
        return isSetted;
    } 
}
