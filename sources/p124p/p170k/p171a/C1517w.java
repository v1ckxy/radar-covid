package p124p.p170k.p171a;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Fragment.C0083b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p124p.p143e.C1248a;
import p124p.p143e.C1255g;
import p124p.p150h.p162l.C1404o;

/* renamed from: p.k.a.w */
public class C1517w {

    /* renamed from: a */
    public static final int[] f4511a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b */
    public static final C1476b0 f4512b = new C1519x();

    /* renamed from: c */
    public static final C1476b0 f4513c;

    /* renamed from: p.k.a.w$a */
    public static class C1518a {

        /* renamed from: a */
        public Fragment f4514a;

        /* renamed from: b */
        public boolean f4515b;

        /* renamed from: c */
        public C1472a f4516c;

        /* renamed from: d */
        public Fragment f4517d;

        /* renamed from: e */
        public boolean f4518e;

        /* renamed from: f */
        public C1472a f4519f;
    }

    static {
        C1476b0 b0Var;
        try {
            b0Var = (C1476b0) Class.forName("p.u.d").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            b0Var = null;
        }
        f4513c = b0Var;
    }

    /* renamed from: a */
    public static View m3878a(C1248a<String, View> aVar, C1518a aVar2, Object obj, boolean z) {
        C1472a aVar3 = aVar2.f4516c;
        if (!(obj == null || aVar == null)) {
            ArrayList<String> arrayList = aVar3.f4471n;
            if (arrayList != null && !arrayList.isEmpty()) {
                return (View) aVar.get((String) (z ? aVar3.f4471n : aVar3.f4472o).get(0));
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m3886a(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((View) arrayList.get(size)).setVisibility(i);
            }
        }
    }

    /* renamed from: a */
    public static void m3887a(ArrayList<View> arrayList, C1248a<String, View> aVar, Collection<String> collection) {
        for (int i = aVar.f3589g - 1; i >= 0; i--) {
            View view = (View) aVar.mo5598e(i);
            if (collection.contains(C1404o.m3556q(view))) {
                arrayList.add(view);
            }
        }
    }

    /* renamed from: a */
    public static void m3889a(C1476b0 b0Var, Object obj, Object obj2, C1248a<String, View> aVar, boolean z, C1472a aVar2) {
        ArrayList<String> arrayList = aVar2.f4471n;
        if (arrayList != null && !arrayList.isEmpty()) {
            View view = (View) aVar.get((String) (z ? aVar2.f4472o : aVar2.f4471n).get(0));
            b0Var.mo6061c(obj, view);
            if (obj2 != null) {
                b0Var.mo6061c(obj2, view);
            }
        }
    }

    /* renamed from: a */
    public static boolean m3891a(C1476b0 b0Var, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!b0Var.mo6054a(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static C1248a<String, View> m3893b(C1476b0 b0Var, C1248a<String, String> aVar, Object obj, C1518a aVar2) {
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        Fragment fragment = aVar2.f4517d;
        C1248a<String, View> aVar3 = new C1248a<>();
        b0Var.mo6053a((Map<String, View>) aVar3, fragment.mo825p0());
        C1472a aVar4 = aVar2.f4519f;
        C1255g.m3179a((Map<K, V>) aVar3, (Collection<?>) aVar2.f4518e ? aVar4.f4472o : aVar4.f4471n);
        C1255g.m3179a((Map<K, V>) aVar, (Collection<?>) aVar3.keySet());
        return aVar3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0041, code lost:
        if (r10.f620o != false) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0074, code lost:
        if (r10.f601R >= 0.0f) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x007b, code lost:
        if (r10.f586C == false) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x007d, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x008f, code lost:
        if (r10.f586C == false) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0091, code lost:
        r1 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00e2  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m3888a(p124p.p170k.p171a.C1472a r16, p124p.p170k.p171a.C1511r.C1512a r17, android.util.SparseArray<p124p.p170k.p171a.C1517w.C1518a> r18, boolean r19, boolean r20) {
        /*
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            androidx.fragment.app.Fragment r10 = r1.f4476b
            if (r10 != 0) goto L_0x000d
            return
        L_0x000d:
            int r11 = r10.f584A
            if (r11 != 0) goto L_0x0012
            return
        L_0x0012:
            if (r3 == 0) goto L_0x001b
            int[] r4 = f4511a
            int r1 = r1.f4475a
            r1 = r4[r1]
            goto L_0x001d
        L_0x001b:
            int r1 = r1.f4475a
        L_0x001d:
            r4 = 0
            r5 = 1
            if (r1 == r5) goto L_0x0084
            r6 = 3
            if (r1 == r6) goto L_0x005f
            r6 = 4
            if (r1 == r6) goto L_0x0047
            r6 = 5
            if (r1 == r6) goto L_0x0035
            r6 = 6
            if (r1 == r6) goto L_0x005f
            r6 = 7
            if (r1 == r6) goto L_0x0084
            r1 = r4
            r12 = r1
            r13 = r12
            goto L_0x0098
        L_0x0035:
            if (r20 == 0) goto L_0x0044
            boolean r1 = r10.f600Q
            if (r1 == 0) goto L_0x0093
            boolean r1 = r10.f586C
            if (r1 != 0) goto L_0x0093
            boolean r1 = r10.f620o
            if (r1 == 0) goto L_0x0093
            goto L_0x0091
        L_0x0044:
            boolean r1 = r10.f586C
            goto L_0x0094
        L_0x0047:
            if (r20 == 0) goto L_0x0056
            boolean r1 = r10.f600Q
            if (r1 == 0) goto L_0x007f
            boolean r1 = r10.f620o
            if (r1 == 0) goto L_0x007f
            boolean r1 = r10.f586C
            if (r1 == 0) goto L_0x007f
            goto L_0x007d
        L_0x0056:
            boolean r1 = r10.f620o
            if (r1 == 0) goto L_0x007f
            boolean r1 = r10.f586C
            if (r1 != 0) goto L_0x007f
            goto L_0x007d
        L_0x005f:
            boolean r1 = r10.f620o
            if (r20 == 0) goto L_0x0077
            if (r1 != 0) goto L_0x007f
            android.view.View r1 = r10.f594K
            if (r1 == 0) goto L_0x007f
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x007f
            float r1 = r10.f601R
            r6 = 0
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 < 0) goto L_0x007f
            goto L_0x007d
        L_0x0077:
            if (r1 == 0) goto L_0x007f
            boolean r1 = r10.f586C
            if (r1 != 0) goto L_0x007f
        L_0x007d:
            r1 = r5
            goto L_0x0080
        L_0x007f:
            r1 = r4
        L_0x0080:
            r13 = r1
            r1 = r4
            r12 = r5
            goto L_0x0098
        L_0x0084:
            if (r20 == 0) goto L_0x0089
            boolean r1 = r10.f599P
            goto L_0x0094
        L_0x0089:
            boolean r1 = r10.f620o
            if (r1 != 0) goto L_0x0093
            boolean r1 = r10.f586C
            if (r1 != 0) goto L_0x0093
        L_0x0091:
            r1 = r5
            goto L_0x0094
        L_0x0093:
            r1 = r4
        L_0x0094:
            r12 = r4
            r13 = r12
            r4 = r1
            r1 = r5
        L_0x0098:
            java.lang.Object r6 = r2.get(r11)
            p.k.a.w$a r6 = (p124p.p170k.p171a.C1517w.C1518a) r6
            if (r4 == 0) goto L_0x00b1
            if (r6 != 0) goto L_0x00ab
            p.k.a.w$a r4 = new p.k.a.w$a
            r4.<init>()
            r2.put(r11, r4)
            r6 = r4
        L_0x00ab:
            r6.f4514a = r10
            r6.f4515b = r3
            r6.f4516c = r0
        L_0x00b1:
            r14 = r6
            r15 = 0
            if (r20 != 0) goto L_0x00d8
            if (r1 == 0) goto L_0x00d8
            if (r14 == 0) goto L_0x00bf
            androidx.fragment.app.Fragment r1 = r14.f4517d
            if (r1 != r10) goto L_0x00bf
            r14.f4517d = r15
        L_0x00bf:
            p.k.a.k r4 = r0.f4316r
            int r1 = r10.f610e
            if (r1 >= r5) goto L_0x00d8
            int r1 = r4.f4393s
            if (r1 < r5) goto L_0x00d8
            boolean r1 = r0.f4473p
            if (r1 != 0) goto L_0x00d8
            r4.mo6145f(r10)
            r6 = 1
            r7 = 0
            r8 = 0
            r9 = 0
            r5 = r10
            r4.mo6104a(r5, r6, r7, r8, r9)
        L_0x00d8:
            if (r13 == 0) goto L_0x00f1
            if (r14 == 0) goto L_0x00e0
            androidx.fragment.app.Fragment r1 = r14.f4517d
            if (r1 != 0) goto L_0x00f1
        L_0x00e0:
            if (r14 != 0) goto L_0x00eb
            p.k.a.w$a r1 = new p.k.a.w$a
            r1.<init>()
            r2.put(r11, r1)
            r14 = r1
        L_0x00eb:
            r14.f4517d = r10
            r14.f4518e = r3
            r14.f4519f = r0
        L_0x00f1:
            if (r20 != 0) goto L_0x00fd
            if (r12 == 0) goto L_0x00fd
            if (r14 == 0) goto L_0x00fd
            androidx.fragment.app.Fragment r0 = r14.f4514a
            if (r0 != r10) goto L_0x00fd
            r14.f4514a = r15
        L_0x00fd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p170k.p171a.C1517w.m3888a(p.k.a.a, p.k.a.r$a, android.util.SparseArray, boolean, boolean):void");
    }

    /* renamed from: b */
    public static Object m3892b(C1476b0 b0Var, Fragment fragment, boolean z) {
        Object obj = null;
        if (fragment == null) {
            return null;
        }
        if (z) {
            C0083b bVar = fragment.f598O;
            if (bVar != null) {
                obj = bVar.f641h;
                if (obj == Fragment.f583a0) {
                    obj = fragment.mo782V();
                }
            }
        } else {
            obj = fragment.mo783W();
        }
        return b0Var.mo6055b(obj);
    }

    /* renamed from: a */
    public static void m3885a(Fragment fragment, Fragment fragment2, boolean z, C1248a<String, View> aVar, boolean z2) {
        if (z) {
            C0083b bVar = fragment2.f598O;
        } else {
            C0083b bVar2 = fragment.f598O;
        }
    }

    /* renamed from: a */
    public static C1248a<String, View> m3883a(C1476b0 b0Var, C1248a<String, String> aVar, Object obj, C1518a aVar2) {
        View view = aVar2.f4514a.f594K;
        if (aVar.isEmpty() || obj == null || view == null) {
            aVar.clear();
            return null;
        }
        C1248a<String, View> aVar3 = new C1248a<>();
        b0Var.mo6053a((Map<String, View>) aVar3, view);
        C1472a aVar4 = aVar2.f4516c;
        ArrayList<String> arrayList = aVar2.f4515b ? aVar4.f4471n : aVar4.f4472o;
        if (arrayList != null) {
            C1255g.m3179a((Map<K, V>) aVar3, (Collection<?>) arrayList);
            C1255g.m3179a((Map<K, V>) aVar3, aVar.values());
        }
        int i = aVar.f3589g;
        while (true) {
            i--;
            if (i < 0) {
                return aVar3;
            }
            if (!aVar3.containsKey((String) aVar.mo5598e(i))) {
                aVar.mo5597d(i);
            }
        }
    }

    /* renamed from: a */
    public static C1476b0 m3884a(Fragment fragment, Fragment fragment2) {
        Object obj;
        Object obj2;
        Object obj3;
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object W = fragment.mo783W();
            if (W != null) {
                arrayList.add(W);
            }
            C0083b bVar = fragment.f598O;
            if (bVar == null) {
                obj2 = null;
            } else {
                obj2 = bVar.f641h;
                if (obj2 == Fragment.f583a0) {
                    obj2 = fragment.mo782V();
                }
            }
            if (obj2 != null) {
                arrayList.add(obj2);
            }
            C0083b bVar2 = fragment.f598O;
            if (bVar2 == null) {
                obj3 = null;
            } else {
                obj3 = bVar2.f645l;
                if (obj3 == Fragment.f583a0) {
                    obj3 = fragment.mo801b0();
                }
            }
            if (obj3 != null) {
                arrayList.add(obj3);
            }
        }
        if (fragment2 != null) {
            Object V = fragment2.mo782V();
            if (V != null) {
                arrayList.add(V);
            }
            C0083b bVar3 = fragment2.f598O;
            if (bVar3 == null) {
                obj = null;
            } else {
                obj = bVar3.f643j;
                if (obj == Fragment.f583a0) {
                    obj = fragment2.mo783W();
                }
            }
            if (obj != null) {
                arrayList.add(obj);
            }
            Object b0 = fragment2.mo801b0();
            if (b0 != null) {
                arrayList.add(b0);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        C1476b0 b0Var = f4512b;
        if (b0Var != null && m3891a(b0Var, (List<Object>) arrayList)) {
            return f4512b;
        }
        C1476b0 b0Var2 = f4513c;
        if (b0Var2 != null && m3891a(b0Var2, (List<Object>) arrayList)) {
            return f4513c;
        }
        if (f4512b == null && f4513c == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    /* renamed from: a */
    public static ArrayList<View> m3882a(C1476b0 b0Var, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View view2 = fragment.f594K;
        if (view2 != null) {
            b0Var.mo6052a(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        b0Var.mo6050a(obj, arrayList2);
        return arrayList2;
    }

    /* renamed from: a */
    public static Object m3880a(C1476b0 b0Var, Fragment fragment, boolean z) {
        Object obj = null;
        if (fragment == null) {
            return null;
        }
        if (z) {
            C0083b bVar = fragment.f598O;
            if (bVar != null) {
                obj = bVar.f643j;
                if (obj == Fragment.f583a0) {
                    obj = fragment.mo783W();
                }
            }
        } else {
            obj = fragment.mo782V();
        }
        return b0Var.mo6055b(obj);
    }

    /* renamed from: a */
    public static Object m3879a(C1476b0 b0Var, Fragment fragment, Fragment fragment2, boolean z) {
        Object obj = null;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        if (z) {
            C0083b bVar = fragment2.f598O;
            if (bVar != null) {
                Object obj2 = bVar.f645l;
                if (obj2 == Fragment.f583a0) {
                    obj2 = fragment2.mo801b0();
                }
                obj = obj2;
            }
        } else {
            obj = fragment.mo801b0();
        }
        return b0Var.mo6060c(b0Var.mo6055b(obj));
    }

    /* renamed from: a */
    public static Object m3881a(C1476b0 b0Var, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        boolean z2 = true;
        if (!(obj == null || obj2 == null || fragment == null)) {
            if (z) {
                C0083b bVar = fragment.f598O;
                if (bVar != null) {
                    Boolean bool = bVar.f646m;
                    if (bool != null) {
                        z2 = bool.booleanValue();
                    }
                }
            } else {
                C0083b bVar2 = fragment.f598O;
                if (bVar2 != null) {
                    Boolean bool2 = bVar2.f647n;
                    if (bool2 != null) {
                        z2 = bool2.booleanValue();
                    }
                }
            }
        }
        return z2 ? b0Var.mo6056b(obj2, obj, obj3) : b0Var.mo6043a(obj2, obj, obj3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:150:0x040b  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0449 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x021e A[ADDED_TO_REGION] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m3890a(p124p.p170k.p171a.C1490k r39, java.util.ArrayList<p124p.p170k.p171a.C1472a> r40, java.util.ArrayList<java.lang.Boolean> r41, int r42, int r43, boolean r44) {
        /*
            r0 = r39
            r1 = r40
            r2 = r41
            r3 = r43
            r4 = r44
            int r5 = r0.f4393s
            r6 = 1
            if (r5 >= r6) goto L_0x0010
            return
        L_0x0010:
            android.util.SparseArray r5 = new android.util.SparseArray
            r5.<init>()
            r7 = r42
        L_0x0017:
            r8 = 0
            if (r7 >= r3) goto L_0x0068
            java.lang.Object r9 = r1.get(r7)
            p.k.a.a r9 = (p124p.p170k.p171a.C1472a) r9
            java.lang.Object r10 = r2.get(r7)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x004e
            p.k.a.k r8 = r9.f4316r
            p.k.a.f r8 = r8.f4395u
            boolean r8 = r8.mo6066a()
            if (r8 != 0) goto L_0x0037
            goto L_0x0065
        L_0x0037:
            java.util.ArrayList<p.k.a.r$a> r8 = r9.f4458a
            int r8 = r8.size()
            int r8 = r8 - r6
        L_0x003e:
            if (r8 < 0) goto L_0x0065
            java.util.ArrayList<p.k.a.r$a> r10 = r9.f4458a
            java.lang.Object r10 = r10.get(r8)
            p.k.a.r$a r10 = (p124p.p170k.p171a.C1511r.C1512a) r10
            m3888a(r9, r10, r5, r6, r4)
            int r8 = r8 + -1
            goto L_0x003e
        L_0x004e:
            java.util.ArrayList<p.k.a.r$a> r10 = r9.f4458a
            int r10 = r10.size()
            r11 = r8
        L_0x0055:
            if (r11 >= r10) goto L_0x0065
            java.util.ArrayList<p.k.a.r$a> r12 = r9.f4458a
            java.lang.Object r12 = r12.get(r11)
            p.k.a.r$a r12 = (p124p.p170k.p171a.C1511r.C1512a) r12
            m3888a(r9, r12, r5, r8, r4)
            int r11 = r11 + 1
            goto L_0x0055
        L_0x0065:
            int r7 = r7 + 1
            goto L_0x0017
        L_0x0068:
            int r7 = r5.size()
            if (r7 == 0) goto L_0x045d
            android.view.View r7 = new android.view.View
            p.k.a.i r9 = r0.f4394t
            android.content.Context r9 = r9.f4362f
            r7.<init>(r9)
            int r15 = r5.size()
            r14 = r8
        L_0x007c:
            if (r14 >= r15) goto L_0x045d
            int r9 = r5.keyAt(r14)
            p.e.a r13 = new p.e.a
            r13.<init>()
            int r10 = r3 + -1
            r12 = r42
        L_0x008b:
            if (r10 < r12) goto L_0x00f2
            java.lang.Object r11 = r1.get(r10)
            p.k.a.a r11 = (p124p.p170k.p171a.C1472a) r11
            boolean r16 = r11.mo6035b(r9)
            if (r16 != 0) goto L_0x009a
            goto L_0x00e7
        L_0x009a:
            java.lang.Object r16 = r2.get(r10)
            java.lang.Boolean r16 = (java.lang.Boolean) r16
            boolean r16 = r16.booleanValue()
            java.util.ArrayList<java.lang.String> r6 = r11.f4471n
            if (r6 == 0) goto L_0x00e7
            int r6 = r6.size()
            java.util.ArrayList<java.lang.String> r8 = r11.f4471n
            java.util.ArrayList<java.lang.String> r11 = r11.f4472o
            if (r16 == 0) goto L_0x00b3
            goto L_0x00b8
        L_0x00b3:
            r38 = r11
            r11 = r8
            r8 = r38
        L_0x00b8:
            r1 = 0
        L_0x00b9:
            if (r1 >= r6) goto L_0x00e7
            java.lang.Object r16 = r11.get(r1)
            r2 = r16
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r16 = r8.get(r1)
            r3 = r16
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r16 = r13.remove(r3)
            r17 = r6
            r6 = r16
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x00db
            r13.put(r2, r6)
            goto L_0x00de
        L_0x00db:
            r13.put(r2, r3)
        L_0x00de:
            int r1 = r1 + 1
            r2 = r41
            r3 = r43
            r6 = r17
            goto L_0x00b9
        L_0x00e7:
            int r10 = r10 + -1
            r1 = r40
            r2 = r41
            r3 = r43
            r6 = 1
            r8 = 0
            goto L_0x008b
        L_0x00f2:
            java.lang.Object r1 = r5.valueAt(r14)
            p.k.a.w$a r1 = (p124p.p170k.p171a.C1517w.C1518a) r1
            if (r4 == 0) goto L_0x02e6
            p.k.a.f r3 = r0.f4395u
            boolean r3 = r3.mo6066a()
            if (r3 == 0) goto L_0x010b
            p.k.a.f r3 = r0.f4395u
            android.view.View r3 = r3.mo6065a(r9)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            goto L_0x010c
        L_0x010b:
            r3 = 0
        L_0x010c:
            if (r3 != 0) goto L_0x0116
        L_0x010e:
            r31 = r5
            r32 = r14
            r33 = r15
            goto L_0x02df
        L_0x0116:
            androidx.fragment.app.Fragment r6 = r1.f4514a
            androidx.fragment.app.Fragment r8 = r1.f4517d
            p.k.a.b0 r9 = m3884a(r8, r6)
            if (r9 != 0) goto L_0x0121
            goto L_0x010e
        L_0x0121:
            boolean r10 = r1.f4515b
            boolean r11 = r1.f4518e
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r31 = r5
            java.lang.Object r5 = m3880a(r9, r6, r10)
            java.lang.Object r11 = m3892b(r9, r8, r11)
            androidx.fragment.app.Fragment r12 = r1.f4514a
            r32 = r14
            androidx.fragment.app.Fragment r14 = r1.f4517d
            r33 = r15
            if (r12 == 0) goto L_0x014b
            android.view.View r15 = r12.mo825p0()
            r0 = 0
            r15.setVisibility(r0)
        L_0x014b:
            if (r12 == 0) goto L_0x01eb
            if (r14 != 0) goto L_0x0151
            goto L_0x01eb
        L_0x0151:
            boolean r0 = r1.f4515b
            boolean r15 = r13.isEmpty()
            if (r15 == 0) goto L_0x015d
            r34 = r10
            r15 = 0
            goto L_0x0163
        L_0x015d:
            java.lang.Object r15 = m3879a(r9, r12, r14, r0)
            r34 = r10
        L_0x0163:
            p.e.a r10 = m3893b(r9, r13, r15, r1)
            r35 = r6
            p.e.a r6 = m3883a(r9, r13, r15, r1)
            boolean r16 = r13.isEmpty()
            if (r16 == 0) goto L_0x017f
            if (r10 == 0) goto L_0x0178
            r10.clear()
        L_0x0178:
            if (r6 == 0) goto L_0x017d
            r6.clear()
        L_0x017d:
            r15 = 0
            goto L_0x0191
        L_0x017f:
            r16 = r15
            java.util.Set r15 = r13.keySet()
            m3887a(r4, r10, r15)
            java.util.Collection r15 = r13.values()
            m3887a(r2, r6, r15)
            r15 = r16
        L_0x0191:
            if (r5 != 0) goto L_0x019a
            if (r11 != 0) goto L_0x019a
            if (r15 != 0) goto L_0x019a
            r37 = r2
            goto L_0x01f1
        L_0x019a:
            r36 = r13
            r13 = 1
            m3885a(r12, r14, r0, r10, r13)
            if (r15 == 0) goto L_0x01d0
            r2.add(r7)
            r9.mo6058b(r15, r7, r4)
            boolean r13 = r1.f4518e
            r37 = r2
            p.k.a.a r2 = r1.f4519f
            r16 = r9
            r17 = r15
            r18 = r11
            r19 = r10
            r20 = r13
            r21 = r2
            m3889a(r16, r17, r18, r19, r20, r21)
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            android.view.View r1 = m3878a(r6, r1, r5, r0)
            if (r1 == 0) goto L_0x01cb
            r9.mo6046a(r5, r2)
        L_0x01cb:
            r27 = r1
            r29 = r2
            goto L_0x01d6
        L_0x01d0:
            r37 = r2
            r27 = 0
            r29 = 0
        L_0x01d6:
            p.k.a.u r1 = new p.k.a.u
            r22 = r1
            r23 = r12
            r24 = r14
            r25 = r0
            r26 = r6
            r28 = r9
            r22.<init>(r23, r24, r25, r26, r27, r28, r29)
            p124p.p150h.p162l.C1402m.m3504a(r3, r1)
            goto L_0x01f4
        L_0x01eb:
            r37 = r2
            r35 = r6
            r34 = r10
        L_0x01f1:
            r36 = r13
            r15 = 0
        L_0x01f4:
            if (r5 != 0) goto L_0x01fc
            if (r15 != 0) goto L_0x01fc
            if (r11 != 0) goto L_0x01fc
            goto L_0x02df
        L_0x01fc:
            java.util.ArrayList r0 = m3882a(r9, r11, r8, r4, r7)
            r1 = r35
            r2 = r37
            java.util.ArrayList r6 = m3882a(r9, r5, r1, r2, r7)
            r10 = 4
            m3886a(r6, r10)
            r16 = r9
            r17 = r5
            r18 = r11
            r19 = r15
            r20 = r1
            r21 = r34
            java.lang.Object r1 = m3881a(r16, r17, r18, r19, r20, r21)
            if (r1 == 0) goto L_0x02df
            if (r8 == 0) goto L_0x0241
            if (r11 == 0) goto L_0x0241
            boolean r10 = r8.f620o
            if (r10 == 0) goto L_0x0241
            boolean r10 = r8.f586C
            if (r10 == 0) goto L_0x0241
            boolean r10 = r8.f600Q
            if (r10 == 0) goto L_0x0241
            r10 = 1
            r8.mo808e(r10)
            android.view.View r10 = r8.f594K
            r9.mo6048a(r11, r10, r0)
            android.view.ViewGroup r8 = r8.f593J
            p.k.a.s r10 = new p.k.a.s
            r10.<init>(r0)
            p124p.p150h.p162l.C1402m.m3504a(r8, r10)
        L_0x0241:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            int r10 = r2.size()
            r12 = 0
        L_0x024b:
            if (r12 >= r10) goto L_0x0261
            java.lang.Object r13 = r2.get(r12)
            android.view.View r13 = (android.view.View) r13
            java.lang.String r14 = p124p.p150h.p162l.C1404o.m3556q(r13)
            r8.add(r14)
            r14 = 0
            r13.setTransitionName(r14)
            int r12 = r12 + 1
            goto L_0x024b
        L_0x0261:
            r22 = r9
            r23 = r1
            r24 = r5
            r25 = r6
            r26 = r11
            r27 = r0
            r28 = r15
            r29 = r2
            r22.mo6049a(r23, r24, r25, r26, r27, r28, r29)
            r9.mo6045a(r3, r1)
            int r0 = r2.size()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5 = 0
        L_0x0281:
            if (r5 >= r0) goto L_0x02c1
            java.lang.Object r10 = r4.get(r5)
            android.view.View r10 = (android.view.View) r10
            java.lang.String r11 = p124p.p150h.p162l.C1404o.m3556q(r10)
            r1.add(r11)
            if (r11 != 0) goto L_0x0295
            r13 = r36
            goto L_0x02bc
        L_0x0295:
            r14 = 0
            r10.setTransitionName(r14)
            r13 = r36
            java.lang.Object r10 = r13.get(r11)
            java.lang.String r10 = (java.lang.String) r10
            r12 = 0
        L_0x02a2:
            if (r12 >= r0) goto L_0x02bc
            java.lang.Object r14 = r8.get(r12)
            boolean r14 = r10.equals(r14)
            if (r14 == 0) goto L_0x02b8
            java.lang.Object r10 = r2.get(r12)
            android.view.View r10 = (android.view.View) r10
            r10.setTransitionName(r11)
            goto L_0x02bc
        L_0x02b8:
            int r12 = r12 + 1
            r14 = 0
            goto L_0x02a2
        L_0x02bc:
            int r5 = r5 + 1
            r36 = r13
            goto L_0x0281
        L_0x02c1:
            p.k.a.y r5 = new p.k.a.y
            r22 = r5
            r23 = r9
            r24 = r0
            r25 = r2
            r26 = r8
            r27 = r4
            r28 = r1
            r22.<init>(r23, r24, r25, r26, r27, r28)
            p124p.p150h.p162l.C1402m.m3504a(r3, r5)
            r0 = 0
            m3886a(r6, r0)
            r9.mo6059b(r15, r4, r2)
            goto L_0x02e0
        L_0x02df:
            r0 = 0
        L_0x02e0:
            r27 = r32
            r30 = r33
            goto L_0x0449
        L_0x02e6:
            r31 = r5
            r32 = r14
            r33 = r15
            r0 = 0
            r2 = r39
            p.k.a.f r3 = r2.f4395u
            boolean r3 = r3.mo6066a()
            if (r3 == 0) goto L_0x0302
            p.k.a.f r3 = r2.f4395u
            android.view.View r3 = r3.mo6065a(r9)
            r14 = r3
            android.view.ViewGroup r14 = (android.view.ViewGroup) r14
            r3 = r14
            goto L_0x0303
        L_0x0302:
            r3 = 0
        L_0x0303:
            if (r3 != 0) goto L_0x0306
            goto L_0x02e0
        L_0x0306:
            androidx.fragment.app.Fragment r4 = r1.f4514a
            androidx.fragment.app.Fragment r5 = r1.f4517d
            p.k.a.b0 r6 = m3884a(r5, r4)
            if (r6 != 0) goto L_0x0311
            goto L_0x02e0
        L_0x0311:
            boolean r8 = r1.f4515b
            boolean r9 = r1.f4518e
            java.lang.Object r8 = m3880a(r6, r4, r8)
            java.lang.Object r12 = m3892b(r6, r5, r9)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            androidx.fragment.app.Fragment r9 = r1.f4514a
            androidx.fragment.app.Fragment r15 = r1.f4517d
            if (r9 == 0) goto L_0x03c9
            if (r15 != 0) goto L_0x0331
            goto L_0x03c9
        L_0x0331:
            boolean r14 = r1.f4515b
            boolean r16 = r13.isEmpty()
            if (r16 == 0) goto L_0x033b
            r0 = 0
            goto L_0x0341
        L_0x033b:
            java.lang.Object r16 = m3879a(r6, r9, r15, r14)
            r0 = r16
        L_0x0341:
            p.e.a r2 = m3893b(r6, r13, r0, r1)
            boolean r16 = r13.isEmpty()
            if (r16 == 0) goto L_0x034d
            r0 = 0
            goto L_0x0358
        L_0x034d:
            r16 = r0
            java.util.Collection r0 = r2.values()
            r11.addAll(r0)
            r0 = r16
        L_0x0358:
            if (r8 != 0) goto L_0x0360
            if (r12 != 0) goto L_0x0360
            if (r0 != 0) goto L_0x0360
            goto L_0x03c9
        L_0x0360:
            r22 = r4
            r4 = 1
            m3885a(r9, r15, r14, r2, r4)
            if (r0 == 0) goto L_0x038f
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            r6.mo6058b(r0, r7, r11)
            r20 = r9
            boolean r9 = r1.f4518e
            r21 = r10
            p.k.a.a r10 = r1.f4519f
            r23 = r14
            r14 = r6
            r24 = r15
            r15 = r0
            r16 = r12
            r17 = r2
            r18 = r9
            r19 = r10
            m3889a(r14, r15, r16, r17, r18, r19)
            if (r8 == 0) goto L_0x0398
            r6.mo6046a(r8, r4)
            goto L_0x0398
        L_0x038f:
            r20 = r9
            r21 = r10
            r23 = r14
            r24 = r15
            r4 = 0
        L_0x0398:
            p.k.a.v r2 = new p.k.a.v
            r16 = r20
            r9 = r2
            r15 = r21
            r10 = r6
            r14 = r11
            r11 = r13
            r25 = r5
            r5 = r12
            r12 = r0
            r26 = r0
            r0 = r13
            r13 = r1
            r28 = r14
            r27 = r32
            r29 = 0
            r14 = r15
            r32 = r15
            r30 = r33
            r15 = r7
            r17 = r24
            r18 = r23
            r19 = r28
            r20 = r8
            r21 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            p124p.p150h.p162l.C1402m.m3504a(r3, r2)
            r20 = r26
            goto L_0x03db
        L_0x03c9:
            r22 = r4
            r25 = r5
            r28 = r11
            r5 = r12
            r0 = r13
            r27 = r32
            r30 = r33
            r29 = 0
            r32 = r10
            r20 = r29
        L_0x03db:
            if (r8 != 0) goto L_0x03e3
            if (r20 != 0) goto L_0x03e3
            if (r5 != 0) goto L_0x03e3
            goto L_0x0449
        L_0x03e3:
            r2 = r25
            r4 = r28
            java.util.ArrayList r2 = m3882a(r6, r5, r2, r4, r7)
            if (r2 == 0) goto L_0x03f6
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L_0x03f4
            goto L_0x03f6
        L_0x03f4:
            r29 = r5
        L_0x03f6:
            r6.mo6047a(r8, r7)
            boolean r1 = r1.f4515b
            r14 = r6
            r15 = r8
            r16 = r29
            r17 = r20
            r18 = r22
            r19 = r1
            java.lang.Object r1 = m3881a(r14, r15, r16, r17, r18, r19)
            if (r1 == 0) goto L_0x0449
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r14 = r6
            r15 = r1
            r16 = r8
            r17 = r4
            r18 = r29
            r19 = r2
            r21 = r32
            r14.mo6049a(r15, r16, r17, r18, r19, r20, r21)
            p.k.a.t r5 = new p.k.a.t
            r9 = r5
            r10 = r8
            r11 = r6
            r12 = r7
            r13 = r22
            r14 = r32
            r15 = r4
            r16 = r2
            r17 = r29
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            p124p.p150h.p162l.C1402m.m3504a(r3, r5)
            p.k.a.z r2 = new p.k.a.z
            r4 = r32
            r2.<init>(r6, r4, r0)
            p124p.p150h.p162l.C1402m.m3504a(r3, r2)
            r6.mo6045a(r3, r1)
            p.k.a.a0 r1 = new p.k.a.a0
            r1.<init>(r6, r4, r0)
            p124p.p150h.p162l.C1402m.m3504a(r3, r1)
        L_0x0449:
            int r14 = r27 + 1
            r0 = r39
            r1 = r40
            r2 = r41
            r3 = r43
            r4 = r44
            r15 = r30
            r5 = r31
            r6 = 1
            r8 = 0
            goto L_0x007c
        L_0x045d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p170k.p171a.C1517w.m3890a(p.k.a.k, java.util.ArrayList, java.util.ArrayList, int, int, boolean):void");
    }
}
