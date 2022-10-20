package patterns.memento;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<EditorState> states = new ArrayList<>();

    public EditorState pop() {
        /**
         * get the last index, get the value of the last index, then remove it, then return the last_state
         */
        var last_index = states.size() - 1;
        var last_state = states.get(last_index);
        states.remove(last_state);
        return last_state;
    }

    public void push(EditorState state) {
        states.add(state);
    }
}
