package newTest;

import java.util.*;

/**
 * Created by yk on 2017/4/9.
 */
public class Publisher {
    
    private Map<Class,Observer> map =new HashMap();
    public void registerObject(Class c,Observer obersert){
        map.put(c,obersert);
    }
    public void registerObject(DataProcesser dataProcesser){
        map.put(dataProcesser.getClass(),dataProcesser.getObserver());
    }

    public void publish(Subject subject){
        Observer observer=  map.get(subject.getClass());
        observer.comsume(subject);
    }
}
