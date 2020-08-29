package p213q.p217b.p218a.p231b.p251g.p256e;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: q.b.a.b.g.e.h8 */
public class C2475h8<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: e */
    public final int f6575e;

    /* renamed from: f */
    public List<C2600o8> f6576f = Collections.emptyList();

    /* renamed from: g */
    public Map<K, V> f6577g = Collections.emptyMap();

    /* renamed from: h */
    public boolean f6578h;

    /* renamed from: i */
    public volatile C2637q8 f6579i;

    /* renamed from: j */
    public Map<K, V> f6580j = Collections.emptyMap();

    public /* synthetic */ C2475h8(int i, C2514j8 j8Var) {
        this.f6575e = i;
    }

    /* renamed from: c */
    public static <FieldDescriptorType extends C2778z5<FieldDescriptorType>> C2475h8<FieldDescriptorType, Object> m5903c(int i) {
        return new C2514j8(i);
    }

    /* renamed from: a */
    public final int mo7706a(K k) {
        int size = this.f6576f.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo(((C2600o8) this.f6576f.get(size)).f6764e);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo(((C2600o8) this.f6576f.get(i2)).f6764e);
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: a */
    public final Entry<K, V> mo7708a(int i) {
        return (Entry) this.f6576f.get(i);
    }

    /* renamed from: a */
    public void mo7709a() {
        if (!this.f6578h) {
            this.f6577g = this.f6577g.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f6577g);
            this.f6580j = this.f6580j.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f6580j);
            this.f6578h = true;
        }
    }

    /* renamed from: b */
    public final int mo7710b() {
        return this.f6576f.size();
    }

    /* renamed from: b */
    public final V mo7711b(int i) {
        mo7715d();
        V v = ((C2600o8) this.f6576f.remove(i)).f6765f;
        if (!this.f6577g.isEmpty()) {
            Iterator it = mo7716e().entrySet().iterator();
            this.f6576f.add(new C2600o8(this, (Entry) it.next()));
            it.remove();
        }
        return v;
    }

    /* renamed from: c */
    public final Iterable<Entry<K, V>> mo7712c() {
        if (this.f6577g.isEmpty()) {
            return C2531k8.f6688b;
        }
        return this.f6577g.entrySet();
    }

    public void clear() {
        mo7715d();
        if (!this.f6576f.isEmpty()) {
            this.f6576f.clear();
        }
        if (!this.f6577g.isEmpty()) {
            this.f6577g.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return mo7706a((K) comparable) >= 0 || this.f6577g.containsKey(comparable);
    }

    /* renamed from: d */
    public final void mo7715d() {
        if (this.f6578h) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: e */
    public final SortedMap<K, V> mo7716e() {
        mo7715d();
        if (this.f6577g.isEmpty() && !(this.f6577g instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f6577g = treeMap;
            this.f6580j = treeMap.descendingMap();
        }
        return (SortedMap) this.f6577g;
    }

    public Set<Entry<K, V>> entrySet() {
        if (this.f6579i == null) {
            this.f6579i = new C2637q8(this, null);
        }
        return this.f6579i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2475h8)) {
            return super.equals(obj);
        }
        C2475h8 h8Var = (C2475h8) obj;
        int size = size();
        if (size != h8Var.size()) {
            return false;
        }
        int b = mo7710b();
        if (b != h8Var.mo7710b()) {
            return entrySet().equals(h8Var.entrySet());
        }
        for (int i = 0; i < b; i++) {
            if (!mo7708a(i).equals(h8Var.mo7708a(i))) {
                return false;
            }
        }
        if (b != size) {
            return this.f6577g.equals(h8Var.f6577g);
        }
        return true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = mo7706a((K) comparable);
        if (a >= 0) {
            return ((C2600o8) this.f6576f.get(a)).f6765f;
        }
        return this.f6577g.get(comparable);
    }

    public int hashCode() {
        int i = 0;
        for (int i2 = 0; i2 < mo7710b(); i2++) {
            i += ((C2600o8) this.f6576f.get(i2)).hashCode();
        }
        return this.f6577g.size() > 0 ? i + this.f6577g.hashCode() : i;
    }

    public V remove(Object obj) {
        mo7715d();
        Comparable comparable = (Comparable) obj;
        int a = mo7706a((K) comparable);
        if (a >= 0) {
            return mo7711b(a);
        }
        if (this.f6577g.isEmpty()) {
            return null;
        }
        return this.f6577g.remove(comparable);
    }

    public int size() {
        return this.f6577g.size() + this.f6576f.size();
    }

    /* renamed from: a */
    public final V put(K k, V v) {
        mo7715d();
        int a = mo7706a(k);
        if (a >= 0) {
            C2600o8 o8Var = (C2600o8) this.f6576f.get(a);
            o8Var.f6766g.mo7715d();
            V v2 = o8Var.f6765f;
            o8Var.f6765f = v;
            return v2;
        }
        mo7715d();
        if (this.f6576f.isEmpty() && !(this.f6576f instanceof ArrayList)) {
            this.f6576f = new ArrayList(this.f6575e);
        }
        int i = -(a + 1);
        if (i >= this.f6575e) {
            return mo7716e().put(k, v);
        }
        int size = this.f6576f.size();
        int i2 = this.f6575e;
        if (size == i2) {
            C2600o8 o8Var2 = (C2600o8) this.f6576f.remove(i2 - 1);
            mo7716e().put(o8Var2.f6764e, o8Var2.f6765f);
        }
        this.f6576f.add(i, new C2600o8(this, k, v));
        return null;
    }
}
