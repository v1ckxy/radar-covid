package p213q.p217b.p218a.p231b.p251g.p256e;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: q.b.a.b.g.e.j7 */
public final class C2513j7<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: f */
    public static final C2513j7 f6649f;

    /* renamed from: e */
    public boolean f6650e = true;

    static {
        C2513j7 j7Var = new C2513j7();
        f6649f = j7Var;
        j7Var.f6650e = false;
    }

    public C2513j7() {
    }

    public C2513j7(Map<K, V> map) {
        super(map);
    }

    /* renamed from: a */
    public static int m6052a(Object obj) {
        if (obj instanceof byte[]) {
            return C2546l6.m6116b((byte[]) obj);
        }
        if (!(obj instanceof C2529k6)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final void mo7806b() {
        if (!this.f6650e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void clear() {
        mo7806b();
        super.clear();
    }

    public final Set<Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof java.util.Map
            r1 = 0
            if (r0 == 0) goto L_0x005d
            java.util.Map r7 = (java.util.Map) r7
            r0 = 1
            if (r6 == r7) goto L_0x0059
            int r2 = r6.size()
            int r3 = r7.size()
            if (r2 == r3) goto L_0x0016
        L_0x0014:
            r7 = r1
            goto L_0x005a
        L_0x0016:
            java.util.Set r2 = r6.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x001e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0059
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r7.containsKey(r4)
            if (r4 != 0) goto L_0x0035
            goto L_0x0014
        L_0x0035:
            java.lang.Object r4 = r3.getValue()
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r7.get(r3)
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L_0x0052
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L_0x0052
            byte[] r4 = (byte[]) r4
            byte[] r3 = (byte[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L_0x0056
        L_0x0052:
            boolean r3 = r4.equals(r3)
        L_0x0056:
            if (r3 != 0) goto L_0x001e
            goto L_0x0014
        L_0x0059:
            r7 = r0
        L_0x005a:
            if (r7 == 0) goto L_0x005d
            return r0
        L_0x005d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p251g.p256e.C2513j7.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = 0;
        for (Entry entry : entrySet()) {
            i += m6052a(entry.getValue()) ^ m6052a(entry.getKey());
        }
        return i;
    }

    public final V put(K k, V v) {
        mo7806b();
        C2546l6.m6112a(k);
        if (v != null) {
            return super.put(k, v);
        }
        throw null;
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        mo7806b();
        for (Object next : map.keySet()) {
            C2546l6.m6112a(next);
            C2546l6.m6112a(map.get(next));
        }
        super.putAll(map);
    }

    public final V remove(Object obj) {
        mo7806b();
        return super.remove(obj);
    }
}
