package p213q.p217b.p218a.p231b.p259h.p261b;

import android.content.SharedPreferences.Editor;
import androidx.recyclerview.widget.RecyclerView;
import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: q.b.a.b.h.b.a4 */
public final class C2896a4 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ int f7121e;

    /* renamed from: f */
    public final /* synthetic */ String f7122f;

    /* renamed from: g */
    public final /* synthetic */ Object f7123g;

    /* renamed from: h */
    public final /* synthetic */ Object f7124h;

    /* renamed from: i */
    public final /* synthetic */ Object f7125i;

    /* renamed from: j */
    public final /* synthetic */ C2908b4 f7126j;

    public C2896a4(C2908b4 b4Var, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f7126j = b4Var;
        this.f7121e = i;
        this.f7122f = str;
        this.f7123g = obj;
        this.f7124h = obj2;
        this.f7125i = obj3;
    }

    public final void run() {
        Editor editor;
        char c;
        C2908b4 b4Var;
        C3063o4 m = this.f7126j.f7133a.mo8470m();
        if (m.mo8849r()) {
            C2908b4 b4Var2 = this.f7126j;
            if (b4Var2.f7150c == 0) {
                if (b4Var2.f7133a.f7338g.mo8584o()) {
                    b4Var = this.f7126j;
                    C3010ja jaVar = b4Var.f7133a.f7337f;
                    c = 'C';
                } else {
                    b4Var = this.f7126j;
                    C3010ja jaVar2 = b4Var.f7133a.f7337f;
                    c = 'c';
                }
                b4Var.f7150c = c;
            }
            C2908b4 b4Var3 = this.f7126j;
            if (b4Var3.f7151d < 0) {
                b4Var3.f7133a.f7338g.mo8583n();
                b4Var3.f7151d = 31000;
            }
            char charAt = "01VDIWEA?".charAt(this.f7121e);
            C2908b4 b4Var4 = this.f7126j;
            char c2 = b4Var4.f7150c;
            long j = b4Var4.f7151d;
            boolean z = true;
            String a = C2908b4.m6747a(true, this.f7122f, this.f7123g, this.f7124h, this.f7125i);
            StringBuilder sb = new StringBuilder(C1965a.m4743a(a, 24));
            sb.append("2");
            sb.append(charAt);
            sb.append(c2);
            sb.append(j);
            sb.append(":");
            sb.append(a);
            String sb2 = sb.toString();
            if (sb2.length() > 1024) {
                sb2 = this.f7122f.substring(0, 1024);
            }
            C3096r4 r4Var = m.f7621d;
            r4Var.f7822e.mo8279c();
            if (r4Var.f7822e.mo8667s().getLong(r4Var.f7818a, 0) == 0) {
                r4Var.mo8703a();
            }
            if (sb2 == null) {
                sb2 = Objects.EMPTY_STRING;
            }
            long j2 = r4Var.f7822e.mo8667s().getLong(r4Var.f7819b, 0);
            if (j2 <= 0) {
                editor = r4Var.f7822e.mo8667s().edit();
                editor.putString(r4Var.f7820c, sb2);
                editor.putLong(r4Var.f7819b, 1);
            } else {
                long j3 = j2 + 1;
                if ((r4Var.f7822e.mo8287k().mo8814t().nextLong() & RecyclerView.FOREVER_NS) >= RecyclerView.FOREVER_NS / j3) {
                    z = false;
                }
                editor = r4Var.f7822e.mo8667s().edit();
                if (z) {
                    editor.putString(r4Var.f7820c, sb2);
                }
                editor.putLong(r4Var.f7819b, j3);
            }
            editor.apply();
            return;
        }
        this.f7126j.mo8303a(6, "Persisted config not initialized. Not logging error/warn");
    }
}
