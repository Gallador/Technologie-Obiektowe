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
    class SportCar extends Car {
    public SportCar(Engine engine) {
        super(engine);
    }
    public void setEngine() {
        System.out.print("SportCar engine: ");
        engine.setEngine();
    }
}

