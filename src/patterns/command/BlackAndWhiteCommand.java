package patterns.command;

import patterns.command.fx.Command;

public class BlackAndWhiteCommand implements Command {

    @Override
    public void execute() {
        System.out.println("BlackedAndWhited");
    }
}
