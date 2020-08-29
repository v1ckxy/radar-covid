package p213q.p217b.p218a.p231b.p259h.p261b;

/* renamed from: q.b.a.b.h.b.y5 */
public final class C3174y5 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ String f7980e;

    /* renamed from: f */
    public final /* synthetic */ String f7981f;

    /* renamed from: g */
    public final /* synthetic */ String f7982g;

    /* renamed from: h */
    public final /* synthetic */ long f7983h;

    /* renamed from: i */
    public final /* synthetic */ C2981h5 f7984i;

    public C3174y5(C2981h5 h5Var, String str, String str2, String str3, long j) {
        this.f7984i = h5Var;
        this.f7980e = str;
        this.f7981f = str2;
        this.f7982g = str3;
        this.f7983h = j;
    }

    public final void run() {
        String str = this.f7980e;
        if (str == null) {
            this.f7984i.f7375a.f7537i.mo8476s().mo8676a(this.f7981f, (C3044m7) null);
            return;
        }
        this.f7984i.f7375a.f7537i.mo8476s().mo8676a(this.f7981f, new C3044m7(this.f7982g, str, this.f7983h));
    }
}
