package thread;

/**
 * Created by yk on 2018/10/26.
 */
public class Main  {
    public static void main(String[] arg)throws Exception{
        TaskThread taskThread=new TaskThread("TaskThread");
        ThreadTaskExtern<TaskThread2> taskThreadThreadTaskExtern =new ThreadTaskExtern<TaskThread2>() {
            @Override
            protected void run(TaskThread2 ruanable) {
               // System.out.println("extern "+ruanable.getProjectId());
            }
        };
       /* taskThreadThreadTaskExtern.addThreadListen(new ThreadTaskExtern<TaskThread>() {
            @Override
            protected void run(TaskThread ruanable) {
                System.out.println("extern2 "+ruanable.getProjectId());
            }
        });*/


        TaskThreadGluer<TaskThread> taskThreadWrapper=new TaskThreadGluer(taskThread, taskThreadThreadTaskExtern);
        taskThreadWrapper.addThreadTaskExtern(new ThreadTaskExtern<TaskThread>() {
            @Override
            protected void run(TaskThread ruanable) {
                System.out.println("extern "+ruanable.getProjectId());
            }
        });
        Thread thread=new Thread(taskThreadWrapper);
        thread.start();
        Thread.sleep(1000);
    }
}
