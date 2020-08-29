package p213q.p217b.p301c.p302a.p311j0.p312a;

import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.RandomAccess;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.C3598d;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.C3599e;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3719v.C3720a;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3734c;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3736e;

/* renamed from: q.b.c.a.j0.a.i1 */
public final class C3634i1 {

    /* renamed from: a */
    public static final Class<?> f9030a;

    /* renamed from: b */
    public static final C3677m1<?, ?> f9031b = m8343a(false);

    /* renamed from: c */
    public static final C3677m1<?, ?> f9032c = m8343a(true);

    /* renamed from: d */
    public static final C3677m1<?, ?> f9033d = new C3683o1();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f9030a = cls;
    }

    /* renamed from: a */
    public static int m8335a(int i, Object obj, C3625g1 g1Var) {
        int h;
        int e;
        if (obj instanceof C3621f0) {
            C3621f0 f0Var = (C3621f0) obj;
            h = C3670m.m8669h(i);
            e = C3670m.m8637a(f0Var);
        } else {
            C3706s0 s0Var = (C3706s0) obj;
            h = C3670m.m8669h(i);
            e = C3670m.m8656e(((C3588a) s0Var).getSerializedSize(g1Var));
        }
        return e + h;
    }

    /* renamed from: a */
    public static int m8336a(int i, List<C3635j> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int h = C3670m.m8669h(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            h += C3670m.m8638a((C3635j) list.get(i2));
        }
        return h;
    }

    /* renamed from: a */
    public static int m8337a(int i, List<C3706s0> list, C3625g1 g1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C3670m.m8643b(i, (C3706s0) list.get(i3), g1Var);
        }
        return i2;
    }

    /* renamed from: a */
    public static int m8338a(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (!z) {
            return C3670m.m8644b(i, true) * size;
        }
        return C3670m.m8656e(size) + C3670m.m8669h(i);
    }

    /* renamed from: a */
    public static int m8339a(List<?> list) {
        return list.size();
    }

    /* renamed from: a */
    public static <UT, UB> UB m8341a(int i, List<Integer> list, C3598d<?> dVar, UB ub, C3677m1<UT, UB> m1Var) {
        if (dVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = ((Integer) list.get(i3)).intValue();
                if (dVar.findValueByNumber(intValue) != null) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = m8340a(i, intValue, ub, m1Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (dVar.findValueByNumber(intValue2) == null) {
                    ub = m8340a(i, intValue2, ub, m1Var);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* renamed from: a */
    public static <UT, UB> UB m8342a(int i, List<Integer> list, C3599e eVar, UB ub, C3677m1<UT, UB> m1Var) {
        if (eVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = ((Integer) list.get(i3)).intValue();
                if (eVar.isInRange(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = m8340a(i, intValue, ub, m1Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!eVar.isInRange(intValue2)) {
                    ub = m8340a(i, intValue2, ub, m1Var);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* renamed from: a */
    public static void m8347a(Class<?> cls) {
        if (!C3731z.class.isAssignableFrom(cls)) {
            Class<?> cls2 = f9030a;
            if (cls2 != null && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
        }
    }

    /* renamed from: a */
    public static boolean m8351a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    public static int m8352b(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int h = C3670m.m8669h(i) * size;
        if (list instanceof C3627h0) {
            C3627h0 h0Var = (C3627h0) list;
            while (i2 < size) {
                Object d = h0Var.mo9635d(i2);
                h = (d instanceof C3635j ? C3670m.m8638a((C3635j) d) : C3670m.m8636a((String) d)) + h;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                h = (obj instanceof C3635j ? C3670m.m8638a((C3635j) obj) : C3670m.m8636a((String) obj)) + h;
                i2++;
            }
        }
        return h;
    }

    /* renamed from: b */
    public static int m8354b(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int b = m8355b(list);
        int h = C3670m.m8669h(i);
        return z ? C3670m.m8656e(b) + h : (h * size) + b;
    }

    /* renamed from: b */
    public static int m8355b(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C3591a0) {
            C3591a0 a0Var = (C3591a0) list;
            i = 0;
            while (i2 < size) {
                i += C3670m.m8652d(a0Var.mo9520g(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C3670m.m8652d(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: c */
    public static int m8359c(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (!z) {
            return C3670m.m8662f(i, 0) * size;
        }
        int i2 = size * 4;
        return C3670m.m8656e(i2) + C3670m.m8669h(i);
    }

    /* renamed from: c */
    public static int m8360c(List<?> list) {
        return list.size() * 4;
    }

    /* renamed from: c */
    public static void m8361c(int i, List<Integer> list, C3722v1 v1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            C3678n nVar = (C3678n) v1Var;
            if (nVar != null) {
                int i2 = 0;
                if (z) {
                    nVar.f9116a.mo9815c(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        i3 += C3670m.m8652d(((Integer) list.get(i4)).intValue());
                    }
                    nVar.f9116a.mo9814c(i3);
                    while (i2 < list.size()) {
                        nVar.f9116a.mo9809b(((Integer) list.get(i2)).intValue());
                        i2++;
                    }
                    return;
                }
                while (i2 < list.size()) {
                    nVar.f9116a.mo9810b(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            throw null;
        }
    }

    /* renamed from: d */
    public static int m8362d(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (!z) {
            return C3670m.m8648c(i, 0) * size;
        }
        int i2 = size * 8;
        return C3670m.m8656e(i2) + C3670m.m8669h(i);
    }

    /* renamed from: d */
    public static int m8363d(List<?> list) {
        return list.size() * 8;
    }

    /* renamed from: d */
    public static void m8364d(int i, List<Integer> list, C3722v1 v1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            C3678n nVar = (C3678n) v1Var;
            if (nVar != null) {
                int i2 = 0;
                if (z) {
                    nVar.f9116a.mo9815c(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        ((Integer) list.get(i4)).intValue();
                        i3 += 4;
                    }
                    nVar.f9116a.mo9814c(i3);
                    while (i2 < list.size()) {
                        nVar.f9116a.mo9799a(((Integer) list.get(i2)).intValue());
                        i2++;
                    }
                    return;
                }
                while (i2 < list.size()) {
                    nVar.f9116a.mo9800a(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            throw null;
        }
    }

    /* renamed from: e */
    public static int m8365e(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = m8366e(list);
        int h = C3670m.m8669h(i);
        return z ? C3670m.m8656e(e) + h : (h * size) + e;
    }

    /* renamed from: e */
    public static int m8366e(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C3591a0) {
            C3591a0 a0Var = (C3591a0) list;
            i = 0;
            while (i2 < size) {
                i += C3670m.m8652d(a0Var.mo9520g(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C3670m.m8652d(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: e */
    public static void m8367e(int i, List<Long> list, C3722v1 v1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            C3678n nVar = (C3678n) v1Var;
            if (nVar != null) {
                int i2 = 0;
                if (z) {
                    nVar.f9116a.mo9815c(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        ((Long) list.get(i4)).longValue();
                        i3 += 8;
                    }
                    nVar.f9116a.mo9814c(i3);
                    while (i2 < list.size()) {
                        nVar.f9116a.mo9807a(((Long) list.get(i2)).longValue());
                        i2++;
                    }
                    return;
                }
                while (i2 < list.size()) {
                    nVar.f9116a.mo9801a(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            throw null;
        }
    }

    /* renamed from: f */
    public static int m8368f(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        int f = m8369f(list);
        if (z) {
            return C3670m.m8656e(f) + C3670m.m8669h(i);
        }
        return (C3670m.m8669h(i) * list.size()) + f;
    }

    /* renamed from: f */
    public static int m8369f(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C3645j0) {
            C3645j0 j0Var = (C3645j0) list;
            i = 0;
            while (i2 < size) {
                i += C3670m.m8654d(j0Var.mo9682f(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C3670m.m8654d(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: g */
    public static int m8371g(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int g = m8372g(list);
        int h = C3670m.m8669h(i);
        return z ? C3670m.m8656e(g) + h : (h * size) + g;
    }

    /* renamed from: g */
    public static int m8372g(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C3591a0) {
            C3591a0 a0Var = (C3591a0) list;
            i = 0;
            while (i2 < size) {
                i += C3670m.m8665g(a0Var.mo9520g(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C3670m.m8665g(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: g */
    public static void m8373g(int i, List<Integer> list, C3722v1 v1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            C3678n nVar = (C3678n) v1Var;
            if (nVar != null) {
                int i2 = 0;
                if (z) {
                    nVar.f9116a.mo9815c(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        i3 += C3670m.m8652d(((Integer) list.get(i4)).intValue());
                    }
                    nVar.f9116a.mo9814c(i3);
                    while (i2 < list.size()) {
                        nVar.f9116a.mo9809b(((Integer) list.get(i2)).intValue());
                        i2++;
                    }
                    return;
                }
                while (i2 < list.size()) {
                    nVar.f9116a.mo9810b(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            throw null;
        }
    }

    /* renamed from: h */
    public static int m8374h(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int h = m8375h(list);
        int h2 = C3670m.m8669h(i);
        return z ? C3670m.m8656e(h) + h2 : (h2 * size) + h;
    }

    /* renamed from: h */
    public static int m8375h(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C3645j0) {
            C3645j0 j0Var = (C3645j0) list;
            i = 0;
            while (i2 < size) {
                i += C3670m.m8650c(j0Var.mo9682f(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C3670m.m8650c(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: h */
    public static void m8376h(int i, List<Long> list, C3722v1 v1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            C3678n nVar = (C3678n) v1Var;
            if (nVar != null) {
                int i2 = 0;
                if (z) {
                    nVar.f9116a.mo9815c(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        i3 += C3670m.m8654d(((Long) list.get(i4)).longValue());
                    }
                    nVar.f9116a.mo9814c(i3);
                    while (i2 < list.size()) {
                        nVar.f9116a.mo9813b(((Long) list.get(i2)).longValue());
                        i2++;
                    }
                    return;
                }
                while (i2 < list.size()) {
                    nVar.f9116a.mo9811b(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            throw null;
        }
    }

    /* renamed from: i */
    public static int m8377i(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = m8378i(list);
        int h = C3670m.m8669h(i);
        return z ? C3670m.m8656e(i2) + h : (h * size) + i2;
    }

    /* renamed from: i */
    public static int m8378i(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C3591a0) {
            C3591a0 a0Var = (C3591a0) list;
            i = 0;
            while (i2 < size) {
                i += C3670m.m8671i(a0Var.mo9520g(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C3670m.m8671i(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: i */
    public static void m8379i(int i, List<Integer> list, C3722v1 v1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            C3678n nVar = (C3678n) v1Var;
            if (nVar != null) {
                int i2 = 0;
                if (z) {
                    nVar.f9116a.mo9815c(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        ((Integer) list.get(i4)).intValue();
                        i3 += 4;
                    }
                    nVar.f9116a.mo9814c(i3);
                    while (i2 < list.size()) {
                        nVar.f9116a.mo9799a(((Integer) list.get(i2)).intValue());
                        i2++;
                    }
                    return;
                }
                while (i2 < list.size()) {
                    nVar.f9116a.mo9800a(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            throw null;
        }
    }

    /* renamed from: j */
    public static int m8380j(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int j = m8381j(list);
        int h = C3670m.m8669h(i);
        return z ? C3670m.m8656e(j) + h : (h * size) + j;
    }

    /* renamed from: j */
    public static int m8381j(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C3645j0) {
            C3645j0 j0Var = (C3645j0) list;
            i = 0;
            while (i2 < size) {
                i += C3670m.m8654d(j0Var.mo9682f(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C3670m.m8654d(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: j */
    public static void m8382j(int i, List<Long> list, C3722v1 v1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            C3678n nVar = (C3678n) v1Var;
            if (nVar != null) {
                int i2 = 0;
                if (z) {
                    nVar.f9116a.mo9815c(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        ((Long) list.get(i4)).longValue();
                        i3 += 8;
                    }
                    nVar.f9116a.mo9814c(i3);
                    while (i2 < list.size()) {
                        nVar.f9116a.mo9807a(((Long) list.get(i2)).longValue());
                        i2++;
                    }
                    return;
                }
                while (i2 < list.size()) {
                    nVar.f9116a.mo9801a(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            throw null;
        }
    }

    /* renamed from: k */
    public static void m8383k(int i, List<Integer> list, C3722v1 v1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            C3678n nVar = (C3678n) v1Var;
            if (nVar != null) {
                int i2 = 0;
                if (z) {
                    nVar.f9116a.mo9815c(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        i3 += C3670m.m8665g(((Integer) list.get(i4)).intValue());
                    }
                    nVar.f9116a.mo9814c(i3);
                    while (i2 < list.size()) {
                        nVar.f9116a.mo9814c(C3670m.m8673j(((Integer) list.get(i2)).intValue()));
                        i2++;
                    }
                    return;
                }
                while (i2 < list.size()) {
                    nVar.f9116a.mo9816d(i, C3670m.m8673j(((Integer) list.get(i2)).intValue()));
                    i2++;
                }
                return;
            }
            throw null;
        }
    }

    /* renamed from: l */
    public static void m8384l(int i, List<Long> list, C3722v1 v1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            C3678n nVar = (C3678n) v1Var;
            if (nVar != null) {
                int i2 = 0;
                if (z) {
                    nVar.f9116a.mo9815c(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        i3 += C3670m.m8650c(((Long) list.get(i4)).longValue());
                    }
                    nVar.f9116a.mo9814c(i3);
                    while (i2 < list.size()) {
                        nVar.f9116a.mo9813b(C3670m.m8659e(((Long) list.get(i2)).longValue()));
                        i2++;
                    }
                    return;
                }
                while (i2 < list.size()) {
                    nVar.f9116a.mo9811b(i, C3670m.m8659e(((Long) list.get(i2)).longValue()));
                    i2++;
                }
                return;
            }
            throw null;
        }
    }

    /* renamed from: m */
    public static void m8385m(int i, List<Integer> list, C3722v1 v1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            C3678n nVar = (C3678n) v1Var;
            if (nVar != null) {
                int i2 = 0;
                if (z) {
                    nVar.f9116a.mo9815c(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        i3 += C3670m.m8671i(((Integer) list.get(i4)).intValue());
                    }
                    nVar.f9116a.mo9814c(i3);
                    while (i2 < list.size()) {
                        nVar.f9116a.mo9814c(((Integer) list.get(i2)).intValue());
                        i2++;
                    }
                    return;
                }
                while (i2 < list.size()) {
                    nVar.f9116a.mo9816d(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            throw null;
        }
    }

    /* renamed from: n */
    public static void m8386n(int i, List<Long> list, C3722v1 v1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            C3678n nVar = (C3678n) v1Var;
            if (nVar != null) {
                int i2 = 0;
                if (z) {
                    nVar.f9116a.mo9815c(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        i3 += C3670m.m8654d(((Long) list.get(i4)).longValue());
                    }
                    nVar.f9116a.mo9814c(i3);
                    while (i2 < list.size()) {
                        nVar.f9116a.mo9813b(((Long) list.get(i2)).longValue());
                        i2++;
                    }
                    return;
                }
                while (i2 < list.size()) {
                    nVar.f9116a.mo9811b(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            throw null;
        }
    }

    /* renamed from: b */
    public static int m8353b(int i, List<?> list, C3625g1 g1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int h = C3670m.m8669h(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            h = obj instanceof C3621f0 ? C3670m.m8637a((C3621f0) obj) + h : h + C3670m.m8656e(((C3588a) ((C3706s0) obj)).getSerializedSize(g1Var));
        }
        return h;
    }

    /* renamed from: f */
    public static void m8370f(int i, List<Float> list, C3722v1 v1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            C3678n nVar = (C3678n) v1Var;
            if (nVar != null) {
                int i2 = 0;
                if (z) {
                    nVar.f9116a.mo9815c(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        ((Float) list.get(i4)).floatValue();
                        i3 += 4;
                    }
                    nVar.f9116a.mo9814c(i3);
                    while (i2 < list.size()) {
                        C3670m mVar = nVar.f9116a;
                        float floatValue = ((Float) list.get(i2)).floatValue();
                        if (mVar != null) {
                            mVar.mo9799a(Float.floatToRawIntBits(floatValue));
                            i2++;
                        } else {
                            throw null;
                        }
                    }
                    return;
                }
                while (i2 < list.size()) {
                    C3670m mVar2 = nVar.f9116a;
                    float floatValue2 = ((Float) list.get(i2)).floatValue();
                    if (mVar2 != null) {
                        mVar2.mo9800a(i, Float.floatToRawIntBits(floatValue2));
                        i2++;
                    } else {
                        throw null;
                    }
                }
                return;
            }
            throw null;
        }
    }

    /* renamed from: a */
    public static C3677m1<?, ?> m8343a(boolean z) {
        Class cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (C3677m1) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: b */
    public static void m8358b(int i, List<Double> list, C3722v1 v1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            C3678n nVar = (C3678n) v1Var;
            if (nVar != null) {
                int i2 = 0;
                if (z) {
                    nVar.f9116a.mo9815c(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        ((Double) list.get(i4)).doubleValue();
                        i3 += 8;
                    }
                    nVar.f9116a.mo9814c(i3);
                    while (i2 < list.size()) {
                        C3670m mVar = nVar.f9116a;
                        double doubleValue = ((Double) list.get(i2)).doubleValue();
                        if (mVar != null) {
                            mVar.mo9807a(Double.doubleToRawLongBits(doubleValue));
                            i2++;
                        } else {
                            throw null;
                        }
                    }
                    return;
                }
                while (i2 < list.size()) {
                    C3670m mVar2 = nVar.f9116a;
                    double doubleValue2 = ((Double) list.get(i2)).doubleValue();
                    if (mVar2 != null) {
                        mVar2.mo9801a(i, Double.doubleToRawLongBits(doubleValue2));
                        i2++;
                    } else {
                        throw null;
                    }
                }
                return;
            }
            throw null;
        }
    }

    /* renamed from: a */
    public static <T, FT extends C3720a<FT>> void m8350a(C3705s<FT> sVar, T t, T t2) {
        if (((C3709t) sVar) != null) {
            C3719v<C3736e> vVar = ((C3734c) t2).f9286e;
            if (!vVar.mo9966a()) {
                C3719v a = sVar.mo9920a((Object) t);
                if (a != null) {
                    for (int i = 0; i < vVar.f9208a.mo9693b(); i++) {
                        a.mo9967b(vVar.f9208a.mo9691a(i));
                    }
                    for (Entry b : vVar.f9208a.mo9695c()) {
                        a.mo9967b(b);
                    }
                    return;
                }
                throw null;
            }
            return;
        }
        throw null;
    }

    /* renamed from: b */
    public static void m8357b(int i, List<?> list, C3722v1 v1Var, C3625g1 g1Var) {
        if (list != null && !list.isEmpty()) {
            C3678n nVar = (C3678n) v1Var;
            if (nVar != null) {
                for (int i2 = 0; i2 < list.size(); i2++) {
                    nVar.f9116a.mo9805a(i, (C3706s0) list.get(i2), g1Var);
                }
                return;
            }
            throw null;
        }
    }

    /* renamed from: a */
    public static <T> void m8349a(C3679n0 n0Var, T t, T t2, long j) {
        C3691q1.f9140f.mo9905a((Object) t, j, n0Var.mo9852a(C3691q1.m8828h(t, j), C3691q1.m8828h(t2, j)));
    }

    /* renamed from: a */
    public static <T, UT, UB> void m8348a(C3677m1<UT, UB> m1Var, T t, T t2) {
        if (((C3683o1) m1Var) != null) {
            C3731z zVar = (C3731z) t;
            C3680n1 n1Var = zVar.unknownFields;
            C3680n1 n1Var2 = ((C3731z) t2).unknownFields;
            if (!n1Var2.equals(C3680n1.f9117f)) {
                n1Var = C3680n1.m8770a(n1Var, n1Var2);
            }
            zVar.unknownFields = n1Var;
            return;
        }
        throw null;
    }

    /* renamed from: b */
    public static void m8356b(int i, List<String> list, C3722v1 v1Var) {
        if (list != null && !list.isEmpty()) {
            C3678n nVar = (C3678n) v1Var;
            if (nVar != null) {
                int i2 = 0;
                if (list instanceof C3627h0) {
                    C3627h0 h0Var = (C3627h0) list;
                    while (i2 < list.size()) {
                        Object d = h0Var.mo9635d(i2);
                        if (d instanceof String) {
                            nVar.f9116a.mo9802a(i, (String) d);
                        } else {
                            nVar.f9116a.mo9803a(i, (C3635j) d);
                        }
                        i2++;
                    }
                    return;
                }
                while (i2 < list.size()) {
                    nVar.f9116a.mo9802a(i, (String) list.get(i2));
                    i2++;
                }
                return;
            }
            throw null;
        }
    }

    /* renamed from: a */
    public static <UT, UB> UB m8340a(int i, int i2, UB ub, C3677m1<UT, UB> m1Var) {
        if (ub == null) {
            if (((C3683o1) m1Var) != null) {
                ub = C3680n1.m8772c();
            } else {
                throw null;
            }
        }
        long j = (long) i2;
        if (((C3683o1) m1Var) != null) {
            ((C3680n1) ub).mo9859a((i << 3) | 0, (Object) Long.valueOf(j));
            return ub;
        }
        throw null;
    }

    /* renamed from: a */
    public static void m8346a(int i, List<Boolean> list, C3722v1 v1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            C3678n nVar = (C3678n) v1Var;
            if (nVar != null) {
                int i2 = 0;
                if (z) {
                    nVar.f9116a.mo9815c(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        ((Boolean) list.get(i4)).booleanValue();
                        i3++;
                    }
                    nVar.f9116a.mo9814c(i3);
                    while (i2 < list.size()) {
                        nVar.f9116a.mo9798a(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : 0);
                        i2++;
                    }
                    return;
                }
                while (i2 < list.size()) {
                    nVar.f9116a.mo9806a(i, ((Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            throw null;
        }
    }

    /* renamed from: a */
    public static void m8344a(int i, List<C3635j> list, C3722v1 v1Var) {
        if (list != null && !list.isEmpty()) {
            C3678n nVar = (C3678n) v1Var;
            if (nVar != null) {
                for (int i2 = 0; i2 < list.size(); i2++) {
                    nVar.f9116a.mo9803a(i, (C3635j) list.get(i2));
                }
                return;
            }
            throw null;
        }
    }

    /* renamed from: a */
    public static void m8345a(int i, List<?> list, C3722v1 v1Var, C3625g1 g1Var) {
        if (list != null && !list.isEmpty()) {
            C3678n nVar = (C3678n) v1Var;
            if (nVar != null) {
                for (int i2 = 0; i2 < list.size(); i2++) {
                    nVar.mo9848a(i, list.get(i2), g1Var);
                }
                return;
            }
            throw null;
        }
    }
}
