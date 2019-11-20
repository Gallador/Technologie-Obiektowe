/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
 *
 * @author artem
 */
class OneBuilderImpl extends Builder {
    public OneBuilderImpl(){
        car = new Car();
    }
    public Car buildCar() {
        car.buildBase();
        car.buildWheels();
        Engine engine = new OneEngine();
        car.buildEngine(engine);
        return car;
    }
}
