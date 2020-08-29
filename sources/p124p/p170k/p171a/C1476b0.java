package p124p.p170k.p171a;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p124p.p150h.p162l.C1404o;

@SuppressLint({"UnknownNullness"})
/* renamed from: p.k.a.b0 */
public abstract class C1476b0 {
    /* renamed from: a */
    public static void m3721a(List<View> list, View view) {
        int size = list.size();
        if (!m3723a(list, view, size)) {
            list.add(view);
            for (int i = size; i < list.size(); i++) {
                View view2 = (View) list.get(i);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (!m3723a(list, childAt, size)) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m3722a(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: a */
    public static boolean m3723a(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public abstract Object mo6043a(Object obj, Object obj2, Object obj3);

    /* renamed from: a */
    public void mo6044a(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], view.getWidth() + iArr[0], view.getHeight() + iArr[1]);
    }

    /* renamed from: a */
    public abstract void mo6045a(ViewGroup viewGroup, Object obj);

    /* renamed from: a */
    public abstract void mo6046a(Object obj, Rect rect);

    /* renamed from: a */
    public abstract void mo6047a(Object obj, View view);

    /* renamed from: a */
    public abstract void mo6048a(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: a */
    public abstract void mo6049a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: a */
    public abstract void mo6050a(Object obj, ArrayList<View> arrayList);

    /* renamed from: a */
    public abstract void mo6051a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* JADX WARNING: type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r5v1, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v2, types: [android.view.ViewGroup] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=android.view.View, code=null, for r5v0, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r5v2, types: [android.view.ViewGroup]
      assigns: [android.view.ViewGroup, android.view.View]
      uses: [android.view.ViewGroup, java.lang.Object, android.view.View, ?[OBJECT, ARRAY]]
      mth insns count: 17
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6052a(java.util.ArrayList<android.view.View> r4, android.view.View r5) {
        /*
            r3 = this;
            int r0 = r5.getVisibility()
            if (r0 != 0) goto L_0x0027
            boolean r0 = r5 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0024
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            boolean r0 = r5.isTransitionGroup()
            if (r0 == 0) goto L_0x0013
            goto L_0x0024
        L_0x0013:
            int r0 = r5.getChildCount()
            r1 = 0
        L_0x0018:
            if (r1 >= r0) goto L_0x0027
            android.view.View r2 = r5.getChildAt(r1)
            r3.mo6052a(r4, r2)
            int r1 = r1 + 1
            goto L_0x0018
        L_0x0024:
            r4.add(r5)
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p170k.p171a.C1476b0.mo6052a(java.util.ArrayList, android.view.View):void");
    }

    /* renamed from: a */
    public void mo6053a(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String q = C1404o.m3556q(view);
            if (q != null) {
                map.put(q, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    mo6053a(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* renamed from: a */
    public abstract boolean mo6054a(Object obj);

    /* renamed from: b */
    public abstract Object mo6055b(Object obj);

    /* renamed from: b */
    public abstract Object mo6056b(Object obj, Object obj2, Object obj3);

    /* renamed from: b */
    public abstract void mo6057b(Object obj, View view);

    /* renamed from: b */
    public abstract void mo6058b(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: b */
    public abstract void mo6059b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: c */
    public abstract Object mo6060c(Object obj);

    /* renamed from: c */
    public abstract void mo6061c(Object obj, View view);
}
