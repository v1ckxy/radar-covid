package p002es.gob.radarcovid.features.splash.view;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.text.Spanned;
import androidx.appcompat.app.AlertController.C0007b;
import es.gob.radarcovid.R;
import p003f.p004a.p005a.p006a.p011e.C0500a;
import p003f.p004a.p005a.p012b.p103l.p106c.C0693a;
import p003f.p004a.p005a.p012b.p103l.p106c.C0695c;
import p003f.p004a.p005a.p108g.p109a.C0703b;
import p003f.p004a.p005a.p108g.p114c.C0837d;
import p124p.p126b.p127k.C1034d;
import p124p.p126b.p127k.C1034d.C1035a;
import p392u.C4560l;
import p392u.p401r.p402b.C4618l;
import p392u.p401r.p403c.C4638h;
import p392u.p401r.p403c.C4639i;

/* renamed from: es.gob.radarcovid.features.splash.view.SplashActivity */
public final class SplashActivity extends C0703b implements C0695c {

    /* renamed from: w */
    public C0693a f1768w;

    /* renamed from: x */
    public Dialog f1769x;

    /* renamed from: es.gob.radarcovid.features.splash.view.SplashActivity$a */
    /* compiled from: com.android.tools.r8.jetbrains.kotlin-style lambda group */
    public static final class C0404a extends C4639i implements C4618l<C1034d, C4560l> {

        /* renamed from: f */
        public final /* synthetic */ int f1770f;

        /* renamed from: g */
        public final /* synthetic */ Object f1771g;

        public C0404a(int i, Object obj) {
            this.f1770f = i;
            this.f1771g = obj;
            super(1);
        }

        /* renamed from: b */
        public final Object mo3153b(Object obj) {
            int i = this.f1770f;
            String str = "it";
            if (i == 0) {
                C1034d dVar = (C1034d) obj;
                if (dVar != null) {
                    dVar.dismiss();
                    ((SplashActivity) this.f1771g).mo3204T().mo3864e();
                    return C4560l.f10773a;
                }
                C4638h.m10271a(str);
                throw null;
            } else if (i == 1) {
                C1034d dVar2 = (C1034d) obj;
                if (dVar2 != null) {
                    dVar2.dismiss();
                    ((SplashActivity) this.f1771g).mo3204T().mo3862c();
                    return C4560l.f10773a;
                }
                C4638h.m10271a(str);
                throw null;
            } else {
                throw null;
            }
        }
    }

    /* renamed from: es.gob.radarcovid.features.splash.view.SplashActivity$b */
    public static final class C0405b extends C4639i implements C4618l<C1034d, C4560l> {

        /* renamed from: f */
        public final /* synthetic */ SplashActivity f1772f;

        public C0405b(SplashActivity splashActivity) {
            this.f1772f = splashActivity;
            super(1);
        }

        /* renamed from: b */
        public Object mo3153b(Object obj) {
            if (((C1034d) obj) != null) {
                this.f1772f.mo3204T().mo3863d();
                return C4560l.f10773a;
            }
            C4638h.m10271a("it");
            throw null;
        }
    }

    /* renamed from: es.gob.radarcovid.features.splash.view.SplashActivity$c */
    public static final class C0406c implements OnClickListener {

        /* renamed from: e */
        public final /* synthetic */ SplashActivity f1773e;

        public C0406c(SplashActivity splashActivity) {
            this.f1773e = splashActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f1773e.mo3204T().mo3865f();
        }
    }

    /* renamed from: H */
    public void mo3203H() {
        C0500a R = mo3873R();
        R.f1896a = R.f1898c.mo3687g();
    }

    /* renamed from: T */
    public final C0693a mo3204T() {
        C0693a aVar = this.f1768w;
        if (aVar != null) {
            return aVar;
        }
        C4638h.m10273b("presenter");
        throw null;
    }

    /* renamed from: n */
    public void mo3205n() {
        Dialog dialog = this.f1769x;
        if (dialog != null) {
            dialog.dismiss();
        }
        C0837d dVar = new C0837d(this);
        C0500a R = mo3873R();
        dVar.mo3899b(R.mo3714a("ALERT_NETWORK_ERROR_TITLE", R.f1897b.getText(R.string.warning_connection_title)).toString());
        C0500a R2 = mo3873R();
        dVar.mo3896a(R2.mo3714a("ALERT_NETWORK_ERROR_MESSAGE", R2.f1897b.getText(R.string.warning_connection_description)).toString());
        dVar.mo3898a((C4618l<? super C1034d, C4560l>) new C0404a<Object,C4560l>(0, this));
        C0500a R3 = mo3873R();
        dVar.mo3900b(R3.mo3714a("ALERT_RETRY_BUTTON", R3.f1897b.getText(R.string.warning_connection_button)).toString(), new C0404a(1, this));
        C1034d dVar2 = dVar.f2398g;
        dVar2.show();
        this.f1769x = dVar2;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_splash);
        C0693a aVar = this.f1768w;
        if (aVar != null) {
            aVar.mo3860a();
        } else {
            C4638h.m10273b("presenter");
            throw null;
        }
    }

    public void onResume() {
        super.onResume();
        C0693a aVar = this.f1768w;
        if (aVar != null) {
            aVar.mo3861b();
        } else {
            C4638h.m10273b("presenter");
            throw null;
        }
    }

    /* renamed from: u */
    public void mo3206u() {
        Dialog dialog = this.f1769x;
        if (dialog != null) {
            dialog.dismiss();
        }
        C1035a aVar = new C1035a(this);
        C0007b bVar = aVar.f2683a;
        bVar.f74f = bVar.f69a.getText(R.string.play_services_dialog_title);
        C0007b bVar2 = aVar.f2683a;
        bVar2.f76h = bVar2.f69a.getText(R.string.play_services_dialog_message);
        C0500a R = mo3873R();
        Spanned a = R.mo3714a("ALERT_ACCEPT_BUTTON", R.f1897b.getText(R.string.accept));
        C0406c cVar = new C0406c(this);
        C0007b bVar3 = aVar.f2683a;
        bVar3.f77i = a;
        bVar3.f78j = cVar;
        bVar3.f79k = false;
        C1034d a2 = aVar.mo4425a();
        this.f1769x = a2;
        a2.show();
    }

    /* renamed from: z */
    public void mo3207z() {
        Dialog dialog = this.f1769x;
        if (dialog != null) {
            dialog.dismiss();
        }
        C0837d dVar = new C0837d(this);
        C0500a R = mo3873R();
        dVar.mo3899b(R.mo3714a("ALERT_UPDATE_TEXT_TITLE", R.f1897b.getText(R.string.warning_need_update_title)).toString());
        C0500a R2 = mo3873R();
        dVar.mo3896a(R2.mo3714a("ALERT_UPDATE_TEXT_CONTENT", R2.f1897b.getText(R.string.warning_need_update_message)).toString());
        C0500a R3 = mo3873R();
        dVar.mo3900b(R3.mo3714a("ALERT_UPDATE_BUTTON", R3.f1897b.getText(R.string.warning_need_update_button)).toString(), new C0405b(this));
        C1034d dVar2 = dVar.f2398g;
        dVar2.show();
        this.f1769x = dVar2;
    }
}
