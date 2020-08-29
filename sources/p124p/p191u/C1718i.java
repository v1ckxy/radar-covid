package p124p.p191u;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import p116io.jsonwebtoken.lang.Objects;
import p124p.p143e.C1248a;
import p124p.p143e.C1252d;
import p124p.p143e.C1253e;
import p124p.p150h.p162l.C1404o;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: p.u.i */
public abstract class C1718i implements Cloneable {

    /* renamed from: J */
    public static final int[] f5013J = {2, 1, 3, 4};

    /* renamed from: K */
    public static final C1712e f5014K = new C1719a();

    /* renamed from: L */
    public static ThreadLocal<C1248a<Animator, C1720b>> f5015L = new ThreadLocal<>();

    /* renamed from: A */
    public ArrayList<Animator> f5016A = new ArrayList<>();

    /* renamed from: B */
    public int f5017B = 0;

    /* renamed from: C */
    public boolean f5018C = false;

    /* renamed from: D */
    public boolean f5019D = false;

    /* renamed from: E */
    public ArrayList<C1722d> f5020E = null;

    /* renamed from: F */
    public ArrayList<Animator> f5021F = new ArrayList<>();

    /* renamed from: G */
    public C1729n f5022G;

    /* renamed from: H */
    public C1721c f5023H;

    /* renamed from: I */
    public C1712e f5024I = f5014K;

    /* renamed from: e */
    public String f5025e = getClass().getName();

    /* renamed from: f */
    public long f5026f = -1;

    /* renamed from: g */
    public long f5027g = -1;

    /* renamed from: h */
    public TimeInterpolator f5028h = null;

    /* renamed from: i */
    public ArrayList<Integer> f5029i = new ArrayList<>();

    /* renamed from: j */
    public ArrayList<View> f5030j = new ArrayList<>();

    /* renamed from: k */
    public ArrayList<String> f5031k = null;

    /* renamed from: l */
    public ArrayList<Class<?>> f5032l = null;

    /* renamed from: m */
    public ArrayList<Integer> f5033m = null;

    /* renamed from: n */
    public ArrayList<View> f5034n = null;

    /* renamed from: o */
    public ArrayList<Class<?>> f5035o = null;

    /* renamed from: p */
    public ArrayList<String> f5036p = null;

    /* renamed from: q */
    public ArrayList<Integer> f5037q = null;

    /* renamed from: r */
    public ArrayList<View> f5038r = null;

    /* renamed from: s */
    public ArrayList<Class<?>> f5039s = null;

    /* renamed from: t */
    public C1735r f5040t = new C1735r();

    /* renamed from: u */
    public C1735r f5041u = new C1735r();

    /* renamed from: v */
    public C1730o f5042v = null;

    /* renamed from: w */
    public int[] f5043w = f5013J;

    /* renamed from: x */
    public ArrayList<C1734q> f5044x;

    /* renamed from: y */
    public ArrayList<C1734q> f5045y;

    /* renamed from: z */
    public boolean f5046z = false;

    /* renamed from: p.u.i$a */
    public static class C1719a extends C1712e {
        /* renamed from: a */
        public Path mo6557a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* renamed from: p.u.i$b */
    public static class C1720b {

        /* renamed from: a */
        public View f5047a;

        /* renamed from: b */
        public String f5048b;

        /* renamed from: c */
        public C1734q f5049c;

        /* renamed from: d */
        public C1715f0 f5050d;

        /* renamed from: e */
        public C1718i f5051e;

        public C1720b(View view, String str, C1718i iVar, C1715f0 f0Var, C1734q qVar) {
            this.f5047a = view;
            this.f5048b = str;
            this.f5049c = qVar;
            this.f5050d = f0Var;
            this.f5051e = iVar;
        }
    }

    /* renamed from: p.u.i$c */
    public static abstract class C1721c {
    }

    /* renamed from: p.u.i$d */
    public interface C1722d {
        /* renamed from: a */
        void mo6545a(C1718i iVar);

        /* renamed from: b */
        void mo6535b(C1718i iVar);

        /* renamed from: c */
        void mo6536c(C1718i iVar);

        /* renamed from: d */
        void mo6537d(C1718i iVar);

        /* renamed from: e */
        void mo6538e(C1718i iVar);
    }

    /* renamed from: a */
    public static void m4300a(C1735r rVar, View view, C1734q qVar) {
        rVar.f5073a.put(view, qVar);
        int id = view.getId();
        if (id >= 0) {
            if (rVar.f5074b.indexOfKey(id) >= 0) {
                rVar.f5074b.put(id, null);
            } else {
                rVar.f5074b.put(id, view);
            }
        }
        String q = C1404o.m3556q(view);
        if (q != null) {
            if (rVar.f5076d.mo5587a((Object) q) >= 0) {
                rVar.f5076d.put(q, null);
            } else {
                rVar.f5076d.put(q, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                C1253e<View> eVar = rVar.f5075c;
                if (eVar.f3557e) {
                    eVar.mo5518c();
                }
                if (C1252d.m3160a(eVar.f3558f, eVar.f3560h, itemIdAtPosition) >= 0) {
                    View view2 = (View) rVar.f5075c.mo5515b(itemIdAtPosition);
                    if (view2 != null) {
                        view2.setHasTransientState(false);
                        rVar.f5075c.mo5520c(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                view.setHasTransientState(true);
                rVar.f5075c.mo5520c(itemIdAtPosition, view);
            }
        }
    }

    /* renamed from: a */
    public static boolean m4301a(C1734q qVar, C1734q qVar2, String str) {
        Object obj = qVar.f5070a.get(str);
        Object obj2 = qVar2.f5070a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    /* renamed from: i */
    public static C1248a<Animator, C1720b> m4302i() {
        C1248a<Animator, C1720b> aVar = (C1248a) f5015L.get();
        if (aVar != null) {
            return aVar;
        }
        C1248a<Animator, C1720b> aVar2 = new C1248a<>();
        f5015L.set(aVar2);
        return aVar2;
    }

    /* renamed from: a */
    public Animator mo6515a(ViewGroup viewGroup, C1734q qVar, C1734q qVar2) {
        return null;
    }

    /* renamed from: a */
    public String mo6561a(String str) {
        StringBuilder a = C1965a.m4756a(str);
        a.append(getClass().getSimpleName());
        a.append("@");
        a.append(Integer.toHexString(hashCode()));
        a.append(": ");
        String sb = a.toString();
        String str2 = ") ";
        if (this.f5027g != -1) {
            StringBuilder b = C1965a.m4763b(sb, "dur(");
            b.append(this.f5027g);
            b.append(str2);
            sb = b.toString();
        }
        if (this.f5026f != -1) {
            StringBuilder b2 = C1965a.m4763b(sb, "dly(");
            b2.append(this.f5026f);
            b2.append(str2);
            sb = b2.toString();
        }
        if (this.f5028h != null) {
            StringBuilder b3 = C1965a.m4763b(sb, "interp(");
            b3.append(this.f5028h);
            b3.append(str2);
            sb = b3.toString();
        }
        if (this.f5029i.size() <= 0 && this.f5030j.size() <= 0) {
            return sb;
        }
        String a2 = C1965a.m4751a(sb, "tgts(");
        int size = this.f5029i.size();
        String str3 = Objects.ARRAY_ELEMENT_SEPARATOR;
        if (size > 0) {
            for (int i = 0; i < this.f5029i.size(); i++) {
                if (i > 0) {
                    a2 = C1965a.m4751a(a2, str3);
                }
                StringBuilder a3 = C1965a.m4756a(a2);
                a3.append(this.f5029i.get(i));
                a2 = a3.toString();
            }
        }
        if (this.f5030j.size() > 0) {
            for (int i2 = 0; i2 < this.f5030j.size(); i2++) {
                if (i2 > 0) {
                    a2 = C1965a.m4751a(a2, str3);
                }
                StringBuilder a4 = C1965a.m4756a(a2);
                a4.append(this.f5030j.get(i2));
                a2 = a4.toString();
            }
        }
        return C1965a.m4751a(a2, ")");
    }

    /* renamed from: a */
    public C1718i mo6562a(long j) {
        this.f5027g = j;
        return this;
    }

    /* renamed from: a */
    public C1718i mo6563a(TimeInterpolator timeInterpolator) {
        this.f5028h = timeInterpolator;
        return this;
    }

    /* renamed from: a */
    public C1718i mo6564a(View view) {
        this.f5030j.add(view);
        return this;
    }

    /* renamed from: a */
    public C1718i mo6565a(C1722d dVar) {
        if (this.f5020E == null) {
            this.f5020E = new ArrayList<>();
        }
        this.f5020E.add(dVar);
        return this;
    }

    /* renamed from: a */
    public final void mo6566a(View view, boolean z) {
        if (view != null) {
            int id = view.getId();
            ArrayList<Integer> arrayList = this.f5033m;
            if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
                ArrayList<View> arrayList2 = this.f5034n;
                if (arrayList2 == null || !arrayList2.contains(view)) {
                    ArrayList<Class<?>> arrayList3 = this.f5035o;
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        int i = 0;
                        while (i < size) {
                            if (!((Class) this.f5035o.get(i)).isInstance(view)) {
                                i++;
                            } else {
                                return;
                            }
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        C1734q qVar = new C1734q(view);
                        if (z) {
                            mo6517c(qVar);
                        } else {
                            mo6516a(qVar);
                        }
                        qVar.f5072c.add(this);
                        mo6577b(qVar);
                        m4300a(z ? this.f5040t : this.f5041u, view, qVar);
                    }
                    if (view instanceof ViewGroup) {
                        ArrayList<Integer> arrayList4 = this.f5037q;
                        if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                            ArrayList<View> arrayList5 = this.f5038r;
                            if (arrayList5 == null || !arrayList5.contains(view)) {
                                ArrayList<Class<?>> arrayList6 = this.f5039s;
                                if (arrayList6 != null) {
                                    int size2 = arrayList6.size();
                                    int i2 = 0;
                                    while (i2 < size2) {
                                        if (!((Class) this.f5039s.get(i2)).isInstance(view)) {
                                            i2++;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                ViewGroup viewGroup = (ViewGroup) view;
                                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                                    mo6566a(viewGroup.getChildAt(i3), z);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo6568a(ViewGroup viewGroup, boolean z) {
        mo6572a(z);
        if (this.f5029i.size() > 0 || this.f5030j.size() > 0) {
            ArrayList<String> arrayList = this.f5031k;
            if (arrayList == null || arrayList.isEmpty()) {
                ArrayList<Class<?>> arrayList2 = this.f5032l;
                if (arrayList2 == null || arrayList2.isEmpty()) {
                    for (int i = 0; i < this.f5029i.size(); i++) {
                        View findViewById = viewGroup.findViewById(((Integer) this.f5029i.get(i)).intValue());
                        if (findViewById != null) {
                            C1734q qVar = new C1734q(findViewById);
                            if (z) {
                                mo6517c(qVar);
                            } else {
                                mo6516a(qVar);
                            }
                            qVar.f5072c.add(this);
                            mo6577b(qVar);
                            m4300a(z ? this.f5040t : this.f5041u, findViewById, qVar);
                        }
                    }
                    for (int i2 = 0; i2 < this.f5030j.size(); i2++) {
                        View view = (View) this.f5030j.get(i2);
                        C1734q qVar2 = new C1734q(view);
                        if (z) {
                            mo6517c(qVar2);
                        } else {
                            mo6516a(qVar2);
                        }
                        qVar2.f5072c.add(this);
                        mo6577b(qVar2);
                        m4300a(z ? this.f5040t : this.f5041u, view, qVar2);
                    }
                    return;
                }
            }
        }
        mo6566a((View) viewGroup, z);
    }

    /* renamed from: a */
    public void mo6569a(C1712e eVar) {
        if (eVar == null) {
            eVar = f5014K;
        }
        this.f5024I = eVar;
    }

    /* renamed from: a */
    public void mo6570a(C1721c cVar) {
        this.f5023H = cVar;
    }

    /* renamed from: a */
    public void mo6571a(C1729n nVar) {
        this.f5022G = nVar;
    }

    /* renamed from: a */
    public abstract void mo6516a(C1734q qVar);

    /* renamed from: a */
    public void mo6572a(boolean z) {
        C1735r rVar;
        if (z) {
            this.f5040t.f5073a.clear();
            this.f5040t.f5074b.clear();
            rVar = this.f5040t;
        } else {
            this.f5041u.f5073a.clear();
            this.f5041u.f5074b.clear();
            rVar = this.f5041u;
        }
        rVar.f5075c.mo5517b();
    }

    /* renamed from: a */
    public boolean mo6546a(C1734q qVar, C1734q qVar2) {
        if (qVar == null || qVar2 == null) {
            return false;
        }
        String[] c = mo6518c();
        if (c != null) {
            int length = c.length;
            int i = 0;
            while (i < length) {
                if (!m4301a(qVar, qVar2, c[i])) {
                    i++;
                }
            }
            return false;
        }
        for (String a : qVar.f5070a.keySet()) {
            if (m4301a(qVar, qVar2, a)) {
            }
        }
        return false;
        return true;
    }

    /* renamed from: b */
    public C1718i mo6573b(long j) {
        this.f5026f = j;
        return this;
    }

    /* renamed from: b */
    public C1718i mo6574b(C1722d dVar) {
        ArrayList<C1722d> arrayList = this.f5020E;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(dVar);
        if (this.f5020E.size() == 0) {
            this.f5020E = null;
        }
        return this;
    }

    /* renamed from: b */
    public C1734q mo6575b(View view, boolean z) {
        C1730o oVar = this.f5042v;
        if (oVar != null) {
            return oVar.mo6575b(view, z);
        }
        ArrayList<C1734q> arrayList = z ? this.f5044x : this.f5045y;
        C1734q qVar = null;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            C1734q qVar2 = (C1734q) arrayList.get(i2);
            if (qVar2 == null) {
                return null;
            }
            if (qVar2.f5071b == view) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i >= 0) {
            qVar = (C1734q) (z ? this.f5045y : this.f5044x).get(i);
        }
        return qVar;
    }

    /* renamed from: b */
    public void mo6576b() {
        int i = this.f5017B - 1;
        this.f5017B = i;
        if (i == 0) {
            ArrayList<C1722d> arrayList = this.f5020E;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f5020E.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((C1722d) arrayList2.get(i2)).mo6538e(this);
                }
            }
            for (int i3 = 0; i3 < this.f5040t.f5075c.mo5523e(); i3++) {
                View view = (View) this.f5040t.f5075c.mo5514b(i3);
                if (view != null) {
                    C1404o.m3536b(view, false);
                }
            }
            for (int i4 = 0; i4 < this.f5041u.f5075c.mo5523e(); i4++) {
                View view2 = (View) this.f5041u.f5075c.mo5514b(i4);
                if (view2 != null) {
                    C1404o.m3536b(view2, false);
                }
            }
            this.f5019D = true;
        }
    }

    /* renamed from: b */
    public void mo6577b(C1734q qVar) {
    }

    /* renamed from: b */
    public boolean mo6578b(View view) {
        int id = view.getId();
        ArrayList<Integer> arrayList = this.f5033m;
        if (arrayList != null && arrayList.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList2 = this.f5034n;
        if (arrayList2 != null && arrayList2.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList3 = this.f5035o;
        if (arrayList3 != null) {
            int size = arrayList3.size();
            for (int i = 0; i < size; i++) {
                if (((Class) this.f5035o.get(i)).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f5036p != null && C1404o.m3556q(view) != null && this.f5036p.contains(view.getTransitionName())) {
            return false;
        }
        if (this.f5029i.size() == 0 && this.f5030j.size() == 0) {
            ArrayList<Class<?>> arrayList4 = this.f5032l;
            if (arrayList4 == null || arrayList4.isEmpty()) {
                ArrayList<String> arrayList5 = this.f5031k;
                if (arrayList5 == null || arrayList5.isEmpty()) {
                    return true;
                }
            }
        }
        if (this.f5029i.contains(Integer.valueOf(id)) || this.f5030j.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f5031k;
        if (arrayList6 != null && arrayList6.contains(C1404o.m3556q(view))) {
            return true;
        }
        if (this.f5032l != null) {
            for (int i2 = 0; i2 < this.f5032l.size(); i2++) {
                if (((Class) this.f5032l.get(i2)).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public C1734q mo6579c(View view, boolean z) {
        C1730o oVar = this.f5042v;
        if (oVar != null) {
            return oVar.mo6579c(view, z);
        }
        return (C1734q) (z ? this.f5040t : this.f5041u).f5073a.getOrDefault(view, null);
    }

    /* renamed from: c */
    public abstract void mo6517c(C1734q qVar);

    /* renamed from: c */
    public String[] mo6518c() {
        return null;
    }

    public void cancel() {
        for (int size = this.f5016A.size() - 1; size >= 0; size--) {
            ((Animator) this.f5016A.get(size)).cancel();
        }
        ArrayList<C1722d> arrayList = this.f5020E;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f5020E.clone();
            int size2 = arrayList2.size();
            for (int i = 0; i < size2; i++) {
                ((C1722d) arrayList2.get(i)).mo6535b(this);
            }
        }
    }

    public C1718i clone() {
        try {
            C1718i iVar = (C1718i) super.clone();
            iVar.f5021F = new ArrayList<>();
            iVar.f5040t = new C1735r();
            iVar.f5041u = new C1735r();
            iVar.f5044x = null;
            iVar.f5045y = null;
            return iVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public C1718i mo6583d(View view) {
        this.f5030j.remove(view);
        return this;
    }

    /* renamed from: d */
    public void mo6584d() {
        mo6585e();
        C1248a i = m4302i();
        Iterator it = this.f5021F.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (i.containsKey(animator)) {
                mo6585e();
                if (animator != null) {
                    animator.addListener(new C1723j(this, i));
                    long j = this.f5027g;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.f5026f;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.f5028h;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new C1724k(this));
                    animator.start();
                }
            }
        }
        this.f5021F.clear();
        mo6576b();
    }

    /* renamed from: e */
    public void mo6585e() {
        if (this.f5017B == 0) {
            ArrayList<C1722d> arrayList = this.f5020E;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f5020E.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((C1722d) arrayList2.get(i)).mo6545a(this);
                }
            }
            this.f5019D = false;
        }
        this.f5017B++;
    }

    /* renamed from: e */
    public void mo6586e(View view) {
        if (this.f5018C) {
            if (!this.f5019D) {
                C1248a i = m4302i();
                int i2 = i.f3589g;
                C1715f0 c = C1739v.m4377c(view);
                for (int i3 = i2 - 1; i3 >= 0; i3--) {
                    C1720b bVar = (C1720b) i.mo5598e(i3);
                    if (bVar.f5047a != null && c.equals(bVar.f5050d)) {
                        ((Animator) i.mo5593c(i3)).resume();
                    }
                }
                ArrayList<C1722d> arrayList = this.f5020E;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f5020E.clone();
                    int size = arrayList2.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        ((C1722d) arrayList2.get(i4)).mo6537d(this);
                    }
                }
            }
            this.f5018C = false;
        }
    }

    public String toString() {
        return mo6561a(Objects.EMPTY_STRING);
    }

    /* renamed from: c */
    public void mo6580c(View view) {
        if (!this.f5019D) {
            C1248a i = m4302i();
            int i2 = i.f3589g;
            C1715f0 c = C1739v.m4377c(view);
            for (int i3 = i2 - 1; i3 >= 0; i3--) {
                C1720b bVar = (C1720b) i.mo5598e(i3);
                if (bVar.f5047a != null && c.equals(bVar.f5050d)) {
                    ((Animator) i.mo5593c(i3)).pause();
                }
            }
            ArrayList<C1722d> arrayList = this.f5020E;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f5020E.clone();
                int size = arrayList2.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((C1722d) arrayList2.get(i4)).mo6536c(this);
                }
            }
            this.f5018C = true;
        }
    }

    /* renamed from: a */
    public void mo6567a(ViewGroup viewGroup, C1735r rVar, C1735r rVar2, ArrayList<C1734q> arrayList, ArrayList<C1734q> arrayList2) {
        int i;
        Animator animator;
        C1734q qVar;
        View view;
        C1734q qVar2;
        Animator animator2;
        C1248a i2 = m4302i();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            C1734q qVar3 = (C1734q) arrayList.get(i3);
            C1734q qVar4 = (C1734q) arrayList2.get(i3);
            if (qVar3 != null && !qVar3.f5072c.contains(this)) {
                qVar3 = null;
            }
            if (qVar4 != null && !qVar4.f5072c.contains(this)) {
                qVar4 = null;
            }
            if (!(qVar3 == null && qVar4 == null)) {
                if (qVar3 == null || qVar4 == null || mo6546a(qVar3, qVar4)) {
                    Animator a = mo6515a(viewGroup, qVar3, qVar4);
                    if (a != null) {
                        if (qVar4 != null) {
                            View view2 = qVar4.f5071b;
                            String[] c = mo6518c();
                            if (c != null && c.length > 0) {
                                qVar2 = new C1734q(view2);
                                C1734q qVar5 = (C1734q) rVar2.f5073a.get(view2);
                                if (qVar5 != null) {
                                    int i4 = 0;
                                    while (i4 < c.length) {
                                        Animator animator3 = a;
                                        int i5 = size;
                                        C1734q qVar6 = qVar5;
                                        qVar2.f5070a.put(c[i4], qVar5.f5070a.get(c[i4]));
                                        i4++;
                                        a = animator3;
                                        size = i5;
                                        qVar5 = qVar6;
                                    }
                                }
                                Animator animator4 = a;
                                i = size;
                                int i6 = i2.f3589g;
                                int i7 = 0;
                                while (true) {
                                    if (i7 >= i6) {
                                        animator2 = animator4;
                                        break;
                                    }
                                    C1720b bVar = (C1720b) i2.get((Animator) i2.mo5593c(i7));
                                    if (bVar.f5049c != null && bVar.f5047a == view2 && bVar.f5048b.equals(this.f5025e) && bVar.f5049c.equals(qVar2)) {
                                        animator2 = null;
                                        break;
                                    }
                                    i7++;
                                }
                            } else {
                                C1735r rVar3 = rVar2;
                                i = size;
                                animator2 = a;
                                qVar2 = null;
                            }
                            view = view2;
                            animator = animator2;
                            qVar = qVar2;
                        } else {
                            C1735r rVar4 = rVar2;
                            Animator animator5 = a;
                            i = size;
                            view = qVar3.f5071b;
                            animator = animator5;
                            qVar = null;
                        }
                        if (animator != null) {
                            C1720b bVar2 = new C1720b(view, this.f5025e, this, C1739v.m4377c(viewGroup), qVar);
                            i2.put(animator, bVar2);
                            this.f5021F.add(animator);
                        }
                        i3++;
                        size = i;
                    }
                    C1735r rVar5 = rVar2;
                    i = size;
                    i3++;
                    size = i;
                }
            }
            ViewGroup viewGroup2 = viewGroup;
            C1735r rVar52 = rVar2;
            i = size;
            i3++;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i8 = 0; i8 < sparseIntArray.size(); i8++) {
                Animator animator6 = (Animator) this.f5021F.get(sparseIntArray.keyAt(i8));
                animator6.setStartDelay(animator6.getStartDelay() + (((long) sparseIntArray.valueAt(i8)) - RecyclerView.FOREVER_NS));
            }
        }
    }
}
