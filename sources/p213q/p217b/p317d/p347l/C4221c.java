package p213q.p217b.p317d.p347l;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import javax.annotation.concurrent.GuardedBy;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p218a.p231b.p270l.C3255i;

/* renamed from: q.b.d.l.c */
public final class C4221c implements C4219b0 {

    /* renamed from: c */
    public static final Object f10176c = new Object();
    @GuardedBy("lock")

    /* renamed from: d */
    public static C4236h0 f10177d;

    /* renamed from: a */
    public final Context f10178a;

    /* renamed from: b */
    public final ExecutorService f10179b;

    public C4221c(Context context, ExecutorService executorService) {
        this.f10178a = context;
        this.f10179b = executorService;
    }

    /* renamed from: a */
    public static C3255i<Integer> m9704a(Context context, Intent intent) {
        String str = "FirebaseInstanceId";
        if (Log.isLoggable(str, 3)) {
            Log.d(str, "Binding to service");
        }
        return m9705a(context, "com.google.firebase.MESSAGING_EVENT").mo10426a(intent).mo8922a(C4252p0.f10234a, C4248n0.f10227a);
    }

    /* renamed from: a */
    public static C4236h0 m9705a(Context context, String str) {
        C4236h0 h0Var;
        synchronized (f10176c) {
            if (f10177d == null) {
                f10177d = new C4236h0(context, str);
            }
            h0Var = f10177d;
        }
        return h0Var;
    }

    /* renamed from: a */
    public final C3255i<Integer> mo10405a(Intent intent) {
        String str = "gcm.rawData64";
        String stringExtra = intent.getStringExtra(str);
        boolean z = false;
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra(str);
        }
        Context context = this.f10178a;
        boolean z2 = C2286e.m5333e() && context.getApplicationInfo().targetSdkVersion >= 26;
        if ((intent.getFlags() & 268435456) != 0) {
            z = true;
        }
        return (!z2 || z) ? C2286e.m5211a((Executor) this.f10179b, (Callable<TResult>) new C4244l0<TResult>(context, intent)).mo8932b(this.f10179b, new C4242k0(context, intent)) : m9704a(context, intent);
    }
}
