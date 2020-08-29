package p213q.p217b.p317d.p347l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import javax.annotation.Nullable;

/* renamed from: q.b.d.l.c0 */
public final class C4222c0 extends BroadcastReceiver {
    @Nullable

    /* renamed from: a */
    public C4225d0 f10180a;

    public C4222c0(C4225d0 d0Var) {
        this.f10180a = d0Var;
    }

    /* renamed from: a */
    public final void mo10407a() {
        if (FirebaseInstanceId.m1142h()) {
            Log.d("FirebaseInstanceId", "Connectivity change received registered");
        }
        this.f10180a.mo10409a().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public final void onReceive(Context context, Intent intent) {
        C4225d0 d0Var = this.f10180a;
        if (d0Var != null && d0Var.mo10410b()) {
            if (FirebaseInstanceId.m1142h()) {
                Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
            }
            FirebaseInstanceId.m1139a(this.f10180a, 0);
            this.f10180a.mo10409a().unregisterReceiver(this);
            this.f10180a = null;
        }
    }
}
