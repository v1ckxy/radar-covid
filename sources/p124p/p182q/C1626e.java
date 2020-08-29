package p124p.p182q;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import p124p.p137c.p138a.p140b.C1235b;
import p124p.p137c.p138a.p140b.C1235b.C1240e;
import p124p.p182q.C1631f.C1637e;
import p124p.p188t.p189a.C1668a;
import p124p.p188t.p189a.C1669b;
import p124p.p188t.p189a.p190f.C1676a;
import p124p.p188t.p189a.p190f.C1684f;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: p.q.e */
public class C1626e {

    /* renamed from: k */
    public static final String[] f4768k = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a */
    public final HashMap<String, Integer> f4769a;

    /* renamed from: b */
    public final String[] f4770b;

    /* renamed from: c */
    public Map<String, Set<String>> f4771c;

    /* renamed from: d */
    public final C1638g f4772d;

    /* renamed from: e */
    public AtomicBoolean f4773e = new AtomicBoolean(false);

    /* renamed from: f */
    public volatile boolean f4774f = false;

    /* renamed from: g */
    public volatile C1684f f4775g;

    /* renamed from: h */
    public C1628b f4776h;
    @SuppressLint({"RestrictedApi"})

    /* renamed from: i */
    public final C1235b<C1629c, C1630d> f4777i = new C1235b<>();

    /* renamed from: j */
    public Runnable f4778j = new C1627a();

    /* renamed from: p.q.e$a */
    public class C1627a implements Runnable {
        public C1627a() {
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        public final Set<Integer> mo6400a() {
            HashSet hashSet = new HashSet();
            Cursor a = C1626e.this.f4772d.mo6412a(new C1668a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null);
            while (a.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(a.getInt(0)));
                } catch (Throwable th) {
                    a.close();
                    throw th;
                }
            }
            a.close();
            if (!hashSet.isEmpty()) {
                C1626e.this.f4775g.mo6508a();
            }
            return hashSet;
        }

        /* JADX WARNING: type inference failed for: r5v0, types: [java.util.Set] */
        /* JADX WARNING: type inference failed for: r5v1 */
        /* JADX WARNING: type inference failed for: r5v2 */
        /* JADX WARNING: type inference failed for: r5v3, types: [java.util.Set] */
        /* JADX WARNING: type inference failed for: r5v6, types: [android.database.sqlite.SQLiteDatabase] */
        /* JADX WARNING: type inference failed for: r5v7 */
        /* JADX WARNING: type inference failed for: r5v9, types: [java.util.Set] */
        /* JADX WARNING: type inference failed for: r5v10 */
        /* JADX WARNING: type inference failed for: r5v11 */
        /* JADX WARNING: type inference failed for: r5v12 */
        /* JADX WARNING: type inference failed for: r5v13 */
        /* JADX WARNING: type inference failed for: r5v14 */
        /* JADX WARNING: type inference failed for: r5v15 */
        /* JADX WARNING: type inference failed for: r5v16 */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r5v1
          assigns: []
          uses: []
          mth insns count: 120
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
        /* JADX WARNING: Removed duplicated region for block: B:48:0x0099 A[SYNTHETIC] */
        /* JADX WARNING: Unknown variable types count: 6 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r11 = this;
                p.q.e r0 = p124p.p182q.C1626e.this
                p.q.g r0 = r0.f4772d
                java.util.concurrent.locks.ReentrantReadWriteLock r0 = r0.f4816h
                java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
                r1 = 1
                r2 = 0
                r3 = 0
                r0.lock()     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                p.q.e r4 = p124p.p182q.C1626e.this     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                boolean r4 = r4.mo6395a()     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                if (r4 != 0) goto L_0x001c
                r0.unlock()
                return
            L_0x001c:
                p.q.e r4 = p124p.p182q.C1626e.this     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                java.util.concurrent.atomic.AtomicBoolean r4 = r4.f4773e     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                boolean r4 = r4.compareAndSet(r1, r2)     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                if (r4 != 0) goto L_0x002a
                r0.unlock()
                return
            L_0x002a:
                p.q.e r4 = p124p.p182q.C1626e.this     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                p.q.g r4 = r4.f4772d     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                boolean r4 = r4.mo6418e()     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                if (r4 == 0) goto L_0x0038
                r0.unlock()
                return
            L_0x0038:
                p.q.e r4 = p124p.p182q.C1626e.this     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                p.q.g r4 = r4.f4772d     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                boolean r4 = r4.f4814f     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                if (r4 == 0) goto L_0x0076
                p.q.e r4 = p124p.p182q.C1626e.this     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                p.q.g r4 = r4.f4772d     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                p.t.a.c r4 = r4.f4811c     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                p.t.a.b r4 = r4.getWritableDatabase()     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                r5 = r4
                p.t.a.f.a r5 = (p124p.p188t.p189a.p190f.C1676a) r5     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                android.database.sqlite.SQLiteDatabase r5 = r5.f4930e     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                r5.beginTransaction()     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                java.util.Set r5 = r11.mo6400a()     // Catch:{ all -> 0x0068 }
                r6 = r4
                p.t.a.f.a r6 = (p124p.p188t.p189a.p190f.C1676a) r6     // Catch:{ all -> 0x0066 }
                android.database.sqlite.SQLiteDatabase r6 = r6.f4930e     // Catch:{ all -> 0x0066 }
                r6.setTransactionSuccessful()     // Catch:{ all -> 0x0066 }
                p.t.a.f.a r4 = (p124p.p188t.p189a.p190f.C1676a) r4     // Catch:{ IllegalStateException -> 0x0074, SQLiteException -> 0x0072 }
                android.database.sqlite.SQLiteDatabase r4 = r4.f4930e     // Catch:{ IllegalStateException -> 0x0074, SQLiteException -> 0x0072 }
                r4.endTransaction()     // Catch:{ IllegalStateException -> 0x0074, SQLiteException -> 0x0072 }
                goto L_0x0089
            L_0x0066:
                r6 = move-exception
                goto L_0x006a
            L_0x0068:
                r6 = move-exception
                r5 = r3
            L_0x006a:
                p.t.a.f.a r4 = (p124p.p188t.p189a.p190f.C1676a) r4     // Catch:{ IllegalStateException -> 0x0074, SQLiteException -> 0x0072 }
                android.database.sqlite.SQLiteDatabase r4 = r4.f4930e     // Catch:{ IllegalStateException -> 0x0074, SQLiteException -> 0x0072 }
                r4.endTransaction()     // Catch:{ IllegalStateException -> 0x0074, SQLiteException -> 0x0072 }
                throw r6     // Catch:{ IllegalStateException -> 0x0074, SQLiteException -> 0x0072 }
            L_0x0072:
                r4 = move-exception
                goto L_0x0082
            L_0x0074:
                r4 = move-exception
                goto L_0x0082
            L_0x0076:
                java.util.Set r5 = r11.mo6400a()     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                goto L_0x0089
            L_0x007b:
                r1 = move-exception
                goto L_0x00ef
            L_0x007e:
                r4 = move-exception
                goto L_0x0081
            L_0x0080:
                r4 = move-exception
            L_0x0081:
                r5 = r3
            L_0x0082:
                java.lang.String r6 = "ROOM"
                java.lang.String r7 = "Cannot run invalidation tracker. Is the db closed?"
                android.util.Log.e(r6, r7, r4)     // Catch:{ all -> 0x007b }
            L_0x0089:
                r0.unlock()
                if (r5 == 0) goto L_0x00ee
                boolean r0 = r5.isEmpty()
                if (r0 != 0) goto L_0x00ee
                p.q.e r0 = p124p.p182q.C1626e.this
                p.c.a.b.b<p.q.e$c, p.q.e$d> r0 = r0.f4777i
                monitor-enter(r0)
                p.q.e r4 = p124p.p182q.C1626e.this     // Catch:{ all -> 0x00eb }
                p.c.a.b.b<p.q.e$c, p.q.e$d> r4 = r4.f4777i     // Catch:{ all -> 0x00eb }
                java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x00eb }
            L_0x00a1:
                r6 = r4
                p.c.a.b.b$e r6 = (p124p.p137c.p138a.p140b.C1235b.C1240e) r6
                boolean r7 = r6.hasNext()     // Catch:{ all -> 0x00eb }
                if (r7 == 0) goto L_0x00e9
                java.lang.Object r6 = r6.next()     // Catch:{ all -> 0x00eb }
                java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ all -> 0x00eb }
                java.lang.Object r6 = r6.getValue()     // Catch:{ all -> 0x00eb }
                p.q.e$d r6 = (p124p.p182q.C1626e.C1630d) r6     // Catch:{ all -> 0x00eb }
                int[] r7 = r6.f4786a     // Catch:{ all -> 0x00eb }
                int r7 = r7.length     // Catch:{ all -> 0x00eb }
                r8 = r2
                r9 = r3
            L_0x00bb:
                if (r8 >= r7) goto L_0x00e1
                int[] r10 = r6.f4786a     // Catch:{ all -> 0x00eb }
                r10 = r10[r8]     // Catch:{ all -> 0x00eb }
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x00eb }
                boolean r10 = r5.contains(r10)     // Catch:{ all -> 0x00eb }
                if (r10 == 0) goto L_0x00de
                if (r7 != r1) goto L_0x00d0
                java.util.Set<java.lang.String> r9 = r6.f4789d     // Catch:{ all -> 0x00eb }
                goto L_0x00de
            L_0x00d0:
                if (r9 != 0) goto L_0x00d7
                java.util.HashSet r9 = new java.util.HashSet     // Catch:{ all -> 0x00eb }
                r9.<init>(r7)     // Catch:{ all -> 0x00eb }
            L_0x00d7:
                java.lang.String[] r10 = r6.f4787b     // Catch:{ all -> 0x00eb }
                r10 = r10[r8]     // Catch:{ all -> 0x00eb }
                r9.add(r10)     // Catch:{ all -> 0x00eb }
            L_0x00de:
                int r8 = r8 + 1
                goto L_0x00bb
            L_0x00e1:
                if (r9 == 0) goto L_0x00a1
                p.q.e$c r6 = r6.f4788c     // Catch:{ all -> 0x00eb }
                r6.mo6406a(r9)     // Catch:{ all -> 0x00eb }
                goto L_0x00a1
            L_0x00e9:
                monitor-exit(r0)     // Catch:{ all -> 0x00eb }
                goto L_0x00ee
            L_0x00eb:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x00eb }
                throw r1
            L_0x00ee:
                return
            L_0x00ef:
                r0.unlock()
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p124p.p182q.C1626e.C1627a.run():void");
        }
    }

    /* renamed from: p.q.e$b */
    public static class C1628b {

        /* renamed from: a */
        public final long[] f4780a;

        /* renamed from: b */
        public final boolean[] f4781b;

        /* renamed from: c */
        public final int[] f4782c;

        /* renamed from: d */
        public boolean f4783d;

        /* renamed from: e */
        public boolean f4784e;

        public C1628b(int i) {
            long[] jArr = new long[i];
            this.f4780a = jArr;
            this.f4781b = new boolean[i];
            this.f4782c = new int[i];
            Arrays.fill(jArr, 0);
            Arrays.fill(this.f4781b, false);
        }

        /* renamed from: a */
        public boolean mo6402a(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long j = this.f4780a[i];
                    this.f4780a[i] = 1 + j;
                    if (j == 0) {
                        this.f4783d = true;
                        z = true;
                    }
                }
            }
            return z;
        }

        /* renamed from: a */
        public int[] mo6403a() {
            synchronized (this) {
                if (this.f4783d) {
                    if (!this.f4784e) {
                        int length = this.f4780a.length;
                        int i = 0;
                        while (true) {
                            int i2 = 1;
                            if (i < length) {
                                boolean z = this.f4780a[i] > 0;
                                if (z != this.f4781b[i]) {
                                    int[] iArr = this.f4782c;
                                    if (!z) {
                                        i2 = 2;
                                    }
                                    iArr[i] = i2;
                                } else {
                                    this.f4782c[i] = 0;
                                }
                                this.f4781b[i] = z;
                                i++;
                            } else {
                                this.f4784e = true;
                                this.f4783d = false;
                                int[] iArr2 = this.f4782c;
                                return iArr2;
                            }
                        }
                    }
                }
                return null;
            }
        }

        /* renamed from: b */
        public void mo6404b() {
            synchronized (this) {
                this.f4784e = false;
            }
        }

        /* renamed from: b */
        public boolean mo6405b(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long j = this.f4780a[i];
                    this.f4780a[i] = j - 1;
                    if (j == 1) {
                        this.f4783d = true;
                        z = true;
                    }
                }
            }
            return z;
        }
    }

    /* renamed from: p.q.e$c */
    public static abstract class C1629c {

        /* renamed from: a */
        public final String[] f4785a;

        public C1629c(String[] strArr) {
            this.f4785a = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        /* renamed from: a */
        public abstract void mo6406a(Set<String> set);
    }

    /* renamed from: p.q.e$d */
    public static class C1630d {

        /* renamed from: a */
        public final int[] f4786a;

        /* renamed from: b */
        public final String[] f4787b;

        /* renamed from: c */
        public final C1629c f4788c;

        /* renamed from: d */
        public final Set<String> f4789d;

        public C1630d(C1629c cVar, int[] iArr, String[] strArr) {
            Set<String> set;
            this.f4788c = cVar;
            this.f4786a = iArr;
            this.f4787b = strArr;
            if (iArr.length == 1) {
                HashSet hashSet = new HashSet();
                hashSet.add(this.f4787b[0]);
                set = Collections.unmodifiableSet(hashSet);
            } else {
                set = null;
            }
            this.f4789d = set;
        }
    }

    public C1626e(C1638g gVar, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.f4772d = gVar;
        this.f4776h = new C1628b(strArr.length);
        this.f4769a = new HashMap<>();
        this.f4771c = map2;
        Collections.newSetFromMap(new IdentityHashMap());
        int length = strArr.length;
        this.f4770b = new String[length];
        for (int i = 0; i < length; i++) {
            String lowerCase = strArr[i].toLowerCase(Locale.US);
            this.f4769a.put(lowerCase, Integer.valueOf(i));
            String str = (String) map.get(strArr[i]);
            if (str != null) {
                this.f4770b[i] = str.toLowerCase(Locale.US);
            } else {
                this.f4770b[i] = lowerCase;
            }
        }
        for (Entry entry : map.entrySet()) {
            String lowerCase2 = ((String) entry.getValue()).toLowerCase(Locale.US);
            if (this.f4769a.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(Locale.US);
                HashMap<String, Integer> hashMap = this.f4769a;
                hashMap.put(lowerCase3, hashMap.get(lowerCase2));
            }
        }
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: a */
    public void mo6391a(C1629c cVar) {
        C1630d dVar;
        String[] strArr = cVar.f4785a;
        HashSet hashSet = new HashSet();
        int i = 0;
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.f4771c.containsKey(lowerCase)) {
                hashSet.addAll((Collection) this.f4771c.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        String[] strArr2 = (String[]) hashSet.toArray(new String[hashSet.size()]);
        int[] iArr = new int[strArr2.length];
        int length = strArr2.length;
        while (i < length) {
            Integer num = (Integer) this.f4769a.get(strArr2[i].toLowerCase(Locale.US));
            if (num != null) {
                iArr[i] = num.intValue();
                i++;
            } else {
                StringBuilder a = C1965a.m4756a("There is no table with name ");
                a.append(strArr2[i]);
                throw new IllegalArgumentException(a.toString());
            }
        }
        C1630d dVar2 = new C1630d(cVar, iArr, strArr2);
        synchronized (this.f4777i) {
            dVar = (C1630d) this.f4777i.mo5411b(cVar, dVar2);
        }
        if (dVar == null && this.f4776h.mo6402a(iArr)) {
            mo6396b();
        }
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: b */
    public void mo6397b(C1629c cVar) {
        C1630d dVar;
        synchronized (this.f4777i) {
            dVar = (C1630d) this.f4777i.remove(cVar);
        }
        if (dVar != null && this.f4776h.mo6405b(dVar.f4786a)) {
            mo6396b();
        }
    }

    /* renamed from: b */
    public final void mo6399b(C1669b bVar, int i) {
        String[] strArr;
        String str = this.f4770b[i];
        StringBuilder sb = new StringBuilder();
        for (String str2 : f4768k) {
            sb.setLength(0);
            sb.append("DROP TRIGGER IF EXISTS ");
            String str3 = "`";
            sb.append(str3);
            sb.append("room_table_modification_trigger_");
            sb.append(str);
            sb.append("_");
            sb.append(str2);
            sb.append(str3);
            ((C1676a) bVar).f4930e.execSQL(sb.toString());
        }
    }

    /* renamed from: a */
    public boolean mo6395a() {
        if (!this.f4772d.mo6419f()) {
            return false;
        }
        if (!this.f4774f) {
            this.f4772d.f4811c.getWritableDatabase();
        }
        if (this.f4774f) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    /* renamed from: b */
    public void mo6396b() {
        if (this.f4772d.mo6419f()) {
            mo6398b(this.f4772d.f4811c.getWritableDatabase());
        }
    }

    /* renamed from: a */
    public void mo6392a(C1669b bVar) {
        synchronized (this) {
            if (this.f4774f) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            ((C1676a) bVar).f4930e.execSQL("PRAGMA temp_store = MEMORY;");
            ((C1676a) bVar).f4930e.execSQL("PRAGMA recursive_triggers='ON';");
            ((C1676a) bVar).f4930e.execSQL("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            mo6398b(bVar);
            this.f4775g = new C1684f(((C1676a) bVar).f4930e.compileStatement("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 "));
            this.f4774f = true;
        }
    }

    /* renamed from: b */
    public void mo6398b(C1669b bVar) {
        if (!((C1676a) bVar).f4930e.inTransaction()) {
            while (true) {
                try {
                    ReadLock readLock = this.f4772d.f4816h.readLock();
                    readLock.lock();
                    try {
                        int[] a = this.f4776h.mo6403a();
                        if (a == null) {
                            readLock.unlock();
                            return;
                        }
                        int length = a.length;
                        ((C1676a) bVar).f4930e.beginTransaction();
                        for (int i = 0; i < length; i++) {
                            int i2 = a[i];
                            if (i2 == 1) {
                                mo6393a(bVar, i);
                            } else if (i2 == 2) {
                                mo6399b(bVar, i);
                            }
                        }
                        ((C1676a) bVar).f4930e.setTransactionSuccessful();
                        ((C1676a) bVar).f4930e.endTransaction();
                        this.f4776h.mo6404b();
                        readLock.unlock();
                    } catch (Throwable th) {
                        readLock.unlock();
                        throw th;
                    }
                } catch (SQLiteException | IllegalStateException e) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo6394a(String... strArr) {
        synchronized (this.f4777i) {
            Iterator it = this.f4777i.iterator();
            while (true) {
                C1240e eVar = (C1240e) it;
                if (eVar.hasNext()) {
                    if (((C1637e) ((C1629c) ((Entry) eVar.next()).getKey())) == null) {
                        throw null;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo6393a(C1669b bVar, int i) {
        String[] strArr;
        C1676a aVar = (C1676a) bVar;
        aVar.f4930e.execSQL(C1965a.m4762b("INSERT OR IGNORE INTO room_table_modification_log VALUES(", i, ", 0)"));
        String str = this.f4770b[i];
        StringBuilder sb = new StringBuilder();
        for (String str2 : f4768k) {
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            String str3 = "`";
            sb.append(str3);
            sb.append("room_table_modification_trigger_");
            sb.append(str);
            sb.append("_");
            sb.append(str2);
            sb.append(str3);
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN UPDATE ");
            sb.append("room_table_modification_log");
            sb.append(" SET ");
            String str4 = "invalidated";
            sb.append(str4);
            sb.append(" = 1");
            sb.append(" WHERE ");
            sb.append("table_id");
            sb.append(" = ");
            sb.append(i);
            sb.append(" AND ");
            sb.append(str4);
            sb.append(" = 0");
            sb.append("; END");
            aVar.f4930e.execSQL(sb.toString());
        }
    }
}
