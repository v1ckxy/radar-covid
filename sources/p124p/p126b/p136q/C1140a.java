package p124p.p126b.p136q;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.recyclerview.widget.RecyclerView;
import p124p.p126b.C1018a;
import p124p.p126b.C1027j;
import p124p.p126b.p134p.p135i.C1114g;
import p124p.p150h.p162l.C1404o;
import p124p.p150h.p162l.C1413t;
import p124p.p150h.p162l.C1416u;

/* renamed from: p.b.q.a */
public abstract class C1140a extends ViewGroup {

    /* renamed from: e */
    public final C1141a f3182e;

    /* renamed from: f */
    public final Context f3183f;

    /* renamed from: g */
    public ActionMenuView f3184g;

    /* renamed from: h */
    public C1147c f3185h;

    /* renamed from: i */
    public int f3186i;

    /* renamed from: j */
    public C1413t f3187j;

    /* renamed from: k */
    public boolean f3188k;

    /* renamed from: l */
    public boolean f3189l;

    /* renamed from: p.b.q.a$a */
    public class C1141a implements C1416u {

        /* renamed from: a */
        public boolean f3190a = false;

        /* renamed from: b */
        public int f3191b;

        public C1141a() {
        }

        /* renamed from: a */
        public void mo5020a(View view) {
            this.f3190a = true;
        }

        /* renamed from: b */
        public void mo4498b(View view) {
            if (!this.f3190a) {
                C1140a aVar = C1140a.this;
                aVar.f3187j = null;
                C1140a.super.setVisibility(this.f3191b);
            }
        }

        /* renamed from: c */
        public void mo4521c(View view) {
            C1140a.super.setVisibility(0);
            this.f3190a = false;
        }
    }

    public C1140a(Context context) {
        this(context, null);
    }

    public C1140a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1140a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3182e = new C1141a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C1018a.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f3183f = context;
        } else {
            this.f3183f = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* renamed from: a */
    public int mo5014a(View view, int i, int i2, int i3) {
        view.measure(MeasureSpec.makeMeasureSpec(i, RecyclerView.UNDEFINED_DURATION), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* renamed from: a */
    public int mo5015a(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    /* renamed from: a */
    public C1413t mo5016a(int i, long j) {
        C1413t tVar = this.f3187j;
        if (tVar != null) {
            tVar.mo5914a();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            C1413t a = C1404o.m3511a(this);
            a.mo5910a(1.0f);
            a.mo5911a(j);
            C1141a aVar = this.f3182e;
            C1140a.this.f3187j = a;
            aVar.f3191b = i;
            View view = (View) a.f4179a.get();
            if (view != null) {
                a.mo5915a(view, aVar);
            }
            return a;
        }
        C1413t a2 = C1404o.m3511a(this);
        a2.mo5910a(0.0f);
        a2.mo5911a(j);
        C1141a aVar2 = this.f3182e;
        C1140a.this.f3187j = a2;
        aVar2.f3191b = i;
        View view2 = (View) a2.f4179a.get();
        if (view2 != null) {
            a2.mo5915a(view2, aVar2);
        }
        return a2;
    }

    public int getAnimatedVisibility() {
        return this.f3187j != null ? this.f3182e.f3191b : getVisibility();
    }

    public int getContentHeight() {
        return this.f3186i;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, C1027j.ActionBar, C1018a.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(C1027j.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        C1147c cVar = this.f3185h;
        if (cVar != null) {
            Configuration configuration2 = cVar.f3006f.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i2 = configuration2.screenHeightDp;
            int i3 = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i2 > 720) || (i > 720 && i2 > 960)) ? 5 : (i >= 500 || (i > 640 && i2 > 480) || (i > 480 && i2 > 640)) ? 4 : i >= 360 ? 3 : 2;
            cVar.f3210u = i3;
            C1114g gVar = cVar.f3007g;
            if (gVar != null) {
                gVar.mo4824b(true);
            }
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f3189l = false;
        }
        if (!this.f3189l) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f3189l = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f3189l = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3188k = false;
        }
        if (!this.f3188k) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f3188k = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f3188k = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i);

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            C1413t tVar = this.f3187j;
            if (tVar != null) {
                tVar.mo5914a();
            }
            super.setVisibility(i);
        }
    }
}
