package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.List;
import p124p.p199y.C1788c;
import p124p.p199y.C1800l;
import p124p.p199y.C1802m;
import p124p.p199y.p200x.p201p.p203b.C1851b;
import p124p.p199y.p200x.p209s.C1913p;

public abstract class ConstraintProxy extends BroadcastReceiver {

    /* renamed from: a */
    public static final String f998a = C1800l.m4459a("ConstraintProxy");

    public static class BatteryChargingProxy extends ConstraintProxy {
    }

    public static class BatteryNotLowProxy extends ConstraintProxy {
    }

    public static class NetworkStateProxy extends ConstraintProxy {
    }

    public static class StorageNotLowProxy extends ConstraintProxy {
    }

    /* renamed from: a */
    public static void m849a(Context context, List<C1913p> list) {
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        for (C1913p pVar : list) {
            C1788c cVar = pVar.f5536j;
            z |= cVar.f5247d;
            z2 |= cVar.f5245b;
            z3 |= cVar.f5248e;
            z4 |= cVar.f5244a != C1802m.f5281e;
            if (z && z2 && z3 && z4) {
                break;
            }
        }
        context.sendBroadcast(ConstraintProxyUpdateReceiver.m850a(context, z, z2, z3, z4));
    }

    public void onReceive(Context context, Intent intent) {
        C1800l.m4460a().mo6782a(f998a, String.format("onReceive : %s", new Object[]{intent}), new Throwable[0]);
        context.startService(C1851b.m4546a(context));
    }
}
