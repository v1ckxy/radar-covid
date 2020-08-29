package p213q.p217b.p218a.p231b.p259h.p261b;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p246q.C2284c;

@TargetApi(14)
/* renamed from: q.b.a.b.h.b.g7 */
public final class C2971g7 implements ActivityLifecycleCallbacks {

    /* renamed from: e */
    public final /* synthetic */ C3018k6 f7360e;

    public /* synthetic */ C2971g7(C3018k6 k6Var, C3030l6 l6Var) {
        this.f7360e = k6Var;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            this.f7360e.mo8285i().f7161n.mo8432a("onActivityCreated");
            Intent intent = activity.getIntent();
            if (intent != null) {
                Uri data = intent.getData();
                if (data != null) {
                    if (data.isHierarchical()) {
                        this.f7360e.mo8287k();
                        String str = C3156w9.m7407a(intent) ? "gs" : "auto";
                        String queryParameter = data.getQueryParameter("referrer");
                        boolean z = bundle == null;
                        C3184z4 g = this.f7360e.mo8283g();
                        C2959f7 f7Var = new C2959f7(this, z, data, str, queryParameter);
                        g.mo8846n();
                        C1061o.m2524b(f7Var);
                        g.mo8843a(new C2945e5<>(g, f7Var, "Task exception on worker thread"));
                    }
                }
            }
        } catch (Exception e) {
            this.f7360e.mo8285i().f7153f.mo8433a("Throwable caught in onActivityCreated", e);
        } catch (Throwable th) {
            this.f7360e.mo8300r().mo8673a(activity, bundle);
            throw th;
        }
        this.f7360e.mo8300r().mo8673a(activity, bundle);
    }

    public final void onActivityDestroyed(Activity activity) {
        this.f7360e.mo8300r().mo8680c(activity);
    }

    public final void onActivityPaused(Activity activity) {
        this.f7360e.mo8300r().mo8679b(activity);
        C3166x8 t = this.f7360e.mo8302t();
        if (((C2284c) t.f7133a.f7345n) != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C3184z4 g = t.mo8283g();
            C3188z8 z8Var = new C3188z8(t, elapsedRealtime);
            g.mo8846n();
            C1061o.m2524b(z8Var);
            g.mo8843a(new C2945e5<>(g, z8Var, "Task exception on worker thread"));
            return;
        }
        throw null;
    }

    public final void onActivityResumed(Activity activity) {
        C3166x8 t = this.f7360e.mo8302t();
        if (((C2284c) t.f7133a.f7345n) != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C3184z4 g = t.mo8283g();
            C2901a9 a9Var = new C2901a9(t, elapsedRealtime);
            g.mo8846n();
            C1061o.m2524b(a9Var);
            g.mo8843a(new C2945e5<>(g, a9Var, "Task exception on worker thread"));
            this.f7360e.mo8300r().mo8672a(activity);
            return;
        }
        throw null;
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C3066o7 r = this.f7360e.mo8300r();
        if (r.f7133a.f7338g.mo8587r().booleanValue() && bundle != null) {
            C3044m7 m7Var = (C3044m7) r.f7653f.get(activity);
            if (m7Var != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putLong("id", m7Var.f7569c);
                bundle2.putString("name", m7Var.f7567a);
                bundle2.putString("referrer_name", m7Var.f7568b);
                bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
            }
        }
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
