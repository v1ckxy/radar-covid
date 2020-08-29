package p213q.p217b.p218a.p271c.p284n;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.View.MeasureSpec;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0068c;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0071f;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.AppBarLayout.BaseBehavior;
import com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior;
import p124p.p126b.p127k.C1061o;
import p124p.p150h.p162l.C1404o;
import p124p.p150h.p162l.C1419x;

/* renamed from: q.b.a.c.n.d */
public abstract class C3421d extends C3422e<View> {

    /* renamed from: d */
    public final Rect f8609d = new Rect();

    /* renamed from: e */
    public final Rect f8610e = new Rect();

    /* renamed from: f */
    public int f8611f = 0;

    /* renamed from: g */
    public int f8612g;

    public C3421d() {
    }

    public C3421d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final int mo9205a(View view) {
        if (this.f8612g == 0) {
            return 0;
        }
        float f = 0.0f;
        if (view instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int totalScrollRange = appBarLayout.getTotalScrollRange();
            int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
            C0068c cVar = ((C0071f) appBarLayout.getLayoutParams()).f519a;
            int c = cVar instanceof BaseBehavior ? ((BaseBehavior) cVar).mo1679c() : 0;
            if (downNestedPreScrollRange == 0 || totalScrollRange + c > downNestedPreScrollRange) {
                int i = totalScrollRange - downNestedPreScrollRange;
                if (i != 0) {
                    f = 1.0f + (((float) c) / ((float) i));
                }
            }
        }
        int i2 = this.f8612g;
        return C1061o.m2432a((int) (f * ((float) i2)), 0, i2);
    }

    /* renamed from: b */
    public void mo9206b(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i2;
        AppBarLayout a = ((ScrollingViewBehavior) this).mo1683a(coordinatorLayout.mo595a(view));
        if (a != null) {
            C0071f fVar = (C0071f) view.getLayoutParams();
            Rect rect = this.f8609d;
            rect.set(coordinatorLayout.getPaddingLeft() + fVar.leftMargin, a.getBottom() + fVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - fVar.rightMargin, ((a.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - fVar.bottomMargin);
            C1419x lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && C1404o.m3548i(coordinatorLayout) && !view.getFitsSystemWindows()) {
                rect.left = lastWindowInsets.mo5922b() + rect.left;
                rect.right -= lastWindowInsets.mo5923c();
            }
            Rect rect2 = this.f8610e;
            int i3 = fVar.f521c;
            if (i3 == 0) {
                i3 = 8388659;
            }
            Gravity.apply(i3, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int a2 = mo9205a(a);
            view.layout(rect2.left, rect2.top - a2, rect2.right, rect2.bottom - a2);
            i2 = rect2.top - a.getBottom();
        } else {
            coordinatorLayout.mo607b(view, i);
            i2 = 0;
        }
        this.f8611f = i2;
    }

    /* renamed from: a */
    public boolean mo659a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        int i5 = view.getLayoutParams().height;
        if (i5 == -1 || i5 == -2) {
            AppBarLayout a = ((ScrollingViewBehavior) this).mo1683a(coordinatorLayout.mo595a(view));
            if (a != null) {
                int size = MeasureSpec.getSize(i3);
                if (size <= 0) {
                    size = coordinatorLayout.getHeight();
                } else if (C1404o.m3548i(a)) {
                    C1419x lastWindowInsets = coordinatorLayout.getLastWindowInsets();
                    if (lastWindowInsets != null) {
                        size += lastWindowInsets.mo5921a() + lastWindowInsets.mo5924d();
                    }
                }
                coordinatorLayout.mo598a(view, i, i2, MeasureSpec.makeMeasureSpec((size + a.getTotalScrollRange()) - a.getMeasuredHeight(), i5 == -1 ? 1073741824 : RecyclerView.UNDEFINED_DURATION), i4);
                return true;
            }
        }
        return false;
    }
}
