package p213q.p217b.p218a.p231b.p239d;

import java.util.concurrent.Callable;

/* renamed from: q.b.a.b.d.w */
public final /* synthetic */ class C2299w implements Callable {

    /* renamed from: e */
    public final boolean f6277e;

    /* renamed from: f */
    public final String f6278f;

    /* renamed from: g */
    public final C2298v f6279g;

    public C2299w(boolean z, String str, C2298v vVar) {
        this.f6277e = z;
        this.f6278f = str;
        this.f6279g = vVar;
    }

    public final Object call() {
        boolean z = this.f6277e;
        String str = this.f6278f;
        C2298v vVar = this.f6279g;
        boolean z2 = true;
        if (z || !C2297u.m5367b(str, vVar, true, false).f5989a) {
            z2 = false;
        }
        return C2120d0.m4908a(str, vVar, z, z2);
    }
}
