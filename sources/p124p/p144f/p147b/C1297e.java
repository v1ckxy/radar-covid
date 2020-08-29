package p124p.p144f.p147b;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout.C0064a;

/* renamed from: p.f.b.e */
public class C1297e extends View {
    public C1297e(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public void draw(Canvas canvas) {
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i) {
        C0064a aVar = (C0064a) getLayoutParams();
        aVar.f454a = i;
        setLayoutParams(aVar);
    }

    public void setGuidelineEnd(int i) {
        C0064a aVar = (C0064a) getLayoutParams();
        aVar.f456b = i;
        setLayoutParams(aVar);
    }

    public void setGuidelinePercent(float f) {
        C0064a aVar = (C0064a) getLayoutParams();
        aVar.f458c = f;
        setLayoutParams(aVar);
    }

    public void setVisibility(int i) {
    }
}
