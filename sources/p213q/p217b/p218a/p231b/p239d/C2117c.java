package p213q.p217b.p218a.p231b.p239d;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;

/* renamed from: q.b.a.b.d.c */
public class C2117c extends DialogFragment {

    /* renamed from: e */
    public Dialog f5983e;

    /* renamed from: f */
    public OnCancelListener f5984f;

    public void onCancel(DialogInterface dialogInterface) {
        OnCancelListener onCancelListener = this.f5984f;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (this.f5983e == null) {
            setShowsDialog(false);
        }
        return this.f5983e;
    }

    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
