package Commands;

import Main.StopWatchButton;

public class ChangeColorCommand implements Command{

    StopWatchButton button;

    public ChangeColorCommand(StopWatchButton button) {
        this.button = button;
    }

    @Override
    public void execute() {
        button.click();
    }
}
