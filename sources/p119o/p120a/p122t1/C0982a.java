package p119o.p120a.p122t1;

import android.os.Handler;
import android.os.Looper;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.p395p.C4583f;
import p392u.p401r.p403c.C4638h;

/* renamed from: o.a.t1.a */
public final class C0982a extends C0983b {
    public volatile C0982a _immediate;

    /* renamed from: f */
    public final Handler f2595f;

    /* renamed from: g */
    public final String f2596g;

    /* renamed from: h */
    public final boolean f2597h;

    public C0982a(Handler handler, String str, boolean z) {
        C0982a aVar = null;
        super(null);
        this.f2595f = handler;
        this.f2596g = str;
        this.f2597h = z;
        if (z) {
            aVar = this;
        }
        this._immediate = aVar;
        if (this._immediate == null) {
            this._immediate = new C0982a(this.f2595f, this.f2596g, true);
        }
    }

    /* renamed from: a */
    public void mo4301a(C4583f fVar, Runnable runnable) {
        this.f2595f.post(runnable);
    }

    /* renamed from: b */
    public boolean mo4320b(C4583f fVar) {
        return !this.f2597h || (C4638h.m10272a((Object) Looper.myLooper(), (Object) this.f2595f.getLooper()) ^ true);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0982a) && ((C0982a) obj).f2595f == this.f2595f;
    }

    public int hashCode() {
        return System.identityHashCode(this.f2595f);
    }

    public String toString() {
        String str = this.f2596g;
        return str != null ? this.f2597h ? C1965a.m4754a(new StringBuilder(), this.f2596g, " [immediate]") : str : this.f2595f.toString();
    }
}
