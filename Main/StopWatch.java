package Main;
public abstract class StopWatch {

    protected String activityName;

    public void create() {
        System.out.print("Creating new " + activityName + " ");
    }

    public String getBackgroundColor() {
        return "with Default background color\n";
    }

    public void start() {
        System.out.println("Starting " + activityName);
    }

    public void stop() {
        System.out.println("Stopping " + activityName);
    }

    public String getActivityName() {
        return activityName;
    }
}


