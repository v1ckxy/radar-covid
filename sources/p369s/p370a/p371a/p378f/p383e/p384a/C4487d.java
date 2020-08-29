package p369s.p370a.p371a.p378f.p383e.p384a;

import java.util.concurrent.atomic.AtomicReference;
import p369s.p370a.p371a.p374b.C4434a;
import p369s.p370a.p371a.p374b.C4436c;
import p369s.p370a.p371a.p374b.C4438e;
import p369s.p370a.p371a.p374b.C4445l;
import p369s.p370a.p371a.p375c.C4450c;
import p369s.p370a.p371a.p378f.p379a.C4463a;
import p369s.p370a.p371a.p378f.p379a.C4466d;

/* renamed from: s.a.a.f.e.a.d */
public final class C4487d extends C4434a {

    /* renamed from: a */
    public final C4438e f10577a;

    /* renamed from: b */
    public final C4445l f10578b;

    /* renamed from: s.a.a.f.e.a.d$a */
    public static final class C4488a extends AtomicReference<C4450c> implements C4436c, C4450c, Runnable {

        /* renamed from: e */
        public final C4436c f10579e;

        /* renamed from: f */
        public final C4466d f10580f = new C4466d();

        /* renamed from: g */
        public final C4438e f10581g;

        public C4488a(C4436c cVar, C4438e eVar) {
            this.f10579e = cVar;
            this.f10581g = eVar;
        }

        /* renamed from: a */
        public void mo10717a() {
            this.f10579e.mo10717a();
        }

        /* renamed from: a */
        public void mo10718a(Throwable th) {
            this.f10579e.mo10718a(th);
        }

        /* renamed from: a */
        public void mo10719a(C4450c cVar) {
            C4463a.m10052b(this, cVar);
        }

        /* renamed from: f */
        public void mo10714f() {
            C4463a.m10049a(this);
            this.f10580f.mo10714f();
        }

        public void run() {
            this.f10581g.mo3713a(this);
        }
    }

    public C4487d(C4438e eVar, C4445l lVar) {
        this.f10577a = eVar;
        this.f10578b = lVar;
    }

    /* renamed from: b */
    public void mo10716b(C4436c cVar) {
        C4488a aVar = new C4488a(cVar, this.f10577a);
        cVar.mo10719a((C4450c) aVar);
        C4450c a = this.f10578b.mo10726a(aVar);
        C4466d dVar = aVar.f10580f;
        if (dVar != null) {
            C4463a.m10050a((AtomicReference<C4450c>) dVar, a);
            return;
        }
        throw null;
    }
}
