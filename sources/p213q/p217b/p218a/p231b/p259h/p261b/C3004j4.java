package p213q.p217b.p218a.p231b.p259h.p261b;

import java.net.URL;
import java.util.Map;
import p124p.p126b.p127k.C1061o;

/* renamed from: q.b.a.b.h.b.j4 */
public final class C3004j4 implements Runnable {

    /* renamed from: e */
    public final URL f7444e;

    /* renamed from: f */
    public final byte[] f7445f;

    /* renamed from: g */
    public final C2980h4 f7446g;

    /* renamed from: h */
    public final String f7447h;

    /* renamed from: i */
    public final Map<String, String> f7448i;

    /* renamed from: j */
    public final /* synthetic */ C2956f4 f7449j;

    public C3004j4(C2956f4 f4Var, String str, URL url, byte[] bArr, Map<String, String> map, C2980h4 h4Var) {
        this.f7449j = f4Var;
        C1061o.m2528b(str);
        C1061o.m2524b(url);
        C1061o.m2524b(h4Var);
        this.f7444e = url;
        this.f7445f = bArr;
        this.f7446g = h4Var;
        this.f7447h = str;
        this.f7448i = map;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00da A[SYNTHETIC, Splitter:B:43:0x00da] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x011e A[SYNTHETIC, Splitter:B:56:0x011e] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0136  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            java.lang.String r0 = "Error closing HTTP compressed POST connection output stream. appId"
            java.lang.String r1 = "Task exception on worker thread"
            q.b.a.b.h.b.f4 r2 = r14.f7449j
            r2.mo8278b()
            r2 = 0
            r3 = 0
            q.b.a.b.h.b.f4 r4 = r14.f7449j     // Catch:{ IOException -> 0x0117, all -> 0x00d3 }
            java.net.URL r5 = r14.f7444e     // Catch:{ IOException -> 0x0117, all -> 0x00d3 }
            java.net.HttpURLConnection r4 = r4.mo8451a(r5)     // Catch:{ IOException -> 0x0117, all -> 0x00d3 }
            java.util.Map<java.lang.String, java.lang.String> r5 = r14.f7448i     // Catch:{ IOException -> 0x00d0, all -> 0x00cd }
            if (r5 == 0) goto L_0x003d
            java.util.Map<java.lang.String, java.lang.String> r5 = r14.f7448i     // Catch:{ IOException -> 0x00d0, all -> 0x00cd }
            java.util.Set r5 = r5.entrySet()     // Catch:{ IOException -> 0x00d0, all -> 0x00cd }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ IOException -> 0x00d0, all -> 0x00cd }
        L_0x0021:
            boolean r6 = r5.hasNext()     // Catch:{ IOException -> 0x00d0, all -> 0x00cd }
            if (r6 == 0) goto L_0x003d
            java.lang.Object r6 = r5.next()     // Catch:{ IOException -> 0x00d0, all -> 0x00cd }
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ IOException -> 0x00d0, all -> 0x00cd }
            java.lang.Object r7 = r6.getKey()     // Catch:{ IOException -> 0x00d0, all -> 0x00cd }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ IOException -> 0x00d0, all -> 0x00cd }
            java.lang.Object r6 = r6.getValue()     // Catch:{ IOException -> 0x00d0, all -> 0x00cd }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IOException -> 0x00d0, all -> 0x00cd }
            r4.addRequestProperty(r7, r6)     // Catch:{ IOException -> 0x00d0, all -> 0x00cd }
            goto L_0x0021
        L_0x003d:
            byte[] r5 = r14.f7445f     // Catch:{ IOException -> 0x00d0, all -> 0x00cd }
            if (r5 == 0) goto L_0x008a
            q.b.a.b.h.b.f4 r5 = r14.f7449j     // Catch:{ IOException -> 0x00d0, all -> 0x00cd }
            q.b.a.b.h.b.t9 r5 = r5.mo8651p()     // Catch:{ IOException -> 0x00d0, all -> 0x00cd }
            byte[] r6 = r14.f7445f     // Catch:{ IOException -> 0x00d0, all -> 0x00cd }
            byte[] r5 = r5.mo8747c(r6)     // Catch:{ IOException -> 0x00d0, all -> 0x00cd }
            q.b.a.b.h.b.f4 r6 = r14.f7449j     // Catch:{ IOException -> 0x00d0, all -> 0x00cd }
            q.b.a.b.h.b.b4 r6 = r6.mo8285i()     // Catch:{ IOException -> 0x00d0, all -> 0x00cd }
            q.b.a.b.h.b.e4 r6 = r6.f7161n     // Catch:{ IOException -> 0x00d0, all -> 0x00cd }
            java.lang.String r7 = "Uploading data. size"
            int r8 = r5.length     // Catch:{ IOException -> 0x00d0, all -> 0x00cd }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ IOException -> 0x00d0, all -> 0x00cd }
            r6.mo8433a(r7, r8)     // Catch:{ IOException -> 0x00d0, all -> 0x00cd }
            r6 = 1
            r4.setDoOutput(r6)     // Catch:{ IOException -> 0x00d0, all -> 0x00cd }
            java.lang.String r6 = "Content-Encoding"
            java.lang.String r7 = "gzip"
            r4.addRequestProperty(r6, r7)     // Catch:{ IOException -> 0x00d0, all -> 0x00cd }
            int r6 = r5.length     // Catch:{ IOException -> 0x00d0, all -> 0x00cd }
            r4.setFixedLengthStreamingMode(r6)     // Catch:{ IOException -> 0x00d0, all -> 0x00cd }
            r4.connect()     // Catch:{ IOException -> 0x00d0, all -> 0x00cd }
            java.io.OutputStream r6 = r4.getOutputStream()     // Catch:{ IOException -> 0x00d0, all -> 0x00cd }
            r6.write(r5)     // Catch:{ IOException -> 0x0083, all -> 0x007c }
            r6.close()     // Catch:{ IOException -> 0x0083, all -> 0x007c }
            goto L_0x008a
        L_0x007c:
            r5 = move-exception
            r11 = r2
            r8 = r3
            r3 = r5
            r2 = r6
            goto L_0x00d8
        L_0x0083:
            r5 = move-exception
            r11 = r2
            r8 = r3
            r9 = r5
            r2 = r6
            goto L_0x011c
        L_0x008a:
            int r9 = r4.getResponseCode()     // Catch:{ IOException -> 0x00d0, all -> 0x00cd }
            java.util.Map r12 = r4.getHeaderFields()     // Catch:{ IOException -> 0x00c9, all -> 0x00c4 }
            byte[] r11 = p213q.p217b.p218a.p231b.p259h.p261b.C2956f4.m6899a(r4)     // Catch:{ IOException -> 0x00bf, all -> 0x00ba }
            r4.disconnect()
            q.b.a.b.h.b.f4 r0 = r14.f7449j
            q.b.a.b.h.b.z4 r0 = r0.mo8283g()
            q.b.a.b.h.b.k4 r2 = new q.b.a.b.h.b.k4
            java.lang.String r7 = r14.f7447h
            q.b.a.b.h.b.h4 r8 = r14.f7446g
            r10 = 0
            r13 = 0
            r6 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r0.mo8846n()
            p124p.p126b.p127k.C1061o.m2524b(r2)
            q.b.a.b.h.b.e5 r3 = new q.b.a.b.h.b.e5
            r3.<init>(r0, r2, r1)
            r0.mo8843a(r3)
            return
        L_0x00ba:
            r5 = move-exception
            r3 = r5
            r8 = r9
            r11 = r12
            goto L_0x00d8
        L_0x00bf:
            r5 = move-exception
            r8 = r9
            r11 = r12
            goto L_0x011b
        L_0x00c4:
            r5 = move-exception
            r11 = r2
            r3 = r5
            r8 = r9
            goto L_0x00d8
        L_0x00c9:
            r5 = move-exception
            r11 = r2
            r8 = r9
            goto L_0x011b
        L_0x00cd:
            r5 = move-exception
            r11 = r2
            goto L_0x00d6
        L_0x00d0:
            r5 = move-exception
            r11 = r2
            goto L_0x011a
        L_0x00d3:
            r5 = move-exception
            r4 = r2
            r11 = r4
        L_0x00d6:
            r8 = r3
            r3 = r5
        L_0x00d8:
            if (r2 == 0) goto L_0x00f0
            r2.close()     // Catch:{ IOException -> 0x00de }
            goto L_0x00f0
        L_0x00de:
            r2 = move-exception
            q.b.a.b.h.b.f4 r5 = r14.f7449j
            q.b.a.b.h.b.b4 r5 = r5.mo8285i()
            q.b.a.b.h.b.e4 r5 = r5.f7153f
            java.lang.String r6 = r14.f7447h
            java.lang.Object r6 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r6)
            r5.mo8434a(r0, r6, r2)
        L_0x00f0:
            if (r4 == 0) goto L_0x00f5
            r4.disconnect()
        L_0x00f5:
            q.b.a.b.h.b.f4 r0 = r14.f7449j
            q.b.a.b.h.b.z4 r0 = r0.mo8283g()
            q.b.a.b.h.b.k4 r2 = new q.b.a.b.h.b.k4
            java.lang.String r6 = r14.f7447h
            q.b.a.b.h.b.h4 r7 = r14.f7446g
            r9 = 0
            r10 = 0
            r12 = 0
            r5 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r0.mo8846n()
            p124p.p126b.p127k.C1061o.m2524b(r2)
            q.b.a.b.h.b.e5 r4 = new q.b.a.b.h.b.e5
            r4.<init>(r0, r2, r1)
            r0.mo8843a(r4)
            throw r3
        L_0x0117:
            r5 = move-exception
            r4 = r2
            r11 = r4
        L_0x011a:
            r8 = r3
        L_0x011b:
            r9 = r5
        L_0x011c:
            if (r2 == 0) goto L_0x0134
            r2.close()     // Catch:{ IOException -> 0x0122 }
            goto L_0x0134
        L_0x0122:
            r2 = move-exception
            q.b.a.b.h.b.f4 r3 = r14.f7449j
            q.b.a.b.h.b.b4 r3 = r3.mo8285i()
            q.b.a.b.h.b.e4 r3 = r3.f7153f
            java.lang.String r5 = r14.f7447h
            java.lang.Object r5 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r5)
            r3.mo8434a(r0, r5, r2)
        L_0x0134:
            if (r4 == 0) goto L_0x0139
            r4.disconnect()
        L_0x0139:
            q.b.a.b.h.b.f4 r0 = r14.f7449j
            q.b.a.b.h.b.z4 r0 = r0.mo8283g()
            q.b.a.b.h.b.k4 r2 = new q.b.a.b.h.b.k4
            java.lang.String r6 = r14.f7447h
            q.b.a.b.h.b.h4 r7 = r14.f7446g
            r10 = 0
            r12 = 0
            r5 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r0.mo8846n()
            p124p.p126b.p127k.C1061o.m2524b(r2)
            q.b.a.b.h.b.e5 r3 = new q.b.a.b.h.b.e5
            r3.<init>(r0, r2, r1)
            r0.mo8843a(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p259h.p261b.C3004j4.run():void");
    }
}
