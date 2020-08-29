package p003f.p004a.p005a.p108g.p109a.p110h;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import p116io.jsonwebtoken.lang.Strings;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p363c.p364a.C4402a;
import p213q.p363c.p364a.C4403b;
import p213q.p363c.p364a.C4408d;
import p213q.p363c.p364a.C4409e;
import p213q.p363c.p364a.C4410f.C4411a;
import p213q.p363c.p364a.C4414i;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.g.a.h.a */
public final class C0710a {

    /* renamed from: a */
    public static final C4403b f2167a = new C4403b(C4414i.f10520a);

    /* renamed from: b */
    public static final C0710a f2168b = null;

    /* renamed from: a */
    public static final void m1892a(Object obj) {
        if (obj != null) {
            C4403b bVar = f2167a;
            if (bVar != null) {
                bVar.f10502d.mo10708a(bVar);
                if (((C4411a) bVar.f10503e) != null) {
                    HashMap hashMap = (HashMap) C4402a.m9982a(obj);
                    for (Class cls : hashMap.keySet()) {
                        C4409e eVar = (C4409e) hashMap.get(cls);
                        C4409e eVar2 = (C4409e) bVar.f10500b.putIfAbsent(cls, eVar);
                        if (eVar2 == null) {
                            Set<C4408d> set = (Set) bVar.f10499a.get(cls);
                            if (set != null && !set.isEmpty()) {
                                for (C4408d a : set) {
                                    bVar.mo10696a(a, eVar);
                                }
                            }
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Producer method for type ");
                            sb.append(cls);
                            sb.append(" found on type ");
                            sb.append(eVar.f10515a.getClass());
                            sb.append(", but already registered by type ");
                            sb.append(eVar2.f10515a.getClass());
                            sb.append(Strings.CURRENT_PATH);
                            throw new IllegalArgumentException(sb.toString());
                        }
                    }
                    if (((C4411a) bVar.f10503e) != null) {
                        HashMap hashMap2 = (HashMap) C4402a.m9984b(obj);
                        for (Class cls2 : hashMap2.keySet()) {
                            Set set2 = (Set) bVar.f10499a.get(cls2);
                            if (set2 == null) {
                                set2 = new CopyOnWriteArraySet();
                                Set set3 = (Set) bVar.f10499a.putIfAbsent(cls2, set2);
                                if (set3 != null) {
                                    set2 = set3;
                                }
                            }
                            if (!set2.addAll((Set) hashMap2.get(cls2))) {
                                throw new IllegalArgumentException("Object already registered.");
                            }
                        }
                        for (Entry entry : hashMap2.entrySet()) {
                            C4409e eVar3 = (C4409e) bVar.f10500b.get((Class) entry.getKey());
                            if (eVar3 != null && eVar3.f10518d) {
                                for (C4408d dVar : (Set) entry.getValue()) {
                                    if (!eVar3.f10518d) {
                                        break;
                                    } else if (dVar.f10514d) {
                                        bVar.mo10696a(dVar, eVar3);
                                    }
                                }
                            }
                        }
                        return;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        C4638h.m10271a("listener");
        throw null;
    }

    /* renamed from: b */
    public static final void m1893b(Object obj) {
        String str;
        if (obj != null) {
            C4403b bVar = f2167a;
            if (bVar != null) {
                bVar.f10502d.mo10708a(bVar);
                if (((C4411a) bVar.f10503e) != null) {
                    Iterator it = ((HashMap) C4402a.m9982a(obj)).entrySet().iterator();
                    while (true) {
                        str = " registered?";
                        if (it.hasNext()) {
                            Entry entry = (Entry) it.next();
                            Class cls = (Class) entry.getKey();
                            C4409e eVar = (C4409e) bVar.f10500b.get(cls);
                            C4409e eVar2 = (C4409e) entry.getValue();
                            if (eVar2 == null || !eVar2.equals(eVar)) {
                                StringBuilder a = C1965a.m4756a("Missing event producer for an annotated method. Is ");
                                a.append(obj.getClass());
                                a.append(str);
                            } else {
                                ((C4409e) bVar.f10500b.remove(cls)).f10518d = false;
                            }
                        } else if (((C4411a) bVar.f10503e) != null) {
                            for (Entry entry2 : ((HashMap) C4402a.m9984b(obj)).entrySet()) {
                                Set<C4408d> set = (Set) bVar.f10499a.get((Class) entry2.getKey());
                                Collection collection = (Collection) entry2.getValue();
                                if (set == null || !set.containsAll(collection)) {
                                    StringBuilder a2 = C1965a.m4756a("Missing event handler for an annotated method. Is ");
                                    a2.append(obj.getClass());
                                    a2.append(str);
                                    throw new IllegalArgumentException(a2.toString());
                                }
                                for (C4408d dVar : set) {
                                    if (collection.contains(dVar)) {
                                        dVar.f10514d = false;
                                    }
                                }
                                set.removeAll(collection);
                            }
                            return;
                        } else {
                            throw null;
                        }
                    }
                    StringBuilder a3 = C1965a.m4756a("Missing event producer for an annotated method. Is ");
                    a3.append(obj.getClass());
                    a3.append(str);
                    throw new IllegalArgumentException(a3.toString());
                }
                throw null;
            }
            throw null;
        }
        C4638h.m10271a("listener");
        throw null;
    }
}
