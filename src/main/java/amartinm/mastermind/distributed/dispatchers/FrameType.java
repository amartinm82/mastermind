package amartinm.mastermind.distributed.dispatchers;

public enum FrameType {
    START,
    STATE,
    UNDO,
    REDO,
    UNDOABLE,
    REDOABLE,
    COMBINATION_VALID,
    ADD_PROPOSAL,
    GET_ATTEMPTS,
    GET_PROPOSAL,
    GET_RESULT,
    WINNER,
    LOOSER,
    NEW_GAME,
    CLOSE;

    public static FrameType parser(String string) {
        for (FrameType frameType : FrameType.values()) {
            if (frameType.name().equals(string)) {
                return frameType;
            }
        }
        return null;
    }
}
