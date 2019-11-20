/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;


import org.junit.Test;


/**
 *
 * @author artem
 */
public class TestBuilder {
    @Test
    public void main(){
    Build build = new Build(1);
    build.buildCar();
    }
}