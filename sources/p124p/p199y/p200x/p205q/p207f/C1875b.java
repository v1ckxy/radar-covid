package p124p.p199y.p200x.p205q.p207f;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p124p.p199y.C1800l;
import p124p.p199y.p200x.p210t.p212q.C1962a;

/* renamed from: p.y.x.q.f.b */
public class C1875b extends C1876c<Boolean> {

    /* renamed from: i */
    public static final String f5464i = C1800l.m4459a("BatteryNotLowTracker");

    public C1875b(Context context, C1962a aVar) {
        super(context, aVar);
    }

    /* renamed from: a */
    public Object mo6862a() {
        Intent registerReceiver = this.f5470b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver == null) {
            C1800l.m4460a().mo6783b(f5464i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        float intExtra = ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1));
        if (registerReceiver.getIntExtra("status", -1) == 1 || intExtra > 0.15f) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: a */
    public void mo6863a(Context context, Intent intent) {
        Boolean bool;
        if (intent.getAction() != null) {
            C1800l.m4460a().mo6782a(f5464i, String.format("Received %s", new Object[]{intent.getAction()}), new Throwable[0]);
            String action = intent.getAction();
            char c = 65535;
            int hashCode = action.hashCode();
            if (hashCode != -1980154005) {
                if (hashCode == 490310653 && action.equals("android.intent.action.BATTERY_LOW")) {
                    c = 1;
                }
            } else if (action.equals("android.intent.action.BATTERY_OKAY")) {
                c = 0;
            }
            if (c != 0) {
                if (c == 1) {
                    bool = Boolean.valueOf(false);
                }
            }
            bool = Boolean.valueOf(true);
            mo6868a(bool);
        }
    }

    /* renamed from: d */
    public IntentFilter mo6864d() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }
}
