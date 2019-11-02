/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author artem
 */
public class TestFactoryMethod {
    @Test
    public void main() throws Exception {
        String win = "linux";
        Factory factory = new Factory();
       
        assertTrue(factory.getCurrentOS("linux") instanceof linuxOS);
    }
}