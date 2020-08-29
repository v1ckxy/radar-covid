package p213q.p217b.p218a.p231b.p239d.p242n;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.util.Log;

/* renamed from: q.b.a.b.d.n.r */
public abstract class C2266r implements OnClickListener {
    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            C2264q qVar = (C2264q) this;
            Intent intent = qVar.f6225e;
            if (intent != null) {
                qVar.f6226f.startActivityForResult(intent, qVar.f6227g);
            }
        } catch (ActivityNotFoundException e) {
            Log.e("DialogRedirect", "Failed to start resolution intent", e);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
