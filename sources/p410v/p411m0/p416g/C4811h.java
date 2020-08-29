package p410v.p411m0.p416g;

import java.io.IOException;
import java.util.List;
import p392u.p401r.p403c.C4638h;

/* renamed from: v.m0.g.h */
public final class C4811h implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ String f11448e;

    /* renamed from: f */
    public final /* synthetic */ C4797f f11449f;

    /* renamed from: g */
    public final /* synthetic */ int f11450g;

    /* renamed from: h */
    public final /* synthetic */ List f11451h;

    /* renamed from: i */
    public final /* synthetic */ boolean f11452i;

    public C4811h(String str, C4797f fVar, int i, List list, boolean z) {
        this.f11448e = str;
        this.f11449f = fVar;
        this.f11450g = i;
        this.f11451h = list;
        this.f11452i = z;
    }

    public final void run() {
        String str = this.f11448e;
        Thread currentThread = Thread.currentThread();
        C4638h.m10270a((Object) currentThread, "currentThread");
        String name = currentThread.getName();
        currentThread.setName(str);
        try {
            boolean a = this.f11449f.f11393n.mo11284a(this.f11450g, this.f11451h, this.f11452i);
            if (a) {
                try {
                    this.f11449f.f11402w.mo11271a(this.f11450g, C4790b.CANCEL);
                } catch (IOException unused) {
                }
            }
            if (a || this.f11452i) {
                synchronized (this.f11449f) {
                    this.f11449f.f11404y.remove(Integer.valueOf(this.f11450g));
                }
            }
        } finally {
            currentThread.setName(name);
        }
    }
}
