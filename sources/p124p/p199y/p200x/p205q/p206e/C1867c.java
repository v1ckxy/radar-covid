package p124p.p199y.p200x.p205q.p206e;

import java.util.ArrayList;
import java.util.List;
import p124p.p199y.p200x.p205q.C1861a;
import p124p.p199y.p200x.p205q.C1864d;
import p124p.p199y.p200x.p205q.p207f.C1878d;
import p124p.p199y.p200x.p209s.C1913p;

/* renamed from: p.y.x.q.e.c */
public abstract class C1867c<T> implements C1861a<T> {

    /* renamed from: a */
    public final List<String> f5457a = new ArrayList();

    /* renamed from: b */
    public T f5458b;

    /* renamed from: c */
    public C1878d<T> f5459c;

    /* renamed from: d */
    public C1868a f5460d;

    /* renamed from: p.y.x.q.e.c$a */
    public interface C1868a {
    }

    public C1867c(C1878d<T> dVar) {
        this.f5459c = dVar;
    }

    /* renamed from: a */
    public void mo6860a(Iterable<C1913p> iterable) {
        this.f5457a.clear();
        for (C1913p pVar : iterable) {
            if (mo6858a(pVar)) {
                this.f5457a.add(pVar.f5527a);
            }
        }
        if (this.f5457a.isEmpty()) {
            this.f5459c.mo6870b(this);
        } else {
            this.f5459c.mo6869a((C1861a<T>) this);
        }
        mo6861a(this.f5460d, this.f5458b);
    }

    /* renamed from: a */
    public void mo6849a(T t) {
        this.f5458b = t;
        mo6861a(this.f5460d, t);
    }

    /* renamed from: a */
    public final void mo6861a(C1868a aVar, T t) {
        if (!this.f5457a.isEmpty() && aVar != null) {
            if (t == null || mo6859b(t)) {
                ((C1864d) aVar).mo6857b(this.f5457a);
                return;
            }
            ((C1864d) aVar).mo6855a(this.f5457a);
        }
    }

    /* renamed from: a */
    public abstract boolean mo6858a(C1913p pVar);

    /* renamed from: b */
    public abstract boolean mo6859b(T t);
}
