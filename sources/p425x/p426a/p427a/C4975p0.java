package p425x.p426a.p427a;

import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: x.a.a.p0 */
public class C4975p0 extends C4921b {
    public C4975p0(C4929d dVar) {
        super(dVar.mo11569f().mo11599a("DER"), 0);
    }

    public C4975p0(byte[] bArr) {
        super(bArr, 0);
    }

    public C4975p0(byte[] bArr, int i) {
        super(bArr, i);
    }

    /* renamed from: a */
    public static C4975p0 m11291a(Object obj) {
        if (obj == null || (obj instanceof C4975p0)) {
            return (C4975p0) obj;
        }
        if (obj instanceof C4963l1) {
            C4963l1 l1Var = (C4963l1) obj;
            return new C4975p0(l1Var.f11721e, l1Var.f11722f);
        } else if (obj instanceof byte[]) {
            try {
                return (C4975p0) C4983s.m11325a((byte[]) obj);
            } catch (Exception e) {
                StringBuilder a = C1965a.m4756a("encoding error in getInstance: ");
                a.append(e.toString());
                throw new IllegalArgumentException(a.toString());
            }
        } else {
            StringBuilder a2 = C1965a.m4756a("illegal object in getInstance: ");
            a2.append(obj.getClass().getName());
            throw new IllegalArgumentException(a2.toString());
        }
    }

    /* renamed from: a */
    public void mo11548a(C4977q qVar, boolean z) {
        byte[] bArr = this.f11721e;
        int length = bArr.length;
        if (length != 0) {
            int i = this.f11722f;
            if (i != 0) {
                int i2 = length - 1;
                if (bArr[i2] != ((byte) (bArr[i2] & (255 << i)))) {
                    byte b = (byte) (bArr[i2] & (255 << i));
                    byte b2 = (byte) i;
                    if (z) {
                        qVar.f11861a.write(3);
                    }
                    qVar.mo11616a(i2 + 2);
                    qVar.f11861a.write(b2);
                    qVar.f11861a.write(bArr, 0, i2);
                    qVar.f11861a.write(b);
                    return;
                }
            }
        }
        qVar.mo11619a(z, 3, (byte) this.f11722f, this.f11721e);
    }

    /* renamed from: h */
    public int mo11550h() {
        return C4924b2.m11131a(this.f11721e.length + 1) + 1 + this.f11721e.length + 1;
    }

    /* renamed from: i */
    public boolean mo11552i() {
        return false;
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
