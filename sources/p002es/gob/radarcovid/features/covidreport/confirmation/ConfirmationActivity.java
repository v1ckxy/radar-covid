package p002es.gob.radarcovid.features.covidreport.confirmation;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import es.gob.radarcovid.R;
import java.util.HashMap;
import p002es.gob.radarcovid.common.view.MoreInfoButton;
import p003f.p004a.p005a.C0699d;
import p003f.p004a.p005a.p006a.p011e.C0500a;
import p003f.p004a.p005a.p012b.p019b.p020a.C0520a;
import p003f.p004a.p005a.p108g.p109a.C0703b;
import p392u.p401r.p403c.C4638h;
import p392u.p409w.C4681g;

/* renamed from: es.gob.radarcovid.features.covidreport.confirmation.ConfirmationActivity */
public final class ConfirmationActivity extends C0703b {

    /* renamed from: w */
    public HashMap f1732w;

    public final void onBackArrowClick(View view) {
        if (view != null) {
            this.f3i.mo11a();
        } else {
            C4638h.m10271a("view");
            throw null;
        }
    }

    public void onCreate(Bundle bundle) {
        Uri uri;
        String str;
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_confirmation);
        C0500a R = mo3873R();
        String obj = R.mo3714a("MY_HEALTH_REPORTED_INFO_URL", R.f1897b.getText(R.string.exposure_detail_info_url)).toString();
        String str2 = "http://";
        if (C4681g.m10318a((CharSequence) obj, (CharSequence) str2, false, 2) || C4681g.m10318a((CharSequence) obj, (CharSequence) "https://", false, 2)) {
            uri = Uri.parse(obj);
            str = "Uri.parse(infoUrl)";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(obj);
            uri = Uri.parse(sb.toString());
            str = "Uri.parse(\"http://$infoUrl\")";
        }
        C4638h.m10270a((Object) uri, str);
        int i = C0699d.buttonMoreInfo;
        if (this.f1732w == null) {
            this.f1732w = new HashMap();
        }
        View view = (View) this.f1732w.get(Integer.valueOf(i));
        if (view == null) {
            view = findViewById(i);
            this.f1732w.put(Integer.valueOf(i), view);
        }
        ((MoreInfoButton) view).setOnClickListener(new C0520a(this, uri));
    }
}
