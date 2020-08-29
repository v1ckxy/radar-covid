package p369s.p370a.p371a.p378f.p383e.p385b;

import java.util.concurrent.atomic.AtomicReference;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p369s.p370a.p371a.p374b.C4440g;
import p369s.p370a.p371a.p374b.C4441h;
import p369s.p370a.p371a.p374b.C4442i;
import p369s.p370a.p371a.p374b.C4444k;
import p369s.p370a.p371a.p375c.C4450c;
import p369s.p370a.p371a.p378f.p379a.C4463a;
import p369s.p370a.p371a.p378f.p388h.C4535b;

/* renamed from: s.a.a.f.e.b.b */
public final class C4490b<T> extends C4440g<T> {

    /* renamed from: a */
    public final C4442i<T> f10583a;

    /* renamed from: s.a.a.f.e.b.b$a */
    public static final class C4491a<T> extends AtomicReference<C4450c> implements C4441h<T>, C4450c {

        /* renamed from: e */
        public final C4444k<? super T> f10584e;

        public C4491a(C4444k<? super T> kVar) {
            this.f10584e = kVar;
        }

        /* renamed from: a */
        public void mo10762a(T t) {
            if (t == null) {
                mo10763a((Throwable) C4535b.m10203a("onNext called with a null value."));
                return;
            }
            if (!mo10764a()) {
                this.f10584e.mo10725b(t);
            }
        }

        /* renamed from: a */
        public boolean mo10764a() {
            return ((C4450c) get()) == C4463a.DISPOSED;
        }

        /* renamed from: b */
        public void mo10765b() {
            if (!mo10764a()) {
                try {
                    this.f10584e.mo10722a();
                } finally {
                    C4463a.m10049a(this);
                }
            }
        }

        /* renamed from: f */
        public void mo10714f() {
            C4463a.m10049a(this);
        }

        public String toString() {
            return String.format("%s{%s}", new Object[]{C4491a.class.getSimpleName(), super.toString()});
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        public void mo10763a(Throwable th) {
            boolean z;
            Throwable a = th == null ? C4535b.m10203a("onError called with a null Throwable.") : th;
            if (!mo10764a()) {
                try {
                    this.f10584e.mo10723a(a);
                    C4463a.m10049a(this);
                    z = true;
                } catch (Throwable th2) {
                    C4463a.m10049a(this);
                    throw th2;
                }
            } else {
                z = false;
            }
            if (!z) {
                C2286e.m5298b(th);
            }
        }
    }

    public C4490b(C4442i<T> iVar) {
        this.f10583a = iVar;
    }

    /* renamed from: b */
    public void mo10721b(C4444k<? super T> kVar) {
        C4491a aVar = new C4491a(kVar);
        kVar.mo10724a((C4450c) aVar);
        try {
            this.f10583a.mo3711a(aVar);
        } catch (Throwable th) {
            C2286e.m5312c(th);
            aVar.mo10763a(th);
        }
    }
}
