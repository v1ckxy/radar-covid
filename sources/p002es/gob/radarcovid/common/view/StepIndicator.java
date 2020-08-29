package p002es.gob.radarcovid.common.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import es.gob.radarcovid.R;
import java.util.HashMap;
import p392u.p401r.p403c.C4636f;
import p392u.p401r.p403c.C4638h;

/* renamed from: es.gob.radarcovid.common.view.StepIndicator */
public final class StepIndicator extends FrameLayout {

    /* renamed from: e */
    public HashMap f1731e;

    public StepIndicator(Context context) {
        this(context, null, 0, 6, null);
    }

    public StepIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public StepIndicator(Context context, AttributeSet attributeSet, int i) {
        if (context != null) {
            super(context, attributeSet, i);
            LayoutInflater.from(context).inflate(R.layout.view_step_indicator, this);
            return;
        }
        C4638h.m10271a("context");
        throw null;
    }

    public /* synthetic */ StepIndicator(Context context, AttributeSet attributeSet, int i, int i2, C4636f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* renamed from: a */
    public View mo3141a(int i) {
        if (this.f1731e == null) {
            this.f1731e = new HashMap();
        }
        View view = (View) this.f1731e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f1731e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }
}
