package ButtonFactory;

import ButtonTypes.AddActivityButton;
import ButtonTypes.ChangeColorButton;
import ButtonTypes.DeleteActivityButton;
import ButtonTypes.StartStopButton;
import Main.StopWatchButton;

public class ButtonGenerator extends ButtonFactory {

    @Override
    StopWatchButton generateButton(String buttonName) {

        if (buttonName.equals("Add Activity")) {
            return new AddActivityButton();
        } else if (buttonName.equals("Change Color")) {
            return new ChangeColorButton();
        } else if (buttonName.equals("Delete Activity")) {
            return new DeleteActivityButton();
        } else if (buttonName.equals("Start/Stop")) {
            return new StartStopButton();
        } else {
            return null;
        }
    }
}


