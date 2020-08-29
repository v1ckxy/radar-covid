package p002es.gob.radarcovid.common.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import es.gob.radarcovid.R;
import java.util.HashMap;
import p003f.p004a.p005a.C0699d;
import p003f.p004a.p005a.C0700e;
import p003f.p004a.p005a.p006a.p011e.C0500a;
import p365r.p366a.C4422e;
import p392u.C4557i;
import p392u.p401r.p403c.C4636f;
import p392u.p401r.p403c.C4638h;

/* renamed from: es.gob.radarcovid.common.view.LabelDotTextView */
public final class LabelDotTextView extends LinearLayout {

    /* renamed from: e */
    public C0500a f1725e;

    /* renamed from: f */
    public String f1726f;

    /* renamed from: g */
    public HashMap f1727g;

    public LabelDotTextView(Context context) {
        this(context, null, 0, 6, null);
    }

    public LabelDotTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public LabelDotTextView(Context context, AttributeSet attributeSet, int i) {
        if (context != null) {
            super(context, attributeSet, i);
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                ((C4422e) applicationContext).mo10710k().mo3887a(this);
                setOrientation(0);
                LayoutInflater.from(context).inflate(R.layout.view_dotted_textview, this);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0700e.LabelDotTextView);
                try {
                    this.f1726f = obtainStyledAttributes.getString(2);
                    CharSequence text = obtainStyledAttributes.getText(0);
                    int i2 = obtainStyledAttributes.getInt(1, 0);
                    String str = "imageViewDot";
                    if (i2 == 0) {
                        ImageView imageView = (ImageView) mo3133a(C0699d.imageViewDot);
                        C4638h.m10270a((Object) imageView, str);
                        imageView.setVisibility(0);
                    } else if (i2 == 1) {
                        ImageView imageView2 = (ImageView) mo3133a(C0699d.imageViewDot);
                        C4638h.m10270a((Object) imageView2, str);
                        imageView2.setVisibility(4);
                    } else if (i2 == 2) {
                        ImageView imageView3 = (ImageView) mo3133a(C0699d.imageViewDot);
                        C4638h.m10270a((Object) imageView3, str);
                        imageView3.setVisibility(8);
                    }
                    TextView textView = (TextView) mo3133a(C0699d.textView);
                    C4638h.m10270a((Object) textView, "textView");
                    C0500a aVar = this.f1725e;
                    if (aVar != null) {
                        textView.setText(aVar.mo3714a(this.f1726f, text));
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

    public /* synthetic */ LabelDotTextView(Context context, AttributeSet attributeSet, int i, int i2, C4636f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* renamed from: a */
    public View mo3133a(int i) {
        if (this.f1727g == null) {
            this.f1727g = new HashMap();
        }
        View view = (View) this.f1727g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f1727g.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final C0500a getLabelManager() {
        C0500a aVar = this.f1725e;
        if (aVar != null) {
            return aVar;
        }
        C4638h.m10273b("labelManager");
        throw null;
    }

    public final void setLabelManager(C0500a aVar) {
        if (aVar != null) {
            this.f1725e = aVar;
        } else {
            C4638h.m10271a("<set-?>");
            throw null;
        }
    }
}
