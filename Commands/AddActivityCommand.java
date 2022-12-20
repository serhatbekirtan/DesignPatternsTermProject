package Commands;
import Main.StopWatchButton;
import StopWatchFactory.StopWatchFactory;

public class AddActivityCommand implements Command{

    StopWatchFactory factory;
    String activityName;
    StopWatchButton button;

    public AddActivityCommand(StopWatchButton button) {
        this.button = button;
    }

    @Override
    public void execute() {
        button.click();
    }
    
}
