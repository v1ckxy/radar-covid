package p003f.p004a.p005a.p012b.p056h.p061e;

import android.view.MenuItem;
import com.google.android.material.bottomnavigation.BottomNavigationView.C0214c;
import es.gob.radarcovid.R;
import p002es.gob.radarcovid.features.main.view.MainActivity;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.b.h.e.a */
public final class C0600a implements C0214c {

    /* renamed from: a */
    public final /* synthetic */ MainActivity f2034a;

    public C0600a(MainActivity mainActivity) {
        this.f2034a = mainActivity;
    }

    /* renamed from: a */
    public final boolean mo1757a(MenuItem menuItem) {
        if (menuItem != null) {
            switch (menuItem.getItemId()) {
                case R.id.menuItemHelpline /*2131296466*/:
                    this.f2034a.mo3175T().mo3801g();
                    break;
                case R.id.menuItemHome /*2131296467*/:
                    this.f2034a.mo3175T().mo3794a();
                    break;
                case R.id.menuItemProfile /*2131296468*/:
                    this.f2034a.mo3175T().mo3800f();
                    break;
            }
            return true;
        }
        C4638h.m10271a("it");
        throw null;
    }
}
