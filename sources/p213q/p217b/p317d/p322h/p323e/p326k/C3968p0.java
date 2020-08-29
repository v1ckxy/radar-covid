package p213q.p217b.p317d.p322h.p323e.p326k;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import p213q.p217b.p317d.p322h.p323e.C3913b;

/* renamed from: q.b.d.h.e.k.p0 */
public class C3968p0 extends C3936d {

    /* renamed from: e */
    public final /* synthetic */ String f9686e;

    /* renamed from: f */
    public final /* synthetic */ ExecutorService f9687f;

    /* renamed from: g */
    public final /* synthetic */ long f9688g;

    /* renamed from: h */
    public final /* synthetic */ TimeUnit f9689h;

    public C3968p0(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
        this.f9686e = str;
        this.f9687f = executorService;
        this.f9688g = j;
        this.f9689h = timeUnit;
    }

    /* renamed from: a */
    public void mo10126a() {
        try {
            C3913b bVar = C3913b.f9552c;
            StringBuilder sb = new StringBuilder();
            sb.append("Executing shutdown hook for ");
            sb.append(this.f9686e);
            bVar.mo10108a(sb.toString());
            this.f9687f.shutdown();
            if (!this.f9687f.awaitTermination(this.f9688g, this.f9689h)) {
                C3913b bVar2 = C3913b.f9552c;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f9686e);
                sb2.append(" did not shut down in the allocated time. Requesting immediate shutdown.");
                bVar2.mo10108a(sb2.toString());
                this.f9687f.shutdownNow();
            }
        } catch (InterruptedException unused) {
            C3913b.f9552c.mo10108a(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", new Object[]{this.f9686e}));
            this.f9687f.shutdownNow();
        }
    }
}
