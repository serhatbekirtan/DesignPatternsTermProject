package Main;

import java.util.ArrayList;

import ButtonFactory.ButtonFactory;
import ButtonFactory.ButtonGenerator;

public class StopWatchFrame {

    private static StopWatchFrame uniqueFrame = new StopWatchFrame();
    public ArrayList<StopWatchButton> buttons = new ArrayList<>();
    public ArrayList<StopWatch> stopwatches = new ArrayList<>();
    private ButtonFactory buttonFactory = new ButtonGenerator();

    private StopWatchFrame(){

        buttons.add(buttonFactory.createStopWatchButton("Add Activity"));
        buttons.add(buttonFactory.createStopWatchButton("Delete Activity"));
        buttons.add(buttonFactory.createStopWatchButton("Change Color"));
        buttons.add(buttonFactory.createStopWatchButton("Start/Stop"));

        System.out.println();
    }

    public static StopWatchFrame getInstance(){
        return uniqueFrame;
    }

    public void printStopwatches(){
        System.out.println();
        for (StopWatch stopwatch : stopwatches) {
            System.out.println(stopwatch.getActivityName());
        }
        System.out.println();
    }
}
