package p213q.p217b.p218a.p231b.p251g.p256e;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;

/* renamed from: q.b.a.b.g.e.k3 */
public abstract class C2526k3<E> extends C2543l3<E> implements List<E>, RandomAccess {

    /* renamed from: f */
    public static final C2561m4<Object> f6681f = new C2578n3(C2399d4.f6437i, 0);

    /* renamed from: a */
    public static <E> C2526k3<E> m6071a() {
        return C2399d4.f6437i;
    }

    /* renamed from: a */
    public static <E> C2526k3<E> m6072a(E e) {
        Object[] objArr = {e};
        for (int i = 0; i < 1; i++) {
            C2286e.m5180a(objArr[i], i);
        }
        return m6074b(objArr, 1);
    }

    /* renamed from: a */
    public static <E> C2526k3<E> m6073a(Object[] objArr) {
        return m6074b(objArr, objArr.length);
    }

    /* renamed from: b */
    public static <E> C2526k3<E> m6074b(Object[] objArr, int i) {
        return i == 0 ? C2399d4.f6437i : new C2399d4(objArr, i);
    }

    /* renamed from: a */
    public int mo7499a(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    /* renamed from: a */
    public C2526k3<E> subList(int i, int i2) {
        C2286e.m5226a(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? C2399d4.f6437i : new C2613p3(this, i, i3);
    }

    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final C2579n4<E> iterator() {
        return (C2561m4) listIterator();
    }

    public boolean contains(@NullableDecl Object obj) {
        return indexOf(obj) >= 0;
    }

    /* renamed from: d */
    public C2526k3<E> mo7822d() {
        return size() <= 1 ? this : new C2560m3(this);
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    int i = 0;
                    while (i < size) {
                        if (C2286e.m5238a(get(i), list.get(i))) {
                            i++;
                        }
                    }
                    return true;
                }
                int size2 = size();
                Iterator it = list.iterator();
                int i2 = 0;
                while (true) {
                    if (i2 < size2) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object obj2 = get(i2);
                        i2++;
                        if (!C2286e.m5238a(obj2, it.next())) {
                            break;
                        }
                    } else if (!it.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
        }
        return i;
    }

    public int indexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public /* synthetic */ ListIterator listIterator() {
        return (C2561m4) listIterator(0);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [q.b.a.b.g.e.n3, java.util.ListIterator] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v2, types: [q.b.a.b.g.e.n3, java.util.ListIterator]
      assigns: [q.b.a.b.g.e.n3]
      uses: [java.util.ListIterator]
      mth insns count: 8
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
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ java.util.ListIterator listIterator(int r2) {
        /*
            r1 = this;
            int r0 = r1.size()
            p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5319d(r2, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0010
            q.b.a.b.g.e.m4<java.lang.Object> r2 = f6681f
            return r2
        L_0x0010:
            q.b.a.b.g.e.n3 r0 = new q.b.a.b.g.e.n3
            r0.<init>(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p251g.p256e.C2526k3.listIterator(int):java.util.ListIterator");
    }

    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }
}
