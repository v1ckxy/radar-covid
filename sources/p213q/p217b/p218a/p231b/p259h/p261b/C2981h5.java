package p213q.p217b.p218a.p231b.p259h.p261b;

import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.C2129i;
import p213q.p217b.p218a.p231b.p239d.C2130j;
import p213q.p217b.p218a.p231b.p239d.p246q.C2284c;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p218a.p231b.p251g.p256e.C2442fc;

/* renamed from: q.b.a.b.h.b.h5 */
public final class C2981h5 extends C3106s3 {

    /* renamed from: a */
    public final C3033l9 f7375a;

    /* renamed from: b */
    public Boolean f7376b;

    /* renamed from: c */
    public String f7377c = null;

    public C2981h5(C3033l9 l9Var) {
        C1061o.m2524b(l9Var);
        this.f7375a = l9Var;
    }

    /* renamed from: a */
    public final List<C3112s9> mo8502a(C3189z9 z9Var, boolean z) {
        mo8517e(z9Var);
        try {
            List<C3134u9> list = (List) ((FutureTask) this.f7375a.mo8283g().mo8841a((Callable<V>) new C3152w5<V>(this, z9Var))).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C3134u9 u9Var : list) {
                if (z || !C3156w9.m7418i(u9Var.f7909c)) {
                    arrayList.add(new C3112s9(u9Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f7375a.mo8285i().f7153f.mo8434a("Failed to get user properties. appId", C2908b4.m6745a(z9Var.f8017e), e);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo8503a(long j, String str, String str2, String str3) {
        C3174y5 y5Var = new C3174y5(this, str2, str3, str, j);
        mo8505a((Runnable) y5Var);
    }

    /* renamed from: a */
    public final void mo8507a(C2998ia iaVar) {
        C1061o.m2524b(iaVar);
        C1061o.m2524b(iaVar.f7420g);
        mo8506a(iaVar.f7418e, true);
        mo8505a((Runnable) new C3042m5(this, new C2998ia(iaVar)));
    }

    /* renamed from: a */
    public final void mo8508a(C2998ia iaVar, C3189z9 z9Var) {
        C1061o.m2524b(iaVar);
        C1061o.m2524b(iaVar.f7420g);
        mo8517e(z9Var);
        C2998ia iaVar2 = new C2998ia(iaVar);
        iaVar2.f7418e = z9Var.f8017e;
        mo8505a((Runnable) new C3163x5(this, iaVar2, z9Var));
    }

    /* renamed from: a */
    public final void mo8509a(C3047n nVar, String str, String str2) {
        C1061o.m2524b(nVar);
        C1061o.m2528b(str);
        mo8506a(str, true);
        mo8505a((Runnable) new C3097r5(this, nVar, str));
    }

    /* renamed from: a */
    public final void mo8510a(C3047n nVar, C3189z9 z9Var) {
        C1061o.m2524b(nVar);
        mo8517e(z9Var);
        mo8505a((Runnable) new C3108s5(this, nVar, z9Var));
    }

    /* renamed from: a */
    public final void mo8511a(C3112s9 s9Var, C3189z9 z9Var) {
        C1061o.m2524b(s9Var);
        mo8517e(z9Var);
        mo8505a((Runnable) new C3119t5(this, s9Var, z9Var));
    }

    /* renamed from: a */
    public final void mo8512a(C3189z9 z9Var) {
        mo8517e(z9Var);
        mo8505a((Runnable) new C3141v5(this, z9Var));
    }

    /* renamed from: b */
    public final void mo8514b(C3189z9 z9Var) {
        mo8517e(z9Var);
        mo8505a((Runnable) new C3005j5(this, z9Var));
    }

    /* renamed from: c */
    public final String mo8515c(C3189z9 z9Var) {
        mo8517e(z9Var);
        C3033l9 l9Var = this.f7375a;
        try {
            return (String) ((FutureTask) l9Var.f7537i.mo8283g().mo8841a((Callable<V>) new C3079p9<V>(l9Var, z9Var))).get(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            l9Var.f7537i.mo8285i().f7153f.mo8434a("Failed to get app instance id. appId", C2908b4.m6745a(z9Var.f8017e), e);
            return null;
        }
    }

    /* renamed from: d */
    public final void mo8516d(C3189z9 z9Var) {
        mo8506a(z9Var.f8017e, false);
        mo8505a((Runnable) new C3075p5(this, z9Var));
    }

    /* renamed from: e */
    public final void mo8517e(C3189z9 z9Var) {
        C1061o.m2524b(z9Var);
        mo8506a(z9Var.f8017e, false);
        this.f7375a.f7537i.mo8473p().mo8801a(z9Var.f8018f, z9Var.f8034v, z9Var.f8038z);
    }

    /* renamed from: a */
    public final List<C2998ia> mo8500a(String str, String str2, C3189z9 z9Var) {
        mo8517e(z9Var);
        try {
            return (List) ((FutureTask) this.f7375a.mo8283g().mo8841a((Callable<V>) new C3053n5<V>(this, z9Var, str, str2))).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f7375a.mo8285i().f7153f.mo8433a("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    /* renamed from: a */
    public final List<C2998ia> mo8498a(String str, String str2, String str3) {
        mo8506a(str, true);
        try {
            return (List) ((FutureTask) this.f7375a.mo8283g().mo8841a((Callable<V>) new C3086q5<V>(this, str, str2, str3))).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f7375a.mo8285i().f7153f.mo8433a("Failed to get conditional user properties as", e);
            return Collections.emptyList();
        }
    }

    /* renamed from: a */
    public final List<C3112s9> mo8499a(String str, String str2, String str3, boolean z) {
        mo8506a(str, true);
        try {
            List<C3134u9> list = (List) ((FutureTask) this.f7375a.mo8283g().mo8841a((Callable<V>) new C3064o5<V>(this, str, str2, str3))).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C3134u9 u9Var : list) {
                if (z || !C3156w9.m7418i(u9Var.f7909c)) {
                    arrayList.add(new C3112s9(u9Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f7375a.mo8285i().f7153f.mo8434a("Failed to get user properties as. appId", C2908b4.m6745a(str), e);
            return Collections.emptyList();
        }
    }

    /* renamed from: a */
    public final List<C3112s9> mo8501a(String str, String str2, boolean z, C3189z9 z9Var) {
        mo8517e(z9Var);
        try {
            List<C3134u9> list = (List) ((FutureTask) this.f7375a.mo8283g().mo8841a((Callable<V>) new C3029l5<V>(this, z9Var, str, str2))).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C3134u9 u9Var : list) {
                if (z || !C3156w9.m7418i(u9Var.f7909c)) {
                    arrayList.add(new C3112s9(u9Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f7375a.mo8285i().f7153f.mo8434a("Failed to query user properties. appId", C2908b4.m6745a(z9Var.f8017e), e);
            return Collections.emptyList();
        }
    }

    /* renamed from: a */
    public final void mo8504a(Bundle bundle, C3189z9 z9Var) {
        if (C2442fc.m5827b() && this.f7375a.f7537i.f7338g.mo8574a(C3069p.f7695O0)) {
            mo8517e(z9Var);
            mo8505a((Runnable) new C3017k5(this, z9Var, bundle));
        }
    }

    /* renamed from: a */
    public final void mo8505a(Runnable runnable) {
        C1061o.m2524b(runnable);
        if (this.f7375a.mo8283g().mo8845s()) {
            runnable.run();
            return;
        }
        C3184z4 g = this.f7375a.mo8283g();
        g.mo8846n();
        C1061o.m2524b(runnable);
        g.mo8843a(new C2945e5<>(g, runnable, "Task exception on worker thread"));
    }

    /* renamed from: a */
    public final void mo8506a(String str, boolean z) {
        boolean z2;
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                try {
                    if (this.f7376b == null) {
                        if (!"com.google.android.gms".equals(this.f7377c) && !C2286e.m5260a(this.f7375a.f7537i.f7332a, Binder.getCallingUid())) {
                            if (!C2130j.m4929a(this.f7375a.f7537i.f7332a).mo7118a(Binder.getCallingUid())) {
                                z2 = false;
                                this.f7376b = Boolean.valueOf(z2);
                            }
                        }
                        z2 = true;
                        this.f7376b = Boolean.valueOf(z2);
                    }
                    if (this.f7376b.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e) {
                    this.f7375a.mo8285i().f7153f.mo8433a("Measurement Service called with invalid calling package. appId", C2908b4.m6745a(str));
                    throw e;
                }
            }
            if (this.f7377c == null && C2129i.m4925a(this.f7375a.f7537i.f7332a, Binder.getCallingUid(), str)) {
                this.f7377c = str;
            }
            if (!str.equals(this.f7377c)) {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", new Object[]{str}));
            }
            return;
        }
        String str2 = "Measurement Service called without app package";
        this.f7375a.mo8285i().f7153f.mo8432a(str2);
        throw new SecurityException(str2);
    }

    /* renamed from: a */
    public final byte[] mo8513a(C3047n nVar, String str) {
        C1061o.m2528b(str);
        C1061o.m2524b(nVar);
        mo8506a(str, true);
        this.f7375a.mo8285i().f7160m.mo8433a("Log and bundle. event", this.f7375a.mo8622l().mo8834a(nVar.f7582e));
        if (((C2284c) this.f7375a.f7537i.f7345n) != null) {
            long nanoTime = System.nanoTime() / 1000000;
            C3184z4 g = this.f7375a.mo8283g();
            C3130u5 u5Var = new C3130u5(this, nVar, str);
            g.mo8846n();
            C1061o.m2524b(u5Var);
            C2945e5 e5Var = new C2945e5(g, u5Var, true, "Task exception on worker thread");
            if (Thread.currentThread() == g.f8000c) {
                e5Var.run();
            } else {
                g.mo8843a(e5Var);
            }
            try {
                byte[] bArr = (byte[]) e5Var.get();
                if (bArr == null) {
                    this.f7375a.mo8285i().f7153f.mo8433a("Log and bundle returned null. appId", C2908b4.m6745a(str));
                    bArr = new byte[0];
                }
                if (((C2284c) this.f7375a.f7537i.f7345n) != null) {
                    this.f7375a.mo8285i().f7160m.mo8435a("Log and bundle processed. event, size, time_ms", this.f7375a.mo8622l().mo8834a(nVar.f7582e), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - nanoTime));
                    return bArr;
                }
                throw null;
            } catch (InterruptedException | ExecutionException e) {
                this.f7375a.mo8285i().f7153f.mo8435a("Failed to log and bundle. appId, event, error", C2908b4.m6745a(str), this.f7375a.mo8622l().mo8834a(nVar.f7582e), e);
                return null;
            }
        } else {
            throw null;
        }
    }
}
