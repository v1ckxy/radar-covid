package p213q.p217b.p218a.p271c.p283m;

import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.WeakHashMap;

/* renamed from: q.b.a.c.m.d */
public class C3410d extends Property<Drawable, Integer> {

    /* renamed from: b */
    public static final Property<Drawable, Integer> f8579b = new C3410d();

    /* renamed from: a */
    public final WeakHashMap<Drawable, Integer> f8580a = new WeakHashMap<>();

    public C3410d() {
        super(Integer.class, "drawableAlphaCompat");
    }

    public Object get(Object obj) {
        return Integer.valueOf(((Drawable) obj).getAlpha());
    }

    public void set(Object obj, Object obj2) {
        ((Drawable) obj).setAlpha(((Integer) obj2).intValue());
    }
}
