import javafx.concurrent.Task;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.*;

/**
 * Created by yk on 2016/11/7.
 */
public class testUpateKEY  implements Runnable {
    @Override
    public void run() {
        System.out.printf("%s: Starting at : %s\n",name,new Date());
    }

    private String name;

    public testUpateKEY(String name) {
        super();
        this.name = name;
    }

  //  public static void main(String[] args) throws Exception{
       /*// ScheduledThreadPoolExecutor executor = (ScheduledThreadPoolExecutor) Executors.newSingleThreadScheduledExecutor();
        ScheduledExecutorService scheduledExecutorService=Executors.newSingleThreadScheduledExecutor();
        System.out.printf("Main: Starting at: %s\n",new Date());
        for(int i = 0; i < 2; i++) {
            testUpateKEY task = new testUpateKEY("Task " + i);
           // scheduledExecutorService.schedule(task, 30, TimeUnit.SECONDS);
            scheduledExecutorService.scheduleAtFixedRate(task , 3, 3, TimeUnit.SECONDS);
        }
        //scheduledExecutorService.shutdown();


       try {
            scheduledExecutorService.awaitTermination(10, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("Main: Ends at: %s\n",new Date());*/
   /*     Calendar cal = Calendar. getInstance ();
        Date last=cal.getTime();
        // long=cal.set(Calendar. HOUR , Calendar. HOUR -1 ) ; //把时间设置为当前时间-1小时，同理，也可以设置其他时间
        cal.add(Calendar.MONTH, -1);
        //cal.set(Calendar. MONTH , Calendar. MONTH -1); //当前月前一月
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(last.getTime());*/
       /* Date start=null;
        Date last=null;
        DateFormat dateFormat1=new SimpleDateFormat("yyyy-MM-dd");
        Date now=new Date();
        Calendar cstart = Calendar.getInstance();
        cstart.setTime(dateFormat1.parse(dateFormat1.format(now)));
        cstart.add(Calendar.MONTH, 0);
        cstart.set(Calendar.DAY_OF_MONTH, 1);
        start=cstart.getTime();
        Calendar clast = Calendar.getInstance();
        clast.setTime(dateFormat1.parse(dateFormat1.format(now)));
        clast.set(Calendar.DAY_OF_MONTH, clast.getActualMaximum(Calendar.DAY_OF_MONTH));
        last=clast.getTime();
        System.out.println(dateFormat1.format(start));
        System.out.println(dateFormat1.format(last));*/
    //}


    public static void main(String[] args) throws Exception{
       // ScheduledThreadPoolExecutor scheduledExecutorService = (ScheduledThreadPoolExecutor) Executors.newSingleThreadScheduledExecutor();
       ScheduledExecutorService scheduledExecutorService=Executors.newSingleThreadScheduledExecutor();
        System.out.printf("Main: Starting at: %s\n",new Date());
        for(int i = 0; i < 2; i++) {
            testUpateKEY task = new testUpateKEY("Task " + i);
            // scheduledExecutorService.schedule(task, 30, TimeUnit.SECONDS);
            scheduledExecutorService.scheduleAtFixedRate(task , 3, 3, TimeUnit.SECONDS);
        }
        //scheduledExecutorService.shutdown();



        System.out.printf("Main: Ends at: %s\n",new Date());
    }

}
