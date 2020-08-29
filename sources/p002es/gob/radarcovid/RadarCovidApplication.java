package p002es.gob.radarcovid;

import android.content.Context;
import android.content.IntentFilter;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.util.concurrent.TimeUnit;
import org.dpppt.android.sdk.internal.SyncWorker;
import org.dpppt.android.sdk.models.ApplicationInfo;
import p002es.gob.radarcovid.common.base.broadcast.ExposureStatusChangeBroadcastReceiver;
import p002es.gob.radarcovid.features.kpireport.KpiReportWorker;
import p003f.p004a.p005a.C0701f;
import p119o.p120a.C0967p0;
import p124p.p199y.C1788c;
import p124p.p199y.C1788c.C1789a;
import p124p.p199y.C1794f;
import p124p.p199y.C1802m;
import p124p.p199y.C1811p;
import p124p.p199y.C1811p.C1812a;
import p124p.p199y.C1818v;
import p124p.p199y.p200x.C1842l;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p365r.p366a.p367f.C4424b;
import p392u.p401r.p403c.C4638h;
import p410v.C4713h;
import p425x.p472b.p473a.p474a.C5178e;
import p425x.p472b.p473a.p474a.p476l.C5195d;
import p425x.p472b.p473a.p474a.p476l.C5197e;
import p425x.p472b.p473a.p474a.p476l.C5198f;
import p425x.p472b.p473a.p474a.p476l.C5202h;
import p425x.p472b.p473a.p474a.p476l.C5206j;
import p425x.p472b.p473a.p474a.p476l.p477k.C5211e;
import p425x.p472b.p473a.p474a.p476l.p480n.C5242m;
import p425x.p472b.p473a.p474a.p476l.p481o.C5243a;

/* renamed from: es.gob.radarcovid.RadarCovidApplication */
public final class RadarCovidApplication extends C4424b {

    /* renamed from: f */
    public C4713h f1694f;

    public void onCreate() {
        super.onCreate();
        C2286e.f6256e = C0701f.f2150e;
        String str = "https://radarcovid.covid19.gob.es/dp3t/";
        ApplicationInfo applicationInfo = new ApplicationInfo(getPackageName(), str, str);
        try {
            PublicKey d = C0967p0.m2250d("LS0tLS1CRUdJTiBQVUJMSUMgS0VZLS0tLS0KTUZrd0V3WUhLb1pJemowQ0FRWUlLb1pJemowREFRY0RRZ0FFdmx1bzYyTFVVcFllcVVGM3haWVhYSG03cjBGWApScENFbVBqTUlxUHVERjcvYmRua1FIbndxbVNoVzIvOU9BcllEd09FUUZmdEE4ZDV6T3NEZmh0T2NRPT0KLS0tLS1FTkQgUFVCTElDIEtFWS0tLS0t");
            applicationInfo.getAppId();
            C5195d b = C5195d.m11631b((Context) this);
            if (b != null) {
                applicationInfo.getAppId();
                b.f12413a.edit().putString("application", C5243a.m11696a(applicationInfo)).apply();
                b.f12413a.edit().putBoolean("devHistory", false).apply();
                SyncWorker.f2669i = d;
                C5242m.m11680a((Context) this).mo11964a(b.f12413a.getInt("attenuationThresholdLow", 50), b.f12413a.getInt("attenuationThresholdMedium", 60));
                Context applicationContext = getApplicationContext();
                if (!C5178e.f12367a) {
                    applicationContext.registerReceiver(new C5198f(), new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
                    applicationContext.registerReceiver(new C5202h(), new IntentFilter("android.location.MODE_CHANGED"));
                    applicationContext.registerReceiver(new C5197e(), new IntentFilter("android.os.action.POWER_SAVE_WHITELIST_CHANGED"));
                    applicationContext.registerReceiver(new C5206j(), new IntentFilter("org.dpppt.android.sdk.ACTION_UPDATE_ERRORS"));
                    C0967p0.m2200a(applicationContext, null);
                    C0967p0.m2199a(applicationContext);
                }
                C5178e.f12367a = true;
                C4713h hVar = this.f1694f;
                if (hVar != null) {
                    C5211e.f12425a = hVar;
                    registerReceiver(new ExposureStatusChangeBroadcastReceiver(), new IntentFilter("org.dpppt.android.sdk.ACTION_UPDATE"));
                    C1789a aVar = new C1789a();
                    aVar.f5254c = C1802m.CONNECTED;
                    C1788c cVar = new C1788c(aVar);
                    C4638h.m10270a((Object) cVar, "Constraints.Builder()\n  …\n                .build()");
                    C1812a aVar2 = new C1812a(KpiReportWorker.class, 12, TimeUnit.HOURS);
                    aVar2.f5302c.f5536j = cVar;
                    C1818v a = aVar2.mo6794a();
                    C4638h.m10270a((Object) a, "PeriodicWorkRequest.Buil…\n                .build()");
                    String str2 = "KpiReportWorker";
                    C1842l.m4517a((Context) this).mo6792a(str2, C1794f.KEEP, (C1811p) a);
                    return;
                }
                C4638h.m10273b("certificatePinner");
                throw null;
            }
            throw null;
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            throw new RuntimeException(e);
        }
    }
}
