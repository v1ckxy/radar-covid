package p213q.p217b.p317d.p322h.p323e.p326k;

import p213q.p217b.p317d.p322h.p323e.p337s.p338i.C4173b;

/* renamed from: q.b.d.h.e.k.m0 */
public enum C3961m0 {
    NONE,
    JAVA_ONLY,
    ALL;

    /* renamed from: a */
    public static C3961m0 m9386a(C4173b bVar) {
        boolean z = true;
        boolean z2 = bVar.f10098g == 2;
        if (bVar.f10099h != 2) {
            z = false;
        }
        if (!z2) {
            return NONE;
        }
        return !z ? JAVA_ONLY : ALL;
    }
}
