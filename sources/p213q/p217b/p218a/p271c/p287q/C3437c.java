package p213q.p217b.p218a.p271c.p287q;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import p124p.p126b.p134p.p135i.C1114g;
import p124p.p126b.p134p.p135i.C1118i;

/* renamed from: q.b.a.c.q.c */
public final class C3437c extends C1114g {
    public C3437c(Context context) {
        super(context);
    }

    /* renamed from: a */
    public MenuItem mo4798a(int i, int i2, int i3, CharSequence charSequence) {
        if (size() + 1 <= 5) {
            mo4840j();
            MenuItem a = super.mo4798a(i, i2, i3, charSequence);
            ((C1118i) a).mo4857b(true);
            mo4838i();
            return a;
        }
        throw new IllegalArgumentException("Maximum number of items supported by BottomNavigationView is 5. Limit can be checked with BottomNavigationView#getMaxItemCount()");
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        throw new UnsupportedOperationException("BottomNavigationView does not support submenus");
    }
}
