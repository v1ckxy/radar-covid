package p124p.p150h.p159i;

import android.util.Base64;
import java.util.List;
import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: p.h.i.a */
public final class C1354a {

    /* renamed from: a */
    public final String f4064a;

    /* renamed from: b */
    public final String f4065b;

    /* renamed from: c */
    public final String f4066c;

    /* renamed from: d */
    public final List<List<byte[]>> f4067d;

    /* renamed from: e */
    public final int f4068e;

    /* renamed from: f */
    public final String f4069f;

    public C1354a(String str, String str2, String str3, List<List<byte[]>> list) {
        if (str != null) {
            this.f4064a = str;
            if (str2 != null) {
                this.f4065b = str2;
                if (str3 != null) {
                    this.f4066c = str3;
                    if (list != null) {
                        this.f4067d = list;
                        this.f4068e = 0;
                        StringBuilder sb = new StringBuilder(str);
                        String str4 = "-";
                        sb.append(str4);
                        sb.append(this.f4065b);
                        sb.append(str4);
                        sb.append(this.f4066c);
                        this.f4069f = sb.toString();
                        return;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder a = C1965a.m4756a("FontRequest {mProviderAuthority: ");
        a.append(this.f4064a);
        a.append(", mProviderPackage: ");
        a.append(this.f4065b);
        a.append(", mQuery: ");
        a.append(this.f4066c);
        a.append(", mCertificates:");
        sb.append(a.toString());
        for (int i = 0; i < this.f4067d.size(); i++) {
            sb.append(" [");
            List list = (List) this.f4067d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append(Objects.ARRAY_END);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("mCertificatesArray: ");
        sb2.append(this.f4068e);
        sb.append(sb2.toString());
        return sb.toString();
    }
}
