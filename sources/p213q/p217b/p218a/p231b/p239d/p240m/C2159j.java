package p213q.p217b.p218a.p231b.p239d.p240m;

import p213q.p217b.p218a.p231b.p239d.C2119d;

/* renamed from: q.b.a.b.d.m.j */
public final class C2159j extends UnsupportedOperationException {

    /* renamed from: e */
    public final C2119d f6021e;

    public C2159j(C2119d dVar) {
        this.f6021e = dVar;
    }

    public final String getMessage() {
        String valueOf = String.valueOf(this.f6021e);
        StringBuilder sb = new StringBuilder(valueOf.length() + 8);
        sb.append("Missing ");
        sb.append(valueOf);
        return sb.toString();
    }
}
