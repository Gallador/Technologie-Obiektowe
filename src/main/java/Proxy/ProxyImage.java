/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;

/**
 *
 * @author artem
 */
public class ProxyImage implements Image {
    private RealImage realImage;

  public void display() {
    this.realImage = new RealImage();
    this.realImage.display();
  }

  public RealImage getRealImage() {
    return realImage;
  }
}

