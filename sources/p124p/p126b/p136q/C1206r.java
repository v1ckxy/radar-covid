package p124p.p126b.p136q;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import p124p.p126b.C1018a;

/* renamed from: p.b.q.r */
public class C1206r extends RatingBar {

    /* renamed from: e */
    public final C1202p f3410e;

    public C1206r(Context context, AttributeSet attributeSet) {
        int i = C1018a.ratingBarStyle;
        super(context, attributeSet, i);
        C1202p pVar = new C1202p(this);
        this.f3410e = pVar;
        pVar.mo5288a(attributeSet, i);
    }

    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = this.f3410e.f3399b;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
