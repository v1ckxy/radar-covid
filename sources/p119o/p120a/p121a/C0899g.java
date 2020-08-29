package p119o.p120a.p121a;

import p392u.C4557i;

/* renamed from: o.a.a.g */
public final class C0899g {

    /* renamed from: a */
    public static final Object f2485a = new C0910o("CONDITION_FALSE");

    /* renamed from: a */
    public static final C0900h m1978a(Object obj) {
        C0908m mVar = (C0908m) (!(obj instanceof C0908m) ? null : obj);
        if (mVar != null) {
            C0900h hVar = mVar.f2503a;
            if (hVar != null) {
                return hVar;
            }
        }
        if (obj != null) {
            return (C0900h) obj;
        }
        throw new C4557i("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }
}
