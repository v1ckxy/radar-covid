package p124p.p199y.p200x;

import android.content.Context;
import android.os.PowerManager.WakeLock;
import androidx.work.ListenableWorker;
import androidx.work.ListenableWorker.C0177a;
import androidx.work.WorkerParameters.C0182a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import p124p.p199y.C1785b;
import p124p.p199y.C1800l;
import p124p.p199y.p200x.C1845o.C1846a;
import p124p.p199y.p200x.p208r.C1885a;
import p124p.p199y.p200x.p208r.C1889d;
import p124p.p199y.p200x.p210t.p211p.C1961c;
import p124p.p199y.p200x.p210t.p212q.C1962a;
import p124p.p199y.p200x.p210t.p212q.C1963b;
import p213q.p217b.p298b.p299a.p300a.C3498a;

/* renamed from: p.y.x.d */
public class C1825d implements C1823b, C1885a {

    /* renamed from: p */
    public static final String f5308p = C1800l.m4459a("Processor");

    /* renamed from: e */
    public WakeLock f5309e;

    /* renamed from: f */
    public Context f5310f;

    /* renamed from: g */
    public C1785b f5311g;

    /* renamed from: h */
    public C1962a f5312h;

    /* renamed from: i */
    public WorkDatabase f5313i;

    /* renamed from: j */
    public Map<String, C1845o> f5314j = new HashMap();

    /* renamed from: k */
    public Map<String, C1845o> f5315k = new HashMap();

    /* renamed from: l */
    public List<C1827e> f5316l;

    /* renamed from: m */
    public Set<String> f5317m;

    /* renamed from: n */
    public final List<C1823b> f5318n;

    /* renamed from: o */
    public final Object f5319o;

    /* renamed from: p.y.x.d$a */
    public static class C1826a implements Runnable {

        /* renamed from: e */
        public C1823b f5320e;

        /* renamed from: f */
        public String f5321f;

        /* renamed from: g */
        public C3498a<Boolean> f5322g;

        public C1826a(C1823b bVar, String str, C3498a<Boolean> aVar) {
            this.f5320e = bVar;
            this.f5321f = str;
            this.f5322g = aVar;
        }

        public void run() {
            boolean z;
            try {
                z = ((Boolean) this.f5322g.get()).booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z = true;
            }
            this.f5320e.mo1480a(this.f5321f, z);
        }
    }

    public C1825d(Context context, C1785b bVar, C1962a aVar, WorkDatabase workDatabase, List<C1827e> list) {
        this.f5310f = context;
        this.f5311g = bVar;
        this.f5312h = aVar;
        this.f5313i = workDatabase;
        this.f5316l = list;
        this.f5317m = new HashSet();
        this.f5318n = new ArrayList();
        this.f5309e = null;
        this.f5319o = new Object();
    }

    /* renamed from: a */
    public static boolean m4484a(String str, C1845o oVar) {
        boolean z;
        if (oVar != null) {
            oVar.f5381w = true;
            oVar.mo6827f();
            C3498a<C0177a> aVar = oVar.f5380v;
            if (aVar != null) {
                z = aVar.isDone();
                oVar.f5380v.cancel(true);
            } else {
                z = false;
            }
            ListenableWorker listenableWorker = oVar.f5368j;
            if (listenableWorker == null || z) {
                C1800l.m4460a().mo6782a(C1845o.f5362x, String.format("WorkSpec %s is already done. Not interrupting.", new Object[]{oVar.f5367i}), new Throwable[0]);
            } else {
                listenableWorker.mo1443b();
            }
            C1800l.m4460a().mo6782a(f5308p, String.format("WorkerWrapper interrupted for %s", new Object[]{str}), new Throwable[0]);
            return true;
        }
        C1800l.m4460a().mo6782a(f5308p, String.format("WorkerWrapper could not be found for %s", new Object[]{str}), new Throwable[0]);
        return false;
    }

    /* renamed from: a */
    public void mo1480a(String str, boolean z) {
        synchronized (this.f5319o) {
            this.f5315k.remove(str);
            C1800l.m4460a().mo6782a(f5308p, String.format("%s %s executed; reschedule = %s", new Object[]{getClass().getSimpleName(), str, Boolean.valueOf(z)}), new Throwable[0]);
            for (C1823b a : this.f5318n) {
                a.mo1480a(str, z);
            }
        }
    }

    /* renamed from: a */
    public void mo6798a(C1823b bVar) {
        synchronized (this.f5319o) {
            this.f5318n.add(bVar);
        }
    }

    /* renamed from: a */
    public boolean mo6799a(String str) {
        boolean contains;
        synchronized (this.f5319o) {
            contains = this.f5317m.contains(str);
        }
        return contains;
    }

    /* renamed from: b */
    public void mo6801b(C1823b bVar) {
        synchronized (this.f5319o) {
            this.f5318n.remove(bVar);
        }
    }

    /* renamed from: b */
    public boolean mo6802b(String str) {
        boolean z;
        synchronized (this.f5319o) {
            if (!this.f5315k.containsKey(str)) {
                if (!this.f5314j.containsKey(str)) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: c */
    public boolean mo6803c(String str) {
        boolean containsKey;
        synchronized (this.f5319o) {
            containsKey = this.f5314j.containsKey(str);
        }
        return containsKey;
    }

    /* renamed from: d */
    public boolean mo6804d(String str) {
        boolean a;
        synchronized (this.f5319o) {
            boolean z = true;
            C1800l.m4460a().mo6782a(f5308p, String.format("Processor cancelling %s", new Object[]{str}), new Throwable[0]);
            this.f5317m.add(str);
            C1845o oVar = (C1845o) this.f5314j.remove(str);
            if (oVar == null) {
                z = false;
            }
            if (oVar == null) {
                oVar = (C1845o) this.f5315k.remove(str);
            }
            a = m4484a(str, oVar);
            if (z) {
                mo6797a();
            }
        }
        return a;
    }

    /* renamed from: e */
    public void mo6805e(String str) {
        synchronized (this.f5319o) {
            this.f5314j.remove(str);
            mo6797a();
        }
    }

    /* renamed from: f */
    public boolean mo6806f(String str) {
        boolean a;
        synchronized (this.f5319o) {
            C1800l.m4460a().mo6782a(f5308p, String.format("Processor stopping foreground work %s", new Object[]{str}), new Throwable[0]);
            a = m4484a(str, (C1845o) this.f5314j.remove(str));
        }
        return a;
    }

    /* renamed from: g */
    public boolean mo6807g(String str) {
        boolean a;
        synchronized (this.f5319o) {
            C1800l.m4460a().mo6782a(f5308p, String.format("Processor stopping background work %s", new Object[]{str}), new Throwable[0]);
            a = m4484a(str, (C1845o) this.f5315k.remove(str));
        }
        return a;
    }

    /* renamed from: a */
    public boolean mo6800a(String str, C0182a aVar) {
        synchronized (this.f5319o) {
            if (mo6802b(str)) {
                C1800l.m4460a().mo6782a(f5308p, String.format("Work %s is already enqueued for processing", new Object[]{str}), new Throwable[0]);
                return false;
            }
            C1846a aVar2 = new C1846a(this.f5310f, this.f5311g, this.f5312h, this, this.f5313i, str);
            aVar2.f5389h = this.f5316l;
            if (aVar != null) {
                aVar2.f5390i = aVar;
            }
            C1845o oVar = new C1845o(aVar2);
            C1961c<Boolean> cVar = oVar.f5379u;
            cVar.mo6940a(new C1826a(this, str, cVar), ((C1963b) this.f5312h).f5628c);
            this.f5315k.put(str, oVar);
            ((C1963b) this.f5312h).f5626a.execute(oVar);
            C1800l.m4460a().mo6782a(f5308p, String.format("%s: processing %s", new Object[]{C1825d.class.getSimpleName(), str}), new Throwable[0]);
            return true;
        }
    }

    /* renamed from: a */
    public final void mo6797a() {
        synchronized (this.f5319o) {
            if (!(!this.f5314j.isEmpty())) {
                SystemForegroundService systemForegroundService = SystemForegroundService.f1012k;
                if (systemForegroundService != null) {
                    C1800l.m4460a().mo6782a(f5308p, "No more foreground work. Stopping SystemForegroundService", new Throwable[0]);
                    systemForegroundService.f1013f.post(new C1889d(systemForegroundService));
                } else {
                    C1800l.m4460a().mo6782a(f5308p, "No more foreground work. SystemForegroundService is already stopped", new Throwable[0]);
                }
                if (this.f5309e != null) {
                    this.f5309e.release();
                    this.f5309e = null;
                }
            }
        }
    }
}
