package p213q.p217b.p218a.p231b.p259h.p261b;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;

/* renamed from: q.b.a.b.h.b.x3 */
public final class C3161x3 extends C2921c5 {

    /* renamed from: c */
    public final C3150w3 f7954c = new C3150w3(this, this.f7133a.f7332a, "google_app_measurement_local.db");

    /* renamed from: d */
    public boolean f7955d;

    public C3161x3(C2969g5 g5Var) {
        super(g5Var);
    }

    /* renamed from: a */
    public static long m7468a(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor = null;
        try {
            Cursor query = sQLiteDatabase.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
            if (query.moveToFirst()) {
                long j = query.getLong(0);
                query.close();
                return j;
            }
            query.close();
            return -1;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: A */
    public final SQLiteDatabase mo8817A() {
        if (this.f7955d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f7954c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f7955d = true;
        return null;
    }

    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r9v0, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARNING: type inference failed for: r7v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r9v1 */
    /* JADX WARNING: type inference failed for: r7v2 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r9v2 */
    /* JADX WARNING: type inference failed for: r7v3, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r9v3 */
    /* JADX WARNING: type inference failed for: r9v4, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* JADX WARNING: type inference failed for: r7v4, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r9v6 */
    /* JADX WARNING: type inference failed for: r12v0 */
    /* JADX WARNING: type inference failed for: r9v7 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: type inference failed for: r12v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r7v6, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARNING: type inference failed for: r9v8 */
    /* JADX WARNING: type inference failed for: r12v2 */
    /* JADX WARNING: type inference failed for: r9v9 */
    /* JADX WARNING: type inference failed for: r9v10, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARNING: type inference failed for: r12v3 */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: type inference failed for: r12v4 */
    /* JADX WARNING: type inference failed for: r12v5, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r7v8 */
    /* JADX WARNING: type inference failed for: r7v9 */
    /* JADX WARNING: type inference failed for: r2v14 */
    /* JADX WARNING: type inference failed for: r7v10 */
    /* JADX WARNING: type inference failed for: r7v11 */
    /* JADX WARNING: type inference failed for: r7v12 */
    /* JADX WARNING: type inference failed for: r7v13 */
    /* JADX WARNING: type inference failed for: r7v14 */
    /* JADX WARNING: type inference failed for: r7v15 */
    /* JADX WARNING: type inference failed for: r9v11 */
    /* JADX WARNING: type inference failed for: r7v16 */
    /* JADX WARNING: type inference failed for: r2v15 */
    /* JADX WARNING: type inference failed for: r9v12 */
    /* JADX WARNING: type inference failed for: r9v13 */
    /* JADX WARNING: type inference failed for: r7v17 */
    /* JADX WARNING: type inference failed for: r7v18 */
    /* JADX WARNING: type inference failed for: r9v14 */
    /* JADX WARNING: type inference failed for: r9v15 */
    /* JADX WARNING: type inference failed for: r7v19 */
    /* JADX WARNING: type inference failed for: r7v20 */
    /* JADX WARNING: type inference failed for: r9v16 */
    /* JADX WARNING: type inference failed for: r12v6 */
    /* JADX WARNING: type inference failed for: r9v17 */
    /* JADX WARNING: type inference failed for: r9v18 */
    /* JADX WARNING: type inference failed for: r9v19 */
    /* JADX WARNING: type inference failed for: r9v20 */
    /* JADX WARNING: type inference failed for: r9v21 */
    /* JADX WARNING: type inference failed for: r12v7 */
    /* JADX WARNING: type inference failed for: r12v8 */
    /* JADX WARNING: type inference failed for: r12v9 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v1, types: [boolean, int]
      assigns: []
      uses: [?[int, short, byte, char], int, boolean]
      mth insns count: 157
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
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00be A[SYNTHETIC, Splitter:B:47:0x00be] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x010e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x010e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x010e A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 21 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo8818a(int r17, byte[] r18) {
        /*
            r16 = this;
            r1 = r16
            r16.mo8277a()
            r16.mo8279c()
            boolean r0 = r1.f7955d
            r2 = 0
            if (r0 == 0) goto L_0x000e
            return r2
        L_0x000e:
            android.content.ContentValues r3 = new android.content.ContentValues
            r3.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)
            java.lang.String r4 = "type"
            r3.put(r4, r0)
            java.lang.String r0 = "entry"
            r4 = r18
            r3.put(r0, r4)
            r4 = 5
            r5 = r2
            r6 = r4
        L_0x0026:
            if (r5 >= r4) goto L_0x0120
            r7 = 0
            r8 = 1
            android.database.sqlite.SQLiteDatabase r9 = r16.mo8817A()     // Catch:{ SQLiteFullException -> 0x00f6, SQLiteDatabaseLockedException -> 0x00e4, SQLiteException -> 0x00ba, all -> 0x00b7 }
            if (r9 != 0) goto L_0x0038
            r1.f7955d = r8     // Catch:{ SQLiteFullException -> 0x00b5, SQLiteDatabaseLockedException -> 0x00e5, SQLiteException -> 0x00b1 }
            if (r9 == 0) goto L_0x0037
            r9.close()
        L_0x0037:
            return r2
        L_0x0038:
            r9.beginTransaction()     // Catch:{ SQLiteFullException -> 0x00b5, SQLiteDatabaseLockedException -> 0x00e5, SQLiteException -> 0x00b1 }
            r10 = 0
            java.lang.String r0 = "select count(1) from messages"
            android.database.Cursor r12 = r9.rawQuery(r0, r7)     // Catch:{ SQLiteFullException -> 0x00b5, SQLiteDatabaseLockedException -> 0x00e5, SQLiteException -> 0x00b1 }
            if (r12 == 0) goto L_0x0059
            boolean r0 = r12.moveToFirst()     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00af, SQLiteException -> 0x0053, all -> 0x0050 }
            if (r0 == 0) goto L_0x0059
            long r10 = r12.getLong(r2)     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00af, SQLiteException -> 0x0053, all -> 0x0050 }
            goto L_0x0059
        L_0x0050:
            r0 = move-exception
            goto L_0x00e2
        L_0x0053:
            r0 = move-exception
            goto L_0x00b3
        L_0x0055:
            r0 = move-exception
            r7 = r12
            goto L_0x00f8
        L_0x0059:
            r13 = 100000(0x186a0, double:4.94066E-319)
            int r0 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            java.lang.String r15 = "messages"
            if (r0 < 0) goto L_0x009c
            q.b.a.b.h.b.b4 r0 = r16.mo8285i()     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00af, SQLiteException -> 0x0053, all -> 0x0050 }
            q.b.a.b.h.b.e4 r0 = r0.f7153f     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00af, SQLiteException -> 0x0053, all -> 0x0050 }
            java.lang.String r4 = "Data loss, local db full"
            r0.mo8432a(r4)     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00af, SQLiteException -> 0x0053, all -> 0x0050 }
            long r13 = r13 - r10
            r10 = 1
            long r13 = r13 + r10
            java.lang.String r0 = "rowid in (select rowid from messages order by rowid asc limit ?)"
            java.lang.String[] r4 = new java.lang.String[r8]     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00af, SQLiteException -> 0x0053, all -> 0x0050 }
            java.lang.String r10 = java.lang.Long.toString(r13)     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00af, SQLiteException -> 0x0053, all -> 0x0050 }
            r4[r2] = r10     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00af, SQLiteException -> 0x0053, all -> 0x0050 }
            int r0 = r9.delete(r15, r0, r4)     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00af, SQLiteException -> 0x0053, all -> 0x0050 }
            long r10 = (long) r0     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00af, SQLiteException -> 0x0053, all -> 0x0050 }
            int r0 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x009c
            q.b.a.b.h.b.b4 r0 = r16.mo8285i()     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00af, SQLiteException -> 0x0053, all -> 0x0050 }
            q.b.a.b.h.b.e4 r0 = r0.f7153f     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00af, SQLiteException -> 0x0053, all -> 0x0050 }
            java.lang.String r4 = "Different delete count than expected in local db. expected, received, difference"
            java.lang.Long r2 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00af, SQLiteException -> 0x0053, all -> 0x0050 }
            java.lang.Long r8 = java.lang.Long.valueOf(r10)     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00af, SQLiteException -> 0x0053, all -> 0x0050 }
            long r13 = r13 - r10
            java.lang.Long r10 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00af, SQLiteException -> 0x0053, all -> 0x0050 }
            r0.mo8435a(r4, r2, r8, r10)     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00af, SQLiteException -> 0x0053, all -> 0x0050 }
        L_0x009c:
            r9.insertOrThrow(r15, r7, r3)     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00af, SQLiteException -> 0x0053, all -> 0x0050 }
            r9.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00af, SQLiteException -> 0x0053, all -> 0x0050 }
            r9.endTransaction()     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00af, SQLiteException -> 0x0053, all -> 0x0050 }
            if (r12 == 0) goto L_0x00aa
            r12.close()
        L_0x00aa:
            r9.close()
            r2 = 1
            return r2
        L_0x00af:
            r7 = r12
            goto L_0x00e5
        L_0x00b1:
            r0 = move-exception
            r12 = r7
        L_0x00b3:
            r7 = r9
            goto L_0x00bc
        L_0x00b5:
            r0 = move-exception
            goto L_0x00f8
        L_0x00b7:
            r0 = move-exception
            r9 = r7
            goto L_0x0115
        L_0x00ba:
            r0 = move-exception
            r12 = r7
        L_0x00bc:
            if (r7 == 0) goto L_0x00c7
            boolean r2 = r7.inTransaction()     // Catch:{ all -> 0x00e0 }
            if (r2 == 0) goto L_0x00c7
            r7.endTransaction()     // Catch:{ all -> 0x00e0 }
        L_0x00c7:
            q.b.a.b.h.b.b4 r2 = r16.mo8285i()     // Catch:{ all -> 0x00e0 }
            q.b.a.b.h.b.e4 r2 = r2.f7153f     // Catch:{ all -> 0x00e0 }
            java.lang.String r4 = "Error writing entry to local database"
            r2.mo8433a(r4, r0)     // Catch:{ all -> 0x00e0 }
            r2 = 1
            r1.f7955d = r2     // Catch:{ all -> 0x00e0 }
            if (r12 == 0) goto L_0x00da
            r12.close()
        L_0x00da:
            if (r7 == 0) goto L_0x010e
            r7.close()
            goto L_0x010e
        L_0x00e0:
            r0 = move-exception
            r9 = r7
        L_0x00e2:
            r7 = r12
            goto L_0x0115
        L_0x00e4:
            r9 = r7
        L_0x00e5:
            long r10 = (long) r6
            android.os.SystemClock.sleep(r10)     // Catch:{ all -> 0x0114 }
            int r6 = r6 + 20
            if (r7 == 0) goto L_0x00f0
            r7.close()
        L_0x00f0:
            if (r9 == 0) goto L_0x010e
        L_0x00f2:
            r9.close()
            goto L_0x010e
        L_0x00f6:
            r0 = move-exception
            r9 = r7
        L_0x00f8:
            q.b.a.b.h.b.b4 r2 = r16.mo8285i()     // Catch:{ all -> 0x0114 }
            q.b.a.b.h.b.e4 r2 = r2.f7153f     // Catch:{ all -> 0x0114 }
            java.lang.String r4 = "Error writing entry; local database full"
            r2.mo8433a(r4, r0)     // Catch:{ all -> 0x0114 }
            r2 = 1
            r1.f7955d = r2     // Catch:{ all -> 0x0114 }
            if (r7 == 0) goto L_0x010b
            r7.close()
        L_0x010b:
            if (r9 == 0) goto L_0x010e
            goto L_0x00f2
        L_0x010e:
            int r5 = r5 + 1
            r2 = 0
            r4 = 5
            goto L_0x0026
        L_0x0114:
            r0 = move-exception
        L_0x0115:
            if (r7 == 0) goto L_0x011a
            r7.close()
        L_0x011a:
            if (r9 == 0) goto L_0x011f
            r9.close()
        L_0x011f:
            throw r0
        L_0x0120:
            q.b.a.b.h.b.b4 r0 = r16.mo8285i()
            q.b.a.b.h.b.e4 r0 = r0.f7161n
            java.lang.String r2 = "Failed to write entry to local database"
            r0.mo8432a(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p259h.p261b.C3161x3.mo8818a(int, byte[]):boolean");
    }

    /* renamed from: x */
    public final boolean mo8375x() {
        return false;
    }

    /* renamed from: y */
    public final void mo8819y() {
        mo8277a();
        mo8279c();
        try {
            int delete = mo8817A().delete("messages", null, null) + 0;
            if (delete > 0) {
                mo8285i().f7161n.mo8433a("Reset local analytics data. records", Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            mo8285i().f7153f.mo8433a("Error resetting local analytics data. error", e);
        }
    }

    /* renamed from: z */
    public final boolean mo8820z() {
        String str = "Error deleting app launch break from local database";
        mo8279c();
        mo8277a();
        if (this.f7955d || !this.f7133a.f7332a.getDatabasePath("google_app_measurement_local.db").exists()) {
            return false;
        }
        int i = 5;
        int i2 = 0;
        while (i2 < 5) {
            SQLiteDatabase sQLiteDatabase = null;
            try {
                sQLiteDatabase = mo8817A();
                if (sQLiteDatabase == null) {
                    this.f7955d = true;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                    }
                    return false;
                }
                sQLiteDatabase.beginTransaction();
                sQLiteDatabase.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                sQLiteDatabase.setTransactionSuccessful();
                sQLiteDatabase.endTransaction();
                sQLiteDatabase.close();
                return true;
            } catch (SQLiteFullException e) {
                mo8285i().f7153f.mo8433a(str, e);
                this.f7955d = true;
                if (sQLiteDatabase == null) {
                    i2++;
                }
                sQLiteDatabase.close();
                i2++;
            } catch (SQLiteDatabaseLockedException unused) {
                SystemClock.sleep((long) i);
                i += 20;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                    i2++;
                } else {
                    i2++;
                }
            } catch (SQLiteException e2) {
                if (sQLiteDatabase != null) {
                    if (sQLiteDatabase.inTransaction()) {
                        sQLiteDatabase.endTransaction();
                    }
                }
                mo8285i().f7153f.mo8433a(str, e2);
                this.f7955d = true;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                    i2++;
                } else {
                    i2++;
                }
            } catch (Throwable th) {
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
        }
        mo8285i().f7156i.mo8432a("Error deleting app launch break from local database in reasonable time");
        return false;
    }
}
