package p002es.gob.radarcovid.features.onboarding.view;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import es.gob.radarcovid.R;
import java.util.HashMap;
import p003f.p004a.p005a.C0699d;
import p003f.p004a.p005a.p006a.p011e.C0500a;
import p003f.p004a.p005a.p012b.p068j.p084d.C0645a;
import p003f.p004a.p005a.p012b.p068j.p084d.C0647c;
import p003f.p004a.p005a.p012b.p068j.p086f.C0650a;
import p003f.p004a.p005a.p108g.p109a.C0703b;
import p003f.p004a.p005a.p108g.p114c.C0837d;
import p124p.p126b.p127k.C1034d;
import p124p.p170k.p171a.C1482e;
import p392u.C4560l;
import p392u.p401r.p402b.C4618l;
import p392u.p401r.p403c.C4638h;
import p392u.p401r.p403c.C4639i;

/* renamed from: es.gob.radarcovid.features.onboarding.view.OnboardingActivity */
public final class OnboardingActivity extends C0703b implements C0647c, C0650a {

    /* renamed from: w */
    public C0645a f1755w;

    /* renamed from: x */
    public HashMap f1756x;

    /* renamed from: es.gob.radarcovid.features.onboarding.view.OnboardingActivity$a */
    public static final class C0399a extends FragmentStateAdapter {

        /* renamed from: m */
        public final int f1757m;

        public C0399a(C1482e eVar) {
            if (eVar != null) {
                super(eVar);
                this.f1757m = 3;
                return;
            }
            C4638h.m10271a("fragmentActivity");
            throw null;
        }

        /* renamed from: b */
        public int mo1178b() {
            return this.f1757m;
        }
    }

    /* renamed from: es.gob.radarcovid.features.onboarding.view.OnboardingActivity$b */
    public static final class C0400b extends C4639i implements C4618l<C1034d, C4560l> {

        /* renamed from: f */
        public final /* synthetic */ OnboardingActivity f1758f;

        public C0400b(OnboardingActivity onboardingActivity) {
            this.f1758f = onboardingActivity;
            super(1);
        }

        /* renamed from: b */
        public Object mo3153b(Object obj) {
            C1034d dVar = (C1034d) obj;
            if (dVar != null) {
                dVar.dismiss();
                C0645a aVar = this.f1758f.f1755w;
                if (aVar != null) {
                    aVar.mo3834c();
                    return C4560l.f10773a;
                }
                C4638h.m10273b("presenter");
                throw null;
            }
            C4638h.m10271a("it");
            throw null;
        }
    }

    /* renamed from: es.gob.radarcovid.features.onboarding.view.OnboardingActivity$c */
    public static final class C0401c extends C4639i implements C4618l<C1034d, C4560l> {

        /* renamed from: f */
        public static final C0401c f1759f = new C0401c();

        public C0401c() {
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

    /* renamed from: a */
    public void mo3184a() {
        C0837d dVar = new C0837d(this);
        C0500a R = mo3873R();
        dVar.mo3896a(R.mo3714a("ALERT_EXIT_MESSAGE", R.f1897b.getText(R.string.warning_exit_application_message)).toString());
        C0500a R2 = mo3873R();
        dVar.mo3900b(R2.mo3714a("ALERT_CONFIRM_BUTTON", R2.f1897b.getText(R.string.warning_exit_application_button)).toString(), new C0400b(this));
        dVar.mo3898a((C4618l<? super C1034d, C4560l>) C0401c.f1759f);
        dVar.f2398g.show();
    }

    /* renamed from: a */
    public void mo3185a(boolean z) {
        C0645a aVar = this.f1755w;
        if (aVar != null) {
            aVar.mo3831a(z);
        } else {
            C4638h.m10273b("presenter");
            throw null;
        }
    }

    /* renamed from: b */
    public void mo3186b() {
        C0645a aVar = this.f1755w;
        if (aVar != null) {
            aVar.mo3832b();
        } else {
            C4638h.m10273b("presenter");
            throw null;
        }
    }

    /* renamed from: c */
    public View mo3187c(int i) {
        if (this.f1756x == null) {
            this.f1756x = new HashMap();
        }
        View view = (View) this.f1756x.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f1756x.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: l */
    public void mo3188l() {
        ViewPager2 viewPager2 = (ViewPager2) mo3187c(C0699d.viewPager);
        ViewPager2 viewPager22 = (ViewPager2) mo3187c(C0699d.viewPager);
        C4638h.m10270a((Object) viewPager22, "viewPager");
        viewPager2.mo1375a(viewPager22.getCurrentItem() - 1, true);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            C0645a aVar = this.f1755w;
            if (aVar != null) {
                aVar.mo3835d();
            } else {
                C4638h.m10273b("presenter");
                throw null;
            }
        }
    }

    public void onBackPressed() {
        C0645a aVar = this.f1755w;
        if (aVar != null) {
            ViewPager2 viewPager2 = (ViewPager2) mo3187c(C0699d.viewPager);
            C4638h.m10270a((Object) viewPager2, "viewPager");
            aVar.mo3833b(viewPager2.getCurrentItem() == 0);
            return;
        }
        C4638h.m10273b("presenter");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_onboarding);
        ViewPager2 viewPager2 = (ViewPager2) mo3187c(C0699d.viewPager);
        String str = "viewPager";
        C4638h.m10270a((Object) viewPager2, str);
        viewPager2.setAdapter(new C0399a(this));
        ViewPager2 viewPager22 = (ViewPager2) mo3187c(C0699d.viewPager);
        C4638h.m10270a((Object) viewPager22, str);
        viewPager22.setUserInputEnabled(false);
        ViewPager2 viewPager23 = (ViewPager2) mo3187c(C0699d.viewPager);
        C4638h.m10270a((Object) viewPager23, str);
        viewPager23.setOffscreenPageLimit(4);
        C0645a aVar = this.f1755w;
        if (aVar != null) {
            aVar.mo3830a();
        } else {
            C4638h.m10273b("presenter");
            throw null;
        }
    }

    /* renamed from: r */
    public boolean mo3189r() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            return defaultAdapter.isEnabled();
        }
        return false;
    }

    /* renamed from: s */
    public void mo3190s() {
        ViewPager2 viewPager2 = (ViewPager2) mo3187c(C0699d.viewPager);
        ViewPager2 viewPager22 = (ViewPager2) mo3187c(C0699d.viewPager);
        C4638h.m10270a((Object) viewPager22, "viewPager");
        viewPager2.mo1375a(viewPager22.getCurrentItem() + 1, true);
    }

    /* renamed from: t */
    public void mo3191t() {
        startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 1);
    }
}
