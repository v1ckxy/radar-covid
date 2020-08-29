package p213q.p217b.p301c.p302a.p311j0.p312a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.C3603i;

/* renamed from: q.b.c.a.j0.a.g0 */
public class C3624g0 extends C3605c<String> implements C3627h0, RandomAccess {

    /* renamed from: g */
    public static final C3624g0 f9022g;

    /* renamed from: f */
    public final List<Object> f9023f;

    static {
        C3624g0 g0Var = new C3624g0(10);
        f9022g = g0Var;
        g0Var.f8977e = false;
    }

    public C3624g0(int i) {
        this.f9023f = new ArrayList(i);
    }

    public C3624g0(ArrayList<Object> arrayList) {
        this.f9023f = arrayList;
    }

    /* renamed from: a */
    public static String m8302a(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof C3635j ? ((C3635j) obj).mo9669h() : C3594b0.m8167b((byte[]) obj);
    }

    /* renamed from: a */
    public void mo9633a(C3635j jVar) {
        mo9533c();
        this.f9023f.add(jVar);
        this.modCount++;
    }

    public void add(int i, Object obj) {
        String str = (String) obj;
        mo9533c();
        this.f9023f.add(i, str);
        this.modCount++;
    }

    public boolean addAll(int i, Collection<? extends String> collection) {
        mo9533c();
        if (collection instanceof C3627h0) {
            collection = ((C3627h0) collection).mo9638q();
        }
        boolean addAll = this.f9023f.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    /* renamed from: b */
    public C3603i mo9516b(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f9023f);
            return new C3624g0(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public void clear() {
        mo9533c();
        this.f9023f.clear();
        this.modCount++;
    }

    /* renamed from: d */
    public Object mo9635d(int i) {
        return this.f9023f.get(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0035, code lost:
        if (r4 != false) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        if (r0.mo9663c() != false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object get(int r6) {
        /*
            r5 = this;
            java.util.List<java.lang.Object> r0 = r5.f9023f
            java.lang.Object r0 = r0.get(r6)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L_0x000d
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0038
        L_0x000d:
            boolean r1 = r0 instanceof p213q.p217b.p301c.p302a.p311j0.p312a.C3635j
            if (r1 == 0) goto L_0x0024
            q.b.c.a.j0.a.j r0 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3635j) r0
            java.lang.String r1 = r0.mo9669h()
            boolean r0 = r0.mo9663c()
            if (r0 == 0) goto L_0x0022
        L_0x001d:
            java.util.List<java.lang.Object> r0 = r5.f9023f
            r0.set(r6, r1)
        L_0x0022:
            r0 = r1
            goto L_0x0038
        L_0x0024:
            byte[] r0 = (byte[]) r0
            java.lang.String r1 = p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.m8167b(r0)
            q.b.c.a.j0.a.r1$a r2 = p213q.p217b.p301c.p302a.p311j0.p312a.C3700r1.f9152a
            int r3 = r0.length
            r4 = 0
            int r0 = r2.mo9912a(r4, r0, r4, r3)
            if (r0 != 0) goto L_0x0035
            r4 = 1
        L_0x0035:
            if (r4 == 0) goto L_0x0022
            goto L_0x001d
        L_0x0038:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p301c.p302a.p311j0.p312a.C3624g0.get(int):java.lang.Object");
    }

    /* renamed from: n */
    public C3627h0 mo9637n() {
        return this.f8977e ? new C3686p1(this) : this;
    }

    /* renamed from: q */
    public List<?> mo9638q() {
        return Collections.unmodifiableList(this.f9023f);
    }

    public Object remove(int i) {
        mo9533c();
        Object remove = this.f9023f.remove(i);
        this.modCount++;
        return m8302a(remove);
    }

    public Object set(int i, Object obj) {
        String str = (String) obj;
        mo9533c();
        return m8302a(this.f9023f.set(i, str));
    }

    public int size() {
        return this.f9023f.size();
    }
}
