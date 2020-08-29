package p410v.p411m0.p416g;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.C4557i;
import p392u.C4561m;
import p392u.p401r.p403c.C4638h;
import p410v.p411m0.C4737b;
import p410v.p411m0.p416g.C4814k.C4816b;
import p410v.p411m0.p418i.C4839f;
import p410v.p411m0.p418i.C4839f.C4840a;
import p423w.C4892f;
import p423w.C4895h;
import p423w.C4896i;
import p423w.C4897j;

/* renamed from: v.m0.g.f */
public final class C4797f implements Closeable {

    /* renamed from: z */
    public static final ThreadPoolExecutor f11383z;

    /* renamed from: e */
    public final boolean f11384e;

    /* renamed from: f */
    public final C4800c f11385f;

    /* renamed from: g */
    public final Map<Integer, C4817l> f11386g;

    /* renamed from: h */
    public final String f11387h;

    /* renamed from: i */
    public int f11388i;

    /* renamed from: j */
    public int f11389j;

    /* renamed from: k */
    public boolean f11390k;

    /* renamed from: l */
    public final ScheduledThreadPoolExecutor f11391l;

    /* renamed from: m */
    public final ThreadPoolExecutor f11392m;

    /* renamed from: n */
    public final C4824p f11393n;

    /* renamed from: o */
    public boolean f11394o;

    /* renamed from: p */
    public final C4825q f11395p;

    /* renamed from: q */
    public final C4825q f11396q;

    /* renamed from: r */
    public long f11397r;

    /* renamed from: s */
    public long f11398s;

    /* renamed from: t */
    public long f11399t;

    /* renamed from: u */
    public long f11400u;

    /* renamed from: v */
    public final Socket f11401v;

    /* renamed from: w */
    public final C4821m f11402w;

    /* renamed from: x */
    public final C4802d f11403x;

    /* renamed from: y */
    public final Set<Integer> f11404y;

    /* renamed from: v.m0.g.f$a */
    public static final class C4798a implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ C4797f f11405e;

        public C4798a(C4797f fVar) {
            this.f11405e = fVar;
        }

        public final void run() {
            String a = C1965a.m4754a(C1965a.m4756a("OkHttp "), this.f11405e.f11387h, " ping");
            Thread currentThread = Thread.currentThread();
            C4638h.m10270a((Object) currentThread, "currentThread");
            String name = currentThread.getName();
            currentThread.setName(a);
            try {
                this.f11405e.mo11214a(false, 0, 0);
            } finally {
                currentThread.setName(name);
            }
        }
    }

    /* renamed from: v.m0.g.f$b */
    public static final class C4799b {

        /* renamed from: a */
        public Socket f11406a;

        /* renamed from: b */
        public String f11407b;

        /* renamed from: c */
        public C4896i f11408c;

        /* renamed from: d */
        public C4895h f11409d;

        /* renamed from: e */
        public C4800c f11410e = C4800c.f11414a;

        /* renamed from: f */
        public C4824p f11411f = C4824p.f11516a;

        /* renamed from: g */
        public int f11412g;

        /* renamed from: h */
        public boolean f11413h;

        public C4799b(boolean z) {
            this.f11413h = z;
        }
    }

    /* renamed from: v.m0.g.f$c */
    public static abstract class C4800c {

        /* renamed from: a */
        public static final C4800c f11414a = new C4801a();

        /* renamed from: v.m0.g.f$c$a */
        public static final class C4801a extends C4800c {
            /* renamed from: a */
            public void mo11129a(C4817l lVar) {
                if (lVar != null) {
                    lVar.mo11251a(C4790b.REFUSED_STREAM, (IOException) null);
                } else {
                    C4638h.m10271a("stream");
                    throw null;
                }
            }
        }

        /* renamed from: a */
        public void mo11128a(C4797f fVar) {
            if (fVar == null) {
                C4638h.m10271a("connection");
                throw null;
            }
        }

        /* renamed from: a */
        public abstract void mo11129a(C4817l lVar);
    }

    /* renamed from: v.m0.g.f$d */
    public final class C4802d implements Runnable, C4816b {

        /* renamed from: e */
        public final C4814k f11415e;

        /* renamed from: f */
        public final /* synthetic */ C4797f f11416f;

        /* renamed from: v.m0.g.f$d$a */
        public static final class C4803a implements Runnable {

            /* renamed from: e */
            public final /* synthetic */ String f11417e;

            /* renamed from: f */
            public final /* synthetic */ C4802d f11418f;

            public C4803a(String str, C4802d dVar) {
                this.f11417e = str;
                this.f11418f = dVar;
            }

            public final void run() {
                String str = this.f11417e;
                Thread currentThread = Thread.currentThread();
                C4638h.m10270a((Object) currentThread, "currentThread");
                String name = currentThread.getName();
                currentThread.setName(str);
                try {
                    this.f11418f.f11416f.f11385f.mo11128a(this.f11418f.f11416f);
                } finally {
                    currentThread.setName(name);
                }
            }
        }

        /* renamed from: v.m0.g.f$d$b */
        public static final class C4804b implements Runnable {

            /* renamed from: e */
            public final /* synthetic */ String f11419e;

            /* renamed from: f */
            public final /* synthetic */ C4817l f11420f;

            /* renamed from: g */
            public final /* synthetic */ C4802d f11421g;

            public C4804b(String str, C4817l lVar, C4802d dVar, C4817l lVar2, int i, List list, boolean z) {
                this.f11419e = str;
                this.f11420f = lVar;
                this.f11421g = dVar;
            }

            public final void run() {
                String str = this.f11419e;
                Thread currentThread = Thread.currentThread();
                C4638h.m10270a((Object) currentThread, "currentThread");
                String name = currentThread.getName();
                currentThread.setName(str);
                try {
                    this.f11421g.f11416f.f11385f.mo11129a(this.f11420f);
                } catch (IOException e) {
                    C4840a aVar = C4839f.f11548c;
                    C4839f fVar = C4839f.f11546a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Http2Connection.Listener failure for ");
                    sb.append(this.f11421g.f11416f.f11387h);
                    fVar.mo11298a(4, sb.toString(), (Throwable) e);
                    try {
                        this.f11420f.mo11251a(C4790b.PROTOCOL_ERROR, e);
                    } catch (IOException unused) {
                    }
                } catch (Throwable th) {
                    currentThread.setName(name);
                    throw th;
                }
                currentThread.setName(name);
            }
        }

        /* renamed from: v.m0.g.f$d$c */
        public static final class C4805c implements Runnable {

            /* renamed from: e */
            public final /* synthetic */ String f11422e;

            /* renamed from: f */
            public final /* synthetic */ C4802d f11423f;

            /* renamed from: g */
            public final /* synthetic */ int f11424g;

            /* renamed from: h */
            public final /* synthetic */ int f11425h;

            public C4805c(String str, C4802d dVar, int i, int i2) {
                this.f11422e = str;
                this.f11423f = dVar;
                this.f11424g = i;
                this.f11425h = i2;
            }

            public final void run() {
                String str = this.f11422e;
                Thread currentThread = Thread.currentThread();
                C4638h.m10270a((Object) currentThread, "currentThread");
                String name = currentThread.getName();
                currentThread.setName(str);
                try {
                    this.f11423f.f11416f.mo11214a(true, this.f11424g, this.f11425h);
                } finally {
                    currentThread.setName(name);
                }
            }
        }

        /* renamed from: v.m0.g.f$d$d */
        public static final class C4806d implements Runnable {

            /* renamed from: e */
            public final /* synthetic */ String f11426e;

            /* renamed from: f */
            public final /* synthetic */ C4802d f11427f;

            /* renamed from: g */
            public final /* synthetic */ boolean f11428g;

            /* renamed from: h */
            public final /* synthetic */ C4825q f11429h;

            public C4806d(String str, C4802d dVar, boolean z, C4825q qVar) {
                this.f11426e = str;
                this.f11427f = dVar;
                this.f11428g = z;
                this.f11429h = qVar;
            }

            public final void run() {
                String str = this.f11426e;
                Thread currentThread = Thread.currentThread();
                C4638h.m10270a((Object) currentThread, "currentThread");
                String name = currentThread.getName();
                currentThread.setName(str);
                try {
                    this.f11427f.mo11232b(this.f11428g, this.f11429h);
                } finally {
                    currentThread.setName(name);
                }
            }
        }

        public C4802d(C4797f fVar, C4814k kVar) {
            if (kVar != null) {
                this.f11416f = fVar;
                this.f11415e = kVar;
                return;
            }
            C4638h.m10271a("reader");
            throw null;
        }

        /* renamed from: a */
        public void mo11222a() {
        }

        /* renamed from: a */
        public void mo11223a(int i, int i2, int i3, boolean z) {
        }

        /* renamed from: a */
        public void mo11230a(boolean z, int i, C4896i iVar, int i2) {
            if (iVar == null) {
                C4638h.m10271a("source");
                throw null;
            } else if (this.f11416f.mo11216b(i)) {
                C4797f fVar = this.f11416f;
                if (fVar != null) {
                    C4892f fVar2 = new C4892f();
                    long j = (long) i2;
                    iVar.mo11457h(j);
                    iVar.mo11077b(fVar2, j);
                    if (!fVar.f11390k) {
                        ThreadPoolExecutor threadPoolExecutor = fVar.f11392m;
                        StringBuilder a = C1965a.m4756a("OkHttp ");
                        a.append(fVar.f11387h);
                        a.append(" Push Data[");
                        a.append(i);
                        a.append(']');
                        C4810g gVar = new C4810g(a.toString(), fVar, i, fVar2, i2, z);
                        threadPoolExecutor.execute(gVar);
                    }
                    return;
                }
                throw null;
            } else {
                C4817l a2 = this.f11416f.mo11206a(i);
                if (a2 == null) {
                    this.f11416f.mo11210a(i, C4790b.PROTOCOL_ERROR);
                    long j2 = (long) i2;
                    this.f11416f.mo11219d(j2);
                    iVar.skip(j2);
                    return;
                }
                boolean z2 = !Thread.holdsLock(a2);
                if (!C4561m.f10774a || z2) {
                    a2.f11483g.mo11263a(iVar, (long) i2);
                    if (z) {
                        a2.mo11252a(C4737b.f11141b, true);
                    }
                    return;
                }
                throw new AssertionError("Assertion failed");
            }
        }

        /* renamed from: b */
        public final void mo11232b(boolean z, C4825q qVar) {
            int i;
            long j;
            C4817l[] lVarArr = null;
            if (qVar != null) {
                synchronized (this.f11416f.f11402w) {
                    synchronized (this.f11416f) {
                        int a = this.f11416f.f11396q.mo11286a();
                        if (z) {
                            C4825q qVar2 = this.f11416f.f11396q;
                            qVar2.f11517a = 0;
                            int[] iArr = qVar2.f11518b;
                            Arrays.fill(iArr, 0, iArr.length, 0);
                        }
                        C4825q qVar3 = this.f11416f.f11396q;
                        if (qVar3 != null) {
                            int i2 = 0;
                            while (true) {
                                boolean z2 = true;
                                if (i2 >= 10) {
                                    break;
                                }
                                if (((1 << i2) & qVar.f11517a) == 0) {
                                    z2 = false;
                                }
                                if (z2) {
                                    qVar3.mo11287a(i2, qVar.f11518b[i2]);
                                }
                                i2++;
                            }
                            int a2 = this.f11416f.f11396q.mo11286a();
                            if (a2 == -1 || a2 == a) {
                                j = 0;
                            } else {
                                j = (long) (a2 - a);
                                if (!this.f11416f.f11386g.isEmpty()) {
                                    Object[] array = this.f11416f.f11386g.values().toArray(new C4817l[0]);
                                    if (array != null) {
                                        lVarArr = (C4817l[]) array;
                                    } else {
                                        throw new C4557i("null cannot be cast to non-null type kotlin.Array<T>");
                                    }
                                }
                            }
                        } else {
                            throw null;
                        }
                    }
                    try {
                        this.f11416f.f11402w.mo11273a(this.f11416f.f11396q);
                    } catch (IOException e) {
                        C4797f.m10640a(this.f11416f, e);
                    }
                }
                if (lVarArr != null) {
                    int length = lVarArr.length;
                    for (i = 0; i < length; i++) {
                        C4817l lVar = lVarArr[i];
                        synchronized (lVar) {
                            lVar.f11480d += j;
                            if (j > 0) {
                                lVar.notifyAll();
                            }
                        }
                    }
                }
                C4797f.f11383z.execute(new C4803a(C1965a.m4754a(C1965a.m4756a("OkHttp "), this.f11416f.f11387h, " settings"), this));
                return;
            }
            C4638h.m10271a("settings");
            throw null;
        }

        public void run() {
            C4790b bVar;
            C4790b bVar2;
            C4790b bVar3 = C4790b.INTERNAL_ERROR;
            e = null;
            try {
                this.f11415e.mo11245a(this);
                while (this.f11415e.mo11247a(false, (C4816b) this)) {
                }
                bVar = C4790b.NO_ERROR;
                try {
                    bVar2 = C4790b.CANCEL;
                } catch (IOException e) {
                    e = e;
                }
            } catch (IOException e2) {
                e = e2;
                bVar = bVar3;
                try {
                    bVar = C4790b.PROTOCOL_ERROR;
                    bVar2 = C4790b.PROTOCOL_ERROR;
                    this.f11416f.mo11213a(bVar, bVar2, e);
                    C4737b.m10463a((Closeable) this.f11415e);
                } catch (Throwable th) {
                    th = th;
                    this.f11416f.mo11213a(bVar, bVar3, e);
                    C4737b.m10463a((Closeable) this.f11415e);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bVar = bVar3;
                this.f11416f.mo11213a(bVar, bVar3, e);
                C4737b.m10463a((Closeable) this.f11415e);
                throw th;
            }
            this.f11416f.mo11213a(bVar, bVar2, e);
            C4737b.m10463a((Closeable) this.f11415e);
        }

        /* renamed from: a */
        public void mo11227a(int i, C4790b bVar, C4897j jVar) {
            int i2;
            C4817l[] lVarArr;
            if (bVar == null) {
                C4638h.m10271a("errorCode");
                throw null;
            } else if (jVar != null) {
                int g = jVar.mo11503g();
                synchronized (this.f11416f) {
                    Object[] array = this.f11416f.f11386g.values().toArray(new C4817l[0]);
                    if (array != null) {
                        lVarArr = (C4817l[]) array;
                        this.f11416f.f11390k = true;
                    } else {
                        throw new C4557i("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                }
                for (C4817l lVar : lVarArr) {
                    if (lVar.f11489m > i && lVar.mo11258e()) {
                        lVar.mo11254b(C4790b.REFUSED_STREAM);
                        this.f11416f.mo11217c(lVar.f11489m);
                    }
                }
            } else {
                C4638h.m10271a("debugData");
                throw null;
            }
        }

        /* renamed from: a */
        public void mo11229a(boolean z, int i, int i2, List<C4792c> list) {
            int i3 = i;
            if (list == null) {
                C4638h.m10271a("headerBlock");
                throw null;
            } else if (this.f11416f.mo11216b(i)) {
                C4797f fVar = this.f11416f;
                if (!fVar.f11390k) {
                    ThreadPoolExecutor threadPoolExecutor = fVar.f11392m;
                    StringBuilder a = C1965a.m4756a("OkHttp ");
                    a.append(fVar.f11387h);
                    a.append(" Push Headers[");
                    a.append(i);
                    a.append(']');
                    try {
                        C4811h hVar = new C4811h(a.toString(), fVar, i, list, z);
                        threadPoolExecutor.execute(hVar);
                    } catch (RejectedExecutionException unused) {
                    }
                }
            } else {
                synchronized (this.f11416f) {
                    C4817l a2 = this.f11416f.mo11206a(i);
                    if (a2 != null) {
                        boolean z2 = z;
                        a2.mo11252a(C4737b.m10461a(list), z);
                    } else if (!this.f11416f.mo11215a()) {
                        if (i3 > this.f11416f.f11388i) {
                            if (i3 % 2 != this.f11416f.f11389j % 2) {
                                int i4 = i;
                                C4817l lVar = new C4817l(i4, this.f11416f, false, z, C4737b.m10461a(list));
                                this.f11416f.f11388i = i3;
                                this.f11416f.f11386g.put(Integer.valueOf(i), lVar);
                                ThreadPoolExecutor threadPoolExecutor2 = C4797f.f11383z;
                                StringBuilder sb = new StringBuilder();
                                sb.append("OkHttp ");
                                sb.append(this.f11416f.f11387h);
                                sb.append(" stream ");
                                sb.append(i);
                                C4804b bVar = new C4804b(sb.toString(), lVar, this, a2, i, list, z);
                                threadPoolExecutor2.execute(bVar);
                            }
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo11228a(boolean z, int i, int i2) {
            if (z) {
                synchronized (this.f11416f) {
                    this.f11416f.f11394o = false;
                    C4797f fVar = this.f11416f;
                    if (fVar != null) {
                        fVar.notifyAll();
                    } else {
                        throw new C4557i("null cannot be cast to non-null type java.lang.Object");
                    }
                }
                return;
            }
            try {
                this.f11416f.f11391l.execute(new C4805c(C1965a.m4754a(C1965a.m4756a("OkHttp "), this.f11416f.f11387h, " ping"), this, i, i2));
            } catch (RejectedExecutionException unused) {
            }
        }

        /* renamed from: a */
        public void mo11224a(int i, int i2, List<C4792c> list) {
            if (list != null) {
                this.f11416f.mo11209a(i2, list);
            } else {
                C4638h.m10271a("requestHeaders");
                throw null;
            }
        }

        /* renamed from: a */
        public void mo11226a(int i, C4790b bVar) {
            if (bVar == null) {
                C4638h.m10271a("errorCode");
                throw null;
            } else if (this.f11416f.mo11216b(i)) {
                C4797f fVar = this.f11416f;
                if (!fVar.f11390k) {
                    ThreadPoolExecutor threadPoolExecutor = fVar.f11392m;
                    StringBuilder a = C1965a.m4756a("OkHttp ");
                    a.append(fVar.f11387h);
                    a.append(" Push Reset[");
                    a.append(i);
                    a.append(']');
                    threadPoolExecutor.execute(new C4812i(a.toString(), fVar, i, bVar));
                }
            } else {
                C4817l c = this.f11416f.mo11217c(i);
                if (c != null) {
                    c.mo11254b(bVar);
                }
            }
        }

        /* renamed from: a */
        public void mo11231a(boolean z, C4825q qVar) {
            if (qVar != null) {
                try {
                    this.f11416f.f11391l.execute(new C4806d(C1965a.m4754a(C1965a.m4756a("OkHttp "), this.f11416f.f11387h, " ACK Settings"), this, z, qVar));
                } catch (RejectedExecutionException unused) {
                }
            } else {
                C4638h.m10271a("settings");
                throw null;
            }
        }

        /* JADX WARNING: type inference failed for: r4v1 */
        /* JADX WARNING: type inference failed for: r4v3, types: [v.m0.g.f] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo11225a(int r4, long r5) {
            /*
                r3 = this;
                if (r4 != 0) goto L_0x001f
                v.m0.g.f r4 = r3.f11416f
                monitor-enter(r4)
                v.m0.g.f r0 = r3.f11416f     // Catch:{ all -> 0x001c }
                long r1 = r0.f11400u     // Catch:{ all -> 0x001c }
                long r1 = r1 + r5
                r0.f11400u = r1     // Catch:{ all -> 0x001c }
                v.m0.g.f r5 = r3.f11416f     // Catch:{ all -> 0x001c }
                if (r5 == 0) goto L_0x0014
                r5.notifyAll()     // Catch:{ all -> 0x001c }
                goto L_0x0036
            L_0x0014:
                u.i r5 = new u.i     // Catch:{ all -> 0x001c }
                java.lang.String r6 = "null cannot be cast to non-null type java.lang.Object"
                r5.<init>(r6)     // Catch:{ all -> 0x001c }
                throw r5     // Catch:{ all -> 0x001c }
            L_0x001c:
                r5 = move-exception
                monitor-exit(r4)
                throw r5
            L_0x001f:
                v.m0.g.f r0 = r3.f11416f
                v.m0.g.l r4 = r0.mo11206a(r4)
                if (r4 == 0) goto L_0x003b
                monitor-enter(r4)
                long r0 = r4.f11480d     // Catch:{ all -> 0x0038 }
                long r0 = r0 + r5
                r4.f11480d = r0     // Catch:{ all -> 0x0038 }
                r0 = 0
                int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r5 <= 0) goto L_0x0036
                r4.notifyAll()     // Catch:{ all -> 0x0038 }
            L_0x0036:
                monitor-exit(r4)
                goto L_0x003b
            L_0x0038:
                r5 = move-exception
                monitor-exit(r4)
                throw r5
            L_0x003b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p410v.p411m0.p416g.C4797f.C4802d.mo11225a(int, long):void");
        }
    }

    /* renamed from: v.m0.g.f$e */
    public static final class C4807e implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ String f11430e;

        /* renamed from: f */
        public final /* synthetic */ C4797f f11431f;

        /* renamed from: g */
        public final /* synthetic */ int f11432g;

        /* renamed from: h */
        public final /* synthetic */ List f11433h;

        public C4807e(String str, C4797f fVar, int i, List list) {
            this.f11430e = str;
            this.f11431f = fVar;
            this.f11432g = i;
            this.f11433h = list;
        }

        public final void run() {
            String str = this.f11430e;
            Thread currentThread = Thread.currentThread();
            C4638h.m10270a((Object) currentThread, "currentThread");
            String name = currentThread.getName();
            currentThread.setName(str);
            try {
                if (this.f11431f.f11393n.mo11283a(this.f11432g, this.f11433h)) {
                    try {
                        this.f11431f.f11402w.mo11271a(this.f11432g, C4790b.CANCEL);
                        synchronized (this.f11431f) {
                            this.f11431f.f11404y.remove(Integer.valueOf(this.f11432g));
                        }
                    } catch (IOException unused) {
                    }
                }
            } finally {
                currentThread.setName(name);
            }
        }
    }

    /* renamed from: v.m0.g.f$f */
    public static final class C4808f implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ String f11434e;

        /* renamed from: f */
        public final /* synthetic */ C4797f f11435f;

        /* renamed from: g */
        public final /* synthetic */ int f11436g;

        /* renamed from: h */
        public final /* synthetic */ C4790b f11437h;

        public C4808f(String str, C4797f fVar, int i, C4790b bVar) {
            this.f11434e = str;
            this.f11435f = fVar;
            this.f11436g = i;
            this.f11437h = bVar;
        }

        public final void run() {
            String str = this.f11434e;
            Thread currentThread = Thread.currentThread();
            C4638h.m10270a((Object) currentThread, "currentThread");
            String name = currentThread.getName();
            currentThread.setName(str);
            try {
                C4797f fVar = this.f11435f;
                int i = this.f11436g;
                C4790b bVar = this.f11437h;
                if (bVar != null) {
                    fVar.f11402w.mo11271a(i, bVar);
                    currentThread.setName(name);
                    return;
                }
                C4638h.m10271a("statusCode");
                throw null;
            } catch (IOException e) {
                C4797f.m10640a(this.f11435f, e);
            } catch (Throwable th) {
                currentThread.setName(name);
                throw th;
            }
        }
    }

    /* renamed from: v.m0.g.f$g */
    public static final class C4809g implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ String f11438e;

        /* renamed from: f */
        public final /* synthetic */ C4797f f11439f;

        /* renamed from: g */
        public final /* synthetic */ int f11440g;

        /* renamed from: h */
        public final /* synthetic */ long f11441h;

        public C4809g(String str, C4797f fVar, int i, long j) {
            this.f11438e = str;
            this.f11439f = fVar;
            this.f11440g = i;
            this.f11441h = j;
        }

        public final void run() {
            String str = this.f11438e;
            Thread currentThread = Thread.currentThread();
            C4638h.m10270a((Object) currentThread, "currentThread");
            String name = currentThread.getName();
            currentThread.setName(str);
            try {
                this.f11439f.f11402w.mo11270a(this.f11440g, this.f11441h);
            } catch (IOException e) {
                C4797f.m10640a(this.f11439f, e);
            } catch (Throwable th) {
                currentThread.setName(name);
                throw th;
            }
            currentThread.setName(name);
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C4737b.m10460a("OkHttp Http2Connection", true));
        f11383z = threadPoolExecutor;
    }

    public C4797f(C4799b bVar) {
        if (bVar != null) {
            this.f11384e = bVar.f11413h;
            this.f11385f = bVar.f11410e;
            this.f11386g = new LinkedHashMap();
            String str = bVar.f11407b;
            if (str != null) {
                this.f11387h = str;
                this.f11389j = bVar.f11413h ? 3 : 2;
                this.f11391l = new ScheduledThreadPoolExecutor(1, C4737b.m10460a(C4737b.m10455a("OkHttp %s Writer", this.f11387h), false));
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), C4737b.m10460a(C4737b.m10455a("OkHttp %s Push Observer", this.f11387h), true));
                this.f11392m = threadPoolExecutor;
                this.f11393n = bVar.f11411f;
                C4825q qVar = new C4825q();
                if (bVar.f11413h) {
                    qVar.mo11287a(7, 16777216);
                }
                this.f11395p = qVar;
                C4825q qVar2 = new C4825q();
                qVar2.mo11287a(7, 65535);
                qVar2.mo11287a(5, 16384);
                this.f11396q = qVar2;
                this.f11400u = (long) qVar2.mo11286a();
                Socket socket = bVar.f11406a;
                if (socket != null) {
                    this.f11401v = socket;
                    C4895h hVar = bVar.f11409d;
                    if (hVar != null) {
                        this.f11402w = new C4821m(hVar, this.f11384e);
                        C4896i iVar = bVar.f11408c;
                        if (iVar != null) {
                            this.f11403x = new C4802d(this, new C4814k(iVar, this.f11384e));
                            this.f11404y = new LinkedHashSet();
                            if (bVar.f11412g != 0) {
                                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f11391l;
                                C4798a aVar = new C4798a(this);
                                int i = bVar.f11412g;
                                scheduledThreadPoolExecutor.scheduleAtFixedRate(aVar, (long) i, (long) i, TimeUnit.MILLISECONDS);
                                return;
                            }
                            return;
                        }
                        C4638h.m10273b("source");
                        throw null;
                    }
                    C4638h.m10273b("sink");
                    throw null;
                }
                C4638h.m10273b("socket");
                throw null;
            }
            C4638h.m10273b("connectionName");
            throw null;
        }
        C4638h.m10271a("builder");
        throw null;
    }

    /* renamed from: a */
    public static final /* synthetic */ void m10640a(C4797f fVar, IOException iOException) {
        if (fVar != null) {
            C4790b bVar = C4790b.PROTOCOL_ERROR;
            fVar.mo11213a(bVar, bVar, iOException);
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public final synchronized C4817l mo11206a(int i) {
        return (C4817l) this.f11386g.get(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo11208a(int i, long j) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f11391l;
        StringBuilder a = C1965a.m4756a("OkHttp Window Update ");
        a.append(this.f11387h);
        a.append(" stream ");
        a.append(i);
        try {
            C4809g gVar = new C4809g(a.toString(), this, i, j);
            scheduledThreadPoolExecutor.execute(gVar);
        } catch (RejectedExecutionException unused) {
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo11215a() {
        return this.f11390k;
    }

    /* renamed from: b */
    public final boolean mo11216b(int i) {
        return i != 0 && (i & 1) == 0;
    }

    /* renamed from: c */
    public final synchronized C4817l mo11217c(int i) {
        C4817l lVar;
        lVar = (C4817l) this.f11386g.remove(Integer.valueOf(i));
        notifyAll();
        return lVar;
    }

    public void close() {
        mo11213a(C4790b.NO_ERROR, C4790b.CANCEL, (IOException) null);
    }

    /* renamed from: d */
    public final synchronized void mo11219d(long j) {
        long j2 = this.f11397r + j;
        this.f11397r = j2;
        long j3 = j2 - this.f11398s;
        if (j3 >= ((long) (this.f11395p.mo11286a() / 2))) {
            mo11208a(0, j3);
            this.f11398s += j3;
        }
    }

    /* renamed from: f */
    public final synchronized int mo11220f() {
        int i;
        C4825q qVar = this.f11396q;
        i = Integer.MAX_VALUE;
        if ((qVar.f11517a & 16) != 0) {
            i = qVar.f11518b[4];
        }
        return i;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x005b */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11213a(p410v.p411m0.p416g.C4790b r4, p410v.p411m0.p416g.C4790b r5, java.io.IOException r6) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L_0x0074
            if (r5 == 0) goto L_0x006e
            boolean r1 = java.lang.Thread.holdsLock(r3)
            r1 = r1 ^ 1
            boolean r2 = p392u.C4561m.f10774a
            if (r2 == 0) goto L_0x001a
            if (r1 == 0) goto L_0x0012
            goto L_0x001a
        L_0x0012:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.String r5 = "Assertion failed"
            r4.<init>(r5)
            throw r4
        L_0x001a:
            r3.mo11212a(r4)     // Catch:{ IOException -> 0x001d }
        L_0x001d:
            monitor-enter(r3)
            java.util.Map<java.lang.Integer, v.m0.g.l> r4 = r3.f11386g     // Catch:{ all -> 0x006b }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x006b }
            r4 = r4 ^ 1
            r1 = 0
            if (r4 == 0) goto L_0x0048
            java.util.Map<java.lang.Integer, v.m0.g.l> r4 = r3.f11386g     // Catch:{ all -> 0x006b }
            java.util.Collection r4 = r4.values()     // Catch:{ all -> 0x006b }
            v.m0.g.l[] r0 = new p410v.p411m0.p416g.C4817l[r1]     // Catch:{ all -> 0x006b }
            java.lang.Object[] r4 = r4.toArray(r0)     // Catch:{ all -> 0x006b }
            if (r4 == 0) goto L_0x0040
            r0 = r4
            v.m0.g.l[] r0 = (p410v.p411m0.p416g.C4817l[]) r0     // Catch:{ all -> 0x006b }
            java.util.Map<java.lang.Integer, v.m0.g.l> r4 = r3.f11386g     // Catch:{ all -> 0x006b }
            r4.clear()     // Catch:{ all -> 0x006b }
            goto L_0x0048
        L_0x0040:
            u.i r4 = new u.i     // Catch:{ all -> 0x006b }
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Array<T>"
            r4.<init>(r5)     // Catch:{ all -> 0x006b }
            throw r4     // Catch:{ all -> 0x006b }
        L_0x0048:
            monitor-exit(r3)
            if (r0 == 0) goto L_0x0056
            int r4 = r0.length
        L_0x004c:
            if (r1 >= r4) goto L_0x0056
            r2 = r0[r1]
            r2.mo11251a(r5, r6)     // Catch:{ IOException -> 0x0053 }
        L_0x0053:
            int r1 = r1 + 1
            goto L_0x004c
        L_0x0056:
            v.m0.g.m r4 = r3.f11402w     // Catch:{ IOException -> 0x005b }
            r4.close()     // Catch:{ IOException -> 0x005b }
        L_0x005b:
            java.net.Socket r4 = r3.f11401v     // Catch:{ IOException -> 0x0060 }
            r4.close()     // Catch:{ IOException -> 0x0060 }
        L_0x0060:
            java.util.concurrent.ScheduledThreadPoolExecutor r4 = r3.f11391l
            r4.shutdown()
            java.util.concurrent.ThreadPoolExecutor r4 = r3.f11392m
            r4.shutdown()
            return
        L_0x006b:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L_0x006e:
            java.lang.String r4 = "streamCode"
            p392u.p401r.p403c.C4638h.m10271a(r4)
            throw r0
        L_0x0074:
            java.lang.String r4 = "connectionCode"
            p392u.p401r.p403c.C4638h.m10271a(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p410v.p411m0.p416g.C4797f.mo11213a(v.m0.g.b, v.m0.g.b, java.io.IOException):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0048 A[Catch:{ all -> 0x003f }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p410v.p411m0.p416g.C4817l mo11207a(int r11, java.util.List<p410v.p411m0.p416g.C4792c> r12, boolean r13) {
        /*
            r10 = this;
            r6 = r13 ^ 1
            r4 = 0
            v.m0.g.m r7 = r10.f11402w
            monitor-enter(r7)
            monitor-enter(r10)     // Catch:{ all -> 0x0081 }
            int r0 = r10.f11389j     // Catch:{ all -> 0x003f }
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L_0x0013
            v.m0.g.b r0 = p410v.p411m0.p416g.C4790b.REFUSED_STREAM     // Catch:{ all -> 0x003f }
            r10.mo11212a(r0)     // Catch:{ all -> 0x003f }
        L_0x0013:
            boolean r0 = r10.f11390k     // Catch:{ all -> 0x003f }
            if (r0 != 0) goto L_0x0079
            int r8 = r10.f11389j     // Catch:{ all -> 0x003f }
            int r0 = r10.f11389j     // Catch:{ all -> 0x003f }
            int r0 = r0 + 2
            r10.f11389j = r0     // Catch:{ all -> 0x003f }
            v.m0.g.l r9 = new v.m0.g.l     // Catch:{ all -> 0x003f }
            r5 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x003f }
            r0 = 1
            if (r13 == 0) goto L_0x0041
            long r1 = r10.f11399t     // Catch:{ all -> 0x003f }
            long r3 = r10.f11400u     // Catch:{ all -> 0x003f }
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 >= 0) goto L_0x0041
            long r1 = r9.f11479c     // Catch:{ all -> 0x003f }
            long r3 = r9.f11480d     // Catch:{ all -> 0x003f }
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 < 0) goto L_0x003d
            goto L_0x0041
        L_0x003d:
            r13 = 0
            goto L_0x0042
        L_0x003f:
            r11 = move-exception
            goto L_0x007f
        L_0x0041:
            r13 = r0
        L_0x0042:
            boolean r1 = r9.mo11259f()     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x0051
            java.util.Map<java.lang.Integer, v.m0.g.l> r1 = r10.f11386g     // Catch:{ all -> 0x003f }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x003f }
            r1.put(r2, r9)     // Catch:{ all -> 0x003f }
        L_0x0051:
            monitor-exit(r10)     // Catch:{ all -> 0x0081 }
            if (r11 != 0) goto L_0x005a
            v.m0.g.m r11 = r10.f11402w     // Catch:{ all -> 0x0081 }
            r11.mo11275a(r6, r8, r12)     // Catch:{ all -> 0x0081 }
            goto L_0x0064
        L_0x005a:
            boolean r1 = r10.f11384e     // Catch:{ all -> 0x0081 }
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x006d
            v.m0.g.m r0 = r10.f11402w     // Catch:{ all -> 0x0081 }
            r0.mo11269a(r11, r8, r12)     // Catch:{ all -> 0x0081 }
        L_0x0064:
            monitor-exit(r7)
            if (r13 == 0) goto L_0x006c
            v.m0.g.m r11 = r10.f11402w
            r11.flush()
        L_0x006c:
            return r9
        L_0x006d:
            java.lang.String r11 = "client streams shouldn't have associated stream IDs"
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0081 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0081 }
            r12.<init>(r11)     // Catch:{ all -> 0x0081 }
            throw r12     // Catch:{ all -> 0x0081 }
        L_0x0079:
            v.m0.g.a r11 = new v.m0.g.a     // Catch:{ all -> 0x003f }
            r11.<init>()     // Catch:{ all -> 0x003f }
            throw r11     // Catch:{ all -> 0x003f }
        L_0x007f:
            monitor-exit(r10)     // Catch:{ all -> 0x0081 }
            throw r11     // Catch:{ all -> 0x0081 }
        L_0x0081:
            r11 = move-exception
            monitor-exit(r7)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p410v.p411m0.p416g.C4797f.mo11207a(int, java.util.List, boolean):v.m0.g.l");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (r3.f11390k != false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        r0 = r3.f11392m;
        r1 = p213q.p214a.p215a.p216a.C1965a.m4756a("OkHttp ");
        r1.append(r3.f11387h);
        r1.append(" Push Request[");
        r1.append(r4);
        r1.append(']');
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r0.execute(new p410v.p411m0.p416g.C4797f.C4807e(r1.toString(), r3, r4, r5));
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11209a(int r4, java.util.List<p410v.p411m0.p416g.C4792c> r5) {
        /*
            r3 = this;
            if (r5 == 0) goto L_0x004e
            monitor-enter(r3)
            java.util.Set<java.lang.Integer> r0 = r3.f11404y     // Catch:{ all -> 0x004b }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x004b }
            boolean r0 = r0.contains(r1)     // Catch:{ all -> 0x004b }
            if (r0 == 0) goto L_0x0016
            v.m0.g.b r5 = p410v.p411m0.p416g.C4790b.PROTOCOL_ERROR     // Catch:{ all -> 0x004b }
            r3.mo11210a(r4, r5)     // Catch:{ all -> 0x004b }
            monitor-exit(r3)
            return
        L_0x0016:
            java.util.Set<java.lang.Integer> r0 = r3.f11404y     // Catch:{ all -> 0x004b }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x004b }
            r0.add(r1)     // Catch:{ all -> 0x004b }
            monitor-exit(r3)
            boolean r0 = r3.f11390k
            if (r0 != 0) goto L_0x004a
            java.util.concurrent.ThreadPoolExecutor r0 = r3.f11392m
            java.lang.String r1 = "OkHttp "
            java.lang.StringBuilder r1 = p213q.p214a.p215a.p216a.C1965a.m4756a(r1)
            java.lang.String r2 = r3.f11387h
            r1.append(r2)
            java.lang.String r2 = " Push Request["
            r1.append(r2)
            r1.append(r4)
            r2 = 93
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            v.m0.g.f$e r2 = new v.m0.g.f$e     // Catch:{ RejectedExecutionException -> 0x004a }
            r2.<init>(r1, r3, r4, r5)     // Catch:{ RejectedExecutionException -> 0x004a }
            r0.execute(r2)     // Catch:{ RejectedExecutionException -> 0x004a }
        L_0x004a:
            return
        L_0x004b:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L_0x004e:
            java.lang.String r4 = "requestHeaders"
            p392u.p401r.p403c.C4638h.m10271a(r4)
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p410v.p411m0.p416g.C4797f.mo11209a(int, java.util.List):void");
    }

    /* renamed from: a */
    public final void mo11212a(C4790b bVar) {
        if (bVar != null) {
            synchronized (this.f11402w) {
                synchronized (this) {
                    if (!this.f11390k) {
                        this.f11390k = true;
                        int i = this.f11388i;
                        this.f11402w.mo11272a(i, bVar, C4737b.f11140a);
                        return;
                    }
                    return;
                }
            }
        }
        C4638h.m10271a("statusCode");
        throw null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:26|27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r8.f11400u - r8.f11399t), r8.f11402w.f11504f);
        r8.f11399t += (long) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006a, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x005e */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11211a(int r9, boolean r10, p423w.C4892f r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto L_0x000d
            v.m0.g.m r12 = r8.f11402w
            r12.mo11276a(r10, r9, r11, r3)
            return
        L_0x000d:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x006d
            monitor-enter(r8)
        L_0x0012:
            long r4 = r8.f11399t     // Catch:{ InterruptedException -> 0x005e }
            long r6 = r8.f11400u     // Catch:{ InterruptedException -> 0x005e }
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x0032
            java.util.Map<java.lang.Integer, v.m0.g.l> r2 = r8.f11386g     // Catch:{ InterruptedException -> 0x005e }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x005e }
            boolean r2 = r2.containsKey(r4)     // Catch:{ InterruptedException -> 0x005e }
            if (r2 == 0) goto L_0x002a
            r8.wait()     // Catch:{ InterruptedException -> 0x005e }
            goto L_0x0012
        L_0x002a:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ InterruptedException -> 0x005e }
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch:{ InterruptedException -> 0x005e }
            throw r9     // Catch:{ InterruptedException -> 0x005e }
        L_0x0032:
            long r4 = r8.f11400u     // Catch:{ all -> 0x005c }
            long r6 = r8.f11399t     // Catch:{ all -> 0x005c }
            long r4 = r4 - r6
            long r4 = java.lang.Math.min(r12, r4)     // Catch:{ all -> 0x005c }
            int r2 = (int) r4     // Catch:{ all -> 0x005c }
            v.m0.g.m r4 = r8.f11402w     // Catch:{ all -> 0x005c }
            int r4 = r4.f11504f     // Catch:{ all -> 0x005c }
            int r2 = java.lang.Math.min(r2, r4)     // Catch:{ all -> 0x005c }
            long r4 = r8.f11399t     // Catch:{ all -> 0x005c }
            long r6 = (long) r2     // Catch:{ all -> 0x005c }
            long r4 = r4 + r6
            r8.f11399t = r4     // Catch:{ all -> 0x005c }
            monitor-exit(r8)
            long r4 = (long) r2
            long r12 = r12 - r4
            v.m0.g.m r4 = r8.f11402w
            if (r10 == 0) goto L_0x0057
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x0057
            r5 = 1
            goto L_0x0058
        L_0x0057:
            r5 = r3
        L_0x0058:
            r4.mo11276a(r5, r9, r11, r2)
            goto L_0x000d
        L_0x005c:
            r9 = move-exception
            goto L_0x006b
        L_0x005e:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x005c }
            r9.interrupt()     // Catch:{ all -> 0x005c }
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x005c }
            r9.<init>()     // Catch:{ all -> 0x005c }
            throw r9     // Catch:{ all -> 0x005c }
        L_0x006b:
            monitor-exit(r8)
            throw r9
        L_0x006d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p410v.p411m0.p416g.C4797f.mo11211a(int, boolean, w.f, long):void");
    }

    /* renamed from: a */
    public final void mo11214a(boolean z, int i, int i2) {
        boolean z2;
        if (!z) {
            synchronized (this) {
                z2 = this.f11394o;
                this.f11394o = true;
            }
            if (z2) {
                C4790b bVar = C4790b.PROTOCOL_ERROR;
                mo11213a(bVar, bVar, (IOException) null);
                return;
            }
        }
        try {
            this.f11402w.mo11274a(z, i, i2);
        } catch (IOException e) {
            C4790b bVar2 = C4790b.PROTOCOL_ERROR;
            mo11213a(bVar2, bVar2, e);
        }
    }

    /* renamed from: a */
    public final void mo11210a(int i, C4790b bVar) {
        if (bVar != null) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f11391l;
            StringBuilder a = C1965a.m4756a("OkHttp ");
            a.append(this.f11387h);
            a.append(" stream ");
            a.append(i);
            try {
                scheduledThreadPoolExecutor.execute(new C4808f(a.toString(), this, i, bVar));
            } catch (RejectedExecutionException unused) {
            }
        } else {
            C4638h.m10271a("errorCode");
            throw null;
        }
    }
}
