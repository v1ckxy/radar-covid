package p124p.p170k.p171a;

import android.view.View;
import androidx.fragment.app.Fragment;

/* renamed from: p.k.a.d */
public class C1480d extends C1484f {

    /* renamed from: a */
    public final /* synthetic */ Fragment f4349a;

    public C1480d(Fragment fragment) {
        this.f4349a = fragment;
    }

    /* renamed from: a */
    public View mo6065a(int i) {
        View view = this.f4349a.f594K;
        if (view != null) {
            return view.findViewById(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" does not have a view");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public boolean mo6066a() {
        return this.f4349a.f594K != null;
    }
}
