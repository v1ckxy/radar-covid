package androidx.work.impl;

import android.content.Context;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import p124p.p182q.C1638g;
import p124p.p188t.p189a.C1670c;
import p124p.p188t.p189a.C1670c.C1671a;
import p124p.p188t.p189a.C1670c.C1672b;
import p124p.p188t.p189a.C1670c.C1673c;
import p124p.p188t.p189a.p190f.C1679c;
import p124p.p199y.p200x.p209s.C1891b;
import p124p.p199y.p200x.p209s.C1895e;
import p124p.p199y.p200x.p209s.C1899h;
import p124p.p199y.p200x.p209s.C1904k;
import p124p.p199y.p200x.p209s.C1908n;
import p124p.p199y.p200x.p209s.C1915q;
import p124p.p199y.p200x.p209s.C1927t;
import p213q.p214a.p215a.p216a.C1965a;

public abstract class WorkDatabase extends C1638g {

    /* renamed from: j */
    public static final long f989j = TimeUnit.DAYS.toMillis(7);

    /* renamed from: androidx.work.impl.WorkDatabase$a */
    public class C0183a implements C1673c {

        /* renamed from: a */
        public final /* synthetic */ Context f990a;

        public C0183a(Context context) {
            this.f990a = context;
        }

        /* renamed from: a */
        public C1670c mo1464a(C1672b bVar) {
            Context context = this.f990a;
            String str = bVar.f4926b;
            C1671a aVar = bVar.f4927c;
            if (aVar == null) {
                throw new IllegalArgumentException("Must set a callback to create the configuration.");
            } else if (context == null) {
                throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
            } else if (!TextUtils.isEmpty(str)) {
                return new C1679c(context, str, aVar, true);
            } else {
                throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00e0, code lost:
        if (r0 != null) goto L_0x00e2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0256  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.work.impl.WorkDatabase m829a(android.content.Context r25, java.util.concurrent.Executor r26, boolean r27) {
        /*
            r0 = r25
            java.lang.Class<androidx.work.impl.WorkDatabase> r1 = androidx.work.impl.WorkDatabase.class
            r2 = 0
            r3 = 1
            if (r27 == 0) goto L_0x0012
            p.q.g$a r4 = new p.q.g$a
            r4.<init>(r0, r1, r2)
            r4.f4825h = r3
            r1 = r26
            goto L_0x0030
        L_0x0012:
            p124p.p199y.p200x.C1840j.m4513a()
            java.lang.String r4 = "androidx.work.workdb"
            java.lang.String r5 = r4.trim()
            int r5 = r5.length()
            if (r5 == 0) goto L_0x0267
            p.q.g$a r5 = new p.q.g$a
            r5.<init>(r0, r1, r4)
            androidx.work.impl.WorkDatabase$a r1 = new androidx.work.impl.WorkDatabase$a
            r1.<init>(r0)
            r5.f4824g = r1
            r1 = r26
            r4 = r5
        L_0x0030:
            r4.f4822e = r1
            p.y.x.h r1 = new p.y.x.h
            r1.<init>()
            java.util.ArrayList<p.q.g$b> r5 = r4.f4821d
            if (r5 != 0) goto L_0x0042
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r4.f4821d = r5
        L_0x0042:
            java.util.ArrayList<p.q.g$b> r5 = r4.f4821d
            r5.add(r1)
            p.q.l.a[] r1 = new p124p.p182q.p183l.C1649a[r3]
            p.q.l.a r5 = p124p.p199y.p200x.C1831i.f5334a
            r6 = 0
            r1[r6] = r5
            r4.mo6421a(r1)
            p.q.l.a[] r1 = new p124p.p182q.p183l.C1649a[r3]
            p.y.x.i$g r5 = new p.y.x.i$g
            r7 = 2
            r8 = 3
            r5.<init>(r0, r7, r8)
            r1[r6] = r5
            r4.mo6421a(r1)
            p.q.l.a[] r1 = new p124p.p182q.p183l.C1649a[r3]
            p.q.l.a r5 = p124p.p199y.p200x.C1831i.f5335b
            r1[r6] = r5
            r4.mo6421a(r1)
            p.q.l.a[] r1 = new p124p.p182q.p183l.C1649a[r3]
            p.q.l.a r5 = p124p.p199y.p200x.C1831i.f5336c
            r1[r6] = r5
            r4.mo6421a(r1)
            p.q.l.a[] r1 = new p124p.p182q.p183l.C1649a[r3]
            p.y.x.i$g r5 = new p.y.x.i$g
            r7 = 5
            r8 = 6
            r5.<init>(r0, r7, r8)
            r1[r6] = r5
            r4.mo6421a(r1)
            p.q.l.a[] r1 = new p124p.p182q.p183l.C1649a[r3]
            p.q.l.a r5 = p124p.p199y.p200x.C1831i.f5337d
            r1[r6] = r5
            r4.mo6421a(r1)
            p.q.l.a[] r1 = new p124p.p182q.p183l.C1649a[r3]
            p.q.l.a r5 = p124p.p199y.p200x.C1831i.f5338e
            r1[r6] = r5
            r4.mo6421a(r1)
            p.q.l.a[] r1 = new p124p.p182q.p183l.C1649a[r3]
            p.q.l.a r5 = p124p.p199y.p200x.C1831i.f5339f
            r1[r6] = r5
            r4.mo6421a(r1)
            p.q.l.a[] r1 = new p124p.p182q.p183l.C1649a[r3]
            p.y.x.i$h r5 = new p.y.x.i$h
            r5.<init>(r0)
            r1[r6] = r5
            r4.mo6421a(r1)
            p.q.l.a[] r1 = new p124p.p182q.p183l.C1649a[r3]
            p.y.x.i$g r5 = new p.y.x.i$g
            r7 = 10
            r8 = 11
            r5.<init>(r0, r7, r8)
            r1[r6] = r5
            r4.mo6421a(r1)
            r4.f4827j = r6
            r4.f4828k = r3
            android.content.Context r0 = r4.f4820c
            if (r0 == 0) goto L_0x025f
            java.lang.Class<T> r0 = r4.f4818a
            if (r0 == 0) goto L_0x0257
            java.util.concurrent.Executor r0 = r4.f4822e
            if (r0 != 0) goto L_0x00cf
            java.util.concurrent.Executor r0 = r4.f4823f
            if (r0 != 0) goto L_0x00cf
            java.util.concurrent.Executor r0 = p124p.p137c.p138a.p139a.C1229a.f3507d
            r4.f4823f = r0
            goto L_0x00e2
        L_0x00cf:
            java.util.concurrent.Executor r0 = r4.f4822e
            if (r0 == 0) goto L_0x00da
            java.util.concurrent.Executor r1 = r4.f4823f
            if (r1 != 0) goto L_0x00da
            r4.f4823f = r0
            goto L_0x00e4
        L_0x00da:
            java.util.concurrent.Executor r0 = r4.f4822e
            if (r0 != 0) goto L_0x00e4
            java.util.concurrent.Executor r0 = r4.f4823f
            if (r0 == 0) goto L_0x00e4
        L_0x00e2:
            r4.f4822e = r0
        L_0x00e4:
            p.t.a.c$c r0 = r4.f4824g
            if (r0 != 0) goto L_0x00ef
            p.t.a.f.d r0 = new p.t.a.f.d
            r0.<init>()
            r4.f4824g = r0
        L_0x00ef:
            p.q.a r0 = new p.q.a
            android.content.Context r10 = r4.f4820c
            java.lang.String r11 = r4.f4819b
            p.t.a.c$c r12 = r4.f4824g
            p.q.g$d r13 = r4.f4829l
            java.util.ArrayList<p.q.g$b> r14 = r4.f4821d
            boolean r15 = r4.f4825h
            p.q.g$c r1 = r4.f4826i
            if (r1 == 0) goto L_0x0256
            p.q.g$c r5 = p124p.p182q.C1638g.C1641c.AUTOMATIC
            if (r1 == r5) goto L_0x0108
        L_0x0105:
            r16 = r1
            goto L_0x011e
        L_0x0108:
            java.lang.String r1 = "activity"
            java.lang.Object r1 = r10.getSystemService(r1)
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1
            if (r1 == 0) goto L_0x011b
            boolean r1 = r1.isLowRamDevice()
            if (r1 != 0) goto L_0x011b
            p.q.g$c r1 = p124p.p182q.C1638g.C1641c.WRITE_AHEAD_LOGGING
            goto L_0x0105
        L_0x011b:
            p.q.g$c r1 = p124p.p182q.C1638g.C1641c.TRUNCATE
            goto L_0x0105
        L_0x011e:
            java.util.concurrent.Executor r1 = r4.f4822e
            java.util.concurrent.Executor r5 = r4.f4823f
            r19 = 0
            boolean r7 = r4.f4827j
            boolean r9 = r4.f4828k
            r22 = 0
            r23 = 0
            r24 = 0
            r21 = r9
            r9 = r0
            r17 = r1
            r18 = r5
            r20 = r7
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Class<T> r1 = r4.f4818a
            java.lang.Package r4 = r1.getPackage()
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = r1.getCanonicalName()
            boolean r7 = r4.isEmpty()
            if (r7 == 0) goto L_0x014f
            goto L_0x0158
        L_0x014f:
            int r7 = r4.length()
            int r7 = r7 + r3
            java.lang.String r5 = r5.substring(r7)
        L_0x0158:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r9 = 46
            r10 = 95
            java.lang.String r5 = r5.replace(r9, r10)
            r7.append(r5)
            java.lang.String r5 = "_Impl"
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            boolean r7 = r4.isEmpty()     // Catch:{ ClassNotFoundException -> 0x0232, IllegalAccessException -> 0x021b, InstantiationException -> 0x0204 }
            if (r7 == 0) goto L_0x0179
            r4 = r5
            goto L_0x018d
        L_0x0179:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x0232, IllegalAccessException -> 0x021b, InstantiationException -> 0x0204 }
            r7.<init>()     // Catch:{ ClassNotFoundException -> 0x0232, IllegalAccessException -> 0x021b, InstantiationException -> 0x0204 }
            r7.append(r4)     // Catch:{ ClassNotFoundException -> 0x0232, IllegalAccessException -> 0x021b, InstantiationException -> 0x0204 }
            java.lang.String r4 = "."
            r7.append(r4)     // Catch:{ ClassNotFoundException -> 0x0232, IllegalAccessException -> 0x021b, InstantiationException -> 0x0204 }
            r7.append(r5)     // Catch:{ ClassNotFoundException -> 0x0232, IllegalAccessException -> 0x021b, InstantiationException -> 0x0204 }
            java.lang.String r4 = r7.toString()     // Catch:{ ClassNotFoundException -> 0x0232, IllegalAccessException -> 0x021b, InstantiationException -> 0x0204 }
        L_0x018d:
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ ClassNotFoundException -> 0x0232, IllegalAccessException -> 0x021b, InstantiationException -> 0x0204 }
            java.lang.Object r1 = r4.newInstance()     // Catch:{ ClassNotFoundException -> 0x0232, IllegalAccessException -> 0x021b, InstantiationException -> 0x0204 }
            p.q.g r1 = (p124p.p182q.C1638g) r1
            if (r1 == 0) goto L_0x0203
            r2 = r1
            androidx.work.impl.WorkDatabase_Impl r2 = (androidx.work.impl.WorkDatabase_Impl) r2
            p.q.h r4 = new p.q.h
            p.y.x.k r5 = new p.y.x.k
            r5.<init>(r2, r8)
            java.lang.String r2 = "cf029002fffdcadf079e8d0a1c9a70ac"
            java.lang.String r7 = "8aff2efc47fafe870c738f727dfcfc6e"
            r4.<init>(r0, r5, r2, r7)
            android.content.Context r2 = r0.f4754b
            java.lang.String r5 = r0.f4755c
            if (r2 == 0) goto L_0x01fb
            p.t.a.c$b r7 = new p.t.a.c$b
            r7.<init>(r2, r5, r4, r6)
            p.t.a.c$c r2 = r0.f4753a
            p.t.a.c r2 = r2.mo1464a(r7)
            r1.f4811c = r2
            boolean r4 = r2 instanceof p124p.p182q.C1647j
            if (r4 == 0) goto L_0x01c5
            p.q.j r2 = (p124p.p182q.C1647j) r2
            r2.f4857j = r0
        L_0x01c5:
            p.q.g$c r2 = r0.f4759g
            p.q.g$c r4 = p124p.p182q.C1638g.C1641c.WRITE_AHEAD_LOGGING
            if (r2 != r4) goto L_0x01cc
            goto L_0x01cd
        L_0x01cc:
            r3 = r6
        L_0x01cd:
            p.t.a.c r2 = r1.f4811c
            r2.setWriteAheadLoggingEnabled(r3)
            java.util.List<p.q.g$b> r2 = r0.f4757e
            r1.f4815g = r2
            java.util.concurrent.Executor r2 = r0.f4760h
            r1.f4810b = r2
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r2.<init>()
            boolean r2 = r0.f4758f
            r1.f4813e = r2
            r1.f4814f = r3
            boolean r2 = r0.f4762j
            if (r2 == 0) goto L_0x01f8
            p.q.e r2 = r1.f4812d
            android.content.Context r3 = r0.f4754b
            java.lang.String r0 = r0.f4755c
            p.q.f r4 = new p.q.f
            p.q.g r5 = r2.f4772d
            java.util.concurrent.Executor r5 = r5.f4810b
            r4.<init>(r3, r0, r2, r5)
        L_0x01f8:
            androidx.work.impl.WorkDatabase r1 = (androidx.work.impl.WorkDatabase) r1
            return r1
        L_0x01fb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Must set a non-null context to create the configuration."
            r0.<init>(r1)
            throw r0
        L_0x0203:
            throw r2
        L_0x0204:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r2 = "Failed to create an instance of "
            java.lang.StringBuilder r2 = p213q.p214a.p215a.p216a.C1965a.m4756a(r2)
            java.lang.String r1 = r1.getCanonicalName()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x021b:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r2 = "Cannot access the constructor"
            java.lang.StringBuilder r2 = p213q.p214a.p215a.p216a.C1965a.m4756a(r2)
            java.lang.String r1 = r1.getCanonicalName()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x0232:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r2 = "cannot find implementation for "
            java.lang.StringBuilder r2 = p213q.p214a.p215a.p216a.C1965a.m4756a(r2)
            java.lang.String r1 = r1.getCanonicalName()
            r2.append(r1)
            java.lang.String r1 = ". "
            r2.append(r1)
            r2.append(r5)
            java.lang.String r1 = " does not exist"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x0256:
            throw r2
        L_0x0257:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Must provide an abstract class that extends RoomDatabase"
            r0.<init>(r1)
            throw r0
        L_0x025f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Cannot provide null context for the database."
            r0.<init>(r1)
            throw r0
        L_0x0267:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.WorkDatabase.m829a(android.content.Context, java.util.concurrent.Executor, boolean):androidx.work.impl.WorkDatabase");
    }

    /* renamed from: o */
    public static String m830o() {
        StringBuilder a = C1965a.m4756a("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < ");
        a.append(System.currentTimeMillis() - f989j);
        a.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
        return a.toString();
    }

    /* renamed from: h */
    public abstract C1891b mo1457h();

    /* renamed from: i */
    public abstract C1895e mo1458i();

    /* renamed from: j */
    public abstract C1899h mo1459j();

    /* renamed from: k */
    public abstract C1904k mo1460k();

    /* renamed from: l */
    public abstract C1908n mo1461l();

    /* renamed from: m */
    public abstract C1915q mo1462m();

    /* renamed from: n */
    public abstract C1927t mo1463n();
}
