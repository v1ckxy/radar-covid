package p124p.p126b.p128l.p129a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;
import p124p.p126b.p136q.C1185k0;

@SuppressLint({"RestrictedAPI"})
/* renamed from: p.b.l.a.a */
public final class C1070a {

    /* renamed from: a */
    public static final ThreadLocal<TypedValue> f2846a = new ThreadLocal<>();

    /* renamed from: b */
    public static final WeakHashMap<Context, SparseArray<Object>> f2847b = new WeakHashMap<>(0);

    /* renamed from: c */
    public static final Object f2848c = new Object();

    /* renamed from: a */
    public static ColorStateList m2601a(Context context, int i) {
        return context.getColorStateList(i);
    }

    /* renamed from: b */
    public static Drawable m2602b(Context context, int i) {
        return C1185k0.m2968a().mo5221b(context, i);
    }
}
