package p002es.gob.radarcovid.features.exposure.view;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Spanned;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import es.gob.radarcovid.R;
import java.util.HashMap;
import p002es.gob.radarcovid.common.view.MoreInfoButton;
import p003f.p004a.p005a.C0699d;
import p003f.p004a.p005a.p006a.p011e.C0500a;
import p003f.p004a.p005a.p012b.p027c.p030c.C0548a;
import p003f.p004a.p005a.p012b.p027c.p030c.C0550c;
import p003f.p004a.p005a.p108g.p109a.C0704c;
import p116io.jsonwebtoken.lang.Objects;
import p116io.jsonwebtoken.lang.Strings;
import p124p.p126b.p127k.C1061o;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.p401r.p403c.C4638h;
import p392u.p409w.C4681g;

/* renamed from: es.gob.radarcovid.features.exposure.view.ExposureActivity */
public final class ExposureActivity extends C0704c implements C0550c {

    /* renamed from: w */
    public C0548a f1741w;

    /* renamed from: x */
    public HashMap f1742x;

    /* renamed from: T */
    public final C0548a mo3160T() {
        C0548a aVar = this.f1741w;
        if (aVar != null) {
            return aVar;
        }
        C4638h.m10273b("presenter");
        throw null;
    }

    /* renamed from: a */
    public void mo3161a(String str, Integer num, Integer num2, Integer num3) {
        String str2;
        String str3;
        String str4;
        if (str != null) {
            TextView textView = (TextView) mo3163c(C0699d.textViewExpositionLastUpdate);
            C4638h.m10270a((Object) textView, "textViewExpositionLastUpdate");
            C0500a R = mo3873R();
            if (R != null) {
                if (num == null || num2 == null || num3 == null) {
                    str2 = R.mo3716a("EXPOSITION_LOW_DESCRIPTION", str);
                    if (str2.length() == 0) {
                        str2 = R.f1897b.getString(R.string.exposure_detail_low_last_update, new Object[]{str});
                        C4638h.m10270a((Object) str2, "context.getString(R.stri…il_low_last_update, date)");
                    }
                } else {
                    str2 = R.mo3716a("EXPOSITION_HIGH_DESCRIPTION", String.valueOf(num.intValue()), str);
                    if (str2.length() == 0) {
                        String str5 = "context.resources.getQua…                        )";
                        if (num.intValue() > 0) {
                            String quantityString = R.f1897b.getResources().getQuantityString(R.plurals.days, num.intValue(), new Object[]{num});
                            C4638h.m10270a((Object) quantityString, str5);
                            str3 = R.f1897b.getString(R.string.exposure_detail_high_last_update, new Object[]{quantityString, str});
                            str4 = "context.getString(R.stri…t_update, daysText, date)";
                        } else {
                            if (num2.intValue() > 0) {
                                String quantityString2 = R.f1897b.getResources().getQuantityString(R.plurals.hours, num2.intValue(), new Object[]{num2});
                                C4638h.m10270a((Object) quantityString2, str5);
                                str3 = R.f1897b.getString(R.string.exposure_detail_high_last_update, new Object[]{quantityString2, str});
                            } else {
                                String quantityString3 = R.f1897b.getResources().getQuantityString(R.plurals.minutes, num3.intValue(), new Object[]{num3});
                                C4638h.m10270a((Object) quantityString3, str5);
                                str3 = R.f1897b.getString(R.string.exposure_detail_high_last_update, new Object[]{quantityString3, str});
                            }
                            str4 = "context.getString(\n     …                        )";
                        }
                        C4638h.m10270a((Object) str3, str4);
                        str2 = str3;
                    }
                }
                Spanned a = C1061o.m2459a(str2, 0);
                C4638h.m10270a((Object) a, "HtmlCompat.fromHtml(text…at.FROM_HTML_MODE_LEGACY)");
                textView.setText(a);
                return;
            }
            throw null;
        }
        C4638h.m10271a("date");
        throw null;
    }

    /* renamed from: b */
    public void mo3162b(String str, Integer num, Integer num2, Integer num3) {
        String str2;
        String str3;
        if (str != null) {
            if (num == null || num2 == null || num3 == null) {
                str2 = Objects.EMPTY_STRING;
            } else {
                boolean z = true;
                if (num.intValue() > 0) {
                    String quantityString = getResources().getQuantityString(R.plurals.days, num.intValue(), new Object[]{num});
                    C4638h.m10270a((Object) quantityString, "resources.getQuantityStr…daysElapsed, daysElapsed)");
                    str2 = getString(R.string.exposure_detail_infected_last_update, new Object[]{quantityString, str});
                    str3 = "getString(R.string.expos…t_update, daysText, date)";
                } else if (num2.intValue() > 0) {
                    String quantityString2 = getResources().getQuantityString(R.plurals.hours, num2.intValue(), new Object[]{num2});
                    C4638h.m10270a((Object) quantityString2, "resources.getQuantityStr…ursElapsed, hoursElapsed)");
                    str2 = getString(R.string.exposure_detail_infected_last_update, new Object[]{quantityString2, str});
                    str3 = "getString(R.string.expos…_update, hoursText, date)";
                } else {
                    String quantityString3 = getResources().getQuantityString(R.plurals.minutes, num3.intValue(), new Object[]{num3});
                    C4638h.m10270a((Object) quantityString3, "resources.getQuantityStr…                        )");
                    str2 = getString(R.string.exposure_detail_infected_last_update, new Object[]{quantityString3, str});
                    str3 = "getString(R.string.expos…pdate, minutesText, date)";
                }
                C4638h.m10270a((Object) str2, str3);
                String a = mo3873R().mo3716a("EXPOSITION_EXPOSED_DESCRIPTION", String.valueOf(num.intValue()), str);
                if (a.length() <= 0) {
                    z = false;
                }
                if (z) {
                    str2 = a;
                }
            }
            TextView textView = (TextView) mo3163c(C0699d.textViewExpositionLastUpdate);
            C4638h.m10270a((Object) textView, "textViewExpositionLastUpdate");
            textView.setText(C1061o.m2459a(str2, 0));
            return;
        }
        C4638h.m10271a("date");
        throw null;
    }

    /* renamed from: c */
    public View mo3163c(int i) {
        if (this.f1742x == null) {
            this.f1742x = new HashMap();
        }
        View view = (View) this.f1742x.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f1742x.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: d */
    public void mo3164d() {
        ((LinearLayout) mo3163c(C0699d.wrapperExposition)).setBackgroundResource(R.drawable.background_shape_exposition_high);
        TextView textView = (TextView) mo3163c(C0699d.textViewExpositionDetailTitleSmall);
        C4638h.m10270a((Object) textView, "textViewExpositionDetailTitleSmall");
        C0500a R = mo3873R();
        textView.setText(R.mo3714a("EXPOSITION_HIGH_TITLE_1", R.f1897b.getText(R.string.exposure_detail_high_title_small)));
        TextView textView2 = (TextView) mo3163c(C0699d.textViewExpositionDetailTitle);
        C4638h.m10270a((Object) textView2, "textViewExpositionDetailTitle");
        C0500a R2 = mo3873R();
        textView2.setText(R2.mo3714a("EXPOSITION_HIGH_TITLE_2", R2.f1897b.getText(R.string.exposure_detail_high_title)));
        View c = mo3163c(C0699d.wrapperExposureHigh);
        C4638h.m10270a((Object) c, "wrapperExposureHigh");
        c.setVisibility(0);
        View c2 = mo3163c(C0699d.wrapperExposureLow);
        C4638h.m10270a((Object) c2, "wrapperExposureLow");
        c2.setVisibility(8);
        View c3 = mo3163c(C0699d.wrapperExposureInfected);
        C4638h.m10270a((Object) c3, "wrapperExposureInfected");
        c3.setVisibility(8);
    }

    /* renamed from: e */
    public void mo3165e() {
        ((LinearLayout) mo3163c(C0699d.wrapperExposition)).setBackgroundResource(R.drawable.background_shape_exposition_low);
        TextView textView = (TextView) mo3163c(C0699d.textViewExpositionDetailTitleSmall);
        C4638h.m10270a((Object) textView, "textViewExpositionDetailTitleSmall");
        C0500a R = mo3873R();
        textView.setText(R.mo3714a("EXPOSITION_LOW_TITLE_1", R.f1897b.getText(R.string.exposure_detail_low_title_small)));
        TextView textView2 = (TextView) mo3163c(C0699d.textViewExpositionDetailTitle);
        C4638h.m10270a((Object) textView2, "textViewExpositionDetailTitle");
        C0500a R2 = mo3873R();
        textView2.setText(R2.mo3714a("EXPOSITION_LOW_TITLE_2", R2.f1897b.getText(R.string.exposure_detail_low_title)));
        View c = mo3163c(C0699d.wrapperExposureLow);
        C4638h.m10270a((Object) c, "wrapperExposureLow");
        c.setVisibility(0);
        View c2 = mo3163c(C0699d.wrapperExposureHigh);
        C4638h.m10270a((Object) c2, "wrapperExposureHigh");
        c2.setVisibility(8);
        View c3 = mo3163c(C0699d.wrapperExposureInfected);
        C4638h.m10270a((Object) c3, "wrapperExposureInfected");
        c3.setVisibility(8);
    }

    /* renamed from: f */
    public void mo3166f() {
        Intent intent = new Intent("android.intent.action.DIAL");
        StringBuilder a = C1965a.m4756a("tel:");
        a.append(mo3873R().mo3715a());
        intent.setData(Uri.parse(a.toString()));
        startActivity(intent);
    }

    /* renamed from: h */
    public void mo3167h() {
        ((LinearLayout) mo3163c(C0699d.wrapperExposition)).setBackgroundResource(R.drawable.background_shape_exposition_high);
        TextView textView = (TextView) mo3163c(C0699d.textViewExpositionDetailTitleSmall);
        C4638h.m10270a((Object) textView, "textViewExpositionDetailTitleSmall");
        C0500a R = mo3873R();
        textView.setText(R.mo3714a("EXPOSITION_EXPOSED_TITLE_1", R.f1897b.getText(R.string.exposure_detail_infected_title_small)));
        TextView textView2 = (TextView) mo3163c(C0699d.textViewExpositionDetailTitle);
        C4638h.m10270a((Object) textView2, "textViewExpositionDetailTitle");
        C0500a R2 = mo3873R();
        textView2.setText(R2.mo3714a("EXPOSITION_EXPOSED_TITLE_2", R2.f1897b.getText(R.string.exposure_detail_infected_title)));
        View c = mo3163c(C0699d.wrapperExposureInfected);
        C4638h.m10270a((Object) c, "wrapperExposureInfected");
        c.setVisibility(0);
        View c2 = mo3163c(C0699d.wrapperExposureLow);
        C4638h.m10270a((Object) c2, "wrapperExposureLow");
        c2.setVisibility(8);
        View c3 = mo3163c(C0699d.wrapperExposureHigh);
        C4638h.m10270a((Object) c3, "wrapperExposureHigh");
        c3.setVisibility(8);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_exposure);
        mo3163c(C0699d.wrapperContactButton).setOnClickListener(new C0863i(0, this));
        ((MoreInfoButton) mo3163c(C0699d.buttonMoreInfoLow)).setOnClickListener(new C0863i(1, this));
        ((MoreInfoButton) mo3163c(C0699d.buttonMoreInfoHigh)).setOnClickListener(new C0863i(2, this));
        ((MoreInfoButton) mo3163c(C0699d.buttonMoreInfoInfected)).setOnClickListener(new C0863i(3, this));
        C0548a aVar = this.f1741w;
        if (aVar != null) {
            aVar.mo3759a();
        } else {
            C4638h.m10273b("presenter");
            throw null;
        }
    }

    public void onPause() {
        super.onPause();
        C0548a aVar = this.f1741w;
        if (aVar != null) {
            aVar.mo3763c();
        } else {
            C4638h.m10273b("presenter");
            throw null;
        }
    }

    public void onResume() {
        super.onResume();
        C0548a aVar = this.f1741w;
        if (aVar != null) {
            aVar.mo3762b();
        } else {
            C4638h.m10273b("presenter");
            throw null;
        }
    }

    /* renamed from: y */
    public void mo3169y() {
        TextView textView = (TextView) mo3163c(C0699d.textViewExpositionLastUpdate);
        C4638h.m10270a((Object) textView, "textViewExpositionLastUpdate");
        C0500a R = mo3873R();
        textView.setText(C4681g.m10311a(R.mo3714a("EXPOSITION_LOW_DESCRIPTION", R.f1897b.getText(R.string.exposure_detail_low_last_update_no_data)).toString(), Strings.CURRENT_PATH, (String) null, 2));
    }
}
