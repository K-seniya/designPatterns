package behavioural.mediator;


import java.util.Timer;
import java.util.TimerTask;

public class JavaUsageDemo {

    private Timer timer;

    public JavaUsageDemo(int seconds) {
        timer = new Timer();
        timer.schedule(new RemindTask(), seconds * 1000);
        timer.schedule(new RemindTaskWithoutBeep(), seconds * 2 * 1000);
    }

    private class RemindTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("Time's up!");
        }
    }

    private class RemindTaskWithoutBeep extends TimerTask{
        @Override
        public void run() {
            System.out.println("Now Time's really up!");
        }
    }

    public static void main(String[] args) {
        System.out.println("About to schedule task.");
        new JavaUsageDemo(3);
        System.out.println("Task scheduled.");
    }
}
