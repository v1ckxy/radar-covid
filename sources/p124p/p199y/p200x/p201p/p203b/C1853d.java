package p124p.p199y.p200x.p201p.p203b;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager.WakeLock;
import androidx.work.WorkerParameters.C0182a;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.Collections;
import java.util.List;
import p124p.p199y.C1800l;
import p124p.p199y.p200x.C1823b;
import p124p.p199y.p200x.p201p.p203b.C1854e.C1856b;
import p124p.p199y.p200x.p205q.C1863c;
import p124p.p199y.p200x.p205q.C1864d;
import p124p.p199y.p200x.p209s.C1913p;
import p124p.p199y.p200x.p209s.C1916r;
import p124p.p199y.p200x.p210t.C1942l;
import p124p.p199y.p200x.p210t.C1945o.C1947b;

/* renamed from: p.y.x.p.b.d */
public class C1853d implements C1863c, C1823b, C1947b {

    /* renamed from: n */
    public static final String f5416n = C1800l.m4459a("DelayMetCommandHandler");

    /* renamed from: e */
    public final Context f5417e;

    /* renamed from: f */
    public final int f5418f;

    /* renamed from: g */
    public final String f5419g;

    /* renamed from: h */
    public final C1854e f5420h;

    /* renamed from: i */
    public final C1864d f5421i;

    /* renamed from: j */
    public final Object f5422j = new Object();

    /* renamed from: k */
    public int f5423k = 0;

    /* renamed from: l */
    public WakeLock f5424l;

    /* renamed from: m */
    public boolean f5425m = false;

    public C1853d(Context context, int i, String str, C1854e eVar) {
        this.f5417e = context;
        this.f5418f = i;
        this.f5420h = eVar;
        this.f5419g = str;
        this.f5421i = new C1864d(this.f5417e, eVar.f5428f, this);
    }

    /* renamed from: a */
    public final void mo6835a() {
        synchronized (this.f5422j) {
            this.f5421i.mo6853a();
            this.f5420h.f5429g.mo6934a(this.f5419g);
            if (this.f5424l != null && this.f5424l.isHeld()) {
                C1800l.m4460a().mo6782a(f5416n, String.format("Releasing wakelock %s for WorkSpec %s", new Object[]{this.f5424l, this.f5419g}), new Throwable[0]);
                this.f5424l.release();
            }
        }
    }

    /* renamed from: a */
    public void mo6836a(String str) {
        C1800l.m4460a().mo6782a(f5416n, String.format("Exceeded time limits on execution for %s", new Object[]{str}), new Throwable[0]);
        mo6838c();
    }

    /* renamed from: a */
    public void mo1498a(List<String> list) {
        mo6838c();
    }

    /* renamed from: b */
    public void mo6837b() {
        this.f5424l = C1942l.m4709a(this.f5417e, String.format("%s (%s)", new Object[]{this.f5419g, Integer.valueOf(this.f5418f)}));
        C1800l.m4460a().mo6782a(f5416n, String.format("Acquiring wakelock %s for WorkSpec %s", new Object[]{this.f5424l, this.f5419g}), new Throwable[0]);
        this.f5424l.acquire();
        C1913p e = ((C1916r) this.f5420h.f5431i.f5350c.mo1462m()).mo6914e(this.f5419g);
        if (e == null) {
            mo6838c();
            return;
        }
        boolean b = e.mo6894b();
        this.f5425m = b;
        if (!b) {
            C1800l.m4460a().mo6782a(f5416n, String.format("No constraints for %s", new Object[]{this.f5419g}), new Throwable[0]);
            mo1499b(Collections.singletonList(this.f5419g));
        } else {
            this.f5421i.mo6854a((Iterable<C1913p>) Collections.singletonList(e));
        }
    }

    /* renamed from: c */
    public final void mo6838c() {
        synchronized (this.f5422j) {
            if (this.f5423k < 2) {
                this.f5423k = 2;
                C1800l.m4460a().mo6782a(f5416n, String.format("Stopping work for WorkSpec %s", new Object[]{this.f5419g}), new Throwable[0]);
                Context context = this.f5417e;
                String str = this.f5419g;
                Intent intent = new Intent(context, SystemAlarmService.class);
                intent.setAction("ACTION_STOP_WORK");
                intent.putExtra("KEY_WORKSPEC_ID", str);
                C1854e eVar = this.f5420h;
                eVar.f5433k.post(new C1856b(this.f5420h, intent, this.f5418f));
                if (this.f5420h.f5430h.mo6802b(this.f5419g)) {
                    C1800l.m4460a().mo6782a(f5416n, String.format("WorkSpec %s needs to be rescheduled", new Object[]{this.f5419g}), new Throwable[0]);
                    Intent b = C1851b.m4549b(this.f5417e, this.f5419g);
                    C1854e eVar2 = this.f5420h;
                    eVar2.f5433k.post(new C1856b(this.f5420h, b, this.f5418f));
                } else {
                    C1800l.m4460a().mo6782a(f5416n, String.format("Processor does not have WorkSpec %s. No need to reschedule ", new Object[]{this.f5419g}), new Throwable[0]);
                }
            } else {
                C1800l.m4460a().mo6782a(f5416n, String.format("Already stopped work for %s", new Object[]{this.f5419g}), new Throwable[0]);
            }
        }
    }

    /* renamed from: a */
    public void mo1480a(String str, boolean z) {
        C1800l.m4460a().mo6782a(f5416n, String.format("onExecuted %s, %s", new Object[]{str, Boolean.valueOf(z)}), new Throwable[0]);
        mo6835a();
        if (z) {
            Intent b = C1851b.m4549b(this.f5417e, this.f5419g);
            C1854e eVar = this.f5420h;
            eVar.f5433k.post(new C1856b(eVar, b, this.f5418f));
        }
        if (this.f5425m) {
            Intent a = C1851b.m4546a(this.f5417e);
            C1854e eVar2 = this.f5420h;
            eVar2.f5433k.post(new C1856b(eVar2, a, this.f5418f));
        }
    }

    /* renamed from: b */
    public void mo1499b(List<String> list) {
        if (list.contains(this.f5419g)) {
            synchronized (this.f5422j) {
                if (this.f5423k == 0) {
                    this.f5423k = 1;
                    C1800l.m4460a().mo6782a(f5416n, String.format("onAllConstraintsMet for %s", new Object[]{this.f5419g}), new Throwable[0]);
                    if (this.f5420h.f5430h.mo6800a(this.f5419g, (C0182a) null)) {
                        this.f5420h.f5429g.mo6935a(this.f5419g, 600000, this);
                    } else {
                        mo6835a();
                    }
                } else {
                    C1800l.m4460a().mo6782a(f5416n, String.format("Already started work for %s", new Object[]{this.f5419g}), new Throwable[0]);
                }
            }
        }
    }
}
