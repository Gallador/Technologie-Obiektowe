/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author artem
 */
public class TestSingleton {
    @Test
    public void Singleton()
    {
        Singleton result1 = Singleton.getInstance();
        Singleton result2 = Singleton.getInstance();
        assertEquals(result1, result2);
    }
}
