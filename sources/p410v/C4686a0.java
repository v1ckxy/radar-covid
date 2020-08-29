package p410v;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.C4557i;
import p392u.p401r.p403c.C4636f;
import p392u.p401r.p403c.C4638h;
import p392u.p409w.C4681g;
import p410v.C4879z.C4880a;
import p410v.p411m0.C4737b;
import p423w.C4892f;
import p423w.C4895h;
import p423w.C4897j;
import p423w.p424c0.C4889a;

/* renamed from: v.a0 */
public final class C4686a0 extends C4716h0 {

    /* renamed from: g */
    public static final C4879z f10892g = C4880a.m10908a("multipart/mixed");

    /* renamed from: h */
    public static final C4879z f10893h = C4880a.m10908a("multipart/form-data");

    /* renamed from: i */
    public static final byte[] f10894i = {(byte) 58, (byte) 32};

    /* renamed from: j */
    public static final byte[] f10895j = {(byte) 13, (byte) 10};

    /* renamed from: k */
    public static final byte[] f10896k;

    /* renamed from: l */
    public static final C4688b f10897l = new C4688b(null);

    /* renamed from: b */
    public final C4879z f10898b;

    /* renamed from: c */
    public long f10899c;

    /* renamed from: d */
    public final C4897j f10900d;

    /* renamed from: e */
    public final C4879z f10901e;

    /* renamed from: f */
    public final List<C4689c> f10902f;

    /* renamed from: v.a0$a */
    public static final class C4687a {

        /* renamed from: a */
        public final C4897j f10903a;

        /* renamed from: b */
        public C4879z f10904b;

        /* renamed from: c */
        public final List<C4689c> f10905c;

        public C4687a() {
            String uuid = UUID.randomUUID().toString();
            C4638h.m10270a((Object) uuid, "UUID.randomUUID().toString()");
            if (uuid != null) {
                this.f10903a = C4897j.f11665i.mo11511c(uuid);
                this.f10904b = C4686a0.f10892g;
                this.f10905c = new ArrayList();
                return;
            }
            C4638h.m10271a("boundary");
            throw null;
        }

        /* renamed from: a */
        public final C4687a mo10974a(C4689c cVar) {
            if (cVar != null) {
                this.f10905c.add(cVar);
                return this;
            }
            C4638h.m10271a("part");
            throw null;
        }

        /* renamed from: a */
        public final C4686a0 mo10976a() {
            if (!this.f10905c.isEmpty()) {
                return new C4686a0(this.f10903a, this.f10904b, C4737b.m10474b(this.f10905c));
            }
            throw new IllegalStateException("Multipart body must have at least one part.".toString());
        }

        /* renamed from: a */
        public final C4687a mo10975a(C4879z zVar) {
            if (zVar == null) {
                C4638h.m10271a("type");
                throw null;
            } else if (C4638h.m10272a((Object) zVar.f11639b, (Object) "multipart")) {
                this.f10904b = zVar;
                return this;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("multipart != ");
                sb.append(zVar);
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    /* renamed from: v.a0$b */
    public static final class C4688b {
        public /* synthetic */ C4688b(C4636f fVar) {
        }

        /* renamed from: a */
        public final void mo10977a(StringBuilder sb, String str) {
            String str2;
            if (sb == null) {
                C4638h.m10271a("$this$appendQuotedString");
                throw null;
            } else if (str != null) {
                sb.append('\"');
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char charAt = str.charAt(i);
                    if (charAt == 10) {
                        str2 = "%0A";
                    } else if (charAt == 13) {
                        str2 = "%0D";
                    } else if (charAt == '\"') {
                        str2 = "%22";
                    } else {
                        sb.append(charAt);
                    }
                    sb.append(str2);
                }
                sb.append('\"');
            } else {
                C4638h.m10271a("key");
                throw null;
            }
        }
    }

    /* renamed from: v.a0$c */
    public static final class C4689c {

        /* renamed from: a */
        public final C4870w f10906a;

        /* renamed from: b */
        public final C4716h0 f10907b;

        public /* synthetic */ C4689c(C4870w wVar, C4716h0 h0Var, C4636f fVar) {
            this.f10906a = wVar;
            this.f10907b = h0Var;
        }

        /* renamed from: a */
        public static final C4689c m10342a(C4870w wVar, C4716h0 h0Var) {
            if (h0Var != null) {
                boolean z = true;
                if ((wVar != null ? wVar.mo11366a("Content-Type") : null) == null) {
                    if ((wVar != null ? wVar.mo11366a("Content-Length") : null) != null) {
                        z = false;
                    }
                    if (z) {
                        return new C4689c(wVar, h0Var, null);
                    }
                    throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
                }
                throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
            }
            C4638h.m10271a("body");
            throw null;
        }

        /* renamed from: a */
        public static final C4689c m10341a(String str, String str2, C4716h0 h0Var) {
            if (str == null) {
                C4638h.m10271a("name");
                throw null;
            } else if (h0Var != null) {
                StringBuilder a = C1965a.m4756a("form-data; name=");
                C4686a0.f10897l.mo10977a(a, str);
                if (str2 != null) {
                    a.append("; filename=");
                    C4686a0.f10897l.mo10977a(a, str2);
                }
                String sb = a.toString();
                C4638h.m10270a((Object) sb, "StringBuilder().apply(builderAction).toString()");
                ArrayList arrayList = new ArrayList(20);
                String str3 = "Content-Disposition";
                C4870w.f11611f.mo11384a(str3);
                arrayList.add(str3);
                arrayList.add(C4681g.m10328c(sb).toString());
                Object[] array = arrayList.toArray(new String[0]);
                if (array != null) {
                    return m10342a(new C4870w((String[]) array, null), h0Var);
                }
                throw new C4557i("null cannot be cast to non-null type kotlin.Array<T>");
            } else {
                C4638h.m10271a("body");
                throw null;
            }
        }
    }

    static {
        C4880a aVar = C4879z.f11637f;
        C4880a aVar2 = C4879z.f11637f;
        C4880a.m10908a("multipart/alternative");
        C4880a aVar3 = C4879z.f11637f;
        C4880a.m10908a("multipart/digest");
        C4880a aVar4 = C4879z.f11637f;
        C4880a.m10908a("multipart/parallel");
        C4880a aVar5 = C4879z.f11637f;
        byte b = (byte) 45;
        f10896k = new byte[]{b, b};
    }

    public C4686a0(C4897j jVar, C4879z zVar, List<C4689c> list) {
        if (jVar == null) {
            C4638h.m10271a("boundaryByteString");
            throw null;
        } else if (zVar == null) {
            C4638h.m10271a("type");
            throw null;
        } else if (list != null) {
            this.f10900d = jVar;
            this.f10901e = zVar;
            this.f10902f = list;
            C4880a aVar = C4879z.f11637f;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f10901e);
            sb.append("; boundary=");
            C4897j jVar2 = this.f10900d;
            if (jVar2 != null) {
                sb.append(C4889a.m10953h(jVar2));
                this.f10898b = C4880a.m10908a(sb.toString());
                this.f10899c = -1;
                return;
            }
            throw null;
        } else {
            C4638h.m10271a("parts");
            throw null;
        }
    }

    /* renamed from: a */
    public long mo10970a() {
        long j = this.f10899c;
        if (j != -1) {
            return j;
        }
        long a = mo10971a(null, true);
        this.f10899c = a;
        return a;
    }

    /* renamed from: a */
    public final long mo10971a(C4895h hVar, boolean z) {
        C4892f fVar;
        if (z) {
            r14 = new C4892f();
            fVar = r14;
            r14 = r14;
        } else {
            fVar = 0;
            r14 = hVar;
        }
        int size = this.f10902f.size();
        long j = 0;
        int i = 0;
        while (i < size) {
            C4689c cVar = (C4689c) this.f10902f.get(i);
            C4870w wVar = cVar.f10906a;
            C4716h0 h0Var = cVar.f10907b;
            if (r14 != 0) {
                r14.write(f10896k);
                r14.mo11443a(this.f10900d);
                r14.write(f10895j);
                if (wVar != null) {
                    int size2 = wVar.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        r14.mo11440a(wVar.mo11369e(i2)).write(f10894i).mo11440a(wVar.mo11371f(i2)).write(f10895j);
                    }
                }
                C4879z b = h0Var.mo10973b();
                if (b != null) {
                    r14.mo11440a("Content-Type: ").mo11440a(b.f11638a).write(f10895j);
                }
                long a = h0Var.mo10970a();
                if (a != -1) {
                    r14.mo11440a("Content-Length: ").mo11459i(a).write(f10895j);
                } else if (z) {
                    if (fVar != 0) {
                        fVar.skip(fVar.f11661f);
                        return -1;
                    }
                    C4638h.m10269a();
                    throw null;
                }
                r14.write(f10895j);
                if (z) {
                    j += a;
                } else {
                    h0Var.mo10972a(r14);
                }
                r14.write(f10895j);
                i++;
            } else {
                C4638h.m10269a();
                throw null;
            }
        }
        if (r14 != 0) {
            r14.write(f10896k);
            r14.mo11443a(this.f10900d);
            r14.write(f10896k);
            r14.write(f10895j);
            if (z) {
                if (fVar != 0) {
                    long j2 = fVar.f11661f;
                    j += j2;
                    fVar.skip(j2);
                } else {
                    C4638h.m10269a();
                    throw null;
                }
            }
            return j;
        }
        C4638h.m10269a();
        throw null;
    }

    /* renamed from: b */
    public C4879z mo10973b() {
        return this.f10898b;
    }

    /* renamed from: a */
    public void mo10972a(C4895h hVar) {
        if (hVar != null) {
            mo10971a(hVar, false);
        } else {
            C4638h.m10271a("sink");
            throw null;
        }
    }
}
