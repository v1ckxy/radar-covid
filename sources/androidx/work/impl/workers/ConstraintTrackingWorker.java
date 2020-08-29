package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.ListenableWorker.C0177a;
import androidx.work.ListenableWorker.C0177a.C0178a;
import androidx.work.ListenableWorker.C0177a.C0179b;
import androidx.work.WorkerParameters;
import java.util.Collections;
import java.util.List;
import p124p.p199y.C1800l;
import p124p.p199y.p200x.C1842l;
import p124p.p199y.p200x.p205q.C1863c;
import p124p.p199y.p200x.p205q.C1864d;
import p124p.p199y.p200x.p209s.C1913p;
import p124p.p199y.p200x.p209s.C1916r;
import p124p.p199y.p200x.p210t.p211p.C1949a;
import p124p.p199y.p200x.p210t.p211p.C1961c;
import p213q.p217b.p298b.p299a.p300a.C3498a;

public class ConstraintTrackingWorker extends ListenableWorker implements C1863c {

    /* renamed from: m */
    public static final String f1031m = C1800l.m4459a("ConstraintTrkngWrkr");

    /* renamed from: h */
    public WorkerParameters f1032h;

    /* renamed from: i */
    public final Object f1033i = new Object();

    /* renamed from: j */
    public volatile boolean f1034j = false;

    /* renamed from: k */
    public C1961c<C0177a> f1035k = new C1961c<>();

    /* renamed from: l */
    public ListenableWorker f1036l;

    /* renamed from: androidx.work.impl.workers.ConstraintTrackingWorker$a */
    public class C0188a implements Runnable {
        public C0188a() {
        }

        public void run() {
            ConstraintTrackingWorker.this.mo1502g();
        }
    }

    /* renamed from: androidx.work.impl.workers.ConstraintTrackingWorker$b */
    public class C0189b implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ C3498a f1038e;

        public C0189b(C3498a aVar) {
            this.f1038e = aVar;
        }

        public void run() {
            synchronized (ConstraintTrackingWorker.this.f1033i) {
                if (ConstraintTrackingWorker.this.f1034j) {
                    ConstraintTrackingWorker.this.mo1501f();
                } else {
                    ConstraintTrackingWorker.this.f1035k.mo6959b(this.f1038e);
                }
            }
        }
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f1032h = workerParameters;
    }

    /* renamed from: a */
    public void mo1498a(List<String> list) {
        C1800l.m4460a().mo6782a(f1031m, String.format("Constraints changed for %s", new Object[]{list}), new Throwable[0]);
        synchronized (this.f1033i) {
            this.f1034j = true;
        }
    }

    /* renamed from: a */
    public boolean mo1442a() {
        ListenableWorker listenableWorker = this.f1036l;
        return listenableWorker != null && listenableWorker.mo1442a();
    }

    /* renamed from: b */
    public void mo1443b() {
        ListenableWorker listenableWorker = this.f1036l;
        if (listenableWorker != null) {
            listenableWorker.mo1445d();
        }
    }

    /* renamed from: b */
    public void mo1499b(List<String> list) {
    }

    /* renamed from: c */
    public C3498a<C0177a> mo1444c() {
        this.f979f.f987c.execute(new C0188a());
        return this.f1035k;
    }

    /* renamed from: e */
    public void mo1500e() {
        this.f1035k.mo6960c(new C0178a());
    }

    /* renamed from: f */
    public void mo1501f() {
        this.f1035k.mo6960c(new C0179b());
    }

    /* renamed from: g */
    public void mo1502g() {
        Object obj = this.f979f.f986b.f5265a.get("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        String str = obj instanceof String ? (String) obj : null;
        if (TextUtils.isEmpty(str)) {
            C1800l.m4460a().mo6783b(f1031m, "No worker to delegate to.", new Throwable[0]);
        } else {
            ListenableWorker a = this.f979f.f988d.mo6795a(this.f978e, str, this.f1032h);
            this.f1036l = a;
            if (a == null) {
                C1800l.m4460a().mo6782a(f1031m, "No worker to delegate to.", new Throwable[0]);
            } else {
                C1913p e = ((C1916r) C1842l.m4517a(this.f978e).f5350c.mo1462m()).mo6914e(this.f979f.f985a.toString());
                if (e == null) {
                    mo1500e();
                    return;
                }
                Context context = this.f978e;
                C1864d dVar = new C1864d(context, C1842l.m4517a(context).f5351d, this);
                dVar.mo6854a((Iterable<C1913p>) Collections.singletonList(e));
                if (dVar.mo6856a(this.f979f.f985a.toString())) {
                    C1800l.m4460a().mo6782a(f1031m, String.format("Constraints met for delegate %s", new Object[]{str}), new Throwable[0]);
                    try {
                        C3498a c = this.f1036l.mo1444c();
                        ((C1949a) c).mo6940a(new C0189b(c), this.f979f.f987c);
                    } catch (Throwable th) {
                        C1800l.m4460a().mo6782a(f1031m, String.format("Delegated worker %s threw exception in startWork.", new Object[]{str}), th);
                        synchronized (this.f1033i) {
                            if (this.f1034j) {
                                C1800l.m4460a().mo6782a(f1031m, "Constraints were unmet, Retrying.", new Throwable[0]);
                                mo1501f();
                            } else {
                                mo1500e();
                            }
                        }
                    }
                } else {
                    C1800l.m4460a().mo6782a(f1031m, String.format("Constraints not met for delegate %s. Requesting retry.", new Object[]{str}), new Throwable[0]);
                    mo1501f();
                }
                return;
            }
        }
        mo1500e();
    }
}
