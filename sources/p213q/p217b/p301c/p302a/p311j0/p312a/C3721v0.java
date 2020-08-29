package p213q.p217b.p301c.p302a.p311j0.p312a;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map.Entry;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3613e0.C3615b;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3618f.C3620b;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3719v.C3720a;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3722v1.C3723a;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3734c;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3736e;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3737f;

/* renamed from: q.b.c.a.j0.a.v0 */
public final class C3721v0<T> implements C3625g1<T> {

    /* renamed from: a */
    public final C3706s0 f9211a;

    /* renamed from: b */
    public final C3677m1<?, ?> f9212b;

    /* renamed from: c */
    public final boolean f9213c;

    /* renamed from: d */
    public final C3705s<?> f9214d;

    public C3721v0(C3677m1<?, ?> m1Var, C3705s<?> sVar, C3706s0 s0Var) {
        this.f9212b = m1Var;
        if (((C3709t) sVar) != null) {
            this.f9213c = s0Var instanceof C3734c;
            this.f9214d = sVar;
            this.f9211a = s0Var;
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public T mo9642a() {
        return this.f9211a.newBuilderForType().buildPartial();
    }

    /* renamed from: a */
    public void mo9643a(T t) {
        if (((C3683o1) this.f9212b) != null) {
            ((C3731z) t).unknownFields.f9122e = false;
            if (((C3709t) this.f9214d) != null) {
                ((C3734c) t).f9286e.mo9972d();
                return;
            }
            throw null;
        }
        throw null;
    }

    /* renamed from: a */
    public void mo9644a(T t, T t2) {
        C3634i1.m8348a(this.f9212b, t, t2);
        if (this.f9213c) {
            C3634i1.m8350a(this.f9214d, t, t2);
        }
    }

    /* renamed from: b */
    public boolean mo9649b(T t, T t2) {
        C3677m1<?, ?> m1Var = this.f9212b;
        if (((C3683o1) m1Var) != null) {
            C3680n1 n1Var = ((C3731z) t).unknownFields;
            if (((C3683o1) m1Var) == null) {
                throw null;
            } else if (!n1Var.equals(((C3731z) t2).unknownFields)) {
                return false;
            } else {
                if (!this.f9213c) {
                    return true;
                }
                C3705s<?> sVar = this.f9214d;
                if (((C3709t) sVar) != null) {
                    C3719v<C3736e> vVar = ((C3734c) t).f9286e;
                    if (((C3709t) sVar) != null) {
                        return vVar.equals(((C3734c) t2).f9286e);
                    }
                    throw null;
                }
                throw null;
            }
        } else {
            throw null;
        }
    }

    /* renamed from: c */
    public int mo9650c(T t) {
        if (((C3683o1) this.f9212b) != null) {
            C3680n1 n1Var = ((C3731z) t).unknownFields;
            int i = n1Var.f9121d;
            if (i == -1) {
                i = 0;
                for (int i2 = 0; i2 < n1Var.f9118a; i2++) {
                    int h = C3670m.m8669h(1) * 2;
                    int j = C3670m.m8674j(2, n1Var.f9119b[i2] >>> 3) + h;
                    i += C3670m.m8649c(3, (C3635j) n1Var.f9120c[i2]) + j;
                }
                n1Var.f9121d = i;
            }
            int i3 = i + 0;
            if (!this.f9213c) {
                return i3;
            }
            if (((C3709t) this.f9214d) != null) {
                C3719v<C3736e> vVar = ((C3734c) t).f9286e;
                int i4 = 0;
                for (int i5 = 0; i5 < vVar.f9208a.mo9693b(); i5++) {
                    i4 += vVar.mo9962a(vVar.f9208a.mo9691a(i5));
                }
                for (Entry a : vVar.f9208a.mo9695c()) {
                    i4 += vVar.mo9962a(a);
                }
                return i3 + i4;
            }
            throw null;
        }
        throw null;
    }

    /* renamed from: d */
    public int mo9651d(T t) {
        if (((C3683o1) this.f9212b) != null) {
            int hashCode = ((C3731z) t).unknownFields.hashCode();
            if (!this.f9213c) {
                return hashCode;
            }
            if (((C3709t) this.f9214d) != null) {
                return (hashCode * 53) + ((C3734c) t).f9286e.hashCode();
            }
            throw null;
        }
        throw null;
    }

    /* renamed from: a */
    public void mo9645a(T t, C3622f1 f1Var, C3697r rVar) {
        C3677m1<?, ?> m1Var = this.f9212b;
        C3705s<?> sVar = this.f9214d;
        Object a = m1Var.mo9838a((Object) t);
        C3719v a2 = sVar.mo9920a((Object) t);
        do {
            try {
                if (f1Var.mo9595j() == Integer.MAX_VALUE) {
                    break;
                }
            } finally {
                m1Var.mo9840a((Object) t, a);
            }
        } while (mo9981a(f1Var, rVar, sVar, a2, m1Var, a));
    }

    /* renamed from: a */
    public void mo9647a(T t, byte[] bArr, int i, int i2, C3612e eVar) {
        C3731z zVar = (C3731z) t;
        C3680n1 n1Var = zVar.unknownFields;
        if (n1Var == C3680n1.f9117f) {
            n1Var = C3680n1.m8772c();
            zVar.unknownFields = n1Var;
        }
        C3719v a = ((C3734c) t).mo10011a();
        C3737f fVar = null;
        while (i < i2) {
            int d = C2286e.m5322d(bArr, i, eVar);
            int i3 = eVar.f8999a;
            if (i3 == 11) {
                int i4 = 0;
                Object obj = null;
                while (d < i2) {
                    d = C2286e.m5322d(bArr, d, eVar);
                    int i5 = eVar.f8999a;
                    int i6 = i5 >>> 3;
                    int i7 = i5 & 7;
                    if (i6 != 2) {
                        if (i6 == 3) {
                            if (fVar != null) {
                                d = C2286e.m5165a(C3608c1.f8978c.mo9537a(fVar.f9293b.getClass()), bArr, d, i2, eVar);
                                a.mo9968b(fVar.f9294c, eVar.f9001c);
                            } else if (i7 == 2) {
                                d = C2286e.m5169a(bArr, d, eVar);
                                obj = (C3635j) eVar.f9001c;
                            }
                        }
                    } else if (i7 == 0) {
                        d = C2286e.m5322d(bArr, d, eVar);
                        i4 = eVar.f8999a;
                        fVar = (C3737f) this.f9214d.mo9919a(eVar.f9002d, this.f9211a, i4);
                    }
                    if (i5 == 12) {
                        break;
                    }
                    d = C2286e.m5150a(i5, bArr, d, i2, eVar);
                }
                if (obj != null) {
                    n1Var.mo9859a((i4 << 3) | 2, obj);
                }
                i = d;
            } else if ((i3 & 7) == 2) {
                C3737f fVar2 = (C3737f) this.f9214d.mo9919a(eVar.f9002d, this.f9211a, i3 >>> 3);
                if (fVar2 != null) {
                    i = C2286e.m5165a(C3608c1.f8978c.mo9537a(fVar2.f9293b.getClass()), bArr, d, i2, eVar);
                    a.mo9968b(fVar2.f9294c, eVar.f9001c);
                } else {
                    i = C2286e.m5151a(i3, bArr, d, i2, n1Var, eVar);
                }
                fVar = fVar2;
            } else {
                i = C2286e.m5150a(i3, bArr, d, i2, eVar);
            }
        }
        if (i != i2) {
            throw C3606c0.m8180g();
        }
    }

    /* renamed from: b */
    public final boolean mo9648b(T t) {
        if (((C3709t) this.f9214d) != null) {
            return ((C3734c) t).f9286e.mo9969b();
        }
        throw null;
    }

    /* renamed from: a */
    public final <UT, UB, ET extends C3720a<ET>> boolean mo9981a(C3622f1 f1Var, C3697r rVar, C3705s<ET> sVar, C3719v<ET> vVar, C3677m1<UT, UB> m1Var, UB ub) {
        int b = f1Var.mo9569b();
        if (b == 11) {
            int i = 0;
            Object obj = null;
            C3635j jVar = null;
            while (f1Var.mo9595j() != Integer.MAX_VALUE) {
                int b2 = f1Var.mo9569b();
                if (b2 == 16) {
                    i = f1Var.mo9601m();
                    obj = sVar.mo9919a(rVar, this.f9211a, i);
                } else if (b2 == 26) {
                    if (obj == null) {
                        jVar = f1Var.mo9599l();
                    } else if (((C3709t) sVar) != null) {
                        C3737f fVar = (C3737f) obj;
                        vVar.mo9968b(fVar.f9294c, f1Var.mo9570b(fVar.f9293b.getClass(), rVar));
                    } else {
                        throw null;
                    }
                } else if (!f1Var.mo9606o()) {
                    break;
                }
            }
            if (f1Var.mo9569b() == 12) {
                if (jVar != null) {
                    if (obj == null) {
                        m1Var.mo9839a(ub, i, jVar);
                    } else if (((C3709t) sVar) != null) {
                        C3737f fVar2 = (C3737f) obj;
                        C3706s0 buildPartial = fVar2.f9293b.newBuilderForType().buildPartial();
                        ByteBuffer wrap = ByteBuffer.wrap(jVar.mo9668g());
                        if (wrap.hasArray()) {
                            C3620b bVar = new C3620b(wrap, true);
                            C3608c1.f8978c.mo9538a(buildPartial).mo9645a(buildPartial, bVar, rVar);
                            vVar.mo9968b(fVar2.f9294c, (Object) buildPartial);
                            if (bVar.mo9595j() != Integer.MAX_VALUE) {
                                throw C3606c0.m8174a();
                            }
                        } else {
                            throw new IllegalArgumentException("Direct buffers not yet supported");
                        }
                    } else {
                        throw null;
                    }
                }
                return true;
            }
            throw C3606c0.m8174a();
        } else if ((b & 7) != 2) {
            return f1Var.mo9606o();
        } else {
            Object a = sVar.mo9919a(rVar, this.f9211a, b >>> 3);
            if (a == null) {
                return m1Var.mo9841a(ub, f1Var);
            }
            C3737f fVar3 = (C3737f) a;
            vVar.mo9968b(fVar3.f9294c, f1Var.mo9570b(fVar3.f9293b.getClass(), rVar));
            return true;
        }
    }

    /* renamed from: a */
    public void mo9646a(T t, C3722v1 v1Var) {
        if (((C3709t) this.f9214d) != null) {
            Iterator c = ((C3734c) t).f9286e.mo9970c();
            while (c.hasNext()) {
                Entry entry = (Entry) c.next();
                C3720a aVar = (C3720a) entry.getKey();
                if (aVar.mo9979p() != C3718u1.MESSAGE || aVar.mo9977i() || aVar.mo9980r()) {
                    throw new IllegalStateException("Found invalid MessageSet item.");
                }
                ((C3678n) v1Var).mo9847a(aVar.getNumber(), entry instanceof C3615b ? ((C3613e0) ((C3615b) entry).f9003e.getValue()).mo9622a() : entry.getValue());
            }
            if (((C3683o1) this.f9212b) != null) {
                C3680n1 n1Var = ((C3731z) t).unknownFields;
                if (n1Var != null) {
                    C3678n nVar = (C3678n) v1Var;
                    if (nVar == null) {
                        throw null;
                    } else if (C3723a.ASCENDING == C3723a.DESCENDING) {
                        int i = n1Var.f9118a;
                        while (true) {
                            i--;
                            if (i >= 0) {
                                nVar.mo9847a(n1Var.f9119b[i] >>> 3, n1Var.f9120c[i]);
                            } else {
                                return;
                            }
                        }
                    } else {
                        for (int i2 = 0; i2 < n1Var.f9118a; i2++) {
                            nVar.mo9847a(n1Var.f9119b[i2] >>> 3, n1Var.f9120c[i2]);
                        }
                    }
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        } else {
            throw null;
        }
    }
}
