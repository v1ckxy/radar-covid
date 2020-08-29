package p425x.p426a.p445e.p447b.p455h;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: x.a.e.b.h.d */
public final class C5082d implements C5111v {

    /* renamed from: c */
    public static final Map<String, C5082d> f12168c;

    /* renamed from: a */
    public final int f12169a;

    /* renamed from: b */
    public final String f12170b;

    static {
        HashMap hashMap = new HashMap();
        C1965a.m4758a(1, "XMSSMT_SHA2_20/2_256", hashMap, m11543a("SHA-256", 32, 16, 67, 20, 2));
        C1965a.m4758a(2, "XMSSMT_SHA2_20/4_256", hashMap, m11543a("SHA-256", 32, 16, 67, 20, 4));
        C1965a.m4758a(3, "XMSSMT_SHA2_40/2_256", hashMap, m11543a("SHA-256", 32, 16, 67, 40, 2));
        C1965a.m4758a(4, "XMSSMT_SHA2_40/4_256", hashMap, m11543a("SHA-256", 32, 16, 67, 40, 2));
        C1965a.m4758a(5, "XMSSMT_SHA2_40/8_256", hashMap, m11543a("SHA-256", 32, 16, 67, 40, 4));
        C1965a.m4758a(6, "XMSSMT_SHA2_60/3_256", hashMap, m11543a("SHA-256", 32, 16, 67, 60, 8));
        C1965a.m4758a(7, "XMSSMT_SHA2_60/6_256", hashMap, m11543a("SHA-256", 32, 16, 67, 60, 6));
        C1965a.m4758a(8, "XMSSMT_SHA2_60/12_256", hashMap, m11543a("SHA-256", 32, 16, 67, 60, 12));
        C1965a.m4758a(9, "XMSSMT_SHA2_20/2_512", hashMap, m11543a("SHA-512", 64, 16, 131, 20, 2));
        C1965a.m4758a(10, "XMSSMT_SHA2_20/4_512", hashMap, m11543a("SHA-512", 64, 16, 131, 20, 4));
        C1965a.m4758a(11, "XMSSMT_SHA2_40/2_512", hashMap, m11543a("SHA-512", 64, 16, 131, 40, 2));
        C1965a.m4758a(12, "XMSSMT_SHA2_40/4_512", hashMap, m11543a("SHA-512", 64, 16, 131, 40, 4));
        C1965a.m4758a(13, "XMSSMT_SHA2_40/8_512", hashMap, m11543a("SHA-512", 64, 16, 131, 40, 8));
        C1965a.m4758a(14, "XMSSMT_SHA2_60/3_512", hashMap, m11543a("SHA-512", 64, 16, 131, 60, 3));
        C1965a.m4758a(15, "XMSSMT_SHA2_60/6_512", hashMap, m11543a("SHA-512", 64, 16, 131, 60, 6));
        C1965a.m4758a(16, "XMSSMT_SHA2_60/12_512", hashMap, m11543a("SHA-512", 64, 16, 131, 60, 12));
        C1965a.m4758a(17, "XMSSMT_SHAKE_20/2_256", hashMap, m11543a("SHAKE128", 32, 16, 67, 20, 2));
        C1965a.m4758a(18, "XMSSMT_SHAKE_20/4_256", hashMap, m11543a("SHAKE128", 32, 16, 67, 20, 4));
        C1965a.m4758a(19, "XMSSMT_SHAKE_40/2_256", hashMap, m11543a("SHAKE128", 32, 16, 67, 40, 2));
        C1965a.m4758a(20, "XMSSMT_SHAKE_40/4_256", hashMap, m11543a("SHAKE128", 32, 16, 67, 40, 4));
        C1965a.m4758a(21, "XMSSMT_SHAKE_40/8_256", hashMap, m11543a("SHAKE128", 32, 16, 67, 40, 8));
        C1965a.m4758a(22, "XMSSMT_SHAKE_60/3_256", hashMap, m11543a("SHAKE128", 32, 16, 67, 60, 3));
        C1965a.m4758a(23, "XMSSMT_SHAKE_60/6_256", hashMap, m11543a("SHAKE128", 32, 16, 67, 60, 6));
        C1965a.m4758a(24, "XMSSMT_SHAKE_60/12_256", hashMap, m11543a("SHAKE128", 32, 16, 67, 60, 12));
        C1965a.m4758a(25, "XMSSMT_SHAKE_20/2_512", hashMap, m11543a("SHAKE256", 64, 16, 131, 20, 2));
        C1965a.m4758a(26, "XMSSMT_SHAKE_20/4_512", hashMap, m11543a("SHAKE256", 64, 16, 131, 20, 4));
        C1965a.m4758a(27, "XMSSMT_SHAKE_40/2_512", hashMap, m11543a("SHAKE256", 64, 16, 131, 40, 2));
        C1965a.m4758a(28, "XMSSMT_SHAKE_40/4_512", hashMap, m11543a("SHAKE256", 64, 16, 131, 40, 4));
        C1965a.m4758a(29, "XMSSMT_SHAKE_40/8_512", hashMap, m11543a("SHAKE256", 64, 16, 131, 40, 8));
        C1965a.m4758a(30, "XMSSMT_SHAKE_60/3_512", hashMap, m11543a("SHAKE256", 64, 16, 131, 60, 3));
        C1965a.m4758a(31, "XMSSMT_SHAKE_60/6_512", hashMap, m11543a("SHAKE256", 64, 16, 131, 60, 6));
        hashMap.put(m11543a("SHAKE256", 64, 16, 131, 60, 12), new C5082d(32, "XMSSMT_SHAKE_60/12_512"));
        f12168c = Collections.unmodifiableMap(hashMap);
    }

    public C5082d(int i, String str) {
        this.f12169a = i;
        this.f12170b = str;
    }

    /* renamed from: a */
    public static String m11543a(String str, int i, int i2, int i3, int i4, int i5) {
        if (str != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            String str2 = "-";
            sb.append(str2);
            sb.append(i);
            sb.append(str2);
            sb.append(i2);
            sb.append(str2);
            sb.append(i3);
            sb.append(str2);
            sb.append(i4);
            sb.append(str2);
            sb.append(i5);
            return sb.toString();
        }
        throw new NullPointerException("algorithmName == null");
    }

    /* renamed from: b */
    public static C5082d m11544b(String str, int i, int i2, int i3, int i4, int i5) {
        if (str != null) {
            return (C5082d) f12168c.get(m11543a(str, i, i2, i3, i4, i5));
        }
        throw new NullPointerException("algorithmName == null");
    }

    /* renamed from: a */
    public int mo11741a() {
        return this.f12169a;
    }

    public String toString() {
        return this.f12170b;
    }
}
