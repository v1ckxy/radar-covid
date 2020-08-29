package p369s.p370a.p371a.p378f.p383e.p385b;

import java.util.concurrent.atomic.AtomicReference;
import p369s.p370a.p371a.p374b.C4443j;
import p369s.p370a.p371a.p374b.C4444k;
import p369s.p370a.p371a.p374b.C4445l;
import p369s.p370a.p371a.p375c.C4450c;
import p369s.p370a.p371a.p378f.p379a.C4463a;

/* renamed from: s.a.a.f.e.b.i */
public final class C4503i<T> extends C4489a<T, T> {

    /* renamed from: b */
    public final C4445l f10640b;

    /* renamed from: s.a.a.f.e.b.i$a */
    public static final class C4504a<T> extends AtomicReference<C4450c> implements C4444k<T>, C4450c {

        /* renamed from: e */
        public final C4444k<? super T> f10641e;

        /* renamed from: f */
        public final AtomicReference<C4450c> f10642f = new AtomicReference<>();

        public C4504a(C4444k<? super T> kVar) {
            this.f10641e = kVar;
        }

        /* renamed from: a */
        public void mo10722a() {
            this.f10641e.mo10722a();
        }

        /* renamed from: a */
        public void mo10723a(Throwable th) {
            this.f10641e.mo10723a(th);
        }

        /* renamed from: a */
        public void mo10724a(C4450c cVar) {
            C4463a.m10052b(this.f10642f, cVar);
        }

        /* renamed from: b */
        public void mo10725b(T t) {
            this.f10641e.mo10725b(t);
        }

        /* renamed from: f */
        public void mo10714f() {
            C4463a.m10049a(this.f10642f);
            C4463a.m10049a(this);
        }
    }

    /* renamed from: s.a.a.f.e.b.i$b */
    public final class C4505b implements Runnable {

        /* renamed from: e */
        public final C4504a<T> f10643e;

        public C4505b(C4504a<T> aVar) {
            this.f10643e = aVar;
        }

        public void run() {
            C4503i.this.f10582a.mo10720a(this.f10643e);
        }
    }

    public C4503i(C4443j<T> jVar, C4445l lVar) {
        super(jVar);
        this.f10640b = lVar;
    }

    /* renamed from: b */
    public void mo10721b(C4444k<? super T> kVar) {
        C4504a aVar = new C4504a(kVar);
        kVar.mo10724a((C4450c) aVar);
        C4463a.m10052b(aVar, this.f10640b.mo10726a(new C4505b(aVar)));
    }
}
