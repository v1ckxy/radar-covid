package p213q.p217b.p218a.p271c.p295x;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0099a0;
import androidx.recyclerview.widget.RecyclerView.C0119n;
import java.util.Calendar;
import p124p.p150h.p161k.C1383c;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;

/* renamed from: q.b.a.c.x.g */
public class C3475g extends C0119n {

    /* renamed from: a */
    public final Calendar f8860a = C2286e.m5311c();

    /* renamed from: b */
    public final Calendar f8861b = C2286e.m5311c();

    /* renamed from: c */
    public final /* synthetic */ C3468f f8862c;

    public C3475g(C3468f fVar) {
        this.f8862c = fVar;
    }

    /* renamed from: a */
    public void mo1196a(Canvas canvas, RecyclerView recyclerView, C0099a0 a0Var) {
        int i;
        int i2;
        if ((recyclerView.getAdapter() instanceof C3493v) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            C3493v vVar = (C3493v) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            for (C1383c cVar : this.f8862c.f8843d0.mo9414k()) {
                F f = cVar.f4140a;
                if (!(f == null || cVar.f4141b == null)) {
                    this.f8860a.setTimeInMillis(((Long) f).longValue());
                    this.f8861b.setTimeInMillis(((Long) cVar.f4141b).longValue());
                    int b = vVar.mo9452b(this.f8860a.get(1));
                    int b2 = vVar.mo9452b(this.f8861b.get(1));
                    View b3 = gridLayoutManager.mo903b(b);
                    View b4 = gridLayoutManager.mo903b(b2);
                    int i3 = gridLayoutManager.f678I;
                    int i4 = b / i3;
                    int i5 = b2 / i3;
                    for (int i6 = i4; i6 <= i5; i6++) {
                        View b5 = gridLayoutManager.mo903b(gridLayoutManager.f678I * i6);
                        if (b5 != null) {
                            int top = b5.getTop() + this.f8862c.f8847h0.f8829d.f8820a.top;
                            int bottom = b5.getBottom() - this.f8862c.f8847h0.f8829d.f8820a.bottom;
                            if (i6 == i4) {
                                i = (b3.getWidth() / 2) + b3.getLeft();
                            } else {
                                i = 0;
                            }
                            if (i6 == i5) {
                                i2 = (b4.getWidth() / 2) + b4.getLeft();
                            } else {
                                i2 = recyclerView.getWidth();
                            }
                            Canvas canvas2 = canvas;
                            canvas2.drawRect((float) i, (float) top, (float) i2, (float) bottom, this.f8862c.f8847h0.f8833h);
                        }
                    }
                }
            }
        }
    }
}
