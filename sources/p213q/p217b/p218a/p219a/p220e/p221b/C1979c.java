package p213q.p217b.p218a.p219a.p220e.p221b;

import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: q.b.a.a.e.b.c */
public final class C1979c extends C1971a {

    /* renamed from: a */
    public final Integer f5648a;

    /* renamed from: b */
    public final String f5649b;

    /* renamed from: c */
    public final String f5650c;

    /* renamed from: d */
    public final String f5651d;

    /* renamed from: e */
    public final String f5652e;

    /* renamed from: f */
    public final String f5653f;

    /* renamed from: g */
    public final String f5654g;

    /* renamed from: h */
    public final String f5655h;

    public /* synthetic */ C1979c(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f5648a = num;
        this.f5649b = str;
        this.f5650c = str2;
        this.f5651d = str3;
        this.f5652e = str4;
        this.f5653f = str5;
        this.f5654g = str6;
        this.f5655h = str7;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1971a)) {
            return false;
        }
        Integer num = this.f5648a;
        if (num != null ? num.equals(((C1979c) obj).f5648a) : ((C1979c) obj).f5648a == null) {
            String str = this.f5649b;
            if (str != null ? str.equals(((C1979c) obj).f5649b) : ((C1979c) obj).f5649b == null) {
                String str2 = this.f5650c;
                if (str2 != null ? str2.equals(((C1979c) obj).f5650c) : ((C1979c) obj).f5650c == null) {
                    String str3 = this.f5651d;
                    if (str3 != null ? str3.equals(((C1979c) obj).f5651d) : ((C1979c) obj).f5651d == null) {
                        String str4 = this.f5652e;
                        if (str4 != null ? str4.equals(((C1979c) obj).f5652e) : ((C1979c) obj).f5652e == null) {
                            String str5 = this.f5653f;
                            if (str5 != null ? str5.equals(((C1979c) obj).f5653f) : ((C1979c) obj).f5653f == null) {
                                String str6 = this.f5654g;
                                if (str6 != null ? str6.equals(((C1979c) obj).f5654g) : ((C1979c) obj).f5654g == null) {
                                    String str7 = this.f5655h;
                                    String str8 = ((C1979c) obj).f5655h;
                                    if (str7 != null) {
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        z = false;
        return z;
    }

    public int hashCode() {
        Integer num = this.f5648a;
        int i = 0;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f5649b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f5650c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f5651d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f5652e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f5653f;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f5654g;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f5655h;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode7 ^ i;
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("AndroidClientInfo{sdkVersion=");
        a.append(this.f5648a);
        a.append(", model=");
        a.append(this.f5649b);
        a.append(", hardware=");
        a.append(this.f5650c);
        a.append(", device=");
        a.append(this.f5651d);
        a.append(", product=");
        a.append(this.f5652e);
        a.append(", osBuild=");
        a.append(this.f5653f);
        a.append(", manufacturer=");
        a.append(this.f5654g);
        a.append(", fingerprint=");
        return C1965a.m4754a(a, this.f5655h, Objects.ARRAY_END);
    }
}
