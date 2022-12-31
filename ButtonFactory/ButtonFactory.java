package ButtonFactory;
import Main.StopWatchButton;

public abstract class ButtonFactory {

    public StopWatchButton createStopWatchButton(String buttonName){

        StopWatchButton button = generateButton(buttonName);
        button.create();

        return button;
    }

    abstract StopWatchButton generateButton(String buttonName);
}

