package p213q.p217b.p218a.p231b.p259h.p261b;

import android.content.SharedPreferences.Editor;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p246q.C2284c;

/* renamed from: q.b.a.b.h.b.r4 */
public final class C3096r4 {

    /* renamed from: a */
    public final String f7818a;

    /* renamed from: b */
    public final String f7819b;

    /* renamed from: c */
    public final String f7820c;

    /* renamed from: d */
    public final long f7821d;

    /* renamed from: e */
    public final /* synthetic */ C3063o4 f7822e;

    public /* synthetic */ C3096r4(C3063o4 o4Var, String str, long j, C3052n4 n4Var) {
        this.f7822e = o4Var;
        C1061o.m2528b(str);
        C1061o.m2507a(j > 0);
        this.f7818a = String.valueOf(str).concat(":start");
        this.f7819b = String.valueOf(str).concat(":count");
        this.f7820c = String.valueOf(str).concat(":value");
        this.f7821d = j;
    }

    /* renamed from: a */
    public final void mo8703a() {
        this.f7822e.mo8279c();
        if (((C2284c) this.f7822e.f7133a.f7345n) != null) {
            long currentTimeMillis = System.currentTimeMillis();
            Editor edit = this.f7822e.mo8667s().edit();
            edit.remove(this.f7819b);
            edit.remove(this.f7820c);
            edit.putLong(this.f7818a, currentTimeMillis);
            edit.apply();
            return;
        }
        throw null;
    }
}
