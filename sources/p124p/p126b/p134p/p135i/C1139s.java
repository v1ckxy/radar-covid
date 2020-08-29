package p124p.p126b.p134p.p135i;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p124p.p150h.p156g.p157a.C1348c;

/* renamed from: p.b.p.i.s */
public class C1139s extends C1133o implements SubMenu {

    /* renamed from: e */
    public final C1348c f3181e;

    public C1139s(Context context, C1348c cVar) {
        super(context, cVar);
        this.f3181e = cVar;
    }

    public void clearHeader() {
        this.f3181e.clearHeader();
    }

    public MenuItem getItem() {
        return mo4760a(this.f3181e.getItem());
    }

    public SubMenu setHeaderIcon(int i) {
        this.f3181e.setHeaderIcon(i);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f3181e.setHeaderIcon(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(int i) {
        this.f3181e.setHeaderTitle(i);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f3181e.setHeaderTitle(charSequence);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        this.f3181e.setHeaderView(view);
        return this;
    }

    public SubMenu setIcon(int i) {
        this.f3181e.setIcon(i);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f3181e.setIcon(drawable);
        return this;
    }
}
