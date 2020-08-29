package p124p.p182q;

import p124p.p188t.p189a.C1669b;
import p124p.p188t.p189a.C1670c.C1671a;
import p124p.p188t.p189a.p190f.C1676a;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: p.q.h */
public class C1643h extends C1671a {

    /* renamed from: b */
    public C1618a f4836b;

    /* renamed from: c */
    public final C1644a f4837c;

    /* renamed from: d */
    public final String f4838d;

    /* renamed from: e */
    public final String f4839e;

    /* renamed from: p.q.h$a */
    public static abstract class C1644a {

        /* renamed from: a */
        public final int f4840a;

        public C1644a(int i) {
            this.f4840a = i;
        }

        /* renamed from: a */
        public abstract void mo6424a(C1669b bVar);

        /* renamed from: b */
        public abstract C1645b mo6425b(C1669b bVar);
    }

    /* renamed from: p.q.h$b */
    public static class C1645b {

        /* renamed from: a */
        public final boolean f4841a;

        /* renamed from: b */
        public final String f4842b;

        public C1645b(boolean z, String str) {
            this.f4841a = z;
            this.f4842b = str;
        }
    }

    public C1643h(C1618a aVar, C1644a aVar2, String str, String str2) {
        super(aVar2.f4840a);
        this.f4836b = aVar;
        this.f4837c = aVar2;
        this.f4838d = str;
        this.f4839e = str2;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0076, code lost:
        r0 = r5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x010a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6423a(p124p.p188t.p189a.C1669b r12, int r13, int r14) {
        /*
            r11 = this;
            p.q.a r0 = r11.f4836b
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x0107
            p.q.g$d r0 = r0.f4756d
            if (r0 == 0) goto L_0x0106
            if (r13 != r14) goto L_0x0013
            java.util.List r0 = java.util.Collections.emptyList()
            goto L_0x0077
        L_0x0013:
            if (r14 <= r13) goto L_0x0017
            r4 = r1
            goto L_0x0018
        L_0x0017:
            r4 = r2
        L_0x0018:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = r13
        L_0x001e:
            if (r4 == 0) goto L_0x0023
            if (r6 >= r14) goto L_0x0076
            goto L_0x0025
        L_0x0023:
            if (r6 <= r14) goto L_0x0076
        L_0x0025:
            java.util.HashMap<java.lang.Integer, java.util.TreeMap<java.lang.Integer, p.q.l.a>> r7 = r0.f4835a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            java.lang.Object r7 = r7.get(r8)
            java.util.TreeMap r7 = (java.util.TreeMap) r7
            if (r7 != 0) goto L_0x0034
            goto L_0x0074
        L_0x0034:
            if (r4 == 0) goto L_0x003b
            java.util.NavigableSet r8 = r7.descendingKeySet()
            goto L_0x003f
        L_0x003b:
            java.util.Set r8 = r7.keySet()
        L_0x003f:
            java.util.Iterator r8 = r8.iterator()
        L_0x0043:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0071
            java.lang.Object r9 = r8.next()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            if (r4 == 0) goto L_0x005a
            if (r9 > r14) goto L_0x0060
            if (r9 <= r6) goto L_0x0060
            goto L_0x005e
        L_0x005a:
            if (r9 < r14) goto L_0x0060
            if (r9 >= r6) goto L_0x0060
        L_0x005e:
            r10 = r1
            goto L_0x0061
        L_0x0060:
            r10 = r2
        L_0x0061:
            if (r10 == 0) goto L_0x0043
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
            java.lang.Object r6 = r7.get(r6)
            r5.add(r6)
            r7 = r1
            r6 = r9
            goto L_0x0072
        L_0x0071:
            r7 = r2
        L_0x0072:
            if (r7 != 0) goto L_0x001e
        L_0x0074:
            r0 = r3
            goto L_0x0077
        L_0x0076:
            r0 = r5
        L_0x0077:
            if (r0 == 0) goto L_0x0107
            p.q.h$a r4 = r11.f4837c
            p.y.x.k r4 = (p124p.p199y.p200x.C1841k) r4
            if (r4 == 0) goto L_0x0105
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r5 = r12
            p.t.a.f.a r5 = (p124p.p188t.p189a.p190f.C1676a) r5
            java.lang.String r6 = "SELECT name FROM sqlite_master WHERE type = 'trigger'"
            android.database.Cursor r6 = r5.mo6493b(r6)
        L_0x008d:
            boolean r7 = r6.moveToNext()     // Catch:{ all -> 0x0100 }
            if (r7 == 0) goto L_0x009b
            java.lang.String r7 = r6.getString(r2)     // Catch:{ all -> 0x0100 }
            r4.add(r7)     // Catch:{ all -> 0x0100 }
            goto L_0x008d
        L_0x009b:
            r6.close()
            java.util.Iterator r4 = r4.iterator()
        L_0x00a2:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x00c2
            java.lang.Object r6 = r4.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = "room_fts_content_sync_"
            boolean r7 = r6.startsWith(r7)
            if (r7 == 0) goto L_0x00a2
            java.lang.String r7 = "DROP TRIGGER IF EXISTS "
            java.lang.String r6 = p213q.p214a.p215a.p216a.C1965a.m4751a(r7, r6)
            android.database.sqlite.SQLiteDatabase r7 = r5.f4930e
            r7.execSQL(r6)
            goto L_0x00a2
        L_0x00c2:
            java.util.Iterator r0 = r0.iterator()
        L_0x00c6:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x00d6
            java.lang.Object r4 = r0.next()
            p.q.l.a r4 = (p124p.p182q.p183l.C1649a) r4
            r4.mo6444a(r12)
            goto L_0x00c6
        L_0x00d6:
            p.q.h$a r0 = r11.f4837c
            p.q.h$b r0 = r0.mo6425b(r12)
            boolean r4 = r0.f4841a
            if (r4 == 0) goto L_0x00eb
            p.q.h$a r0 = r11.f4837c
            p.y.x.k r0 = (p124p.p199y.p200x.C1841k) r0
            if (r0 == 0) goto L_0x00ea
            r11.mo6422a(r12)
            goto L_0x0108
        L_0x00ea:
            throw r3
        L_0x00eb:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "Migration didn't properly handle: "
            java.lang.StringBuilder r13 = p213q.p214a.p215a.p216a.C1965a.m4756a(r13)
            java.lang.String r14 = r0.f4842b
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L_0x0100:
            r12 = move-exception
            r6.close()
            throw r12
        L_0x0105:
            throw r3
        L_0x0106:
            throw r3
        L_0x0107:
            r1 = r2
        L_0x0108:
            if (r1 != 0) goto L_0x019b
            p.q.a r0 = r11.f4836b
            if (r0 == 0) goto L_0x0177
            boolean r0 = r0.mo6381a(r13, r14)
            if (r0 != 0) goto L_0x0177
            p.q.h$a r13 = r11.f4837c
            p.y.x.k r13 = (p124p.p199y.p200x.C1841k) r13
            if (r13 == 0) goto L_0x0176
            r14 = r12
            p.t.a.f.a r14 = (p124p.p188t.p189a.p190f.C1676a) r14
            android.database.sqlite.SQLiteDatabase r0 = r14.f4930e
            java.lang.String r1 = "DROP TABLE IF EXISTS `Dependency`"
            r0.execSQL(r1)
            android.database.sqlite.SQLiteDatabase r0 = r14.f4930e
            java.lang.String r1 = "DROP TABLE IF EXISTS `WorkSpec`"
            r0.execSQL(r1)
            android.database.sqlite.SQLiteDatabase r0 = r14.f4930e
            java.lang.String r1 = "DROP TABLE IF EXISTS `WorkTag`"
            r0.execSQL(r1)
            android.database.sqlite.SQLiteDatabase r0 = r14.f4930e
            java.lang.String r1 = "DROP TABLE IF EXISTS `SystemIdInfo`"
            r0.execSQL(r1)
            android.database.sqlite.SQLiteDatabase r0 = r14.f4930e
            java.lang.String r1 = "DROP TABLE IF EXISTS `WorkName`"
            r0.execSQL(r1)
            android.database.sqlite.SQLiteDatabase r0 = r14.f4930e
            java.lang.String r1 = "DROP TABLE IF EXISTS `WorkProgress`"
            r0.execSQL(r1)
            android.database.sqlite.SQLiteDatabase r14 = r14.f4930e
            java.lang.String r0 = "DROP TABLE IF EXISTS `Preference`"
            r14.execSQL(r0)
            androidx.work.impl.WorkDatabase_Impl r14 = r13.f5344b
            java.util.List r14 = r14.f4815g
            if (r14 == 0) goto L_0x0170
            androidx.work.impl.WorkDatabase_Impl r14 = r13.f5344b
            java.util.List<p.q.g$b> r14 = r14.f4815g
            int r14 = r14.size()
        L_0x015e:
            if (r2 >= r14) goto L_0x0170
            androidx.work.impl.WorkDatabase_Impl r0 = r13.f5344b
            java.util.List<p.q.g$b> r0 = r0.f4815g
            java.lang.Object r0 = r0.get(r2)
            p.q.g$b r0 = (p124p.p182q.C1638g.C1640b) r0
            if (r0 == 0) goto L_0x016f
            int r2 = r2 + 1
            goto L_0x015e
        L_0x016f:
            throw r3
        L_0x0170:
            p.q.h$a r13 = r11.f4837c
            r13.mo6424a(r12)
            goto L_0x019b
        L_0x0176:
            throw r3
        L_0x0177:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "A migration from "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r13 = " to "
            r0.append(r13)
            r0.append(r14)
            java.lang.String r13 = " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r12.<init>(r13)
            throw r12
        L_0x019b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p182q.C1643h.mo6423a(p.t.a.b, int, int):void");
    }

    /* renamed from: a */
    public final void mo6422a(C1669b bVar) {
        C1676a aVar = (C1676a) bVar;
        aVar.f4930e.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        aVar.f4930e.execSQL(C1965a.m4752a("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '", this.f4838d, "')"));
    }
}
