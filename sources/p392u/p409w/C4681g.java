package p392u.p409w;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p116io.jsonwebtoken.lang.Objects;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p392u.p393n.C4568g;
import p392u.p401r.p402b.C4618l;
import p392u.p401r.p403c.C4638h;
import p392u.p406t.C4653a;
import p392u.p406t.C4655c;
import p392u.p406t.C4656d;
import p392u.p408v.C4669d;
import p392u.p408v.C4671f;

/* renamed from: u.w.g */
public class C4681g extends C4678d {
    /* renamed from: a */
    public static /* synthetic */ int m10304a(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3) {
        if ((i3 & 16) != 0) {
            z2 = false;
        }
        return m10303a(charSequence, charSequence2, i, i2, z, z2);
    }

    /* renamed from: a */
    public static /* synthetic */ int m10306a(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m10305a(charSequence, str, i, z);
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m10316a(CharSequence charSequence, char c, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        if (charSequence != null) {
            return m10302a(charSequence, c, 0, z, 2) >= 0;
        }
        C4638h.m10271a("$this$contains");
        throw null;
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m10321a(String str, String str2, int i, boolean z, int i2) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m10320a(str, str2, i, z);
    }

    /* renamed from: a */
    public static final boolean m10322a(String str, String str2, boolean z) {
        if (str == null) {
            return str2 == null;
        }
        return !z ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m10325b(java.lang.CharSequence r4) {
        /*
            if (r4 == 0) goto L_0x0044
            int r0 = r4.length()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0042
            u.t.c r0 = new u.t.c
            int r3 = r4.length()
            int r3 = r3 + -1
            r0.<init>(r1, r3)
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0024
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0024
        L_0x0022:
            r4 = r2
            goto L_0x0040
        L_0x0024:
            java.util.Iterator r0 = r0.iterator()
        L_0x0028:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0022
            r3 = r0
            u.n.l r3 = (p392u.p393n.C4573l) r3
            int r3 = r3.mo10900b()
            char r3 = r4.charAt(r3)
            boolean r3 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5257a(r3)
            if (r3 != 0) goto L_0x0028
            r4 = r1
        L_0x0040:
            if (r4 == 0) goto L_0x0043
        L_0x0042:
            r1 = r2
        L_0x0043:
            return r1
        L_0x0044:
            java.lang.String r4 = "$this$isBlank"
            p392u.p401r.p403c.C4638h.m10271a(r4)
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p392u.p409w.C4681g.m10325b(java.lang.CharSequence):boolean");
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m10327b(String str, String str2, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m10326b(str, str2, z);
    }

    /* renamed from: c */
    public static final CharSequence m10328c(CharSequence charSequence) {
        if (charSequence != null) {
            int length = charSequence.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean a = C2286e.m5257a(charSequence.charAt(!z ? i : length));
                if (!z) {
                    if (!a) {
                        z = true;
                    } else {
                        i++;
                    }
                } else if (!a) {
                    break;
                } else {
                    length--;
                }
            }
            return charSequence.subSequence(i, length + 1);
        }
        C4638h.m10271a("$this$trim");
        throw null;
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m10318a(CharSequence charSequence, CharSequence charSequence2, boolean z, int i) {
        boolean z2 = (i & 2) != 0 ? false : z;
        if (charSequence == null) {
            C4638h.m10271a("$this$contains");
            throw null;
        } else if (charSequence2 != null) {
            if (!(charSequence2 instanceof String)) {
                if (m10304a(charSequence, charSequence2, 0, charSequence.length(), z2, false, 16) < 0) {
                    return false;
                }
            } else if (m10306a(charSequence, (String) charSequence2, 0, z2, 2) < 0) {
                return false;
            }
            return true;
        } else {
            C4638h.m10271a("other");
            throw null;
        }
    }

    /* renamed from: b */
    public static /* synthetic */ int m10324b(CharSequence charSequence, char c, int i, boolean z, int i2) {
        boolean z2;
        if ((i2 & 2) != 0) {
            i = m10301a(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        if (charSequence == null) {
            C4638h.m10271a("$this$lastIndexOf");
            throw null;
        } else if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c, i);
        } else {
            char[] cArr = {c};
            if (z || !(charSequence instanceof String)) {
                int a = m10301a(charSequence);
                if (i > a) {
                    i = a;
                }
                while (i >= 0) {
                    char charAt = charSequence.charAt(i);
                    int i3 = 0;
                    while (true) {
                        if (i3 >= 1) {
                            z2 = false;
                            break;
                        } else if (C2286e.m5258a(cArr[i3], charAt, z)) {
                            z2 = true;
                            break;
                        } else {
                            i3++;
                        }
                    }
                    if (z2) {
                        return i;
                    }
                    i--;
                }
                return -1;
            }
            return ((String) charSequence).lastIndexOf(C2286e.m5139a(cArr), i);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m10323a(String str, String str2, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        if (str == null) {
            C4638h.m10271a("$this$endsWith");
            throw null;
        } else if (str2 == null) {
            C4638h.m10271a("suffix");
            throw null;
        } else if (!z) {
            return str.endsWith(str2);
        } else {
            return m10319a(str, str.length() - str2.length(), str2, 0, str2.length(), true);
        }
    }

    /* renamed from: a */
    public static final int m10301a(CharSequence charSequence) {
        if (charSequence != null) {
            return charSequence.length() - 1;
        }
        C4638h.m10271a("$this$lastIndex");
        throw null;
    }

    /* renamed from: b */
    public static final boolean m10326b(String str, String str2, boolean z) {
        if (str == null) {
            C4638h.m10271a("$this$startsWith");
            throw null;
        } else if (str2 == null) {
            C4638h.m10271a("prefix");
            throw null;
        } else if (!z) {
            return str.startsWith(str2);
        } else {
            return m10319a(str, 0, str2, 0, str2.length(), z);
        }
    }

    /* renamed from: a */
    public static final int m10305a(CharSequence charSequence, String str, int i, boolean z) {
        if (charSequence == null) {
            C4638h.m10271a("$this$indexOf");
            throw null;
        } else if (str == null) {
            C4638h.m10271a("string");
            throw null;
        } else if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        } else {
            return m10304a(charSequence, str, i, charSequence.length(), z, false, 16);
        }
    }

    /* renamed from: a */
    public static final int m10303a(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        C4653a aVar;
        if (!z2) {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i2 = length;
            }
            aVar = new C4655c(i, i2);
        } else {
            int a = m10301a(charSequence);
            if (i > a) {
                i = a;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            aVar = C4656d.m10289a(i, i2);
        }
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int i3 = aVar.f10839e;
            int i4 = aVar.f10840f;
            int i5 = aVar.f10841g;
            if (i5 < 0 ? i3 >= i4 : i3 <= i4) {
                while (true) {
                    if (!m10317a(charSequence2, 0, charSequence, i3, charSequence2.length(), z)) {
                        if (i3 == i4) {
                            break;
                        }
                        i3 += i5;
                    } else {
                        return i3;
                    }
                }
            }
        } else {
            int i6 = aVar.f10839e;
            int i7 = aVar.f10840f;
            int i8 = aVar.f10841g;
            if (i8 < 0 ? i6 >= i7 : i6 <= i7) {
                while (true) {
                    if (!m10319a((String) charSequence2, 0, (String) charSequence, i6, charSequence2.length(), z)) {
                        if (i6 == i7) {
                            break;
                        }
                        i6 += i8;
                    } else {
                        return i6;
                    }
                }
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static /* synthetic */ int m10302a(CharSequence charSequence, char c, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        if (charSequence == null) {
            C4638h.m10271a("$this$indexOf");
            throw null;
        } else if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c, i);
        } else {
            return m10307a(charSequence, new char[]{c}, i, z);
        }
    }

    /* renamed from: a */
    public static final int m10307a(CharSequence charSequence, char[] cArr, int i, boolean z) {
        boolean z2;
        if (charSequence == null) {
            C4638h.m10271a("$this$indexOfAny");
            throw null;
        } else if (cArr == null) {
            C4638h.m10271a("chars");
            throw null;
        } else if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            if (i < 0) {
                i = 0;
            }
            int a = m10301a(charSequence);
            if (i <= a) {
                while (true) {
                    char charAt = charSequence.charAt(i);
                    int length = cArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            z2 = false;
                            break;
                        } else if (C2286e.m5258a(cArr[i2], charAt, z)) {
                            z2 = true;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (!z2) {
                        if (i == a) {
                            break;
                        }
                        i++;
                    } else {
                        return i;
                    }
                }
            }
            return -1;
        } else {
            return ((String) charSequence).indexOf(C2286e.m5139a(cArr), i);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ C4669d m10314a(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, int i3) {
        boolean z2 = false;
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        if (i2 >= 0) {
            z2 = true;
        }
        if (z2) {
            return new C4675b(charSequence, i, i2, new C4682h(cArr, z));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Limit must be non-negative, but was ");
        sb.append(i2);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* renamed from: a */
    public static final boolean m10319a(String str, int i, String str2, int i2, int i3, boolean z) {
        if (str == null) {
            C4638h.m10271a("$this$regionMatches");
            throw null;
        } else if (str2 != null) {
            return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
        } else {
            C4638h.m10271a("other");
            throw null;
        }
    }

    /* renamed from: a */
    public static final boolean m10317a(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        if (charSequence == null) {
            C4638h.m10271a("$this$regionMatchesImpl");
            throw null;
        } else if (charSequence2 == null) {
            C4638h.m10271a("other");
            throw null;
        } else if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        } else {
            for (int i4 = 0; i4 < i3; i4++) {
                if (!C2286e.m5258a(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ String m10312a(String str, String str2, String str3, boolean z, int i) {
        if ((i & 4) != 0) {
            z = false;
        }
        if (str == null) {
            C4638h.m10271a("$this$replace");
            throw null;
        } else if (str2 == null) {
            C4638h.m10271a("oldValue");
            throw null;
        } else if (str3 != null) {
            return C2286e.m5196a(m10315a((CharSequence) str, new String[]{str2}, z, 0, 4), str3, null, null, 0, null, null, 62);
        } else {
            C4638h.m10271a("newValue");
            throw null;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ List m10313a(CharSequence charSequence, char[] cArr, boolean z, int i, int i2) {
        int i3 = 0;
        boolean z2 = (i2 & 2) != 0 ? false : z;
        int i4 = (i2 & 4) != 0 ? 0 : i;
        if (charSequence == null) {
            C4638h.m10271a("$this$split");
            throw null;
        } else if (cArr != null) {
            int i5 = 10;
            boolean z3 = true;
            if (cArr.length == 1) {
                String valueOf = String.valueOf(cArr[0]);
                if (i4 >= 0) {
                    int a = m10305a(charSequence, valueOf, 0, z2);
                    if (a == -1 || i4 == 1) {
                        return C2286e.m5332e(charSequence.toString());
                    }
                    if (i4 <= 0) {
                        z3 = false;
                    }
                    if (z3 && i4 <= 10) {
                        i5 = i4;
                    }
                    ArrayList arrayList = new ArrayList(i5);
                    do {
                        arrayList.add(charSequence.subSequence(i3, a).toString());
                        i3 = valueOf.length() + a;
                        if (z3 && arrayList.size() == i4 - 1) {
                            break;
                        }
                        a = m10305a(charSequence, valueOf, i3, z2);
                    } while (a != -1);
                    arrayList.add(charSequence.subSequence(i3, charSequence.length()).toString());
                    return arrayList;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Limit must be non-negative, but was ");
                sb.append(i4);
                sb.append('.');
                throw new IllegalArgumentException(sb.toString().toString());
            }
            C4671f fVar = new C4671f(m10314a(charSequence, cArr, 0, z2, i4, 2));
            ArrayList arrayList2 = new ArrayList(C2286e.m5158a((Iterable<? extends T>) fVar, 10));
            Iterator it = fVar.iterator();
            while (it.hasNext()) {
                arrayList2.add(m10308a(charSequence, (C4655c) it.next()));
            }
            return arrayList2;
        } else {
            C4638h.m10271a("delimiters");
            throw null;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ C4669d m10315a(CharSequence charSequence, String[] strArr, boolean z, int i, int i2) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        if (charSequence == null) {
            C4638h.m10271a("$this$splitToSequence");
            throw null;
        } else if (strArr != null) {
            if (i >= 0) {
                return C2286e.m5222a((C4669d<? extends T>) new C4675b<Object>(charSequence, 0, i, new C4683i(C2286e.m5204a((T[]) strArr), z)), (C4618l<? super T, ? extends R>) new C4684j<Object,Object>(charSequence));
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Limit must be non-negative, but was ");
            sb.append(i);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString().toString());
        } else {
            C4638h.m10271a("delimiters");
            throw null;
        }
    }

    /* renamed from: a */
    public static final boolean m10320a(String str, String str2, int i, boolean z) {
        if (str == null) {
            C4638h.m10271a("$this$startsWith");
            throw null;
        } else if (str2 == null) {
            C4638h.m10271a("prefix");
            throw null;
        } else if (!z) {
            return str.startsWith(str2, i);
        } else {
            return m10319a(str, i, str2, 0, str2.length(), z);
        }
    }

    /* renamed from: a */
    public static final String m10308a(CharSequence charSequence, C4655c cVar) {
        if (charSequence == null) {
            C4638h.m10271a("$this$substring");
            throw null;
        } else if (cVar != null) {
            return charSequence.subSequence(Integer.valueOf(cVar.f10839e).intValue(), Integer.valueOf(cVar.f10840f).intValue() + 1).toString();
        } else {
            C4638h.m10271a("range");
            throw null;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ String m10309a(String str, char c, String str2, int i) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        if (str == null) {
            C4638h.m10271a("$this$substringAfterLast");
            throw null;
        } else if (str2 != null) {
            int b = m10324b(str, c, 0, false, 6);
            if (b == -1) {
                return str2;
            }
            String substring = str.substring(b + 1, str.length());
            C4638h.m10270a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        } else {
            C4638h.m10271a("missingDelimiterValue");
            throw null;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ String m10311a(String str, String str2, String str3, int i) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        if (str == null) {
            C4638h.m10271a("$this$substringBefore");
            throw null;
        } else if (str2 == null) {
            C4638h.m10271a("delimiter");
            throw null;
        } else if (str3 != null) {
            int a = m10306a((CharSequence) str, str2, 0, false, 6);
            if (a == -1) {
                return str3;
            }
            String substring = str.substring(0, a);
            C4638h.m10270a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        } else {
            C4638h.m10271a("missingDelimiterValue");
            throw null;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ String m10310a(String str, String str2, int i) {
        Object obj;
        String str3 = str;
        String str4 = (i & 1) != 0 ? "|" : str2;
        if (str3 == null) {
            C4638h.m10271a("$this$trimMargin");
            throw null;
        } else if (str4 != null) {
            String str5 = Objects.EMPTY_STRING;
            if (!m10325b(str4)) {
                List a = C2286e.m5203a(m10315a((CharSequence) str3, new String[]{"\r\n", "\n", "\r"}, false, 0, 6));
                int size = (a.size() * 0) + str.length();
                C4618l fVar = str5.length() == 0 ? C4679e.f10874f : new C4680f(str5);
                int size2 = a.size() - 1;
                ArrayList arrayList = new ArrayList();
                int i2 = 0;
                for (Object next : a) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        String str6 = (String) next;
                        if ((i2 == 0 || i2 == size2) && m10325b(str6)) {
                            str6 = null;
                        } else {
                            int length = str6.length();
                            int i4 = 0;
                            while (true) {
                                if (i4 >= length) {
                                    i4 = -1;
                                    break;
                                } else if (!C2286e.m5257a(str6.charAt(i4))) {
                                    break;
                                } else {
                                    i4++;
                                }
                            }
                            if (i4 != -1 && m10321a(str6, str4, i4, false, 4)) {
                                obj = str6.substring(str4.length() + i4);
                                C4638h.m10270a(obj, "(this as java.lang.String).substring(startIndex)");
                            } else {
                                obj = null;
                            }
                            if (obj != null) {
                                String str7 = (String) fVar.mo3153b(obj);
                                if (str7 != null) {
                                    str6 = str7;
                                }
                            }
                        }
                        if (str6 != null) {
                            arrayList.add(str6);
                        }
                        i2 = i3;
                    } else {
                        C2286e.m5338f();
                        throw null;
                    }
                }
                StringBuilder sb = new StringBuilder(size);
                String str8 = Objects.EMPTY_STRING;
                C4568g.m10213a(arrayList, sb, "\n", str8, str8, -1, "...", null);
                String sb2 = sb.toString();
                C4638h.m10270a((Object) sb2, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
                return sb2;
            }
            throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
        } else {
            C4638h.m10271a("marginPrefix");
            throw null;
        }
    }
}
