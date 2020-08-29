package p410v;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import p392u.p401r.p403c.C4638h;
import p410v.C4879z.C4880a;
import p410v.p411m0.C4737b;
import p423w.C4892f;
import p423w.C4895h;

/* renamed from: v.u */
public final class C4864u extends C4716h0 {

    /* renamed from: d */
    public static final C4879z f11597d = C4880a.m10908a("application/x-www-form-urlencoded");

    /* renamed from: b */
    public final List<String> f11598b;

    /* renamed from: c */
    public final List<String> f11599c;

    /* renamed from: v.u$a */
    public static final class C4865a {

        /* renamed from: a */
        public final List<String> f11600a = new ArrayList();

        /* renamed from: b */
        public final List<String> f11601b = new ArrayList();

        /* renamed from: c */
        public final Charset f11602c = null;
    }

    static {
        C4880a aVar = C4879z.f11637f;
    }

    public C4864u(List<String> list, List<String> list2) {
        if (list == null) {
            C4638h.m10271a("encodedNames");
            throw null;
        } else if (list2 != null) {
            this.f11598b = C4737b.m10474b(list);
            this.f11599c = C4737b.m10474b(list2);
        } else {
            C4638h.m10271a("encodedValues");
            throw null;
        }
    }

    /* renamed from: a */
    public long mo10970a() {
        return mo11358a(null, true);
    }

    /* renamed from: a */
    public final long mo11358a(C4895h hVar, boolean z) {
        C4892f fVar;
        if (z) {
            fVar = new C4892f();
        } else if (hVar != null) {
            fVar = hVar.getBuffer();
        } else {
            C4638h.m10269a();
            throw null;
        }
        int size = this.f11598b.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                fVar.writeByte(38);
            }
            fVar.mo11440a((String) this.f11598b.get(i));
            fVar.writeByte(61);
            fVar.mo11440a((String) this.f11599c.get(i));
        }
        if (!z) {
            return 0;
        }
        long j = fVar.f11661f;
        fVar.skip(j);
        return j;
    }

    /* renamed from: b */
    public C4879z mo10973b() {
        return f11597d;
    }

    /* renamed from: a */
    public void mo10972a(C4895h hVar) {
        if (hVar != null) {
            mo11358a(hVar, false);
        } else {
            C4638h.m10271a("sink");
            throw null;
        }
    }
}
