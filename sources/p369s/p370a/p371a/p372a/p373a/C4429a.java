package p369s.p370a.p371a.p372a.p373a;

import android.os.Handler;
import android.os.Looper;
import p369s.p370a.p371a.p374b.C4445l;
import p369s.p370a.p371a.p378f.p388h.C4535b;

/* renamed from: s.a.a.a.a.a */
public final class C4429a {

    /* renamed from: a */
    public static final C4445l f10529a;

    /* renamed from: s.a.a.a.a.a$a */
    public static final class C4430a {

        /* renamed from: a */
        public static final C4445l f10530a = new C4431b(new Handler(Looper.getMainLooper()), true);
    }

    static {
        try {
            C4445l a = C4430a.f10530a;
            if (a != null) {
                f10529a = a;
                return;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th) {
            throw C4535b.m10204a(th);
        }
    }
}
