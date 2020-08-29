package p002es.gob.radarcovid.features.onboarding.pages.legal.view;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import es.gob.radarcovid.R;
import java.util.HashMap;
import p003f.p004a.p005a.C0699d;
import p124p.p126b.p127k.C1036e;

/* renamed from: es.gob.radarcovid.features.onboarding.pages.legal.view.PrivacyActivity */
public final class PrivacyActivity extends C1036e {

    /* renamed from: t */
    public HashMap f1753t;

    /* renamed from: es.gob.radarcovid.features.onboarding.pages.legal.view.PrivacyActivity$a */
    public static final class C0398a implements OnClickListener {

        /* renamed from: e */
        public final /* synthetic */ PrivacyActivity f1754e;

        public C0398a(PrivacyActivity privacyActivity) {
            this.f1754e = privacyActivity;
        }

        public final void onClick(View view) {
            this.f1754e.finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_privacy);
        int i = C0699d.imageButtonClose;
        if (this.f1753t == null) {
            this.f1753t = new HashMap();
        }
        View view = (View) this.f1753t.get(Integer.valueOf(i));
        if (view == null) {
            view = findViewById(i);
            this.f1753t.put(Integer.valueOf(i), view);
        }
        ((ImageView) view).setOnClickListener(new C0398a(this));
    }
}
