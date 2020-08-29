package p119o.p120a.p121a;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p392u.p401r.p403c.C4636f;

/* renamed from: o.a.a.j */
public final class C0903j<E> {

    /* renamed from: e */
    public static final AtomicReferenceFieldUpdater f2492e;

    /* renamed from: f */
    public static final AtomicLongFieldUpdater f2493f;

    /* renamed from: g */
    public static final C0910o f2494g = new C0910o("REMOVE_FROZEN");

    /* renamed from: h */
    public static final C0904a f2495h = new C0904a(null);
    public volatile Object _next = null;
    public volatile long _state = 0;

    /* renamed from: a */
    public final int f2496a;

    /* renamed from: b */
    public AtomicReferenceArray f2497b = new AtomicReferenceArray(this.f2498c);

    /* renamed from: c */
    public final int f2498c;

    /* renamed from: d */
    public final boolean f2499d;

    /* renamed from: o.a.a.j$a */
    public static final class C0904a {
        public /* synthetic */ C0904a(C4636f fVar) {
        }
    }

    /* renamed from: o.a.a.j$b */
    public static final class C0905b {

        /* renamed from: a */
        public final int f2500a;

        public C0905b(int i) {
            this.f2500a = i;
        }
    }

    static {
        Class<C0903j> cls = C0903j.class;
        f2492e = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_next");
        f2493f = AtomicLongFieldUpdater.newUpdater(cls, "_state");
    }

    public C0903j(int i, boolean z) {
        this.f2498c = i;
        this.f2499d = z;
        boolean z2 = true;
        this.f2496a = i - 1;
        String str = "Check failed.";
        if (this.f2496a <= 1073741823) {
            if ((this.f2498c & this.f2496a) != 0) {
                z2 = false;
            }
            if (!z2) {
                throw new IllegalStateException(str.toString());
            }
            return;
        }
        throw new IllegalStateException(str.toString());
    }

    /* renamed from: a */
    public final int mo4183a(E e) {
        while (true) {
            long j = this._state;
            int i = 1;
            if ((3458764513820540928L & j) != 0) {
                if ((j & 2305843009213693952L) != 0) {
                    i = 2;
                }
                return i;
            }
            int i2 = (int) ((1073741823 & j) >> 0);
            int i3 = (int) ((1152921503533105152L & j) >> 30);
            int i4 = this.f2496a;
            if (((i3 + 2) & i4) == (i2 & i4)) {
                return 1;
            }
            if (this.f2499d || this.f2497b.get(i3 & i4) == null) {
                int i5 = (i3 + 1) & 1073741823;
                if (f2493f.compareAndSet(this, j, (-1152921503533105153L & j) | (((long) i5) << 30))) {
                    this.f2497b.set(i3 & i4, e);
                    C0903j jVar = this;
                    while ((jVar._state & 1152921504606846976L) != 0) {
                        jVar = jVar.mo4186c();
                        Object obj = jVar.f2497b.get(jVar.f2496a & i3);
                        if (!(obj instanceof C0905b) || ((C0905b) obj).f2500a != i3) {
                            jVar = null;
                            continue;
                        } else {
                            jVar.f2497b.set(jVar.f2496a & i3, e);
                            continue;
                        }
                        if (jVar == null) {
                            break;
                        }
                    }
                    return 0;
                }
            } else {
                int i6 = this.f2498c;
                if (i6 < 1024 || ((i3 - i2) & 1073741823) > (i6 >> 1)) {
                    return 1;
                }
            }
        }
        return 1;
    }

    /* renamed from: a */
    public final boolean mo4184a() {
        long j;
        do {
            j = this._state;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!f2493f.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    /* renamed from: b */
    public final boolean mo4185b() {
        long j = this._state;
        return ((int) ((1073741823 & j) >> 0)) == ((int) ((j & 1152921503533105152L) >> 30));
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p119o.p120a.p121a.C0903j<E> mo4186c() {
        /*
            r10 = this;
        L_0x0000:
            long r2 = r10._state
            r0 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r4 = r2 & r0
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x000d
            goto L_0x001a
        L_0x000d:
            long r6 = r2 | r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = f2493f
            r1 = r10
            r4 = r6
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L_0x0000
            r2 = r6
        L_0x001a:
            java.lang.Object r0 = r10._next
            o.a.a.j r0 = (p119o.p120a.p121a.C0903j) r0
            if (r0 == 0) goto L_0x0021
            return r0
        L_0x0021:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f2492e
            r1 = 0
            o.a.a.j r4 = new o.a.a.j
            int r5 = r10.f2498c
            int r5 = r5 * 2
            boolean r6 = r10.f2499d
            r4.<init>(r5, r6)
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r5 = r5 & r2
            r7 = 0
            long r5 = r5 >> r7
            int r5 = (int) r5
            r6 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r6 = r6 & r2
            r8 = 30
            long r6 = r6 >> r8
            int r6 = (int) r6
        L_0x0040:
            int r7 = r10.f2496a
            r8 = r5 & r7
            r7 = r7 & r6
            if (r8 == r7) goto L_0x0060
            java.util.concurrent.atomic.AtomicReferenceArray r7 = r10.f2497b
            java.lang.Object r7 = r7.get(r8)
            if (r7 == 0) goto L_0x0050
            goto L_0x0055
        L_0x0050:
            o.a.a.j$b r7 = new o.a.a.j$b
            r7.<init>(r5)
        L_0x0055:
            java.util.concurrent.atomic.AtomicReferenceArray r8 = r4.f2497b
            int r9 = r4.f2496a
            r9 = r9 & r5
            r8.set(r9, r7)
            int r5 = r5 + 1
            goto L_0x0040
        L_0x0060:
            r5 = -1152921504606846977(0xefffffffffffffff, double:-3.1050361846014175E231)
            long r5 = r5 & r2
            r4._state = r5
            r0.compareAndSet(r10, r1, r4)
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: p119o.p120a.p121a.C0903j.mo4186c():o.a.a.j");
    }

    /* renamed from: d */
    public final Object mo4187d() {
        while (true) {
            long j = this._state;
            if ((j & 1152921504606846976L) != 0) {
                return f2494g;
            }
            int i = (int) ((j & 1073741823) >> 0);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.f2496a;
            int i4 = i2 & i3;
            int i5 = i3 & i;
            if (i4 == i5) {
                return null;
            }
            Object obj = this.f2497b.get(i5);
            if (obj == null) {
                if (this.f2499d) {
                    return null;
                }
            } else if (obj instanceof C0905b) {
                return null;
            } else {
                long j2 = ((long) ((i + 1) & 1073741823)) << 0;
                Object obj2 = obj;
                if (f2493f.compareAndSet(this, j, (j & -1073741824) | j2)) {
                    this.f2497b.set(this.f2496a & i, null);
                    return obj2;
                } else if (this.f2499d) {
                    C0903j jVar = this;
                    while (true) {
                        long j3 = jVar._state;
                        int i6 = (int) ((j3 & 1073741823) >> 0);
                        if ((j3 & 1152921504606846976L) != 0) {
                            jVar = jVar.mo4186c();
                        } else {
                            if (f2493f.compareAndSet(jVar, j3, (j3 & -1073741824) | j2)) {
                                jVar.f2497b.set(jVar.f2496a & i6, null);
                                jVar = null;
                            } else {
                                continue;
                            }
                        }
                        if (jVar == null) {
                            return obj2;
                        }
                    }
                }
            }
        }
    }
}
