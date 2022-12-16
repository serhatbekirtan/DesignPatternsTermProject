package StopWatchTypes;

import Main.StopWatch;

public class ProgrammingStopWatch extends StopWatch{

            public ProgrammingStopWatch() {
                activityName = "Programming Stopwatch";
            }
        
            public String getActivityName() {
                return activityName;
            }

            public String getBackgroundColor(){
                return "with Default background color\n";
            }
}
