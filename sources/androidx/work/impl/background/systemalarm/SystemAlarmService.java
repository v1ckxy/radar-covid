package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import p124p.p177n.C1546k;
import p124p.p199y.C1800l;
import p124p.p199y.p200x.p201p.p203b.C1854e;
import p124p.p199y.p200x.p201p.p203b.C1854e.C1857c;
import p124p.p199y.p200x.p210t.C1942l;

public class SystemAlarmService extends C1546k implements C1857c {

    /* renamed from: h */
    public static final String f1004h = C1800l.m4459a("SystemAlarmService");

    /* renamed from: f */
    public C1854e f1005f;

    /* renamed from: g */
    public boolean f1006g;

    /* renamed from: a */
    public void mo1475a() {
        this.f1006g = true;
        C1800l.m4460a().mo6782a(f1004h, "All commands completed in dispatcher", new Throwable[0]);
        C1942l.m4710a();
        stopSelf();
    }

    /* renamed from: b */
    public final void mo1476b() {
        C1854e eVar = new C1854e(this);
        this.f1005f = eVar;
        if (eVar.f5436n != null) {
            C1800l.m4460a().mo6783b(C1854e.f5426o, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
            return;
        }
        eVar.f5436n = this;
    }

    public void onCreate() {
        super.onCreate();
        mo1476b();
        this.f1006g = false;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f1006g = true;
        this.f1005f.mo6843c();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.f1006g) {
            C1800l.m4460a().mo6784c(f1004h, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f1005f.mo6843c();
            mo1476b();
            this.f1006g = false;
        }
        if (intent != null) {
            this.f1005f.mo6840a(intent, i2);
        }
        return 3;
    }
}
