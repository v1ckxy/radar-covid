package p213q.p217b.p218a.p219a.p220e;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import p116io.jsonwebtoken.lang.Objects;
import p116io.jsonwebtoken.lang.Strings;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p219a.C1966a;
import p213q.p217b.p218a.p219a.p222f.C2011d;

/* renamed from: q.b.a.a.e.a */
public final class C1970a implements C2011d {

    /* renamed from: c */
    public static final String f5635c = C1061o.m2529b("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");

    /* renamed from: d */
    public static final String f5636d = C1061o.m2529b("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");

    /* renamed from: e */
    public static final String f5637e = C1061o.m2529b("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");

    /* renamed from: f */
    public static final Set<C1966a> f5638f = Collections.unmodifiableSet(new HashSet(Arrays.asList(new C1966a[]{new C1966a("proto"), new C1966a("json")})));

    /* renamed from: a */
    public final String f5639a;

    /* renamed from: b */
    public final String f5640b;

    static {
        new C1970a(f5635c, null);
        new C1970a(f5636d, f5637e);
    }

    public C1970a(String str, String str2) {
        this.f5639a = str;
        this.f5640b = str2;
    }

    /* renamed from: a */
    public static C1970a m4764a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote(Strings.WINDOWS_FOLDER_SEPARATOR), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new C1970a(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    /* renamed from: a */
    public Set<C1966a> mo6965a() {
        return f5638f;
    }

    /* renamed from: b */
    public String mo6966b() {
        return "cct";
    }

    /* renamed from: c */
    public byte[] mo6967c() {
        if (this.f5640b == null && this.f5639a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f5639a;
        objArr[2] = Strings.WINDOWS_FOLDER_SEPARATOR;
        String str = this.f5640b;
        if (str == null) {
            str = Objects.EMPTY_STRING;
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }
}
