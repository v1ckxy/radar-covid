package p213q.p217b.p218a.p231b.p259h.p261b;

import android.os.Bundle;
import android.os.SystemClock;
import p213q.p217b.p218a.p231b.p239d.p246q.C2284c;
import p213q.p217b.p218a.p231b.p251g.p256e.C2478hb;
import p213q.p217b.p218a.p231b.p251g.p256e.C2672sb;
import p213q.p217b.p218a.p231b.p251g.p256e.C2688tb;
import p213q.p217b.p218a.p231b.p251g.p256e.C2737wb;

/* renamed from: q.b.a.b.h.b.e9 */
public final class C2949e9 {

    /* renamed from: a */
    public long f7288a;

    /* renamed from: b */
    public long f7289b;

    /* renamed from: c */
    public final C2963g f7290c = new C2985h9(this, this.f7291d.f7133a);

    /* renamed from: d */
    public final /* synthetic */ C3166x8 f7291d;

    public C2949e9(C3166x8 x8Var) {
        this.f7291d = x8Var;
        if (((C2284c) x8Var.f7133a.f7345n) != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f7288a = elapsedRealtime;
            this.f7289b = elapsedRealtime;
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public final boolean mo8441a(boolean z, boolean z2, long j) {
        this.f7291d.mo8279c();
        this.f7291d.mo8373v();
        if (!C2478hb.m5915b() || !this.f7291d.f7133a.f7338g.mo8574a(C3069p.f7667A0)) {
            if (((C2284c) this.f7291d.f7133a.f7345n) != null) {
                j = SystemClock.elapsedRealtime();
            } else {
                throw null;
            }
        }
        if (!C2672sb.m6380b() || !this.f7291d.f7133a.f7338g.mo8574a(C3069p.f7757w0) || this.f7291d.f7133a.mo8464b()) {
            C3107s4 s4Var = this.f7291d.mo8288l().f7638u;
            if (((C2284c) this.f7291d.f7133a.f7345n) != null) {
                s4Var.mo8709a(System.currentTimeMillis());
            } else {
                throw null;
            }
        }
        long j2 = j - this.f7288a;
        if (z || j2 >= 1000) {
            if (this.f7291d.f7133a.f7338g.mo8574a(C3069p.f7706U) && !z2) {
                if (!((C2737wb) C2688tb.f6900f.mo7405a()).mo8068a() || !this.f7291d.f7133a.f7338g.mo8574a(C3069p.f7708W) || !C2478hb.m5915b() || !this.f7291d.f7133a.f7338g.mo8574a(C3069p.f7667A0)) {
                    j2 = mo8440a();
                } else {
                    j2 = j - this.f7289b;
                    this.f7289b = j;
                }
            }
            this.f7291d.mo8285i().f7161n.mo8433a("Recording user engagement, ms", Long.valueOf(j2));
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j2);
            C3066o7.m7152a(this.f7291d.mo8300r().mo8671a(!this.f7291d.f7133a.f7338g.mo8587r().booleanValue()), bundle, true);
            if (this.f7291d.f7133a.f7338g.mo8574a(C3069p.f7706U) && !this.f7291d.f7133a.f7338g.mo8574a(C3069p.f7707V) && z2) {
                bundle.putLong("_fr", 1);
            }
            if (!this.f7291d.f7133a.f7338g.mo8574a(C3069p.f7707V) || !z2) {
                this.f7291d.mo8297o().mo8561a("auto", "_e", bundle);
            }
            this.f7288a = j;
            this.f7290c.mo8459b();
            this.f7290c.mo8458a(3600000);
            return true;
        }
        this.f7291d.mo8285i().f7161n.mo8433a("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j2));
        return false;
    }

    /* renamed from: a */
    public final long mo8440a() {
        if (((C2284c) this.f7291d.f7133a.f7345n) != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.f7289b;
            this.f7289b = elapsedRealtime;
            return j;
        }
        throw null;
    }
}
