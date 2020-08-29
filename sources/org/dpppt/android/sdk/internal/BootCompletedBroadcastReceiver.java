package org.dpppt.android.sdk.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p119o.p120a.C0967p0;
import p425x.p472b.p473a.p474a.C5178e;
import p425x.p472b.p473a.p474a.p476l.p479m.C5229g;

public class BootCompletedBroadcastReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if (!"android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
            if (!"android.intent.action.MY_PACKAGE_REPLACED".equals(intent.getAction())) {
                return;
            }
        }
        C5229g.m11666c("BootCompletedBR", intent.getAction());
        if (C5178e.m11623b(context)) {
            SyncWorker.m2317a(context);
            C0967p0.m2234b(context);
        }
    }
}
