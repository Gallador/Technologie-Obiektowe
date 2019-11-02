/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author artem
 */
public class TestAbstractFactory {
    @Test
    public void main() {
        String country = "PL";
        InteAbsFactory ifactory = null;
        if(country.equals("PL")) {
            ifactory = new PlCarPriceAbsFactory();
        } else if(country.equals("RU")) {
            ifactory = new EuCarPriceAbsFactory();
        }

        Maluch maluch = ifactory.getMaluch();
        long actual = maluch.getMaluchPrice();
        long expected = 1000;
        assertEquals(expected, actual);
    }
}
