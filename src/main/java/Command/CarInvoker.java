/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

/**
 *
 * @author mrmas
 */
public class CarInvoker {
    public Command command;
    boolean isInvoked;
    public CarInvoker(Command command) {
        this.command = command;
    }
    public void execute() {
        this.command.execute();
        isInvoked = true;
    }
    public boolean isInvoked() {
        return isInvoked;
    }
}
