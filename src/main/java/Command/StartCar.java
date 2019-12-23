/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

/**
 *
 * @author mrmas
 */
class StartCar implements Command {
    Car car;
    public StartCar(Car car) {
        this.car = car;
    }
    public void execute() {
        car.startEngine();
    }
}
