package Commands;

import Main.StopWatchButton;

public class StartStopCommand implements Command{
    
    StopWatchButton button;

    public StartStopCommand(StopWatchButton button) {
        this.button = button;
    }

    @Override
    public void execute() {
        button.click();
    } 
}
