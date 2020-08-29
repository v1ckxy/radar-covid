package p124p.p126b.p136q;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p124p.p126b.C1018a;

/* renamed from: p.b.q.s */
public class C1208s extends SeekBar {

    /* renamed from: e */
    public final C1210t f3412e;

    public C1208s(Context context, AttributeSet attributeSet) {
        int i = C1018a.seekBarStyle;
        super(context, attributeSet, i);
        C1210t tVar = new C1210t(this);
        this.f3412e = tVar;
        tVar.mo5288a(attributeSet, i);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1210t tVar = this.f3412e;
        Drawable drawable = tVar.f3418e;
        if (drawable != null && drawable.isStateful() && drawable.setState(tVar.f3417d.getDrawableState())) {
            tVar.f3417d.invalidateDrawable(drawable);
        }
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f3412e.f3418e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f3412e.mo5310a(canvas);
    }
}
