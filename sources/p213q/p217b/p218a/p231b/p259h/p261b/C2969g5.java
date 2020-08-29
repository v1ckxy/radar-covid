package p213q.p217b.p218a.p231b.p259h.p261b;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicInteger;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p240m.p241k.C2174f;
import p213q.p217b.p218a.p231b.p239d.p246q.C2283b;
import p213q.p217b.p218a.p231b.p239d.p246q.C2284c;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p218a.p231b.p251g.p256e.C2427f;
import p213q.p217b.p218a.p231b.p251g.p256e.C2758y1;

/* renamed from: q.b.a.b.h.b.g5 */
public class C2969g5 implements C2910b6 {

    /* renamed from: G */
    public static volatile C2969g5 f7325G;

    /* renamed from: A */
    public volatile Boolean f7326A;

    /* renamed from: B */
    public Boolean f7327B;

    /* renamed from: C */
    public Boolean f7328C;

    /* renamed from: D */
    public int f7329D;

    /* renamed from: E */
    public AtomicInteger f7330E = new AtomicInteger(0);

    /* renamed from: F */
    public final long f7331F;

    /* renamed from: a */
    public final Context f7332a;

    /* renamed from: b */
    public final String f7333b;

    /* renamed from: c */
    public final String f7334c;

    /* renamed from: d */
    public final String f7335d;

    /* renamed from: e */
    public final boolean f7336e;

    /* renamed from: f */
    public final C3010ja f7337f;

    /* renamed from: g */
    public final C3022ka f7338g;

    /* renamed from: h */
    public final C3063o4 f7339h;

    /* renamed from: i */
    public final C2908b4 f7340i;

    /* renamed from: j */
    public final C3184z4 f7341j;

    /* renamed from: k */
    public final C3166x8 f7342k;

    /* renamed from: l */
    public final C3156w9 f7343l;

    /* renamed from: m */
    public final C3183z3 f7344m;

    /* renamed from: n */
    public final C2283b f7345n;

    /* renamed from: o */
    public final C3066o7 f7346o;

    /* renamed from: p */
    public final C3018k6 f7347p;

    /* renamed from: q */
    public final C2891a f7348q;

    /* renamed from: r */
    public final C2983h7 f7349r;

    /* renamed from: s */
    public C3161x3 f7350s;

    /* renamed from: t */
    public C3121t7 f7351t;

    /* renamed from: u */
    public C2975h f7352u;

    /* renamed from: v */
    public C3128u3 f7353v;

    /* renamed from: w */
    public C3118t4 f7354w;

    /* renamed from: x */
    public boolean f7355x = false;

    /* renamed from: y */
    public Boolean f7356y;

    /* renamed from: z */
    public long f7357z;

    public C2969g5(C2982h6 h6Var) {
        long j;
        String str;
        C2944e4 e4Var;
        boolean z = false;
        C1061o.m2524b(h6Var);
        C3010ja jaVar = new C3010ja();
        this.f7337f = jaVar;
        C2286e.f6255d = jaVar;
        this.f7332a = h6Var.f7378a;
        this.f7333b = h6Var.f7379b;
        this.f7334c = h6Var.f7380c;
        this.f7335d = h6Var.f7381d;
        this.f7336e = h6Var.f7385h;
        this.f7326A = h6Var.f7382e;
        C2427f fVar = h6Var.f7384g;
        if (fVar != null) {
            Bundle bundle = fVar.f6512k;
            if (bundle != null) {
                Object obj = bundle.get("measurementEnabled");
                if (obj instanceof Boolean) {
                    this.f7327B = (Boolean) obj;
                }
                Object obj2 = fVar.f6512k.get("measurementDeactivated");
                if (obj2 instanceof Boolean) {
                    this.f7328C = (Boolean) obj2;
                }
            }
        }
        C2758y1.m6561a(this.f7332a);
        C2284c cVar = C2284c.f6249a;
        this.f7345n = cVar;
        Long l = h6Var.f7386i;
        if (l != null) {
            j = l.longValue();
        } else if (cVar != null) {
            j = System.currentTimeMillis();
        } else {
            throw null;
        }
        this.f7331F = j;
        this.f7338g = new C3022ka(this);
        C3063o4 o4Var = new C3063o4(this);
        o4Var.mo8847o();
        this.f7339h = o4Var;
        C2908b4 b4Var = new C2908b4(this);
        b4Var.mo8847o();
        this.f7340i = b4Var;
        C3156w9 w9Var = new C3156w9(this);
        w9Var.mo8847o();
        this.f7343l = w9Var;
        C3183z3 z3Var = new C3183z3(this);
        z3Var.mo8847o();
        this.f7344m = z3Var;
        this.f7348q = new C2891a(this);
        C3066o7 o7Var = new C3066o7(this);
        o7Var.mo8374w();
        this.f7346o = o7Var;
        C3018k6 k6Var = new C3018k6(this);
        k6Var.mo8374w();
        this.f7347p = k6Var;
        C3166x8 x8Var = new C3166x8(this);
        x8Var.mo8374w();
        this.f7342k = x8Var;
        C2983h7 h7Var = new C2983h7(this);
        h7Var.mo8847o();
        this.f7349r = h7Var;
        C3184z4 z4Var = new C3184z4(this);
        z4Var.mo8847o();
        this.f7341j = z4Var;
        C2427f fVar2 = h6Var.f7384g;
        if (!(fVar2 == null || fVar2.f6507f == 0)) {
            z = true;
        }
        boolean z2 = !z;
        if (this.f7332a.getApplicationContext() instanceof Application) {
            C3018k6 o = mo8472o();
            if (o.f7133a.f7332a.getApplicationContext() instanceof Application) {
                Application application = (Application) o.f7133a.f7332a.getApplicationContext();
                if (o.f7485c == null) {
                    o.f7485c = new C2971g7(o, null);
                }
                if (z2) {
                    application.unregisterActivityLifecycleCallbacks(o.f7485c);
                    application.registerActivityLifecycleCallbacks(o.f7485c);
                    e4Var = o.mo8285i().f7161n;
                    str = "Registered activity lifecycle callback";
                }
            }
            C3184z4 z4Var2 = this.f7341j;
            C2993i5 i5Var = new C2993i5(this, h6Var);
            z4Var2.mo8846n();
            C1061o.m2524b(i5Var);
            z4Var2.mo8843a(new C2945e5<>(z4Var2, i5Var, "Task exception on worker thread"));
        }
        e4Var = mo8285i().f7156i;
        str = "Application context is not an Application";
        e4Var.mo8432a(str);
        C3184z4 z4Var22 = this.f7341j;
        C2993i5 i5Var2 = new C2993i5(this, h6Var);
        z4Var22.mo8846n();
        C1061o.m2524b(i5Var2);
        z4Var22.mo8843a(new C2945e5<>(z4Var22, i5Var2, "Task exception on worker thread"));
    }

    /* renamed from: a */
    public static C2969g5 m6914a(Context context, C2427f fVar, Long l) {
        if (fVar != null && (fVar.f6510i == null || fVar.f6511j == null)) {
            C2427f fVar2 = new C2427f(fVar.f6506e, fVar.f6507f, fVar.f6508g, fVar.f6509h, null, null, fVar.f6512k);
            fVar = fVar2;
        }
        C1061o.m2524b(context);
        C1061o.m2524b(context.getApplicationContext());
        if (f7325G == null) {
            synchronized (C2969g5.class) {
                if (f7325G == null) {
                    f7325G = new C2969g5(new C2982h6(context, fVar, l));
                }
            }
        } else if (fVar != null) {
            Bundle bundle = fVar.f6512k;
            if (bundle != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
                f7325G.f7326A = Boolean.valueOf(fVar.f6512k.getBoolean("dataCollectionDefaultEnabled"));
            }
        }
        return f7325G;
    }

    /* renamed from: a */
    public static void m6915a(C2898a6 a6Var) {
        if (a6Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* renamed from: a */
    public static void m6917a(C3185z5 z5Var) {
        if (z5Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!z5Var.mo8849r()) {
            String valueOf = String.valueOf(z5Var.getClass());
            StringBuilder sb = new StringBuilder(valueOf.length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    public final boolean mo8463a() {
        return this.f7326A != null && this.f7326A.booleanValue();
    }

    /* renamed from: b */
    public final boolean mo8464b() {
        return mo8465c() == 0;
    }

    /* renamed from: c */
    public final int mo8465c() {
        mo8283g().mo8279c();
        if (this.f7338g.mo8585p()) {
            return 1;
        }
        Boolean bool = this.f7328C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        Boolean t = mo8470m().mo8668t();
        if (t != null) {
            return t.booleanValue() ? 0 : 3;
        }
        C3022ka kaVar = this.f7338g;
        C3010ja jaVar = kaVar.f7133a.f7337f;
        Boolean d = kaVar.mo8579d("firebase_analytics_collection_enabled");
        if (d == null) {
            Boolean bool2 = this.f7327B;
            if (bool2 != null) {
                if (bool2.booleanValue()) {
                    return 0;
                }
                return 5;
            } else if (C2174f.m4996a("isMeasurementExplicitlyDisabled").f6084c) {
                return 6;
            } else {
                if (!this.f7338g.mo8574a(C3069p.f7704T) || this.f7326A == null || this.f7326A.booleanValue()) {
                    return 0;
                }
                return 7;
            }
        } else if (d.booleanValue()) {
            return 0;
        } else {
            return 4;
        }
    }

    /* renamed from: d */
    public final void mo8466d() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        if (java.lang.Math.abs(android.os.SystemClock.elapsedRealtime() - r6.f7357z) > 1000) goto L_0x0037;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo8467e() {
        /*
            r6 = this;
            boolean r0 = r6.f7355x
            if (r0 == 0) goto L_0x00d4
            q.b.a.b.h.b.z4 r0 = r6.mo8283g()
            r0.mo8279c()
            java.lang.Boolean r0 = r6.f7356y
            r1 = 0
            if (r0 == 0) goto L_0x0037
            long r2 = r6.f7357z
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0037
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00cc
            q.b.a.b.d.q.b r0 = r6.f7345n
            q.b.a.b.d.q.c r0 = (p213q.p217b.p218a.p231b.p239d.p246q.C2284c) r0
            if (r0 == 0) goto L_0x0036
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r6.f7357z
            long r2 = r2 - r4
            long r2 = java.lang.Math.abs(r2)
            r4 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00cc
            goto L_0x0037
        L_0x0036:
            throw r1
        L_0x0037:
            q.b.a.b.d.q.b r0 = r6.f7345n
            q.b.a.b.d.q.c r0 = (p213q.p217b.p218a.p231b.p239d.p246q.C2284c) r0
            if (r0 == 0) goto L_0x00d3
            long r0 = android.os.SystemClock.elapsedRealtime()
            r6.f7357z = r0
            q.b.a.b.h.b.w9 r0 = r6.mo8473p()
            java.lang.String r1 = "android.permission.INTERNET"
            boolean r0 = r0.mo8808c(r1)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0083
            q.b.a.b.h.b.w9 r0 = r6.mo8473p()
            java.lang.String r3 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r0 = r0.mo8808c(r3)
            if (r0 == 0) goto L_0x0083
            android.content.Context r0 = r6.f7332a
            q.b.a.b.d.r.a r0 = p213q.p217b.p218a.p231b.p239d.p248r.C2294b.m5363b(r0)
            boolean r0 = r0.mo7309a()
            if (r0 != 0) goto L_0x0081
            q.b.a.b.h.b.ka r0 = r6.f7338g
            boolean r0 = r0.mo8588s()
            if (r0 != 0) goto L_0x0081
            android.content.Context r0 = r6.f7332a
            boolean r0 = p213q.p217b.p218a.p231b.p259h.p261b.C3173y4.m7486a(r0)
            if (r0 == 0) goto L_0x0083
            android.content.Context r0 = r6.f7332a
            boolean r0 = p213q.p217b.p218a.p231b.p259h.p261b.C3156w9.m7406a(r0)
            if (r0 == 0) goto L_0x0083
        L_0x0081:
            r0 = r1
            goto L_0x0084
        L_0x0083:
            r0 = r2
        L_0x0084:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.f7356y = r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00cc
            q.b.a.b.h.b.w9 r0 = r6.mo8473p()
            q.b.a.b.h.b.u3 r3 = r6.mo8479v()
            r3.mo8373v()
            java.lang.String r3 = r3.f7890k
            q.b.a.b.h.b.u3 r4 = r6.mo8479v()
            r4.mo8373v()
            java.lang.String r4 = r4.f7891l
            q.b.a.b.h.b.u3 r5 = r6.mo8479v()
            r5.mo8373v()
            java.lang.String r5 = r5.f7892m
            boolean r0 = r0.mo8801a(r3, r4, r5)
            if (r0 != 0) goto L_0x00c6
            q.b.a.b.h.b.u3 r0 = r6.mo8479v()
            r0.mo8373v()
            java.lang.String r0 = r0.f7891l
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00c5
            goto L_0x00c6
        L_0x00c5:
            r1 = r2
        L_0x00c6:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r6.f7356y = r0
        L_0x00cc:
            java.lang.Boolean r0 = r6.f7356y
            boolean r0 = r0.booleanValue()
            return r0
        L_0x00d3:
            throw r1
        L_0x00d4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "AppMeasurement is not initialized"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p259h.p261b.C2969g5.mo8467e():boolean");
    }

    /* renamed from: f */
    public final C3010ja mo8282f() {
        return this.f7337f;
    }

    /* renamed from: g */
    public final C3184z4 mo8283g() {
        m6917a((C3185z5) this.f7341j);
        return this.f7341j;
    }

    /* renamed from: h */
    public final C2283b mo8284h() {
        return this.f7345n;
    }

    /* renamed from: i */
    public final C2908b4 mo8285i() {
        m6917a((C3185z5) this.f7340i);
        return this.f7340i;
    }

    /* renamed from: j */
    public final Context mo8286j() {
        return this.f7332a;
    }

    /* renamed from: k */
    public final C2983h7 mo8468k() {
        m6917a((C3185z5) this.f7349r);
        return this.f7349r;
    }

    /* renamed from: l */
    public final C3022ka mo8469l() {
        return this.f7338g;
    }

    /* renamed from: m */
    public final C3063o4 mo8470m() {
        m6915a((C2898a6) this.f7339h);
        return this.f7339h;
    }

    /* renamed from: n */
    public final C3166x8 mo8471n() {
        m6916a((C2921c5) this.f7342k);
        return this.f7342k;
    }

    /* renamed from: o */
    public final C3018k6 mo8472o() {
        m6916a((C2921c5) this.f7347p);
        return this.f7347p;
    }

    /* renamed from: p */
    public final C3156w9 mo8473p() {
        m6915a((C2898a6) this.f7343l);
        return this.f7343l;
    }

    /* renamed from: q */
    public final C3183z3 mo8474q() {
        m6915a((C2898a6) this.f7344m);
        return this.f7344m;
    }

    /* renamed from: r */
    public final boolean mo8475r() {
        return TextUtils.isEmpty(this.f7333b);
    }

    /* renamed from: s */
    public final C3066o7 mo8476s() {
        m6916a((C2921c5) this.f7346o);
        return this.f7346o;
    }

    /* renamed from: t */
    public final C3121t7 mo8477t() {
        m6916a((C2921c5) this.f7351t);
        return this.f7351t;
    }

    /* renamed from: u */
    public final C2975h mo8478u() {
        m6917a((C3185z5) this.f7352u);
        return this.f7352u;
    }

    /* renamed from: v */
    public final C3128u3 mo8479v() {
        m6916a((C2921c5) this.f7353v);
        return this.f7353v;
    }

    /* renamed from: w */
    public final C2891a mo8480w() {
        C2891a aVar = this.f7348q;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("Component not created");
    }

    /* renamed from: a */
    public static void m6916a(C2921c5 c5Var) {
        if (c5Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!c5Var.f7210b) {
            String valueOf = String.valueOf(c5Var.getClass());
            StringBuilder sb = new StringBuilder(valueOf.length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }
}
