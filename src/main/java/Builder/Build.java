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
class Build {
    private Builder builder;
    public Build(int i){
        if(i == 1) {
            builder = new OneBuilderImpl();
        } else if(i == 2) {
            builder = new TwoBuilderImpl();
        }
    }
    public Car buildCar(){
        return builder.buildCar();
    }
}
