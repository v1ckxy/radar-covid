package p213q.p217b.p218a.p231b.p259h.p261b;

import android.content.SharedPreferences.Editor;
import p124p.p126b.p127k.C1061o;

/* renamed from: q.b.a.b.h.b.q4 */
public final class C3085q4 {

    /* renamed from: a */
    public final String f7787a;

    /* renamed from: b */
    public final boolean f7788b;

    /* renamed from: c */
    public boolean f7789c;

    /* renamed from: d */
    public boolean f7790d;

    /* renamed from: e */
    public final /* synthetic */ C3063o4 f7791e;

    public C3085q4(C3063o4 o4Var, String str, boolean z) {
        this.f7791e = o4Var;
        C1061o.m2528b(str);
        this.f7787a = str;
        this.f7788b = z;
    }

    /* renamed from: a */
    public final void mo8696a(boolean z) {
        Editor edit = this.f7791e.mo8667s().edit();
        edit.putBoolean(this.f7787a, z);
        edit.apply();
        this.f7790d = z;
    }

    /* renamed from: a */
    public final boolean mo8697a() {
        if (!this.f7789c) {
            this.f7789c = true;
            this.f7790d = this.f7791e.mo8667s().getBoolean(this.f7787a, this.f7788b);
        }
        return this.f7790d;
    }
}
