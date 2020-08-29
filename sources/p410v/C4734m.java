package p410v;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.C4557i;
import p392u.p393n.C4568g;
import p392u.p394o.C4574a;
import p392u.p401r.p403c.C4638h;
import p410v.C4722j.C4724b;
import p410v.p411m0.C4737b;

/* renamed from: v.m */
public final class C4734m {

    /* renamed from: e */
    public static final C4722j[] f11127e = {C4722j.f11101q, C4722j.f11102r, C4722j.f11103s, C4722j.f11095k, C4722j.f11097m, C4722j.f11096l, C4722j.f11098n, C4722j.f11100p, C4722j.f11099o};

    /* renamed from: f */
    public static final C4722j[] f11128f = {C4722j.f11101q, C4722j.f11102r, C4722j.f11103s, C4722j.f11095k, C4722j.f11097m, C4722j.f11096l, C4722j.f11098n, C4722j.f11100p, C4722j.f11099o, C4722j.f11093i, C4722j.f11094j, C4722j.f11091g, C4722j.f11092h, C4722j.f11089e, C4722j.f11090f, C4722j.f11088d};

    /* renamed from: g */
    public static final C4734m f11129g;

    /* renamed from: h */
    public static final C4734m f11130h = new C4734m(false, false, null, null);

    /* renamed from: a */
    public final boolean f11131a;

    /* renamed from: b */
    public final boolean f11132b;

    /* renamed from: c */
    public final String[] f11133c;

    /* renamed from: d */
    public final String[] f11134d;

    /* renamed from: v.m$a */
    public static final class C4735a {

        /* renamed from: a */
        public boolean f11135a;

        /* renamed from: b */
        public String[] f11136b;

        /* renamed from: c */
        public String[] f11137c;

        /* renamed from: d */
        public boolean f11138d;

        public C4735a(C4734m mVar) {
            if (mVar != null) {
                this.f11135a = mVar.f11131a;
                this.f11136b = mVar.f11133c;
                this.f11137c = mVar.f11134d;
                this.f11138d = mVar.f11132b;
                return;
            }
            C4638h.m10271a("connectionSpec");
            throw null;
        }

        public C4735a(boolean z) {
            this.f11135a = z;
        }

        /* renamed from: a */
        public final C4735a mo11066a(boolean z) {
            if (this.f11135a) {
                this.f11138d = z;
                return this;
            }
            throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
        }

        /* renamed from: a */
        public final C4735a mo11067a(String... strArr) {
            if (strArr == null) {
                C4638h.m10271a("cipherSuites");
                throw null;
            } else if (this.f11135a) {
                if (!(strArr.length == 0)) {
                    Object clone = strArr.clone();
                    if (clone != null) {
                        this.f11136b = (String[]) clone;
                        return this;
                    }
                    throw new C4557i("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                }
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            } else {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
        }

        /* renamed from: a */
        public final C4734m mo11070a() {
            return new C4734m(this.f11135a, this.f11138d, this.f11136b, this.f11137c);
        }

        /* renamed from: b */
        public final C4735a mo11071b(String... strArr) {
            if (strArr == null) {
                C4638h.m10271a("tlsVersions");
                throw null;
            } else if (this.f11135a) {
                if (!(strArr.length == 0)) {
                    Object clone = strArr.clone();
                    if (clone != null) {
                        this.f11137c = (String[]) clone;
                        return this;
                    }
                    throw new C4557i("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                }
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            } else {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
        }

        /* renamed from: a */
        public final C4735a mo11068a(C4722j... jVarArr) {
            if (jVarArr == null) {
                C4638h.m10271a("cipherSuites");
                throw null;
            } else if (this.f11135a) {
                ArrayList arrayList = new ArrayList(jVarArr.length);
                for (C4722j jVar : jVarArr) {
                    arrayList.add(jVar.f11105a);
                }
                Object[] array = arrayList.toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    mo11067a((String[]) Arrays.copyOf(strArr, strArr.length));
                    return this;
                }
                throw new C4557i("null cannot be cast to non-null type kotlin.Array<T>");
            } else {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
        }

        /* renamed from: a */
        public final C4735a mo11069a(C4732l0... l0VarArr) {
            if (l0VarArr == null) {
                C4638h.m10271a("tlsVersions");
                throw null;
            } else if (this.f11135a) {
                ArrayList arrayList = new ArrayList(l0VarArr.length);
                for (C4732l0 l0Var : l0VarArr) {
                    arrayList.add(l0Var.f11126e);
                }
                Object[] array = arrayList.toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    mo11071b((String[]) Arrays.copyOf(strArr, strArr.length));
                    return this;
                }
                throw new C4557i("null cannot be cast to non-null type kotlin.Array<T>");
            } else {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
        }
    }

    static {
        C4735a aVar = new C4735a(true);
        C4722j[] jVarArr = f11127e;
        aVar.mo11068a((C4722j[]) Arrays.copyOf(jVarArr, jVarArr.length));
        aVar.mo11069a(C4732l0.TLS_1_3, C4732l0.TLS_1_2);
        aVar.mo11066a(true);
        aVar.mo11070a();
        C4735a aVar2 = new C4735a(true);
        C4722j[] jVarArr2 = f11128f;
        aVar2.mo11068a((C4722j[]) Arrays.copyOf(jVarArr2, jVarArr2.length));
        aVar2.mo11069a(C4732l0.TLS_1_3, C4732l0.TLS_1_2);
        aVar2.mo11066a(true);
        f11129g = aVar2.mo11070a();
        C4735a aVar3 = new C4735a(true);
        C4722j[] jVarArr3 = f11128f;
        aVar3.mo11068a((C4722j[]) Arrays.copyOf(jVarArr3, jVarArr3.length));
        aVar3.mo11069a(C4732l0.TLS_1_3, C4732l0.TLS_1_2, C4732l0.TLS_1_1, C4732l0.TLS_1_0);
        aVar3.mo11066a(true);
        aVar3.mo11070a();
    }

    public C4734m(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.f11131a = z;
        this.f11132b = z2;
        this.f11133c = strArr;
        this.f11134d = strArr2;
    }

    /* renamed from: a */
    public final List<C4722j> mo11060a() {
        String[] strArr = this.f11133c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String a : strArr) {
            arrayList.add(C4722j.f11104t.mo11046a(a));
        }
        return C4568g.m10215a((Iterable<? extends T>) arrayList);
    }

    /* renamed from: a */
    public final boolean mo11061a(SSLSocket sSLSocket) {
        if (sSLSocket == null) {
            C4638h.m10271a("socket");
            throw null;
        } else if (!this.f11131a) {
            return false;
        } else {
            String[] strArr = this.f11134d;
            if (strArr != null && !C4737b.m10470a(strArr, sSLSocket.getEnabledProtocols(), (Comparator<? super String>) C4574a.f10782e)) {
                return false;
            }
            String[] strArr2 = this.f11133c;
            if (strArr2 != null) {
                String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
                C4724b bVar = C4722j.f11104t;
                if (!C4737b.m10470a(strArr2, enabledCipherSuites, C4722j.f11086b)) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: b */
    public final List<C4732l0> mo11062b() {
        String[] strArr = this.f11134d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String a : strArr) {
            arrayList.add(C4732l0.f11125l.mo11059a(a));
        }
        return C4568g.m10215a((Iterable<? extends T>) arrayList);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4734m)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z = this.f11131a;
        C4734m mVar = (C4734m) obj;
        if (z != mVar.f11131a) {
            return false;
        }
        return !z || (Arrays.equals(this.f11133c, mVar.f11133c) && Arrays.equals(this.f11134d, mVar.f11134d) && this.f11132b == mVar.f11132b);
    }

    public int hashCode() {
        if (!this.f11131a) {
            return 17;
        }
        String[] strArr = this.f11133c;
        int i = 0;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f11134d;
        if (strArr2 != null) {
            i = Arrays.hashCode(strArr2);
        }
        return ((hashCode + i) * 31) + (this.f11132b ^ true ? 1 : 0);
    }

    public String toString() {
        if (!this.f11131a) {
            return "ConnectionSpec()";
        }
        StringBuilder b = C1965a.m4763b("ConnectionSpec(", "cipherSuites=");
        String str = "[all enabled]";
        b.append(Objects.toString(mo11060a(), str));
        String str2 = p116io.jsonwebtoken.lang.Objects.ARRAY_ELEMENT_SEPARATOR;
        b.append(str2);
        b.append("tlsVersions=");
        b.append(Objects.toString(mo11062b(), str));
        b.append(str2);
        b.append("supportsTlsExtensions=");
        b.append(this.f11132b);
        b.append(')');
        return b.toString();
    }
}
