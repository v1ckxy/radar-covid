package p002es.gob.radarcovid.common.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import es.gob.radarcovid.R;
import java.util.HashMap;
import p003f.p004a.p005a.C0699d;
import p003f.p004a.p005a.C0700e;
import p003f.p004a.p005a.p108g.p114c.C0841e;
import p392u.p401r.p403c.C4636f;
import p392u.p401r.p403c.C4638h;

/* renamed from: es.gob.radarcovid.common.view.DropdownView */
public final class DropdownView extends LinearLayout {

    /* renamed from: e */
    public HashMap f1722e;

    public DropdownView(Context context) {
        this(context, null, 0, 6, null);
    }

    public DropdownView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX INFO: finally extract failed */
    public DropdownView(Context context, AttributeSet attributeSet, int i) {
        if (context != null) {
            super(context, attributeSet, i);
            LayoutInflater.from(context).inflate(R.layout.view_dropdown, this);
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C0700e.DropdownView, 0, 0);
            try {
                CharSequence text = obtainStyledAttributes.getText(1);
                CharSequence text2 = obtainStyledAttributes.getText(0);
                obtainStyledAttributes.recycle();
                ((ConstraintLayout) mo3130a(C0699d.wrapperHeader)).setOnClickListener(new C0841e(this, context));
                TextView textView = (TextView) mo3130a(C0699d.textViewDropdownTitle);
                C4638h.m10270a((Object) textView, "textViewDropdownTitle");
                textView.setText(text);
                TextView textView2 = (TextView) mo3130a(C0699d.textViewDropdownContent);
                C4638h.m10270a((Object) textView2, "textViewDropdownContent");
                textView2.setText(text2);
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            C4638h.m10271a("context");
            throw null;
        }
    }

    public /* synthetic */ DropdownView(Context context, AttributeSet attributeSet, int i, int i2, C4636f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* renamed from: a */
    public View mo3130a(int i) {
        if (this.f1722e == null) {
            this.f1722e = new HashMap();
        }
        View view = (View) this.f1722e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f1722e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }
}
