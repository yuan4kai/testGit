import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.*;

/**
 * Created by yk on 2016/9/30.
 */
public class testMap {
    private static ConcurrentHashMap map=new ConcurrentHashMap();


/*    public static void  main(String[] arg){
        map.put(0,1);
        map.put(1,1);
        ExecutorService executorService= Executors.newFixedThreadPool(100);
        //executorService.
        int taskint=200;
        Set<Runnable> runnables=new HashSet<>();
        for(int i=0;i<=taskint;i++){
            runnables.add(new TestTheand());
        }
        executorService.i

    }*/

    public static void main(String[] args) throws Exception{
      /*  double distance=getDistance(30.645969,114.299895,30.593099,114.305393)*1000;
        System.out.println(distance);*/
        Date start=null;
        Date last=null;
        DateFormat dateFormat1=new SimpleDateFormat("yyyy-MM-dd");
        Date now=new Date();
        Calendar cstart = Calendar.getInstance();
        cstart.setTime(dateFormat1.parse(dateFormat1.format(now)));
        cstart.set(Calendar.MONTH,1);
        cstart.set(Calendar.DAY_OF_MONTH, 1);
        start=cstart.getTime();
        Calendar clast = Calendar.getInstance();
        clast.set(Calendar.MONTH,1);
        clast.set(Calendar.DAY_OF_MONTH, clast.getActualMaximum(Calendar.DAY_OF_MONTH));
        last=clast.getTime();
        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(dateFormat.format(start));
        System.out.println(dateFormat.format(last));
    }


    /*public static class TestTheand implements Callable{
        @Override
        public void run() {
            Random random=new Random();
           // int d=random.nextInt();
            int d2=random.nextInt();
            int index=random.nextInt(2);
            int index2=random.nextInt(2);
            System.out.println(Thread.currentThread().getName() + "map("+index+") get "+map.get(index));
            System.out.println(Thread.currentThread().getName() + "map("+index2+") set"+d2);
            map.put(index2,d2);
        }
    }*/


    public static   double getDistance(double lat1, double lng1, double lat2, double lng2)
    {
        double radLat1 = rad(lat1);
        double radLat2 = rad(lat2);
        double a = radLat1 - radLat2;
        double b = rad(lng1) - rad(lng2);
        double s = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a / 2), 2) +
                Math.cos(radLat1) * Math.cos(radLat2) * Math.pow(Math.sin(b / 2), 2)));
        s = s * EARTH_RADIUS;
        s = Math.round(s * 10000) / 10000;
        return s;
    }

    private final static double EARTH_RADIUS = 6378.137;//地球半径
    private static double rad(double d)
    {
        return d * Math.PI / 180.0;
    }
}
