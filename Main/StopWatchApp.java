package Main;

import java.util.Scanner;

import Commands.AddActivityCommand;
import Commands.DeleteActivityCommand;
import Commands.StartStopCommand;
import Commands.ChangeColorCommand;
import Commands.Button;

public class StopWatchApp {

    public static void main(String[] args) {

        StopWatchFrame frame = StopWatchFrame.getInstance();

        Button addActivitybutton = new Button(new AddActivityCommand(frame.buttons.get(0)));
        Button deleteActivitybutton = new Button(new DeleteActivityCommand(frame.buttons.get(1)));
        Button changeColorbutton = new Button(new ChangeColorCommand(frame.buttons.get(2)));
        Button startStopButton = new Button(new StartStopCommand(frame.buttons.get(3)));

        Scanner scanner = new Scanner(System.in);
        System.out.println("******* Welcome to Activity Tracker APP *******");

        boolean whileLoopKey = true;

        while(whileLoopKey) {

            System.out.println("What do you want to do?");
            System.out.println("1 ==> Add Activity");
            System.out.println("2 ==> Delete Activity");
            System.out.println("3 ==> Change Activity Background Color");
            System.out.println("4 ==> Start/Stop Activity Stopwatch");
            System.out.println("5 ==> Show all Activities");
            System.out.println("6 ==> Exit");

            int userButtonPress = scanner.nextInt();

            switch (userButtonPress){
                case 1:
                    addActivitybutton.press();
                    break;
                case 2:
                    deleteActivitybutton.press();
                    break;
                case 3:
                    changeColorbutton.press();
                    break;
                case 4:
                    startStopButton.press();
                    break;
                case 5:
                    frame.printStopwatches();
                    break;
                case 6:
                    whileLoopKey = false;
                    break;
                default:
                    System.out.println("Not defined selection.");
            }
        }

        scanner.close();
    }
}