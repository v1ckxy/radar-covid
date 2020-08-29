package p213q.p217b.p317d.p350n;

import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p270l.C3250f0;
import p213q.p217b.p218a.p231b.p270l.C3255i;
import p213q.p217b.p218a.p231b.p270l.C3257j;
import p213q.p217b.p317d.C3859c;
import p213q.p217b.p317d.p346k.C4212c;
import p213q.p217b.p317d.p350n.p351o.C4292a;
import p213q.p217b.p317d.p350n.p351o.C4292a.C4294b;
import p213q.p217b.p317d.p350n.p351o.C4295b;
import p213q.p217b.p317d.p350n.p351o.C4296c;
import p213q.p217b.p317d.p350n.p351o.C4296c.C4297a;
import p213q.p217b.p317d.p350n.p351o.C4298d;
import p213q.p217b.p317d.p350n.p351o.C4298d.C4299a;
import p213q.p217b.p317d.p350n.p352p.C4302b;
import p213q.p217b.p317d.p350n.p352p.C4302b.C4304b;
import p213q.p217b.p317d.p350n.p352p.C4305c;
import p213q.p217b.p317d.p350n.p352p.C4308e;
import p213q.p217b.p317d.p350n.p352p.C4308e.C4309a;
import p213q.p217b.p317d.p350n.p352p.C4308e.C4310b;
import p213q.p217b.p317d.p354p.C4317f;

/* renamed from: q.b.d.n.f */
public class C4281f implements C4283g {

    /* renamed from: l */
    public static final Object f10293l = new Object();

    /* renamed from: m */
    public static final ThreadFactory f10294m = new C4282a();

    /* renamed from: a */
    public final C3859c f10295a;

    /* renamed from: b */
    public final C4305c f10296b;

    /* renamed from: c */
    public final C4296c f10297c;

    /* renamed from: d */
    public final C4291n f10298d;

    /* renamed from: e */
    public final C4295b f10299e;

    /* renamed from: f */
    public final C4289l f10300f;

    /* renamed from: g */
    public final Object f10301g = new Object();

    /* renamed from: h */
    public final ExecutorService f10302h;

    /* renamed from: i */
    public final ExecutorService f10303i;

    /* renamed from: j */
    public String f10304j = null;

    /* renamed from: k */
    public final List<C4290m> f10305k = new ArrayList();

    /* renamed from: q.b.d.n.f$a */
    public class C4282a implements ThreadFactory {

        /* renamed from: e */
        public final AtomicInteger f10306e = new AtomicInteger(1);

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", new Object[]{Integer.valueOf(this.f10306e.getAndIncrement())}));
        }
    }

    public C4281f(C3859c cVar, C4317f fVar, C4212c cVar2) {
        C3859c cVar3 = cVar;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), f10294m);
        cVar.mo10056a();
        C4305c cVar4 = new C4305c(cVar3.f9459a, fVar, cVar2);
        C4296c cVar5 = new C4296c(cVar3);
        C4291n nVar = new C4291n();
        C4295b bVar = new C4295b(cVar3);
        C4289l lVar = new C4289l();
        this.f10295a = cVar3;
        this.f10296b = cVar4;
        this.f10297c = cVar5;
        this.f10298d = nVar;
        this.f10299e = bVar;
        this.f10300f = lVar;
        this.f10302h = threadPoolExecutor;
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), f10294m);
        this.f10303i = threadPoolExecutor2;
    }

    /* renamed from: h */
    public static C4281f m9773h() {
        C3859c f = C3859c.m9233f();
        C1061o.m2508a(f != null, (Object) "Null is not a valid value of FirebaseApp.");
        f.mo10056a();
        return (C4281f) f.f9462d.mo10075a(C4283g.class);
    }

    /* renamed from: a */
    public final C3255i<C4288k> mo10477a() {
        C3257j jVar = new C3257j();
        C4287j jVar2 = new C4287j(this.f10298d, jVar);
        synchronized (this.f10301g) {
            this.f10305k.add(jVar2);
        }
        return jVar.f8128a;
    }

    /* renamed from: a */
    public final void mo10480a(C4298d dVar, Exception exc) {
        synchronized (this.f10301g) {
            Iterator it = this.f10305k.iterator();
            while (it.hasNext()) {
                if (((C4290m) it.next()).mo10495a(dVar, exc)) {
                    it.remove();
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0069  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10483b(boolean r6) {
        /*
            r5 = this;
            q.b.d.n.o.d r0 = r5.mo10486d()
            boolean r1 = r0.mo10513a()     // Catch:{ IOException -> 0x006b }
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x002c
            r1 = r0
            q.b.d.n.o.a r1 = (p213q.p217b.p317d.p350n.p351o.C4292a) r1     // Catch:{ IOException -> 0x006b }
            q.b.d.n.o.c$a r1 = r1.f10317b     // Catch:{ IOException -> 0x006b }
            q.b.d.n.o.c$a r4 = p213q.p217b.p317d.p350n.p351o.C4296c.C4297a.UNREGISTERED     // Catch:{ IOException -> 0x006b }
            if (r1 != r4) goto L_0x0017
            r1 = r2
            goto L_0x0018
        L_0x0017:
            r1 = r3
        L_0x0018:
            if (r1 == 0) goto L_0x001b
            goto L_0x002c
        L_0x001b:
            if (r6 != 0) goto L_0x0027
            q.b.d.n.n r6 = r5.f10298d     // Catch:{ IOException -> 0x006b }
            boolean r6 = r6.mo10498a(r0)     // Catch:{ IOException -> 0x006b }
            if (r6 == 0) goto L_0x0026
            goto L_0x0027
        L_0x0026:
            return
        L_0x0027:
            q.b.d.n.o.d r6 = r5.mo10479a(r0)     // Catch:{ IOException -> 0x006b }
            goto L_0x0030
        L_0x002c:
            q.b.d.n.o.d r6 = r5.mo10487d(r0)     // Catch:{ IOException -> 0x006b }
        L_0x0030:
            r5.mo10482b(r6)
            if (r6 == 0) goto L_0x0069
            r0 = r6
            q.b.d.n.o.a r0 = (p213q.p217b.p317d.p350n.p351o.C4292a) r0
            q.b.d.n.o.c$a r1 = r0.f10317b
            q.b.d.n.o.c$a r4 = p213q.p217b.p317d.p350n.p351o.C4296c.C4297a.REGISTERED
            if (r1 != r4) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r2 = r3
        L_0x0040:
            if (r2 == 0) goto L_0x0046
            java.lang.String r0 = r0.f10316a
            r5.f10304j = r0
        L_0x0046:
            boolean r0 = r6.mo10513a()
            if (r0 == 0) goto L_0x0054
            q.b.d.n.h r0 = new q.b.d.n.h
            q.b.d.n.h$a r1 = p213q.p217b.p317d.p350n.C4284h.C4285a.BAD_CONFIG
            r0.<init>(r1)
            goto L_0x0061
        L_0x0054:
            boolean r0 = r6.mo10514b()
            if (r0 == 0) goto L_0x0065
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "cleared fid due to auth error"
            r0.<init>(r1)
        L_0x0061:
            r5.mo10480a(r6, r0)
            goto L_0x0068
        L_0x0065:
            r5.mo10489e(r6)
        L_0x0068:
            return
        L_0x0069:
            r6 = 0
            throw r6
        L_0x006b:
            r6 = move-exception
            r5.mo10480a(r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p317d.p350n.C4281f.mo10483b(boolean):void");
    }

    /* renamed from: c */
    public String mo10484c() {
        C3859c cVar = this.f10295a;
        cVar.mo10056a();
        return cVar.f9461c.f9472b;
    }

    /* renamed from: d */
    public final C4298d mo10486d() {
        C4298d a;
        synchronized (f10293l) {
            C3859c cVar = this.f10295a;
            cVar.mo10056a();
            C4277b a2 = C4277b.m9768a(cVar.f9459a, "generatefid.lock");
            try {
                a = this.f10297c.mo10511a();
                if (a2 != null) {
                    a2.mo10473a();
                }
            } catch (Throwable th) {
                if (a2 != null) {
                    a2.mo10473a();
                }
                throw th;
            }
        }
        return a;
    }

    /* renamed from: e */
    public final C4298d mo10488e() {
        C4298d a;
        synchronized (f10293l) {
            C3859c cVar = this.f10295a;
            cVar.mo10056a();
            C4277b a2 = C4277b.m9768a(cVar.f9459a, "generatefid.lock");
            try {
                a = this.f10297c.mo10511a();
                if (a.mo10514b()) {
                    String c = mo10485c(a);
                    C4296c cVar2 = this.f10297c;
                    C4294b bVar = (C4294b) a.mo10499c();
                    bVar.f10323a = c;
                    bVar.mo10504a(C4297a.UNREGISTERED);
                    a = bVar.mo10505a();
                    cVar2.mo10512a(a);
                }
                if (a2 != null) {
                    a2.mo10473a();
                }
            } catch (Throwable th) {
                if (a2 != null) {
                    a2.mo10473a();
                }
                throw th;
            }
        }
        return a;
    }

    /* renamed from: e */
    public final void mo10489e(C4298d dVar) {
        synchronized (this.f10301g) {
            Iterator it = this.f10305k.iterator();
            while (it.hasNext()) {
                if (((C4290m) it.next()).mo10494a(dVar)) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: f */
    public String mo10490f() {
        C3859c cVar = this.f10295a;
        cVar.mo10056a();
        return cVar.f9461c.f9477g;
    }

    /* renamed from: g */
    public final void mo10491g() {
        C1061o.m2528b(mo10484c());
        C1061o.m2528b(mo10490f());
        C1061o.m2528b(mo10481b());
        C1061o.m2508a(C4291n.m9796a(mo10484c()), (Object) "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C1061o.m2508a(C4291n.f10315b.matcher(mo10481b()).matches(), (Object) "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    public C3255i<String> getId() {
        mo10491g();
        C3250f0 f0Var = new C3250f0();
        String str = this.f10304j;
        if (str == null) {
            C4298d e = mo10488e();
            this.f10303i.execute(new C4279d(this));
            str = ((C4292a) e).f10316a;
        }
        f0Var.mo8934b(str);
        return f0Var;
    }

    /* renamed from: a */
    public final C4298d mo10479a(C4298d dVar) {
        C4308e b;
        C4310b bVar;
        C4304b bVar2;
        C4305c cVar = this.f10296b;
        String b2 = mo10481b();
        C4292a aVar = (C4292a) dVar;
        String str = aVar.f10316a;
        String f = mo10490f();
        String str2 = aVar.f10319d;
        if (cVar != null) {
            int i = 0;
            URL url = new URL(String.format("https://%s/%s/%s", new Object[]{"firebaseinstallations.googleapis.com", "v1", String.format("projects/%s/installations/%s/authTokens:generate", new Object[]{f, str})}));
            while (i <= 1) {
                HttpURLConnection a = cVar.mo10523a(url, b2);
                try {
                    a.setRequestMethod("POST");
                    StringBuilder sb = new StringBuilder();
                    sb.append("FIS_v2 ");
                    sb.append(str2);
                    a.addRequestProperty("Authorization", sb.toString());
                    cVar.mo10527c(a);
                    int responseCode = a.getResponseCode();
                    if (responseCode == 200) {
                        b = cVar.mo10526b(a);
                    } else {
                        C4305c.m9821a(a, null, b2, f);
                        if (responseCode != 401) {
                            if (responseCode != 404) {
                                if (responseCode != 429) {
                                    if (responseCode < 500 || responseCode >= 600) {
                                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                        C4309a a2 = C4308e.m9828a();
                                        bVar = C4310b.BAD_CONFIG;
                                        bVar2 = (C4304b) a2;
                                        bVar2.f10351c = bVar;
                                        b = bVar2.mo10522a();
                                    }
                                }
                                i++;
                            }
                        }
                        C4309a a3 = C4308e.m9828a();
                        bVar = C4310b.AUTH_ERROR;
                        bVar2 = (C4304b) a3;
                        bVar2.f10351c = bVar;
                        b = bVar2.mo10522a();
                    }
                    a.disconnect();
                    C4302b bVar3 = (C4302b) b;
                    int ordinal = bVar3.f10348c.ordinal();
                    if (ordinal == 0) {
                        String str3 = bVar3.f10346a;
                        long j = bVar3.f10347b;
                        long a4 = this.f10298d.mo10497a();
                        C4294b bVar4 = (C4294b) dVar.mo10499c();
                        bVar4.f10325c = str3;
                        bVar4.f10327e = Long.valueOf(j);
                        bVar4.f10328f = Long.valueOf(a4);
                        return bVar4.mo10505a();
                    } else if (ordinal == 1) {
                        C4294b bVar5 = (C4294b) dVar.mo10499c();
                        bVar5.f10329g = "BAD CONFIG";
                        bVar5.mo10504a(C4297a.REGISTER_ERROR);
                        return bVar5.mo10505a();
                    } else if (ordinal == 2) {
                        this.f10304j = null;
                        C4299a c = dVar.mo10499c();
                        c.mo10504a(C4297a.NOT_GENERATED);
                        return c.mo10505a();
                    } else {
                        throw new IOException();
                    }
                } finally {
                    a.disconnect();
                }
            }
            throw new IOException();
        }
        throw null;
    }

    /* renamed from: c */
    public final String mo10485c(C4298d dVar) {
        C3859c cVar = this.f10295a;
        cVar.mo10056a();
        if (cVar.f9460b.equals("CHIME_ANDROID_SDK") || this.f10295a.mo10060e()) {
            if (dVar != null) {
                if (((C4292a) dVar).f10317b == C4297a.ATTEMPT_MIGRATION) {
                    String a = this.f10299e.mo10507a();
                    if (TextUtils.isEmpty(a)) {
                        a = this.f10300f.mo10496a();
                    }
                    return a;
                }
            } else {
                throw null;
            }
        }
        return this.f10300f.mo10496a();
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [q.b.d.n.p.d] */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p213q.p217b.p317d.p350n.p351o.C4298d mo10487d(p213q.p217b.p317d.p350n.p351o.C4298d r17) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            q.b.d.n.o.a r0 = (p213q.p217b.p317d.p350n.p351o.C4292a) r0
            java.lang.String r2 = r0.f10316a
            int r2 = r2.length()
            r3 = 11
            r4 = 0
            if (r2 != r3) goto L_0x0018
            q.b.d.n.o.b r2 = r1.f10299e
            java.lang.String r2 = r2.mo10510d()
            goto L_0x0019
        L_0x0018:
            r2 = r4
        L_0x0019:
            q.b.d.n.p.c r3 = r1.f10296b
            java.lang.String r5 = r16.mo10481b()
            java.lang.String r0 = r0.f10316a
            java.lang.String r6 = r16.mo10490f()
            java.lang.String r7 = r16.mo10484c()
            if (r3 == 0) goto L_0x0108
            r4 = 1
            java.lang.Object[] r8 = new java.lang.Object[r4]
            r9 = 0
            r8[r9] = r6
            java.lang.String r10 = "projects/%s/installations"
            java.lang.String r8 = java.lang.String.format(r10, r8)
            java.net.URL r10 = new java.net.URL
            r11 = 3
            java.lang.Object[] r11 = new java.lang.Object[r11]
            java.lang.String r12 = "firebaseinstallations.googleapis.com"
            r11[r9] = r12
            java.lang.String r12 = "v1"
            r11[r4] = r12
            r12 = 2
            r11[r12] = r8
            java.lang.String r8 = "https://%s/%s/%s"
            java.lang.String r8 = java.lang.String.format(r8, r11)
            r10.<init>(r8)
        L_0x0050:
            if (r9 > r4) goto L_0x0102
            java.net.HttpURLConnection r8 = r3.mo10523a(r10, r5)
            java.lang.String r11 = "POST"
            r8.setRequestMethod(r11)     // Catch:{ all -> 0x00fd }
            r8.setDoOutput(r4)     // Catch:{ all -> 0x00fd }
            if (r2 == 0) goto L_0x0065
            java.lang.String r11 = "x-goog-fis-android-iid-migration-auth"
            r8.addRequestProperty(r11, r2)     // Catch:{ all -> 0x00fd }
        L_0x0065:
            r3.mo10525a(r8, r0, r7)     // Catch:{ all -> 0x00fd }
            int r11 = r8.getResponseCode()     // Catch:{ all -> 0x00fd }
            r12 = 200(0xc8, float:2.8E-43)
            if (r11 != r12) goto L_0x0075
            q.b.d.n.p.d r0 = r3.mo10524a(r8)     // Catch:{ all -> 0x00fd }
            goto L_0x0099
        L_0x0075:
            p213q.p217b.p317d.p350n.p352p.C4305c.m9821a(r8, r7, r5, r6)     // Catch:{ all -> 0x00fd }
            r12 = 429(0x1ad, float:6.01E-43)
            if (r11 == r12) goto L_0x00f6
            r12 = 500(0x1f4, float:7.0E-43)
            if (r11 < r12) goto L_0x0085
            r12 = 600(0x258, float:8.41E-43)
            if (r11 >= r12) goto L_0x0085
            goto L_0x00f6
        L_0x0085:
            java.lang.String r0 = "Firebase-Installations"
            java.lang.String r2 = "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase."
            android.util.Log.e(r0, r2)     // Catch:{ all -> 0x00fd }
            r13 = 0
            r12 = 0
            r11 = 0
            r10 = 0
            q.b.d.n.p.d$a r14 = p213q.p217b.p317d.p350n.p352p.C4306d.C4307a.BAD_CONFIG     // Catch:{ all -> 0x00fd }
            q.b.d.n.p.a r0 = new q.b.d.n.p.a     // Catch:{ all -> 0x00fd }
            r15 = 0
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x00fd }
        L_0x0099:
            r8.disconnect()
            q.b.d.n.p.a r0 = (p213q.p217b.p317d.p350n.p352p.C4300a) r0
            q.b.d.n.p.d$a r2 = r0.f10345e
            int r2 = r2.ordinal()
            if (r2 == 0) goto L_0x00c2
            if (r2 != r4) goto L_0x00bc
            q.b.d.n.o.d$a r0 = r17.mo10499c()
            q.b.d.n.o.a$b r0 = (p213q.p217b.p317d.p350n.p351o.C4292a.C4294b) r0
            java.lang.String r2 = "BAD CONFIG"
            r0.f10329g = r2
            q.b.d.n.o.c$a r2 = p213q.p217b.p317d.p350n.p351o.C4296c.C4297a.REGISTER_ERROR
            r0.mo10504a(r2)
            q.b.d.n.o.d r0 = r0.mo10505a()
            return r0
        L_0x00bc:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>()
            throw r0
        L_0x00c2:
            java.lang.String r2 = r0.f10342b
            java.lang.String r3 = r0.f10343c
            q.b.d.n.n r4 = r1.f10298d
            long r4 = r4.mo10497a()
            q.b.d.n.p.e r0 = r0.f10344d
            q.b.d.n.p.b r0 = (p213q.p217b.p317d.p350n.p352p.C4302b) r0
            java.lang.String r6 = r0.f10346a
            long r7 = r0.f10347b
            q.b.d.n.o.d$a r0 = r17.mo10499c()
            q.b.d.n.o.a$b r0 = (p213q.p217b.p317d.p350n.p351o.C4292a.C4294b) r0
            r0.f10323a = r2
            q.b.d.n.o.c$a r2 = p213q.p217b.p317d.p350n.p351o.C4296c.C4297a.REGISTERED
            r0.mo10504a(r2)
            r0.f10325c = r6
            r0.f10326d = r3
            java.lang.Long r2 = java.lang.Long.valueOf(r7)
            r0.f10327e = r2
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r0.f10328f = r2
            q.b.d.n.o.d r0 = r0.mo10505a()
            return r0
        L_0x00f6:
            int r9 = r9 + 1
            r8.disconnect()
            goto L_0x0050
        L_0x00fd:
            r0 = move-exception
            r8.disconnect()
            throw r0
        L_0x0102:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>()
            throw r0
        L_0x0108:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p317d.p350n.C4281f.mo10487d(q.b.d.n.o.d):q.b.d.n.o.d");
    }

    /* renamed from: b */
    public String mo10481b() {
        C3859c cVar = this.f10295a;
        cVar.mo10056a();
        return cVar.f9461c.f9471a;
    }

    /* renamed from: b */
    public final void mo10482b(C4298d dVar) {
        synchronized (f10293l) {
            C3859c cVar = this.f10295a;
            cVar.mo10056a();
            C4277b a = C4277b.m9768a(cVar.f9459a, "generatefid.lock");
            try {
                this.f10297c.mo10512a(dVar);
                if (a != null) {
                    a.mo10473a();
                }
            } catch (Throwable th) {
                if (a != null) {
                    a.mo10473a();
                }
                throw th;
            }
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m9772b(C4281f fVar, boolean z) {
        C4298d e = fVar.mo10488e();
        if (z) {
            C4294b bVar = (C4294b) e.mo10499c();
            bVar.f10325c = null;
            e = bVar.mo10505a();
        }
        fVar.mo10489e(e);
        fVar.f10303i.execute(new C4280e(fVar, z));
    }

    /* renamed from: a */
    public C3255i<C4288k> mo10478a(boolean z) {
        mo10491g();
        C3255i<C4288k> a = mo10477a();
        this.f10302h.execute(new C4278c(this, z));
        return a;
    }
}
