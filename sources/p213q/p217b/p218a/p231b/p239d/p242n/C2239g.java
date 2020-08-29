package p213q.p217b.p218a.p231b.p239d.p242n;

import android.util.Log;
import p124p.p126b.p127k.C1061o;

/* renamed from: q.b.a.b.d.n.g */
public final class C2239g {

    /* renamed from: a */
    public final String f6198a;

    /* renamed from: b */
    public final String f6199b;

    public C2239g(String str, String str2) {
        C1061o.m2525b(str, (Object) "log tag cannot be null");
        C1061o.m2509a(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, Integer.valueOf(23));
        this.f6198a = str;
        if (str2 == null || str2.length() <= 0) {
            this.f6199b = null;
        } else {
            this.f6199b = str2;
        }
    }

    /* renamed from: a */
    public final boolean mo7273a(int i) {
        return Log.isLoggable(this.f6198a, i);
    }
}
