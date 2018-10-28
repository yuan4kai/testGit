package newTest;

/**
 * Created by yk on 2017/4/10.
 */
public class WxDataPayCompeteObserver implements Observer{
    @Override
    public void comsume(Subject subject) {
        precomsume((WxDataPayCompete) subject);
    }

    private void precomsume(WxDataPayCompete wxDataPayCompete){
        System.out.println(wxDataPayCompete.getClass());
    }
}
