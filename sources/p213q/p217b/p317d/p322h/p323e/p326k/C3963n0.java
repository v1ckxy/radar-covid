package p213q.p217b.p317d.p322h.p323e.p326k;

/* renamed from: q.b.d.h.e.k.n0 */
public enum C3963n0 {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);
    

    /* renamed from: e */
    public final int f9680e;

    /* access modifiers changed from: public */
    C3963n0(int i) {
        this.f9680e = i;
    }

    /* renamed from: a */
    public static C3963n0 m9387a(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    public String toString() {
        return Integer.toString(this.f9680e);
    }
}
