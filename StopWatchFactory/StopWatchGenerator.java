package StopWatchFactory;

import Main.StopWatch;
import StopWatchTypes.CyclingStopWatch;
import StopWatchTypes.GamingStopWatch;
import StopWatchTypes.ProgrammingStopWatch;
import StopWatchTypes.RunningStopWatch;
import StopWatchTypes.SwimmingStopWatch;
import StopWatchTypes.WalkingStopWatch;

public class StopWatchGenerator extends StopWatchFactory {
    @Override
    StopWatch generateStopwatch(String activityName) {
        if (activityName.equals("running")) {
            return new RunningStopWatch();
        } else if (activityName.equalsIgnoreCase("swimming")) {
            return new SwimmingStopWatch();
        } else if (activityName.equalsIgnoreCase("cycling")) {
            return new CyclingStopWatch();
        } else if (activityName.equalsIgnoreCase("walking")) {
            return new WalkingStopWatch();
        } else if(activityName.equalsIgnoreCase("gaming")){
            return new GamingStopWatch();
        } else if(activityName.equalsIgnoreCase("programming")){
            return new ProgrammingStopWatch();
        } else if(activityName.equalsIgnoreCase("running")){
            return new RunningStopWatch();
        } else {
            return null;
        }
    }
}

