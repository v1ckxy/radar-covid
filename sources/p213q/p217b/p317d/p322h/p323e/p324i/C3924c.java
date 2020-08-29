package p213q.p217b.p317d.p322h.p323e.p324i;

import android.os.Bundle;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: q.b.d.h.e.i.c */
public class C3924c implements C3923b, C3922a {

    /* renamed from: a */
    public final C3926e f9574a;

    /* renamed from: b */
    public final int f9575b;

    /* renamed from: c */
    public final TimeUnit f9576c;

    /* renamed from: d */
    public final Object f9577d = new Object();

    /* renamed from: e */
    public CountDownLatch f9578e;

    public C3924c(C3926e eVar, int i, TimeUnit timeUnit) {
        this.f9574a = eVar;
        this.f9575b = i;
        this.f9576c = timeUnit;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:10|11) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        p213q.p217b.p317d.p322h.p323e.C3913b.f9552c.mo10108a("Interrupted while awaiting app exception callback from FA listener.");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x003c */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo10116a(java.lang.String r4, android.os.Bundle r5) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f9577d
            monitor-enter(r0)
            q.b.d.h.e.b r1 = p213q.p217b.p317d.p322h.p323e.C3913b.f9552c     // Catch:{ all -> 0x0048 }
            java.lang.String r2 = "Logging Crashlytics event to Firebase"
            r1.mo10108a(r2)     // Catch:{ all -> 0x0048 }
            java.util.concurrent.CountDownLatch r1 = new java.util.concurrent.CountDownLatch     // Catch:{ all -> 0x0048 }
            r2 = 1
            r1.<init>(r2)     // Catch:{ all -> 0x0048 }
            r3.f9578e = r1     // Catch:{ all -> 0x0048 }
            q.b.d.h.e.i.e r1 = r3.f9574a     // Catch:{ all -> 0x0048 }
            q.b.d.f.a.a r1 = r1.f9580a     // Catch:{ all -> 0x0048 }
            java.lang.String r2 = "clx"
            r1.mo10071a(r2, r4, r5)     // Catch:{ all -> 0x0048 }
            q.b.d.h.e.b r4 = p213q.p217b.p317d.p322h.p323e.C3913b.f9552c     // Catch:{ all -> 0x0048 }
            java.lang.String r5 = "Awaiting app exception callback from FA..."
            r4.mo10108a(r5)     // Catch:{ all -> 0x0048 }
            java.util.concurrent.CountDownLatch r4 = r3.f9578e     // Catch:{ InterruptedException -> 0x003c }
            int r5 = r3.f9575b     // Catch:{ InterruptedException -> 0x003c }
            long r1 = (long) r5     // Catch:{ InterruptedException -> 0x003c }
            java.util.concurrent.TimeUnit r5 = r3.f9576c     // Catch:{ InterruptedException -> 0x003c }
            boolean r4 = r4.await(r1, r5)     // Catch:{ InterruptedException -> 0x003c }
            if (r4 == 0) goto L_0x0037
            q.b.d.h.e.b r4 = p213q.p217b.p317d.p322h.p323e.C3913b.f9552c     // Catch:{ InterruptedException -> 0x003c }
            java.lang.String r5 = "App exception callback received from FA listener."
        L_0x0033:
            r4.mo10108a(r5)     // Catch:{ InterruptedException -> 0x003c }
            goto L_0x0043
        L_0x0037:
            q.b.d.h.e.b r4 = p213q.p217b.p317d.p322h.p323e.C3913b.f9552c     // Catch:{ InterruptedException -> 0x003c }
            java.lang.String r5 = "Timeout exceeded while awaiting app exception callback from FA listener."
            goto L_0x0033
        L_0x003c:
            q.b.d.h.e.b r4 = p213q.p217b.p317d.p322h.p323e.C3913b.f9552c     // Catch:{ all -> 0x0048 }
            java.lang.String r5 = "Interrupted while awaiting app exception callback from FA listener."
            r4.mo10108a(r5)     // Catch:{ all -> 0x0048 }
        L_0x0043:
            r4 = 0
            r3.f9578e = r4     // Catch:{ all -> 0x0048 }
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x0048:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p317d.p322h.p323e.p324i.C3924c.mo10116a(java.lang.String, android.os.Bundle):void");
    }

    /* renamed from: b */
    public void mo10117b(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.f9578e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}
