package p410v;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.C4557i;
import p392u.p401r.p403c.C4636f;
import p392u.p401r.p403c.C4638h;
import p392u.p409w.C4681g;

/* renamed from: v.j */
public final class C4722j {

    /* renamed from: b */
    public static final Comparator<String> f11086b = new C4723a();

    /* renamed from: c */
    public static final Map<String, C4722j> f11087c = new LinkedHashMap();

    /* renamed from: d */
    public static final C4722j f11088d = C4724b.m10417a(f11104t, "SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);

    /* renamed from: e */
    public static final C4722j f11089e = C4724b.m10417a(f11104t, "TLS_RSA_WITH_AES_128_CBC_SHA", 47);

    /* renamed from: f */
    public static final C4722j f11090f = C4724b.m10417a(f11104t, "TLS_RSA_WITH_AES_256_CBC_SHA", 53);

    /* renamed from: g */
    public static final C4722j f11091g = C4724b.m10417a(f11104t, "TLS_RSA_WITH_AES_128_GCM_SHA256", 156);

    /* renamed from: h */
    public static final C4722j f11092h = C4724b.m10417a(f11104t, "TLS_RSA_WITH_AES_256_GCM_SHA384", 157);

    /* renamed from: i */
    public static final C4722j f11093i = C4724b.m10417a(f11104t, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);

    /* renamed from: j */
    public static final C4722j f11094j = C4724b.m10417a(f11104t, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);

    /* renamed from: k */
    public static final C4722j f11095k = C4724b.m10417a(f11104t, "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);

    /* renamed from: l */
    public static final C4722j f11096l = C4724b.m10417a(f11104t, "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);

    /* renamed from: m */
    public static final C4722j f11097m = C4724b.m10417a(f11104t, "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);

    /* renamed from: n */
    public static final C4722j f11098n = C4724b.m10417a(f11104t, "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);

    /* renamed from: o */
    public static final C4722j f11099o = C4724b.m10417a(f11104t, "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);

    /* renamed from: p */
    public static final C4722j f11100p = C4724b.m10417a(f11104t, "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);

    /* renamed from: q */
    public static final C4722j f11101q = C4724b.m10417a(f11104t, "TLS_AES_128_GCM_SHA256", 4865);

    /* renamed from: r */
    public static final C4722j f11102r = C4724b.m10417a(f11104t, "TLS_AES_256_GCM_SHA384", 4866);

    /* renamed from: s */
    public static final C4722j f11103s = C4724b.m10417a(f11104t, "TLS_CHACHA20_POLY1305_SHA256", 4867);

    /* renamed from: t */
    public static final C4724b f11104t = new C4724b(null);

    /* renamed from: a */
    public final String f11105a;

    /* renamed from: v.j$a */
    public static final class C4723a implements Comparator<String> {
        public int compare(Object obj, Object obj2) {
            String str = (String) obj;
            String str2 = (String) obj2;
            if (str == null) {
                C4638h.m10271a("a");
                throw null;
            } else if (str2 != null) {
                int i = 4;
                int min = Math.min(str.length(), str2.length());
                while (true) {
                    if (i < min) {
                        char charAt = str.charAt(i);
                        char charAt2 = str2.charAt(i);
                        if (charAt == charAt2) {
                            i++;
                        } else if (charAt < charAt2) {
                            return -1;
                        }
                    } else {
                        int length = str.length();
                        int length2 = str2.length();
                        if (length == length2) {
                            return 0;
                        }
                        if (length < length2) {
                            return -1;
                        }
                    }
                }
                return 1;
            } else {
                C4638h.m10271a("b");
                throw null;
            }
        }
    }

    /* renamed from: v.j$b */
    public static final class C4724b {
        public /* synthetic */ C4724b(C4636f fVar) {
        }

        /* renamed from: a */
        public static final /* synthetic */ C4722j m10417a(C4724b bVar, String str, int i) {
            if (bVar != null) {
                C4722j jVar = new C4722j(str, null);
                C4722j.f11087c.put(str, jVar);
                return jVar;
            }
            throw null;
        }

        /* renamed from: b */
        public final String mo11047b(String str) {
            StringBuilder sb;
            String str2 = "TLS_";
            String str3 = "null cannot be cast to non-null type java.lang.String";
            String str4 = "(this as java.lang.String).substring(startIndex)";
            String str5 = "SSL_";
            if (C4681g.m10327b(str, str2, false, 2)) {
                sb = C1965a.m4756a(str5);
                if (str == null) {
                    throw new C4557i(str3);
                }
            } else if (!C4681g.m10327b(str, str5, false, 2)) {
                return str;
            } else {
                sb = C1965a.m4756a(str2);
                if (str == null) {
                    throw new C4557i(str3);
                }
            }
            String substring = str.substring(4);
            C4638h.m10270a((Object) substring, str4);
            sb.append(substring);
            return sb.toString();
        }

        /* renamed from: a */
        public final synchronized C4722j mo11046a(String str) {
            C4722j jVar;
            String str2 = "javaName";
            if (str != null) {
                jVar = (C4722j) C4722j.f11087c.get(str);
                if (jVar == null) {
                    jVar = (C4722j) C4722j.f11087c.get(mo11047b(str));
                    if (jVar == null) {
                        jVar = new C4722j(str, null);
                    }
                    C4722j.f11087c.put(str, jVar);
                }
            } else {
                C4638h.m10271a(str2);
                throw null;
            }
            return jVar;
        }
    }

    static {
        C4724b.m10417a(f11104t, "SSL_RSA_WITH_NULL_MD5", 1);
        C4724b.m10417a(f11104t, "SSL_RSA_WITH_NULL_SHA", 2);
        C4724b.m10417a(f11104t, "SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
        C4724b.m10417a(f11104t, "SSL_RSA_WITH_RC4_128_MD5", 4);
        C4724b.m10417a(f11104t, "SSL_RSA_WITH_RC4_128_SHA", 5);
        C4724b.m10417a(f11104t, "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
        C4724b.m10417a(f11104t, "SSL_RSA_WITH_DES_CBC_SHA", 9);
        C4724b.m10417a(f11104t, "SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
        C4724b.m10417a(f11104t, "SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
        C4724b.m10417a(f11104t, "SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
        C4724b.m10417a(f11104t, "SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
        C4724b.m10417a(f11104t, "SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
        C4724b.m10417a(f11104t, "SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
        C4724b.m10417a(f11104t, "SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
        C4724b.m10417a(f11104t, "SSL_DH_anon_WITH_RC4_128_MD5", 24);
        C4724b.m10417a(f11104t, "SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
        C4724b.m10417a(f11104t, "SSL_DH_anon_WITH_DES_CBC_SHA", 26);
        C4724b.m10417a(f11104t, "SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
        C4724b.m10417a(f11104t, "TLS_KRB5_WITH_DES_CBC_SHA", 30);
        C4724b.m10417a(f11104t, "TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);
        C4724b.m10417a(f11104t, "TLS_KRB5_WITH_RC4_128_SHA", 32);
        C4724b.m10417a(f11104t, "TLS_KRB5_WITH_DES_CBC_MD5", 34);
        C4724b.m10417a(f11104t, "TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
        C4724b.m10417a(f11104t, "TLS_KRB5_WITH_RC4_128_MD5", 36);
        C4724b.m10417a(f11104t, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
        C4724b.m10417a(f11104t, "TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
        C4724b.m10417a(f11104t, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
        C4724b.m10417a(f11104t, "TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
        C4724b.m10417a(f11104t, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
        C4724b.m10417a(f11104t, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
        C4724b.m10417a(f11104t, "TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
        C4724b.m10417a(f11104t, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
        C4724b.m10417a(f11104t, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
        C4724b.m10417a(f11104t, "TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
        C4724b.m10417a(f11104t, "TLS_RSA_WITH_NULL_SHA256", 59);
        C4724b.m10417a(f11104t, "TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
        C4724b.m10417a(f11104t, "TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
        C4724b.m10417a(f11104t, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
        C4724b.m10417a(f11104t, "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
        C4724b.m10417a(f11104t, "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
        C4724b.m10417a(f11104t, "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
        C4724b.m10417a(f11104t, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
        C4724b.m10417a(f11104t, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
        C4724b.m10417a(f11104t, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
        C4724b.m10417a(f11104t, "TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
        C4724b.m10417a(f11104t, "TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
        C4724b.m10417a(f11104t, "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);
        C4724b.m10417a(f11104t, "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);
        C4724b.m10417a(f11104t, "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);
        C4724b.m10417a(f11104t, "TLS_PSK_WITH_RC4_128_SHA", 138);
        C4724b.m10417a(f11104t, "TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);
        C4724b.m10417a(f11104t, "TLS_PSK_WITH_AES_128_CBC_SHA", 140);
        C4724b.m10417a(f11104t, "TLS_PSK_WITH_AES_256_CBC_SHA", 141);
        C4724b.m10417a(f11104t, "TLS_RSA_WITH_SEED_CBC_SHA", 150);
        C4724b.m10417a(f11104t, "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);
        C4724b.m10417a(f11104t, "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);
        C4724b.m10417a(f11104t, "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);
        C4724b.m10417a(f11104t, "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);
        C4724b.m10417a(f11104t, "TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);
        C4724b.m10417a(f11104t, "TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);
        C4724b.m10417a(f11104t, "TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);
        C4724b.m10417a(f11104t, "TLS_FALLBACK_SCSV", 22016);
        C4724b.m10417a(f11104t, "TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);
        C4724b.m10417a(f11104t, "TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);
        C4724b.m10417a(f11104t, "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);
        C4724b.m10417a(f11104t, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);
        C4724b.m10417a(f11104t, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);
        C4724b.m10417a(f11104t, "TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);
        C4724b.m10417a(f11104t, "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);
        C4724b.m10417a(f11104t, "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
        C4724b.m10417a(f11104t, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
        C4724b.m10417a(f11104t, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
        C4724b.m10417a(f11104t, "TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
        C4724b.m10417a(f11104t, "TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
        C4724b.m10417a(f11104t, "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
        C4724b.m10417a(f11104t, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
        C4724b.m10417a(f11104t, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
        C4724b.m10417a(f11104t, "TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
        C4724b.m10417a(f11104t, "TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
        C4724b.m10417a(f11104t, "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
        C4724b.m10417a(f11104t, "TLS_ECDH_anon_WITH_NULL_SHA", 49173);
        C4724b.m10417a(f11104t, "TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
        C4724b.m10417a(f11104t, "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
        C4724b.m10417a(f11104t, "TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
        C4724b.m10417a(f11104t, "TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
        C4724b.m10417a(f11104t, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
        C4724b.m10417a(f11104t, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
        C4724b.m10417a(f11104t, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
        C4724b.m10417a(f11104t, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
        C4724b.m10417a(f11104t, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
        C4724b.m10417a(f11104t, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
        C4724b.m10417a(f11104t, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
        C4724b.m10417a(f11104t, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
        C4724b.m10417a(f11104t, "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);
        C4724b.m10417a(f11104t, "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);
        C4724b.m10417a(f11104t, "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);
        C4724b.m10417a(f11104t, "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);
        C4724b.m10417a(f11104t, "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);
        C4724b.m10417a(f11104t, "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);
        C4724b.m10417a(f11104t, "TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52394);
        C4724b.m10417a(f11104t, "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 52396);
        C4724b.m10417a(f11104t, "TLS_AES_128_CCM_SHA256", 4868);
        C4724b.m10417a(f11104t, "TLS_AES_128_CCM_8_SHA256", 4869);
    }

    public /* synthetic */ C4722j(String str, C4636f fVar) {
        this.f11105a = str;
    }

    public String toString() {
        return this.f11105a;
    }
}
