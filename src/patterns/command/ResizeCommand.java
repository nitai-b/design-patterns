package patterns.command;

import patterns.command.fx.Command;

public class ResizeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("BlackedAndWhited");
    }
}
