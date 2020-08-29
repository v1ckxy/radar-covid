package p124p.p199y.p200x.p210t;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.HashSet;
import p124p.p199y.C1788c;
import p124p.p199y.C1792e.C1793a;
import p124p.p199y.C1800l;
import p124p.p199y.C1805o;
import p124p.p199y.C1805o.C1807b.C1808a;
import p124p.p199y.p200x.C1824c;
import p124p.p199y.p200x.C1828f;
import p124p.p199y.p200x.C1829g;
import p124p.p199y.p200x.C1842l;
import p124p.p199y.p200x.p209s.C1913p;

/* renamed from: p.y.x.t.e */
public class C1934e implements Runnable {

    /* renamed from: g */
    public static final String f5567g = C1800l.m4459a("EnqueueRunnable");

    /* renamed from: e */
    public final C1829g f5568e;

    /* renamed from: f */
    public final C1824c f5569f = new C1824c();

    public C1934e(C1829g gVar) {
        this.f5568e = gVar;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r13v5 */
    /* JADX WARNING: type inference failed for: r13v6, types: [int] */
    /* JADX WARNING: type inference failed for: r13v7, types: [int] */
    /* JADX WARNING: type inference failed for: r12v3, types: [java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r12v4, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r12v7, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r4v25 */
    /* JADX WARNING: type inference failed for: r4v31 */
    /* JADX WARNING: type inference failed for: r4v32 */
    /* JADX WARNING: type inference failed for: r13v30 */
    /* JADX WARNING: type inference failed for: r12v11 */
    /* JADX WARNING: type inference failed for: r12v12 */
    /* JADX WARNING: type inference failed for: r4v33 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r4v1
      assigns: []
      uses: []
      mth insns count: 341
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
    /* JADX WARNING: Removed duplicated region for block: B:117:0x021c  */
    /* JADX WARNING: Unknown variable types count: 8 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m4701a(p124p.p199y.p200x.C1829g r21) {
        /*
            r0 = r21
            java.util.List<p.y.x.g> r1 = r0.f5331g
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0041
            java.util.Iterator r1 = r1.iterator()
            r4 = r2
        L_0x000d:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0042
            java.lang.Object r5 = r1.next()
            p.y.x.g r5 = (p124p.p199y.p200x.C1829g) r5
            boolean r6 = r5.f5332h
            if (r6 != 0) goto L_0x0023
            boolean r5 = m4701a(r5)
            r4 = r4 | r5
            goto L_0x000d
        L_0x0023:
            p.y.l r6 = p124p.p199y.C1800l.m4460a()
            java.lang.String r7 = f5567g
            java.lang.Object[] r8 = new java.lang.Object[r3]
            java.util.List<java.lang.String> r5 = r5.f5329e
            java.lang.String r9 = ", "
            java.lang.String r5 = android.text.TextUtils.join(r9, r5)
            r8[r2] = r5
            java.lang.String r5 = "Already enqueued work ids (%s)."
            java.lang.String r5 = java.lang.String.format(r5, r8)
            java.lang.Throwable[] r8 = new java.lang.Throwable[r2]
            r6.mo6785d(r7, r5, r8)
            goto L_0x000d
        L_0x0041:
            r4 = r2
        L_0x0042:
            java.util.Set r1 = p124p.p199y.p200x.C1829g.m4502a(r21)
            p.y.x.l r5 = r0.f5325a
            java.util.List<? extends p.y.v> r6 = r0.f5328d
            java.lang.String[] r7 = new java.lang.String[r2]
            java.util.AbstractCollection r1 = (java.util.AbstractCollection) r1
            java.lang.Object[] r1 = r1.toArray(r7)
            java.lang.String[] r1 = (java.lang.String[]) r1
            java.lang.String r7 = r0.f5326b
            p.y.g r8 = r0.f5327c
            long r9 = java.lang.System.currentTimeMillis()
            androidx.work.impl.WorkDatabase r11 = r5.f5350c
            if (r1 == 0) goto L_0x0065
            int r12 = r1.length
            if (r12 <= 0) goto L_0x0065
            r12 = r3
            goto L_0x0066
        L_0x0065:
            r12 = r2
        L_0x0066:
            if (r12 == 0) goto L_0x00b6
            int r13 = r1.length
            r14 = r2
            r16 = r14
            r17 = r16
            r15 = r3
        L_0x006f:
            if (r14 >= r13) goto L_0x00bb
            r2 = r1[r14]
            p.y.x.s.q r18 = r11.mo1462m()
            r3 = r18
            p.y.x.s.r r3 = (p124p.p199y.p200x.p209s.C1916r) r3
            p.y.x.s.p r3 = r3.mo6914e(r2)
            if (r3 != 0) goto L_0x009a
            p.y.l r1 = p124p.p199y.C1800l.m4460a()
            java.lang.String r3 = f5567g
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r5 = 0
            r6[r5] = r2
            java.lang.String r2 = "Prerequisite %s doesn't exist; not enqueuing"
            java.lang.String r2 = java.lang.String.format(r2, r6)
            java.lang.Throwable[] r6 = new java.lang.Throwable[r5]
            r1.mo6783b(r3, r2, r6)
            goto L_0x0103
        L_0x009a:
            p.y.t r2 = r3.f5528b
            p.y.t r3 = p124p.p199y.C1816t.SUCCEEDED
            if (r2 != r3) goto L_0x00a2
            r3 = 1
            goto L_0x00a3
        L_0x00a2:
            r3 = 0
        L_0x00a3:
            r15 = r15 & r3
            p.y.t r3 = p124p.p199y.C1816t.FAILED
            if (r2 != r3) goto L_0x00ab
            r16 = 1
            goto L_0x00b1
        L_0x00ab:
            p.y.t r3 = p124p.p199y.C1816t.CANCELLED
            if (r2 != r3) goto L_0x00b1
            r17 = 1
        L_0x00b1:
            int r14 = r14 + 1
            r2 = 0
            r3 = 1
            goto L_0x006f
        L_0x00b6:
            r15 = 1
            r16 = 0
            r17 = 0
        L_0x00bb:
            boolean r2 = android.text.TextUtils.isEmpty(r7)
            r3 = 1
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x00c7
            if (r12 != 0) goto L_0x00c7
            r3 = 1
            goto L_0x00c8
        L_0x00c7:
            r3 = 0
        L_0x00c8:
            if (r3 == 0) goto L_0x020e
            p.y.x.s.q r3 = r11.mo1462m()
            p.y.x.s.r r3 = (p124p.p199y.p200x.p209s.C1916r) r3
            java.util.List r3 = r3.mo6915f(r7)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            boolean r13 = r3.isEmpty()
            if (r13 != 0) goto L_0x020e
            p.y.g r13 = p124p.p199y.C1795g.APPEND
            if (r8 == r13) goto L_0x0135
            p.y.g r13 = p124p.p199y.C1795g.APPEND_OR_REPLACE
            if (r8 != r13) goto L_0x00e5
            goto L_0x0135
        L_0x00e5:
            p.y.g r13 = p124p.p199y.C1795g.KEEP
            if (r8 != r13) goto L_0x0109
            java.util.Iterator r8 = r3.iterator()
        L_0x00ed:
            boolean r13 = r8.hasNext()
            if (r13 == 0) goto L_0x0109
            java.lang.Object r13 = r8.next()
            p.y.x.s.p$a r13 = (p124p.p199y.p200x.p209s.C1913p.C1914a) r13
            p.y.t r13 = r13.f5545b
            p.y.t r14 = p124p.p199y.C1816t.ENQUEUED
            if (r13 == r14) goto L_0x0103
            p.y.t r14 = p124p.p199y.C1816t.RUNNING
            if (r13 != r14) goto L_0x00ed
        L_0x0103:
            r20 = r4
            r1 = 1
            r2 = 0
            goto L_0x0336
        L_0x0109:
            p.y.x.t.c r8 = new p.y.x.t.c
            r13 = 0
            r8.<init>(r5, r7, r13)
            r8.run()
            p.y.x.s.q r5 = r11.mo1462m()
            java.util.Iterator r3 = r3.iterator()
        L_0x011a:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x012f
            java.lang.Object r8 = r3.next()
            p.y.x.s.p$a r8 = (p124p.p199y.p200x.p209s.C1913p.C1914a) r8
            java.lang.String r8 = r8.f5544a
            r13 = r5
            p.y.x.s.r r13 = (p124p.p199y.p200x.p209s.C1916r) r13
            r13.mo6905a(r8)
            goto L_0x011a
        L_0x012f:
            r20 = r4
            r4 = 0
            r5 = 1
            goto L_0x0212
        L_0x0135:
            p.y.x.s.b r5 = r11.mo1457h()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0142:
            boolean r13 = r3.hasNext()
            if (r13 == 0) goto L_0x01c6
            java.lang.Object r13 = r3.next()
            p.y.x.s.p$a r13 = (p124p.p199y.p200x.p209s.C1913p.C1914a) r13
            java.lang.String r14 = r13.f5544a
            r18 = r3
            r3 = r5
            p.y.x.s.c r3 = (p124p.p199y.p200x.p209s.C1892c) r3
            r19 = r5
            if (r3 == 0) goto L_0x01c4
            java.lang.String r5 = "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?"
            r20 = r4
            r4 = 1
            p.q.i r5 = p124p.p182q.C1646i.m4184a(r5, r4)
            if (r14 != 0) goto L_0x0168
            r5.bindNull(r4)
            goto L_0x016b
        L_0x0168:
            r5.bindString(r4, r14)
        L_0x016b:
            p.q.g r4 = r3.f5506a
            r4.mo6415b()
            p.q.g r3 = r3.f5506a
            r4 = 0
            r14 = 0
            android.database.Cursor r3 = p124p.p182q.p184m.C1651b.m4197a(r3, r5, r4, r14)
            boolean r14 = r3.moveToFirst()     // Catch:{ all -> 0x01bc }
            if (r14 == 0) goto L_0x0186
            int r14 = r3.getInt(r4)     // Catch:{ all -> 0x01bc }
            if (r14 == 0) goto L_0x0186
            r14 = 1
            goto L_0x0187
        L_0x0186:
            r14 = r4
        L_0x0187:
            r3.close()
            r5.mo6434f()
            if (r14 != 0) goto L_0x01b5
            p.y.t r3 = r13.f5545b
            p.y.t r5 = p124p.p199y.C1816t.SUCCEEDED
            if (r3 != r5) goto L_0x0197
            r5 = 1
            goto L_0x0198
        L_0x0197:
            r5 = r4
        L_0x0198:
            r3 = r5 & r15
            p.y.t r5 = r13.f5545b
            p.y.t r14 = p124p.p199y.C1816t.FAILED
            if (r5 != r14) goto L_0x01a2
            r5 = 1
            goto L_0x01ad
        L_0x01a2:
            p.y.t r14 = p124p.p199y.C1816t.CANCELLED
            if (r5 != r14) goto L_0x01ab
            r5 = r16
            r17 = 1
            goto L_0x01ad
        L_0x01ab:
            r5 = r16
        L_0x01ad:
            java.lang.String r13 = r13.f5544a
            r12.add(r13)
            r15 = r3
            r16 = r5
        L_0x01b5:
            r3 = r18
            r5 = r19
            r4 = r20
            goto L_0x0142
        L_0x01bc:
            r0 = move-exception
            r3.close()
            r5.mo6434f()
            throw r0
        L_0x01c4:
            r0 = 0
            throw r0
        L_0x01c6:
            r20 = r4
            r4 = 0
            p.y.g r3 = p124p.p199y.C1795g.APPEND_OR_REPLACE
            if (r8 != r3) goto L_0x01fb
            if (r17 != 0) goto L_0x01d1
            if (r16 == 0) goto L_0x01fb
        L_0x01d1:
            p.y.x.s.q r3 = r11.mo1462m()
            p.y.x.s.r r3 = (p124p.p199y.p200x.p209s.C1916r) r3
            java.util.List r5 = r3.mo6915f(r7)
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.util.Iterator r5 = r5.iterator()
        L_0x01e1:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x01f3
            java.lang.Object r8 = r5.next()
            p.y.x.s.p$a r8 = (p124p.p199y.p200x.p209s.C1913p.C1914a) r8
            java.lang.String r8 = r8.f5544a
            r3.mo6905a(r8)
            goto L_0x01e1
        L_0x01f3:
            java.util.List r12 = java.util.Collections.emptyList()
            r5 = r4
            r17 = r5
            goto L_0x01fd
        L_0x01fb:
            r5 = r16
        L_0x01fd:
            java.lang.Object[] r1 = r12.toArray(r1)
            java.lang.String[] r1 = (java.lang.String[]) r1
            int r3 = r1.length
            if (r3 <= 0) goto L_0x020a
            r16 = r5
            r12 = 1
            goto L_0x0211
        L_0x020a:
            r12 = r4
            r16 = r5
            goto L_0x0211
        L_0x020e:
            r20 = r4
            r4 = 0
        L_0x0211:
            r5 = r4
        L_0x0212:
            java.util.Iterator r3 = r6.iterator()
        L_0x0216:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0334
            java.lang.Object r6 = r3.next()
            p.y.v r6 = (p124p.p199y.C1818v) r6
            p.y.x.s.p r8 = r6.f5298b
            if (r12 == 0) goto L_0x0237
            if (r15 != 0) goto L_0x0237
            if (r16 == 0) goto L_0x022d
            p.y.t r13 = p124p.p199y.C1816t.FAILED
            goto L_0x0234
        L_0x022d:
            if (r17 == 0) goto L_0x0232
            p.y.t r13 = p124p.p199y.C1816t.CANCELLED
            goto L_0x0234
        L_0x0232:
            p.y.t r13 = p124p.p199y.C1816t.BLOCKED
        L_0x0234:
            r8.f5528b = r13
            goto L_0x0244
        L_0x0237:
            boolean r13 = r8.mo6895c()
            if (r13 != 0) goto L_0x0240
            r8.f5540n = r9
            goto L_0x0244
        L_0x0240:
            r13 = 0
            r8.f5540n = r13
        L_0x0244:
            int r13 = android.os.Build.VERSION.SDK_INT
            r14 = 25
            if (r13 > r14) goto L_0x024d
            m4700a(r8)
        L_0x024d:
            p.y.t r13 = r8.f5528b
            p.y.t r14 = p124p.p199y.C1816t.ENQUEUED
            if (r13 != r14) goto L_0x0254
            r5 = 1
        L_0x0254:
            p.y.x.s.q r13 = r11.mo1462m()
            p.y.x.s.r r13 = (p124p.p199y.p200x.p209s.C1916r) r13
            p.q.g r14 = r13.f5546a
            r14.mo6415b()
            p.q.g r14 = r13.f5546a
            r14.mo6416c()
            p.q.b<p.y.x.s.p> r14 = r13.f5547b     // Catch:{ all -> 0x032d }
            r14.mo6382a(r8)     // Catch:{ all -> 0x032d }
            p.q.g r8 = r13.f5546a     // Catch:{ all -> 0x032d }
            r8.mo6420g()     // Catch:{ all -> 0x032d }
            p.q.g r8 = r13.f5546a
            r8.mo6417d()
            if (r12 == 0) goto L_0x02b2
            int r8 = r1.length
            r13 = r4
        L_0x0277:
            if (r13 >= r8) goto L_0x02b2
            r14 = r1[r13]
            p.y.x.s.a r4 = new p.y.x.s.a
            r18 = r1
            java.lang.String r1 = r6.mo6793a()
            r4.<init>(r1, r14)
            p.y.x.s.b r1 = r11.mo1457h()
            p.y.x.s.c r1 = (p124p.p199y.p200x.p209s.C1892c) r1
            p.q.g r14 = r1.f5506a
            r14.mo6415b()
            p.q.g r14 = r1.f5506a
            r14.mo6416c()
            p.q.b<p.y.x.s.a> r14 = r1.f5507b     // Catch:{ all -> 0x02ab }
            r14.mo6382a(r4)     // Catch:{ all -> 0x02ab }
            p.q.g r4 = r1.f5506a     // Catch:{ all -> 0x02ab }
            r4.mo6420g()     // Catch:{ all -> 0x02ab }
            p.q.g r1 = r1.f5506a
            r1.mo6417d()
            int r13 = r13 + 1
            r1 = r18
            r4 = 0
            goto L_0x0277
        L_0x02ab:
            r0 = move-exception
            p.q.g r1 = r1.f5506a
            r1.mo6417d()
            throw r0
        L_0x02b2:
            r18 = r1
            java.util.Set<java.lang.String> r1 = r6.f5299c
            java.util.Iterator r1 = r1.iterator()
        L_0x02ba:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x02f6
            java.lang.Object r4 = r1.next()
            java.lang.String r4 = (java.lang.String) r4
            p.y.x.s.t r8 = r11.mo1463n()
            p.y.x.s.s r13 = new p.y.x.s.s
            java.lang.String r14 = r6.mo6793a()
            r13.<init>(r4, r14)
            p.y.x.s.u r8 = (p124p.p199y.p200x.p209s.C1928u) r8
            p.q.g r4 = r8.f5557a
            r4.mo6415b()
            p.q.g r4 = r8.f5557a
            r4.mo6416c()
            p.q.b<p.y.x.s.s> r4 = r8.f5558b     // Catch:{ all -> 0x02ef }
            r4.mo6382a(r13)     // Catch:{ all -> 0x02ef }
            p.q.g r4 = r8.f5557a     // Catch:{ all -> 0x02ef }
            r4.mo6420g()     // Catch:{ all -> 0x02ef }
            p.q.g r4 = r8.f5557a
            r4.mo6417d()
            goto L_0x02ba
        L_0x02ef:
            r0 = move-exception
            p.q.g r1 = r8.f5557a
            r1.mo6417d()
            throw r0
        L_0x02f6:
            if (r2 == 0) goto L_0x0328
            p.y.x.s.k r1 = r11.mo1460k()
            p.y.x.s.j r4 = new p.y.x.s.j
            java.lang.String r6 = r6.mo6793a()
            r4.<init>(r7, r6)
            p.y.x.s.l r1 = (p124p.p199y.p200x.p209s.C1905l) r1
            p.q.g r6 = r1.f5519a
            r6.mo6415b()
            p.q.g r6 = r1.f5519a
            r6.mo6416c()
            p.q.b<p.y.x.s.j> r6 = r1.f5520b     // Catch:{ all -> 0x0321 }
            r6.mo6382a(r4)     // Catch:{ all -> 0x0321 }
            p.q.g r4 = r1.f5519a     // Catch:{ all -> 0x0321 }
            r4.mo6420g()     // Catch:{ all -> 0x0321 }
            p.q.g r1 = r1.f5519a
            r1.mo6417d()
            goto L_0x0328
        L_0x0321:
            r0 = move-exception
            p.q.g r1 = r1.f5519a
            r1.mo6417d()
            throw r0
        L_0x0328:
            r1 = r18
            r4 = 0
            goto L_0x0216
        L_0x032d:
            r0 = move-exception
            p.q.g r1 = r13.f5546a
            r1.mo6417d()
            throw r0
        L_0x0334:
            r2 = r5
            r1 = 1
        L_0x0336:
            r0.f5332h = r1
            r0 = r20 | r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p199y.p200x.p210t.C1934e.m4701a(p.y.x.g):boolean");
    }

    public void run() {
        WorkDatabase workDatabase;
        try {
            C1829g gVar = this.f5568e;
            if (gVar == null) {
                throw null;
            } else if (!C1829g.m4503a(gVar, new HashSet())) {
                workDatabase = this.f5568e.f5325a.f5350c;
                workDatabase.mo6416c();
                boolean a = m4701a(this.f5568e);
                workDatabase.mo6420g();
                workDatabase.mo6417d();
                if (a) {
                    C1936g.m4705a(this.f5568e.f5325a.f5348a, RescheduleReceiver.class, true);
                    C1842l lVar = this.f5568e.f5325a;
                    C1828f.m4501a(lVar.f5349b, lVar.f5350c, lVar.f5352e);
                }
                this.f5569f.mo6796a(C1805o.f5287a);
            } else {
                throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", new Object[]{this.f5568e}));
            }
        } catch (Throwable th) {
            this.f5569f.mo6796a(new C1808a(th));
        }
    }

    /* renamed from: a */
    public static void m4700a(C1913p pVar) {
        C1788c cVar = pVar.f5536j;
        if (cVar.f5247d || cVar.f5248e) {
            String str = pVar.f5529c;
            C1793a aVar = new C1793a();
            aVar.mo6777a(pVar.f5531e.f5265a);
            aVar.f5266a.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            pVar.f5529c = ConstraintTrackingWorker.class.getName();
            pVar.f5531e = aVar.mo6778a();
        }
    }
}
