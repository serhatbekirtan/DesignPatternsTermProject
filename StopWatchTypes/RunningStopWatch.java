package StopWatchTypes;

import Main.StopWatch;

public class RunningStopWatch extends StopWatch{

            public RunningStopWatch() {
                activityName = "Running Stopwatch";
            }
        
            public String getActivityName() {
                return activityName;
            }

            public String getBackgroundColor(){
                return "with Default background color\n";
            }
}
