package p213q.p217b.p317d.p347l;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;
import p213q.p217b.p218a.p231b.p239d.p245p.C2277a;
import p213q.p217b.p218a.p231b.p251g.p255d.C2337d;

/* renamed from: q.b.d.l.f */
public final class C4230f implements ServiceConnection {
    @GuardedBy("this")

    /* renamed from: a */
    public int f10192a = 0;

    /* renamed from: b */
    public final Messenger f10193b = new Messenger(new C2337d(Looper.getMainLooper(), new C4237i(this)));

    /* renamed from: c */
    public C4247n f10194c;
    @GuardedBy("this")

    /* renamed from: d */
    public final Queue<C4251p<?>> f10195d = new ArrayDeque();
    @GuardedBy("this")

    /* renamed from: e */
    public final SparseArray<C4251p<?>> f10196e = new SparseArray<>();

    /* renamed from: f */
    public final /* synthetic */ C4227e f10197f;

    public /* synthetic */ C4230f(C4227e eVar, C4233g gVar) {
        this.f10197f = eVar;
    }

    /* renamed from: a */
    public final synchronized void mo10417a(int i) {
        C4251p pVar = (C4251p) this.f10196e.get(i);
        if (pVar != null) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Timing out request: ");
            sb.append(i);
            Log.w("MessengerIpcClient", sb.toString());
            this.f10196e.remove(i);
            pVar.mo10439a(new C4249o(3, "Timed out waiting for response"));
            mo10416a();
        }
    }

    /* renamed from: a */
    public final synchronized void mo10418a(int i, String str) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String str2 = "MessengerIpcClient";
            String str3 = "Disconnected: ";
            String valueOf = String.valueOf(str);
            Log.d(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
        }
        int i2 = this.f10192a;
        if (i2 == 0) {
            throw new IllegalStateException();
        } else if (i2 == 1 || i2 == 2) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f10192a = 4;
            C2277a.m5128a().mo7298a(this.f10197f.f10187a, this);
            C4249o oVar = new C4249o(i, str);
            for (C4251p a : this.f10195d) {
                a.mo10439a(oVar);
            }
            this.f10195d.clear();
            for (int i3 = 0; i3 < this.f10196e.size(); i3++) {
                ((C4251p) this.f10196e.valueAt(i3)).mo10439a(oVar);
            }
            this.f10196e.clear();
        } else if (i2 == 3) {
            this.f10192a = 4;
        } else if (i2 != 4) {
            int i4 = this.f10192a;
            StringBuilder sb = new StringBuilder(26);
            sb.append("Unknown state: ");
            sb.append(i4);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: b */
    public final synchronized void mo10421b() {
        if (this.f10192a == 1) {
            mo10418a(1, "Timed out while binding");
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        String str = "MessengerIpcClient";
        if (Log.isLoggable(str, 2)) {
            Log.v(str, "Service connected");
        }
        this.f10197f.f10188b.execute(new C4241k(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        String str = "MessengerIpcClient";
        if (Log.isLoggable(str, 2)) {
            Log.v(str, "Service disconnected");
        }
        this.f10197f.f10188b.execute(new C4245m(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0052, code lost:
        r8 = r8.getData();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005d, code lost:
        if (r8.getBoolean("unsupported", false) == false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005f, code lost:
        r2.mo10439a(new p213q.p217b.p317d.p347l.C4249o(4, "Not supported by GmsCore"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006b, code lost:
        r2 = (p213q.p217b.p317d.p347l.C4255r) r2;
        r8 = r8.getBundle("data");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0073, code lost:
        if (r8 != null) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0075, code lost:
        r8 = android.os.Bundle.EMPTY;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0077, code lost:
        r0 = "MessengerIpcClient";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007d, code lost:
        if (android.util.Log.isLoggable(r0, 3) == false) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007f, code lost:
        r1 = java.lang.String.valueOf(r2);
        r4 = java.lang.String.valueOf(r8);
        r5 = new java.lang.StringBuilder(r4.length() + (r1.length() + 16));
        r5.append("Finishing ");
        r5.append(r1);
        r5.append(" with ");
        r5.append(r4);
        android.util.Log.d(r0, r5.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00ae, code lost:
        r2.f10231b.f8128a.mo8930a(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b5, code lost:
        return true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo10419a(android.os.Message r8) {
        /*
            r7 = this;
            int r0 = r8.arg1
            r1 = 3
            java.lang.String r2 = "MessengerIpcClient"
            boolean r2 = android.util.Log.isLoggable(r2, r1)
            if (r2 == 0) goto L_0x0023
            r2 = 41
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Received response to request: "
            r3.append(r2)
            r3.append(r0)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "MessengerIpcClient"
            android.util.Log.d(r3, r2)
        L_0x0023:
            monitor-enter(r7)
            android.util.SparseArray<q.b.d.l.p<?>> r2 = r7.f10196e     // Catch:{ all -> 0x00b6 }
            java.lang.Object r2 = r2.get(r0)     // Catch:{ all -> 0x00b6 }
            q.b.d.l.p r2 = (p213q.p217b.p317d.p347l.C4251p) r2     // Catch:{ all -> 0x00b6 }
            r3 = 1
            if (r2 != 0) goto L_0x0049
            java.lang.String r8 = "MessengerIpcClient"
            r1 = 50
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b6 }
            r2.<init>(r1)     // Catch:{ all -> 0x00b6 }
            java.lang.String r1 = "Received response for unknown request: "
            r2.append(r1)     // Catch:{ all -> 0x00b6 }
            r2.append(r0)     // Catch:{ all -> 0x00b6 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x00b6 }
            android.util.Log.w(r8, r0)     // Catch:{ all -> 0x00b6 }
            monitor-exit(r7)     // Catch:{ all -> 0x00b6 }
            return r3
        L_0x0049:
            android.util.SparseArray<q.b.d.l.p<?>> r4 = r7.f10196e     // Catch:{ all -> 0x00b6 }
            r4.remove(r0)     // Catch:{ all -> 0x00b6 }
            r7.mo10416a()     // Catch:{ all -> 0x00b6 }
            monitor-exit(r7)     // Catch:{ all -> 0x00b6 }
            android.os.Bundle r8 = r8.getData()
            r0 = 0
            java.lang.String r4 = "unsupported"
            boolean r0 = r8.getBoolean(r4, r0)
            if (r0 == 0) goto L_0x006b
            q.b.d.l.o r8 = new q.b.d.l.o
            r0 = 4
            java.lang.String r1 = "Not supported by GmsCore"
            r8.<init>(r0, r1)
            r2.mo10439a(r8)
            goto L_0x00b5
        L_0x006b:
            q.b.d.l.r r2 = (p213q.p217b.p317d.p347l.C4255r) r2
            java.lang.String r0 = "data"
            android.os.Bundle r8 = r8.getBundle(r0)
            if (r8 != 0) goto L_0x0077
            android.os.Bundle r8 = android.os.Bundle.EMPTY
        L_0x0077:
            java.lang.String r0 = "MessengerIpcClient"
            boolean r1 = android.util.Log.isLoggable(r0, r1)
            if (r1 == 0) goto L_0x00ae
            java.lang.String r1 = java.lang.String.valueOf(r2)
            java.lang.String r4 = java.lang.String.valueOf(r8)
            int r5 = r1.length()
            int r5 = r5 + 16
            int r6 = r4.length()
            int r6 = r6 + r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r6)
            java.lang.String r6 = "Finishing "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r1 = " with "
            r5.append(r1)
            r5.append(r4)
            java.lang.String r1 = r5.toString()
            android.util.Log.d(r0, r1)
        L_0x00ae:
            q.b.a.b.l.j<T> r0 = r2.f10231b
            q.b.a.b.l.f0<TResult> r0 = r0.f8128a
            r0.mo8930a(r8)
        L_0x00b5:
            return r3
        L_0x00b6:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00b6 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p317d.p347l.C4230f.mo10419a(android.os.Message):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009b, code lost:
        return true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo10420a(p213q.p217b.p317d.p347l.C4251p<?> r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f10192a     // Catch:{ all -> 0x009c }
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x004a
            if (r0 == r3) goto L_0x0043
            if (r0 == r1) goto L_0x0030
            r6 = 3
            if (r0 == r6) goto L_0x002e
            r6 = 4
            if (r0 != r6) goto L_0x0013
            goto L_0x002e
        L_0x0013:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ all -> 0x009c }
            int r0 = r5.f10192a     // Catch:{ all -> 0x009c }
            r1 = 26
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x009c }
            r2.<init>(r1)     // Catch:{ all -> 0x009c }
            java.lang.String r1 = "Unknown state: "
            r2.append(r1)     // Catch:{ all -> 0x009c }
            r2.append(r0)     // Catch:{ all -> 0x009c }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x009c }
            r6.<init>(r0)     // Catch:{ all -> 0x009c }
            throw r6     // Catch:{ all -> 0x009c }
        L_0x002e:
            monitor-exit(r5)
            return r2
        L_0x0030:
            java.util.Queue<q.b.d.l.p<?>> r0 = r5.f10195d     // Catch:{ all -> 0x009c }
            r0.add(r6)     // Catch:{ all -> 0x009c }
            q.b.d.l.e r6 = r5.f10197f     // Catch:{ all -> 0x009c }
            java.util.concurrent.ScheduledExecutorService r6 = r6.f10188b     // Catch:{ all -> 0x009c }
            q.b.d.l.j r0 = new q.b.d.l.j     // Catch:{ all -> 0x009c }
            r0.<init>(r5)     // Catch:{ all -> 0x009c }
            r6.execute(r0)     // Catch:{ all -> 0x009c }
            monitor-exit(r5)
            return r3
        L_0x0043:
            java.util.Queue<q.b.d.l.p<?>> r0 = r5.f10195d     // Catch:{ all -> 0x009c }
            r0.add(r6)     // Catch:{ all -> 0x009c }
            monitor-exit(r5)
            return r3
        L_0x004a:
            java.util.Queue<q.b.d.l.p<?>> r0 = r5.f10195d     // Catch:{ all -> 0x009c }
            r0.add(r6)     // Catch:{ all -> 0x009c }
            int r6 = r5.f10192a     // Catch:{ all -> 0x009c }
            if (r6 != 0) goto L_0x0055
            r6 = r3
            goto L_0x0056
        L_0x0055:
            r6 = r2
        L_0x0056:
            p124p.p126b.p127k.C1061o.m2533b(r6)     // Catch:{ all -> 0x009c }
            java.lang.String r6 = "MessengerIpcClient"
            boolean r6 = android.util.Log.isLoggable(r6, r1)     // Catch:{ all -> 0x009c }
            if (r6 == 0) goto L_0x0068
            java.lang.String r6 = "MessengerIpcClient"
            java.lang.String r0 = "Starting bind to GmsCore"
            android.util.Log.v(r6, r0)     // Catch:{ all -> 0x009c }
        L_0x0068:
            r5.f10192a = r3     // Catch:{ all -> 0x009c }
            android.content.Intent r6 = new android.content.Intent     // Catch:{ all -> 0x009c }
            java.lang.String r0 = "com.google.android.c2dm.intent.REGISTER"
            r6.<init>(r0)     // Catch:{ all -> 0x009c }
            java.lang.String r0 = "com.google.android.gms"
            r6.setPackage(r0)     // Catch:{ all -> 0x009c }
            q.b.a.b.d.p.a r0 = p213q.p217b.p218a.p231b.p239d.p245p.C2277a.m5128a()     // Catch:{ all -> 0x009c }
            q.b.d.l.e r1 = r5.f10197f     // Catch:{ all -> 0x009c }
            android.content.Context r1 = r1.f10187a     // Catch:{ all -> 0x009c }
            boolean r6 = r0.mo7299a(r1, r6, r5, r3)     // Catch:{ all -> 0x009c }
            if (r6 != 0) goto L_0x008a
            java.lang.String r6 = "Unable to bind to service"
            r5.mo10418a(r2, r6)     // Catch:{ all -> 0x009c }
            goto L_0x009a
        L_0x008a:
            q.b.d.l.e r6 = r5.f10197f     // Catch:{ all -> 0x009c }
            java.util.concurrent.ScheduledExecutorService r6 = r6.f10188b     // Catch:{ all -> 0x009c }
            q.b.d.l.h r0 = new q.b.d.l.h     // Catch:{ all -> 0x009c }
            r0.<init>(r5)     // Catch:{ all -> 0x009c }
            r1 = 30
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x009c }
            r6.schedule(r0, r1, r4)     // Catch:{ all -> 0x009c }
        L_0x009a:
            monitor-exit(r5)
            return r3
        L_0x009c:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p317d.p347l.C4230f.mo10420a(q.b.d.l.p):boolean");
    }

    /* renamed from: a */
    public final synchronized void mo10416a() {
        if (this.f10192a == 2 && this.f10195d.isEmpty() && this.f10196e.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.f10192a = 3;
            C2277a.m5128a().mo7298a(this.f10197f.f10187a, this);
        }
    }
}
