package p124p.p199y;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: p.y.w */
public abstract class C1820w {

    /* renamed from: a */
    public static final String f5304a = C1800l.m4459a("WorkerFactory");

    /* renamed from: p.y.w$a */
    public class C1821a extends C1820w {
    }

    /* renamed from: a */
    public static C1820w m4480a() {
        return new C1821a();
    }

    /* renamed from: a */
    public final ListenableWorker mo6795a(Context context, String str, WorkerParameters workerParameters) {
        Class cls;
        ListenableWorker listenableWorker = null;
        try {
            cls = Class.forName(str).asSubclass(ListenableWorker.class);
        } catch (Throwable th) {
            C1800l.m4460a().mo6783b(f5304a, C1965a.m4751a("Invalid class: ", str), th);
            cls = null;
        }
        if (cls != null) {
            try {
                listenableWorker = (ListenableWorker) cls.getDeclaredConstructor(new Class[]{Context.class, WorkerParameters.class}).newInstance(new Object[]{context, workerParameters});
            } catch (Throwable th2) {
                C1800l.m4460a().mo6783b(f5304a, C1965a.m4751a("Could not instantiate ", str), th2);
            }
        }
        if (listenableWorker == null || !listenableWorker.f980g) {
            return listenableWorker;
        }
        throw new IllegalStateException(String.format("WorkerFactory (%s) returned an instance of a ListenableWorker (%s) which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.", new Object[]{getClass().getName(), str}));
    }
}
