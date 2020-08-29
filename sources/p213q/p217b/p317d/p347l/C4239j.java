package p213q.p217b.p317d.p347l;

/* renamed from: q.b.d.l.j */
public final /* synthetic */ class C4239j implements Runnable {

    /* renamed from: e */
    public final C4230f f10213e;

    public C4239j(C4230f fVar) {
        this.f10213e = fVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003e, code lost:
        if (android.util.Log.isLoggable("MessengerIpcClient", 3) == false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
        r3 = java.lang.String.valueOf(r1);
        r5 = new java.lang.StringBuilder(r3.length() + 8);
        r5.append("Sending ");
        r5.append(r3);
        android.util.Log.d("MessengerIpcClient", r5.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0060, code lost:
        r3 = r0.f10197f.f10187a;
        r4 = r0.f10193b;
        r5 = android.os.Message.obtain();
        r5.what = r1.f10232c;
        r5.arg1 = r1.f10230a;
        r5.replyTo = r4;
        r4 = new android.os.Bundle();
        r4.putBoolean("oneWay", false);
        r4.putString("pkg", r3.getPackageName());
        r4.putBundle("data", r1.f10233d);
        r5.setData(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r1 = r0.f10194c;
        r3 = r1.f10225a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0096, code lost:
        if (r3 == null) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0098, code lost:
        r3.send(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x009d, code lost:
        r1 = r1.f10226b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009f, code lost:
        if (r1 == null) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a1, code lost:
        r1.mo10450a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ad, code lost:
        throw new java.lang.IllegalStateException("Both messengers are null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ae, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00af, code lost:
        r0.mo10418a(2, r1.getMessage());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            q.b.d.l.f r0 = r8.f10213e
        L_0x0002:
            monitor-enter(r0)
            int r1 = r0.f10192a     // Catch:{ all -> 0x00b8 }
            r2 = 2
            if (r1 == r2) goto L_0x000a
            monitor-exit(r0)     // Catch:{ all -> 0x00b8 }
            return
        L_0x000a:
            java.util.Queue<q.b.d.l.p<?>> r1 = r0.f10195d     // Catch:{ all -> 0x00b8 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00b8 }
            if (r1 == 0) goto L_0x0017
            r0.mo10416a()     // Catch:{ all -> 0x00b8 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b8 }
            return
        L_0x0017:
            java.util.Queue<q.b.d.l.p<?>> r1 = r0.f10195d     // Catch:{ all -> 0x00b8 }
            java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x00b8 }
            q.b.d.l.p r1 = (p213q.p217b.p317d.p347l.C4251p) r1     // Catch:{ all -> 0x00b8 }
            android.util.SparseArray<q.b.d.l.p<?>> r3 = r0.f10196e     // Catch:{ all -> 0x00b8 }
            int r4 = r1.f10230a     // Catch:{ all -> 0x00b8 }
            r3.put(r4, r1)     // Catch:{ all -> 0x00b8 }
            q.b.d.l.e r3 = r0.f10197f     // Catch:{ all -> 0x00b8 }
            java.util.concurrent.ScheduledExecutorService r3 = r3.f10188b     // Catch:{ all -> 0x00b8 }
            q.b.d.l.l r4 = new q.b.d.l.l     // Catch:{ all -> 0x00b8 }
            r4.<init>(r0, r1)     // Catch:{ all -> 0x00b8 }
            r5 = 30
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x00b8 }
            r3.schedule(r4, r5, r7)     // Catch:{ all -> 0x00b8 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b8 }
            r3 = 3
            java.lang.String r4 = "MessengerIpcClient"
            boolean r3 = android.util.Log.isLoggable(r4, r3)
            if (r3 == 0) goto L_0x0060
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r4 = r3.length()
            int r4 = r4 + 8
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "Sending "
            r5.append(r4)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            java.lang.String r4 = "MessengerIpcClient"
            android.util.Log.d(r4, r3)
        L_0x0060:
            q.b.d.l.e r3 = r0.f10197f
            android.content.Context r3 = r3.f10187a
            android.os.Messenger r4 = r0.f10193b
            android.os.Message r5 = android.os.Message.obtain()
            int r6 = r1.f10232c
            r5.what = r6
            int r6 = r1.f10230a
            r5.arg1 = r6
            r5.replyTo = r4
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            r6 = 0
            java.lang.String r7 = "oneWay"
            r4.putBoolean(r7, r6)
            java.lang.String r3 = r3.getPackageName()
            java.lang.String r6 = "pkg"
            r4.putString(r6, r3)
            android.os.Bundle r1 = r1.f10233d
            java.lang.String r3 = "data"
            r4.putBundle(r3, r1)
            r5.setData(r4)
            q.b.d.l.n r1 = r0.f10194c     // Catch:{ RemoteException -> 0x00ae }
            android.os.Messenger r3 = r1.f10225a     // Catch:{ RemoteException -> 0x00ae }
            if (r3 == 0) goto L_0x009d
            r3.send(r5)     // Catch:{ RemoteException -> 0x00ae }
            goto L_0x0002
        L_0x009d:
            q.b.d.l.r0 r1 = r1.f10226b     // Catch:{ RemoteException -> 0x00ae }
            if (r1 == 0) goto L_0x00a6
            r1.mo10450a(r5)     // Catch:{ RemoteException -> 0x00ae }
            goto L_0x0002
        L_0x00a6:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ RemoteException -> 0x00ae }
            java.lang.String r3 = "Both messengers are null"
            r1.<init>(r3)     // Catch:{ RemoteException -> 0x00ae }
            throw r1     // Catch:{ RemoteException -> 0x00ae }
        L_0x00ae:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            r0.mo10418a(r2, r1)
            goto L_0x0002
        L_0x00b8:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00b8 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p317d.p347l.C4239j.run():void");
    }
}
