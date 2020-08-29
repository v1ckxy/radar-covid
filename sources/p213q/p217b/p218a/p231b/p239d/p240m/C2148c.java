package p213q.p217b.p218a.p231b.p239d.p240m;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import p213q.p217b.p218a.p231b.p239d.p240m.C2133a.C2135b;
import p213q.p217b.p218a.p231b.p239d.p240m.C2133a.C2137d;
import p213q.p217b.p218a.p231b.p239d.p240m.p241k.C2160a;
import p213q.p217b.p218a.p231b.p239d.p240m.p241k.C2162b;
import p213q.p217b.p218a.p231b.p239d.p240m.p241k.C2169e;
import p213q.p217b.p218a.p231b.p239d.p240m.p241k.C2183i0;
import p213q.p217b.p218a.p231b.p239d.p240m.p241k.C2190m;
import p213q.p217b.p218a.p231b.p239d.p240m.p241k.C2206w;
import p213q.p217b.p218a.p231b.p270l.C3255i;
import p213q.p217b.p218a.p231b.p270l.C3257j;

/* renamed from: q.b.a.b.d.m.c */
public class C2148c<O extends C2137d> {

    /* renamed from: a */
    public final Context f6011a;

    /* renamed from: b */
    public final C2133a<O> f6012b;

    /* renamed from: c */
    public final O f6013c;

    /* renamed from: d */
    public final C2162b<O> f6014d;

    /* renamed from: e */
    public final int f6015e;

    /* renamed from: f */
    public final C2160a f6016f;

    /* renamed from: g */
    public final C2169e f6017g;

    /* renamed from: q.b.a.b.d.m.c$a */
    public static class C2149a {

        /* renamed from: c */
        public static final C2149a f6018c = new C2149a(new C2160a(), null, Looper.getMainLooper());

        /* renamed from: a */
        public final C2160a f6019a;

        /* renamed from: b */
        public final Looper f6020b;

        public /* synthetic */ C2149a(C2160a aVar, Account account, Looper looper) {
            this.f6019a = aVar;
            this.f6020b = looper;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2148c(android.content.Context r5, p213q.p217b.p218a.p231b.p239d.p240m.C2133a<O> r6, O r7, p213q.p217b.p218a.p231b.p239d.p240m.C2148c.C2149a r8) {
        /*
            r4 = this;
            r4.<init>()
            java.lang.String r0 = "Null context is not permitted."
            p124p.p126b.p127k.C1061o.m2525b(r5, r0)
            java.lang.String r0 = "Api must not be null."
            p124p.p126b.p127k.C1061o.m2525b(r6, r0)
            java.lang.String r0 = "Settings must not be null; use Settings.DEFAULT_SETTINGS instead."
            p124p.p126b.p127k.C1061o.m2525b(r8, r0)
            android.content.Context r0 = r5.getApplicationContext()
            r4.f6011a = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            r2 = 1
            r3 = 0
            if (r0 < r1) goto L_0x0022
            r0 = r2
            goto L_0x0023
        L_0x0022:
            r0 = r3
        L_0x0023:
            if (r0 != 0) goto L_0x0026
            goto L_0x0059
        L_0x0026:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L_0x0038
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            java.lang.String r1 = "REL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0038
            goto L_0x00ae
        L_0x0038:
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            int r0 = r0.length()
            if (r0 != r2) goto L_0x0056
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            char r0 = r0.charAt(r3)
            r1 = 82
            if (r0 < r1) goto L_0x0056
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            char r0 = r0.charAt(r3)
            r1 = 90
            if (r0 > r1) goto L_0x0056
            r0 = r2
            goto L_0x0057
        L_0x0056:
            r0 = r3
        L_0x0057:
            if (r0 != 0) goto L_0x005b
        L_0x0059:
            r2 = r3
            goto L_0x00ae
        L_0x005b:
            java.lang.Boolean r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.f6252a
            if (r0 == 0) goto L_0x0060
            goto L_0x00aa
        L_0x0060:
            java.lang.String r0 = "google"
            java.lang.String r1 = android.os.Build.BRAND     // Catch:{ NumberFormatException -> 0x0093 }
            boolean r0 = r0.equals(r1)     // Catch:{ NumberFormatException -> 0x0093 }
            if (r0 == 0) goto L_0x008b
            java.lang.String r0 = android.os.Build.ID     // Catch:{ NumberFormatException -> 0x0093 }
            java.lang.String r1 = "RPP1"
            boolean r0 = r0.startsWith(r1)     // Catch:{ NumberFormatException -> 0x0093 }
            if (r0 != 0) goto L_0x008b
            java.lang.String r0 = android.os.Build.ID     // Catch:{ NumberFormatException -> 0x0093 }
            java.lang.String r1 = "RPP2"
            boolean r0 = r0.startsWith(r1)     // Catch:{ NumberFormatException -> 0x0093 }
            if (r0 != 0) goto L_0x008b
            java.lang.String r0 = android.os.Build.VERSION.INCREMENTAL     // Catch:{ NumberFormatException -> 0x0093 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0093 }
            r1 = 6301457(0x602711, float:8.830222E-39)
            if (r0 < r1) goto L_0x008b
            r0 = r2
            goto L_0x008c
        L_0x008b:
            r0 = r3
        L_0x008c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0093 }
            p213q.p217b.p218a.p231b.p239d.p246q.C2286e.f6252a = r0     // Catch:{ NumberFormatException -> 0x0093 }
            goto L_0x0099
        L_0x0093:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            p213q.p217b.p218a.p231b.p239d.p246q.C2286e.f6252a = r0
        L_0x0099:
            java.lang.Boolean r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.f6252a
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00a8
            java.lang.String r0 = "PlatformVersion"
            java.lang.String r1 = "Build version must be at least 6301457 to support R in gmscore"
            android.util.Log.w(r0, r1)
        L_0x00a8:
            java.lang.Boolean r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.f6252a
        L_0x00aa:
            boolean r2 = r0.booleanValue()
        L_0x00ae:
            if (r2 == 0) goto L_0x00c2
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            java.lang.String r1 = "getAttributionTag"
            java.lang.Class[] r2 = new java.lang.Class[r3]     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x00c2 }
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x00c2 }
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x00c2 }
            java.lang.Object r5 = r0.invoke(r5, r1)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x00c2 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x00c2 }
        L_0x00c2:
            r4.f6012b = r6
            r4.f6013c = r7
            q.b.a.b.d.m.k.b r5 = new q.b.a.b.d.m.k.b
            r5.<init>(r6, r7)
            r4.f6014d = r5
            q.b.a.b.d.m.k.u r5 = new q.b.a.b.d.m.k.u
            android.content.Context r5 = r4.f6011a
            q.b.a.b.d.m.k.e r5 = p213q.p217b.p218a.p231b.p239d.p240m.p241k.C2169e.m4967a(r5)
            r4.f6017g = r5
            java.util.concurrent.atomic.AtomicInteger r5 = r5.f6050g
            int r5 = r5.getAndIncrement()
            r4.f6015e = r5
            q.b.a.b.d.m.k.a r5 = r8.f6019a
            r4.f6016f = r5
            q.b.a.b.d.m.k.e r5 = r4.f6017g
            android.os.Handler r5 = r5.f6056m
            r6 = 7
            android.os.Message r6 = r5.obtainMessage(r6, r4)
            r5.sendMessage(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p239d.p240m.C2148c.<init>(android.content.Context, q.b.a.b.d.m.a, q.b.a.b.d.m.a$d, q.b.a.b.d.m.c$a):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p213q.p217b.p218a.p231b.p239d.p242n.C2228c.C2229a mo7138a() {
        /*
            r4 = this;
            q.b.a.b.d.n.c$a r0 = new q.b.a.b.d.n.c$a
            r0.<init>()
            O r1 = r4.f6013c
            boolean r2 = r1 instanceof p213q.p217b.p218a.p231b.p239d.p240m.C2133a.C2137d.C2139b
            r3 = 0
            if (r2 == 0) goto L_0x0024
            q.b.a.b.d.m.a$d$b r1 = (p213q.p217b.p218a.p231b.p239d.p240m.C2133a.C2137d.C2139b) r1
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = r1.mo7123b()
            if (r1 == 0) goto L_0x0024
            java.lang.String r2 = r1.f1045h
            if (r2 != 0) goto L_0x0019
            goto L_0x0030
        L_0x0019:
            android.accounts.Account r2 = new android.accounts.Account
            java.lang.String r1 = r1.f1045h
            java.lang.String r3 = "com.google"
            r2.<init>(r1, r3)
            r3 = r2
            goto L_0x0030
        L_0x0024:
            O r1 = r4.f6013c
            boolean r2 = r1 instanceof p213q.p217b.p218a.p231b.p239d.p240m.C2133a.C2137d.C2138a
            if (r2 == 0) goto L_0x0030
            q.b.a.b.d.m.a$d$a r1 = (p213q.p217b.p218a.p231b.p239d.p240m.C2133a.C2137d.C2138a) r1
            android.accounts.Account r3 = r1.mo7122a()
        L_0x0030:
            r0.f6163a = r3
            O r1 = r4.f6013c
            boolean r2 = r1 instanceof p213q.p217b.p218a.p231b.p239d.p240m.C2133a.C2137d.C2139b
            if (r2 == 0) goto L_0x0045
            q.b.a.b.d.m.a$d$b r1 = (p213q.p217b.p218a.p231b.p239d.p240m.C2133a.C2137d.C2139b) r1
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = r1.mo7123b()
            if (r1 == 0) goto L_0x0045
            java.util.Set r1 = r1.mo1510c()
            goto L_0x0049
        L_0x0045:
            java.util.Set r1 = java.util.Collections.emptySet()
        L_0x0049:
            p.e.c<com.google.android.gms.common.api.Scope> r2 = r0.f6164b
            if (r2 != 0) goto L_0x0054
            p.e.c r2 = new p.e.c
            r2.<init>()
            r0.f6164b = r2
        L_0x0054:
            p.e.c<com.google.android.gms.common.api.Scope> r2 = r0.f6164b
            r2.addAll(r1)
            android.content.Context r1 = r4.f6011a
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.f6166d = r1
            android.content.Context r1 = r4.f6011a
            java.lang.String r1 = r1.getPackageName()
            r0.f6165c = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p239d.p240m.C2148c.mo7138a():q.b.a.b.d.n.c$a");
    }

    /* renamed from: a */
    public final <TResult, A extends C2135b> C3255i<TResult> mo7139a(int i, C2190m<A, TResult> mVar) {
        C3257j jVar = new C3257j();
        C2169e eVar = this.f6017g;
        C2160a aVar = this.f6016f;
        if (eVar != null) {
            C2183i0 i0Var = new C2183i0(i, mVar, jVar, aVar);
            Handler handler = eVar.f6056m;
            handler.sendMessage(handler.obtainMessage(4, new C2206w(i0Var, eVar.f6051h.get(), this)));
            return jVar.f8128a;
        }
        throw null;
    }
}
