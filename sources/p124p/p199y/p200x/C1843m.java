package p124p.p199y.p200x;

import p124p.p199y.C1800l;
import p124p.p199y.p200x.p210t.p211p.C1961c;

/* renamed from: p.y.x.m */
public class C1843m implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ C1961c f5357e;

    /* renamed from: f */
    public final /* synthetic */ C1845o f5358f;

    public C1843m(C1845o oVar, C1961c cVar) {
        this.f5358f = oVar;
        this.f5357e = cVar;
    }

    public void run() {
        try {
            C1800l.m4460a().mo6782a(C1845o.f5362x, String.format("Starting work for %s", new Object[]{this.f5358f.f5367i.f5529c}), new Throwable[0]);
            this.f5358f.f5380v = this.f5358f.f5368j.mo1444c();
            this.f5357e.mo6959b(this.f5358f.f5380v);
        } catch (Throwable th) {
            this.f5357e.mo6958a(th);
        }
    }
}
