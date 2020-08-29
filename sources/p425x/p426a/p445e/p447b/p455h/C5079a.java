package p425x.p426a.p445e.p447b.p455h;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;
import p119o.p120a.C0967p0;
import p425x.p426a.p427a.C4967n;
import p425x.p426a.p445e.p447b.p455h.C5085g.C5087b;
import p425x.p426a.p445e.p447b.p455h.C5089i.C5091b;
import p425x.p426a.p445e.p447b.p455h.C5092j.C5094b;

/* renamed from: x.a.e.b.h.a */
public final class C5079a implements Serializable {

    /* renamed from: e */
    public transient C5095k f12148e;

    /* renamed from: f */
    public final int f12149f;

    /* renamed from: g */
    public final List<C5081c> f12150g;

    /* renamed from: h */
    public int f12151h;

    /* renamed from: i */
    public C5110u f12152i;

    /* renamed from: j */
    public List<C5110u> f12153j;

    /* renamed from: k */
    public Map<Integer, LinkedList<C5110u>> f12154k;

    /* renamed from: l */
    public Stack<C5110u> f12155l;

    /* renamed from: m */
    public Map<Integer, C5110u> f12156m;

    /* renamed from: n */
    public int f12157n;

    /* renamed from: o */
    public boolean f12158o;

    /* renamed from: p */
    public transient int f12159p;

    public C5079a(C5079a aVar) {
        this.f12148e = new C5095k(aVar.f12148e.f12195a);
        this.f12149f = aVar.f12149f;
        this.f12151h = aVar.f12151h;
        this.f12152i = aVar.f12152i;
        ArrayList arrayList = new ArrayList();
        this.f12153j = arrayList;
        arrayList.addAll(aVar.f12153j);
        this.f12154k = new TreeMap();
        for (Integer num : aVar.f12154k.keySet()) {
            this.f12154k.put(num, (LinkedList) ((LinkedList) aVar.f12154k.get(num)).clone());
        }
        Stack<C5110u> stack = new Stack<>();
        this.f12155l = stack;
        stack.addAll(aVar.f12155l);
        this.f12150g = new ArrayList();
        for (C5081c clone : aVar.f12150g) {
            this.f12150g.add(clone.clone());
        }
        this.f12156m = new TreeMap(aVar.f12156m);
        this.f12157n = aVar.f12157n;
        this.f12159p = aVar.f12159p;
        this.f12158o = aVar.f12158o;
    }

    public C5079a(C5095k kVar, int i, int i2, int i3) {
        this.f12148e = kVar;
        this.f12149f = i;
        this.f12159p = i3;
        this.f12151h = i2;
        if (i2 <= i && i2 >= 2) {
            int i4 = i - i2;
            if (i4 % 2 == 0) {
                this.f12153j = new ArrayList();
                this.f12154k = new TreeMap();
                this.f12155l = new Stack<>();
                this.f12150g = new ArrayList();
                for (int i5 = 0; i5 < i4; i5++) {
                    this.f12150g.add(new C5081c(i5));
                }
                this.f12156m = new TreeMap();
                this.f12157n = 0;
                this.f12158o = false;
                return;
            }
        }
        throw new IllegalArgumentException("illegal value for BDS parameter k");
    }

    /* renamed from: a */
    public final void mo11735a(byte[] bArr, byte[] bArr2, C5092j jVar) {
        if (jVar != null) {
            C5089i iVar = (C5089i) ((C5091b) ((C5091b) new C5091b().mo11758b(jVar.f12210a)).mo11757a(jVar.f12211b)).mo11749b();
            C5085g gVar = (C5085g) ((C5087b) ((C5087b) new C5087b().mo11758b(jVar.f12210a)).mo11757a(jVar.f12211b)).mo11746b();
            for (int i = 0; i < (1 << this.f12149f); i++) {
                C5094b bVar = (C5094b) ((C5094b) new C5094b().mo11758b(jVar.f12210a)).mo11757a(jVar.f12211b);
                bVar.f12192e = i;
                bVar.f12193f = jVar.f12190f;
                bVar.f12194g = jVar.f12191g;
                jVar = (C5092j) ((C5094b) bVar.mo11756a(jVar.f12213d)).mo11750b();
                C5095k kVar = this.f12148e;
                kVar.mo11752a(kVar.mo11754a(bArr2, jVar), bArr);
                C5098n a = this.f12148e.mo11751a(jVar);
                C5091b bVar2 = (C5091b) ((C5091b) new C5091b().mo11758b(iVar.f12210a)).mo11757a(iVar.f12211b);
                bVar2.f12186e = i;
                bVar2.f12187f = iVar.f12184f;
                bVar2.f12188g = iVar.f12185g;
                iVar = (C5089i) ((C5091b) bVar2.mo11756a(iVar.f12213d)).mo11749b();
                C5110u a2 = C0967p0.m2191a(this.f12148e, a, iVar);
                C5087b bVar3 = (C5087b) ((C5087b) new C5087b().mo11758b(gVar.f12210a)).mo11757a(gVar.f12211b);
                bVar3.f12180f = i;
                gVar = (C5085g) ((C5087b) bVar3.mo11756a(gVar.f12213d)).mo11746b();
                while (!this.f12155l.isEmpty()) {
                    int i2 = ((C5110u) this.f12155l.peek()).f12250e;
                    int i3 = a2.f12250e;
                    if (i2 != i3) {
                        break;
                    }
                    int i4 = i / (1 << i3);
                    if (i4 == 1) {
                        this.f12153j.add(a2);
                    }
                    if (i4 == 3) {
                        int i5 = a2.f12250e;
                        if (i5 < this.f12149f - this.f12151h) {
                            C5081c cVar = (C5081c) this.f12150g.get(i5);
                            cVar.f12162e = a2;
                            int i6 = a2.f12250e;
                            cVar.f12164g = i6;
                            if (i6 == cVar.f12163f) {
                                cVar.f12167j = true;
                            }
                        }
                    }
                    if (i4 >= 3 && (i4 & 1) == 1) {
                        int i7 = a2.f12250e;
                        int i8 = this.f12149f;
                        if (i7 >= i8 - this.f12151h && i7 <= i8 - 2) {
                            if (this.f12154k.get(Integer.valueOf(i7)) == null) {
                                LinkedList linkedList = new LinkedList();
                                linkedList.add(a2);
                                this.f12154k.put(Integer.valueOf(a2.f12250e), linkedList);
                            } else {
                                ((LinkedList) this.f12154k.get(Integer.valueOf(a2.f12250e))).add(a2);
                            }
                        }
                    }
                    C5087b bVar4 = (C5087b) ((C5087b) new C5087b().mo11758b(gVar.f12210a)).mo11757a(gVar.f12211b);
                    bVar4.f12179e = gVar.f12177f;
                    bVar4.f12180f = (gVar.f12178g - 1) / 2;
                    C5085g gVar2 = (C5085g) ((C5087b) bVar4.mo11756a(gVar.f12213d)).mo11746b();
                    C5110u a3 = C0967p0.m2192a(this.f12148e, (C5110u) this.f12155l.pop(), a2, (C5099o) gVar2);
                    C5110u uVar = new C5110u(a3.f12250e + 1, a3.mo11761a());
                    C5087b bVar5 = (C5087b) ((C5087b) new C5087b().mo11758b(gVar2.f12210a)).mo11757a(gVar2.f12211b);
                    bVar5.f12179e = gVar2.f12177f + 1;
                    bVar5.f12180f = gVar2.f12178g;
                    gVar = (C5085g) ((C5087b) bVar5.mo11756a(gVar2.f12213d)).mo11746b();
                    a2 = uVar;
                }
                this.f12155l.push(a2);
            }
            this.f12152i = (C5110u) this.f12155l.pop();
            return;
        }
        throw new NullPointerException("otsHashAddress == null");
    }

    /* renamed from: b */
    public final void mo11736b(byte[] bArr, byte[] bArr2, C5092j jVar) {
        Object obj;
        List<C5110u> list;
        if (jVar == null) {
            throw new NullPointerException("otsHashAddress == null");
        } else if (!this.f12158o) {
            int i = this.f12157n;
            if (i <= this.f12159p - 1) {
                int i2 = this.f12149f;
                int i3 = 0;
                while (true) {
                    if (i3 >= i2) {
                        i3 = 0;
                        break;
                    } else if (((i >> i3) & 1) == 0) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (((this.f12157n >> (i3 + 1)) & 1) == 0 && i3 < this.f12149f - 1) {
                    this.f12156m.put(Integer.valueOf(i3), this.f12153j.get(i3));
                }
                C5089i iVar = (C5089i) ((C5091b) ((C5091b) new C5091b().mo11758b(jVar.f12210a)).mo11757a(jVar.f12211b)).mo11749b();
                C5085g gVar = (C5085g) ((C5087b) ((C5087b) new C5087b().mo11758b(jVar.f12210a)).mo11757a(jVar.f12211b)).mo11746b();
                if (i3 == 0) {
                    C5094b bVar = (C5094b) ((C5094b) new C5094b().mo11758b(jVar.f12210a)).mo11757a(jVar.f12211b);
                    bVar.f12192e = this.f12157n;
                    bVar.f12193f = jVar.f12190f;
                    bVar.f12194g = jVar.f12191g;
                    jVar = (C5092j) ((C5094b) bVar.mo11756a(jVar.f12213d)).mo11750b();
                    C5095k kVar = this.f12148e;
                    kVar.mo11752a(kVar.mo11754a(bArr2, jVar), bArr);
                    C5098n a = this.f12148e.mo11751a(jVar);
                    C5091b bVar2 = (C5091b) ((C5091b) new C5091b().mo11758b(iVar.f12210a)).mo11757a(iVar.f12211b);
                    bVar2.f12186e = this.f12157n;
                    bVar2.f12187f = iVar.f12184f;
                    bVar2.f12188g = iVar.f12185g;
                    this.f12153j.set(0, C0967p0.m2191a(this.f12148e, a, (C5089i) ((C5091b) bVar2.mo11756a(iVar.f12213d)).mo11749b()));
                } else {
                    C5087b bVar3 = (C5087b) ((C5087b) new C5087b().mo11758b(gVar.f12210a)).mo11757a(gVar.f12211b);
                    int i4 = i3 - 1;
                    bVar3.f12179e = i4;
                    bVar3.f12180f = this.f12157n >> i3;
                    C5085g gVar2 = (C5085g) ((C5087b) bVar3.mo11756a(gVar.f12213d)).mo11746b();
                    C5095k kVar2 = this.f12148e;
                    kVar2.mo11752a(kVar2.mo11754a(bArr2, jVar), bArr);
                    C5110u a2 = C0967p0.m2192a(this.f12148e, (C5110u) this.f12153j.get(i4), (C5110u) this.f12156m.get(Integer.valueOf(i4)), (C5099o) gVar2);
                    this.f12153j.set(i3, new C5110u(a2.f12250e + 1, a2.mo11761a()));
                    this.f12156m.remove(Integer.valueOf(i4));
                    for (int i5 = 0; i5 < i3; i5++) {
                        if (i5 < this.f12149f - this.f12151h) {
                            list = this.f12153j;
                            obj = ((C5081c) this.f12150g.get(i5)).f12162e;
                        } else {
                            list = this.f12153j;
                            obj = ((LinkedList) this.f12154k.get(Integer.valueOf(i5))).removeFirst();
                        }
                        list.set(i5, obj);
                    }
                    int min = Math.min(i3, this.f12149f - this.f12151h);
                    for (int i6 = 0; i6 < min; i6++) {
                        int i7 = ((1 << i6) * 3) + this.f12157n + 1;
                        if (i7 < (1 << this.f12149f)) {
                            C5081c cVar = (C5081c) this.f12150g.get(i6);
                            cVar.f12162e = null;
                            cVar.f12164g = cVar.f12163f;
                            cVar.f12165h = i7;
                            cVar.f12166i = true;
                            cVar.f12167j = false;
                        }
                    }
                }
                for (int i8 = 0; i8 < ((this.f12149f - this.f12151h) >> 1); i8++) {
                    C5081c cVar2 = null;
                    for (C5081c cVar3 : this.f12150g) {
                        if (!cVar3.f12167j && cVar3.f12166i) {
                            if (cVar2 == null || cVar3.mo11739b() < cVar2.mo11739b() || (cVar3.mo11739b() == cVar2.mo11739b() && cVar3.f12165h < cVar2.f12165h)) {
                                cVar2 = cVar3;
                            }
                        }
                    }
                    if (cVar2 != null) {
                        Stack<C5110u> stack = this.f12155l;
                        C5095k kVar3 = this.f12148e;
                        if (cVar2.f12167j || !cVar2.f12166i) {
                            throw new IllegalStateException("finished or not initialized");
                        }
                        C5094b bVar4 = (C5094b) ((C5094b) new C5094b().mo11758b(jVar.f12210a)).mo11757a(jVar.f12211b);
                        bVar4.f12192e = cVar2.f12165h;
                        bVar4.f12193f = jVar.f12190f;
                        bVar4.f12194g = jVar.f12191g;
                        C5092j jVar2 = (C5092j) ((C5094b) bVar4.mo11756a(jVar.f12213d)).mo11750b();
                        C5091b bVar5 = (C5091b) ((C5091b) new C5091b().mo11758b(jVar2.f12210a)).mo11757a(jVar2.f12211b);
                        bVar5.f12186e = cVar2.f12165h;
                        C5089i iVar2 = (C5089i) bVar5.mo11749b();
                        C5087b bVar6 = (C5087b) ((C5087b) new C5087b().mo11758b(jVar2.f12210a)).mo11757a(jVar2.f12211b);
                        bVar6.f12180f = cVar2.f12165h;
                        C5085g gVar3 = (C5085g) bVar6.mo11746b();
                        kVar3.mo11752a(kVar3.mo11754a(bArr2, jVar2), bArr);
                        C5110u a3 = C0967p0.m2191a(kVar3, kVar3.mo11751a(jVar2), iVar2);
                        while (!stack.isEmpty() && ((C5110u) stack.peek()).f12250e == a3.f12250e && ((C5110u) stack.peek()).f12250e != cVar2.f12163f) {
                            C5087b bVar7 = (C5087b) ((C5087b) new C5087b().mo11758b(gVar3.f12210a)).mo11757a(gVar3.f12211b);
                            bVar7.f12179e = gVar3.f12177f;
                            bVar7.f12180f = (gVar3.f12178g - 1) / 2;
                            C5085g gVar4 = (C5085g) ((C5087b) bVar7.mo11756a(gVar3.f12213d)).mo11746b();
                            C5110u a4 = C0967p0.m2192a(kVar3, (C5110u) stack.pop(), a3, (C5099o) gVar4);
                            C5110u uVar = new C5110u(a4.f12250e + 1, a4.mo11761a());
                            C5087b bVar8 = (C5087b) ((C5087b) new C5087b().mo11758b(gVar4.f12210a)).mo11757a(gVar4.f12211b);
                            bVar8.f12179e = gVar4.f12177f + 1;
                            bVar8.f12180f = gVar4.f12178g;
                            C5110u uVar2 = uVar;
                            gVar3 = (C5085g) ((C5087b) bVar8.mo11756a(gVar4.f12213d)).mo11746b();
                            a3 = uVar2;
                        }
                        C5110u uVar3 = cVar2.f12162e;
                        if (uVar3 == null) {
                            cVar2.f12162e = a3;
                        } else if (uVar3.f12250e == a3.f12250e) {
                            C5087b bVar9 = (C5087b) ((C5087b) new C5087b().mo11758b(gVar3.f12210a)).mo11757a(gVar3.f12211b);
                            bVar9.f12179e = gVar3.f12177f;
                            bVar9.f12180f = (gVar3.f12178g - 1) / 2;
                            C5085g gVar5 = (C5085g) ((C5087b) bVar9.mo11756a(gVar3.f12213d)).mo11746b();
                            a3 = new C5110u(cVar2.f12162e.f12250e + 1, C0967p0.m2192a(kVar3, cVar2.f12162e, a3, (C5099o) gVar5).mo11761a());
                            cVar2.f12162e = a3;
                            C5087b bVar10 = (C5087b) ((C5087b) new C5087b().mo11758b(gVar5.f12210a)).mo11757a(gVar5.f12211b);
                            bVar10.f12179e = gVar5.f12177f + 1;
                            bVar10.f12180f = gVar5.f12178g;
                            C5085g gVar6 = (C5085g) ((C5087b) bVar10.mo11756a(gVar5.f12213d)).mo11746b();
                        } else {
                            stack.push(a3);
                        }
                        if (cVar2.f12162e.f12250e == cVar2.f12163f) {
                            cVar2.f12167j = true;
                        } else {
                            cVar2.f12164g = a3.f12250e;
                            cVar2.f12165h++;
                        }
                    }
                }
                this.f12157n++;
                return;
            }
            throw new IllegalStateException("index out of bounds");
        } else {
            throw new IllegalStateException("index already used");
        }
    }

    public C5079a(C5079a aVar, C4967n nVar) {
        this.f12148e = new C5095k(new C5097m(nVar));
        this.f12149f = aVar.f12149f;
        this.f12151h = aVar.f12151h;
        this.f12152i = aVar.f12152i;
        ArrayList arrayList = new ArrayList();
        this.f12153j = arrayList;
        arrayList.addAll(aVar.f12153j);
        this.f12154k = new TreeMap();
        for (Integer num : aVar.f12154k.keySet()) {
            this.f12154k.put(num, (LinkedList) ((LinkedList) aVar.f12154k.get(num)).clone());
        }
        Stack<C5110u> stack = new Stack<>();
        this.f12155l = stack;
        stack.addAll(aVar.f12155l);
        this.f12150g = new ArrayList();
        for (C5081c clone : aVar.f12150g) {
            this.f12150g.add(clone.clone());
        }
        TreeMap treeMap = new TreeMap(aVar.f12156m);
        this.f12156m = treeMap;
        int i = aVar.f12157n;
        this.f12157n = i;
        this.f12159p = aVar.f12159p;
        this.f12158o = aVar.f12158o;
        if (this.f12153j == null) {
            throw new IllegalStateException("authenticationPath == null");
        } else if (this.f12154k == null) {
            throw new IllegalStateException("retain == null");
        } else if (this.f12155l == null) {
            throw new IllegalStateException("stack == null");
        } else if (this.f12150g == null) {
            throw new IllegalStateException("treeHashInstances == null");
        } else if (treeMap == null) {
            throw new IllegalStateException("keep == null");
        } else if (!C0967p0.m2207a(this.f12149f, (long) i)) {
            throw new IllegalStateException("index in BDS state out of bounds");
        }
    }

    public C5079a(C5079a aVar, byte[] bArr, byte[] bArr2, C5092j jVar) {
        this.f12148e = new C5095k(aVar.f12148e.f12195a);
        this.f12149f = aVar.f12149f;
        this.f12151h = aVar.f12151h;
        this.f12152i = aVar.f12152i;
        ArrayList arrayList = new ArrayList();
        this.f12153j = arrayList;
        arrayList.addAll(aVar.f12153j);
        this.f12154k = new TreeMap();
        for (Integer num : aVar.f12154k.keySet()) {
            this.f12154k.put(num, (LinkedList) ((LinkedList) aVar.f12154k.get(num)).clone());
        }
        Stack<C5110u> stack = new Stack<>();
        this.f12155l = stack;
        stack.addAll(aVar.f12155l);
        this.f12150g = new ArrayList();
        for (C5081c clone : aVar.f12150g) {
            this.f12150g.add(clone.clone());
        }
        this.f12156m = new TreeMap(aVar.f12156m);
        this.f12157n = aVar.f12157n;
        this.f12159p = aVar.f12159p;
        this.f12158o = false;
        mo11736b(bArr, bArr2, jVar);
    }
}
