package p213q.p217b.p218a.p231b.p239d;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import p124p.p170k.p171a.C1477c;

/* renamed from: q.b.a.b.d.l */
public class C2132l extends C1477c {

    /* renamed from: m0 */
    public Dialog f6006m0;

    /* renamed from: n0 */
    public OnCancelListener f6007n0;

    /* renamed from: f */
    public Dialog mo6062f(Bundle bundle) {
        if (this.f6006m0 == null) {
            this.f4341g0 = false;
        }
        return this.f6006m0;
    }

    public void onCancel(DialogInterface dialogInterface) {
        OnCancelListener onCancelListener = this.f6007n0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
