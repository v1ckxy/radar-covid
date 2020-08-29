package p124p.p199y.p200x;

import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.os.Build.VERSION;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p124p.p182q.C1648k;
import p124p.p188t.p189a.p190f.C1684f;
import p124p.p199y.C1785b;
import p124p.p199y.C1785b.C1787b;
import p124p.p199y.C1794f;
import p124p.p199y.C1795g;
import p124p.p199y.C1800l;
import p124p.p199y.C1800l.C1801a;
import p124p.p199y.C1805o;
import p124p.p199y.C1811p;
import p124p.p199y.C1814r;
import p124p.p199y.C1817u;
import p124p.p199y.p200x.p201p.p202a.C1849c;
import p124p.p199y.p200x.p201p.p204c.C1860b;
import p124p.p199y.p200x.p209s.C1916r;
import p124p.p199y.p200x.p210t.C1937h;
import p124p.p199y.p200x.p210t.C1941k;
import p124p.p199y.p200x.p210t.p212q.C1962a;
import p124p.p199y.p200x.p210t.p212q.C1963b;

/* renamed from: p.y.x.l */
public class C1842l extends C1817u {

    /* renamed from: j */
    public static C1842l f5345j;

    /* renamed from: k */
    public static C1842l f5346k;

    /* renamed from: l */
    public static final Object f5347l = new Object();

    /* renamed from: a */
    public Context f5348a;

    /* renamed from: b */
    public C1785b f5349b;

    /* renamed from: c */
    public WorkDatabase f5350c;

    /* renamed from: d */
    public C1962a f5351d;

    /* renamed from: e */
    public List<C1827e> f5352e;

    /* renamed from: f */
    public C1825d f5353f;

    /* renamed from: g */
    public C1937h f5354g;

    /* renamed from: h */
    public boolean f5355h = false;

    /* renamed from: i */
    public PendingResult f5356i;

    public C1842l(Context context, C1785b bVar, C1962a aVar) {
        WorkDatabase a = WorkDatabase.m829a(context.getApplicationContext(), ((C1963b) aVar).f5626a, context.getResources().getBoolean(C1814r.workmanager_test_configuration));
        Context applicationContext = context.getApplicationContext();
        C1800l.m4461a((C1800l) new C1801a(bVar.f5230f));
        List<C1827e> asList = Arrays.asList(new C1827e[]{C1828f.m4500a(applicationContext, this), new C1849c(applicationContext, bVar, aVar, this)});
        C1825d dVar = new C1825d(context, bVar, aVar, a, asList);
        Context applicationContext2 = context.getApplicationContext();
        this.f5348a = applicationContext2;
        this.f5349b = bVar;
        this.f5351d = aVar;
        this.f5350c = a;
        this.f5352e = asList;
        this.f5353f = dVar;
        this.f5354g = new C1937h(a);
        if (VERSION.SDK_INT < 24 || !applicationContext2.isDeviceProtectedStorage()) {
            C1962a aVar2 = this.f5351d;
            ((C1963b) aVar2).f5626a.execute(new ForceStopRunnable(applicationContext2, this));
            return;
        }
        throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
    }

    /* renamed from: a */
    public static C1842l m4517a(Context context) {
        C1842l c;
        synchronized (f5347l) {
            c = m4519c();
            if (c == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof C1787b) {
                    m4518a(applicationContext, ((C1787b) applicationContext).mo6765a());
                    c = m4517a(applicationContext);
                } else {
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            }
        }
        return c;
    }

    @Deprecated
    /* renamed from: c */
    public static C1842l m4519c() {
        synchronized (f5347l) {
            if (f5345j != null) {
                C1842l lVar = f5345j;
                return lVar;
            }
            C1842l lVar2 = f5346k;
            return lVar2;
        }
    }

    /* renamed from: a */
    public C1805o mo6792a(String str, C1794f fVar, C1811p pVar) {
        C1829g gVar = new C1829g(this, str, fVar == C1794f.KEEP ? C1795g.KEEP : C1795g.REPLACE, Collections.singletonList(pVar), null);
        return gVar.mo6812a();
    }

    /* renamed from: a */
    public void mo6813a() {
        synchronized (f5347l) {
            this.f5355h = true;
            if (this.f5356i != null) {
                this.f5356i.finish();
                this.f5356i = null;
            }
        }
    }

    /* renamed from: a */
    public void mo6814a(PendingResult pendingResult) {
        synchronized (f5347l) {
            this.f5356i = pendingResult;
            if (this.f5355h) {
                pendingResult.finish();
                this.f5356i = null;
            }
        }
    }

    /* renamed from: b */
    public void mo6816b() {
        C1860b.m4573a(this.f5348a);
        C1916r rVar = (C1916r) this.f5350c.mo1462m();
        rVar.f5546a.mo6415b();
        C1684f a = rVar.f5554i.mo6441a();
        rVar.f5546a.mo6416c();
        try {
            a.mo6508a();
            rVar.f5546a.mo6420g();
            rVar.f5546a.mo6417d();
            C1648k kVar = rVar.f5554i;
            if (a == kVar.f4861c) {
                kVar.f4859a.set(false);
            }
            C1828f.m4501a(this.f5349b, this.f5350c, this.f5352e);
        } catch (Throwable th) {
            rVar.f5546a.mo6417d();
            rVar.f5554i.mo6442a(a);
            throw th;
        }
    }

    /* renamed from: a */
    public static void m4518a(Context context, C1785b bVar) {
        synchronized (f5347l) {
            if (f5345j != null) {
                if (f5346k != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
            }
            if (f5345j == null) {
                Context applicationContext = context.getApplicationContext();
                if (f5346k == null) {
                    f5346k = new C1842l(applicationContext, bVar, new C1963b(bVar.f5226b));
                }
                f5345j = f5346k;
            }
        }
    }

    /* renamed from: a */
    public void mo6815a(String str) {
        C1962a aVar = this.f5351d;
        ((C1963b) aVar).f5626a.execute(new C1941k(this, str, false));
    }
}
