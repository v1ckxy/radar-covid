package p213q.p217b.p218a.p231b.p259h.p261b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.C2115b;
import p213q.p217b.p218a.p231b.p239d.p242n.C2214b.C2215a;
import p213q.p217b.p218a.p231b.p239d.p242n.C2214b.C2216b;
import p213q.p217b.p218a.p231b.p239d.p245p.C2277a;

/* renamed from: q.b.a.b.h.b.o8 */
public final class C3067o8 implements ServiceConnection, C2215a, C2216b {

    /* renamed from: a */
    public volatile boolean f7661a;

    /* renamed from: b */
    public volatile C3172y3 f7662b;

    /* renamed from: c */
    public final /* synthetic */ C3121t7 f7663c;

    public C3067o8(C3121t7 t7Var) {
        this.f7663c = t7Var;
    }

    /* renamed from: a */
    public final void mo7251a(C2115b bVar) {
        C1061o.m2497a("MeasurementServiceConnection.onConnectionFailed");
        C2969g5 g5Var = this.f7663c.f7133a;
        C2908b4 b4Var = g5Var.f7340i;
        C2908b4 b4Var2 = (b4Var == null || !b4Var.mo8849r()) ? null : g5Var.f7340i;
        if (b4Var2 != null) {
            b4Var2.f7156i.mo8433a("Service connection failed", bVar);
        }
        synchronized (this) {
            this.f7661a = false;
            this.f7662b = null;
        }
        C3184z4 g = this.f7663c.mo8283g();
        C3100r8 r8Var = new C3100r8(this);
        g.mo8846n();
        C1061o.m2524b(r8Var);
        g.mo8843a(new C2945e5<>(g, r8Var, "Task exception on worker thread"));
    }

    /* renamed from: b */
    public final void mo7250b(Bundle bundle) {
        C1061o.m2497a("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                this.f7663c.mo8283g().mo8842a((Runnable) new C3078p8(this, (C3117t3) this.f7662b.mo7243q()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f7662b = null;
                this.f7661a = false;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:19|20) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r3.f7663c.mo8285i().f7153f.mo8432a("Service connect failed to get IMeasurementService");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0059 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
        /*
            r3 = this;
            java.lang.String r4 = "MeasurementServiceConnection.onServiceConnected"
            p124p.p126b.p127k.C1061o.m2497a(r4)
            monitor-enter(r3)
            r4 = 0
            if (r5 != 0) goto L_0x001d
            r3.f7661a = r4     // Catch:{ all -> 0x001a }
            q.b.a.b.h.b.t7 r4 = r3.f7663c     // Catch:{ all -> 0x001a }
            q.b.a.b.h.b.b4 r4 = r4.mo8285i()     // Catch:{ all -> 0x001a }
            q.b.a.b.h.b.e4 r4 = r4.f7153f     // Catch:{ all -> 0x001a }
            java.lang.String r5 = "Service connected with null binder"
            r4.mo8432a(r5)     // Catch:{ all -> 0x001a }
            monitor-exit(r3)     // Catch:{ all -> 0x001a }
            return
        L_0x001a:
            r4 = move-exception
            goto L_0x0099
        L_0x001d:
            r0 = 0
            java.lang.String r1 = r5.getInterfaceDescriptor()     // Catch:{ RemoteException -> 0x0059 }
            java.lang.String r2 = "com.google.android.gms.measurement.internal.IMeasurementService"
            boolean r2 = r2.equals(r1)     // Catch:{ RemoteException -> 0x0059 }
            if (r2 == 0) goto L_0x004b
            java.lang.String r1 = "com.google.android.gms.measurement.internal.IMeasurementService"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)     // Catch:{ RemoteException -> 0x0059 }
            boolean r2 = r1 instanceof p213q.p217b.p218a.p231b.p259h.p261b.C3117t3     // Catch:{ RemoteException -> 0x0059 }
            if (r2 == 0) goto L_0x0037
            q.b.a.b.h.b.t3 r1 = (p213q.p217b.p218a.p231b.p259h.p261b.C3117t3) r1     // Catch:{ RemoteException -> 0x0059 }
            goto L_0x003c
        L_0x0037:
            q.b.a.b.h.b.v3 r1 = new q.b.a.b.h.b.v3     // Catch:{ RemoteException -> 0x0059 }
            r1.<init>(r5)     // Catch:{ RemoteException -> 0x0059 }
        L_0x003c:
            r0 = r1
            q.b.a.b.h.b.t7 r5 = r3.f7663c     // Catch:{ RemoteException -> 0x0059 }
            q.b.a.b.h.b.b4 r5 = r5.mo8285i()     // Catch:{ RemoteException -> 0x0059 }
            q.b.a.b.h.b.e4 r5 = r5.f7161n     // Catch:{ RemoteException -> 0x0059 }
            java.lang.String r1 = "Bound to IMeasurementService interface"
            r5.mo8432a(r1)     // Catch:{ RemoteException -> 0x0059 }
            goto L_0x0066
        L_0x004b:
            q.b.a.b.h.b.t7 r5 = r3.f7663c     // Catch:{ RemoteException -> 0x0059 }
            q.b.a.b.h.b.b4 r5 = r5.mo8285i()     // Catch:{ RemoteException -> 0x0059 }
            q.b.a.b.h.b.e4 r5 = r5.f7153f     // Catch:{ RemoteException -> 0x0059 }
            java.lang.String r2 = "Got binder with a wrong descriptor"
            r5.mo8433a(r2, r1)     // Catch:{ RemoteException -> 0x0059 }
            goto L_0x0066
        L_0x0059:
            q.b.a.b.h.b.t7 r5 = r3.f7663c     // Catch:{ all -> 0x001a }
            q.b.a.b.h.b.b4 r5 = r5.mo8285i()     // Catch:{ all -> 0x001a }
            q.b.a.b.h.b.e4 r5 = r5.f7153f     // Catch:{ all -> 0x001a }
            java.lang.String r1 = "Service connect failed to get IMeasurementService"
            r5.mo8432a(r1)     // Catch:{ all -> 0x001a }
        L_0x0066:
            if (r0 != 0) goto L_0x007c
            r3.f7661a = r4     // Catch:{ all -> 0x001a }
            q.b.a.b.d.p.a r4 = p213q.p217b.p218a.p231b.p239d.p245p.C2277a.m5128a()     // Catch:{ IllegalArgumentException -> 0x0097 }
            q.b.a.b.h.b.t7 r5 = r3.f7663c     // Catch:{ IllegalArgumentException -> 0x0097 }
            q.b.a.b.h.b.g5 r5 = r5.f7133a     // Catch:{ IllegalArgumentException -> 0x0097 }
            android.content.Context r5 = r5.f7332a     // Catch:{ IllegalArgumentException -> 0x0097 }
            q.b.a.b.h.b.t7 r0 = r3.f7663c     // Catch:{ IllegalArgumentException -> 0x0097 }
            q.b.a.b.h.b.o8 r0 = r0.f7867c     // Catch:{ IllegalArgumentException -> 0x0097 }
            r4.mo7298a(r5, r0)     // Catch:{ IllegalArgumentException -> 0x0097 }
            goto L_0x0097
        L_0x007c:
            q.b.a.b.h.b.t7 r4 = r3.f7663c     // Catch:{ all -> 0x001a }
            q.b.a.b.h.b.z4 r4 = r4.mo8283g()     // Catch:{ all -> 0x001a }
            q.b.a.b.h.b.n8 r5 = new q.b.a.b.h.b.n8     // Catch:{ all -> 0x001a }
            r5.<init>(r3, r0)     // Catch:{ all -> 0x001a }
            r4.mo8846n()     // Catch:{ all -> 0x001a }
            p124p.p126b.p127k.C1061o.m2524b(r5)     // Catch:{ all -> 0x001a }
            q.b.a.b.h.b.e5 r0 = new q.b.a.b.h.b.e5     // Catch:{ all -> 0x001a }
            java.lang.String r1 = "Task exception on worker thread"
            r0.<init>(r4, r5, r1)     // Catch:{ all -> 0x001a }
            r4.mo8843a(r0)     // Catch:{ all -> 0x001a }
        L_0x0097:
            monitor-exit(r3)     // Catch:{ all -> 0x001a }
            return
        L_0x0099:
            monitor-exit(r3)     // Catch:{ all -> 0x001a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p259h.p261b.C3067o8.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C1061o.m2497a("MeasurementServiceConnection.onServiceDisconnected");
        this.f7663c.mo8285i().f7160m.mo8432a("Service disconnected");
        C3184z4 g = this.f7663c.mo8283g();
        C3089q8 q8Var = new C3089q8(this, componentName);
        g.mo8846n();
        C1061o.m2524b(q8Var);
        g.mo8843a(new C2945e5<>(g, q8Var, "Task exception on worker thread"));
    }

    /* renamed from: a */
    public final void mo7249a(int i) {
        C1061o.m2497a("MeasurementServiceConnection.onConnectionSuspended");
        this.f7663c.mo8285i().f7160m.mo8432a("Service connection suspended");
        C3184z4 g = this.f7663c.mo8283g();
        C3111s8 s8Var = new C3111s8(this);
        g.mo8846n();
        C1061o.m2524b(s8Var);
        g.mo8843a(new C2945e5<>(g, s8Var, "Task exception on worker thread"));
    }

    /* renamed from: a */
    public final void mo8683a(Intent intent) {
        this.f7663c.mo8279c();
        Context context = this.f7663c.f7133a.f7332a;
        C2277a a = C2277a.m5128a();
        synchronized (this) {
            if (this.f7661a) {
                this.f7663c.mo8285i().f7161n.mo8432a("Connection attempt already in progress");
                return;
            }
            this.f7663c.mo8285i().f7161n.mo8432a("Using local app measurement service");
            this.f7661a = true;
            a.mo7299a(context, intent, this.f7663c.f7867c, 129);
        }
    }

    /* renamed from: a */
    public final void mo8682a() {
        this.f7663c.mo8279c();
        Context context = this.f7663c.f7133a.f7332a;
        synchronized (this) {
            if (this.f7661a) {
                this.f7663c.mo8285i().f7161n.mo8432a("Connection attempt already in progress");
            } else if (this.f7662b == null || (!this.f7662b.mo7232e() && !this.f7662b.mo7227a())) {
                this.f7662b = new C3172y3(context, Looper.getMainLooper(), this, this);
                this.f7663c.mo8285i().f7161n.mo8432a("Connecting to remote service");
                this.f7661a = true;
                this.f7662b.mo7238l();
            } else {
                this.f7663c.mo8285i().f7161n.mo8432a("Already awaiting connection attempt");
            }
        }
    }
}
