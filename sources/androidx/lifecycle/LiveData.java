package androidx.lifecycle;

import java.util.Map.Entry;
import p124p.p137c.p138a.p139a.C1229a;
import p124p.p137c.p138a.p140b.C1235b;
import p124p.p137c.p138a.p140b.C1235b.C1239d;
import p124p.p177n.C1537e.C1538a;
import p124p.p177n.C1537e.C1539b;
import p124p.p177n.C1540f;
import p124p.p177n.C1542h;
import p124p.p177n.C1543i;
import p124p.p177n.C1550o;
import p213q.p214a.p215a.p216a.C1965a;

public abstract class LiveData<T> {

    /* renamed from: j */
    public static final Object f657j = new Object();

    /* renamed from: a */
    public final Object f658a = new Object();

    /* renamed from: b */
    public C1235b<C1550o<? super T>, C0089b> f659b = new C1235b<>();

    /* renamed from: c */
    public int f660c = 0;

    /* renamed from: d */
    public volatile Object f661d = f657j;

    /* renamed from: e */
    public volatile Object f662e = f657j;

    /* renamed from: f */
    public int f663f = -1;

    /* renamed from: g */
    public boolean f664g;

    /* renamed from: h */
    public boolean f665h;

    /* renamed from: i */
    public final Runnable f666i = new C0088a();

    public class LifecycleBoundObserver extends C0089b implements C1540f {

        /* renamed from: e */
        public final C1542h f667e;

        /* renamed from: f */
        public final /* synthetic */ LiveData f668f;

        /* renamed from: a */
        public void mo9a(C1542h hVar, C1538a aVar) {
            if (((C1543i) this.f667e.mo2g()).f4559b == C1539b.DESTROYED) {
                this.f668f.mo837a(this.f670a);
            } else {
                mo842a(((C1543i) this.f667e.mo2g()).f4559b.mo6228a(C1539b.STARTED));
            }
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$a */
    public class C0088a implements Runnable {
        public C0088a() {
        }

        public void run() {
            Object obj;
            synchronized (LiveData.this.f658a) {
                obj = LiveData.this.f662e;
                LiveData.this.f662e = LiveData.f657j;
            }
            LiveData.this.mo840b(obj);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$b */
    public abstract class C0089b {

        /* renamed from: a */
        public final C1550o<? super T> f670a;

        /* renamed from: b */
        public boolean f671b;

        /* renamed from: c */
        public int f672c;

        /* renamed from: d */
        public final /* synthetic */ LiveData f673d;

        /* renamed from: a */
        public void mo842a(boolean z) {
            if (z != this.f671b) {
                this.f671b = z;
                int i = 1;
                boolean z2 = this.f673d.f660c == 0;
                LiveData liveData = this.f673d;
                int i2 = liveData.f660c;
                if (!this.f671b) {
                    i = -1;
                }
                liveData.f660c = i2 + i;
                if (z2 && this.f671b) {
                    this.f673d.mo834a();
                }
                LiveData liveData2 = this.f673d;
                if (liveData2.f660c == 0 && !this.f671b) {
                    liveData2.mo838b();
                }
                if (this.f671b) {
                    this.f673d.mo839b(this);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m317a(String str) {
        if (!C1229a.m3095b().f3508a.mo5406a()) {
            throw new IllegalStateException(C1965a.m4752a("Cannot invoke ", str, " on a background thread"));
        }
    }

    /* renamed from: a */
    public void mo834a() {
    }

    /* renamed from: b */
    public void mo838b() {
    }

    /* renamed from: b */
    public void mo839b(C0089b bVar) {
        if (this.f664g) {
            this.f665h = true;
            return;
        }
        this.f664g = true;
        do {
            this.f665h = false;
            if (bVar == null) {
                C1239d c = this.f659b.mo5415c();
                while (c.hasNext()) {
                    mo835a((C0089b) ((Entry) c.next()).getValue());
                    if (this.f665h) {
                        break;
                    }
                }
            } else {
                mo835a(bVar);
                bVar = null;
            }
        } while (this.f665h);
        this.f664g = false;
    }

    /* renamed from: b */
    public abstract void mo840b(T t);

    /* renamed from: a */
    public final void mo835a(C0089b bVar) {
        if (bVar.f671b) {
            if (!((C1543i) ((LifecycleBoundObserver) bVar).f667e.mo2g()).f4559b.mo6228a(C1539b.STARTED)) {
                bVar.mo842a(false);
                return;
            }
            int i = bVar.f672c;
            int i2 = this.f663f;
            if (i < i2) {
                bVar.f672c = i2;
                bVar.f670a.mo6237a(this.f661d);
            }
        }
    }

    /* renamed from: a */
    public void mo836a(T t) {
        boolean z;
        synchronized (this.f658a) {
            z = this.f662e == f657j;
            this.f662e = t;
        }
        if (z) {
            C1229a.m3095b().f3508a.mo5407b(this.f666i);
        }
    }

    /* renamed from: a */
    public void mo837a(C1550o<? super T> oVar) {
        m317a("removeObserver");
        C0089b bVar = (C0089b) this.f659b.remove(oVar);
        if (bVar != null) {
            LifecycleBoundObserver lifecycleBoundObserver = (LifecycleBoundObserver) bVar;
            ((C1543i) lifecycleBoundObserver.f667e.mo2g()).f4558a.remove(lifecycleBoundObserver);
            bVar.mo842a(false);
        }
    }
}
