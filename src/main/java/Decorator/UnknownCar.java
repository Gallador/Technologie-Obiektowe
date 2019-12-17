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
class UnknownCar implements Car {
    private boolean state;
    public void draw() {
        System.out.println("UnknownCar");
    }
     public void operation() {
    state = true;
  }

  public boolean isState() {
    return state;
  }
}
