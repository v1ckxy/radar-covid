package p369s.p370a.p371a.p378f.p386f;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p369s.p370a.p371a.p378f.p381c.C4475c;

/* renamed from: s.a.a.f.f.b */
public final class C4510b<T> implements C4475c<T> {

    /* renamed from: m */
    public static final int f10667m = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* renamed from: n */
    public static final Object f10668n = new Object();

    /* renamed from: e */
    public final AtomicLong f10669e = new AtomicLong();

    /* renamed from: f */
    public int f10670f;

    /* renamed from: g */
    public long f10671g;

    /* renamed from: h */
    public final int f10672h;

    /* renamed from: i */
    public AtomicReferenceArray<Object> f10673i;

    /* renamed from: j */
    public final int f10674j;

    /* renamed from: k */
    public AtomicReferenceArray<Object> f10675k;

    /* renamed from: l */
    public final AtomicLong f10676l = new AtomicLong();

    public C4510b(int i) {
        int g = C2286e.m5341g(Math.max(8, i));
        int i2 = g - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(g + 1);
        this.f10673i = atomicReferenceArray;
        this.f10672h = i2;
        this.f10670f = Math.min(g / 4, f10667m);
        this.f10675k = atomicReferenceArray;
        this.f10674j = i2;
        this.f10671g = (long) (i2 - 1);
        this.f10669e.lazySet(0);
    }

    /* renamed from: a */
    public boolean mo10752a(T t) {
        if (t != null) {
            AtomicReferenceArray<Object> atomicReferenceArray = this.f10673i;
            long j = this.f10669e.get();
            int i = this.f10672h;
            int i2 = ((int) j) & i;
            if (j < this.f10671g) {
                atomicReferenceArray.lazySet(i2, t);
                this.f10669e.lazySet(j + 1);
                return true;
            }
            long j2 = ((long) this.f10670f) + j;
            if (atomicReferenceArray.get(((int) j2) & i) == null) {
                this.f10671g = j2 - 1;
                atomicReferenceArray.lazySet(i2, t);
                this.f10669e.lazySet(j + 1);
                return true;
            }
            long j3 = j + 1;
            if (atomicReferenceArray.get(((int) j3) & i) == null) {
                atomicReferenceArray.lazySet(i2, t);
                this.f10669e.lazySet(j3);
                return true;
            }
            long j4 = (long) i;
            AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
            this.f10673i = atomicReferenceArray2;
            this.f10671g = (j4 + j) - 1;
            atomicReferenceArray2.lazySet(i2, t);
            atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
            atomicReferenceArray.lazySet(i2, f10668n);
            this.f10669e.lazySet(j3);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    public void clear() {
        while (true) {
            if (mo10751g() == null && isEmpty()) {
                return;
            }
        }
    }

    /* renamed from: g */
    public T mo10751g() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f10675k;
        long j = this.f10676l.get();
        int i = this.f10674j;
        int i2 = ((int) j) & i;
        T t = atomicReferenceArray.get(i2);
        boolean z = t == f10668n;
        if (t != null && !z) {
            atomicReferenceArray.lazySet(i2, null);
            this.f10676l.lazySet(j + 1);
            return t;
        } else if (!z) {
            return null;
        } else {
            int i3 = i + 1;
            AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i3);
            atomicReferenceArray.lazySet(i3, null);
            this.f10675k = atomicReferenceArray2;
            T t2 = atomicReferenceArray2.get(i2);
            if (t2 != null) {
                atomicReferenceArray2.lazySet(i2, null);
                this.f10676l.lazySet(j + 1);
            }
            return t2;
        }
    }

    public boolean isEmpty() {
        return this.f10669e.get() == this.f10676l.get();
    }
}
