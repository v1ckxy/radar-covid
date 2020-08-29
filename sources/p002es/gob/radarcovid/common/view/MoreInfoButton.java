package p002es.gob.radarcovid.common.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import es.gob.radarcovid.R;
import p392u.p401r.p403c.C4636f;
import p392u.p401r.p403c.C4638h;

/* renamed from: es.gob.radarcovid.common.view.MoreInfoButton */
public final class MoreInfoButton extends ConstraintLayout {
    public MoreInfoButton(Context context) {
        this(context, null, 0, 6, null);
    }

    public MoreInfoButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public MoreInfoButton(Context context, AttributeSet attributeSet, int i) {
        if (context != null) {
            super(context, attributeSet, i);
            LayoutInflater.from(context).inflate(R.layout.view_more_info_button, this);
            return;
        }
        C4638h.m10271a("context");
        throw null;
    }

    public /* synthetic */ MoreInfoButton(Context context, AttributeSet attributeSet, int i, int i2, C4636f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
