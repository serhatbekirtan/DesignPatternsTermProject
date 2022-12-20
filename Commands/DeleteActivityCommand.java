package Commands;

import Main.StopWatchButton;
import StopWatchFactory.StopWatchFactory;

public class DeleteActivityCommand implements Command{

    StopWatchButton button;

    public DeleteActivityCommand(StopWatchButton button) {
        this.button = button;
    }

    @Override
    public void execute() {
        button.click();
    }
}
