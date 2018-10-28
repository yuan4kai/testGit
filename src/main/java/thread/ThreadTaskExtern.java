package thread;

/**
 * Created by yk on 2018/10/26.
 */
public abstract class ThreadTaskExtern<T extends Runnable>  {
    private ThreadTaskExtern<T> next;;
    public  void onEnd(T ruanable){
        run(ruanable);
        if(next!=null){
            next.onEnd( ruanable);
        }
    }
    protected abstract void run(T ruanable);

    public void addThreadListen(ThreadTaskExtern<T> threadTaskExtern){
        if(next==null){
            next=threadTaskExtern;
        }else{
            next.addThreadListen(threadTaskExtern);
        }
    }

}
