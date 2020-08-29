package p369s.p370a.p371a.p378f.p383e.p384a;

import java.util.concurrent.atomic.AtomicReference;
import p369s.p370a.p371a.p374b.C4434a;
import p369s.p370a.p371a.p374b.C4436c;
import p369s.p370a.p371a.p374b.C4438e;
import p369s.p370a.p371a.p375c.C4450c;
import p369s.p370a.p371a.p378f.p379a.C4463a;

/* renamed from: s.a.a.f.e.a.a */
public final class C4480a extends C4434a {

    /* renamed from: a */
    public final C4438e f10564a;

    /* renamed from: b */
    public final C4438e f10565b;

    /* renamed from: s.a.a.f.e.a.a$a */
    public static final class C4481a implements C4436c {

        /* renamed from: e */
        public final AtomicReference<C4450c> f10566e;

        /* renamed from: f */
        public final C4436c f10567f;

        public C4481a(AtomicReference<C4450c> atomicReference, C4436c cVar) {
            this.f10566e = atomicReference;
            this.f10567f = cVar;
        }

        /* renamed from: a */
        public void mo10717a() {
            this.f10567f.mo10717a();
        }

        /* renamed from: a */
        public void mo10718a(Throwable th) {
            this.f10567f.mo10718a(th);
        }

        /* renamed from: a */
        public void mo10719a(C4450c cVar) {
            C4463a.m10050a(this.f10566e, cVar);
        }
    }

    /* renamed from: s.a.a.f.e.a.a$b */
    public static final class C4482b extends AtomicReference<C4450c> implements C4436c, C4450c {

        /* renamed from: e */
        public final C4436c f10568e;

        /* renamed from: f */
        public final C4438e f10569f;

        public C4482b(C4436c cVar, C4438e eVar) {
            this.f10568e = cVar;
            this.f10569f = eVar;
        }

        /* renamed from: a */
        public void mo10717a() {
            this.f10569f.mo3713a(new C4481a(this, this.f10568e));
        }

        /* renamed from: a */
        public void mo10718a(Throwable th) {
            this.f10568e.mo10718a(th);
        }

        /* renamed from: a */
        public void mo10719a(C4450c cVar) {
            if (C4463a.m10052b(this, cVar)) {
                this.f10568e.mo10719a((C4450c) this);
            }
        }

        /* renamed from: f */
        public void mo10714f() {
            C4463a.m10049a(this);
        }
    }

    public C4480a(C4438e eVar, C4438e eVar2) {
        this.f10564a = eVar;
        this.f10565b = eVar2;
    }

    /* renamed from: b */
    public void mo10716b(C4436c cVar) {
        this.f10564a.mo3713a(new C4482b(cVar, this.f10565b));
    }
}
