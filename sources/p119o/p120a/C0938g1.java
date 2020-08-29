package p119o.p120a;

import p119o.p120a.p121a.C0910o;

/* renamed from: o.a.g1 */
public final class C0938g1 {

    /* renamed from: a */
    public static final C0910o f2550a = new C0910o("COMPLETING_ALREADY");

    /* renamed from: b */
    public static final C0910o f2551b = new C0910o("COMPLETING_WAITING_CHILDREN");

    /* renamed from: c */
    public static final C0910o f2552c = new C0910o("COMPLETING_RETRY");

    /* renamed from: d */
    public static final C0910o f2553d = new C0910o("TOO_LATE_TO_CANCEL");

    /* renamed from: e */
    public static final C0910o f2554e = new C0910o("SEALED");

    /* renamed from: f */
    public static final C0952l0 f2555f = new C0952l0(false);

    /* renamed from: g */
    public static final C0952l0 f2556g = new C0952l0(true);

    /* renamed from: a */
    public static final Object m2095a(Object obj) {
        return obj instanceof C1003v0 ? new C1005w0((C1003v0) obj) : obj;
    }

    /* renamed from: b */
    public static final Object m2096b(Object obj) {
        C1005w0 w0Var = (C1005w0) (!(obj instanceof C1005w0) ? null : obj);
        if (w0Var == null) {
            return obj;
        }
        C1003v0 v0Var = w0Var.f2653a;
        return v0Var != null ? v0Var : obj;
    }
}
