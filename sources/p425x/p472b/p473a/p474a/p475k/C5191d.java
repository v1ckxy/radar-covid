package p425x.p472b.p473a.p474a.p475k;

import java.util.LinkedHashMap;
import java.util.Map;
import p392u.p401r.p403c.C4638h;
import p410v.C4706e0;
import p410v.C4716h0;
import p410v.C4720i0;
import p410v.C4870w.C4871a;
import p410v.C4873x;
import p410v.C4877y;
import p410v.C4877y.C4878a;
import p410v.p411m0.C4737b;

/* renamed from: x.b.a.a.k.d */
public class C5191d implements C4877y {

    /* renamed from: a */
    public final String f12408a;

    public C5191d(String str) {
        this.f12408a = str;
    }

    /* renamed from: a */
    public C4720i0 mo11074a(C4878a aVar) {
        LinkedHashMap linkedHashMap;
        C4706e0 g = aVar.mo11176g();
        if (g == null) {
            throw null;
        } else if (g != null) {
            new LinkedHashMap();
            C4873x xVar = g.f11029b;
            String str = g.f11030c;
            C4716h0 h0Var = g.f11032e;
            if (g.f11033f.isEmpty()) {
                linkedHashMap = new LinkedHashMap();
            } else {
                Map<Class<?>, Object> map = g.f11033f;
                if (map != null) {
                    linkedHashMap = new LinkedHashMap(map);
                } else {
                    C4638h.m10271a("$this$toMutableMap");
                    throw null;
                }
            }
            C4871a c = g.f11031d.mo11368c();
            String str2 = this.f12408a;
            if (str2 != null) {
                c.mo11382c("User-Agent", str2);
                if (xVar != null) {
                    C4706e0 e0Var = new C4706e0(xVar, str, c.mo11378a(), h0Var, C4737b.m10459a((Map<K, ? extends V>) linkedHashMap));
                    return aVar.mo11170a(e0Var);
                }
                throw new IllegalStateException("url == null".toString());
            }
            C4638h.m10271a("value");
            throw null;
        } else {
            C4638h.m10271a("request");
            throw null;
        }
    }
}
