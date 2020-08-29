package p369s.p370a.p371a.p378f.p383e.p385b;

import java.util.concurrent.atomic.AtomicInteger;
import p369s.p370a.p371a.p374b.C4444k;
import p369s.p370a.p371a.p378f.p381c.C4473a;

/* renamed from: s.a.a.f.e.b.g */
public final class C4501g<T> extends AtomicInteger implements C4473a<T>, Runnable {

    /* renamed from: e */
    public final C4444k<? super T> f10636e;

    /* renamed from: f */
    public final T f10637f;

    public C4501g(C4444k<? super T> kVar, T t) {
        this.f10636e = kVar;
        this.f10637f = t;
    }

    /* renamed from: a */
    public int mo10742a(int i) {
        if ((i & 1) == 0) {
            return 0;
        }
        lazySet(1);
        return 1;
    }

    /* renamed from: a */
    public boolean mo10779a(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public void clear() {
        lazySet(3);
    }

    /* renamed from: f */
    public void mo10714f() {
        set(3);
    }

    /* renamed from: g */
    public T mo10781g() {
        if (get() != 1) {
            return null;
        }
        lazySet(3);
        return this.f10637f;
    }

    public boolean isEmpty() {
        return get() != 1;
    }

    public void run() {
        if (get() == 0 && compareAndSet(0, 2)) {
            this.f10636e.mo10725b(this.f10637f);
            if (get() == 2) {
                lazySet(3);
                this.f10636e.mo10722a();
            }
        }
    }
}
