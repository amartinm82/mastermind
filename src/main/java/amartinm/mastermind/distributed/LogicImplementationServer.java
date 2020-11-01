package amartinm.mastermind.distributed;

import amartinm.mastermind.controllers.implementation.LogicImplementation;
import amartinm.mastermind.distributed.dispatchers.*;
import amartinm.mastermind.distributed.dispatchers.undoredo.RedoDispatcher;
import amartinm.mastermind.distributed.dispatchers.undoredo.RedoableDispatcher;
import amartinm.mastermind.distributed.dispatchers.undoredo.UndoDispatcher;
import amartinm.mastermind.distributed.dispatchers.undoredo.UndoableDispatcher;

public class LogicImplementationServer extends LogicImplementation {

    public void createDispatchers(DispatcherPrototype dispatcherPrototype) {
        dispatcherPrototype.add(FrameType.START, new StartDispatcher(this.startControllerImplementation));
        dispatcherPrototype.add(FrameType.STATE, new StateDispatcher(this.playControllerImplementation));
        dispatcherPrototype.add(FrameType.UNDO, new UndoDispatcher(this.playControllerImplementation));
        dispatcherPrototype.add(FrameType.REDO, new RedoDispatcher(this.playControllerImplementation));
        dispatcherPrototype.add(FrameType.UNDOABLE, new UndoableDispatcher(this.playControllerImplementation));
        dispatcherPrototype.add(FrameType.REDOABLE, new RedoableDispatcher(this.playControllerImplementation));
        dispatcherPrototype.add(FrameType.COMBINATION_VALID, new CombinationValidDispatcher(this.playControllerImplementation));
        dispatcherPrototype.add(FrameType.ADD_PROPOSAL, new AddProposalDispatcher(this.playControllerImplementation));
        dispatcherPrototype.add(FrameType.GET_ATTEMPTS, new GetAttemptsDispatcher(this.playControllerImplementation));
        dispatcherPrototype.add(FrameType.GET_PROPOSAL, new GetProposalDispatcher(this.playControllerImplementation));
        dispatcherPrototype.add(FrameType.GET_RESULT, new GetResultDispatcher(this.playControllerImplementation));
        dispatcherPrototype.add(FrameType.WINNER, new IsWinnerDispatcher(this.playControllerImplementation));
        dispatcherPrototype.add(FrameType.LOOSER, new IsLooserDispatcher(this.playControllerImplementation));
        dispatcherPrototype.add(FrameType.NEW_GAME, new ResumeDispatcher(this.resumeControllerImplementation));
    }

}

