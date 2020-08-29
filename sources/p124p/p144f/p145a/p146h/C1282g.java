package p124p.p144f.p145a.p146h;

import java.util.ArrayList;
import p124p.p144f.p145a.C1264b;
import p124p.p144f.p145a.C1267e;
import p124p.p144f.p145a.C1270g;
import p124p.p144f.p145a.p146h.C1274c.C1277c;
import p124p.p144f.p145a.p146h.C1278d.C1279a;

/* renamed from: p.f.a.h.g */
public class C1282g extends C1278d {

    /* renamed from: k0 */
    public float f3794k0 = -1.0f;

    /* renamed from: l0 */
    public int f3795l0 = -1;

    /* renamed from: m0 */
    public int f3796m0 = -1;

    /* renamed from: n0 */
    public C1274c f3797n0 = this.f3750t;

    /* renamed from: o0 */
    public int f3798o0;

    /* renamed from: p0 */
    public boolean f3799p0;

    public C1282g() {
        this.f3798o0 = 0;
        this.f3799p0 = false;
        this.f3697B.clear();
        this.f3697B.add(this.f3797n0);
        int length = this.f3696A.length;
        for (int i = 0; i < length; i++) {
            this.f3696A[i] = this.f3797n0;
        }
    }

    /* renamed from: a */
    public C1274c mo5680a(C1277c cVar) {
        switch (cVar.ordinal()) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
            case 3:
                if (this.f3798o0 == 1) {
                    return this.f3797n0;
                }
                break;
            case 2:
            case 4:
                if (this.f3798o0 == 0) {
                    return this.f3797n0;
                }
                break;
        }
        throw new AssertionError(cVar.name());
    }

    /* renamed from: a */
    public void mo5670a(C1267e eVar) {
        C1280e eVar2 = (C1280e) this.f3699D;
        if (eVar2 != null) {
            C1274c a = eVar2.mo5680a(C1277c.LEFT);
            C1274c a2 = eVar2.mo5680a(C1277c.RIGHT);
            C1278d dVar = this.f3699D;
            boolean z = true;
            boolean z2 = dVar != null && dVar.f3698C[0] == C1279a.WRAP_CONTENT;
            if (this.f3798o0 == 0) {
                a = eVar2.mo5680a(C1277c.TOP);
                a2 = eVar2.mo5680a(C1277c.BOTTOM);
                C1278d dVar2 = this.f3699D;
                if (dVar2 == null || dVar2.f3698C[1] != C1279a.WRAP_CONTENT) {
                    z = false;
                }
                z2 = z;
            }
            if (this.f3795l0 != -1) {
                C1270g a3 = eVar.mo5643a((Object) this.f3797n0);
                eVar.mo5641a(a3, eVar.mo5643a((Object) a), this.f3795l0, 6);
                if (z2) {
                    eVar.mo5655b(eVar.mo5643a((Object) a2), a3, 0, 5);
                }
            } else if (this.f3796m0 != -1) {
                C1270g a4 = eVar.mo5643a((Object) this.f3797n0);
                C1270g a5 = eVar.mo5643a((Object) a2);
                eVar.mo5641a(a4, a5, -this.f3796m0, 6);
                if (z2) {
                    eVar.mo5655b(a4, eVar.mo5643a((Object) a), 0, 5);
                    eVar.mo5655b(a5, a4, 0, 5);
                }
            } else if (this.f3794k0 != -1.0f) {
                C1270g a6 = eVar.mo5643a((Object) this.f3797n0);
                C1270g a7 = eVar.mo5643a((Object) a);
                C1270g a8 = eVar.mo5643a((Object) a2);
                float f = this.f3794k0;
                boolean z3 = this.f3799p0;
                C1264b b = eVar.mo5653b();
                if (z3) {
                    b.mo5633a(eVar, 0);
                }
                b.f3609d.mo5628a(a6, -1.0f);
                b.f3609d.mo5628a(a7, 1.0f - f);
                b.f3609d.mo5628a(a8, f);
                eVar.mo5646a(b);
            }
        }
    }

    /* renamed from: a */
    public boolean mo5671a() {
        return true;
    }

    /* renamed from: b */
    public ArrayList<C1274c> mo5687b() {
        return this.f3697B;
    }

    /* renamed from: c */
    public void mo5695c(C1267e eVar) {
        if (this.f3699D != null) {
            int b = eVar.mo5651b((Object) this.f3797n0);
            if (this.f3798o0 == 1) {
                this.f3704I = b;
                this.f3705J = 0;
                mo5699e(this.f3699D.mo5696d());
                mo5701f(0);
            } else {
                this.f3704I = 0;
                this.f3705J = b;
                mo5701f(this.f3699D.mo5705j());
                mo5699e(0);
            }
        }
    }

    /* renamed from: g */
    public void mo5722g(int i) {
        if (this.f3798o0 != i) {
            this.f3798o0 = i;
            this.f3697B.clear();
            this.f3797n0 = this.f3798o0 == 1 ? this.f3749s : this.f3750t;
            this.f3697B.add(this.f3797n0);
            int length = this.f3696A.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.f3696A[i2] = this.f3797n0;
            }
        }
    }

    /* renamed from: a */
    public void mo5669a(int i) {
        C1274c cVar;
        C1285j jVar;
        int i2;
        C1274c cVar2;
        C1285j jVar2;
        C1285j jVar3;
        int i3;
        C1274c cVar3;
        C1285j jVar4;
        C1278d dVar = this.f3699D;
        if (dVar != null) {
            if (this.f3798o0 == 1) {
                this.f3750t.f3669a.mo5724a(1, dVar.f3750t.f3669a, 0);
                this.f3752v.f3669a.mo5724a(1, dVar.f3750t.f3669a, 0);
                int i4 = this.f3795l0;
                if (i4 != -1) {
                    this.f3749s.f3669a.mo5724a(1, dVar.f3749s.f3669a, i4);
                    jVar2 = this.f3751u.f3669a;
                    cVar3 = dVar.f3749s;
                } else {
                    int i5 = this.f3796m0;
                    if (i5 != -1) {
                        this.f3749s.f3669a.mo5724a(1, dVar.f3751u.f3669a, -i5);
                        jVar4 = this.f3751u.f3669a;
                        cVar2 = dVar.f3751u;
                        jVar3 = cVar2.f3669a;
                        i3 = -this.f3796m0;
                        jVar2.mo5724a(1, jVar3, i3);
                    }
                    if (this.f3794k0 != -1.0f && dVar.mo5698e() == C1279a.FIXED) {
                        i2 = (int) (((float) dVar.f3700E) * this.f3794k0);
                        this.f3749s.f3669a.mo5724a(1, dVar.f3749s.f3669a, i2);
                        jVar = this.f3751u.f3669a;
                        cVar = dVar.f3749s;
                        jVar.mo5724a(1, cVar.f3669a, i2);
                    }
                }
            } else {
                this.f3749s.f3669a.mo5724a(1, dVar.f3749s.f3669a, 0);
                this.f3751u.f3669a.mo5724a(1, dVar.f3749s.f3669a, 0);
                int i6 = this.f3795l0;
                if (i6 != -1) {
                    this.f3750t.f3669a.mo5724a(1, dVar.f3750t.f3669a, i6);
                    jVar2 = this.f3752v.f3669a;
                    cVar3 = dVar.f3750t;
                } else {
                    int i7 = this.f3796m0;
                    if (i7 != -1) {
                        this.f3750t.f3669a.mo5724a(1, dVar.f3752v.f3669a, -i7);
                        jVar4 = this.f3752v.f3669a;
                        cVar2 = dVar.f3752v;
                        jVar3 = cVar2.f3669a;
                        i3 = -this.f3796m0;
                        jVar2.mo5724a(1, jVar3, i3);
                    }
                    if (this.f3794k0 != -1.0f && dVar.mo5704i() == C1279a.FIXED) {
                        i2 = (int) (((float) dVar.f3701F) * this.f3794k0);
                        this.f3750t.f3669a.mo5724a(1, dVar.f3750t.f3669a, i2);
                        jVar = this.f3752v.f3669a;
                        cVar = dVar.f3750t;
                        jVar.mo5724a(1, cVar.f3669a, i2);
                    }
                }
            }
            jVar3 = cVar3.f3669a;
            i3 = this.f3795l0;
            jVar2.mo5724a(1, jVar3, i3);
        }
    }
}
