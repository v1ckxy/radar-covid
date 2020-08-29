package p124p.p199y.p200x.p205q.p207f;

import android.content.Context;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p124p.p199y.C1800l;
import p124p.p199y.p200x.p205q.C1861a;
import p124p.p199y.p200x.p210t.p212q.C1962a;

/* renamed from: p.y.x.q.f.d */
public abstract class C1878d<T> {

    /* renamed from: f */
    public static final String f5468f = C1800l.m4459a("ConstraintTracker");

    /* renamed from: a */
    public final C1962a f5469a;

    /* renamed from: b */
    public final Context f5470b;

    /* renamed from: c */
    public final Object f5471c = new Object();

    /* renamed from: d */
    public final Set<C1861a<T>> f5472d = new LinkedHashSet();

    /* renamed from: e */
    public T f5473e;

    /* renamed from: p.y.x.q.f.d$a */
    public class C1879a implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ List f5474e;

        public C1879a(List list) {
            this.f5474e = list;
        }

        public void run() {
            for (C1861a a : this.f5474e) {
                a.mo6849a(C1878d.this.f5473e);
            }
        }
    }

    public C1878d(Context context, C1962a aVar) {
        this.f5470b = context.getApplicationContext();
        this.f5469a = aVar;
    }

    /* renamed from: a */
    public abstract T mo6862a();

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6868a(T r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f5471c
            monitor-enter(r0)
            T r1 = r3.f5473e     // Catch:{ all -> 0x002f }
            if (r1 == r4) goto L_0x002d
            T r1 = r3.f5473e     // Catch:{ all -> 0x002f }
            if (r1 == 0) goto L_0x0014
            T r1 = r3.f5473e     // Catch:{ all -> 0x002f }
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x002f }
            if (r1 == 0) goto L_0x0014
            goto L_0x002d
        L_0x0014:
            r3.f5473e = r4     // Catch:{ all -> 0x002f }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x002f }
            java.util.Set<p.y.x.q.a<T>> r1 = r3.f5472d     // Catch:{ all -> 0x002f }
            r4.<init>(r1)     // Catch:{ all -> 0x002f }
            p.y.x.t.q.a r1 = r3.f5469a     // Catch:{ all -> 0x002f }
            p.y.x.t.q.b r1 = (p124p.p199y.p200x.p210t.p212q.C1963b) r1     // Catch:{ all -> 0x002f }
            java.util.concurrent.Executor r1 = r1.f5628c     // Catch:{ all -> 0x002f }
            p.y.x.q.f.d$a r2 = new p.y.x.q.f.d$a     // Catch:{ all -> 0x002f }
            r2.<init>(r4)     // Catch:{ all -> 0x002f }
            r1.execute(r2)     // Catch:{ all -> 0x002f }
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return
        L_0x002d:
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return
        L_0x002f:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p199y.p200x.p205q.p207f.C1878d.mo6868a(java.lang.Object):void");
    }

    /* renamed from: a */
    public void mo6869a(C1861a<T> aVar) {
        synchronized (this.f5471c) {
            if (this.f5472d.add(aVar)) {
                if (this.f5472d.size() == 1) {
                    this.f5473e = mo6862a();
                    C1800l.m4460a().mo6782a(f5468f, String.format("%s: initial state = %s", new Object[]{getClass().getSimpleName(), this.f5473e}), new Throwable[0]);
                    mo6865b();
                }
                aVar.mo6849a(this.f5473e);
            }
        }
    }

    /* renamed from: b */
    public abstract void mo6865b();

    /* renamed from: b */
    public void mo6870b(C1861a<T> aVar) {
        synchronized (this.f5471c) {
            if (this.f5472d.remove(aVar) && this.f5472d.isEmpty()) {
                mo6866c();
            }
        }
    }

    /* renamed from: c */
    public abstract void mo6866c();
}
