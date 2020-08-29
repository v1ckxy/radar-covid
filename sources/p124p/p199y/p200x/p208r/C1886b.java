package p124p.p199y.p200x.p208r;

import androidx.work.impl.WorkDatabase;
import p124p.p199y.p200x.p209s.C1913p;
import p124p.p199y.p200x.p209s.C1916r;

/* renamed from: p.y.x.r.b */
public class C1886b implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ WorkDatabase f5488e;

    /* renamed from: f */
    public final /* synthetic */ String f5489f;

    /* renamed from: g */
    public final /* synthetic */ C1887c f5490g;

    public C1886b(C1887c cVar, WorkDatabase workDatabase, String str) {
        this.f5490g = cVar;
        this.f5488e = workDatabase;
        this.f5489f = str;
    }

    public void run() {
        C1913p e = ((C1916r) this.f5488e.mo1462m()).mo6914e(this.f5489f);
        if (e != null && e.mo6894b()) {
            synchronized (this.f5490g.f5495h) {
                this.f5490g.f5499l.put(this.f5489f, e);
                this.f5490g.f5500m.add(e);
                this.f5490g.f5501n.mo6854a((Iterable<C1913p>) this.f5490g.f5500m);
            }
        }
    }
}
