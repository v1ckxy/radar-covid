package p124p.p150h.p159i;

import android.os.Handler;
import java.util.concurrent.Callable;
import p124p.p150h.p159i.C1363c.C1366c;

/* renamed from: p.h.i.d */
public class C1367d implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ Callable f4105e;

    /* renamed from: f */
    public final /* synthetic */ Handler f4106f;

    /* renamed from: g */
    public final /* synthetic */ C1366c f4107g;

    /* renamed from: p.h.i.d$a */
    public class C1368a implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ Object f4108e;

        public C1368a(Object obj) {
            this.f4108e = obj;
        }

        public void run() {
            C1367d.this.f4107g.mo5827a(this.f4108e);
        }
    }

    public C1367d(C1363c cVar, Callable callable, Handler handler, C1366c cVar2) {
        this.f4105e = callable;
        this.f4106f = handler;
        this.f4107g = cVar2;
    }

    public void run() {
        Object obj;
        try {
            obj = this.f4105e.call();
        } catch (Exception unused) {
            obj = null;
        }
        this.f4106f.post(new C1368a(obj));
    }
}
