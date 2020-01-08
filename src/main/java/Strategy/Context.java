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
public class Context {
    private Strategy strategy;
    boolean isDownloaded;
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    public void download(String file) {
        strategy.download(file);
        isDownloaded = true;
    }
    public boolean isDownloaded() {
        return isDownloaded;
    }
}
