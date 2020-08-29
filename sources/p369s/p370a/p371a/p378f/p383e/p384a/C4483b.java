package p369s.p370a.p371a.p378f.p383e.p384a;

import java.util.concurrent.atomic.AtomicReference;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p369s.p370a.p371a.p374b.C4434a;
import p369s.p370a.p371a.p374b.C4435b;
import p369s.p370a.p371a.p374b.C4436c;
import p369s.p370a.p371a.p374b.C4437d;
import p369s.p370a.p371a.p375c.C4450c;
import p369s.p370a.p371a.p378f.p379a.C4463a;

/* renamed from: s.a.a.f.e.a.b */
public final class C4483b extends C4434a {

    /* renamed from: a */
    public final C4437d f10570a;

    /* renamed from: s.a.a.f.e.a.b$a */
    public static final class C4484a extends AtomicReference<C4450c> implements C4435b, C4450c {

        /* renamed from: e */
        public final C4436c f10571e;

        public C4484a(C4436c cVar) {
            this.f10571e = cVar;
        }

        /* renamed from: a */
        public void mo10757a() {
            Object obj = get();
            C4463a aVar = C4463a.DISPOSED;
            if (obj != aVar) {
                C4450c cVar = (C4450c) getAndSet(aVar);
                if (cVar != C4463a.DISPOSED) {
                    try {
                        this.f10571e.mo10717a();
                    } finally {
                        if (cVar != null) {
                            cVar.mo10714f();
                        }
                    }
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0032  */
        /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo10758a(java.lang.Throwable r4) {
            /*
                r3 = this;
                if (r4 != 0) goto L_0x0009
                java.lang.String r0 = "onError called with a null Throwable."
                java.lang.NullPointerException r0 = p369s.p370a.p371a.p378f.p388h.C4535b.m10203a(r0)
                goto L_0x000a
            L_0x0009:
                r0 = r4
            L_0x000a:
                java.lang.Object r1 = r3.get()
                s.a.a.f.a.a r2 = p369s.p370a.p371a.p378f.p379a.C4463a.DISPOSED
                if (r1 == r2) goto L_0x002f
                java.lang.Object r1 = r3.getAndSet(r2)
                s.a.a.c.c r1 = (p369s.p370a.p371a.p375c.C4450c) r1
                s.a.a.f.a.a r2 = p369s.p370a.p371a.p378f.p379a.C4463a.DISPOSED
                if (r1 == r2) goto L_0x002f
                s.a.a.b.c r2 = r3.f10571e     // Catch:{ all -> 0x0028 }
                r2.mo10718a(r0)     // Catch:{ all -> 0x0028 }
                if (r1 == 0) goto L_0x0026
                r1.mo10714f()
            L_0x0026:
                r0 = 1
                goto L_0x0030
            L_0x0028:
                r4 = move-exception
                if (r1 == 0) goto L_0x002e
                r1.mo10714f()
            L_0x002e:
                throw r4
            L_0x002f:
                r0 = 0
            L_0x0030:
                if (r0 != 0) goto L_0x0035
                p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5298b(r4)
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p369s.p370a.p371a.p378f.p383e.p384a.C4483b.C4484a.mo10758a(java.lang.Throwable):void");
        }

        /* renamed from: f */
        public void mo10714f() {
            C4463a.m10049a(this);
        }

        public String toString() {
            return String.format("%s{%s}", new Object[]{C4484a.class.getSimpleName(), super.toString()});
        }
    }

    public C4483b(C4437d dVar) {
        this.f10570a = dVar;
    }

    /* renamed from: b */
    public void mo10716b(C4436c cVar) {
        C4484a aVar = new C4484a(cVar);
        cVar.mo10719a((C4450c) aVar);
        try {
            this.f10570a.mo3660a(aVar);
        } catch (Throwable th) {
            C2286e.m5312c(th);
            aVar.mo10758a(th);
        }
    }
}
