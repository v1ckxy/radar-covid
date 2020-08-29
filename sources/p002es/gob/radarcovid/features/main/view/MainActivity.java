package p002es.gob.radarcovid.features.main.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import es.gob.radarcovid.R;
import java.util.HashMap;
import p003f.p004a.p005a.C0699d;
import p003f.p004a.p005a.p006a.p011e.C0500a;
import p003f.p004a.p005a.p012b.p056h.p059c.C0595a;
import p003f.p004a.p005a.p012b.p056h.p059c.C0597c;
import p003f.p004a.p005a.p012b.p056h.p061e.C0600a;
import p003f.p004a.p005a.p108g.p109a.C0703b;
import p003f.p004a.p005a.p108g.p114c.C0837d;
import p124p.p126b.p127k.C1034d;
import p392u.C4560l;
import p392u.p401r.p402b.C4618l;
import p392u.p401r.p403c.C4638h;
import p392u.p401r.p403c.C4639i;
import p425x.p472b.p473a.p474a.C5178e;

/* renamed from: es.gob.radarcovid.features.main.view.MainActivity */
public final class MainActivity extends C0703b implements C0597c {

    /* renamed from: w */
    public C0595a f1746w;

    /* renamed from: x */
    public HashMap f1747x;

    /* renamed from: es.gob.radarcovid.features.main.view.MainActivity$a */
    public static final class C0396a extends C4639i implements C4618l<C1034d, C4560l> {

        /* renamed from: f */
        public final /* synthetic */ MainActivity f1748f;

        public C0396a(MainActivity mainActivity) {
            this.f1748f = mainActivity;
            super(1);
        }

        /* renamed from: b */
        public Object mo3153b(Object obj) {
            C1034d dVar = (C1034d) obj;
            if (dVar != null) {
                dVar.dismiss();
                this.f1748f.mo3175T().mo3797c();
                return C4560l.f10773a;
            }
            C4638h.m10271a("it");
            throw null;
        }
    }

    /* renamed from: es.gob.radarcovid.features.main.view.MainActivity$b */
    public static final class C0397b extends C4639i implements C4618l<C1034d, C4560l> {

        /* renamed from: f */
        public static final C0397b f1749f = new C0397b();

        public C0397b() {
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
    public static final void m1348a(Context context, boolean z) {
        if (context != null) {
            Intent intent = new Intent(context, MainActivity.class);
            intent.addFlags(67108864);
            intent.putExtra("extra_activate_radar", z);
            context.startActivity(intent);
            return;
        }
        C4638h.m10271a("context");
        throw null;
    }

    /* renamed from: T */
    public final C0595a mo3175T() {
        C0595a aVar = this.f1746w;
        if (aVar != null) {
            return aVar;
        }
        C4638h.m10273b("presenter");
        throw null;
    }

    /* renamed from: c */
    public View mo3177c(int i) {
        if (this.f1747x == null) {
            this.f1747x = new HashMap();
        }
        View view = (View) this.f1747x.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f1747x.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C5178e.m11622a((Activity) this, i, i2);
        if (i == 1 && i2 == -1) {
            C0595a aVar = this.f1746w;
            if (aVar != null) {
                aVar.mo3799e();
            } else {
                C4638h.m10273b("presenter");
                throw null;
            }
        }
    }

    public void onBackPressed() {
        BottomNavigationView bottomNavigationView = (BottomNavigationView) mo3177c(C0699d.bottomNavigation);
        String str = "bottomNavigation";
        C4638h.m10270a((Object) bottomNavigationView, str);
        if (bottomNavigationView.getSelectedItemId() == R.id.menuItemHome) {
            C0595a aVar = this.f1746w;
            if (aVar != null) {
                aVar.mo3798d();
            } else {
                C4638h.m10273b("presenter");
                throw null;
            }
        } else {
            BottomNavigationView bottomNavigationView2 = (BottomNavigationView) mo3177c(C0699d.bottomNavigation);
            C4638h.m10270a((Object) bottomNavigationView2, str);
            bottomNavigationView2.setSelectedItemId(R.id.menuItemHome);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_main);
        ((BottomNavigationView) mo3177c(C0699d.bottomNavigation)).setOnNavigationItemSelectedListener(new C0600a(this));
        C0595a aVar = this.f1746w;
        if (aVar != null) {
            aVar.mo3795a(getIntent().getBooleanExtra("extra_activate_radar", false));
        } else {
            C4638h.m10273b("presenter");
            throw null;
        }
    }

    public void onResume() {
        super.onResume();
        C0595a aVar = this.f1746w;
        if (aVar != null) {
            aVar.mo3796b();
        } else {
            C4638h.m10273b("presenter");
            throw null;
        }
    }

    /* renamed from: a */
    public void mo3176a() {
        C0837d dVar = new C0837d(this);
        C0500a R = mo3873R();
        dVar.mo3896a(R.mo3714a("ALERT_EXIT_MESSAGE", R.f1897b.getText(R.string.warning_exit_application_message)).toString());
        C0500a R2 = mo3873R();
        dVar.mo3900b(R2.mo3714a("ALERT_CONFIRM_BUTTON", R2.f1897b.getText(R.string.warning_exit_application_button)).toString(), new C0396a(this));
        dVar.mo3898a((C4618l<? super C1034d, C4560l>) C0397b.f1749f);
        dVar.f2398g.show();
    }
}
