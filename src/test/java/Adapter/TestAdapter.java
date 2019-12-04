/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

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
public class TestAdapter {
        @Test
	public void AdapterTest() {
		PBank pbank = new PBank();
                int expectedpbank = 100;
                int currentpbank = pbank.getBalance();
                assertEquals(expectedpbank, currentpbank);
		PBankAdapter abank = new PBankAdapter(new ABank());
                int expectedabank = 200;
                int currentabank = abank.getBalance();
                assertEquals(expectedabank, currentabank);
	}
}
