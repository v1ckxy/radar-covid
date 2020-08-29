package p124p.p144f.p145a.p146h;

import p124p.p144f.p145a.C1267e;
import p124p.p144f.p145a.C1270g;
import p124p.p144f.p145a.p146h.C1274c.C1277c;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: p.f.a.h.j */
public class C1285j extends C1287l {

    /* renamed from: c */
    public C1274c f3803c;

    /* renamed from: d */
    public C1285j f3804d;

    /* renamed from: e */
    public float f3805e;

    /* renamed from: f */
    public C1285j f3806f;

    /* renamed from: g */
    public float f3807g;

    /* renamed from: h */
    public int f3808h = 0;

    /* renamed from: i */
    public C1285j f3809i;

    /* renamed from: j */
    public C1286k f3810j = null;

    /* renamed from: k */
    public int f3811k = 1;

    /* renamed from: l */
    public C1286k f3812l = null;

    /* renamed from: m */
    public int f3813m = 1;

    public C1285j(C1274c cVar) {
        this.f3803c = cVar;
    }

    /* renamed from: a */
    public String mo5723a(int i) {
        return i == 1 ? "DIRECT" : i == 2 ? "CENTER" : i == 3 ? "MATCH" : i == 4 ? "CHAIN" : i == 5 ? "BARRIER" : "UNCONNECTED";
    }

    /* renamed from: a */
    public void mo5725a(C1267e eVar) {
        C1270g gVar = this.f3803c.f3677i;
        C1285j jVar = this.f3806f;
        if (jVar == null) {
            eVar.mo5648a(gVar, (int) (this.f3807g + 0.5f));
        } else {
            eVar.mo5641a(gVar, eVar.mo5643a((Object) jVar.f3803c), (int) (this.f3807g + 0.5f), 6);
        }
    }

    /* renamed from: a */
    public void mo5726a(C1285j jVar, float f) {
        if (this.f3816b == 0 || !(this.f3806f == jVar || this.f3807g == f)) {
            this.f3806f = jVar;
            this.f3807g = f;
            if (this.f3816b == 1) {
                mo5734b();
            }
            mo5733a();
        }
    }

    /* renamed from: d */
    public void mo5729d() {
        C1285j jVar;
        float f;
        float f2;
        float f3;
        float f4;
        boolean z = true;
        if (this.f3816b != 1 && this.f3808h != 4) {
            C1286k kVar = this.f3810j;
            if (kVar != null) {
                if (kVar.f3816b == 1) {
                    this.f3805e = ((float) this.f3811k) * kVar.f3814c;
                } else {
                    return;
                }
            }
            C1286k kVar2 = this.f3812l;
            if (kVar2 != null) {
                if (kVar2.f3816b == 1) {
                    float f5 = kVar2.f3814c;
                } else {
                    return;
                }
            }
            if (this.f3808h == 1) {
                C1285j jVar2 = this.f3804d;
                if (jVar2 == null || jVar2.f3816b == 1) {
                    C1285j jVar3 = this.f3804d;
                    if (jVar3 == null) {
                        this.f3806f = this;
                        f4 = this.f3805e;
                    } else {
                        this.f3806f = jVar3.f3806f;
                        f4 = jVar3.f3807g + this.f3805e;
                    }
                    this.f3807g = f4;
                    mo5733a();
                }
            }
            if (this.f3808h == 2) {
                C1285j jVar4 = this.f3804d;
                if (jVar4 != null && jVar4.f3816b == 1) {
                    C1285j jVar5 = this.f3809i;
                    if (jVar5 != null) {
                        C1285j jVar6 = jVar5.f3804d;
                        if (jVar6 != null && jVar6.f3816b == 1) {
                            this.f3806f = jVar4.f3806f;
                            jVar5.f3806f = jVar6.f3806f;
                            C1277c cVar = this.f3803c.f3671c;
                            int i = 0;
                            if (!(cVar == C1277c.RIGHT || cVar == C1277c.BOTTOM)) {
                                z = false;
                            }
                            if (z) {
                                f = this.f3804d.f3807g;
                                jVar = this.f3809i.f3804d;
                            } else {
                                f = this.f3809i.f3804d.f3807g;
                                jVar = this.f3804d;
                            }
                            float f6 = f - jVar.f3807g;
                            C1274c cVar2 = this.f3803c;
                            C1277c cVar3 = cVar2.f3671c;
                            if (cVar3 == C1277c.LEFT || cVar3 == C1277c.RIGHT) {
                                f3 = f6 - ((float) this.f3803c.f3670b.mo5705j());
                                f2 = this.f3803c.f3670b.f3717V;
                            } else {
                                f3 = f6 - ((float) cVar2.f3670b.mo5696d());
                                f2 = this.f3803c.f3670b.f3718W;
                            }
                            int a = this.f3803c.mo5674a();
                            int a2 = this.f3809i.f3803c.mo5674a();
                            if (this.f3803c.f3672d == this.f3809i.f3803c.f3672d) {
                                f2 = 0.5f;
                                a2 = 0;
                            } else {
                                i = a;
                            }
                            float f7 = (float) i;
                            float f8 = (float) a2;
                            float f9 = (f3 - f7) - f8;
                            if (z) {
                                C1285j jVar7 = this.f3809i;
                                jVar7.f3807g = (f9 * f2) + jVar7.f3804d.f3807g + f8;
                                this.f3807g = (this.f3804d.f3807g - f7) - ((1.0f - f2) * f9);
                            } else {
                                this.f3807g = (f9 * f2) + this.f3804d.f3807g + f7;
                                C1285j jVar8 = this.f3809i;
                                jVar8.f3807g = (jVar8.f3804d.f3807g - f8) - ((1.0f - f2) * f9);
                            }
                            mo5733a();
                            this.f3809i.mo5733a();
                        }
                    }
                }
            }
            if (this.f3808h == 3) {
                C1285j jVar9 = this.f3804d;
                if (jVar9 != null && jVar9.f3816b == 1) {
                    C1285j jVar10 = this.f3809i;
                    if (jVar10 != null) {
                        C1285j jVar11 = jVar10.f3804d;
                        if (jVar11 != null && jVar11.f3816b == 1) {
                            this.f3806f = jVar9.f3806f;
                            jVar10.f3806f = jVar11.f3806f;
                            this.f3807g = jVar9.f3807g + this.f3805e;
                            jVar10.f3807g = jVar11.f3807g + jVar10.f3805e;
                            mo5733a();
                            this.f3809i.mo5733a();
                        }
                    }
                }
            }
            if (this.f3808h == 5) {
                this.f3803c.f3670b.mo5673n();
            }
        }
    }

    /* renamed from: e */
    public void mo5730e() {
        this.f3816b = 0;
        this.f3815a.clear();
        this.f3804d = null;
        this.f3805e = 0.0f;
        this.f3810j = null;
        this.f3811k = 1;
        this.f3812l = null;
        this.f3813m = 1;
        this.f3806f = null;
        this.f3807g = 0.0f;
        this.f3809i = null;
        this.f3808h = 0;
    }

    public String toString() {
        String str;
        StringBuilder sb;
        if (this.f3816b == 1) {
            String str2 = ", RESOLVED: ";
            String str3 = "[";
            if (this.f3806f == this) {
                sb = C1965a.m4756a(str3);
                sb.append(this.f3803c);
                sb.append(str2);
                sb.append(this.f3807g);
                str = "]  type: ";
            } else {
                sb = C1965a.m4756a(str3);
                sb.append(this.f3803c);
                sb.append(str2);
                sb.append(this.f3806f);
                sb.append(":");
                sb.append(this.f3807g);
                str = "] type: ";
            }
        } else {
            sb = C1965a.m4756a("{ ");
            sb.append(this.f3803c);
            str = " UNRESOLVED} type: ";
        }
        sb.append(str);
        sb.append(mo5723a(this.f3808h));
        return sb.toString();
    }

    /* renamed from: a */
    public void mo5724a(int i, C1285j jVar, int i2) {
        this.f3808h = i;
        this.f3804d = jVar;
        this.f3805e = (float) i2;
        jVar.f3815a.add(this);
    }

    /* renamed from: a */
    public void mo5727a(C1285j jVar, int i) {
        this.f3804d = jVar;
        this.f3805e = (float) i;
        jVar.f3815a.add(this);
    }

    /* renamed from: a */
    public void mo5728a(C1285j jVar, int i, C1286k kVar) {
        this.f3804d = jVar;
        jVar.f3815a.add(this);
        this.f3810j = kVar;
        this.f3811k = i;
        kVar.f3815a.add(this);
    }
}
