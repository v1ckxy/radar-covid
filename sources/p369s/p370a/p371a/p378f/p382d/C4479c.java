package p369s.p370a.p371a.p378f.p382d;

import java.util.concurrent.atomic.AtomicReference;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p369s.p370a.p371a.p374b.C4444k;
import p369s.p370a.p371a.p375c.C4450c;
import p369s.p370a.p371a.p376d.C4453a;
import p369s.p370a.p371a.p377e.C4458a;
import p369s.p370a.p371a.p377e.C4459b;
import p369s.p370a.p371a.p378f.p379a.C4463a;

/* renamed from: s.a.a.f.d.c */
public final class C4479c<T> extends AtomicReference<C4450c> implements C4444k<T>, C4450c {

    /* renamed from: e */
    public final C4459b<? super T> f10560e;

    /* renamed from: f */
    public final C4459b<? super Throwable> f10561f;

    /* renamed from: g */
    public final C4458a f10562g;

    /* renamed from: h */
    public final C4459b<? super C4450c> f10563h;

    public C4479c(C4459b<? super T> bVar, C4459b<? super Throwable> bVar2, C4458a aVar, C4459b<? super C4450c> bVar3) {
        this.f10560e = bVar;
        this.f10561f = bVar2;
        this.f10562g = aVar;
        this.f10563h = bVar3;
    }

    /* renamed from: a */
    public void mo10722a() {
        if (!mo10756b()) {
            lazySet(C4463a.DISPOSED);
            try {
                this.f10562g.run();
            } catch (Throwable th) {
                C2286e.m5312c(th);
                C2286e.m5298b(th);
            }
        }
    }

    /* renamed from: a */
    public void mo10723a(Throwable th) {
        if (!mo10756b()) {
            lazySet(C4463a.DISPOSED);
            try {
                this.f10561f.mo3749a(th);
            } catch (Throwable th2) {
                C2286e.m5312c(th2);
                C2286e.m5298b((Throwable) new C4453a(th, th2));
            }
        } else {
            C2286e.m5298b(th);
        }
    }

    /* renamed from: a */
    public void mo10724a(C4450c cVar) {
        if (C4463a.m10052b(this, cVar)) {
            try {
                this.f10563h.mo3749a(this);
            } catch (Throwable th) {
                C2286e.m5312c(th);
                cVar.mo10714f();
                mo10723a(th);
            }
        }
    }

    /* renamed from: b */
    public void mo10725b(T t) {
        if (!mo10756b()) {
            try {
                this.f10560e.mo3749a(t);
            } catch (Throwable th) {
                C2286e.m5312c(th);
                ((C4450c) get()).mo10714f();
                mo10723a(th);
            }
        }
    }

    /* renamed from: b */
    public boolean mo10756b() {
        return get() == C4463a.DISPOSED;
    }

    /* renamed from: f */
    public void mo10714f() {
        C4463a.m10049a(this);
    }
}
