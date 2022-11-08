package patterns.memento;

public class EditorState {
    // the final keyword add some robustness to the program.
    // it makes sure that once we initialize this field, it can't be modified during the program execution
    // in the future, we can add more fields to this class.
    private final String content;

    public EditorState(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
