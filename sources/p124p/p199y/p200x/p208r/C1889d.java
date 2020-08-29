package p124p.p199y.p200x.p208r;

import androidx.work.impl.foreground.SystemForegroundService;
import p124p.p199y.C1796h;
import p124p.p199y.C1800l;
import p124p.p199y.p200x.p208r.C1887c.C1888a;

/* renamed from: p.y.x.r.d */
public class C1889d implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ SystemForegroundService f5503e;

    public C1889d(SystemForegroundService systemForegroundService) {
        this.f5503e = systemForegroundService;
    }

    public void run() {
        C1887c cVar = this.f5503e.f1015h;
        if (cVar != null) {
            C1800l.m4460a().mo6784c(C1887c.f5491p, "Stopping foreground service", new Throwable[0]);
            C1888a aVar = cVar.f5502o;
            if (aVar != null) {
                C1796h hVar = cVar.f5497j;
                if (hVar != null) {
                    aVar.mo1486a(hVar.f5275a);
                    cVar.f5497j = null;
                }
                cVar.f5502o.stop();
                return;
            }
            return;
        }
        throw null;
    }
}
