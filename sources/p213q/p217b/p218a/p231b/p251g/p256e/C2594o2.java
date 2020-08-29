package p213q.p217b.p218a.p231b.p251g.p256e;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.Set;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;

/* renamed from: q.b.a.b.g.e.o2 */
public final class C2594o2 {

    /* renamed from: a */
    public static final C2663s2<C2713v3<String, String>> f6758a = C2286e.m5208a(C2577n2.f6740e);

    /* renamed from: a */
    public static final /* synthetic */ C2713v3 m6199a() {
        Set<Entry> entrySet = new C2696u3().f6858a.entrySet();
        if (entrySet.isEmpty()) {
            return C2509j3.f6639f;
        }
        Object[] objArr = new Object[(entrySet.size() * 2)];
        int i = 0;
        int i2 = 0;
        for (Entry entry : entrySet) {
            Object key = entry.getKey();
            C2648r3 a = C2648r3.m6345a((Collection) entry.getValue());
            if (!a.isEmpty()) {
                int i3 = i + 1;
                int i4 = i3 << 1;
                if (i4 > objArr.length) {
                    int length = objArr.length;
                    if (i4 >= 0) {
                        int i5 = length + (length >> 1) + 1;
                        if (i5 < i4) {
                            i5 = Integer.highestOneBit(i4 - 1) << 1;
                        }
                        if (i5 < 0) {
                            i5 = Integer.MAX_VALUE;
                        }
                        objArr = Arrays.copyOf(objArr, i5);
                    } else {
                        throw new AssertionError("cannot store more than MAX_VALUE elements");
                    }
                }
                C2286e.m5238a(key, (Object) a);
                int i6 = i * 2;
                objArr[i6] = key;
                objArr[i6 + 1] = a;
                i2 += a.size();
                i = i3;
            }
        }
        return new C2713v3(C2382c4.m5597a(i, objArr), i2, null);
    }
}
