/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author artem
 */
public class TestPrototype {
    @Test
    public void Prototype(){
    ComplicatedObject prototype = new ComplicatedObject();
    ComplicatedObject clone = prototype.copy();
    clone.setType(ComplicatedObject.Type.ONE);
    assertNotEquals(prototype, clone);
    }
}
