package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Fragment.C0086e;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0105d0;
import androidx.recyclerview.widget.RecyclerView.C0108g;
import androidx.recyclerview.widget.RecyclerView.C0111i;
import androidx.viewpager2.widget.ViewPager2;
import androidx.viewpager2.widget.ViewPager2.C0166g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p002es.gob.radarcovid.features.onboarding.view.OnboardingActivity.C0399a;
import p124p.p143e.C1253e;
import p124p.p150h.p162l.C1404o;
import p124p.p170k.p171a.C1472a;
import p124p.p170k.p171a.C1482e;
import p124p.p170k.p171a.C1488j;
import p124p.p170k.p171a.C1490k;
import p124p.p170k.p171a.C1490k.C1496f;
import p124p.p177n.C1537e;
import p124p.p177n.C1537e.C1538a;
import p124p.p177n.C1537e.C1539b;
import p124p.p177n.C1540f;
import p124p.p177n.C1542h;
import p124p.p177n.C1543i;
import p124p.p196x.p197b.C1769a;
import p124p.p196x.p197b.C1770b;
import p124p.p196x.p197b.C1771c;
import p124p.p196x.p197b.C1772d;
import p124p.p196x.p197b.C1773e;
import p124p.p196x.p197b.C1774f;
import p124p.p196x.p197b.C1775g;
import p213q.p214a.p215a.p216a.C1965a;

public abstract class FragmentStateAdapter extends C0108g<C1774f> implements C1775g {

    /* renamed from: d */
    public final C1537e f918d;

    /* renamed from: e */
    public final C1488j f919e;

    /* renamed from: f */
    public final C1253e<Fragment> f920f = new C1253e<>();

    /* renamed from: g */
    public final C1253e<C0086e> f921g = new C1253e<>();

    /* renamed from: h */
    public final C1253e<Integer> f922h = new C1253e<>();

    /* renamed from: i */
    public C0156c f923i;

    /* renamed from: j */
    public C0155b f924j = new C0155b();

    /* renamed from: k */
    public boolean f925k = false;

    /* renamed from: l */
    public boolean f926l = false;

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$a */
    public static abstract class C0154a extends C0111i {
        public /* synthetic */ C0154a(C1769a aVar) {
        }
    }

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$b */
    public static class C0155b {

        /* renamed from: a */
        public List<C0157d> f931a = new CopyOnWriteArrayList();

        /* renamed from: a */
        public List<C0159b> mo1367a(Fragment fragment, C1539b bVar) {
            ArrayList arrayList = new ArrayList();
            for (C0157d a : this.f931a) {
                arrayList.add(a.mo1371a());
            }
            return arrayList;
        }

        /* renamed from: a */
        public void mo1368a(List<C0159b> list) {
            for (C0159b a : list) {
                a.mo1374a();
            }
        }
    }

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$c */
    public class C0156c {

        /* renamed from: a */
        public C0166g f932a;

        /* renamed from: b */
        public C0111i f933b;

        /* renamed from: c */
        public C1540f f934c;

        /* renamed from: d */
        public ViewPager2 f935d;

        /* renamed from: e */
        public long f936e = -1;

        public C0156c() {
        }

        /* renamed from: a */
        public final ViewPager2 mo1369a(RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Expected ViewPager2 instance. Got: ");
            sb.append(parent);
            throw new IllegalStateException(sb.toString());
        }

        /* renamed from: a */
        public void mo1370a(boolean z) {
            if (!FragmentStateAdapter.this.mo1366d() && this.f935d.getScrollState() == 0 && !FragmentStateAdapter.this.f920f.mo5522d() && ((C0399a) FragmentStateAdapter.this).f1757m != 0) {
                int currentItem = this.f935d.getCurrentItem();
                FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
                if (currentItem < ((C0399a) fragmentStateAdapter).f1757m) {
                    Fragment fragment = null;
                    if (fragmentStateAdapter != null) {
                        long j = (long) currentItem;
                        if (j != this.f936e || z) {
                            Fragment fragment2 = (Fragment) FragmentStateAdapter.this.f920f.mo5515b(j);
                            if (fragment2 != null && fragment2.mo809e0()) {
                                this.f936e = j;
                                C1490k kVar = (C1490k) FragmentStateAdapter.this.f919e;
                                if (kVar != null) {
                                    C1472a aVar = new C1472a(kVar);
                                    ArrayList arrayList = new ArrayList();
                                    for (int i = 0; i < FragmentStateAdapter.this.f920f.mo5523e(); i++) {
                                        long a = FragmentStateAdapter.this.f920f.mo5511a(i);
                                        Fragment fragment3 = (Fragment) FragmentStateAdapter.this.f920f.mo5514b(i);
                                        if (fragment3.mo809e0()) {
                                            if (a != this.f936e) {
                                                aVar.mo6027a(fragment3, C1539b.STARTED);
                                                arrayList.add(FragmentStateAdapter.this.f924j.mo1367a(fragment3, C1539b.STARTED));
                                            } else {
                                                fragment = fragment3;
                                            }
                                            boolean z2 = a == this.f936e;
                                            if (fragment3.f591H != z2) {
                                                fragment3.f591H = z2;
                                            }
                                        }
                                    }
                                    if (fragment != null) {
                                        aVar.mo6027a(fragment, C1539b.RESUMED);
                                        arrayList.add(FragmentStateAdapter.this.f924j.mo1367a(fragment, C1539b.RESUMED));
                                    }
                                    if (!aVar.f4458a.isEmpty()) {
                                        aVar.mo6033b();
                                        Collections.reverse(arrayList);
                                        Iterator it = arrayList.iterator();
                                        while (it.hasNext()) {
                                            FragmentStateAdapter.this.f924j.mo1368a((List) it.next());
                                        }
                                    }
                                    return;
                                }
                                throw null;
                            }
                            return;
                        }
                        return;
                    }
                    throw null;
                }
            }
        }
    }

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$d */
    public static abstract class C0157d {

        /* renamed from: a */
        public static final C0159b f938a = new C0158a();

        /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$d$a */
        public class C0158a implements C0159b {
            /* renamed from: a */
            public void mo1374a() {
            }
        }

        /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$d$b */
        public interface C0159b {
            /* renamed from: a */
            void mo1374a();
        }

        /* renamed from: a */
        public C0159b mo1371a() {
            return f938a;
        }

        /* renamed from: b */
        public C0159b mo1372b() {
            return f938a;
        }

        /* renamed from: c */
        public C0159b mo1373c() {
            return f938a;
        }
    }

    public FragmentStateAdapter(C1482e eVar) {
        C1488j J = eVar.mo6067J();
        C1543i iVar = eVar.f0f;
        this.f919e = J;
        this.f918d = iVar;
        if (!this.f778a.mo1182a()) {
            this.f779b = true;
            return;
        }
        throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    }

    /* renamed from: a */
    public static boolean m730a(String str, String str2) {
        return str.startsWith(str2) && str.length() > str2.length();
    }

    /* renamed from: a */
    public long mo1173a(int i) {
        return (long) i;
    }

    /* renamed from: a */
    public void mo1360a(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        } else if (view.getParent() != frameLayout) {
            if (frameLayout.getChildCount() > 0) {
                frameLayout.removeAllViews();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            frameLayout.addView(view);
        }
    }

    /* renamed from: a */
    public boolean mo1362a(long j) {
        return j >= 0 && j < ((long) ((C0399a) this).f1757m);
    }

    /* renamed from: a */
    public boolean mo1177a(C0105d0 d0Var) {
        C1774f fVar = (C1774f) d0Var;
        return true;
    }

    /* renamed from: b */
    public final Long mo1363b(int i) {
        Long l = null;
        for (int i2 = 0; i2 < this.f922h.mo5523e(); i2++) {
            if (((Integer) this.f922h.mo5514b(i2)).intValue() == i) {
                if (l == null) {
                    l = Long.valueOf(this.f922h.mo5511a(i2));
                } else {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
            }
        }
        return l;
    }

    /* renamed from: b */
    public void mo1180b(RecyclerView recyclerView) {
        C0156c cVar = this.f923i;
        ViewPager2 a = cVar.mo1369a(recyclerView);
        a.f942g.f5202a.remove(cVar.f932a);
        FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
        fragmentStateAdapter.f778a.unregisterObserver(cVar.f933b);
        C1537e eVar = FragmentStateAdapter.this.f918d;
        ((C1543i) eVar).f4558a.remove(cVar.f934c);
        cVar.f935d = null;
        this.f923i = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006a, code lost:
        if (r5.getParent() == null) goto L_0x006d;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1365c() {
        /*
            r8 = this;
            boolean r0 = r8.f926l
            if (r0 == 0) goto L_0x0092
            boolean r0 = r8.mo1366d()
            if (r0 == 0) goto L_0x000c
            goto L_0x0092
        L_0x000c:
            p.e.c r0 = new p.e.c
            r0.<init>()
            r1 = 0
            r2 = r1
        L_0x0013:
            p.e.e<androidx.fragment.app.Fragment> r3 = r8.f920f
            int r3 = r3.mo5523e()
            if (r2 >= r3) goto L_0x0036
            p.e.e<androidx.fragment.app.Fragment> r3 = r8.f920f
            long r3 = r3.mo5511a(r2)
            boolean r5 = r8.mo1362a(r3)
            if (r5 != 0) goto L_0x0033
            java.lang.Long r5 = java.lang.Long.valueOf(r3)
            r0.add(r5)
            p.e.e<java.lang.Integer> r5 = r8.f922h
            r5.mo5519c(r3)
        L_0x0033:
            int r2 = r2 + 1
            goto L_0x0013
        L_0x0036:
            boolean r2 = r8.f925k
            if (r2 != 0) goto L_0x007a
            r8.f926l = r1
            r2 = r1
        L_0x003d:
            p.e.e<androidx.fragment.app.Fragment> r3 = r8.f920f
            int r3 = r3.mo5523e()
            if (r2 >= r3) goto L_0x007a
            p.e.e<androidx.fragment.app.Fragment> r3 = r8.f920f
            long r3 = r3.mo5511a(r2)
            p.e.e<java.lang.Integer> r5 = r8.f922h
            boolean r5 = r5.mo5513a(r3)
            r6 = 1
            if (r5 == 0) goto L_0x0055
            goto L_0x006e
        L_0x0055:
            p.e.e<androidx.fragment.app.Fragment> r5 = r8.f920f
            r7 = 0
            java.lang.Object r5 = r5.mo5516b(r3, r7)
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
            if (r5 != 0) goto L_0x0061
            goto L_0x006d
        L_0x0061:
            android.view.View r5 = r5.f594K
            if (r5 != 0) goto L_0x0066
            goto L_0x006d
        L_0x0066:
            android.view.ViewParent r5 = r5.getParent()
            if (r5 == 0) goto L_0x006d
            goto L_0x006e
        L_0x006d:
            r6 = r1
        L_0x006e:
            if (r6 != 0) goto L_0x0077
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r0.add(r3)
        L_0x0077:
            int r2 = r2 + 1
            goto L_0x003d
        L_0x007a:
            java.util.Iterator r0 = r0.iterator()
        L_0x007e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0092
            java.lang.Object r1 = r0.next()
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r8.mo1364b(r1)
            goto L_0x007e
        L_0x0092:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.adapter.FragmentStateAdapter.mo1365c():void");
    }

    /* renamed from: d */
    public boolean mo1366d() {
        return this.f919e.mo6094b();
    }

    /* renamed from: a */
    public void mo1176a(RecyclerView recyclerView) {
        if (this.f923i == null) {
            C0156c cVar = new C0156c();
            this.f923i = cVar;
            cVar.f935d = cVar.mo1369a(recyclerView);
            C1772d dVar = new C1772d(cVar);
            cVar.f932a = dVar;
            cVar.f935d.f942g.f5202a.add(dVar);
            C1773e eVar = new C1773e(cVar);
            cVar.f933b = eVar;
            FragmentStateAdapter.this.f778a.registerObserver(eVar);
            FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3 fragmentStateAdapter$FragmentMaxLifecycleEnforcer$3 = new FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3(cVar);
            cVar.f934c = fragmentStateAdapter$FragmentMaxLifecycleEnforcer$3;
            FragmentStateAdapter.this.f918d.mo6227a(fragmentStateAdapter$FragmentMaxLifecycleEnforcer$3);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    public void mo1181c(C0105d0 d0Var) {
        Long b = mo1363b(((FrameLayout) ((C1774f) d0Var).f757a).getId());
        if (b != null) {
            mo1364b(b.longValue());
            this.f922h.mo5519c(b.longValue());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0062, code lost:
        if (r2 != null) goto L_0x0066;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1175a(androidx.recyclerview.widget.RecyclerView.C0105d0 r8, int r9) {
        /*
            r7 = this;
            p.x.b.f r8 = (p124p.p196x.p197b.C1774f) r8
            long r0 = r8.f761e
            android.view.View r2 = r8.f757a
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            int r2 = r2.getId()
            java.lang.Long r3 = r7.mo1363b(r2)
            if (r3 == 0) goto L_0x002a
            long r4 = r3.longValue()
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 == 0) goto L_0x002a
            long r4 = r3.longValue()
            r7.mo1364b(r4)
            p.e.e<java.lang.Integer> r4 = r7.f922h
            long r5 = r3.longValue()
            r4.mo5519c(r5)
        L_0x002a:
            p.e.e<java.lang.Integer> r3 = r7.f922h
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.mo5520c(r0, r2)
            long r0 = (long) r9
            p.e.e<androidx.fragment.app.Fragment> r2 = r7.f920f
            boolean r2 = r2.mo5513a(r0)
            if (r2 != 0) goto L_0x0076
            if (r9 == 0) goto L_0x004d
            r2 = 1
            if (r9 == r2) goto L_0x0047
            f.a.a.b.j.b.a r9 = new f.a.a.b.j.b.a
            r9.<init>()
            goto L_0x0052
        L_0x0047:
            es.gob.radarcovid.features.onboarding.pages.legal.view.LegalInfoFragment r9 = new es.gob.radarcovid.features.onboarding.pages.legal.view.LegalInfoFragment
            r9.<init>()
            goto L_0x0052
        L_0x004d:
            f.a.a.b.j.b.c.e.b r9 = new f.a.a.b.j.b.c.e.b
            r9.<init>()
        L_0x0052:
            p.e.e<androidx.fragment.app.Fragment$e> r2 = r7.f921g
            java.lang.Object r2 = r2.mo5515b(r0)
            androidx.fragment.app.Fragment$e r2 = (androidx.fragment.app.Fragment.C0086e) r2
            p.k.a.k r3 = r9.f627v
            if (r3 != 0) goto L_0x006e
            if (r2 == 0) goto L_0x0065
            android.os.Bundle r2 = r2.f653e
            if (r2 == 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r2 = 0
        L_0x0066:
            r9.f611f = r2
            p.e.e<androidx.fragment.app.Fragment> r2 = r7.f920f
            r2.mo5520c(r0, r9)
            goto L_0x0076
        L_0x006e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Fragment already added"
            r8.<init>(r9)
            throw r8
        L_0x0076:
            android.view.View r9 = r8.f757a
            android.widget.FrameLayout r9 = (android.widget.FrameLayout) r9
            boolean r0 = p124p.p150h.p162l.C1404o.m3562w(r9)
            if (r0 == 0) goto L_0x0097
            android.view.ViewParent r0 = r9.getParent()
            if (r0 != 0) goto L_0x008f
            p.x.b.a r0 = new p.x.b.a
            r0.<init>(r7, r9, r8)
            r9.addOnLayoutChangeListener(r0)
            goto L_0x0097
        L_0x008f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Design assumption violated."
            r8.<init>(r9)
            throw r8
        L_0x0097:
            r7.mo1365c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.adapter.FragmentStateAdapter.mo1175a(androidx.recyclerview.widget.RecyclerView$d0, int):void");
    }

    /* renamed from: b */
    public void mo1179b(C0105d0 d0Var) {
        mo1361a((C1774f) d0Var);
        mo1365c();
    }

    /* renamed from: b */
    public final void mo1364b(long j) {
        Object obj;
        Fragment fragment = (Fragment) this.f920f.mo5516b(j, null);
        if (fragment != null) {
            View view = fragment.f594K;
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent != null) {
                    ((FrameLayout) parent).removeAllViews();
                }
            }
            if (!mo1362a(j)) {
                this.f921g.mo5519c(j);
            }
            if (!fragment.mo809e0()) {
                this.f920f.mo5519c(j);
            } else if (mo1366d()) {
                this.f926l = true;
            } else {
                if (fragment.mo809e0() && mo1362a(j)) {
                    C1253e<C0086e> eVar = this.f921g;
                    C1490k kVar = (C1490k) this.f919e;
                    if (kVar == null) {
                        throw null;
                    } else if (fragment.f627v == kVar) {
                        if (fragment.f610e > 0) {
                            Bundle i = kVar.mo6153i(fragment);
                            if (i != null) {
                                obj = new C0086e(i);
                                eVar.mo5520c(j, obj);
                            }
                        }
                        obj = null;
                        eVar.mo5520c(j, obj);
                    } else {
                        kVar.mo6110a((RuntimeException) new IllegalStateException(C1965a.m4749a("Fragment ", fragment, " is not currently in the FragmentManager")));
                        throw null;
                    }
                }
                C0155b bVar = this.f924j;
                if (bVar != null) {
                    ArrayList arrayList = new ArrayList();
                    for (C0157d c : bVar.f931a) {
                        arrayList.add(c.mo1373c());
                    }
                    try {
                        C1490k kVar2 = (C1490k) this.f919e;
                        if (kVar2 != null) {
                            C1472a aVar = new C1472a(kVar2);
                            aVar.mo6026a(fragment);
                            aVar.mo6033b();
                            this.f920f.mo5519c(j);
                            return;
                        }
                        throw null;
                    } finally {
                        this.f924j.mo1368a(arrayList);
                    }
                } else {
                    throw null;
                }
            }
        }
    }

    /* renamed from: a */
    public C0105d0 mo1174a(ViewGroup viewGroup, int i) {
        return C1774f.m4423a(viewGroup);
    }

    /* renamed from: a */
    public void mo1361a(final C1774f fVar) {
        Fragment fragment = (Fragment) this.f920f.mo5515b(fVar.f761e);
        String str = "Design assumption violated.";
        if (fragment != null) {
            FrameLayout frameLayout = (FrameLayout) fVar.f757a;
            View view = fragment.f594K;
            if (!fragment.mo809e0() && view != null) {
                throw new IllegalStateException(str);
            } else if (fragment.mo809e0() && view == null) {
                ((C1490k) this.f919e).f4392r.add(new C1496f(new C1770b(this, fragment, frameLayout), false));
            } else if (fragment.mo809e0() && view.getParent() != null) {
                if (view.getParent() != frameLayout) {
                    mo1360a(view, frameLayout);
                }
            } else if (fragment.mo809e0()) {
                mo1360a(view, frameLayout);
            } else {
                if (!mo1366d()) {
                    ((C1490k) this.f919e).f4392r.add(new C1496f(new C1770b(this, fragment, frameLayout), false));
                    C0155b bVar = this.f924j;
                    if (bVar != null) {
                        ArrayList arrayList = new ArrayList();
                        for (C0157d b : bVar.f931a) {
                            arrayList.add(b.mo1372b());
                        }
                        try {
                            if (fragment.f591H) {
                                fragment.f591H = false;
                            }
                            C1490k kVar = (C1490k) this.f919e;
                            if (kVar != null) {
                                C1472a aVar = new C1472a(kVar);
                                StringBuilder sb = new StringBuilder();
                                sb.append("f");
                                sb.append(fVar.f761e);
                                aVar.mo6029a(0, fragment, sb.toString(), 1);
                                aVar.mo6027a(fragment, C1539b.STARTED);
                                aVar.mo6033b();
                                this.f923i.mo1370a(false);
                            } else {
                                throw null;
                            }
                        } finally {
                            this.f924j.mo1368a(arrayList);
                        }
                    } else {
                        throw null;
                    }
                } else if (!((C1490k) this.f919e).f4371A) {
                    this.f918d.mo6227a(new C1540f() {
                        /* renamed from: a */
                        public void mo9a(C1542h hVar, C1538a aVar) {
                            if (!FragmentStateAdapter.this.mo1366d()) {
                                ((C1543i) hVar.mo2g()).f4558a.remove(this);
                                if (C1404o.m3562w((FrameLayout) fVar.f757a)) {
                                    FragmentStateAdapter.this.mo1361a(fVar);
                                }
                            }
                        }
                    });
                }
            }
        } else {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: a */
    public final void mo1359a(Parcelable parcelable) {
        C1253e eVar;
        long j;
        Object obj;
        if (!this.f921g.mo5522d() || !this.f920f.mo5522d()) {
            throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
        }
        Bundle bundle = (Bundle) parcelable;
        if (bundle.getClassLoader() == null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        for (String str : bundle.keySet()) {
            if (m730a(str, "f#")) {
                j = Long.parseLong(str.substring(2));
                obj = this.f919e.mo6088a(bundle, str);
                eVar = this.f920f;
            } else if (m730a(str, "s#")) {
                j = Long.parseLong(str.substring(2));
                obj = (C0086e) bundle.getParcelable(str);
                if (mo1362a(j)) {
                    eVar = this.f921g;
                }
            } else {
                throw new IllegalArgumentException(C1965a.m4751a("Unexpected key in savedState: ", str));
            }
            eVar.mo5520c(j, obj);
        }
        if (!this.f920f.mo5522d()) {
            this.f926l = true;
            this.f925k = true;
            mo1365c();
            final Handler handler = new Handler(Looper.getMainLooper());
            final C1771c cVar = new C1771c(this);
            this.f918d.mo6227a(new C1540f(this) {
                /* renamed from: a */
                public void mo9a(C1542h hVar, C1538a aVar) {
                    if (aVar == C1538a.ON_DESTROY) {
                        handler.removeCallbacks(cVar);
                        ((C1543i) hVar.mo2g()).f4558a.remove(this);
                    }
                }
            });
            handler.postDelayed(cVar, 10000);
        }
    }

    /* renamed from: a */
    public final Parcelable mo1358a() {
        Bundle bundle = new Bundle(this.f921g.mo5523e() + this.f920f.mo5523e());
        for (int i = 0; i < this.f920f.mo5523e(); i++) {
            long a = this.f920f.mo5511a(i);
            Fragment fragment = (Fragment) this.f920f.mo5515b(a);
            if (fragment != null && fragment.mo809e0()) {
                this.f919e.mo6091a(bundle, C1965a.m4748a("f#", a), fragment);
            }
        }
        for (int i2 = 0; i2 < this.f921g.mo5523e(); i2++) {
            long a2 = this.f921g.mo5511a(i2);
            if (mo1362a(a2)) {
                bundle.putParcelable(C1965a.m4748a("s#", a2), (Parcelable) this.f921g.mo5515b(a2));
            }
        }
        return bundle;
    }
}
