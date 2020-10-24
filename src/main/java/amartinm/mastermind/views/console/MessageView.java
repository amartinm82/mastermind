package amartinm.mastermind.views.console;

import amartinm.utils.Console;

enum MessageView {
    ATTEMPTS("#attempts attempt(s): "),
    SECRET("*"),
    RESUME("Do you want to continue"),
    RESULT(" --> #blacks blacks and #whites whites"),
    PROPOSED_COMBINATION("Propose a combination: "),
    TITLE("----- MASTERMIND -----"),
    WINNER("You've won!!! ;-)"),
    LOOSER("You've lost!!! :-("),
    ACTION_COMMAND("Do an action"),
    UNDO_COMMAND("Undo previous action"),
    REDO_COMMAND("Redo previous action");

    private final String message;

    private final Console console = Console.instance();

    MessageView(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    void write() {
        this.console.write(this.message);
    }

    void writeln() {
        this.console.writeln(this.message);
    }

    void writeln(int attempts) {
        this.console.writeln(this.message.replaceAll("#attempts", "" + attempts));
    }

    void writeln(int blacks, int whites) {
        this.console.writeln(this.message.replaceFirst("#blacks", "" + blacks).replaceFirst("#whites", "" + whites));
    }

}
