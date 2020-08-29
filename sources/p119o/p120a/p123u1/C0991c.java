package p119o.p120a.p123u1;

import java.util.concurrent.RejectedExecutionException;
import p119o.p120a.C0928e0;
import p119o.p120a.C0976s0;
import p392u.p395p.C4583f;

/* renamed from: o.a.u1.c */
public class C0991c extends C0976s0 {

    /* renamed from: f */
    public C0987a f2628f;

    /* renamed from: g */
    public final int f2629g;

    /* renamed from: h */
    public final int f2630h;

    /* renamed from: i */
    public final long f2631i;

    /* renamed from: j */
    public final String f2632j;

    public /* synthetic */ C0991c(int i, int i2, String str, int i3) {
        if ((i3 & 1) != 0) {
            i = C0999k.f2644b;
        }
        if ((i3 & 2) != 0) {
            i2 = C0999k.f2645c;
        }
        if ((i3 & 4) != 0) {
            str = "DefaultDispatcher";
        }
        long j = C0999k.f2646d;
        this.f2629g = i;
        this.f2630h = i2;
        this.f2631i = j;
        this.f2632j = str;
        C0987a aVar = new C0987a(this.f2629g, this.f2630h, this.f2631i, this.f2632j);
        this.f2628f = aVar;
    }

    /* renamed from: a */
    public void mo4301a(C4583f fVar, Runnable runnable) {
        try {
            C0987a.m2264a(this.f2628f, runnable, null, false, 6);
        } catch (RejectedExecutionException unused) {
            C0928e0.f2529l.mo4300a(runnable);
        }
    }
}
