package p213q.p217b.p218a.p231b.p239d.p242n;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Set;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.C2121e;
import p213q.p217b.p218a.p231b.p239d.p240m.C2133a.C2145f;
import p213q.p217b.p218a.p231b.p239d.p240m.p241k.C2167d;
import p213q.p217b.p218a.p231b.p239d.p240m.p241k.C2186k;
import p213q.p217b.p218a.p231b.p239d.p242n.C2214b.C2215a;
import p213q.p217b.p218a.p231b.p239d.p242n.C2214b.C2216b;

/* renamed from: q.b.a.b.d.n.e */
public abstract class C2234e<T extends IInterface> extends C2214b<T> implements C2145f {

    /* renamed from: x */
    public final Set<Scope> f6181x;

    /* renamed from: y */
    public final Account f6182y;

    public C2234e(Context context, Looper looper, int i, C2228c cVar, C2167d dVar, C2186k kVar) {
        C2215a aVar;
        C2216b bVar;
        C2236f a = C2236f.m5089a(context);
        C2121e eVar = C2121e.f5993d;
        C1061o.m2524b(dVar);
        C2167d dVar2 = dVar;
        C1061o.m2524b(kVar);
        C2186k kVar2 = kVar;
        if (dVar2 == null) {
            aVar = null;
        } else {
            aVar = new C2268t(dVar2);
        }
        if (kVar2 == null) {
            bVar = null;
        } else {
            bVar = new C2267s(kVar2);
        }
        super(context, looper, a, eVar, i, aVar, bVar, cVar.f6160f);
        this.f6182y = cVar.f6155a;
        Set<Scope> set = cVar.f6157c;
        for (Scope contains : set) {
            if (!set.contains(contains)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.f6181x = set;
    }

    /* renamed from: b */
    public Set<Scope> mo7129b() {
        return mo7237j() ? this.f6181x : Collections.emptySet();
    }

    /* renamed from: m */
    public final Account mo7239m() {
        return this.f6182y;
    }

    /* renamed from: p */
    public final Set<Scope> mo7242p() {
        return this.f6181x;
    }
}
