package p213q.p217b.p218a.p271c.p287q;

import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.widget.ImageView;
import p213q.p217b.p218a.p271c.p285o.C3427b;

/* renamed from: q.b.a.c.q.a */
public class C3435a implements OnLayoutChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C3436b f8662a;

    public C3435a(C3436b bVar) {
        this.f8662a = bVar;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.f8662a.f8670k.getVisibility() == 0) {
            C3436b bVar = this.f8662a;
            ImageView imageView = bVar.f8670k;
            if (bVar.mo9237a()) {
                C3427b.m7835a(bVar.f8678s, imageView, null);
            }
        }
    }
}
