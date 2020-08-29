package p002es.gob.radarcovid.features.kpireport;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.nearby.exposurenotification.ExposureSummary;
import java.util.Objects;
import p002es.gob.radarcovid.models.request.RequestKpi;
import p002es.gob.radarcovid.models.request.RequestKpiReport;
import p003f.p004a.p005a.p006a.p007a.C0413b;
import p003f.p004a.p005a.p006a.p007a.C0414c;
import p003f.p004a.p005a.p006a.p008b.C0436a;
import p392u.p401r.p403c.C4638h;
import p410v.C4690b0;
import p410v.C4690b0.C4691a;
import p410v.p422n0.C4855a;
import p410v.p422n0.C4855a.C4856a;
import p484y.C5265d0.C5267b;
import p484y.C5280h.C5281a;
import p484y.p485i0.p486a.C5290a;
import p484y.p485i0.p487b.C5303k;

/* renamed from: es.gob.radarcovid.features.kpireport.KpiReportWorker */
public final class KpiReportWorker extends Worker {

    /* renamed from: i */
    public final C0413b f1743i;

    public KpiReportWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            C4638h.m10271a("context");
            throw null;
        } else if (workerParameters != null) {
            super(context, workerParameters);
            C5267b bVar = new C5267b();
            bVar.mo12000a("https://radarcovid.covid19.gob.es/");
            C4691a aVar = new C4691a();
            C4855a aVar2 = new C4855a(null, 1);
            C4856a aVar3 = C4856a.BODY;
            if (aVar3 != null) {
                aVar2.f11581b = aVar3;
                aVar.mo10981a(aVar2);
                bVar.mo12001a(new C4690b0(aVar));
                String str = "factory == null";
                bVar.f12565d.add((C5281a) Objects.requireNonNull(new C5303k(), str));
                bVar.f12565d.add((C5281a) Objects.requireNonNull(C5290a.m11782a(), str));
                Object a = bVar.mo12002a().mo11993a(C0436a.class);
                C4638h.m10270a(a, "Retrofit.Builder()\n     …ApiInterface::class.java)");
                this.f1743i = new C0414c((C0436a) a);
                return;
            }
            C4638h.m10271a("<set-?>");
            throw null;
        } else {
            C4638h.m10271a("workerParams");
            throw null;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ RequestKpiReport m1337a(KpiReportWorker kpiReportWorker, ExposureSummary exposureSummary, String str) {
        if (kpiReportWorker == null) {
            throw null;
        } else if (exposureSummary.mo1623c().length != 3) {
            return null;
        } else {
            RequestKpiReport requestKpiReport = new RequestKpiReport();
            requestKpiReport.add(new RequestKpi(RequestKpi.ATTENUATION_DURATIONS_1, str, exposureSummary.mo1623c()[0]));
            requestKpiReport.add(new RequestKpi(RequestKpi.ATTENUATION_DURATIONS_2, str, exposureSummary.mo1623c()[1]));
            requestKpiReport.add(new RequestKpi(RequestKpi.ATTENUATION_DURATIONS_3, str, exposureSummary.mo1623c()[2]));
            requestKpiReport.add(new RequestKpi(RequestKpi.DAYS_SINCE_LAST_EXPOSURE, str, exposureSummary.f1122e));
            requestKpiReport.add(new RequestKpi(RequestKpi.MATCHED_KEY_COUNT, str, exposureSummary.f1123f));
            requestKpiReport.add(new RequestKpi(RequestKpi.MAXIMUM_RISK_SCORE, str, exposureSummary.f1124g));
            requestKpiReport.add(new RequestKpi(RequestKpi.SUMMATION_RISK_SCORE, str, exposureSummary.f1126i));
            return requestKpiReport;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r6v2 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.work.ListenableWorker.C0177a mo1455e() {
        /*
            r11 = this;
            android.content.Context r5 = r11.f978e
            java.lang.String r0 = "applicationContext"
            p392u.p401r.p403c.C4638h.m10270a(r5, r0)
            x.b.a.a.l.d r0 = p425x.p472b.p473a.p474a.p476l.C5195d.m11631b(r5)
            java.lang.String r1 = "AppConfigManager.getInstance(context)"
            p392u.p401r.p403c.C4638h.m10270a(r0, r1)
            java.util.HashMap r0 = r0.mo11937b()
            java.lang.String r1 = "lastLoadedTimes"
            p392u.p401r.p403c.C4638h.m10270a(r0, r1)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            java.lang.String r2 = "it.key"
            r6 = 0
            if (r1 != 0) goto L_0x002c
            r1 = r6
            goto L_0x0067
        L_0x002c:
            java.lang.Object r1 = r0.next()
            boolean r3 = r0.hasNext()
            if (r3 != 0) goto L_0x0037
            goto L_0x0067
        L_0x0037:
            r3 = r1
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r3 = r3.getKey()
            p392u.p401r.p403c.C4638h.m10270a(r3, r2)
            org.dpppt.android.sdk.models.DayDate r3 = (org.dpppt.android.sdk.models.DayDate) r3
            long r3 = r3.getStartOfDayTimestamp()
        L_0x0047:
            java.lang.Object r7 = r0.next()
            r8 = r7
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r8 = r8.getKey()
            p392u.p401r.p403c.C4638h.m10270a(r8, r2)
            org.dpppt.android.sdk.models.DayDate r8 = (org.dpppt.android.sdk.models.DayDate) r8
            long r8 = r8.getStartOfDayTimestamp()
            int r10 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r10 >= 0) goto L_0x0061
            r1 = r7
            r3 = r8
        L_0x0061:
            boolean r7 = r0.hasNext()
            if (r7 != 0) goto L_0x0047
        L_0x0067:
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            if (r1 == 0) goto L_0x012f
            java.util.Date r0 = new java.util.Date
            java.lang.Object r3 = r1.getKey()
            p392u.p401r.p403c.C4638h.m10270a(r3, r2)
            org.dpppt.android.sdk.models.DayDate r3 = (org.dpppt.android.sdk.models.DayDate) r3
            long r2 = r3.getStartOfDayTimestamp()
            r0.<init>(r2)
            java.lang.String r2 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5285b(r0)
            java.lang.Object r0 = r1.getKey()
            org.dpppt.android.sdk.models.DayDate r0 = (org.dpppt.android.sdk.models.DayDate) r0
            java.lang.String r1 = r0.formatAsString()
            f.a.a.b.f.a r7 = new f.a.a.b.f.a
            r3 = 0
            r0 = r7
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = 1
            u.p.h r1 = p392u.p395p.C4588h.f10792e
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            u.p.e$a r3 = p392u.p395p.C4581e.f10789b
            u.p.f$a r3 = r1.get(r3)
            u.p.e r3 = (p392u.p395p.C4581e) r3
            if (r3 != 0) goto L_0x00b1
            o.a.p1 r3 = p119o.p120a.C0968p1.f2584b
            o.a.m0 r3 = p119o.p120a.C0968p1.m2253a()
            o.a.t0 r4 = p119o.p120a.C0981t0.f2594e
            u.p.f r1 = r1.plus(r3)
            goto L_0x00c4
        L_0x00b1:
            boolean r4 = r3 instanceof p119o.p120a.C0955m0
            if (r4 != 0) goto L_0x00b6
            r3 = r6
        L_0x00b6:
            o.a.m0 r3 = (p119o.p120a.C0955m0) r3
            o.a.p1 r3 = p119o.p120a.C0968p1.f2584b
            java.lang.ThreadLocal<o.a.m0> r3 = p119o.p120a.C0968p1.f2583a
            java.lang.Object r3 = r3.get()
            o.a.m0 r3 = (p119o.p120a.C0955m0) r3
            o.a.t0 r4 = p119o.p120a.C0981t0.f2594e
        L_0x00c4:
            u.p.f r1 = p119o.p120a.C1006x.m2303a(r4, r1)
            o.a.f r4 = new o.a.f
            r4.<init>(r1, r2, r3)
            o.a.c0 r1 = p119o.p120a.C0922c0.DEFAULT
            r4.mo4218a(r1, r4, r7)
            o.a.m0 r1 = r4.f2532i     // Catch:{ all -> 0x012d }
            r2 = 0
            if (r1 == 0) goto L_0x00da
            p119o.p120a.C0955m0.m2131b(r1, r2, r0, r6)     // Catch:{ all -> 0x012d }
        L_0x00da:
            boolean r1 = java.lang.Thread.interrupted()     // Catch:{ all -> 0x0124 }
            if (r1 != 0) goto L_0x011b
            o.a.m0 r1 = r4.f2532i     // Catch:{ all -> 0x0124 }
            if (r1 == 0) goto L_0x00e9
            long r7 = r1.mo4298o()     // Catch:{ all -> 0x0124 }
            goto L_0x00ee
        L_0x00e9:
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x00ee:
            java.lang.Object r1 = r4.mo4267i()     // Catch:{ all -> 0x0124 }
            boolean r1 = r1 instanceof p119o.p120a.C1003v0     // Catch:{ all -> 0x0124 }
            r1 = r1 ^ r0
            if (r1 == 0) goto L_0x0117
            o.a.m0 r1 = r4.f2532i     // Catch:{ all -> 0x012d }
            if (r1 == 0) goto L_0x00fe
            p119o.p120a.C0955m0.m2130a(r1, r2, r0, r6)     // Catch:{ all -> 0x012d }
        L_0x00fe:
            java.lang.Object r0 = r4.mo4267i()
            java.lang.Object r0 = p119o.p120a.C0938g1.m2096b(r0)
            boolean r1 = r0 instanceof p119o.p120a.C0975s
            if (r1 != 0) goto L_0x010b
            goto L_0x010c
        L_0x010b:
            r6 = r0
        L_0x010c:
            o.a.s r6 = (p119o.p120a.C0975s) r6
            if (r6 != 0) goto L_0x0114
            r6 = r0
            es.gob.radarcovid.models.request.RequestKpiReport r6 = (p002es.gob.radarcovid.models.request.RequestKpiReport) r6
            goto L_0x012f
        L_0x0114:
            java.lang.Throwable r0 = r6.f2591a
            throw r0
        L_0x0117:
            java.util.concurrent.locks.LockSupport.parkNanos(r4, r7)     // Catch:{ all -> 0x0124 }
            goto L_0x00da
        L_0x011b:
            java.lang.InterruptedException r1 = new java.lang.InterruptedException     // Catch:{ all -> 0x0124 }
            r1.<init>()     // Catch:{ all -> 0x0124 }
            r4.mo4258c(r1)     // Catch:{ all -> 0x0124 }
            throw r1     // Catch:{ all -> 0x0124 }
        L_0x0124:
            r1 = move-exception
            o.a.m0 r3 = r4.f2532i     // Catch:{ all -> 0x012d }
            if (r3 == 0) goto L_0x012c
            p119o.p120a.C0955m0.m2130a(r3, r2, r0, r6)     // Catch:{ all -> 0x012d }
        L_0x012c:
            throw r1     // Catch:{ all -> 0x012d }
        L_0x012d:
            r0 = move-exception
            throw r0
        L_0x012f:
            java.lang.String r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5344g(r6)
            java.lang.String r1 = "KpiReportWorker"
            android.util.Log.d(r1, r0)
            if (r6 == 0) goto L_0x0154
            f.a.a.a.a.b r0 = r11.f1743i
            x.c.a.a r0 = r0.mo3664a(r6)
            boolean r0 = r0.mo11966a()
            if (r0 == 0) goto L_0x014c
            androidx.work.ListenableWorker$a$c r0 = new androidx.work.ListenableWorker$a$c
            r0.<init>()
            goto L_0x0151
        L_0x014c:
            androidx.work.ListenableWorker$a$a r0 = new androidx.work.ListenableWorker$a$a
            r0.<init>()
        L_0x0151:
            java.lang.String r1 = "if (response.isRight())\n…         Result.failure()"
            goto L_0x015b
        L_0x0154:
            androidx.work.ListenableWorker$a$a r0 = new androidx.work.ListenableWorker$a$a
            r0.<init>()
            java.lang.String r1 = "Result.failure()"
        L_0x015b:
            p392u.p401r.p403c.C4638h.m10270a(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p002es.gob.radarcovid.features.kpireport.KpiReportWorker.mo1455e():androidx.work.ListenableWorker$a");
    }
}
