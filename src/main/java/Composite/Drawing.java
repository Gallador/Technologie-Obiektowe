/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author artem
 */
class Drawing implements Car {
    private List<Car> cars = new ArrayList<Car>();
    boolean isAdded;
    boolean isDrawn;
    boolean isCleared;
    public void draw(String color) {
        for(Car car : cars) {
            car.draw(color);
            isDrawn = true;
        }
    }
    public void add(Car s){
        this.cars.add(s);
        isAdded = true;
    }
    public void clear(){
		System.out.println();
        this.cars.clear();
        isCleared = true;
    }
    public boolean isDrawn() {
        return isDrawn;
    }
    public boolean isAdded() {
        return isAdded;
    }
    public boolean isCleared() {
        return isCleared;
    }
}

