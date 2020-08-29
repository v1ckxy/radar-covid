package p425x.p426a.p427a;

import java.util.Enumeration;
import java.util.Iterator;
import p425x.p426a.p427a.C4986t.C4987a;

/* renamed from: x.a.a.y1 */
public class C5004y1 extends C4986t {

    /* renamed from: f */
    public byte[] f11892f;

    public C5004y1(byte[] bArr) {
        this.f11892f = bArr;
    }

    /* renamed from: a */
    public synchronized void mo11548a(C4977q qVar, boolean z) {
        if (this.f11892f != null) {
            qVar.mo11622a(z, 48, this.f11892f);
        } else {
            super.mo11559l().mo11548a(qVar, z);
        }
    }

    /* renamed from: e */
    public synchronized C4929d mo11628e(int i) {
        mo11655p();
        return this.f11868e[i];
    }

    /* renamed from: h */
    public synchronized int mo11550h() {
        if (this.f11892f != null) {
            return C4924b2.m11131a(this.f11892f.length) + 1 + this.f11892f.length;
        }
        return super.mo11559l().mo11550h();
    }

    public synchronized int hashCode() {
        mo11655p();
        return super.hashCode();
    }

    public synchronized Iterator<C4929d> iterator() {
        mo11655p();
        return super.iterator();
    }

    /* renamed from: k */
    public synchronized C4983s mo11558k() {
        mo11655p();
        return super.mo11558k();
    }

    /* renamed from: l */
    public synchronized C4983s mo11559l() {
        mo11655p();
        return super.mo11559l();
    }

    /* renamed from: m */
    public synchronized Enumeration mo11630m() {
        if (this.f11892f != null) {
            return new C5001x1(this.f11892f);
        }
        return new C4987a();
    }

    /* renamed from: o */
    public C4929d[] mo11631o() {
        mo11655p();
        return this.f11868e;
    }

    /* renamed from: p */
    public final void mo11655p() {
        if (this.f11892f != null) {
            C4933e eVar = new C4933e(10);
            C5001x1 x1Var = new C5001x1(this.f11892f);
            while (x1Var.hasMoreElements()) {
                eVar.mo11573a((C4929d) (C4983s) x1Var.nextElement());
            }
            this.f11868e = eVar.mo11574a();
            this.f11892f = null;
        }
    }

    public synchronized int size() {
        mo11655p();
        return this.f11868e.length;
    }
}
