package p213q.p217b.p218a.p271c.p281j0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable.Callback;
import android.view.View;
import p213q.p217b.p218a.p271c.p278g0.C3337g;
import p213q.p217b.p218a.p271c.p278g0.C3342j;

/* renamed from: q.b.a.c.j0.g */
public class C3379g extends C3337g {

    /* renamed from: A */
    public final Paint f8490A;

    /* renamed from: B */
    public final RectF f8491B;

    /* renamed from: C */
    public int f8492C;

    public C3379g() {
        this(null);
    }

    public C3379g(C3342j jVar) {
        if (jVar == null) {
            jVar = new C3342j();
        }
        super(jVar);
        Paint paint = new Paint(1);
        this.f8490A = paint;
        paint.setStyle(Style.FILL_AND_STROKE);
        this.f8490A.setColor(-1);
        this.f8490A.setXfermode(new PorterDuffXfermode(Mode.DST_OUT));
        this.f8491B = new RectF();
    }

    /* renamed from: a */
    public void mo9146a(float f, float f2, float f3, float f4) {
        RectF rectF = this.f8491B;
        if (f != rectF.left || f2 != rectF.top || f3 != rectF.right || f4 != rectF.bottom) {
            this.f8491B.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        Callback callback = getCallback();
        if (callback instanceof View) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, null);
            }
        } else {
            this.f8492C = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), null);
        }
        super.draw(canvas);
        canvas.drawRect(this.f8491B, this.f8490A);
        if (!(getCallback() instanceof View)) {
            canvas.restoreToCount(this.f8492C);
        }
    }
}
