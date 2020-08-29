package p425x.p472b.p473a.p474a.p476l;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import java.util.HashSet;
import java.util.Iterator;
import p124p.p150h.p151d.C1318f;
import p124p.p150h.p151d.C1319g;
import p124p.p150h.p151d.C1320h;
import p213q.p214a.p215a.p216a.C1965a;
import p425x.p472b.p473a.p474a.C5178e;
import p425x.p472b.p473a.p474a.C5184h;
import p425x.p472b.p473a.p474a.C5185i;
import p425x.p472b.p473a.p474a.C5186j;
import p425x.p472b.p473a.p474a.C5186j.C5187a;

/* renamed from: x.b.a.a.l.j */
public class C5206j extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String str;
        if ("org.dpppt.android.sdk.ACTION_UPDATE_ERRORS".equals(intent.getAction()) && C5178e.f12367a) {
            C5186j a = C5178e.m11614a(context);
            String str2 = "notification";
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(str2);
            HashSet hashSet = new HashSet(a.f12390d);
            Notification notification = null;
            if (a.f12387a && !hashSet.isEmpty()) {
                String str3 = "dp3t_tracing_service";
                if (VERSION.SDK_INT >= 26) {
                    NotificationManager notificationManager2 = (NotificationManager) context.getSystemService(str2);
                    NotificationChannel notificationChannel = new NotificationChannel(str3, context.getString(C5185i.dp3t_sdk_service_notification_channel), 3);
                    notificationChannel.setLockscreenVisibility(0);
                    notificationManager2.createNotificationChannel(notificationChannel);
                }
                Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
                PendingIntent activity = launchIntentForPackage != null ? PendingIntent.getActivity(context, 0, launchIntentForPackage, 134217728) : null;
                StringBuilder sb = new StringBuilder(context.getString(C5185i.dp3t_sdk_service_notification_errors));
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    C5187a aVar = (C5187a) it.next();
                    sb.append("\n");
                    int i = aVar.f12405e;
                    if (i == -1) {
                        str = null;
                    } else {
                        str = context.getString(i);
                        if (aVar.f12406f != null) {
                            str = C1965a.m4754a(C1965a.m4763b(str, " ("), aVar.f12406f, ")");
                        }
                    }
                    sb.append(str);
                }
                String sb2 = sb.toString();
                C1319g gVar = new C1319g(context, str3);
                gVar.f3982O.icon = C5184h.ic_handshakes;
                gVar.f3990f = activity;
                gVar.mo5788b(context.getString(C5185i.dp3t_sdk_service_notification_title));
                gVar.mo5785a((CharSequence) sb2);
                gVar.mo5787a(8, true);
                C1318f fVar = new C1318f();
                fVar.f3967c = C1319g.m3364c(sb2);
                gVar.mo5786a((C1320h) fVar);
                gVar.f3996l = 2;
                notification = gVar.mo5784a();
            }
            if (notification != null) {
                notificationManager.notify(1827, notification);
            } else {
                notificationManager.cancel(1827);
            }
        }
    }
}
