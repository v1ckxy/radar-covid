package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p124p.p199y.C1800l;
import p124p.p199y.p200x.C1842l;

public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final String f1003a = C1800l.m4459a("RescheduleReceiver");

    public void onReceive(Context context, Intent intent) {
        C1800l.m4460a().mo6782a(f1003a, String.format("Received intent %s", new Object[]{intent}), new Throwable[0]);
        try {
            C1842l.m4517a(context).mo6814a(goAsync());
        } catch (IllegalStateException unused) {
            C1800l.m4460a().mo6783b(f1003a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", new Throwable[0]);
        }
    }
}
