package thread;

/**
 * Created by yk on 2018/10/26.
 */
public class TaskThread  implements Runnable{
    private String projectId;


    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public TaskThread(String projectId) {
        this.projectId = projectId;
    }


    public void run() {
        System.out.println("TaskThread1");

    }
}
