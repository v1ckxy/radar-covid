package p124p.p199y.p200x.p201p.p202a;

import p124p.p199y.C1800l;
import p124p.p199y.p200x.p209s.C1913p;

/* renamed from: p.y.x.p.a.a */
public class C1847a implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ C1913p f5391e;

    /* renamed from: f */
    public final /* synthetic */ C1848b f5392f;

    public C1847a(C1848b bVar, C1913p pVar) {
        this.f5392f = bVar;
        this.f5391e = pVar;
    }

    public void run() {
        C1800l.m4460a().mo6782a(C1848b.f5393d, String.format("Scheduling work %s", new Object[]{this.f5391e.f5527a}), new Throwable[0]);
        this.f5392f.f5394a.mo6810a(this.f5391e);
    }
}
