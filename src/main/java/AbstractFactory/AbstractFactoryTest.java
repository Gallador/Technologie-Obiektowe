/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author artem
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        String country = "PL";
        InteAbsFactory ifactory = null;
        if(country.equals("PL")) {
            ifactory = new PlCarPriceAbsFactory();
        } else if(country.equals("RU")) {
            ifactory = new EuCarPriceAbsFactory();
        }

        Maluch maluch = ifactory.getMaluch();
        System.out.println(maluch.getMaluchPrice());
    }
}
