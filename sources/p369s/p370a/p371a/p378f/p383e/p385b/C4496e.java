package p369s.p370a.p371a.p378f.p383e.p385b;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p369s.p370a.p371a.p374b.C4434a;
import p369s.p370a.p371a.p374b.C4436c;
import p369s.p370a.p371a.p374b.C4438e;
import p369s.p370a.p371a.p374b.C4443j;
import p369s.p370a.p371a.p374b.C4444k;
import p369s.p370a.p371a.p375c.C4448a;
import p369s.p370a.p371a.p375c.C4450c;
import p369s.p370a.p371a.p377e.C4461d;
import p369s.p370a.p371a.p378f.p379a.C4463a;
import p369s.p370a.p371a.p378f.p388h.C4534a;
import p369s.p370a.p371a.p378f.p388h.C4535b;

/* renamed from: s.a.a.f.e.b.e */
public final class C4496e<T> extends C4434a {

    /* renamed from: a */
    public final C4443j<T> f10611a;

    /* renamed from: b */
    public final C4461d<? super T, ? extends C4438e> f10612b;

    /* renamed from: c */
    public final boolean f10613c;

    /* renamed from: s.a.a.f.e.b.e$a */
    public static final class C4497a<T> extends AtomicInteger implements C4450c, C4444k<T> {

        /* renamed from: e */
        public final C4436c f10614e;

        /* renamed from: f */
        public final C4534a f10615f = new C4534a();

        /* renamed from: g */
        public final C4461d<? super T, ? extends C4438e> f10616g;

        /* renamed from: h */
        public final boolean f10617h;

        /* renamed from: i */
        public final C4448a f10618i = new C4448a();

        /* renamed from: j */
        public C4450c f10619j;

        /* renamed from: k */
        public volatile boolean f10620k;

        /* renamed from: s.a.a.f.e.b.e$a$a */
        public final class C4498a extends AtomicReference<C4450c> implements C4436c, C4450c {
            public C4498a() {
            }

            /* renamed from: a */
            public void mo10717a() {
                C4497a aVar = C4497a.this;
                aVar.f10618i.mo10731b(this);
                aVar.mo10722a();
            }

            /* renamed from: a */
            public void mo10719a(C4450c cVar) {
                C4463a.m10052b(this, cVar);
            }

            /* renamed from: f */
            public void mo10714f() {
                C4463a.m10049a(this);
            }

            /* renamed from: a */
            public void mo10718a(Throwable th) {
                C4497a aVar = C4497a.this;
                aVar.f10618i.mo10731b(this);
                aVar.mo10723a(th);
            }
        }

        public C4497a(C4436c cVar, C4461d<? super T, ? extends C4438e> dVar, boolean z) {
            this.f10614e = cVar;
            this.f10616g = dVar;
            this.f10617h = z;
            lazySet(1);
        }

        /* renamed from: a */
        public void mo10722a() {
            if (decrementAndGet() == 0) {
                this.f10615f.mo10802a(this.f10614e);
            }
        }

        /* renamed from: a */
        public void mo10723a(Throwable th) {
            if (this.f10615f.mo10803a(th)) {
                if (!this.f10617h) {
                    this.f10620k = true;
                    this.f10619j.mo10714f();
                    this.f10618i.mo10714f();
                } else if (decrementAndGet() != 0) {
                    return;
                }
                this.f10615f.mo10802a(this.f10614e);
            }
        }

        /* renamed from: a */
        public void mo10724a(C4450c cVar) {
            if (C4463a.m10051a(this.f10619j, cVar)) {
                this.f10619j = cVar;
                this.f10614e.mo10719a((C4450c) this);
            }
        }

        /* renamed from: b */
        public void mo10725b(T t) {
            try {
                C4438e eVar = (C4438e) Objects.requireNonNull(this.f10616g.mo3712a(t), "The mapper returned a null CompletableSource");
                getAndIncrement();
                C4498a aVar = new C4498a();
                if (!this.f10620k && this.f10618i.mo10732c(aVar)) {
                    eVar.mo3713a(aVar);
                }
            } catch (Throwable th) {
                C2286e.m5312c(th);
                this.f10619j.mo10714f();
                mo10723a(th);
            }
        }

        /* renamed from: f */
        public void mo10714f() {
            this.f10620k = true;
            this.f10619j.mo10714f();
            this.f10618i.mo10714f();
            C4534a aVar = this.f10615f;
            if (aVar != null) {
                Throwable a = C4535b.m10205a((AtomicReference<Throwable>) aVar);
                if (a != null && a != C4535b.f10750a) {
                    C2286e.m5298b(a);
                    return;
                }
                return;
            }
            throw null;
        }
    }

    public C4496e(C4443j<T> jVar, C4461d<? super T, ? extends C4438e> dVar, boolean z) {
        this.f10611a = jVar;
        this.f10612b = dVar;
        this.f10613c = z;
    }

    /* renamed from: b */
    public void mo10716b(C4436c cVar) {
        this.f10611a.mo10720a(new C4497a(cVar, this.f10612b, this.f10613c));
    }
}
