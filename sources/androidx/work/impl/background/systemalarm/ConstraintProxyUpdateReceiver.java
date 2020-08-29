package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.BroadcastReceiver.PendingResult;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy.BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy.BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy.NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy.StorageNotLowProxy;
import p124p.p199y.C1800l;
import p124p.p199y.p200x.C1842l;
import p124p.p199y.p200x.p210t.C1936g;
import p124p.p199y.p200x.p210t.p212q.C1963b;

public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final String f999a = C1800l.m4459a("ConstrntProxyUpdtRecvr");

    /* renamed from: androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver$a */
    public class C0184a implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ Intent f1000e;

        /* renamed from: f */
        public final /* synthetic */ Context f1001f;

        /* renamed from: g */
        public final /* synthetic */ PendingResult f1002g;

        public C0184a(ConstraintProxyUpdateReceiver constraintProxyUpdateReceiver, Intent intent, Context context, PendingResult pendingResult) {
            this.f1000e = intent;
            this.f1001f = context;
            this.f1002g = pendingResult;
        }

        public void run() {
            try {
                boolean booleanExtra = this.f1000e.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.f1000e.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.f1000e.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.f1000e.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                C1800l.m4460a().mo6782a(ConstraintProxyUpdateReceiver.f999a, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", new Object[]{Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)}), new Throwable[0]);
                C1936g.m4705a(this.f1001f, BatteryNotLowProxy.class, booleanExtra);
                C1936g.m4705a(this.f1001f, BatteryChargingProxy.class, booleanExtra2);
                C1936g.m4705a(this.f1001f, StorageNotLowProxy.class, booleanExtra3);
                C1936g.m4705a(this.f1001f, NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f1002g.finish();
            }
        }
    }

    /* renamed from: a */
    public static Intent m850a(Context context, boolean z, boolean z2, boolean z3, boolean z4) {
        Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent.setComponent(new ComponentName(context, ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z4);
        return intent;
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            C1800l.m4460a().mo6782a(f999a, String.format("Ignoring unknown action %s", new Object[]{action}), new Throwable[0]);
            return;
        }
        PendingResult goAsync = goAsync();
        ((C1963b) C1842l.m4517a(context).f5351d).f5626a.execute(new C0184a(this, intent, context, goAsync));
    }
}
