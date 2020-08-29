package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import p213q.p217b.p218a.p231b.p239d.C2115b;
import p213q.p217b.p218a.p231b.p239d.C2121e;
import p213q.p217b.p218a.p231b.p239d.p240m.p241k.C2169e;

@KeepName
public class GoogleApiActivity extends Activity implements OnCancelListener {

    /* renamed from: e */
    public int f1055e = 0;

    /* renamed from: a */
    public static PendingIntent m880a(Context context, PendingIntent pendingIntent, int i) {
        Intent intent = new Intent(context, GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", true);
        return PendingIntent.getActivity(context, 0, intent, 134217728);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f1055e = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                C2169e a = C2169e.m4967a((Context) this);
                if (i2 == -1) {
                    Handler handler = a.f6056m;
                    handler.sendMessage(handler.obtainMessage(3));
                } else if (i2 == 0) {
                    C2115b bVar = new C2115b(13, null);
                    int intExtra = getIntent().getIntExtra("failing_client_id", -1);
                    if (!a.mo7165a(bVar, intExtra)) {
                        Handler handler2 = a.f6056m;
                        handler2.sendMessage(handler2.obtainMessage(5, intExtra, 0, bVar));
                    }
                }
            }
        } else if (i == 2) {
            this.f1055e = 0;
            setResult(i2, intent);
        }
        finish();
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f1055e = 0;
        setResult(0);
        finish();
    }

    public void onCreate(Bundle bundle) {
        int i;
        String str;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f1055e = bundle.getInt("resolution");
        }
        if (this.f1055e != 1) {
            Bundle extras = getIntent().getExtras();
            String str2 = "GoogleApiActivity";
            if (extras == null) {
                str = "Activity started without extras";
            } else {
                PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
                Integer num = (Integer) extras.get("error_code");
                if (pendingIntent == null && num == null) {
                    str = "Activity started without resolution";
                } else if (pendingIntent != null) {
                    try {
                        startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                        this.f1055e = 1;
                        return;
                    } catch (SendIntentException e) {
                        Log.e(str2, "Failed to launch pendingIntent", e);
                    }
                } else {
                    C2121e eVar = C2121e.f5993d;
                    if (num == null) {
                        i = 8;
                    } else {
                        i = num.intValue();
                    }
                    eVar.mo7114a(this, i, 2, this);
                    this.f1055e = 1;
                }
            }
            Log.e(str2, str);
            finish();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f1055e);
        super.onSaveInstanceState(bundle);
    }
}
