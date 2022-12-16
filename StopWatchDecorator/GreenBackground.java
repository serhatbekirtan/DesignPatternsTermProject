package StopWatchDecorator;

import Main.StopWatch;

public class GreenBackground extends StopWatchDecorator{
    StopWatch stopWatch;
    
    public GreenBackground(StopWatch stopWatch){
        this.stopWatch = stopWatch;
    }
    
    public String getActivityName(){
        return stopWatch.getActivityName() + " with " + backgroundColor();
    }
    
    public String backgroundColor(){
        return "Green background color";
    }
}
