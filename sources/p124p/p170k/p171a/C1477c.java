package p124p.p170k.p171a;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import p124p.p170k.p171a.C1490k.C1498h;
import p124p.p170k.p171a.C1490k.C1499i;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: p.k.a.c */
public class C1477c extends Fragment implements OnCancelListener, OnDismissListener {

    /* renamed from: b0 */
    public Handler f4336b0;

    /* renamed from: c0 */
    public Runnable f4337c0 = new C1478a();

    /* renamed from: d0 */
    public int f4338d0 = 0;

    /* renamed from: e0 */
    public int f4339e0 = 0;

    /* renamed from: f0 */
    public boolean f4340f0 = true;

    /* renamed from: g0 */
    public boolean f4341g0 = true;

    /* renamed from: h0 */
    public int f4342h0 = -1;

    /* renamed from: i0 */
    public Dialog f4343i0;

    /* renamed from: j0 */
    public boolean f4344j0;

    /* renamed from: k0 */
    public boolean f4345k0;

    /* renamed from: l0 */
    public boolean f4346l0;

    /* renamed from: p.k.a.c$a */
    public class C1478a implements Runnable {
        public C1478a() {
        }

        public void run() {
            C1477c cVar = C1477c.this;
            Dialog dialog = cVar.f4343i0;
            if (dialog != null) {
                cVar.onDismiss(dialog);
            }
        }
    }

    /* renamed from: a */
    public void mo790a(Context context) {
        super.mo790a(context);
        if (!this.f4346l0) {
            this.f4345k0 = false;
        }
    }

    /* renamed from: a */
    public void mo792a(Bundle bundle) {
        this.f592I = true;
        if (this.f4341g0) {
            View view = this.f594K;
            if (view != null) {
                if (view.getParent() == null) {
                    this.f4343i0.setContentView(view);
                } else {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
            }
            C1482e Q = mo777Q();
            if (Q != null) {
                this.f4343i0.setOwnerActivity(Q);
            }
            this.f4343i0.setCancelable(this.f4340f0);
            this.f4343i0.setOnCancelListener(this);
            this.f4343i0.setOnDismissListener(this);
            if (bundle != null) {
                Bundle bundle2 = bundle.getBundle("android:savedDialogState");
                if (bundle2 != null) {
                    this.f4343i0.onRestoreInstanceState(bundle2);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo799b(Bundle bundle) {
        super.mo799b(bundle);
        this.f4336b0 = new Handler();
        this.f4341g0 = this.f584A == 0;
        if (bundle != null) {
            this.f4338d0 = bundle.getInt("android:style", 0);
            this.f4339e0 = bundle.getInt("android:theme", 0);
            this.f4340f0 = bundle.getBoolean("android:cancelable", true);
            this.f4341g0 = bundle.getBoolean("android:showsDialog", this.f4341g0);
            this.f4342h0 = bundle.getInt("android:backStackId", -1);
        }
    }

    /* renamed from: c */
    public LayoutInflater mo802c(Bundle bundle) {
        Context context;
        if (!this.f4341g0) {
            return super.mo802c(bundle);
        }
        Dialog f = mo6062f(bundle);
        this.f4343i0 = f;
        String str = "layout_inflater";
        if (f != null) {
            int i = this.f4338d0;
            if (!(i == 1 || i == 2)) {
                if (i == 3) {
                    f.getWindow().addFlags(24);
                }
                context = this.f4343i0.getContext();
            }
            f.requestWindowFeature(1);
            context = this.f4343i0.getContext();
        } else {
            context = this.f628w.f4362f;
        }
        return (LayoutInflater) context.getSystemService(str);
    }

    /* renamed from: d */
    public void mo805d(Bundle bundle) {
        Dialog dialog = this.f4343i0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            if (onSaveInstanceState != null) {
                bundle.putBundle("android:savedDialogState", onSaveInstanceState);
            }
        }
        int i = this.f4338d0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f4339e0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.f4340f0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.f4341g0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.f4342h0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    /* renamed from: f */
    public Dialog mo6062f(Bundle bundle) {
        throw null;
    }

    /* renamed from: i0 */
    public void mo815i0() {
        this.f592I = true;
        Dialog dialog = this.f4343i0;
        if (dialog != null) {
            this.f4344j0 = true;
            dialog.setOnDismissListener(null);
            this.f4343i0.dismiss();
            if (!this.f4345k0) {
                onDismiss(this.f4343i0);
            }
            this.f4343i0 = null;
        }
    }

    /* renamed from: j0 */
    public void mo816j0() {
        this.f592I = true;
        if (!this.f4346l0 && !this.f4345k0) {
            this.f4345k0 = true;
        }
    }

    /* renamed from: m0 */
    public void mo819m0() {
        this.f592I = true;
        Dialog dialog = this.f4343i0;
        if (dialog != null) {
            this.f4344j0 = false;
            dialog.show();
        }
    }

    /* renamed from: n0 */
    public void mo820n0() {
        this.f592I = true;
        Dialog dialog = this.f4343i0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f4344j0 && !this.f4345k0) {
            this.f4345k0 = true;
            this.f4346l0 = false;
            Dialog dialog = this.f4343i0;
            if (dialog != null) {
                dialog.setOnDismissListener(null);
                this.f4343i0.dismiss();
            }
            this.f4344j0 = true;
            if (this.f4342h0 >= 0) {
                C1488j o0 = mo821o0();
                int i = this.f4342h0;
                C1490k kVar = (C1490k) o0;
                if (kVar == null) {
                    throw null;
                } else if (i >= 0) {
                    kVar.mo6116a((C1498h) new C1499i(null, i, 1), false);
                    this.f4342h0 = -1;
                } else {
                    throw new IllegalArgumentException(C1965a.m4761b("Bad id: ", i));
                }
            } else {
                C1490k kVar2 = (C1490k) mo821o0();
                if (kVar2 != null) {
                    C1472a aVar = new C1472a(kVar2);
                    aVar.mo6026a((Fragment) this);
                    aVar.mo6025a(true);
                    return;
                }
                throw null;
            }
        }
    }
}
