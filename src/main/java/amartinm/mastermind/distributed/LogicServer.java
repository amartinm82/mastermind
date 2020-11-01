package amartinm.mastermind.distributed;

import amartinm.mastermind.controllers.Logic;
import amartinm.mastermind.distributed.dispatchers.*;
import amartinm.mastermind.distributed.dispatchers.undoredo.RedoDispatcher;
import amartinm.mastermind.distributed.dispatchers.undoredo.RedoableDispatcher;
import amartinm.mastermind.distributed.dispatchers.undoredo.UndoDispatcher;
import amartinm.mastermind.distributed.dispatchers.undoredo.UndoableDispatcher;

public class LogicServer extends Logic {

    public LogicServer(boolean isStandalone) {
        super(isStandalone);
    }

    public void createDispatchers(DispatcherPrototype dispatcherPrototype) {
        dispatcherPrototype.add(FrameType.START, new StartDispatcher(this.startController));
        dispatcherPrototype.add(FrameType.STATE, new StateDispatcher(this.playController));
        dispatcherPrototype.add(FrameType.UNDO, new UndoDispatcher(this.playController));
        dispatcherPrototype.add(FrameType.REDO, new RedoDispatcher(this.playController));
        dispatcherPrototype.add(FrameType.UNDOABLE, new UndoableDispatcher(this.playController));
        dispatcherPrototype.add(FrameType.REDOABLE, new RedoableDispatcher(this.playController));
        dispatcherPrototype.add(FrameType.COMBINATION_VALID, new CombinationValidDispatcher(this.playController));
        dispatcherPrototype.add(FrameType.ADD_PROPOSAL, new AddProposalDispatcher(this.playController));
        dispatcherPrototype.add(FrameType.GET_ATTEMPTS, new GetAttemptsDispatcher(this.playController));
        dispatcherPrototype.add(FrameType.GET_PROPOSAL, new GetProposalDispatcher(this.playController));
        dispatcherPrototype.add(FrameType.GET_RESULT, new GetResultDispatcher(this.playController));
        dispatcherPrototype.add(FrameType.WINNER, new IsWinnerDispatcher(this.playController));
        dispatcherPrototype.add(FrameType.LOOSER, new IsLooserDispatcher(this.playController));
        dispatcherPrototype.add(FrameType.NEW_GAME, new ResumeDispatcher(this.resumeController));
    }

}

