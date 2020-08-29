package p213q.p217b.p301c.p302a.p311j0.p312a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.C3597c;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3613e0.C3616c;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3706s0.C3707a;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3719v.C3720a;

/* renamed from: q.b.c.a.j0.a.v */
public final class C3719v<T extends C3720a<T>> {

    /* renamed from: d */
    public static final C3719v f9207d = new C3719v(true);

    /* renamed from: a */
    public final C3646j1<T, Object> f9208a = C3646j1.m8430c(16);

    /* renamed from: b */
    public boolean f9209b;

    /* renamed from: c */
    public boolean f9210c;

    /* renamed from: q.b.c.a.j0.a.v$a */
    public interface C3720a<T extends C3720a<T>> extends Comparable<T> {
        /* renamed from: a */
        C3707a mo9975a(C3707a aVar, C3706s0 s0Var);

        int getNumber();

        /* renamed from: i */
        boolean mo9977i();

        /* renamed from: l */
        C3711t1 mo9978l();

        /* renamed from: p */
        C3718u1 mo9979p();

        /* renamed from: r */
        boolean mo9980r();
    }

    public C3719v() {
    }

    public C3719v(boolean z) {
        mo9972d();
        mo9972d();
    }

    /* renamed from: a */
    public static int m8966a(C3711t1 t1Var, int i, Object obj) {
        int h = C3670m.m8669h(i);
        if (t1Var == C3711t1.GROUP) {
            h *= 2;
        }
        return m8968b(t1Var, obj) + h;
    }

    /* renamed from: a */
    public static Object m8967a(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* renamed from: b */
    public static int m8968b(C3711t1 t1Var, Object obj) {
        switch (t1Var.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                C3670m.m8647c();
                return 8;
            case 1:
                ((Float) obj).floatValue();
                C3670m.m8660f();
                return 4;
            case 2:
                return C3670m.m8654d(((Long) obj).longValue());
            case 3:
                return C3670m.m8654d(((Long) obj).longValue());
            case 4:
                return C3670m.m8652d(((Integer) obj).intValue());
            case 5:
                ((Long) obj).longValue();
                C3670m.m8655e();
                return 8;
            case 6:
                ((Integer) obj).intValue();
                C3670m.m8651d();
                return 4;
            case 7:
                ((Boolean) obj).booleanValue();
                C3670m.m8641b();
                return 1;
            case 8:
                return obj instanceof C3635j ? C3670m.m8638a((C3635j) obj) : C3670m.m8636a((String) obj);
            case 9:
                return C3670m.m8639a((C3706s0) obj);
            case 10:
                return obj instanceof C3613e0 ? C3670m.m8637a((C3621f0) (C3613e0) obj) : C3670m.m8645b((C3706s0) obj);
            case 11:
                return obj instanceof C3635j ? C3670m.m8638a((C3635j) obj) : C3670m.m8640a((byte[]) obj);
            case 12:
                return C3670m.m8671i(((Integer) obj).intValue());
            case 13:
                if (obj instanceof C3597c) {
                    return C3670m.m8652d(((C3597c) obj).getNumber());
                }
                return C3670m.m8652d(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                C3670m.m8664g();
                return 4;
            case 15:
                ((Long) obj).longValue();
                C3670m.m8668h();
                return 8;
            case 16:
                return C3670m.m8665g(((Integer) obj).intValue());
            case 17:
                return C3670m.m8650c(((Long) obj).longValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: c */
    public static int m8969c(C3720a<?> aVar, Object obj) {
        C3711t1 l = aVar.mo9978l();
        int number = aVar.getNumber();
        if (!aVar.mo9977i()) {
            return m8966a(l, number, obj);
        }
        int i = 0;
        List<Object> list = (List) obj;
        if (aVar.mo9980r()) {
            for (Object b : list) {
                i += m8968b(l, b);
            }
            return C3670m.m8669h(number) + i + C3670m.m8671i(i);
        }
        for (Object a : list) {
            i += m8966a(l, number, a);
        }
        return i;
    }

    /* renamed from: c */
    public static <T extends C3720a<T>> boolean m8970c(Entry<T, Object> entry) {
        C3720a aVar = (C3720a) entry.getKey();
        if (aVar.mo9979p() == C3718u1.MESSAGE) {
            boolean i = aVar.mo9977i();
            Object value = entry.getValue();
            if (i) {
                for (C3706s0 isInitialized : (List) value) {
                    if (!isInitialized.isInitialized()) {
                        return false;
                    }
                }
            } else if (value instanceof C3706s0) {
                if (!((C3706s0) value).isInitialized()) {
                    return false;
                }
            } else if (value instanceof C3613e0) {
                return true;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    /* renamed from: a */
    public final int mo9962a(Entry<T, Object> entry) {
        C3720a aVar = (C3720a) entry.getKey();
        Object value = entry.getValue();
        if (aVar.mo9979p() != C3718u1.MESSAGE || aVar.mo9977i() || aVar.mo9980r()) {
            return m8969c(aVar, value);
        }
        boolean z = value instanceof C3613e0;
        int number = ((C3720a) entry.getKey()).getNumber();
        if (z) {
            C3613e0 e0Var = (C3613e0) value;
            return C3670m.m8637a((C3621f0) e0Var) + C3670m.m8669h(3) + C3670m.m8674j(2, number) + (C3670m.m8669h(1) * 2);
        }
        C3706s0 s0Var = (C3706s0) value;
        return C3670m.m8656e(s0Var.getSerializedSize()) + C3670m.m8669h(3) + C3670m.m8674j(2, number) + (C3670m.m8669h(1) * 2);
    }

    /* renamed from: a */
    public Object mo9963a(T t) {
        Object obj = this.f9208a.get(t);
        return obj instanceof C3613e0 ? ((C3613e0) obj).mo9546b() : obj;
    }

    /* renamed from: a */
    public void mo9965a(T t, Object obj) {
        List list;
        if (t.mo9977i()) {
            mo9964a(t.mo9978l(), obj);
            Object a = mo9963a(t);
            if (a == null) {
                list = new ArrayList();
                this.f9208a.put(t, list);
            } else {
                list = (List) a;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: a */
    public boolean mo9966a() {
        return this.f9208a.isEmpty();
    }

    /* renamed from: b */
    public final void mo9967b(Entry<T, Object> entry) {
        Object obj;
        C3646j1<T, Object> j1Var;
        C3720a aVar = (C3720a) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C3613e0) {
            value = ((C3613e0) value).mo9546b();
        }
        if (aVar.mo9977i()) {
            Object a = mo9963a((T) aVar);
            if (a == null) {
                a = new ArrayList();
            }
            for (Object a2 : (List) value) {
                ((List) a).add(m8967a(a2));
            }
            this.f9208a.put(aVar, a);
            return;
        }
        if (aVar.mo9979p() == C3718u1.MESSAGE) {
            Object a3 = mo9963a((T) aVar);
            if (a3 != null) {
                obj = aVar.mo9975a(((C3706s0) a3).toBuilder(), (C3706s0) value).build();
                j1Var = this.f9208a;
                j1Var.put(aVar, obj);
            }
        }
        j1Var = this.f9208a;
        obj = m8967a(value);
        j1Var.put(aVar, obj);
    }

    /* renamed from: b */
    public void mo9968b(T t, Object obj) {
        if (!t.mo9977i()) {
            mo9964a(t.mo9978l(), obj);
            r5 = obj;
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                mo9964a(t.mo9978l(), it.next());
            }
            r5 = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (r5 instanceof C3613e0) {
            this.f9210c = true;
        }
        this.f9208a.put(t, r5);
    }

    /* renamed from: b */
    public boolean mo9969b() {
        for (int i = 0; i < this.f9208a.mo9693b(); i++) {
            if (!m8970c(this.f9208a.mo9691a(i))) {
                return false;
            }
        }
        for (Entry c : this.f9208a.mo9695c()) {
            if (!m8970c(c)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public Iterator<Entry<T, Object>> mo9970c() {
        return this.f9210c ? new C3616c(this.f9208a.entrySet().iterator()) : this.f9208a.entrySet().iterator();
    }

    public C3719v<T> clone() {
        C3719v<T> vVar = new C3719v<>();
        for (int i = 0; i < this.f9208a.mo9693b(); i++) {
            Entry a = this.f9208a.mo9691a(i);
            vVar.mo9968b((T) (C3720a) a.getKey(), a.getValue());
        }
        for (Entry entry : this.f9208a.mo9695c()) {
            vVar.mo9968b((T) (C3720a) entry.getKey(), entry.getValue());
        }
        vVar.f9210c = this.f9210c;
        return vVar;
    }

    /* renamed from: d */
    public void mo9972d() {
        if (!this.f9209b) {
            this.f9208a.mo9699e();
            this.f9209b = true;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3719v)) {
            return false;
        }
        return this.f9208a.equals(((C3719v) obj).f9208a);
    }

    public int hashCode() {
        return this.f9208a.hashCode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        if ((r4 instanceof byte[]) == false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if ((r4 instanceof p213q.p217b.p301c.p302a.p311j0.p312a.C3613e0) == false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        if ((r4 instanceof p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.C3597c) == false) goto L_0x002a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9964a(p213q.p217b.p301c.p302a.p311j0.p312a.C3711t1 r3, java.lang.Object r4) {
        /*
            r2 = this;
            p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.m8164a(r4)
            q.b.c.a.j0.a.u1 r3 = r3.f9173e
            int r3 = r3.ordinal()
            r0 = 1
            r1 = 0
            switch(r3) {
                case 0: goto L_0x003c;
                case 1: goto L_0x0039;
                case 2: goto L_0x0036;
                case 3: goto L_0x0033;
                case 4: goto L_0x0030;
                case 5: goto L_0x002d;
                case 6: goto L_0x0021;
                case 7: goto L_0x0018;
                case 8: goto L_0x000f;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x003e
        L_0x000f:
            boolean r3 = r4 instanceof p213q.p217b.p301c.p302a.p311j0.p312a.C3706s0
            if (r3 != 0) goto L_0x002b
            boolean r3 = r4 instanceof p213q.p217b.p301c.p302a.p311j0.p312a.C3613e0
            if (r3 == 0) goto L_0x002a
            goto L_0x002b
        L_0x0018:
            boolean r3 = r4 instanceof java.lang.Integer
            if (r3 != 0) goto L_0x002b
            boolean r3 = r4 instanceof p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.C3597c
            if (r3 == 0) goto L_0x002a
            goto L_0x002b
        L_0x0021:
            boolean r3 = r4 instanceof p213q.p217b.p301c.p302a.p311j0.p312a.C3635j
            if (r3 != 0) goto L_0x002b
            boolean r3 = r4 instanceof byte[]
            if (r3 == 0) goto L_0x002a
            goto L_0x002b
        L_0x002a:
            r0 = r1
        L_0x002b:
            r1 = r0
            goto L_0x003e
        L_0x002d:
            boolean r1 = r4 instanceof java.lang.String
            goto L_0x003e
        L_0x0030:
            boolean r1 = r4 instanceof java.lang.Boolean
            goto L_0x003e
        L_0x0033:
            boolean r1 = r4 instanceof java.lang.Double
            goto L_0x003e
        L_0x0036:
            boolean r1 = r4 instanceof java.lang.Float
            goto L_0x003e
        L_0x0039:
            boolean r1 = r4 instanceof java.lang.Long
            goto L_0x003e
        L_0x003c:
            boolean r1 = r4 instanceof java.lang.Integer
        L_0x003e:
            if (r1 == 0) goto L_0x0041
            return
        L_0x0041:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Wrong object type used with protocol message reflection."
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p301c.p302a.p311j0.p312a.C3719v.mo9964a(q.b.c.a.j0.a.t1, java.lang.Object):void");
    }
}
