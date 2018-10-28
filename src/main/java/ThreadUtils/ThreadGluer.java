package ThreadUtils;

/**
 * Created by yk on 2018/10/27.
 */
public class ThreadGluer {
    public static Runnable glueThread(Runnable runnabled,Runnable runnable){
        return new GlueThread(runnabled,runnable);
    }

}
