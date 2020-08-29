package p213q.p217b.p218a.p231b.p251g.p256e;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;

/* renamed from: q.b.a.b.g.e.r3 */
public abstract class C2648r3<E> extends C2543l3<E> implements Set<E> {
    @NullableDecl

    /* renamed from: f */
    public transient C2526k3<E> f6832f;

    /* renamed from: a */
    public static int m6344a(int i) {
        int max = Math.max(i, 2);
        boolean z = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (((double) highestOneBit) * 0.7d < ((double) max)) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z = false;
        }
        if (z) {
            return 1073741824;
        }
        throw new IllegalArgumentException("collection too large");
    }

    /* renamed from: a */
    public static <E> C2648r3<E> m6345a(Collection<? extends E> collection) {
        if ((collection instanceof C2648r3) && !(collection instanceof SortedSet)) {
            C2648r3<E> r3Var = (C2648r3) collection;
            if (!r3Var.mo7503g()) {
                return r3Var;
            }
        }
        Object[] array = collection.toArray();
        int length = array.length;
        while (length != 0) {
            if (length == 1) {
                return new C2527k4(array[0]);
            }
            int a = m6344a(length);
            Object[] objArr = new Object[a];
            int i = a - 1;
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                Object obj = array[i4];
                C2286e.m5180a(obj, i4);
                int hashCode = obj.hashCode();
                int h = C2286e.m5346h(hashCode);
                while (true) {
                    int i5 = h & i;
                    Object obj2 = objArr[i5];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            break;
                        }
                        h++;
                    } else {
                        int i6 = i3 + 1;
                        array[i3] = obj;
                        objArr[i5] = obj;
                        i2 += hashCode;
                        i3 = i6;
                        break;
                    }
                }
            }
            Arrays.fill(array, i3, length, null);
            if (i3 == 1) {
                return new C2527k4(array[0], i2);
            }
            if (m6344a(i3) < a / 2) {
                length = i3;
            } else {
                int length2 = array.length;
                if (i3 < (length2 >> 1) + (length2 >> 2)) {
                    array = Arrays.copyOf(array, i3);
                }
                C2510j4 j4Var = new C2510j4(array, i2, objArr, i, i3);
                return j4Var;
            }
        }
        return C2510j4.f6640l;
    }

    /* renamed from: a */
    public boolean mo7790a() {
        return false;
    }

    /* renamed from: d */
    public C2526k3<E> mo7636d() {
        return C2526k3.m6073a(toArray());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003a, code lost:
        if (containsAll(r5) != false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof p213q.p217b.p218a.p231b.p251g.p256e.C2648r3
            r2 = 0
            if (r1 == 0) goto L_0x0023
            boolean r1 = r4.mo7790a()
            if (r1 == 0) goto L_0x0023
            r1 = r5
            q.b.a.b.g.e.r3 r1 = (p213q.p217b.p218a.p231b.p251g.p256e.C2648r3) r1
            boolean r1 = r1.mo7790a()
            if (r1 == 0) goto L_0x0023
            int r1 = r4.hashCode()
            int r3 = r5.hashCode()
            if (r1 == r3) goto L_0x0023
            return r2
        L_0x0023:
            if (r4 != r5) goto L_0x0026
            goto L_0x003e
        L_0x0026:
            boolean r1 = r5 instanceof java.util.Set
            if (r1 == 0) goto L_0x003d
            java.util.Set r5 = (java.util.Set) r5
            int r1 = r4.size()     // Catch:{ ClassCastException | NullPointerException -> 0x003d }
            int r3 = r5.size()     // Catch:{ ClassCastException | NullPointerException -> 0x003d }
            if (r1 != r3) goto L_0x003d
            boolean r5 = r4.containsAll(r5)     // Catch:{ ClassCastException | NullPointerException -> 0x003d }
            if (r5 == 0) goto L_0x003d
            goto L_0x003e
        L_0x003d:
            r0 = r2
        L_0x003e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p251g.p256e.C2648r3.equals(java.lang.Object):boolean");
    }

    /* renamed from: h */
    public C2526k3<E> mo7702h() {
        C2526k3<E> k3Var = this.f6832f;
        if (k3Var != null) {
            return k3Var;
        }
        C2526k3<E> d = mo7636d();
        this.f6832f = d;
        return d;
    }

    public int hashCode() {
        return C2286e.m5159a((Set<?>) this);
    }

    public /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
