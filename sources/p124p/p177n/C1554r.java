package p124p.p177n;

import android.os.Handler;
import p124p.p177n.C1537e.C1538a;

/* renamed from: p.n.r */
public class C1554r {

    /* renamed from: a */
    public final C1543i f4571a;

    /* renamed from: b */
    public final Handler f4572b = new Handler();

    /* renamed from: c */
    public C1555a f4573c;

    /* renamed from: p.n.r$a */
    public static class C1555a implements Runnable {

        /* renamed from: e */
        public final C1543i f4574e;

        /* renamed from: f */
        public final C1538a f4575f;

        /* renamed from: g */
        public boolean f4576g = false;

        public C1555a(C1543i iVar, C1538a aVar) {
            this.f4574e = iVar;
            this.f4575f = aVar;
        }

        public void run() {
            if (!this.f4576g) {
                this.f4574e.mo6230a(this.f4575f);
                this.f4576g = true;
            }
        }
    }

    public C1554r(C1542h hVar) {
        this.f4571a = new C1543i(hVar);
    }

    /* renamed from: a */
    public final void mo6249a(C1538a aVar) {
        C1555a aVar2 = this.f4573c;
        if (aVar2 != null) {
            aVar2.run();
        }
        C1555a aVar3 = new C1555a(this.f4571a, aVar);
        this.f4573c = aVar3;
        this.f4572b.postAtFrontOfQueue(aVar3);
    }
}
