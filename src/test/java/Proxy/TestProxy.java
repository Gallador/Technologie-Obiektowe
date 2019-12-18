/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;

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
public class TestProxy {
    @Test
    public void TestProxy() {
        ProxyImage proxyimage = new ProxyImage();
        assertEquals(null, proxyimage.getRealImage());
        proxyimage.display();
        assertNotNull(proxyimage.getRealImage());
    }
}
