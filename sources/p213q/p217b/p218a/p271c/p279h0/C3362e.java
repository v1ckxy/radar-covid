package p213q.p217b.p218a.p271c.p279h0;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: q.b.a.c.h0.e */
public class C3362e {

    /* renamed from: c */
    public static C3362e f8473c;

    /* renamed from: a */
    public final Object f8474a = new Object();

    /* renamed from: b */
    public final Handler f8475b = new Handler(Looper.getMainLooper(), new C3363a());

    /* renamed from: q.b.a.c.h0.e$a */
    public class C3363a implements Callback {
        public C3363a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            C3362e.this.mo9129a((C3365c) message.obj);
            return true;
        }
    }

    /* renamed from: q.b.a.c.h0.e$b */
    public interface C3364b {
        /* renamed from: a */
        void mo9132a(int i);
    }

    /* renamed from: q.b.a.c.h0.e$c */
    public static class C3365c {

        /* renamed from: a */
        public final WeakReference<C3364b> f8477a;
    }

    /* renamed from: a */
    public void mo9128a(C3364b bVar) {
        synchronized (this.f8474a) {
        }
    }

    /* renamed from: a */
    public void mo9129a(C3365c cVar) {
        synchronized (this.f8474a) {
            if (cVar == null || cVar == null) {
                C3364b bVar = (C3364b) cVar.f8477a.get();
                if (bVar != null) {
                    this.f8475b.removeCallbacksAndMessages(cVar);
                    bVar.mo9132a(2);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo9130b(C3364b bVar) {
        synchronized (this.f8474a) {
        }
    }
}
