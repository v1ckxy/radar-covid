package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;
import p124p.p177n.C1546k;
import p124p.p199y.C1800l;
import p124p.p199y.p200x.C1842l;
import p124p.p199y.p200x.p208r.C1886b;
import p124p.p199y.p200x.p208r.C1887c;
import p124p.p199y.p200x.p208r.C1887c.C1888a;
import p124p.p199y.p200x.p210t.C1930a;
import p124p.p199y.p200x.p210t.p212q.C1962a;
import p124p.p199y.p200x.p210t.p212q.C1963b;

public class SystemForegroundService extends C1546k implements C1888a {

    /* renamed from: j */
    public static final String f1011j = C1800l.m4459a("SystemFgService");

    /* renamed from: k */
    public static SystemForegroundService f1012k = null;

    /* renamed from: f */
    public Handler f1013f;

    /* renamed from: g */
    public boolean f1014g;

    /* renamed from: h */
    public C1887c f1015h;

    /* renamed from: i */
    public NotificationManager f1016i;

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$a */
    public class C0185a implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ int f1017e;

        /* renamed from: f */
        public final /* synthetic */ Notification f1018f;

        /* renamed from: g */
        public final /* synthetic */ int f1019g;

        public C0185a(int i, Notification notification, int i2) {
            this.f1017e = i;
            this.f1018f = notification;
            this.f1019g = i2;
        }

        public void run() {
            if (VERSION.SDK_INT >= 29) {
                SystemForegroundService.this.startForeground(this.f1017e, this.f1018f, this.f1019g);
            } else {
                SystemForegroundService.this.startForeground(this.f1017e, this.f1018f);
            }
        }
    }

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$b */
    public class C0186b implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ int f1021e;

        /* renamed from: f */
        public final /* synthetic */ Notification f1022f;

        public C0186b(int i, Notification notification) {
            this.f1021e = i;
            this.f1022f = notification;
        }

        public void run() {
            SystemForegroundService.this.f1016i.notify(this.f1021e, this.f1022f);
        }
    }

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$c */
    public class C0187c implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ int f1024e;

        public C0187c(int i) {
            this.f1024e = i;
        }

        public void run() {
            SystemForegroundService.this.f1016i.cancel(this.f1024e);
        }
    }

    /* renamed from: a */
    public void mo1486a(int i) {
        this.f1013f.post(new C0187c(i));
    }

    /* renamed from: a */
    public void mo1487a(int i, int i2, Notification notification) {
        this.f1013f.post(new C0185a(i, notification, i2));
    }

    /* renamed from: a */
    public void mo1488a(int i, Notification notification) {
        this.f1013f.post(new C0186b(i, notification));
    }

    /* renamed from: b */
    public final void mo1489b() {
        this.f1013f = new Handler(Looper.getMainLooper());
        this.f1016i = (NotificationManager) getApplicationContext().getSystemService("notification");
        C1887c cVar = new C1887c(getApplicationContext());
        this.f1015h = cVar;
        if (cVar.f5502o != null) {
            C1800l.m4460a().mo6783b(C1887c.f5491p, "A callback already exists.", new Throwable[0]);
            return;
        }
        cVar.f5502o = this;
    }

    public void onCreate() {
        super.onCreate();
        f1012k = this;
        mo1489b();
    }

    public void onDestroy() {
        super.onDestroy();
        this.f1015h.mo6877a();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.f1014g) {
            C1800l.m4460a().mo6784c(f1011j, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.f1015h.mo6877a();
            mo1489b();
            this.f1014g = false;
        }
        if (intent != null) {
            C1887c cVar = this.f1015h;
            if (cVar != null) {
                String action = intent.getAction();
                String str = "KEY_WORKSPEC_ID";
                if ("ACTION_START_FOREGROUND".equals(action)) {
                    C1800l.m4460a().mo6784c(C1887c.f5491p, String.format("Started foreground service %s", new Object[]{intent}), new Throwable[0]);
                    String stringExtra = intent.getStringExtra(str);
                    WorkDatabase workDatabase = cVar.f5493f.f5350c;
                    C1962a aVar = cVar.f5494g;
                    ((C1963b) aVar).f5626a.execute(new C1886b(cVar, workDatabase, stringExtra));
                } else if (!"ACTION_NOTIFY".equals(action)) {
                    if ("ACTION_CANCEL_WORK".equals(action)) {
                        C1800l.m4460a().mo6784c(C1887c.f5491p, String.format("Stopping foreground work for %s", new Object[]{intent}), new Throwable[0]);
                        String stringExtra2 = intent.getStringExtra(str);
                        if (stringExtra2 != null && !TextUtils.isEmpty(stringExtra2)) {
                            C1842l lVar = cVar.f5493f;
                            UUID fromString = UUID.fromString(stringExtra2);
                            if (lVar != null) {
                                ((C1963b) lVar.f5351d).f5626a.execute(new C1930a(lVar, fromString));
                            } else {
                                throw null;
                            }
                        }
                    }
                }
                cVar.mo6878a(intent);
            } else {
                throw null;
            }
        }
        return 3;
    }

    public void stop() {
        this.f1014g = true;
        C1800l.m4460a().mo6782a(f1011j, "All commands completed.", new Throwable[0]);
        if (VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        f1012k = null;
        stopSelf();
    }
}
