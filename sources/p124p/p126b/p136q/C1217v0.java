package p124p.p126b.p136q;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window.Callback;
import p124p.p126b.p134p.p135i.C1102a;

/* renamed from: p.b.q.v0 */
public class C1217v0 implements OnClickListener {

    /* renamed from: e */
    public final C1102a f3446e;

    /* renamed from: f */
    public final /* synthetic */ C1219w0 f3447f;

    public C1217v0(C1219w0 w0Var) {
        this.f3447f = w0Var;
        C1102a aVar = new C1102a(this.f3447f.f3452a.getContext(), 0, 16908332, 0, 0, this.f3447f.f3460i);
        this.f3446e = aVar;
    }

    public void onClick(View view) {
        C1219w0 w0Var = this.f3447f;
        Callback callback = w0Var.f3463l;
        if (callback != null && w0Var.f3464m) {
            callback.onMenuItemSelected(0, this.f3446e);
        }
    }
}
