package p213q.p217b.p317d.p347l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.concurrent.Callable;

/* renamed from: q.b.d.l.l0 */
public final /* synthetic */ class C4244l0 implements Callable {

    /* renamed from: e */
    public final Context f10221e;

    /* renamed from: f */
    public final Intent f10222f;

    public C4244l0(Context context, Intent intent) {
        this.f10221e = context;
        this.f10222f = intent;
    }

    public final Object call() {
        int i;
        ComponentName componentName;
        Context context = this.f10221e;
        Intent intent = this.f10222f;
        C4268x a = C4268x.m9759a();
        if (a != null) {
            String str = "FirebaseInstanceId";
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Starting service");
            }
            a.f10270d.offer(intent);
            Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
            intent2.setPackage(context.getPackageName());
            String a2 = a.mo10465a(context, intent2);
            if (a2 != null) {
                if (Log.isLoggable(str, 3)) {
                    String str2 = "Restricting intent to a specific service: ";
                    Log.d(str, a2.length() != 0 ? str2.concat(a2) : new String(str2));
                }
                intent2.setClassName(context.getPackageName(), a2);
            }
            try {
                if (a.mo10466a(context)) {
                    componentName = C4231f0.m9723a(context, intent2);
                } else {
                    componentName = context.startService(intent2);
                    Log.d(str, "Missing wake lock permission, service start may be delayed");
                }
                if (componentName == null) {
                    Log.e(str, "Error while delivering the message: ServiceIntent not found.");
                    i = 404;
                } else {
                    i = -1;
                }
            } catch (SecurityException e) {
                Log.e(str, "Error while delivering the message to the serviceIntent", e);
                i = 401;
            } catch (IllegalStateException e2) {
                String valueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(valueOf.length() + 45);
                sb.append("Failed to start service while in background: ");
                sb.append(valueOf);
                Log.e(str, sb.toString());
                i = 402;
            }
            return Integer.valueOf(i);
        }
        throw null;
    }
}
