package p213q.p217b.p218a.p231b.p251g.p256e;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;

/* renamed from: q.b.a.b.g.e.y1 */
public abstract class C2758y1<T> {

    /* renamed from: g */
    public static final Object f6978g = new Object();
    @Nullable

    /* renamed from: h */
    public static volatile C2469h2 f6979h;

    /* renamed from: i */
    public static C2559m2 f6980i = new C2559m2(C2342a2.f6302a);

    /* renamed from: j */
    public static final AtomicInteger f6981j = new AtomicInteger();

    /* renamed from: a */
    public final C2486i2 f6982a;

    /* renamed from: b */
    public final String f6983b;

    /* renamed from: c */
    public final T f6984c;

    /* renamed from: d */
    public volatile int f6985d = -1;

    /* renamed from: e */
    public volatile T f6986e;

    /* renamed from: f */
    public final boolean f6987f;

    static {
        new AtomicReference();
    }

    public /* synthetic */ C2758y1(C2486i2 i2Var, String str, Object obj, boolean z, C2414e2 e2Var) {
        if (i2Var.f6611a != null) {
            this.f6982a = i2Var;
            this.f6983b = str;
            this.f6984c = obj;
            this.f6987f = z;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    /* renamed from: a */
    public static /* synthetic */ C2758y1 m6557a(C2486i2 i2Var, String str) {
        return new C2449g2(i2Var, str, Double.valueOf(-3.0d), true);
    }

    /* renamed from: a */
    public abstract T mo7495a(Object obj);

    /* renamed from: a */
    public final String mo8111a() {
        return mo8112a(this.f6982a.f6613c);
    }

    /* renamed from: a */
    public final String mo8112a(String str) {
        if (str != null && str.isEmpty()) {
            return this.f6983b;
        }
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf(this.f6983b);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x012c  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T mo8113b() {
        /*
            r7 = this;
            boolean r0 = r7.f6987f
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x004d
            q.b.a.b.g.e.m2 r0 = f6980i
            java.lang.String r4 = r7.f6983b
            if (r0 == 0) goto L_0x004c
            if (r4 == 0) goto L_0x0044
            boolean r0 = r0.f6714a
            if (r0 != 0) goto L_0x0014
            goto L_0x003a
        L_0x0014:
            q.b.a.b.g.e.s2<q.b.a.b.g.e.v3<java.lang.String, java.lang.String>> r0 = p213q.p217b.p218a.p231b.p251g.p256e.C2594o2.f6758a
            java.lang.Object r0 = r0.mo7405a()
            q.b.a.b.g.e.q3 r0 = (p213q.p217b.p218a.p231b.p251g.p256e.C2631q3) r0
            if (r0 == 0) goto L_0x0043
            q.b.a.b.g.e.o3<K, ? extends q.b.a.b.g.e.l3<V>> r0 = r0.f6814e
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x0028:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x003c
            java.lang.Object r5 = r0.next()
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.contains(r4)
            if (r5 == 0) goto L_0x0028
        L_0x003a:
            r0 = r2
            goto L_0x003d
        L_0x003c:
            r0 = r1
        L_0x003d:
            java.lang.String r4 = "Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error."
            p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5252a(r0, r4)
            goto L_0x004d
        L_0x0043:
            throw r3
        L_0x0044:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "flagName must not be null"
            r0.<init>(r1)
            throw r0
        L_0x004c:
            throw r3
        L_0x004d:
            java.util.concurrent.atomic.AtomicInteger r0 = f6981j
            int r0 = r0.get()
            int r4 = r7.f6985d
            if (r4 >= r0) goto L_0x0180
            monitor-enter(r7)
            int r4 = r7.f6985d     // Catch:{ all -> 0x017d }
            if (r4 >= r0) goto L_0x017b
            q.b.a.b.g.e.h2 r4 = f6979h     // Catch:{ all -> 0x017d }
            if (r4 == 0) goto L_0x0062
            r5 = r2
            goto L_0x0063
        L_0x0062:
            r5 = r1
        L_0x0063:
            java.lang.String r6 = "Must call PhenotypeFlag.init() first"
            p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5252a(r5, r6)     // Catch:{ all -> 0x017d }
            r5 = r4
            q.b.a.b.g.e.o1 r5 = (p213q.p217b.p218a.p231b.p251g.p256e.C2593o1) r5     // Catch:{ all -> 0x017d }
            android.content.Context r5 = r5.f6756a     // Catch:{ all -> 0x017d }
            q.b.a.b.g.e.u1 r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2694u1.m6457a(r5)     // Catch:{ all -> 0x017d }
            java.lang.String r6 = "gms:phenotype:phenotype_flag:debug_bypass_phenotype"
            java.lang.Object r5 = r5.mo7817a(r6)     // Catch:{ all -> 0x017d }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x017d }
            if (r5 == 0) goto L_0x0088
            java.util.regex.Pattern r6 = p213q.p217b.p218a.p231b.p251g.p256e.C2524k1.f6664c     // Catch:{ all -> 0x017d }
            java.util.regex.Matcher r5 = r6.matcher(r5)     // Catch:{ all -> 0x017d }
            boolean r5 = r5.matches()     // Catch:{ all -> 0x017d }
            if (r5 == 0) goto L_0x0088
            r1 = r2
        L_0x0088:
            if (r1 != 0) goto L_0x00cd
            q.b.a.b.g.e.i2 r1 = r7.f6982a     // Catch:{ all -> 0x017d }
            android.net.Uri r1 = r1.f6611a     // Catch:{ all -> 0x017d }
            if (r1 == 0) goto L_0x00b3
            r1 = r4
            q.b.a.b.g.e.o1 r1 = (p213q.p217b.p218a.p231b.p251g.p256e.C2593o1) r1     // Catch:{ all -> 0x017d }
            android.content.Context r1 = r1.f6756a     // Catch:{ all -> 0x017d }
            q.b.a.b.g.e.i2 r2 = r7.f6982a     // Catch:{ all -> 0x017d }
            android.net.Uri r2 = r2.f6611a     // Catch:{ all -> 0x017d }
            boolean r1 = p213q.p217b.p218a.p231b.p251g.p256e.C2742x1.m6525a(r1, r2)     // Catch:{ all -> 0x017d }
            if (r1 == 0) goto L_0x00b1
            r1 = r4
            q.b.a.b.g.e.o1 r1 = (p213q.p217b.p218a.p231b.p251g.p256e.C2593o1) r1     // Catch:{ all -> 0x017d }
            android.content.Context r1 = r1.f6756a     // Catch:{ all -> 0x017d }
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ all -> 0x017d }
            q.b.a.b.g.e.i2 r2 = r7.f6982a     // Catch:{ all -> 0x017d }
            android.net.Uri r2 = r2.f6611a     // Catch:{ all -> 0x017d }
            q.b.a.b.g.e.n1 r1 = p213q.p217b.p218a.p231b.p251g.p256e.C2576n1.m6167a(r1, r2)     // Catch:{ all -> 0x017d }
            goto L_0x00bc
        L_0x00b1:
            r1 = r3
            goto L_0x00bc
        L_0x00b3:
            r1 = r4
            q.b.a.b.g.e.o1 r1 = (p213q.p217b.p218a.p231b.p251g.p256e.C2593o1) r1     // Catch:{ all -> 0x017d }
            android.content.Context r1 = r1.f6756a     // Catch:{ all -> 0x017d }
            q.b.a.b.g.e.k2 r1 = p213q.p217b.p218a.p231b.p251g.p256e.C2525k2.m6067a(r1, r3)     // Catch:{ all -> 0x017d }
        L_0x00bc:
            if (r1 == 0) goto L_0x00f6
            java.lang.String r2 = r7.mo8111a()     // Catch:{ all -> 0x017d }
            java.lang.Object r1 = r1.mo7817a(r2)     // Catch:{ all -> 0x017d }
            if (r1 == 0) goto L_0x00f6
            java.lang.Object r1 = r7.mo7495a(r1)     // Catch:{ all -> 0x017d }
            goto L_0x00f7
        L_0x00cd:
            java.lang.String r1 = "PhenotypeFlag"
            r2 = 3
            boolean r1 = android.util.Log.isLoggable(r1, r2)     // Catch:{ all -> 0x017d }
            if (r1 == 0) goto L_0x00f6
            java.lang.String r1 = "PhenotypeFlag"
            java.lang.String r2 = "Bypass reading Phenotype values for flag: "
            java.lang.String r5 = r7.mo8111a()     // Catch:{ all -> 0x017d }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x017d }
            int r6 = r5.length()     // Catch:{ all -> 0x017d }
            if (r6 == 0) goto L_0x00ed
            java.lang.String r2 = r2.concat(r5)     // Catch:{ all -> 0x017d }
            goto L_0x00f3
        L_0x00ed:
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x017d }
            r5.<init>(r2)     // Catch:{ all -> 0x017d }
            r2 = r5
        L_0x00f3:
            android.util.Log.d(r1, r2)     // Catch:{ all -> 0x017d }
        L_0x00f6:
            r1 = r3
        L_0x00f7:
            if (r1 == 0) goto L_0x00fa
            goto L_0x011c
        L_0x00fa:
            r1 = r4
            q.b.a.b.g.e.o1 r1 = (p213q.p217b.p218a.p231b.p251g.p256e.C2593o1) r1     // Catch:{ all -> 0x017d }
            android.content.Context r1 = r1.f6756a     // Catch:{ all -> 0x017d }
            q.b.a.b.g.e.u1 r1 = p213q.p217b.p218a.p231b.p251g.p256e.C2694u1.m6457a(r1)     // Catch:{ all -> 0x017d }
            q.b.a.b.g.e.i2 r2 = r7.f6982a     // Catch:{ all -> 0x017d }
            java.lang.String r2 = r2.f6612b     // Catch:{ all -> 0x017d }
            java.lang.String r2 = r7.mo8112a(r2)     // Catch:{ all -> 0x017d }
            java.lang.Object r1 = r1.mo7817a(r2)     // Catch:{ all -> 0x017d }
            if (r1 == 0) goto L_0x0116
            java.lang.Object r1 = r7.mo7495a(r1)     // Catch:{ all -> 0x017d }
            goto L_0x0117
        L_0x0116:
            r1 = r3
        L_0x0117:
            if (r1 == 0) goto L_0x011a
            goto L_0x011c
        L_0x011a:
            T r1 = r7.f6984c     // Catch:{ all -> 0x017d }
        L_0x011c:
            q.b.a.b.g.e.o1 r4 = (p213q.p217b.p218a.p231b.p251g.p256e.C2593o1) r4     // Catch:{ all -> 0x017d }
            q.b.a.b.g.e.s2<q.b.a.b.g.e.q2<q.b.a.b.g.e.v1>> r2 = r4.f6757b     // Catch:{ all -> 0x017d }
            java.lang.Object r2 = r2.mo7405a()     // Catch:{ all -> 0x017d }
            q.b.a.b.g.e.q2 r2 = (p213q.p217b.p218a.p231b.p251g.p256e.C2630q2) r2     // Catch:{ all -> 0x017d }
            boolean r4 = r2.mo7933a()     // Catch:{ all -> 0x017d }
            if (r4 == 0) goto L_0x0177
            java.lang.Object r1 = r2.mo7934b()     // Catch:{ all -> 0x017d }
            q.b.a.b.g.e.v1 r1 = (p213q.p217b.p218a.p231b.p251g.p256e.C2711v1) r1     // Catch:{ all -> 0x017d }
            q.b.a.b.g.e.i2 r2 = r7.f6982a     // Catch:{ all -> 0x017d }
            android.net.Uri r2 = r2.f6611a     // Catch:{ all -> 0x017d }
            q.b.a.b.g.e.i2 r4 = r7.f6982a     // Catch:{ all -> 0x017d }
            java.lang.String r4 = r4.f6613c     // Catch:{ all -> 0x017d }
            java.lang.String r5 = r7.f6983b     // Catch:{ all -> 0x017d }
            if (r1 == 0) goto L_0x0176
            if (r2 == 0) goto L_0x016c
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x017d }
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> r1 = r1.f6929a     // Catch:{ all -> 0x017d }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x017d }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x017d }
            if (r1 != 0) goto L_0x014f
            goto L_0x016c
        L_0x014f:
            if (r4 == 0) goto L_0x0165
            java.lang.String r2 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x017d }
            int r3 = r2.length()     // Catch:{ all -> 0x017d }
            if (r3 == 0) goto L_0x0160
            java.lang.String r5 = r4.concat(r2)     // Catch:{ all -> 0x017d }
            goto L_0x0165
        L_0x0160:
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x017d }
            r5.<init>(r4)     // Catch:{ all -> 0x017d }
        L_0x0165:
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x017d }
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x017d }
        L_0x016c:
            if (r3 != 0) goto L_0x0171
            T r1 = r7.f6984c     // Catch:{ all -> 0x017d }
            goto L_0x0177
        L_0x0171:
            java.lang.Object r1 = r7.mo7495a(r3)     // Catch:{ all -> 0x017d }
            goto L_0x0177
        L_0x0176:
            throw r3     // Catch:{ all -> 0x017d }
        L_0x0177:
            r7.f6986e = r1     // Catch:{ all -> 0x017d }
            r7.f6985d = r0     // Catch:{ all -> 0x017d }
        L_0x017b:
            monitor-exit(r7)     // Catch:{ all -> 0x017d }
            goto L_0x0180
        L_0x017d:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x017d }
            throw r0
        L_0x0180:
            T r0 = r7.f6986e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p251g.p256e.C2758y1.mo8113b():java.lang.Object");
    }

    /* renamed from: a */
    public static /* synthetic */ C2758y1 m6558a(C2486i2 i2Var, String str, long j) {
        return new C2414e2(i2Var, str, Long.valueOf(j), true);
    }

    /* renamed from: a */
    public static /* synthetic */ C2758y1 m6559a(C2486i2 i2Var, String str, String str2) {
        return new C2432f2(i2Var, str, str2, true);
    }

    /* renamed from: a */
    public static /* synthetic */ C2758y1 m6560a(C2486i2 i2Var, String str, boolean z) {
        return new C2397d2(i2Var, str, Boolean.valueOf(z), true);
    }

    @Deprecated
    /* renamed from: a */
    public static void m6561a(Context context) {
        synchronized (f6978g) {
            C2469h2 h2Var = f6979h;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (h2Var == null || ((C2593o1) h2Var).f6756a != context) {
                C2576n1.m6168c();
                C2525k2.m6068b();
                C2694u1.m6458a();
                f6979h = new C2593o1(context, C2286e.m5208a((C2663s2<T>) new C2359b2<T>(context)));
                f6981j.incrementAndGet();
            }
        }
    }
}
