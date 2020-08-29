package p213q.p217b.p218a.p231b.p239d.p242n;

import android.content.Context;
import android.util.SparseIntArray;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.C2124f;
import p213q.p217b.p218a.p231b.p239d.p240m.C2133a.C2145f;

/* renamed from: q.b.a.b.d.n.u */
public final class C2269u {

    /* renamed from: a */
    public final SparseIntArray f6230a = new SparseIntArray();

    /* renamed from: b */
    public C2124f f6231b;

    public C2269u(C2124f fVar) {
        C1061o.m2524b(fVar);
        this.f6231b = fVar;
    }

    /* renamed from: a */
    public final int mo7289a(Context context, C2145f fVar) {
        C1061o.m2524b(context);
        C1061o.m2524b(fVar);
        int i = 0;
        if (!fVar.mo7130c()) {
            return 0;
        }
        int d = fVar.mo7131d();
        int i2 = this.f6230a.get(d, -1);
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= this.f6230a.size()) {
                i = i2;
                break;
            }
            int keyAt = this.f6230a.keyAt(i3);
            if (keyAt > d && this.f6230a.get(keyAt) == 0) {
                break;
            }
            i3++;
        }
        if (i == -1) {
            i = this.f6231b.mo7110a(context, d);
        }
        this.f6230a.put(d, i);
        return i;
    }
}
