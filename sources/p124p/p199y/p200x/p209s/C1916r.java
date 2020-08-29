package p124p.p199y.p200x.p209s;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import p124p.p126b.p127k.C1061o;
import p124p.p182q.C1619b;
import p124p.p182q.C1638g;
import p124p.p182q.C1646i;
import p124p.p182q.C1648k;
import p124p.p182q.p184m.C1651b;
import p124p.p188t.p189a.p190f.C1684f;
import p124p.p199y.C1788c;
import p124p.p199y.C1792e;
import p124p.p199y.C1816t;
import p124p.p199y.p200x.p209s.C1913p.C1914a;

/* renamed from: p.y.x.s.r */
public final class C1916r implements C1915q {

    /* renamed from: a */
    public final C1638g f5546a;

    /* renamed from: b */
    public final C1619b<C1913p> f5547b;

    /* renamed from: c */
    public final C1648k f5548c;

    /* renamed from: d */
    public final C1648k f5549d;

    /* renamed from: e */
    public final C1648k f5550e;

    /* renamed from: f */
    public final C1648k f5551f;

    /* renamed from: g */
    public final C1648k f5552g;

    /* renamed from: h */
    public final C1648k f5553h;

    /* renamed from: i */
    public final C1648k f5554i;

    /* renamed from: p.y.x.s.r$a */
    public class C1917a extends C1619b<C1913p> {
        public C1917a(C1916r rVar, C1638g gVar) {
            super(gVar);
        }

        /* JADX WARNING: type inference failed for: r3v11 */
        /* JADX WARNING: type inference failed for: r3v12, types: [byte[]] */
        /* JADX WARNING: type inference failed for: r4v3, types: [java.io.ObjectOutputStream] */
        /* JADX WARNING: type inference failed for: r3v14, types: [byte[]] */
        /* JADX WARNING: type inference failed for: r3v17, types: [java.io.ObjectOutputStream] */
        /* JADX WARNING: type inference failed for: r4v4 */
        /* JADX WARNING: type inference failed for: r4v5, types: [java.io.ObjectOutputStream] */
        /* JADX WARNING: type inference failed for: r3v18 */
        /* JADX WARNING: type inference failed for: r3v27 */
        /* JADX WARNING: type inference failed for: r4v7 */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v11
          assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], ?[OBJECT, ARRAY], byte[]]
          uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], byte[], java.io.ObjectOutputStream, ?[OBJECT, ARRAY]]
          mth insns count: 209
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
        /* JADX WARNING: Removed duplicated region for block: B:62:0x01b1 A[SYNTHETIC, Splitter:B:62:0x01b1] */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x01c9  */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x01d1  */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x01dd A[SYNTHETIC, Splitter:B:76:0x01dd] */
        /* JADX WARNING: Unknown variable types count: 4 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo6383a(p124p.p188t.p189a.p190f.C1684f r17, java.lang.Object r18) {
            /*
                r16 = this;
                r1 = r17
                r0 = r18
                p.y.x.s.p r0 = (p124p.p199y.p200x.p209s.C1913p) r0
                java.lang.String r2 = r0.f5527a
                r3 = 1
                if (r2 != 0) goto L_0x0011
                android.database.sqlite.SQLiteProgram r2 = r1.f4945e
                r2.bindNull(r3)
                goto L_0x0016
            L_0x0011:
                android.database.sqlite.SQLiteProgram r4 = r1.f4945e
                r4.bindString(r3, r2)
            L_0x0016:
                p.y.t r2 = r0.f5528b
                int r2 = p124p.p126b.p127k.C1061o.m2443a(r2)
                long r4 = (long) r2
                android.database.sqlite.SQLiteProgram r2 = r1.f4945e
                r6 = 2
                r2.bindLong(r6, r4)
                java.lang.String r2 = r0.f5529c
                r4 = 3
                if (r2 != 0) goto L_0x002e
                android.database.sqlite.SQLiteProgram r2 = r1.f4945e
                r2.bindNull(r4)
                goto L_0x0033
            L_0x002e:
                android.database.sqlite.SQLiteProgram r5 = r1.f4945e
                r5.bindString(r4, r2)
            L_0x0033:
                java.lang.String r2 = r0.f5530d
                r5 = 4
                if (r2 != 0) goto L_0x003e
                android.database.sqlite.SQLiteProgram r2 = r1.f4945e
                r2.bindNull(r5)
                goto L_0x0043
            L_0x003e:
                android.database.sqlite.SQLiteProgram r7 = r1.f4945e
                r7.bindString(r5, r2)
            L_0x0043:
                p.y.e r2 = r0.f5531e
                byte[] r2 = p124p.p199y.C1792e.m4447a(r2)
                r7 = 5
                if (r2 != 0) goto L_0x0052
                android.database.sqlite.SQLiteProgram r2 = r1.f4945e
                r2.bindNull(r7)
                goto L_0x0057
            L_0x0052:
                android.database.sqlite.SQLiteProgram r8 = r1.f4945e
                r8.bindBlob(r7, r2)
            L_0x0057:
                p.y.e r2 = r0.f5532f
                byte[] r2 = p124p.p199y.C1792e.m4447a(r2)
                r7 = 6
                if (r2 != 0) goto L_0x0066
                android.database.sqlite.SQLiteProgram r2 = r1.f4945e
                r2.bindNull(r7)
                goto L_0x006b
            L_0x0066:
                android.database.sqlite.SQLiteProgram r8 = r1.f4945e
                r8.bindBlob(r7, r2)
            L_0x006b:
                r2 = 7
                long r7 = r0.f5533g
                android.database.sqlite.SQLiteProgram r9 = r1.f4945e
                r9.bindLong(r2, r7)
                r2 = 8
                long r7 = r0.f5534h
                android.database.sqlite.SQLiteProgram r9 = r1.f4945e
                r9.bindLong(r2, r7)
                r2 = 9
                long r7 = r0.f5535i
                android.database.sqlite.SQLiteProgram r9 = r1.f4945e
                r9.bindLong(r2, r7)
                r2 = 10
                int r7 = r0.f5537k
                long r7 = (long) r7
                android.database.sqlite.SQLiteProgram r9 = r1.f4945e
                r9.bindLong(r2, r7)
                p.y.a r2 = r0.f5538l
                int r7 = r2.ordinal()
                java.lang.String r8 = " to int"
                java.lang.String r9 = "Could not convert "
                if (r7 == 0) goto L_0x00b7
                if (r7 != r3) goto L_0x009f
                r2 = r3
                goto L_0x00b8
            L_0x009f:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r9)
                r1.append(r2)
                r1.append(r8)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x00b7:
                r2 = 0
            L_0x00b8:
                r7 = 11
                long r11 = (long) r2
                android.database.sqlite.SQLiteProgram r2 = r1.f4945e
                r2.bindLong(r7, r11)
                r2 = 12
                long r11 = r0.f5539m
                android.database.sqlite.SQLiteProgram r7 = r1.f4945e
                r7.bindLong(r2, r11)
                r2 = 13
                long r11 = r0.f5540n
                android.database.sqlite.SQLiteProgram r7 = r1.f4945e
                r7.bindLong(r2, r11)
                r2 = 14
                long r11 = r0.f5541o
                android.database.sqlite.SQLiteProgram r7 = r1.f4945e
                r7.bindLong(r2, r11)
                r2 = 15
                long r11 = r0.f5542p
                android.database.sqlite.SQLiteProgram r7 = r1.f4945e
                r7.bindLong(r2, r11)
                boolean r2 = r0.f5543q
                r7 = 16
                long r11 = (long) r2
                android.database.sqlite.SQLiteProgram r2 = r1.f4945e
                r2.bindLong(r7, r11)
                p.y.c r0 = r0.f5536j
                r2 = 22
                r7 = 21
                r11 = 20
                r12 = 19
                r13 = 18
                r14 = 17
                if (r0 == 0) goto L_0x01f0
                p.y.m r10 = r0.f5244a
                int r15 = r10.ordinal()
                if (r15 == 0) goto L_0x012c
                if (r15 == r3) goto L_0x012a
                if (r15 == r6) goto L_0x0129
                if (r15 == r4) goto L_0x0127
                if (r15 != r5) goto L_0x010f
                goto L_0x012d
            L_0x010f:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r9)
                r1.append(r10)
                r1.append(r8)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0127:
                r3 = r4
                goto L_0x012a
            L_0x0129:
                r3 = r6
            L_0x012a:
                r5 = r3
                goto L_0x012d
            L_0x012c:
                r5 = 0
            L_0x012d:
                long r3 = (long) r5
                android.database.sqlite.SQLiteProgram r5 = r1.f4945e
                r5.bindLong(r14, r3)
                boolean r3 = r0.f5245b
                long r3 = (long) r3
                android.database.sqlite.SQLiteProgram r5 = r1.f4945e
                r5.bindLong(r13, r3)
                boolean r3 = r0.f5246c
                long r3 = (long) r3
                android.database.sqlite.SQLiteProgram r5 = r1.f4945e
                r5.bindLong(r12, r3)
                boolean r3 = r0.f5247d
                long r3 = (long) r3
                android.database.sqlite.SQLiteProgram r5 = r1.f4945e
                r5.bindLong(r11, r3)
                boolean r3 = r0.f5248e
                long r3 = (long) r3
                android.database.sqlite.SQLiteProgram r5 = r1.f4945e
                r5.bindLong(r7, r3)
                long r3 = r0.f5249f
                android.database.sqlite.SQLiteProgram r5 = r1.f4945e
                r5.bindLong(r2, r3)
                long r2 = r0.f5250g
                android.database.sqlite.SQLiteProgram r4 = r1.f4945e
                r5 = 23
                r4.bindLong(r5, r2)
                p.y.d r0 = r0.f5251h
                int r2 = r0.mo6769a()
                r3 = 0
                if (r2 != 0) goto L_0x016d
                goto L_0x01c7
            L_0x016d:
                java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
                r2.<init>()
                java.io.ObjectOutputStream r4 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x01ab }
                r4.<init>(r2)     // Catch:{ IOException -> 0x01ab }
                int r3 = r0.mo6769a()     // Catch:{ IOException -> 0x01a6, all -> 0x01a3 }
                r4.writeInt(r3)     // Catch:{ IOException -> 0x01a6, all -> 0x01a3 }
                java.util.Set<p.y.d$a> r0 = r0.f5260a     // Catch:{ IOException -> 0x01a6, all -> 0x01a3 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ IOException -> 0x01a6, all -> 0x01a3 }
            L_0x0184:
                boolean r3 = r0.hasNext()     // Catch:{ IOException -> 0x01a6, all -> 0x01a3 }
                if (r3 == 0) goto L_0x019f
                java.lang.Object r3 = r0.next()     // Catch:{ IOException -> 0x01a6, all -> 0x01a3 }
                p.y.d$a r3 = (p124p.p199y.C1790d.C1791a) r3     // Catch:{ IOException -> 0x01a6, all -> 0x01a3 }
                android.net.Uri r5 = r3.f5261a     // Catch:{ IOException -> 0x01a6, all -> 0x01a3 }
                java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x01a6, all -> 0x01a3 }
                r4.writeUTF(r5)     // Catch:{ IOException -> 0x01a6, all -> 0x01a3 }
                boolean r3 = r3.f5262b     // Catch:{ IOException -> 0x01a6, all -> 0x01a3 }
                r4.writeBoolean(r3)     // Catch:{ IOException -> 0x01a6, all -> 0x01a3 }
                goto L_0x0184
            L_0x019f:
                r4.close()     // Catch:{ IOException -> 0x01b5 }
                goto L_0x01ba
            L_0x01a3:
                r0 = move-exception
                r1 = r0
                goto L_0x01db
            L_0x01a6:
                r0 = move-exception
                r3 = r4
                goto L_0x01ac
            L_0x01a9:
                r0 = move-exception
                goto L_0x01d9
            L_0x01ab:
                r0 = move-exception
            L_0x01ac:
                r0.printStackTrace()     // Catch:{ all -> 0x01a9 }
                if (r3 == 0) goto L_0x01ba
                r3.close()     // Catch:{ IOException -> 0x01b5 }
                goto L_0x01ba
            L_0x01b5:
                r0 = move-exception
                r3 = r0
                r3.printStackTrace()
            L_0x01ba:
                r2.close()     // Catch:{ IOException -> 0x01be }
                goto L_0x01c3
            L_0x01be:
                r0 = move-exception
                r3 = r0
                r3.printStackTrace()
            L_0x01c3:
                byte[] r3 = r2.toByteArray()
            L_0x01c7:
                if (r3 != 0) goto L_0x01d1
                android.database.sqlite.SQLiteProgram r0 = r1.f4945e
                r2 = 24
                r0.bindNull(r2)
                goto L_0x021c
            L_0x01d1:
                r2 = 24
                android.database.sqlite.SQLiteProgram r0 = r1.f4945e
                r0.bindBlob(r2, r3)
                goto L_0x021c
            L_0x01d9:
                r1 = r0
                r4 = r3
            L_0x01db:
                if (r4 == 0) goto L_0x01e6
                r4.close()     // Catch:{ IOException -> 0x01e1 }
                goto L_0x01e6
            L_0x01e1:
                r0 = move-exception
                r3 = r0
                r3.printStackTrace()
            L_0x01e6:
                r2.close()     // Catch:{ IOException -> 0x01ea }
                goto L_0x01ef
            L_0x01ea:
                r0 = move-exception
                r2 = r0
                r2.printStackTrace()
            L_0x01ef:
                throw r1
            L_0x01f0:
                android.database.sqlite.SQLiteProgram r0 = r1.f4945e
                r0.bindNull(r14)
                android.database.sqlite.SQLiteProgram r0 = r1.f4945e
                r0.bindNull(r13)
                android.database.sqlite.SQLiteProgram r0 = r1.f4945e
                r0.bindNull(r12)
                android.database.sqlite.SQLiteProgram r0 = r1.f4945e
                r0.bindNull(r11)
                android.database.sqlite.SQLiteProgram r0 = r1.f4945e
                r0.bindNull(r7)
                android.database.sqlite.SQLiteProgram r0 = r1.f4945e
                r0.bindNull(r2)
                android.database.sqlite.SQLiteProgram r0 = r1.f4945e
                r2 = 23
                r0.bindNull(r2)
                android.database.sqlite.SQLiteProgram r0 = r1.f4945e
                r1 = 24
                r0.bindNull(r1)
            L_0x021c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p124p.p199y.p200x.p209s.C1916r.C1917a.mo6383a(p.t.a.f.f, java.lang.Object):void");
        }

        /* renamed from: b */
        public String mo6443b() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    /* renamed from: p.y.x.s.r$b */
    public class C1918b extends C1648k {
        public C1918b(C1916r rVar, C1638g gVar) {
            super(gVar);
        }

        /* renamed from: b */
        public String mo6443b() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* renamed from: p.y.x.s.r$c */
    public class C1919c extends C1648k {
        public C1919c(C1916r rVar, C1638g gVar) {
            super(gVar);
        }

        /* renamed from: b */
        public String mo6443b() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* renamed from: p.y.x.s.r$d */
    public class C1920d extends C1648k {
        public C1920d(C1916r rVar, C1638g gVar) {
            super(gVar);
        }

        /* renamed from: b */
        public String mo6443b() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    /* renamed from: p.y.x.s.r$e */
    public class C1921e extends C1648k {
        public C1921e(C1916r rVar, C1638g gVar) {
            super(gVar);
        }

        /* renamed from: b */
        public String mo6443b() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* renamed from: p.y.x.s.r$f */
    public class C1922f extends C1648k {
        public C1922f(C1916r rVar, C1638g gVar) {
            super(gVar);
        }

        /* renamed from: b */
        public String mo6443b() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* renamed from: p.y.x.s.r$g */
    public class C1923g extends C1648k {
        public C1923g(C1916r rVar, C1638g gVar) {
            super(gVar);
        }

        /* renamed from: b */
        public String mo6443b() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* renamed from: p.y.x.s.r$h */
    public class C1924h extends C1648k {
        public C1924h(C1916r rVar, C1638g gVar) {
            super(gVar);
        }

        /* renamed from: b */
        public String mo6443b() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* renamed from: p.y.x.s.r$i */
    public class C1925i extends C1648k {
        public C1925i(C1916r rVar, C1638g gVar) {
            super(gVar);
        }

        /* renamed from: b */
        public String mo6443b() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    public C1916r(C1638g gVar) {
        this.f5546a = gVar;
        this.f5547b = new C1917a(this, gVar);
        this.f5548c = new C1918b(this, gVar);
        this.f5549d = new C1919c(this, gVar);
        this.f5550e = new C1920d(this, gVar);
        this.f5551f = new C1921e(this, gVar);
        this.f5552g = new C1922f(this, gVar);
        this.f5553h = new C1923g(this, gVar);
        this.f5554i = new C1924h(this, gVar);
        new C1925i(this, gVar);
    }

    /* renamed from: a */
    public void mo6905a(String str) {
        this.f5546a.mo6415b();
        C1684f a = this.f5548c.mo6441a();
        if (str == null) {
            a.f4945e.bindNull(1);
        } else {
            a.f4945e.bindString(1, str);
        }
        this.f5546a.mo6416c();
        try {
            a.mo6508a();
            this.f5546a.mo6420g();
            this.f5546a.mo6417d();
            C1648k kVar = this.f5548c;
            if (a == kVar.f4861c) {
                kVar.f4859a.set(false);
            }
        } catch (Throwable th) {
            this.f5546a.mo6417d();
            this.f5548c.mo6442a(a);
            throw th;
        }
    }

    /* renamed from: b */
    public List<String> mo6907b() {
        C1646i a = C1646i.m4184a("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
        this.f5546a.mo6415b();
        Cursor a2 = C1651b.m4197a(this.f5546a, a, false, null);
        try {
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                arrayList.add(a2.getString(0));
            }
            return arrayList;
        } finally {
            a2.close();
            a.mo6434f();
        }
    }

    /* renamed from: b */
    public C1816t mo6908b(String str) {
        C1646i a = C1646i.m4184a("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        this.f5546a.mo6415b();
        C1816t tVar = null;
        Cursor a2 = C1651b.m4197a(this.f5546a, a, false, null);
        try {
            if (a2.moveToFirst()) {
                tVar = C1061o.m2555e(a2.getInt(0));
            }
            return tVar;
        } finally {
            a2.close();
            a.mo6434f();
        }
    }

    /* renamed from: b */
    public void mo6909b(String str, long j) {
        this.f5546a.mo6415b();
        C1684f a = this.f5550e.mo6441a();
        a.f4945e.bindLong(1, j);
        if (str == null) {
            a.f4945e.bindNull(2);
        } else {
            a.f4945e.bindString(2, str);
        }
        this.f5546a.mo6416c();
        try {
            a.mo6508a();
            this.f5546a.mo6420g();
        } finally {
            this.f5546a.mo6417d();
            C1648k kVar = this.f5550e;
            if (a == kVar.f4861c) {
                kVar.f4859a.set(false);
            }
        }
    }

    /* renamed from: c */
    public List<C1913p> mo6910c() {
        C1646i iVar;
        C1646i a = C1646i.m4184a("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE state=1", 0);
        this.f5546a.mo6415b();
        Cursor a2 = C1651b.m4197a(this.f5546a, a, false, null);
        try {
            int a3 = C1061o.m2435a(a2, "required_network_type");
            int a4 = C1061o.m2435a(a2, "requires_charging");
            int a5 = C1061o.m2435a(a2, "requires_device_idle");
            int a6 = C1061o.m2435a(a2, "requires_battery_not_low");
            int a7 = C1061o.m2435a(a2, "requires_storage_not_low");
            int a8 = C1061o.m2435a(a2, "trigger_content_update_delay");
            int a9 = C1061o.m2435a(a2, "trigger_max_content_delay");
            int a10 = C1061o.m2435a(a2, "content_uri_triggers");
            int a11 = C1061o.m2435a(a2, "id");
            int a12 = C1061o.m2435a(a2, "state");
            int a13 = C1061o.m2435a(a2, "worker_class_name");
            int a14 = C1061o.m2435a(a2, "input_merger_class_name");
            int a15 = C1061o.m2435a(a2, "input");
            int a16 = C1061o.m2435a(a2, "output");
            iVar = a;
            try {
                int a17 = C1061o.m2435a(a2, "initial_delay");
                int a18 = C1061o.m2435a(a2, "interval_duration");
                int a19 = C1061o.m2435a(a2, "flex_duration");
                int a20 = C1061o.m2435a(a2, "run_attempt_count");
                int a21 = C1061o.m2435a(a2, "backoff_policy");
                int a22 = C1061o.m2435a(a2, "backoff_delay_duration");
                int a23 = C1061o.m2435a(a2, "period_start_time");
                int a24 = C1061o.m2435a(a2, "minimum_retention_duration");
                int a25 = C1061o.m2435a(a2, "schedule_requested_at");
                int a26 = C1061o.m2435a(a2, "run_in_foreground");
                int i = a16;
                ArrayList arrayList = new ArrayList(a2.getCount());
                while (a2.moveToNext()) {
                    String string = a2.getString(a11);
                    int i2 = a11;
                    String string2 = a2.getString(a13);
                    int i3 = a13;
                    C1788c cVar = new C1788c();
                    int i4 = a3;
                    cVar.f5244a = C1061o.m2549d(a2.getInt(a3));
                    cVar.f5245b = a2.getInt(a4) != 0;
                    cVar.f5246c = a2.getInt(a5) != 0;
                    cVar.f5247d = a2.getInt(a6) != 0;
                    cVar.f5248e = a2.getInt(a7) != 0;
                    int i5 = a4;
                    cVar.f5249f = a2.getLong(a8);
                    cVar.f5250g = a2.getLong(a9);
                    cVar.f5251h = C1061o.m2474a(a2.getBlob(a10));
                    C1913p pVar = new C1913p(string, string2);
                    pVar.f5528b = C1061o.m2555e(a2.getInt(a12));
                    pVar.f5530d = a2.getString(a14);
                    pVar.f5531e = C1792e.m4454b(a2.getBlob(a15));
                    int i6 = i;
                    pVar.f5532f = C1792e.m4454b(a2.getBlob(i6));
                    int i7 = a15;
                    i = i6;
                    int i8 = a17;
                    pVar.f5533g = a2.getLong(i8);
                    a17 = i8;
                    int i9 = a5;
                    int i10 = a18;
                    pVar.f5534h = a2.getLong(i10);
                    a18 = i10;
                    int i11 = i9;
                    int i12 = a19;
                    pVar.f5535i = a2.getLong(i12);
                    int i13 = a20;
                    pVar.f5537k = a2.getInt(i13);
                    int i14 = a21;
                    a20 = i13;
                    pVar.f5538l = C1061o.m2540c(a2.getInt(i14));
                    a19 = i12;
                    int i15 = i11;
                    int i16 = a22;
                    pVar.f5539m = a2.getLong(i16);
                    a22 = i16;
                    int i17 = i14;
                    int i18 = a23;
                    pVar.f5540n = a2.getLong(i18);
                    a23 = i18;
                    int i19 = i17;
                    int i20 = a24;
                    pVar.f5541o = a2.getLong(i20);
                    a24 = i20;
                    int i21 = i19;
                    int i22 = a25;
                    pVar.f5542p = a2.getLong(i22);
                    int i23 = a26;
                    pVar.f5543q = a2.getInt(i23) != 0;
                    pVar.f5536j = cVar;
                    arrayList.add(pVar);
                    a26 = i23;
                    a25 = i22;
                    a15 = i7;
                    a11 = i2;
                    a13 = i3;
                    a3 = i4;
                    a4 = i5;
                    int i24 = i15;
                    a21 = i21;
                    a5 = i24;
                }
                a2.close();
                iVar.mo6434f();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                a2.close();
                iVar.mo6434f();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            iVar = a;
            a2.close();
            iVar.mo6434f();
            throw th;
        }
    }

    /* renamed from: c */
    public List<String> mo6911c(String str) {
        C1646i a = C1646i.m4184a("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        this.f5546a.mo6415b();
        Cursor a2 = C1651b.m4197a(this.f5546a, a, false, null);
        try {
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                arrayList.add(a2.getString(0));
            }
            return arrayList;
        } finally {
            a2.close();
            a.mo6434f();
        }
    }

    /* renamed from: d */
    public List<C1913p> mo6912d() {
        C1646i iVar;
        C1646i a = C1646i.m4184a("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f5546a.mo6415b();
        Cursor a2 = C1651b.m4197a(this.f5546a, a, false, null);
        try {
            int a3 = C1061o.m2435a(a2, "required_network_type");
            int a4 = C1061o.m2435a(a2, "requires_charging");
            int a5 = C1061o.m2435a(a2, "requires_device_idle");
            int a6 = C1061o.m2435a(a2, "requires_battery_not_low");
            int a7 = C1061o.m2435a(a2, "requires_storage_not_low");
            int a8 = C1061o.m2435a(a2, "trigger_content_update_delay");
            int a9 = C1061o.m2435a(a2, "trigger_max_content_delay");
            int a10 = C1061o.m2435a(a2, "content_uri_triggers");
            int a11 = C1061o.m2435a(a2, "id");
            int a12 = C1061o.m2435a(a2, "state");
            int a13 = C1061o.m2435a(a2, "worker_class_name");
            int a14 = C1061o.m2435a(a2, "input_merger_class_name");
            int a15 = C1061o.m2435a(a2, "input");
            int a16 = C1061o.m2435a(a2, "output");
            iVar = a;
            try {
                int a17 = C1061o.m2435a(a2, "initial_delay");
                int a18 = C1061o.m2435a(a2, "interval_duration");
                int a19 = C1061o.m2435a(a2, "flex_duration");
                int a20 = C1061o.m2435a(a2, "run_attempt_count");
                int a21 = C1061o.m2435a(a2, "backoff_policy");
                int a22 = C1061o.m2435a(a2, "backoff_delay_duration");
                int a23 = C1061o.m2435a(a2, "period_start_time");
                int a24 = C1061o.m2435a(a2, "minimum_retention_duration");
                int a25 = C1061o.m2435a(a2, "schedule_requested_at");
                int a26 = C1061o.m2435a(a2, "run_in_foreground");
                int i = a16;
                ArrayList arrayList = new ArrayList(a2.getCount());
                while (a2.moveToNext()) {
                    String string = a2.getString(a11);
                    int i2 = a11;
                    String string2 = a2.getString(a13);
                    int i3 = a13;
                    C1788c cVar = new C1788c();
                    int i4 = a3;
                    cVar.f5244a = C1061o.m2549d(a2.getInt(a3));
                    cVar.f5245b = a2.getInt(a4) != 0;
                    cVar.f5246c = a2.getInt(a5) != 0;
                    cVar.f5247d = a2.getInt(a6) != 0;
                    cVar.f5248e = a2.getInt(a7) != 0;
                    int i5 = a4;
                    cVar.f5249f = a2.getLong(a8);
                    cVar.f5250g = a2.getLong(a9);
                    cVar.f5251h = C1061o.m2474a(a2.getBlob(a10));
                    C1913p pVar = new C1913p(string, string2);
                    pVar.f5528b = C1061o.m2555e(a2.getInt(a12));
                    pVar.f5530d = a2.getString(a14);
                    pVar.f5531e = C1792e.m4454b(a2.getBlob(a15));
                    int i6 = i;
                    pVar.f5532f = C1792e.m4454b(a2.getBlob(i6));
                    int i7 = a15;
                    i = i6;
                    int i8 = a17;
                    pVar.f5533g = a2.getLong(i8);
                    a17 = i8;
                    int i9 = a5;
                    int i10 = a18;
                    pVar.f5534h = a2.getLong(i10);
                    a18 = i10;
                    int i11 = i9;
                    int i12 = a19;
                    pVar.f5535i = a2.getLong(i12);
                    int i13 = a20;
                    pVar.f5537k = a2.getInt(i13);
                    int i14 = a21;
                    a20 = i13;
                    pVar.f5538l = C1061o.m2540c(a2.getInt(i14));
                    a19 = i12;
                    int i15 = i11;
                    int i16 = a22;
                    pVar.f5539m = a2.getLong(i16);
                    a22 = i16;
                    int i17 = i14;
                    int i18 = a23;
                    pVar.f5540n = a2.getLong(i18);
                    a23 = i18;
                    int i19 = i17;
                    int i20 = a24;
                    pVar.f5541o = a2.getLong(i20);
                    a24 = i20;
                    int i21 = i19;
                    int i22 = a25;
                    pVar.f5542p = a2.getLong(i22);
                    int i23 = a26;
                    pVar.f5543q = a2.getInt(i23) != 0;
                    pVar.f5536j = cVar;
                    arrayList.add(pVar);
                    a26 = i23;
                    a25 = i22;
                    a15 = i7;
                    a11 = i2;
                    a13 = i3;
                    a3 = i4;
                    a4 = i5;
                    int i24 = i15;
                    a21 = i21;
                    a5 = i24;
                }
                a2.close();
                iVar.mo6434f();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                a2.close();
                iVar.mo6434f();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            iVar = a;
            a2.close();
            iVar.mo6434f();
            throw th;
        }
    }

    /* renamed from: d */
    public List<String> mo6913d(String str) {
        C1646i a = C1646i.m4184a("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        this.f5546a.mo6415b();
        Cursor a2 = C1651b.m4197a(this.f5546a, a, false, null);
        try {
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                arrayList.add(a2.getString(0));
            }
            return arrayList;
        } finally {
            a2.close();
            a.mo6434f();
        }
    }

    /* renamed from: e */
    public C1913p mo6914e(String str) {
        C1646i iVar;
        C1913p pVar;
        String str2 = str;
        C1646i a = C1646i.m4184a("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE id=?", 1);
        if (str2 == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str2);
        }
        this.f5546a.mo6415b();
        Cursor a2 = C1651b.m4197a(this.f5546a, a, false, null);
        try {
            int a3 = C1061o.m2435a(a2, "required_network_type");
            int a4 = C1061o.m2435a(a2, "requires_charging");
            int a5 = C1061o.m2435a(a2, "requires_device_idle");
            int a6 = C1061o.m2435a(a2, "requires_battery_not_low");
            int a7 = C1061o.m2435a(a2, "requires_storage_not_low");
            int a8 = C1061o.m2435a(a2, "trigger_content_update_delay");
            int a9 = C1061o.m2435a(a2, "trigger_max_content_delay");
            int a10 = C1061o.m2435a(a2, "content_uri_triggers");
            int a11 = C1061o.m2435a(a2, "id");
            int a12 = C1061o.m2435a(a2, "state");
            int a13 = C1061o.m2435a(a2, "worker_class_name");
            int a14 = C1061o.m2435a(a2, "input_merger_class_name");
            int a15 = C1061o.m2435a(a2, "input");
            int a16 = C1061o.m2435a(a2, "output");
            iVar = a;
            try {
                int a17 = C1061o.m2435a(a2, "initial_delay");
                int a18 = C1061o.m2435a(a2, "interval_duration");
                int a19 = C1061o.m2435a(a2, "flex_duration");
                int a20 = C1061o.m2435a(a2, "run_attempt_count");
                int a21 = C1061o.m2435a(a2, "backoff_policy");
                int a22 = C1061o.m2435a(a2, "backoff_delay_duration");
                int a23 = C1061o.m2435a(a2, "period_start_time");
                int a24 = C1061o.m2435a(a2, "minimum_retention_duration");
                int a25 = C1061o.m2435a(a2, "schedule_requested_at");
                int a26 = C1061o.m2435a(a2, "run_in_foreground");
                if (a2.moveToFirst()) {
                    String string = a2.getString(a11);
                    String string2 = a2.getString(a13);
                    int i = a26;
                    C1788c cVar = new C1788c();
                    cVar.f5244a = C1061o.m2549d(a2.getInt(a3));
                    cVar.f5245b = a2.getInt(a4) != 0;
                    cVar.f5246c = a2.getInt(a5) != 0;
                    cVar.f5247d = a2.getInt(a6) != 0;
                    cVar.f5248e = a2.getInt(a7) != 0;
                    cVar.f5249f = a2.getLong(a8);
                    cVar.f5250g = a2.getLong(a9);
                    cVar.f5251h = C1061o.m2474a(a2.getBlob(a10));
                    C1913p pVar2 = new C1913p(string, string2);
                    pVar2.f5528b = C1061o.m2555e(a2.getInt(a12));
                    pVar2.f5530d = a2.getString(a14);
                    pVar2.f5531e = C1792e.m4454b(a2.getBlob(a15));
                    pVar2.f5532f = C1792e.m4454b(a2.getBlob(a16));
                    pVar2.f5533g = a2.getLong(a17);
                    pVar2.f5534h = a2.getLong(a18);
                    pVar2.f5535i = a2.getLong(a19);
                    pVar2.f5537k = a2.getInt(a20);
                    pVar2.f5538l = C1061o.m2540c(a2.getInt(a21));
                    pVar2.f5539m = a2.getLong(a22);
                    pVar2.f5540n = a2.getLong(a23);
                    pVar2.f5541o = a2.getLong(a24);
                    pVar2.f5542p = a2.getLong(a25);
                    pVar2.f5543q = a2.getInt(i) != 0;
                    pVar2.f5536j = cVar;
                    pVar = pVar2;
                } else {
                    pVar = null;
                }
                a2.close();
                iVar.mo6434f();
                return pVar;
            } catch (Throwable th) {
                th = th;
                a2.close();
                iVar.mo6434f();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            iVar = a;
            a2.close();
            iVar.mo6434f();
            throw th;
        }
    }

    /* renamed from: f */
    public List<C1914a> mo6915f(String str) {
        C1646i a = C1646i.m4184a("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        this.f5546a.mo6415b();
        Cursor a2 = C1651b.m4197a(this.f5546a, a, false, null);
        try {
            int a3 = C1061o.m2435a(a2, "id");
            int a4 = C1061o.m2435a(a2, "state");
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                C1914a aVar = new C1914a();
                aVar.f5544a = a2.getString(a3);
                aVar.f5545b = C1061o.m2555e(a2.getInt(a4));
                arrayList.add(aVar);
            }
            return arrayList;
        } finally {
            a2.close();
            a.mo6434f();
        }
    }

    /* renamed from: g */
    public int mo6916g(String str) {
        this.f5546a.mo6415b();
        C1684f a = this.f5551f.mo6441a();
        if (str == null) {
            a.f4945e.bindNull(1);
        } else {
            a.f4945e.bindString(1, str);
        }
        this.f5546a.mo6416c();
        try {
            int a2 = a.mo6508a();
            this.f5546a.mo6420g();
            this.f5546a.mo6417d();
            C1648k kVar = this.f5551f;
            if (a == kVar.f4861c) {
                kVar.f4859a.set(false);
            }
            return a2;
        } catch (Throwable th) {
            this.f5546a.mo6417d();
            this.f5551f.mo6442a(a);
            throw th;
        }
    }

    /* renamed from: h */
    public int mo6917h(String str) {
        this.f5546a.mo6415b();
        C1684f a = this.f5552g.mo6441a();
        if (str == null) {
            a.f4945e.bindNull(1);
        } else {
            a.f4945e.bindString(1, str);
        }
        this.f5546a.mo6416c();
        try {
            int a2 = a.mo6508a();
            this.f5546a.mo6420g();
            this.f5546a.mo6417d();
            C1648k kVar = this.f5552g;
            if (a == kVar.f4861c) {
                kVar.f4859a.set(false);
            }
            return a2;
        } catch (Throwable th) {
            this.f5546a.mo6417d();
            this.f5552g.mo6442a(a);
            throw th;
        }
    }

    /* renamed from: a */
    public List<C1913p> mo6903a() {
        C1646i iVar;
        C1646i a = C1646i.m4184a("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE state=0 ORDER BY period_start_time", 0);
        this.f5546a.mo6415b();
        Cursor a2 = C1651b.m4197a(this.f5546a, a, false, null);
        try {
            int a3 = C1061o.m2435a(a2, "required_network_type");
            int a4 = C1061o.m2435a(a2, "requires_charging");
            int a5 = C1061o.m2435a(a2, "requires_device_idle");
            int a6 = C1061o.m2435a(a2, "requires_battery_not_low");
            int a7 = C1061o.m2435a(a2, "requires_storage_not_low");
            int a8 = C1061o.m2435a(a2, "trigger_content_update_delay");
            int a9 = C1061o.m2435a(a2, "trigger_max_content_delay");
            int a10 = C1061o.m2435a(a2, "content_uri_triggers");
            int a11 = C1061o.m2435a(a2, "id");
            int a12 = C1061o.m2435a(a2, "state");
            int a13 = C1061o.m2435a(a2, "worker_class_name");
            int a14 = C1061o.m2435a(a2, "input_merger_class_name");
            int a15 = C1061o.m2435a(a2, "input");
            int a16 = C1061o.m2435a(a2, "output");
            iVar = a;
            try {
                int a17 = C1061o.m2435a(a2, "initial_delay");
                int a18 = C1061o.m2435a(a2, "interval_duration");
                int a19 = C1061o.m2435a(a2, "flex_duration");
                int a20 = C1061o.m2435a(a2, "run_attempt_count");
                int a21 = C1061o.m2435a(a2, "backoff_policy");
                int a22 = C1061o.m2435a(a2, "backoff_delay_duration");
                int a23 = C1061o.m2435a(a2, "period_start_time");
                int a24 = C1061o.m2435a(a2, "minimum_retention_duration");
                int a25 = C1061o.m2435a(a2, "schedule_requested_at");
                int a26 = C1061o.m2435a(a2, "run_in_foreground");
                int i = a16;
                ArrayList arrayList = new ArrayList(a2.getCount());
                while (a2.moveToNext()) {
                    String string = a2.getString(a11);
                    int i2 = a11;
                    String string2 = a2.getString(a13);
                    int i3 = a13;
                    C1788c cVar = new C1788c();
                    int i4 = a3;
                    cVar.f5244a = C1061o.m2549d(a2.getInt(a3));
                    cVar.f5245b = a2.getInt(a4) != 0;
                    cVar.f5246c = a2.getInt(a5) != 0;
                    cVar.f5247d = a2.getInt(a6) != 0;
                    cVar.f5248e = a2.getInt(a7) != 0;
                    int i5 = a4;
                    cVar.f5249f = a2.getLong(a8);
                    cVar.f5250g = a2.getLong(a9);
                    cVar.f5251h = C1061o.m2474a(a2.getBlob(a10));
                    C1913p pVar = new C1913p(string, string2);
                    pVar.f5528b = C1061o.m2555e(a2.getInt(a12));
                    pVar.f5530d = a2.getString(a14);
                    pVar.f5531e = C1792e.m4454b(a2.getBlob(a15));
                    int i6 = i;
                    pVar.f5532f = C1792e.m4454b(a2.getBlob(i6));
                    int i7 = a15;
                    i = i6;
                    int i8 = a17;
                    pVar.f5533g = a2.getLong(i8);
                    a17 = i8;
                    int i9 = a5;
                    int i10 = a18;
                    pVar.f5534h = a2.getLong(i10);
                    a18 = i10;
                    int i11 = i9;
                    int i12 = a19;
                    pVar.f5535i = a2.getLong(i12);
                    int i13 = a20;
                    pVar.f5537k = a2.getInt(i13);
                    int i14 = a21;
                    a20 = i13;
                    pVar.f5538l = C1061o.m2540c(a2.getInt(i14));
                    a19 = i12;
                    int i15 = i11;
                    int i16 = a22;
                    pVar.f5539m = a2.getLong(i16);
                    a22 = i16;
                    int i17 = i14;
                    int i18 = a23;
                    pVar.f5540n = a2.getLong(i18);
                    a23 = i18;
                    int i19 = i17;
                    int i20 = a24;
                    pVar.f5541o = a2.getLong(i20);
                    a24 = i20;
                    int i21 = i19;
                    int i22 = a25;
                    pVar.f5542p = a2.getLong(i22);
                    int i23 = a26;
                    pVar.f5543q = a2.getInt(i23) != 0;
                    pVar.f5536j = cVar;
                    arrayList.add(pVar);
                    a26 = i23;
                    a25 = i22;
                    a15 = i7;
                    a11 = i2;
                    a13 = i3;
                    a3 = i4;
                    a4 = i5;
                    int i24 = i15;
                    a21 = i21;
                    a5 = i24;
                }
                a2.close();
                iVar.mo6434f();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                a2.close();
                iVar.mo6434f();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            iVar = a;
            a2.close();
            iVar.mo6434f();
            throw th;
        }
    }

    /* renamed from: a */
    public List<C1913p> mo6904a(int i) {
        C1646i iVar;
        C1646i a = C1646i.m4184a("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        a.bindLong(1, (long) i);
        this.f5546a.mo6415b();
        Cursor a2 = C1651b.m4197a(this.f5546a, a, false, null);
        try {
            int a3 = C1061o.m2435a(a2, "required_network_type");
            int a4 = C1061o.m2435a(a2, "requires_charging");
            int a5 = C1061o.m2435a(a2, "requires_device_idle");
            int a6 = C1061o.m2435a(a2, "requires_battery_not_low");
            int a7 = C1061o.m2435a(a2, "requires_storage_not_low");
            int a8 = C1061o.m2435a(a2, "trigger_content_update_delay");
            int a9 = C1061o.m2435a(a2, "trigger_max_content_delay");
            int a10 = C1061o.m2435a(a2, "content_uri_triggers");
            int a11 = C1061o.m2435a(a2, "id");
            int a12 = C1061o.m2435a(a2, "state");
            int a13 = C1061o.m2435a(a2, "worker_class_name");
            int a14 = C1061o.m2435a(a2, "input_merger_class_name");
            int a15 = C1061o.m2435a(a2, "input");
            int a16 = C1061o.m2435a(a2, "output");
            iVar = a;
            try {
                int a17 = C1061o.m2435a(a2, "initial_delay");
                int a18 = C1061o.m2435a(a2, "interval_duration");
                int a19 = C1061o.m2435a(a2, "flex_duration");
                int a20 = C1061o.m2435a(a2, "run_attempt_count");
                int a21 = C1061o.m2435a(a2, "backoff_policy");
                int a22 = C1061o.m2435a(a2, "backoff_delay_duration");
                int a23 = C1061o.m2435a(a2, "period_start_time");
                int a24 = C1061o.m2435a(a2, "minimum_retention_duration");
                int a25 = C1061o.m2435a(a2, "schedule_requested_at");
                int a26 = C1061o.m2435a(a2, "run_in_foreground");
                int i2 = a16;
                ArrayList arrayList = new ArrayList(a2.getCount());
                while (a2.moveToNext()) {
                    String string = a2.getString(a11);
                    int i3 = a11;
                    String string2 = a2.getString(a13);
                    int i4 = a13;
                    C1788c cVar = new C1788c();
                    int i5 = a3;
                    cVar.f5244a = C1061o.m2549d(a2.getInt(a3));
                    cVar.f5245b = a2.getInt(a4) != 0;
                    cVar.f5246c = a2.getInt(a5) != 0;
                    cVar.f5247d = a2.getInt(a6) != 0;
                    cVar.f5248e = a2.getInt(a7) != 0;
                    int i6 = a4;
                    cVar.f5249f = a2.getLong(a8);
                    cVar.f5250g = a2.getLong(a9);
                    cVar.f5251h = C1061o.m2474a(a2.getBlob(a10));
                    C1913p pVar = new C1913p(string, string2);
                    pVar.f5528b = C1061o.m2555e(a2.getInt(a12));
                    pVar.f5530d = a2.getString(a14);
                    pVar.f5531e = C1792e.m4454b(a2.getBlob(a15));
                    int i7 = i2;
                    pVar.f5532f = C1792e.m4454b(a2.getBlob(i7));
                    int i8 = a14;
                    i2 = i7;
                    int i9 = a17;
                    pVar.f5533g = a2.getLong(i9);
                    a17 = i9;
                    int i10 = a5;
                    int i11 = a18;
                    pVar.f5534h = a2.getLong(i11);
                    a18 = i11;
                    int i12 = i10;
                    int i13 = a19;
                    pVar.f5535i = a2.getLong(i13);
                    int i14 = a20;
                    pVar.f5537k = a2.getInt(i14);
                    int i15 = a21;
                    a20 = i14;
                    pVar.f5538l = C1061o.m2540c(a2.getInt(i15));
                    a19 = i13;
                    int i16 = i12;
                    int i17 = a22;
                    pVar.f5539m = a2.getLong(i17);
                    a22 = i17;
                    int i18 = i15;
                    int i19 = a23;
                    pVar.f5540n = a2.getLong(i19);
                    a23 = i19;
                    int i20 = i18;
                    int i21 = a24;
                    pVar.f5541o = a2.getLong(i21);
                    a24 = i21;
                    int i22 = i20;
                    int i23 = a25;
                    pVar.f5542p = a2.getLong(i23);
                    int i24 = a26;
                    pVar.f5543q = a2.getInt(i24) != 0;
                    pVar.f5536j = cVar;
                    arrayList.add(pVar);
                    a26 = i24;
                    a25 = i23;
                    a14 = i8;
                    a11 = i3;
                    a13 = i4;
                    a4 = i6;
                    a3 = i5;
                    int i25 = i16;
                    a21 = i22;
                    a5 = i25;
                }
                a2.close();
                iVar.mo6434f();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                a2.close();
                iVar.mo6434f();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            iVar = a;
            a2.close();
            iVar.mo6434f();
            throw th;
        }
    }

    /* renamed from: a */
    public int mo6901a(String str, long j) {
        this.f5546a.mo6415b();
        C1684f a = this.f5553h.mo6441a();
        a.f4945e.bindLong(1, j);
        if (str == null) {
            a.f4945e.bindNull(2);
        } else {
            a.f4945e.bindString(2, str);
        }
        this.f5546a.mo6416c();
        try {
            int a2 = a.mo6508a();
            this.f5546a.mo6420g();
            return a2;
        } finally {
            this.f5546a.mo6417d();
            C1648k kVar = this.f5553h;
            if (a == kVar.f4861c) {
                kVar.f4859a.set(false);
            }
        }
    }

    /* renamed from: a */
    public void mo6906a(String str, C1792e eVar) {
        this.f5546a.mo6415b();
        C1684f a = this.f5549d.mo6441a();
        byte[] a2 = C1792e.m4447a(eVar);
        if (a2 == null) {
            a.f4945e.bindNull(1);
        } else {
            a.f4945e.bindBlob(1, a2);
        }
        if (str == null) {
            a.f4945e.bindNull(2);
        } else {
            a.f4945e.bindString(2, str);
        }
        this.f5546a.mo6416c();
        try {
            a.mo6508a();
            this.f5546a.mo6420g();
            this.f5546a.mo6417d();
            C1648k kVar = this.f5549d;
            if (a == kVar.f4861c) {
                kVar.f4859a.set(false);
            }
        } catch (Throwable th) {
            this.f5546a.mo6417d();
            this.f5549d.mo6442a(a);
            throw th;
        }
    }

    /* renamed from: a */
    public int mo6902a(C1816t tVar, String... strArr) {
        this.f5546a.mo6415b();
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE workspec SET state=");
        String str = "?";
        sb.append(str);
        sb.append(" WHERE id IN (");
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(str);
            if (i < length - 1) {
                sb.append(",");
            }
        }
        sb.append(")");
        C1684f a = this.f5546a.mo6413a(sb.toString());
        a.f4945e.bindLong(1, (long) C1061o.m2443a(tVar));
        int i2 = 2;
        for (String str2 : strArr) {
            if (str2 == null) {
                a.f4945e.bindNull(i2);
            } else {
                a.f4945e.bindString(i2, str2);
            }
            i2++;
        }
        this.f5546a.mo6416c();
        try {
            int a2 = a.mo6508a();
            this.f5546a.mo6420g();
            return a2;
        } finally {
            this.f5546a.mo6417d();
        }
    }
}
