package p124p.p126b.p134p.p135i;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import p124p.p126b.p134p.p135i.C1129m.C1130a;
import p124p.p126b.p134p.p135i.C1131n.C1132a;
import p124p.p126b.p136q.C1147c;
import p124p.p126b.p136q.C1147c.C1149b;

/* renamed from: p.b.p.i.b */
public abstract class C1103b implements C1129m {

    /* renamed from: e */
    public Context f3005e;

    /* renamed from: f */
    public Context f3006f;

    /* renamed from: g */
    public C1114g f3007g;

    /* renamed from: h */
    public LayoutInflater f3008h;

    /* renamed from: i */
    public C1130a f3009i;

    /* renamed from: j */
    public int f3010j;

    /* renamed from: k */
    public int f3011k;

    /* renamed from: l */
    public C1131n f3012l;

    /* renamed from: m */
    public int f3013m;

    public C1103b(Context context, int i, int i2) {
        this.f3005e = context;
        this.f3008h = LayoutInflater.from(context);
        this.f3010j = i;
        this.f3011k = i2;
    }

    /* renamed from: a */
    public View mo4759a(C1118i iVar, View view, ViewGroup viewGroup) {
        C1132a aVar = view instanceof C1132a ? (C1132a) view : (C1132a) this.f3008h.inflate(this.f3011k, viewGroup, false);
        C1147c cVar = (C1147c) this;
        aVar.mo38a(iVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) cVar.f3012l);
        if (cVar.f3200B == null) {
            cVar.f3200B = new C1149b();
        }
        actionMenuItemView.setPopupCallback(cVar.f3200B);
        return (View) aVar;
    }

    /* renamed from: a */
    public void mo535a(C1130a aVar) {
        this.f3009i = aVar;
    }

    /* renamed from: a */
    public boolean mo537a(C1114g gVar, C1118i iVar) {
        return false;
    }

    /* renamed from: a */
    public boolean mo538a(C1138r rVar) {
        C1130a aVar = this.f3009i;
        if (aVar != null) {
            return aVar.mo197a(rVar);
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo540b(C1114g gVar, C1118i iVar) {
        return false;
    }

    public int getId() {
        return this.f3013m;
    }

    /* renamed from: a */
    public void mo536a(boolean z) {
        int i;
        boolean z2;
        ViewGroup viewGroup = (ViewGroup) this.f3012l;
        if (viewGroup != null) {
            C1114g gVar = this.f3007g;
            if (gVar != null) {
                gVar.mo4800a();
                ArrayList d = this.f3007g.mo4830d();
                int size = d.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    C1118i iVar = (C1118i) d.get(i2);
                    if (iVar.mo4860d()) {
                        View childAt = viewGroup.getChildAt(i);
                        C1118i itemData = childAt instanceof C1132a ? ((C1132a) childAt).getItemData() : null;
                        View a = mo4759a(iVar, childAt, viewGroup);
                        if (iVar != itemData) {
                            a.setPressed(false);
                            a.jumpDrawablesToCurrentState();
                        }
                        if (a != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a);
                            }
                            ((ViewGroup) this.f3012l).addView(a, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == ((C1147c) this).f3203n) {
                    z2 = false;
                } else {
                    viewGroup.removeViewAt(i);
                    z2 = true;
                }
                if (!z2) {
                    i++;
                }
            }
        }
    }
}
