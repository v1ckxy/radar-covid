package p213q.p217b.p218a.p271c.p295x;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0099a0;
import androidx.recyclerview.widget.RecyclerView.C0137z;
import p124p.p180p.p181d.C1600o;

/* renamed from: q.b.a.c.x.t */
public class C3490t extends LinearLayoutManager {

    /* renamed from: q.b.a.c.x.t$a */
    public class C3491a extends C1600o {
        public C3491a(C3490t tVar, Context context) {
            super(context);
        }

        /* renamed from: a */
        public float mo6343a(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }
    }

    public C3490t(Context context, int i, boolean z) {
        super(i, z);
    }

    /* renamed from: a */
    public void mo898a(RecyclerView recyclerView, C0099a0 a0Var, int i) {
        C3491a aVar = new C3491a(this, recyclerView.getContext());
        aVar.f838a = i;
        mo1209a((C0137z) aVar);
    }
}
