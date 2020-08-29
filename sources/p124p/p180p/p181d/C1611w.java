package p124p.p180p.p181d;

import androidx.recyclerview.widget.RecyclerView.C0105d0;
import androidx.recyclerview.widget.RecyclerView.C0114l;
import androidx.recyclerview.widget.RecyclerView.C0114l.C0117c;
import java.util.ArrayList;
import p124p.p180p.p181d.C1587k.C1588a;

/* renamed from: p.p.d.w */
public abstract class C1611w extends C0114l {

    /* renamed from: g */
    public boolean f4739g = true;

    /* renamed from: a */
    public abstract boolean mo6319a(C0105d0 d0Var, int i, int i2, int i3, int i4);

    /* renamed from: a */
    public boolean mo1189a(C0105d0 d0Var, C0105d0 d0Var2, C0117c cVar, C0117c cVar2) {
        int i;
        int i2;
        int i3 = cVar.f791a;
        int i4 = cVar.f792b;
        if (d0Var2.mo1164o()) {
            int i5 = cVar.f791a;
            i = cVar.f792b;
            i2 = i5;
        } else {
            i2 = cVar2.f791a;
            i = cVar2.f792b;
        }
        C1587k kVar = (C1587k) this;
        if (d0Var == d0Var2) {
            return kVar.mo6319a(d0Var, i3, i4, i2, i);
        }
        float translationX = d0Var.f757a.getTranslationX();
        float translationY = d0Var.f757a.getTranslationY();
        float alpha = d0Var.f757a.getAlpha();
        kVar.mo6322e(d0Var);
        int i6 = (int) (((float) (i2 - i3)) - translationX);
        int i7 = (int) (((float) (i - i4)) - translationY);
        d0Var.f757a.setTranslationX(translationX);
        d0Var.f757a.setTranslationY(translationY);
        d0Var.f757a.setAlpha(alpha);
        kVar.mo6322e(d0Var2);
        d0Var2.f757a.setTranslationX((float) (-i6));
        d0Var2.f757a.setTranslationY((float) (-i7));
        d0Var2.f757a.setAlpha(0.0f);
        ArrayList<C1588a> arrayList = kVar.f4639k;
        C1588a aVar = new C1588a(d0Var, d0Var2, i3, i4, i2, i);
        arrayList.add(aVar);
        return true;
    }
}
