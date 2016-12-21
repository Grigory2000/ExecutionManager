/**
 * Created by Григорий on 20.12.2016.
 */

public interface ExecutionManager {
    Context execute(Runnable callback, Runnable... tasks);

}
