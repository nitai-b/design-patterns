package patterns.command;

import patterns.command.fx.Command;

import java.util.ArrayList;
import java.util.List;

public class CompositeCommand {
    private List<Command> commands = new ArrayList<>();

    public void add(Command command) {
        commands.add(command);
    }

    public void execute() {
        for (var command : this.commands) {
            command.execute();
        }
    }
}
