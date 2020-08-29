package p124p.p126b.p134p;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import p124p.p126b.p134p.C1089a.C1090a;
import p124p.p126b.p134p.p135i.C1114g;
import p124p.p126b.p134p.p135i.C1114g.C1115a;
import p124p.p126b.p136q.C1147c;

/* renamed from: p.b.p.d */
public class C1093d extends C1089a implements C1115a {

    /* renamed from: g */
    public Context f2923g;

    /* renamed from: h */
    public ActionBarContextView f2924h;

    /* renamed from: i */
    public C1090a f2925i;

    /* renamed from: j */
    public WeakReference<View> f2926j;

    /* renamed from: k */
    public boolean f2927k;

    /* renamed from: l */
    public C1114g f2928l;

    public C1093d(Context context, ActionBarContextView actionBarContextView, C1090a aVar, boolean z) {
        this.f2923g = context;
        this.f2924h = actionBarContextView;
        this.f2925i = aVar;
        C1114g gVar = new C1114g(actionBarContextView.getContext());
        this.f2928l = gVar;
        gVar.f3076e = this;
    }

    /* renamed from: a */
    public void mo4540a() {
        if (!this.f2927k) {
            this.f2927k = true;
            this.f2924h.sendAccessibilityEvent(32);
            this.f2925i.mo4494a(this);
        }
    }

    /* renamed from: a */
    public void mo4542a(View view) {
        this.f2924h.setCustomView(view);
        this.f2926j = view != null ? new WeakReference<>(view) : null;
    }

    /* renamed from: a */
    public void mo4543a(CharSequence charSequence) {
        this.f2924h.setSubtitle(charSequence);
    }

    /* renamed from: a */
    public void mo198a(C1114g gVar) {
        mo4552g();
        C1147c cVar = this.f2924h.f3185h;
        if (cVar != null) {
            cVar.mo5059g();
        }
    }

    /* renamed from: a */
    public boolean mo199a(C1114g gVar, MenuItem menuItem) {
        return this.f2925i.mo4496a((C1089a) this, menuItem);
    }

    /* renamed from: b */
    public View mo4545b() {
        WeakReference<View> weakReference = this.f2926j;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* renamed from: b */
    public void mo4546b(int i) {
        this.f2924h.setTitle(this.f2923g.getString(i));
    }

    /* renamed from: b */
    public void mo4547b(CharSequence charSequence) {
        this.f2924h.setTitle(charSequence);
    }

    /* renamed from: c */
    public Menu mo4548c() {
        return this.f2928l;
    }

    /* renamed from: d */
    public MenuInflater mo4549d() {
        return new C1096f(this.f2924h.getContext());
    }

    /* renamed from: e */
    public CharSequence mo4550e() {
        return this.f2924h.getSubtitle();
    }

    /* renamed from: f */
    public CharSequence mo4551f() {
        return this.f2924h.getTitle();
    }

    /* renamed from: g */
    public void mo4552g() {
        this.f2925i.mo4495a((C1089a) this, (Menu) this.f2928l);
    }

    /* renamed from: h */
    public boolean mo4553h() {
        return this.f2924h.f145v;
    }

    /* renamed from: a */
    public void mo4541a(int i) {
        this.f2924h.setSubtitle(this.f2923g.getString(i));
    }

    /* renamed from: a */
    public void mo4544a(boolean z) {
        this.f2918f = z;
        this.f2924h.setTitleOptional(z);
    }
}
