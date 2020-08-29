package p119o.p120a.p121a;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: o.a.a.i */
public class C0902i<E> {

    /* renamed from: a */
    public static final AtomicReferenceFieldUpdater f2491a = AtomicReferenceFieldUpdater.newUpdater(C0902i.class, Object.class, "_cur");
    public volatile Object _cur;

    public C0902i(boolean z) {
        this._cur = new C0903j(8, z);
    }

    /* renamed from: a */
    public final void mo4179a() {
        while (true) {
            C0903j jVar = (C0903j) this._cur;
            if (!jVar.mo4184a()) {
                f2491a.compareAndSet(this, jVar, jVar.mo4186c());
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo4180a(E e) {
        while (true) {
            C0903j jVar = (C0903j) this._cur;
            int a = jVar.mo4183a(e);
            if (a == 0) {
                return true;
            }
            if (a == 1) {
                f2491a.compareAndSet(this, jVar, jVar.mo4186c());
            } else if (a == 2) {
                return false;
            }
        }
    }

    /* renamed from: b */
    public final int mo4181b() {
        long j = ((C0903j) this._cur)._state;
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j) >> 0))) & 1073741823;
    }

    /* renamed from: c */
    public final E mo4182c() {
        while (true) {
            C0903j jVar = (C0903j) this._cur;
            E d = jVar.mo4187d();
            if (d != C0903j.f2494g) {
                return d;
            }
            f2491a.compareAndSet(this, jVar, jVar.mo4186c());
        }
    }
}
