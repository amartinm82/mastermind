package amartinm.mastermind.models;

import java.util.ArrayList;
import java.util.List;

public class GameRegistry {

    private List<GameMemento> mementoList;
    private final Game game;

    private int firstPrevious;

    GameRegistry(Game game) {
        this.game = game;
        this.reset();
    }

    void reset() {
        this.mementoList = new ArrayList<>();
        this.firstPrevious = 0;
    }

    void registry() {
        for (int i = 0; i < this.firstPrevious; i++) {
            this.mementoList.remove(0);
        }
        this.firstPrevious = 0;
        this.mementoList.add(this.firstPrevious, this.game.createMemento());
    }

    void undo() {
        if (this.mementoList.size() > 0)
            this.firstPrevious++;
        this.game.set(this.mementoList.get(this.firstPrevious));
    }

    void redo() {
        this.firstPrevious--;
        this.game.set(this.mementoList.get(this.firstPrevious));
    }

    boolean undoable() {
        return this.firstPrevious < this.mementoList.size() - 1;
    }

    boolean redoable() {
        return this.firstPrevious >= 1;
    }

}
