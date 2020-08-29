package p410v.p411m0.p414e;

import java.net.ProtocolException;
import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.p401r.p403c.C4638h;
import p392u.p409w.C4681g;
import p410v.C4694c0;

/* renamed from: v.m0.e.j */
public final class C4781j {

    /* renamed from: a */
    public final C4694c0 f11313a;

    /* renamed from: b */
    public final int f11314b;

    /* renamed from: c */
    public final String f11315c;

    public C4781j(C4694c0 c0Var, int i, String str) {
        if (c0Var == null) {
            C4638h.m10271a("protocol");
            throw null;
        } else if (str != null) {
            this.f11313a = c0Var;
            this.f11314b = i;
            this.f11315c = str;
        } else {
            C4638h.m10271a("message");
            throw null;
        }
    }

    /* renamed from: a */
    public static final C4781j m10600a(String str) {
        C4694c0 c0Var;
        String str2;
        if (str != null) {
            int i = 9;
            String str3 = "Unexpected status line: ";
            if (C4681g.m10327b(str, "HTTP/1.", false, 2)) {
                if (str.length() < 9 || str.charAt(8) != ' ') {
                    throw new ProtocolException(C1965a.m4751a(str3, str));
                }
                int charAt = str.charAt(7) - '0';
                if (charAt == 0) {
                    c0Var = C4694c0.HTTP_1_0;
                } else if (charAt == 1) {
                    c0Var = C4694c0.HTTP_1_1;
                } else {
                    throw new ProtocolException(C1965a.m4751a(str3, str));
                }
            } else if (C4681g.m10327b(str, "ICY ", false, 2)) {
                c0Var = C4694c0.HTTP_1_0;
                i = 4;
            } else {
                throw new ProtocolException(C1965a.m4751a(str3, str));
            }
            int i2 = i + 3;
            if (str.length() >= i2) {
                try {
                    String substring = str.substring(i, i2);
                    C4638h.m10270a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    int parseInt = Integer.parseInt(substring);
                    if (str.length() <= i2) {
                        str2 = Objects.EMPTY_STRING;
                    } else if (str.charAt(i2) == ' ') {
                        str2 = str.substring(i + 4);
                        C4638h.m10270a((Object) str2, "(this as java.lang.String).substring(startIndex)");
                    } else {
                        throw new ProtocolException(C1965a.m4751a(str3, str));
                    }
                    return new C4781j(c0Var, parseInt, str2);
                } catch (NumberFormatException unused) {
                    throw new ProtocolException(C1965a.m4751a(str3, str));
                }
            } else {
                throw new ProtocolException(C1965a.m4751a(str3, str));
            }
        } else {
            C4638h.m10271a("statusLine");
            throw null;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f11313a == C4694c0.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f11314b);
        sb.append(' ');
        sb.append(this.f11315c);
        String sb2 = sb.toString();
        C4638h.m10270a((Object) sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
