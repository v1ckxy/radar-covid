package p124p.p126b.p136q;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* renamed from: p.b.q.b */
public class C1144b extends Drawable {

    /* renamed from: a */
    public final ActionBarContainer f3194a;

    public C1144b(ActionBarContainer actionBarContainer) {
        this.f3194a = actionBarContainer;
    }

    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f3194a;
        if (actionBarContainer.f133l) {
            Drawable drawable = actionBarContainer.f132k;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f130i;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f3194a;
        Drawable drawable3 = actionBarContainer2.f131j;
        if (drawable3 != null && actionBarContainer2.f134m) {
            drawable3.draw(canvas);
        }
    }

    public int getOpacity() {
        return 0;
    }

    public void getOutline(Outline outline) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.f3194a;
        if (actionBarContainer.f133l) {
            drawable = actionBarContainer.f132k;
            if (drawable == null) {
                return;
            }
        } else {
            drawable = actionBarContainer.f130i;
            if (drawable == null) {
                return;
            }
        }
        drawable.getOutline(outline);
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
