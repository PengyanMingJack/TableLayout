package allvideo.pym.com.tablelayout;

/**
 * Created by Administrator on 2018/7/6.
 */

public class MyApplication extends android.app.Application{
    @Override
    public void onCreate() {
        super.onCreate();
    }

    public MyApplication() {
    }

    public static MyApplication getInstent() {
        return new MyApplication();
    }
}
