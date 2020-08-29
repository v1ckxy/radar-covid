package p124p.p182q;

import java.util.concurrent.atomic.AtomicBoolean;
import p124p.p188t.p189a.p190f.C1684f;

/* renamed from: p.q.k */
public abstract class C1648k {

    /* renamed from: a */
    public final AtomicBoolean f4859a = new AtomicBoolean(false);

    /* renamed from: b */
    public final C1638g f4860b;

    /* renamed from: c */
    public volatile C1684f f4861c;

    public C1648k(C1638g gVar) {
        this.f4860b = gVar;
    }

    /* renamed from: a */
    public C1684f mo6441a() {
        this.f4860b.mo6414a();
        if (this.f4859a.compareAndSet(false, true)) {
            if (this.f4861c == null) {
                this.f4861c = this.f4860b.mo6413a(mo6443b());
            }
            return this.f4861c;
        }
        return this.f4860b.mo6413a(mo6443b());
    }

    /* renamed from: a */
    public void mo6442a(C1684f fVar) {
        if (fVar == this.f4861c) {
            this.f4859a.set(false);
        }
    }

    /* renamed from: b */
    public abstract String mo6443b();
}
