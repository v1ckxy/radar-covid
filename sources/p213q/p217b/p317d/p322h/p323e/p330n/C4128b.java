package p213q.p217b.p317d.p322h.p323e.p330n;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;
import p392u.p401r.p403c.C4638h;
import p410v.C4686a0;
import p410v.C4686a0.C4687a;
import p410v.C4686a0.C4689c;
import p410v.C4690b0;
import p410v.C4690b0.C4691a;
import p410v.C4702d0;
import p410v.C4704e;
import p410v.C4706e0;
import p410v.C4706e0.C4707a;
import p410v.C4716h0;
import p410v.C4720i0;
import p410v.C4725j0;
import p410v.C4873x;
import p410v.C4873x.C4874a;
import p410v.C4873x.C4876b;
import p410v.C4879z;
import p410v.C4879z.C4880a;
import p410v.p411m0.C4737b;

/* renamed from: q.b.d.h.e.n.b */
public class C4128b {

    /* renamed from: f */
    public static final C4690b0 f9992f;

    /* renamed from: a */
    public final C4127a f9993a;

    /* renamed from: b */
    public final String f9994b;

    /* renamed from: c */
    public final Map<String, String> f9995c;

    /* renamed from: d */
    public final Map<String, String> f9996d;

    /* renamed from: e */
    public C4687a f9997e = null;

    static {
        C4691a aVar = new C4691a(new C4690b0(new C4691a()));
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (timeUnit != null) {
            aVar.f10964x = C4737b.m10449a("timeout", 10000, timeUnit);
            f9992f = new C4690b0(aVar);
            return;
        }
        C4638h.m10271a("unit");
        throw null;
    }

    public C4128b(C4127a aVar, String str, Map<String, String> map) {
        this.f9993a = aVar;
        this.f9994b = str;
        this.f9995c = map;
        this.f9996d = new HashMap();
    }

    /* renamed from: a */
    public C4130d mo10328a() {
        C4873x xVar;
        C4707a aVar = new C4707a();
        C4704e eVar = new C4704e(true, false, -1, -1, false, false, false, -1, -1, false, false, false, null, null);
        String eVar2 = eVar.toString();
        String str = "Cache-Control";
        if (eVar2.length() == 0) {
            aVar.mo11016a(str);
        } else {
            aVar.mo11017a(str, eVar2);
        }
        String str2 = this.f9994b;
        C4876b bVar = C4873x.f11615l;
        String str3 = null;
        if (str2 != null) {
            try {
                xVar = bVar.mo11409b(str2);
            } catch (IllegalArgumentException unused) {
                xVar = null;
            }
            C4874a f = xVar.mo11394f();
            for (Entry entry : this.f9995c.entrySet()) {
                f.mo11400a((String) entry.getKey(), (String) entry.getValue());
            }
            aVar.f11034a = f.mo11402a();
            for (Entry entry2 : this.f9996d.entrySet()) {
                aVar.mo11017a((String) entry2.getKey(), (String) entry2.getValue());
            }
            C4687a aVar2 = this.f9997e;
            aVar.mo11018a(this.f9993a.name(), aVar2 == null ? null : aVar2.mo10976a());
            C4706e0 a = aVar.mo11021a();
            C4690b0 b0Var = f9992f;
            if (b0Var != null) {
                C4720i0 f2 = C4702d0.m10362a(b0Var, a, false).mo11004f();
                C4725j0 j0Var = f2.f11066l;
                if (j0Var != null) {
                    str3 = j0Var.mo11050k();
                }
                return new C4130d(f2.f11063i, str3, f2.f11065k);
            }
            throw null;
        }
        C4638h.m10271a("$this$toHttpUrlOrNull");
        throw null;
    }

    /* renamed from: a */
    public C4128b mo10326a(String str, String str2) {
        if (this.f9997e == null) {
            C4687a aVar = new C4687a();
            aVar.mo10975a(C4686a0.f10893h);
            this.f9997e = aVar;
        }
        C4687a aVar2 = this.f9997e;
        if (aVar2 == null) {
            throw null;
        } else if (str == null) {
            C4638h.m10271a("name");
            throw null;
        } else if (str2 != null) {
            aVar2.mo10974a(C4689c.m10341a(str, null, C4716h0.f11051a.mo11030a(str2, null)));
            this.f9997e = aVar2;
            return this;
        } else {
            C4638h.m10271a("value");
            throw null;
        }
    }

    /* renamed from: a */
    public C4128b mo10327a(String str, String str2, String str3, File file) {
        C4880a aVar = C4879z.f11637f;
        C4716h0 a = C4716h0.m10395a(C4880a.m10909b(str3), file);
        if (this.f9997e == null) {
            C4687a aVar2 = new C4687a();
            aVar2.mo10975a(C4686a0.f10893h);
            this.f9997e = aVar2;
        }
        C4687a aVar3 = this.f9997e;
        if (aVar3 == null) {
            throw null;
        } else if (str != null) {
            aVar3.mo10974a(C4689c.m10341a(str, str2, a));
            this.f9997e = aVar3;
            return this;
        } else {
            C4638h.m10271a("name");
            throw null;
        }
    }
}
