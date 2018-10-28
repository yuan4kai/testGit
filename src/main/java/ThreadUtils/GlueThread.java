package ThreadUtils;

/**
 * Created by yk on 2018/10/27.
 */
public class GlueThread implements Runnable{
    private Runnable runnable;
    private Runnable next;

    public GlueThread(Runnable runnable, Runnable next) {
        this.runnable = runnable;
        this.next = next;
    }

    public void run() {
        runnable.run();
        if(next!=null){
            next.run();
        }
    }
}
