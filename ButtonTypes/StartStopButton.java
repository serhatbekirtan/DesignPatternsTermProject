package ButtonTypes;

import java.util.Scanner;

import Main.StopWatchButton;
import Main.StopWatchFrame;

public class StartStopButton extends StopWatchButton{

    boolean isRunning = false;

    public StartStopButton(){
        buttonName = "Start/Stop";
    }

    public void click() {

        StopWatchFrame frame = StopWatchFrame.getInstance();

        Scanner scanner = new Scanner(System.in);
        boolean whileLoopKey = true;

        while(whileLoopKey) {
            
            System.out.println("Start/Stop Button Clicked");
            System.out.println("Which activity do you want to Start/Stop?");

            for(int i = 0; i < frame.stopwatches.size(); i++){
                System.out.println(i + " ==> " + frame.stopwatches.get(i).getActivityName());
            }

            int stopWatchToStartStop = scanner.nextInt();

            if(isRunning){
                frame.stopwatches.get(stopWatchToStartStop).stop();
                isRunning = false;
            } else {
                frame.stopwatches.get(stopWatchToStartStop).start();
                isRunning = true;
            }
            
            whileLoopKey = false;
        }
    }
}
