package p213q.p217b.p218a.p231b.p239d.p242n;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.net.Uri;
import android.net.Uri.Builder;
import java.util.Arrays;
import p124p.p126b.p127k.C1061o;

/* renamed from: q.b.a.b.d.n.f */
public abstract class C2236f {

    /* renamed from: a */
    public static final Object f6189a = new Object();

    /* renamed from: b */
    public static C2236f f6190b;

    /* renamed from: q.b.a.b.d.n.f$a */
    public static final class C2237a {

        /* renamed from: f */
        public static final Uri f6191f = new Builder().scheme("content").authority("com.google.android.gms.chimera").build();

        /* renamed from: a */
        public final String f6192a;

        /* renamed from: b */
        public final String f6193b;

        /* renamed from: c */
        public final ComponentName f6194c = null;

        /* renamed from: d */
        public final int f6195d;

        /* renamed from: e */
        public final boolean f6196e;

        public C2237a(String str, String str2, int i, boolean z) {
            C1061o.m2528b(str);
            this.f6192a = str;
            C1061o.m2528b(str2);
            this.f6193b = str2;
            this.f6195d = i;
            this.f6196e = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2237a)) {
                return false;
            }
            C2237a aVar = (C2237a) obj;
            return C1061o.m2546c((Object) this.f6192a, (Object) aVar.f6192a) && C1061o.m2546c((Object) this.f6193b, (Object) aVar.f6193b) && C1061o.m2546c((Object) this.f6194c, (Object) aVar.f6194c) && this.f6195d == aVar.f6195d && this.f6196e == aVar.f6196e;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f6192a, this.f6193b, this.f6194c, Integer.valueOf(this.f6195d), Boolean.valueOf(this.f6196e)});
        }

        public final String toString() {
            String str = this.f6192a;
            if (str != null) {
                return str;
            }
            C1061o.m2524b(this.f6194c);
            return this.f6194c.flattenToString();
        }
    }

    /* renamed from: a */
    public static int m5088a() {
        return 129;
    }

    /* renamed from: a */
    public static C2236f m5089a(Context context) {
        synchronized (f6189a) {
            if (f6190b == null) {
                f6190b = new C2235e0(context.getApplicationContext());
            }
        }
        return f6190b;
    }

    /* renamed from: a */
    public abstract boolean mo7267a(C2237a aVar, ServiceConnection serviceConnection, String str);

    /* renamed from: b */
    public abstract void mo7268b(C2237a aVar, ServiceConnection serviceConnection, String str);
}
