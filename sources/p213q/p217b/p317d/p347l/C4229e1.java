package p213q.p217b.p317d.p347l;

import android.content.Intent;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.concurrent.Callable;

/* renamed from: q.b.d.l.e1 */
public final /* synthetic */ class C4229e1 implements Callable {

    /* renamed from: e */
    public final Intent f10191e;

    public C4229e1(Intent intent) {
        this.f10191e = intent;
    }

    public final Object call() {
        Intent intent = this.f10191e;
        String stringExtra = intent.getStringExtra("CMD");
        if (stringExtra != null) {
            String str = "FirebaseInstanceId";
            if (Log.isLoggable(str, 3)) {
                String valueOf = String.valueOf(intent.getExtras());
                StringBuilder sb = new StringBuilder(valueOf.length() + stringExtra.length() + 21);
                sb.append("Received command: ");
                sb.append(stringExtra);
                sb.append(" - ");
                sb.append(valueOf);
                Log.d(str, sb.toString());
            }
            if ("RST".equals(stringExtra) || "RST_FULL".equals(stringExtra)) {
                FirebaseInstanceId.m1141g().mo3055b();
            } else if ("SYNC".equals(stringExtra)) {
                FirebaseInstanceId g = FirebaseInstanceId.m1141g();
                FirebaseInstanceId.f1537j.mo10402b(g.mo3059f());
                g.mo3057d();
            }
        }
        return Integer.valueOf(-1);
    }
}
