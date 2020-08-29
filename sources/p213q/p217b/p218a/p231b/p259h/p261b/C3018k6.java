package p213q.p217b.p218a.p231b.p259h.p261b;

import android.app.Application;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;
import p124p.p126b.p127k.C1061o;
import p124p.p143e.C1248a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2284c;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p218a.p231b.p251g.p256e.C2441fb;
import p213q.p217b.p218a.p231b.p251g.p256e.C2458gb;
import p213q.p217b.p218a.p231b.p251g.p256e.C2672sb;

/* renamed from: q.b.a.b.h.b.k6 */
public final class C3018k6 extends C2921c5 {

    /* renamed from: c */
    public C2971g7 f7485c;

    /* renamed from: d */
    public C2958f6 f7486d;

    /* renamed from: e */
    public final Set<C2994i6> f7487e = new CopyOnWriteArraySet();

    /* renamed from: f */
    public boolean f7488f;

    /* renamed from: g */
    public final AtomicReference<String> f7489g = new AtomicReference<>();

    /* renamed from: h */
    public final C2914ba f7490h;

    /* renamed from: i */
    public boolean f7491i = true;

    public C3018k6(C2969g5 g5Var) {
        super(g5Var);
        this.f7490h = new C2914ba(g5Var);
    }

    /* renamed from: A */
    public final String mo8553A() {
        C2969g5 g5Var = this.f7133a;
        String str = g5Var.f7333b;
        if (str != null) {
            return str;
        }
        try {
            return C2286e.m5189a(g5Var.f7332a, "google_app_id");
        } catch (IllegalStateException e) {
            this.f7133a.mo8285i().f7153f.mo8433a("getGoogleAppId failed with exception", e);
            return null;
        }
    }

    /* renamed from: B */
    public final void mo8554B() {
        mo8279c();
        String a = mo8288l().f7636s.mo8749a();
        if (a != null) {
            if (!"unset".equals(a)) {
                Long valueOf = Long.valueOf("true".equals(a) ? 1 : 0);
                if (((C2284c) this.f7133a.f7345n) != null) {
                    mo8564a("app", "_npa", (Object) valueOf, System.currentTimeMillis());
                } else {
                    throw null;
                }
            } else if (((C2284c) this.f7133a.f7345n) != null) {
                mo8564a("app", "_npa", (Object) null, System.currentTimeMillis());
            } else {
                throw null;
            }
        }
        boolean z = true;
        if (!this.f7133a.mo8464b() || !this.f7491i) {
            mo8285i().f7160m.mo8432a("Updating Scion state (FE)");
            C3121t7 q = mo8299q();
            q.mo8279c();
            q.mo8373v();
            q.mo8726a((Runnable) new C2960f8(q, q.mo8725a(true)));
            return;
        }
        mo8285i().f7160m.mo8432a("Recording app launch after enabling measurement for the first time (FE)");
        mo8569z();
        if (C2672sb.m6380b() && this.f7133a.f7338g.mo8574a(C3069p.f7757w0)) {
            mo8302t().f7968d.mo8488a();
        }
        if (((C2441fb) C2458gb.f6550f.mo7405a()).mo7653a() && this.f7133a.f7338g.mo8574a(C3069p.f7669B0)) {
            if (this.f7133a.f7354w.f7861a.mo8470m().f7628k.mo8708a() <= 0) {
                z = false;
            }
            if (!z) {
                C3118t4 t4Var = this.f7133a.f7354w;
                C2969g5 g5Var = t4Var.f7861a;
                if (g5Var != null) {
                    t4Var.mo8716a(g5Var.f7332a.getPackageName());
                } else {
                    throw null;
                }
            }
        }
        if (this.f7133a.f7338g.mo8574a(C3069p.f7701R0)) {
            C3184z4 g = mo8283g();
            C2947e7 e7Var = new C2947e7(this);
            g.mo8846n();
            C1061o.m2524b(e7Var);
            g.mo8843a(new C2945e5<>(g, e7Var, "Task exception on worker thread"));
        }
    }

    /* renamed from: a */
    public final void mo8557a(Bundle bundle, long j) {
        C1061o.m2524b(bundle);
        mo8277a();
        Bundle bundle2 = new Bundle(bundle);
        String str = "app_id";
        if (!TextUtils.isEmpty(bundle2.getString(str))) {
            mo8285i().f7156i.mo8432a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove(str);
        mo8567b(bundle2, j);
    }

    /* renamed from: a */
    public final void mo8558a(String str, String str2, long j, Bundle bundle) {
        mo8277a();
        mo8279c();
        mo8559a(str, str2, j, bundle, true, this.f7486d == null || C3156w9.m7418i(str2), false, null);
    }

    /* renamed from: b */
    public final void mo8567b(Bundle bundle, long j) {
        Class<Long> cls = Long.class;
        Class<String> cls2 = String.class;
        C1061o.m2524b(bundle);
        C2286e.m5178a(bundle, "app_id", cls2, null);
        String str = "origin";
        C2286e.m5178a(bundle, str, cls2, null);
        String str2 = "name";
        C2286e.m5178a(bundle, str2, cls2, null);
        String str3 = "value";
        C2286e.m5178a(bundle, str3, Object.class, null);
        String str4 = "trigger_event_name";
        C2286e.m5178a(bundle, str4, cls2, null);
        Long valueOf = Long.valueOf(0);
        String str5 = "trigger_timeout";
        C2286e.m5178a(bundle, str5, cls, valueOf);
        C2286e.m5178a(bundle, "timed_out_event_name", cls2, null);
        C2286e.m5178a(bundle, "timed_out_event_params", Bundle.class, null);
        C2286e.m5178a(bundle, "triggered_event_name", cls2, null);
        C2286e.m5178a(bundle, "triggered_event_params", Bundle.class, null);
        String str6 = "time_to_live";
        C2286e.m5178a(bundle, str6, cls, valueOf);
        C2286e.m5178a(bundle, "expired_event_name", cls2, null);
        C2286e.m5178a(bundle, "expired_event_params", Bundle.class, null);
        C1061o.m2528b(bundle.getString(str2));
        C1061o.m2528b(bundle.getString(str));
        C1061o.m2524b(bundle.get(str3));
        bundle.putLong("creation_timestamp", j);
        String string = bundle.getString(str2);
        Object obj = bundle.get(str3);
        if (mo8287k().mo8803b(string) != 0) {
            mo8285i().f7153f.mo8433a("Invalid conditional user property name", mo8281e().mo8838c(string));
        } else if (mo8287k().mo8804b(string, obj) != 0) {
            mo8285i().f7153f.mo8434a("Invalid conditional user property value", mo8281e().mo8838c(string), obj);
        } else {
            Object c = mo8287k().mo8807c(string, obj);
            if (c == null) {
                mo8285i().f7153f.mo8434a("Unable to normalize conditional user property value", mo8281e().mo8838c(string), obj);
                return;
            }
            C2286e.m5228a(bundle, c);
            long j2 = bundle.getLong(str5);
            if (TextUtils.isEmpty(bundle.getString(str4)) || (j2 <= 15552000000L && j2 >= 1)) {
                long j3 = bundle.getLong(str6);
                if (j3 > 15552000000L || j3 < 1) {
                    mo8285i().f7153f.mo8434a("Invalid conditional user property time to live", mo8281e().mo8838c(string), Long.valueOf(j3));
                    return;
                }
                C3184z4 g = mo8283g();
                C3120t6 t6Var = new C3120t6(this, bundle);
                g.mo8846n();
                C1061o.m2524b(t6Var);
                g.mo8843a(new C2945e5<>(g, t6Var, "Task exception on worker thread"));
                return;
            }
            mo8285i().f7153f.mo8434a("Invalid conditional user property timeout", mo8281e().mo8838c(string), Long.valueOf(j2));
        }
    }

    /* renamed from: x */
    public final boolean mo8375x() {
        return false;
    }

    /* renamed from: y */
    public final void mo8568y() {
        if (this.f7133a.f7332a.getApplicationContext() instanceof Application) {
            ((Application) this.f7133a.f7332a.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f7485c);
        }
    }

    /* renamed from: z */
    public final void mo8569z() {
        mo8279c();
        mo8277a();
        mo8373v();
        if (this.f7133a.mo8467e()) {
            if (this.f7133a.f7338g.mo8574a(C3069p.f7727h0)) {
                C3022ka kaVar = this.f7133a.f7338g;
                C3010ja jaVar = kaVar.f7133a.f7337f;
                Boolean d = kaVar.mo8579d("google_analytics_deferred_deep_link_enabled");
                if (d != null && d.booleanValue()) {
                    mo8285i().f7160m.mo8432a("Deferred Deep Link feature enabled.");
                    C3184z4 g = mo8283g();
                    C3043m6 m6Var = new C3043m6(this);
                    g.mo8846n();
                    C1061o.m2524b(m6Var);
                    g.mo8843a(new C2945e5<>(g, m6Var, "Task exception on worker thread"));
                }
            }
            C3121t7 q = mo8299q();
            q.mo8279c();
            q.mo8373v();
            C3189z9 a = q.mo8725a(true);
            q.mo8301s().mo8818a(3, new byte[0]);
            q.mo8726a((Runnable) new C2924c8(q, a));
            this.f7491i = false;
            C3063o4 l = mo8288l();
            l.mo8279c();
            String str = "previous_os_version";
            String string = l.mo8667s().getString(str, null);
            l.mo8280d().mo8846n();
            String str2 = VERSION.RELEASE;
            if (!TextUtils.isEmpty(str2) && !str2.equals(string)) {
                Editor edit = l.mo8667s().edit();
                edit.putString(str, str2);
                edit.apply();
            }
            if (!TextUtils.isEmpty(string)) {
                mo8280d().mo8846n();
                if (!string.equals(VERSION.RELEASE)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", string);
                    mo8561a("auto", "_ou", bundle);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:145:0x0333  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x036c  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x03df  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x03f3  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x040b  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0425  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0465  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0519  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0528  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x060e  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0617  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x050e A[EDGE_INSN: B:242:0x050e->B:195:0x050e ?: BREAK  
    EDGE_INSN: B:242:0x050e->B:195:0x050e ?: BREAK  
    EDGE_INSN: B:242:0x050e->B:195:0x050e ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x050e A[EDGE_INSN: B:242:0x050e->B:195:0x050e ?: BREAK  
    EDGE_INSN: B:242:0x050e->B:195:0x050e ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8559a(java.lang.String r35, java.lang.String r36, long r37, android.os.Bundle r39, boolean r40, boolean r41, boolean r42, java.lang.String r43) {
        /*
            r34 = this;
            r7 = r34
            r8 = r35
            r15 = r36
            r13 = r37
            r12 = r39
            p124p.p126b.p127k.C1061o.m2528b(r35)
            p124p.p126b.p127k.C1061o.m2524b(r39)
            r34.mo8279c()
            r34.mo8373v()
            q.b.a.b.h.b.g5 r0 = r7.f7133a
            boolean r0 = r0.mo8464b()
            if (r0 != 0) goto L_0x002a
            q.b.a.b.h.b.b4 r0 = r34.mo8285i()
            q.b.a.b.h.b.e4 r0 = r0.f7160m
            java.lang.String r1 = "Event not sent since app measurement is disabled"
            r0.mo8432a(r1)
            return
        L_0x002a:
            q.b.a.b.h.b.g5 r0 = r7.f7133a
            q.b.a.b.h.b.ka r0 = r0.f7338g
            q.b.a.b.h.b.r3<java.lang.Boolean> r1 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7717c0
            boolean r0 = r0.mo8574a(r1)
            if (r0 == 0) goto L_0x0050
            q.b.a.b.h.b.u3 r0 = r34.mo8298p()
            java.util.List<java.lang.String> r0 = r0.f7888i
            if (r0 == 0) goto L_0x0050
            boolean r0 = r0.contains(r15)
            if (r0 != 0) goto L_0x0050
            q.b.a.b.h.b.b4 r0 = r34.mo8285i()
            q.b.a.b.h.b.e4 r0 = r0.f7160m
            java.lang.String r1 = "Dropping non-safelisted event. event name, origin"
            r0.mo8434a(r1, r15, r8)
            return
        L_0x0050:
            boolean r0 = r7.f7488f
            r11 = 0
            r10 = 0
            r9 = 1
            if (r0 != 0) goto L_0x00a4
            r7.f7488f = r9
            q.b.a.b.h.b.g5 r0 = r7.f7133a     // Catch:{ ClassNotFoundException -> 0x0099 }
            boolean r0 = r0.f7336e     // Catch:{ ClassNotFoundException -> 0x0099 }
            if (r0 != 0) goto L_0x006e
            java.lang.String r0 = "com.google.android.gms.tagmanager.TagManagerService"
            q.b.a.b.h.b.g5 r1 = r7.f7133a     // Catch:{ ClassNotFoundException -> 0x0099 }
            android.content.Context r1 = r1.f7332a     // Catch:{ ClassNotFoundException -> 0x0099 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0099 }
            java.lang.Class r0 = java.lang.Class.forName(r0, r9, r1)     // Catch:{ ClassNotFoundException -> 0x0099 }
            goto L_0x0074
        L_0x006e:
            java.lang.String r0 = "com.google.android.gms.tagmanager.TagManagerService"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0099 }
        L_0x0074:
            java.lang.String r1 = "initialize"
            java.lang.Class[] r2 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x008c }
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r2[r10] = r3     // Catch:{ Exception -> 0x008c }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch:{ Exception -> 0x008c }
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x008c }
            q.b.a.b.h.b.g5 r2 = r7.f7133a     // Catch:{ Exception -> 0x008c }
            android.content.Context r2 = r2.f7332a     // Catch:{ Exception -> 0x008c }
            r1[r10] = r2     // Catch:{ Exception -> 0x008c }
            r0.invoke(r11, r1)     // Catch:{ Exception -> 0x008c }
            goto L_0x00a4
        L_0x008c:
            r0 = move-exception
            q.b.a.b.h.b.b4 r1 = r34.mo8285i()     // Catch:{ ClassNotFoundException -> 0x0099 }
            q.b.a.b.h.b.e4 r1 = r1.f7156i     // Catch:{ ClassNotFoundException -> 0x0099 }
            java.lang.String r2 = "Failed to invoke Tag Manager's initialize() method"
            r1.mo8433a(r2, r0)     // Catch:{ ClassNotFoundException -> 0x0099 }
            goto L_0x00a4
        L_0x0099:
            q.b.a.b.h.b.b4 r0 = r34.mo8285i()
            q.b.a.b.h.b.e4 r0 = r0.f7159l
            java.lang.String r1 = "Tag Manager is not found and thus will not be used"
            r0.mo8432a(r1)
        L_0x00a4:
            q.b.a.b.h.b.g5 r0 = r7.f7133a
            q.b.a.b.h.b.ka r0 = r0.f7338g
            q.b.a.b.h.b.r3<java.lang.Boolean> r1 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7729i0
            boolean r0 = r0.mo8574a(r1)
            if (r0 == 0) goto L_0x00db
            java.lang.String r0 = "_cmp"
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto L_0x00db
            java.lang.String r0 = "gclid"
            boolean r1 = r12.containsKey(r0)
            if (r1 == 0) goto L_0x00db
            java.lang.String r4 = r12.getString(r0)
            q.b.a.b.h.b.g5 r0 = r7.f7133a
            q.b.a.b.d.q.b r0 = r0.f7345n
            q.b.a.b.d.q.c r0 = (p213q.p217b.p218a.p231b.p239d.p246q.C2284c) r0
            if (r0 == 0) goto L_0x00da
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_lgclid"
            r1 = r34
            r1.mo8564a(r2, r3, r4, r5)
            goto L_0x00db
        L_0x00da:
            throw r11
        L_0x00db:
            boolean r0 = p213q.p217b.p218a.p231b.p251g.p256e.C2442fc.m5827b()
            if (r0 == 0) goto L_0x011a
            q.b.a.b.h.b.g5 r0 = r7.f7133a
            q.b.a.b.h.b.ka r0 = r0.f7338g
            q.b.a.b.h.b.r3<java.lang.Boolean> r1 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7693N0
            boolean r0 = r0.mo8574a(r1)
            if (r0 == 0) goto L_0x011a
            q.b.a.b.h.b.g5 r0 = r7.f7133a
            q.b.a.b.h.b.ja r0 = r0.f7337f
            if (r40 == 0) goto L_0x011a
            java.lang.String[] r0 = p213q.p217b.p218a.p231b.p259h.p261b.C3156w9.f7945h
            int r1 = r0.length
            r2 = r10
        L_0x00f7:
            if (r2 >= r1) goto L_0x0106
            r3 = r0[r2]
            boolean r3 = r3.equals(r15)
            if (r3 == 0) goto L_0x0103
            r0 = r10
            goto L_0x0107
        L_0x0103:
            int r2 = r2 + 1
            goto L_0x00f7
        L_0x0106:
            r0 = r9
        L_0x0107:
            if (r0 == 0) goto L_0x011a
            q.b.a.b.h.b.w9 r0 = r34.mo8287k()
            q.b.a.b.h.b.o4 r1 = r34.mo8288l()
            q.b.a.b.h.b.p4 r1 = r1.f7619C
            android.os.Bundle r1 = r1.mo8687a()
            r0.mo8785a(r12, r1)
        L_0x011a:
            java.lang.String r0 = "_ev"
            r1 = 40
            if (r42 == 0) goto L_0x017d
            q.b.a.b.h.b.g5 r2 = r7.f7133a
            q.b.a.b.h.b.ja r2 = r2.f7337f
            java.lang.String r2 = "_iap"
            boolean r2 = r2.equals(r15)
            if (r2 != 0) goto L_0x017d
            q.b.a.b.h.b.g5 r2 = r7.f7133a
            q.b.a.b.h.b.w9 r2 = r2.mo8473p()
            java.lang.String r3 = "event"
            boolean r4 = r2.mo8799a(r3, r15)
            r5 = 2
            if (r4 != 0) goto L_0x013c
            goto L_0x014f
        L_0x013c:
            java.lang.String[] r4 = p213q.p217b.p218a.p231b.p259h.p261b.C2946e6.f7281a
            boolean r4 = r2.mo8802a(r3, r4, r15)
            if (r4 != 0) goto L_0x0147
            r5 = 13
            goto L_0x014f
        L_0x0147:
            boolean r2 = r2.mo8798a(r3, r1, r15)
            if (r2 != 0) goto L_0x014e
            goto L_0x014f
        L_0x014e:
            r5 = r10
        L_0x014f:
            if (r5 == 0) goto L_0x017d
            q.b.a.b.h.b.b4 r2 = r34.mo8285i()
            q.b.a.b.h.b.e4 r2 = r2.f7155h
            q.b.a.b.h.b.z3 r3 = r34.mo8281e()
            java.lang.String r3 = r3.mo8834a(r15)
            java.lang.String r4 = "Invalid public event name. Event will not be logged (FE)"
            r2.mo8433a(r4, r3)
            q.b.a.b.h.b.g5 r2 = r7.f7133a
            r2.mo8473p()
            java.lang.String r1 = p213q.p217b.p218a.p231b.p259h.p261b.C3156w9.m7404a(r15, r1, r9)
            if (r15 == 0) goto L_0x0173
            int r10 = r36.length()
        L_0x0173:
            q.b.a.b.h.b.g5 r2 = r7.f7133a
            q.b.a.b.h.b.w9 r2 = r2.mo8473p()
            r2.mo8783a(r5, r0, r1, r10)
            return
        L_0x017d:
            q.b.a.b.h.b.g5 r2 = r7.f7133a
            q.b.a.b.h.b.ja r2 = r2.f7337f
            q.b.a.b.h.b.o7 r2 = r34.mo8300r()
            q.b.a.b.h.b.m7 r2 = r2.mo8671a(r10)
            java.lang.String r3 = "_sc"
            if (r2 == 0) goto L_0x0195
            boolean r4 = r12.containsKey(r3)
            if (r4 != 0) goto L_0x0195
            r2.f7570d = r9
        L_0x0195:
            if (r40 == 0) goto L_0x019b
            if (r42 == 0) goto L_0x019b
            r4 = r9
            goto L_0x019c
        L_0x019b:
            r4 = r10
        L_0x019c:
            p213q.p217b.p218a.p231b.p259h.p261b.C3066o7.m7152a(r2, r12, r4)
            java.lang.String r4 = "am"
            boolean r16 = r4.equals(r8)
            boolean r4 = p213q.p217b.p218a.p231b.p259h.p261b.C3156w9.m7418i(r36)
            if (r40 == 0) goto L_0x01f5
            q.b.a.b.h.b.f6 r5 = r7.f7486d
            if (r5 == 0) goto L_0x01f5
            if (r4 != 0) goto L_0x01f5
            if (r16 != 0) goto L_0x01f5
            q.b.a.b.h.b.b4 r0 = r34.mo8285i()
            q.b.a.b.h.b.e4 r0 = r0.f7160m
            q.b.a.b.h.b.z3 r1 = r34.mo8281e()
            java.lang.String r1 = r1.mo8834a(r15)
            q.b.a.b.h.b.z3 r2 = r34.mo8281e()
            java.lang.String r2 = r2.mo8833a(r12)
            java.lang.String r3 = "Passing event to registered event handler (FE)"
            r0.mo8434a(r3, r1, r2)
            q.b.a.b.h.b.f6 r0 = r7.f7486d
            r9 = r0
            com.google.android.gms.measurement.internal.AppMeasurementDynamiteService$b r9 = (com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.C0201b) r9
            if (r9 == 0) goto L_0x01f4
            q.b.a.b.g.e.c r1 = r9.f1119a     // Catch:{ RemoteException -> 0x01e3 }
            r2 = r35
            r3 = r36
            r4 = r39
            r5 = r37
            r1.mo7470a(r2, r3, r4, r5)     // Catch:{ RemoteException -> 0x01e3 }
            goto L_0x01f3
        L_0x01e3:
            r0 = move-exception
            com.google.android.gms.measurement.internal.AppMeasurementDynamiteService r1 = com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.this
            q.b.a.b.h.b.g5 r1 = r1.f1115a
            q.b.a.b.h.b.b4 r1 = r1.mo8285i()
            q.b.a.b.h.b.e4 r1 = r1.f7156i
            java.lang.String r2 = "Event interceptor threw exception"
            r1.mo8433a(r2, r0)
        L_0x01f3:
            return
        L_0x01f4:
            throw r11
        L_0x01f5:
            q.b.a.b.h.b.g5 r4 = r7.f7133a
            boolean r4 = r4.mo8467e()
            if (r4 != 0) goto L_0x01fe
            return
        L_0x01fe:
            q.b.a.b.h.b.w9 r4 = r34.mo8287k()
            int r4 = r4.mo8775a(r15)
            if (r4 == 0) goto L_0x0232
            q.b.a.b.h.b.b4 r2 = r34.mo8285i()
            q.b.a.b.h.b.e4 r2 = r2.f7155h
            q.b.a.b.h.b.z3 r3 = r34.mo8281e()
            java.lang.String r3 = r3.mo8834a(r15)
            java.lang.String r5 = "Invalid event name. Event will not be logged (FE)"
            r2.mo8433a(r5, r3)
            r34.mo8287k()
            java.lang.String r1 = p213q.p217b.p218a.p231b.p259h.p261b.C3156w9.m7404a(r15, r1, r9)
            if (r15 == 0) goto L_0x0228
            int r10 = r36.length()
        L_0x0228:
            q.b.a.b.h.b.g5 r2 = r7.f7133a
            q.b.a.b.h.b.w9 r2 = r2.mo8473p()
            r2.mo8783a(r4, r0, r1, r10)
            return
        L_0x0232:
            java.lang.String r0 = "_sn"
            java.lang.String r5 = "_o"
            java.lang.String r1 = "_si"
            java.lang.String[] r4 = new java.lang.String[]{r5, r0, r3, r1}
            java.util.List r4 = java.util.Arrays.asList(r4)
            java.util.List r17 = java.util.Collections.unmodifiableList(r4)
            q.b.a.b.h.b.w9 r4 = r34.mo8287k()
            r6 = 1
            r9 = r4
            r4 = r10
            r10 = r43
            r19 = r11
            r11 = r36
            r12 = r39
            r13 = r17
            r14 = r42
            r15 = r6
            android.os.Bundle r15 = r9.mo8779a(r10, r11, r12, r13, r14, r15)
            if (r15 == 0) goto L_0x0285
            boolean r6 = r15.containsKey(r3)
            if (r6 == 0) goto L_0x0285
            boolean r6 = r15.containsKey(r1)
            if (r6 != 0) goto L_0x026b
            goto L_0x0285
        L_0x026b:
            java.lang.String r0 = r15.getString(r0)
            java.lang.String r3 = r15.getString(r3)
            long r9 = r15.getLong(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r9)
            q.b.a.b.h.b.m7 r11 = new q.b.a.b.h.b.m7
            long r9 = r1.longValue()
            r11.<init>(r0, r3, r9)
            goto L_0x0287
        L_0x0285:
            r11 = r19
        L_0x0287:
            if (r11 != 0) goto L_0x028b
            r0 = r2
            goto L_0x028c
        L_0x028b:
            r0 = r11
        L_0x028c:
            q.b.a.b.h.b.g5 r1 = r7.f7133a
            q.b.a.b.h.b.ka r1 = r1.f7338g
            q.b.a.b.h.b.r3<java.lang.Boolean> r2 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7706U
            boolean r1 = r1.mo8574a(r2)
            java.lang.String r14 = "_ae"
            r9 = 0
            if (r1 == 0) goto L_0x02c8
            q.b.a.b.h.b.g5 r1 = r7.f7133a
            q.b.a.b.h.b.ja r1 = r1.f7337f
            q.b.a.b.h.b.o7 r1 = r34.mo8300r()
            q.b.a.b.h.b.m7 r1 = r1.mo8671a(r4)
            if (r1 == 0) goto L_0x02c8
            r13 = r36
            boolean r1 = r14.equals(r13)
            if (r1 == 0) goto L_0x02ca
            q.b.a.b.h.b.x8 r1 = r34.mo8302t()
            q.b.a.b.h.b.e9 r1 = r1.f7969e
            long r1 = r1.mo8440a()
            int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r3 <= 0) goto L_0x02ca
            q.b.a.b.h.b.w9 r3 = r34.mo8287k()
            r3.mo8784a(r15, r1)
            goto L_0x02ca
        L_0x02c8:
            r13 = r36
        L_0x02ca:
            boolean r1 = p213q.p217b.p218a.p231b.p251g.p256e.C2720va.m6498b()
            if (r1 == 0) goto L_0x034a
            q.b.a.b.h.b.g5 r1 = r7.f7133a
            q.b.a.b.h.b.ka r1 = r1.f7338g
            q.b.a.b.h.b.r3<java.lang.Boolean> r2 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7755v0
            boolean r1 = r1.mo8574a(r2)
            if (r1 == 0) goto L_0x034a
            java.lang.String r1 = "auto"
            boolean r1 = r1.equals(r8)
            java.lang.String r2 = "_ffr"
            if (r1 != 0) goto L_0x032d
            java.lang.String r1 = "_ssr"
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L_0x032d
            q.b.a.b.h.b.w9 r1 = r34.mo8287k()
            java.lang.String r2 = r15.getString(r2)
            boolean r3 = p213q.p217b.p218a.p231b.p239d.p246q.C2288g.m5355a(r2)
            if (r3 == 0) goto L_0x02ff
            r11 = r19
            goto L_0x0303
        L_0x02ff:
            java.lang.String r11 = r2.trim()
        L_0x0303:
            q.b.a.b.h.b.o4 r2 = r1.mo8288l()
            q.b.a.b.h.b.u4 r2 = r2.f7643z
            java.lang.String r2 = r2.mo8749a()
            boolean r2 = p213q.p217b.p218a.p231b.p259h.p261b.C3156w9.m7416c(r11, r2)
            if (r2 == 0) goto L_0x0320
            q.b.a.b.h.b.b4 r1 = r1.mo8285i()
            q.b.a.b.h.b.e4 r1 = r1.f7160m
            java.lang.String r2 = "Not logging duplicate session_start_with_rollout event"
            r1.mo8432a(r2)
            r1 = r4
            goto L_0x032a
        L_0x0320:
            q.b.a.b.h.b.o4 r1 = r1.mo8288l()
            q.b.a.b.h.b.u4 r1 = r1.f7643z
            r1.mo8750a(r11)
            r1 = 1
        L_0x032a:
            if (r1 != 0) goto L_0x034a
            return
        L_0x032d:
            boolean r1 = r14.equals(r13)
            if (r1 == 0) goto L_0x034a
            q.b.a.b.h.b.w9 r1 = r34.mo8287k()
            q.b.a.b.h.b.o4 r1 = r1.mo8288l()
            q.b.a.b.h.b.u4 r1 = r1.f7643z
            java.lang.String r1 = r1.mo8749a()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x034a
            r15.putString(r2, r1)
        L_0x034a:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r12.add(r15)
            q.b.a.b.h.b.w9 r1 = r34.mo8287k()
            java.security.SecureRandom r1 = r1.mo8814t()
            long r2 = r1.nextLong()
            q.b.a.b.h.b.o4 r1 = r34.mo8288l()
            q.b.a.b.h.b.s4 r1 = r1.f7638u
            long r20 = r1.mo8708a()
            int r1 = (r20 > r9 ? 1 : (r20 == r9 ? 0 : -1))
            if (r1 <= 0) goto L_0x03df
            q.b.a.b.h.b.o4 r1 = r34.mo8288l()
            r9 = r37
            boolean r1 = r1.mo8664a(r9)
            if (r1 == 0) goto L_0x03e1
            q.b.a.b.h.b.o4 r1 = r34.mo8288l()
            q.b.a.b.h.b.q4 r1 = r1.f7640w
            boolean r1 = r1.mo8697a()
            if (r1 == 0) goto L_0x03e1
            q.b.a.b.h.b.b4 r1 = r34.mo8285i()
            q.b.a.b.h.b.e4 r1 = r1.f7161n
            java.lang.String r6 = "Current session is expired, remove the session number, ID, and engagement time"
            r1.mo8432a(r6)
            r6 = 0
            q.b.a.b.h.b.g5 r1 = r7.f7133a
            q.b.a.b.d.q.b r1 = r1.f7345n
            q.b.a.b.d.q.c r1 = (p213q.p217b.p218a.p231b.p239d.p246q.C2284c) r1
            if (r1 == 0) goto L_0x03de
            long r20 = java.lang.System.currentTimeMillis()
            java.lang.String r11 = "auto"
            java.lang.String r22 = "_sid"
            r1 = r34
            r23 = r2
            r2 = r11
            r3 = r22
            r11 = r4
            r4 = r6
            r8 = r5
            r5 = r20
            r1.mo8564a(r2, r3, r4, r5)
            r4 = 0
            q.b.a.b.h.b.g5 r1 = r7.f7133a
            q.b.a.b.d.q.b r1 = r1.f7345n
            q.b.a.b.d.q.c r1 = (p213q.p217b.p218a.p231b.p239d.p246q.C2284c) r1
            if (r1 == 0) goto L_0x03dd
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_sno"
            r1 = r34
            r1.mo8564a(r2, r3, r4, r5)
            r4 = 0
            q.b.a.b.h.b.g5 r1 = r7.f7133a
            q.b.a.b.d.q.b r1 = r1.f7345n
            q.b.a.b.d.q.c r1 = (p213q.p217b.p218a.p231b.p239d.p246q.C2284c) r1
            if (r1 == 0) goto L_0x03dc
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_se"
            r1 = r34
            r1.mo8564a(r2, r3, r4, r5)
            goto L_0x03e5
        L_0x03dc:
            throw r19
        L_0x03dd:
            throw r19
        L_0x03de:
            throw r19
        L_0x03df:
            r9 = r37
        L_0x03e1:
            r23 = r2
            r11 = r4
            r8 = r5
        L_0x03e5:
            java.lang.String r1 = "extend_session"
            r2 = 0
            long r1 = r15.getLong(r1, r2)
            r3 = 1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x040b
            q.b.a.b.h.b.b4 r1 = r34.mo8285i()
            q.b.a.b.h.b.e4 r1 = r1.f7161n
            java.lang.String r2 = "EXTEND_SESSION param attached: initiate a new session or extend the current active session"
            r1.mo8432a(r2)
            q.b.a.b.h.b.g5 r1 = r7.f7133a
            q.b.a.b.h.b.x8 r1 = r1.mo8471n()
            q.b.a.b.h.b.g9 r1 = r1.f7968d
            r5 = 1
            r1.mo8489a(r9, r5)
            goto L_0x040c
        L_0x040b:
            r5 = 1
        L_0x040c:
            java.util.Set r1 = r15.keySet()
            int r2 = r15.size()
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.Object[] r1 = r1.toArray(r2)
            java.lang.String[] r1 = (java.lang.String[]) r1
            java.util.Arrays.sort(r1)
            boolean r2 = p213q.p217b.p218a.p231b.p251g.p256e.C2602oa.m6203b()
            if (r2 == 0) goto L_0x045e
            q.b.a.b.h.b.g5 r2 = r7.f7133a
            q.b.a.b.h.b.ka r2 = r2.f7338g
            q.b.a.b.h.b.r3<java.lang.Boolean> r3 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7681H0
            boolean r2 = r2.mo8574a(r3)
            if (r2 == 0) goto L_0x045e
            q.b.a.b.h.b.g5 r2 = r7.f7133a
            q.b.a.b.h.b.ka r2 = r2.f7338g
            q.b.a.b.h.b.r3<java.lang.Boolean> r3 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7679G0
            boolean r2 = r2.mo8574a(r3)
            if (r2 == 0) goto L_0x045e
            int r0 = r1.length
            r2 = r11
        L_0x043f:
            if (r2 >= r0) goto L_0x0456
            r3 = r1[r2]
            r34.mo8287k()
            java.lang.Object r4 = r15.get(r3)
            android.os.Bundle[] r4 = p213q.p217b.p218a.p231b.p259h.p261b.C3156w9.m7415b(r4)
            if (r4 == 0) goto L_0x0453
            r15.putParcelableArray(r3, r4)
        L_0x0453:
            int r2 = r2 + 1
            goto L_0x043f
        L_0x0456:
            r21 = r5
            r40 = r8
            r2 = r13
            r0 = r14
            goto L_0x0521
        L_0x045e:
            int r2 = r1.length
            r3 = r11
            r4 = r3
        L_0x0461:
            java.lang.String r6 = "_eid"
            if (r3 >= r2) goto L_0x050e
            r5 = r1[r3]
            java.lang.Object r20 = r15.get(r5)
            r34.mo8287k()
            r39 = r1
            android.os.Bundle[] r1 = p213q.p217b.p218a.p231b.p259h.p261b.C3156w9.m7415b(r20)
            if (r1 == 0) goto L_0x04eb
            int r11 = r1.length
            r15.putInt(r5, r11)
            r20 = r2
            r11 = 0
        L_0x047d:
            int r2 = r1.length
            if (r11 >= r2) goto L_0x04dd
            r2 = r1[r11]
            r21 = r15
            r15 = 1
            p213q.p217b.p218a.p231b.p259h.p261b.C3066o7.m7152a(r0, r2, r15)
            q.b.a.b.h.b.w9 r18 = r34.mo8287k()
            r22 = 0
            java.lang.String r25 = "_ep"
            r9 = r18
            r10 = r43
            r26 = r11
            r11 = r25
            r27 = r12
            r12 = r2
            r2 = r13
            r13 = r17
            r18 = r0
            r0 = r14
            r14 = r42
            r40 = r8
            r8 = r21
            r21 = r15
            r15 = r22
            android.os.Bundle r9 = r9.mo8779a(r10, r11, r12, r13, r14, r15)
            java.lang.String r10 = "_en"
            r9.putString(r10, r2)
            r10 = r23
            r9.putLong(r6, r10)
            java.lang.String r12 = "_gn"
            r9.putString(r12, r5)
            int r12 = r1.length
            java.lang.String r13 = "_ll"
            r9.putInt(r13, r12)
            java.lang.String r12 = "_i"
            r13 = r26
            r9.putInt(r12, r13)
            r12 = r27
            r12.add(r9)
            int r9 = r13 + 1
            r14 = r0
            r13 = r2
            r15 = r8
            r0 = r18
            r8 = r40
            r11 = r9
            r9 = r37
            goto L_0x047d
        L_0x04dd:
            r18 = r0
            r40 = r8
            r2 = r13
            r0 = r14
            r8 = r15
            r10 = r23
            r21 = 1
            int r1 = r1.length
            int r4 = r4 + r1
            goto L_0x04f8
        L_0x04eb:
            r18 = r0
            r20 = r2
            r40 = r8
            r2 = r13
            r0 = r14
            r8 = r15
            r10 = r23
            r21 = 1
        L_0x04f8:
            int r3 = r3 + 1
            r1 = r39
            r14 = r0
            r13 = r2
            r15 = r8
            r23 = r10
            r0 = r18
            r2 = r20
            r5 = r21
            r11 = 0
            r9 = r37
            r8 = r40
            goto L_0x0461
        L_0x050e:
            r21 = r5
            r40 = r8
            r2 = r13
            r0 = r14
            r8 = r15
            r10 = r23
            if (r4 == 0) goto L_0x0521
            r8.putLong(r6, r10)
            java.lang.String r1 = "_epc"
            r8.putInt(r1, r4)
        L_0x0521:
            r10 = 0
        L_0x0522:
            int r1 = r12.size()
            if (r10 >= r1) goto L_0x05ec
            java.lang.Object r1 = r12.get(r10)
            android.os.Bundle r1 = (android.os.Bundle) r1
            if (r10 == 0) goto L_0x0533
            r3 = r21
            goto L_0x0534
        L_0x0533:
            r3 = 0
        L_0x0534:
            if (r3 == 0) goto L_0x053d
            java.lang.String r3 = "_ep"
            r8 = r35
            r9 = r40
            goto L_0x0542
        L_0x053d:
            r8 = r35
            r9 = r40
            r3 = r2
        L_0x0542:
            r1.putString(r9, r8)
            if (r41 == 0) goto L_0x054f
            q.b.a.b.h.b.w9 r4 = r34.mo8287k()
            android.os.Bundle r1 = r4.mo8778a(r1)
        L_0x054f:
            r11 = r1
            q.b.a.b.h.b.n r13 = new q.b.a.b.h.b.n
            q.b.a.b.h.b.m r4 = new q.b.a.b.h.b.m
            r4.<init>(r11)
            r1 = r13
            r14 = r2
            r2 = r3
            r3 = r4
            r4 = r35
            r15 = r21
            r5 = r37
            r1.<init>(r2, r3, r4, r5)
            q.b.a.b.h.b.t7 r1 = r34.mo8299q()
            if (r1 == 0) goto L_0x05eb
            p124p.p126b.p127k.C1061o.m2524b(r13)
            r1.mo8279c()
            r1.mo8373v()
            r1.mo8721B()
            q.b.a.b.h.b.x3 r2 = r1.mo8301s()
            if (r2 == 0) goto L_0x05ea
            android.os.Parcel r3 = android.os.Parcel.obtain()
            r5 = 0
            r13.writeToParcel(r3, r5)
            byte[] r4 = r3.marshall()
            r3.recycle()
            int r3 = r4.length
            r6 = 131072(0x20000, float:1.83671E-40)
            if (r3 <= r6) goto L_0x059e
            q.b.a.b.h.b.b4 r2 = r2.mo8285i()
            q.b.a.b.h.b.e4 r2 = r2.f7154g
            java.lang.String r3 = "Event is too long for local database. Sending event directly to service"
            r2.mo8432a(r3)
            r30 = r5
            goto L_0x05a4
        L_0x059e:
            boolean r2 = r2.mo8818a(r5, r4)
            r30 = r2
        L_0x05a4:
            q.b.a.b.h.b.z9 r32 = r1.mo8725a(r15)
            q.b.a.b.h.b.i8 r2 = new q.b.a.b.h.b.i8
            r29 = 1
            r27 = r2
            r28 = r1
            r31 = r13
            r33 = r43
            r27.<init>(r28, r29, r30, r31, r32, r33)
            r1.mo8726a(r2)
            if (r16 != 0) goto L_0x05e0
            java.util.Set<q.b.a.b.h.b.i6> r1 = r7.f7487e
            java.util.Iterator r13 = r1.iterator()
        L_0x05c2:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x05e0
            java.lang.Object r1 = r13.next()
            q.b.a.b.h.b.i6 r1 = (p213q.p217b.p218a.p231b.p259h.p261b.C2994i6) r1
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>(r11)
            r2 = r35
            r3 = r36
            r15 = r5
            r5 = r37
            r1.mo1622a(r2, r3, r4, r5)
            r5 = r15
            r15 = 1
            goto L_0x05c2
        L_0x05e0:
            r15 = r5
            int r10 = r10 + 1
            r40 = r9
            r2 = r14
            r21 = 1
            goto L_0x0522
        L_0x05ea:
            throw r19
        L_0x05eb:
            throw r19
        L_0x05ec:
            r14 = r2
            r15 = 0
            q.b.a.b.h.b.g5 r1 = r7.f7133a
            q.b.a.b.h.b.ja r1 = r1.f7337f
            q.b.a.b.h.b.o7 r1 = r34.mo8300r()
            q.b.a.b.h.b.m7 r1 = r1.mo8671a(r15)
            if (r1 == 0) goto L_0x0618
            boolean r0 = r0.equals(r14)
            if (r0 == 0) goto L_0x0618
            q.b.a.b.h.b.x8 r0 = r34.mo8302t()
            q.b.a.b.h.b.g5 r1 = r7.f7133a
            q.b.a.b.d.q.b r1 = r1.f7345n
            q.b.a.b.d.q.c r1 = (p213q.p217b.p218a.p231b.p239d.p246q.C2284c) r1
            if (r1 == 0) goto L_0x0617
            long r1 = android.os.SystemClock.elapsedRealtime()
            r3 = 1
            r0.mo8824a(r3, r3, r1)
            goto L_0x0618
        L_0x0617:
            throw r19
        L_0x0618:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p259h.p261b.C3018k6.mo8559a(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo8560a(String str, String str2, long j, Object obj) {
        C3184z4 g = mo8283g();
        C3076p6 p6Var = new C3076p6(this, str, str2, obj, j);
        g.mo8846n();
        C1061o.m2524b(p6Var);
        g.mo8843a(new C2945e5<>(g, p6Var, "Task exception on worker thread"));
    }

    /* renamed from: a */
    public final void mo8561a(String str, String str2, Bundle bundle) {
        if (((C2284c) this.f7133a.f7345n) != null) {
            mo8562a(str, str2, bundle, true, true, System.currentTimeMillis());
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public final void mo8562a(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        mo8277a();
        String str3 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (this.f7133a.f7338g.mo8574a(C3069p.f7673D0)) {
            if (C3156w9.m7416c(str2, "screen_view")) {
                mo8300r().mo8675a(bundle2, j);
                return;
            }
        } else {
            String str4 = str2;
        }
        long j2 = j;
        boolean z3 = !z2 || this.f7486d == null || C3156w9.m7418i(str2);
        boolean z4 = !z;
        Bundle bundle3 = new Bundle(bundle2);
        for (String str5 : bundle3.keySet()) {
            Object obj = bundle3.get(str5);
            if (obj instanceof Bundle) {
                bundle3.putBundle(str5, new Bundle((Bundle) obj));
            } else if (obj instanceof Parcelable[]) {
                Parcelable[] parcelableArr = (Parcelable[]) obj;
                for (int i = 0; i < parcelableArr.length; i++) {
                    if (parcelableArr[i] instanceof Bundle) {
                        parcelableArr[i] = new Bundle((Bundle) parcelableArr[i]);
                    }
                }
            } else if (obj instanceof List) {
                List list = (List) obj;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    Object obj2 = list.get(i2);
                    if (obj2 instanceof Bundle) {
                        list.set(i2, new Bundle((Bundle) obj2));
                    }
                }
            }
        }
        C3184z4 g = mo8283g();
        C3054n6 n6Var = new C3054n6(this, str3, str2, j, bundle3, z2, z3, z4, null);
        g.mo8846n();
        C1061o.m2524b(n6Var);
        g.mo8843a(new C2945e5<>(g, n6Var, "Task exception on worker thread"));
    }

    /* renamed from: a */
    public final void mo8563a(String str, String str2, Object obj) {
        if (((C2284c) this.f7133a.f7345n) != null) {
            mo8565a(str, str2, obj, true, System.currentTimeMillis());
            return;
        }
        throw null;
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v1 */
    /* JADX WARNING: type inference failed for: r6v2 */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r10v12, types: [java.lang.Long] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Object, code=null, for r11v0, types: [java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r6v2
      assigns: []
      uses: []
      mth insns count: 79
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
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8564a(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            p124p.p126b.p127k.C1061o.m2528b(r9)
            p124p.p126b.p127k.C1061o.m2528b(r10)
            r8.mo8279c()
            r8.mo8277a()
            r8.mo8373v()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L_0x0063
            boolean r0 = r11 instanceof java.lang.String
            if (r0 == 0) goto L_0x0053
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x0053
            java.util.Locale r10 = java.util.Locale.ENGLISH
            java.lang.String r10 = r0.toLowerCase(r10)
            java.lang.String r11 = "false"
            boolean r10 = r11.equals(r10)
            r2 = 1
            if (r10 == 0) goto L_0x0038
            r4 = r2
            goto L_0x003a
        L_0x0038:
            r4 = 0
        L_0x003a:
            java.lang.Long r10 = java.lang.Long.valueOf(r4)
            q.b.a.b.h.b.o4 r0 = r8.mo8288l()
            q.b.a.b.h.b.u4 r0 = r0.f7636s
            long r4 = r10.longValue()
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x004e
            java.lang.String r11 = "true"
        L_0x004e:
            r0.mo8750a(r11)
            r6 = r10
            goto L_0x0061
        L_0x0053:
            if (r11 != 0) goto L_0x0063
            q.b.a.b.h.b.o4 r10 = r8.mo8288l()
            q.b.a.b.h.b.u4 r10 = r10.f7636s
            java.lang.String r0 = "unset"
            r10.mo8750a(r0)
            r6 = r11
        L_0x0061:
            r3 = r1
            goto L_0x0065
        L_0x0063:
            r3 = r10
            r6 = r11
        L_0x0065:
            q.b.a.b.h.b.g5 r10 = r8.f7133a
            boolean r10 = r10.mo8464b()
            if (r10 != 0) goto L_0x0079
            q.b.a.b.h.b.b4 r9 = r8.mo8285i()
            q.b.a.b.h.b.e4 r9 = r9.f7161n
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.mo8432a(r10)
            return
        L_0x0079:
            q.b.a.b.h.b.g5 r10 = r8.f7133a
            boolean r10 = r10.mo8467e()
            if (r10 != 0) goto L_0x0082
            return
        L_0x0082:
            q.b.a.b.h.b.s9 r10 = new q.b.a.b.h.b.s9
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            q.b.a.b.h.b.t7 r9 = r8.mo8299q()
            r9.mo8279c()
            r9.mo8373v()
            r9.mo8721B()
            q.b.a.b.h.b.x3 r11 = r9.mo8301s()
            if (r11 == 0) goto L_0x00cf
            android.os.Parcel r12 = android.os.Parcel.obtain()
            r13 = 0
            r10.writeToParcel(r12, r13)
            byte[] r0 = r12.marshall()
            r12.recycle()
            int r12 = r0.length
            r1 = 131072(0x20000, float:1.83671E-40)
            r2 = 1
            if (r12 <= r1) goto L_0x00be
            q.b.a.b.h.b.b4 r11 = r11.mo8285i()
            q.b.a.b.h.b.e4 r11 = r11.f7154g
            java.lang.String r12 = "User property too long for local database. Sending directly to service"
            r11.mo8432a(r12)
            goto L_0x00c2
        L_0x00be:
            boolean r13 = r11.mo8818a(r2, r0)
        L_0x00c2:
            q.b.a.b.h.b.z9 r11 = r9.mo8725a(r2)
            q.b.a.b.h.b.v7 r12 = new q.b.a.b.h.b.v7
            r12.<init>(r9, r13, r10, r11)
            r9.mo8726a(r12)
            return
        L_0x00cf:
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p259h.p261b.C3018k6.mo8564a(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    /* renamed from: a */
    public final void mo8565a(String str, String str2, Object obj, boolean z, long j) {
        if (str == null) {
            str = "app";
        }
        String str3 = str;
        int i = 6;
        int i2 = 0;
        if (z) {
            i = mo8287k().mo8803b(str2);
        } else {
            C3156w9 k = mo8287k();
            String str4 = "user property";
            if (k.mo8799a(str4, str2)) {
                if (!k.mo8802a(str4, C2970g6.f7358a, str2)) {
                    i = 15;
                } else if (k.mo8798a(str4, 24, str2)) {
                    i = 0;
                }
            }
        }
        String str5 = "_ev";
        if (i != 0) {
            mo8287k();
            String a = C3156w9.m7404a(str2, 24, true);
            if (str2 != null) {
                i2 = str2.length();
            }
            this.f7133a.mo8473p().mo8783a(i, str5, a, i2);
        } else if (obj != null) {
            int b = mo8287k().mo8804b(str2, obj);
            if (b != 0) {
                mo8287k();
                String a2 = C3156w9.m7404a(str2, 24, true);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    i2 = String.valueOf(obj).length();
                }
                this.f7133a.mo8473p().mo8783a(b, str5, a2, i2);
                return;
            }
            Object c = mo8287k().mo8807c(str2, obj);
            if (c != null) {
                mo8560a(str3, str2, j, c);
            }
        } else {
            mo8560a(str3, str2, j, (Object) null);
        }
    }

    /* renamed from: a */
    public final ArrayList<Bundle> mo8555a(String str, String str2, String str3) {
        if (mo8283g().mo8845s()) {
            mo8285i().f7153f.mo8432a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList<>(0);
        } else if (C3010ja.m7022a()) {
            mo8285i().f7153f.mo8432a("Cannot get conditional user properties from main thread");
            return new ArrayList<>(0);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            C3184z4 g = this.f7133a.mo8283g();
            C3131u6 u6Var = new C3131u6(this, atomicReference, str, str2, str3);
            g.mo8840a(atomicReference, 5000, "get conditional user properties", u6Var);
            List list = (List) atomicReference.get();
            if (list != null) {
                return C3156w9.m7413b(list);
            }
            mo8285i().f7153f.mo8433a("Timed out waiting for get conditional user properties", str);
            return new ArrayList<>();
        }
    }

    /* renamed from: a */
    public final Map<String, Object> mo8556a(String str, String str2, String str3, boolean z) {
        C2944e4 e4Var;
        String str4;
        if (mo8283g().mo8845s()) {
            e4Var = mo8285i().f7153f;
            str4 = "Cannot get user properties from analytics worker thread";
        } else if (C3010ja.m7022a()) {
            e4Var = mo8285i().f7153f;
            str4 = "Cannot get user properties from main thread";
        } else {
            AtomicReference atomicReference = new AtomicReference();
            C3184z4 g = this.f7133a.mo8283g();
            C3164x6 x6Var = new C3164x6(this, atomicReference, str, str2, str3, z);
            g.mo8840a(atomicReference, 5000, "get user properties", x6Var);
            List<C3112s9> list = (List) atomicReference.get();
            if (list == null) {
                mo8285i().f7153f.mo8433a("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
                return Collections.emptyMap();
            }
            C1248a aVar = new C1248a(list.size());
            for (C3112s9 s9Var : list) {
                aVar.put(s9Var.f7851f, s9Var.mo8714a());
            }
            return aVar;
        }
        e4Var.mo8432a(str4);
        return Collections.emptyMap();
    }

    /* renamed from: a */
    public final void mo8566a(String str, String str2, String str3, Bundle bundle) {
        if (((C2284c) this.f7133a.f7345n) != null) {
            long currentTimeMillis = System.currentTimeMillis();
            C1061o.m2528b(str2);
            Bundle bundle2 = new Bundle();
            if (str != null) {
                bundle2.putString("app_id", str);
            }
            bundle2.putString("name", str2);
            bundle2.putLong("creation_timestamp", currentTimeMillis);
            if (str3 != null) {
                bundle2.putString("expired_event_name", str3);
                bundle2.putBundle("expired_event_params", bundle);
            }
            C3184z4 g = mo8283g();
            C3109s6 s6Var = new C3109s6(this, bundle2);
            g.mo8846n();
            C1061o.m2524b(s6Var);
            g.mo8843a(new C2945e5<>(g, s6Var, "Task exception on worker thread"));
            return;
        }
        throw null;
    }
}
