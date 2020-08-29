package p410v.p411m0.p416g;

import p392u.p401r.p403c.C4636f;

/* renamed from: v.m0.g.b */
public enum C4790b {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    REFUSED_STREAM(7),
    CANCEL(8);
    

    /* renamed from: m */
    public static final C4791a f11346m = null;

    /* renamed from: e */
    public final int f11347e;

    /* renamed from: v.m0.g.b$a */
    public static final class C4791a {
        public /* synthetic */ C4791a(C4636f fVar) {
        }

        /* renamed from: a */
        public final C4790b mo11187a(int i) {
            C4790b[] values;
            for (C4790b bVar : C4790b.values()) {
                if (bVar.f11347e == i) {
                    return bVar;
                }
            }
            return null;
        }
    }

    /* access modifiers changed from: public */
    static {
        f11346m = new C4791a(null);
    }

    /* access modifiers changed from: public */
    C4790b(int i) {
        this.f11347e = i;
    }
}
