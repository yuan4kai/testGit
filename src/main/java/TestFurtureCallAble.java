import java.util.Date;
import java.util.Random;
import java.util.concurrent.*;

/**
 * Created by yk on 2016/11/21.
 */
public class TestFurtureCallAble implements Callable<String> {






    @Override
    public String call() throws Exception {
        Thread.sleep(5000);
        System.out.println("call:" + new Date());
        Random random=new Random();
        String d=""+random.nextInt();
        System.out.println("create:"+d);
        return d;
    }

    public static void main(String[] args) throws Exception{
        TestFurtureCallAble testFurtureCallAble=new TestFurtureCallAble();

        FutureTask<String> future = new FutureTask<String>(testFurtureCallAble);
        ScheduledExecutorService scheduledExecutorService= Executors.newSingleThreadScheduledExecutor();
        ScheduledFuture<String> scheduledFuture=(ScheduledFuture<String> )scheduledExecutorService.scheduleAtFixedRate(future, 0, 3, TimeUnit.SECONDS);
        //scheduledExecutorService.awaitTermination(10, TimeUnit.DAYS);
        System.out.println("main:"+new Date());
        Thread.sleep(10000);
        System.out.println("after main sleep:"+new Date());
        String resutl=future.get();
        System.out.println(resutl);
        System.out.println(new Date());
        scheduledExecutorService.awaitTermination(10, TimeUnit.DAYS);
        //scheduledExecutorService.shutdown();



    }
}
