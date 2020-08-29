package p002es.gob.radarcovid.common.base.broadcast;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Handler;
import es.gob.radarcovid.R;
import p002es.gob.radarcovid.features.splash.view.SplashActivity;
import p003f.p004a.p005a.p006a.p010d.C0496w;
import p003f.p004a.p005a.p006a.p010d.C0497x;
import p003f.p004a.p005a.p006a.p010d.C0498y;
import p003f.p004a.p005a.p006a.p010d.C0499z;
import p003f.p004a.p005a.p006a.p011e.C0500a;
import p003f.p004a.p005a.p108g.p109a.p110h.C0710a;
import p003f.p004a.p005a.p108g.p109a.p110h.C0711b;
import p124p.p150h.p151d.C1319g;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p365r.p366a.C4416a;
import p365r.p366a.C4419c;
import p365r.p366a.C4422e;
import p392u.C4557i;
import p392u.C4560l;
import p392u.p401r.p402b.C4607a;
import p392u.p401r.p402b.C4618l;
import p392u.p401r.p403c.C4638h;
import p425x.p472b.p473a.p474a.C5178e;
import p425x.p472b.p473a.p474a.C5183g;
import p425x.p472b.p473a.p474a.C5186j;
import p425x.p482c.p483a.C5244a;

/* renamed from: es.gob.radarcovid.common.base.broadcast.ExposureStatusChangeBroadcastReceiver */
public final class ExposureStatusChangeBroadcastReceiver extends C4419c {

    /* renamed from: a */
    public C0499z f1695a;

    /* renamed from: b */
    public C0500a f1696b;

    /* renamed from: es.gob.radarcovid.common.base.broadcast.ExposureStatusChangeBroadcastReceiver$a */
    public static final class C0384a implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ Context f1697e;

        /* renamed from: f */
        public final /* synthetic */ ExposureStatusChangeBroadcastReceiver f1698f;

        public C0384a(Context context, ExposureStatusChangeBroadcastReceiver exposureStatusChangeBroadcastReceiver) {
            this.f1697e = context;
            this.f1698f = exposureStatusChangeBroadcastReceiver;
        }

        public final void run() {
            if (ExposureStatusChangeBroadcastReceiver.m1299a(this.f1698f, this.f1697e)) {
                ExposureStatusChangeBroadcastReceiver exposureStatusChangeBroadcastReceiver = this.f1698f;
                Context context = this.f1697e;
                if (exposureStatusChangeBroadcastReceiver != null) {
                    Object systemService = context.getSystemService("notification");
                    if (systemService != null) {
                        NotificationManager notificationManager = (NotificationManager) systemService;
                        if (VERSION.SDK_INT >= 26) {
                            NotificationChannel notificationChannel = new NotificationChannel(context.getPackageName(), context.getString(R.string.app_name), 4);
                            notificationChannel.setLockscreenVisibility(0);
                            notificationManager.createNotificationChannel(notificationChannel);
                        }
                        Intent intent = new Intent(context, SplashActivity.class);
                        intent.setFlags(67108864);
                        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 134217728);
                        C1319g gVar = new C1319g(context, context.getPackageName());
                        C0500a aVar = exposureStatusChangeBroadcastReceiver.f1696b;
                        String str = "labelManager";
                        if (aVar != null) {
                            gVar.mo5788b(aVar.mo3714a("NOTIFICATION_TITLE_EXPOSURE_HIGH", aVar.f1897b.getText(R.string.exposure_high_notification_title)));
                            C0500a aVar2 = exposureStatusChangeBroadcastReceiver.f1696b;
                            if (aVar2 != null) {
                                String a = aVar2.mo3716a("NOTIFICATION_MESSAGE_EXPOSURE_HIGH", aVar2.mo3715a());
                                String string = context.getString(R.string.exposure_high_notification);
                                C4638h.m10270a((Object) string, "context.getString(R.stri…posure_high_notification)");
                                gVar.mo5785a((CharSequence) C2286e.m5284b(a, string));
                                gVar.f3996l = 2;
                                gVar.f3982O.icon = R.drawable.ic_handshakes;
                                gVar.f3990f = activity;
                                gVar.mo5787a(16, true);
                                notificationManager.notify(1, gVar.mo5784a());
                                C0499z zVar = this.f1698f.f1695a;
                                if (zVar != null) {
                                    C2286e.m5250a((C4618l<? super T, C4560l>) C0496w.f1892f, (C4618l<? super Throwable, C4560l>) C0497x.f1893f, (C4607a<? extends C5244a<? extends Throwable, ? extends T>>) new C0498y<Object>(zVar));
                                } else {
                                    C4638h.m10273b("reportMatchUseCase");
                                    throw null;
                                }
                            } else {
                                C4638h.m10273b(str);
                                throw null;
                            }
                        } else {
                            C4638h.m10273b(str);
                            throw null;
                        }
                    } else {
                        throw new C4557i("null cannot be cast to non-null type android.app.NotificationManager");
                    }
                } else {
                    throw null;
                }
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ boolean m1299a(ExposureStatusChangeBroadcastReceiver exposureStatusChangeBroadcastReceiver, Context context) {
        if (exposureStatusChangeBroadcastReceiver != null) {
            C5186j a = C5178e.m11614a(context);
            C4638h.m10270a((Object) a, "DP3T.getStatus(context)");
            return a.f12389c == C5183g.f12384f;
        }
        throw null;
    }

    public void onReceive(Context context, Intent intent) {
        C2286e.m5279b(this, "broadcastReceiver");
        C2286e.m5279b(context, "context");
        Application application = (Application) context.getApplicationContext();
        if (application instanceof C4422e) {
            C4422e eVar = (C4422e) application;
            C4416a k = eVar.mo10710k();
            C2286e.m5182a(k, "%s.androidInjector() returned null", (Object) eVar.getClass());
            k.mo3887a(this);
            String action = intent != null ? intent.getAction() : null;
            if (action != null) {
                int hashCode = action.hashCode();
                if (hashCode != -1292610705) {
                    if (hashCode == 693141898 && action.equals("com.google.android.gms.exposurenotification.ACTION_EXPOSURE_STATE_UPDATED")) {
                        new Handler().postDelayed(new C0384a(context, this), 1000);
                    }
                } else if (action.equals("org.dpppt.android.sdk.ACTION_UPDATE")) {
                    C0710a aVar = C0710a.f2168b;
                    C0710a.f2167a.mo10694a(new C0711b());
                }
            }
        } else {
            throw new RuntimeException(String.format("%s does not implement %s", new Object[]{application.getClass().getCanonicalName(), C4422e.class.getCanonicalName()}));
        }
    }
}
