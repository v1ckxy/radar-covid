package p369s.p370a.p371a.p378f.p383e.p384a;

import java.util.concurrent.atomic.AtomicReference;
import p369s.p370a.p371a.p374b.C4434a;
import p369s.p370a.p371a.p374b.C4436c;
import p369s.p370a.p371a.p374b.C4438e;
import p369s.p370a.p371a.p374b.C4445l;
import p369s.p370a.p371a.p375c.C4450c;
import p369s.p370a.p371a.p378f.p379a.C4463a;

/* renamed from: s.a.a.f.e.a.c */
public final class C4485c extends C4434a {

    /* renamed from: a */
    public final C4438e f10572a;

    /* renamed from: b */
    public final C4445l f10573b;

    /* renamed from: s.a.a.f.e.a.c$a */
    public static final class C4486a extends AtomicReference<C4450c> implements C4436c, C4450c, Runnable {

        /* renamed from: e */
        public final C4436c f10574e;

        /* renamed from: f */
        public final C4445l f10575f;

        /* renamed from: g */
        public Throwable f10576g;

        public C4486a(C4436c cVar, C4445l lVar) {
            this.f10574e = cVar;
            this.f10575f = lVar;
        }

        /* renamed from: a */
        public void mo10717a() {
            C4463a.m10050a((AtomicReference<C4450c>) this, this.f10575f.mo10726a(this));
        }

        /* renamed from: a */
        public void mo10718a(Throwable th) {
            this.f10576g = th;
            C4463a.m10050a((AtomicReference<C4450c>) this, this.f10575f.mo10726a(this));
        }

        /* renamed from: a */
        public void mo10719a(C4450c cVar) {
            if (C4463a.m10052b(this, cVar)) {
                this.f10574e.mo10719a((C4450c) this);
            }
        }

        /* renamed from: f */
        public void mo10714f() {
            C4463a.m10049a(this);
        }

        public void run() {
            Throwable th = this.f10576g;
            if (th != null) {
                this.f10576g = null;
                this.f10574e.mo10718a(th);
                return;
            }
            this.f10574e.mo10717a();
        }
    }

    public C4485c(C4438e eVar, C4445l lVar) {
        this.f10572a = eVar;
        this.f10573b = lVar;
    }

    /* renamed from: b */
    public void mo10716b(C4436c cVar) {
        this.f10572a.mo3713a(new C4486a(cVar, this.f10573b));
    }
}
