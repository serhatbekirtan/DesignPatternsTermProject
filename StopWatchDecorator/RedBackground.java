package StopWatchDecorator;

import Main.StopWatch;

public class RedBackground extends StopWatchDecorator{
    StopWatch stopWatch;
    
    public RedBackground(StopWatch stopWatch){
        this.stopWatch = stopWatch;
    }
    
    public String getActivityName(){
        return stopWatch.getActivityName() + " with " + backgroundColor();
    }
    
    public String backgroundColor(){
        return "Red background color";
    }
}
