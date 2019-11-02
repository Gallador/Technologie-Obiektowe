package AbstractFactory;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author artem
 */
public class PlCarPriceAbsFactory implements InteAbsFactory
{
    public Maluch getMaluch()
    {
        return new PlMaluchImpl();
    }
    
    public Ferrari getFerrari()
    {
        return new PlFerrariImpl();
    }
    
    public Porshe getPorshe()
    {
        return new PlPorsheImpl();
    }
}
