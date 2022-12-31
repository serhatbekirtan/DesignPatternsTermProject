package ButtonTypes;

import java.util.Scanner;

import Main.StopWatchButton;
import Main.StopWatchFrame;
import StopWatchFactory.StopWatchFactory;
import StopWatchFactory.StopWatchGenerator;

public class AddActivityButton extends StopWatchButton{

    StopWatchFactory factory = new StopWatchGenerator();
    String activityName;
    
    public AddActivityButton(){
        buttonName = "Add Activity";
    }

    public void click() {

        System.out.println("Add Activity Button Clicked\n");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Activity Name: ");
        activityName = input.nextLine();

        System.out.println();

        StopWatchFrame.getInstance().stopwatches.add(factory.createStopwatch(activityName));

        System.out.println();
    }
}
