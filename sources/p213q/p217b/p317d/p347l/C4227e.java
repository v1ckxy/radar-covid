package p213q.p217b.p317d.p347l;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.GuardedBy;
import p213q.p217b.p218a.p231b.p239d.p246q.p247i.C2290a;
import p213q.p217b.p218a.p231b.p251g.p255d.C2334a;
import p213q.p217b.p218a.p231b.p251g.p255d.C2335b;
import p213q.p217b.p218a.p231b.p270l.C3255i;

/* renamed from: q.b.d.l.e */
public final class C4227e {
    @GuardedBy("MessengerIpcClient.class")

    /* renamed from: e */
    public static C4227e f10186e;

    /* renamed from: a */
    public final Context f10187a;

    /* renamed from: b */
    public final ScheduledExecutorService f10188b;
    @GuardedBy("this")

    /* renamed from: c */
    public C4230f f10189c = new C4230f(this, null);
    @GuardedBy("this")

    /* renamed from: d */
    public int f10190d = 1;

    public C4227e(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f10188b = scheduledExecutorService;
        this.f10187a = context.getApplicationContext();
    }

    /* renamed from: a */
    public final synchronized int mo10413a() {
        int i;
        i = this.f10190d;
        this.f10190d = i + 1;
        return i;
    }

    /* renamed from: a */
    public final synchronized <T> C3255i<T> mo10414a(C4251p<T> pVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(pVar);
            StringBuilder sb = new StringBuilder(valueOf.length() + 9);
            sb.append("Queueing ");
            sb.append(valueOf);
            Log.d("MessengerIpcClient", sb.toString());
        }
        if (!this.f10189c.mo10420a(pVar)) {
            C4230f fVar = new C4230f(this, null);
            this.f10189c = fVar;
            fVar.mo10420a(pVar);
        }
        return pVar.f10231b.f8128a;
    }

    /* renamed from: a */
    public static synchronized C4227e m9714a(Context context) {
        C4227e eVar;
        synchronized (C4227e.class) {
            if (f10186e == null) {
                C2335b bVar = C2334a.f6297a;
                f10186e = new C4227e(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new C2290a("MessengerIpcClient"))));
            }
            eVar = f10186e;
        }
        return eVar;
    }
}
