package p369s.p370a.p371a.p378f.p383e.p385b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p369s.p370a.p371a.p374b.C4440g;
import p369s.p370a.p371a.p374b.C4443j;
import p369s.p370a.p371a.p374b.C4444k;
import p369s.p370a.p371a.p375c.C4450c;
import p369s.p370a.p371a.p377e.C4461d;
import p369s.p370a.p371a.p378f.p379a.C4463a;
import p369s.p370a.p371a.p378f.p379a.C4464b;
import p369s.p370a.p371a.p378f.p386f.C4510b;

/* renamed from: s.a.a.f.e.b.j */
public final class C4506j<T, R> extends C4440g<R> {

    /* renamed from: a */
    public final C4443j<? extends T>[] f10645a;

    /* renamed from: b */
    public final Iterable<? extends C4443j<? extends T>> f10646b;

    /* renamed from: c */
    public final C4461d<? super Object[], ? extends R> f10647c;

    /* renamed from: d */
    public final int f10648d;

    /* renamed from: e */
    public final boolean f10649e;

    /* renamed from: s.a.a.f.e.b.j$a */
    public static final class C4507a<T, R> extends AtomicInteger implements C4450c {

        /* renamed from: e */
        public final C4444k<? super R> f10650e;

        /* renamed from: f */
        public final C4461d<? super Object[], ? extends R> f10651f;

        /* renamed from: g */
        public final C4508b<T, R>[] f10652g;

        /* renamed from: h */
        public final T[] f10653h;

        /* renamed from: i */
        public final boolean f10654i;

        /* renamed from: j */
        public volatile boolean f10655j;

        public C4507a(C4444k<? super R> kVar, C4461d<? super Object[], ? extends R> dVar, int i, boolean z) {
            this.f10650e = kVar;
            this.f10651f = dVar;
            this.f10652g = new C4508b[i];
            this.f10653h = new Object[i];
            this.f10654i = z;
        }

        /* renamed from: a */
        public void mo10785a() {
            for (C4508b<T, R> bVar : this.f10652g) {
                bVar.f10657f.clear();
            }
            for (C4508b<T, R> bVar2 : this.f10652g) {
                C4463a.m10049a(bVar2.f10660i);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
            if (r8 != null) goto L_0x004e;
         */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0061  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x0060 A[SYNTHETIC] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo10786b() {
            /*
                r16 = this;
                r1 = r16
                int r0 = r16.getAndIncrement()
                if (r0 == 0) goto L_0x0009
                return
            L_0x0009:
                s.a.a.f.e.b.j$b<T, R>[] r0 = r1.f10652g
                s.a.a.b.k<? super R> r2 = r1.f10650e
                T[] r3 = r1.f10653h
                boolean r4 = r1.f10654i
                r5 = 1
                r6 = r5
            L_0x0013:
                int r7 = r0.length
                r9 = 0
                r10 = 0
                r11 = 0
            L_0x0017:
                if (r9 >= r7) goto L_0x0081
                r12 = r0[r9]
                r13 = r3[r11]
                if (r13 != 0) goto L_0x0069
                boolean r13 = r12.f10658g
                s.a.a.f.f.b<T> r14 = r12.f10657f
                java.lang.Object r14 = r14.mo10751g()
                if (r14 != 0) goto L_0x002b
                r15 = r5
                goto L_0x002c
            L_0x002b:
                r15 = 0
            L_0x002c:
                boolean r8 = r1.f10655j
                if (r8 == 0) goto L_0x0035
                r16.mo10785a()
            L_0x0033:
                r8 = r5
                goto L_0x005e
            L_0x0035:
                if (r13 == 0) goto L_0x005d
                if (r4 == 0) goto L_0x0045
                if (r15 == 0) goto L_0x005d
                java.lang.Throwable r8 = r12.f10659h
                r1.f10655j = r5
                r16.mo10785a()
                if (r8 == 0) goto L_0x0059
                goto L_0x004e
            L_0x0045:
                java.lang.Throwable r8 = r12.f10659h
                if (r8 == 0) goto L_0x0052
                r1.f10655j = r5
                r16.mo10785a()
            L_0x004e:
                r2.mo10723a(r8)
                goto L_0x0033
            L_0x0052:
                if (r15 == 0) goto L_0x005d
                r1.f10655j = r5
                r16.mo10785a()
            L_0x0059:
                r2.mo10722a()
                goto L_0x0033
            L_0x005d:
                r8 = 0
            L_0x005e:
                if (r8 == 0) goto L_0x0061
                return
            L_0x0061:
                if (r15 != 0) goto L_0x0066
                r3[r11] = r14
                goto L_0x007c
            L_0x0066:
                int r10 = r10 + 1
                goto L_0x007c
            L_0x0069:
                boolean r8 = r12.f10658g
                if (r8 == 0) goto L_0x007c
                if (r4 != 0) goto L_0x007c
                java.lang.Throwable r8 = r12.f10659h
                if (r8 == 0) goto L_0x007c
                r1.f10655j = r5
                r16.mo10785a()
                r2.mo10723a(r8)
                return
            L_0x007c:
                int r11 = r11 + 1
                int r9 = r9 + 1
                goto L_0x0017
            L_0x0081:
                if (r10 == 0) goto L_0x008b
                int r6 = -r6
                int r6 = r1.addAndGet(r6)
                if (r6 != 0) goto L_0x0013
                return
            L_0x008b:
                s.a.a.e.d<? super java.lang.Object[], ? extends R> r7 = r1.f10651f     // Catch:{ all -> 0x00a4 }
                java.lang.Object r8 = r3.clone()     // Catch:{ all -> 0x00a4 }
                java.lang.Object r7 = r7.mo3712a(r8)     // Catch:{ all -> 0x00a4 }
                java.lang.String r8 = "The zipper returned a null value"
                java.lang.Object r7 = java.util.Objects.requireNonNull(r7, r8)     // Catch:{ all -> 0x00a4 }
                r2.mo10725b(r7)
                r7 = 0
                java.util.Arrays.fill(r3, r7)
                goto L_0x0013
            L_0x00a4:
                r0 = move-exception
                p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5312c(r0)
                r16.mo10785a()
                r2.mo10723a(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p369s.p370a.p371a.p378f.p383e.p385b.C4506j.C4507a.mo10786b():void");
        }

        /* renamed from: f */
        public void mo10714f() {
            if (!this.f10655j) {
                this.f10655j = true;
                for (C4508b<T, R> bVar : this.f10652g) {
                    C4463a.m10049a(bVar.f10660i);
                }
                if (getAndIncrement() == 0) {
                    for (C4508b<T, R> bVar2 : this.f10652g) {
                        bVar2.f10657f.clear();
                    }
                }
            }
        }
    }

    /* renamed from: s.a.a.f.e.b.j$b */
    public static final class C4508b<T, R> implements C4444k<T> {

        /* renamed from: e */
        public final C4507a<T, R> f10656e;

        /* renamed from: f */
        public final C4510b<T> f10657f;

        /* renamed from: g */
        public volatile boolean f10658g;

        /* renamed from: h */
        public Throwable f10659h;

        /* renamed from: i */
        public final AtomicReference<C4450c> f10660i = new AtomicReference<>();

        public C4508b(C4507a<T, R> aVar, int i) {
            this.f10656e = aVar;
            this.f10657f = new C4510b<>(i);
        }

        /* renamed from: a */
        public void mo10722a() {
            this.f10658g = true;
            this.f10656e.mo10786b();
        }

        /* renamed from: a */
        public void mo10723a(Throwable th) {
            this.f10659h = th;
            this.f10658g = true;
            this.f10656e.mo10786b();
        }

        /* renamed from: a */
        public void mo10724a(C4450c cVar) {
            C4463a.m10052b(this.f10660i, cVar);
        }

        /* renamed from: b */
        public void mo10725b(T t) {
            this.f10657f.mo10752a(t);
            this.f10656e.mo10786b();
        }
    }

    public C4506j(C4443j<? extends T>[] jVarArr, Iterable<? extends C4443j<? extends T>> iterable, C4461d<? super Object[], ? extends R> dVar, int i, boolean z) {
        this.f10645a = jVarArr;
        this.f10646b = iterable;
        this.f10647c = dVar;
        this.f10648d = i;
        this.f10649e = z;
    }

    /* renamed from: b */
    public void mo10721b(C4444k<? super R> kVar) {
        int i;
        C4443j<? extends T>[] jVarArr = this.f10645a;
        if (jVarArr == null) {
            jVarArr = new C4443j[8];
            i = 0;
            for (C4443j<? extends T> jVar : this.f10646b) {
                if (i == jVarArr.length) {
                    C4443j<? extends T>[] jVarArr2 = new C4443j[((i >> 2) + i)];
                    System.arraycopy(jVarArr, 0, jVarArr2, 0, i);
                    jVarArr = jVarArr2;
                }
                int i2 = i + 1;
                jVarArr[i] = jVar;
                i = i2;
            }
        } else {
            i = jVarArr.length;
        }
        if (i == 0) {
            kVar.mo10724a((C4450c) C4464b.INSTANCE);
            kVar.mo10722a();
            return;
        }
        C4507a aVar = new C4507a(kVar, this.f10647c, i, this.f10649e);
        int i3 = this.f10648d;
        C4508b<T, R>[] bVarArr = aVar.f10652g;
        int length = bVarArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            bVarArr[i4] = new C4508b<>(aVar, i3);
        }
        aVar.lazySet(0);
        aVar.f10650e.mo10724a((C4450c) aVar);
        for (int i5 = 0; i5 < length && !aVar.f10655j; i5++) {
            jVarArr[i5].mo10720a(bVarArr[i5]);
        }
    }
}
