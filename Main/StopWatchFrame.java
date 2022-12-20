package Main;

import java.util.LinkedList;

import ButtonFactory.ButtonFactory;
import ButtonFactory.ButtonGenerator;

public class StopWatchFrame {

    private static StopWatchFrame uniqueFrame = new StopWatchFrame();
    public LinkedList<StopWatchButton> buttons = new LinkedList<StopWatchButton>();
    public LinkedList<StopWatch> stopwatches = new LinkedList<StopWatch>();
    //private StopWatchFactory stopWatchFactory = new StopWatchGenerator();
    private ButtonFactory buttonFactory = new ButtonGenerator();

    private StopWatchFrame(){

        buttons.add(buttonFactory.createStopWatchButton("Add Activity"));
        buttons.add(buttonFactory.createStopWatchButton("Delete Activity"));
        buttons.add(buttonFactory.createStopWatchButton("Change Color"));
        buttons.add(buttonFactory.createStopWatchButton("Start/Stop"));

        System.out.println("");

        // StopWatch cyclingStopWatch = new RedBackground(stopwatches.get(1));
        // System.out.println(cyclingStopWatch.getActivityName());

        // System.out.println("");

        // StopWatch programmingStopWatch = new GreenBackground(stopwatches.get(2));
        // System.out.println(programmingStopWatch.getActivityName());

        // System.out.println("");

        // StopWatch stopwatchSwimming = new BlueBackground(stopwatches.get(3));
        // System.out.println(stopwatchSwimming.getActivityName());
    }

    public static StopWatchFrame getInstance(){
        return uniqueFrame;
    }

    public void printStopwatches(){
        System.out.println("");
        for (StopWatch stopwatch : stopwatches) {
            System.out.println(stopwatch.getActivityName());
        }
        System.out.println("");
    }
}
