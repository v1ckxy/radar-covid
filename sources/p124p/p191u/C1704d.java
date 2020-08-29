package p124p.p191u;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import p124p.p170k.p171a.C1476b0;
import p124p.p191u.C1718i.C1721c;
import p124p.p191u.C1718i.C1722d;

@SuppressLint({"RestrictedApi"})
/* renamed from: p.u.d */
public class C1704d extends C1476b0 {

    /* renamed from: p.u.d$a */
    public class C1705a extends C1721c {
        public C1705a(C1704d dVar, Rect rect) {
        }
    }

    /* renamed from: p.u.d$b */
    public class C1706b implements C1722d {

        /* renamed from: a */
        public final /* synthetic */ View f4989a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f4990b;

        public C1706b(C1704d dVar, View view, ArrayList arrayList) {
            this.f4989a = view;
            this.f4990b = arrayList;
        }

        /* renamed from: a */
        public void mo6545a(C1718i iVar) {
        }

        /* renamed from: b */
        public void mo6535b(C1718i iVar) {
        }

        /* renamed from: c */
        public void mo6536c(C1718i iVar) {
        }

        /* renamed from: d */
        public void mo6537d(C1718i iVar) {
        }

        /* renamed from: e */
        public void mo6538e(C1718i iVar) {
            iVar.mo6574b((C1722d) this);
            this.f4989a.setVisibility(8);
            int size = this.f4990b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f4990b.get(i)).setVisibility(0);
            }
        }
    }

    /* renamed from: p.u.d$c */
    public class C1707c extends C1725l {

        /* renamed from: a */
        public final /* synthetic */ Object f4991a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f4992b;

        /* renamed from: c */
        public final /* synthetic */ Object f4993c;

        /* renamed from: d */
        public final /* synthetic */ ArrayList f4994d;

        /* renamed from: e */
        public final /* synthetic */ Object f4995e;

        /* renamed from: f */
        public final /* synthetic */ ArrayList f4996f;

        public C1707c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f4991a = obj;
            this.f4992b = arrayList;
            this.f4993c = obj2;
            this.f4994d = arrayList2;
            this.f4995e = obj3;
            this.f4996f = arrayList3;
        }

        /* renamed from: a */
        public void mo6545a(C1718i iVar) {
            Object obj = this.f4991a;
            if (obj != null) {
                C1704d.this.mo6051a(obj, this.f4992b, null);
            }
            Object obj2 = this.f4993c;
            if (obj2 != null) {
                C1704d.this.mo6051a(obj2, this.f4994d, null);
            }
            Object obj3 = this.f4995e;
            if (obj3 != null) {
                C1704d.this.mo6051a(obj3, this.f4996f, null);
            }
        }

        /* renamed from: e */
        public void mo6538e(C1718i iVar) {
            iVar.mo6574b((C1722d) this);
        }
    }

    /* renamed from: p.u.d$d */
    public class C1708d extends C1721c {
        public C1708d(C1704d dVar, Rect rect) {
        }
    }

    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo6043a(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
        /*
            r1 = this;
            p.u.i r2 = (p124p.p191u.C1718i) r2
            p.u.i r3 = (p124p.p191u.C1718i) r3
            p.u.i r4 = (p124p.p191u.C1718i) r4
            if (r2 == 0) goto L_0x001b
            if (r3 == 0) goto L_0x001b
            p.u.o r0 = new p.u.o
            r0.<init>()
            r0.mo6595a(r2)
            r0.mo6595a(r3)
            r2 = 1
            r0.mo6596b(r2)
            r2 = r0
            goto L_0x0023
        L_0x001b:
            if (r2 == 0) goto L_0x001e
            goto L_0x0023
        L_0x001e:
            if (r3 == 0) goto L_0x0022
            r2 = r3
            goto L_0x0023
        L_0x0022:
            r2 = 0
        L_0x0023:
            if (r4 == 0) goto L_0x0033
            p.u.o r3 = new p.u.o
            r3.<init>()
            if (r2 == 0) goto L_0x002f
            r3.mo6595a(r2)
        L_0x002f:
            r3.mo6595a(r4)
            return r3
        L_0x0033:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p191u.C1704d.mo6043a(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* renamed from: a */
    public void mo6045a(ViewGroup viewGroup, Object obj) {
        C1726m.m4343a(viewGroup, (C1718i) obj);
    }

    /* renamed from: a */
    public void mo6046a(Object obj, Rect rect) {
        if (obj != null) {
            ((C1718i) obj).mo6570a((C1721c) new C1708d(this, rect));
        }
    }

    /* renamed from: a */
    public void mo6047a(Object obj, View view) {
        if (obj != null) {
            ((C1718i) obj).mo6564a(view);
        }
    }

    /* renamed from: a */
    public void mo6048a(Object obj, View view, ArrayList<View> arrayList) {
        ((C1718i) obj).mo6565a((C1722d) new C1706b(this, view, arrayList));
    }

    /* renamed from: a */
    public void mo6049a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        C1718i iVar = (C1718i) obj;
        C1707c cVar = new C1707c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3);
        iVar.mo6565a((C1722d) cVar);
    }

    /* renamed from: a */
    public void mo6050a(Object obj, ArrayList<View> arrayList) {
        C1718i iVar = (C1718i) obj;
        if (iVar != null) {
            int i = 0;
            if (iVar instanceof C1730o) {
                C1730o oVar = (C1730o) iVar;
                int size = oVar.f5062M.size();
                while (i < size) {
                    mo6050a((Object) oVar.mo6594a(i), arrayList);
                    i++;
                }
            } else if (!m4261a(iVar) && C1476b0.m3722a((List) iVar.f5030j)) {
                int size2 = arrayList.size();
                while (i < size2) {
                    iVar.mo6564a((View) arrayList.get(i));
                    i++;
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo6054a(Object obj) {
        return obj instanceof C1718i;
    }

    /* renamed from: b */
    public Object mo6055b(Object obj) {
        if (obj != null) {
            return ((C1718i) obj).clone();
        }
        return null;
    }

    /* renamed from: b */
    public Object mo6056b(Object obj, Object obj2, Object obj3) {
        C1730o oVar = new C1730o();
        if (obj != null) {
            oVar.mo6595a((C1718i) obj);
        }
        if (obj2 != null) {
            oVar.mo6595a((C1718i) obj2);
        }
        if (obj3 != null) {
            oVar.mo6595a((C1718i) obj3);
        }
        return oVar;
    }

    /* renamed from: b */
    public void mo6057b(Object obj, View view) {
        if (obj != null) {
            ((C1718i) obj).mo6583d(view);
        }
    }

    /* renamed from: b */
    public void mo6058b(Object obj, View view, ArrayList<View> arrayList) {
        C1730o oVar = (C1730o) obj;
        ArrayList<View> arrayList2 = oVar.f5030j;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1476b0.m3721a((List<View>) arrayList2, (View) arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        mo6050a((Object) oVar, arrayList);
    }

    /* renamed from: c */
    public Object mo6060c(Object obj) {
        if (obj == null) {
            return null;
        }
        C1730o oVar = new C1730o();
        oVar.mo6595a((C1718i) obj);
        return oVar;
    }

    /* renamed from: c */
    public void mo6061c(Object obj, View view) {
        if (view != null) {
            C1718i iVar = (C1718i) obj;
            Rect rect = new Rect();
            mo6044a(view, rect);
            iVar.mo6570a((C1721c) new C1705a(this, rect));
        }
    }

    /* renamed from: b */
    public void mo6059b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        C1730o oVar = (C1730o) obj;
        if (oVar != null) {
            oVar.f5030j.clear();
            oVar.f5030j.addAll(arrayList2);
            mo6051a((Object) oVar, arrayList, arrayList2);
        }
    }

    /* renamed from: a */
    public static boolean m4261a(C1718i iVar) {
        return !C1476b0.m3722a((List) iVar.f5029i) || !C1476b0.m3722a((List) iVar.f5031k) || !C1476b0.m3722a((List) iVar.f5032l);
    }

    /* renamed from: a */
    public void mo6051a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        C1718i iVar = (C1718i) obj;
        int i = 0;
        if (iVar instanceof C1730o) {
            C1730o oVar = (C1730o) iVar;
            int size = oVar.f5062M.size();
            while (i < size) {
                mo6051a((Object) oVar.mo6594a(i), arrayList, arrayList2);
                i++;
            }
        } else if (!m4261a(iVar)) {
            ArrayList<View> arrayList3 = iVar.f5030j;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size2) {
                    iVar.mo6564a((View) arrayList2.get(i));
                    i++;
                }
                int size3 = arrayList.size();
                while (true) {
                    size3--;
                    if (size3 >= 0) {
                        iVar.mo6583d((View) arrayList.get(size3));
                    } else {
                        return;
                    }
                }
            }
        }
    }
}
