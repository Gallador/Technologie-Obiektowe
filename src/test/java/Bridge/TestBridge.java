/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bridge;

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
public class TestBridge {
    @Test
    public void TestBridge() {
        Car sportCar = new SportCar(new SportEngine());
        sportCar.setEngine();
        assertEquals(true, sportCar.isSetted);
        Car unknownCar = new UnknownCar(new UnknownEngine());
        unknownCar.setEngine();    
    }
}
