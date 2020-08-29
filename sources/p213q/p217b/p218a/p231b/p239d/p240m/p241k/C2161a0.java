package p213q.p217b.p218a.p231b.p239d.p240m.p241k;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.C2115b;
import p213q.p217b.p218a.p231b.p239d.p240m.C2133a.C2134a;
import p213q.p217b.p218a.p231b.p239d.p240m.C2150d.C2151a;
import p213q.p217b.p218a.p231b.p239d.p240m.C2150d.C2152b;
import p213q.p217b.p218a.p231b.p239d.p240m.p241k.C2169e.C2171b;
import p213q.p217b.p218a.p231b.p239d.p242n.C2228c;
import p213q.p217b.p218a.p231b.p267j.C3217a;
import p213q.p217b.p218a.p231b.p267j.C3232c;
import p213q.p217b.p218a.p231b.p267j.C3235f;
import p213q.p217b.p218a.p231b.p267j.p268b.C3222e;
import p213q.p217b.p218a.p231b.p267j.p268b.C3231n;

/* renamed from: q.b.a.b.d.m.k.a0 */
public final class C2161a0 extends C3222e implements C2151a, C2152b {

    /* renamed from: h */
    public static C2134a<? extends C3235f, C3217a> f6022h = C3232c.f8097c;

    /* renamed from: a */
    public final Context f6023a;

    /* renamed from: b */
    public final Handler f6024b;

    /* renamed from: c */
    public final C2134a<? extends C3235f, C3217a> f6025c;

    /* renamed from: d */
    public Set<Scope> f6026d;

    /* renamed from: e */
    public C2228c f6027e;

    /* renamed from: f */
    public C3235f f6028f;

    /* renamed from: g */
    public C2163b0 f6029g;

    public C2161a0(Context context, Handler handler, C2228c cVar) {
        C2134a<? extends C3235f, C3217a> aVar = f6022h;
        this.f6023a = context;
        this.f6024b = handler;
        C1061o.m2525b(cVar, (Object) "ClientSettings must not be null");
        this.f6027e = cVar;
        this.f6026d = cVar.f6156b;
        this.f6025c = aVar;
    }

    /* renamed from: a */
    public final void mo7144a(int i) {
        this.f6028f.mo7136i();
    }

    /* renamed from: a */
    public final void mo7145a(C2115b bVar) {
        ((C2171b) this.f6029g).mo7188b(bVar);
    }

    /* renamed from: a */
    public final void mo7146a(C3231n nVar) {
        this.f6024b.post(new C2166c0(this, nVar));
    }

    /* renamed from: b */
    public final void mo7147b(Bundle bundle) {
        this.f6028f.mo8894a(this);
    }
}
