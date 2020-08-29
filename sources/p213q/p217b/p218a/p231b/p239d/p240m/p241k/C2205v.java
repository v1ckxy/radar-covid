package p213q.p217b.p218a.p231b.p239d.p240m.p241k;

import android.util.Log;
import p213q.p217b.p218a.p231b.p239d.C2115b;
import p213q.p217b.p218a.p231b.p239d.p240m.p241k.C2169e.C2170a;
import p213q.p217b.p218a.p231b.p239d.p240m.p241k.C2169e.C2171b;
import p213q.p217b.p218a.p231b.p239d.p242n.C2241h;

/* renamed from: q.b.a.b.d.m.k.v */
public final class C2205v implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ C2115b f6106e;

    /* renamed from: f */
    public final /* synthetic */ C2171b f6107f;

    public C2205v(C2171b bVar, C2115b bVar2) {
        this.f6107f = bVar;
        this.f6106e = bVar2;
    }

    public final void run() {
        C2115b bVar;
        C2171b bVar2 = this.f6107f;
        C2170a aVar = (C2170a) C2169e.this.f6052i.get(bVar2.f6072b);
        if (aVar != null) {
            if (this.f6106e.mo7093c()) {
                C2171b bVar3 = this.f6107f;
                bVar3.f6075e = true;
                if (bVar3.f6071a.mo7137j()) {
                    C2171b bVar4 = this.f6107f;
                    if (bVar4.f6075e) {
                        C2241h hVar = bVar4.f6073c;
                        if (hVar != null) {
                            bVar4.f6071a.mo7127a(hVar, bVar4.f6074d);
                        }
                    }
                    return;
                }
                try {
                    this.f6107f.f6071a.mo7127a(null, this.f6107f.f6071a.mo7129b());
                } catch (SecurityException e) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
                    this.f6107f.f6071a.mo7124a("Failed to get service from broker.");
                    bVar = new C2115b(10);
                }
            } else {
                bVar = this.f6106e;
                aVar.mo7171a(bVar, null);
            }
        }
    }
}
