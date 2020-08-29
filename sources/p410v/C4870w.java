package p410v;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p116io.jsonwebtoken.lang.Objects;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p392u.C4553f;
import p392u.C4557i;
import p392u.p393n.C4570i;
import p392u.p401r.p403c.C4630a;
import p392u.p401r.p403c.C4636f;
import p392u.p401r.p403c.C4638h;
import p392u.p401r.p403c.p404p.C4646a;
import p392u.p406t.C4653a;
import p392u.p406t.C4656d;
import p392u.p409w.C4681g;
import p410v.p411m0.C4737b;

/* renamed from: v.w */
public final class C4870w implements Iterable<C4553f<? extends String, ? extends String>>, C4646a {

    /* renamed from: f */
    public static final C4872b f11611f = new C4872b(null);

    /* renamed from: e */
    public final String[] f11612e;

    /* renamed from: v.w$a */
    public static final class C4871a {

        /* renamed from: a */
        public final List<String> f11613a = new ArrayList(20);

        /* renamed from: a */
        public final C4871a mo11377a(String str, String str2) {
            if (str == null) {
                C4638h.m10271a("name");
                throw null;
            } else if (str2 != null) {
                C4870w.f11611f.mo11384a(str);
                C4870w.f11611f.mo11385a(str2, str);
                mo11380b(str, str2);
                return this;
            } else {
                C4638h.m10271a("value");
                throw null;
            }
        }

        /* renamed from: a */
        public final C4870w mo11378a() {
            Object[] array = this.f11613a.toArray(new String[0]);
            if (array != null) {
                return new C4870w((String[]) array, null);
            }
            throw new C4557i("null cannot be cast to non-null type kotlin.Array<T>");
        }

        /* renamed from: b */
        public final C4871a mo11380b(String str, String str2) {
            if (str == null) {
                C4638h.m10271a("name");
                throw null;
            } else if (str2 != null) {
                this.f11613a.add(str);
                this.f11613a.add(C4681g.m10328c(str2).toString());
                return this;
            } else {
                C4638h.m10271a("value");
                throw null;
            }
        }

        /* renamed from: c */
        public final C4871a mo11381c(String str) {
            if (str != null) {
                int i = 0;
                while (i < this.f11613a.size()) {
                    if (C4681g.m10322a(str, (String) this.f11613a.get(i), true)) {
                        this.f11613a.remove(i);
                        this.f11613a.remove(i);
                        i -= 2;
                    }
                    i += 2;
                }
                return this;
            }
            C4638h.m10271a("name");
            throw null;
        }

        /* renamed from: b */
        public final String mo11379b(String str) {
            if (str != null) {
                C4653a a = C4656d.m10290a(C4656d.m10289a(this.f11613a.size() - 2, 0), 2);
                int i = a.f10839e;
                int i2 = a.f10840f;
                int i3 = a.f10841g;
                if (i3 < 0 ? i >= i2 : i <= i2) {
                    while (!C4681g.m10322a(str, (String) this.f11613a.get(i), true)) {
                        if (i != i2) {
                            i += i3;
                        }
                    }
                    return (String) this.f11613a.get(i + 1);
                }
                return null;
            }
            C4638h.m10271a("name");
            throw null;
        }

        /* renamed from: c */
        public final C4871a mo11382c(String str, String str2) {
            if (str == null) {
                C4638h.m10271a("name");
                throw null;
            } else if (str2 != null) {
                C4870w.f11611f.mo11384a(str);
                C4870w.f11611f.mo11385a(str2, str);
                mo11381c(str);
                mo11380b(str, str2);
                return this;
            } else {
                C4638h.m10271a("value");
                throw null;
            }
        }

        /* renamed from: a */
        public final C4871a mo11376a(String str) {
            if (str != null) {
                int a = C4681g.m10302a((CharSequence) str, ':', 1, false, 4);
                String str2 = "(this as java.lang.String).substring(startIndex)";
                if (a != -1) {
                    String substring = str.substring(0, a);
                    C4638h.m10270a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    String substring2 = str.substring(a + 1);
                    C4638h.m10270a((Object) substring2, str2);
                    mo11380b(substring, substring2);
                } else {
                    char charAt = str.charAt(0);
                    String str3 = Objects.EMPTY_STRING;
                    if (charAt == ':') {
                        str = str.substring(1);
                        C4638h.m10270a((Object) str, str2);
                    }
                    mo11380b(str3, str);
                }
                return this;
            }
            C4638h.m10271a("line");
            throw null;
        }
    }

    /* renamed from: v.w$b */
    public static final class C4872b {
        public /* synthetic */ C4872b(C4636f fVar) {
        }

        /* renamed from: a */
        public final C4870w mo11383a(String... strArr) {
            if (strArr != null) {
                if (strArr.length % 2 == 0) {
                    Object clone = strArr.clone();
                    if (clone != null) {
                        String[] strArr2 = (String[]) clone;
                        int length = strArr2.length;
                        int i = 0;
                        while (i < length) {
                            if (strArr2[i] != null) {
                                String str = strArr2[i];
                                if (str != null) {
                                    strArr2[i] = C4681g.m10328c(str).toString();
                                    i++;
                                } else {
                                    throw new C4557i("null cannot be cast to non-null type kotlin.CharSequence");
                                }
                            } else {
                                throw new IllegalArgumentException("Headers cannot be null".toString());
                            }
                        }
                        C4653a a = C4656d.m10290a((C4653a) C4656d.m10291b(0, strArr2.length), 2);
                        int i2 = a.f10839e;
                        int i3 = a.f10840f;
                        int i4 = a.f10841g;
                        if (i4 < 0 ? i2 >= i3 : i2 <= i3) {
                            while (true) {
                                String str2 = strArr2[i2];
                                String str3 = strArr2[i2 + 1];
                                mo11384a(str2);
                                mo11385a(str3, str2);
                                if (i2 == i3) {
                                    break;
                                }
                                i2 += i4;
                            }
                        }
                        return new C4870w(strArr2, null);
                    }
                    throw new C4557i("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                }
                throw new IllegalArgumentException("Expected alternating header names and values".toString());
            }
            C4638h.m10271a("namesAndValues");
            throw null;
        }

        /* renamed from: a */
        public final void mo11384a(String str) {
            if (str.length() > 0) {
                int length = str.length();
                int i = 0;
                while (i < length) {
                    char charAt = str.charAt(i);
                    if ('!' <= charAt && '~' >= charAt) {
                        i++;
                    } else {
                        throw new IllegalArgumentException(C4737b.m10455a("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str).toString());
                    }
                }
                return;
            }
            throw new IllegalArgumentException("name is empty".toString());
        }

        /* renamed from: a */
        public final void mo11385a(String str, String str2) {
            int length = str.length();
            int i = 0;
            while (i < length) {
                char charAt = str.charAt(i);
                if (charAt == 9 || (' ' <= charAt && '~' >= charAt)) {
                    i++;
                } else {
                    throw new IllegalArgumentException(C4737b.m10455a("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i), str2, str).toString());
                }
            }
        }
    }

    public /* synthetic */ C4870w(String[] strArr, C4636f fVar) {
        this.f11612e = strArr;
    }

    /* renamed from: a */
    public final String mo11366a(String str) {
        if (str != null) {
            String[] strArr = this.f11612e;
            C4653a a = C4656d.m10290a(C4656d.m10289a(strArr.length - 2, 0), 2);
            int i = a.f10839e;
            int i2 = a.f10840f;
            int i3 = a.f10841g;
            if (i3 >= 0) {
                if (i > i2) {
                    return null;
                }
            } else if (i < i2) {
                return null;
            }
            while (!C4681g.m10322a(str, strArr[i], true)) {
                if (i == i2) {
                    return null;
                }
                i += i3;
            }
            return strArr[i + 1];
        }
        C4638h.m10271a("name");
        throw null;
    }

    /* renamed from: b */
    public final List<String> mo11367b(String str) {
        ArrayList arrayList = null;
        if (str != null) {
            int size = size();
            for (int i = 0; i < size; i++) {
                if (C4681g.m10322a(str, mo11369e(i), true)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList(2);
                    }
                    arrayList.add(mo11371f(i));
                }
            }
            if (arrayList == null) {
                return C4570i.f10779e;
            }
            List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
            C4638h.m10270a((Object) unmodifiableList, "Collections.unmodifiableList(result)");
            return unmodifiableList;
        }
        C4638h.m10271a("name");
        throw null;
    }

    /* renamed from: c */
    public final C4871a mo11368c() {
        C4871a aVar = new C4871a();
        List<String> list = aVar.f11613a;
        String[] strArr = this.f11612e;
        if (list == null) {
            C4638h.m10271a("$this$addAll");
            throw null;
        } else if (strArr != null) {
            list.addAll(C2286e.m5204a((T[]) strArr));
            return aVar;
        } else {
            C4638h.m10271a("elements");
            throw null;
        }
    }

    /* renamed from: e */
    public final String mo11369e(int i) {
        return this.f11612e[i * 2];
    }

    public boolean equals(Object obj) {
        return (obj instanceof C4870w) && Arrays.equals(this.f11612e, ((C4870w) obj).f11612e);
    }

    /* renamed from: f */
    public final String mo11371f(int i) {
        return this.f11612e[(i * 2) + 1];
    }

    public int hashCode() {
        return Arrays.hashCode(this.f11612e);
    }

    public Iterator<C4553f<String, String>> iterator() {
        int size = size();
        C4553f[] fVarArr = new C4553f[size];
        for (int i = 0; i < size; i++) {
            fVarArr[i] = new C4553f(mo11369e(i), mo11371f(i));
        }
        return new C4630a(fVarArr);
    }

    public final int size() {
        return this.f11612e.length / 2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            sb.append(mo11369e(i));
            sb.append(": ");
            sb.append(mo11371f(i));
            sb.append("\n");
        }
        String sb2 = sb.toString();
        C4638h.m10270a((Object) sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
