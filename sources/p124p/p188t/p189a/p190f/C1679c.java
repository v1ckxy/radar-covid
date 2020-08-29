package p124p.p188t.p189a.p190f;

import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.work.impl.WorkDatabase;
import java.io.File;
import java.util.List;
import p124p.p182q.C1638g.C1640b;
import p124p.p182q.C1643h;
import p124p.p182q.C1643h.C1645b;
import p124p.p188t.p189a.C1668a;
import p124p.p188t.p189a.C1669b;
import p124p.p188t.p189a.C1670c;
import p124p.p188t.p189a.C1670c.C1671a;
import p124p.p199y.p200x.C1830h;
import p124p.p199y.p200x.C1841k;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: p.t.a.f.c */
public class C1679c implements C1670c {

    /* renamed from: e */
    public final Context f4933e;

    /* renamed from: f */
    public final String f4934f;

    /* renamed from: g */
    public final C1671a f4935g;

    /* renamed from: h */
    public final boolean f4936h;

    /* renamed from: i */
    public final Object f4937i = new Object();

    /* renamed from: j */
    public C1680a f4938j;

    /* renamed from: k */
    public boolean f4939k;

    /* renamed from: p.t.a.f.c$a */
    public static class C1680a extends SQLiteOpenHelper {

        /* renamed from: e */
        public final C1676a[] f4940e;

        /* renamed from: f */
        public final C1671a f4941f;

        /* renamed from: g */
        public boolean f4942g;

        /* renamed from: p.t.a.f.c$a$a */
        public class C1681a implements DatabaseErrorHandler {

            /* renamed from: a */
            public final /* synthetic */ C1671a f4943a;

            /* renamed from: b */
            public final /* synthetic */ C1676a[] f4944b;

            public C1681a(C1671a aVar, C1676a[] aVarArr) {
                this.f4943a = aVar;
                this.f4944b = aVarArr;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:10:0x0039, code lost:
                r5 = r1.iterator();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:12:0x0041, code lost:
                if (r5.hasNext() != false) goto L_0x0043;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:13:0x0043, code lost:
                r0.mo6490a((java.lang.String) ((android.util.Pair) r5.next()).second);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:14:0x0051, code lost:
                r0.mo6490a(r5.mo6492a());
             */
            /* JADX WARNING: Code restructure failed: missing block: B:15:0x0058, code lost:
                throw r2;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:6:0x0031, code lost:
                r2 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:9:0x0037, code lost:
                if (r1 != null) goto L_0x0039;
             */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0033 */
            /* JADX WARNING: Removed duplicated region for block: B:18:0x005b  */
            /* JADX WARNING: Removed duplicated region for block: B:6:0x0031 A[ExcHandler: all (r2v5 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r1 
              PHI: (r1v8 java.util.List) = (r1v1 java.util.List), (r1v2 java.util.List), (r1v2 java.util.List) binds: [B:4:0x002a, B:7:0x0033, B:8:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:4:0x002a] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onCorruption(android.database.sqlite.SQLiteDatabase r5) {
                /*
                    r4 = this;
                    p.t.a.c$a r0 = r4.f4943a
                    p.t.a.f.a[] r1 = r4.f4944b
                    p.t.a.f.a r5 = p124p.p188t.p189a.p190f.C1679c.C1680a.m4226a(r1, r5)
                    r1 = 0
                    if (r0 == 0) goto L_0x007b
                    java.lang.String r2 = "Corruption reported by sqlite on database: "
                    java.lang.StringBuilder r2 = p213q.p214a.p215a.p216a.C1965a.m4756a(r2)
                    java.lang.String r3 = r5.mo6492a()
                    r2.append(r3)
                    java.lang.String r2 = r2.toString()
                    java.lang.String r3 = "SupportSQLite"
                    android.util.Log.e(r3, r2)
                    android.database.sqlite.SQLiteDatabase r2 = r5.f4930e
                    boolean r2 = r2.isOpen()
                    if (r2 != 0) goto L_0x002a
                    goto L_0x0073
                L_0x002a:
                    android.database.sqlite.SQLiteDatabase r2 = r5.f4930e     // Catch:{ SQLiteException -> 0x0033, all -> 0x0031 }
                    java.util.List r1 = r2.getAttachedDbs()     // Catch:{ SQLiteException -> 0x0033, all -> 0x0031 }
                    goto L_0x0033
                L_0x0031:
                    r2 = move-exception
                    goto L_0x0037
                L_0x0033:
                    r5.close()     // Catch:{ IOException -> 0x0059, all -> 0x0031 }
                    goto L_0x0059
                L_0x0037:
                    if (r1 == 0) goto L_0x0051
                    java.util.Iterator r5 = r1.iterator()
                L_0x003d:
                    boolean r1 = r5.hasNext()
                    if (r1 == 0) goto L_0x0058
                    java.lang.Object r1 = r5.next()
                    android.util.Pair r1 = (android.util.Pair) r1
                    java.lang.Object r1 = r1.second
                    java.lang.String r1 = (java.lang.String) r1
                    r0.mo6490a(r1)
                    goto L_0x003d
                L_0x0051:
                    java.lang.String r5 = r5.mo6492a()
                    r0.mo6490a(r5)
                L_0x0058:
                    throw r2
                L_0x0059:
                    if (r1 == 0) goto L_0x0073
                    java.util.Iterator r5 = r1.iterator()
                L_0x005f:
                    boolean r1 = r5.hasNext()
                    if (r1 == 0) goto L_0x007a
                    java.lang.Object r1 = r5.next()
                    android.util.Pair r1 = (android.util.Pair) r1
                    java.lang.Object r1 = r1.second
                    java.lang.String r1 = (java.lang.String) r1
                    r0.mo6490a(r1)
                    goto L_0x005f
                L_0x0073:
                    java.lang.String r5 = r5.mo6492a()
                    r0.mo6490a(r5)
                L_0x007a:
                    return
                L_0x007b:
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: p124p.p188t.p189a.p190f.C1679c.C1680a.C1681a.onCorruption(android.database.sqlite.SQLiteDatabase):void");
            }
        }

        public C1680a(Context context, String str, C1676a[] aVarArr, C1671a aVar) {
            super(context, str, null, aVar.f4924a, new C1681a(aVar, aVarArr));
            this.f4941f = aVar;
            this.f4940e = aVarArr;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x000c, code lost:
            if ((r1.f4930e == r3) == false) goto L_0x000e;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static p124p.p188t.p189a.p190f.C1676a m4226a(p124p.p188t.p189a.p190f.C1676a[] r2, android.database.sqlite.SQLiteDatabase r3) {
            /*
                r0 = 0
                r1 = r2[r0]
                if (r1 == 0) goto L_0x000e
                android.database.sqlite.SQLiteDatabase r1 = r1.f4930e
                if (r1 != r3) goto L_0x000b
                r1 = 1
                goto L_0x000c
            L_0x000b:
                r1 = r0
            L_0x000c:
                if (r1 != 0) goto L_0x0015
            L_0x000e:
                p.t.a.f.a r1 = new p.t.a.f.a
                r1.<init>(r3)
                r2[r0] = r1
            L_0x0015:
                r2 = r2[r0]
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p124p.p188t.p189a.p190f.C1679c.C1680a.m4226a(p.t.a.f.a[], android.database.sqlite.SQLiteDatabase):p.t.a.f.a");
        }

        /* renamed from: a */
        public synchronized C1669b mo6498a() {
            this.f4942g = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (this.f4942g) {
                close();
                return mo6498a();
            }
            return mo6499a(writableDatabase);
        }

        /* renamed from: a */
        public C1676a mo6499a(SQLiteDatabase sQLiteDatabase) {
            return m4226a(this.f4940e, sQLiteDatabase);
        }

        public synchronized void close() {
            super.close();
            this.f4940e[0] = null;
        }

        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            C1671a aVar = this.f4941f;
            m4226a(this.f4940e, sQLiteDatabase);
            if (((C1643h) aVar) == null) {
                throw null;
            }
        }

        /* JADX INFO: finally extract failed */
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            C1671a aVar = this.f4941f;
            C1676a a = m4226a(this.f4940e, sQLiteDatabase);
            C1643h hVar = (C1643h) aVar;
            if (hVar != null) {
                Cursor b = a.mo6493b("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
                try {
                    int i = 0;
                    boolean z = b.moveToFirst() && b.getInt(0) == 0;
                    b.close();
                    hVar.f4837c.mo6424a(a);
                    if (!z) {
                        C1645b b2 = hVar.f4837c.mo6425b(a);
                        if (!b2.f4841a) {
                            StringBuilder a2 = C1965a.m4756a("Pre-packaged database has an invalid schema: ");
                            a2.append(b2.f4842b);
                            throw new IllegalStateException(a2.toString());
                        }
                    }
                    hVar.mo6422a(a);
                    C1841k kVar = (C1841k) hVar.f4837c;
                    if (kVar.f5344b.f4815g != null) {
                        int size = kVar.f5344b.f4815g.size();
                        while (i < size) {
                            if (((C1640b) kVar.f5344b.f4815g.get(i)) != null) {
                                i++;
                            } else {
                                throw null;
                            }
                        }
                    }
                } catch (Throwable th) {
                    b.close();
                    throw th;
                }
            } else {
                throw null;
            }
        }

        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.f4942g = true;
            ((C1643h) this.f4941f).mo6423a(m4226a(this.f4940e, sQLiteDatabase), i, i2);
        }

        /* JADX INFO: finally extract failed */
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (!this.f4942g) {
                C1671a aVar = this.f4941f;
                C1676a a = m4226a(this.f4940e, sQLiteDatabase);
                C1643h hVar = (C1643h) aVar;
                if (hVar != null) {
                    Cursor b = a.mo6493b("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
                    try {
                        int i = 0;
                        if (b.moveToFirst() && b.getInt(0) != 0) {
                            Cursor a2 = a.mo6491a(new C1668a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
                            try {
                                Object string = a2.moveToFirst() ? a2.getString(0) : null;
                                a2.close();
                                if (!hVar.f4838d.equals(string) && !hVar.f4839e.equals(string)) {
                                    throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
                                }
                            } catch (Throwable th) {
                                a2.close();
                                throw th;
                            }
                        } else {
                            C1645b b2 = hVar.f4837c.mo6425b(a);
                            if (!b2.f4841a) {
                                StringBuilder a3 = C1965a.m4756a("Pre-packaged database has an invalid schema: ");
                                a3.append(b2.f4842b);
                                throw new IllegalStateException(a3.toString());
                            } else if (((C1841k) hVar.f4837c) != null) {
                                hVar.mo6422a(a);
                            } else {
                                throw null;
                            }
                        }
                        C1841k kVar = (C1841k) hVar.f4837c;
                        kVar.f5344b.f4809a = a;
                        a.f4930e.execSQL("PRAGMA foreign_keys = ON");
                        kVar.f5344b.f4812d.mo6392a((C1669b) a);
                        List<C1640b> list = kVar.f5344b.f4815g;
                        if (list != null) {
                            int size = list.size();
                            while (i < size) {
                                if (((C1830h) ((C1640b) kVar.f5344b.f4815g.get(i))) != null) {
                                    a.f4930e.beginTransaction();
                                    try {
                                        a.f4930e.execSQL(WorkDatabase.m830o());
                                        a.f4930e.setTransactionSuccessful();
                                        a.f4930e.endTransaction();
                                        i++;
                                    } catch (Throwable th2) {
                                        a.f4930e.endTransaction();
                                        throw th2;
                                    }
                                } else {
                                    throw null;
                                }
                            }
                        }
                        hVar.f4836b = null;
                    } finally {
                        b.close();
                    }
                } else {
                    throw null;
                }
            }
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.f4942g = true;
            this.f4941f.mo6423a(m4226a(this.f4940e, sQLiteDatabase), i, i2);
        }
    }

    public C1679c(Context context, String str, C1671a aVar, boolean z) {
        this.f4933e = context;
        this.f4934f = str;
        this.f4935g = aVar;
        this.f4936h = z;
    }

    /* renamed from: a */
    public final C1680a mo6497a() {
        C1680a aVar;
        synchronized (this.f4937i) {
            if (this.f4938j == null) {
                C1676a[] aVarArr = new C1676a[1];
                if (this.f4934f == null || !this.f4936h) {
                    this.f4938j = new C1680a(this.f4933e, this.f4934f, aVarArr, this.f4935g);
                } else {
                    this.f4938j = new C1680a(this.f4933e, new File(this.f4933e.getNoBackupFilesDir(), this.f4934f).getAbsolutePath(), aVarArr, this.f4935g);
                }
                this.f4938j.setWriteAheadLoggingEnabled(this.f4939k);
            }
            aVar = this.f4938j;
        }
        return aVar;
    }

    public void close() {
        mo6497a().close();
    }

    public String getDatabaseName() {
        return this.f4934f;
    }

    public C1669b getWritableDatabase() {
        return mo6497a().mo6498a();
    }

    public void setWriteAheadLoggingEnabled(boolean z) {
        synchronized (this.f4937i) {
            if (this.f4938j != null) {
                this.f4938j.setWriteAheadLoggingEnabled(z);
            }
            this.f4939k = z;
        }
    }
}
