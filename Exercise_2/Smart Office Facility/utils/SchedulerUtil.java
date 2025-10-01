package utils;

public class SchedulerUtil {
    public static void schedule(Runnable task, int minutesDelay) {
        Thread schedulerThread = new Thread(() -> {
            try {
                Thread.sleep(minutesDelay * 60 * 1000); // delay in minutes
                task.run(); // execute the task after delay
            } catch (InterruptedException e) {
                System.out.println("Scheduler thread interrupted: " + e.getMessage());
            }
        });
        schedulerThread.start();
    }
}
