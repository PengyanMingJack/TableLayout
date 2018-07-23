
package android.databinding;
import allvideo.pym.com.tablelayout.BR;
@javax.annotation.Generated("Android Data Binding")
class DataBinderMapper  {
    final static int TARGET_MIN_SDK = 18;
    public DataBinderMapper() {
    }
    public android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View view, int layoutId) {
        switch(layoutId) {
                case allvideo.pym.com.tablelayout.R.layout.fragment:
                    return allvideo.pym.com.tablelayout.databinding.FragmentBinding.bind(view, bindingComponent);
                case allvideo.pym.com.tablelayout.R.layout.item:
                    return allvideo.pym.com.tablelayout.databinding.ItemBinding.bind(view, bindingComponent);
                case allvideo.pym.com.tablelayout.R.layout.activity_main:
                    return allvideo.pym.com.tablelayout.databinding.ActivityMainBinding.bind(view, bindingComponent);
                case allvideo.pym.com.tablelayout.R.layout.activity_main2:
                    return allvideo.pym.com.tablelayout.databinding.ActivityMain2Binding.bind(view, bindingComponent);
                case allvideo.pym.com.tablelayout.R.layout.activity_main1:
                    return allvideo.pym.com.tablelayout.databinding.ActivityMain1Binding.bind(view, bindingComponent);
                case allvideo.pym.com.tablelayout.R.layout.content_main:
                    return allvideo.pym.com.tablelayout.databinding.ContentMainBinding.bind(view, bindingComponent);
        }
        return null;
    }
    android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View[] views, int layoutId) {
        switch(layoutId) {
        }
        return null;
    }
    int getLayoutId(String tag) {
        if (tag == null) {
            return 0;
        }
        final int code = tag.hashCode();
        switch(code) {
            case 2090840582: {
                if(tag.equals("layout/fragment_0")) {
                    return allvideo.pym.com.tablelayout.R.layout.fragment;
                }
                break;
            }
            case 450490505: {
                if(tag.equals("layout/item_0")) {
                    return allvideo.pym.com.tablelayout.R.layout.item;
                }
                break;
            }
            case 423753077: {
                if(tag.equals("layout/activity_main_0")) {
                    return allvideo.pym.com.tablelayout.R.layout.activity_main;
                }
                break;
            }
            case 251401759: {
                if(tag.equals("layout/activity_main2_0")) {
                    return allvideo.pym.com.tablelayout.R.layout.activity_main2;
                }
                break;
            }
            case 251400798: {
                if(tag.equals("layout/activity_main1_0")) {
                    return allvideo.pym.com.tablelayout.R.layout.activity_main1;
                }
                break;
            }
            case 731091765: {
                if(tag.equals("layout/content_main_0")) {
                    return allvideo.pym.com.tablelayout.R.layout.content_main;
                }
                break;
            }
        }
        return 0;
    }
    String convertBrIdToString(int id) {
        if (id < 0 || id >= InnerBrLookup.sKeys.length) {
            return null;
        }
        return InnerBrLookup.sKeys[id];
    }
    private static class InnerBrLookup {
        static String[] sKeys = new String[]{
            "_all"};
    }
}