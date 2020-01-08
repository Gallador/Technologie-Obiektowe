/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

/**
 *
 * @author mrmas
 */
class DownloadWindownsStrategy implements Strategy {
    public void download(String file) {
        System.out.println("Windows download: " + file);
    }
}
