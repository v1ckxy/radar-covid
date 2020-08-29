package p124p.p148g.p149d;

import java.util.ArrayList;
import java.util.HashSet;
import p124p.p143e.C1261h;
import p124p.p150h.p161k.C1384d;

/* renamed from: p.g.d.a */
public final class C1304a<T> {

    /* renamed from: a */
    public final C1384d<ArrayList<T>> f3931a = new C1384d<>(10);

    /* renamed from: b */
    public final C1261h<T, ArrayList<T>> f3932b = new C1261h<>();

    /* renamed from: c */
    public final ArrayList<T> f3933c = new ArrayList<>();

    /* renamed from: d */
    public final HashSet<T> f3934d = new HashSet<>();

    /* renamed from: a */
    public void mo5770a(T t) {
        if (!(this.f3932b.mo5587a((Object) t) >= 0)) {
            this.f3932b.put(t, null);
        }
    }

    /* renamed from: a */
    public final void mo5771a(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t)) {
            if (!hashSet.contains(t)) {
                hashSet.add(t);
                ArrayList arrayList2 = (ArrayList) this.f3932b.getOrDefault(t, null);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        mo5771a(arrayList2.get(i), arrayList, hashSet);
                    }
                }
                hashSet.remove(t);
                arrayList.add(t);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }
}
