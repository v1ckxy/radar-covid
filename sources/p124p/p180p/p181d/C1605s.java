package p124p.p180p.p181d;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView.C0120o;
import androidx.recyclerview.widget.RecyclerView.C0125p;

/* renamed from: p.p.d.s */
public class C1605s extends C1606t {
    public C1605s(C0120o oVar) {
        super(oVar, null);
    }

    /* renamed from: a */
    public int mo6354a() {
        return this.f4729a.f811r;
    }

    /* renamed from: a */
    public int mo6355a(View view) {
        return this.f4729a.mo1218c(view) + ((C0125p) view.getLayoutParams()).bottomMargin;
    }

    /* renamed from: a */
    public void mo6356a(int i) {
        this.f4729a.mo1227e(i);
    }

    /* renamed from: b */
    public int mo6357b() {
        C0120o oVar = this.f4729a;
        return oVar.f811r - oVar.mo1238j();
    }

    /* renamed from: b */
    public int mo6358b(View view) {
        C0125p pVar = (C0125p) view.getLayoutParams();
        return this.f4729a.mo1225e(view) + pVar.topMargin + pVar.bottomMargin;
    }

    /* renamed from: c */
    public int mo6359c() {
        return this.f4729a.mo1238j();
    }

    /* renamed from: c */
    public int mo6360c(View view) {
        C0125p pVar = (C0125p) view.getLayoutParams();
        return this.f4729a.mo1229f(view) + pVar.leftMargin + pVar.rightMargin;
    }

    /* renamed from: d */
    public int mo6361d() {
        return this.f4729a.f809p;
    }

    /* renamed from: d */
    public int mo6362d(View view) {
        return this.f4729a.mo1235h(view) - ((C0125p) view.getLayoutParams()).topMargin;
    }

    /* renamed from: e */
    public int mo6363e() {
        return this.f4729a.f808o;
    }

    /* renamed from: e */
    public int mo6364e(View view) {
        this.f4729a.mo1205a(view, true, this.f4731c);
        return this.f4731c.bottom;
    }

    /* renamed from: f */
    public int mo6365f() {
        return this.f4729a.mo1241m();
    }

    /* renamed from: f */
    public int mo6366f(View view) {
        this.f4729a.mo1205a(view, true, this.f4731c);
        return this.f4731c.top;
    }

    /* renamed from: g */
    public int mo6367g() {
        C0120o oVar = this.f4729a;
        return (oVar.f811r - oVar.mo1241m()) - this.f4729a.mo1238j();
    }
}
