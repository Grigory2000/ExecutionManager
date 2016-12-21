/**
 * Created by Григорий on 20.12.2016.
 */

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ExecutionManager executionManager = new ExecutionManagerImpl();
        Runnable callback = new Task("callback", 0, false);
        Runnable[] tasks = {new Task("message 1", 300, true), new Task("message 2", 500, false), new Task("message 3", 0, false),
                new Task("message 4", 2, false), new Task("message 5", 5, false), new Task("message 6", 6, false)};
        Context execute = executionManager.execute(callback, tasks);

        Thread.sleep(1);
        execute.interrupt();
        Thread.sleep(1000);
        System.out.println(execute.isFinished());
        System.out.println(execute.getFailedTaskCount());
        System.out.println(execute.getCompletedTaskCount());
        System.out.println(execute.getInterruptedTaskCount());


    }
}
