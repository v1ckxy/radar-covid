package p002es.gob.radarcovid.common.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import p003f.p004a.p005a.p108g.p114c.C0854o;
import p392u.p401r.p403c.C4636f;
import p392u.p401r.p403c.C4638h;

/* renamed from: es.gob.radarcovid.common.view.SelectableGroupLinearLayout */
public class SelectableGroupLinearLayout extends LinearLayout implements C0854o {

    /* renamed from: e */
    public boolean f1730e;

    public SelectableGroupLinearLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public SelectableGroupLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public SelectableGroupLinearLayout(Context context, AttributeSet attributeSet, int i) {
        if (context != null) {
            super(context, attributeSet, i);
        } else {
            C4638h.m10271a("context");
            throw null;
        }
    }

    public /* synthetic */ SelectableGroupLinearLayout(Context context, AttributeSet attributeSet, int i, int i2, C4636f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* renamed from: a */
    public void mo3138a(View view) {
        if (view == null) {
            C4638h.m10271a("view");
            throw null;
        } else if (this.f1730e) {
            view.setSelected(!view.isSelected());
        } else {
            view.setSelected(true);
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (childAt != null && (!C4638h.m10272a((Object) childAt, (Object) view))) {
                    childAt.setSelected(false);
                }
            }
        }
    }

    public final boolean getAllowMultipleSelection() {
        return this.f1730e;
    }

    public final void setAllowMultipleSelection(boolean z) {
        this.f1730e = z;
    }
}
