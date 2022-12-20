package ButtonTypes;

import java.util.Scanner;
import Main.StopWatchButton;
import Main.StopWatchFrame;

public class DeleteActivityButton extends StopWatchButton{

    public DeleteActivityButton(){
        buttonName = "Delete Activity";
    }

    public void click() {

        System.out.println("Delete Activity Button Clicked");
        StopWatchFrame frame = StopWatchFrame.getInstance();

        Scanner scanner = new Scanner(System.in);
        boolean whileLoopKey = true;

        while(whileLoopKey) {
            
            System.out.println("Which activity do you want to delete?");

            for(int i = 0; i < frame.stopwatches.size(); i++){
                System.out.println(i + " ==> " + frame.stopwatches.get(i).getActivityName());
            }

            int stopWatchToDelete = scanner.nextInt();
            frame.stopwatches.remove(stopWatchToDelete);
            
            whileLoopKey = false;
        }
    }
}
