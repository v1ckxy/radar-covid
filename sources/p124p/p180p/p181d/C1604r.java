package p124p.p180p.p181d;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView.C0120o;
import androidx.recyclerview.widget.RecyclerView.C0125p;

/* renamed from: p.p.d.r */
public class C1604r extends C1606t {
    public C1604r(C0120o oVar) {
        super(oVar, null);
    }

    /* renamed from: a */
    public int mo6354a() {
        return this.f4729a.f810q;
    }

    /* renamed from: a */
    public int mo6355a(View view) {
        return this.f4729a.mo1232g(view) + ((C0125p) view.getLayoutParams()).rightMargin;
    }

    /* renamed from: a */
    public void mo6356a(int i) {
        this.f4729a.mo1224d(i);
    }

    /* renamed from: b */
    public int mo6357b() {
        C0120o oVar = this.f4729a;
        return oVar.f810q - oVar.mo1240l();
    }

    /* renamed from: b */
    public int mo6358b(View view) {
        C0125p pVar = (C0125p) view.getLayoutParams();
        return this.f4729a.mo1229f(view) + pVar.leftMargin + pVar.rightMargin;
    }

    /* renamed from: c */
    public int mo6359c() {
        return this.f4729a.mo1240l();
    }

    /* renamed from: c */
    public int mo6360c(View view) {
        C0125p pVar = (C0125p) view.getLayoutParams();
        return this.f4729a.mo1225e(view) + pVar.topMargin + pVar.bottomMargin;
    }

    /* renamed from: d */
    public int mo6361d() {
        return this.f4729a.f808o;
    }

    /* renamed from: d */
    public int mo6362d(View view) {
        return this.f4729a.mo1223d(view) - ((C0125p) view.getLayoutParams()).leftMargin;
    }

    /* renamed from: e */
    public int mo6363e() {
        return this.f4729a.f809p;
    }

    /* renamed from: e */
    public int mo6364e(View view) {
        this.f4729a.mo1205a(view, true, this.f4731c);
        return this.f4731c.right;
    }

    /* renamed from: f */
    public int mo6365f() {
        return this.f4729a.mo1239k();
    }

    /* renamed from: f */
    public int mo6366f(View view) {
        this.f4729a.mo1205a(view, true, this.f4731c);
        return this.f4731c.left;
    }

    /* renamed from: g */
    public int mo6367g() {
        C0120o oVar = this.f4729a;
        return (oVar.f810q - oVar.mo1239k()) - this.f4729a.mo1240l();
    }
}
