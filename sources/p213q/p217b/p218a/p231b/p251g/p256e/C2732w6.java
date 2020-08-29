package p213q.p217b.p218a.p231b.p251g.p256e;

import java.util.Map.Entry;

/* renamed from: q.b.a.b.g.e.w6 */
public final class C2732w6<K> implements Entry<K, Object> {

    /* renamed from: e */
    public Entry<K, C2700u6> f6941e;

    public /* synthetic */ C2732w6(Entry entry, C2683t6 t6Var) {
        this.f6941e = entry;
    }

    public final K getKey() {
        return this.f6941e.getKey();
    }

    public final Object getValue() {
        if (((C2700u6) this.f6941e.getValue()) == null) {
            return null;
        }
        C2700u6.m6464c();
        throw null;
    }

    public final Object setValue(Object obj) {
        if (obj instanceof C2619p7) {
            C2700u6 u6Var = (C2700u6) this.f6941e.getValue();
            C2619p7 p7Var = (C2619p7) obj;
            C2619p7 p7Var2 = u6Var.f6992a;
            u6Var.f6993b = null;
            u6Var.f6992a = p7Var;
            return p7Var2;
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
