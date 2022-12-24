package patterns.command.fx;

/**
 * This is an interface that allows the clients of this interface to do something.
 * In this scenario, we have a button class with a dependency on an command.
 * In our own client (concrete class for the command) we may want to save something to a DB.
 * So in our code (the concrete class) we write our db specific logic.
 * When the client (the UI Button) wants to trigger an action, to save something to a DB, then we pass the to the
 * Button constructor, the command.
 *
 * Thinking about it, this is probably how the laravel Routes system works.
 */
public interface Command {
    void execute();
}
