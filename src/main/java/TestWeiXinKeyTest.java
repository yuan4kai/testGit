import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by yk on 2016/11/21.
 */
public class TestWeiXinKeyTest implements Runnable {

    private static Map map=new HashMap();

    private static String key=null;
    @Override
    public void run() {
        String romdom=""+(new Random()).nextInt();
        System.out.println("update  new Key:  "+romdom);
        key=romdom;
        //map.put("key",romdom);
    }

    private static ScheduledExecutorService scheduledExecutorService;




    public  static void main(String[] args) throws Exception{

        while(true){
            Thread.sleep(3000);
            if(key==null){
                String romdom=""+(new Random()).nextInt();
                System.out.println("get   new Key:  "+romdom);
                key=romdom;
                scheduledExecutorService= Executors.newSingleThreadScheduledExecutor();
                TestWeiXinKeyTest testWeiXinKeyTest=new TestWeiXinKeyTest();
                scheduledExecutorService.scheduleAtFixedRate(testWeiXinKeyTest, 5, 5, TimeUnit.SECONDS);
            }
            System.out.println("get     new Key:  " + key);
        }
    }
}
