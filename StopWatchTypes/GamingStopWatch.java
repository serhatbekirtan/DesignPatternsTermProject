package StopWatchTypes;

import Main.StopWatch;

public class GamingStopWatch extends StopWatch{
        
            public GamingStopWatch() {
                activityName = "Gaming Stopwatch";
            }
        
            public String getActivityName() {
                return activityName;
            }

            public String getBackgroundColor(){
                return "with Default background color\n";
            }
}
