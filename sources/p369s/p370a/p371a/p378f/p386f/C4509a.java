package p369s.p370a.p371a.p378f.p386f;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p369s.p370a.p371a.p378f.p381c.C4475c;

/* renamed from: s.a.a.f.f.a */
public final class C4509a<E> extends AtomicReferenceArray<E> implements C4475c<E> {

    /* renamed from: j */
    public static final Integer f10661j = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);

    /* renamed from: e */
    public final int f10662e = (length() - 1);

    /* renamed from: f */
    public final AtomicLong f10663f = new AtomicLong();

    /* renamed from: g */
    public long f10664g;

    /* renamed from: h */
    public final AtomicLong f10665h = new AtomicLong();

    /* renamed from: i */
    public final int f10666i;

    public C4509a(int i) {
        super(C2286e.m5341g(i));
        this.f10666i = Math.min(i / 4, f10661j.intValue());
    }

    /* renamed from: a */
    public boolean mo10752a(E e) {
        if (e != null) {
            int i = this.f10662e;
            long j = this.f10663f.get();
            int i2 = ((int) j) & i;
            if (j >= this.f10664g) {
                long j2 = ((long) this.f10666i) + j;
                if (get(i & ((int) j2)) == null) {
                    this.f10664g = j2;
                } else if (get(i2) != null) {
                    return false;
                }
            }
            lazySet(i2, e);
            this.f10663f.lazySet(j + 1);
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
    public E mo10751g() {
        long j = this.f10665h.get();
        int i = ((int) j) & this.f10662e;
        E e = get(i);
        if (e == null) {
            return null;
        }
        this.f10665h.lazySet(j + 1);
        lazySet(i, null);
        return e;
    }

    public boolean isEmpty() {
        return this.f10663f.get() == this.f10665h.get();
    }
}
