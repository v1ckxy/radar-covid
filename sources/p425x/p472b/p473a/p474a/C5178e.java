package p425x.p472b.p473a.p474a;

import android.app.Activity;
import android.content.Context;
import java.util.Date;
import java.util.concurrent.CancellationException;
import org.dpppt.android.sdk.internal.SyncWorker;
import org.dpppt.android.sdk.models.DayDate;
import org.dpppt.android.sdk.models.ExposeeAuthMethod;
import p119o.p120a.C0967p0;
import p124p.p150h.p161k.C1381a;
import p124p.p199y.p200x.C1842l;
import p124p.p199y.p200x.p210t.C1931b;
import p124p.p199y.p200x.p210t.p212q.C1963b;
import p213q.p217b.p218a.p231b.p239d.C2119d;
import p213q.p217b.p218a.p231b.p239d.p240m.p241k.C2190m;
import p213q.p217b.p218a.p231b.p239d.p240m.p241k.C2190m.C2191a;
import p213q.p217b.p218a.p231b.p251g.p257f.C2842n2;
import p213q.p217b.p218a.p231b.p251g.p257f.C2850p2;
import p213q.p217b.p218a.p231b.p251g.p257f.C2854q2;
import p213q.p217b.p218a.p231b.p262i.C3216e;
import p213q.p217b.p218a.p231b.p270l.C3247e;
import p213q.p217b.p218a.p231b.p270l.C3249f;
import p213q.p217b.p218a.p231b.p270l.C3250f0;
import p213q.p217b.p218a.p231b.p270l.C3255i;
import p213q.p217b.p218a.p231b.p270l.C3259k;
import p425x.p472b.p473a.p474a.p475k.C5188a;
import p425x.p472b.p473a.p474a.p476l.C5195d;
import p425x.p472b.p473a.p474a.p476l.C5203i;
import p425x.p472b.p473a.p474a.p476l.C5203i.C5204a;
import p425x.p472b.p473a.p474a.p476l.p479m.C5229g;
import p425x.p472b.p473a.p474a.p476l.p480n.C5231b;
import p425x.p472b.p473a.p474a.p476l.p480n.C5233d;
import p425x.p472b.p473a.p474a.p476l.p480n.C5236g;
import p425x.p472b.p473a.p474a.p476l.p480n.C5237h;
import p425x.p472b.p473a.p474a.p476l.p480n.C5238i;
import p425x.p472b.p473a.p474a.p476l.p480n.C5239j;
import p425x.p472b.p473a.p474a.p476l.p480n.C5241l;
import p425x.p472b.p473a.p474a.p476l.p480n.C5242m;

/* renamed from: x.b.a.a.e */
public class C5178e {

    /* renamed from: a */
    public static boolean f12367a = false;

    /* renamed from: b */
    public static C5181c f12368b;

    /* renamed from: c */
    public static C5180b f12369c;

    /* renamed from: x.b.a.a.e$a */
    public static class C5179a implements C5188a<String> {

        /* renamed from: a */
        public final /* synthetic */ int f12370a;

        /* renamed from: b */
        public final /* synthetic */ Activity f12371b;

        /* renamed from: c */
        public final /* synthetic */ C5195d f12372c;

        public C5179a(int i, Activity activity, C5195d dVar) {
            this.f12370a = i;
            this.f12371b = activity;
            this.f12372c = dVar;
        }

        /* renamed from: a */
        public void mo3662a(Throwable th) {
            C5178e.m11619a(th);
        }

        /* renamed from: a */
        public void mo3661a(Object obj) {
            C5203i.m11644a((Context) this.f12371b).mo11946a(new C5204a(this.f12370a, (String) obj, 0));
            this.f12372c.f12413a.edit().putBoolean("IAmInfected", true).apply();
            C5178e.f12369c.f12375c.mo3661a(null);
            C5178e.f12369c = null;
        }
    }

    /* renamed from: x.b.a.a.e$b */
    public static class C5180b {

        /* renamed from: a */
        public Date f12373a;

        /* renamed from: b */
        public ExposeeAuthMethod f12374b;

        /* renamed from: c */
        public C5188a<Void> f12375c;

        public /* synthetic */ C5180b(Date date, ExposeeAuthMethod exposeeAuthMethod, C5188a aVar, C5179a aVar2) {
            this.f12373a = date;
            this.f12374b = exposeeAuthMethod;
            this.f12375c = aVar;
        }
    }

    /* renamed from: x.b.a.a.e$c */
    public static class C5181c {

        /* renamed from: a */
        public final Runnable f12376a;

        /* renamed from: b */
        public final C1381a<Exception> f12377b;

        /* renamed from: c */
        public final Runnable f12378c;

        public /* synthetic */ C5181c(Runnable runnable, C1381a aVar, Runnable runnable2, C5179a aVar2) {
            this.f12376a = runnable;
            this.f12377b = aVar;
            this.f12378c = runnable2;
        }
    }

    /* renamed from: a */
    public static void m11615a() {
        if (!f12367a) {
            throw new IllegalStateException("You have to call DP3T.init() in your Application.onCreate()");
        }
    }

    /* renamed from: a */
    public static void m11616a(Activity activity) {
        C5180b bVar = f12369c;
        if (bVar != null) {
            DayDate dayDate = new DayDate(bVar.f12373a.getTime());
            C5242m a = C5242m.m11680a((Context) activity);
            C5175b bVar2 = new C5175b(dayDate, activity);
            C5177d dVar = C5177d.f12366a;
            C3255i b = ((C2842n2) a.f12480a).mo8196b();
            C5231b bVar3 = new C5231b(bVar2);
            C3250f0 f0Var = (C3250f0) b;
            if (f0Var != null) {
                f0Var.mo8926a(C3259k.f8131a, (C3249f<? super TResult>) bVar3);
                f0Var.mo8925a(C3259k.f8131a, (C3247e) new C5238i(activity, 392, dVar));
                return;
            }
            throw null;
        }
        throw new IllegalStateException("pendingIAmInfectedRequest must be set before calling executeIAmInfected()");
    }

    /* renamed from: b */
    public static boolean m11623b(Context context) {
        m11615a();
        return C5195d.m11631b(context).mo11939c();
    }

    /* renamed from: c */
    public static void m11624c(Context context) {
        m11615a();
        C5195d.m11631b(context).f12413a.edit().putBoolean("tracingEnabled", false).apply();
        C2842n2 n2Var = (C2842n2) C5242m.m11680a(context).f12480a;
        if (n2Var != null) {
            C2191a a = C2190m.m5016a();
            a.f6092a = C2850p2.f7082a;
            a.f6094c = new C2119d[]{C3216e.f8070c};
            C3255i a2 = n2Var.mo7139a(1, a.mo7206a());
            C5236g gVar = C5236g.f12469a;
            C3250f0 f0Var = (C3250f0) a2;
            if (f0Var != null) {
                f0Var.mo8926a(C3259k.f8131a, (C3249f<? super TResult>) gVar);
                f0Var.mo8925a(C3259k.f8131a, (C3247e) C5237h.f12470a);
                C1842l a3 = C1842l.m4517a(context);
                if (a3 != null) {
                    ((C1963b) a3.f5351d).f5626a.execute(new C1931b(a3, "org.dpppt.android.sdk.internal.SyncWorker"));
                    C0967p0.m2234b(context);
                    C0967p0.m2199a(context);
                    return;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (r1.isLocationEnabled() != false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        if (android.provider.Settings.Secure.getInt(r14.getContentResolver(), "location_mode", 0) != 0) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d0, code lost:
        if ("ASST503".equals(r10) != false) goto L_0x00d5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x015a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p425x.p472b.p473a.p474a.C5186j m11614a(android.content.Context r14) {
        /*
            m11615a()
            x.b.a.a.l.d r0 = p425x.p472b.p473a.p474a.p476l.C5195d.m11631b(r14)
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            android.content.pm.PackageManager r1 = r14.getPackageManager()
            java.lang.String r2 = "android.hardware.bluetooth_le"
            boolean r1 = r1.hasSystemFeature(r2)
            if (r1 != 0) goto L_0x001b
            x.b.a.a.j$a r1 = p425x.p472b.p473a.p474a.C5186j.C5187a.BLE_NOT_SUPPORTED
            goto L_0x0029
        L_0x001b:
            android.bluetooth.BluetoothAdapter r1 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()
            if (r1 == 0) goto L_0x0027
            boolean r1 = r1.isEnabled()
            if (r1 != 0) goto L_0x002c
        L_0x0027:
            x.b.a.a.j$a r1 = p425x.p472b.p473a.p474a.C5186j.C5187a.BLE_DISABLED
        L_0x0029:
            r7.add(r1)
        L_0x002c:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            r3 = 1
            r4 = 0
            if (r1 < r2) goto L_0x0045
            java.lang.String r1 = "location"
            java.lang.Object r1 = r14.getSystemService(r1)
            android.location.LocationManager r1 = (android.location.LocationManager) r1
            if (r1 == 0) goto L_0x0053
            boolean r1 = r1.isLocationEnabled()
            if (r1 == 0) goto L_0x0053
            goto L_0x0051
        L_0x0045:
            android.content.ContentResolver r1 = r14.getContentResolver()
            java.lang.String r2 = "location_mode"
            int r1 = android.provider.Settings.Secure.getInt(r1, r2, r4)
            if (r1 == 0) goto L_0x0053
        L_0x0051:
            r1 = r3
            goto L_0x0054
        L_0x0053:
            r1 = r4
        L_0x0054:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x0063
            x.b.a.a.j$a r1 = p425x.p472b.p473a.p474a.C5186j.C5187a.LOCATION_SERVICE_DISABLED
            r7.add(r1)
        L_0x0063:
            java.lang.String r1 = "power"
            java.lang.Object r1 = r14.getSystemService(r1)
            android.os.PowerManager r1 = (android.os.PowerManager) r1
            if (r1 == 0) goto L_0x007a
            java.lang.String r2 = r14.getPackageName()
            boolean r1 = r1.isIgnoringBatteryOptimizations(r2)
            if (r1 == 0) goto L_0x0078
            goto L_0x007a
        L_0x0078:
            r1 = r4
            goto L_0x007b
        L_0x007a:
            r1 = r3
        L_0x007b:
            if (r1 != 0) goto L_0x0082
            x.b.a.a.j$a r1 = p425x.p472b.p473a.p474a.C5186j.C5187a.BATTERY_OPTIMIZER_ENABLED
            r7.add(r1)
        L_0x0082:
            x.b.a.a.l.d r1 = p425x.p472b.p473a.p474a.p476l.C5195d.m11631b(r14)
            android.content.SharedPreferences r1 = r1.f12413a
            java.lang.String r2 = "lastSyncNetSuccess"
            boolean r1 = r1.getBoolean(r2, r3)
            java.lang.String r2 = "lastSyncDate"
            r5 = 0
            if (r1 != 0) goto L_0x00f6
            x.b.a.a.l.k.k r1 = p425x.p472b.p473a.p474a.p476l.p477k.C5217k.m11659a()
            x.b.a.a.j$a r8 = r1.f12428a
            if (r8 != 0) goto L_0x00a9
            java.lang.String r8 = "ErrorHelper"
            java.lang.String r9 = "lost sync error state"
            p425x.p472b.p473a.p474a.p476l.p479m.C5229g.m11667d(r8, r9)
            x.b.a.a.j$a r8 = p425x.p472b.p473a.p474a.C5186j.C5187a.SYNC_ERROR_NETWORK
            java.lang.String r9 = "LOST"
            r8.f12406f = r9
        L_0x00a9:
            x.b.a.a.j$a r9 = p425x.p472b.p473a.p474a.C5186j.C5187a.SYNC_ERROR_NETWORK
            if (r8 == r9) goto L_0x00d5
            x.b.a.a.j$a r9 = p425x.p472b.p473a.p474a.C5186j.C5187a.SYNC_ERROR_SSLTLS
            if (r8 == r9) goto L_0x00d5
            x.b.a.a.j$a r9 = p425x.p472b.p473a.p474a.C5186j.C5187a.SYNC_ERROR_SERVER
            if (r8 != r9) goto L_0x00d3
            java.lang.String r9 = r8.f12406f
            java.lang.String r10 = ""
            if (r9 == 0) goto L_0x00bc
            goto L_0x00bd
        L_0x00bc:
            r9 = r10
        L_0x00bd:
            java.lang.String r11 = "ASST502"
            boolean r9 = r11.equals(r9)
            if (r9 != 0) goto L_0x00d5
            java.lang.String r9 = r8.f12406f
            if (r9 == 0) goto L_0x00ca
            r10 = r9
        L_0x00ca:
            java.lang.String r9 = "ASST503"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x00d3
            goto L_0x00d5
        L_0x00d3:
            r9 = r4
            goto L_0x00d6
        L_0x00d5:
            r9 = r3
        L_0x00d6:
            boolean r10 = r0.mo11939c()
            if (r10 == 0) goto L_0x00ee
            android.content.SharedPreferences r10 = r0.f12413a
            long r5 = r10.getLong(r2, r5)
            long r10 = java.lang.System.currentTimeMillis()
            long r12 = r1.f12429b
            long r10 = r10 - r12
            int r1 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r1 >= 0) goto L_0x00ee
            goto L_0x00ef
        L_0x00ee:
            r3 = r4
        L_0x00ef:
            if (r9 == 0) goto L_0x00f3
            if (r3 == 0) goto L_0x00f6
        L_0x00f3:
            r7.add(r8)
        L_0x00f6:
            x.b.a.a.f r1 = p425x.p472b.p473a.p474a.p476l.p480n.C5241l.f12476a
            if (r1 == 0) goto L_0x0103
            x.b.a.a.f r3 = p425x.p472b.p473a.p474a.C5182f.AVAILABLE
            if (r1 == r3) goto L_0x0103
            x.b.a.a.j$a r1 = p425x.p472b.p473a.p474a.C5186j.C5187a.GAEN_NOT_AVAILABLE
            r7.add(r1)
        L_0x0103:
            boolean r1 = r0.mo11939c()
            if (r1 == 0) goto L_0x0144
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            java.lang.Boolean r3 = p425x.p472b.p473a.p474a.p476l.p480n.C5241l.f12477b
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0144
            x.b.a.a.j$a r1 = p425x.p472b.p473a.p474a.C5186j.C5187a.GAEN_UNEXPECTEDLY_DISABLED
            java.lang.Exception r3 = p425x.p472b.p473a.p474a.p476l.p480n.C5241l.f12478c
            if (r3 != 0) goto L_0x011c
            java.lang.String r3 = "GAUD-00"
            goto L_0x013f
        L_0x011c:
            boolean r5 = r3 instanceof p213q.p217b.p218a.p231b.p239d.p240m.C2147b
            java.lang.String r6 = "GAUD-"
            if (r5 == 0) goto L_0x0130
            java.lang.StringBuilder r5 = p213q.p214a.p215a.p216a.C1965a.m4756a(r6)
            q.b.a.b.d.m.b r3 = (p213q.p217b.p218a.p231b.p239d.p240m.C2147b) r3
            com.google.android.gms.common.api.Status r3 = r3.f6010e
            int r3 = r3.f1062f
            r5.append(r3)
            goto L_0x013b
        L_0x0130:
            java.lang.StringBuilder r5 = p213q.p214a.p215a.p216a.C1965a.m4756a(r6)
            java.lang.String r3 = r3.getMessage()
            r5.append(r3)
        L_0x013b:
            java.lang.String r3 = r5.toString()
        L_0x013f:
            r1.f12406f = r3
            r7.add(r1)
        L_0x0144:
            x.b.a.a.l.g r14 = p425x.p472b.p473a.p474a.p476l.C5199g.m11639a(r14)
            java.util.ArrayList r6 = r14.mo11942a()
            android.content.SharedPreferences r14 = r0.f12413a
            java.lang.String r1 = "IAmInfected"
            boolean r14 = r14.getBoolean(r1, r4)
            if (r14 == 0) goto L_0x015a
            x.b.a.a.g r14 = p425x.p472b.p473a.p474a.C5183g.INFECTED
        L_0x0158:
            r5 = r14
            goto L_0x0166
        L_0x015a:
            int r14 = r6.size()
            if (r14 <= 0) goto L_0x0163
            x.b.a.a.g r14 = p425x.p472b.p473a.p474a.C5183g.EXPOSED
            goto L_0x0158
        L_0x0163:
            x.b.a.a.g r14 = p425x.p472b.p473a.p474a.C5183g.HEALTHY
            goto L_0x0158
        L_0x0166:
            x.b.a.a.j r14 = new x.b.a.a.j
            boolean r3 = r0.mo11939c()
            android.content.SharedPreferences r0 = r0.f12413a
            r8 = 0
            long r8 = r0.getLong(r2, r8)
            r1 = r14
            r2 = r3
            r3 = r8
            r1.<init>(r2, r3, r5, r6, r7)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p425x.p472b.p473a.p474a.C5178e.m11614a(android.content.Context):x.b.a.a.j");
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.google.android.gms.nearby.exposurenotification.TemporaryExposureKey>, for r7v0, types: [java.util.List, java.util.List<com.google.android.gms.nearby.exposurenotification.TemporaryExposureKey>] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void m11620a(org.dpppt.android.sdk.models.DayDate r5, android.app.Activity r6, java.util.List<com.google.android.gms.nearby.exposurenotification.TemporaryExposureKey> r7) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x0009:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0025
            java.lang.Object r1 = r7.next()
            com.google.android.gms.nearby.exposurenotification.TemporaryExposureKey r1 = (com.google.android.gms.nearby.exposurenotification.TemporaryExposureKey) r1
            int r2 = r1.f1128f
            long r3 = r5.getStartOfDayTimestamp()
            int r3 = p119o.p120a.C0967p0.m2170a(r3)
            if (r2 < r3) goto L_0x0009
            r0.add(r1)
            goto L_0x0009
        L_0x0025:
            long r1 = java.lang.System.currentTimeMillis()
            int r5 = p119o.p120a.C0967p0.m2170a(r1)
            org.dpppt.android.sdk.internal.backend.models.GaenRequest r7 = new org.dpppt.android.sdk.internal.backend.models.GaenRequest
            r7.<init>(r0, r5)
            x.b.a.a.l.d r0 = p425x.p472b.p473a.p474a.p476l.C5195d.m11631b(r6)
            x.b.a.a.l.k.c r1 = r0.mo11935a(r6)     // Catch:{ IllegalStateException -> 0x005e }
            x.b.a.a.e$b r2 = f12369c     // Catch:{ IllegalStateException -> 0x005e }
            org.dpppt.android.sdk.models.ExposeeAuthMethod r2 = r2.f12374b     // Catch:{ IllegalStateException -> 0x005e }
            x.b.a.a.e$a r3 = new x.b.a.a.e$a     // Catch:{ IllegalStateException -> 0x005e }
            r3.<init>(r5, r6, r0)     // Catch:{ IllegalStateException -> 0x005e }
            boolean r5 = r2 instanceof org.dpppt.android.sdk.models.ExposeeAuthMethodAuthorization     // Catch:{ IllegalStateException -> 0x005e }
            if (r5 == 0) goto L_0x004e
            org.dpppt.android.sdk.models.ExposeeAuthMethodAuthorization r2 = (org.dpppt.android.sdk.models.ExposeeAuthMethodAuthorization) r2     // Catch:{ IllegalStateException -> 0x005e }
            java.lang.String r5 = r2.getAuthorization()     // Catch:{ IllegalStateException -> 0x005e }
            goto L_0x004f
        L_0x004e:
            r5 = 0
        L_0x004f:
            x.b.a.a.l.k.f r6 = r1.f12424a     // Catch:{ IllegalStateException -> 0x005e }
            y.d r5 = r6.mo11955a(r7, r5)     // Catch:{ IllegalStateException -> 0x005e }
            x.b.a.a.l.k.b r6 = new x.b.a.a.l.k.b     // Catch:{ IllegalStateException -> 0x005e }
            r6.<init>(r1, r3)     // Catch:{ IllegalStateException -> 0x005e }
            r5.mo11987a(r6)     // Catch:{ IllegalStateException -> 0x005e }
            goto L_0x0062
        L_0x005e:
            r5 = move-exception
            m11619a(r5)
        L_0x0062:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p425x.p472b.p473a.p474a.C5178e.m11620a(org.dpppt.android.sdk.models.DayDate, android.app.Activity, java.util.List):void");
    }

    /* renamed from: a */
    public static /* synthetic */ void m11617a(Activity activity, Runnable runnable) {
        f12368b = null;
        C5241l.m11679a(true, null, activity);
        m11615a();
        C5195d.m11631b((Context) activity).f12413a.edit().putBoolean("tracingEnabled", true).apply();
        SyncWorker.m2317a(activity);
        C0967p0.m2234b((Context) activity);
        runnable.run();
    }

    /* renamed from: a */
    public static /* synthetic */ void m11621a(C1381a aVar, Exception exc) {
        f12368b = null;
        aVar.mo3659a(exc);
    }

    /* renamed from: a */
    public static boolean m11622a(Activity activity, int i, int i2) {
        if (i == 391) {
            C5181c cVar = f12368b;
            String str = "DP3T Interface";
            if (cVar == null) {
                C5229g.m11667d(str, "onActivityResult: start confirmation, missing callback");
                return false;
            }
            if (i2 == -1) {
                m11618a(activity, cVar.f12376a, cVar.f12377b, cVar.f12378c);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("onActivityResult: start confirmation, resultCode=");
                sb.append(i2);
                C5229g.m11667d(str, sb.toString());
                Runnable runnable = f12368b.f12378c;
                f12368b = null;
                runnable.run();
            }
            return true;
        } else if (i != 392) {
            return false;
        } else {
            if (i2 == -1) {
                m11616a(activity);
            } else {
                m11619a((Throwable) new CancellationException("user denied key export"));
            }
            return true;
        }
    }

    /* renamed from: a */
    public static void m11619a(Throwable th) {
        if (f12369c != null) {
            C5229g.m11664a("DP3T Interface", "reportFailedIAmInfected", th);
            f12369c.f12375c.mo3662a(th);
            f12369c = null;
            return;
        }
        throw new IllegalStateException("pendingIAmInfectedRequest must be set before calling reportFailedIAmInfected()");
    }

    /* renamed from: a */
    public static void m11618a(Activity activity, Runnable runnable, C1381a<Exception> aVar, Runnable runnable2) {
        f12368b = new C5181c(runnable, aVar, runnable2, null);
        C5242m a = C5242m.m11680a((Context) activity);
        C5174a aVar2 = new C5174a(activity, runnable);
        C5176c cVar = new C5176c(aVar);
        C2842n2 n2Var = (C2842n2) a.f12480a;
        if (n2Var != null) {
            C2191a a2 = C2190m.m5016a();
            a2.f6092a = C2854q2.f7085a;
            a2.f6094c = new C2119d[]{C3216e.f8070c};
            C3255i a3 = n2Var.mo7139a(1, a2.mo7206a());
            C5239j jVar = new C5239j(aVar2);
            C3250f0 f0Var = (C3250f0) a3;
            if (f0Var != null) {
                f0Var.mo8926a(C3259k.f8131a, (C3249f<? super TResult>) jVar);
                f0Var.mo8925a(C3259k.f8131a, (C3247e) new C5233d(activity, 391, cVar));
                return;
            }
            throw null;
        }
        throw null;
    }
}
