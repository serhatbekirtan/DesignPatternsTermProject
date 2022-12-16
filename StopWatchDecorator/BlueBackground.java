package StopWatchDecorator;

import Main.StopWatch;

public class BlueBackground extends StopWatchDecorator{
    StopWatch stopWatch;
    
    public BlueBackground(StopWatch stopWatch){
        this.stopWatch = stopWatch;
    }
    
    public String getActivityName(){
        return stopWatch.getActivityName() + " with " + backgroundColor();
    }
    
    public String backgroundColor(){
        return "Blue background color";
    }
}
