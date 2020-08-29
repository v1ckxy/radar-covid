package p425x.p426a.p427a;

import java.io.ByteArrayOutputStream;

/* renamed from: x.a.a.q0 */
public class C4978q0 extends C4947h {
    public C4978q0(C4967n nVar, C4958k kVar, C4983s sVar, int i, C4983s sVar2) {
        super(nVar, kVar, sVar, i, sVar2);
    }

    /* renamed from: a */
    public void mo11548a(C4977q qVar, boolean z) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C4967n nVar = this.f11824e;
        String str = "DER";
        if (nVar != null) {
            byteArrayOutputStream.write(nVar.mo11599a(str));
        }
        C4958k kVar = this.f11825f;
        if (kVar != null) {
            byteArrayOutputStream.write(kVar.mo11599a(str));
        }
        C4983s sVar = this.f11826g;
        if (sVar != null) {
            byteArrayOutputStream.write(sVar.mo11599a(str));
        }
        byteArrayOutputStream.write(new C4940f1(true, this.f11827h, this.f11828i).mo11599a(str));
        qVar.mo11621a(z, 32, 8, byteArrayOutputStream.toByteArray());
    }

    /* renamed from: h */
    public int mo11550h() {
        return getEncoded().length;
    }

    /* renamed from: k */
    public C4983s mo11558k() {
        return this;
    }

    /* renamed from: l */
    public C4983s mo11559l() {
        return this;
    }
}
