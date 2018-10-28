package thread;

/**
 * Created by yk on 2018/10/26.
 */
public class TaskThreadGluer<T extends Runnable> implements Runnable{
    private Runnable runnable;
    private ThreadTaskExtern threadTaskExtern;


    public TaskThreadGluer(Runnable runnable, ThreadTaskExtern<T> threadTaskExtern) {
        this.runnable = runnable;
        this.threadTaskExtern = threadTaskExtern;
    }

    public TaskThreadGluer(Runnable runnable) {
        super();
    }

    public void addThreadTaskExtern(ThreadTaskExtern threadTaskExtern){
        if(threadTaskExtern==null){
            threadTaskExtern=null;
        }else {
            threadTaskExtern.addThreadListen(threadTaskExtern);
        }
    }

    @Override
    public void run() {
        runnable.run();
        threadTaskExtern.onEnd(runnable);

    }
}
