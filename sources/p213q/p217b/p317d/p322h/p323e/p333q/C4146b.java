package p213q.p217b.p317d.p322h.p323e.p333q;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p317d.p322h.p323e.C3913b;
import p213q.p217b.p317d.p322h.p323e.p326k.C3936d;
import p213q.p217b.p317d.p322h.p323e.p326k.C3961m0;
import p213q.p217b.p317d.p322h.p323e.p326k.C3975t;
import p213q.p217b.p317d.p322h.p323e.p333q.p334c.C4153c;
import p213q.p217b.p317d.p322h.p323e.p333q.p335d.C4157b;

/* renamed from: q.b.d.h.e.q.b */
public class C4146b {

    /* renamed from: h */
    public static final short[] f10032h = {10, 20, 30, 60, 120, 300};

    /* renamed from: a */
    public final C4157b f10033a;

    /* renamed from: b */
    public final String f10034b;

    /* renamed from: c */
    public final String f10035c;

    /* renamed from: d */
    public final C3961m0 f10036d;

    /* renamed from: e */
    public final C4145a f10037e;

    /* renamed from: f */
    public final C4147a f10038f;

    /* renamed from: g */
    public Thread f10039g;

    /* renamed from: q.b.d.h.e.q.b$a */
    public interface C4147a {
    }

    /* renamed from: q.b.d.h.e.q.b$b */
    public interface C4148b {
    }

    /* renamed from: q.b.d.h.e.q.b$c */
    public interface C4149c {
    }

    /* renamed from: q.b.d.h.e.q.b$d */
    public class C4150d extends C3936d {

        /* renamed from: e */
        public final List<C4153c> f10040e;

        /* renamed from: f */
        public final boolean f10041f;

        /* renamed from: g */
        public final float f10042g;

        public C4150d(List<C4153c> list, boolean z, float f) {
            this.f10040e = list;
            this.f10041f = z;
            this.f10042g = f;
        }

        /* renamed from: a */
        public final void mo10358a(List<C4153c> list, boolean z) {
            C3913b bVar = C3913b.f9552c;
            StringBuilder a = C1965a.m4756a("Starting report processing in ");
            a.append(this.f10042g);
            a.append(" second(s)...");
            bVar.mo10108a(a.toString());
            float f = this.f10042g;
            if (f > 0.0f) {
                try {
                    Thread.sleep((long) (f * 1000.0f));
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            if (!C3975t.this.mo10180f()) {
                int i = 0;
                r8 = list;
                while (r8.size() > 0 && !C3975t.this.mo10180f()) {
                    C3913b bVar2 = C3913b.f9552c;
                    StringBuilder a2 = C1965a.m4756a("Attempting to send ");
                    a2.append(r8.size());
                    a2.append(" report(s)");
                    bVar2.mo10108a(a2.toString());
                    ArrayList arrayList = new ArrayList();
                    for (C4153c cVar : r8) {
                        if (!C4146b.this.mo10357a(cVar, z)) {
                            arrayList.add(cVar);
                        }
                    }
                    if (arrayList.size() > 0) {
                        short[] sArr = C4146b.f10032h;
                        int i2 = i + 1;
                        long j = (long) sArr[Math.min(i, sArr.length - 1)];
                        C3913b bVar3 = C3913b.f9552c;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Report submission: scheduling delayed retry in ");
                        sb.append(j);
                        sb.append(" seconds");
                        bVar3.mo10108a(sb.toString());
                        Thread.sleep(j * 1000);
                        i = i2;
                    }
                    r8 = arrayList;
                }
            }
        }

        /* renamed from: a */
        public void mo10126a() {
            try {
                mo10358a(this.f10040e, this.f10041f);
            } catch (Exception e) {
                C3913b bVar = C3913b.f9552c;
                if (bVar.mo10110a(6)) {
                    Log.e(bVar.f9553a, "An unexpected error occurred while attempting to upload crash reports.", e);
                }
            }
            C4146b.this.f10039g = null;
        }
    }

    public C4146b(String str, String str2, C3961m0 m0Var, C4145a aVar, C4157b bVar, C4147a aVar2) {
        if (bVar != null) {
            this.f10033a = bVar;
            this.f10034b = str;
            this.f10035c = str2;
            this.f10036d = m0Var;
            this.f10037e = aVar;
            this.f10038f = aVar2;
            return;
        }
        throw new IllegalArgumentException("createReportCall must not be null.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0062 A[Catch:{ Exception -> 0x006b }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo10357a(p213q.p217b.p317d.p322h.p323e.p333q.p334c.C4153c r6, boolean r7) {
        /*
            r5 = this;
            q.b.d.h.e.q.c.a r0 = new q.b.d.h.e.q.c.a     // Catch:{ Exception -> 0x006b }
            java.lang.String r1 = r5.f10034b     // Catch:{ Exception -> 0x006b }
            java.lang.String r2 = r5.f10035c     // Catch:{ Exception -> 0x006b }
            r0.<init>(r1, r2, r6)     // Catch:{ Exception -> 0x006b }
            q.b.d.h.e.k.m0 r1 = r5.f10036d     // Catch:{ Exception -> 0x006b }
            q.b.d.h.e.k.m0 r2 = p213q.p217b.p317d.p322h.p323e.p326k.C3961m0.ALL     // Catch:{ Exception -> 0x006b }
            r3 = 0
            r4 = 1
            if (r1 != r2) goto L_0x0016
            q.b.d.h.e.b r7 = p213q.p217b.p317d.p322h.p323e.C3913b.f9552c     // Catch:{ Exception -> 0x006b }
            java.lang.String r0 = "Send to Reports Endpoint disabled. Removing Reports Endpoint report."
            goto L_0x0028
        L_0x0016:
            q.b.d.h.e.k.m0 r1 = r5.f10036d     // Catch:{ Exception -> 0x006b }
            q.b.d.h.e.k.m0 r2 = p213q.p217b.p317d.p322h.p323e.p326k.C3961m0.JAVA_ONLY     // Catch:{ Exception -> 0x006b }
            if (r1 != r2) goto L_0x002d
            q.b.d.h.e.q.c.c$a r1 = r6.getType()     // Catch:{ Exception -> 0x006b }
            q.b.d.h.e.q.c.c$a r2 = p213q.p217b.p317d.p322h.p323e.p333q.p334c.C4153c.C4154a.JAVA     // Catch:{ Exception -> 0x006b }
            if (r1 != r2) goto L_0x002d
            q.b.d.h.e.b r7 = p213q.p217b.p317d.p322h.p323e.C3913b.f9552c     // Catch:{ Exception -> 0x006b }
            java.lang.String r0 = "Send to Reports Endpoint for non-native reports disabled. Removing Reports Uploader report."
        L_0x0028:
            r7.mo10108a(r0)     // Catch:{ Exception -> 0x006b }
            r7 = r4
            goto L_0x0060
        L_0x002d:
            q.b.d.h.e.q.d.b r1 = r5.f10033a     // Catch:{ Exception -> 0x006b }
            boolean r7 = r1.mo10366a(r0, r7)     // Catch:{ Exception -> 0x006b }
            q.b.d.h.e.b r0 = p213q.p217b.p317d.p322h.p323e.C3913b.f9552c     // Catch:{ Exception -> 0x006b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x006b }
            r1.<init>()     // Catch:{ Exception -> 0x006b }
            java.lang.String r2 = "Crashlytics Reports Endpoint upload "
            r1.append(r2)     // Catch:{ Exception -> 0x006b }
            if (r7 == 0) goto L_0x0044
            java.lang.String r2 = "complete: "
            goto L_0x0046
        L_0x0044:
            java.lang.String r2 = "FAILED: "
        L_0x0046:
            r1.append(r2)     // Catch:{ Exception -> 0x006b }
            java.lang.String r2 = r6.mo10362d()     // Catch:{ Exception -> 0x006b }
            r1.append(r2)     // Catch:{ Exception -> 0x006b }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x006b }
            r2 = 4
            boolean r2 = r0.mo10110a(r2)     // Catch:{ Exception -> 0x006b }
            if (r2 == 0) goto L_0x0060
            java.lang.String r0 = r0.f9553a     // Catch:{ Exception -> 0x006b }
            android.util.Log.i(r0, r1, r3)     // Catch:{ Exception -> 0x006b }
        L_0x0060:
            if (r7 == 0) goto L_0x0082
            q.b.d.h.e.q.a r7 = r5.f10037e     // Catch:{ Exception -> 0x006b }
            if (r7 == 0) goto L_0x006a
            r6.remove()     // Catch:{ Exception -> 0x006b }
            goto L_0x0083
        L_0x006a:
            throw r3     // Catch:{ Exception -> 0x006b }
        L_0x006b:
            r7 = move-exception
            q.b.d.h.e.b r0 = p213q.p217b.p317d.p322h.p323e.C3913b.f9552c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Error occurred sending report "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.mo10112b(r6, r7)
        L_0x0082:
            r4 = 0
        L_0x0083:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p317d.p322h.p323e.p333q.C4146b.mo10357a(q.b.d.h.e.q.c.c, boolean):boolean");
    }

    /* renamed from: a */
    public synchronized void mo10356a(List<C4153c> list, boolean z, float f) {
        if (this.f10039g != null) {
            C3913b.f9552c.mo10108a("Report upload has already been started.");
            return;
        }
        Thread thread = new Thread(new C4150d(list, z, f), "Crashlytics Report Uploader");
        this.f10039g = thread;
        thread.start();
    }
}
