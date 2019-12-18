/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Flyweight;

/**
 *
 * @author artem
 */
class Flyweight {
    private int row;
    public Flyweight(int row) {
        this.row = row;
        System.out.println("ctor: " + this.row);
    }
    void report(int col) {
        System.out.print(" " + row + col);
    }
}
