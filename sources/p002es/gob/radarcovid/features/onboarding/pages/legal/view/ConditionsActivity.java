package p002es.gob.radarcovid.features.onboarding.pages.legal.view;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import es.gob.radarcovid.R;
import java.util.HashMap;
import p002es.gob.radarcovid.common.view.LabelButton;
import p003f.p004a.p005a.C0699d;
import p124p.p126b.p127k.C1036e;

/* renamed from: es.gob.radarcovid.features.onboarding.pages.legal.view.ConditionsActivity */
public final class ConditionsActivity extends C1036e {

    /* renamed from: t */
    public HashMap f1750t;

    /* renamed from: c */
    public View mo3178c(int i) {
        if (this.f1750t == null) {
            this.f1750t = new HashMap();
        }
        View view = (View) this.f1750t.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f1750t.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_conditions);
        ((ImageView) mo3178c(C0699d.imageButtonClose)).setOnClickListener(new C0862h(0, this));
        ((LabelButton) mo3178c(C0699d.buttonAccept)).setOnClickListener(new C0862h(1, this));
        ((Button) mo3178c(C0699d.buttonCancel)).setOnClickListener(new C0862h(2, this));
    }
}
