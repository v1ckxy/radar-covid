package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import p124p.p126b.p127k.C1054j;
import p124p.p126b.p136q.C1161d0;

public class FitWindowsFrameLayout extends FrameLayout {

    /* renamed from: e */
    public C1161d0 f241e;

    public FitWindowsFrameLayout(Context context) {
        super(context);
    }

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean fitSystemWindows(Rect rect) {
        C1161d0 d0Var = this.f241e;
        if (d0Var != null) {
            rect.top = ((C1054j) d0Var).f2779a.mo4482f(rect.top);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(C1161d0 d0Var) {
        this.f241e = d0Var;
    }
}
