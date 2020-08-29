package p213q.p217b.p218a.p231b.p259h.p261b;

import android.content.SharedPreferences.Editor;
import p124p.p126b.p127k.C1061o;

/* renamed from: q.b.a.b.h.b.u4 */
public final class C3129u4 {

    /* renamed from: a */
    public final String f7893a;

    /* renamed from: b */
    public boolean f7894b;

    /* renamed from: c */
    public String f7895c;

    /* renamed from: d */
    public final /* synthetic */ C3063o4 f7896d;

    public C3129u4(C3063o4 o4Var, String str) {
        this.f7896d = o4Var;
        C1061o.m2528b(str);
        this.f7893a = str;
    }

    /* renamed from: a */
    public final String mo8749a() {
        if (!this.f7894b) {
            this.f7894b = true;
            this.f7895c = this.f7896d.mo8667s().getString(this.f7893a, null);
        }
        return this.f7895c;
    }

    /* renamed from: a */
    public final void mo8750a(String str) {
        if (this.f7896d.f7133a.f7338g.mo8574a(C3069p.f7759x0) || !C3156w9.m7416c(str, this.f7895c)) {
            Editor edit = this.f7896d.mo8667s().edit();
            edit.putString(this.f7893a, str);
            edit.apply();
            this.f7895c = str;
        }
    }
}
