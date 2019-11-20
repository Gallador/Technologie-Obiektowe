/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
 *
 * @author artem
 */
abstract class Builder {
    protected Car car;
    public abstract Car buildCar();
}
