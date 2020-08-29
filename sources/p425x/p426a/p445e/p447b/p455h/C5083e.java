package p425x.p426a.p445e.p447b.p455h;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: x.a.e.b.h.e */
public final class C5083e implements C5111v {

    /* renamed from: c */
    public static final Map<String, C5083e> f12171c;

    /* renamed from: a */
    public final int f12172a;

    /* renamed from: b */
    public final String f12173b;

    static {
        HashMap hashMap = new HashMap();
        String str = "SHA-256";
        hashMap.put(m11546a(str, 32, 16, 67, 10), new C5083e(1, "XMSS_SHA2_10_256"));
        hashMap.put(m11546a(str, 32, 16, 67, 16), new C5083e(2, "XMSS_SHA2_16_256"));
        hashMap.put(m11546a(str, 32, 16, 67, 20), new C5083e(3, "XMSS_SHA2_20_256"));
        String str2 = "SHA-512";
        hashMap.put(m11546a(str2, 64, 16, 131, 10), new C5083e(4, "XMSS_SHA2_10_512"));
        hashMap.put(m11546a(str2, 64, 16, 131, 16), new C5083e(5, "XMSS_SHA2_16_512"));
        hashMap.put(m11546a(str2, 64, 16, 131, 20), new C5083e(6, "XMSS_SHA2_20_512"));
        String str3 = "SHAKE128";
        hashMap.put(m11546a(str3, 32, 16, 67, 10), new C5083e(7, "XMSS_SHAKE_10_256"));
        hashMap.put(m11546a(str3, 32, 16, 67, 16), new C5083e(8, "XMSS_SHAKE_16_256"));
        hashMap.put(m11546a(str3, 32, 16, 67, 20), new C5083e(9, "XMSS_SHAKE_20_256"));
        String str4 = "SHAKE256";
        hashMap.put(m11546a(str4, 64, 16, 131, 10), new C5083e(10, "XMSS_SHAKE_10_512"));
        hashMap.put(m11546a(str4, 64, 16, 131, 16), new C5083e(11, "XMSS_SHAKE_16_512"));
        hashMap.put(m11546a(str4, 64, 16, 131, 20), new C5083e(12, "XMSS_SHAKE_20_512"));
        f12171c = Collections.unmodifiableMap(hashMap);
    }

    public C5083e(int i, String str) {
        this.f12172a = i;
        this.f12173b = str;
    }

    /* renamed from: a */
    public static String m11546a(String str, int i, int i2, int i3, int i4) {
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
            return sb.toString();
        }
        throw new NullPointerException("algorithmName == null");
    }

    /* renamed from: b */
    public static C5083e m11547b(String str, int i, int i2, int i3, int i4) {
        if (str != null) {
            return (C5083e) f12171c.get(m11546a(str, i, i2, i3, i4));
        }
        throw new NullPointerException("algorithmName == null");
    }

    /* renamed from: a */
    public int mo11741a() {
        return this.f12172a;
    }

    public String toString() {
        return this.f12173b;
    }
}
