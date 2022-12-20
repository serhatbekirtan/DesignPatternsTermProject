package ButtonTypes;

import java.util.Scanner;

import Main.StopWatch;
import Main.StopWatchButton;
import Main.StopWatchFrame;
import StopWatchDecorator.BlueBackground;
import StopWatchDecorator.GreenBackground;
import StopWatchDecorator.RedBackground;

public class ChangeColorButton extends StopWatchButton{

    public ChangeColorButton(){
        buttonName = "Change Activity Background Color";
    }

    public void click() {
        
        System.out.println("Change Activity Background Color Button Clicked");
        //StopWatch cyclingStopWatch = new RedBackground(stopwatches.get(1));
        StopWatchFrame frame = StopWatchFrame.getInstance();

        Scanner scanner = new Scanner(System.in);
        boolean whileLoopKey = true;

        while(whileLoopKey) {
            
            System.out.println("Which activity do you want to change the background color of?");

            for(int i = 0; i < frame.stopwatches.size(); i++){
                System.out.println(i + " ==> " + frame.stopwatches.get(i).getActivityName());
            }

            int activityToChangeBgColor = scanner.nextInt();

            System.out.println("Which color do you want to change the background to?");
            System.out.println("1 ==> Red");
            System.out.println("2 ==> Blue");
            System.out.println("3 ==> Green");

            int colorToChangeBgColor = scanner.nextInt();

            StopWatch activity = frame.stopwatches.get(activityToChangeBgColor);

            switch (colorToChangeBgColor){
                case 1:
                    StopWatch newRedBgActivity = new RedBackground(activity);
                    frame.stopwatches.set(activityToChangeBgColor, newRedBgActivity);
                    break;
                case 2:
                    StopWatch newBlueBgActivity = new BlueBackground(activity);
                    frame.stopwatches.set(activityToChangeBgColor, newBlueBgActivity);
                    break;
                case 3:
                    StopWatch newGreenBgActivity = new GreenBackground(activity);
                    frame.stopwatches.set(activityToChangeBgColor, newGreenBgActivity);
                    break;
                default:
                    System.out.println("Not defined selection.");
            }

            whileLoopKey = false;
        }
    }
}
