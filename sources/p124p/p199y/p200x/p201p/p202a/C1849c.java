package p124p.p199y.p200x.p201p.p202a;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.Application;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Process;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p124p.p199y.C1785b;
import p124p.p199y.C1788c;
import p124p.p199y.C1800l;
import p124p.p199y.C1816t;
import p124p.p199y.p200x.C1823b;
import p124p.p199y.p200x.C1827e;
import p124p.p199y.p200x.C1842l;
import p124p.p199y.p200x.p205q.C1863c;
import p124p.p199y.p200x.p205q.C1864d;
import p124p.p199y.p200x.p209s.C1913p;
import p124p.p199y.p200x.p210t.C1940j;
import p124p.p199y.p200x.p210t.p212q.C1962a;
import p124p.p199y.p200x.p210t.p212q.C1963b;

/* renamed from: p.y.x.p.a.c */
public class C1849c implements C1827e, C1863c, C1823b {

    /* renamed from: m */
    public static final String f5397m = C1800l.m4459a("GreedyScheduler");

    /* renamed from: e */
    public final Context f5398e;

    /* renamed from: f */
    public final C1842l f5399f;

    /* renamed from: g */
    public final C1864d f5400g;

    /* renamed from: h */
    public final Set<C1913p> f5401h = new HashSet();

    /* renamed from: i */
    public C1848b f5402i;

    /* renamed from: j */
    public boolean f5403j;

    /* renamed from: k */
    public final Object f5404k;

    /* renamed from: l */
    public Boolean f5405l;

    public C1849c(Context context, C1785b bVar, C1962a aVar, C1842l lVar) {
        this.f5398e = context;
        this.f5399f = lVar;
        this.f5400g = new C1864d(context, aVar, this);
        this.f5402i = new C1848b(this, bVar.f5229e);
        this.f5404k = new Object();
    }

    /* renamed from: a */
    public void mo6809a(String str) {
        if (this.f5405l == null) {
            this.f5405l = Boolean.valueOf(TextUtils.equals(this.f5398e.getPackageName(), mo6830b()));
        }
        if (!this.f5405l.booleanValue()) {
            C1800l.m4460a().mo6784c(f5397m, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        if (!this.f5403j) {
            this.f5399f.f5353f.mo6798a((C1823b) this);
            this.f5403j = true;
        }
        C1800l.m4460a().mo6782a(f5397m, String.format("Cancelling work ID %s", new Object[]{str}), new Throwable[0]);
        C1848b bVar = this.f5402i;
        if (bVar != null) {
            Runnable runnable = (Runnable) bVar.f5396c.remove(str);
            if (runnable != null) {
                bVar.f5395b.f5305a.removeCallbacks(runnable);
            }
        }
        this.f5399f.mo6815a(str);
    }

    /* renamed from: a */
    public void mo1480a(String str, boolean z) {
        mo6831b(str);
    }

    /* renamed from: a */
    public void mo1498a(List<String> list) {
        for (String str : list) {
            C1800l.m4460a().mo6782a(f5397m, String.format("Constraints not met: Cancelling work ID %s", new Object[]{str}), new Throwable[0]);
            this.f5399f.mo6815a(str);
        }
    }

    /* renamed from: a */
    public boolean mo6811a() {
        return false;
    }

    /* renamed from: b */
    public final String mo6830b() {
        if (VERSION.SDK_INT >= 28) {
            return Application.getProcessName();
        }
        String str = null;
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, C1849c.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            if (invoke instanceof String) {
                return (String) invoke;
            }
        } catch (Throwable th) {
            C1800l.m4460a().mo6782a(f5397m, "Unable to check ActivityThread for processName", th);
        }
        int myPid = Process.myPid();
        ActivityManager activityManager = (ActivityManager) this.f5398e.getSystemService("activity");
        if (activityManager != null) {
            List runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses != null && !runningAppProcesses.isEmpty()) {
                Iterator it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    RunningAppProcessInfo runningAppProcessInfo = (RunningAppProcessInfo) it.next();
                    if (runningAppProcessInfo.pid == myPid) {
                        str = runningAppProcessInfo.processName;
                        break;
                    }
                }
            }
        }
        return str;
    }

    /* renamed from: b */
    public final void mo6831b(String str) {
        synchronized (this.f5404k) {
            Iterator it = this.f5401h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C1913p pVar = (C1913p) it.next();
                if (pVar.f5527a.equals(str)) {
                    C1800l.m4460a().mo6782a(f5397m, String.format("Stopping tracking for %s", new Object[]{str}), new Throwable[0]);
                    this.f5401h.remove(pVar);
                    this.f5400g.mo6854a((Iterable<C1913p>) this.f5401h);
                    break;
                }
            }
        }
    }

    /* renamed from: b */
    public void mo1499b(List<String> list) {
        for (String str : list) {
            C1800l.m4460a().mo6782a(f5397m, String.format("Constraints met: Scheduling work ID %s", new Object[]{str}), new Throwable[0]);
            C1842l lVar = this.f5399f;
            C1962a aVar = lVar.f5351d;
            ((C1963b) aVar).f5626a.execute(new C1940j(lVar, str, null));
        }
    }

    /* renamed from: a */
    public void mo6810a(C1913p... pVarArr) {
        if (this.f5405l == null) {
            this.f5405l = Boolean.valueOf(TextUtils.equals(this.f5398e.getPackageName(), mo6830b()));
        }
        if (!this.f5405l.booleanValue()) {
            C1800l.m4460a().mo6784c(f5397m, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        if (!this.f5403j) {
            this.f5399f.f5353f.mo6798a((C1823b) this);
            this.f5403j = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (C1913p pVar : pVarArr) {
            long a = pVar.mo6893a();
            long currentTimeMillis = System.currentTimeMillis();
            if (pVar.f5528b == C1816t.ENQUEUED) {
                if (currentTimeMillis < a) {
                    C1848b bVar = this.f5402i;
                    if (bVar != null) {
                        Runnable runnable = (Runnable) bVar.f5396c.remove(pVar.f5527a);
                        if (runnable != null) {
                            bVar.f5395b.f5305a.removeCallbacks(runnable);
                        }
                        C1847a aVar = new C1847a(bVar, pVar);
                        bVar.f5396c.put(pVar.f5527a, aVar);
                        bVar.f5395b.f5305a.postDelayed(aVar, pVar.mo6893a() - System.currentTimeMillis());
                    }
                } else if (pVar.mo6894b()) {
                    int i = VERSION.SDK_INT;
                    C1788c cVar = pVar.f5536j;
                    if (cVar.f5246c) {
                        C1800l.m4460a().mo6782a(f5397m, String.format("Ignoring WorkSpec %s, Requires device idle.", new Object[]{pVar}), new Throwable[0]);
                    } else {
                        if (i >= 24) {
                            if (cVar.f5251h.mo6769a() > 0) {
                                C1800l.m4460a().mo6782a(f5397m, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", new Object[]{pVar}), new Throwable[0]);
                            }
                        }
                        hashSet.add(pVar);
                        hashSet2.add(pVar.f5527a);
                    }
                } else {
                    C1800l.m4460a().mo6782a(f5397m, String.format("Starting work for %s", new Object[]{pVar.f5527a}), new Throwable[0]);
                    C1842l lVar = this.f5399f;
                    ((C1963b) lVar.f5351d).f5626a.execute(new C1940j(lVar, pVar.f5527a, null));
                }
            }
        }
        synchronized (this.f5404k) {
            if (!hashSet.isEmpty()) {
                C1800l.m4460a().mo6782a(f5397m, String.format("Starting tracking for [%s]", new Object[]{TextUtils.join(",", hashSet2)}), new Throwable[0]);
                this.f5401h.addAll(hashSet);
                this.f5400g.mo6854a((Iterable<C1913p>) this.f5401h);
            }
        }
    }
}
