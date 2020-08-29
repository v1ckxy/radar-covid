package p002es.gob.radarcovid.common.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p003f.p004a.p005a.C0700e;
import p003f.p004a.p005a.p006a.p011e.C0500a;
import p124p.p126b.p136q.C1218w;
import p365r.p366a.C4422e;
import p392u.C4557i;
import p392u.p401r.p403c.C4636f;
import p392u.p401r.p403c.C4638h;

/* renamed from: es.gob.radarcovid.common.view.LabelTextView */
public final class LabelTextView extends C1218w {

    /* renamed from: i */
    public C0500a f1728i;

    /* renamed from: j */
    public String f1729j;

    public LabelTextView(Context context) {
        this(context, null, 0, 6, null);
    }

    public LabelTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public LabelTextView(Context context, AttributeSet attributeSet, int i) {
        if (context != null) {
            super(context, attributeSet, i);
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                ((C4422e) applicationContext).mo10710k().mo3887a(this);
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C0700e.LabelTextView, 0, 0);
                try {
                    this.f1729j = obtainStyledAttributes.getString(1);
                    CharSequence text = obtainStyledAttributes.getText(0);
                    C0500a aVar = this.f1728i;
                    if (aVar != null) {
                        setText(aVar.mo3714a(this.f1729j, text));
                    } else {
                        C4638h.m10273b("labelManager");
                        throw null;
                    }
                } finally {
                    obtainStyledAttributes.recycle();
                }
            } else {
                throw new C4557i("null cannot be cast to non-null type dagger.android.HasAndroidInjector");
            }
        } else {
            C4638h.m10271a("context");
            throw null;
        }
    }

    public /* synthetic */ LabelTextView(Context context, AttributeSet attributeSet, int i, int i2, C4636f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public final C0500a getLabelManager() {
        C0500a aVar = this.f1728i;
        if (aVar != null) {
            return aVar;
        }
        C4638h.m10273b("labelManager");
        throw null;
    }

    public final void setLabelManager(C0500a aVar) {
        if (aVar != null) {
            this.f1728i = aVar;
        } else {
            C4638h.m10271a("<set-?>");
            throw null;
        }
    }
}
