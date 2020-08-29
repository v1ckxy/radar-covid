package p124p.p126b.p134p;

import android.content.Context;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import p124p.p126b.p134p.C1089a.C1090a;
import p124p.p126b.p134p.p135i.C1120j;
import p124p.p126b.p134p.p135i.C1133o;
import p124p.p143e.C1261h;
import p124p.p150h.p156g.p157a.C1346a;
import p124p.p150h.p156g.p157a.C1347b;

/* renamed from: p.b.p.e */
public class C1094e extends ActionMode {

    /* renamed from: a */
    public final Context f2929a;

    /* renamed from: b */
    public final C1089a f2930b;

    /* renamed from: p.b.p.e$a */
    public static class C1095a implements C1090a {

        /* renamed from: a */
        public final Callback f2931a;

        /* renamed from: b */
        public final Context f2932b;

        /* renamed from: c */
        public final ArrayList<C1094e> f2933c = new ArrayList<>();

        /* renamed from: d */
        public final C1261h<Menu, Menu> f2934d = new C1261h<>();

        public C1095a(Context context, Callback callback) {
            this.f2932b = context;
            this.f2931a = callback;
        }

        /* renamed from: a */
        public final Menu mo4676a(Menu menu) {
            Menu menu2 = (Menu) this.f2934d.getOrDefault(menu, null);
            if (menu2 != null) {
                return menu2;
            }
            C1133o oVar = new C1133o(this.f2932b, (C1346a) menu);
            this.f2934d.put(menu, oVar);
            return oVar;
        }

        /* renamed from: a */
        public void mo4494a(C1089a aVar) {
            this.f2931a.onDestroyActionMode(mo4677b(aVar));
        }

        /* renamed from: a */
        public boolean mo4495a(C1089a aVar, Menu menu) {
            return this.f2931a.onPrepareActionMode(mo4677b(aVar), mo4676a(menu));
        }

        /* renamed from: a */
        public boolean mo4496a(C1089a aVar, MenuItem menuItem) {
            return this.f2931a.onActionItemClicked(mo4677b(aVar), new C1120j(this.f2932b, (C1347b) menuItem));
        }

        /* renamed from: b */
        public ActionMode mo4677b(C1089a aVar) {
            int size = this.f2933c.size();
            for (int i = 0; i < size; i++) {
                C1094e eVar = (C1094e) this.f2933c.get(i);
                if (eVar != null && eVar.f2930b == aVar) {
                    return eVar;
                }
            }
            C1094e eVar2 = new C1094e(this.f2932b, aVar);
            this.f2933c.add(eVar2);
            return eVar2;
        }

        /* renamed from: b */
        public boolean mo4497b(C1089a aVar, Menu menu) {
            return this.f2931a.onCreateActionMode(mo4677b(aVar), mo4676a(menu));
        }
    }

    public C1094e(Context context, C1089a aVar) {
        this.f2929a = context;
        this.f2930b = aVar;
    }

    public void finish() {
        this.f2930b.mo4540a();
    }

    public View getCustomView() {
        return this.f2930b.mo4545b();
    }

    public Menu getMenu() {
        return new C1133o(this.f2929a, (C1346a) this.f2930b.mo4548c());
    }

    public MenuInflater getMenuInflater() {
        return this.f2930b.mo4549d();
    }

    public CharSequence getSubtitle() {
        return this.f2930b.mo4550e();
    }

    public Object getTag() {
        return this.f2930b.f2917e;
    }

    public CharSequence getTitle() {
        return this.f2930b.mo4551f();
    }

    public boolean getTitleOptionalHint() {
        return this.f2930b.f2918f;
    }

    public void invalidate() {
        this.f2930b.mo4552g();
    }

    public boolean isTitleOptional() {
        return this.f2930b.mo4553h();
    }

    public void setCustomView(View view) {
        this.f2930b.mo4542a(view);
    }

    public void setSubtitle(int i) {
        this.f2930b.mo4541a(i);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f2930b.mo4543a(charSequence);
    }

    public void setTag(Object obj) {
        this.f2930b.f2917e = obj;
    }

    public void setTitle(int i) {
        this.f2930b.mo4546b(i);
    }

    public void setTitle(CharSequence charSequence) {
        this.f2930b.mo4547b(charSequence);
    }

    public void setTitleOptionalHint(boolean z) {
        this.f2930b.mo4544a(z);
    }
}
