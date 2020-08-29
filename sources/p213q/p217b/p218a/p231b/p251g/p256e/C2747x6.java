package p213q.p217b.p218a.p231b.p251g.p256e;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: q.b.a.b.g.e.x6 */
public final class C2747x6 extends C2345a5<String> implements C2347a7, RandomAccess {

    /* renamed from: g */
    public static final C2747x6 f6961g;

    /* renamed from: f */
    public final List<Object> f6962f;

    static {
        C2747x6 x6Var = new C2747x6(10);
        f6961g = x6Var;
        x6Var.f6313e = false;
    }

    public C2747x6(int i) {
        this.f6962f = new ArrayList(i);
    }

    public C2747x6(ArrayList<Object> arrayList) {
        this.f6962f = arrayList;
    }

    /* renamed from: a */
    public static String m6539a(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof C2435f5 ? ((C2435f5) obj).mo7642b() : C2546l6.m6115a((byte[]) obj);
    }

    /* renamed from: a */
    public final /* synthetic */ C2635q6 mo7414a(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f6962f);
            return new C2747x6(arrayList);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public final void mo7399a(C2435f5 f5Var) {
        mo7392c();
        this.f6962f.add(f5Var);
        this.modCount++;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        String str = (String) obj;
        mo7392c();
        this.f6962f.add(i, str);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        mo7392c();
        if (collection instanceof C2347a7) {
            collection = ((C2347a7) collection).mo7401d();
        }
        boolean addAll = this.f6962f.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    /* renamed from: c */
    public final Object mo7400c(int i) {
        return this.f6962f.get(i);
    }

    public final void clear() {
        mo7392c();
        this.f6962f.clear();
        this.modCount++;
    }

    /* renamed from: d */
    public final List<?> mo7401d() {
        return Collections.unmodifiableList(this.f6962f);
    }

    /* renamed from: e */
    public final C2347a7 mo7402e() {
        return this.f6313e ? new C2718v8(this) : this;
    }

    public final /* synthetic */ Object get(int i) {
        Object obj = this.f6962f.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C2435f5) {
            C2435f5 f5Var = (C2435f5) obj;
            String b = f5Var.mo7642b();
            C2580n5 n5Var = (C2580n5) f5Var;
            int e = n5Var.mo7677e();
            if (C2387c9.m5604a(n5Var.f6744h, e, n5Var.mo7640a() + e)) {
                this.f6962f.set(i, b);
            }
            return b;
        }
        byte[] bArr = (byte[]) obj;
        String a = C2546l6.m6115a(bArr);
        boolean z = false;
        if (C2387c9.f6419a.mo7541a(0, bArr, 0, bArr.length) == 0) {
            z = true;
        }
        if (z) {
            this.f6962f.set(i, a);
        }
        return a;
    }

    public final /* synthetic */ Object remove(int i) {
        mo7392c();
        Object remove = this.f6962f.remove(i);
        this.modCount++;
        return m6539a(remove);
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        String str = (String) obj;
        mo7392c();
        return m6539a(this.f6962f.set(i, str));
    }

    public final int size() {
        return this.f6962f.size();
    }
}
