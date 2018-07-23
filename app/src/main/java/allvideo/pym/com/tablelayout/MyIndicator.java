package allvideo.pym.com.tablelayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Administrator on 2018/5/19.
 */

public class MyIndicator extends LinearLayout {
    private static final int COLOR_TAB_PAIN = Color.parseColor("#FFFF605E");
    private ViewPager mViewPager;
    private int mTabLeft;
    private Paint mPaint;
    private float mTabWidth;
    private float mTabBottom;
    private float mTabTop;
    private float mTabLeft1;
    private float mTabRight;
    private boolean mHasIndicator;
    private float tab_lef_default = 0;
    public MyIndicator(Context context) {
        super(context);

    }

    public MyIndicator(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.MSViewPagerIndicator);
        mTabWidth = typedArray.getDimension(R.styleable.MSViewPagerIndicator_ms_tab_width, 0);
        mTabBottom = typedArray.getDimension(R.styleable.MSViewPagerIndicator_ms_tab_bottom, 0);
        mTabTop = typedArray.getDimension(R.styleable.MSViewPagerIndicator_ms_tab_top, 0);
        mTabLeft1 = typedArray.getDimension(R.styleable.MSViewPagerIndicator_ms_tab_left, 0);
        mTabRight = typedArray.getDimension(R.styleable.MSViewPagerIndicator_ms_tab_right, 0);
        mHasIndicator = typedArray.getBoolean(R.styleable.MSViewPagerIndicator_ms_has_indicator, true);
        typedArray.recycle();
        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setColor(COLOR_TAB_PAIN);
        tab_lef_default = mTabLeft1;
    }

    public MyIndicator(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setViewPager(ViewPager mViewPager, int index) {
        this.mViewPager = mViewPager;
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                changeTextViewColorSize(position, positionOffset);
//                mTabLeft = (int) ((position + positionOffset) *DisplayUtil.dip2px(MainApplication.getInstance(),50));
//                float dimension = getContext().getResources().getDimension(mTabWidth);

                mTabLeft = (int) (+(position + positionOffset) * mTabWidth);

                invalidate();
            }

            @Override
            public void onPageSelected(int position) {
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });
        mViewPager.setCurrentItem(index);
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        /**
         * 绘制线条,可以绘制多样性的,也可以绘制三角形等等
         * */

     //   RectF rectf = new RectF((int) (mTabLeft +getContext().getResources().getDimension(R.dimen.x20)), (int)getContext().getResources().getDimension(R.dimen.x55), (int) (mTabLeft +getContext().getResources().getDimension(R.dimen.x50)), (int) ( getContext().getResources().getDimension(R.dimen.x55)+ 12));
        if (mHasIndicator) {
            RectF rectf = new RectF((int) (mTabLeft + tab_lef_default), (int) mTabTop, (int) (mTabLeft + mTabWidth-mTabRight), (int) (mTabTop +getResources().getDimensionPixelSize(R.dimen.x4)));
            canvas.drawRoundRect(rectf, getResources().getDimensionPixelSize(R.dimen.x3), getResources().getDimensionPixelSize(R.dimen.x3), mPaint);
        }
        super.dispatchDraw(canvas);
    }

    private void changeTextViewColorSize(int position, float positionOffset) {
        int offset = (int) Math.ceil((32 - 16) * positionOffset);
        for (int i = 0; i < getChildCount(); i++) {
            View view = getChildAt(i);
            if (position == 0 && offset != 0) {
                if (R.id.tv_tab1 == view.getId()) {
//                    ((TextView) view).setTextColor(getColor(1 - positionOffset));
                    ((TextView) view).setTextColor(getColor(1 - positionOffset, ((TextView) view).getCurrentTextColor()));
                    ((TextView) view).setTextSize(32 - offset);
                } else if (R.id.tv_tab2 == view.getId()) {
//                    ((TextView) view).setTextColor(getColor(positionOffset));
                    ((TextView) view).setTextColor(getColor(positionOffset, ((TextView) view).getCurrentTextColor()));
                    ((TextView) view).setTextSize(16 + offset);
                } else if (R.id.tv_tab11 == view.getId()) {
                    ((TextView) view).setTextColor(getColor(1 - positionOffset, ((TextView) view).getCurrentTextColor()));
                    ((TextView) view).setTextSize(16);
                } else if (R.id.tv_tab22 == view.getId()) {
                    ((TextView) view).setTextColor(getColor(positionOffset, ((TextView) view).getCurrentTextColor()));
                    ((TextView) view).setTextSize(16);
                }
            } else if (position == 1 && offset != 0) {
                if (R.id.tv_tab1 == view.getId()) {
//                    ((TextView) view).setTextColor(getColor(positionOffset));
                    ((TextView) view).setTextColor(getColor(positionOffset, ((TextView) view).getCurrentTextColor()));
                    ((TextView) view).setTextSize(16 + offset);
                } else if (R.id.tv_tab2 == view.getId()) {
//                    ((TextView) view).setTextColor(getColor(1 - positionOffset));
                    ((TextView) view).setTextColor(getColor(1 - positionOffset, ((TextView) view).getCurrentTextColor()));
                    ((TextView) view).setTextSize(32 - offset);
                } else if (R.id.tv_tab11 == view.getId()) {
                    ((TextView) view).setTextColor(getColor(positionOffset, ((TextView) view).getCurrentTextColor()));
                    ((TextView) view).setTextSize(16);
                } else if (R.id.tv_tab22 == view.getId()) {
                    ((TextView) view).setTextColor(getColor(1 - positionOffset, ((TextView) view).getCurrentTextColor()));
                    ((TextView) view).setTextSize(16);
                }
            }

        }
    }

    protected int getColor(float offset, int color) {
        int a = (int) Math.ceil((255 - 80) * offset);

        int red = (color & 0xff0000) >> 16;
        int green = (color & 0x00ff00) >> 8;
        int blue = (color & 0x0000ff);

        return Color.argb(80 + a, red, green,
                blue);
    }


    public void setItemClickEvent() {
        int cCount = getChildCount();
        for (int i = 0; i < cCount; i++) {
            View view = getChildAt(i);
            if (R.id.tv_tab1 == view.getId()||R.id.tv_tab11== view.getId()) {
                view.setOnClickListener(v -> mViewPager.setCurrentItem(0));
            } else if (R.id.tv_tab2 == view.getId()||R.id.tv_tab22 == view.getId()) {
                view.setOnClickListener(v -> mViewPager.setCurrentItem(1));
            }
        }
    }
}
