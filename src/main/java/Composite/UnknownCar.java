/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

/**
 *
 * @author artem
 */
class UnknownCar implements Car {
    public void draw(String color) {
        System.out.println("UnknownCar color: " + color);
    }
}