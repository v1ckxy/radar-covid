package p213q.p217b.p218a.p231b.p239d;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.TypedValue;
import p124p.p126b.p127k.C1061o;
import p124p.p150h.p151d.C1317e;
import p124p.p150h.p151d.C1318f;
import p124p.p150h.p151d.C1319g;
import p124p.p150h.p151d.C1320h;
import p124p.p170k.p171a.C1472a;
import p124p.p170k.p171a.C1482e;
import p124p.p170k.p171a.C1488j;
import p124p.p170k.p171a.C1490k;
import p213q.p217b.p218a.p231b.p238c.C2111a;
import p213q.p217b.p218a.p231b.p238c.C2112b;
import p213q.p217b.p218a.p231b.p239d.p242n.C2262p;
import p213q.p217b.p218a.p231b.p239d.p242n.C2264q;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p218a.p231b.p251g.p253b.C2323d;

/* renamed from: q.b.a.b.d.e */
public class C2121e extends C2124f {

    /* renamed from: c */
    public static final Object f5992c = new Object();

    /* renamed from: d */
    public static final C2121e f5993d = new C2121e();

    @SuppressLint({"HandlerLeak"})
    /* renamed from: q.b.a.b.d.e$a */
    public class C2122a extends C2323d {

        /* renamed from: a */
        public final Context f5994a;

        public C2122a(Context context) {
            super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
            this.f5994a = context.getApplicationContext();
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                StringBuilder sb = new StringBuilder(50);
                sb.append("Don't know how to handle this message: ");
                sb.append(i);
                Log.w("GoogleApiAvailability", sb.toString());
                return;
            }
            int a = C2121e.this.mo7109a(this.f5994a);
            PendingIntent pendingIntent = null;
            if (C2121e.this == null) {
                throw null;
            } else if (C2129i.m4927b(a)) {
                C2121e eVar = C2121e.this;
                Context context = this.f5994a;
                Intent a2 = eVar.mo7111a(context, a, "n");
                if (a2 != null) {
                    pendingIntent = PendingIntent.getActivity(context, 0, a2, 134217728);
                }
                eVar.mo7113a(context, a, pendingIntent);
            }
        }
    }

    /* renamed from: a */
    public int mo7109a(Context context) {
        return mo7110a(context, C2124f.f5996a);
    }

    /* renamed from: a */
    public int mo7110a(Context context, int i) {
        return super.mo7110a(context, i);
    }

    /* renamed from: a */
    public Intent mo7111a(Context context, int i, String str) {
        return super.mo7111a(context, i, str);
    }

    /* renamed from: a */
    public final String mo7112a() {
        synchronized (f5992c) {
        }
        return null;
    }

    /* renamed from: a */
    public boolean mo7114a(Activity activity, int i, int i2, OnCancelListener onCancelListener) {
        Dialog dialog;
        C2264q qVar = new C2264q(super.mo7111a(activity, i, "d"), activity, i2);
        if (i == 0) {
            dialog = null;
        } else {
            TypedValue typedValue = new TypedValue();
            activity.getTheme().resolveAttribute(16843529, typedValue, true);
            Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new Builder(activity, 5) : null;
            if (builder == null) {
                builder = new Builder(activity);
            }
            builder.setMessage(C2262p.m5117b(activity, i));
            if (onCancelListener != null) {
                builder.setOnCancelListener(onCancelListener);
            }
            Resources resources = activity.getResources();
            int i3 = i != 1 ? i != 2 ? i != 3 ? 17039370 : C2112b.common_google_play_services_enable_button : C2112b.common_google_play_services_update_button : C2112b.common_google_play_services_install_button;
            String string = resources.getString(i3);
            if (string != null) {
                builder.setPositiveButton(string, qVar);
            }
            String a = C2262p.m5113a((Context) activity, i);
            if (a != null) {
                builder.setTitle(a);
            }
            dialog = builder.create();
        }
        if (dialog == null) {
            return false;
        }
        String str = "GooglePlayServicesErrorDialog";
        String str2 = "Cannot display null dialog";
        if (activity instanceof C1482e) {
            C1488j J = ((C1482e) activity).mo6067J();
            C2132l lVar = new C2132l();
            C1061o.m2525b(dialog, (Object) str2);
            dialog.setOnCancelListener(null);
            dialog.setOnDismissListener(null);
            lVar.f6006m0 = dialog;
            if (onCancelListener != null) {
                lVar.f6007n0 = onCancelListener;
            }
            lVar.f4345k0 = false;
            lVar.f4346l0 = true;
            C1490k kVar = (C1490k) J;
            if (kVar != null) {
                C1472a aVar = new C1472a(kVar);
                aVar.mo6029a(0, lVar, str, 1);
                aVar.mo6024a();
            } else {
                throw null;
            }
        } else {
            FragmentManager fragmentManager = activity.getFragmentManager();
            C2117c cVar = new C2117c();
            C1061o.m2525b(dialog, (Object) str2);
            dialog.setOnCancelListener(null);
            dialog.setOnDismissListener(null);
            cVar.f5983e = dialog;
            if (onCancelListener != null) {
                cVar.f5984f = onCancelListener;
            }
            cVar.show(fragmentManager, str);
        }
        return true;
    }

    @TargetApi(20)
    /* renamed from: a */
    public final void mo7113a(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        String str = "GoogleApiAvailability";
        Log.w(str, String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", new Object[]{Integer.valueOf(i), null}), new IllegalArgumentException());
        if (i == 18) {
            new C2122a(context).sendEmptyMessageDelayed(1, 120000);
        } else if (pendingIntent == null) {
            if (i == 6) {
                Log.w(str, "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
            }
        } else {
            String a = i == 6 ? C2262p.m5114a(context, "common_google_play_services_resolution_required_title") : C2262p.m5113a(context, i);
            if (a == null) {
                a = context.getResources().getString(C2112b.common_google_play_services_notification_ticker);
            }
            String a2 = (i == 6 || i == 19) ? C2262p.m5115a(context, "common_google_play_services_resolution_required_text", C2262p.m5116b(context)) : C2262p.m5117b(context, i);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            C1319g gVar = new C1319g(context, null);
            gVar.f4008x = true;
            gVar.mo5787a(16, true);
            gVar.mo5788b(a);
            C1318f fVar = new C1318f();
            fVar.f3967c = C1319g.m3364c(a2);
            gVar.mo5786a((C1320h) fVar);
            if (C1061o.m2535b(context)) {
                C1061o.m2533b(true);
                gVar.f3982O.icon = context.getApplicationInfo().icon;
                gVar.f3996l = 2;
                if (C1061o.m2545c(context)) {
                    gVar.f3986b.add(new C1317e(C2111a.common_full_open_on_phone, resources.getString(C2112b.common_open_on_phone), pendingIntent));
                } else {
                    gVar.f3990f = pendingIntent;
                }
            } else {
                gVar.f3982O.icon = 17301642;
                gVar.f3982O.tickerText = C1319g.m3364c(resources.getString(C2112b.common_google_play_services_notification_ticker));
                gVar.f3982O.when = System.currentTimeMillis();
                gVar.f3990f = pendingIntent;
                gVar.mo5785a((CharSequence) a2);
            }
            if (C2286e.m5333e()) {
                C1061o.m2533b(C2286e.m5333e());
                mo7112a();
                String str2 = "com.google.android.gms.availability";
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel(str2);
                String a3 = C2262p.m5112a(context);
                if (notificationChannel == null) {
                    notificationChannel = new NotificationChannel(str2, a3, 4);
                } else {
                    if (!a3.contentEquals(notificationChannel.getName())) {
                        notificationChannel.setName(a3);
                    }
                    gVar.f3976I = str2;
                }
                notificationManager.createNotificationChannel(notificationChannel);
                gVar.f3976I = str2;
            }
            Notification a4 = gVar.mo5784a();
            if (i == 1 || i == 2 || i == 3) {
                i2 = 10436;
                C2129i.f6002d.set(false);
            } else {
                i2 = 39789;
            }
            notificationManager.notify(i2, a4);
        }
    }
}
