package p369s.p370a.p371a.p378f.p387g;

import java.util.concurrent.ThreadFactory;
import p369s.p370a.p371a.p374b.C4445l;
import p369s.p370a.p371a.p374b.C4445l.C4447b;

/* renamed from: s.a.a.f.g.c */
public final class C4519c extends C4445l {

    /* renamed from: b */
    public static final C4521e f10710b = new C4521e("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx3.newthread-priority", 5).intValue())));

    /* renamed from: a */
    public final ThreadFactory f10711a = f10710b;

    /* renamed from: a */
    public C4447b mo10711a() {
        return new C4520d(this.f10711a);
    }
}
