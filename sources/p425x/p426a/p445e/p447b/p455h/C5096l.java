package p425x.p426a.p445e.p447b.p455h;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: x.a.e.b.h.l */
public final class C5096l implements C5111v {

    /* renamed from: c */
    public static final Map<String, C5096l> f12199c;

    /* renamed from: a */
    public final int f12200a;

    /* renamed from: b */
    public final String f12201b;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(m11566a("SHA-256", 32, 16, 67), new C5096l(16777217, "WOTSP_SHA2-256_W16"));
        hashMap.put(m11566a("SHA-512", 64, 16, 131), new C5096l(33554434, "WOTSP_SHA2-512_W16"));
        hashMap.put(m11566a("SHAKE128", 32, 16, 67), new C5096l(50331651, "WOTSP_SHAKE128_W16"));
        hashMap.put(m11566a("SHAKE256", 64, 16, 131), new C5096l(67108868, "WOTSP_SHAKE256_W16"));
        f12199c = Collections.unmodifiableMap(hashMap);
    }

    public C5096l(int i, String str) {
        this.f12200a = i;
        this.f12201b = str;
    }

    /* renamed from: a */
    public static String m11566a(String str, int i, int i2, int i3) {
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
            return sb.toString();
        }
        throw new NullPointerException("algorithmName == null");
    }

    /* renamed from: b */
    public static C5096l m11567b(String str, int i, int i2, int i3) {
        if (str != null) {
            return (C5096l) f12199c.get(m11566a(str, i, i2, i3));
        }
        throw new NullPointerException("algorithmName == null");
    }

    /* renamed from: a */
    public int mo11741a() {
        return this.f12200a;
    }

    public String toString() {
        return this.f12201b;
    }
}
