package p003f.p004a.p005a.p012b.p087k.p092b.p094b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import p003f.p004a.p005a.p006a.p010d.C0488o;
import p003f.p004a.p005a.p006a.p010d.C0490q;
import p003f.p004a.p005a.p012b.p087k.p092b.p095c.C0664a;
import p003f.p004a.p005a.p012b.p087k.p092b.p095c.C0665b;
import p003f.p004a.p005a.p012b.p087k.p092b.p095c.C0666c;
import p003f.p004a.p005a.p108g.p114c.p115p.C0855a;
import p003f.p004a.p005a.p108g.p114c.p115p.C0857b;
import p003f.p004a.p005a.p108g.p114c.p115p.C0860c;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p392u.C4560l;
import p392u.p393n.C4568g;
import p392u.p401r.p402b.C4607a;
import p392u.p401r.p402b.C4618l;
import p392u.p401r.p403c.C4638h;
import p425x.p482c.p483a.C5244a;

/* renamed from: f.a.a.b.k.b.b.e */
public final class C0663e implements C0664a {

    /* renamed from: a */
    public List<C0857b> f2099a;

    /* renamed from: b */
    public List<C0857b> f2100b;

    /* renamed from: c */
    public final C0666c f2101c;

    /* renamed from: d */
    public final C0665b f2102d;

    /* renamed from: e */
    public final C0490q f2103e;

    /* renamed from: f */
    public final C0860c f2104f;

    public C0663e(C0666c cVar, C0665b bVar, C0490q qVar, C0860c cVar2) {
        if (cVar == null) {
            C4638h.m10271a("view");
            throw null;
        } else if (bVar == null) {
            C4638h.m10271a("router");
            throw null;
        } else if (qVar == null) {
            C4638h.m10271a("pollUseCase");
            throw null;
        } else if (cVar2 != null) {
            this.f2101c = cVar;
            this.f2102d = bVar;
            this.f2103e = qVar;
            this.f2104f = cVar2;
        } else {
            C4638h.m10271a("questionViewModelFactory");
            throw null;
        }
    }

    /* renamed from: a */
    public void mo3842a(C0857b bVar) {
        if (bVar != null) {
            List<C0855a> list = bVar.f2437h;
            boolean z = false;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((C0855a) it.next()).f2433g) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z) {
                mo3847d(bVar);
            } else {
                this.f2101c.mo3201m();
            }
        } else {
            C4638h.m10271a("currentQuestion");
            throw null;
        }
    }

    /* renamed from: b */
    public final C0857b mo3843b(C0857b bVar) {
        List<C0857b> list = this.f2099a;
        String str = "parentQuestions";
        if (list != null) {
            int indexOf = list.indexOf(bVar);
            List<C0857b> list2 = this.f2099a;
            if (list2 == null) {
                C4638h.m10273b(str);
                throw null;
            } else if (indexOf == list2.size() - 1) {
                return null;
            } else {
                List<C0857b> list3 = this.f2099a;
                if (list3 != null) {
                    return (C0857b) list3.get(indexOf + 1);
                }
                C4638h.m10273b(str);
                throw null;
            }
        } else {
            C4638h.m10273b(str);
            throw null;
        }
    }

    /* renamed from: b */
    public void mo3844b() {
        mo3847d(this.f2101c.mo3200c());
    }

    /* renamed from: c */
    public final C0857b mo3845c(C0857b bVar) {
        boolean z;
        List<C0857b> list = this.f2099a;
        Object obj = null;
        if (list != null) {
            List<C0857b> list2 = this.f2100b;
            if (list2 != null) {
                Iterator it = C4568g.m10218a((Collection<? extends T>) list, (Iterable<? extends T>) list2).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (bVar.f2438i == ((C0857b) next).f2434e) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        obj = next;
                        break;
                    }
                }
                C0857b bVar2 = (C0857b) obj;
                if (bVar2 != null) {
                    return bVar2;
                }
                C0857b bVar3 = new C0857b(0, null, null, null, 0, 0, 0, 0, 255);
                return bVar3;
            }
            C4638h.m10273b("childQuestions");
            throw null;
        }
        C4638h.m10273b("parentQuestions");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        if (r5 != null) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00fe, code lost:
        if (r0 == (r6.size() - 1)) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0128, code lost:
        if (r0 == (r6.size() - 1)) goto L_0x012a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00cf  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3847d(p003f.p004a.p005a.p108g.p114c.p115p.C0857b r11) {
        /*
            r10 = this;
            boolean r0 = r11.mo3953a()
            java.lang.String r1 = "childQuestions"
            r2 = 0
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L_0x003e
            java.util.List<f.a.a.g.c.p.b> r0 = r10.f2100b
            if (r0 == 0) goto L_0x003a
            java.util.Iterator r0 = r0.iterator()
        L_0x0013:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0034
            java.lang.Object r5 = r0.next()
            r6 = r5
            f.a.a.g.c.p.b r6 = (p003f.p004a.p005a.p108g.p114c.p115p.C0857b) r6
            int r7 = r6.f2438i
            int r8 = r11.f2434e
            if (r7 != r8) goto L_0x0030
            int r6 = r6.f2439j
            boolean r6 = r11.mo3954a(r6)
            if (r6 == 0) goto L_0x0030
            r6 = r3
            goto L_0x0031
        L_0x0030:
            r6 = r2
        L_0x0031:
            if (r6 == 0) goto L_0x0013
            goto L_0x0035
        L_0x0034:
            r5 = r4
        L_0x0035:
            f.a.a.g.c.p.b r5 = (p003f.p004a.p005a.p108g.p114c.p115p.C0857b) r5
            if (r5 == 0) goto L_0x0089
            goto L_0x009a
        L_0x003a:
            p392u.p401r.p403c.C4638h.m10273b(r1)
            throw r4
        L_0x003e:
            java.util.List<f.a.a.g.c.p.b> r0 = r10.f2100b
            if (r0 == 0) goto L_0x013f
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x004b:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x006d
            java.lang.Object r6 = r0.next()
            r7 = r6
            f.a.a.g.c.p.b r7 = (p003f.p004a.p005a.p108g.p114c.p115p.C0857b) r7
            int r8 = r7.f2438i
            int r9 = r11.f2438i
            if (r8 != r9) goto L_0x0066
            int r7 = r7.f2439j
            int r8 = r11.f2439j
            if (r7 != r8) goto L_0x0066
            r7 = r3
            goto L_0x0067
        L_0x0066:
            r7 = r2
        L_0x0067:
            if (r7 == 0) goto L_0x004b
            r5.add(r6)
            goto L_0x004b
        L_0x006d:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0137
            int r0 = r5.size()
            int r0 = r0 + -1
            java.lang.Object r0 = r5.get(r0)
            f.a.a.g.c.p.b r0 = (p003f.p004a.p005a.p108g.p114c.p115p.C0857b) r0
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r11)
            if (r0 == 0) goto L_0x008e
            f.a.a.g.c.p.b r11 = r10.mo3845c(r11)
        L_0x0089:
            f.a.a.g.c.p.b r5 = r10.mo3843b(r11)
            goto L_0x009a
        L_0x008e:
            int r11 = r5.indexOf(r11)
            int r11 = r11 + r3
            java.lang.Object r11 = r5.get(r11)
            r5 = r11
            f.a.a.g.c.p.b r5 = (p003f.p004a.p005a.p108g.p114c.p115p.C0857b) r5
        L_0x009a:
            java.lang.String r11 = "parentQuestions"
            if (r5 != 0) goto L_0x00cf
            java.util.List<f.a.a.g.c.p.b> r0 = r10.f2099a
            if (r0 == 0) goto L_0x00cb
            java.util.List<f.a.a.g.c.p.b> r11 = r10.f2100b
            if (r11 == 0) goto L_0x00c7
            java.util.List r11 = p392u.p393n.C4568g.m10218a(r0, r11)
            f.a.a.b.k.b.c.c r0 = r10.f2101c
            r0.mo3942B()
            f.a.a.a.d.q r0 = r10.f2103e
            f.a.a.b.k.b.b.a r1 = new f.a.a.b.k.b.b.a
            r1.<init>(r10)
            f.a.a.b.k.b.b.b r2 = new f.a.a.b.k.b.b.b
            r2.<init>(r10)
            if (r0 == 0) goto L_0x00c6
            f.a.a.a.d.p r3 = new f.a.a.a.d.p
            r3.<init>(r0, r11)
            p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5250a(r1, r2, r3)
            goto L_0x012e
        L_0x00c6:
            throw r4
        L_0x00c7:
            p392u.p401r.p403c.C4638h.m10273b(r1)
            throw r4
        L_0x00cb:
            p392u.p401r.p403c.C4638h.m10273b(r11)
            throw r4
        L_0x00cf:
            boolean r0 = r5.mo3953a()
            if (r0 == 0) goto L_0x0111
            java.util.List<f.a.a.g.c.p.b> r0 = r10.f2099a
            if (r0 == 0) goto L_0x010d
            int r0 = r0.indexOf(r5)
            f.a.a.b.k.b.c.c r1 = r10.f2101c
            java.util.List<f.a.a.g.c.p.b> r6 = r10.f2099a
            if (r6 == 0) goto L_0x0109
            int r6 = r6.indexOf(r5)
            int r6 = r6 + r3
            java.util.List<f.a.a.g.c.p.b> r7 = r10.f2099a
            if (r7 == 0) goto L_0x0105
            int r7 = r7.size()
            r1.mo3196a(r6, r7)
            f.a.a.b.k.b.c.c r1 = r10.f2101c
            java.util.List<f.a.a.g.c.p.b> r6 = r10.f2099a
            if (r6 == 0) goto L_0x0101
            int r11 = r6.size()
            int r11 = r11 - r3
            if (r0 != r11) goto L_0x012b
            goto L_0x012a
        L_0x0101:
            p392u.p401r.p403c.C4638h.m10273b(r11)
            throw r4
        L_0x0105:
            p392u.p401r.p403c.C4638h.m10273b(r11)
            throw r4
        L_0x0109:
            p392u.p401r.p403c.C4638h.m10273b(r11)
            throw r4
        L_0x010d:
            p392u.p401r.p403c.C4638h.m10273b(r11)
            throw r4
        L_0x0111:
            java.util.List<f.a.a.g.c.p.b> r0 = r10.f2099a
            if (r0 == 0) goto L_0x0133
            f.a.a.g.c.p.b r1 = r10.mo3845c(r5)
            int r0 = r0.indexOf(r1)
            f.a.a.b.k.b.c.c r1 = r10.f2101c
            java.util.List<f.a.a.g.c.p.b> r6 = r10.f2099a
            if (r6 == 0) goto L_0x012f
            int r11 = r6.size()
            int r11 = r11 - r3
            if (r0 != r11) goto L_0x012b
        L_0x012a:
            r2 = r3
        L_0x012b:
            r1.mo3198a(r2, r5)
        L_0x012e:
            return
        L_0x012f:
            p392u.p401r.p403c.C4638h.m10273b(r11)
            throw r4
        L_0x0133:
            p392u.p401r.p403c.C4638h.m10273b(r11)
            throw r4
        L_0x0137:
            java.util.NoSuchElementException r11 = new java.util.NoSuchElementException
            java.lang.String r0 = "List is empty."
            r11.<init>(r0)
            throw r11
        L_0x013f:
            p392u.p401r.p403c.C4638h.m10273b(r1)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p003f.p004a.p005a.p012b.p087k.p092b.p094b.C0663e.mo3847d(f.a.a.g.c.p.b):void");
    }

    /* renamed from: c */
    public void mo3846c() {
        C0857b bVar;
        Object obj;
        boolean z;
        C0857b c = this.f2101c.mo3200c();
        String str = "childQuestions";
        boolean z2 = false;
        String str2 = "parentQuestions";
        if (c.mo3953a()) {
            List<C0857b> list = this.f2099a;
            if (list != null) {
                int indexOf = list.indexOf(c);
                if (indexOf == 0) {
                    bVar = null;
                } else {
                    List<C0857b> list2 = this.f2099a;
                    if (list2 != null) {
                        bVar = (C0857b) list2.get(indexOf - 1);
                    } else {
                        C4638h.m10273b(str2);
                        throw null;
                    }
                }
                if (bVar != null) {
                    List<C0857b> list3 = this.f2100b;
                    if (list3 != null) {
                        ListIterator listIterator = list3.listIterator(list3.size());
                        while (true) {
                            if (!listIterator.hasPrevious()) {
                                obj = null;
                                break;
                            }
                            obj = listIterator.previous();
                            C0857b bVar2 = (C0857b) obj;
                            if (bVar2.f2438i != bVar.f2434e || !bVar.mo3954a(bVar2.f2439j)) {
                                z = false;
                                continue;
                            } else {
                                z = true;
                                continue;
                            }
                            if (z) {
                                break;
                            }
                        }
                        C0857b bVar3 = (C0857b) obj;
                        if (bVar3 != null) {
                            bVar = bVar3;
                        }
                    } else {
                        C4638h.m10273b(str);
                        throw null;
                    }
                } else {
                    bVar = null;
                }
            } else {
                C4638h.m10273b(str2);
                throw null;
            }
        } else {
            List<C0857b> list4 = this.f2100b;
            if (list4 != null) {
                ArrayList arrayList = new ArrayList();
                for (Object next : list4) {
                    C0857b bVar4 = (C0857b) next;
                    if (bVar4.f2438i == c.f2438i && bVar4.f2439j == c.f2439j) {
                        arrayList.add(next);
                    }
                }
                if (!arrayList.isEmpty()) {
                    bVar = C4638h.m10272a((Object) (C0857b) arrayList.get(0), (Object) c) ? mo3845c(c) : (C0857b) arrayList.get(arrayList.indexOf(c) - 1);
                } else {
                    throw new NoSuchElementException("List is empty.");
                }
            } else {
                C4638h.m10273b(str);
                throw null;
            }
        }
        if (bVar == null) {
            this.f2101c.finish();
        } else if (c.mo3953a()) {
            C0666c cVar = this.f2101c;
            List<C0857b> list5 = this.f2099a;
            if (list5 != null) {
                int indexOf2 = list5.indexOf(c);
                List<C0857b> list6 = this.f2099a;
                if (list6 != null) {
                    cVar.mo3196a(indexOf2, list6.size());
                    this.f2101c.mo3198a(false, bVar);
                    return;
                }
                C4638h.m10273b(str2);
                throw null;
            }
            C4638h.m10273b(str2);
            throw null;
        } else {
            List<C0857b> list7 = this.f2099a;
            if (list7 != null) {
                int indexOf3 = list7.indexOf(mo3845c(bVar));
                C0666c cVar2 = this.f2101c;
                List<C0857b> list8 = this.f2099a;
                if (list8 != null) {
                    if (indexOf3 == list8.size() - 1) {
                        z2 = true;
                    }
                    cVar2.mo3198a(z2, bVar);
                    return;
                }
                C4638h.m10273b(str2);
                throw null;
            }
            C4638h.m10273b(str2);
            throw null;
        }
    }

    /* renamed from: a */
    public void mo3841a() {
        this.f2101c.mo3202o();
        this.f2101c.mo3942B();
        C0490q qVar = this.f2103e;
        C0661c cVar = new C0661c(this);
        C0662d dVar = new C0662d(this);
        if (qVar != null) {
            C2286e.m5250a((C4618l<? super T, C4560l>) cVar, (C4618l<? super Throwable, C4560l>) dVar, (C4607a<? extends C5244a<? extends Throwable, ? extends T>>) new C0488o<Object>(qVar));
            return;
        }
        throw null;
    }
}
