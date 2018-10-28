package newTest;

/**
 * Created by yk on 2017/4/10.
 */
public class WxDataUserInfoOberser implements Observer{
    @Override
    public void comsume(Subject subject) {
        precomsume((WxDataUserInfo) subject);
    }

    private void precomsume(WxDataUserInfo wxDataUserInfo){
        System.out.println(wxDataUserInfo.getClass());
    }
}
