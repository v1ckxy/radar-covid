package p213q.p217b.p317d.p347l;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.concurrent.GuardedBy;
import p124p.p143e.C1261h;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p218a.p231b.p270l.C3257j;
import p213q.p217b.p317d.p347l.C4256r0.C4257a;

/* renamed from: q.b.d.l.w */
public final class C4266w {

    /* renamed from: g */
    public static int f10254g;

    /* renamed from: h */
    public static PendingIntent f10255h;
    @GuardedBy("responseCallbacks")

    /* renamed from: a */
    public final C1261h<String, C3257j<Bundle>> f10256a = new C1261h<>();

    /* renamed from: b */
    public final Context f10257b;

    /* renamed from: c */
    public final C4253q f10258c;

    /* renamed from: d */
    public Messenger f10259d;

    /* renamed from: e */
    public Messenger f10260e;

    /* renamed from: f */
    public C4256r0 f10261f;

    public C4266w(Context context, C4253q qVar) {
        this.f10257b = context;
        this.f10258c = qVar;
        this.f10259d = new Messenger(new C4270y(this, Looper.getMainLooper()));
    }

    /* renamed from: a */
    public static synchronized String m9751a() {
        String num;
        synchronized (C4266w.class) {
            int i = f10254g;
            f10254g = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    /* renamed from: a */
    public static synchronized void m9752a(Context context, Intent intent) {
        synchronized (C4266w.class) {
            if (f10255h == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f10255h = PendingIntent.getBroadcast(context, 0, intent2, 0);
            }
            intent.putExtra("app", f10255h);
        }
    }

    /* renamed from: a */
    public final Bundle mo10460a(Bundle bundle) {
        if (this.f10258c.mo10445d() < 12000000) {
            return mo10463b(bundle);
        }
        C4227e a = C4227e.m9714a(this.f10257b);
        try {
            return (Bundle) C2286e.m5186a(a.mo10414a((C4251p<T>) new C4255r<T>(a.mo10413a(), bundle)));
        } catch (InterruptedException | ExecutionException e) {
            String str = "FirebaseInstanceId";
            if (Log.isLoggable(str, 3)) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(valueOf.length() + 22);
                sb.append("Error making request: ");
                sb.append(valueOf);
                Log.d(str, sb.toString());
            }
            if (!(e.getCause() instanceof C4249o) || ((C4249o) e.getCause()).f10228e != 4) {
                return null;
            }
            return mo10463b(bundle);
        }
    }

    /* renamed from: b */
    public final Bundle mo10463b(Bundle bundle) {
        Bundle c = mo10464c(bundle);
        if (c == null) {
            return c;
        }
        String str = "google.messenger";
        if (!c.containsKey(str)) {
            return c;
        }
        Bundle c2 = mo10464c(bundle);
        if (c2 == null || !c2.containsKey(str)) {
            return c2;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d7 A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo10464c(android.os.Bundle r8) {
        /*
            r7 = this;
            java.lang.String r0 = m9751a()
            q.b.a.b.l.j r1 = new q.b.a.b.l.j
            r1.<init>()
            p.e.h<java.lang.String, q.b.a.b.l.j<android.os.Bundle>> r2 = r7.f10256a
            monitor-enter(r2)
            p.e.h<java.lang.String, q.b.a.b.l.j<android.os.Bundle>> r3 = r7.f10256a     // Catch:{ all -> 0x010e }
            r3.put(r0, r1)     // Catch:{ all -> 0x010e }
            monitor-exit(r2)     // Catch:{ all -> 0x010e }
            q.b.d.l.q r2 = r7.f10258c
            int r2 = r2.mo10441a()
            if (r2 == 0) goto L_0x0106
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r3 = "com.google.android.gms"
            r2.setPackage(r3)
            q.b.d.l.q r3 = r7.f10258c
            int r3 = r3.mo10441a()
            r4 = 2
            if (r3 != r4) goto L_0x0030
            java.lang.String r3 = "com.google.iid.TOKEN_REQUEST"
            goto L_0x0032
        L_0x0030:
            java.lang.String r3 = "com.google.android.c2dm.intent.REGISTER"
        L_0x0032:
            r2.setAction(r3)
            r2.putExtras(r8)
            android.content.Context r8 = r7.f10257b
            m9752a(r8, r2)
            java.lang.String r8 = java.lang.String.valueOf(r0)
            int r8 = r8.length()
            int r8 = r8 + 5
            java.lang.String r3 = "|ID|"
            java.lang.String r5 = "|"
            java.lang.String r8 = p213q.p214a.p215a.p216a.C1965a.m4745a(r8, r3, r0, r5)
            java.lang.String r3 = "kid"
            r2.putExtra(r3, r8)
            r8 = 3
            java.lang.String r3 = "FirebaseInstanceId"
            boolean r3 = android.util.Log.isLoggable(r3, r8)
            if (r3 == 0) goto L_0x0081
            android.os.Bundle r3 = r2.getExtras()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r5 = r3.length()
            int r5 = r5 + 8
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            java.lang.String r5 = "Sending "
            r6.append(r5)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            java.lang.String r5 = "FirebaseInstanceId"
            android.util.Log.d(r5, r3)
        L_0x0081:
            android.os.Messenger r3 = r7.f10259d
            java.lang.String r5 = "google.messenger"
            r2.putExtra(r5, r3)
            android.os.Messenger r3 = r7.f10260e
            if (r3 != 0) goto L_0x0090
            q.b.d.l.r0 r3 = r7.f10261f
            if (r3 == 0) goto L_0x00b5
        L_0x0090:
            android.os.Message r3 = android.os.Message.obtain()
            r3.obj = r2
            android.os.Messenger r5 = r7.f10260e     // Catch:{ RemoteException -> 0x00a6 }
            if (r5 == 0) goto L_0x00a0
            android.os.Messenger r5 = r7.f10260e     // Catch:{ RemoteException -> 0x00a6 }
            r5.send(r3)     // Catch:{ RemoteException -> 0x00a6 }
            goto L_0x00c8
        L_0x00a0:
            q.b.d.l.r0 r5 = r7.f10261f     // Catch:{ RemoteException -> 0x00a6 }
            r5.mo10450a(r3)     // Catch:{ RemoteException -> 0x00a6 }
            goto L_0x00c8
        L_0x00a6:
            java.lang.String r3 = "FirebaseInstanceId"
            boolean r8 = android.util.Log.isLoggable(r3, r8)
            if (r8 == 0) goto L_0x00b5
            java.lang.String r8 = "FirebaseInstanceId"
            java.lang.String r3 = "Messenger failed, fallback to startService"
            android.util.Log.d(r8, r3)
        L_0x00b5:
            q.b.d.l.q r8 = r7.f10258c
            int r8 = r8.mo10441a()
            if (r8 != r4) goto L_0x00c3
            android.content.Context r8 = r7.f10257b
            r8.sendBroadcast(r2)
            goto L_0x00c8
        L_0x00c3:
            android.content.Context r8 = r7.f10257b
            r8.startService(r2)
        L_0x00c8:
            q.b.a.b.l.f0<TResult> r8 = r1.f8128a     // Catch:{ InterruptedException | TimeoutException -> 0x00ea, ExecutionException -> 0x00e3 }
            r1 = 30000(0x7530, double:1.4822E-319)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException | TimeoutException -> 0x00ea, ExecutionException -> 0x00e3 }
            java.lang.Object r8 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5187a(r8, r1, r3)     // Catch:{ InterruptedException | TimeoutException -> 0x00ea, ExecutionException -> 0x00e3 }
            android.os.Bundle r8 = (android.os.Bundle) r8     // Catch:{ InterruptedException | TimeoutException -> 0x00ea, ExecutionException -> 0x00e3 }
            p.e.h<java.lang.String, q.b.a.b.l.j<android.os.Bundle>> r1 = r7.f10256a
            monitor-enter(r1)
            p.e.h<java.lang.String, q.b.a.b.l.j<android.os.Bundle>> r2 = r7.f10256a     // Catch:{ all -> 0x00de }
            r2.remove(r0)     // Catch:{ all -> 0x00de }
            monitor-exit(r1)     // Catch:{ all -> 0x00de }
            return r8
        L_0x00de:
            r8 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00de }
            throw r8
        L_0x00e1:
            r8 = move-exception
            goto L_0x00f9
        L_0x00e3:
            r8 = move-exception
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x00e1 }
            r1.<init>(r8)     // Catch:{ all -> 0x00e1 }
            throw r1     // Catch:{ all -> 0x00e1 }
        L_0x00ea:
            java.lang.String r8 = "FirebaseInstanceId"
            java.lang.String r1 = "No response"
            android.util.Log.w(r8, r1)     // Catch:{ all -> 0x00e1 }
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x00e1 }
            java.lang.String r1 = "TIMEOUT"
            r8.<init>(r1)     // Catch:{ all -> 0x00e1 }
            throw r8     // Catch:{ all -> 0x00e1 }
        L_0x00f9:
            p.e.h<java.lang.String, q.b.a.b.l.j<android.os.Bundle>> r1 = r7.f10256a
            monitor-enter(r1)
            p.e.h<java.lang.String, q.b.a.b.l.j<android.os.Bundle>> r2 = r7.f10256a     // Catch:{ all -> 0x0103 }
            r2.remove(r0)     // Catch:{ all -> 0x0103 }
            monitor-exit(r1)     // Catch:{ all -> 0x0103 }
            throw r8
        L_0x0103:
            r8 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0103 }
            throw r8
        L_0x0106:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r0 = "MISSING_INSTANCEID_SERVICE"
            r8.<init>(r0)
            throw r8
        L_0x010e:
            r8 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x010e }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p317d.p347l.C4266w.mo10464c(android.os.Bundle):android.os.Bundle");
    }

    /* renamed from: a */
    public final void mo10461a(Message message) {
        String str;
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new C4257a());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof C4256r0) {
                        this.f10261f = (C4256r0) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        this.f10260e = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        String str2 = "Unexpected response action: ";
                        String valueOf = String.valueOf(action);
                        Log.d("FirebaseInstanceId", valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra == null) {
                    String stringExtra2 = intent2.getStringExtra("error");
                    if (stringExtra2 == null) {
                        String valueOf2 = String.valueOf(intent2.getExtras());
                        StringBuilder sb = new StringBuilder(valueOf2.length() + 49);
                        sb.append("Unexpected response, no error or registration id ");
                        sb.append(valueOf2);
                        str = sb.toString();
                    } else {
                        if (Log.isLoggable("FirebaseInstanceId", 3)) {
                            String str3 = "Received InstanceID error ";
                            Log.d("FirebaseInstanceId", stringExtra2.length() != 0 ? str3.concat(stringExtra2) : new String(str3));
                        }
                        if (stringExtra2.startsWith("|")) {
                            String[] split = stringExtra2.split("\\|");
                            if (split.length > 2) {
                                if ("ID".equals(split[1])) {
                                    String str4 = split[2];
                                    String str5 = split[3];
                                    if (str5.startsWith(":")) {
                                        str5 = str5.substring(1);
                                    }
                                    mo10462a(str4, intent2.putExtra("error", str5).getExtras());
                                }
                            }
                            String str6 = "Unexpected structured response ";
                            str = stringExtra2.length() != 0 ? str6.concat(stringExtra2) : new String(str6);
                        } else {
                            synchronized (this.f10256a) {
                                for (int i = 0; i < this.f10256a.f3589g; i++) {
                                    mo10462a((String) this.f10256a.mo5593c(i), intent2.getExtras());
                                }
                            }
                        }
                    }
                    Log.w("FirebaseInstanceId", str);
                }
                Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
                if (!matcher.matches()) {
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        String str7 = "Unexpected response string: ";
                        Log.d("FirebaseInstanceId", stringExtra.length() != 0 ? str7.concat(stringExtra) : new String(str7));
                    }
                    return;
                }
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                Bundle extras = intent2.getExtras();
                extras.putString("registration_id", group2);
                mo10462a(group, extras);
                return;
            }
        }
        Log.w("FirebaseInstanceId", "Dropping invalid message");
    }

    /* renamed from: a */
    public final void mo10462a(String str, Bundle bundle) {
        synchronized (this.f10256a) {
            C3257j jVar = (C3257j) this.f10256a.remove(str);
            if (jVar == null) {
                String str2 = "FirebaseInstanceId";
                String str3 = "Missing callback for ";
                String valueOf = String.valueOf(str);
                Log.w(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
                return;
            }
            jVar.f8128a.mo8930a(bundle);
        }
    }
}
