package p124p.p199y;

import androidx.work.ListenableWorker;
import p124p.p199y.C1818v.C1819a;
import p124p.p199y.p200x.p209s.C1913p;

/* renamed from: p.y.n */
public final class C1803n extends C1818v {

    /* renamed from: p.y.n$a */
    public static final class C1804a extends C1819a<C1804a, C1803n> {
        public C1804a(Class<? extends ListenableWorker> cls) {
            super(cls);
        }

        /* renamed from: b */
        public C1818v mo6786b() {
            if (!this.f5300a || !this.f5302c.f5536j.f5246c) {
                C1913p pVar = this.f5302c;
                if (!pVar.f5543q || !pVar.f5536j.f5246c) {
                    return new C1803n(this);
                }
                throw new IllegalArgumentException("Cannot run in foreground with an idle mode constraint");
            }
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }

        /* renamed from: c */
        public C1819a mo6787c() {
            return this;
        }
    }

    public C1803n(C1804a aVar) {
        super(aVar.f5301b, aVar.f5302c, aVar.f5303d);
    }
}
