package StopWatchTypes;

import Main.StopWatch;

public class SwimmingStopWatch extends StopWatch{
    
        public SwimmingStopWatch() {
            activityName = "Swimming Stopwatch";
        }
    
        public String getActivityName() {
            return activityName;
        }

        public String getBackgroundColor(){
            return "with Default background color\n";
        }
}
