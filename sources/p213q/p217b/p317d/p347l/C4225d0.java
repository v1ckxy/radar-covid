package p213q.p217b.p317d.p347l;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import java.io.IOException;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p317d.C3859c;

/* renamed from: q.b.d.l.d0 */
public final class C4225d0 implements Runnable {

    /* renamed from: e */
    public final long f10182e;

    /* renamed from: f */
    public final WakeLock f10183f;

    /* renamed from: g */
    public final FirebaseInstanceId f10184g;

    public C4225d0(FirebaseInstanceId firebaseInstanceId, long j) {
        this.f10184g = firebaseInstanceId;
        this.f10182e = j;
        WakeLock newWakeLock = ((PowerManager) mo10409a().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f10183f = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    /* renamed from: a */
    public final Context mo10409a() {
        C3859c cVar = this.f10184g.f1540b;
        cVar.mo10056a();
        return cVar.f9459a;
    }

    /* renamed from: b */
    public final boolean mo10410b() {
        ConnectivityManager connectivityManager = (ConnectivityManager) mo10409a().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* renamed from: c */
    public final boolean mo10411c() {
        String str;
        String str2 = "FirebaseInstanceId";
        FirebaseInstanceId firebaseInstanceId = this.f10184g;
        C4272z a = FirebaseInstanceId.f1537j.mo10399a(firebaseInstanceId.mo3059f(), C4253q.m9735a(firebaseInstanceId.f1540b), "*");
        boolean z = true;
        if (!this.f10184g.mo3054a(a)) {
            return true;
        }
        try {
            String a2 = this.f10184g.mo3051a();
            if (a2 == null) {
                Log.e(str2, "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable(str2, 3)) {
                Log.d(str2, "Token successfully retrieved");
            }
            if (a == null || !a2.equals(a.f10278a)) {
                C3859c cVar = this.f10184g.f1540b;
                cVar.mo10056a();
                if ("[DEFAULT]".equals(cVar.f9460b)) {
                    if (Log.isLoggable(str2, 3)) {
                        String str3 = "Invoking onNewToken for app: ";
                        C3859c cVar2 = this.f10184g.f1540b;
                        cVar2.mo10056a();
                        String valueOf = String.valueOf(cVar2.f9460b);
                        Log.d(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
                    }
                    Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                    intent.putExtra("token", a2);
                    Context a3 = mo10409a();
                    Intent intent2 = new Intent(a3, FirebaseInstanceIdReceiver.class);
                    intent2.setAction("com.google.firebase.MESSAGING_EVENT");
                    intent2.putExtra("wrapped_intent", intent);
                    a3.sendBroadcast(intent2);
                }
            }
            return true;
        } catch (IOException e) {
            String message = e.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                z = false;
            }
            if (z) {
                String message2 = e.getMessage();
                str = C1965a.m4745a(C1965a.m4743a(message2, 52), "Token retrieval failed: ", message2, ". Will retry token retrieval");
            } else if (e.getMessage() == null) {
                str = "Token retrieval failed without exception message. Will retry token retrieval";
            } else {
                throw e;
            }
            Log.w(str2, str);
            return false;
        } catch (SecurityException unused) {
            str = "Token retrieval failed with SecurityException. Will retry token retrieval";
            Log.w(str2, str);
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0090, code lost:
        if (p213q.p217b.p317d.p347l.C4268x.m9759a().mo10466a(mo10409a()) != false) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0092, code lost:
        r5.f10183f.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0097, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d5, code lost:
        if (p213q.p217b.p317d.p347l.C4268x.m9759a().mo10466a(mo10409a()) == false) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d8, code lost:
        return;
     */
    @android.annotation.SuppressLint({"Wakelock"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            q.b.d.l.x r0 = p213q.p217b.p317d.p347l.C4268x.m9759a()
            android.content.Context r1 = r5.mo10409a()
            boolean r0 = r0.mo10466a(r1)
            if (r0 == 0) goto L_0x0013
            android.os.PowerManager$WakeLock r0 = r5.f10183f
            r0.acquire()
        L_0x0013:
            r0 = 0
            com.google.firebase.iid.FirebaseInstanceId r1 = r5.f10184g     // Catch:{ IOException -> 0x009a }
            r2 = 1
            r1.mo3053a(r2)     // Catch:{ IOException -> 0x009a }
            com.google.firebase.iid.FirebaseInstanceId r1 = r5.f10184g     // Catch:{ IOException -> 0x009a }
            q.b.d.l.q r1 = r1.f1541c     // Catch:{ IOException -> 0x009a }
            int r1 = r1.mo10441a()     // Catch:{ IOException -> 0x009a }
            if (r1 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r2 = r0
        L_0x0026:
            if (r2 != 0) goto L_0x0041
            com.google.firebase.iid.FirebaseInstanceId r1 = r5.f10184g     // Catch:{ IOException -> 0x009a }
            r1.mo3053a(r0)     // Catch:{ IOException -> 0x009a }
            q.b.d.l.x r0 = p213q.p217b.p317d.p347l.C4268x.m9759a()
            android.content.Context r1 = r5.mo10409a()
            boolean r0 = r0.mo10466a(r1)
            if (r0 == 0) goto L_0x0040
            android.os.PowerManager$WakeLock r0 = r5.f10183f
            r0.release()
        L_0x0040:
            return
        L_0x0041:
            q.b.d.l.x r1 = p213q.p217b.p317d.p347l.C4268x.m9759a()     // Catch:{ IOException -> 0x009a }
            android.content.Context r2 = r5.mo10409a()     // Catch:{ IOException -> 0x009a }
            boolean r1 = r1.mo10467b(r2)     // Catch:{ IOException -> 0x009a }
            if (r1 == 0) goto L_0x0071
            boolean r1 = r5.mo10410b()     // Catch:{ IOException -> 0x009a }
            if (r1 != 0) goto L_0x0071
            q.b.d.l.c0 r1 = new q.b.d.l.c0     // Catch:{ IOException -> 0x009a }
            r1.<init>(r5)     // Catch:{ IOException -> 0x009a }
            r1.mo10407a()     // Catch:{ IOException -> 0x009a }
            q.b.d.l.x r0 = p213q.p217b.p317d.p347l.C4268x.m9759a()
            android.content.Context r1 = r5.mo10409a()
            boolean r0 = r0.mo10466a(r1)
            if (r0 == 0) goto L_0x0070
            android.os.PowerManager$WakeLock r0 = r5.f10183f
            r0.release()
        L_0x0070:
            return
        L_0x0071:
            boolean r1 = r5.mo10411c()     // Catch:{ IOException -> 0x009a }
            if (r1 == 0) goto L_0x007d
            com.google.firebase.iid.FirebaseInstanceId r1 = r5.f10184g     // Catch:{ IOException -> 0x009a }
            r1.mo3053a(r0)     // Catch:{ IOException -> 0x009a }
            goto L_0x0084
        L_0x007d:
            com.google.firebase.iid.FirebaseInstanceId r1 = r5.f10184g     // Catch:{ IOException -> 0x009a }
            long r2 = r5.f10182e     // Catch:{ IOException -> 0x009a }
            r1.mo3052a(r2)     // Catch:{ IOException -> 0x009a }
        L_0x0084:
            q.b.d.l.x r0 = p213q.p217b.p317d.p347l.C4268x.m9759a()
            android.content.Context r1 = r5.mo10409a()
            boolean r0 = r0.mo10466a(r1)
            if (r0 == 0) goto L_0x00d8
        L_0x0092:
            android.os.PowerManager$WakeLock r0 = r5.f10183f
            r0.release()
            return
        L_0x0098:
            r0 = move-exception
            goto L_0x00d9
        L_0x009a:
            r1 = move-exception
            java.lang.String r2 = "FirebaseInstanceId"
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x0098 }
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0098 }
            int r3 = r3.length()     // Catch:{ all -> 0x0098 }
            int r3 = r3 + 93
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0098 }
            r4.<init>(r3)     // Catch:{ all -> 0x0098 }
            java.lang.String r3 = "Topic sync or token retrieval failed on hard failure exceptions: "
            r4.append(r3)     // Catch:{ all -> 0x0098 }
            r4.append(r1)     // Catch:{ all -> 0x0098 }
            java.lang.String r1 = ". Won't retry the operation."
            r4.append(r1)     // Catch:{ all -> 0x0098 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x0098 }
            android.util.Log.e(r2, r1)     // Catch:{ all -> 0x0098 }
            com.google.firebase.iid.FirebaseInstanceId r1 = r5.f10184g     // Catch:{ all -> 0x0098 }
            r1.mo3053a(r0)     // Catch:{ all -> 0x0098 }
            q.b.d.l.x r0 = p213q.p217b.p317d.p347l.C4268x.m9759a()
            android.content.Context r1 = r5.mo10409a()
            boolean r0 = r0.mo10466a(r1)
            if (r0 == 0) goto L_0x00d8
            goto L_0x0092
        L_0x00d8:
            return
        L_0x00d9:
            q.b.d.l.x r1 = p213q.p217b.p317d.p347l.C4268x.m9759a()
            android.content.Context r2 = r5.mo10409a()
            boolean r1 = r1.mo10466a(r2)
            if (r1 == 0) goto L_0x00ec
            android.os.PowerManager$WakeLock r1 = r5.f10183f
            r1.release()
        L_0x00ec:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p317d.p347l.C4225d0.run():void");
    }
}
