package p124p.p191u;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.Property;
import android.view.View;
import p124p.p150h.p162l.C1404o;

/* renamed from: p.u.v */
public class C1739v {

    /* renamed from: a */
    public static final C1699b0 f5079a = (VERSION.SDK_INT >= 29 ? new C1686a0() : new C1745z());

    /* renamed from: b */
    public static final Property<View, Float> f5080b = new C1740a(Float.class, "translationAlpha");

    /* renamed from: p.u.v$a */
    public static class C1740a extends Property<View, Float> {
        public C1740a(Class cls, String str) {
            super(cls, str);
        }

        public Object get(Object obj) {
            return Float.valueOf(C1739v.m4376b((View) obj));
        }

        public void set(Object obj, Object obj2) {
            C1739v.f5079a.mo6509a((View) obj, ((Float) obj2).floatValue());
        }
    }

    /* renamed from: p.u.v$b */
    public static class C1741b extends Property<View, Rect> {
        public C1741b(Class cls, String str) {
            super(cls, str);
        }

        public Object get(Object obj) {
            return C1404o.m3544f((View) obj);
        }

        public void set(Object obj, Object obj2) {
            C1404o.m3521a((View) obj, (Rect) obj2);
        }
    }

    static {
        new C1741b(Rect.class, "clipBounds");
    }

    /* renamed from: a */
    public static C1738u m4374a(View view) {
        return new C1737t(view);
    }

    /* renamed from: a */
    public static void m4375a(View view, int i, int i2, int i3, int i4) {
        f5079a.mo6511a(view, i, i2, i3, i4);
    }

    /* renamed from: b */
    public static float m4376b(View view) {
        return f5079a.mo6513b(view);
    }

    /* renamed from: c */
    public static C1715f0 m4377c(View view) {
        return new C1713e0(view);
    }
}
