package p425x.p472b.p473a.p474a.p476l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p119o.p120a.C0967p0;
import p425x.p472b.p473a.p474a.p476l.p479m.C5229g;

/* renamed from: x.b.a.a.l.f */
public class C5198f extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String str = "android.bluetooth.adapter.action.STATE_CHANGED";
        if (str.equals(intent.getAction())) {
            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1);
            if (intExtra == 10 || intExtra == 12) {
                C5229g.m11667d("BluetoothStateBR", str);
                C0967p0.m2234b(context);
            }
        }
    }
}
