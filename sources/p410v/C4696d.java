package p410v;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p119o.p120a.C0967p0;
import p392u.C4557i;
import p392u.p393n.C4570i;
import p392u.p393n.C4572k;
import p392u.p401r.p403c.C4638h;
import p392u.p409w.C4681g;
import p410v.C4870w.C4871a;
import p410v.C4879z.C4880a;
import p410v.p411m0.C4737b;
import p410v.p411m0.p412c.C4742c;
import p410v.p411m0.p412c.C4743d;
import p410v.p411m0.p412c.C4744e;
import p410v.p411m0.p412c.C4744e.C4745a;
import p410v.p411m0.p412c.C4744e.C4748c;
import p410v.p411m0.p414e.C4781j;
import p410v.p411m0.p417h.C4827b;
import p410v.p411m0.p418i.C4839f;
import p410v.p411m0.p418i.C4839f.C4840a;
import p423w.C4882a0;
import p423w.C4892f;
import p423w.C4892f.C4893a;
import p423w.C4895h;
import p423w.C4896i;
import p423w.C4897j;
import p423w.C4897j.C4898a;
import p423w.C4899k;
import p423w.C4900l;
import p423w.C4915y;
import p423w.p424c0.C4889a;

/* renamed from: v.d */
public final class C4696d implements Closeable, Flushable {

    /* renamed from: e */
    public final C4744e f10977e;

    /* renamed from: f */
    public int f10978f;

    /* renamed from: g */
    public int f10979g;

    /* renamed from: h */
    public int f10980h;

    /* renamed from: i */
    public int f10981i;

    /* renamed from: j */
    public int f10982j;

    /* renamed from: v.d$a */
    public static final class C4697a extends C4725j0 {

        /* renamed from: g */
        public final C4896i f10983g;

        /* renamed from: h */
        public final C4748c f10984h;

        /* renamed from: i */
        public final String f10985i;

        /* renamed from: j */
        public final String f10986j;

        /* renamed from: v.d$a$a */
        public static final class C4698a extends C4900l {

            /* renamed from: f */
            public final /* synthetic */ C4697a f10987f;

            public C4698a(C4697a aVar, C4882a0 a0Var, C4882a0 a0Var2) {
                this.f10987f = aVar;
                super(a0Var2);
            }

            public void close() {
                this.f10987f.f10984h.close();
                this.f11670e.close();
            }
        }

        public C4697a(C4748c cVar, String str, String str2) {
            if (cVar != null) {
                this.f10984h = cVar;
                this.f10985i = str;
                this.f10986j = str2;
                C4882a0 a0Var = (C4882a0) cVar.f11197g.get(1);
                this.f10983g = C0967p0.m2183a((C4882a0) new C4698a(this, a0Var, a0Var));
                return;
            }
            C4638h.m10271a("snapshot");
            throw null;
        }

        /* renamed from: f */
        public long mo10989f() {
            String str = this.f10986j;
            if (str != null) {
                return C4737b.m10453a(str, -1);
            }
            return -1;
        }

        /* renamed from: g */
        public C4879z mo10990g() {
            String str = this.f10985i;
            if (str == null) {
                return null;
            }
            C4880a aVar = C4879z.f11637f;
            return C4880a.m10909b(str);
        }

        /* renamed from: h */
        public C4896i mo10991h() {
            return this.f10983g;
        }
    }

    /* renamed from: v.d$b */
    public static final class C4699b {

        /* renamed from: k */
        public static final String f10988k = "OkHttp-Sent-Millis";

        /* renamed from: l */
        public static final String f10989l = "OkHttp-Received-Millis";

        /* renamed from: a */
        public final String f10990a;

        /* renamed from: b */
        public final C4870w f10991b;

        /* renamed from: c */
        public final String f10992c;

        /* renamed from: d */
        public final C4694c0 f10993d;

        /* renamed from: e */
        public final int f10994e;

        /* renamed from: f */
        public final String f10995f;

        /* renamed from: g */
        public final C4870w f10996g;

        /* renamed from: h */
        public final C4866v f10997h;

        /* renamed from: i */
        public final long f10998i;

        /* renamed from: j */
        public final long f10999j;

        static {
            C4840a aVar = C4839f.f11548c;
            if (C4839f.f11546a != null) {
                C4840a aVar2 = C4839f.f11548c;
                if (C4839f.f11546a != null) {
                    return;
                }
                throw null;
            }
            throw null;
        }

        public C4699b(C4720i0 i0Var) {
            C4870w wVar;
            if (i0Var != null) {
                this.f10990a = i0Var.f11060f.f11029b.f11625j;
                C4720i0 i0Var2 = i0Var.f11067m;
                if (i0Var2 != null) {
                    C4870w wVar2 = i0Var2.f11060f.f11031d;
                    Set a = C4696d.m10350a(i0Var.f11065k);
                    if (a.isEmpty()) {
                        wVar = C4737b.f11141b;
                    } else {
                        C4871a aVar = new C4871a();
                        int size = wVar2.size();
                        for (int i = 0; i < size; i++) {
                            String e = wVar2.mo11369e(i);
                            if (a.contains(e)) {
                                aVar.mo11377a(e, wVar2.mo11371f(i));
                            }
                        }
                        wVar = aVar.mo11378a();
                    }
                    this.f10991b = wVar;
                    this.f10992c = i0Var.f11060f.f11030c;
                    this.f10993d = i0Var.f11061g;
                    this.f10994e = i0Var.f11063i;
                    this.f10995f = i0Var.f11062h;
                    this.f10996g = i0Var.f11065k;
                    this.f10997h = i0Var.f11064j;
                    this.f10998i = i0Var.f11070p;
                    this.f10999j = i0Var.f11071q;
                    return;
                }
                C4638h.m10269a();
                throw null;
            }
            C4638h.m10271a("response");
            throw null;
        }

        /* renamed from: a */
        public final List<Certificate> mo10993a(C4896i iVar) {
            int a = C4696d.m10348a(iVar);
            if (a == -1) {
                return C4570i.f10779e;
            }
            try {
                CertificateFactory instance = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(a);
                int i = 0;
                while (i < a) {
                    String d = iVar.mo11450d();
                    C4892f fVar = new C4892f();
                    C4897j a2 = C4897j.f11665i.mo11509a(d);
                    if (a2 != null) {
                        fVar.mo11443a(a2);
                        arrayList.add(instance.generateCertificate(new C4893a(fVar)));
                        i++;
                    } else {
                        C4638h.m10269a();
                        throw null;
                    }
                }
                return arrayList;
            } catch (CertificateException e) {
                throw new IOException(e.getMessage());
            }
        }

        /* renamed from: a */
        public final void mo10995a(C4895h hVar, List<? extends Certificate> list) {
            try {
                hVar.mo11459i((long) list.size()).writeByte(10);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    byte[] encoded = ((Certificate) list.get(i)).getEncoded();
                    C4898a aVar = C4897j.f11665i;
                    C4638h.m10270a((Object) encoded, "bytes");
                    hVar.mo11440a(C4889a.m10938a(C4898a.m11029a(aVar, encoded, 0, 0, 3))).writeByte(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }

        /* renamed from: a */
        public final void mo10994a(C4745a aVar) {
            String str;
            if (aVar != null) {
                C4895h a = C0967p0.m2182a(aVar.mo11096a(0));
                a.mo11440a(this.f10990a).writeByte(10);
                a.mo11440a(this.f10992c).writeByte(10);
                a.mo11459i((long) this.f10991b.size()).writeByte(10);
                int size = this.f10991b.size();
                int i = 0;
                while (true) {
                    str = ": ";
                    if (i >= size) {
                        break;
                    }
                    a.mo11440a(this.f10991b.mo11369e(i)).mo11440a(str).mo11440a(this.f10991b.mo11371f(i)).writeByte(10);
                    i++;
                }
                a.mo11440a(new C4781j(this.f10993d, this.f10994e, this.f10995f).toString()).writeByte(10);
                a.mo11459i((long) (this.f10996g.size() + 2)).writeByte(10);
                int size2 = this.f10996g.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    a.mo11440a(this.f10996g.mo11369e(i2)).mo11440a(str).mo11440a(this.f10996g.mo11371f(i2)).writeByte(10);
                }
                a.mo11440a(f10988k).mo11440a(str).mo11459i(this.f10998i).writeByte(10);
                a.mo11440a(f10989l).mo11440a(str).mo11459i(this.f10999j).writeByte(10);
                if (C4681g.m10327b(this.f10990a, "https://", false, 2)) {
                    a.writeByte(10);
                    C4866v vVar = this.f10997h;
                    if (vVar != null) {
                        a.mo11440a(vVar.f11607c.f11105a).writeByte(10);
                        mo10995a(a, this.f10997h.mo11360a());
                        mo10995a(a, this.f10997h.f11608d);
                        a.mo11440a(this.f10997h.f11606b.f11126e).writeByte(10);
                    } else {
                        C4638h.m10269a();
                        throw null;
                    }
                }
                a.close();
                return;
            }
            C4638h.m10271a("editor");
            throw null;
        }

        public C4699b(C4882a0 a0Var) {
            C4866v vVar = null;
            if (a0Var != null) {
                try {
                    C4896i a = C0967p0.m2183a(a0Var);
                    this.f10990a = a.mo11450d();
                    this.f10992c = a.mo11450d();
                    C4871a aVar = new C4871a();
                    int a2 = C4696d.m10348a(a);
                    boolean z = false;
                    for (int i = 0; i < a2; i++) {
                        aVar.mo11376a(a.mo11450d());
                    }
                    this.f10991b = aVar.mo11378a();
                    C4781j a3 = C4781j.m10600a(a.mo11450d());
                    this.f10993d = a3.f11313a;
                    this.f10994e = a3.f11314b;
                    this.f10995f = a3.f11315c;
                    C4871a aVar2 = new C4871a();
                    int a4 = C4696d.m10348a(a);
                    for (int i2 = 0; i2 < a4; i2++) {
                        aVar2.mo11376a(a.mo11450d());
                    }
                    String b = aVar2.mo11379b(f10988k);
                    String b2 = aVar2.mo11379b(f10989l);
                    aVar2.mo11381c(f10988k);
                    aVar2.mo11381c(f10989l);
                    long j = 0;
                    this.f10998i = b != null ? Long.parseLong(b) : 0;
                    if (b2 != null) {
                        j = Long.parseLong(b2);
                    }
                    this.f10999j = j;
                    this.f10996g = aVar2.mo11378a();
                    if (C4681g.m10327b(this.f10990a, "https://", false, 2)) {
                        String d = a.mo11450d();
                        if (d.length() > 0) {
                            z = true;
                        }
                        if (!z) {
                            vVar = C4866v.f11604f.mo11365a(!a.mo11460i() ? C4732l0.f11125l.mo11059a(a.mo11450d()) : C4732l0.SSL_3_0, C4722j.f11104t.mo11046a(a.mo11450d()), mo10993a(a), mo10993a(a));
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("expected \"\" but was \"");
                            sb.append(d);
                            sb.append('\"');
                            throw new IOException(sb.toString());
                        }
                    }
                    this.f10997h = vVar;
                } finally {
                    a0Var.close();
                }
            } else {
                C4638h.m10271a("rawSource");
                throw null;
            }
        }
    }

    /* renamed from: v.d$c */
    public final class C4700c implements C4742c {

        /* renamed from: a */
        public final C4915y f11000a;

        /* renamed from: b */
        public final C4915y f11001b;

        /* renamed from: c */
        public boolean f11002c;

        /* renamed from: d */
        public final C4745a f11003d;

        /* renamed from: e */
        public final /* synthetic */ C4696d f11004e;

        /* renamed from: v.d$c$a */
        public static final class C4701a extends C4899k {

            /* renamed from: f */
            public final /* synthetic */ C4700c f11005f;

            public C4701a(C4700c cVar, C4915y yVar) {
                this.f11005f = cVar;
                super(yVar);
            }

            public void close() {
                synchronized (this.f11005f.f11004e) {
                    if (!this.f11005f.f11002c) {
                        this.f11005f.f11002c = true;
                        this.f11005f.f11004e.f10978f++;
                        this.f11669e.close();
                        this.f11005f.f11003d.mo11098b();
                    }
                }
            }
        }

        public C4700c(C4696d dVar, C4745a aVar) {
            if (aVar != null) {
                this.f11004e = dVar;
                this.f11003d = aVar;
                C4915y a = aVar.mo11096a(1);
                this.f11000a = a;
                this.f11001b = new C4701a(this, a);
                return;
            }
            C4638h.m10271a("editor");
            throw null;
        }

        /* renamed from: a */
        public C4915y mo10996a() {
            return this.f11001b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0014, code lost:
            p410v.p411m0.C4737b.m10463a((java.io.Closeable) r4.f11000a);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            r4.f11003d.mo11097a();
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo10997b() {
            /*
                r4 = this;
                v.d r0 = r4.f11004e
                monitor-enter(r0)
                boolean r1 = r4.f11002c     // Catch:{ all -> 0x001f }
                if (r1 == 0) goto L_0x0009
                monitor-exit(r0)
                return
            L_0x0009:
                r1 = 1
                r4.f11002c = r1     // Catch:{ all -> 0x001f }
                v.d r2 = r4.f11004e     // Catch:{ all -> 0x001f }
                int r3 = r2.f10979g     // Catch:{ all -> 0x001f }
                int r3 = r3 + r1
                r2.f10979g = r3     // Catch:{ all -> 0x001f }
                monitor-exit(r0)
                w.y r0 = r4.f11000a
                p410v.p411m0.C4737b.m10463a(r0)
                v.m0.c.e$a r0 = r4.f11003d     // Catch:{ IOException -> 0x001e }
                r0.mo11097a()     // Catch:{ IOException -> 0x001e }
            L_0x001e:
                return
            L_0x001f:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p410v.C4696d.C4700c.mo10997b():void");
        }
    }

    public C4696d(File file, long j) {
        if (file != null) {
            C4827b bVar = C4827b.f11520a;
            C4744e eVar = C4744e.f11159D;
            boolean z = false;
            if (j > 0) {
                z = true;
            }
            if (z) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), C4737b.m10460a("OkHttp DiskLruCache", true));
                C4744e eVar2 = new C4744e(bVar, file, 201105, 2, j, threadPoolExecutor);
                this.f10977e = eVar2;
                return;
            }
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        C4638h.m10271a("directory");
        throw null;
    }

    /* renamed from: a */
    public static final String m10349a(C4873x xVar) {
        if (xVar != null) {
            return C4897j.f11665i.mo11511c(xVar.f11625j).mo11496a("MD5").mo11504h();
        }
        C4638h.m10271a("url");
        throw null;
    }

    /* renamed from: a */
    public final synchronized void mo10984a() {
        this.f10981i++;
    }

    public void close() {
        this.f10977e.close();
    }

    public void flush() {
        this.f10977e.flush();
    }

    /* renamed from: a */
    public static final int m10348a(C4896i iVar) {
        if (iVar != null) {
            try {
                long n = iVar.mo11465n();
                String d = iVar.mo11450d();
                if (n >= 0 && n <= ((long) Integer.MAX_VALUE)) {
                    if (!(d.length() > 0)) {
                        return (int) n;
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append("expected an int but was \"");
                sb.append(n);
                sb.append(d);
                sb.append('\"');
                throw new IOException(sb.toString());
            } catch (NumberFormatException e) {
                throw new IOException(e.getMessage());
            }
        } else {
            C4638h.m10271a("source");
            throw null;
        }
    }

    /* renamed from: a */
    public final void mo10985a(C4706e0 e0Var) {
        if (e0Var != null) {
            this.f10977e.mo11086d(m10349a(e0Var.f11029b));
        } else {
            C4638h.m10271a("request");
            throw null;
        }
    }

    /* renamed from: a */
    public final synchronized void mo10986a(C4743d dVar) {
        String str = "cacheStrategy";
        if (dVar != null) {
            this.f10982j++;
            if (dVar.f11154a != null) {
                this.f10980h++;
            } else if (dVar.f11155b != null) {
                this.f10981i++;
            }
        } else {
            C4638h.m10271a(str);
            throw null;
        }
    }

    /* renamed from: a */
    public static final Set<String> m10350a(C4870w wVar) {
        int size = wVar.size();
        TreeSet treeSet = null;
        for (int i = 0; i < size; i++) {
            if (C4681g.m10322a("Vary", wVar.mo11369e(i), true)) {
                String f = wVar.mo11371f(i);
                if (treeSet == null) {
                    Comparator comparator = String.CASE_INSENSITIVE_ORDER;
                    C4638h.m10270a((Object) comparator, "java.lang.String.CASE_INSENSITIVE_ORDER");
                    treeSet = new TreeSet(comparator);
                }
                for (String str : C4681g.m10313a((CharSequence) f, new char[]{','}, false, 0, 6)) {
                    if (str != null) {
                        treeSet.add(C4681g.m10328c(str).toString());
                    } else {
                        throw new C4557i("null cannot be cast to non-null type kotlin.CharSequence");
                    }
                }
                continue;
            }
        }
        return treeSet != null ? treeSet : C4572k.f10781e;
    }
}
