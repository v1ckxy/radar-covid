package p124p.p199y.p200x;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.ListenableWorker.C0177a;
import androidx.work.ListenableWorker.C0177a.C0178a;
import androidx.work.ListenableWorker.C0177a.C0179b;
import androidx.work.ListenableWorker.C0177a.C0180c;
import androidx.work.WorkerParameters.C0182a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p124p.p199y.C1785b;
import p124p.p199y.C1800l;
import p124p.p199y.C1816t;
import p124p.p199y.p200x.p208r.C1885a;
import p124p.p199y.p200x.p209s.C1891b;
import p124p.p199y.p200x.p209s.C1892c;
import p124p.p199y.p200x.p209s.C1909o;
import p124p.p199y.p200x.p209s.C1913p;
import p124p.p199y.p200x.p209s.C1915q;
import p124p.p199y.p200x.p209s.C1916r;
import p124p.p199y.p200x.p209s.C1927t;
import p124p.p199y.p200x.p210t.C1936g;
import p124p.p199y.p200x.p210t.p211p.C1961c;
import p124p.p199y.p200x.p210t.p212q.C1962a;
import p213q.p217b.p298b.p299a.p300a.C3498a;

/* renamed from: p.y.x.o */
public class C1845o implements Runnable {

    /* renamed from: x */
    public static final String f5362x = C1800l.m4459a("WorkerWrapper");

    /* renamed from: e */
    public Context f5363e;

    /* renamed from: f */
    public String f5364f;

    /* renamed from: g */
    public List<C1827e> f5365g;

    /* renamed from: h */
    public C0182a f5366h;

    /* renamed from: i */
    public C1913p f5367i;

    /* renamed from: j */
    public ListenableWorker f5368j;

    /* renamed from: k */
    public C0177a f5369k = new C0178a();

    /* renamed from: l */
    public C1785b f5370l;

    /* renamed from: m */
    public C1962a f5371m;

    /* renamed from: n */
    public C1885a f5372n;

    /* renamed from: o */
    public WorkDatabase f5373o;

    /* renamed from: p */
    public C1915q f5374p;

    /* renamed from: q */
    public C1891b f5375q;

    /* renamed from: r */
    public C1927t f5376r;

    /* renamed from: s */
    public List<String> f5377s;

    /* renamed from: t */
    public String f5378t;

    /* renamed from: u */
    public C1961c<Boolean> f5379u = new C1961c<>();

    /* renamed from: v */
    public C3498a<C0177a> f5380v = null;

    /* renamed from: w */
    public volatile boolean f5381w;

    /* renamed from: p.y.x.o$a */
    public static class C1846a {

        /* renamed from: a */
        public Context f5382a;

        /* renamed from: b */
        public ListenableWorker f5383b;

        /* renamed from: c */
        public C1885a f5384c;

        /* renamed from: d */
        public C1962a f5385d;

        /* renamed from: e */
        public C1785b f5386e;

        /* renamed from: f */
        public WorkDatabase f5387f;

        /* renamed from: g */
        public String f5388g;

        /* renamed from: h */
        public List<C1827e> f5389h;

        /* renamed from: i */
        public C0182a f5390i = new C0182a();

        public C1846a(Context context, C1785b bVar, C1962a aVar, C1885a aVar2, WorkDatabase workDatabase, String str) {
            this.f5382a = context.getApplicationContext();
            this.f5385d = aVar;
            this.f5384c = aVar2;
            this.f5386e = bVar;
            this.f5387f = workDatabase;
            this.f5388g = str;
        }
    }

    public C1845o(C1846a aVar) {
        this.f5363e = aVar.f5382a;
        this.f5371m = aVar.f5385d;
        this.f5372n = aVar.f5384c;
        this.f5364f = aVar.f5388g;
        this.f5365g = aVar.f5389h;
        this.f5366h = aVar.f5390i;
        this.f5368j = aVar.f5383b;
        this.f5370l = aVar.f5386e;
        WorkDatabase workDatabase = aVar.f5387f;
        this.f5373o = workDatabase;
        this.f5374p = workDatabase.mo1462m();
        this.f5375q = this.f5373o.mo1457h();
        this.f5376r = this.f5373o.mo1463n();
    }

    /* renamed from: a */
    public void mo6819a() {
        if (!mo6827f()) {
            this.f5373o.mo6416c();
            try {
                C1816t b = ((C1916r) this.f5374p).mo6908b(this.f5364f);
                ((C1909o) this.f5373o.mo1461l()).mo6892a(this.f5364f);
                if (b == null) {
                    mo6822a(false);
                } else if (b == C1816t.RUNNING) {
                    mo6820a(this.f5369k);
                } else if (!b.mo6791f()) {
                    mo6823b();
                }
                this.f5373o.mo6420g();
            } finally {
                this.f5373o.mo6417d();
            }
        }
        List<C1827e> list = this.f5365g;
        if (list != null) {
            for (C1827e a : list) {
                a.mo6809a(this.f5364f);
            }
            C1828f.m4501a(this.f5370l, this.f5373o, this.f5365g);
        }
    }

    /* renamed from: a */
    public final void mo6820a(C0177a aVar) {
        if (aVar instanceof C0180c) {
            C1800l.m4460a().mo6784c(f5362x, String.format("Worker result SUCCESS for %s", new Object[]{this.f5378t}), new Throwable[0]);
            if (!this.f5367i.mo6895c()) {
                this.f5373o.mo6416c();
                try {
                    C1915q qVar = this.f5374p;
                    ((C1916r) qVar).mo6902a(C1816t.SUCCEEDED, this.f5364f);
                    ((C1916r) this.f5374p).mo6906a(this.f5364f, ((C0180c) this.f5369k).f982a);
                    long currentTimeMillis = System.currentTimeMillis();
                    Iterator it = ((ArrayList) ((C1892c) this.f5375q).mo6880a(this.f5364f)).iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        if (((C1916r) this.f5374p).mo6908b(str) == C1816t.BLOCKED) {
                            if (((C1892c) this.f5375q).mo6881b(str)) {
                                C1800l.m4460a().mo6784c(f5362x, String.format("Setting status to enqueued for %s", new Object[]{str}), new Throwable[0]);
                                C1915q qVar2 = this.f5374p;
                                ((C1916r) qVar2).mo6902a(C1816t.ENQUEUED, str);
                                ((C1916r) this.f5374p).mo6909b(str, currentTimeMillis);
                            }
                        }
                    }
                    this.f5373o.mo6420g();
                    return;
                } finally {
                    this.f5373o.mo6417d();
                    mo6822a(false);
                }
            }
        } else if (aVar instanceof C0179b) {
            C1800l.m4460a().mo6784c(f5362x, String.format("Worker result RETRY for %s", new Object[]{this.f5378t}), new Throwable[0]);
            mo6823b();
            return;
        } else {
            C1800l.m4460a().mo6784c(f5362x, String.format("Worker result FAILURE for %s", new Object[]{this.f5378t}), new Throwable[0]);
            if (!this.f5367i.mo6895c()) {
                mo6826e();
                return;
            }
        }
        mo6824c();
    }

    /* renamed from: a */
    public final void mo6821a(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (((C1916r) this.f5374p).mo6908b(str2) != C1816t.CANCELLED) {
                C1915q qVar = this.f5374p;
                ((C1916r) qVar).mo6902a(C1816t.FAILED, str2);
            }
            linkedList.addAll(((C1892c) this.f5375q).mo6880a(str2));
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final void mo6822a(boolean z) {
        this.f5373o.mo6416c();
        try {
            if (((ArrayList) ((C1916r) this.f5373o.mo1462m()).mo6907b()).isEmpty()) {
                C1936g.m4705a(this.f5363e, RescheduleReceiver.class, false);
            }
            if (z) {
                ((C1916r) this.f5374p).mo6901a(this.f5364f, -1);
            }
            if (!(this.f5367i == null || this.f5368j == null || !this.f5368j.mo1442a())) {
                ((C1825d) this.f5372n).mo6805e(this.f5364f);
            }
            this.f5373o.mo6420g();
            this.f5373o.mo6417d();
            this.f5379u.mo6960c(Boolean.valueOf(z));
        } catch (Throwable th) {
            this.f5373o.mo6417d();
            throw th;
        }
    }

    /* renamed from: b */
    public final void mo6823b() {
        this.f5373o.mo6416c();
        try {
            C1915q qVar = this.f5374p;
            ((C1916r) qVar).mo6902a(C1816t.ENQUEUED, this.f5364f);
            ((C1916r) this.f5374p).mo6909b(this.f5364f, System.currentTimeMillis());
            ((C1916r) this.f5374p).mo6901a(this.f5364f, -1);
            this.f5373o.mo6420g();
        } finally {
            this.f5373o.mo6417d();
            mo6822a(true);
        }
    }

    /* renamed from: c */
    public final void mo6824c() {
        this.f5373o.mo6416c();
        try {
            ((C1916r) this.f5374p).mo6909b(this.f5364f, System.currentTimeMillis());
            C1915q qVar = this.f5374p;
            ((C1916r) qVar).mo6902a(C1816t.ENQUEUED, this.f5364f);
            ((C1916r) this.f5374p).mo6917h(this.f5364f);
            ((C1916r) this.f5374p).mo6901a(this.f5364f, -1);
            this.f5373o.mo6420g();
        } finally {
            this.f5373o.mo6417d();
            mo6822a(false);
        }
    }

    /* renamed from: d */
    public final void mo6825d() {
        C1816t b = ((C1916r) this.f5374p).mo6908b(this.f5364f);
        if (b == C1816t.RUNNING) {
            C1800l.m4460a().mo6782a(f5362x, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", new Object[]{this.f5364f}), new Throwable[0]);
            mo6822a(true);
            return;
        }
        C1800l.m4460a().mo6782a(f5362x, String.format("Status for %s is %s; not doing any work", new Object[]{this.f5364f, b}), new Throwable[0]);
        mo6822a(false);
    }

    /* renamed from: e */
    public void mo6826e() {
        this.f5373o.mo6416c();
        try {
            mo6821a(this.f5364f);
            ((C1916r) this.f5374p).mo6906a(this.f5364f, ((C0178a) this.f5369k).f981a);
            this.f5373o.mo6420g();
        } finally {
            this.f5373o.mo6417d();
            mo6822a(false);
        }
    }

    /* renamed from: f */
    public final boolean mo6827f() {
        if (!this.f5381w) {
            return false;
        }
        C1800l.m4460a().mo6782a(f5362x, String.format("Work interrupted for %s", new Object[]{this.f5378t}), new Throwable[0]);
        C1816t b = ((C1916r) this.f5374p).mo6908b(this.f5364f);
        if (b == null) {
            mo6822a(false);
        } else {
            mo6822a(!b.mo6791f());
        }
        return true;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c3, code lost:
        if ((r0.f5528b == p124p.p199y.C1816t.ENQUEUED && r0.f5537k > 0) != false) goto L_0x00c5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r18 = this;
            r1 = r18
            p.y.x.s.t r0 = r1.f5376r
            java.lang.String r2 = r1.f5364f
            p.y.x.s.u r0 = (p124p.p199y.p200x.p209s.C1928u) r0
            java.util.List r0 = r0.mo6918a(r2)
            r1.f5377s = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Work [ id="
            r2.<init>(r3)
            java.lang.String r3 = r1.f5364f
            r2.append(r3)
            java.lang.String r3 = ", tags={ "
            r2.append(r3)
            java.util.Iterator r0 = r0.iterator()
            r3 = 1
            r4 = r3
        L_0x0025:
            boolean r5 = r0.hasNext()
            r6 = 0
            if (r5 == 0) goto L_0x003f
            java.lang.Object r5 = r0.next()
            java.lang.String r5 = (java.lang.String) r5
            if (r4 == 0) goto L_0x0036
            r4 = r6
            goto L_0x003b
        L_0x0036:
            java.lang.String r6 = ", "
            r2.append(r6)
        L_0x003b:
            r2.append(r5)
            goto L_0x0025
        L_0x003f:
            java.lang.String r0 = " } ]"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.f5378t = r0
            boolean r0 = r18.mo6827f()
            if (r0 == 0) goto L_0x0052
            goto L_0x0292
        L_0x0052:
            androidx.work.impl.WorkDatabase r0 = r1.f5373o
            r0.mo6416c()
            p.y.x.s.q r0 = r1.f5374p     // Catch:{ all -> 0x02a4 }
            java.lang.String r2 = r1.f5364f     // Catch:{ all -> 0x02a4 }
            p.y.x.s.r r0 = (p124p.p199y.p200x.p209s.C1916r) r0
            p.y.x.s.p r0 = r0.mo6914e(r2)     // Catch:{ all -> 0x02a4 }
            r1.f5367i = r0     // Catch:{ all -> 0x02a4 }
            if (r0 != 0) goto L_0x0086
            p.y.l r0 = p124p.p199y.C1800l.m4460a()     // Catch:{ all -> 0x02a4 }
            java.lang.String r2 = f5362x     // Catch:{ all -> 0x02a4 }
            java.lang.String r4 = "Didn't find WorkSpec for id %s"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x02a4 }
            java.lang.String r5 = r1.f5364f     // Catch:{ all -> 0x02a4 }
            r3[r6] = r5     // Catch:{ all -> 0x02a4 }
            java.lang.String r3 = java.lang.String.format(r4, r3)     // Catch:{ all -> 0x02a4 }
            java.lang.Throwable[] r4 = new java.lang.Throwable[r6]     // Catch:{ all -> 0x02a4 }
            r0.mo6783b(r2, r3, r4)     // Catch:{ all -> 0x02a4 }
            r1.mo6822a(r6)     // Catch:{ all -> 0x02a4 }
        L_0x007f:
            androidx.work.impl.WorkDatabase r0 = r1.f5373o
            r0.mo6417d()
            goto L_0x0292
        L_0x0086:
            p.y.t r2 = r0.f5528b     // Catch:{ all -> 0x02a4 }
            p.y.t r4 = p124p.p199y.C1816t.ENQUEUED     // Catch:{ all -> 0x02a4 }
            if (r2 == r4) goto L_0x00ae
            r18.mo6825d()     // Catch:{ all -> 0x02a4 }
            androidx.work.impl.WorkDatabase r0 = r1.f5373o     // Catch:{ all -> 0x02a4 }
            r0.mo6420g()     // Catch:{ all -> 0x02a4 }
            p.y.l r0 = p124p.p199y.C1800l.m4460a()     // Catch:{ all -> 0x02a4 }
            java.lang.String r2 = f5362x     // Catch:{ all -> 0x02a4 }
            java.lang.String r4 = "%s is not in ENQUEUED state. Nothing more to do."
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x02a4 }
            p.y.x.s.p r5 = r1.f5367i     // Catch:{ all -> 0x02a4 }
            java.lang.String r5 = r5.f5529c     // Catch:{ all -> 0x02a4 }
            r3[r6] = r5     // Catch:{ all -> 0x02a4 }
            java.lang.String r3 = java.lang.String.format(r4, r3)     // Catch:{ all -> 0x02a4 }
            java.lang.Throwable[] r4 = new java.lang.Throwable[r6]     // Catch:{ all -> 0x02a4 }
            r0.mo6782a(r2, r3, r4)     // Catch:{ all -> 0x02a4 }
            goto L_0x007f
        L_0x00ae:
            boolean r0 = r0.mo6895c()     // Catch:{ all -> 0x02a4 }
            if (r0 != 0) goto L_0x00c5
            p.y.x.s.p r0 = r1.f5367i     // Catch:{ all -> 0x02a4 }
            p.y.t r2 = r0.f5528b     // Catch:{ all -> 0x02a4 }
            p.y.t r4 = p124p.p199y.C1816t.ENQUEUED     // Catch:{ all -> 0x02a4 }
            if (r2 != r4) goto L_0x00c2
            int r0 = r0.f5537k     // Catch:{ all -> 0x02a4 }
            if (r0 <= 0) goto L_0x00c2
            r0 = r3
            goto L_0x00c3
        L_0x00c2:
            r0 = r6
        L_0x00c3:
            if (r0 == 0) goto L_0x00ff
        L_0x00c5:
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x02a4 }
            p.y.x.s.p r0 = r1.f5367i     // Catch:{ all -> 0x02a4 }
            long r7 = r0.f5540n     // Catch:{ all -> 0x02a4 }
            r9 = 0
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x00d5
            r0 = r3
            goto L_0x00d6
        L_0x00d5:
            r0 = r6
        L_0x00d6:
            if (r0 != 0) goto L_0x00ff
            p.y.x.s.p r0 = r1.f5367i     // Catch:{ all -> 0x02a4 }
            long r7 = r0.mo6893a()     // Catch:{ all -> 0x02a4 }
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ff
            p.y.l r0 = p124p.p199y.C1800l.m4460a()     // Catch:{ all -> 0x02a4 }
            java.lang.String r2 = f5362x     // Catch:{ all -> 0x02a4 }
            java.lang.String r4 = "Delaying execution for %s because it is being executed before schedule."
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ all -> 0x02a4 }
            p.y.x.s.p r7 = r1.f5367i     // Catch:{ all -> 0x02a4 }
            java.lang.String r7 = r7.f5529c     // Catch:{ all -> 0x02a4 }
            r5[r6] = r7     // Catch:{ all -> 0x02a4 }
            java.lang.String r4 = java.lang.String.format(r4, r5)     // Catch:{ all -> 0x02a4 }
            java.lang.Throwable[] r5 = new java.lang.Throwable[r6]     // Catch:{ all -> 0x02a4 }
            r0.mo6782a(r2, r4, r5)     // Catch:{ all -> 0x02a4 }
            r1.mo6822a(r3)     // Catch:{ all -> 0x02a4 }
            goto L_0x007f
        L_0x00ff:
            androidx.work.impl.WorkDatabase r0 = r1.f5373o     // Catch:{ all -> 0x02a4 }
            r0.mo6420g()     // Catch:{ all -> 0x02a4 }
            androidx.work.impl.WorkDatabase r0 = r1.f5373o
            r0.mo6417d()
            p.y.x.s.p r0 = r1.f5367i
            boolean r0 = r0.mo6895c()
            if (r0 == 0) goto L_0x0118
            p.y.x.s.p r0 = r1.f5367i
            p.y.e r0 = r0.f5531e
        L_0x0115:
            r9 = r0
            goto L_0x019f
        L_0x0118:
            p.y.b r0 = r1.f5370l
            p.y.k r0 = r0.f5228d
            p.y.x.s.p r2 = r1.f5367i
            java.lang.String r2 = r2.f5530d
            r4 = 0
            if (r0 == 0) goto L_0x02a3
            p.y.i r0 = p124p.p199y.C1797i.m4457a(r2)
            if (r0 != 0) goto L_0x0147
            p.y.l r0 = p124p.p199y.C1800l.m4460a()
            java.lang.String r2 = f5362x
            java.lang.Object[] r3 = new java.lang.Object[r3]
            p.y.x.s.p r4 = r1.f5367i
            java.lang.String r4 = r4.f5530d
            r3[r6] = r4
            java.lang.String r4 = "Could not create Input Merger %s"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            java.lang.Throwable[] r4 = new java.lang.Throwable[r6]
            r0.mo6783b(r2, r3, r4)
        L_0x0142:
            r18.mo6826e()
            goto L_0x0292
        L_0x0147:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            p.y.x.s.p r5 = r1.f5367i
            p.y.e r5 = r5.f5531e
            r2.add(r5)
            p.y.x.s.q r5 = r1.f5374p
            java.lang.String r7 = r1.f5364f
            p.y.x.s.r r5 = (p124p.p199y.p200x.p209s.C1916r) r5
            if (r5 == 0) goto L_0x02a2
            java.lang.String r8 = "SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)"
            p.q.i r8 = p124p.p182q.C1646i.m4184a(r8, r3)
            if (r7 != 0) goto L_0x0167
            r8.bindNull(r3)
            goto L_0x016a
        L_0x0167:
            r8.bindString(r3, r7)
        L_0x016a:
            p.q.g r7 = r5.f5546a
            r7.mo6415b()
            p.q.g r5 = r5.f5546a
            android.database.Cursor r4 = p124p.p182q.p184m.C1651b.m4197a(r5, r8, r6, r4)
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x029a }
            int r7 = r4.getCount()     // Catch:{ all -> 0x029a }
            r5.<init>(r7)     // Catch:{ all -> 0x029a }
        L_0x017e:
            boolean r7 = r4.moveToNext()     // Catch:{ all -> 0x029a }
            if (r7 == 0) goto L_0x0190
            byte[] r7 = r4.getBlob(r6)     // Catch:{ all -> 0x029a }
            p.y.e r7 = p124p.p199y.C1792e.m4454b(r7)     // Catch:{ all -> 0x029a }
            r5.add(r7)     // Catch:{ all -> 0x029a }
            goto L_0x017e
        L_0x0190:
            r4.close()
            r8.mo6434f()
            r2.addAll(r5)
            p.y.e r0 = r0.mo1441a(r2)
            goto L_0x0115
        L_0x019f:
            androidx.work.WorkerParameters r0 = new androidx.work.WorkerParameters
            java.lang.String r2 = r1.f5364f
            java.util.UUID r8 = java.util.UUID.fromString(r2)
            java.util.List<java.lang.String> r10 = r1.f5377s
            androidx.work.WorkerParameters$a r11 = r1.f5366h
            p.y.x.s.p r2 = r1.f5367i
            int r12 = r2.f5537k
            p.y.b r2 = r1.f5370l
            java.util.concurrent.Executor r13 = r2.f5225a
            p.y.x.t.q.a r14 = r1.f5371m
            p.y.w r15 = r2.f5227c
            p.y.x.t.n r2 = new p.y.x.t.n
            androidx.work.impl.WorkDatabase r4 = r1.f5373o
            p.y.x.t.q.a r5 = r1.f5371m
            r2.<init>(r4, r5)
            p.y.x.t.m r4 = new p.y.x.t.m
            androidx.work.impl.WorkDatabase r5 = r1.f5373o
            p.y.x.r.a r7 = r1.f5372n
            p.y.x.t.q.a r6 = r1.f5371m
            r4.<init>(r5, r7, r6)
            r7 = r0
            r16 = r2
            r17 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            androidx.work.ListenableWorker r2 = r1.f5368j
            if (r2 != 0) goto L_0x01e7
            p.y.b r2 = r1.f5370l
            p.y.w r2 = r2.f5227c
            android.content.Context r4 = r1.f5363e
            p.y.x.s.p r5 = r1.f5367i
            java.lang.String r5 = r5.f5529c
            androidx.work.ListenableWorker r0 = r2.mo6795a(r4, r5, r0)
            r1.f5368j = r0
        L_0x01e7:
            androidx.work.ListenableWorker r0 = r1.f5368j
            if (r0 != 0) goto L_0x0207
            p.y.l r0 = p124p.p199y.C1800l.m4460a()
            java.lang.String r2 = f5362x
            java.lang.Object[] r3 = new java.lang.Object[r3]
            p.y.x.s.p r4 = r1.f5367i
            java.lang.String r4 = r4.f5529c
            r5 = 0
            r3[r5] = r4
            java.lang.String r4 = "Could not create Worker %s"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            java.lang.Throwable[] r4 = new java.lang.Throwable[r5]
            r0.mo6783b(r2, r3, r4)
            goto L_0x0142
        L_0x0207:
            r5 = 0
            boolean r2 = r0.f980g
            if (r2 == 0) goto L_0x0227
            p.y.l r0 = p124p.p199y.C1800l.m4460a()
            java.lang.String r2 = f5362x
            java.lang.Object[] r3 = new java.lang.Object[r3]
            p.y.x.s.p r4 = r1.f5367i
            java.lang.String r4 = r4.f5529c
            r3[r5] = r4
            java.lang.String r4 = "Received an already-used Worker %s; WorkerFactory should return new instances"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            java.lang.Throwable[] r4 = new java.lang.Throwable[r5]
            r0.mo6783b(r2, r3, r4)
            goto L_0x0142
        L_0x0227:
            r0.f980g = r3
            androidx.work.impl.WorkDatabase r0 = r1.f5373o
            r0.mo6416c()
            p.y.x.s.q r0 = r1.f5374p     // Catch:{ all -> 0x0293 }
            java.lang.String r2 = r1.f5364f     // Catch:{ all -> 0x0293 }
            p.y.x.s.r r0 = (p124p.p199y.p200x.p209s.C1916r) r0
            p.y.t r0 = r0.mo6908b(r2)     // Catch:{ all -> 0x0293 }
            p.y.t r2 = p124p.p199y.C1816t.ENQUEUED     // Catch:{ all -> 0x0293 }
            if (r0 != r2) goto L_0x0256
            p.y.x.s.q r0 = r1.f5374p     // Catch:{ all -> 0x0293 }
            p.y.t r2 = p124p.p199y.C1816t.RUNNING     // Catch:{ all -> 0x0293 }
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch:{ all -> 0x0293 }
            java.lang.String r5 = r1.f5364f     // Catch:{ all -> 0x0293 }
            r6 = 0
            r4[r6] = r5     // Catch:{ all -> 0x0293 }
            p.y.x.s.r r0 = (p124p.p199y.p200x.p209s.C1916r) r0
            r0.mo6902a(r2, r4)     // Catch:{ all -> 0x0293 }
            p.y.x.s.q r0 = r1.f5374p     // Catch:{ all -> 0x0293 }
            java.lang.String r2 = r1.f5364f     // Catch:{ all -> 0x0293 }
            p.y.x.s.r r0 = (p124p.p199y.p200x.p209s.C1916r) r0
            r0.mo6916g(r2)     // Catch:{ all -> 0x0293 }
            goto L_0x0258
        L_0x0256:
            r6 = 0
            r3 = r6
        L_0x0258:
            androidx.work.impl.WorkDatabase r0 = r1.f5373o     // Catch:{ all -> 0x0293 }
            r0.mo6420g()     // Catch:{ all -> 0x0293 }
            androidx.work.impl.WorkDatabase r0 = r1.f5373o
            r0.mo6417d()
            if (r3 == 0) goto L_0x028f
            boolean r0 = r18.mo6827f()
            if (r0 == 0) goto L_0x026b
            goto L_0x0292
        L_0x026b:
            p.y.x.t.p.c r0 = new p.y.x.t.p.c
            r0.<init>()
            p.y.x.t.q.a r2 = r1.f5371m
            p.y.x.t.q.b r2 = (p124p.p199y.p200x.p210t.p212q.C1963b) r2
            java.util.concurrent.Executor r2 = r2.f5628c
            p.y.x.m r3 = new p.y.x.m
            r3.<init>(r1, r0)
            r2.execute(r3)
            java.lang.String r2 = r1.f5378t
            p.y.x.n r3 = new p.y.x.n
            r3.<init>(r1, r0, r2)
            p.y.x.t.q.a r2 = r1.f5371m
            p.y.x.t.q.b r2 = (p124p.p199y.p200x.p210t.p212q.C1963b) r2
            p.y.x.t.i r2 = r2.f5626a
            r0.mo6940a(r3, r2)
            goto L_0x0292
        L_0x028f:
            r18.mo6825d()
        L_0x0292:
            return
        L_0x0293:
            r0 = move-exception
            androidx.work.impl.WorkDatabase r2 = r1.f5373o
            r2.mo6417d()
            throw r0
        L_0x029a:
            r0 = move-exception
            r4.close()
            r8.mo6434f()
            throw r0
        L_0x02a2:
            throw r4
        L_0x02a3:
            throw r4
        L_0x02a4:
            r0 = move-exception
            androidx.work.impl.WorkDatabase r2 = r1.f5373o
            r2.mo6417d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p199y.p200x.C1845o.run():void");
    }
}
