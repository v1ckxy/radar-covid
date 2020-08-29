package p124p.p141d.p142a;

import android.content.res.ColorStateList;

/* renamed from: p.d.a.b */
public class C1243b implements C1245d {
    /* renamed from: a */
    public final C1246e mo5455a(C1244c cVar) {
        return (C1246e) cVar.mo5463c();
    }

    /* renamed from: a */
    public void mo5457a(C1244c cVar, ColorStateList colorStateList) {
        C1246e a = mo5455a(cVar);
        if (a != null) {
            if (colorStateList == null) {
                colorStateList = ColorStateList.valueOf(0);
            }
            a.f3535e = colorStateList;
            colorStateList.getColorForState(a.getState(), a.f3535e.getDefaultColor());
            throw null;
        }
        throw null;
    }

    /* renamed from: b */
    public float mo5458b(C1244c cVar) {
        return mo5455a(cVar).f3532b;
    }

    /* renamed from: c */
    public float mo5459c(C1244c cVar) {
        return mo5455a(cVar).f3531a;
    }

    /* renamed from: a */
    public void mo5456a(C1244c cVar, float f) {
        C1246e a = mo5455a(cVar);
        boolean b = cVar.mo5462b();
        boolean a2 = cVar.mo5461a();
        if (f != a.f3532b || a.f3533c != b || a.f3534d != a2) {
            a.f3532b = f;
            a.f3533c = b;
            a.f3534d = a2;
            a.mo5465a(null);
            throw null;
        } else if (!cVar.mo5462b()) {
            cVar.mo5460a(0, 0, 0, 0);
        } else {
            float f2 = mo5455a(cVar).f3532b;
            float f3 = mo5455a(cVar).f3531a;
            int ceil = (int) Math.ceil((double) C1247f.m3132a(f2, f3, cVar.mo5461a()));
            int ceil2 = (int) Math.ceil((double) C1247f.m3133b(f2, f3, cVar.mo5461a()));
            cVar.mo5460a(ceil, ceil2, ceil, ceil2);
        }
    }
}
