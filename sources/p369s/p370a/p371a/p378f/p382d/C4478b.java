package p369s.p370a.p371a.p378f.p382d;

import java.util.concurrent.atomic.AtomicReference;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p369s.p370a.p371a.p374b.C4436c;
import p369s.p370a.p371a.p375c.C4450c;
import p369s.p370a.p371a.p376d.C4455b;
import p369s.p370a.p371a.p377e.C4458a;
import p369s.p370a.p371a.p377e.C4459b;
import p369s.p370a.p371a.p378f.p379a.C4463a;

/* renamed from: s.a.a.f.d.b */
public final class C4478b extends AtomicReference<C4450c> implements C4436c, C4450c, C4459b<Throwable> {

    /* renamed from: e */
    public final C4459b<? super Throwable> f10558e;

    /* renamed from: f */
    public final C4458a f10559f;

    public C4478b(C4459b<? super Throwable> bVar, C4458a aVar) {
        this.f10558e = bVar;
        this.f10559f = aVar;
    }

    /* renamed from: a */
    public void mo10717a() {
        try {
            this.f10559f.run();
        } catch (Throwable th) {
            C2286e.m5312c(th);
            C2286e.m5298b(th);
        }
        lazySet(C4463a.DISPOSED);
    }

    /* renamed from: a */
    public void mo3749a(Object obj) {
        C2286e.m5298b((Throwable) new C4455b((Throwable) obj));
    }

    /* renamed from: a */
    public void mo10718a(Throwable th) {
        try {
            this.f10558e.mo3749a(th);
        } catch (Throwable th2) {
            C2286e.m5312c(th2);
            C2286e.m5298b(th2);
        }
        lazySet(C4463a.DISPOSED);
    }

    /* renamed from: a */
    public void mo10719a(C4450c cVar) {
        C4463a.m10052b(this, cVar);
    }

    /* renamed from: f */
    public void mo10714f() {
        C4463a.m10049a(this);
    }
}
