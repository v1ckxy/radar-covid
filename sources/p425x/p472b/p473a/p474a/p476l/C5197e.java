package p425x.p472b.p473a.p474a.p476l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p119o.p120a.C0967p0;
import p425x.p472b.p473a.p474a.p476l.p479m.C5229g;

/* renamed from: x.b.a.a.l.e */
public class C5197e extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if ("android.os.action.POWER_SAVE_WHITELIST_CHANGED".equals(intent.getAction())) {
            C5229g.m11667d("BatteryOptimizationBR", intent.getAction());
            C0967p0.m2234b(context);
        }
    }
}
