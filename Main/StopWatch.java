package Main;
public abstract class StopWatch {

    protected String activityName;

    public void create() {
        System.out.print("Creating new " + activityName + " ");
    }

    public String getBackgroundColor() {
        return "with Default background color\n";
    }

    void start() {
        System.out.println("Starting stopwatch for " + activityName);
    }

    void stop() {
        System.out.println("Stopping stopwatch for " + activityName);
    }

    public String getActivityName() {
        return activityName;
    }
}
