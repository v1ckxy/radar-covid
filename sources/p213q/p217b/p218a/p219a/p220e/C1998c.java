package p213q.p217b.p218a.p219a.p220e;

/* renamed from: q.b.a.a.e.c */
public final /* synthetic */ class C1998c {

    /* renamed from: a */
    public final C2000e f5736a;

    public C1998c(C2000e eVar) {
        this.f5736a = eVar;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x0120 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x013e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0145 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo6991a(java.lang.Object r14) {
        /*
            r13 = this;
            q.b.a.a.e.e r0 = r13.f5736a
            q.b.a.a.e.e$a r14 = (p213q.p217b.p218a.p219a.p220e.C2000e.C2001a) r14
            r1 = 0
            if (r0 == 0) goto L_0x0166
            java.net.URL r2 = r14.f5744a
            java.lang.String r3 = "CctTransportBackend"
            java.lang.String r4 = "Making request to: %s"
            p124p.p126b.p127k.C1061o.m2499a(r3, r4, r2)
            java.net.URL r2 = r14.f5744a
            java.net.URLConnection r2 = r2.openConnection()
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2
            r4 = 30000(0x7530, float:4.2039E-41)
            r2.setConnectTimeout(r4)
            int r4 = r0.f5743f
            r2.setReadTimeout(r4)
            r4 = 1
            r2.setDoOutput(r4)
            r5 = 0
            r2.setInstanceFollowRedirects(r5)
            java.lang.String r6 = "POST"
            r2.setRequestMethod(r6)
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r6 = "2.3.0"
            r4[r5] = r6
            java.lang.String r5 = "datatransport/%s android/"
            java.lang.String r4 = java.lang.String.format(r5, r4)
            java.lang.String r5 = "User-Agent"
            r2.setRequestProperty(r5, r4)
            java.lang.String r4 = "gzip"
            java.lang.String r5 = "Content-Encoding"
            r2.setRequestProperty(r5, r4)
            java.lang.String r6 = "Content-Type"
            java.lang.String r7 = "application/json"
            r2.setRequestProperty(r6, r7)
            java.lang.String r7 = "Accept-Encoding"
            r2.setRequestProperty(r7, r4)
            java.lang.String r7 = r14.f5746c
            if (r7 == 0) goto L_0x005c
            java.lang.String r8 = "X-Goog-Api-Key"
            r2.setRequestProperty(r8, r7)
        L_0x005c:
            r7 = 0
            java.io.OutputStream r9 = r2.getOutputStream()     // Catch:{ ConnectException -> 0x0158, UnknownHostException -> 0x0156, c -> 0x0148, IOException -> 0x0146 }
            java.util.zip.GZIPOutputStream r10 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x013f }
            r10.<init>(r9)     // Catch:{ all -> 0x013f }
            q.b.d.i.a r0 = r0.f5738a     // Catch:{ all -> 0x013a }
            q.b.a.a.e.b.j r14 = r14.f5745b     // Catch:{ all -> 0x013a }
            java.io.BufferedWriter r11 = new java.io.BufferedWriter     // Catch:{ all -> 0x013a }
            java.io.OutputStreamWriter r12 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x013a }
            r12.<init>(r10)     // Catch:{ all -> 0x013a }
            r11.<init>(r12)     // Catch:{ all -> 0x013a }
            q.b.d.i.i.d r0 = (p213q.p217b.p317d.p342i.p344i.C4202d) r0
            r0.mo10390a(r14, r11)     // Catch:{ all -> 0x013a }
            r10.close()     // Catch:{ all -> 0x013f }
            if (r9 == 0) goto L_0x0082
            r9.close()     // Catch:{ ConnectException -> 0x0158, UnknownHostException -> 0x0156, c -> 0x0148, IOException -> 0x0146 }
        L_0x0082:
            int r14 = r2.getResponseCode()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r9 = "Status Code: "
            r0.append(r9)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            p124p.p126b.p127k.C1061o.m2498a(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r9 = "Content-Type: "
            r0.append(r9)
            java.lang.String r6 = r2.getHeaderField(r6)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            p124p.p126b.p127k.C1061o.m2498a(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "Content-Encoding: "
            r0.append(r6)
            java.lang.String r6 = r2.getHeaderField(r5)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            p124p.p126b.p127k.C1061o.m2498a(r3, r0)
            r0 = 302(0x12e, float:4.23E-43)
            if (r14 == r0) goto L_0x0128
            r0 = 301(0x12d, float:4.22E-43)
            if (r14 == r0) goto L_0x0128
            r0 = 307(0x133, float:4.3E-43)
            if (r14 != r0) goto L_0x00d7
            goto L_0x0128
        L_0x00d7:
            r0 = 200(0xc8, float:2.8E-43)
            if (r14 == r0) goto L_0x00e2
            q.b.a.a.e.e$b r0 = new q.b.a.a.e.e$b
            r0.<init>(r14, r1, r7)
            goto L_0x0165
        L_0x00e2:
            java.io.InputStream r0 = r2.getInputStream()
            java.lang.String r2 = r2.getHeaderField(r5)     // Catch:{ all -> 0x0121 }
            boolean r2 = r4.equals(r2)     // Catch:{ all -> 0x0121 }
            if (r2 == 0) goto L_0x00f6
            java.util.zip.GZIPInputStream r2 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x0121 }
            r2.<init>(r0)     // Catch:{ all -> 0x0121 }
            goto L_0x00f7
        L_0x00f6:
            r2 = r0
        L_0x00f7:
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x011a }
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ all -> 0x011a }
            r4.<init>(r2)     // Catch:{ all -> 0x011a }
            r3.<init>(r4)     // Catch:{ all -> 0x011a }
            q.b.a.a.e.b.n r3 = p213q.p217b.p218a.p219a.p220e.p221b.C1993n.m4775a(r3)     // Catch:{ all -> 0x011a }
            q.b.a.a.e.b.h r3 = (p213q.p217b.p218a.p219a.p220e.p221b.C1985h) r3     // Catch:{ all -> 0x011a }
            long r3 = r3.f5680a     // Catch:{ all -> 0x011a }
            q.b.a.a.e.e$b r5 = new q.b.a.a.e.e$b     // Catch:{ all -> 0x011a }
            r5.<init>(r14, r1, r3)     // Catch:{ all -> 0x011a }
            if (r2 == 0) goto L_0x0113
            r2.close()     // Catch:{ all -> 0x0121 }
        L_0x0113:
            if (r0 == 0) goto L_0x0118
            r0.close()
        L_0x0118:
            r0 = r5
            goto L_0x0165
        L_0x011a:
            r14 = move-exception
            if (r2 == 0) goto L_0x0120
            r2.close()     // Catch:{ all -> 0x0120 }
        L_0x0120:
            throw r14     // Catch:{ all -> 0x0121 }
        L_0x0121:
            r14 = move-exception
            if (r0 == 0) goto L_0x0127
            r0.close()     // Catch:{ all -> 0x0127 }
        L_0x0127:
            throw r14
        L_0x0128:
            java.lang.String r0 = "Location"
            java.lang.String r0 = r2.getHeaderField(r0)
            q.b.a.a.e.e$b r1 = new q.b.a.a.e.e$b
            java.net.URL r2 = new java.net.URL
            r2.<init>(r0)
            r1.<init>(r14, r2, r7)
            r0 = r1
            goto L_0x0165
        L_0x013a:
            r14 = move-exception
            r10.close()     // Catch:{ all -> 0x013e }
        L_0x013e:
            throw r14     // Catch:{ all -> 0x013f }
        L_0x013f:
            r14 = move-exception
            if (r9 == 0) goto L_0x0145
            r9.close()     // Catch:{ all -> 0x0145 }
        L_0x0145:
            throw r14     // Catch:{ ConnectException -> 0x0158, UnknownHostException -> 0x0156, c -> 0x0148, IOException -> 0x0146 }
        L_0x0146:
            r14 = move-exception
            goto L_0x0149
        L_0x0148:
            r14 = move-exception
        L_0x0149:
            java.lang.String r0 = "Couldn't encode request, returning with 400"
            p124p.p126b.p127k.C1061o.m2500a(r3, r0, r14)
            q.b.a.a.e.e$b r0 = new q.b.a.a.e.e$b
            r14 = 400(0x190, float:5.6E-43)
            r0.<init>(r14, r1, r7)
            goto L_0x0165
        L_0x0156:
            r14 = move-exception
            goto L_0x0159
        L_0x0158:
            r14 = move-exception
        L_0x0159:
            java.lang.String r0 = "Couldn't open connection, returning with 500"
            p124p.p126b.p127k.C1061o.m2500a(r3, r0, r14)
            q.b.a.a.e.e$b r0 = new q.b.a.a.e.e$b
            r14 = 500(0x1f4, float:7.0E-43)
            r0.<init>(r14, r1, r7)
        L_0x0165:
            return r0
        L_0x0166:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p219a.p220e.C1998c.mo6991a(java.lang.Object):java.lang.Object");
    }
}
