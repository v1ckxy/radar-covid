package p124p.p126b.p136q;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import p124p.p126b.C1018a;
import p124p.p126b.C1019b;
import p124p.p126b.C1021d;
import p124p.p126b.C1027j;
import p124p.p126b.p127k.C1028a.C1031c;

/* renamed from: p.b.q.n0 */
public class C1197n0 extends HorizontalScrollView implements OnItemSelectedListener {

    /* renamed from: e */
    public Runnable f3370e;

    /* renamed from: f */
    public boolean f3371f;

    /* renamed from: g */
    public int f3372g;

    /* renamed from: h */
    public int f3373h;

    /* renamed from: i */
    public int f3374i;

    /* renamed from: j */
    public int f3375j;

    /* renamed from: p.b.q.n0$a */
    public class C1198a extends LinearLayout {

        /* renamed from: e */
        public C1031c f3376e;

        /* renamed from: f */
        public final /* synthetic */ C1197n0 f3377f;

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (this.f3377f.f3372g > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = this.f3377f.f3372g;
                if (measuredWidth > i3) {
                    super.onMeasure(MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
                }
            }
        }

        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    static {
        new DecelerateInterpolator();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f3370e;
        if (runnable != null) {
            post(runnable);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Context context = getContext();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C1027j.ActionBar, C1018a.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(C1027j.ActionBar_height, 0);
        Resources resources = context.getResources();
        if (!context.getResources().getBoolean(C1019b.abc_action_bar_embed_tabs)) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C1021d.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        setContentHeight(layoutDimension);
        this.f3373h = context.getResources().getDimensionPixelSize(C1021d.abc_action_bar_stacked_tab_max_width);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f3370e;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((C1198a) view).f3376e.mo4419a();
    }

    public void onMeasure(int i, int i2) {
        setFillViewport(MeasureSpec.getMode(i) == 1073741824);
        throw null;
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f3371f = z;
    }

    public void setContentHeight(int i) {
        this.f3374i = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.f3375j = i;
        throw null;
    }
}
