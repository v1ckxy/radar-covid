package p124p.p199y.p200x.p201p.p203b;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager.WakeLock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import p124p.p199y.C1800l;
import p124p.p199y.p200x.C1823b;
import p124p.p199y.p200x.C1825d;
import p124p.p199y.p200x.C1842l;
import p124p.p199y.p200x.p210t.C1938i;
import p124p.p199y.p200x.p210t.C1942l;
import p124p.p199y.p200x.p210t.C1945o;
import p124p.p199y.p200x.p210t.p212q.C1962a;
import p124p.p199y.p200x.p210t.p212q.C1963b;

/* renamed from: p.y.x.p.b.e */
public class C1854e implements C1823b {

    /* renamed from: o */
    public static final String f5426o = C1800l.m4459a("SystemAlarmDispatcher");

    /* renamed from: e */
    public final Context f5427e;

    /* renamed from: f */
    public final C1962a f5428f;

    /* renamed from: g */
    public final C1945o f5429g = new C1945o();

    /* renamed from: h */
    public final C1825d f5430h;

    /* renamed from: i */
    public final C1842l f5431i;

    /* renamed from: j */
    public final C1851b f5432j = new C1851b(this.f5427e);

    /* renamed from: k */
    public final Handler f5433k;

    /* renamed from: l */
    public final List<Intent> f5434l;

    /* renamed from: m */
    public Intent f5435m;

    /* renamed from: n */
    public C1857c f5436n;

    /* renamed from: p.y.x.p.b.e$a */
    public class C1855a implements Runnable {
        public C1855a() {
        }

        public void run() {
            C1854e eVar;
            C1858d dVar;
            synchronized (C1854e.this.f5434l) {
                C1854e.this.f5435m = (Intent) C1854e.this.f5434l.get(0);
            }
            Intent intent = C1854e.this.f5435m;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = C1854e.this.f5435m.getIntExtra("KEY_START_ID", 0);
                C1800l.m4460a().mo6782a(C1854e.f5426o, String.format("Processing command %s, %s", new Object[]{C1854e.this.f5435m, Integer.valueOf(intExtra)}), new Throwable[0]);
                WakeLock a = C1942l.m4709a(C1854e.this.f5427e, String.format("%s (%s)", new Object[]{action, Integer.valueOf(intExtra)}));
                try {
                    C1800l.m4460a().mo6782a(C1854e.f5426o, String.format("Acquiring operation wake lock (%s) %s", new Object[]{action, a}), new Throwable[0]);
                    a.acquire();
                    C1854e.this.f5432j.mo6834b(C1854e.this.f5435m, intExtra, C1854e.this);
                    C1800l.m4460a().mo6782a(C1854e.f5426o, String.format("Releasing operation wake lock (%s) %s", new Object[]{action, a}), new Throwable[0]);
                    a.release();
                    eVar = C1854e.this;
                    dVar = new C1858d(eVar);
                } catch (Throwable th) {
                    C1800l.m4460a().mo6782a(C1854e.f5426o, String.format("Releasing operation wake lock (%s) %s", new Object[]{action, a}), new Throwable[0]);
                    a.release();
                    C1854e eVar2 = C1854e.this;
                    eVar2.f5433k.post(new C1858d(eVar2));
                    throw th;
                }
                eVar.f5433k.post(dVar);
            }
        }
    }

    /* renamed from: p.y.x.p.b.e$b */
    public static class C1856b implements Runnable {

        /* renamed from: e */
        public final C1854e f5438e;

        /* renamed from: f */
        public final Intent f5439f;

        /* renamed from: g */
        public final int f5440g;

        public C1856b(C1854e eVar, Intent intent, int i) {
            this.f5438e = eVar;
            this.f5439f = intent;
            this.f5440g = i;
        }

        public void run() {
            this.f5438e.mo6840a(this.f5439f, this.f5440g);
        }
    }

    /* renamed from: p.y.x.p.b.e$c */
    public interface C1857c {
        /* renamed from: a */
        void mo1475a();
    }

    /* renamed from: p.y.x.p.b.e$d */
    public static class C1858d implements Runnable {

        /* renamed from: e */
        public final C1854e f5441e;

        public C1858d(C1854e eVar) {
            this.f5441e = eVar;
        }

        public void run() {
            this.f5441e.mo6842b();
        }
    }

    public C1854e(Context context) {
        this.f5427e = context.getApplicationContext();
        C1842l a = C1842l.m4517a(context);
        this.f5431i = a;
        C1825d dVar = a.f5353f;
        this.f5430h = dVar;
        this.f5428f = a.f5351d;
        dVar.mo6798a((C1823b) this);
        this.f5434l = new ArrayList();
        this.f5435m = null;
        this.f5433k = new Handler(Looper.getMainLooper());
    }

    /* renamed from: a */
    public final void mo6839a() {
        if (this.f5433k.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    /* renamed from: a */
    public void mo1480a(String str, boolean z) {
        this.f5433k.post(new C1856b(this, C1851b.m4548a(this.f5427e, str, z), 0));
    }

    /* renamed from: a */
    public boolean mo6840a(Intent intent, int i) {
        boolean z = false;
        C1800l.m4460a().mo6782a(f5426o, String.format("Adding command %s (%s)", new Object[]{intent, Integer.valueOf(i)}), new Throwable[0]);
        mo6839a();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            C1800l.m4460a().mo6785d(f5426o, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        } else if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && mo6841a("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        } else {
            intent.putExtra("KEY_START_ID", i);
            synchronized (this.f5434l) {
                if (!this.f5434l.isEmpty()) {
                    z = true;
                }
                this.f5434l.add(intent);
                if (!z) {
                    mo6844d();
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    public final boolean mo6841a(String str) {
        mo6839a();
        synchronized (this.f5434l) {
            for (Intent action : this.f5434l) {
                if (str.equals(action.getAction())) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: b */
    public void mo6842b() {
        C1800l.m4460a().mo6782a(f5426o, "Checking if commands are complete.", new Throwable[0]);
        mo6839a();
        synchronized (this.f5434l) {
            if (this.f5435m != null) {
                C1800l.m4460a().mo6782a(f5426o, String.format("Removing command %s", new Object[]{this.f5435m}), new Throwable[0]);
                if (((Intent) this.f5434l.remove(0)).equals(this.f5435m)) {
                    this.f5435m = null;
                } else {
                    throw new IllegalStateException("Dequeue-d command is not the first.");
                }
            }
            C1938i iVar = ((C1963b) this.f5428f).f5626a;
            if (!this.f5432j.mo6833a() && this.f5434l.isEmpty() && !iVar.mo6928a()) {
                C1800l.m4460a().mo6782a(f5426o, "No more commands & intents.", new Throwable[0]);
                if (this.f5436n != null) {
                    this.f5436n.mo1475a();
                }
            } else if (!this.f5434l.isEmpty()) {
                mo6844d();
            }
        }
    }

    /* renamed from: c */
    public void mo6843c() {
        C1800l.m4460a().mo6782a(f5426o, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f5430h.mo6801b((C1823b) this);
        C1945o oVar = this.f5429g;
        if (!oVar.f5590b.isShutdown()) {
            oVar.f5590b.shutdownNow();
        }
        this.f5436n = null;
    }

    /* renamed from: d */
    public final void mo6844d() {
        mo6839a();
        WakeLock a = C1942l.m4709a(this.f5427e, "ProcessCommand");
        try {
            a.acquire();
            C1962a aVar = this.f5431i.f5351d;
            ((C1963b) aVar).f5626a.execute(new C1855a());
        } finally {
            a.release();
        }
    }
}
