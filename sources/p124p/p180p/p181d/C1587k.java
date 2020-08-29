package p124p.p180p.p181d;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView.C0105d0;
import java.util.ArrayList;
import java.util.List;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: p.p.d.k */
public class C1587k extends C1611w {

    /* renamed from: s */
    public static TimeInterpolator f4635s;

    /* renamed from: h */
    public ArrayList<C0105d0> f4636h = new ArrayList<>();

    /* renamed from: i */
    public ArrayList<C0105d0> f4637i = new ArrayList<>();

    /* renamed from: j */
    public ArrayList<C1589b> f4638j = new ArrayList<>();

    /* renamed from: k */
    public ArrayList<C1588a> f4639k = new ArrayList<>();

    /* renamed from: l */
    public ArrayList<ArrayList<C0105d0>> f4640l = new ArrayList<>();

    /* renamed from: m */
    public ArrayList<ArrayList<C1589b>> f4641m = new ArrayList<>();

    /* renamed from: n */
    public ArrayList<ArrayList<C1588a>> f4642n = new ArrayList<>();

    /* renamed from: o */
    public ArrayList<C0105d0> f4643o = new ArrayList<>();

    /* renamed from: p */
    public ArrayList<C0105d0> f4644p = new ArrayList<>();

    /* renamed from: q */
    public ArrayList<C0105d0> f4645q = new ArrayList<>();

    /* renamed from: r */
    public ArrayList<C0105d0> f4646r = new ArrayList<>();

    /* renamed from: p.p.d.k$a */
    public static class C1588a {

        /* renamed from: a */
        public C0105d0 f4647a;

        /* renamed from: b */
        public C0105d0 f4648b;

        /* renamed from: c */
        public int f4649c;

        /* renamed from: d */
        public int f4650d;

        /* renamed from: e */
        public int f4651e;

        /* renamed from: f */
        public int f4652f;

        public C1588a(C0105d0 d0Var, C0105d0 d0Var2, int i, int i2, int i3, int i4) {
            this.f4647a = d0Var;
            this.f4648b = d0Var2;
            this.f4649c = i;
            this.f4650d = i2;
            this.f4651e = i3;
            this.f4652f = i4;
        }

        public String toString() {
            StringBuilder a = C1965a.m4756a("ChangeInfo{oldHolder=");
            a.append(this.f4647a);
            a.append(", newHolder=");
            a.append(this.f4648b);
            a.append(", fromX=");
            a.append(this.f4649c);
            a.append(", fromY=");
            a.append(this.f4650d);
            a.append(", toX=");
            a.append(this.f4651e);
            a.append(", toY=");
            a.append(this.f4652f);
            a.append('}');
            return a.toString();
        }
    }

    /* renamed from: p.p.d.k$b */
    public static class C1589b {

        /* renamed from: a */
        public C0105d0 f4653a;

        /* renamed from: b */
        public int f4654b;

        /* renamed from: c */
        public int f4655c;

        /* renamed from: d */
        public int f4656d;

        /* renamed from: e */
        public int f4657e;

        public C1589b(C0105d0 d0Var, int i, int i2, int i3, int i4) {
            this.f4653a = d0Var;
            this.f4654b = i;
            this.f4655c = i2;
            this.f4656d = i3;
            this.f4657e = i4;
        }
    }

    /* renamed from: a */
    public void mo6317a(List<C0105d0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((C0105d0) list.get(size)).f757a.animate().cancel();
        }
    }

    /* renamed from: a */
    public final void mo6318a(List<C1588a> list, C0105d0 d0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C1588a aVar = (C1588a) list.get(size);
            if (mo6320a(aVar, d0Var) && aVar.f4647a == null && aVar.f4648b == null) {
                list.remove(aVar);
            }
        }
    }

    /* renamed from: a */
    public boolean mo6319a(C0105d0 d0Var, int i, int i2, int i3, int i4) {
        View view = d0Var.f757a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) d0Var.f757a.getTranslationY());
        mo6322e(d0Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            mo1188a(d0Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX((float) (-i5));
        }
        if (i6 != 0) {
            view.setTranslationY((float) (-i6));
        }
        ArrayList<C1589b> arrayList = this.f4638j;
        C1589b bVar = new C1589b(d0Var, translationX, translationY, i3, i4);
        arrayList.add(bVar);
        return true;
    }

    /* renamed from: a */
    public boolean mo1190a(C0105d0 d0Var, List<Object> list) {
        return !list.isEmpty() || super.mo1190a(d0Var, list);
    }

    /* renamed from: b */
    public void mo1192b(C0105d0 d0Var) {
        View view = d0Var.f757a;
        view.animate().cancel();
        int size = this.f4638j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((C1589b) this.f4638j.get(size)).f4653a == d0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                mo1188a(d0Var);
                this.f4638j.remove(size);
            }
        }
        mo6318a((List<C1588a>) this.f4639k, d0Var);
        if (this.f4636h.remove(d0Var)) {
            view.setAlpha(1.0f);
            mo1188a(d0Var);
        }
        if (this.f4637i.remove(d0Var)) {
            view.setAlpha(1.0f);
            mo1188a(d0Var);
        }
        for (int size2 = this.f4642n.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.f4642n.get(size2);
            mo6318a((List<C1588a>) arrayList, d0Var);
            if (arrayList.isEmpty()) {
                this.f4642n.remove(size2);
            }
        }
        for (int size3 = this.f4641m.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.f4641m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((C1589b) arrayList2.get(size4)).f4653a == d0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    mo1188a(d0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f4641m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f4640l.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.f4640l.get(size5);
            if (arrayList3.remove(d0Var)) {
                view.setAlpha(1.0f);
                mo1188a(d0Var);
                if (arrayList3.isEmpty()) {
                    this.f4640l.remove(size5);
                }
            }
        }
        this.f4645q.remove(d0Var);
        this.f4643o.remove(d0Var);
        this.f4646r.remove(d0Var);
        this.f4644p.remove(d0Var);
        mo6321d();
    }

    /* renamed from: c */
    public boolean mo1194c() {
        return !this.f4637i.isEmpty() || !this.f4639k.isEmpty() || !this.f4638j.isEmpty() || !this.f4636h.isEmpty() || !this.f4644p.isEmpty() || !this.f4645q.isEmpty() || !this.f4643o.isEmpty() || !this.f4646r.isEmpty() || !this.f4641m.isEmpty() || !this.f4640l.isEmpty() || !this.f4642n.isEmpty();
    }

    /* renamed from: d */
    public void mo6321d() {
        if (!mo1194c()) {
            mo1187a();
        }
    }

    /* renamed from: e */
    public final void mo6322e(C0105d0 d0Var) {
        if (f4635s == null) {
            f4635s = new ValueAnimator().getInterpolator();
        }
        d0Var.f757a.animate().setInterpolator(f4635s);
        mo1192b(d0Var);
    }

    /* renamed from: a */
    public final boolean mo6320a(C1588a aVar, C0105d0 d0Var) {
        if (aVar.f4648b == d0Var) {
            aVar.f4648b = null;
        } else if (aVar.f4647a != d0Var) {
            return false;
        } else {
            aVar.f4647a = null;
        }
        d0Var.f757a.setAlpha(1.0f);
        d0Var.f757a.setTranslationX(0.0f);
        d0Var.f757a.setTranslationY(0.0f);
        mo1188a(d0Var);
        return true;
    }

    /* renamed from: b */
    public void mo1191b() {
        int size = this.f4638j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C1589b bVar = (C1589b) this.f4638j.get(size);
            View view = bVar.f4653a.f757a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            mo1188a(bVar.f4653a);
            this.f4638j.remove(size);
        }
        int size2 = this.f4636h.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            mo1188a((C0105d0) this.f4636h.get(size2));
            this.f4636h.remove(size2);
        }
        int size3 = this.f4637i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            C0105d0 d0Var = (C0105d0) this.f4637i.get(size3);
            d0Var.f757a.setAlpha(1.0f);
            mo1188a(d0Var);
            this.f4637i.remove(size3);
        }
        int size4 = this.f4639k.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            C1588a aVar = (C1588a) this.f4639k.get(size4);
            C0105d0 d0Var2 = aVar.f4647a;
            if (d0Var2 != null) {
                mo6320a(aVar, d0Var2);
            }
            C0105d0 d0Var3 = aVar.f4648b;
            if (d0Var3 != null) {
                mo6320a(aVar, d0Var3);
            }
        }
        this.f4639k.clear();
        if (mo1194c()) {
            int size5 = this.f4641m.size();
            while (true) {
                size5--;
                if (size5 < 0) {
                    break;
                }
                ArrayList arrayList = (ArrayList) this.f4641m.get(size5);
                int size6 = arrayList.size();
                while (true) {
                    size6--;
                    if (size6 >= 0) {
                        C1589b bVar2 = (C1589b) arrayList.get(size6);
                        View view2 = bVar2.f4653a.f757a;
                        view2.setTranslationY(0.0f);
                        view2.setTranslationX(0.0f);
                        mo1188a(bVar2.f4653a);
                        arrayList.remove(size6);
                        if (arrayList.isEmpty()) {
                            this.f4641m.remove(arrayList);
                        }
                    }
                }
            }
            int size7 = this.f4640l.size();
            while (true) {
                size7--;
                if (size7 < 0) {
                    break;
                }
                ArrayList arrayList2 = (ArrayList) this.f4640l.get(size7);
                int size8 = arrayList2.size();
                while (true) {
                    size8--;
                    if (size8 >= 0) {
                        C0105d0 d0Var4 = (C0105d0) arrayList2.get(size8);
                        d0Var4.f757a.setAlpha(1.0f);
                        mo1188a(d0Var4);
                        arrayList2.remove(size8);
                        if (arrayList2.isEmpty()) {
                            this.f4640l.remove(arrayList2);
                        }
                    }
                }
            }
            int size9 = this.f4642n.size();
            while (true) {
                size9--;
                if (size9 >= 0) {
                    ArrayList arrayList3 = (ArrayList) this.f4642n.get(size9);
                    int size10 = arrayList3.size();
                    while (true) {
                        size10--;
                        if (size10 >= 0) {
                            C1588a aVar2 = (C1588a) arrayList3.get(size10);
                            C0105d0 d0Var5 = aVar2.f4647a;
                            if (d0Var5 != null) {
                                mo6320a(aVar2, d0Var5);
                            }
                            C0105d0 d0Var6 = aVar2.f4648b;
                            if (d0Var6 != null) {
                                mo6320a(aVar2, d0Var6);
                            }
                            if (arrayList3.isEmpty()) {
                                this.f4642n.remove(arrayList3);
                            }
                        }
                    }
                } else {
                    mo6317a(this.f4645q);
                    mo6317a(this.f4644p);
                    mo6317a(this.f4643o);
                    mo6317a(this.f4646r);
                    mo1187a();
                    return;
                }
            }
        }
    }
}
