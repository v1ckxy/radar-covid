package p124p.p126b.p134p.p135i;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p124p.p126b.p134p.p135i.C1114g.C1115a;

/* renamed from: p.b.p.i.r */
public class C1138r extends C1114g implements SubMenu {

    /* renamed from: A */
    public C1114g f3179A;

    /* renamed from: B */
    public C1118i f3180B;

    public C1138r(Context context, C1114g gVar, C1118i iVar) {
        super(context);
        this.f3179A = gVar;
        this.f3180B = iVar;
    }

    /* renamed from: a */
    public void mo4805a(C1115a aVar) {
        this.f3179A.mo4805a(aVar);
    }

    /* renamed from: a */
    public boolean mo4811a(C1114g gVar, MenuItem menuItem) {
        return super.mo4811a(gVar, menuItem) || this.f3179A.mo4811a(gVar, menuItem);
    }

    /* renamed from: a */
    public boolean mo4812a(C1118i iVar) {
        return this.f3179A.mo4812a(iVar);
    }

    /* renamed from: b */
    public String mo4822b() {
        C1118i iVar = this.f3180B;
        int i = iVar != null ? iVar.f3104a : 0;
        if (i == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("android:menu:actionviewstates");
        sb.append(":");
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: b */
    public boolean mo4825b(C1118i iVar) {
        return this.f3179A.mo4825b(iVar);
    }

    /* renamed from: c */
    public C1114g mo4826c() {
        return this.f3179A.mo4826c();
    }

    /* renamed from: e */
    public boolean mo4831e() {
        return this.f3179A.mo4831e();
    }

    /* renamed from: f */
    public boolean mo4832f() {
        return this.f3179A.mo4832f();
    }

    /* renamed from: g */
    public boolean mo4834g() {
        return this.f3179A.mo4834g();
    }

    public MenuItem getItem() {
        return this.f3180B;
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f3179A.setGroupDividerEnabled(z);
    }

    public SubMenu setHeaderIcon(int i) {
        mo4801a(0, null, i, null, null);
        return this;
    }

    public SubMenu setHeaderTitle(int i) {
        mo4801a(i, null, 0, null, null);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        mo4801a(0, null, 0, null, view);
        return this;
    }

    public SubMenu setIcon(int i) {
        this.f3180B.setIcon(i);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f3180B.setIcon(drawable);
        return this;
    }

    public void setQwertyMode(boolean z) {
        this.f3179A.setQwertyMode(z);
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        mo4801a(0, null, 0, drawable, null);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        mo4801a(0, charSequence, 0, null, null);
        return this;
    }
}
