package p124p.p199y.p200x.p205q.p207f;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p124p.p199y.C1800l;
import p124p.p199y.p200x.p210t.p212q.C1962a;

/* renamed from: p.y.x.q.f.f */
public class C1883f extends C1876c<Boolean> {

    /* renamed from: i */
    public static final String f5482i = C1800l.m4459a("StorageNotLowTracker");

    public C1883f(Context context, C1962a aVar) {
        super(context, aVar);
    }

    /* renamed from: a */
    public Object mo6862a() {
        Context context = this.f5470b;
        IntentFilter intentFilter = new IntentFilter();
        String str = "android.intent.action.DEVICE_STORAGE_OK";
        intentFilter.addAction(str);
        String str2 = "android.intent.action.DEVICE_STORAGE_LOW";
        intentFilter.addAction(str2);
        Intent registerReceiver = context.registerReceiver(null, intentFilter);
        if (!(registerReceiver == null || registerReceiver.getAction() == null)) {
            String action = registerReceiver.getAction();
            char c = 65535;
            int hashCode = action.hashCode();
            if (hashCode != -1181163412) {
                if (hashCode == -730838620 && action.equals(str)) {
                    c = 0;
                }
            } else if (action.equals(str2)) {
                c = 1;
            }
            if (c != 0) {
                if (c != 1) {
                    return null;
                }
                return Boolean.valueOf(false);
            }
        }
        return Boolean.valueOf(true);
    }

    /* renamed from: a */
    public void mo6863a(Context context, Intent intent) {
        Boolean bool;
        if (intent.getAction() != null) {
            C1800l.m4460a().mo6782a(f5482i, String.format("Received %s", new Object[]{intent.getAction()}), new Throwable[0]);
            String action = intent.getAction();
            char c = 65535;
            int hashCode = action.hashCode();
            if (hashCode != -1181163412) {
                if (hashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                    c = 0;
                }
            } else if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                c = 1;
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
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }
}
