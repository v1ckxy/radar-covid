package p213q.p217b.p218a.p231b.p259h.p261b;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p116io.jsonwebtoken.lang.Objects;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p246q.C2284c;

/* renamed from: q.b.a.b.h.b.o7 */
public final class C3066o7 extends C2921c5 {

    /* renamed from: c */
    public volatile C3044m7 f7650c;

    /* renamed from: d */
    public C3044m7 f7651d;

    /* renamed from: e */
    public C3044m7 f7652e;

    /* renamed from: f */
    public final Map<Activity, C3044m7> f7653f = new ConcurrentHashMap();

    /* renamed from: g */
    public Activity f7654g;

    /* renamed from: h */
    public volatile boolean f7655h;

    /* renamed from: i */
    public volatile C3044m7 f7656i;

    /* renamed from: j */
    public C3044m7 f7657j;

    /* renamed from: k */
    public boolean f7658k;

    /* renamed from: l */
    public final Object f7659l = new Object();

    /* renamed from: m */
    public String f7660m;

    public C3066o7(C2969g5 g5Var) {
        super(g5Var);
    }

    /* renamed from: a */
    public static String m7151a(String str) {
        String[] split = str.split("\\.");
        String str2 = split.length > 0 ? split[split.length - 1] : Objects.EMPTY_STRING;
        return str2.length() > 100 ? str2.substring(0, 100) : str2;
    }

    /* renamed from: a */
    public static void m7152a(C3044m7 m7Var, Bundle bundle, boolean z) {
        String str = "_si";
        String str2 = "_sn";
        String str3 = "_sc";
        if (bundle == null || m7Var == null || (bundle.containsKey(str3) && !z)) {
            if (bundle != null && m7Var == null && z) {
                bundle.remove(str2);
                bundle.remove(str3);
                bundle.remove(str);
            }
            return;
        }
        String str4 = m7Var.f7567a;
        if (str4 != null) {
            bundle.putString(str2, str4);
        } else {
            bundle.remove(str2);
        }
        String str5 = m7Var.f7568b;
        if (str5 != null) {
            bundle.putString(str3, str5);
        } else {
            bundle.remove(str3);
        }
        bundle.putLong(str, m7Var.f7569c);
    }

    /* renamed from: a */
    public final C3044m7 mo8671a(boolean z) {
        mo8373v();
        mo8279c();
        if (!this.f7133a.f7338g.mo8574a(C3069p.f7673D0) || !z) {
            return this.f7652e;
        }
        C3044m7 m7Var = this.f7652e;
        return m7Var != null ? m7Var : this.f7657j;
    }

    /* renamed from: a */
    public final void mo8676a(String str, C3044m7 m7Var) {
        mo8279c();
        synchronized (this) {
            if (this.f7660m == null || this.f7660m.equals(str) || m7Var != null) {
                this.f7660m = str;
            }
        }
    }

    /* renamed from: b */
    public final void mo8679b(Activity activity) {
        if (this.f7133a.f7338g.mo8574a(C3069p.f7673D0)) {
            synchronized (this.f7659l) {
                this.f7658k = false;
                this.f7655h = true;
            }
        }
        if (((C2284c) this.f7133a.f7345n) != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (!this.f7133a.f7338g.mo8574a(C3069p.f7671C0) || this.f7133a.f7338g.mo8587r().booleanValue()) {
                C3044m7 d = mo8681d(activity);
                this.f7651d = this.f7650c;
                this.f7650c = null;
                C3184z4 g = mo8283g();
                C3099r7 r7Var = new C3099r7(this, d, elapsedRealtime);
                g.mo8846n();
                C1061o.m2524b(r7Var);
                g.mo8843a(new C2945e5<>(g, r7Var, "Task exception on worker thread"));
                return;
            }
            this.f7650c = null;
            C3184z4 g2 = mo8283g();
            C3110s7 s7Var = new C3110s7(this, elapsedRealtime);
            g2.mo8846n();
            C1061o.m2524b(s7Var);
            g2.mo8843a(new C2945e5<>(g2, s7Var, "Task exception on worker thread"));
            return;
        }
        throw null;
    }

    /* renamed from: c */
    public final void mo8680c(Activity activity) {
        synchronized (this.f7659l) {
            if (activity == this.f7654g) {
                this.f7654g = null;
            }
        }
        if (this.f7133a.f7338g.mo8587r().booleanValue()) {
            this.f7653f.remove(activity);
        }
    }

    /* renamed from: d */
    public final C3044m7 mo8681d(Activity activity) {
        C1061o.m2524b(activity);
        C3044m7 m7Var = (C3044m7) this.f7653f.get(activity);
        if (m7Var == null) {
            C3044m7 m7Var2 = new C3044m7(null, m7151a(activity.getClass().getCanonicalName()), mo8287k().mo8813s());
            this.f7653f.put(activity, m7Var2);
            m7Var = m7Var2;
        }
        return (this.f7133a.f7338g.mo8574a(C3069p.f7673D0) && this.f7656i != null) ? this.f7656i : m7Var;
    }

    /* renamed from: x */
    public final boolean mo8375x() {
        return false;
    }

    /* renamed from: a */
    public final void mo8672a(Activity activity) {
        if (this.f7133a.f7338g.mo8574a(C3069p.f7673D0)) {
            synchronized (this.f7659l) {
                this.f7658k = true;
                if (activity != this.f7654g) {
                    synchronized (this.f7659l) {
                        this.f7654g = activity;
                        this.f7655h = false;
                    }
                    if (this.f7133a.f7338g.mo8574a(C3069p.f7671C0) && this.f7133a.f7338g.mo8587r().booleanValue()) {
                        this.f7656i = null;
                        C3184z4 g = mo8283g();
                        C3132u7 u7Var = new C3132u7(this);
                        g.mo8846n();
                        C1061o.m2524b(u7Var);
                        g.mo8843a(new C2945e5<>(g, u7Var, "Task exception on worker thread"));
                    }
                }
            }
        }
        if (!this.f7133a.f7338g.mo8574a(C3069p.f7671C0) || this.f7133a.f7338g.mo8587r().booleanValue()) {
            mo8674a(activity, mo8681d(activity), false);
            C2891a n = mo8296n();
            if (((C2284c) n.f7133a.f7345n) != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                C3184z4 g2 = n.mo8283g();
                C2919c3 c3Var = new C2919c3(n, elapsedRealtime);
                g2.mo8846n();
                C1061o.m2524b(c3Var);
                g2.mo8843a(new C2945e5<>(g2, c3Var, "Task exception on worker thread"));
                return;
            }
            throw null;
        }
        this.f7650c = this.f7656i;
        C3184z4 g3 = mo8283g();
        C3077p7 p7Var = new C3077p7(this);
        g3.mo8846n();
        C1061o.m2524b(p7Var);
        g3.mo8843a(new C2945e5<>(g3, p7Var, "Task exception on worker thread"));
    }

    /* renamed from: a */
    public final void mo8673a(Activity activity, Bundle bundle) {
        if (this.f7133a.f7338g.mo8587r().booleanValue() && bundle != null) {
            Bundle bundle2 = bundle.getBundle("com.google.app_measurement.screen_service");
            if (bundle2 != null) {
                this.f7653f.put(activity, new C3044m7(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
            }
        }
    }

    /* renamed from: a */
    public final void mo8674a(Activity activity, C3044m7 m7Var, boolean z) {
        C3044m7 m7Var2;
        C3044m7 m7Var3 = m7Var;
        C3044m7 m7Var4 = this.f7650c == null ? this.f7651d : this.f7650c;
        if (m7Var3.f7568b == null) {
            C3044m7 m7Var5 = new C3044m7(m7Var3.f7567a, activity != null ? m7151a(activity.getClass().getCanonicalName()) : null, m7Var3.f7569c, m7Var3.f7571e, m7Var3.f7572f);
            m7Var2 = m7Var5;
        } else {
            m7Var2 = m7Var3;
        }
        this.f7651d = this.f7650c;
        this.f7650c = m7Var2;
        if (((C2284c) this.f7133a.f7345n) != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C3184z4 g = mo8283g();
            C3088q7 q7Var = new C3088q7(this, m7Var2, m7Var4, elapsedRealtime, z);
            g.mo8846n();
            C1061o.m2524b(q7Var);
            g.mo8843a(new C2945e5<>(g, q7Var, "Task exception on worker thread"));
            return;
        }
        throw null;
    }

    /* JADX INFO: used method not loaded: q.b.a.b.h.b.z4.a(q.b.a.b.h.b.e5):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00cc, code lost:
        r0 = mo8285i().f7161n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d2, code lost:
        if (r3 != null) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d4, code lost:
        r2 = p116io.jsonwebtoken.lang.Objects.NULL_STRING;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d7, code lost:
        r2 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d8, code lost:
        if (r4 != null) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00da, code lost:
        r5 = p116io.jsonwebtoken.lang.Objects.NULL_STRING;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00dd, code lost:
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00de, code lost:
        r0.mo8434a("Logging screen view with name, class", r2, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00e5, code lost:
        if (r12.f7650c != null) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00e7, code lost:
        r0 = r12.f7651d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00ea, code lost:
        r0 = r12.f7650c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00ec, code lost:
        r2 = new p213q.p217b.p218a.p231b.p259h.p261b.C3044m7(r3, r4, mo8287k().mo8813s(), true, r14);
        r12.f7650c = r2;
        r12.f7651d = r0;
        r12.f7656i = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0108, code lost:
        if (((p213q.p217b.p218a.p231b.p239d.p246q.C2284c) r12.f7133a.f7345n) == null) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x010a, code lost:
        r14 = android.os.SystemClock.elapsedRealtime();
        r1 = mo8283g();
        r5 = new p213q.p217b.p218a.p231b.p259h.p261b.C3055n7(r12, r13, r2, r0, r14);
        r1.mo8846n();
        p124p.p126b.p127k.C1061o.m2524b(r5);
        r1.mo8843a(new p213q.p217b.p218a.p231b.p259h.p261b.C2945e5(r1, r5, "Task exception on worker thread"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x012d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x012e, code lost:
        throw null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8675a(android.os.Bundle r13, long r14) {
        /*
            r12 = this;
            q.b.a.b.h.b.g5 r0 = r12.f7133a
            q.b.a.b.h.b.ka r0 = r0.f7338g
            q.b.a.b.h.b.r3<java.lang.Boolean> r1 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7673D0
            boolean r0 = r0.mo8574a(r1)
            if (r0 != 0) goto L_0x0018
            q.b.a.b.h.b.b4 r13 = r12.mo8285i()
            q.b.a.b.h.b.e4 r13 = r13.f7158k
            java.lang.String r14 = "Manual screen reporting is disabled."
            r13.mo8432a(r14)
            return
        L_0x0018:
            java.lang.Object r0 = r12.f7659l
            monitor-enter(r0)
            boolean r1 = r12.f7658k     // Catch:{ all -> 0x012f }
            if (r1 != 0) goto L_0x002c
            q.b.a.b.h.b.b4 r13 = r12.mo8285i()     // Catch:{ all -> 0x012f }
            q.b.a.b.h.b.e4 r13 = r13.f7158k     // Catch:{ all -> 0x012f }
            java.lang.String r14 = "Cannot log screen view event when the app is in the background."
            r13.mo8432a(r14)     // Catch:{ all -> 0x012f }
            monitor-exit(r0)     // Catch:{ all -> 0x012f }
            return
        L_0x002c:
            r1 = 0
            if (r13 == 0) goto L_0x0085
            java.lang.String r2 = "screen_name"
            java.lang.String r2 = r13.getString(r2)     // Catch:{ all -> 0x012f }
            r3 = 100
            if (r2 == 0) goto L_0x005a
            int r4 = r2.length()     // Catch:{ all -> 0x012f }
            if (r4 <= 0) goto L_0x0045
            int r4 = r2.length()     // Catch:{ all -> 0x012f }
            if (r4 <= r3) goto L_0x005a
        L_0x0045:
            q.b.a.b.h.b.b4 r13 = r12.mo8285i()     // Catch:{ all -> 0x012f }
            q.b.a.b.h.b.e4 r13 = r13.f7158k     // Catch:{ all -> 0x012f }
            java.lang.String r14 = "Invalid screen name length for screen view. Length"
            int r15 = r2.length()     // Catch:{ all -> 0x012f }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x012f }
            r13.mo8433a(r14, r15)     // Catch:{ all -> 0x012f }
            monitor-exit(r0)     // Catch:{ all -> 0x012f }
            return
        L_0x005a:
            java.lang.String r4 = "screen_class"
            java.lang.String r4 = r13.getString(r4)     // Catch:{ all -> 0x012f }
            if (r4 == 0) goto L_0x0083
            int r5 = r4.length()     // Catch:{ all -> 0x012f }
            if (r5 <= 0) goto L_0x006e
            int r5 = r4.length()     // Catch:{ all -> 0x012f }
            if (r5 <= r3) goto L_0x0083
        L_0x006e:
            q.b.a.b.h.b.b4 r13 = r12.mo8285i()     // Catch:{ all -> 0x012f }
            q.b.a.b.h.b.e4 r13 = r13.f7158k     // Catch:{ all -> 0x012f }
            java.lang.String r14 = "Invalid screen class length for screen view. Length"
            int r15 = r4.length()     // Catch:{ all -> 0x012f }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x012f }
            r13.mo8433a(r14, r15)     // Catch:{ all -> 0x012f }
            monitor-exit(r0)     // Catch:{ all -> 0x012f }
            return
        L_0x0083:
            r3 = r2
            goto L_0x0087
        L_0x0085:
            r3 = r1
            r4 = r3
        L_0x0087:
            if (r4 != 0) goto L_0x009f
            android.app.Activity r2 = r12.f7654g     // Catch:{ all -> 0x012f }
            if (r2 == 0) goto L_0x009c
            android.app.Activity r2 = r12.f7654g     // Catch:{ all -> 0x012f }
            java.lang.Class r2 = r2.getClass()     // Catch:{ all -> 0x012f }
            java.lang.String r2 = r2.getCanonicalName()     // Catch:{ all -> 0x012f }
            java.lang.String r2 = m7151a(r2)     // Catch:{ all -> 0x012f }
            goto L_0x009e
        L_0x009c:
            java.lang.String r2 = "Activity"
        L_0x009e:
            r4 = r2
        L_0x009f:
            boolean r2 = r12.f7655h     // Catch:{ all -> 0x012f }
            if (r2 == 0) goto L_0x00cb
            q.b.a.b.h.b.m7 r2 = r12.f7650c     // Catch:{ all -> 0x012f }
            if (r2 == 0) goto L_0x00cb
            r2 = 0
            r12.f7655h = r2     // Catch:{ all -> 0x012f }
            q.b.a.b.h.b.m7 r2 = r12.f7650c     // Catch:{ all -> 0x012f }
            java.lang.String r2 = r2.f7568b     // Catch:{ all -> 0x012f }
            boolean r2 = p213q.p217b.p218a.p231b.p259h.p261b.C3156w9.m7416c(r2, r4)     // Catch:{ all -> 0x012f }
            q.b.a.b.h.b.m7 r5 = r12.f7650c     // Catch:{ all -> 0x012f }
            java.lang.String r5 = r5.f7567a     // Catch:{ all -> 0x012f }
            boolean r5 = p213q.p217b.p218a.p231b.p259h.p261b.C3156w9.m7416c(r5, r3)     // Catch:{ all -> 0x012f }
            if (r2 == 0) goto L_0x00cb
            if (r5 == 0) goto L_0x00cb
            q.b.a.b.h.b.b4 r13 = r12.mo8285i()     // Catch:{ all -> 0x012f }
            q.b.a.b.h.b.e4 r13 = r13.f7158k     // Catch:{ all -> 0x012f }
            java.lang.String r14 = "Ignoring call to log screen view event with duplicate parameters."
            r13.mo8432a(r14)     // Catch:{ all -> 0x012f }
            monitor-exit(r0)     // Catch:{ all -> 0x012f }
            return
        L_0x00cb:
            monitor-exit(r0)     // Catch:{ all -> 0x012f }
            q.b.a.b.h.b.b4 r0 = r12.mo8285i()
            q.b.a.b.h.b.e4 r0 = r0.f7161n
            if (r3 != 0) goto L_0x00d7
            java.lang.String r2 = "null"
            goto L_0x00d8
        L_0x00d7:
            r2 = r3
        L_0x00d8:
            if (r4 != 0) goto L_0x00dd
            java.lang.String r5 = "null"
            goto L_0x00de
        L_0x00dd:
            r5 = r4
        L_0x00de:
            java.lang.String r6 = "Logging screen view with name, class"
            r0.mo8434a(r6, r2, r5)
            q.b.a.b.h.b.m7 r0 = r12.f7650c
            if (r0 != 0) goto L_0x00ea
            q.b.a.b.h.b.m7 r0 = r12.f7651d
            goto L_0x00ec
        L_0x00ea:
            q.b.a.b.h.b.m7 r0 = r12.f7650c
        L_0x00ec:
            q.b.a.b.h.b.m7 r10 = new q.b.a.b.h.b.m7
            q.b.a.b.h.b.w9 r2 = r12.mo8287k()
            long r5 = r2.mo8813s()
            r7 = 1
            r2 = r10
            r8 = r14
            r2.<init>(r3, r4, r5, r7, r8)
            r12.f7650c = r10
            r12.f7651d = r0
            r12.f7656i = r10
            q.b.a.b.h.b.g5 r14 = r12.f7133a
            q.b.a.b.d.q.b r14 = r14.f7345n
            q.b.a.b.d.q.c r14 = (p213q.p217b.p218a.p231b.p239d.p246q.C2284c) r14
            if (r14 == 0) goto L_0x012e
            long r14 = android.os.SystemClock.elapsedRealtime()
            q.b.a.b.h.b.z4 r1 = r12.mo8283g()
            q.b.a.b.h.b.n7 r2 = new q.b.a.b.h.b.n7
            r5 = r2
            r6 = r12
            r7 = r13
            r8 = r10
            r9 = r0
            r10 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            r1.mo8846n()
            p124p.p126b.p127k.C1061o.m2524b(r2)
            q.b.a.b.h.b.e5 r13 = new q.b.a.b.h.b.e5
            java.lang.String r14 = "Task exception on worker thread"
            r13.<init>(r1, r2, r14)
            r1.mo8843a(r13)
            return
        L_0x012e:
            throw r1
        L_0x012f:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x012f }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p259h.p261b.C3066o7.mo8675a(android.os.Bundle, long):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0142  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8677a(p213q.p217b.p218a.p231b.p259h.p261b.C3044m7 r10, p213q.p217b.p218a.p231b.p259h.p261b.C3044m7 r11, long r12, boolean r14, android.os.Bundle r15) {
        /*
            r9 = this;
            r9.mo8279c()
            q.b.a.b.h.b.g5 r0 = r9.f7133a
            q.b.a.b.h.b.ka r0 = r0.f7338g
            q.b.a.b.h.b.r3<java.lang.Boolean> r1 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7706U
            boolean r0 = r0.mo8574a(r1)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0022
            if (r14 == 0) goto L_0x0019
            q.b.a.b.h.b.m7 r14 = r9.f7652e
            if (r14 == 0) goto L_0x0019
            r14 = r2
            goto L_0x001a
        L_0x0019:
            r14 = r1
        L_0x001a:
            if (r14 == 0) goto L_0x002c
            q.b.a.b.h.b.m7 r0 = r9.f7652e
            r9.mo8678a(r0, r2, r12)
            goto L_0x002c
        L_0x0022:
            if (r14 == 0) goto L_0x002b
            q.b.a.b.h.b.m7 r14 = r9.f7652e
            if (r14 == 0) goto L_0x002b
            r9.mo8678a(r14, r2, r12)
        L_0x002b:
            r14 = r1
        L_0x002c:
            if (r11 == 0) goto L_0x004a
            long r3 = r11.f7569c
            long r5 = r10.f7569c
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x004a
            java.lang.String r0 = r11.f7568b
            java.lang.String r3 = r10.f7568b
            boolean r0 = p213q.p217b.p218a.p231b.p259h.p261b.C3156w9.m7416c(r0, r3)
            if (r0 == 0) goto L_0x004a
            java.lang.String r0 = r11.f7567a
            java.lang.String r3 = r10.f7567a
            boolean r0 = p213q.p217b.p218a.p231b.p259h.p261b.C3156w9.m7416c(r0, r3)
            if (r0 != 0) goto L_0x004b
        L_0x004a:
            r1 = r2
        L_0x004b:
            if (r1 == 0) goto L_0x015f
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            q.b.a.b.h.b.g5 r1 = r9.f7133a
            q.b.a.b.h.b.ka r1 = r1.f7338g
            q.b.a.b.h.b.r3<java.lang.Boolean> r3 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7673D0
            boolean r1 = r1.mo8574a(r3)
            if (r1 == 0) goto L_0x0069
            android.os.Bundle r0 = new android.os.Bundle
            if (r15 == 0) goto L_0x0066
            r0.<init>(r15)
            goto L_0x0069
        L_0x0066:
            r0.<init>()
        L_0x0069:
            r8 = r0
            m7152a(r10, r8, r2)
            if (r11 == 0) goto L_0x0088
            java.lang.String r15 = r11.f7567a
            if (r15 == 0) goto L_0x0078
            java.lang.String r0 = "_pn"
            r8.putString(r0, r15)
        L_0x0078:
            java.lang.String r15 = r11.f7568b
            if (r15 == 0) goto L_0x0081
            java.lang.String r0 = "_pc"
            r8.putString(r0, r15)
        L_0x0081:
            long r0 = r11.f7569c
            java.lang.String r11 = "_pi"
            r8.putLong(r11, r0)
        L_0x0088:
            q.b.a.b.h.b.g5 r11 = r9.f7133a
            q.b.a.b.h.b.ka r11 = r11.f7338g
            q.b.a.b.h.b.r3<java.lang.Boolean> r15 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7706U
            boolean r11 = r11.mo8574a(r15)
            r0 = 0
            if (r11 == 0) goto L_0x00e6
            if (r14 == 0) goto L_0x00e6
            q.b.a.b.g.e.tb r11 = p213q.p217b.p218a.p231b.p251g.p256e.C2688tb.f6900f
            java.lang.Object r11 = r11.mo7405a()
            q.b.a.b.g.e.wb r11 = (p213q.p217b.p218a.p231b.p251g.p256e.C2737wb) r11
            boolean r11 = r11.mo8068a()
            if (r11 == 0) goto L_0x00d1
            q.b.a.b.h.b.g5 r11 = r9.f7133a
            q.b.a.b.h.b.ka r11 = r11.f7338g
            q.b.a.b.h.b.r3<java.lang.Boolean> r14 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7708W
            boolean r11 = r11.mo8574a(r14)
            if (r11 == 0) goto L_0x00d1
            boolean r11 = p213q.p217b.p218a.p231b.p251g.p256e.C2478hb.m5915b()
            if (r11 == 0) goto L_0x00d1
            q.b.a.b.h.b.g5 r11 = r9.f7133a
            q.b.a.b.h.b.ka r11 = r11.f7338g
            q.b.a.b.h.b.r3<java.lang.Boolean> r14 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7667A0
            boolean r11 = r11.mo8574a(r14)
            if (r11 == 0) goto L_0x00d1
            q.b.a.b.h.b.x8 r11 = r9.mo8302t()
            q.b.a.b.h.b.e9 r11 = r11.f7969e
            long r14 = r11.f7289b
            long r14 = r12 - r14
            r11.f7289b = r12
            goto L_0x00db
        L_0x00d1:
            q.b.a.b.h.b.x8 r11 = r9.mo8302t()
            q.b.a.b.h.b.e9 r11 = r11.f7969e
            long r14 = r11.mo8440a()
        L_0x00db:
            int r11 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r11 <= 0) goto L_0x00e6
            q.b.a.b.h.b.w9 r11 = r9.mo8287k()
            r11.mo8784a(r8, r14)
        L_0x00e6:
            q.b.a.b.h.b.g5 r11 = r9.f7133a
            q.b.a.b.h.b.ka r11 = r11.f7338g
            q.b.a.b.h.b.r3<java.lang.Boolean> r12 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7673D0
            boolean r11 = r11.mo8574a(r12)
            if (r11 == 0) goto L_0x010e
            q.b.a.b.h.b.g5 r11 = r9.f7133a
            q.b.a.b.h.b.ka r11 = r11.f7338g
            java.lang.Boolean r11 = r11.mo8587r()
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto L_0x0107
            r11 = 1
            java.lang.String r13 = "_mt"
            r8.putLong(r13, r11)
        L_0x0107:
            boolean r11 = r10.f7571e
            if (r11 == 0) goto L_0x010e
            java.lang.String r11 = "app"
            goto L_0x0110
        L_0x010e:
            java.lang.String r11 = "auto"
        L_0x0110:
            r4 = r11
            q.b.a.b.h.b.g5 r11 = r9.f7133a
            q.b.a.b.h.b.ka r11 = r11.f7338g
            q.b.a.b.h.b.r3<java.lang.Boolean> r12 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7673D0
            boolean r11 = r11.mo8574a(r12)
            r12 = 0
            if (r11 == 0) goto L_0x0142
            q.b.a.b.h.b.g5 r11 = r9.f7133a
            q.b.a.b.d.q.b r11 = r11.f7345n
            q.b.a.b.d.q.c r11 = (p213q.p217b.p218a.p231b.p239d.p246q.C2284c) r11
            if (r11 == 0) goto L_0x0141
            long r11 = java.lang.System.currentTimeMillis()
            boolean r13 = r10.f7571e
            if (r13 == 0) goto L_0x0136
            long r13 = r10.f7572f
            int r15 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r15 == 0) goto L_0x0136
            r6 = r13
            goto L_0x0137
        L_0x0136:
            r6 = r11
        L_0x0137:
            q.b.a.b.h.b.k6 r3 = r9.mo8297o()
            java.lang.String r5 = "_vs"
            r3.mo8558a(r4, r5, r6, r8)
            goto L_0x015f
        L_0x0141:
            throw r12
        L_0x0142:
            q.b.a.b.h.b.k6 r3 = r9.mo8297o()
            r3.mo8277a()
            r3.mo8279c()
            q.b.a.b.h.b.g5 r11 = r3.f7133a
            q.b.a.b.d.q.b r11 = r11.f7345n
            q.b.a.b.d.q.c r11 = (p213q.p217b.p218a.p231b.p239d.p246q.C2284c) r11
            if (r11 == 0) goto L_0x015e
            long r6 = java.lang.System.currentTimeMillis()
            java.lang.String r5 = "_vs"
            r3.mo8558a(r4, r5, r6, r8)
            goto L_0x015f
        L_0x015e:
            throw r12
        L_0x015f:
            r9.f7652e = r10
            q.b.a.b.h.b.g5 r11 = r9.f7133a
            q.b.a.b.h.b.ka r11 = r11.f7338g
            q.b.a.b.h.b.r3<java.lang.Boolean> r12 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7673D0
            boolean r11 = r11.mo8574a(r12)
            if (r11 == 0) goto L_0x0173
            boolean r11 = r10.f7571e
            if (r11 == 0) goto L_0x0173
            r9.f7657j = r10
        L_0x0173:
            q.b.a.b.h.b.t7 r11 = r9.mo8299q()
            r11.mo8279c()
            r11.mo8373v()
            q.b.a.b.h.b.b8 r12 = new q.b.a.b.h.b.b8
            r12.<init>(r11, r10)
            r11.mo8726a(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p259h.p261b.C3066o7.mo8677a(q.b.a.b.h.b.m7, q.b.a.b.h.b.m7, long, boolean, android.os.Bundle):void");
    }

    /* renamed from: a */
    public final void mo8678a(C3044m7 m7Var, boolean z, long j) {
        C2891a n = mo8296n();
        if (((C2284c) this.f7133a.f7345n) != null) {
            n.mo8254a(SystemClock.elapsedRealtime());
            if (mo8302t().mo8824a(m7Var != null && m7Var.f7570d, z, j) && m7Var != null) {
                m7Var.f7570d = false;
                return;
            }
            return;
        }
        throw null;
    }
}
