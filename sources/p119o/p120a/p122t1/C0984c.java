package p119o.p120a.p122t1;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p392u.C4554g;
import p392u.C4557i;

/* renamed from: o.a.t1.c */
public final class C0984c {
    static {
        Object obj;
        try {
            obj = new C0982a(m2261a(Looper.getMainLooper(), true), "Main", false);
        } catch (Throwable th) {
            obj = C2286e.m5184a(th);
        }
        if (C4554g.m10212c(obj)) {
            obj = null;
        }
        C0983b bVar = (C0983b) obj;
    }

    /* renamed from: a */
    public static final Handler m2261a(Looper looper, boolean z) {
        if (!z) {
            return new Handler(looper);
        }
        if (VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", new Class[]{Looper.class}).invoke(null, new Object[]{looper});
            if (invoke != null) {
                return (Handler) invoke;
            }
            throw new C4557i("null cannot be cast to non-null type android.os.Handler");
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(new Class[]{Looper.class, Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.valueOf(true)});
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
