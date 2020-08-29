package p392u.p395p;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.p395p.p396j.C4590a;
import p392u.p395p.p397k.p398a.C4596d;
import p392u.p401r.p403c.C4638h;

/* renamed from: u.p.i */
public final class C4589i<T> implements C4580d<T>, C4596d {

    /* renamed from: f */
    public static final AtomicReferenceFieldUpdater<C4589i<?>, Object> f10793f = AtomicReferenceFieldUpdater.newUpdater(C4589i.class, Object.class, "result");

    /* renamed from: e */
    public final C4580d<T> f10794e;
    public volatile Object result;

    public C4589i(C4580d<? super T> dVar) {
        if (dVar != null) {
            C4590a aVar = C4590a.UNDECIDED;
            this.f10794e = dVar;
            this.result = aVar;
            return;
        }
        C4638h.m10271a("delegate");
        throw null;
    }

    /* renamed from: a */
    public void mo4217a(Object obj) {
        while (true) {
            Object obj2 = this.result;
            C4590a aVar = C4590a.UNDECIDED;
            if (obj2 != aVar) {
                C4590a aVar2 = C4590a.COROUTINE_SUSPENDED;
                if (obj2 != aVar2) {
                    throw new IllegalStateException("Already resumed");
                } else if (f10793f.compareAndSet(this, aVar2, C4590a.RESUMED)) {
                    this.f10794e.mo4217a(obj);
                    return;
                }
            } else if (f10793f.compareAndSet(this, aVar, obj)) {
                return;
            }
        }
    }

    /* renamed from: b */
    public C4583f mo4219b() {
        return this.f10794e.mo4219b();
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("SafeContinuation for ");
        a.append(this.f10794e);
        return a.toString();
    }
}
