package p425x.p426a.p427a;

import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: x.a.a.h */
public abstract class C4947h extends C4983s {

    /* renamed from: e */
    public C4967n f11824e;

    /* renamed from: f */
    public C4958k f11825f;

    /* renamed from: g */
    public C4983s f11826g;

    /* renamed from: h */
    public int f11827h;

    /* renamed from: i */
    public C4983s f11828i;

    public C4947h(C4933e eVar) {
        int i = 0;
        C4983s a = mo11583a(eVar, 0);
        if (a instanceof C4967n) {
            this.f11824e = (C4967n) a;
            a = mo11583a(eVar, 1);
            i = 1;
        }
        if (a instanceof C4958k) {
            this.f11825f = (C4958k) a;
            i++;
            a = mo11583a(eVar, i);
        }
        if (!(a instanceof C5005z)) {
            this.f11826g = a;
            i++;
            a = mo11583a(eVar, i);
        }
        if (eVar.f11772b != i + 1) {
            throw new IllegalArgumentException("input vector too large");
        } else if (a instanceof C5005z) {
            C5005z zVar = (C5005z) a;
            mo11584e(zVar.f11893e);
            this.f11828i = zVar.mo11656m();
        } else {
            throw new IllegalArgumentException("No tagged object found in vector. Structure doesn't seem to be of type External");
        }
    }

    /* renamed from: a */
    public final C4983s mo11583a(C4933e eVar, int i) {
        if (eVar.f11772b > i) {
            return eVar.mo11572a(i).mo11569f();
        }
        throw new IllegalArgumentException("too few objects in input vector");
    }

    /* renamed from: a */
    public boolean mo11549a(C4983s sVar) {
        if (!(sVar instanceof C4947h)) {
            return false;
        }
        if (this == sVar) {
            return true;
        }
        C4947h hVar = (C4947h) sVar;
        C4967n nVar = this.f11824e;
        if (nVar != null) {
            C4967n nVar2 = hVar.f11824e;
            if (nVar2 == null || !nVar2.mo11626b(nVar)) {
                return false;
            }
        }
        C4958k kVar = this.f11825f;
        if (kVar != null) {
            C4958k kVar2 = hVar.f11825f;
            if (kVar2 == null || !kVar2.mo11626b(kVar)) {
                return false;
            }
        }
        C4983s sVar2 = this.f11826g;
        if (sVar2 != null) {
            C4983s sVar3 = hVar.f11826g;
            if (sVar3 == null || !sVar3.mo11626b(sVar2)) {
                return false;
            }
        }
        return this.f11828i.mo11626b(hVar.f11828i);
    }

    /* renamed from: e */
    public final void mo11584e(int i) {
        if (i < 0 || i > 2) {
            throw new IllegalArgumentException(C1965a.m4761b("invalid encoding value: ", i));
        }
        this.f11827h = i;
    }

    /* renamed from: h */
    public int mo11550h() {
        return getEncoded().length;
    }

    public int hashCode() {
        C4967n nVar = this.f11824e;
        int hashCode = nVar != null ? nVar.hashCode() : 0;
        C4958k kVar = this.f11825f;
        if (kVar != null) {
            hashCode ^= kVar.hashCode();
        }
        C4983s sVar = this.f11826g;
        if (sVar != null) {
            hashCode ^= sVar.hashCode();
        }
        return hashCode ^ this.f11828i.hashCode();
    }

    /* renamed from: i */
    public boolean mo11552i() {
        return true;
    }

    /* renamed from: k */
    public C4983s mo11558k() {
        C4978q0 q0Var = new C4978q0(this.f11824e, this.f11825f, this.f11826g, this.f11827h, this.f11828i);
        return q0Var;
    }

    /* renamed from: l */
    public C4983s mo11559l() {
        C4966m1 m1Var = new C4966m1(this.f11824e, this.f11825f, this.f11826g, this.f11827h, this.f11828i);
        return m1Var;
    }

    public C4947h(C4967n nVar, C4958k kVar, C4983s sVar, int i, C4983s sVar2) {
        this.f11824e = nVar;
        this.f11825f = kVar;
        this.f11826g = sVar;
        mo11584e(i);
        if (sVar2 != null) {
            this.f11828i = sVar2;
            return;
        }
        throw null;
    }
}
