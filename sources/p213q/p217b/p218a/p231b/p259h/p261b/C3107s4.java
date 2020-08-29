package p213q.p217b.p218a.p231b.p259h.p261b;

import android.content.SharedPreferences.Editor;
import p124p.p126b.p127k.C1061o;

/* renamed from: q.b.a.b.h.b.s4 */
public final class C3107s4 {

    /* renamed from: a */
    public final String f7837a;

    /* renamed from: b */
    public final long f7838b;

    /* renamed from: c */
    public boolean f7839c;

    /* renamed from: d */
    public long f7840d;

    /* renamed from: e */
    public final /* synthetic */ C3063o4 f7841e;

    public C3107s4(C3063o4 o4Var, String str, long j) {
        this.f7841e = o4Var;
        C1061o.m2528b(str);
        this.f7837a = str;
        this.f7838b = j;
    }

    /* renamed from: a */
    public final long mo8708a() {
        if (!this.f7839c) {
            this.f7839c = true;
            this.f7840d = this.f7841e.mo8667s().getLong(this.f7837a, this.f7838b);
        }
        return this.f7840d;
    }

    /* renamed from: a */
    public final void mo8709a(long j) {
        Editor edit = this.f7841e.mo8667s().edit();
        edit.putLong(this.f7837a, j);
        edit.apply();
        this.f7840d = j;
    }
}
