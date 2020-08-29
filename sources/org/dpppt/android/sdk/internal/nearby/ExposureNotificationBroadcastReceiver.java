package org.dpppt.android.sdk.internal.nearby;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.nearby.exposurenotification.ExposureSummary;
import java.util.Iterator;
import org.dpppt.android.sdk.models.DayDate;
import org.dpppt.android.sdk.models.ExposureDay;
import p119o.p120a.C0967p0;
import p425x.p472b.p473a.p474a.p476l.C5195d;
import p425x.p472b.p473a.p474a.p476l.C5199g;
import p425x.p472b.p473a.p474a.p476l.C5199g.C5201b;
import p425x.p472b.p473a.p474a.p476l.p479m.C5228f;
import p425x.p472b.p473a.p474a.p476l.p479m.C5229g;
import p425x.p472b.p473a.p474a.p476l.p481o.C5243a;

public class ExposureNotificationBroadcastReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        StringBuilder sb = new StringBuilder();
        sb.append("received ");
        sb.append(action);
        C5229g.m11666c("ENBroadcastReceiver", sb.toString());
        if ("com.google.android.gms.exposurenotification.ACTION_EXPOSURE_STATE_UPDATED".equals(action)) {
            ExposureSummary exposureSummary = (ExposureSummary) intent.getParcelableExtra("com.google.android.gms.exposurenotification.EXTRA_EXPOSURE_SUMMARY");
            C5195d b = C5195d.m11631b(context);
            int[] c = exposureSummary.mo1623c();
            if ((b.f12413a.getFloat("attenuationFactorMedium", 0.5f) * ((float) c[1])) + (b.f12413a.getFloat("attenuationFactorLow", 1.0f) * ((float) c[0])) >= ((float) b.f12413a.getInt("minDurationForExposure", 15))) {
                C5228f fVar = C5228f.DEBUG;
                ExposureDay exposureDay = new ExposureDay(-1, new DayDate().subtractDays(exposureSummary.f1122e), System.currentTimeMillis());
                C5199g a = C5199g.m11639a(context);
                C5201b b2 = a.mo11943b();
                Iterator it = b2.iterator();
                while (it.hasNext()) {
                    if (((ExposureDay) it.next()).getExposedDate().equals(exposureDay.getExposedDate())) {
                        return;
                    }
                }
                String str = "last_id";
                int i = a.f12416a.getInt(str, 0) + 1;
                exposureDay.setId(i);
                b2.add(exposureDay);
                a.f12416a.edit().putInt(str, i).putString("exposureDays", C5243a.m11696a(b2)).apply();
                context.sendBroadcast(new Intent("org.dpppt.android.sdk.ACTION_UPDATE"));
                return;
            }
            C5228f fVar2 = C5228f.DEBUG;
        } else if ("com.google.android.gms.settings.EXPOSURE_NOTIFICATION_SETTINGS".equals(action)) {
            C0967p0.m2234b(context);
        }
    }
}
