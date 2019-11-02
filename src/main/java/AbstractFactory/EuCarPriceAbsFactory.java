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
public class EuCarPriceAbsFactory implements InteAbsFactory {
    public Maluch getMaluch() {
        return new EuMaluchImpl();
    }
    public Ferrari getFerrari() {
        return new EuFerrariImpl();
    }
    public Porshe getPorshe() {
        return new EuPorsheImpl();
    }
}
