package StopWatchTypes;

import Main.StopWatch;

public class CyclingStopWatch extends StopWatch{
        
            public CyclingStopWatch() {
                activityName = "Cycling Stopwatch";
            }
        
            public String getActivityName() {
                return activityName;
            }

            public String getBackgroundColor(){
                return "with Default background color\n";
            }
}
