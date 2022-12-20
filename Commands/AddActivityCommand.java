package Commands;
import Main.StopWatchButton;

public class AddActivityCommand implements Command{

    StopWatchButton button;

    public AddActivityCommand(StopWatchButton button) {
        this.button = button;
    }

    @Override
    public void execute() {
        button.click();
    }
    
}
