package p213q.p217b.p218a.p231b.p259h.p261b;

import p213q.p217b.p218a.p231b.p251g.p256e.C2340a1;

/* renamed from: q.b.a.b.h.b.fa */
public final class C2962fa {

    /* renamed from: a */
    public C2340a1 f7309a;

    /* renamed from: b */
    public Long f7310b;

    /* renamed from: c */
    public long f7311c;

    /* renamed from: d */
    public final /* synthetic */ C2902aa f7312d;

    public /* synthetic */ C2962fa(C2902aa aaVar, C2938da daVar) {
        this.f7312d = aaVar;
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [q.b.a.b.g.e.q6<q.b.a.b.g.e.c1>, java.util.Collection] */
    /* JADX WARNING: type inference failed for: r9v1, types: [java.lang.Iterable] */
    /* JADX WARNING: type inference failed for: r0v17, types: [java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r9v2 */
    /* JADX WARNING: type inference failed for: r9v3 */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ef, code lost:
        if (r14 != null) goto L_0x00d8;
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r9v2
      assigns: []
      uses: []
      mth insns count: 226
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01bd  */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p213q.p217b.p218a.p231b.p251g.p256e.C2340a1 mo8456a(java.lang.String r19, p213q.p217b.p218a.p231b.p251g.p256e.C2340a1 r20) {
        /*
            r18 = this;
            r1 = r18
            r3 = r19
            r8 = r20
            java.lang.String r0 = r8.zze
            q.b.a.b.g.e.q6<q.b.a.b.g.e.c1> r9 = r8.zzd
            q.b.a.b.h.b.aa r2 = r1.f7312d
            q.b.a.b.h.b.t9 r2 = r2.mo8651p()
            java.lang.String r4 = "_eid"
            java.lang.Object r2 = r2.mo8734a(r8, r4)
            r5 = r2
            java.lang.Long r5 = (java.lang.Long) r5
            r2 = 1
            r10 = 0
            if (r5 == 0) goto L_0x001f
            r6 = r2
            goto L_0x0020
        L_0x001f:
            r6 = r10
        L_0x0020:
            if (r6 == 0) goto L_0x002c
            java.lang.String r7 = "_ep"
            boolean r7 = r0.equals(r7)
            if (r7 == 0) goto L_0x002c
            r7 = r2
            goto L_0x002d
        L_0x002c:
            r7 = r10
        L_0x002d:
            r11 = 0
            if (r7 == 0) goto L_0x01c1
            q.b.a.b.h.b.aa r0 = r1.f7312d
            q.b.a.b.h.b.t9 r0 = r0.mo8651p()
            java.lang.String r6 = "_en"
            java.lang.Object r0 = r0.mo8734a(r8, r6)
            r13 = r0
            java.lang.String r13 = (java.lang.String) r13
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            r6 = 0
            if (r0 == 0) goto L_0x0055
            q.b.a.b.h.b.aa r0 = r1.f7312d
            q.b.a.b.h.b.b4 r0 = r0.mo8285i()
            q.b.a.b.h.b.e4 r0 = r0.f7154g
            java.lang.String r2 = "Extra parameter without an event name. eventId"
            r0.mo8433a(r2, r5)
            return r6
        L_0x0055:
            q.b.a.b.g.e.a1 r0 = r1.f7309a
            if (r0 == 0) goto L_0x006b
            java.lang.Long r0 = r1.f7310b
            if (r0 == 0) goto L_0x006b
            long r14 = r5.longValue()
            java.lang.Long r0 = r1.f7310b
            long r16 = r0.longValue()
            int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x0119
        L_0x006b:
            q.b.a.b.h.b.aa r0 = r1.f7312d
            q.b.a.b.h.b.e r7 = r0.mo8652q()
            r7.mo8279c()
            r7.mo8649m()
            android.database.sqlite.SQLiteDatabase r0 = r7.mo8425t()     // Catch:{ SQLiteException -> 0x00e2, all -> 0x00de }
            java.lang.String r14 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            r15 = 2
            java.lang.String[] r15 = new java.lang.String[r15]     // Catch:{ SQLiteException -> 0x00e2, all -> 0x00de }
            r15[r10] = r3     // Catch:{ SQLiteException -> 0x00e2, all -> 0x00de }
            java.lang.String r16 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x00e2, all -> 0x00de }
            r15[r2] = r16     // Catch:{ SQLiteException -> 0x00e2, all -> 0x00de }
            android.database.Cursor r14 = r0.rawQuery(r14, r15)     // Catch:{ SQLiteException -> 0x00e2, all -> 0x00de }
            boolean r0 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x00dc }
            if (r0 != 0) goto L_0x00a2
            q.b.a.b.h.b.b4 r0 = r7.mo8285i()     // Catch:{ SQLiteException -> 0x00dc }
            q.b.a.b.h.b.e4 r0 = r0.f7161n     // Catch:{ SQLiteException -> 0x00dc }
            java.lang.String r15 = "Main event not found"
            r0.mo8432a(r15)     // Catch:{ SQLiteException -> 0x00dc }
            r14.close()
            r0 = r6
            goto L_0x00f3
        L_0x00a2:
            byte[] r0 = r14.getBlob(r10)     // Catch:{ SQLiteException -> 0x00dc }
            long r15 = r14.getLong(r2)     // Catch:{ SQLiteException -> 0x00dc }
            java.lang.Long r15 = java.lang.Long.valueOf(r15)     // Catch:{ SQLiteException -> 0x00dc }
            q.b.a.b.g.e.a1$a r6 = p213q.p217b.p218a.p231b.p251g.p256e.C2340a1.m5426n()     // Catch:{ IOException -> 0x00c8 }
            q.b.a.b.g.e.s7 r0 = p213q.p217b.p218a.p231b.p259h.p261b.C3123t9.m7336a(r6, r0)     // Catch:{ IOException -> 0x00c8 }
            q.b.a.b.g.e.a1$a r0 = (p213q.p217b.p218a.p231b.p251g.p256e.C2340a1.C2341a) r0     // Catch:{ IOException -> 0x00c8 }
            q.b.a.b.g.e.p7 r0 = r0.mo7778m()     // Catch:{ IOException -> 0x00c8 }
            q.b.a.b.g.e.i6 r0 = (p213q.p217b.p218a.p231b.p251g.p256e.C2490i6) r0     // Catch:{ IOException -> 0x00c8 }
            q.b.a.b.g.e.a1 r0 = (p213q.p217b.p218a.p231b.p251g.p256e.C2340a1) r0     // Catch:{ IOException -> 0x00c8 }
            android.util.Pair r0 = android.util.Pair.create(r0, r15)     // Catch:{ SQLiteException -> 0x00dc }
            r14.close()
            goto L_0x00f3
        L_0x00c8:
            r0 = move-exception
            q.b.a.b.h.b.b4 r6 = r7.mo8285i()     // Catch:{ SQLiteException -> 0x00dc }
            q.b.a.b.h.b.e4 r6 = r6.f7153f     // Catch:{ SQLiteException -> 0x00dc }
            java.lang.String r15 = "Failed to merge main event. appId, eventId"
            java.lang.Object r10 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r19)     // Catch:{ SQLiteException -> 0x00dc }
            r6.mo8435a(r15, r10, r5, r0)     // Catch:{ SQLiteException -> 0x00dc }
        L_0x00d8:
            r14.close()
            goto L_0x00f2
        L_0x00dc:
            r0 = move-exception
            goto L_0x00e4
        L_0x00de:
            r0 = move-exception
            r6 = 0
            goto L_0x01bb
        L_0x00e2:
            r0 = move-exception
            r14 = 0
        L_0x00e4:
            q.b.a.b.h.b.b4 r6 = r7.mo8285i()     // Catch:{ all -> 0x01b9 }
            q.b.a.b.h.b.e4 r6 = r6.f7153f     // Catch:{ all -> 0x01b9 }
            java.lang.String r7 = "Error selecting main event"
            r6.mo8433a(r7, r0)     // Catch:{ all -> 0x01b9 }
            if (r14 == 0) goto L_0x00f2
            goto L_0x00d8
        L_0x00f2:
            r0 = 0
        L_0x00f3:
            if (r0 == 0) goto L_0x01aa
            java.lang.Object r6 = r0.first
            if (r6 != 0) goto L_0x00fb
            goto L_0x01aa
        L_0x00fb:
            q.b.a.b.g.e.a1 r6 = (p213q.p217b.p218a.p231b.p251g.p256e.C2340a1) r6
            r1.f7309a = r6
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r6 = r0.longValue()
            r1.f7311c = r6
            q.b.a.b.h.b.aa r0 = r1.f7312d
            q.b.a.b.h.b.t9 r0 = r0.mo8651p()
            q.b.a.b.g.e.a1 r6 = r1.f7309a
            java.lang.Object r0 = r0.mo8734a(r6, r4)
            java.lang.Long r0 = (java.lang.Long) r0
            r1.f7310b = r0
        L_0x0119:
            long r6 = r1.f7311c
            r14 = 1
            long r6 = r6 - r14
            r1.f7311c = r6
            int r0 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r0 > 0) goto L_0x0154
            q.b.a.b.h.b.aa r0 = r1.f7312d
            q.b.a.b.h.b.e r4 = r0.mo8652q()
            r4.mo8279c()
            q.b.a.b.h.b.b4 r0 = r4.mo8285i()
            q.b.a.b.h.b.e4 r0 = r0.f7161n
            java.lang.String r5 = "Clearing complex main event info. appId"
            r0.mo8433a(r5, r3)
            android.database.sqlite.SQLiteDatabase r0 = r4.mo8425t()     // Catch:{ SQLiteException -> 0x0147 }
            java.lang.String r5 = "delete from main_event_params where app_id=?"
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x0147 }
            r6 = 0
            r2[r6] = r3     // Catch:{ SQLiteException -> 0x0147 }
            r0.execSQL(r5, r2)     // Catch:{ SQLiteException -> 0x0147 }
            goto L_0x0166
        L_0x0147:
            r0 = move-exception
            q.b.a.b.h.b.b4 r2 = r4.mo8285i()
            q.b.a.b.h.b.e4 r2 = r2.f7153f
            java.lang.String r3 = "Error clearing complex main event"
            r2.mo8433a(r3, r0)
            goto L_0x0166
        L_0x0154:
            q.b.a.b.h.b.aa r0 = r1.f7312d
            q.b.a.b.h.b.e r2 = r0.mo8652q()
            long r6 = r1.f7311c
            q.b.a.b.g.e.a1 r0 = r1.f7309a
            r3 = r19
            r4 = r5
            r5 = r6
            r7 = r0
            r2.mo8405a(r3, r4, r5, r7)
        L_0x0166:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            q.b.a.b.g.e.a1 r2 = r1.f7309a
            q.b.a.b.g.e.q6<q.b.a.b.g.e.c1> r2 = r2.zzd
            java.util.Iterator r2 = r2.iterator()
        L_0x0173:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0190
            java.lang.Object r3 = r2.next()
            q.b.a.b.g.e.c1 r3 = (p213q.p217b.p218a.p231b.p251g.p256e.C2378c1) r3
            q.b.a.b.h.b.aa r4 = r1.f7312d
            r4.mo8651p()
            java.lang.String r4 = r3.zzd
            q.b.a.b.g.e.c1 r4 = p213q.p217b.p218a.p231b.p259h.p261b.C3123t9.m7343b(r8, r4)
            if (r4 != 0) goto L_0x0173
            r0.add(r3)
            goto L_0x0173
        L_0x0190:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x019b
            r0.addAll(r9)
            r9 = r0
            goto L_0x01a8
        L_0x019b:
            q.b.a.b.h.b.aa r0 = r1.f7312d
            q.b.a.b.h.b.b4 r0 = r0.mo8285i()
            q.b.a.b.h.b.e4 r0 = r0.f7154g
            java.lang.String r2 = "No unique parameters in main event. eventName"
            r0.mo8433a(r2, r13)
        L_0x01a8:
            r0 = r13
            goto L_0x0206
        L_0x01aa:
            q.b.a.b.h.b.aa r0 = r1.f7312d
            q.b.a.b.h.b.b4 r0 = r0.mo8285i()
            q.b.a.b.h.b.e4 r0 = r0.f7154g
            java.lang.String r2 = "Extra parameter without existing main event. eventName, eventId"
            r0.mo8434a(r2, r13, r5)
            r2 = 0
            return r2
        L_0x01b9:
            r0 = move-exception
            r6 = r14
        L_0x01bb:
            if (r6 == 0) goto L_0x01c0
            r6.close()
        L_0x01c0:
            throw r0
        L_0x01c1:
            if (r6 == 0) goto L_0x0206
            r1.f7310b = r5
            r1.f7309a = r8
            q.b.a.b.h.b.aa r2 = r1.f7312d
            q.b.a.b.h.b.t9 r2 = r2.mo8651p()
            java.lang.Long r4 = java.lang.Long.valueOf(r11)
            java.lang.String r6 = "_epc"
            java.lang.Object r2 = r2.mo8734a(r8, r6)
            if (r2 != 0) goto L_0x01da
            goto L_0x01db
        L_0x01da:
            r4 = r2
        L_0x01db:
            java.lang.Long r4 = (java.lang.Long) r4
            long r6 = r4.longValue()
            r1.f7311c = r6
            int r2 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r2 > 0) goto L_0x01f5
            q.b.a.b.h.b.aa r2 = r1.f7312d
            q.b.a.b.h.b.b4 r2 = r2.mo8285i()
            q.b.a.b.h.b.e4 r2 = r2.f7154g
            java.lang.String r3 = "Complex event with zero extra param count. eventName"
            r2.mo8433a(r3, r0)
            goto L_0x0206
        L_0x01f5:
            q.b.a.b.h.b.aa r2 = r1.f7312d
            q.b.a.b.h.b.e r2 = r2.mo8652q()
            long r6 = r1.f7311c
            r3 = r19
            r4 = r5
            r5 = r6
            r7 = r20
            r2.mo8405a(r3, r4, r5, r7)
        L_0x0206:
            q.b.a.b.g.e.i6$a r2 = r20.mo7769h()
            q.b.a.b.g.e.a1$a r2 = (p213q.p217b.p218a.p231b.p251g.p256e.C2340a1.C2341a) r2
            r2.mo7358a(r0)
            boolean r0 = r2.f6619g
            if (r0 == 0) goto L_0x0219
            r2.mo7776k()
            r3 = 0
            r2.f6619g = r3
        L_0x0219:
            MessageType r0 = r2.f6618f
            q.b.a.b.g.e.a1 r0 = (p213q.p217b.p218a.p231b.p251g.p256e.C2340a1) r0
            p213q.p217b.p218a.p231b.p251g.p256e.C2340a1.m5420a(r0)
            boolean r0 = r2.f6619g
            if (r0 == 0) goto L_0x022a
            r2.mo7776k()
            r3 = 0
            r2.f6619g = r3
        L_0x022a:
            MessageType r0 = r2.f6618f
            q.b.a.b.g.e.a1 r0 = (p213q.p217b.p218a.p231b.p251g.p256e.C2340a1) r0
            p213q.p217b.p218a.p231b.p251g.p256e.C2340a1.m5423a(r0, r9)
            q.b.a.b.g.e.p7 r0 = r2.mo7778m()
            q.b.a.b.g.e.i6 r0 = (p213q.p217b.p218a.p231b.p251g.p256e.C2490i6) r0
            q.b.a.b.g.e.a1 r0 = (p213q.p217b.p218a.p231b.p251g.p256e.C2340a1) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p259h.p261b.C2962fa.mo8456a(java.lang.String, q.b.a.b.g.e.a1):q.b.a.b.g.e.a1");
    }
}
