package p213q.p217b.p218a.p231b.p251g.p256e;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;

/* renamed from: q.b.a.b.g.e.w3 */
public abstract class C2729w3<E> extends C2729w3<E> implements C2544l4<E>, NavigableSet<E> {

    /* renamed from: g */
    public final transient Comparator<? super E> f6939g;

    /* renamed from: h */
    public transient C2729w3<E> f6940h;

    public C2729w3(Comparator<? super E> comparator) {
        this.f6939g = comparator;
    }

    /* renamed from: a */
    public static <E> C2488i4<E> m6510a(Comparator<? super E> comparator) {
        if (C2776z3.f7006e.equals(comparator)) {
            return C2488i4.f6615j;
        }
        return new C2488i4<>(C2399d4.f6437i, comparator);
    }

    public E ceiling(E e) {
        return C2286e.m5280b(((C2729w3) tailSet(e, true)).iterator());
    }

    public Comparator<? super E> comparator() {
        return this.f6939g;
    }

    public /* synthetic */ Iterator descendingIterator() {
        return ((C2488i4) this).f6616i.mo7822d().iterator();
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.util.AbstractCollection, q.b.a.b.g.e.w3, q.b.a.b.g.e.i4] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v3, types: [java.util.AbstractCollection, q.b.a.b.g.e.w3, q.b.a.b.g.e.i4]
      assigns: [q.b.a.b.g.e.i4]
      uses: [q.b.a.b.g.e.w3, java.util.AbstractCollection, q.b.a.b.g.e.i4]
      mth insns count: 16
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
    public /* synthetic */ java.util.NavigableSet descendingSet() {
        /*
            r3 = this;
            q.b.a.b.g.e.w3<E> r0 = r3.f6940h
            if (r0 != 0) goto L_0x0028
            r0 = r3
            q.b.a.b.g.e.i4 r0 = (p213q.p217b.p218a.p231b.p251g.p256e.C2488i4) r0
            java.util.Comparator<? super E> r1 = r0.f6939g
            java.util.Comparator r1 = java.util.Collections.reverseOrder(r1)
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x0018
            q.b.a.b.g.e.i4 r0 = m6510a(r1)
            goto L_0x0024
        L_0x0018:
            q.b.a.b.g.e.i4 r2 = new q.b.a.b.g.e.i4
            q.b.a.b.g.e.k3<E> r0 = r0.f6616i
            q.b.a.b.g.e.k3 r0 = r0.mo7822d()
            r2.<init>(r0, r1)
            r0 = r2
        L_0x0024:
            r3.f6940h = r0
            r0.f6940h = r3
        L_0x0028:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p251g.p256e.C2729w3.descendingSet():java.util.NavigableSet");
    }

    public E first() {
        return ((C2488i4) this).iterator().next();
    }

    public E floor(E e) {
        return C2286e.m5280b((Iterator) (C2579n4) ((C2729w3) headSet(e, true)).descendingIterator());
    }

    public /* synthetic */ NavigableSet headSet(Object obj, boolean z) {
        if (obj != null) {
            C2488i4 i4Var = (C2488i4) this;
            return i4Var.mo7742a(0, i4Var.mo7740a(obj, z));
        }
        throw null;
    }

    public /* synthetic */ SortedSet headSet(Object obj) {
        return (C2729w3) headSet(obj, false);
    }

    public E higher(E e) {
        return C2286e.m5280b(((C2729w3) tailSet(e, false)).iterator());
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [q.b.a.b.g.e.w3, q.b.a.b.g.e.l3] */
    public /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public E last() {
        return ((C2579n4) descendingIterator()).next();
    }

    public E lower(E e) {
        return C2286e.m5280b((Iterator) (C2579n4) ((C2729w3) headSet(e, false)).descendingIterator());
    }

    @Deprecated
    public final E pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E pollLast() {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        if (obj == null) {
            throw null;
        } else if (obj2 != null) {
            if (this.f6939g.compare(obj, obj2) <= 0) {
                C2488i4 i4Var = (C2488i4) this;
                C2488i4 a = i4Var.mo7742a(i4Var.mo7743b(obj, z), i4Var.size());
                return a.mo7742a(0, a.mo7740a(obj2, z2));
            }
            throw new IllegalArgumentException();
        } else {
            throw null;
        }
    }

    public /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return (C2729w3) subSet(obj, true, obj2, false);
    }

    public /* synthetic */ NavigableSet tailSet(Object obj, boolean z) {
        if (obj != null) {
            C2488i4 i4Var = (C2488i4) this;
            return i4Var.mo7742a(i4Var.mo7743b(obj, z), i4Var.size());
        }
        throw null;
    }

    public /* synthetic */ SortedSet tailSet(Object obj) {
        return (C2729w3) tailSet(obj, true);
    }
}
