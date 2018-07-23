package allvideo.pym.com.tablelayout.databinding;
import allvideo.pym.com.tablelayout.R;
import allvideo.pym.com.tablelayout.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ActivityMain1Binding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.main_appbar, 1);
        sViewsWithIds.put(R.id.indicator, 2);
        sViewsWithIds.put(R.id.tv_tab1, 3);
        sViewsWithIds.put(R.id.tv_tab2, 4);
        sViewsWithIds.put(R.id.indicator2, 5);
        sViewsWithIds.put(R.id.tv_tab11, 6);
        sViewsWithIds.put(R.id.tv_tab22, 7);
        sViewsWithIds.put(R.id.viewpager, 8);
    }
    // views
    @NonNull
    public final allvideo.pym.com.tablelayout.MyIndicator indicator;
    @NonNull
    public final allvideo.pym.com.tablelayout.TopMyIndicator indicator2;
    @NonNull
    public final android.support.design.widget.AppBarLayout mainAppbar;
    @NonNull
    private final android.support.design.widget.CoordinatorLayout mboundView0;
    @NonNull
    public final android.widget.TextView tvTab1;
    @NonNull
    public final android.widget.TextView tvTab11;
    @NonNull
    public final android.widget.TextView tvTab2;
    @NonNull
    public final android.widget.TextView tvTab22;
    @NonNull
    public final android.support.v4.view.ViewPager viewpager;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMain1Binding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds);
        this.indicator = (allvideo.pym.com.tablelayout.MyIndicator) bindings[2];
        this.indicator2 = (allvideo.pym.com.tablelayout.TopMyIndicator) bindings[5];
        this.mainAppbar = (android.support.design.widget.AppBarLayout) bindings[1];
        this.mboundView0 = (android.support.design.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvTab1 = (android.widget.TextView) bindings[3];
        this.tvTab11 = (android.widget.TextView) bindings[6];
        this.tvTab2 = (android.widget.TextView) bindings[4];
        this.tvTab22 = (android.widget.TextView) bindings[7];
        this.viewpager = (android.support.v4.view.ViewPager) bindings[8];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityMain1Binding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityMain1Binding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityMain1Binding>inflate(inflater, allvideo.pym.com.tablelayout.R.layout.activity_main1, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityMain1Binding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityMain1Binding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(allvideo.pym.com.tablelayout.R.layout.activity_main1, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityMain1Binding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityMain1Binding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_main1_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityMain1Binding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}