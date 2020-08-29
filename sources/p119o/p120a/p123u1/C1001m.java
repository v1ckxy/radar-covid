package p119o.p120a.p123u1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: o.a.u1.m */
public final class C1001m {

    /* renamed from: b */
    public static final AtomicReferenceFieldUpdater f2648b;

    /* renamed from: c */
    public static final AtomicIntegerFieldUpdater f2649c;

    /* renamed from: d */
    public static final AtomicIntegerFieldUpdater f2650d;

    /* renamed from: e */
    public static final AtomicIntegerFieldUpdater f2651e;

    /* renamed from: a */
    public final AtomicReferenceArray<C0996h> f2652a = new AtomicReferenceArray<>(128);
    public volatile int blockingTasksInBuffer = 0;
    public volatile int consumerIndex = 0;
    public volatile Object lastScheduledTask = null;
    public volatile int producerIndex = 0;

    static {
        Class<C1001m> cls = C1001m.class;
        f2648b = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "lastScheduledTask");
        f2649c = AtomicIntegerFieldUpdater.newUpdater(cls, "producerIndex");
        f2650d = AtomicIntegerFieldUpdater.newUpdater(cls, "consumerIndex");
        f2651e = AtomicIntegerFieldUpdater.newUpdater(cls, "blockingTasksInBuffer");
    }

    /* renamed from: a */
    public final int mo4357a() {
        return this.producerIndex - this.consumerIndex;
    }

    /* renamed from: a */
    public final long mo4358a(C1001m mVar, boolean z) {
        C0996h hVar;
        do {
            hVar = (C0996h) mVar.lastScheduledTask;
            if (hVar == null) {
                return -2;
            }
            if (z) {
                boolean z2 = true;
                if (hVar.f2641f.mo4354k() != 1) {
                    z2 = false;
                }
                if (!z2) {
                    return -2;
                }
            }
            if (((C0994f) C0999k.f2647e) != null) {
                long nanoTime = System.nanoTime() - hVar.f2640e;
                long j = C0999k.f2643a;
                if (nanoTime < j) {
                    return j - nanoTime;
                }
            } else {
                throw null;
            }
        } while (!f2648b.compareAndSet(mVar, hVar, null));
        mo4360a(hVar, false);
        return -1;
    }

    /* renamed from: a */
    public final C0996h mo4359a(C0996h hVar) {
        boolean z = true;
        if (hVar.f2641f.mo4354k() != 1) {
            z = false;
        }
        if (z) {
            f2651e.incrementAndGet(this);
        }
        if (mo4357a() == 127) {
            return hVar;
        }
        int i = this.producerIndex & 127;
        while (this.f2652a.get(i) != null) {
            Thread.yield();
        }
        this.f2652a.lazySet(i, hVar);
        f2649c.incrementAndGet(this);
        return null;
    }

    /* renamed from: a */
    public final C0996h mo4360a(C0996h hVar, boolean z) {
        if (z) {
            return mo4359a(hVar);
        }
        C0996h hVar2 = (C0996h) f2648b.getAndSet(this, hVar);
        if (hVar2 != null) {
            return mo4359a(hVar2);
        }
        return null;
    }

    /* renamed from: b */
    public final int mo4361b() {
        return this.lastScheduledTask != null ? mo4357a() + 1 : mo4357a();
    }

    /* renamed from: c */
    public final C0996h mo4362c() {
        C0996h hVar = (C0996h) f2648b.getAndSet(this, null);
        return hVar != null ? hVar : mo4363d();
    }

    /* renamed from: d */
    public final C0996h mo4363d() {
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            int i2 = i & 127;
            if (f2650d.compareAndSet(this, i, i + 1)) {
                C0996h hVar = (C0996h) this.f2652a.getAndSet(i2, null);
                if (hVar != null) {
                    boolean z = true;
                    if (hVar.f2641f.mo4354k() != 1) {
                        z = false;
                    }
                    if (z) {
                        f2651e.decrementAndGet(this);
                    }
                    return hVar;
                }
            }
        }
    }
}
