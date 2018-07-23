package allvideo.pym.com.tablelayout;

import android.databinding.DataBindingUtil;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.design.widget.AppBarLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import allvideo.pym.com.tablelayout.databinding.ActivityMain2Binding;


public class MainActivity extends AppCompatActivity implements AppBarLayout.OnOffsetChangedListener {
    private ActivityMain2Binding binding;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main2);
        List<Fragment> fragments = new ArrayList<>();
        fragments.add(new MyFragment());
        fragments.add(new MyFragment());
        binding.viewpager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return fragments.get(position);
            }

            @Override
            public int getCount() {
                return 2;
            }
        });
        binding.indicator.setViewPager(binding.viewpager, 0);
        binding.indicator.setItemClickEvent();
//        TopMyIndicator myIndicator = findViewById(R.id.indicator2);
//        myIndicator.setViewPager(binding.viewpager, 0);
//        myIndicator.setItemClickEvent();


//        AppBarLayout appBarLayout = findViewById(R.id.main_appbar);
//        appBarLayout.addOnOffsetChangedListener(new AppBarStateChangeListener() {
//            @Override
//            public void onStateChanged(AppBarLayout appBarLayout, State state) {
//                if (state == State.EXPANDED) {
//                    //展开状态
//                    Log.e("state", "展开状态");
//                    myIndicator.setVisibility(View.GONE);
//                    appBarLayout.setVisibility(View.VISIBLE);
//
//                } else if (state == State.COLLAPSED) {
//                    //折叠状态
//                    Log.e("state", "折叠状态");
//                    myIndicator.setVisibility(View.VISIBLE);
//                    appBarLayout.setVisibility(View.INVISIBLE);
//                } else {
//                    Log.e("state", "中间状态");
//                    myIndicator.setVisibility(View.GONE);
//                    appBarLayout.setVisibility(View.VISIBLE);
//                    //中间状态
//                }
//            }
//        });

    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {

    }
}
