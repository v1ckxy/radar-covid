package p000;

import p124p.p126b.p127k.C1034d;
import p392u.C4560l;
import p392u.p401r.p402b.C4618l;
import p392u.p401r.p403c.C4638h;
import p392u.p401r.p403c.C4639i;

/* renamed from: n */
/* compiled from: com.android.tools.r8.jetbrains.kotlin-style lambda group */
public final class C0889n extends C4639i implements C4618l<C1034d, C4560l> {

    /* renamed from: g */
    public static final C0889n f2466g = new C0889n(0);

    /* renamed from: h */
    public static final C0889n f2467h = new C0889n(1);

    /* renamed from: f */
    public final /* synthetic */ int f2468f;

    public C0889n(int i) {
        this.f2468f = i;
        super(1);
    }

    /* renamed from: b */
    public final Object mo3153b(Object obj) {
        int i = this.f2468f;
        String str = "it";
        if (i == 0) {
            C1034d dVar = (C1034d) obj;
            if (dVar != null) {
                dVar.dismiss();
                return C4560l.f10773a;
            }
            C4638h.m10271a(str);
            throw null;
        } else if (i == 1) {
            C1034d dVar2 = (C1034d) obj;
            if (dVar2 != null) {
                dVar2.dismiss();
                return C4560l.f10773a;
            }
            C4638h.m10271a(str);
            throw null;
        } else {
            throw null;
        }
    }
}
