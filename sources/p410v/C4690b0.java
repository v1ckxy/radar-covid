package p410v;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p392u.p401r.p403c.C4636f;
import p392u.p401r.p403c.C4638h;
import p410v.C4708f.C4709a;
import p410v.C4861t.C4863b;
import p410v.p411m0.C4736a;
import p410v.p411m0.C4737b;
import p410v.p411m0.p421k.C4851c;
import p410v.p411m0.p421k.C4852d;

/* renamed from: v.b0 */
public class C4690b0 implements Cloneable, C4709a {

    /* renamed from: G */
    public static final List<C4694c0> f10908G = C4737b.m10458a((T[]) new C4694c0[]{C4694c0.HTTP_2, C4694c0.HTTP_1_1});

    /* renamed from: H */
    public static final List<C4734m> f10909H = C4737b.m10458a((T[]) new C4734m[]{C4734m.f11129g, C4734m.f11130h});

    /* renamed from: I */
    public static final C4692b f10910I = new C4692b(null);

    /* renamed from: A */
    public final C4851c f10911A;

    /* renamed from: B */
    public final int f10912B;

    /* renamed from: C */
    public final int f10913C;

    /* renamed from: D */
    public final int f10914D;

    /* renamed from: E */
    public final int f10915E;

    /* renamed from: F */
    public final int f10916F;

    /* renamed from: e */
    public final C4859q f10917e;

    /* renamed from: f */
    public final C4731l f10918f;

    /* renamed from: g */
    public final List<C4877y> f10919g;

    /* renamed from: h */
    public final List<C4877y> f10920h;

    /* renamed from: i */
    public final C4863b f10921i;

    /* renamed from: j */
    public final boolean f10922j;

    /* renamed from: k */
    public final C4693c f10923k;

    /* renamed from: l */
    public final boolean f10924l;

    /* renamed from: m */
    public final boolean f10925m;

    /* renamed from: n */
    public final C4858p f10926n;

    /* renamed from: o */
    public final C4696d f10927o;

    /* renamed from: p */
    public final C4860s f10928p;

    /* renamed from: q */
    public final Proxy f10929q;

    /* renamed from: r */
    public final ProxySelector f10930r;

    /* renamed from: s */
    public final C4693c f10931s;

    /* renamed from: t */
    public final SocketFactory f10932t;

    /* renamed from: u */
    public final SSLSocketFactory f10933u;

    /* renamed from: v */
    public final X509TrustManager f10934v;

    /* renamed from: w */
    public final List<C4734m> f10935w;

    /* renamed from: x */
    public final List<C4694c0> f10936x;

    /* renamed from: y */
    public final HostnameVerifier f10937y;

    /* renamed from: z */
    public final C4713h f10938z;

    /* renamed from: v.b0$a */
    public static final class C4691a {

        /* renamed from: A */
        public int f10939A;

        /* renamed from: B */
        public int f10940B;

        /* renamed from: a */
        public C4859q f10941a;

        /* renamed from: b */
        public C4731l f10942b;

        /* renamed from: c */
        public final List<C4877y> f10943c;

        /* renamed from: d */
        public final List<C4877y> f10944d;

        /* renamed from: e */
        public C4863b f10945e;

        /* renamed from: f */
        public boolean f10946f;

        /* renamed from: g */
        public C4693c f10947g;

        /* renamed from: h */
        public boolean f10948h;

        /* renamed from: i */
        public boolean f10949i;

        /* renamed from: j */
        public C4858p f10950j;

        /* renamed from: k */
        public C4696d f10951k;

        /* renamed from: l */
        public C4860s f10952l;

        /* renamed from: m */
        public Proxy f10953m;

        /* renamed from: n */
        public ProxySelector f10954n;

        /* renamed from: o */
        public C4693c f10955o;

        /* renamed from: p */
        public SocketFactory f10956p;

        /* renamed from: q */
        public SSLSocketFactory f10957q;

        /* renamed from: r */
        public X509TrustManager f10958r;

        /* renamed from: s */
        public List<C4734m> f10959s;

        /* renamed from: t */
        public List<? extends C4694c0> f10960t;

        /* renamed from: u */
        public HostnameVerifier f10961u;

        /* renamed from: v */
        public C4713h f10962v;

        /* renamed from: w */
        public C4851c f10963w;

        /* renamed from: x */
        public int f10964x;

        /* renamed from: y */
        public int f10965y;

        /* renamed from: z */
        public int f10966z;

        public C4691a() {
            this.f10941a = new C4859q();
            this.f10942b = new C4731l();
            this.f10943c = new ArrayList();
            this.f10944d = new ArrayList();
            this.f10945e = new C4736a(C4861t.f11596a);
            this.f10946f = true;
            this.f10947g = C4693c.f10967a;
            this.f10948h = true;
            this.f10949i = true;
            this.f10950j = C4858p.f11588a;
            this.f10952l = C4860s.f11595a;
            this.f10955o = C4693c.f10967a;
            SocketFactory socketFactory = SocketFactory.getDefault();
            C4638h.m10270a((Object) socketFactory, "SocketFactory.getDefault()");
            this.f10956p = socketFactory;
            C4692b bVar = C4690b0.f10910I;
            this.f10959s = C4690b0.f10909H;
            C4692b bVar2 = C4690b0.f10910I;
            this.f10960t = C4690b0.f10908G;
            this.f10961u = C4852d.f11565a;
            this.f10962v = C4713h.f11043c;
            this.f10965y = 10000;
            this.f10966z = 10000;
            this.f10939A = 10000;
        }

        /* renamed from: a */
        public final C4691a mo10981a(C4877y yVar) {
            if (yVar != null) {
                this.f10943c.add(yVar);
                return this;
            }
            C4638h.m10271a("interceptor");
            throw null;
        }

        public C4691a(C4690b0 b0Var) {
            if (b0Var != null) {
                this();
                this.f10941a = b0Var.f10917e;
                this.f10942b = b0Var.f10918f;
                C2286e.m5263a((Collection<? super T>) this.f10943c, (Iterable<? extends T>) b0Var.f10919g);
                C2286e.m5263a((Collection<? super T>) this.f10944d, (Iterable<? extends T>) b0Var.f10920h);
                this.f10945e = b0Var.f10921i;
                this.f10946f = b0Var.f10922j;
                this.f10947g = b0Var.f10923k;
                this.f10948h = b0Var.f10924l;
                this.f10949i = b0Var.f10925m;
                this.f10950j = b0Var.f10926n;
                this.f10951k = b0Var.f10927o;
                this.f10952l = b0Var.f10928p;
                this.f10953m = b0Var.f10929q;
                this.f10954n = b0Var.f10930r;
                this.f10955o = b0Var.f10931s;
                this.f10956p = b0Var.f10932t;
                this.f10957q = b0Var.f10933u;
                this.f10958r = b0Var.f10934v;
                this.f10959s = b0Var.f10935w;
                this.f10960t = b0Var.f10936x;
                this.f10961u = b0Var.f10937y;
                this.f10962v = b0Var.f10938z;
                this.f10963w = b0Var.f10911A;
                this.f10964x = b0Var.f10912B;
                this.f10965y = b0Var.f10913C;
                this.f10966z = b0Var.f10914D;
                this.f10939A = b0Var.f10915E;
                this.f10940B = b0Var.f10916F;
                return;
            }
            C4638h.m10271a("okHttpClient");
            throw null;
        }
    }

    /* renamed from: v.b0$b */
    public static final class C4692b {
        public /* synthetic */ C4692b(C4636f fVar) {
        }
    }

    public C4690b0() {
        this(new C4691a());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x004e, code lost:
        if (r1 != null) goto L_0x0053;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x017a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C4690b0(p410v.C4690b0.C4691a r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 == 0) goto L_0x0180
            r6.<init>()
            v.q r1 = r7.f10941a
            r6.f10917e = r1
            v.l r1 = r7.f10942b
            r6.f10918f = r1
            java.util.List<v.y> r1 = r7.f10943c
            java.util.List r1 = p410v.p411m0.C4737b.m10474b(r1)
            r6.f10919g = r1
            java.util.List<v.y> r1 = r7.f10944d
            java.util.List r1 = p410v.p411m0.C4737b.m10474b(r1)
            r6.f10920h = r1
            v.t$b r1 = r7.f10945e
            r6.f10921i = r1
            boolean r1 = r7.f10946f
            r6.f10922j = r1
            v.c r1 = r7.f10947g
            r6.f10923k = r1
            boolean r1 = r7.f10948h
            r6.f10924l = r1
            boolean r1 = r7.f10949i
            r6.f10925m = r1
            v.p r1 = r7.f10950j
            r6.f10926n = r1
            v.d r1 = r7.f10951k
            r6.f10927o = r1
            v.s r1 = r7.f10952l
            r6.f10928p = r1
            java.net.Proxy r1 = r7.f10953m
            r6.f10929q = r1
            if (r1 == 0) goto L_0x0045
            goto L_0x0051
        L_0x0045:
            java.net.ProxySelector r1 = r7.f10954n
            if (r1 == 0) goto L_0x004a
            goto L_0x004e
        L_0x004a:
            java.net.ProxySelector r1 = java.net.ProxySelector.getDefault()
        L_0x004e:
            if (r1 == 0) goto L_0x0051
            goto L_0x0053
        L_0x0051:
            v.m0.j.a r1 = p410v.p411m0.p420j.C4848a.f11562a
        L_0x0053:
            r6.f10930r = r1
            v.c r1 = r7.f10955o
            r6.f10931s = r1
            javax.net.SocketFactory r1 = r7.f10956p
            r6.f10932t = r1
            java.util.List<v.m> r1 = r7.f10959s
            r6.f10935w = r1
            java.util.List<? extends v.c0> r2 = r7.f10960t
            r6.f10936x = r2
            javax.net.ssl.HostnameVerifier r2 = r7.f10961u
            r6.f10937y = r2
            int r2 = r7.f10964x
            r6.f10912B = r2
            int r2 = r7.f10965y
            r6.f10913C = r2
            int r2 = r7.f10966z
            r6.f10914D = r2
            int r2 = r7.f10939A
            r6.f10915E = r2
            int r2 = r7.f10940B
            r6.f10916F = r2
            javax.net.ssl.SSLSocketFactory r2 = r7.f10957q
            r3 = 1
            if (r2 != 0) goto L_0x00f9
            boolean r2 = r1 instanceof java.util.Collection
            r4 = 0
            if (r2 == 0) goto L_0x008e
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x008e
            goto L_0x00a4
        L_0x008e:
            java.util.Iterator r1 = r1.iterator()
        L_0x0092:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00a4
            java.lang.Object r2 = r1.next()
            v.m r2 = (p410v.C4734m) r2
            boolean r2 = r2.f11131a
            if (r2 == 0) goto L_0x0092
            r1 = r4
            goto L_0x00a5
        L_0x00a4:
            r1 = r3
        L_0x00a5:
            if (r1 == 0) goto L_0x00a8
            goto L_0x00f9
        L_0x00a8:
            v.m0.i.f$a r1 = p410v.p411m0.p418i.C4839f.f11548c
            v.m0.i.f r1 = p410v.p411m0.p418i.C4839f.f11546a
            javax.net.ssl.X509TrustManager r1 = r1.mo11315b()
            r6.f10934v = r1
            v.m0.i.f$a r1 = p410v.p411m0.p418i.C4839f.f11548c
            v.m0.i.f r1 = p410v.p411m0.p418i.C4839f.f11546a
            javax.net.ssl.X509TrustManager r2 = r6.f10934v
            r1.mo11316c(r2)
            javax.net.ssl.X509TrustManager r1 = r6.f10934v
            if (r1 == 0) goto L_0x00f5
            v.m0.i.f$a r2 = p410v.p411m0.p418i.C4839f.f11548c     // Catch:{ GeneralSecurityException -> 0x00ec }
            v.m0.i.f r2 = p410v.p411m0.p418i.C4839f.f11546a     // Catch:{ GeneralSecurityException -> 0x00ec }
            javax.net.ssl.SSLContext r2 = r2.mo11313a()     // Catch:{ GeneralSecurityException -> 0x00ec }
            javax.net.ssl.TrustManager[] r5 = new javax.net.ssl.TrustManager[r3]     // Catch:{ GeneralSecurityException -> 0x00ec }
            r5[r4] = r1     // Catch:{ GeneralSecurityException -> 0x00ec }
            r2.init(r0, r5, r0)     // Catch:{ GeneralSecurityException -> 0x00ec }
            javax.net.ssl.SSLSocketFactory r1 = r2.getSocketFactory()     // Catch:{ GeneralSecurityException -> 0x00ec }
            java.lang.String r2 = "sslContext.socketFactory"
            p392u.p401r.p403c.C4638h.m10270a(r1, r2)     // Catch:{ GeneralSecurityException -> 0x00ec }
            r6.f10933u = r1
            javax.net.ssl.X509TrustManager r1 = r6.f10934v
            if (r1 == 0) goto L_0x00e8
            v.m0.i.f$a r2 = p410v.p411m0.p418i.C4839f.f11548c
            v.m0.i.f r2 = p410v.p411m0.p418i.C4839f.f11546a
            v.m0.k.c r1 = r2.mo11297a(r1)
            r6.f10911A = r1
            goto L_0x0105
        L_0x00e8:
            p392u.p401r.p403c.C4638h.m10269a()
            throw r0
        L_0x00ec:
            r7 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "No System TLS"
            r0.<init>(r1, r7)
            throw r0
        L_0x00f5:
            p392u.p401r.p403c.C4638h.m10269a()
            throw r0
        L_0x00f9:
            javax.net.ssl.SSLSocketFactory r1 = r7.f10957q
            r6.f10933u = r1
            v.m0.k.c r1 = r7.f10963w
            r6.f10911A = r1
            javax.net.ssl.X509TrustManager r1 = r7.f10958r
            r6.f10934v = r1
        L_0x0105:
            javax.net.ssl.SSLSocketFactory r1 = r6.f10933u
            if (r1 == 0) goto L_0x0112
            v.m0.i.f$a r1 = p410v.p411m0.p418i.C4839f.f11548c
            v.m0.i.f r1 = p410v.p411m0.p418i.C4839f.f11546a
            javax.net.ssl.SSLSocketFactory r2 = r6.f10933u
            r1.mo11314a(r2)
        L_0x0112:
            v.h r7 = r7.f10962v
            v.m0.k.c r1 = r6.f10911A
            v.m0.k.c r2 = r7.f11046b
            boolean r2 = p392u.p401r.p403c.C4638h.m10272a(r2, r1)
            if (r2 == 0) goto L_0x011f
            goto L_0x0127
        L_0x011f:
            v.h r2 = new v.h
            java.util.Set<v.h$b> r7 = r7.f11045a
            r2.<init>(r7, r1)
            r7 = r2
        L_0x0127:
            r6.f10938z = r7
            java.util.List<v.y> r7 = r6.f10919g
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>"
            if (r7 == 0) goto L_0x017a
            boolean r7 = r7.contains(r0)
            r7 = r7 ^ r3
            if (r7 == 0) goto L_0x0161
            java.util.List<v.y> r7 = r6.f10920h
            if (r7 == 0) goto L_0x015b
            boolean r7 = r7.contains(r0)
            r7 = r7 ^ r3
            if (r7 == 0) goto L_0x0142
            return
        L_0x0142:
            java.lang.String r7 = "Null network interceptor: "
            java.lang.StringBuilder r7 = p213q.p214a.p215a.p216a.C1965a.m4756a(r7)
            java.util.List<v.y> r0 = r6.f10920h
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r0.<init>(r7)
            throw r0
        L_0x015b:
            u.i r7 = new u.i
            r7.<init>(r1)
            throw r7
        L_0x0161:
            java.lang.String r7 = "Null interceptor: "
            java.lang.StringBuilder r7 = p213q.p214a.p215a.p216a.C1965a.m4756a(r7)
            java.util.List<v.y> r0 = r6.f10919g
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r0.<init>(r7)
            throw r0
        L_0x017a:
            u.i r7 = new u.i
            r7.<init>(r1)
            throw r7
        L_0x0180:
            java.lang.String r7 = "builder"
            p392u.p401r.p403c.C4638h.m10271a(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p410v.C4690b0.<init>(v.b0$a):void");
    }

    /* renamed from: a */
    public C4708f mo10979a(C4706e0 e0Var) {
        if (e0Var != null) {
            return C4702d0.m10362a(this, e0Var, false);
        }
        C4638h.m10271a("request");
        throw null;
    }

    public Object clone() {
        return super.clone();
    }
}
