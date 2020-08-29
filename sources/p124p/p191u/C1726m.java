package p124p.p191u;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p124p.p143e.C1248a;
import p124p.p150h.p162l.C1404o;
import p124p.p191u.C1718i.C1722d;

/* renamed from: p.u.m */
public class C1726m {

    /* renamed from: a */
    public static C1718i f5055a = new C1685a();

    /* renamed from: b */
    public static ThreadLocal<WeakReference<C1248a<ViewGroup, ArrayList<C1718i>>>> f5056b = new ThreadLocal<>();

    /* renamed from: c */
    public static ArrayList<ViewGroup> f5057c = new ArrayList<>();

    /* renamed from: p.u.m$a */
    public static class C1727a implements OnPreDrawListener, OnAttachStateChangeListener {

        /* renamed from: e */
        public C1718i f5058e;

        /* renamed from: f */
        public ViewGroup f5059f;

        /* renamed from: p.u.m$a$a */
        public class C1728a extends C1725l {

            /* renamed from: a */
            public final /* synthetic */ C1248a f5060a;

            public C1728a(C1248a aVar) {
                this.f5060a = aVar;
            }

            /* renamed from: e */
            public void mo6538e(C1718i iVar) {
                ((ArrayList) this.f5060a.get(C1727a.this.f5059f)).remove(iVar);
                iVar.mo6574b((C1722d) this);
            }
        }

        public C1727a(C1718i iVar, ViewGroup viewGroup) {
            this.f5058e = iVar;
            this.f5059f = viewGroup;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:134:0x02b0  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0078  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onPreDraw() {
            /*
                r19 = this;
                r0 = r19
                android.view.ViewGroup r1 = r0.f5059f
                android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
                r1.removeOnPreDrawListener(r0)
                android.view.ViewGroup r1 = r0.f5059f
                r1.removeOnAttachStateChangeListener(r0)
                java.util.ArrayList<android.view.ViewGroup> r1 = p124p.p191u.C1726m.f5057c
                android.view.ViewGroup r2 = r0.f5059f
                boolean r1 = r1.remove(r2)
                r2 = 1
                if (r1 != 0) goto L_0x001c
                return r2
            L_0x001c:
                p.e.a r1 = p124p.p191u.C1726m.m4342a()
                android.view.ViewGroup r3 = r0.f5059f
                java.lang.Object r3 = r1.get(r3)
                java.util.ArrayList r3 = (java.util.ArrayList) r3
                r4 = 0
                if (r3 != 0) goto L_0x0036
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                android.view.ViewGroup r5 = r0.f5059f
                r1.put(r5, r3)
                goto L_0x0042
            L_0x0036:
                int r5 = r3.size()
                if (r5 <= 0) goto L_0x0042
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>(r3)
                goto L_0x0043
            L_0x0042:
                r5 = r4
            L_0x0043:
                p.u.i r6 = r0.f5058e
                r3.add(r6)
                p.u.i r3 = r0.f5058e
                p.u.m$a$a r6 = new p.u.m$a$a
                r6.<init>(r1)
                r3.mo6565a(r6)
                p.u.i r1 = r0.f5058e
                android.view.ViewGroup r3 = r0.f5059f
                r6 = 0
                r1.mo6568a(r3, r6)
                if (r5 == 0) goto L_0x0072
                java.util.Iterator r1 = r5.iterator()
            L_0x0060:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L_0x0072
                java.lang.Object r3 = r1.next()
                p.u.i r3 = (p124p.p191u.C1718i) r3
                android.view.ViewGroup r5 = r0.f5059f
                r3.mo6586e(r5)
                goto L_0x0060
            L_0x0072:
                p.u.i r1 = r0.f5058e
                android.view.ViewGroup r8 = r0.f5059f
                if (r1 == 0) goto L_0x02b0
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r1.f5044x = r3
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r1.f5045y = r3
                p.u.r r3 = r1.f5040t
                p.u.r r5 = r1.f5041u
                p.e.a r7 = new p.e.a
                p.e.a<android.view.View, p.u.q> r9 = r3.f5073a
                r7.<init>(r9)
                p.e.a r9 = new p.e.a
                p.e.a<android.view.View, p.u.q> r10 = r5.f5073a
                r9.<init>(r10)
                r10 = r6
            L_0x0099:
                int[] r11 = r1.f5043w
                int r12 = r11.length
                if (r10 >= r12) goto L_0x01ee
                r11 = r11[r10]
                if (r11 == r2) goto L_0x01ae
                r12 = 2
                if (r11 == r12) goto L_0x0160
                r12 = 3
                if (r11 == r12) goto L_0x010c
                r12 = 4
                if (r11 == r12) goto L_0x00ae
            L_0x00ab:
                r17 = r3
                goto L_0x0108
            L_0x00ae:
                p.e.e<android.view.View> r11 = r3.f5075c
                p.e.e<android.view.View> r12 = r5.f5075c
                int r13 = r11.mo5523e()
                r14 = r6
            L_0x00b7:
                if (r14 >= r13) goto L_0x00ab
                java.lang.Object r15 = r11.mo5514b(r14)
                android.view.View r15 = (android.view.View) r15
                if (r15 == 0) goto L_0x00fe
                boolean r16 = r1.mo6578b(r15)
                if (r16 == 0) goto L_0x00fe
                r17 = r3
                long r2 = r11.mo5511a(r14)
                java.lang.Object r2 = r12.mo5515b(r2)
                android.view.View r2 = (android.view.View) r2
                if (r2 == 0) goto L_0x0100
                boolean r3 = r1.mo6578b(r2)
                if (r3 == 0) goto L_0x0100
                java.lang.Object r3 = r7.getOrDefault(r15, r4)
                p.u.q r3 = (p124p.p191u.C1734q) r3
                java.lang.Object r18 = r9.getOrDefault(r2, r4)
                r6 = r18
                p.u.q r6 = (p124p.p191u.C1734q) r6
                if (r3 == 0) goto L_0x0100
                if (r6 == 0) goto L_0x0100
                java.util.ArrayList<p.u.q> r4 = r1.f5044x
                r4.add(r3)
                java.util.ArrayList<p.u.q> r3 = r1.f5045y
                r3.add(r6)
                r7.remove(r15)
                r9.remove(r2)
                goto L_0x0100
            L_0x00fe:
                r17 = r3
            L_0x0100:
                int r14 = r14 + 1
                r3 = r17
                r2 = 1
                r4 = 0
                r6 = 0
                goto L_0x00b7
            L_0x0108:
                r2 = r17
                goto L_0x01e4
            L_0x010c:
                r2 = r3
                android.util.SparseArray<android.view.View> r3 = r2.f5074b
                android.util.SparseArray<android.view.View> r4 = r5.f5074b
                int r6 = r3.size()
                r11 = 0
            L_0x0116:
                if (r11 >= r6) goto L_0x01e4
                java.lang.Object r12 = r3.valueAt(r11)
                android.view.View r12 = (android.view.View) r12
                if (r12 == 0) goto L_0x015b
                boolean r13 = r1.mo6578b(r12)
                if (r13 == 0) goto L_0x015b
                int r13 = r3.keyAt(r11)
                java.lang.Object r13 = r4.get(r13)
                android.view.View r13 = (android.view.View) r13
                if (r13 == 0) goto L_0x015b
                boolean r14 = r1.mo6578b(r13)
                if (r14 == 0) goto L_0x015b
                r14 = 0
                java.lang.Object r15 = r7.getOrDefault(r12, r14)
                p.u.q r15 = (p124p.p191u.C1734q) r15
                java.lang.Object r17 = r9.getOrDefault(r13, r14)
                r14 = r17
                p.u.q r14 = (p124p.p191u.C1734q) r14
                if (r15 == 0) goto L_0x015b
                if (r14 == 0) goto L_0x015b
                java.util.ArrayList<p.u.q> r0 = r1.f5044x
                r0.add(r15)
                java.util.ArrayList<p.u.q> r0 = r1.f5045y
                r0.add(r14)
                r7.remove(r12)
                r9.remove(r13)
            L_0x015b:
                int r11 = r11 + 1
                r0 = r19
                goto L_0x0116
            L_0x0160:
                r2 = r3
                p.e.a<java.lang.String, android.view.View> r0 = r2.f5076d
                p.e.a<java.lang.String, android.view.View> r3 = r5.f5076d
                int r4 = r0.f3589g
                r6 = 0
            L_0x0168:
                if (r6 >= r4) goto L_0x01e4
                java.lang.Object r11 = r0.mo5598e(r6)
                android.view.View r11 = (android.view.View) r11
                if (r11 == 0) goto L_0x01ab
                boolean r12 = r1.mo6578b(r11)
                if (r12 == 0) goto L_0x01ab
                java.lang.Object r12 = r0.mo5593c(r6)
                java.lang.Object r12 = r3.get(r12)
                android.view.View r12 = (android.view.View) r12
                if (r12 == 0) goto L_0x01ab
                boolean r13 = r1.mo6578b(r12)
                if (r13 == 0) goto L_0x01ab
                r13 = 0
                java.lang.Object r14 = r7.getOrDefault(r11, r13)
                p.u.q r14 = (p124p.p191u.C1734q) r14
                java.lang.Object r15 = r9.getOrDefault(r12, r13)
                p.u.q r15 = (p124p.p191u.C1734q) r15
                if (r14 == 0) goto L_0x01ab
                if (r15 == 0) goto L_0x01ab
                java.util.ArrayList<p.u.q> r13 = r1.f5044x
                r13.add(r14)
                java.util.ArrayList<p.u.q> r13 = r1.f5045y
                r13.add(r15)
                r7.remove(r11)
                r9.remove(r12)
            L_0x01ab:
                int r6 = r6 + 1
                goto L_0x0168
            L_0x01ae:
                r2 = r3
                int r0 = r7.f3589g
            L_0x01b1:
                int r0 = r0 + -1
                if (r0 < 0) goto L_0x01e4
                java.lang.Object r3 = r7.mo5593c(r0)
                android.view.View r3 = (android.view.View) r3
                if (r3 == 0) goto L_0x01b1
                boolean r4 = r1.mo6578b(r3)
                if (r4 == 0) goto L_0x01b1
                java.lang.Object r3 = r9.remove(r3)
                p.u.q r3 = (p124p.p191u.C1734q) r3
                if (r3 == 0) goto L_0x01b1
                android.view.View r4 = r3.f5071b
                boolean r4 = r1.mo6578b(r4)
                if (r4 == 0) goto L_0x01b1
                java.lang.Object r4 = r7.mo5597d(r0)
                p.u.q r4 = (p124p.p191u.C1734q) r4
                java.util.ArrayList<p.u.q> r6 = r1.f5044x
                r6.add(r4)
                java.util.ArrayList<p.u.q> r4 = r1.f5045y
                r4.add(r3)
                goto L_0x01b1
            L_0x01e4:
                int r10 = r10 + 1
                r3 = r2
                r2 = 1
                r4 = 0
                r6 = 0
                r0 = r19
                goto L_0x0099
            L_0x01ee:
                r0 = 0
            L_0x01ef:
                int r2 = r7.f3589g
                if (r0 >= r2) goto L_0x020f
                java.lang.Object r2 = r7.mo5598e(r0)
                p.u.q r2 = (p124p.p191u.C1734q) r2
                android.view.View r3 = r2.f5071b
                boolean r3 = r1.mo6578b(r3)
                if (r3 == 0) goto L_0x020c
                java.util.ArrayList<p.u.q> r3 = r1.f5044x
                r3.add(r2)
                java.util.ArrayList<p.u.q> r2 = r1.f5045y
                r3 = 0
                r2.add(r3)
            L_0x020c:
                int r0 = r0 + 1
                goto L_0x01ef
            L_0x020f:
                r0 = 0
            L_0x0210:
                int r2 = r9.f3589g
                if (r0 >= r2) goto L_0x0230
                java.lang.Object r2 = r9.mo5598e(r0)
                p.u.q r2 = (p124p.p191u.C1734q) r2
                android.view.View r3 = r2.f5071b
                boolean r3 = r1.mo6578b(r3)
                if (r3 == 0) goto L_0x022d
                java.util.ArrayList<p.u.q> r3 = r1.f5045y
                r3.add(r2)
                java.util.ArrayList<p.u.q> r2 = r1.f5044x
                r3 = 0
                r2.add(r3)
            L_0x022d:
                int r0 = r0 + 1
                goto L_0x0210
            L_0x0230:
                p.e.a r0 = p124p.p191u.C1718i.m4302i()
                int r2 = r0.f3589g
                p.u.f0 r3 = p124p.p191u.C1739v.m4377c(r8)
                r4 = 1
                int r2 = r2 - r4
            L_0x023c:
                if (r2 < 0) goto L_0x029f
                java.lang.Object r4 = r0.mo5593c(r2)
                android.animation.Animator r4 = (android.animation.Animator) r4
                if (r4 == 0) goto L_0x029c
                r5 = 0
                java.lang.Object r6 = r0.getOrDefault(r4, r5)
                p.u.i$b r6 = (p124p.p191u.C1718i.C1720b) r6
                if (r6 == 0) goto L_0x029c
                android.view.View r5 = r6.f5047a
                if (r5 == 0) goto L_0x029c
                p.u.f0 r5 = r6.f5050d
                boolean r5 = r3.equals(r5)
                if (r5 == 0) goto L_0x029c
                p.u.q r5 = r6.f5049c
                android.view.View r7 = r6.f5047a
                r9 = 1
                p.u.q r10 = r1.mo6579c(r7, r9)
                p.u.q r11 = r1.mo6575b(r7, r9)
                if (r10 != 0) goto L_0x0277
                if (r11 != 0) goto L_0x0277
                p.u.r r9 = r1.f5041u
                p.e.a<android.view.View, p.u.q> r9 = r9.f5073a
                java.lang.Object r7 = r9.get(r7)
                r11 = r7
                p.u.q r11 = (p124p.p191u.C1734q) r11
            L_0x0277:
                if (r10 != 0) goto L_0x027b
                if (r11 == 0) goto L_0x0285
            L_0x027b:
                p.u.i r6 = r6.f5051e
                boolean r5 = r6.mo6546a(r5, r11)
                if (r5 == 0) goto L_0x0285
                r5 = 1
                goto L_0x0286
            L_0x0285:
                r5 = 0
            L_0x0286:
                if (r5 == 0) goto L_0x029c
                boolean r5 = r4.isRunning()
                if (r5 != 0) goto L_0x0299
                boolean r5 = r4.isStarted()
                if (r5 == 0) goto L_0x0295
                goto L_0x0299
            L_0x0295:
                r0.remove(r4)
                goto L_0x029c
            L_0x0299:
                r4.cancel()
            L_0x029c:
                int r2 = r2 + -1
                goto L_0x023c
            L_0x029f:
                p.u.r r9 = r1.f5040t
                p.u.r r10 = r1.f5041u
                java.util.ArrayList<p.u.q> r11 = r1.f5044x
                java.util.ArrayList<p.u.q> r12 = r1.f5045y
                r7 = r1
                r7.mo6567a(r8, r9, r10, r11, r12)
                r1.mo6584d()
                r0 = 1
                return r0
            L_0x02b0:
                r0 = r4
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p124p.p191u.C1726m.C1727a.onPreDraw():boolean");
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            this.f5059f.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f5059f.removeOnAttachStateChangeListener(this);
            C1726m.f5057c.remove(this.f5059f);
            ArrayList arrayList = (ArrayList) C1726m.m4342a().get(this.f5059f);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C1718i) it.next()).mo6586e(this.f5059f);
                }
            }
            this.f5058e.mo6572a(true);
        }
    }

    /* renamed from: a */
    public static C1248a<ViewGroup, ArrayList<C1718i>> m4342a() {
        WeakReference weakReference = (WeakReference) f5056b.get();
        if (weakReference != null) {
            C1248a<ViewGroup, ArrayList<C1718i>> aVar = (C1248a) weakReference.get();
            if (aVar != null) {
                return aVar;
            }
        }
        C1248a<ViewGroup, ArrayList<C1718i>> aVar2 = new C1248a<>();
        f5056b.set(new WeakReference(aVar2));
        return aVar2;
    }

    /* renamed from: a */
    public static void m4343a(ViewGroup viewGroup, C1718i iVar) {
        if (!f5057c.contains(viewGroup) && C1404o.m3563x(viewGroup)) {
            f5057c.add(viewGroup);
            if (iVar == null) {
                iVar = f5055a;
            }
            C1718i clone = iVar.clone();
            ArrayList arrayList = (ArrayList) m4342a().getOrDefault(viewGroup, null);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C1718i) it.next()).mo6580c((View) viewGroup);
                }
            }
            if (clone != null) {
                clone.mo6568a(viewGroup, true);
            }
            if (((C1717h) viewGroup.getTag(C1714f.transition_current_scene)) == null) {
                viewGroup.setTag(C1714f.transition_current_scene, null);
                if (clone != null) {
                    C1727a aVar = new C1727a(clone, viewGroup);
                    viewGroup.addOnAttachStateChangeListener(aVar);
                    viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
                    return;
                }
                return;
            }
            throw null;
        }
    }
}
