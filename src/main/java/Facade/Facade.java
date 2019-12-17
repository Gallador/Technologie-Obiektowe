/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

/**
 *
 * @author artem
 */
class Facade {
    private Key key;
    private Engine engine;
    boolean isStarted;
    boolean isStopped;
    public Facade() {
        key = new Key();
        engine = new Engine();
    }
    public void startCar() {
        key.start();
        engine.start();
        isStarted = true;
    }
    public void stoptCar() {
        key.stop();
        engine.stop();
        isStopped = true;
    }
    public boolean isStarted() {
        return isStarted;
    }
    public boolean isStopped() {
        return isStopped;
    }
}
