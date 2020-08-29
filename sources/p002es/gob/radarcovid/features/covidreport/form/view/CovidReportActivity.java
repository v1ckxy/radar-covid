package p002es.gob.radarcovid.features.covidreport.form.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import es.gob.radarcovid.R;
import java.util.HashMap;
import p002es.gob.radarcovid.common.view.CodeEditText;
import p002es.gob.radarcovid.common.view.LabelButton;
import p003f.p004a.p005a.C0699d;
import p003f.p004a.p005a.p006a.p011e.C0500a;
import p003f.p004a.p005a.p012b.p019b.p021b.p024c.C0532a;
import p003f.p004a.p005a.p012b.p019b.p021b.p024c.C0534c;
import p003f.p004a.p005a.p012b.p019b.p021b.p026e.C0537a;
import p003f.p004a.p005a.p012b.p019b.p021b.p026e.C0538b;
import p003f.p004a.p005a.p108g.p109a.C0704c;
import p003f.p004a.p005a.p108g.p114c.C0837d;
import p124p.p126b.p127k.C1034d;
import p392u.C4560l;
import p392u.p401r.p402b.C4618l;
import p392u.p401r.p403c.C4638h;
import p392u.p401r.p403c.C4639i;
import p425x.p472b.p473a.p474a.C5178e;

/* renamed from: es.gob.radarcovid.features.covidreport.form.view.CovidReportActivity */
public final class CovidReportActivity extends C0704c implements C0534c {

    /* renamed from: w */
    public C0532a f1733w;

    /* renamed from: x */
    public HashMap f1734x;

    /* renamed from: es.gob.radarcovid.features.covidreport.form.view.CovidReportActivity$a */
    public static final class C0392a extends C4639i implements C4618l<C1034d, C4560l> {

        /* renamed from: f */
        public final /* synthetic */ CovidReportActivity f1735f;

        public C0392a(CovidReportActivity covidReportActivity) {
            this.f1735f = covidReportActivity;
            super(1);
        }

        /* renamed from: b */
        public Object mo3153b(Object obj) {
            C1034d dVar = (C1034d) obj;
            if (dVar != null) {
                dVar.dismiss();
                this.f1735f.mo3145T().mo3752c();
                return C4560l.f10773a;
            }
            C4638h.m10271a("it");
            throw null;
        }
    }

    /* renamed from: es.gob.radarcovid.features.covidreport.form.view.CovidReportActivity$b */
    public static final class C0393b extends C4639i implements C4618l<C1034d, C4560l> {

        /* renamed from: f */
        public static final C0393b f1736f = new C0393b();

        public C0393b() {
            super(1);
        }

        /* renamed from: b */
        public Object mo3153b(Object obj) {
            C1034d dVar = (C1034d) obj;
            if (dVar != null) {
                dVar.dismiss();
                return C4560l.f10773a;
            }
            C4638h.m10271a("it");
            throw null;
        }
    }

    /* renamed from: es.gob.radarcovid.features.covidreport.form.view.CovidReportActivity$c */
    public static final class C0394c extends C4639i implements C4618l<C1034d, C4560l> {

        /* renamed from: f */
        public static final C0394c f1737f = new C0394c();

        public C0394c() {
            super(1);
        }

        /* renamed from: b */
        public Object mo3153b(Object obj) {
            C1034d dVar = (C1034d) obj;
            if (dVar != null) {
                dVar.dismiss();
                return C4560l.f10773a;
            }
            C4638h.m10271a("it");
            throw null;
        }
    }

    /* renamed from: es.gob.radarcovid.features.covidreport.form.view.CovidReportActivity$d */
    public static final class C0395d extends C4639i implements C4618l<C1034d, C4560l> {

        /* renamed from: f */
        public final /* synthetic */ CovidReportActivity f1738f;

        public C0395d(CovidReportActivity covidReportActivity) {
            this.f1738f = covidReportActivity;
            super(1);
        }

        /* renamed from: b */
        public Object mo3153b(Object obj) {
            C1034d dVar = (C1034d) obj;
            if (dVar != null) {
                dVar.dismiss();
                this.f1738f.mo3145T().mo3755f();
                return C4560l.f10773a;
            }
            C4638h.m10271a("it");
            throw null;
        }
    }

    /* renamed from: A */
    public void mo3143A() {
        C0500a R = mo3873R();
        mo3875a(new Exception(R.mo3714a("ALERT_MY_HEALTH_CODE_ERROR_CONTENT", R.f1897b.getText(R.string.covid_report_error)).toString()));
    }

    /* renamed from: M */
    public void mo3144M() {
        C0837d dVar = new C0837d(this);
        C0500a R = mo3873R();
        dVar.mo3899b(R.mo3714a("ALERT_NETWORK_ERROR_TITLE", R.f1897b.getText(R.string.network_warning_dialog_title)).toString());
        C0500a R2 = mo3873R();
        dVar.mo3896a(R2.mo3714a("ALERT_POSITIVE_REPORT_NETWORK_ERROR_MESSAGE", R2.f1897b.getText(R.string.network_warning_dialog_message)).toString());
        dVar.mo3898a((C4618l<? super C1034d, C4560l>) C0394c.f1737f);
        C0500a R3 = mo3873R();
        dVar.mo3900b(R3.mo3714a("ALERT_RETRY_BUTTON", R3.f1897b.getText(R.string.network_warning_dialog_button)).toString(), new C0395d(this));
        dVar.f2398g.show();
    }

    /* renamed from: T */
    public final C0532a mo3145T() {
        C0532a aVar = this.f1733w;
        if (aVar != null) {
            return aVar;
        }
        C4638h.m10273b("presenter");
        throw null;
    }

    /* renamed from: a */
    public void mo3146a() {
        C0837d dVar = new C0837d(this);
        C0500a R = mo3873R();
        dVar.mo3899b(R.mo3714a("ALERT_MY_HEALTH_SEND_TITLE", R.f1897b.getText(R.string.covid_report_abort_warning_title)).toString());
        C0500a R2 = mo3873R();
        dVar.mo3896a(R2.mo3714a("ALERT_MY_HEALTH_SEND_CONTENT", R2.f1897b.getText(R.string.covid_report_abort_warning_message)).toString());
        C0500a R3 = mo3873R();
        dVar.mo3900b(R3.mo3714a("ALERT_CANCEL_BUTTON", R3.f1897b.getText(R.string.covid_report_abort_warning_button)).toString(), new C0392a(this));
        dVar.mo3898a((C4618l<? super C1034d, C4560l>) C0393b.f1736f);
        dVar.f2398g.show();
    }

    /* renamed from: c */
    public View mo3147c(int i) {
        if (this.f1734x == null) {
            this.f1734x = new HashMap();
        }
        View view = (View) this.f1734x.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f1734x.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: d */
    public void mo3148d(boolean z) {
        LabelButton labelButton = (LabelButton) mo3147c(C0699d.buttonSend);
        C4638h.m10270a((Object) labelButton, "buttonSend");
        labelButton.setEnabled(z);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C5178e.m11622a((Activity) this, i, i2);
    }

    public void onBackArrowClick(View view) {
        if (view != null) {
            mo3874S();
            C0532a aVar = this.f1733w;
            if (aVar != null) {
                aVar.mo3753d();
            } else {
                C4638h.m10273b("presenter");
                throw null;
            }
        } else {
            C4638h.m10271a("view");
            throw null;
        }
    }

    public void onBackPressed() {
        C0532a aVar = this.f1733w;
        if (aVar != null) {
            aVar.mo3753d();
        } else {
            C4638h.m10273b("presenter");
            throw null;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_covid_report);
        ((LabelButton) mo3147c(C0699d.buttonSend)).setOnClickListener(new C0537a(this));
        ((CodeEditText) mo3147c(C0699d.codeEditText)).setTextChangedListener(new C0538b(this));
        C0532a aVar = this.f1733w;
        if (aVar != null) {
            aVar.mo3750a();
        } else {
            C4638h.m10273b("presenter");
            throw null;
        }
    }

    public void onPause() {
        super.onPause();
        mo3874S();
    }

    /* renamed from: x */
    public String mo3152x() {
        return ((CodeEditText) mo3147c(C0699d.codeEditText)).getText();
    }
}
