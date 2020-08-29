package p213q.p217b.p218a.p219a.p222f.p230u;

import android.util.SparseArray;
import java.util.EnumMap;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p219a.C1967b;

/* renamed from: q.b.a.a.f.u.a */
public final class C2104a {

    /* renamed from: a */
    public static SparseArray<C1967b> f5950a = new SparseArray<>();

    /* renamed from: b */
    public static EnumMap<C1967b, Integer> f5951b;

    static {
        EnumMap<C1967b, Integer> enumMap = new EnumMap<>(C1967b.class);
        f5951b = enumMap;
        enumMap.put(C1967b.DEFAULT, Integer.valueOf(0));
        f5951b.put(C1967b.VERY_LOW, Integer.valueOf(1));
        f5951b.put(C1967b.HIGHEST, Integer.valueOf(2));
        for (C1967b bVar : f5951b.keySet()) {
            f5950a.append(((Integer) f5951b.get(bVar)).intValue(), bVar);
        }
    }

    /* renamed from: a */
    public static int m4891a(C1967b bVar) {
        Integer num = (Integer) f5951b.get(bVar);
        if (num != null) {
            return num.intValue();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("PriorityMapping is missing known Priority value ");
        sb.append(bVar);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public static C1967b m4892a(int i) {
        C1967b bVar = (C1967b) f5950a.get(i);
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalArgumentException(C1965a.m4761b("Unknown Priority for value ", i));
    }
}
