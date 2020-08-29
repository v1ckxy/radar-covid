package p124p.p177n;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: p.n.e */
public abstract class C1537e {

    /* renamed from: p.n.e$a */
    public enum C1538a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY
    }

    /* renamed from: p.n.e$b */
    public enum C1539b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        /* renamed from: a */
        public boolean mo6228a(C1539b bVar) {
            return compareTo(bVar) >= 0;
        }
    }

    public C1537e() {
        new AtomicReference();
    }

    /* renamed from: a */
    public abstract void mo6227a(C1541g gVar);
}
