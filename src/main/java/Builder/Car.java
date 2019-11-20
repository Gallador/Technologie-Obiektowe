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
public class Car {
    public void buildBase() {
        print("Building base");
    }
    public void buildWheels() {
        print("Building wheels");
    }
    public void buildEngine(Engine engine) {
        print("Building engine: " + engine.getEngineType());
    }
    private void print(String msg){
        System.out.println(msg);
    }
}
