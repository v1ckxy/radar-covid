package p124p.p180p.p181d;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0099a0;
import androidx.recyclerview.widget.RecyclerView.C0137z.C0138a;

/* renamed from: p.p.d.y */
public class C1614y extends C1600o {

    /* renamed from: q */
    public final /* synthetic */ C1612x f4745q;

    public C1614y(C1612x xVar, Context context) {
        this.f4745q = xVar;
        super(context);
    }

    /* renamed from: a */
    public float mo6343a(DisplayMetrics displayMetrics) {
        return 100.0f / ((float) displayMetrics.densityDpi);
    }

    /* renamed from: a */
    public void mo1280a(View view, C0099a0 a0Var, C0138a aVar) {
        C1612x xVar = this.f4745q;
        RecyclerView recyclerView = xVar.f4740a;
        if (recyclerView != null) {
            int[] a = xVar.mo6351a(recyclerView.getLayoutManager(), view);
            int i = a[0];
            int i2 = a[1];
            int b = mo6345b(Math.max(Math.abs(i), Math.abs(i2)));
            if (b > 0) {
                aVar.mo1281a(i, i2, b, this.f4719j);
            }
        }
    }
}
