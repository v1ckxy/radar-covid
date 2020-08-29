package p124p.p126b.p136q;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

/* renamed from: p.b.q.g0 */
public class C1170g0 implements OnItemSelectedListener {

    /* renamed from: e */
    public final /* synthetic */ C1172h0 f3282e;

    public C1170g0(C1172h0 h0Var) {
        this.f3282e = h0Var;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        if (i != -1) {
            C1157c0 c0Var = this.f3282e.f3300g;
            if (c0Var != null) {
                c0Var.setListSelectionHidden(false);
            }
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
