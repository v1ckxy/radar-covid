package p124p.p143e;

import java.util.LinkedHashMap;
import java.util.Locale;

/* renamed from: p.e.f */
public class C1254f<K, V> {

    /* renamed from: a */
    public final LinkedHashMap<K, V> f3561a;

    /* renamed from: b */
    public int f3562b;

    /* renamed from: c */
    public int f3563c;

    /* renamed from: d */
    public int f3564d;

    /* renamed from: e */
    public int f3565e;

    /* renamed from: f */
    public int f3566f;

    /* renamed from: g */
    public int f3567g;

    public C1254f(int i) {
        if (i > 0) {
            this.f3563c = i;
            this.f3561a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* renamed from: a */
    public final V mo5525a(K k) {
        if (k != null) {
            synchronized (this) {
                V v = this.f3561a.get(k);
                if (v != null) {
                    this.f3566f++;
                    return v;
                }
                this.f3567g++;
                return null;
            }
        }
        throw new NullPointerException("key == null");
    }

    /* renamed from: a */
    public final V mo5526a(K k, V v) {
        V put;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f3564d++;
            this.f3562b++;
            put = this.f3561a.put(k, v);
            if (put != null) {
                this.f3562b--;
            }
        }
        mo5527a(this.f3563c);
        return put;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0068, code lost:
        throw new java.lang.IllegalStateException(r0.toString());
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5527a(int r3) {
        /*
            r2 = this;
        L_0x0000:
            monitor-enter(r2)
            int r0 = r2.f3562b     // Catch:{ all -> 0x0069 }
            if (r0 < 0) goto L_0x004a
            java.util.LinkedHashMap<K, V> r0 = r2.f3561a     // Catch:{ all -> 0x0069 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0069 }
            if (r0 == 0) goto L_0x0011
            int r0 = r2.f3562b     // Catch:{ all -> 0x0069 }
            if (r0 != 0) goto L_0x004a
        L_0x0011:
            int r0 = r2.f3562b     // Catch:{ all -> 0x0069 }
            if (r0 <= r3) goto L_0x0048
            java.util.LinkedHashMap<K, V> r0 = r2.f3561a     // Catch:{ all -> 0x0069 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0069 }
            if (r0 == 0) goto L_0x001e
            goto L_0x0048
        L_0x001e:
            java.util.LinkedHashMap<K, V> r0 = r2.f3561a     // Catch:{ all -> 0x0069 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0069 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0069 }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x0069 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0069 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x0069 }
            r0.getValue()     // Catch:{ all -> 0x0069 }
            java.util.LinkedHashMap<K, V> r0 = r2.f3561a     // Catch:{ all -> 0x0069 }
            r0.remove(r1)     // Catch:{ all -> 0x0069 }
            int r0 = r2.f3562b     // Catch:{ all -> 0x0069 }
            int r0 = r0 + -1
            r2.f3562b = r0     // Catch:{ all -> 0x0069 }
            int r0 = r2.f3565e     // Catch:{ all -> 0x0069 }
            int r0 = r0 + 1
            r2.f3565e = r0     // Catch:{ all -> 0x0069 }
            monitor-exit(r2)     // Catch:{ all -> 0x0069 }
            goto L_0x0000
        L_0x0048:
            monitor-exit(r2)     // Catch:{ all -> 0x0069 }
            return
        L_0x004a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0069 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0069 }
            r0.<init>()     // Catch:{ all -> 0x0069 }
            java.lang.Class r1 = r2.getClass()     // Catch:{ all -> 0x0069 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0069 }
            r0.append(r1)     // Catch:{ all -> 0x0069 }
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch:{ all -> 0x0069 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0069 }
            r3.<init>(r0)     // Catch:{ all -> 0x0069 }
            throw r3     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0069 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p143e.C1254f.mo5527a(int):void");
    }

    public final synchronized String toString() {
        int i;
        i = this.f3566f + this.f3567g;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.f3563c), Integer.valueOf(this.f3566f), Integer.valueOf(this.f3567g), Integer.valueOf(i != 0 ? (this.f3566f * 100) / i : 0)});
    }
}
