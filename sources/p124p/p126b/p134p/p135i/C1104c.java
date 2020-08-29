package p124p.p126b.p134p.p135i;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Map;
import p124p.p143e.C1248a;
import p124p.p150h.p156g.p157a.C1347b;
import p124p.p150h.p156g.p157a.C1348c;

/* renamed from: p.b.p.i.c */
public abstract class C1104c {

    /* renamed from: a */
    public final Context f3014a;

    /* renamed from: b */
    public Map<C1347b, MenuItem> f3015b;

    /* renamed from: c */
    public Map<C1348c, SubMenu> f3016c;

    public C1104c(Context context) {
        this.f3014a = context;
    }

    /* renamed from: a */
    public final MenuItem mo4760a(MenuItem menuItem) {
        if (!(menuItem instanceof C1347b)) {
            return menuItem;
        }
        C1347b bVar = (C1347b) menuItem;
        if (this.f3015b == null) {
            this.f3015b = new C1248a();
        }
        MenuItem menuItem2 = (MenuItem) this.f3015b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        C1120j jVar = new C1120j(this.f3014a, bVar);
        this.f3015b.put(bVar, jVar);
        return jVar;
    }

    /* renamed from: a */
    public final SubMenu mo4761a(SubMenu subMenu) {
        if (!(subMenu instanceof C1348c)) {
            return subMenu;
        }
        C1348c cVar = (C1348c) subMenu;
        if (this.f3016c == null) {
            this.f3016c = new C1248a();
        }
        SubMenu subMenu2 = (SubMenu) this.f3016c.get(cVar);
        if (subMenu2 == null) {
            subMenu2 = new C1139s(this.f3014a, cVar);
            this.f3016c.put(cVar, subMenu2);
        }
        return subMenu2;
    }
}
