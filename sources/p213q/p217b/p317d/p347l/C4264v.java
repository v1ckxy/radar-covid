package p213q.p217b.p317d.p347l;

import android.util.Pair;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;
import p124p.p143e.C1248a;
import p213q.p217b.p218a.p231b.p270l.C3255i;

/* renamed from: q.b.d.l.v */
public final class C4264v {

    /* renamed from: a */
    public final Executor f10251a;
    @GuardedBy("this")

    /* renamed from: b */
    public final Map<Pair<String, String>, C3255i<C4215a>> f10252b = new C1248a();

    public C4264v(Executor executor) {
        this.f10251a = executor;
    }

    /* renamed from: a */
    public final /* synthetic */ C3255i mo10457a(Pair pair, C3255i iVar) {
        synchronized (this) {
            this.f10252b.remove(pair);
        }
        return iVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003a, code lost:
        return r4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized p213q.p217b.p218a.p231b.p270l.C3255i<p213q.p217b.p317d.p347l.C4215a> mo10458a(java.lang.String r4, java.lang.String r5, p213q.p217b.p317d.p347l.C4269x0 r6) {
        /*
            r3 = this;
            monitor-enter(r3)
            android.util.Pair r0 = new android.util.Pair     // Catch:{ all -> 0x0079 }
            r0.<init>(r4, r5)     // Catch:{ all -> 0x0079 }
            java.util.Map<android.util.Pair<java.lang.String, java.lang.String>, q.b.a.b.l.i<q.b.d.l.a>> r4 = r3.f10252b     // Catch:{ all -> 0x0079 }
            java.lang.Object r4 = r4.get(r0)     // Catch:{ all -> 0x0079 }
            q.b.a.b.l.i r4 = (p213q.p217b.p218a.p231b.p270l.C3255i) r4     // Catch:{ all -> 0x0079 }
            r5 = 3
            if (r4 == 0) goto L_0x003b
            java.lang.String r6 = "FirebaseInstanceId"
            boolean r5 = android.util.Log.isLoggable(r6, r5)     // Catch:{ all -> 0x0079 }
            if (r5 == 0) goto L_0x0039
            java.lang.String r5 = "FirebaseInstanceId"
            java.lang.String r6 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0079 }
            int r0 = r6.length()     // Catch:{ all -> 0x0079 }
            int r0 = r0 + 29
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0079 }
            r1.<init>(r0)     // Catch:{ all -> 0x0079 }
            java.lang.String r0 = "Joining ongoing request for: "
            r1.append(r0)     // Catch:{ all -> 0x0079 }
            r1.append(r6)     // Catch:{ all -> 0x0079 }
            java.lang.String r6 = r1.toString()     // Catch:{ all -> 0x0079 }
            android.util.Log.d(r5, r6)     // Catch:{ all -> 0x0079 }
        L_0x0039:
            monitor-exit(r3)
            return r4
        L_0x003b:
            java.lang.String r4 = "FirebaseInstanceId"
            boolean r4 = android.util.Log.isLoggable(r4, r5)     // Catch:{ all -> 0x0079 }
            if (r4 == 0) goto L_0x0063
            java.lang.String r4 = "FirebaseInstanceId"
            java.lang.String r5 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0079 }
            int r1 = r5.length()     // Catch:{ all -> 0x0079 }
            int r1 = r1 + 24
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0079 }
            r2.<init>(r1)     // Catch:{ all -> 0x0079 }
            java.lang.String r1 = "Making new request for: "
            r2.append(r1)     // Catch:{ all -> 0x0079 }
            r2.append(r5)     // Catch:{ all -> 0x0079 }
            java.lang.String r5 = r2.toString()     // Catch:{ all -> 0x0079 }
            android.util.Log.d(r4, r5)     // Catch:{ all -> 0x0079 }
        L_0x0063:
            q.b.a.b.l.i r4 = r6.mo10468a()     // Catch:{ all -> 0x0079 }
            java.util.concurrent.Executor r5 = r3.f10251a     // Catch:{ all -> 0x0079 }
            q.b.d.l.u r6 = new q.b.d.l.u     // Catch:{ all -> 0x0079 }
            r6.<init>(r3, r0)     // Catch:{ all -> 0x0079 }
            q.b.a.b.l.i r4 = r4.mo8932b(r5, r6)     // Catch:{ all -> 0x0079 }
            java.util.Map<android.util.Pair<java.lang.String, java.lang.String>, q.b.a.b.l.i<q.b.d.l.a>> r5 = r3.f10252b     // Catch:{ all -> 0x0079 }
            r5.put(r0, r4)     // Catch:{ all -> 0x0079 }
            monitor-exit(r3)
            return r4
        L_0x0079:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p317d.p347l.C4264v.mo10458a(java.lang.String, java.lang.String, q.b.d.l.x0):q.b.a.b.l.i");
    }
}
