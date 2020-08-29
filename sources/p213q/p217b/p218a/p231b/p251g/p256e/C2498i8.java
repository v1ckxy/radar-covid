package p213q.p217b.p218a.p231b.p251g.p256e;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.RandomAccess;
import p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2492b;
import p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2495e;
import p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.C2616a;

/* renamed from: q.b.a.b.g.e.i8 */
public final class C2498i8 {

    /* renamed from: a */
    public static final Class<?> f6622a;

    /* renamed from: b */
    public static final C2702u8<?, ?> f6623b = m5981a(false);

    /* renamed from: c */
    public static final C2702u8<?, ?> f6624c = m5981a(true);

    /* renamed from: d */
    public static final C2702u8<?, ?> f6625d = new C2734w8();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f6622a = cls;
    }

    /* renamed from: a */
    public static int m5975a(int i, Object obj, C2455g8 g8Var) {
        if (obj instanceof C2763y6) {
            C2763y6 y6Var = (C2763y6) obj;
            int f = C2615p5.m6256f(i);
            int a = y6Var.mo8117a();
            return C2615p5.m6260h(a) + a + f;
        }
        C2619p7 p7Var = (C2619p7) obj;
        return C2615p5.m6234a(p7Var, g8Var) + C2615p5.m6256f(i);
    }

    /* renamed from: a */
    public static int m5976a(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int f = C2615p5.m6256f(i) * size;
        if (list instanceof C2347a7) {
            C2347a7 a7Var = (C2347a7) list;
            while (i2 < size) {
                Object c = a7Var.mo7400c(i2);
                f = (c instanceof C2435f5 ? C2615p5.m6232a((C2435f5) c) : C2615p5.m6231a((String) c)) + f;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                f = (obj instanceof C2435f5 ? C2615p5.m6232a((C2435f5) obj) : C2615p5.m6231a((String) obj)) + f;
                i2++;
            }
        }
        return f;
    }

    /* renamed from: a */
    public static int m5977a(int i, List<?> list, C2455g8 g8Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int f = C2615p5.m6256f(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            f = (obj instanceof C2763y6 ? C2615p5.m6235a((C2763y6) obj) : C2615p5.m6234a((C2619p7) obj, g8Var)) + f;
        }
        return f;
    }

    /* renamed from: a */
    public static <UT, UB> UB m5980a(int i, List<Integer> list, C2563m6 m6Var, UB ub, C2702u8<UT, UB> u8Var) {
        if (m6Var == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = ((Integer) list.get(i3)).intValue();
                if (m6Var.mo7788a(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = m5979a(i, intValue, ub, u8Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!m6Var.mo7788a(intValue2)) {
                    ub = m5979a(i, intValue2, ub, u8Var);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* renamed from: a */
    public static void m5985a(Class<?> cls) {
        if (!C2490i6.class.isAssignableFrom(cls)) {
            Class<?> cls2 = f6622a;
            if (cls2 != null && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
        }
    }

    /* renamed from: a */
    public static <T> void m5986a(C2564m7 m7Var, T t, T t2, long j) {
        C2366b9.m5485a((Object) t, j, m7Var.mo7848a(C2366b9.m5496f(t, j), C2366b9.m5496f(t2, j)));
    }

    /* renamed from: a */
    public static boolean m5989a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    public static int m5990b(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (C2615p5.m6256f(i) * list.size()) + m5978a(list);
    }

    /* renamed from: b */
    public static int m5991b(int i, List<C2619p7> list, C2455g8 g8Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C2615p5.m6230a(i, (C2619p7) list.get(i3), g8Var);
        }
        return i2;
    }

    /* renamed from: b */
    public static int m5992b(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2402d7) {
            C2402d7 d7Var = (C2402d7) list;
            i = 0;
            while (i2 < size) {
                i += C2615p5.m6246c(d7Var.mo7530c(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C2615p5.m6246c(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static void m5993b(int i, List<C2435f5> list, C2584n9 n9Var) {
        if (list != null && !list.isEmpty()) {
            C2650r5 r5Var = (C2650r5) n9Var;
            if (r5Var != null) {
                for (int i2 = 0; i2 < list.size(); i2++) {
                    C2435f5 f5Var = (C2435f5) list.get(i2);
                    C2616a aVar = (C2616a) r5Var.f6834a;
                    aVar.mo7946b((i << 3) | 2);
                    aVar.mo7952b(f5Var);
                }
                return;
            }
            throw null;
        }
    }

    /* renamed from: c */
    public static int m5996c(int i, List<C2435f5> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int f = C2615p5.m6256f(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            f += C2615p5.m6232a((C2435f5) list.get(i2));
        }
        return f;
    }

    /* renamed from: c */
    public static int m5997c(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2402d7) {
            C2402d7 d7Var = (C2402d7) list;
            i = 0;
            while (i2 < size) {
                i += C2615p5.m6250d(d7Var.mo7530c(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C2615p5.m6250d(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: c */
    public static void m5998c(int i, List<Long> list, C2584n9 n9Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            C2650r5 r5Var = (C2650r5) n9Var;
            if (r5Var != null) {
                if (z) {
                    ((C2616a) r5Var.f6834a).mo7946b((i << 3) | 2);
                    int i2 = 0;
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        i2 += C2615p5.m6246c(((Long) list.get(i3)).longValue());
                    }
                    r5Var.f6834a.mo7946b(i2);
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        r5Var.f6834a.mo7945a(((Long) list.get(i4)).longValue());
                    }
                    return;
                }
                for (int i5 = 0; i5 < list.size(); i5++) {
                    C2615p5 p5Var = r5Var.f6834a;
                    long longValue = ((Long) list.get(i5)).longValue();
                    C2616a aVar = (C2616a) p5Var;
                    aVar.mo7946b((i << 3) | 0);
                    aVar.mo7945a(longValue);
                }
                return;
            }
            throw null;
        }
    }

    /* renamed from: d */
    public static int m5999d(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C2615p5.m6256f(i) * size) + m5992b(list);
    }

    /* renamed from: d */
    public static int m6000d(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2512j6) {
            C2512j6 j6Var = (C2512j6) list;
            i = 0;
            while (i2 < size) {
                i += C2615p5.m6258g(j6Var.mo7796e(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C2615p5.m6258g(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: e */
    public static int m6002e(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C2615p5.m6256f(i) * size) + m5997c(list);
    }

    /* renamed from: e */
    public static int m6003e(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2512j6) {
            C2512j6 j6Var = (C2512j6) list;
            i = 0;
            while (i2 < size) {
                i += C2615p5.m6258g(j6Var.mo7796e(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C2615p5.m6258g(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: e */
    public static void m6004e(int i, List<Long> list, C2584n9 n9Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            C2650r5 r5Var = (C2650r5) n9Var;
            if (r5Var != null) {
                if (z) {
                    ((C2616a) r5Var.f6834a).mo7946b((i << 3) | 2);
                    int i2 = 0;
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        i2 += C2615p5.m6250d(((Long) list.get(i3)).longValue());
                    }
                    r5Var.f6834a.mo7946b(i2);
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        r5Var.f6834a.mo7945a(C2615p5.m6254e(((Long) list.get(i4)).longValue()));
                    }
                    return;
                }
                int i5 = 0;
                while (i5 < list.size()) {
                    C2615p5 p5Var = r5Var.f6834a;
                    long longValue = ((Long) list.get(i5)).longValue();
                    if (p5Var != null) {
                        long e = C2615p5.m6254e(longValue);
                        C2616a aVar = (C2616a) p5Var;
                        aVar.mo7946b((i << 3) | 0);
                        aVar.mo7945a(e);
                        i5++;
                    } else {
                        throw null;
                    }
                }
                return;
            }
            throw null;
        }
    }

    /* renamed from: f */
    public static int m6005f(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C2615p5.m6256f(i) * size) + m6000d(list);
    }

    /* renamed from: f */
    public static int m6006f(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2512j6) {
            C2512j6 j6Var = (C2512j6) list;
            i = 0;
            while (i2 < size) {
                i += C2615p5.m6260h(j6Var.mo7796e(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C2615p5.m6260h(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: f */
    public static void m6007f(int i, List<Long> list, C2584n9 n9Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            C2650r5 r5Var = (C2650r5) n9Var;
            if (r5Var != null) {
                int i2 = 0;
                if (z) {
                    ((C2616a) r5Var.f6834a).mo7946b((i << 3) | 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        ((Long) list.get(i4)).longValue();
                        i3 += 8;
                    }
                    r5Var.f6834a.mo7946b(i3);
                    while (i2 < list.size()) {
                        r5Var.f6834a.mo7947b(((Long) list.get(i2)).longValue());
                        i2++;
                    }
                    return;
                }
                while (i2 < list.size()) {
                    C2615p5 p5Var = r5Var.f6834a;
                    long longValue = ((Long) list.get(i2)).longValue();
                    C2616a aVar = (C2616a) p5Var;
                    aVar.mo7946b((i << 3) | 1);
                    aVar.mo7947b(longValue);
                    i2++;
                }
                return;
            }
            throw null;
        }
    }

    /* renamed from: g */
    public static int m6008g(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C2615p5.m6256f(i) * size) + m6003e(list);
    }

    /* renamed from: g */
    public static int m6009g(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2512j6) {
            C2512j6 j6Var = (C2512j6) list;
            i = 0;
            while (i2 < size) {
                i += C2615p5.m6262j(j6Var.mo7796e(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C2615p5.m6262j(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: g */
    public static void m6010g(int i, List<Long> list, C2584n9 n9Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            C2650r5 r5Var = (C2650r5) n9Var;
            if (r5Var != null) {
                int i2 = 0;
                if (z) {
                    ((C2616a) r5Var.f6834a).mo7946b((i << 3) | 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        ((Long) list.get(i4)).longValue();
                        i3 += 8;
                    }
                    r5Var.f6834a.mo7946b(i3);
                    while (i2 < list.size()) {
                        r5Var.f6834a.mo7947b(((Long) list.get(i2)).longValue());
                        i2++;
                    }
                    return;
                }
                while (i2 < list.size()) {
                    C2615p5 p5Var = r5Var.f6834a;
                    long longValue = ((Long) list.get(i2)).longValue();
                    C2616a aVar = (C2616a) p5Var;
                    aVar.mo7946b((i << 3) | 1);
                    aVar.mo7947b(longValue);
                    i2++;
                }
                return;
            }
            throw null;
        }
    }

    /* renamed from: h */
    public static int m6011h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C2615p5.m6256f(i) * size) + m6006f(list);
    }

    /* renamed from: h */
    public static int m6012h(List<?> list) {
        return list.size() << 2;
    }

    /* renamed from: h */
    public static void m6013h(int i, List<Integer> list, C2584n9 n9Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            C2650r5 r5Var = (C2650r5) n9Var;
            if (r5Var != null) {
                int i2 = 0;
                if (z) {
                    ((C2616a) r5Var.f6834a).mo7946b((i << 3) | 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        i3 += C2615p5.m6258g(((Integer) list.get(i4)).intValue());
                    }
                    r5Var.f6834a.mo7946b(i3);
                    while (i2 < list.size()) {
                        r5Var.f6834a.mo7943a(((Integer) list.get(i2)).intValue());
                        i2++;
                    }
                    return;
                }
                while (i2 < list.size()) {
                    r5Var.f6834a.mo7944a(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            throw null;
        }
    }

    /* renamed from: i */
    public static int m6014i(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C2615p5.m6256f(i) * size) + m6009g(list);
    }

    /* renamed from: i */
    public static int m6015i(List<?> list) {
        return list.size() << 3;
    }

    /* renamed from: i */
    public static void m6016i(int i, List<Integer> list, C2584n9 n9Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            C2650r5 r5Var = (C2650r5) n9Var;
            if (r5Var != null) {
                if (z) {
                    ((C2616a) r5Var.f6834a).mo7946b((i << 3) | 2);
                    int i2 = 0;
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        i2 += C2615p5.m6260h(((Integer) list.get(i3)).intValue());
                    }
                    r5Var.f6834a.mo7946b(i2);
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        r5Var.f6834a.mo7946b(((Integer) list.get(i4)).intValue());
                    }
                    return;
                }
                for (int i5 = 0; i5 < list.size(); i5++) {
                    C2615p5 p5Var = r5Var.f6834a;
                    int intValue = ((Integer) list.get(i5)).intValue();
                    C2616a aVar = (C2616a) p5Var;
                    aVar.mo7946b((i << 3) | 0);
                    aVar.mo7946b(intValue);
                }
                return;
            }
            throw null;
        }
    }

    /* renamed from: j */
    public static int m6017j(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C2615p5.m6264l(i) * size;
    }

    /* renamed from: j */
    public static int m6018j(List<?> list) {
        return list.size();
    }

    /* renamed from: j */
    public static void m6019j(int i, List<Integer> list, C2584n9 n9Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            C2650r5 r5Var = (C2650r5) n9Var;
            if (r5Var != null) {
                if (z) {
                    ((C2616a) r5Var.f6834a).mo7946b((i << 3) | 2);
                    int i2 = 0;
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        i2 += C2615p5.m6262j(((Integer) list.get(i3)).intValue());
                    }
                    r5Var.f6834a.mo7946b(i2);
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        r5Var.f6834a.mo7946b(C2615p5.m6266n(((Integer) list.get(i4)).intValue()));
                    }
                    return;
                }
                int i5 = 0;
                while (i5 < list.size()) {
                    C2615p5 p5Var = r5Var.f6834a;
                    int intValue = ((Integer) list.get(i5)).intValue();
                    if (p5Var != null) {
                        int n = C2615p5.m6266n(intValue);
                        C2616a aVar = (C2616a) p5Var;
                        aVar.mo7946b((i << 3) | 0);
                        aVar.mo7946b(n);
                        i5++;
                    } else {
                        throw null;
                    }
                }
                return;
            }
            throw null;
        }
    }

    /* renamed from: k */
    public static int m6020k(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C2615p5.m6261i(i) * size;
    }

    /* renamed from: k */
    public static void m6021k(int i, List<Integer> list, C2584n9 n9Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            C2650r5 r5Var = (C2650r5) n9Var;
            if (r5Var != null) {
                int i2 = 0;
                if (z) {
                    ((C2616a) r5Var.f6834a).mo7946b((i << 3) | 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        ((Integer) list.get(i4)).intValue();
                        i3 += 4;
                    }
                    r5Var.f6834a.mo7946b(i3);
                    while (i2 < list.size()) {
                        r5Var.f6834a.mo7948c(((Integer) list.get(i2)).intValue());
                        i2++;
                    }
                    return;
                }
                while (i2 < list.size()) {
                    C2615p5 p5Var = r5Var.f6834a;
                    int intValue = ((Integer) list.get(i2)).intValue();
                    C2616a aVar = (C2616a) p5Var;
                    aVar.mo7946b((i << 3) | 5);
                    aVar.mo7948c(intValue);
                    i2++;
                }
                return;
            }
            throw null;
        }
    }

    /* renamed from: l */
    public static int m6022l(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C2615p5.m6252e(i) * size;
    }

    /* renamed from: l */
    public static void m6023l(int i, List<Integer> list, C2584n9 n9Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            C2650r5 r5Var = (C2650r5) n9Var;
            if (r5Var != null) {
                int i2 = 0;
                if (z) {
                    ((C2616a) r5Var.f6834a).mo7946b((i << 3) | 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        ((Integer) list.get(i4)).intValue();
                        i3 += 4;
                    }
                    r5Var.f6834a.mo7946b(i3);
                    while (i2 < list.size()) {
                        r5Var.f6834a.mo7948c(((Integer) list.get(i2)).intValue());
                        i2++;
                    }
                    return;
                }
                while (i2 < list.size()) {
                    C2615p5 p5Var = r5Var.f6834a;
                    int intValue = ((Integer) list.get(i2)).intValue();
                    C2616a aVar = (C2616a) p5Var;
                    aVar.mo7946b((i << 3) | 5);
                    aVar.mo7948c(intValue);
                    i2++;
                }
                return;
            }
            throw null;
        }
    }

    /* renamed from: m */
    public static void m6024m(int i, List<Integer> list, C2584n9 n9Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            C2650r5 r5Var = (C2650r5) n9Var;
            if (r5Var != null) {
                int i2 = 0;
                if (z) {
                    ((C2616a) r5Var.f6834a).mo7946b((i << 3) | 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        i3 += C2615p5.m6258g(((Integer) list.get(i4)).intValue());
                    }
                    r5Var.f6834a.mo7946b(i3);
                    while (i2 < list.size()) {
                        r5Var.f6834a.mo7943a(((Integer) list.get(i2)).intValue());
                        i2++;
                    }
                    return;
                }
                while (i2 < list.size()) {
                    r5Var.f6834a.mo7944a(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            throw null;
        }
    }

    /* renamed from: n */
    public static void m6025n(int i, List<Boolean> list, C2584n9 n9Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            C2650r5 r5Var = (C2650r5) n9Var;
            if (r5Var != null) {
                if (z) {
                    ((C2616a) r5Var.f6834a).mo7946b((i << 3) | 2);
                    int i2 = 0;
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        ((Boolean) list.get(i3)).booleanValue();
                        i2++;
                    }
                    r5Var.f6834a.mo7946b(i2);
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        r5Var.f6834a.mo7942a(((Boolean) list.get(i4)).booleanValue() ? (byte) 1 : 0);
                    }
                    return;
                }
                for (int i5 = 0; i5 < list.size(); i5++) {
                    C2615p5 p5Var = r5Var.f6834a;
                    boolean booleanValue = ((Boolean) list.get(i5)).booleanValue();
                    C2616a aVar = (C2616a) p5Var;
                    aVar.mo7946b((i << 3) | 0);
                    aVar.mo7942a(booleanValue ? (byte) 1 : 0);
                }
                return;
            }
            throw null;
        }
    }

    /* renamed from: a */
    public static int m5978a(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2402d7) {
            C2402d7 d7Var = (C2402d7) list;
            i = 0;
            while (i2 < size) {
                i += C2615p5.m6246c(d7Var.mo7530c(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C2615p5.m6246c(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: d */
    public static void m6001d(int i, List<Long> list, C2584n9 n9Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            C2650r5 r5Var = (C2650r5) n9Var;
            if (r5Var != null) {
                if (z) {
                    ((C2616a) r5Var.f6834a).mo7946b((i << 3) | 2);
                    int i2 = 0;
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        i2 += C2615p5.m6246c(((Long) list.get(i3)).longValue());
                    }
                    r5Var.f6834a.mo7946b(i2);
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        r5Var.f6834a.mo7945a(((Long) list.get(i4)).longValue());
                    }
                    return;
                }
                for (int i5 = 0; i5 < list.size(); i5++) {
                    C2615p5 p5Var = r5Var.f6834a;
                    long longValue = ((Long) list.get(i5)).longValue();
                    C2616a aVar = (C2616a) p5Var;
                    aVar.mo7946b((i << 3) | 0);
                    aVar.mo7945a(longValue);
                }
                return;
            }
            throw null;
        }
    }

    /* renamed from: b */
    public static void m5994b(int i, List<?> list, C2584n9 n9Var, C2455g8 g8Var) {
        if (list != null && !list.isEmpty()) {
            C2650r5 r5Var = (C2650r5) n9Var;
            if (r5Var != null) {
                for (int i2 = 0; i2 < list.size(); i2++) {
                    r5Var.mo7987b(i, list.get(i2), g8Var);
                }
                return;
            }
            throw null;
        }
    }

    /* renamed from: b */
    public static void m5995b(int i, List<Float> list, C2584n9 n9Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            C2650r5 r5Var = (C2650r5) n9Var;
            if (r5Var != null) {
                int i2 = 0;
                if (z) {
                    ((C2616a) r5Var.f6834a).mo7946b((i << 3) | 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        ((Float) list.get(i4)).floatValue();
                        i3 += 4;
                    }
                    r5Var.f6834a.mo7946b(i3);
                    while (i2 < list.size()) {
                        C2615p5 p5Var = r5Var.f6834a;
                        float floatValue = ((Float) list.get(i2)).floatValue();
                        if (p5Var != null) {
                            p5Var.mo7948c(Float.floatToRawIntBits(floatValue));
                            i2++;
                        } else {
                            throw null;
                        }
                    }
                    return;
                }
                while (i2 < list.size()) {
                    C2615p5 p5Var2 = r5Var.f6834a;
                    float floatValue2 = ((Float) list.get(i2)).floatValue();
                    if (p5Var2 != null) {
                        int floatToRawIntBits = Float.floatToRawIntBits(floatValue2);
                        C2616a aVar = (C2616a) p5Var2;
                        aVar.mo7946b((i << 3) | 5);
                        aVar.mo7948c(floatToRawIntBits);
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
    public static C2702u8<?, ?> m5981a(boolean z) {
        Class cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (C2702u8) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: a */
    public static <UT, UB> UB m5979a(int i, int i2, UB ub, C2702u8<UT, UB> u8Var) {
        if (ub == null) {
            if (((C2734w8) u8Var) != null) {
                ub = C2685t8.m6439b();
            } else {
                throw null;
            }
        }
        long j = (long) i2;
        if (((C2734w8) u8Var) != null) {
            ((C2685t8) ub).mo8033a(i << 3, Long.valueOf(j));
            return ub;
        }
        throw null;
    }

    /* renamed from: a */
    public static void m5982a(int i, List<String> list, C2584n9 n9Var) {
        if (list != null && !list.isEmpty()) {
            C2650r5 r5Var = (C2650r5) n9Var;
            if (r5Var != null) {
                int i2 = 0;
                if (list instanceof C2347a7) {
                    C2347a7 a7Var = (C2347a7) list;
                    while (i2 < list.size()) {
                        Object c = a7Var.mo7400c(i2);
                        if (c instanceof String) {
                            String str = (String) c;
                            C2616a aVar = (C2616a) r5Var.f6834a;
                            aVar.mo7946b((i << 3) | 2);
                            aVar.mo7951b(str);
                        } else {
                            C2435f5 f5Var = (C2435f5) c;
                            C2616a aVar2 = (C2616a) r5Var.f6834a;
                            aVar2.mo7946b((i << 3) | 2);
                            aVar2.mo7952b(f5Var);
                        }
                        i2++;
                    }
                    return;
                }
                while (i2 < list.size()) {
                    String str2 = (String) list.get(i2);
                    C2616a aVar3 = (C2616a) r5Var.f6834a;
                    aVar3.mo7946b((i << 3) | 2);
                    aVar3.mo7951b(str2);
                    i2++;
                }
                return;
            }
            throw null;
        }
    }

    /* renamed from: a */
    public static void m5983a(int i, List<?> list, C2584n9 n9Var, C2455g8 g8Var) {
        if (list != null && !list.isEmpty()) {
            C2650r5 r5Var = (C2650r5) n9Var;
            if (r5Var != null) {
                for (int i2 = 0; i2 < list.size(); i2++) {
                    r5Var.mo7982a(i, list.get(i2), g8Var);
                }
                return;
            }
            throw null;
        }
    }

    /* renamed from: a */
    public static void m5984a(int i, List<Double> list, C2584n9 n9Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            C2650r5 r5Var = (C2650r5) n9Var;
            if (r5Var != null) {
                int i2 = 0;
                if (z) {
                    ((C2616a) r5Var.f6834a).mo7946b((i << 3) | 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        ((Double) list.get(i4)).doubleValue();
                        i3 += 8;
                    }
                    r5Var.f6834a.mo7946b(i3);
                    while (i2 < list.size()) {
                        C2615p5 p5Var = r5Var.f6834a;
                        double doubleValue = ((Double) list.get(i2)).doubleValue();
                        if (p5Var != null) {
                            p5Var.mo7947b(Double.doubleToRawLongBits(doubleValue));
                            i2++;
                        } else {
                            throw null;
                        }
                    }
                    return;
                }
                while (i2 < list.size()) {
                    C2615p5 p5Var2 = r5Var.f6834a;
                    double doubleValue2 = ((Double) list.get(i2)).doubleValue();
                    if (p5Var2 != null) {
                        long doubleToRawLongBits = Double.doubleToRawLongBits(doubleValue2);
                        C2616a aVar = (C2616a) p5Var2;
                        aVar.mo7946b((i << 3) | 1);
                        aVar.mo7947b(doubleToRawLongBits);
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
    public static <T, FT extends C2778z5<FT>> void m5988a(C2731w5<FT> w5Var, T t, T t2) {
        if (((C2715v5) w5Var) != null) {
            C2746x5<C2495e> x5Var = ((C2492b) t2).zzc;
            if (!x5Var.f6958a.isEmpty()) {
                C2746x5 a = ((C2492b) t).mo7779a();
                if (a != null) {
                    for (int i = 0; i < x5Var.f6958a.mo7710b(); i++) {
                        a.mo8093a(x5Var.f6958a.mo7708a(i));
                    }
                    for (Entry a2 : x5Var.f6958a.mo7712c()) {
                        a.mo8093a(a2);
                    }
                    return;
                }
                throw null;
            }
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public static <T, UT, UB> void m5987a(C2702u8<UT, UB> u8Var, T t, T t2) {
        if (((C2734w8) u8Var) != null) {
            C2490i6 i6Var = (C2490i6) t;
            C2685t8 t8Var = i6Var.zzb;
            C2685t8 t8Var2 = ((C2490i6) t2).zzb;
            if (!t8Var2.equals(C2685t8.f6893f)) {
                int i = t8Var.f6894a + t8Var2.f6894a;
                int[] copyOf = Arrays.copyOf(t8Var.f6895b, i);
                System.arraycopy(t8Var2.f6895b, 0, copyOf, t8Var.f6894a, t8Var2.f6894a);
                Object[] copyOf2 = Arrays.copyOf(t8Var.f6896c, i);
                System.arraycopy(t8Var2.f6896c, 0, copyOf2, t8Var.f6894a, t8Var2.f6894a);
                t8Var = new C2685t8(i, copyOf, copyOf2, true);
            }
            i6Var.zzb = t8Var;
            return;
        }
        throw null;
    }
}
