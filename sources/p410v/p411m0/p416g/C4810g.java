package p410v.p411m0.p416g;

import java.io.IOException;
import p392u.p401r.p403c.C4638h;
import p423w.C4892f;

/* renamed from: v.m0.g.g */
public final class C4810g implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ String f11442e;

    /* renamed from: f */
    public final /* synthetic */ C4797f f11443f;

    /* renamed from: g */
    public final /* synthetic */ int f11444g;

    /* renamed from: h */
    public final /* synthetic */ C4892f f11445h;

    /* renamed from: i */
    public final /* synthetic */ int f11446i;

    /* renamed from: j */
    public final /* synthetic */ boolean f11447j;

    public C4810g(String str, C4797f fVar, int i, C4892f fVar2, int i2, boolean z) {
        this.f11442e = str;
        this.f11443f = fVar;
        this.f11444g = i;
        this.f11445h = fVar2;
        this.f11446i = i2;
        this.f11447j = z;
    }

    public final void run() {
        String str = this.f11442e;
        Thread currentThread = Thread.currentThread();
        C4638h.m10270a((Object) currentThread, "currentThread");
        String name = currentThread.getName();
        currentThread.setName(str);
        try {
            boolean a = this.f11443f.f11393n.mo11285a(this.f11444g, this.f11445h, this.f11446i, this.f11447j);
            if (a) {
                this.f11443f.f11402w.mo11271a(this.f11444g, C4790b.CANCEL);
            }
            if (a || this.f11447j) {
                synchronized (this.f11443f) {
                    this.f11443f.f11404y.remove(Integer.valueOf(this.f11444g));
                }
            }
        } catch (IOException unused) {
        } catch (Throwable th) {
            currentThread.setName(name);
            throw th;
        }
        currentThread.setName(name);
    }
}
