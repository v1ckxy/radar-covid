package p410v.p411m0.p416g;

import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.p401r.p403c.C4638h;
import p392u.p409w.C4681g;
import p410v.p411m0.C4737b;
import p423w.C4897j;

/* renamed from: v.m0.g.e */
public final class C4796e {

    /* renamed from: a */
    public static final C4897j f11378a = C4897j.f11665i.mo11511c("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b */
    public static final String[] f11379b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: c */
    public static final String[] f11380c = new String[64];

    /* renamed from: d */
    public static final String[] f11381d;

    /* renamed from: e */
    public static final C4796e f11382e = new C4796e();

    static {
        String str;
        String[] strArr = new String[256];
        int i = 0;
        while (i < 256) {
            String binaryString = Integer.toBinaryString(i);
            C4638h.m10270a((Object) binaryString, "Integer.toBinaryString(it)");
            String a = C4737b.m10455a("%8s", binaryString);
            if (a != null) {
                String replace = a.replace(' ', '0');
                C4638h.m10270a((Object) replace, "(this as java.lang.Strin…replace(oldChar, newChar)");
                strArr[i] = replace;
                i++;
            } else {
                C4638h.m10271a("$this$replace");
                throw null;
            }
        }
        f11381d = strArr;
        String[] strArr2 = f11380c;
        strArr2[0] = Objects.EMPTY_STRING;
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i2 = 0;
        while (true) {
            str = "|PADDED";
            if (i2 >= 1) {
                break;
            }
            int i3 = iArr[i2];
            String[] strArr3 = f11380c;
            int i4 = i3 | 8;
            String str2 = strArr3[i3];
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str);
            strArr3[i4] = sb.toString();
            i2++;
        }
        String[] strArr4 = f11380c;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i5 = 0; i5 < 3; i5++) {
            int i6 = iArr2[i5];
            for (int i7 = 0; i7 < 1; i7++) {
                int i8 = iArr[i7];
                String[] strArr5 = f11380c;
                int i9 = i8 | i6;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(f11380c[i8]);
                String str3 = "|";
                sb2.append(str3);
                sb2.append(f11380c[i6]);
                strArr5[i9] = sb2.toString();
                String[] strArr6 = f11380c;
                int i10 = i9 | 8;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(f11380c[i8]);
                sb3.append(str3);
                strArr6[i10] = C1965a.m4754a(sb3, f11380c[i6], str);
            }
        }
        int length = f11380c.length;
        for (int i11 = 0; i11 < length; i11++) {
            String[] strArr7 = f11380c;
            if (strArr7[i11] == null) {
                strArr7[i11] = f11381d[i11];
            }
        }
    }

    /* renamed from: a */
    public final String mo11205a(boolean z, int i, int i2, int i3, int i4) {
        String str;
        String str2;
        String str3;
        String str4;
        String[] strArr = f11379b;
        String a = i3 < strArr.length ? strArr[i3] : C4737b.m10455a("0x%02x", Integer.valueOf(i3));
        if (i4 == 0) {
            str = Objects.EMPTY_STRING;
        } else {
            if (!(i3 == 2 || i3 == 3)) {
                if (i3 == 4 || i3 == 6) {
                    str = i4 == 1 ? "ACK" : f11381d[i4];
                } else if (!(i3 == 7 || i3 == 8)) {
                    String[] strArr2 = f11380c;
                    if (i4 < strArr2.length) {
                        str2 = strArr2[i4];
                        if (str2 == null) {
                            C4638h.m10269a();
                            throw null;
                        }
                    } else {
                        str2 = f11381d[i4];
                    }
                    if (i3 == 5 && (i4 & 4) != 0) {
                        str4 = "HEADERS";
                        str3 = "PUSH_PROMISE";
                    } else if (i3 != 0 || (i4 & 32) == 0) {
                        str = str2;
                    } else {
                        str4 = "PRIORITY";
                        str3 = "COMPRESSED";
                    }
                    str = C4681g.m10312a(str2, str4, str3, false, 4);
                }
            }
            str = f11381d[i4];
        }
        return C4737b.m10455a("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), a, str);
    }
}
