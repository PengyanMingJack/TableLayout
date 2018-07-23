package allvideo.pym.com.tablelayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;


import java.util.List;

/**
 * @author pym
 * @date 2017-04-19.
 * @description ViewPagerIndicator
 */

public class ViewPagerIndicator extends LinearLayout {
    private Context context;
    /**
     * 初始化画笔
     */
    private Paint mPaint;

    /**
     * 默认的Tab数量
     */
    private static final int COUNT_DEFAULT_TAB = 5;

    /**
     * tab数量
     */
    private int mTabVisibleCount;

    /**
     * tab上的内容
     */
    private List<String> mTabTitles;

    /**
     * 与之绑定的ViewPager
     */
    public ViewPager mViewPager;

    /**
     * 标题正常时的颜色
     */
    private static final int COLOR_TAB_NORMAL = Color.rgb(156, 156, 156);

    /**
     * 标题选中时的颜色
     */
    private static final int COLOR_TAB_SELECT = Color.rgb(54, 54, 54);
    private static final int COLOR_TAB_PAIN = Color.parseColor("#FFFF605E");
    private float tab_lef_default = 0;
    /**
     * 指示符的尺寸
     */
    private int mTabDefaultHeight = 4;
    private float mTabDefaultWidth;
    private float mTabBottom;
    private float mTabTop;
    private float mTabLeft = 30;
    private float mTabRight = 30;

    public ViewPagerIndicator(Context context) {
        super(context);
        this.context = context;
    }

    public ViewPagerIndicator(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.YMViewPagerIndicator);
        mTabVisibleCount = typedArray.getInt(R.styleable.YMViewPagerIndicator_item_count, COUNT_DEFAULT_TAB);
        mTabDefaultWidth = typedArray.getDimension(R.styleable.YMViewPagerIndicator_tab_width, 0);
        mTabBottom = typedArray.getDimension(R.styleable.YMViewPagerIndicator_tab_bottom, 0);
        mTabTop = typedArray.getDimension(R.styleable.YMViewPagerIndicator_tab_top, 0);
        mTabLeft = typedArray.getDimension(R.styleable.YMViewPagerIndicator_tab_left, 0);
        mTabRight = typedArray.getDimension(R.styleable.YMViewPagerIndicator_tab_right, 0);
        tab_lef_default = mTabLeft;

        if (mTabVisibleCount <= 0) {
            mTabVisibleCount = COUNT_DEFAULT_TAB;
        }
        typedArray.recycle();
        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setColor(COLOR_TAB_PAIN);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
//        mTabTop = getMeasuredHeight();
//        int width = getMeasuredWidth();
//        if (mTabDefaultWidth == 0) {
//            mTabDefaultWidth = width / mTabVisibleCount;
//        }
//
//        setMeasuredDimension(width, height);
    }

    /**
     * 指示符滚动
     */
    public void scroll(int position, float offset) {
        mTabLeft = (int) ((position + offset) * mTabDefaultWidth);
        /**
         * 重新绘制视图
         * */
        invalidate();
    }


    @Override
    protected void dispatchDraw(Canvas canvas) {
        /**
         * 绘制线条,可以绘制多样性的,也可以绘制三角形等等
         * */
//        Rect rect = new Rect((int) (mTabLeft + tab_lef_default), (int) mTabTop, (int) (mTabLeft + mTabDefaultWidth - mTabRight), (int) (mTabTop + DisplayUtil.dip2px(MainApplication.getInstance(), 4 - mTabBottom)));
//        canvas.drawRect(rect, mPaint);
        RectF rectf = new RectF((int) (mTabLeft + tab_lef_default), (int) mTabTop, (int) (mTabLeft + mTabDefaultWidth - mTabRight), (int) (mTabTop + getResources().getDimensionPixelSize(R.dimen.x4) - mTabBottom));
        canvas.drawRoundRect(rectf, getResources().getDimensionPixelSize(R.dimen.x3), getResources().getDimensionPixelSize(R.dimen.x3), mPaint);
        super.dispatchDraw(canvas);
    }

    /**
     * 设置可见的tab的数量
     */
    public void setVisibleTabCount(int count) {
        this.mTabVisibleCount = count;
    }

    /**
     * 设置tab的标题内容,可以传入,也可以选择不传,在布局文件中可以写特定的值
     */
    public void setTabItemTitles(List<String> datas) {
        /**
         * 如果传入的list有值，则移除布局文件中设置的view
         * */
        if (datas != null && datas.size() > 0) {
            this.removeAllViews();
            this.mTabTitles = datas;
            for (String title : mTabTitles) {
                addView(generateTextView(title));
            }
            // 设置item的click事件
            setItemClickEvent();
        }
    }

    /**
     * 设置关联的ViewPager
     */
    public void setViewPager(ViewPager mViewPager, int pos) {
        this.mViewPager = mViewPager;
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                scroll(position, positionOffset);
            }

            @Override
            public void onPageSelected(int position) {
                resetTextViewColor();
                highLightTextView(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });
        mViewPager.setCurrentItem(pos);
        resetTextViewColor();
        highLightTextView(pos);
    }


    /**
     * 高亮文本
     */
    protected void highLightTextView(int position) {
        View view = getChildAt(position);
        if (view instanceof TextView) {
            ((TextView) view).setTextColor(COLOR_TAB_SELECT);
        }
    }

    /**
     * 重置文本颜色
     */
    private void resetTextViewColor() {
        for (int i = 0; i < getChildCount(); i++) {
            View view = getChildAt(i);
            if (view instanceof TextView) {
                ((TextView) view).setTextColor(COLOR_TAB_NORMAL);
            }
        }
    }

    /**
     * 设置点击事件
     */
    public void setItemClickEvent() {
        int cCount = getChildCount();
        for (int i = 0; i < cCount; i++) {
            final int j = i;
            View view = getChildAt(i);
            view.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    mViewPager.setCurrentItem(j);
                }
            });
        }
    }

    /**
     * 根据标题生成我们的TextView
     */
    private TextView generateTextView(String text) {
        TextView tv = new TextView(getContext());
        LayoutParams lp = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
        lp.width = getScreenWidth() / mTabVisibleCount;
        tv.setGravity(Gravity.CENTER);
        tv.setTextColor(COLOR_TAB_NORMAL);
        tv.setText(text);
        tv.setTextSize(TypedValue.COMPLEX_UNIT_SP, getResources().getDimensionPixelSize(R.dimen.x17));
        tv.setLayoutParams(lp);
        return tv;
    }

    /**
     * 获得屏幕的宽度
     *
     * @return
     */
    public int getScreenWidth() {
        WindowManager wm = (WindowManager) getContext().getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics outMetrics = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(outMetrics);
        return outMetrics.widthPixels;
    }
}
