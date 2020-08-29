package p213q.p217b.p317d.p321g;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Executor;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p317d.p345j.C4208c;
import p213q.p217b.p317d.p345j.C4209d;
import p213q.p217b.p317d.p349m.C4274a;

/* renamed from: q.b.d.g.m */
public class C3895m extends C3881a {

    /* renamed from: e */
    public static final C4274a<Set<Object>> f9517e = C3894l.f9516a;

    /* renamed from: a */
    public final Map<C3884d<?>, C3904v<?>> f9518a = new HashMap();

    /* renamed from: b */
    public final Map<Class<?>, C3904v<?>> f9519b = new HashMap();

    /* renamed from: c */
    public final Map<Class<?>, C3904v<Set<?>>> f9520c = new HashMap();

    /* renamed from: d */
    public final C3903u f9521d;

    public C3895m(Executor executor, Iterable<C3891i> iterable, C3884d<?>... dVarArr) {
        this.f9521d = new C3903u(executor);
        ArrayList arrayList = new ArrayList();
        arrayList.add(C3884d.m9272a(this.f9521d, C3903u.class, C4209d.class, C4208c.class));
        for (C3891i components : iterable) {
            arrayList.addAll(components.getComponents());
        }
        for (C3884d<?> dVar : dVarArr) {
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        HashMap hashMap = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C3884d dVar2 = (C3884d) it.next();
            C3897o oVar = new C3897o(dVar2);
            Iterator it2 = dVar2.f9500a.iterator();
            while (true) {
                if (it2.hasNext()) {
                    Class cls = (Class) it2.next();
                    C3898p pVar = new C3898p(cls, !dVar2.mo10077a(), null);
                    if (!hashMap.containsKey(pVar)) {
                        hashMap.put(pVar, new HashSet());
                    }
                    Set set = (Set) hashMap.get(pVar);
                    if (set.isEmpty() || pVar.f9526b) {
                        set.add(oVar);
                    } else {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", new Object[]{cls}));
                    }
                }
            }
        }
        for (Set<C3897o> it3 : hashMap.values()) {
            for (C3897o oVar2 : it3) {
                for (C3899q qVar : oVar2.f9522a.f9501b) {
                    if (qVar.f9529c == 0) {
                        Set<C3897o> set2 = (Set) hashMap.get(new C3898p(qVar.f9527a, qVar.mo10088a(), null));
                        if (set2 != null) {
                            for (C3897o oVar3 : set2) {
                                oVar2.f9523b.add(oVar3);
                                oVar3.f9524c.add(oVar2);
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Set addAll : hashMap.values()) {
            hashSet.addAll(addAll);
        }
        HashSet hashSet2 = new HashSet();
        Iterator it4 = hashSet.iterator();
        while (it4.hasNext()) {
            C3897o oVar4 = (C3897o) it4.next();
            if (oVar4.mo10085a()) {
                hashSet2.add(oVar4);
            }
        }
        int i = 0;
        while (!hashSet2.isEmpty()) {
            C3897o oVar5 = (C3897o) hashSet2.iterator().next();
            hashSet2.remove(oVar5);
            i++;
            for (C3897o oVar6 : oVar5.f9523b) {
                oVar6.f9524c.remove(oVar5);
                if (oVar6.mo10085a()) {
                    hashSet2.add(oVar6);
                }
            }
        }
        if (i == arrayList.size()) {
            Iterator it5 = arrayList.iterator();
            while (it5.hasNext()) {
                C3884d dVar3 = (C3884d) it5.next();
                this.f9518a.put(dVar3, new C3904v(new C3892j(this, dVar3)));
            }
            for (Entry entry : this.f9518a.entrySet()) {
                C3884d dVar4 = (C3884d) entry.getKey();
                if (dVar4.mo10077a()) {
                    C3904v vVar = (C3904v) entry.getValue();
                    for (Class put : dVar4.f9500a) {
                        this.f9519b.put(put, vVar);
                    }
                }
            }
            for (C3884d dVar5 : this.f9518a.keySet()) {
                Iterator it6 = dVar5.f9501b.iterator();
                while (true) {
                    if (it6.hasNext()) {
                        C3899q qVar2 = (C3899q) it6.next();
                        if ((qVar2.f9528b == 1) && !this.f9519b.containsKey(qVar2.f9527a)) {
                            throw new C3905w(String.format("Unsatisfied dependency for component %s: %s", new Object[]{dVar5, qVar2.f9527a}));
                        }
                    }
                }
            }
            HashMap hashMap2 = new HashMap();
            for (Entry entry2 : this.f9518a.entrySet()) {
                C3884d dVar6 = (C3884d) entry2.getKey();
                if (!dVar6.mo10077a()) {
                    C3904v vVar2 = (C3904v) entry2.getValue();
                    for (Class cls2 : dVar6.f9500a) {
                        if (!hashMap2.containsKey(cls2)) {
                            hashMap2.put(cls2, new HashSet());
                        }
                        ((Set) hashMap2.get(cls2)).add(vVar2);
                    }
                }
            }
            for (Entry entry3 : hashMap2.entrySet()) {
                this.f9520c.put((Class) entry3.getKey(), new C3904v(new C3893k((Set) entry3.getValue())));
            }
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it7 = hashSet.iterator();
        while (it7.hasNext()) {
            C3897o oVar7 = (C3897o) it7.next();
            if (!oVar7.mo10085a() && !oVar7.f9523b.isEmpty()) {
                arrayList2.add(oVar7.f9522a);
            }
        }
        throw new C3900r(arrayList2);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.Set, code=java.util.Set<q.b.d.g.v>, for r2v0, types: [java.util.Set<q.b.d.g.v>, java.util.Set] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.util.Set m9284a(java.util.Set<p213q.p217b.p317d.p321g.C3904v> r2) {
        /*
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0009:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x001d
            java.lang.Object r1 = r2.next()
            q.b.d.g.v r1 = (p213q.p217b.p317d.p321g.C3904v) r1
            java.lang.Object r1 = r1.get()
            r0.add(r1)
            goto L_0x0009
        L_0x001d:
            java.util.Set r2 = java.util.Collections.unmodifiableSet(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p317d.p321g.C3895m.m9284a(java.util.Set):java.util.Set");
    }

    /* renamed from: c */
    public <T> C4274a<T> mo10083c(Class<T> cls) {
        C2286e.m5181a(cls, "Null interface requested.");
        return (C4274a) this.f9519b.get(cls);
    }

    /* renamed from: d */
    public <T> C4274a<Set<T>> mo10084d(Class<T> cls) {
        C3904v vVar = (C3904v) this.f9520c.get(cls);
        return vVar != null ? vVar : f9517e;
    }
}
