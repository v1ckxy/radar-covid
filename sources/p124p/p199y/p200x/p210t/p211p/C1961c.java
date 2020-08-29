package p124p.p199y.p200x.p210t.p211p;

import p124p.p199y.p200x.p210t.p211p.C1949a.C1952c;
import p124p.p199y.p200x.p210t.p211p.C1949a.C1953d;
import p124p.p199y.p200x.p210t.p211p.C1949a.C1957g;
import p213q.p217b.p298b.p299a.p300a.C3498a;

/* renamed from: p.y.x.t.p.c */
public final class C1961c<V> extends C1949a<V> {
    /* renamed from: a */
    public boolean mo6958a(Throwable th) {
        if (th != null) {
            if (!C1949a.f5599j.mo6951a((C1949a<?>) this, (Object) null, (Object) new C1953d(th))) {
                return false;
            }
            C1949a.m4716a((C1949a<?>) this);
            return true;
        }
        throw null;
    }

    /* renamed from: b */
    public boolean mo6959b(C3498a<? extends V> aVar) {
        C1957g gVar;
        C1953d dVar;
        if (aVar != null) {
            Object obj = this.f5601e;
            if (obj == null) {
                if (aVar.isDone()) {
                    if (!C1949a.f5599j.mo6951a((C1949a<?>) this, (Object) null, C1949a.m4715a(aVar))) {
                        return false;
                    }
                    C1949a.m4716a((C1949a<?>) this);
                } else {
                    gVar = new C1957g(this, aVar);
                    if (C1949a.f5599j.mo6951a((C1949a<?>) this, (Object) null, (Object) gVar)) {
                        try {
                            ((C1949a) aVar).mo6940a(gVar, C1960b.INSTANCE);
                        } catch (Throwable unused) {
                            dVar = C1953d.f5608b;
                        }
                    } else {
                        obj = this.f5601e;
                    }
                }
                return true;
            }
            if (!(obj instanceof C1952c)) {
                return false;
            }
            aVar.cancel(((C1952c) obj).f5606a);
            return false;
        }
        throw null;
        C1949a.f5599j.mo6951a((C1949a<?>) this, (Object) gVar, (Object) dVar);
        return true;
    }

    /* renamed from: c */
    public boolean mo6960c(V v) {
        if (v == null) {
            v = C1949a.f5600k;
        }
        if (!C1949a.f5599j.mo6951a((C1949a<?>) this, (Object) null, (Object) v)) {
            return false;
        }
        C1949a.m4716a((C1949a<?>) this);
        return true;
    }
}
