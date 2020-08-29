package p124p.p144f.p147b;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout.C0064a;

/* renamed from: p.f.b.f */
public class C1298f extends View {

    /* renamed from: e */
    public int f3928e;

    /* renamed from: f */
    public View f3929f;

    /* renamed from: g */
    public int f3930g;

    public View getContent() {
        return this.f3929f;
    }

    public int getEmptyVisibility() {
        return this.f3930g;
    }

    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize((float) rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Align.LEFT);
            String str = "?";
            paint.getTextBounds(str, 0, 1, rect);
            canvas.drawText(str, ((((float) width) / 2.0f) - (((float) rect.width()) / 2.0f)) - ((float) rect.left), ((((float) rect.height()) / 2.0f) + (((float) height) / 2.0f)) - ((float) rect.bottom), paint);
        }
    }

    public void setContentId(int i) {
        if (this.f3928e != i) {
            View view = this.f3929f;
            if (view != null) {
                view.setVisibility(0);
                ((C0064a) this.f3929f.getLayoutParams()).f453Z = false;
                this.f3929f = null;
            }
            this.f3928e = i;
            if (i != -1) {
                View findViewById = ((View) getParent()).findViewById(i);
                if (findViewById != null) {
                    findViewById.setVisibility(8);
                }
            }
        }
    }

    public void setEmptyVisibility(int i) {
        this.f3930g = i;
    }
}
