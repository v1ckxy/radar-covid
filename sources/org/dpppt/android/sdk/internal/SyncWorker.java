package org.dpppt.android.sdk.internal;

import android.content.Context;
import android.system.ErrnoException;
import android.system.OsConstants;
import androidx.work.ListenableWorker.C0177a;
import androidx.work.ListenableWorker.C0177a.C0179b;
import androidx.work.ListenableWorker.C0177a.C0180c;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import java.io.IOException;
import java.security.PublicKey;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLException;
import p116io.jsonwebtoken.lang.Strings;
import p119o.p120a.C0967p0;
import p124p.p199y.C1788c;
import p124p.p199y.C1788c.C1789a;
import p124p.p199y.C1794f;
import p124p.p199y.C1802m;
import p124p.p199y.C1811p;
import p124p.p199y.C1811p.C1812a;
import p124p.p199y.p200x.C1842l;
import p213q.p217b.p218a.p231b.p239d.p240m.C2147b;
import p425x.p472b.p473a.p474a.C5178e;
import p425x.p472b.p473a.p474a.C5186j.C5187a;
import p425x.p472b.p473a.p474a.p475k.C5189b;
import p425x.p472b.p473a.p474a.p476l.C5195d;
import p425x.p472b.p473a.p474a.p476l.p477k.C5215i;
import p425x.p472b.p473a.p474a.p476l.p477k.C5216j;
import p425x.p472b.p473a.p474a.p476l.p477k.C5217k;
import p425x.p472b.p473a.p474a.p476l.p478l.C5219a;
import p425x.p472b.p473a.p474a.p476l.p478l.C5221b;
import p425x.p472b.p473a.p474a.p476l.p478l.C5222c;
import p425x.p472b.p473a.p474a.p476l.p479m.C5228f;
import p425x.p472b.p473a.p474a.p476l.p479m.C5229g;
import p425x.p472b.p473a.p474a.p476l.p480n.C5240k;
import p425x.p472b.p473a.p474a.p476l.p480n.C5241l;

public class SyncWorker extends Worker {

    /* renamed from: i */
    public static PublicKey f2669i;

    /* renamed from: org.dpppt.android.sdk.internal.SyncWorker$a */
    public static class C1014a {

        /* renamed from: a */
        public Context f2670a;

        /* renamed from: b */
        public long f2671b;

        public C1014a(Context context) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f2670a = context;
            this.f2671b = currentTimeMillis;
        }

        /* renamed from: a */
        public void mo4370a() {
            C5187a aVar;
            String str;
            C5187a aVar2;
            synchronized (C1014a.class) {
                C0967p0.m2200a(this.f2670a, null);
                C0967p0.m2199a(this.f2670a);
                try {
                    mo4372b(this.f2670a);
                    if (C5178e.m11623b(this.f2670a) && !Boolean.FALSE.equals(C5241l.f12477b)) {
                        mo4371a(this.f2670a);
                        C5229g.m11666c("SyncWorker", "synced");
                        C5195d.m11631b(this.f2670a).f12413a.edit().putBoolean("lastSyncNetSuccess", true).apply();
                    }
                    C5217k.m11659a().f12428a = null;
                    C0967p0.m2234b(this.f2670a);
                } catch (Exception e) {
                    C5229g.m11664a("SyncWorker", "sync", e);
                    C5195d.m11631b(this.f2670a).f12413a.edit().putBoolean("lastSyncNetSuccess", false).apply();
                    if (e instanceof C5215i) {
                        aVar = C5187a.SYNC_ERROR_TIMING;
                    } else if (!(e instanceof C5189b)) {
                        if (e instanceof C5216j) {
                            aVar2 = C5187a.SYNC_ERROR_SERVER;
                            StringBuilder sb = new StringBuilder();
                            sb.append("ASST");
                            sb.append(((C5216j) e).f12426e.f11063i);
                            str = sb.toString();
                        } else if (e instanceof C2147b) {
                            C2147b bVar = (C2147b) e;
                            int a = C5240k.m11678a(bVar);
                            if (a == 39506) {
                                aVar2 = C5187a.SYNC_ERROR_NO_SPACE;
                                str = "AGNOSP";
                            } else {
                                aVar = C5187a.SYNC_ERROR_API_EXCEPTION;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("AGAEN");
                                sb2.append(bVar.f6010e.f1062f);
                                sb2.append(Strings.CURRENT_PATH);
                                sb2.append(a);
                                aVar.f12406f = sb2.toString();
                            }
                        } else if (!(e instanceof SSLException)) {
                            aVar = C5187a.SYNC_ERROR_NETWORK;
                            aVar.f12406f = null;
                            if ((e instanceof IOException) && (e.getCause() instanceof ErrnoException) && ((ErrnoException) e.getCause()).errno == OsConstants.ENOSPC) {
                                aVar2 = C5187a.SYNC_ERROR_NO_SPACE;
                                str = "AENOSP";
                            }
                        } else {
                            aVar = C5187a.SYNC_ERROR_SSLTLS;
                        }
                        aVar2.f12406f = str;
                        aVar = aVar2;
                    } else {
                        aVar = C5187a.SYNC_ERROR_SIGNATURE;
                    }
                    C5217k.m11659a().f12428a = aVar;
                    C0967p0.m2234b(this.f2670a);
                    throw e;
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:46:0x0151  */
        /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo4372b(android.content.Context r18) {
            /*
                r17 = this;
                r1 = r17
                x.b.a.a.l.d r2 = p425x.p472b.p473a.p474a.p476l.C5195d.m11631b(r18)
                x.b.a.a.l.i r3 = p425x.p472b.p473a.p474a.p476l.C5203i.m11644a(r18)
                r0 = 0
                r4 = 0
                r7 = r0
                r5 = r4
                r6 = r5
            L_0x000f:
                x.b.a.a.l.i$b r8 = r3.mo11945a()     // Catch:{ Exception -> 0x0149 }
                int r9 = r8.size()     // Catch:{ Exception -> 0x0149 }
                if (r9 != 0) goto L_0x001d
                r8 = 2147483647(0x7fffffff, float:NaN)
                goto L_0x0025
            L_0x001d:
                java.lang.Object r8 = r8.get(r4)     // Catch:{ Exception -> 0x0149 }
                x.b.a.a.l.i$a r8 = (p425x.p472b.p473a.p474a.p476l.C5203i.C5204a) r8     // Catch:{ Exception -> 0x0149 }
                int r8 = r8.f12419a     // Catch:{ Exception -> 0x0149 }
            L_0x0025:
                org.dpppt.android.sdk.models.DayDate r9 = new org.dpppt.android.sdk.models.DayDate     // Catch:{ Exception -> 0x0149 }
                long r10 = r1.f2671b     // Catch:{ Exception -> 0x0149 }
                r9.<init>(r10)     // Catch:{ Exception -> 0x0149 }
                long r9 = r9.getStartOfDayTimestamp()     // Catch:{ Exception -> 0x0149 }
                int r9 = p119o.p120a.C0967p0.m2170a(r9)     // Catch:{ Exception -> 0x0149 }
                if (r8 >= r9) goto L_0x010d
                x.b.a.a.l.i$a r7 = r3.mo11948b()     // Catch:{ Exception -> 0x0149 }
                int r8 = r7.f12419a     // Catch:{ Exception -> 0x0149 }
                org.dpppt.android.sdk.models.DayDate r9 = new org.dpppt.android.sdk.models.DayDate     // Catch:{ Exception -> 0x0149 }
                long r10 = r1.f2671b     // Catch:{ Exception -> 0x0149 }
                r9.<init>(r10)     // Catch:{ Exception -> 0x0149 }
                r10 = 1
                org.dpppt.android.sdk.models.DayDate r9 = r9.subtractDays(r10)     // Catch:{ Exception -> 0x0149 }
                int r9 = p119o.p120a.C0967p0.m2172a(r9)     // Catch:{ Exception -> 0x0149 }
                if (r8 >= r9) goto L_0x004f
                goto L_0x000f
            L_0x004f:
                boolean r8 = r7.mo11949a()     // Catch:{ Exception -> 0x0149 }
                if (r8 != 0) goto L_0x009b
                x.b.a.a.l.n.m r8 = p425x.p472b.p473a.p474a.p476l.p480n.C5242m.m11680a(r18)     // Catch:{ Exception -> 0x0149 }
                java.util.List r8 = r8.mo11963a()     // Catch:{ Exception -> 0x0149 }
                java.util.Iterator r8 = r8.iterator()     // Catch:{ Exception -> 0x0149 }
            L_0x0061:
                boolean r9 = r8.hasNext()     // Catch:{ Exception -> 0x0149 }
                if (r9 == 0) goto L_0x0093
                java.lang.Object r9 = r8.next()     // Catch:{ Exception -> 0x0149 }
                com.google.android.gms.nearby.exposurenotification.TemporaryExposureKey r9 = (com.google.android.gms.nearby.exposurenotification.TemporaryExposureKey) r9     // Catch:{ Exception -> 0x0149 }
                int r11 = r9.f1128f     // Catch:{ Exception -> 0x0149 }
                int r12 = r7.f12419a     // Catch:{ Exception -> 0x0149 }
                if (r11 != r12) goto L_0x0061
                org.dpppt.android.sdk.internal.backend.models.GaenKey r8 = new org.dpppt.android.sdk.internal.backend.models.GaenKey     // Catch:{ Exception -> 0x0149 }
                byte[] r11 = r9.mo1628c()     // Catch:{ Exception -> 0x0149 }
                java.lang.String r11 = p119o.p120a.C0967p0.m2252e(r11)     // Catch:{ Exception -> 0x0149 }
                int r12 = r9.f1128f     // Catch:{ Exception -> 0x0149 }
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ Exception -> 0x0149 }
                int r13 = r9.f1130h     // Catch:{ Exception -> 0x0149 }
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x0149 }
                int r9 = r9.f1129g     // Catch:{ Exception -> 0x0149 }
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x0149 }
                r8.<init>(r11, r12, r13, r9)     // Catch:{ Exception -> 0x0149 }
                goto L_0x0094
            L_0x0093:
                r8 = r0
            L_0x0094:
                if (r8 != 0) goto L_0x0098
                goto L_0x000f
            L_0x0098:
                r9 = r18
                goto L_0x00c4
            L_0x009b:
                java.security.SecureRandom r8 = new java.security.SecureRandom     // Catch:{ Exception -> 0x0149 }
                r8.<init>()     // Catch:{ Exception -> 0x0149 }
                r9 = 16
                byte[] r9 = new byte[r9]     // Catch:{ Exception -> 0x0149 }
                r8.nextBytes(r9)     // Catch:{ Exception -> 0x0149 }
                org.dpppt.android.sdk.internal.backend.models.GaenKey r8 = new org.dpppt.android.sdk.internal.backend.models.GaenKey     // Catch:{ Exception -> 0x0149 }
                java.lang.String r12 = p119o.p120a.C0967p0.m2252e(r9)     // Catch:{ Exception -> 0x0149 }
                int r9 = r7.f12419a     // Catch:{ Exception -> 0x0149 }
                java.lang.Integer r13 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x0149 }
                r9 = 144(0x90, float:2.02E-43)
                java.lang.Integer r14 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x0149 }
                java.lang.Integer r15 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0149 }
                r16 = 1
                r11 = r8
                r11.<init>(r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x0149 }
                goto L_0x0098
            L_0x00c4:
                x.b.a.a.l.k.c r11 = r2.mo11935a(r9)     // Catch:{ Exception -> 0x0147 }
                java.lang.String r12 = r7.f12420b     // Catch:{ Exception -> 0x0147 }
                x.b.a.a.l.k.f r11 = r11.f12424a     // Catch:{ Exception -> 0x0147 }
                org.dpppt.android.sdk.internal.backend.models.GaenSecondDay r13 = new org.dpppt.android.sdk.internal.backend.models.GaenSecondDay     // Catch:{ Exception -> 0x0147 }
                r13.<init>(r8)     // Catch:{ Exception -> 0x0147 }
                y.d r8 = r11.mo11956a(r13, r12)     // Catch:{ Exception -> 0x0147 }
                y.c0 r8 = r8.mo11990f()     // Catch:{ Exception -> 0x0147 }
                boolean r11 = r8.mo11985a()     // Catch:{ Exception -> 0x0147 }
                if (r11 == 0) goto L_0x0105
                boolean r8 = r7.mo11949a()     // Catch:{ Exception -> 0x0147 }
                if (r8 != 0) goto L_0x00f7
                p425x.p472b.p473a.p474a.C5178e.m11624c(r18)     // Catch:{ Exception -> 0x0147 }
                android.content.SharedPreferences r8 = r2.f12413a     // Catch:{ Exception -> 0x0147 }
                android.content.SharedPreferences$Editor r8 = r8.edit()     // Catch:{ Exception -> 0x0147 }
                java.lang.String r11 = "IAmInfectedIsResettable"
                android.content.SharedPreferences$Editor r8 = r8.putBoolean(r11, r10)     // Catch:{ Exception -> 0x0147 }
                r8.apply()     // Catch:{ Exception -> 0x0147 }
            L_0x00f7:
                boolean r8 = r7.mo11949a()     // Catch:{ Exception -> 0x0147 }
                if (r8 == 0) goto L_0x0101
                int r5 = r5 + 1
                goto L_0x000f
            L_0x0101:
                int r6 = r6 + 1
                goto L_0x000f
            L_0x0105:
                x.b.a.a.l.k.j r0 = new x.b.a.a.l.k.j     // Catch:{ Exception -> 0x0147 }
                v.i0 r4 = r8.f12549a     // Catch:{ Exception -> 0x0147 }
                r0.<init>(r4)     // Catch:{ Exception -> 0x0147 }
                throw r0     // Catch:{ Exception -> 0x0147 }
            L_0x010d:
                r9 = r18
                boolean r0 = r2.mo11936a()     // Catch:{ Exception -> 0x0147 }
                if (r0 == 0) goto L_0x0180
                if (r5 > 0) goto L_0x0119
                if (r6 <= 0) goto L_0x0180
            L_0x0119:
                x.b.a.a.l.l.a r0 = p425x.p472b.p473a.p474a.p476l.p478l.C5219a.m11661a(r18)     // Catch:{ Exception -> 0x0147 }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0147 }
                r4.<init>()     // Catch:{ Exception -> 0x0147 }
                int r6 = r6 + 65
                char r6 = (char) r6     // Catch:{ Exception -> 0x0147 }
                java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x0147 }
                r4.append(r6)     // Catch:{ Exception -> 0x0147 }
                int r5 = r5 + 65
                char r5 = (char) r5     // Catch:{ Exception -> 0x0147 }
                r4.append(r5)     // Catch:{ Exception -> 0x0147 }
                java.lang.String r12 = r4.toString()     // Catch:{ Exception -> 0x0147 }
                x.b.a.a.l.l.b r4 = new x.b.a.a.l.l.b     // Catch:{ Exception -> 0x0147 }
                x.b.a.a.l.l.c r11 = p425x.p472b.p473a.p474a.p476l.p478l.C5222c.NEXT_DAY_KEY_UPLOAD_REQUEST     // Catch:{ Exception -> 0x0147 }
                r13 = 1
                long r14 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0147 }
                r10 = r4
                r10.<init>(r11, r12, r13, r14)     // Catch:{ Exception -> 0x0147 }
                r0.mo11958a(r4)     // Catch:{ Exception -> 0x0147 }
                goto L_0x0180
            L_0x0147:
                r0 = move-exception
                goto L_0x014c
            L_0x0149:
                r0 = move-exception
                r9 = r18
            L_0x014c:
                r0.printStackTrace()
                if (r7 == 0) goto L_0x0180
                r3.mo11946a(r7)
                boolean r2 = r2.mo11936a()
                if (r2 == 0) goto L_0x0180
                x.b.a.a.l.l.a r2 = p425x.p472b.p473a.p474a.p476l.p478l.C5219a.m11661a(r18)
                boolean r3 = r0 instanceof p425x.p472b.p473a.p474a.p476l.p477k.C5216j
                if (r3 == 0) goto L_0x016d
                x.b.a.a.l.k.j r0 = (p425x.p472b.p473a.p474a.p476l.p477k.C5216j) r0
                v.i0 r0 = r0.f12426e
                int r0 = r0.f11063i
                java.lang.String r0 = java.lang.String.valueOf(r0)
                goto L_0x016f
            L_0x016d:
                java.lang.String r0 = "NETW"
            L_0x016f:
                r5 = r0
                x.b.a.a.l.l.b r0 = new x.b.a.a.l.l.b
                x.b.a.a.l.l.c r4 = p425x.p472b.p473a.p474a.p476l.p478l.C5222c.NEXT_DAY_KEY_UPLOAD_REQUEST
                r6 = 0
                long r7 = java.lang.System.currentTimeMillis()
                r3 = r0
                r3.<init>(r4, r5, r6, r7)
                r2.mo11958a(r0)
            L_0x0180:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.dpppt.android.sdk.internal.SyncWorker.C1014a.mo4372b(android.content.Context):void");
        }

        /* JADX WARNING: type inference failed for: r3v4, types: [java.util.HashMap] */
        /* JADX WARNING: type inference failed for: r3v5, types: [java.util.HashMap] */
        /* JADX WARNING: type inference failed for: r7v3, types: [java.util.HashMap] */
        /* JADX WARNING: type inference failed for: r14v7, types: [java.util.Calendar, java.util.GregorianCalendar] */
        /* JADX WARNING: type inference failed for: r20v0 */
        /* JADX WARNING: type inference failed for: r7v4 */
        /* JADX WARNING: type inference failed for: r3v11 */
        /* JADX WARNING: type inference failed for: r7v6 */
        /* JADX WARNING: type inference failed for: r7v7 */
        /* JADX WARNING: type inference failed for: r14v8 */
        /* JADX WARNING: type inference failed for: r7v8 */
        /* JADX WARNING: type inference failed for: r14v9 */
        /* JADX WARNING: type inference failed for: r14v10 */
        /* JADX WARNING: type inference failed for: r7v9 */
        /* JADX WARNING: type inference failed for: r14v11 */
        /* JADX WARNING: type inference failed for: r7v10 */
        /* JADX WARNING: type inference failed for: r14v13 */
        /* JADX WARNING: type inference failed for: r7v11 */
        /* JADX WARNING: type inference failed for: r14v14 */
        /* JADX WARNING: type inference failed for: r7v12, types: [java.util.HashMap] */
        /* JADX WARNING: type inference failed for: r14v15 */
        /* JADX WARNING: type inference failed for: r14v16 */
        /* JADX WARNING: type inference failed for: r7v13 */
        /* JADX WARNING: type inference failed for: r14v17 */
        /* JADX WARNING: type inference failed for: r14v18 */
        /* JADX WARNING: type inference failed for: r14v19 */
        /* JADX WARNING: type inference failed for: r14v20 */
        /* JADX WARNING: type inference failed for: r14v21 */
        /* JADX WARNING: type inference failed for: r7v21, types: [java.lang.String] */
        /* JADX WARNING: type inference failed for: r3v15 */
        /* JADX WARNING: type inference failed for: r14v24 */
        /* JADX WARNING: type inference failed for: r7v23 */
        /* JADX WARNING: type inference failed for: r7v24 */
        /* JADX WARNING: type inference failed for: r7v25 */
        /* JADX WARNING: type inference failed for: r14v25 */
        /* JADX WARNING: type inference failed for: r14v26 */
        /* JADX WARNING: type inference failed for: r14v27 */
        /* JADX WARNING: type inference failed for: r7v26 */
        /* JADX WARNING: type inference failed for: r14v28 */
        /* JADX WARNING: type inference failed for: r7v27 */
        /* JADX WARNING: type inference failed for: r7v28 */
        /* JADX WARNING: type inference failed for: r14v29 */
        /* JADX WARNING: type inference failed for: r14v30 */
        /* JADX WARNING: type inference failed for: r14v31 */
        /* JADX WARNING: type inference failed for: r14v32 */
        /* JADX WARNING: type inference failed for: r14v33 */
        /* JADX WARNING: type inference failed for: r14v34 */
        /* JADX WARNING: type inference failed for: r14v35 */
        /* JADX WARNING: type inference failed for: r14v36 */
        /* JADX WARNING: type inference failed for: r14v37 */
        /* JADX WARNING: type inference failed for: r14v38 */
        /* JADX WARNING: type inference failed for: r14v39 */
        /* JADX WARNING: type inference failed for: r14v40 */
        /* JADX WARNING: type inference failed for: r7v29 */
        /* JADX WARNING: Code restructure failed: missing block: B:84:0x0270, code lost:
            if (r6 != 503) goto L_0x0273;
         */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r7v6
          assigns: []
          uses: []
          mth insns count: 357
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0142 A[SYNTHETIC, Splitter:B:19:0x0142] */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x0263  */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x0275  */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x0279  */
        /* JADX WARNING: Removed duplicated region for block: B:89:0x027e  */
        /* JADX WARNING: Unknown variable types count: 23 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo4371a(android.content.Context r26) {
            /*
                r25 = this;
                r1 = r25
                x.b.a.a.l.d r2 = p425x.p472b.p473a.p474a.p476l.C5195d.m11631b(r26)
                android.content.SharedPreferences r0 = r2.f12413a
                java.lang.String r3 = "{}"
                java.lang.String r4 = "application"
                java.lang.String r0 = r0.getString(r4, r3)
                java.lang.Class<org.dpppt.android.sdk.models.ApplicationInfo> r4 = org.dpppt.android.sdk.models.ApplicationInfo.class
                java.lang.Object r0 = p425x.p472b.p473a.p474a.p476l.p481o.C5243a.m11694a(r0, r4)
                org.dpppt.android.sdk.models.ApplicationInfo r0 = (org.dpppt.android.sdk.models.ApplicationInfo) r0
                java.util.HashMap r4 = r2.mo11937b()
                android.content.SharedPreferences r5 = r2.f12413a
                java.lang.String r6 = "lastExposureClientCalls"
                java.lang.String r3 = r5.getString(r6, r3)
                java.lang.Class<x.b.a.a.l.d$a> r5 = p425x.p472b.p473a.p474a.p476l.C5195d.C5196a.class
                java.lang.Object r3 = p425x.p472b.p473a.p474a.p476l.p481o.C5243a.m11694a(r3, r5)
                java.util.HashMap r3 = (java.util.HashMap) r3
                java.util.HashMap r3 = r2.mo11938b(r3)
                x.b.a.a.l.k.a r5 = new x.b.a.a.l.k.a
                java.lang.String r0 = r0.getBucketBaseUrl()
                java.security.PublicKey r7 = org.dpppt.android.sdk.internal.SyncWorker.f2669i
                r8 = r26
                r5.<init>(r8, r0, r7)
                x.b.a.a.l.n.m r7 = p425x.p472b.p473a.p474a.p476l.p480n.C5242m.m11680a(r26)
                org.dpppt.android.sdk.models.DayDate r0 = new org.dpppt.android.sdk.models.DayDate
                long r9 = r1.f2671b
                r0.<init>(r9)
                r9 = 9
                org.dpppt.android.sdk.models.DayDate r9 = r0.subtractDays(r9)
                org.dpppt.android.sdk.models.DayDate r0 = new org.dpppt.android.sdk.models.DayDate
                long r10 = r1.f2671b
                r0.<init>(r10)
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r24 = r10
                r10 = r0
                r0 = r24
            L_0x005e:
                boolean r14 = r9.isBeforeOrEquals(r10)
                java.lang.String r15 = "keyfile_"
                java.lang.String r8 = "SyncWorker"
                if (r14 == 0) goto L_0x0297
                java.lang.Object r14 = r3.get(r10)
                java.lang.Long r14 = (java.lang.Long) r14
                java.lang.String r16 = "Europe/Zurich"
                if (r14 != 0) goto L_0x00c3
                java.util.GregorianCalendar r14 = new java.util.GregorianCalendar
                r14.<init>()
                r17 = r9
                java.util.TimeZone r9 = java.util.TimeZone.getTimeZone(r16)
                r14.setTimeZone(r9)
                r9 = r11
                r18 = r12
                long r11 = r1.f2671b
                r14.setTimeInMillis(r11)
                r11 = 5
                r12 = 11
                r14.set(r12, r11)
                r11 = 59
                r12 = 12
                r14.set(r12, r11)
                r12 = 13
                r14.set(r12, r11)
                r11 = 999(0x3e7, float:1.4E-42)
                r12 = 14
                r14.set(r12, r11)
                long r11 = r14.getTimeInMillis()
                java.lang.Long r14 = java.lang.Long.valueOf(r11)
                java.lang.String r11 = "never loaded "
                java.lang.StringBuilder r11 = p213q.p214a.p215a.p216a.C1965a.m4756a(r11)
                java.lang.String r12 = r10.formatAsString()
                r11.append(r12)
                java.lang.String r12 = " before, set last sync time to 5:59:59 to prevent rate limit issues"
                r11.append(r12)
                java.lang.String r11 = r11.toString()
                p425x.p472b.p473a.p474a.p476l.p479m.C5229g.m11663a(r8, r11)
                goto L_0x00c8
            L_0x00c3:
                r17 = r9
                r9 = r11
                r18 = r12
            L_0x00c8:
                long r11 = r14.longValue()
                java.util.GregorianCalendar r14 = new java.util.GregorianCalendar
                r14.<init>()
                r19 = r0
                java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r16)
                r14.setTimeZone(r0)
                r16 = r2
                r20 = r3
                long r2 = r1.f2671b
                r14.setTimeInMillis(r2)
                r0 = 11
                int r0 = r14.get(r0)
                r2 = 6
                if (r0 >= r2) goto L_0x0118
                org.dpppt.android.sdk.models.DayDate r0 = new org.dpppt.android.sdk.models.DayDate
                long r2 = r1.f2671b
                r0.<init>(r2)
                org.dpppt.android.sdk.models.DayDate r2 = new org.dpppt.android.sdk.models.DayDate
                r3 = r6
                r21 = r7
                long r6 = r1.f2671b
                r22 = 21600000(0x1499700, double:1.0671818E-316)
                long r6 = r6 - r22
                r2.<init>(r6)
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0112
                r0 = -1
                r2 = 5
                r14.add(r2, r0)
                r0 = 11
                r2 = 18
                goto L_0x0127
            L_0x0112:
                r6 = 0
                r14.setTimeInMillis(r6)
                goto L_0x012a
            L_0x0118:
                r3 = r6
                r21 = r7
                r0 = 11
                int r6 = r14.get(r0)
                r7 = 18
                if (r6 >= r7) goto L_0x0126
                goto L_0x0127
            L_0x0126:
                r2 = r7
            L_0x0127:
                r14.set(r0, r2)
            L_0x012a:
                r0 = 12
                r2 = 0
                r14.set(r0, r2)
                r0 = 13
                r14.set(r0, r2)
                r0 = 14
                r14.set(r0, r2)
                long r6 = r14.getTimeInMillis()
                int r0 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
                if (r0 >= 0) goto L_0x027e
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0245 }
                r0.<init>()     // Catch:{ Exception -> 0x0245 }
                java.lang.String r2 = "loading exposees for "
                r0.append(r2)     // Catch:{ Exception -> 0x0245 }
                java.lang.String r2 = r10.formatAsString()     // Catch:{ Exception -> 0x0245 }
                r0.append(r2)     // Catch:{ Exception -> 0x0245 }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0245 }
                p425x.p472b.p473a.p474a.p476l.p479m.C5229g.m11663a(r8, r0)     // Catch:{ Exception -> 0x0245 }
                java.lang.Object r0 = r4.get(r10)     // Catch:{ Exception -> 0x0245 }
                java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ Exception -> 0x0245 }
                x.b.a.a.l.k.d r2 = r5.f12422a     // Catch:{ Exception -> 0x0245 }
                long r6 = r10.getStartOfDayTimestamp()     // Catch:{ Exception -> 0x0245 }
                y.d r0 = r2.mo11954a(r6, r0)     // Catch:{ Exception -> 0x0245 }
                y.c0 r0 = r0.mo11990f()     // Catch:{ Exception -> 0x0245 }
                boolean r2 = r0.mo11985a()     // Catch:{ Exception -> 0x0245 }
                if (r2 == 0) goto L_0x0236
                v.i0 r2 = r0.f12549a     // Catch:{ Exception -> 0x0245 }
                int r2 = r2.f11063i     // Catch:{ Exception -> 0x0245 }
                r6 = 204(0xcc, float:2.86E-43)
                if (r2 == r6) goto L_0x020c
                java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x0207 }
                java.io.File r6 = r26.getCacheDir()     // Catch:{ Exception -> 0x0207 }
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0207 }
                r7.<init>()     // Catch:{ Exception -> 0x0207 }
                r7.append(r15)     // Catch:{ Exception -> 0x0207 }
                java.lang.String r8 = r10.formatAsString()     // Catch:{ Exception -> 0x0207 }
                r7.append(r8)     // Catch:{ Exception -> 0x0207 }
                java.lang.String r8 = "_"
                r7.append(r8)     // Catch:{ Exception -> 0x0207 }
                java.lang.Object r8 = r4.get(r10)     // Catch:{ Exception -> 0x0207 }
                r7.append(r8)     // Catch:{ Exception -> 0x0207 }
                java.lang.String r8 = ".zip"
                r7.append(r8)     // Catch:{ Exception -> 0x0207 }
                java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0207 }
                r2.<init>(r6, r7)     // Catch:{ Exception -> 0x0207 }
                java.io.BufferedOutputStream r6 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x0207 }
                java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0207 }
                r7.<init>(r2)     // Catch:{ Exception -> 0x0207 }
                r6.<init>(r7)     // Catch:{ Exception -> 0x0207 }
                r7 = 1024(0x400, float:1.435E-42)
                byte[] r7 = new byte[r7]     // Catch:{ all -> 0x01f5 }
                T r8 = r0.f12550b     // Catch:{ all -> 0x01f5 }
                v.j0 r8 = (p410v.C4725j0) r8     // Catch:{ all -> 0x01f5 }
                w.i r8 = r8.mo10991h()     // Catch:{ all -> 0x01f5 }
                java.io.InputStream r8 = r8.mo11469q()     // Catch:{ all -> 0x01f5 }
            L_0x01c3:
                int r11 = r8.read(r7)     // Catch:{ all -> 0x01f5 }
                r12 = -1
                r14 = 0
                if (r11 == r12) goto L_0x01d4
                r6.write(r7, r14, r11)     // Catch:{ all -> 0x01cf }
                goto L_0x01c3
            L_0x01cf:
                r0 = move-exception
                r7 = r0
                r2 = r21
                goto L_0x01fa
            L_0x01d4:
                r6.close()     // Catch:{ Exception -> 0x01f1 }
                java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ Exception -> 0x01f1 }
                r6.<init>()     // Catch:{ Exception -> 0x01f1 }
                r6.add(r2)     // Catch:{ Exception -> 0x01f1 }
                java.lang.String r7 = r10.formatAsString()     // Catch:{ Exception -> 0x01f1 }
                r10.formatAsString()     // Catch:{ Exception -> 0x01f1 }
                r2.length()     // Catch:{ Exception -> 0x01f1 }
                x.b.a.a.l.m.f r2 = p425x.p472b.p473a.p474a.p476l.p479m.C5228f.DEBUG     // Catch:{ Exception -> 0x01f1 }
                r2 = r21
                r2.mo11965a(r6, r7)     // Catch:{ Exception -> 0x0232 }
                goto L_0x020f
            L_0x01f1:
                r0 = move-exception
                r2 = r21
                goto L_0x0233
            L_0x01f5:
                r0 = move-exception
                r2 = r21
                r14 = 0
                r7 = r0
            L_0x01fa:
                throw r7     // Catch:{ all -> 0x01fb }
            L_0x01fb:
                r0 = move-exception
                r8 = r0
                r6.close()     // Catch:{ all -> 0x0201 }
                goto L_0x0206
            L_0x0201:
                r0 = move-exception
                r6 = r0
                r7.addSuppressed(r6)     // Catch:{ Exception -> 0x0232 }
            L_0x0206:
                throw r8     // Catch:{ Exception -> 0x0232 }
            L_0x0207:
                r0 = move-exception
                r2 = r21
                r14 = 0
                goto L_0x0233
            L_0x020c:
                r2 = r21
                r14 = 0
            L_0x020f:
                long r6 = r1.f2671b     // Catch:{ Exception -> 0x0232 }
                java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x0232 }
                r7 = r20
                r7.put(r10, r6)     // Catch:{ Exception -> 0x0243 }
                v.i0 r0 = r0.f12549a     // Catch:{ Exception -> 0x0243 }
                v.w r0 = r0.f11065k     // Catch:{ Exception -> 0x0243 }
                java.lang.String r6 = "x-published-until"
                java.lang.String r0 = r0.mo11366a(r6)     // Catch:{ Exception -> 0x0243 }
                long r11 = java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x0243 }
                java.lang.Long r0 = java.lang.Long.valueOf(r11)     // Catch:{ Exception -> 0x0243 }
                r4.put(r10, r0)     // Catch:{ Exception -> 0x0243 }
                int r13 = r13 + 1
                goto L_0x0282
            L_0x0232:
                r0 = move-exception
            L_0x0233:
                r7 = r20
                goto L_0x024b
            L_0x0236:
                r7 = r20
                r2 = r21
                r14 = 0
                x.b.a.a.l.k.j r6 = new x.b.a.a.l.k.j     // Catch:{ Exception -> 0x0243 }
                v.i0 r0 = r0.f12549a     // Catch:{ Exception -> 0x0243 }
                r6.<init>(r0)     // Catch:{ Exception -> 0x0243 }
                throw r6     // Catch:{ Exception -> 0x0243 }
            L_0x0243:
                r0 = move-exception
                goto L_0x024b
            L_0x0245:
                r0 = move-exception
                r7 = r20
                r2 = r21
                r14 = 0
            L_0x024b:
                r0.printStackTrace()
                boolean r6 = r0 instanceof p425x.p472b.p473a.p474a.p476l.p477k.C5215i
                if (r6 != 0) goto L_0x0273
                boolean r6 = r0 instanceof p425x.p472b.p473a.p474a.p475k.C5189b
                if (r6 != 0) goto L_0x0273
                boolean r6 = r0 instanceof android.database.sqlite.SQLiteException
                if (r6 != 0) goto L_0x0273
                boolean r6 = r0 instanceof p213q.p217b.p218a.p231b.p239d.p240m.C2147b
                if (r6 == 0) goto L_0x025f
                goto L_0x0273
            L_0x025f:
                boolean r6 = r0 instanceof p425x.p472b.p473a.p474a.p476l.p477k.C5216j
                if (r6 == 0) goto L_0x0272
                r6 = r0
                x.b.a.a.l.k.j r6 = (p425x.p472b.p473a.p474a.p476l.p477k.C5216j) r6
                v.i0 r6 = r6.f12426e
                int r6 = r6.f11063i
                r8 = 502(0x1f6, float:7.03E-43)
                if (r6 == r8) goto L_0x0272
                r8 = 503(0x1f7, float:7.05E-43)
                if (r6 != r8) goto L_0x0273
            L_0x0272:
                r14 = 1
            L_0x0273:
                if (r14 == 0) goto L_0x0279
                int r12 = r18 + 1
                r11 = r9
                goto L_0x0287
            L_0x0279:
                int r11 = r9 + 1
                r12 = r18
                goto L_0x0287
            L_0x027e:
                r7 = r20
                r2 = r21
            L_0x0282:
                r11 = r9
                r12 = r18
                r0 = r19
            L_0x0287:
                r6 = 1
                org.dpppt.android.sdk.models.DayDate r10 = r10.subtractDays(r6)
                r8 = r26
                r6 = r3
                r3 = r7
                r9 = r17
                r7 = r2
                r2 = r16
                goto L_0x005e
            L_0x0297:
                r19 = r0
                r16 = r2
                r7 = r3
                r3 = r6
                r9 = r11
                r18 = r12
                r0 = 1
                r2 = 0
                org.dpppt.android.sdk.models.DayDate r5 = new org.dpppt.android.sdk.models.DayDate
                long r10 = r1.f2671b
                r5.<init>(r10)
                r6 = 10
                org.dpppt.android.sdk.models.DayDate r5 = r5.subtractDays(r6)
                java.util.Set r6 = r4.keySet()
                java.util.Iterator r6 = r6.iterator()
            L_0x02b7:
                boolean r10 = r6.hasNext()
                if (r10 == 0) goto L_0x02cd
                java.lang.Object r10 = r6.next()
                org.dpppt.android.sdk.models.DayDate r10 = (org.dpppt.android.sdk.models.DayDate) r10
                boolean r10 = r10.isBefore(r5)
                if (r10 == 0) goto L_0x02b7
                r6.remove()
                goto L_0x02b7
            L_0x02cd:
                java.util.Set r6 = r7.keySet()
                java.util.Iterator r6 = r6.iterator()
            L_0x02d5:
                boolean r10 = r6.hasNext()
                if (r10 == 0) goto L_0x02eb
                java.lang.Object r10 = r6.next()
                org.dpppt.android.sdk.models.DayDate r10 = (org.dpppt.android.sdk.models.DayDate) r10
                boolean r10 = r10.isBefore(r5)
                if (r10 == 0) goto L_0x02d5
                r6.remove()
                goto L_0x02d5
            L_0x02eb:
                java.io.File r5 = r26.getCacheDir()
                java.io.File[] r5 = r5.listFiles()
                int r6 = r5.length
                r10 = r2
            L_0x02f5:
                if (r10 >= r6) goto L_0x0320
                r11 = r5[r10]
                java.lang.String r12 = r11.getName()
                boolean r12 = r12.startsWith(r15)
                if (r12 == 0) goto L_0x031d
                boolean r12 = r11.delete()
                if (r12 != 0) goto L_0x031d
                java.lang.String r12 = "Unable to delete file "
                java.lang.StringBuilder r12 = p213q.p214a.p215a.p216a.C1965a.m4756a(r12)
                java.lang.String r11 = r11.getName()
                r12.append(r11)
                java.lang.String r11 = r12.toString()
                p425x.p472b.p473a.p474a.p476l.p479m.C5229g.m11667d(r8, r11)
            L_0x031d:
                int r10 = r10 + 1
                goto L_0x02f5
            L_0x0320:
                r10 = r16
                android.content.SharedPreferences r5 = r10.f12413a
                android.content.SharedPreferences$Editor r5 = r5.edit()
                java.util.HashMap r4 = r10.mo11934a(r4)
                java.lang.String r4 = p425x.p472b.p473a.p474a.p476l.p481o.C5243a.m11696a(r4)
                java.lang.String r6 = "lastLoadedTimes"
                android.content.SharedPreferences$Editor r4 = r5.putString(r6, r4)
                r4.apply()
                android.content.SharedPreferences r4 = r10.f12413a
                android.content.SharedPreferences$Editor r4 = r4.edit()
                java.util.HashMap r5 = r10.mo11934a(r7)
                java.lang.String r5 = p425x.p472b.p473a.p474a.p476l.p481o.C5243a.m11696a(r5)
                android.content.SharedPreferences$Editor r3 = r4.putString(r3, r5)
                r3.apply()
                if (r9 > 0) goto L_0x0354
                if (r18 > 0) goto L_0x0354
                if (r13 <= 0) goto L_0x038b
            L_0x0354:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                int r11 = r9 + 65
                char r4 = (char) r11
                java.lang.String r4 = java.lang.String.valueOf(r4)
                r3.append(r4)
                int r12 = r18 + 65
                char r4 = (char) r12
                r3.append(r4)
                int r13 = r13 + 65
                char r4 = (char) r13
                r3.append(r4)
                java.lang.String r13 = r3.toString()
                x.b.a.a.l.l.a r3 = p425x.p472b.p473a.p474a.p476l.p478l.C5219a.m11661a(r26)
                x.b.a.a.l.l.b r4 = new x.b.a.a.l.l.b
                x.b.a.a.l.l.c r12 = p425x.p472b.p473a.p474a.p476l.p478l.C5222c.SYNC
                if (r19 != 0) goto L_0x037f
                r14 = r0
                goto L_0x0380
            L_0x037f:
                r14 = r2
            L_0x0380:
                long r15 = java.lang.System.currentTimeMillis()
                r11 = r4
                r11.<init>(r12, r13, r14, r15)
                r3.mo11958a(r4)
            L_0x038b:
                if (r19 != 0) goto L_0x039f
                long r2 = r1.f2671b
                android.content.SharedPreferences r0 = r10.f12413a
                android.content.SharedPreferences$Editor r0 = r0.edit()
                java.lang.String r4 = "lastSyncDate"
                android.content.SharedPreferences$Editor r0 = r0.putLong(r4, r2)
                r0.apply()
                return
            L_0x039f:
                throw r19
            */
            throw new UnsupportedOperationException("Method not decompiled: org.dpppt.android.sdk.internal.SyncWorker.C1014a.mo4371a(android.content.Context):void");
        }
    }

    public SyncWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* renamed from: a */
    public static void m2317a(Context context) {
        C1789a aVar = new C1789a();
        aVar.f5254c = C1802m.CONNECTED;
        C1788c cVar = new C1788c(aVar);
        C1812a aVar2 = new C1812a(SyncWorker.class, 120, TimeUnit.MINUTES);
        aVar2.f5302c.f5536j = cVar;
        String str = "org.dpppt.android.sdk.internal.SyncWorker";
        C1842l.m4517a(context).mo6792a(str, C1794f.KEEP, (C1811p) aVar2.mo6794a());
        C5229g.m11663a("SyncWorker", "scheduled SyncWorker");
    }

    /* renamed from: e */
    public C0177a mo1455e() {
        C5229g.m11663a("SyncWorker", "start SyncWorker");
        Context context = this.f978e;
        if (C5195d.m11631b(context).mo11936a()) {
            C5219a a = C5219a.m11661a(context);
            C5221b bVar = new C5221b(C5222c.WORKER_STARTED, "Sync", true, System.currentTimeMillis());
            a.mo11958a(bVar);
        }
        try {
            new C1014a(context).mo4370a();
            C5228f fVar = C5228f.DEBUG;
            return new C0180c();
        } catch (Exception e) {
            e.getMessage();
            C5228f fVar2 = C5228f.DEBUG;
            return new C0179b();
        }
    }
}
