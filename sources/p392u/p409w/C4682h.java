package p392u.p409w;

import p392u.C4553f;
import p392u.p401r.p402b.C4622p;
import p392u.p401r.p403c.C4638h;
import p392u.p401r.p403c.C4639i;

/* renamed from: u.w.h */
public final class C4682h extends C4639i implements C4622p<CharSequence, Integer, C4553f<? extends Integer, ? extends Integer>> {

    /* renamed from: f */
    public final /* synthetic */ char[] f10876f;

    /* renamed from: g */
    public final /* synthetic */ boolean f10877g;

    public C4682h(char[] cArr, boolean z) {
        this.f10876f = cArr;
        this.f10877g = z;
        super(2);
    }

    /* renamed from: a */
    public Object mo3781a(Object obj, Object obj2) {
        CharSequence charSequence = (CharSequence) obj;
        int intValue = ((Number) obj2).intValue();
        if (charSequence != null) {
            int a = C4681g.m10307a(charSequence, this.f10876f, intValue, this.f10877g);
            if (a < 0) {
                return null;
            }
            return new C4553f(Integer.valueOf(a), Integer.valueOf(1));
        }
        C4638h.m10271a("$receiver");
        throw null;
    }
}
