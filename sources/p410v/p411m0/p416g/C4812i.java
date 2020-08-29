package p410v.p411m0.p416g;

import p392u.p401r.p403c.C4638h;

/* renamed from: v.m0.g.i */
public final class C4812i implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ String f11453e;

    /* renamed from: f */
    public final /* synthetic */ C4797f f11454f;

    /* renamed from: g */
    public final /* synthetic */ int f11455g;

    /* renamed from: h */
    public final /* synthetic */ C4790b f11456h;

    public C4812i(String str, C4797f fVar, int i, C4790b bVar) {
        this.f11453e = str;
        this.f11454f = fVar;
        this.f11455g = i;
        this.f11456h = bVar;
    }

    public final void run() {
        String str = this.f11453e;
        Thread currentThread = Thread.currentThread();
        C4638h.m10270a((Object) currentThread, "currentThread");
        String name = currentThread.getName();
        currentThread.setName(str);
        try {
            this.f11454f.f11393n.mo11282a(this.f11455g, this.f11456h);
            synchronized (this.f11454f) {
                this.f11454f.f11404y.remove(Integer.valueOf(this.f11455g));
            }
            currentThread.setName(name);
        } catch (Throwable th) {
            currentThread.setName(name);
            throw th;
        }
    }
}
