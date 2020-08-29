package p124p.p126b.p127k;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import p124p.p126b.C1027j;
import p124p.p126b.p134p.C1089a;
import p124p.p126b.p134p.C1089a.C1090a;

/* renamed from: p.b.k.a */
public abstract class C1028a {

    /* renamed from: p.b.k.a$a */
    public static class C1029a extends MarginLayoutParams {

        /* renamed from: a */
        public int f2677a;

        public C1029a(int i, int i2) {
            super(i, i2);
            this.f2677a = 0;
            this.f2677a = 8388627;
        }

        public C1029a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2677a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1027j.ActionBarLayout);
            this.f2677a = obtainStyledAttributes.getInt(C1027j.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public C1029a(LayoutParams layoutParams) {
            super(layoutParams);
            this.f2677a = 0;
        }

        public C1029a(C1029a aVar) {
            super(aVar);
            this.f2677a = 0;
            this.f2677a = aVar.f2677a;
        }
    }

    /* renamed from: p.b.k.a$b */
    public interface C1030b {
        /* renamed from: a */
        void mo4418a(boolean z);
    }

    @Deprecated
    /* renamed from: p.b.k.a$c */
    public static abstract class C1031c {
        /* renamed from: a */
        public abstract void mo4419a();
    }

    /* renamed from: a */
    public abstract C1089a mo4408a(C1090a aVar);

    /* renamed from: a */
    public abstract void mo4409a(Configuration configuration);

    /* renamed from: a */
    public abstract void mo4410a(CharSequence charSequence);

    /* renamed from: a */
    public abstract void mo4411a(boolean z);

    /* renamed from: a */
    public abstract boolean mo4412a();

    /* renamed from: a */
    public abstract boolean mo4413a(int i, KeyEvent keyEvent);

    /* renamed from: b */
    public abstract int mo4414b();

    /* renamed from: b */
    public abstract void mo4415b(boolean z);

    /* renamed from: c */
    public abstract Context mo4416c();

    /* renamed from: c */
    public abstract void mo4417c(boolean z);
}
