/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

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
public class TestFacade {
    @Test
    public void TestFacade() {
        Facade facade = new Facade();
        facade.startCar();
        assertEquals(true, facade.isStarted); 
        facade.stoptCar();
        assertEquals(true, facade.isStopped);
    }
}
