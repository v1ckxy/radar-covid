package p124p.p137c.p138a.p139a;

import java.util.concurrent.Executor;

/* renamed from: p.c.a.a.a */
public class C1229a extends C1233c {

    /* renamed from: c */
    public static volatile C1229a f3506c;

    /* renamed from: d */
    public static final Executor f3507d = new C1230a();

    /* renamed from: a */
    public C1233c f3508a;

    /* renamed from: b */
    public C1233c f3509b;

    /* renamed from: p.c.a.a.a$a */
    public static class C1230a implements Executor {
        public void execute(Runnable runnable) {
            C1229a.m3095b().f3508a.mo5405a(runnable);
        }
    }

    public C1229a() {
        C1231b bVar = new C1231b();
        this.f3509b = bVar;
        this.f3508a = bVar;
    }

    /* renamed from: b */
    public static C1229a m3095b() {
        if (f3506c != null) {
            return f3506c;
        }
        synchronized (C1229a.class) {
            if (f3506c == null) {
                f3506c = new C1229a();
            }
        }
        return f3506c;
    }

    /* renamed from: a */
    public void mo5405a(Runnable runnable) {
        this.f3508a.mo5405a(runnable);
    }

    /* renamed from: a */
    public boolean mo5406a() {
        return this.f3508a.mo5406a();
    }

    /* renamed from: b */
    public void mo5407b(Runnable runnable) {
        this.f3508a.mo5407b(runnable);
    }
}
