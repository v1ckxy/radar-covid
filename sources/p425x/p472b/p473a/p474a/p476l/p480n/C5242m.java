package p425x.p472b.p473a.p474a.p476l.p480n;

import android.app.Activity;
import android.content.Context;
import android.content.IntentSender.SendIntentException;
import com.google.android.gms.nearby.exposurenotification.TemporaryExposureKey;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import p124p.p126b.p127k.C1061o;
import p124p.p150h.p161k.C1381a;
import p213q.p217b.p218a.p231b.p239d.C2119d;
import p213q.p217b.p218a.p231b.p239d.p240m.C2147b;
import p213q.p217b.p218a.p231b.p239d.p240m.p241k.C2190m;
import p213q.p217b.p218a.p231b.p239d.p240m.p241k.C2190m.C2191a;
import p213q.p217b.p218a.p231b.p251g.p257f.C2842n2;
import p213q.p217b.p218a.p231b.p251g.p257f.C2870u2;
import p213q.p217b.p218a.p231b.p262i.C3190a;
import p213q.p217b.p218a.p231b.p262i.C3216e;
import p213q.p217b.p218a.p231b.p262i.p264c.C3200a;
import p213q.p217b.p218a.p231b.p262i.p264c.C3201b;
import p213q.p217b.p218a.p231b.p270l.C3247e;
import p213q.p217b.p218a.p231b.p270l.C3249f;
import p213q.p217b.p218a.p231b.p270l.C3250f0;
import p213q.p217b.p218a.p231b.p270l.C3255i;
import p213q.p217b.p218a.p231b.p270l.C3259k;
import p425x.p472b.p473a.p474a.p476l.p479m.C5229g;

/* renamed from: x.b.a.a.l.n.m */
public class C5242m {

    /* renamed from: c */
    public static C5242m f12479c;

    /* renamed from: a */
    public final C3201b f12480a;

    /* renamed from: b */
    public C3200a f12481b;

    public C5242m(Context context) {
        this.f12480a = C3190a.m7517a(context);
    }

    /* renamed from: a */
    public static synchronized C5242m m11680a(Context context) {
        C5242m mVar;
        synchronized (C5242m.class) {
            if (f12479c == null) {
                f12479c = new C5242m(context.getApplicationContext());
            }
            mVar = f12479c;
        }
        return mVar;
    }

    /* renamed from: a */
    public static /* synthetic */ void m11683a(Runnable runnable, Void voidR) {
        C5229g.m11666c("GoogleExposureClient", "start: started successfully");
        runnable.run();
    }

    /* renamed from: a */
    public static /* synthetic */ void m11684a(String str, Object obj, Void voidR) {
        StringBuilder sb = new StringBuilder();
        sb.append("provideDiagnosisKeys: inserted keys successfully for token ");
        sb.append(str);
        C5229g.m11663a("GoogleExposureClient", sb.toString());
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m11685a(String str, Exception[] excArr, Object obj, Exception exc) {
        StringBuilder sb = new StringBuilder();
        sb.append("provideDiagnosisKeys for token ");
        sb.append(str);
        C5229g.m11664a("GoogleExposureClient", sb.toString(), exc);
        excArr[0] = exc;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m11687a(C3249f fVar, List list) {
        C5229g.m11663a("GoogleExposureClient", "getTemporaryExposureKeyHistory: success");
        fVar.mo4216a(list);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Exception, code=java.lang.Object, for r3v0, types: [java.lang.Object, java.lang.Exception] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void m11688a(java.lang.Object[] r1, java.lang.Object r2, java.lang.Object r3) {
        /*
            r0 = 0
            r1[r0] = r3
            monitor-enter(r2)
            r2.notifyAll()     // Catch:{ all -> 0x0009 }
            monitor-exit(r2)     // Catch:{ all -> 0x0009 }
            return
        L_0x0009:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0009 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p425x.p472b.p473a.p474a.p476l.p480n.C5242m.m11688a(java.lang.Object[], java.lang.Object, java.lang.Exception):void");
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.lang.Object, for r3v0, types: [java.util.List, java.lang.Object] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void m11689a(java.lang.Object[] r1, java.lang.Object r2, java.lang.Object r3) {
        /*
            r0 = 0
            r1[r0] = r3
            monitor-enter(r2)
            r2.notifyAll()     // Catch:{ all -> 0x0009 }
            monitor-exit(r2)     // Catch:{ all -> 0x0009 }
            return
        L_0x0009:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0009 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p425x.p472b.p473a.p474a.p476l.p480n.C5242m.m11689a(java.lang.Object[], java.lang.Object, java.util.List):void");
    }

    /* renamed from: b */
    public static /* synthetic */ void m11690b(Activity activity, int i, C1381a aVar, Exception exc) {
        String str = "GoogleExposureClient";
        if (exc instanceof C2147b) {
            C2147b bVar = (C2147b) exc;
            if (bVar.f6010e.f1062f == 6) {
                try {
                    C5229g.m11666c(str, "start: resolution required");
                    bVar.f6010e.mo1522a(activity, i);
                    return;
                } catch (SendIntentException unused) {
                    C5229g.m11665b(str, "start: error calling startResolutionForResult()");
                }
            }
        }
        C5229g.m11664a(str, "start", exc);
        aVar.mo3659a(exc);
    }

    /* renamed from: a */
    public List<TemporaryExposureKey> mo11963a() {
        Object obj = new Object();
        Object[] objArr = {null};
        synchronized (obj) {
            C3255i b = ((C2842n2) this.f12480a).mo8196b();
            C5235f fVar = new C5235f(objArr, obj);
            C3250f0 f0Var = (C3250f0) b;
            if (f0Var != null) {
                f0Var.mo8926a(C3259k.f8131a, (C3249f<? super TResult>) fVar);
                f0Var.mo8925a(C3259k.f8131a, (C3247e) new C5230a(objArr, obj));
                obj.wait();
            } else {
                throw null;
            }
        }
        if (objArr[0] instanceof Exception) {
            throw ((Exception) objArr[0]);
        } else if (objArr[0] instanceof List) {
            return (List) objArr[0];
        } else {
            throw new IllegalStateException("either exception or result must be set");
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m11681a(Activity activity, int i, C1381a aVar, Exception exc) {
        String str = "GoogleExposureClient";
        if (exc instanceof C2147b) {
            C2147b bVar = (C2147b) exc;
            if (bVar.f6010e.f1062f == 6) {
                try {
                    C5229g.m11666c(str, "getTemporaryExposureKeyHistory: resolution required");
                    bVar.f6010e.mo1522a(activity, i);
                    return;
                } catch (SendIntentException unused) {
                    C5229g.m11665b(str, "getTemporaryExposureKeyHistory: error calling startResolutionForResult()");
                }
            }
        }
        C5229g.m11664a(str, "getTemporaryExposureKeyHistory", exc);
        aVar.mo3659a(exc);
    }

    /* renamed from: a */
    public void mo11965a(List<File> list, String str) {
        if (list != null && !list.isEmpty()) {
            if (this.f12481b != null) {
                Object obj = new Object();
                Exception[] excArr = {null};
                synchronized (obj) {
                    C3201b bVar = this.f12480a;
                    C3200a aVar = this.f12481b;
                    C2842n2 n2Var = (C2842n2) bVar;
                    if (n2Var != null) {
                        C2191a a = C2190m.m5016a();
                        a.f6092a = new C2870u2(list, aVar, str);
                        a.f6094c = new C2119d[]{C3216e.f8070c};
                        C3255i a2 = n2Var.mo7139a(1, a.mo7206a());
                        C5234e eVar = new C5234e(str, obj);
                        C3250f0 f0Var = (C3250f0) a2;
                        if (f0Var != null) {
                            f0Var.mo8926a(C3259k.f8131a, (C3249f<? super TResult>) eVar);
                            f0Var.mo8925a(C3259k.f8131a, (C3247e) new C5232c(str, excArr, obj));
                            obj.wait();
                        } else {
                            throw null;
                        }
                    } else {
                        throw null;
                    }
                }
                if (excArr[0] != null) {
                    throw excArr[0];
                }
                return;
            }
            throw new IllegalStateException("must call setParams()");
        }
    }

    /* renamed from: a */
    public void mo11964a(int i, int i2) {
        int[] iArr = {4, 4, 4, 4, 4, 4, 4, 4};
        int[] iArr2 = {4, 4, 4, 4, 4, 4, 4, 4};
        int[] iArr3 = {4, 4, 4, 4, 4, 4, 4, 4};
        C1061o.m2509a(true, "minimumRiskScore (%s) must be >= 1 and <= 4096", Integer.valueOf(1));
        int[] iArr4 = {1, 1, 1, 1, 1, 1, 1, 1};
        C1061o.m2509a(true, "attenuationScores (%s) must have exactly 8 elements", Arrays.toString(iArr4));
        for (int i3 = 0; i3 < 8; i3++) {
            int i4 = iArr4[i3];
            C1061o.m2509a(i4 >= 0 && i4 <= 8, "attenuationScore (%s) must be >= 0 and <= 8", Integer.valueOf(i4));
        }
        int[] copyOf = Arrays.copyOf(iArr4, 8);
        C1061o.m2509a(true, "attenuationWeight (%s) must be >= 0 and <= 100", Integer.valueOf(100));
        C1061o.m2509a(true, "daysSinceLastExposureWeight (%s) must be >= 0 and <= 100", Integer.valueOf(0));
        C1061o.m2509a(true, "durationWeight (%s) must be >= 0 and <= 100", Integer.valueOf(0));
        C1061o.m2509a(true, "transmissionRiskWeight (%s) must be >= 0 and <= 100", Integer.valueOf(0));
        int[] iArr5 = {i, i2};
        C1061o.m2509a(true, "durationAtAttenuationThresholds (%s) must have exactly 2 elements", Arrays.toString(iArr5));
        for (int i5 = 0; i5 < 2; i5++) {
            int i6 = iArr5[i5];
            C1061o.m2509a(i6 >= 0 && i6 <= 255, "durationAtAttenuationThreshold (%s) must be >= 0 and <= 255", Integer.valueOf(i6));
        }
        C1061o.m2509a(iArr5[0] <= iArr5[1], "durationAtAttenuationThresholds[0] (%s) must be <= than durationAtAttenuationThresholds[0] (%s)", Integer.valueOf(iArr5[0]), Integer.valueOf(iArr5[1]));
        C3200a aVar = new C3200a(1, copyOf, 100, iArr, 0, iArr2, 0, iArr3, 0, iArr5);
        this.f12481b = aVar;
    }
}
