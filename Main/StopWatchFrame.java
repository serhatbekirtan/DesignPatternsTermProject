package Main;

import StopWatchDecorator.BlueBackground;
import StopWatchDecorator.GreenBackground;
import StopWatchDecorator.RedBackground;
import StopWatchFactory.StopWatchFactory;
import StopWatchFactory.StopWatchGenerator;

public class StopWatchFrame {

    private static StopWatchFrame uniqueFrame = new StopWatchFrame();

    private StopWatchFrame(){

        StopWatchFactory factory = new StopWatchGenerator();

        StopWatch stopwatchCycling = factory.createStopwatch("cycling");
        stopwatchCycling = new RedBackground(stopwatchCycling);
        System.out.println(stopwatchCycling.getActivityName());

        System.out.println("");

        StopWatch stopwatchProgramming = factory.createStopwatch("programming");
        stopwatchProgramming = new GreenBackground(stopwatchProgramming);
        System.out.println(stopwatchProgramming.getActivityName());

        System.out.println("");

        StopWatch stopwatchSwimming = factory.createStopwatch("swimming");
        stopwatchSwimming = new BlueBackground(stopwatchSwimming);
        System.out.println(stopwatchSwimming.getActivityName());
    }

    public static StopWatchFrame getInstance(){
        return uniqueFrame;
    }
}
