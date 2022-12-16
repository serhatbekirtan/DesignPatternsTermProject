package StopWatchTypes;

import Main.StopWatch;

public class WalkingStopWatch extends StopWatch{
        
            public WalkingStopWatch() {
                activityName = "Walking Stopwatch";
            }
        
            public String getActivityName() {
                return activityName;
            }

            public String getBackgroundColor(){
                return "with Default background color\n";
            }
}
