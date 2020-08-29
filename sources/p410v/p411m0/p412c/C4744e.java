package p410v.p411m0.p412c;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executor;
import p119o.p120a.C0967p0;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.C4557i;
import p392u.C4560l;
import p392u.C4561m;
import p392u.p401r.p402b.C4618l;
import p392u.p401r.p403c.C4638h;
import p392u.p401r.p403c.C4639i;
import p392u.p409w.C4677c;
import p392u.p409w.C4681g;
import p410v.p411m0.C4737b;
import p410v.p411m0.p417h.C4827b;
import p410v.p411m0.p418i.C4839f;
import p410v.p411m0.p418i.C4839f.C4840a;
import p423w.C4882a0;
import p423w.C4895h;
import p423w.C4915y;

/* renamed from: v.m0.c.e */
public final class C4744e implements Closeable, Flushable {

    /* renamed from: A */
    public static final String f11156A = f11156A;

    /* renamed from: B */
    public static final String f11157B = f11157B;

    /* renamed from: C */
    public static final String f11158C = f11158C;

    /* renamed from: D */
    public static final C4744e f11159D = null;

    /* renamed from: y */
    public static final C4677c f11160y = new C4677c("[a-z0-9_-]{1,120}");

    /* renamed from: z */
    public static final String f11161z = f11161z;

    /* renamed from: e */
    public long f11162e;

    /* renamed from: f */
    public final File f11163f;

    /* renamed from: g */
    public final File f11164g;

    /* renamed from: h */
    public final File f11165h;

    /* renamed from: i */
    public long f11166i;

    /* renamed from: j */
    public C4895h f11167j;

    /* renamed from: k */
    public final LinkedHashMap<String, C4747b> f11168k;

    /* renamed from: l */
    public int f11169l;

    /* renamed from: m */
    public boolean f11170m;

    /* renamed from: n */
    public boolean f11171n;

    /* renamed from: o */
    public boolean f11172o;

    /* renamed from: p */
    public boolean f11173p;

    /* renamed from: q */
    public boolean f11174q;

    /* renamed from: r */
    public long f11175r;

    /* renamed from: s */
    public final Runnable f11176s;

    /* renamed from: t */
    public final C4827b f11177t;

    /* renamed from: u */
    public final File f11178u;

    /* renamed from: v */
    public final int f11179v;

    /* renamed from: w */
    public final int f11180w;

    /* renamed from: x */
    public final Executor f11181x;

    /* renamed from: v.m0.c.e$a */
    public final class C4745a {

        /* renamed from: a */
        public final boolean[] f11182a;

        /* renamed from: b */
        public boolean f11183b;

        /* renamed from: c */
        public final C4747b f11184c;

        /* renamed from: d */
        public final /* synthetic */ C4744e f11185d;

        /* renamed from: v.m0.c.e$a$a */
        public static final class C4746a extends C4639i implements C4618l<IOException, C4560l> {

            /* renamed from: f */
            public final /* synthetic */ C4745a f11186f;

            public C4746a(C4745a aVar, int i) {
                this.f11186f = aVar;
                super(1);
            }

            /* renamed from: a */
            public final void mo11100a(IOException iOException) {
                if (iOException != null) {
                    synchronized (this.f11186f.f11185d) {
                        this.f11186f.mo11099c();
                    }
                    return;
                }
                C4638h.m10271a("it");
                throw null;
            }

            /* renamed from: b */
            public /* bridge */ /* synthetic */ Object mo3153b(Object obj) {
                mo11100a((IOException) obj);
                return C4560l.f10773a;
            }
        }

        public C4745a(C4744e eVar, C4747b bVar) {
            boolean[] zArr = null;
            if (bVar != null) {
                this.f11185d = eVar;
                this.f11184c = bVar;
                if (!bVar.f11190d) {
                    zArr = new boolean[eVar.f11180w];
                }
                this.f11182a = zArr;
                return;
            }
            C4638h.m10271a("entry");
            throw null;
        }

        /* renamed from: a */
        public final void mo11097a() {
            synchronized (this.f11185d) {
                if (!this.f11183b) {
                    if (C4638h.m10272a((Object) this.f11184c.f11191e, (Object) this)) {
                        this.f11185d.mo11081a(this, false);
                    }
                    this.f11183b = true;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }

        /* renamed from: b */
        public final void mo11098b() {
            synchronized (this.f11185d) {
                if (!this.f11183b) {
                    if (C4638h.m10272a((Object) this.f11184c.f11191e, (Object) this)) {
                        this.f11185d.mo11081a(this, true);
                    }
                    this.f11183b = true;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }

        /* renamed from: c */
        public final void mo11099c() {
            if (C4638h.m10272a((Object) this.f11184c.f11191e, (Object) this)) {
                int i = this.f11185d.f11180w;
                for (int i2 = 0; i2 < i; i2++) {
                    try {
                        this.f11185d.f11177t.mo11288a((File) this.f11184c.f11189c.get(i2));
                    } catch (IOException unused) {
                    }
                }
                this.f11184c.f11191e = null;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
            r5 = new p423w.C4891e();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0051, code lost:
            return r5;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x004b */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p423w.C4915y mo11096a(int r5) {
            /*
                r4 = this;
                v.m0.c.e r0 = r4.f11185d
                monitor-enter(r0)
                boolean r1 = r4.f11183b     // Catch:{ all -> 0x005e }
                r2 = 1
                r1 = r1 ^ r2
                if (r1 == 0) goto L_0x0052
                v.m0.c.e$b r1 = r4.f11184c     // Catch:{ all -> 0x005e }
                v.m0.c.e$a r1 = r1.f11191e     // Catch:{ all -> 0x005e }
                boolean r1 = p392u.p401r.p403c.C4638h.m10272a(r1, r4)     // Catch:{ all -> 0x005e }
                r1 = r1 ^ r2
                if (r1 == 0) goto L_0x001b
                w.e r5 = new w.e     // Catch:{ all -> 0x005e }
                r5.<init>()     // Catch:{ all -> 0x005e }
                monitor-exit(r0)
                return r5
            L_0x001b:
                v.m0.c.e$b r1 = r4.f11184c     // Catch:{ all -> 0x005e }
                boolean r1 = r1.f11190d     // Catch:{ all -> 0x005e }
                if (r1 != 0) goto L_0x002d
                boolean[] r1 = r4.f11182a     // Catch:{ all -> 0x005e }
                if (r1 == 0) goto L_0x0028
                r1[r5] = r2     // Catch:{ all -> 0x005e }
                goto L_0x002d
            L_0x0028:
                p392u.p401r.p403c.C4638h.m10269a()     // Catch:{ all -> 0x005e }
                r5 = 0
                throw r5
            L_0x002d:
                v.m0.c.e$b r1 = r4.f11184c     // Catch:{ all -> 0x005e }
                java.util.List<java.io.File> r1 = r1.f11189c     // Catch:{ all -> 0x005e }
                java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x005e }
                java.io.File r1 = (java.io.File) r1     // Catch:{ all -> 0x005e }
                v.m0.c.e r2 = r4.f11185d     // Catch:{ FileNotFoundException -> 0x004b }
                v.m0.h.b r2 = r2.f11177t     // Catch:{ FileNotFoundException -> 0x004b }
                w.y r1 = r2.mo11291c(r1)     // Catch:{ FileNotFoundException -> 0x004b }
                v.m0.c.f r2 = new v.m0.c.f     // Catch:{ all -> 0x005e }
                v.m0.c.e$a$a r3 = new v.m0.c.e$a$a     // Catch:{ all -> 0x005e }
                r3.<init>(r4, r5)     // Catch:{ all -> 0x005e }
                r2.<init>(r1, r3)     // Catch:{ all -> 0x005e }
                monitor-exit(r0)
                return r2
            L_0x004b:
                w.e r5 = new w.e     // Catch:{ all -> 0x005e }
                r5.<init>()     // Catch:{ all -> 0x005e }
                monitor-exit(r0)
                return r5
            L_0x0052:
                java.lang.String r5 = "Check failed."
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x005e }
                java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x005e }
                r1.<init>(r5)     // Catch:{ all -> 0x005e }
                throw r1     // Catch:{ all -> 0x005e }
            L_0x005e:
                r5 = move-exception
                monitor-exit(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p410v.p411m0.p412c.C4744e.C4745a.mo11096a(int):w.y");
        }
    }

    /* renamed from: v.m0.c.e$b */
    public final class C4747b {

        /* renamed from: a */
        public final long[] f11187a;

        /* renamed from: b */
        public final List<File> f11188b;

        /* renamed from: c */
        public final List<File> f11189c;

        /* renamed from: d */
        public boolean f11190d;

        /* renamed from: e */
        public C4745a f11191e;

        /* renamed from: f */
        public long f11192f;

        /* renamed from: g */
        public final String f11193g;

        /* renamed from: h */
        public final /* synthetic */ C4744e f11194h;

        public C4747b(C4744e eVar, String str) {
            if (str != null) {
                this.f11194h = eVar;
                this.f11193g = str;
                this.f11187a = new long[eVar.f11180w];
                this.f11188b = new ArrayList();
                this.f11189c = new ArrayList();
                StringBuilder sb = new StringBuilder(this.f11193g);
                sb.append('.');
                int length = sb.length();
                int i = eVar.f11180w;
                for (int i2 = 0; i2 < i; i2++) {
                    sb.append(i2);
                    this.f11188b.add(new File(eVar.f11178u, sb.toString()));
                    sb.append(".tmp");
                    this.f11189c.add(new File(eVar.f11178u, sb.toString()));
                    sb.setLength(length);
                }
                return;
            }
            C4638h.m10271a("key");
            throw null;
        }

        /* renamed from: a */
        public final C4748c mo11101a() {
            boolean holdsLock = Thread.holdsLock(this.f11194h);
            if (!C4561m.f10774a || holdsLock) {
                ArrayList<C4882a0> arrayList = new ArrayList<>();
                long[] jArr = (long[]) this.f11187a.clone();
                try {
                    int i = this.f11194h.f11180w;
                    for (int i2 = 0; i2 < i; i2++) {
                        arrayList.add(this.f11194h.f11177t.mo11290b((File) this.f11188b.get(i2)));
                    }
                    C4748c cVar = new C4748c(this.f11194h, this.f11193g, this.f11192f, arrayList, jArr);
                    return cVar;
                } catch (FileNotFoundException unused) {
                    for (C4882a0 a : arrayList) {
                        C4737b.m10463a((Closeable) a);
                    }
                    try {
                        this.f11194h.mo11082a(this);
                    } catch (IOException unused2) {
                    }
                    return null;
                }
            } else {
                throw new AssertionError("Assertion failed");
            }
        }

        /* renamed from: a */
        public final void mo11102a(C4895h hVar) {
            if (hVar != null) {
                for (long i : this.f11187a) {
                    hVar.writeByte(32).mo11459i(i);
                }
                return;
            }
            C4638h.m10271a("writer");
            throw null;
        }
    }

    /* renamed from: v.m0.c.e$c */
    public final class C4748c implements Closeable {

        /* renamed from: e */
        public final String f11195e;

        /* renamed from: f */
        public final long f11196f;

        /* renamed from: g */
        public final List<C4882a0> f11197g;

        /* renamed from: h */
        public final /* synthetic */ C4744e f11198h;

        public C4748c(C4744e eVar, String str, long j, List<? extends C4882a0> list, long[] jArr) {
            if (str == null) {
                C4638h.m10271a("key");
                throw null;
            } else if (list == null) {
                C4638h.m10271a("sources");
                throw null;
            } else if (jArr != null) {
                this.f11198h = eVar;
                this.f11195e = str;
                this.f11196f = j;
                this.f11197g = list;
            } else {
                C4638h.m10271a("lengths");
                throw null;
            }
        }

        public void close() {
            for (C4882a0 a : this.f11197g) {
                C4737b.m10463a((Closeable) a);
            }
        }
    }

    /* renamed from: v.m0.c.e$d */
    public static final class C4749d implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ C4744e f11199e;

        public C4749d(C4744e eVar) {
            this.f11199e = eVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
            r4.f11199e.f11174q = true;
            r4.f11199e.f11167j = p119o.p120a.C0967p0.m2182a((p423w.C4915y) new p423w.C4891e());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0042, code lost:
            return;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x002e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r4 = this;
                v.m0.c.e r0 = r4.f11199e
                monitor-enter(r0)
                v.m0.c.e r1 = r4.f11199e     // Catch:{ all -> 0x0043 }
                boolean r1 = r1.f11171n     // Catch:{ all -> 0x0043 }
                if (r1 == 0) goto L_0x0041
                v.m0.c.e r1 = r4.f11199e     // Catch:{ all -> 0x0043 }
                boolean r1 = r1.f11172o     // Catch:{ all -> 0x0043 }
                if (r1 == 0) goto L_0x0010
                goto L_0x0041
            L_0x0010:
                r1 = 1
                v.m0.c.e r2 = r4.f11199e     // Catch:{ IOException -> 0x0017 }
                r2.mo11095r()     // Catch:{ IOException -> 0x0017 }
                goto L_0x001b
            L_0x0017:
                v.m0.c.e r2 = r4.f11199e     // Catch:{ all -> 0x0043 }
                r2.f11173p = r1     // Catch:{ all -> 0x0043 }
            L_0x001b:
                v.m0.c.e r2 = r4.f11199e     // Catch:{ IOException -> 0x002e }
                boolean r2 = r2.mo11090g()     // Catch:{ IOException -> 0x002e }
                if (r2 == 0) goto L_0x003f
                v.m0.c.e r2 = r4.f11199e     // Catch:{ IOException -> 0x002e }
                r2.mo11094o()     // Catch:{ IOException -> 0x002e }
                v.m0.c.e r2 = r4.f11199e     // Catch:{ IOException -> 0x002e }
                r3 = 0
                r2.f11169l = r3     // Catch:{ IOException -> 0x002e }
                goto L_0x003f
            L_0x002e:
                v.m0.c.e r2 = r4.f11199e     // Catch:{ all -> 0x0043 }
                r2.f11174q = r1     // Catch:{ all -> 0x0043 }
                v.m0.c.e r1 = r4.f11199e     // Catch:{ all -> 0x0043 }
                w.e r2 = new w.e     // Catch:{ all -> 0x0043 }
                r2.<init>()     // Catch:{ all -> 0x0043 }
                w.h r2 = p119o.p120a.C0967p0.m2182a(r2)     // Catch:{ all -> 0x0043 }
                r1.f11167j = r2     // Catch:{ all -> 0x0043 }
            L_0x003f:
                monitor-exit(r0)
                return
            L_0x0041:
                monitor-exit(r0)
                return
            L_0x0043:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p410v.p411m0.p412c.C4744e.C4749d.run():void");
        }
    }

    /* renamed from: v.m0.c.e$e */
    public static final class C4750e extends C4639i implements C4618l<IOException, C4560l> {

        /* renamed from: f */
        public final /* synthetic */ C4744e f11200f;

        public C4750e(C4744e eVar) {
            this.f11200f = eVar;
            super(1);
        }

        /* renamed from: b */
        public Object mo3153b(Object obj) {
            if (((IOException) obj) != null) {
                boolean holdsLock = Thread.holdsLock(this.f11200f);
                if (!C4561m.f10774a || holdsLock) {
                    this.f11200f.f11170m = true;
                    return C4560l.f10773a;
                }
                throw new AssertionError("Assertion failed");
            }
            C4638h.m10271a("it");
            throw null;
        }
    }

    public C4744e(C4827b bVar, File file, int i, int i2, long j, Executor executor) {
        if (bVar == null) {
            C4638h.m10271a("fileSystem");
            throw null;
        } else if (file == null) {
            C4638h.m10271a("directory");
            throw null;
        } else if (executor != null) {
            this.f11177t = bVar;
            this.f11178u = file;
            this.f11179v = i;
            this.f11180w = i2;
            this.f11181x = executor;
            this.f11162e = j;
            this.f11168k = new LinkedHashMap<>(0, 0.75f, true);
            this.f11176s = new C4749d(this);
            this.f11163f = new File(this.f11178u, "journal");
            this.f11164g = new File(this.f11178u, "journal.tmp");
            this.f11165h = new File(this.f11178u, "journal.bkp");
        } else {
            C4638h.m10271a("executor");
            throw null;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ C4745a m10487a(C4744e eVar, String str, long j, int i) {
        if ((i & 2) != 0) {
            j = -1;
        }
        return eVar.mo11079a(str, j);
    }

    /* renamed from: a */
    public final synchronized void mo11080a() {
        if (!(!this.f11172o)) {
            throw new IllegalStateException("cache is closed".toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0104, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo11081a(p410v.p411m0.p412c.C4744e.C4745a r10, boolean r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            java.lang.String r0 = "editor"
            r1 = 0
            if (r10 == 0) goto L_0x0115
            v.m0.c.e$b r0 = r10.f11184c     // Catch:{ all -> 0x0119 }
            v.m0.c.e$a r2 = r0.f11191e     // Catch:{ all -> 0x0119 }
            boolean r2 = p392u.p401r.p403c.C4638h.m10272a(r2, r10)     // Catch:{ all -> 0x0119 }
            if (r2 == 0) goto L_0x0109
            r2 = 0
            if (r11 == 0) goto L_0x005a
            boolean r3 = r0.f11190d     // Catch:{ all -> 0x0119 }
            if (r3 != 0) goto L_0x005a
            int r3 = r9.f11180w     // Catch:{ all -> 0x0119 }
            r4 = r2
        L_0x001a:
            if (r4 >= r3) goto L_0x005a
            boolean[] r5 = r10.f11182a     // Catch:{ all -> 0x0119 }
            if (r5 == 0) goto L_0x0056
            boolean r5 = r5[r4]     // Catch:{ all -> 0x0119 }
            if (r5 == 0) goto L_0x003c
            v.m0.h.b r5 = r9.f11177t     // Catch:{ all -> 0x0119 }
            java.util.List<java.io.File> r6 = r0.f11189c     // Catch:{ all -> 0x0119 }
            java.lang.Object r6 = r6.get(r4)     // Catch:{ all -> 0x0119 }
            java.io.File r6 = (java.io.File) r6     // Catch:{ all -> 0x0119 }
            boolean r5 = r5.mo11294f(r6)     // Catch:{ all -> 0x0119 }
            if (r5 != 0) goto L_0x0039
            r10.mo11097a()     // Catch:{ all -> 0x0119 }
            monitor-exit(r9)
            return
        L_0x0039:
            int r4 = r4 + 1
            goto L_0x001a
        L_0x003c:
            r10.mo11097a()     // Catch:{ all -> 0x0119 }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0119 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0119 }
            r11.<init>()     // Catch:{ all -> 0x0119 }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x0119 }
            r11.append(r4)     // Catch:{ all -> 0x0119 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0119 }
            r10.<init>(r11)     // Catch:{ all -> 0x0119 }
            throw r10     // Catch:{ all -> 0x0119 }
        L_0x0056:
            p392u.p401r.p403c.C4638h.m10269a()     // Catch:{ all -> 0x0119 }
            throw r1
        L_0x005a:
            int r10 = r9.f11180w     // Catch:{ all -> 0x0119 }
        L_0x005c:
            if (r2 >= r10) goto L_0x009a
            java.util.List<java.io.File> r3 = r0.f11189c     // Catch:{ all -> 0x0119 }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ all -> 0x0119 }
            java.io.File r3 = (java.io.File) r3     // Catch:{ all -> 0x0119 }
            if (r11 == 0) goto L_0x0092
            v.m0.h.b r4 = r9.f11177t     // Catch:{ all -> 0x0119 }
            boolean r4 = r4.mo11294f(r3)     // Catch:{ all -> 0x0119 }
            if (r4 == 0) goto L_0x0097
            java.util.List<java.io.File> r4 = r0.f11188b     // Catch:{ all -> 0x0119 }
            java.lang.Object r4 = r4.get(r2)     // Catch:{ all -> 0x0119 }
            java.io.File r4 = (java.io.File) r4     // Catch:{ all -> 0x0119 }
            v.m0.h.b r5 = r9.f11177t     // Catch:{ all -> 0x0119 }
            r5.mo11289a(r3, r4)     // Catch:{ all -> 0x0119 }
            long[] r3 = r0.f11187a     // Catch:{ all -> 0x0119 }
            r5 = r3[r2]     // Catch:{ all -> 0x0119 }
            v.m0.h.b r3 = r9.f11177t     // Catch:{ all -> 0x0119 }
            long r3 = r3.mo11295g(r4)     // Catch:{ all -> 0x0119 }
            long[] r7 = r0.f11187a     // Catch:{ all -> 0x0119 }
            r7[r2] = r3     // Catch:{ all -> 0x0119 }
            long r7 = r9.f11166i     // Catch:{ all -> 0x0119 }
            long r7 = r7 - r5
            long r7 = r7 + r3
            r9.f11166i = r7     // Catch:{ all -> 0x0119 }
            goto L_0x0097
        L_0x0092:
            v.m0.h.b r4 = r9.f11177t     // Catch:{ all -> 0x0119 }
            r4.mo11288a(r3)     // Catch:{ all -> 0x0119 }
        L_0x0097:
            int r2 = r2 + 1
            goto L_0x005c
        L_0x009a:
            int r10 = r9.f11169l     // Catch:{ all -> 0x0119 }
            r2 = 1
            int r10 = r10 + r2
            r9.f11169l = r10     // Catch:{ all -> 0x0119 }
            r0.f11191e = r1     // Catch:{ all -> 0x0119 }
            w.h r10 = r9.f11167j     // Catch:{ all -> 0x0119 }
            if (r10 == 0) goto L_0x0105
            boolean r1 = r0.f11190d     // Catch:{ all -> 0x0119 }
            r3 = 10
            r4 = 32
            if (r1 != 0) goto L_0x00ca
            if (r11 == 0) goto L_0x00b1
            goto L_0x00ca
        L_0x00b1:
            java.util.LinkedHashMap<java.lang.String, v.m0.c.e$b> r11 = r9.f11168k     // Catch:{ all -> 0x0119 }
            java.lang.String r1 = r0.f11193g     // Catch:{ all -> 0x0119 }
            r11.remove(r1)     // Catch:{ all -> 0x0119 }
            java.lang.String r11 = f11157B     // Catch:{ all -> 0x0119 }
            w.h r11 = r10.mo11440a(r11)     // Catch:{ all -> 0x0119 }
            r11.writeByte(r4)     // Catch:{ all -> 0x0119 }
            java.lang.String r11 = r0.f11193g     // Catch:{ all -> 0x0119 }
            r10.mo11440a(r11)     // Catch:{ all -> 0x0119 }
            r10.writeByte(r3)     // Catch:{ all -> 0x0119 }
            goto L_0x00eb
        L_0x00ca:
            r0.f11190d = r2     // Catch:{ all -> 0x0119 }
            java.lang.String r1 = f11161z     // Catch:{ all -> 0x0119 }
            w.h r1 = r10.mo11440a(r1)     // Catch:{ all -> 0x0119 }
            r1.writeByte(r4)     // Catch:{ all -> 0x0119 }
            java.lang.String r1 = r0.f11193g     // Catch:{ all -> 0x0119 }
            r10.mo11440a(r1)     // Catch:{ all -> 0x0119 }
            r0.mo11102a(r10)     // Catch:{ all -> 0x0119 }
            r10.writeByte(r3)     // Catch:{ all -> 0x0119 }
            if (r11 == 0) goto L_0x00eb
            long r1 = r9.f11175r     // Catch:{ all -> 0x0119 }
            r3 = 1
            long r3 = r3 + r1
            r9.f11175r = r3     // Catch:{ all -> 0x0119 }
            r0.f11192f = r1     // Catch:{ all -> 0x0119 }
        L_0x00eb:
            r10.flush()     // Catch:{ all -> 0x0119 }
            long r10 = r9.f11166i     // Catch:{ all -> 0x0119 }
            long r0 = r9.f11162e     // Catch:{ all -> 0x0119 }
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 > 0) goto L_0x00fc
            boolean r10 = r9.mo11090g()     // Catch:{ all -> 0x0119 }
            if (r10 == 0) goto L_0x0103
        L_0x00fc:
            java.util.concurrent.Executor r10 = r9.f11181x     // Catch:{ all -> 0x0119 }
            java.lang.Runnable r11 = r9.f11176s     // Catch:{ all -> 0x0119 }
            r10.execute(r11)     // Catch:{ all -> 0x0119 }
        L_0x0103:
            monitor-exit(r9)
            return
        L_0x0105:
            p392u.p401r.p403c.C4638h.m10269a()     // Catch:{ all -> 0x0119 }
            throw r1
        L_0x0109:
            java.lang.String r10 = "Check failed."
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0119 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0119 }
            r11.<init>(r10)     // Catch:{ all -> 0x0119 }
            throw r11     // Catch:{ all -> 0x0119 }
        L_0x0115:
            p392u.p401r.p403c.C4638h.m10271a(r0)     // Catch:{ all -> 0x0119 }
            throw r1
        L_0x0119:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p410v.p411m0.p412c.C4744e.mo11081a(v.m0.c.e$a, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0057, code lost:
        return r0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized p410v.p411m0.p412c.C4744e.C4748c mo11083b(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = "key"
            r1 = 0
            if (r4 == 0) goto L_0x0060
            r3.mo11088f()     // Catch:{ all -> 0x0064 }
            r3.mo11080a()     // Catch:{ all -> 0x0064 }
            r3.mo11087e(r4)     // Catch:{ all -> 0x0064 }
            java.util.LinkedHashMap<java.lang.String, v.m0.c.e$b> r0 = r3.f11168k     // Catch:{ all -> 0x0064 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0064 }
            v.m0.c.e$b r0 = (p410v.p411m0.p412c.C4744e.C4747b) r0     // Catch:{ all -> 0x0064 }
            if (r0 == 0) goto L_0x005e
            java.lang.String r2 = "lruEntries[key] ?: return null"
            p392u.p401r.p403c.C4638h.m10270a(r0, r2)     // Catch:{ all -> 0x0064 }
            boolean r2 = r0.f11190d     // Catch:{ all -> 0x0064 }
            if (r2 != 0) goto L_0x0024
            monitor-exit(r3)
            return r1
        L_0x0024:
            v.m0.c.e$c r0 = r0.mo11101a()     // Catch:{ all -> 0x0064 }
            if (r0 == 0) goto L_0x005c
            int r2 = r3.f11169l     // Catch:{ all -> 0x0064 }
            int r2 = r2 + 1
            r3.f11169l = r2     // Catch:{ all -> 0x0064 }
            w.h r2 = r3.f11167j     // Catch:{ all -> 0x0064 }
            if (r2 == 0) goto L_0x0058
            java.lang.String r1 = f11158C     // Catch:{ all -> 0x0064 }
            w.h r1 = r2.mo11440a(r1)     // Catch:{ all -> 0x0064 }
            r2 = 32
            w.h r1 = r1.writeByte(r2)     // Catch:{ all -> 0x0064 }
            w.h r4 = r1.mo11440a(r4)     // Catch:{ all -> 0x0064 }
            r1 = 10
            r4.writeByte(r1)     // Catch:{ all -> 0x0064 }
            boolean r4 = r3.mo11090g()     // Catch:{ all -> 0x0064 }
            if (r4 == 0) goto L_0x0056
            java.util.concurrent.Executor r4 = r3.f11181x     // Catch:{ all -> 0x0064 }
            java.lang.Runnable r1 = r3.f11176s     // Catch:{ all -> 0x0064 }
            r4.execute(r1)     // Catch:{ all -> 0x0064 }
        L_0x0056:
            monitor-exit(r3)
            return r0
        L_0x0058:
            p392u.p401r.p403c.C4638h.m10269a()     // Catch:{ all -> 0x0064 }
            throw r1
        L_0x005c:
            monitor-exit(r3)
            return r1
        L_0x005e:
            monitor-exit(r3)
            return r1
        L_0x0060:
            p392u.p401r.p403c.C4638h.m10271a(r0)     // Catch:{ all -> 0x0064 }
            throw r1
        L_0x0064:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p410v.p411m0.p412c.C4744e.mo11083b(java.lang.String):v.m0.c.e$c");
    }

    /* renamed from: c */
    public final void mo11084c(String str) {
        String str2;
        int a = C4681g.m10302a((CharSequence) str, ' ', 0, false, 6);
        String str3 = "unexpected journal line: ";
        if (a != -1) {
            int i = a + 1;
            int a2 = C4681g.m10302a((CharSequence) str, ' ', i, false, 4);
            String str4 = "(this as java.lang.String).substring(startIndex)";
            if (a2 == -1) {
                str2 = str.substring(i);
                C4638h.m10270a((Object) str2, str4);
                if (a == f11157B.length() && C4681g.m10327b(str, f11157B, false, 2)) {
                    this.f11168k.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, a2);
                C4638h.m10270a((Object) str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            }
            C4747b bVar = (C4747b) this.f11168k.get(str2);
            if (bVar == null) {
                bVar = new C4747b(this, str2);
                this.f11168k.put(str2, bVar);
            }
            if (a2 != -1 && a == f11161z.length() && C4681g.m10327b(str, f11161z, false, 2)) {
                String substring = str.substring(a2 + 1);
                C4638h.m10270a((Object) substring, str4);
                List a3 = C4681g.m10313a((CharSequence) substring, new char[]{' '}, false, 0, 6);
                bVar.f11190d = true;
                bVar.f11191e = null;
                if (a3 == null) {
                    C4638h.m10271a("strings");
                    throw null;
                } else if (a3.size() == bVar.f11194h.f11180w) {
                    try {
                        int size = a3.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            bVar.f11187a[i2] = Long.parseLong((String) a3.get(i2));
                        }
                    } catch (NumberFormatException unused) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str3);
                        sb.append(a3);
                        throw new IOException(sb.toString());
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str3);
                    sb2.append(a3);
                    throw new IOException(sb2.toString());
                }
            } else if (a2 == -1 && a == f11156A.length() && C4681g.m10327b(str, f11156A, false, 2)) {
                bVar.f11191e = new C4745a(this, bVar);
            } else if (!(a2 == -1 && a == f11158C.length() && C4681g.m10327b(str, f11158C, false, 2))) {
                throw new IOException(C1965a.m4751a(str3, str));
            }
            return;
        }
        throw new IOException(C1965a.m4751a(str3, str));
    }

    public synchronized void close() {
        C4747b[] bVarArr;
        if (this.f11171n) {
            if (!this.f11172o) {
                Collection values = this.f11168k.values();
                C4638h.m10270a((Object) values, "lruEntries.values");
                Object[] array = values.toArray(new C4747b[0]);
                if (array != null) {
                    for (C4747b bVar : (C4747b[]) array) {
                        if (bVar.f11191e != null) {
                            C4745a aVar = bVar.f11191e;
                            if (aVar != null) {
                                aVar.mo11097a();
                            } else {
                                C4638h.m10269a();
                                throw null;
                            }
                        }
                    }
                    mo11095r();
                    C4895h hVar = this.f11167j;
                    if (hVar != null) {
                        hVar.close();
                        this.f11167j = null;
                        this.f11172o = true;
                        return;
                    }
                    C4638h.m10269a();
                    throw null;
                }
                throw new C4557i("null cannot be cast to non-null type kotlin.Array<T>");
            }
        }
        this.f11172o = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002d, code lost:
        return true;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo11086d(java.lang.String r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = "key"
            if (r6 == 0) goto L_0x0030
            r5.mo11088f()     // Catch:{ all -> 0x0035 }
            r5.mo11080a()     // Catch:{ all -> 0x0035 }
            r5.mo11087e(r6)     // Catch:{ all -> 0x0035 }
            java.util.LinkedHashMap<java.lang.String, v.m0.c.e$b> r0 = r5.f11168k     // Catch:{ all -> 0x0035 }
            java.lang.Object r6 = r0.get(r6)     // Catch:{ all -> 0x0035 }
            v.m0.c.e$b r6 = (p410v.p411m0.p412c.C4744e.C4747b) r6     // Catch:{ all -> 0x0035 }
            r0 = 0
            if (r6 == 0) goto L_0x002e
            java.lang.String r1 = "lruEntries[key] ?: return false"
            p392u.p401r.p403c.C4638h.m10270a(r6, r1)     // Catch:{ all -> 0x0035 }
            r5.mo11082a(r6)     // Catch:{ all -> 0x0035 }
            r6 = 1
            long r1 = r5.f11166i     // Catch:{ all -> 0x0035 }
            long r3 = r5.f11162e     // Catch:{ all -> 0x0035 }
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x002c
            r5.f11173p = r0     // Catch:{ all -> 0x0035 }
        L_0x002c:
            monitor-exit(r5)
            return r6
        L_0x002e:
            monitor-exit(r5)
            return r0
        L_0x0030:
            p392u.p401r.p403c.C4638h.m10271a(r0)     // Catch:{ all -> 0x0035 }
            r6 = 0
            throw r6
        L_0x0035:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p410v.p411m0.p412c.C4744e.mo11086d(java.lang.String):boolean");
    }

    /* renamed from: e */
    public final void mo11087e(String str) {
        if (!f11160y.mo10964a(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append("keys must match regex [a-z0-9_-]{1,120}: \"");
            sb.append(str);
            sb.append('\"');
            throw new IllegalArgumentException(sb.toString().toString());
        }
    }

    /* renamed from: f */
    public final synchronized void mo11088f() {
        boolean holdsLock = Thread.holdsLock(this);
        if (C4561m.f10774a) {
            if (!holdsLock) {
                throw new AssertionError("Assertion failed");
            }
        }
        if (!this.f11171n) {
            if (this.f11177t.mo11294f(this.f11165h)) {
                if (this.f11177t.mo11294f(this.f11163f)) {
                    this.f11177t.mo11288a(this.f11165h);
                } else {
                    this.f11177t.mo11289a(this.f11165h, this.f11163f);
                }
            }
            if (this.f11177t.mo11294f(this.f11163f)) {
                try {
                    mo11093m();
                    mo11092k();
                    this.f11171n = true;
                    return;
                } catch (IOException e) {
                    C4840a aVar = C4839f.f11548c;
                    C4839f fVar = C4839f.f11546a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("DiskLruCache ");
                    sb.append(this.f11178u);
                    sb.append(" is corrupt: ");
                    sb.append(e.getMessage());
                    sb.append(", removing");
                    fVar.mo11298a(5, sb.toString(), (Throwable) e);
                    close();
                    this.f11177t.mo11292d(this.f11178u);
                    this.f11172o = false;
                } catch (Throwable th) {
                    this.f11172o = false;
                    throw th;
                }
            }
            mo11094o();
            this.f11171n = true;
        }
    }

    public synchronized void flush() {
        if (this.f11171n) {
            mo11080a();
            mo11095r();
            C4895h hVar = this.f11167j;
            if (hVar != null) {
                hVar.flush();
            } else {
                C4638h.m10269a();
                throw null;
            }
        }
    }

    /* renamed from: g */
    public final boolean mo11090g() {
        int i = this.f11169l;
        return i >= 2000 && i >= this.f11168k.size();
    }

    /* renamed from: h */
    public final C4895h mo11091h() {
        return C0967p0.m2182a((C4915y) new C4751f(this.f11177t.mo11293e(this.f11163f), new C4750e(this)));
    }

    /* renamed from: k */
    public final void mo11092k() {
        this.f11177t.mo11288a(this.f11164g);
        Iterator it = this.f11168k.values().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            C4638h.m10270a(next, "i.next()");
            C4747b bVar = (C4747b) next;
            int i = 0;
            if (bVar.f11191e == null) {
                int i2 = this.f11180w;
                while (i < i2) {
                    this.f11166i += bVar.f11187a[i];
                    i++;
                }
            } else {
                bVar.f11191e = null;
                int i3 = this.f11180w;
                while (i < i3) {
                    this.f11177t.mo11288a((File) bVar.f11188b.get(i));
                    this.f11177t.mo11288a((File) bVar.f11189c.get(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:18|19|(1:21)(1:22)|23|24) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r9.f11169l = r7 - r9.f11168k.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0071, code lost:
        if (r1.mo11460i() == false) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        mo11094o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0077, code lost:
        r9.f11167j = mo11091h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007d, code lost:
        p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5235a((java.io.Closeable) r1, (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0081, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b2, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b3, code lost:
        p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5235a((java.io.Closeable) r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b6, code lost:
        throw r2;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0064 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:25:0x0082=Splitter:B:25:0x0082, B:18:0x0064=Splitter:B:18:0x0064} */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11093m() {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            v.m0.h.b r1 = r9.f11177t
            java.io.File r2 = r9.f11163f
            w.a0 r1 = r1.mo11290b(r2)
            w.i r1 = p119o.p120a.C0967p0.m2183a(r1)
            java.lang.String r2 = r1.mo11450d()     // Catch:{ all -> 0x00b0 }
            java.lang.String r3 = r1.mo11450d()     // Catch:{ all -> 0x00b0 }
            java.lang.String r4 = r1.mo11450d()     // Catch:{ all -> 0x00b0 }
            java.lang.String r5 = r1.mo11450d()     // Catch:{ all -> 0x00b0 }
            java.lang.String r6 = r1.mo11450d()     // Catch:{ all -> 0x00b0 }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = p392u.p401r.p403c.C4638h.m10272a(r7, r2)     // Catch:{ all -> 0x00b0 }
            r8 = 1
            r7 = r7 ^ r8
            if (r7 != 0) goto L_0x0082
            java.lang.String r7 = "1"
            boolean r7 = p392u.p401r.p403c.C4638h.m10272a(r7, r3)     // Catch:{ all -> 0x00b0 }
            r7 = r7 ^ r8
            if (r7 != 0) goto L_0x0082
            int r7 = r9.f11179v     // Catch:{ all -> 0x00b0 }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x00b0 }
            boolean r4 = p392u.p401r.p403c.C4638h.m10272a(r7, r4)     // Catch:{ all -> 0x00b0 }
            r4 = r4 ^ r8
            if (r4 != 0) goto L_0x0082
            int r4 = r9.f11180w     // Catch:{ all -> 0x00b0 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x00b0 }
            boolean r4 = p392u.p401r.p403c.C4638h.m10272a(r4, r5)     // Catch:{ all -> 0x00b0 }
            r4 = r4 ^ r8
            if (r4 != 0) goto L_0x0082
            int r4 = r6.length()     // Catch:{ all -> 0x00b0 }
            r7 = 0
            if (r4 <= 0) goto L_0x0057
            goto L_0x0058
        L_0x0057:
            r8 = r7
        L_0x0058:
            if (r8 != 0) goto L_0x0082
        L_0x005a:
            java.lang.String r0 = r1.mo11450d()     // Catch:{ EOFException -> 0x0064 }
            r9.mo11084c(r0)     // Catch:{ EOFException -> 0x0064 }
            int r7 = r7 + 1
            goto L_0x005a
        L_0x0064:
            java.util.LinkedHashMap<java.lang.String, v.m0.c.e$b> r0 = r9.f11168k     // Catch:{ all -> 0x00b0 }
            int r0 = r0.size()     // Catch:{ all -> 0x00b0 }
            int r7 = r7 - r0
            r9.f11169l = r7     // Catch:{ all -> 0x00b0 }
            boolean r0 = r1.mo11460i()     // Catch:{ all -> 0x00b0 }
            if (r0 != 0) goto L_0x0077
            r9.mo11094o()     // Catch:{ all -> 0x00b0 }
            goto L_0x007d
        L_0x0077:
            w.h r0 = r9.mo11091h()     // Catch:{ all -> 0x00b0 }
            r9.f11167j = r0     // Catch:{ all -> 0x00b0 }
        L_0x007d:
            r0 = 0
            p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5235a(r1, r0)
            return
        L_0x0082:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x00b0 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b0 }
            r7.<init>()     // Catch:{ all -> 0x00b0 }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x00b0 }
            r7.append(r2)     // Catch:{ all -> 0x00b0 }
            r7.append(r0)     // Catch:{ all -> 0x00b0 }
            r7.append(r3)     // Catch:{ all -> 0x00b0 }
            r7.append(r0)     // Catch:{ all -> 0x00b0 }
            r7.append(r5)     // Catch:{ all -> 0x00b0 }
            r7.append(r0)     // Catch:{ all -> 0x00b0 }
            r7.append(r6)     // Catch:{ all -> 0x00b0 }
            r0 = 93
            r7.append(r0)     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x00b0 }
            r4.<init>(r0)     // Catch:{ all -> 0x00b0 }
            throw r4     // Catch:{ all -> 0x00b0 }
        L_0x00b0:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00b2 }
        L_0x00b2:
            r2 = move-exception
            p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5235a(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p410v.p411m0.p412c.C4744e.mo11093m():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b5, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5235a((java.io.Closeable) r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b9, code lost:
        throw r2;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo11094o() {
        /*
            r7 = this;
            monitor-enter(r7)
            w.h r0 = r7.f11167j     // Catch:{ all -> 0x00ba }
            if (r0 == 0) goto L_0x0008
            r0.close()     // Catch:{ all -> 0x00ba }
        L_0x0008:
            v.m0.h.b r0 = r7.f11177t     // Catch:{ all -> 0x00ba }
            java.io.File r1 = r7.f11164g     // Catch:{ all -> 0x00ba }
            w.y r0 = r0.mo11291c(r1)     // Catch:{ all -> 0x00ba }
            w.h r0 = p119o.p120a.C0967p0.m2182a(r0)     // Catch:{ all -> 0x00ba }
            r1 = 0
            java.lang.String r2 = "libcore.io.DiskLruCache"
            w.h r2 = r0.mo11440a(r2)     // Catch:{ all -> 0x00b3 }
            r3 = 10
            r2.writeByte(r3)     // Catch:{ all -> 0x00b3 }
            java.lang.String r2 = "1"
            w.h r2 = r0.mo11440a(r2)     // Catch:{ all -> 0x00b3 }
            r2.writeByte(r3)     // Catch:{ all -> 0x00b3 }
            int r2 = r7.f11179v     // Catch:{ all -> 0x00b3 }
            long r4 = (long) r2     // Catch:{ all -> 0x00b3 }
            w.h r2 = r0.mo11459i(r4)     // Catch:{ all -> 0x00b3 }
            r2.writeByte(r3)     // Catch:{ all -> 0x00b3 }
            int r2 = r7.f11180w     // Catch:{ all -> 0x00b3 }
            long r4 = (long) r2     // Catch:{ all -> 0x00b3 }
            w.h r2 = r0.mo11459i(r4)     // Catch:{ all -> 0x00b3 }
            r2.writeByte(r3)     // Catch:{ all -> 0x00b3 }
            r0.writeByte(r3)     // Catch:{ all -> 0x00b3 }
            java.util.LinkedHashMap<java.lang.String, v.m0.c.e$b> r2 = r7.f11168k     // Catch:{ all -> 0x00b3 }
            java.util.Collection r2 = r2.values()     // Catch:{ all -> 0x00b3 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00b3 }
        L_0x004a:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x00b3 }
            if (r4 == 0) goto L_0x0080
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x00b3 }
            v.m0.c.e$b r4 = (p410v.p411m0.p412c.C4744e.C4747b) r4     // Catch:{ all -> 0x00b3 }
            v.m0.c.e$a r5 = r4.f11191e     // Catch:{ all -> 0x00b3 }
            r6 = 32
            if (r5 == 0) goto L_0x006e
            java.lang.String r5 = f11156A     // Catch:{ all -> 0x00b3 }
            w.h r5 = r0.mo11440a(r5)     // Catch:{ all -> 0x00b3 }
            r5.writeByte(r6)     // Catch:{ all -> 0x00b3 }
            java.lang.String r4 = r4.f11193g     // Catch:{ all -> 0x00b3 }
            r0.mo11440a(r4)     // Catch:{ all -> 0x00b3 }
        L_0x006a:
            r0.writeByte(r3)     // Catch:{ all -> 0x00b3 }
            goto L_0x004a
        L_0x006e:
            java.lang.String r5 = f11161z     // Catch:{ all -> 0x00b3 }
            w.h r5 = r0.mo11440a(r5)     // Catch:{ all -> 0x00b3 }
            r5.writeByte(r6)     // Catch:{ all -> 0x00b3 }
            java.lang.String r5 = r4.f11193g     // Catch:{ all -> 0x00b3 }
            r0.mo11440a(r5)     // Catch:{ all -> 0x00b3 }
            r4.mo11102a(r0)     // Catch:{ all -> 0x00b3 }
            goto L_0x006a
        L_0x0080:
            p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5235a(r0, r1)     // Catch:{ all -> 0x00ba }
            v.m0.h.b r0 = r7.f11177t     // Catch:{ all -> 0x00ba }
            java.io.File r1 = r7.f11163f     // Catch:{ all -> 0x00ba }
            boolean r0 = r0.mo11294f(r1)     // Catch:{ all -> 0x00ba }
            if (r0 == 0) goto L_0x0096
            v.m0.h.b r0 = r7.f11177t     // Catch:{ all -> 0x00ba }
            java.io.File r1 = r7.f11163f     // Catch:{ all -> 0x00ba }
            java.io.File r2 = r7.f11165h     // Catch:{ all -> 0x00ba }
            r0.mo11289a(r1, r2)     // Catch:{ all -> 0x00ba }
        L_0x0096:
            v.m0.h.b r0 = r7.f11177t     // Catch:{ all -> 0x00ba }
            java.io.File r1 = r7.f11164g     // Catch:{ all -> 0x00ba }
            java.io.File r2 = r7.f11163f     // Catch:{ all -> 0x00ba }
            r0.mo11289a(r1, r2)     // Catch:{ all -> 0x00ba }
            v.m0.h.b r0 = r7.f11177t     // Catch:{ all -> 0x00ba }
            java.io.File r1 = r7.f11165h     // Catch:{ all -> 0x00ba }
            r0.mo11288a(r1)     // Catch:{ all -> 0x00ba }
            w.h r0 = r7.mo11091h()     // Catch:{ all -> 0x00ba }
            r7.f11167j = r0     // Catch:{ all -> 0x00ba }
            r0 = 0
            r7.f11170m = r0     // Catch:{ all -> 0x00ba }
            r7.f11174q = r0     // Catch:{ all -> 0x00ba }
            monitor-exit(r7)
            return
        L_0x00b3:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00b5 }
        L_0x00b5:
            r2 = move-exception
            p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5235a(r0, r1)     // Catch:{ all -> 0x00ba }
            throw r2     // Catch:{ all -> 0x00ba }
        L_0x00ba:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p410v.p411m0.p412c.C4744e.mo11094o():void");
    }

    /* renamed from: r */
    public final void mo11095r() {
        while (this.f11166i > this.f11162e) {
            Object next = this.f11168k.values().iterator().next();
            C4638h.m10270a(next, "lruEntries.values.iterator().next()");
            mo11082a((C4747b) next);
        }
        this.f11173p = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized p410v.p411m0.p412c.C4744e.C4745a mo11079a(java.lang.String r5, long r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "key"
            r1 = 0
            if (r5 == 0) goto L_0x007e
            r4.mo11088f()     // Catch:{ all -> 0x0082 }
            r4.mo11080a()     // Catch:{ all -> 0x0082 }
            r4.mo11087e(r5)     // Catch:{ all -> 0x0082 }
            java.util.LinkedHashMap<java.lang.String, v.m0.c.e$b> r0 = r4.f11168k     // Catch:{ all -> 0x0082 }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x0082 }
            v.m0.c.e$b r0 = (p410v.p411m0.p412c.C4744e.C4747b) r0     // Catch:{ all -> 0x0082 }
            r2 = -1
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0027
            if (r0 == 0) goto L_0x0025
            long r2 = r0.f11192f     // Catch:{ all -> 0x0082 }
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x0027
        L_0x0025:
            monitor-exit(r4)
            return r1
        L_0x0027:
            if (r0 == 0) goto L_0x002c
            v.m0.c.e$a r6 = r0.f11191e     // Catch:{ all -> 0x0082 }
            goto L_0x002d
        L_0x002c:
            r6 = r1
        L_0x002d:
            if (r6 == 0) goto L_0x0031
            monitor-exit(r4)
            return r1
        L_0x0031:
            boolean r6 = r4.f11173p     // Catch:{ all -> 0x0082 }
            if (r6 != 0) goto L_0x0075
            boolean r6 = r4.f11174q     // Catch:{ all -> 0x0082 }
            if (r6 == 0) goto L_0x003a
            goto L_0x0075
        L_0x003a:
            w.h r6 = r4.f11167j     // Catch:{ all -> 0x0082 }
            if (r6 == 0) goto L_0x0071
            java.lang.String r7 = f11156A     // Catch:{ all -> 0x0082 }
            w.h r7 = r6.mo11440a(r7)     // Catch:{ all -> 0x0082 }
            r2 = 32
            w.h r7 = r7.writeByte(r2)     // Catch:{ all -> 0x0082 }
            w.h r7 = r7.mo11440a(r5)     // Catch:{ all -> 0x0082 }
            r2 = 10
            r7.writeByte(r2)     // Catch:{ all -> 0x0082 }
            r6.flush()     // Catch:{ all -> 0x0082 }
            boolean r6 = r4.f11170m     // Catch:{ all -> 0x0082 }
            if (r6 == 0) goto L_0x005c
            monitor-exit(r4)
            return r1
        L_0x005c:
            if (r0 != 0) goto L_0x0068
            v.m0.c.e$b r0 = new v.m0.c.e$b     // Catch:{ all -> 0x0082 }
            r0.<init>(r4, r5)     // Catch:{ all -> 0x0082 }
            java.util.LinkedHashMap<java.lang.String, v.m0.c.e$b> r6 = r4.f11168k     // Catch:{ all -> 0x0082 }
            r6.put(r5, r0)     // Catch:{ all -> 0x0082 }
        L_0x0068:
            v.m0.c.e$a r5 = new v.m0.c.e$a     // Catch:{ all -> 0x0082 }
            r5.<init>(r4, r0)     // Catch:{ all -> 0x0082 }
            r0.f11191e = r5     // Catch:{ all -> 0x0082 }
            monitor-exit(r4)
            return r5
        L_0x0071:
            p392u.p401r.p403c.C4638h.m10269a()     // Catch:{ all -> 0x0082 }
            throw r1
        L_0x0075:
            java.util.concurrent.Executor r5 = r4.f11181x     // Catch:{ all -> 0x0082 }
            java.lang.Runnable r6 = r4.f11176s     // Catch:{ all -> 0x0082 }
            r5.execute(r6)     // Catch:{ all -> 0x0082 }
            monitor-exit(r4)
            return r1
        L_0x007e:
            p392u.p401r.p403c.C4638h.m10271a(r0)     // Catch:{ all -> 0x0082 }
            throw r1
        L_0x0082:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p410v.p411m0.p412c.C4744e.mo11079a(java.lang.String, long):v.m0.c.e$a");
    }

    /* renamed from: a */
    public final boolean mo11082a(C4747b bVar) {
        if (bVar != null) {
            C4745a aVar = bVar.f11191e;
            if (aVar != null) {
                aVar.mo11099c();
            }
            int i = this.f11180w;
            for (int i2 = 0; i2 < i; i2++) {
                this.f11177t.mo11288a((File) bVar.f11188b.get(i2));
                long j = this.f11166i;
                long[] jArr = bVar.f11187a;
                this.f11166i = j - jArr[i2];
                jArr[i2] = 0;
            }
            this.f11169l++;
            C4895h hVar = this.f11167j;
            if (hVar != null) {
                hVar.mo11440a(f11157B).writeByte(32).mo11440a(bVar.f11193g).writeByte(10);
                this.f11168k.remove(bVar.f11193g);
                if (mo11090g()) {
                    this.f11181x.execute(this.f11176s);
                }
                return true;
            }
            C4638h.m10269a();
            throw null;
        }
        C4638h.m10271a("entry");
        throw null;
    }
}
