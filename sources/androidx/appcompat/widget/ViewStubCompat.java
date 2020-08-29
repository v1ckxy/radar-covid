package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import p124p.p126b.C1027j;

public final class ViewStubCompat extends View {

    /* renamed from: e */
    public int f408e;

    /* renamed from: f */
    public int f409f;

    /* renamed from: g */
    public WeakReference<View> f410g;

    /* renamed from: h */
    public LayoutInflater f411h;

    /* renamed from: i */
    public C0063a f412i;

    /* renamed from: androidx.appcompat.widget.ViewStubCompat$a */
    public interface C0063a {
        /* renamed from: a */
        void mo559a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f408e = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1027j.ViewStubCompat, i, 0);
        this.f409f = obtainStyledAttributes.getResourceId(C1027j.ViewStubCompat_android_inflatedId, -1);
        this.f408e = obtainStyledAttributes.getResourceId(C1027j.ViewStubCompat_android_layout, 0);
        setId(obtainStyledAttributes.getResourceId(C1027j.ViewStubCompat_android_id, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    /* renamed from: a */
    public View mo547a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f408e != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f411h;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f408e, viewGroup, false);
            int i = this.f409f;
            if (i != -1) {
                inflate.setId(i);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f410g = new WeakReference<>(inflate);
            C0063a aVar = this.f412i;
            if (aVar != null) {
                aVar.mo559a(this, inflate);
            }
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    public void dispatchDraw(Canvas canvas) {
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f409f;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f411h;
    }

    public int getLayoutResource() {
        return this.f408e;
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f409f = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f411h = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f408e = i;
    }

    public void setOnInflateListener(C0063a aVar) {
        this.f412i = aVar;
    }

    public void setVisibility(int i) {
        WeakReference<View> weakReference = this.f410g;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            mo547a();
        }
    }
}
