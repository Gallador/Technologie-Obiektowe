/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

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
public class TestComposite {
    @Test
    public void TestComposite() {
        Car sportCar = new SportCar();
        Drawing drawing = new Drawing();
        drawing.add(sportCar);
        drawing.draw("green");
        drawing.clear();
        assertEquals(true, drawing.isAdded);
        assertEquals(true, drawing.isDrawn);
        assertEquals(true, drawing.isCleared);
    }
    
}
