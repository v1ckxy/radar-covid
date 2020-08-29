package p213q.p217b.p218a.p231b.p239d.p240m.p241k;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p116io.jsonwebtoken.lang.Objects;
import p124p.p126b.p127k.C1061o;
import p124p.p143e.C1248a;
import p124p.p143e.C1251c;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p231b.p239d.C2115b;
import p213q.p217b.p218a.p231b.p239d.C2119d;
import p213q.p217b.p218a.p231b.p239d.C2121e;
import p213q.p217b.p218a.p231b.p239d.C2129i;
import p213q.p217b.p218a.p231b.p239d.p240m.C2133a;
import p213q.p217b.p218a.p231b.p239d.p240m.C2133a.C2134a;
import p213q.p217b.p218a.p231b.p239d.p240m.C2133a.C2135b;
import p213q.p217b.p218a.p231b.p239d.p240m.C2133a.C2137d;
import p213q.p217b.p218a.p231b.p239d.p240m.C2133a.C2145f;
import p213q.p217b.p218a.p231b.p239d.p240m.C2148c;
import p213q.p217b.p218a.p231b.p239d.p240m.C2150d.C2151a;
import p213q.p217b.p218a.p231b.p239d.p240m.C2150d.C2152b;
import p213q.p217b.p218a.p231b.p239d.p240m.C2159j;
import p213q.p217b.p218a.p231b.p239d.p240m.p241k.C2164c.C2165a;
import p213q.p217b.p218a.p231b.p239d.p242n.C2214b.C2217c;
import p213q.p217b.p218a.p231b.p239d.p242n.C2214b.C2219e;
import p213q.p217b.p218a.p231b.p239d.p242n.C2228c;
import p213q.p217b.p218a.p231b.p239d.p242n.C2241h;
import p213q.p217b.p218a.p231b.p239d.p242n.C2254m;
import p213q.p217b.p218a.p231b.p239d.p242n.C2269u;
import p213q.p217b.p218a.p231b.p239d.p242n.C2274z;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p218a.p231b.p251g.p253b.C2323d;
import p213q.p217b.p218a.p231b.p267j.C3217a;
import p213q.p217b.p218a.p231b.p267j.C3235f;
import p213q.p217b.p218a.p231b.p270l.C3257j;

/* renamed from: q.b.a.b.d.m.k.e */
public class C2169e implements Callback {

    /* renamed from: o */
    public static final Status f6040o = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: p */
    public static final Status f6041p = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: q */
    public static final Object f6042q = new Object();
    @GuardedBy("lock")

    /* renamed from: r */
    public static C2169e f6043r;

    /* renamed from: a */
    public long f6044a = 5000;

    /* renamed from: b */
    public long f6045b = 120000;

    /* renamed from: c */
    public long f6046c = 10000;

    /* renamed from: d */
    public final Context f6047d;

    /* renamed from: e */
    public final C2121e f6048e;

    /* renamed from: f */
    public final C2269u f6049f;

    /* renamed from: g */
    public final AtomicInteger f6050g;

    /* renamed from: h */
    public final AtomicInteger f6051h;

    /* renamed from: i */
    public final Map<C2162b<?>, C2170a<?>> f6052i;
    @GuardedBy("lock")

    /* renamed from: j */
    public C2198p0 f6053j;
    @GuardedBy("lock")

    /* renamed from: k */
    public final Set<C2162b<?>> f6054k;

    /* renamed from: l */
    public final Set<C2162b<?>> f6055l;
    @NotOnlyInitialized

    /* renamed from: m */
    public final Handler f6056m;

    /* renamed from: n */
    public volatile boolean f6057n;

    /* renamed from: q.b.a.b.d.m.k.e$a */
    public class C2170a<O extends C2137d> implements C2151a, C2152b, C2192m0 {

        /* renamed from: a */
        public final Queue<C2195o> f6058a = new LinkedList();
        @NotOnlyInitialized

        /* renamed from: b */
        public final C2145f f6059b;

        /* renamed from: c */
        public final C2135b f6060c;

        /* renamed from: d */
        public final C2162b<O> f6061d;

        /* renamed from: e */
        public final C2194n0 f6062e;

        /* renamed from: f */
        public final Set<C2185j0> f6063f = new HashSet();

        /* renamed from: g */
        public final Map<C2184j<?>, C2207x> f6064g = new HashMap();

        /* renamed from: h */
        public final int f6065h;

        /* renamed from: i */
        public final C2161a0 f6066i;

        /* renamed from: j */
        public boolean f6067j;

        /* renamed from: k */
        public final List<C2172c> f6068k = new ArrayList();

        /* renamed from: l */
        public C2115b f6069l = null;

        public C2170a(C2148c<O> cVar) {
            Looper looper = C2169e.this.f6056m.getLooper();
            C2228c a = cVar.mo7138a().mo7263a();
            C2133a<O> aVar = cVar.f6012b;
            C1061o.m2534b(aVar.f6008a != null, (Object) "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
            C2134a<?, O> aVar2 = aVar.f6008a;
            C1061o.m2524b(aVar2);
            C2145f a2 = aVar2.mo7120a(cVar.f6011a, looper, a, cVar.f6013c, (C2151a) this, (C2152b) this);
            this.f6059b = a2;
            if (!(a2 instanceof C2274z)) {
                this.f6060c = a2;
                this.f6061d = cVar.f6014d;
                this.f6062e = new C2194n0();
                this.f6065h = cVar.f6015e;
                if (this.f6059b.mo7137j()) {
                    this.f6066i = new C2161a0(C2169e.this.f6047d, C2169e.this.f6056m, cVar.mo7138a().mo7263a());
                } else {
                    this.f6066i = null;
                }
            } else {
                C2274z zVar = (C2274z) a2;
                throw new NoSuchMethodError();
            }
        }

        /* renamed from: a */
        public final void mo7144a(int i) {
            if (Looper.myLooper() == C2169e.this.f6056m.getLooper()) {
                mo7175b(i);
            } else {
                C2169e.this.f6056m.post(new C2201r(this, i));
            }
        }

        /* renamed from: a */
        public final void mo7145a(C2115b bVar) {
            mo7171a(bVar, null);
        }

        /* renamed from: b */
        public final void mo7147b(Bundle bundle) {
            if (Looper.myLooper() == C2169e.this.f6056m.getLooper()) {
                mo7183e();
            } else {
                C2169e.this.f6056m.post(new C2199q(this));
            }
        }

        /* renamed from: c */
        public final void mo7179c(C2115b bVar) {
            Iterator it = this.f6063f.iterator();
            if (it.hasNext()) {
                C2185j0 j0Var = (C2185j0) it.next();
                if (C1061o.m2546c((Object) bVar, (Object) C2115b.f5974i)) {
                    this.f6059b.mo7134g();
                }
                throw null;
            }
            this.f6063f.clear();
        }

        /* renamed from: c */
        public final void mo7180c(C2195o oVar) {
            oVar.mo7197a(this.f6062e, mo7182d());
            try {
                oVar.mo7201a(this);
            } catch (DeadObjectException unused) {
                mo7144a(1);
                this.f6059b.mo7124a("DeadObjectException thrown while running ApiCallRunner.");
            } catch (Throwable th) {
                throw new IllegalStateException(String.format("Error in GoogleApi implementation for client %s.", new Object[]{this.f6060c.getClass().getName()}), th);
            }
        }

        /* renamed from: d */
        public final Status mo7181d(C2115b bVar) {
            String str = this.f6061d.f6031b.f6009b;
            String valueOf = String.valueOf(bVar);
            StringBuilder sb = new StringBuilder(valueOf.length() + C1965a.m4743a(str, 63));
            sb.append("API: ");
            sb.append(str);
            sb.append(" is not available on this device. Connection failed with: ");
            sb.append(valueOf);
            return new Status(17, sb.toString());
        }

        /* renamed from: d */
        public final boolean mo7182d() {
            return this.f6059b.mo7137j();
        }

        /* renamed from: e */
        public final void mo7183e() {
            mo7174b();
            mo7179c(C2115b.f5974i);
            mo7185g();
            Iterator it = this.f6064g.values().iterator();
            if (!it.hasNext()) {
                mo7184f();
                mo7186h();
                return;
            }
            C2207x xVar = (C2207x) it.next();
            throw null;
        }

        /* renamed from: f */
        public final void mo7184f() {
            ArrayList arrayList = new ArrayList(this.f6058a);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                C2195o oVar = (C2195o) obj;
                if (!this.f6059b.mo7128a()) {
                    return;
                }
                if (mo7177b(oVar)) {
                    this.f6058a.remove(oVar);
                }
            }
        }

        /* renamed from: g */
        public final void mo7185g() {
            if (this.f6067j) {
                C2169e.this.f6056m.removeMessages(11, this.f6061d);
                C2169e.this.f6056m.removeMessages(9, this.f6061d);
                this.f6067j = false;
            }
        }

        /* renamed from: h */
        public final void mo7186h() {
            C2169e.this.f6056m.removeMessages(12, this.f6061d);
            Handler handler = C2169e.this.f6056m;
            handler.sendMessageDelayed(handler.obtainMessage(12, this.f6061d), C2169e.this.f6046c);
        }

        /* renamed from: c */
        public final void mo7178c() {
            C2115b bVar;
            C1061o.m2479a(C2169e.this.f6056m);
            if (!this.f6059b.mo7128a() && !this.f6059b.mo7132e()) {
                try {
                    int a = C2169e.this.f6049f.mo7289a(C2169e.this.f6047d, this.f6059b);
                    if (a != 0) {
                        C2115b bVar2 = new C2115b(a, null);
                        String name = this.f6060c.getClass().getName();
                        String valueOf = String.valueOf(bVar2);
                        StringBuilder sb = new StringBuilder(name.length() + 35 + valueOf.length());
                        sb.append("The service for ");
                        sb.append(name);
                        sb.append(" is not available: ");
                        sb.append(valueOf);
                        Log.w("GoogleApiManager", sb.toString());
                        mo7171a(bVar2, null);
                        return;
                    }
                    C2171b bVar3 = new C2171b(this.f6059b, this.f6061d);
                    if (this.f6059b.mo7137j()) {
                        C2161a0 a0Var = this.f6066i;
                        C1061o.m2524b(a0Var);
                        C2161a0 a0Var2 = a0Var;
                        C3235f fVar = a0Var2.f6028f;
                        if (fVar != null) {
                            fVar.mo7136i();
                        }
                        a0Var2.f6027e.f6162h = Integer.valueOf(System.identityHashCode(a0Var2));
                        C2134a<? extends C3235f, C3217a> aVar = a0Var2.f6025c;
                        Context context = a0Var2.f6023a;
                        Looper looper = a0Var2.f6024b.getLooper();
                        C2228c cVar = a0Var2.f6027e;
                        a0Var2.f6028f = (C3235f) aVar.mo7120a(context, looper, cVar, cVar.f6161g, (C2151a) a0Var2, (C2152b) a0Var2);
                        a0Var2.f6029g = bVar3;
                        Set<Scope> set = a0Var2.f6026d;
                        if (set == null || set.isEmpty()) {
                            a0Var2.f6024b.post(new C2209z(a0Var2));
                        } else {
                            a0Var2.f6028f.mo8895k();
                        }
                    }
                    try {
                        this.f6059b.mo7125a((C2217c) bVar3);
                    } catch (SecurityException e) {
                        e = e;
                        bVar = new C2115b(10);
                        mo7171a(bVar, e);
                    }
                } catch (IllegalStateException e2) {
                    e = e2;
                    bVar = new C2115b(10);
                    mo7171a(bVar, e);
                }
            }
        }

        /* renamed from: a */
        public final C2119d mo7167a(C2119d[] dVarArr) {
            if (!(dVarArr == null || dVarArr.length == 0)) {
                C2119d[] f = this.f6059b.mo7133f();
                if (f == null) {
                    f = new C2119d[0];
                }
                C1248a aVar = new C1248a(f.length);
                for (C2119d dVar : f) {
                    aVar.put(dVar.f5985e, Long.valueOf(dVar.mo7103c()));
                }
                for (C2119d dVar2 : dVarArr) {
                    Long l = (Long) aVar.get(dVar2.f5985e);
                    if (l == null || l.longValue() < dVar2.mo7103c()) {
                        return dVar2;
                    }
                }
            }
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x007b A[LOOP:0: B:12:0x0075->B:14:0x007b, LOOP_END] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo7175b(int r6) {
            /*
                r5 = this;
                r5.mo7174b()
                r0 = 1
                r5.f6067j = r0
                q.b.a.b.d.m.k.n0 r1 = r5.f6062e
                q.b.a.b.d.m.a$f r2 = r5.f6059b
                java.lang.String r2 = r2.mo7135h()
                if (r1 == 0) goto L_0x0088
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r4 = "The connection to Google Play services was lost"
                r3.<init>(r4)
                if (r6 != r0) goto L_0x001c
                java.lang.String r6 = " due to service disconnection."
                goto L_0x0021
            L_0x001c:
                r4 = 3
                if (r6 != r4) goto L_0x0024
                java.lang.String r6 = " due to dead object exception."
            L_0x0021:
                r3.append(r6)
            L_0x0024:
                if (r2 == 0) goto L_0x002e
                java.lang.String r6 = " Last reason for disconnect: "
                r3.append(r6)
                r3.append(r2)
            L_0x002e:
                com.google.android.gms.common.api.Status r6 = new com.google.android.gms.common.api.Status
                r2 = 20
                java.lang.String r3 = r3.toString()
                r6.<init>(r2, r3)
                r1.mo7207a(r0, r6)
                q.b.a.b.d.m.k.e r6 = p213q.p217b.p218a.p231b.p239d.p240m.p241k.C2169e.this
                android.os.Handler r6 = r6.f6056m
                r0 = 9
                q.b.a.b.d.m.k.b<O> r1 = r5.f6061d
                android.os.Message r0 = android.os.Message.obtain(r6, r0, r1)
                q.b.a.b.d.m.k.e r1 = p213q.p217b.p218a.p231b.p239d.p240m.p241k.C2169e.this
                long r1 = r1.f6044a
                r6.sendMessageDelayed(r0, r1)
                q.b.a.b.d.m.k.e r6 = p213q.p217b.p218a.p231b.p239d.p240m.p241k.C2169e.this
                android.os.Handler r6 = r6.f6056m
                r0 = 11
                q.b.a.b.d.m.k.b<O> r1 = r5.f6061d
                android.os.Message r0 = android.os.Message.obtain(r6, r0, r1)
                q.b.a.b.d.m.k.e r1 = p213q.p217b.p218a.p231b.p239d.p240m.p241k.C2169e.this
                long r1 = r1.f6045b
                r6.sendMessageDelayed(r0, r1)
                q.b.a.b.d.m.k.e r6 = p213q.p217b.p218a.p231b.p239d.p240m.p241k.C2169e.this
                q.b.a.b.d.n.u r6 = r6.f6049f
                android.util.SparseIntArray r6 = r6.f6230a
                r6.clear()
                java.util.Map<q.b.a.b.d.m.k.j<?>, q.b.a.b.d.m.k.x> r6 = r5.f6064g
                java.util.Collection r6 = r6.values()
                java.util.Iterator r6 = r6.iterator()
            L_0x0075:
                boolean r0 = r6.hasNext()
                if (r0 == 0) goto L_0x0087
                java.lang.Object r0 = r6.next()
                q.b.a.b.d.m.k.x r0 = (p213q.p217b.p218a.p231b.p239d.p240m.p241k.C2207x) r0
                java.lang.Runnable r0 = r0.f6111a
                r0.run()
                goto L_0x0075
            L_0x0087:
                return
            L_0x0088:
                r6 = 0
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p239d.p240m.p241k.C2169e.C2170a.mo7175b(int):void");
        }

        /* renamed from: a */
        public final void mo7168a() {
            C1061o.m2479a(C2169e.this.f6056m);
            mo7169a(C2169e.f6040o);
            C2194n0 n0Var = this.f6062e;
            if (n0Var != null) {
                n0Var.mo7207a(false, C2169e.f6040o);
                for (C2184j h0Var : (C2184j[]) this.f6064g.keySet().toArray(new C2184j[0])) {
                    mo7172a((C2195o) new C2181h0(h0Var, new C3257j()));
                }
                mo7179c(new C2115b(4));
                if (this.f6059b.mo7128a()) {
                    this.f6059b.mo7126a((C2219e) new C2203t(this));
                    return;
                }
                return;
            }
            throw null;
        }

        /* renamed from: a */
        public final void mo7171a(C2115b bVar, Exception exc) {
            C1061o.m2479a(C2169e.this.f6056m);
            C2161a0 a0Var = this.f6066i;
            if (a0Var != null) {
                C3235f fVar = a0Var.f6028f;
                if (fVar != null) {
                    fVar.mo7136i();
                }
            }
            mo7174b();
            C2169e.this.f6049f.f6230a.clear();
            mo7179c(bVar);
            if (bVar.f5976f == 4) {
                mo7169a(C2169e.f6041p);
            } else if (this.f6058a.isEmpty()) {
                this.f6069l = bVar;
            } else if (exc != null) {
                C1061o.m2479a(C2169e.this.f6056m);
                mo7170a(null, exc, false);
            } else if (!C2169e.this.f6057n) {
                Status d = mo7181d(bVar);
                C1061o.m2479a(C2169e.this.f6056m);
                mo7170a(d, null, false);
            } else {
                mo7170a(mo7181d(bVar), null, true);
                if (!this.f6058a.isEmpty()) {
                    mo7176b(bVar);
                    if (!C2169e.this.mo7165a(bVar, this.f6065h)) {
                        if (bVar.f5976f == 18) {
                            this.f6067j = true;
                        }
                        if (this.f6067j) {
                            Handler handler = C2169e.this.f6056m;
                            handler.sendMessageDelayed(Message.obtain(handler, 9, this.f6061d), C2169e.this.f6044a);
                            return;
                        }
                        Status d2 = mo7181d(bVar);
                        C1061o.m2479a(C2169e.this.f6056m);
                        mo7170a(d2, null, false);
                    }
                }
            }
        }

        /* renamed from: b */
        public final boolean mo7176b(C2115b bVar) {
            synchronized (C2169e.f6042q) {
            }
            return false;
        }

        /* renamed from: b */
        public final boolean mo7177b(C2195o oVar) {
            if (!(oVar instanceof C2179g0)) {
                mo7180c(oVar);
                return true;
            }
            C2179g0 g0Var = (C2179g0) oVar;
            C2119d a = mo7167a(g0Var.mo7195b(this));
            if (a == null) {
                mo7180c(oVar);
                return true;
            }
            String name = this.f6060c.getClass().getName();
            String str = a.f5985e;
            long c = a.mo7103c();
            StringBuilder sb = new StringBuilder(C1965a.m4743a(str, name.length() + 77));
            sb.append(name);
            sb.append(" could not execute call because it requires feature (");
            sb.append(str);
            sb.append(Objects.ARRAY_ELEMENT_SEPARATOR);
            sb.append(c);
            sb.append(").");
            Log.w("GoogleApiManager", sb.toString());
            if (!C2169e.this.f6057n || !g0Var.mo7196c(this)) {
                g0Var.mo7200a((Exception) new C2159j(a));
                return true;
            }
            C2172c cVar = new C2172c(this.f6061d, a, null);
            int indexOf = this.f6068k.indexOf(cVar);
            if (indexOf >= 0) {
                C2172c cVar2 = (C2172c) this.f6068k.get(indexOf);
                C2169e.this.f6056m.removeMessages(15, cVar2);
                Handler handler = C2169e.this.f6056m;
                handler.sendMessageDelayed(Message.obtain(handler, 15, cVar2), C2169e.this.f6044a);
            } else {
                this.f6068k.add(cVar);
                Handler handler2 = C2169e.this.f6056m;
                handler2.sendMessageDelayed(Message.obtain(handler2, 15, cVar), C2169e.this.f6044a);
                Handler handler3 = C2169e.this.f6056m;
                handler3.sendMessageDelayed(Message.obtain(handler3, 16, cVar), C2169e.this.f6045b);
                C2115b bVar = new C2115b(2, null);
                mo7176b(bVar);
                C2169e.this.mo7165a(bVar, this.f6065h);
            }
            return false;
        }

        /* renamed from: b */
        public final void mo7174b() {
            C1061o.m2479a(C2169e.this.f6056m);
            this.f6069l = null;
        }

        /* renamed from: a */
        public final void mo7169a(Status status) {
            C1061o.m2479a(C2169e.this.f6056m);
            mo7170a(status, null, false);
        }

        /* renamed from: a */
        public final void mo7170a(Status status, Exception exc, boolean z) {
            C1061o.m2479a(C2169e.this.f6056m);
            boolean z2 = true;
            boolean z3 = status == null;
            if (exc != null) {
                z2 = false;
            }
            if (z3 != z2) {
                Iterator it = this.f6058a.iterator();
                while (it.hasNext()) {
                    C2195o oVar = (C2195o) it.next();
                    if (!z || oVar.f6097a == 2) {
                        if (status != null) {
                            oVar.mo7199a(status);
                        } else {
                            oVar.mo7200a(exc);
                        }
                        it.remove();
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Status XOR exception should be null");
        }

        /* renamed from: a */
        public final void mo7172a(C2195o oVar) {
            C1061o.m2479a(C2169e.this.f6056m);
            if (!this.f6059b.mo7128a()) {
                this.f6058a.add(oVar);
                C2115b bVar = this.f6069l;
                if (bVar != null) {
                    if ((bVar.f5976f == 0 || bVar.f5977g == null) ? false : true) {
                        mo7171a(this.f6069l, null);
                        return;
                    }
                }
                mo7178c();
            } else if (mo7177b(oVar)) {
                mo7186h();
            } else {
                this.f6058a.add(oVar);
            }
        }

        /* renamed from: a */
        public final boolean mo7173a(boolean z) {
            C1061o.m2479a(C2169e.this.f6056m);
            if (!this.f6059b.mo7128a() || this.f6064g.size() != 0) {
                return false;
            }
            C2194n0 n0Var = this.f6062e;
            if (!n0Var.f6095a.isEmpty() || !n0Var.f6096b.isEmpty()) {
                if (z) {
                    mo7186h();
                }
                return false;
            }
            this.f6059b.mo7124a("Timing out service connection.");
            return true;
        }
    }

    /* renamed from: q.b.a.b.d.m.k.e$b */
    public class C2171b implements C2163b0, C2217c {

        /* renamed from: a */
        public final C2145f f6071a;

        /* renamed from: b */
        public final C2162b<?> f6072b;

        /* renamed from: c */
        public C2241h f6073c = null;

        /* renamed from: d */
        public Set<Scope> f6074d = null;

        /* renamed from: e */
        public boolean f6075e = false;

        public C2171b(C2145f fVar, C2162b<?> bVar) {
            this.f6071a = fVar;
            this.f6072b = bVar;
        }

        /* renamed from: a */
        public final void mo7187a(C2115b bVar) {
            C2169e.this.f6056m.post(new C2205v(this, bVar));
        }

        /* renamed from: b */
        public final void mo7188b(C2115b bVar) {
            C2170a aVar = (C2170a) C2169e.this.f6052i.get(this.f6072b);
            if (aVar != null) {
                C1061o.m2479a(C2169e.this.f6056m);
                C2145f fVar = aVar.f6059b;
                String name = aVar.f6060c.getClass().getName();
                String valueOf = String.valueOf(bVar);
                StringBuilder sb = new StringBuilder(valueOf.length() + name.length() + 25);
                sb.append("onSignInFailed for ");
                sb.append(name);
                sb.append(" with ");
                sb.append(valueOf);
                fVar.mo7124a(sb.toString());
                aVar.mo7171a(bVar, null);
            }
        }
    }

    /* renamed from: q.b.a.b.d.m.k.e$c */
    public static class C2172c {

        /* renamed from: a */
        public final C2162b<?> f6077a;

        /* renamed from: b */
        public final C2119d f6078b;

        public /* synthetic */ C2172c(C2162b bVar, C2119d dVar, C2197p pVar) {
            this.f6077a = bVar;
            this.f6078b = dVar;
        }

        public final boolean equals(Object obj) {
            if (obj != null && (obj instanceof C2172c)) {
                C2172c cVar = (C2172c) obj;
                if (C1061o.m2546c((Object) this.f6077a, (Object) cVar.f6077a) && C1061o.m2546c((Object) this.f6078b, (Object) cVar.f6078b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f6077a, this.f6078b});
        }

        public final String toString() {
            C2254m d = C1061o.m2550d((Object) this);
            d.mo7283a("key", this.f6077a);
            d.mo7283a("feature", this.f6078b);
            return d.toString();
        }
    }

    public C2169e(Context context, Looper looper, C2121e eVar) {
        boolean z = true;
        this.f6050g = new AtomicInteger(1);
        this.f6051h = new AtomicInteger(0);
        this.f6052i = new ConcurrentHashMap(5, 0.75f, 1);
        this.f6053j = null;
        this.f6054k = new C1251c();
        this.f6055l = new C1251c();
        this.f6057n = true;
        this.f6047d = context;
        this.f6056m = new C2323d(looper, this);
        this.f6048e = eVar;
        this.f6049f = new C2269u(eVar);
        PackageManager packageManager = context.getPackageManager();
        if (C1061o.f2799m == null) {
            if (!C2286e.m5333e() || !packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z = false;
            }
            C1061o.f2799m = Boolean.valueOf(z);
        }
        if (C1061o.f2799m.booleanValue()) {
            this.f6057n = false;
        }
        Handler handler = this.f6056m;
        handler.sendMessage(handler.obtainMessage(6));
    }

    /* renamed from: a */
    public static C2169e m4967a(Context context) {
        C2169e eVar;
        synchronized (f6042q) {
            if (f6043r == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                f6043r = new C2169e(context.getApplicationContext(), handlerThread.getLooper(), C2121e.f5993d);
            }
            eVar = f6043r;
        }
        return eVar;
    }

    public boolean handleMessage(Message message) {
        C2170a aVar;
        int i = message.what;
        long j = 300000;
        String str = "GoogleApiManager";
        int i2 = 0;
        switch (i) {
            case 1:
                if (((Boolean) message.obj).booleanValue()) {
                    j = 10000;
                }
                this.f6046c = j;
                this.f6056m.removeMessages(12);
                for (C2162b bVar : this.f6052i.keySet()) {
                    Handler handler = this.f6056m;
                    handler.sendMessageDelayed(handler.obtainMessage(12, bVar), this.f6046c);
                }
                break;
            case 2:
                C2185j0 j0Var = (C2185j0) message.obj;
                throw null;
            case 3:
                for (C2170a aVar2 : this.f6052i.values()) {
                    aVar2.mo7174b();
                    aVar2.mo7178c();
                }
                break;
            case 4:
            case 8:
            case 13:
                C2206w wVar = (C2206w) message.obj;
                C2170a aVar3 = (C2170a) this.f6052i.get(wVar.f6110c.f6014d);
                if (aVar3 == null) {
                    aVar3 = mo7164a(wVar.f6110c);
                }
                if (aVar3.mo7182d() && this.f6051h.get() != wVar.f6109b) {
                    wVar.f6108a.mo7199a(f6040o);
                    aVar3.mo7168a();
                    break;
                } else {
                    aVar3.mo7172a(wVar.f6108a);
                    break;
                }
                break;
            case 5:
                int i3 = message.arg1;
                C2115b bVar2 = (C2115b) message.obj;
                Iterator it = this.f6052i.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        aVar = (C2170a) it.next();
                        if (aVar.f6065h == i3) {
                        }
                    } else {
                        aVar = null;
                    }
                }
                if (aVar == null) {
                    StringBuilder sb = new StringBuilder(76);
                    sb.append("Could not find API instance ");
                    sb.append(i3);
                    sb.append(" while trying to fail enqueued calls.");
                    Log.wtf(str, sb.toString(), new Exception());
                    break;
                } else {
                    C2121e eVar = this.f6048e;
                    int i4 = bVar2.f5976f;
                    if (eVar != null) {
                        String a = C2129i.m4924a(i4);
                        String str2 = bVar2.f5978h;
                        StringBuilder sb2 = new StringBuilder(C1965a.m4743a(str2, C1965a.m4743a(a, 69)));
                        sb2.append("Error resolution was canceled by the user, original error message: ");
                        sb2.append(a);
                        sb2.append(": ");
                        sb2.append(str2);
                        Status status = new Status(17, sb2.toString());
                        C1061o.m2479a(C2169e.this.f6056m);
                        aVar.mo7170a(status, null, false);
                        break;
                    } else {
                        throw null;
                    }
                }
            case 6:
                if (this.f6047d.getApplicationContext() instanceof Application) {
                    C2164c.m4961a((Application) this.f6047d.getApplicationContext());
                    C2164c.f6033i.mo7150a((C2165a) new C2197p(this));
                    C2164c cVar = C2164c.f6033i;
                    if (!cVar.f6035f.get()) {
                        RunningAppProcessInfo runningAppProcessInfo = new RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!cVar.f6035f.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            cVar.f6034e.set(true);
                        }
                    }
                    if (!cVar.f6034e.get()) {
                        this.f6046c = 300000;
                        break;
                    }
                }
                break;
            case 7:
                mo7164a((C2148c) message.obj);
                break;
            case 9:
                if (this.f6052i.containsKey(message.obj)) {
                    C2170a aVar4 = (C2170a) this.f6052i.get(message.obj);
                    C1061o.m2479a(C2169e.this.f6056m);
                    if (aVar4.f6067j) {
                        aVar4.mo7178c();
                        break;
                    }
                }
                break;
            case 10:
                for (C2162b remove : this.f6055l) {
                    C2170a aVar5 = (C2170a) this.f6052i.remove(remove);
                    if (aVar5 != null) {
                        aVar5.mo7168a();
                    }
                }
                this.f6055l.clear();
                break;
            case 11:
                if (this.f6052i.containsKey(message.obj)) {
                    C2170a aVar6 = (C2170a) this.f6052i.get(message.obj);
                    C1061o.m2479a(C2169e.this.f6056m);
                    if (aVar6.f6067j) {
                        aVar6.mo7185g();
                        C2169e eVar2 = C2169e.this;
                        Status status2 = eVar2.f6048e.mo7109a(eVar2.f6047d) == 18 ? new Status(8, "Connection timed out while waiting for Google Play services update to complete.") : new Status(8, "API failed to connect while resuming due to an unknown error.");
                        C1061o.m2479a(C2169e.this.f6056m);
                        aVar6.mo7170a(status2, null, false);
                        aVar6.f6059b.mo7124a("Timing out connection while resuming.");
                        break;
                    }
                }
                break;
            case 12:
                if (this.f6052i.containsKey(message.obj)) {
                    ((C2170a) this.f6052i.get(message.obj)).mo7173a(true);
                    break;
                }
                break;
            case 14:
                if (((C2200q0) message.obj) == null) {
                    throw null;
                } else if (!this.f6052i.containsKey(null)) {
                    throw null;
                } else {
                    ((C2170a) this.f6052i.get(null)).mo7173a(false);
                    throw null;
                }
            case 15:
                C2172c cVar2 = (C2172c) message.obj;
                if (this.f6052i.containsKey(cVar2.f6077a)) {
                    C2170a aVar7 = (C2170a) this.f6052i.get(cVar2.f6077a);
                    if (aVar7.f6068k.contains(cVar2) && !aVar7.f6067j) {
                        if (aVar7.f6059b.mo7128a()) {
                            aVar7.mo7184f();
                            break;
                        } else {
                            aVar7.mo7178c();
                            break;
                        }
                    }
                }
                break;
            case 16:
                C2172c cVar3 = (C2172c) message.obj;
                if (this.f6052i.containsKey(cVar3.f6077a)) {
                    C2170a aVar8 = (C2170a) this.f6052i.get(cVar3.f6077a);
                    if (aVar8.f6068k.remove(cVar3)) {
                        C2169e.this.f6056m.removeMessages(15, cVar3);
                        C2169e.this.f6056m.removeMessages(16, cVar3);
                        C2119d dVar = cVar3.f6078b;
                        ArrayList arrayList = new ArrayList(aVar8.f6058a.size());
                        for (C2195o oVar : aVar8.f6058a) {
                            if (oVar instanceof C2179g0) {
                                C2119d[] b = ((C2179g0) oVar).mo7195b(aVar8);
                                if (b != null) {
                                    int length = b.length;
                                    int i5 = 0;
                                    while (true) {
                                        if (i5 >= length) {
                                            i5 = -1;
                                        } else if (!C1061o.m2546c((Object) b[i5], (Object) dVar)) {
                                            i5++;
                                        }
                                    }
                                    if (i5 >= 0) {
                                        arrayList.add(oVar);
                                    }
                                }
                            }
                        }
                        int size = arrayList.size();
                        while (i2 < size) {
                            Object obj = arrayList.get(i2);
                            i2++;
                            C2195o oVar2 = (C2195o) obj;
                            aVar8.f6058a.remove(oVar2);
                            oVar2.mo7200a((Exception) new C2159j(dVar));
                        }
                        break;
                    }
                }
                break;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i);
                Log.w(str, sb3.toString());
                return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo7165a(C2115b bVar, int i) {
        C2121e eVar = this.f6048e;
        Context context = this.f6047d;
        PendingIntent pendingIntent = null;
        if (eVar != null) {
            if ((bVar.f5976f == 0 || bVar.f5977g == null) ? false : true) {
                pendingIntent = bVar.f5977g;
            } else {
                Intent a = eVar.mo7111a(context, bVar.f5976f, null);
                if (a != null) {
                    pendingIntent = PendingIntent.getActivity(context, 0, a, 134217728);
                }
            }
            if (pendingIntent == null) {
                return false;
            }
            eVar.mo7113a(context, bVar.f5976f, GoogleApiActivity.m880a(context, pendingIntent, i));
            return true;
        }
        throw null;
    }

    /* renamed from: a */
    public final C2170a<?> mo7164a(C2148c<?> cVar) {
        C2162b<O> bVar = cVar.f6014d;
        C2170a<?> aVar = (C2170a) this.f6052i.get(bVar);
        if (aVar == null) {
            aVar = new C2170a<>(cVar);
            this.f6052i.put(bVar, aVar);
        }
        if (aVar.mo7182d()) {
            this.f6055l.add(bVar);
        }
        aVar.mo7178c();
        return aVar;
    }
}
