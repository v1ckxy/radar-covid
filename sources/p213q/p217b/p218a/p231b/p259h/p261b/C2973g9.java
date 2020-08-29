package p213q.p217b.p218a.p231b.p259h.p261b;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import p213q.p217b.p218a.p231b.p239d.p246q.C2284c;
import p213q.p217b.p218a.p231b.p251g.p256e.C2720va;

/* renamed from: q.b.a.b.h.b.g9 */
public final class C2973g9 {

    /* renamed from: a */
    public final /* synthetic */ C3166x8 f7362a;

    public C2973g9(C3166x8 x8Var) {
        this.f7362a = x8Var;
    }

    /* renamed from: a */
    public final void mo8488a() {
        this.f7362a.mo8279c();
        C3063o4 l = this.f7362a.mo8288l();
        if (((C2284c) this.f7362a.f7133a.f7345n) == null) {
            throw null;
        } else if (l.mo8664a(System.currentTimeMillis())) {
            this.f7362a.mo8288l().f7635r.mo8696a(true);
            RunningAppProcessInfo runningAppProcessInfo = new RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.f7362a.mo8285i().f7161n.mo8432a("Detected application was in foreground");
                if (((C2284c) this.f7362a.f7133a.f7345n) != null) {
                    mo8490b(System.currentTimeMillis(), false);
                    return;
                }
                throw null;
            }
        }
    }

    /* renamed from: b */
    public final void mo8490b(long j, boolean z) {
        this.f7362a.mo8279c();
        if (this.f7362a.f7133a.mo8464b()) {
            this.f7362a.mo8288l().f7638u.mo8709a(j);
            if (((C2284c) this.f7362a.f7133a.f7345n) != null) {
                String str = "Session started, time";
                this.f7362a.mo8285i().f7161n.mo8433a(str, Long.valueOf(SystemClock.elapsedRealtime()));
                Long valueOf = Long.valueOf(j / 1000);
                this.f7362a.mo8297o().mo8564a("auto", "_sid", (Object) valueOf, j);
                this.f7362a.mo8288l().f7635r.mo8696a(false);
                Bundle bundle = new Bundle();
                bundle.putLong("_sid", valueOf.longValue());
                if (this.f7362a.f7133a.f7338g.mo8574a(C3069p.f7745q0) && z) {
                    bundle.putLong("_aib", 1);
                }
                this.f7362a.mo8297o().mo8558a("auto", "_s", j, bundle);
                if (C2720va.m6498b() && this.f7362a.f7133a.f7338g.mo8574a(C3069p.f7755v0)) {
                    String a = this.f7362a.mo8288l().f7643z.mo8749a();
                    if (!TextUtils.isEmpty(a)) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("_ffr", a);
                        this.f7362a.mo8297o().mo8558a("auto", "_ssr", j, bundle2);
                    }
                }
                return;
            }
            throw null;
        }
    }

    /* renamed from: a */
    public final void mo8489a(long j, boolean z) {
        this.f7362a.mo8279c();
        this.f7362a.mo8825y();
        if (this.f7362a.mo8288l().mo8664a(j)) {
            this.f7362a.mo8288l().f7635r.mo8696a(true);
        }
        this.f7362a.mo8288l().f7638u.mo8709a(j);
        if (this.f7362a.mo8288l().f7635r.mo8697a()) {
            mo8490b(j, z);
        }
    }
}
