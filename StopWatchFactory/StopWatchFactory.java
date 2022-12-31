package StopWatchFactory;
import Main.StopWatch;

public abstract class StopWatchFactory{

    public StopWatch createStopwatch(String activityName){

        StopWatch stopwatch = generateStopwatch(activityName);
        stopwatch.create();
        System.out.print(stopwatch.getBackgroundColor());
        
        return stopwatch;
    }

    abstract StopWatch generateStopwatch(String activityName);
}

