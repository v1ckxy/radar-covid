package p119o.p120a.p121a;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: o.a.a.h */
public class C0900h {

    /* renamed from: e */
    public static final AtomicReferenceFieldUpdater f2486e;

    /* renamed from: f */
    public static final AtomicReferenceFieldUpdater f2487f;

    /* renamed from: g */
    public static final AtomicReferenceFieldUpdater f2488g;
    public volatile Object _next = this;
    public volatile Object _prev = this;
    public volatile Object _removedRef = null;

    /* renamed from: o.a.a.h$a */
    public static abstract class C0901a extends C0896d<C0900h> {

        /* renamed from: b */
        public C0900h f2489b;

        /* renamed from: c */
        public final C0900h f2490c;

        public C0901a(C0900h hVar) {
            this.f2490c = hVar;
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<C0900h> cls2 = C0900h.class;
        f2486e = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_next");
        f2487f = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_prev");
        f2488g = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_removedRef");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004a, code lost:
        if (f2486e.compareAndSet(r3, r2, ((p119o.p120a.p121a.C0908m) r4).f2503a) != false) goto L_0x004d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p119o.p120a.p121a.C0900h mo4173a(p119o.p120a.p121a.C0907l r7) {
        /*
            r6 = this;
        L_0x0000:
            java.lang.Object r0 = r6._prev
            o.a.a.h r0 = (p119o.p120a.p121a.C0900h) r0
            r1 = 0
            r2 = r0
        L_0x0006:
            r3 = r1
        L_0x0007:
            java.lang.Object r4 = r2._next
            if (r4 != r6) goto L_0x0018
            if (r0 != r2) goto L_0x000e
            return r2
        L_0x000e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f2487f
            boolean r0 = r1.compareAndSet(r6, r0, r2)
            if (r0 != 0) goto L_0x0017
            goto L_0x0000
        L_0x0017:
            return r2
        L_0x0018:
            boolean r5 = r6.mo4172j()
            if (r5 == 0) goto L_0x001f
            return r1
        L_0x001f:
            if (r4 != r7) goto L_0x0022
            return r2
        L_0x0022:
            boolean r5 = r4 instanceof p119o.p120a.p121a.C0907l
            if (r5 == 0) goto L_0x003a
            if (r7 == 0) goto L_0x0034
            r0 = r4
            o.a.a.l r0 = (p119o.p120a.p121a.C0907l) r0
            r3 = r7
            o.a.a.d r3 = (p119o.p120a.p121a.C0896d) r3
            o.a.a.d r0 = (p119o.p120a.p121a.C0896d) r0
            if (r0 == 0) goto L_0x0033
            goto L_0x0034
        L_0x0033:
            throw r1
        L_0x0034:
            o.a.a.l r4 = (p119o.p120a.p121a.C0907l) r4
            r4.mo4169a(r2)
            goto L_0x0000
        L_0x003a:
            boolean r5 = r4 instanceof p119o.p120a.p121a.C0908m
            if (r5 == 0) goto L_0x0054
            if (r3 == 0) goto L_0x004f
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = f2486e
            o.a.a.m r4 = (p119o.p120a.p121a.C0908m) r4
            o.a.a.h r4 = r4.f2503a
            boolean r2 = r5.compareAndSet(r3, r2, r4)
            if (r2 != 0) goto L_0x004d
            goto L_0x0000
        L_0x004d:
            r2 = r3
            goto L_0x0006
        L_0x004f:
            java.lang.Object r2 = r2._prev
            o.a.a.h r2 = (p119o.p120a.p121a.C0900h) r2
            goto L_0x0007
        L_0x0054:
            if (r4 == 0) goto L_0x005b
            o.a.a.h r4 = (p119o.p120a.p121a.C0900h) r4
            r3 = r2
            r2 = r4
            goto L_0x0007
        L_0x005b:
            u.i r7 = new u.i
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p119o.p120a.p121a.C0900h.mo4173a(o.a.a.l):o.a.a.h");
    }

    /* renamed from: a */
    public final void mo4174a(C0900h hVar) {
        C0900h hVar2;
        do {
            hVar2 = (C0900h) hVar._prev;
            if (mo4175g() != hVar) {
                return;
            }
        } while (!f2487f.compareAndSet(hVar, hVar2, this));
        if (mo4172j()) {
            hVar.mo4173a((C0907l) null);
        }
    }

    /* renamed from: g */
    public final Object mo4175g() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof C0907l)) {
                return obj;
            }
            ((C0907l) obj).mo4169a(this);
        }
    }

    /* renamed from: h */
    public final C0900h mo4176h() {
        return C0899g.m1978a(mo4175g());
    }

    /* renamed from: i */
    public final C0900h mo4177i() {
        C0900h a = mo4173a((C0907l) null);
        if (a == null) {
            Object obj = this._prev;
            while (true) {
                a = (C0900h) obj;
                if (!a.mo4172j()) {
                    break;
                }
                obj = a._prev;
            }
        }
        return a;
    }

    /* renamed from: j */
    public boolean mo4172j() {
        return mo4175g() instanceof C0908m;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        return sb.toString();
    }
}
