package p213q.p217b.p317d.p347l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p213q.p217b.p218a.p231b.p239d.p246q.p247i.C2290a;
import p213q.p217b.p218a.p231b.p270l.C3244c0;
import p213q.p217b.p218a.p231b.p270l.C3246d0;
import p213q.p217b.p218a.p231b.p270l.C3250f0;
import p213q.p217b.p218a.p231b.p270l.C3252g0;
import p213q.p217b.p218a.p231b.p270l.C3255i;
import p213q.p217b.p218a.p231b.p270l.C3270u;

/* renamed from: q.b.d.l.h0 */
public final class C4236h0 implements ServiceConnection {

    /* renamed from: a */
    public final Context f10205a;

    /* renamed from: b */
    public final Intent f10206b;

    /* renamed from: c */
    public final ScheduledExecutorService f10207c;

    /* renamed from: d */
    public final Queue<C4234g0> f10208d = new ArrayDeque();

    /* renamed from: e */
    public C4228e0 f10209e;

    /* renamed from: f */
    public boolean f10210f = false;

    public C4236h0(Context context, String str) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new C2290a("Firebase-FirebaseInstanceIdServiceConnection"));
        this.f10205a = context.getApplicationContext();
        this.f10206b = new Intent(str).setPackage(this.f10205a.getPackageName());
        this.f10207c = scheduledThreadPoolExecutor;
    }

    /* renamed from: a */
    public final synchronized C3255i<Void> mo10426a(Intent intent) {
        C4234g0 g0Var;
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "new intent queued in the bind-strategy delivery");
        }
        g0Var = new C4234g0(intent);
        ScheduledExecutorService scheduledExecutorService = this.f10207c;
        ScheduledFuture schedule = scheduledExecutorService.schedule(new C4240j0(g0Var), 9000, TimeUnit.MILLISECONDS);
        C3250f0<TResult> f0Var = g0Var.f10203b.f8128a;
        C4238i0 i0Var = new C4238i0(schedule);
        C3244c0<TResult> c0Var = f0Var.f8121b;
        C3252g0.m7579a(scheduledExecutorService);
        c0Var.mo8917a((C3246d0<TResult>) new C3270u<TResult>(scheduledExecutorService, i0Var));
        f0Var.mo8938f();
        this.f10208d.add(g0Var);
        mo10427a();
        return g0Var.f10203b.f8128a;
    }

    /* renamed from: b */
    public final void mo10428b() {
        while (!this.f10208d.isEmpty()) {
            ((C4234g0) this.f10208d.poll()).mo10424a();
        }
    }

    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(valueOf.length() + 20);
            sb.append("onServiceConnected: ");
            sb.append(valueOf);
            Log.d("FirebaseInstanceId", sb.toString());
        }
        this.f10210f = false;
        if (!(iBinder instanceof C4228e0)) {
            String valueOf2 = String.valueOf(iBinder);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 28);
            sb2.append("Invalid service connection: ");
            sb2.append(valueOf2);
            Log.e("FirebaseInstanceId", sb2.toString());
            mo10428b();
            return;
        }
        this.f10209e = (C4228e0) iBinder;
        mo10427a();
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        String str = "FirebaseInstanceId";
        if (Log.isLoggable(str, 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(valueOf.length() + 23);
            sb.append("onServiceDisconnected: ");
            sb.append(valueOf);
            Log.d(str, sb.toString());
        }
        mo10427a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ca, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo10427a() {
        /*
            r6 = this;
            monitor-enter(r6)
            java.lang.String r0 = "FirebaseInstanceId"
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00cd }
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = "FirebaseInstanceId"
            java.lang.String r2 = "flush queue called"
            android.util.Log.d(r0, r2)     // Catch:{ all -> 0x00cd }
        L_0x0011:
            java.util.Queue<q.b.d.l.g0> r0 = r6.f10208d     // Catch:{ all -> 0x00cd }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00cd }
            if (r0 != 0) goto L_0x00cb
            java.lang.String r0 = "FirebaseInstanceId"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00cd }
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = "FirebaseInstanceId"
            java.lang.String r2 = "found intent to be delivered"
            android.util.Log.d(r0, r2)     // Catch:{ all -> 0x00cd }
        L_0x0028:
            q.b.d.l.e0 r0 = r6.f10209e     // Catch:{ all -> 0x00cd }
            if (r0 == 0) goto L_0x0073
            q.b.d.l.e0 r0 = r6.f10209e     // Catch:{ all -> 0x00cd }
            boolean r0 = r0.isBinderAlive()     // Catch:{ all -> 0x00cd }
            if (r0 == 0) goto L_0x0073
            java.lang.String r0 = "FirebaseInstanceId"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00cd }
            if (r0 == 0) goto L_0x0043
            java.lang.String r0 = "FirebaseInstanceId"
            java.lang.String r2 = "binder is alive, sending the intent."
            android.util.Log.d(r0, r2)     // Catch:{ all -> 0x00cd }
        L_0x0043:
            java.util.Queue<q.b.d.l.g0> r0 = r6.f10208d     // Catch:{ all -> 0x00cd }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x00cd }
            q.b.d.l.g0 r0 = (p213q.p217b.p317d.p347l.C4234g0) r0     // Catch:{ all -> 0x00cd }
            q.b.d.l.e0 r2 = r6.f10209e     // Catch:{ all -> 0x00cd }
            r3 = 0
            if (r2 == 0) goto L_0x0072
            int r2 = android.os.Binder.getCallingUid()     // Catch:{ all -> 0x00cd }
            int r4 = android.os.Process.myUid()     // Catch:{ all -> 0x00cd }
            if (r2 != r4) goto L_0x006a
            java.lang.String r2 = "FirebaseInstanceId"
            boolean r1 = android.util.Log.isLoggable(r2, r1)     // Catch:{ all -> 0x00cd }
            if (r1 == 0) goto L_0x0067
            java.lang.String r1 = "service received new intent via bind strategy"
            android.util.Log.d(r2, r1)     // Catch:{ all -> 0x00cd }
        L_0x0067:
            android.content.Intent r0 = r0.f10202a     // Catch:{ all -> 0x00cd }
            throw r3     // Catch:{ all -> 0x00cd }
        L_0x006a:
            java.lang.SecurityException r0 = new java.lang.SecurityException     // Catch:{ all -> 0x00cd }
            java.lang.String r1 = "Binding only allowed within app"
            r0.<init>(r1)     // Catch:{ all -> 0x00cd }
            throw r0     // Catch:{ all -> 0x00cd }
        L_0x0072:
            throw r3     // Catch:{ all -> 0x00cd }
        L_0x0073:
            java.lang.String r0 = "FirebaseInstanceId"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00cd }
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x009c
            java.lang.String r0 = "FirebaseInstanceId"
            boolean r3 = r6.f10210f     // Catch:{ all -> 0x00cd }
            if (r3 != 0) goto L_0x0085
            r3 = r2
            goto L_0x0086
        L_0x0085:
            r3 = r1
        L_0x0086:
            r4 = 39
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00cd }
            r5.<init>(r4)     // Catch:{ all -> 0x00cd }
            java.lang.String r4 = "binder is dead. start connection? "
            r5.append(r4)     // Catch:{ all -> 0x00cd }
            r5.append(r3)     // Catch:{ all -> 0x00cd }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x00cd }
            android.util.Log.d(r0, r3)     // Catch:{ all -> 0x00cd }
        L_0x009c:
            boolean r0 = r6.f10210f     // Catch:{ all -> 0x00cd }
            if (r0 != 0) goto L_0x00c9
            r6.f10210f = r2     // Catch:{ all -> 0x00cd }
            q.b.a.b.d.p.a r0 = p213q.p217b.p218a.p231b.p239d.p245p.C2277a.m5128a()     // Catch:{ SecurityException -> 0x00bc }
            android.content.Context r2 = r6.f10205a     // Catch:{ SecurityException -> 0x00bc }
            android.content.Intent r3 = r6.f10206b     // Catch:{ SecurityException -> 0x00bc }
            r4 = 65
            boolean r0 = r0.mo7299a(r2, r3, r6, r4)     // Catch:{ SecurityException -> 0x00bc }
            if (r0 == 0) goto L_0x00b4
            monitor-exit(r6)
            return
        L_0x00b4:
            java.lang.String r0 = "FirebaseInstanceId"
            java.lang.String r2 = "binding to the service failed"
            android.util.Log.e(r0, r2)     // Catch:{ SecurityException -> 0x00bc }
            goto L_0x00c4
        L_0x00bc:
            r0 = move-exception
            java.lang.String r2 = "FirebaseInstanceId"
            java.lang.String r3 = "Exception while binding the service"
            android.util.Log.e(r2, r3, r0)     // Catch:{ all -> 0x00cd }
        L_0x00c4:
            r6.f10210f = r1     // Catch:{ all -> 0x00cd }
            r6.mo10428b()     // Catch:{ all -> 0x00cd }
        L_0x00c9:
            monitor-exit(r6)
            return
        L_0x00cb:
            monitor-exit(r6)
            return
        L_0x00cd:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p317d.p347l.C4236h0.mo10427a():void");
    }
}
