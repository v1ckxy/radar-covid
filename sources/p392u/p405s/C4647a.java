package p392u.p405s;

import java.util.Random;
import p392u.p401r.p403c.C4638h;

/* renamed from: u.s.a */
public abstract class C4647a extends C4650c {
    /* renamed from: a */
    public int mo10943a(int i) {
        Object obj = ((C4648b) this).f10835c.get();
        C4638h.m10270a(obj, "implStorage.get()");
        return ((-i) >> 31) & (((Random) obj).nextInt() >>> (32 - i));
    }

    /* renamed from: a */
    public int mo10942a() {
        Object obj = ((C4648b) this).f10835c.get();
        C4638h.m10270a(obj, "implStorage.get()");
        return ((Random) obj).nextInt();
    }
}
