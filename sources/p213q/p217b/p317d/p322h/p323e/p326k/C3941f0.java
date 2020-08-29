package p213q.p217b.p317d.p322h.p323e.p326k;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import p213q.p217b.p218a.p231b.p270l.C3250f0;
import p213q.p217b.p218a.p231b.p270l.C3255i;
import p213q.p217b.p317d.C3859c;
import p213q.p217b.p317d.p322h.p323e.C3912a;
import p213q.p217b.p317d.p322h.p323e.C3913b;
import p213q.p217b.p317d.p322h.p323e.p324i.C3922a;
import p213q.p217b.p317d.p322h.p323e.p325j.C3928a;
import p213q.p217b.p317d.p322h.p323e.p337s.C4166d;
import p213q.p217b.p317d.p322h.p323e.p337s.C4168e;
import p213q.p217b.p317d.p322h.p323e.p337s.p338i.C4176e;

/* renamed from: q.b.d.h.e.k.f0 */
public class C3941f0 {

    /* renamed from: a */
    public final Context f9608a;

    /* renamed from: b */
    public final C3859c f9609b;

    /* renamed from: c */
    public final C3959l0 f9610c;

    /* renamed from: d */
    public final long f9611d = System.currentTimeMillis();

    /* renamed from: e */
    public C3950h0 f9612e;

    /* renamed from: f */
    public C3950h0 f9613f;

    /* renamed from: g */
    public C3975t f9614g;

    /* renamed from: h */
    public final C3970q0 f9615h;

    /* renamed from: i */
    public final C3928a f9616i;

    /* renamed from: j */
    public final C3922a f9617j;

    /* renamed from: k */
    public ExecutorService f9618k;

    /* renamed from: l */
    public C3948h f9619l;

    /* renamed from: m */
    public C3912a f9620m;

    /* renamed from: q.b.d.h.e.k.f0$a */
    public class C3942a implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ C4168e f9621e;

        public C3942a(C4168e eVar) {
            this.f9621e = eVar;
        }

        public void run() {
            C3941f0.m9348a(C3941f0.this, this.f9621e);
        }
    }

    /* renamed from: q.b.d.h.e.k.f0$b */
    public class C3943b implements Callable<Boolean> {
        public C3943b() {
        }

        public Object call() {
            try {
                boolean delete = C3941f0.this.f9612e.mo10142b().delete();
                C3913b bVar = C3913b.f9552c;
                StringBuilder sb = new StringBuilder();
                sb.append("Initialization marker file removed: ");
                sb.append(delete);
                bVar.mo10108a(sb.toString());
                return Boolean.valueOf(delete);
            } catch (Exception e) {
                C3913b bVar2 = C3913b.f9552c;
                if (bVar2.mo10110a(6)) {
                    Log.e(bVar2.f9553a, "Problem encountered deleting Crashlytics initialization marker.", e);
                }
                return Boolean.valueOf(false);
            }
        }
    }

    public C3941f0(C3859c cVar, C3970q0 q0Var, C3912a aVar, C3959l0 l0Var, C3928a aVar2, C3922a aVar3, ExecutorService executorService) {
        this.f9609b = cVar;
        this.f9610c = l0Var;
        cVar.mo10056a();
        this.f9608a = cVar.f9459a;
        this.f9615h = q0Var;
        this.f9620m = aVar;
        this.f9616i = aVar2;
        this.f9617j = aVar3;
        this.f9618k = executorService;
        this.f9619l = new C3948h(executorService);
    }

    /* renamed from: a */
    public static /* synthetic */ C3255i m9348a(C3941f0 f0Var, C4168e eVar) {
        C3255i iVar;
        String str = "Collection of crash reports disabled in Crashlytics settings.";
        f0Var.f9619l.mo10138a();
        f0Var.f9612e.mo10141a();
        C3913b.f9552c.mo10108a("Initialization marker file created.");
        C3975t tVar = f0Var.f9614g;
        C3948h hVar = tVar.f9722e;
        C3964o oVar = new C3964o(tVar);
        if (hVar != null) {
            hVar.mo10137a(new C3951i(hVar, oVar));
            try {
                f0Var.f9616i.mo10118a(new C3937d0(f0Var));
                C4166d dVar = (C4166d) eVar;
                C4176e b = dVar.mo10374b();
                if (!b.mo10377b().f10100a) {
                    C3913b.f9552c.mo10108a(str);
                    RuntimeException runtimeException = new RuntimeException(str);
                    C3250f0 f0Var2 = new C3250f0();
                    f0Var2.mo8929a((Exception) runtimeException);
                    iVar = f0Var2;
                } else {
                    if (!f0Var.f9614g.mo10173a(b.mo10376a().f10101a)) {
                        C3913b.f9552c.mo10108a("Could not finalize previous sessions.");
                    }
                    iVar = f0Var.f9614g.mo10165a(1.0f, dVar.mo10370a());
                }
            } catch (Exception e) {
                C3913b bVar = C3913b.f9552c;
                String str2 = "Crashlytics encountered a problem during asynchronous initialization.";
                if (bVar.mo10110a(6)) {
                    Log.e(bVar.f9553a, str2, e);
                }
                C3250f0 f0Var3 = new C3250f0();
                f0Var3.mo8929a(e);
                iVar = f0Var3;
            } catch (Throwable th) {
                f0Var.mo10131a();
                throw th;
            }
            f0Var.mo10131a();
            return iVar;
        }
        throw null;
    }

    /* renamed from: a */
    public void mo10131a() {
        this.f9619l.mo10137a(new C3943b());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0028, code lost:
        android.util.Log.e(r0, r1, r5);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10132a(p213q.p217b.p317d.p322h.p323e.p337s.C4168e r5) {
        /*
            r4 = this;
            q.b.d.h.e.k.f0$a r0 = new q.b.d.h.e.k.f0$a
            r0.<init>(r5)
            java.util.concurrent.ExecutorService r5 = r4.f9618k
            java.util.concurrent.Future r5 = r5.submit(r0)
            q.b.d.h.e.b r0 = p213q.p217b.p317d.p322h.p323e.C3913b.f9552c
            java.lang.String r1 = "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously."
            r0.mo10108a(r1)
            r0 = 4
            r2 = 6
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x003a, ExecutionException -> 0x002c, TimeoutException -> 0x001b }
            r5.get(r0, r3)     // Catch:{ InterruptedException -> 0x003a, ExecutionException -> 0x002c, TimeoutException -> 0x001b }
            goto L_0x0048
        L_0x001b:
            r5 = move-exception
            q.b.d.h.e.b r0 = p213q.p217b.p317d.p322h.p323e.C3913b.f9552c
            boolean r1 = r0.mo10110a(r2)
            if (r1 == 0) goto L_0x0048
            java.lang.String r0 = r0.f9553a
            java.lang.String r1 = "Crashlytics timed out during initialization."
        L_0x0028:
            android.util.Log.e(r0, r1, r5)
            goto L_0x0048
        L_0x002c:
            r5 = move-exception
            q.b.d.h.e.b r0 = p213q.p217b.p317d.p322h.p323e.C3913b.f9552c
            boolean r1 = r0.mo10110a(r2)
            if (r1 == 0) goto L_0x0048
            java.lang.String r0 = r0.f9553a
            java.lang.String r1 = "Problem encountered during Crashlytics initialization."
            goto L_0x0028
        L_0x003a:
            r5 = move-exception
            q.b.d.h.e.b r0 = p213q.p217b.p317d.p322h.p323e.C3913b.f9552c
            boolean r1 = r0.mo10110a(r2)
            if (r1 == 0) goto L_0x0048
            java.lang.String r0 = r0.f9553a
            java.lang.String r1 = "Crashlytics was interrupted during initialization."
            goto L_0x0028
        L_0x0048:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p317d.p322h.p323e.p326k.C3941f0.mo10132a(q.b.d.h.e.s.e):void");
    }
}
