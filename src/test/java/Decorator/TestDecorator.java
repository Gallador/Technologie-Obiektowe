/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author artem
 */
public class TestDecorator {
    @Test
    public void DecoratorTest() {
        Car sportCar = new SportCar();
        Car blueUnknownCar = new BlueCarDecorator(new UnknownCar());
        sportCar.draw();
        System.out.println();
        blueUnknownCar.draw();
        assertEquals(true, ((BlueCarDecorator) blueUnknownCar).getState());
    }
}
