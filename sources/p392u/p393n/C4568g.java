package p392u.p393n;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p392u.C4553f;
import p392u.C4557i;
import p392u.p401r.p402b.C4618l;
import p392u.p401r.p403c.C4638h;

/* renamed from: u.n.g */
public class C4568g extends C4566e {
    /* renamed from: a */
    public static final <T, A extends Appendable> A m10213a(Iterable<? extends T> iterable, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C4618l<? super T, ? extends CharSequence> lVar) {
        if (iterable == null) {
            C4638h.m10271a("$this$joinTo");
            throw null;
        } else if (a == null) {
            C4638h.m10271a("buffer");
            throw null;
        } else if (charSequence == null) {
            C4638h.m10271a("separator");
            throw null;
        } else if (charSequence2 == null) {
            C4638h.m10271a("prefix");
            throw null;
        } else if (charSequence3 == null) {
            C4638h.m10271a("postfix");
            throw null;
        } else if (charSequence4 != null) {
            a.append(charSequence2);
            int i2 = 0;
            for (Object next : iterable) {
                i2++;
                if (i2 > 1) {
                    a.append(charSequence);
                }
                if (i >= 0 && i2 > i) {
                    break;
                }
                C2286e.m5236a((Appendable) a, next, lVar);
            }
            if (i >= 0 && i2 > i) {
                a.append(charSequence4);
            }
            a.append(charSequence3);
            return a;
        } else {
            C4638h.m10271a("truncated");
            throw null;
        }
    }

    /* renamed from: b */
    public static final <T> List<T> m10220b(Iterable<? extends T> iterable) {
        if (iterable == null) {
            C4638h.m10271a("$this$toMutableList");
            throw null;
        } else if (iterable instanceof Collection) {
            return m10217a((Collection) iterable);
        } else {
            ArrayList arrayList = new ArrayList();
            m10214a(iterable, (C) arrayList);
            return arrayList;
        }
    }

    /* renamed from: c */
    public static final <T> Set<T> m10221c(Iterable<? extends T> iterable) {
        Set<T> set;
        if (iterable != null) {
            String str = "java.util.Collections.singleton(element)";
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                int size = collection.size();
                if (size == 0) {
                    set = C4572k.f10781e;
                } else if (size != 1) {
                    set = new LinkedHashSet<>(C2286e.m5318d(collection.size()));
                    m10214a(iterable, (C) set);
                } else {
                    Set<T> singleton = Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
                    C4638h.m10270a((Object) singleton, str);
                    set = singleton;
                }
                return set;
            }
            Set<T> linkedHashSet = new LinkedHashSet<>();
            m10214a(iterable, (C) linkedHashSet);
            int size2 = linkedHashSet.size();
            if (size2 == 0) {
                linkedHashSet = C4572k.f10781e;
            } else if (size2 == 1) {
                linkedHashSet = Collections.singleton(linkedHashSet.iterator().next());
                C4638h.m10270a((Object) linkedHashSet, str);
            }
            return linkedHashSet;
        }
        C4638h.m10271a("$this$toSet");
        throw null;
    }

    /* renamed from: a */
    public static final <T> List<T> m10218a(Collection<? extends T> collection, Iterable<? extends T> iterable) {
        if (collection == null) {
            C4638h.m10271a("$this$plus");
            throw null;
        } else if (iterable == null) {
            C4638h.m10271a("elements");
            throw null;
        } else if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection2.size() + collection.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        } else {
            ArrayList arrayList2 = new ArrayList(collection);
            C2286e.m5263a((Collection<? super T>) arrayList2, iterable);
            return arrayList2;
        }
    }

    /* renamed from: a */
    public static final <T> List<T> m10216a(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        if (iterable == null) {
            C4638h.m10271a("$this$sortedWith");
            throw null;
        } else if (comparator == null) {
            C4638h.m10271a("comparator");
            throw null;
        } else if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return m10215a(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            if (array != null) {
                C2286e.m5255a((T[]) array, comparator);
                return C2286e.m5204a((T[]) array);
            }
            throw new C4557i("null cannot be cast to non-null type kotlin.Array<T>");
        } else {
            List<T> b = m10220b(iterable);
            if (b != null) {
                if (b.size() > 1) {
                    Collections.sort(b, comparator);
                }
                return b;
            }
            C4638h.m10271a("$this$sortWith");
            throw null;
        }
    }

    /* renamed from: a */
    public static final <T, C extends Collection<? super T>> C m10214a(Iterable<? extends T> iterable, C c) {
        if (iterable == null) {
            C4638h.m10271a("$this$toCollection");
            throw null;
        } else if (c != null) {
            for (Object add : iterable) {
                c.add(add);
            }
            return c;
        } else {
            C4638h.m10271a("destination");
            throw null;
        }
    }

    /* renamed from: a */
    public static final <T> List<T> m10215a(Iterable<? extends T> iterable) {
        List<T> list;
        if (iterable == null) {
            C4638h.m10271a("$this$toList");
            throw null;
        } else if (!(iterable instanceof Collection)) {
            return C2286e.m5202a(m10220b(iterable));
        } else {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                list = C4570i.f10779e;
            } else if (size != 1) {
                list = m10217a(collection);
            } else {
                list = C2286e.m5332e(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
            }
            return list;
        }
    }

    /* renamed from: a */
    public static final <K, V, M extends Map<? super K, ? super V>> M m10219a(Iterable<? extends C4553f<? extends K, ? extends V>> iterable, M m) {
        if (iterable == null) {
            C4638h.m10271a("$this$toMap");
            throw null;
        } else if (m != null) {
            for (C4553f fVar : iterable) {
                m.put(fVar.f10766e, fVar.f10767f);
            }
            return m;
        } else {
            C4638h.m10271a("destination");
            throw null;
        }
    }

    /* renamed from: a */
    public static final <T> List<T> m10217a(Collection<? extends T> collection) {
        if (collection != null) {
            return new ArrayList(collection);
        }
        C4638h.m10271a("$this$toMutableList");
        throw null;
    }
}
