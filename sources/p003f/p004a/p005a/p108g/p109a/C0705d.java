package p003f.p004a.p005a.p108g.p109a;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import p124p.p170k.p171a.C1482e;

/* renamed from: f.a.a.g.a.d */
public final class C0705d implements OnClickListener {

    /* renamed from: e */
    public final /* synthetic */ C0706e f2155e;

    /* renamed from: f */
    public final /* synthetic */ boolean f2156f;

    public C0705d(C0706e eVar, boolean z) {
        this.f2155e = eVar;
        this.f2156f = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (this.f2156f) {
            C1482e Q = this.f2155e.mo777Q();
            if (Q != null) {
                Q.finish();
            }
        }
    }
}
