package com.google.firebase.iid;

import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p124p.p175m.p176a.C1530a;
import p213q.p217b.p218a.p231b.p270l.C3245d;
import p213q.p217b.p218a.p231b.p270l.C3255i;
import p213q.p217b.p317d.p347l.C4221c;
import p213q.p217b.p317d.p347l.C4232f1;
import p213q.p217b.p317d.p347l.C4252p0;
import p213q.p217b.p317d.p347l.C4273z0;

public final class FirebaseInstanceIdReceiver extends C1530a {

    /* renamed from: c */
    public final ExecutorService f1553c = C4252p0.m9734a();

    /* renamed from: a */
    public static final /* synthetic */ void m1155a(boolean z, PendingResult pendingResult, C3255i iVar) {
        if (z) {
            pendingResult.setResultCode(iVar.mo8936d() ? ((Integer) iVar.mo8931b()).intValue() : 500);
        }
        pendingResult.finish();
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            if (intent2 != null) {
                intent = intent2;
            }
            intent.setComponent(null);
            intent.setPackage(context.getPackageName());
            ("google.com/iid".equals(intent.getStringExtra("from")) ? new C4232f1(this.f1553c) : new C4221c(context, this.f1553c)).mo10405a(intent).mo8924a((Executor) this.f1553c, (C3245d<TResult>) new C4273z0<TResult>(isOrderedBroadcast(), goAsync()));
        }
    }
}
