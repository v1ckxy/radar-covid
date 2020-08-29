package p425x.p426a.p427a;

import p425x.p426a.p469f.C5167h;

/* renamed from: x.a.a.t0 */
public class C4988t0 extends C4952i {
    public C4988t0(byte[] bArr) {
        super(bArr);
    }

    /* renamed from: a */
    public void mo11548a(C4977q qVar, boolean z) {
        qVar.mo11622a(z, 24, mo11636m());
    }

    /* renamed from: h */
    public int mo11550h() {
        int length = mo11636m().length;
        return C4924b2.m11131a(length) + 1 + length;
    }

    /* renamed from: k */
    public C4983s mo11558k() {
        return this;
    }

    /* renamed from: l */
    public C4983s mo11559l() {
        return this;
    }

    /* renamed from: m */
    public final byte[] mo11636m() {
        boolean z;
        byte[] bArr = this.f11835e;
        if (bArr[bArr.length - 1] == 90) {
            if (!(mo11587e(10) && mo11587e(11))) {
                byte[] bArr2 = this.f11835e;
                byte[] bArr3 = new byte[(bArr2.length + 4)];
                System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length - 1);
                System.arraycopy(C5167h.m11601a("0000Z"), 0, bArr3, this.f11835e.length - 1, 5);
                return bArr3;
            }
            if (!(mo11587e(12) && mo11587e(13))) {
                byte[] bArr4 = this.f11835e;
                byte[] bArr5 = new byte[(bArr4.length + 2)];
                System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length - 1);
                System.arraycopy(C5167h.m11601a("00Z"), 0, bArr5, this.f11835e.length - 1, 3);
                return bArr5;
            }
            int i = 0;
            while (true) {
                byte[] bArr6 = this.f11835e;
                if (i != bArr6.length) {
                    if (bArr6[i] == 46 && i == 14) {
                        z = true;
                        break;
                    }
                    i++;
                } else {
                    z = false;
                    break;
                }
            }
            if (z) {
                int length = this.f11835e.length - 2;
                while (length > 0 && this.f11835e[length] == 48) {
                    length--;
                }
                byte[] bArr7 = this.f11835e;
                if (bArr7[length] == 46) {
                    byte[] bArr8 = new byte[(length + 1)];
                    System.arraycopy(bArr7, 0, bArr8, 0, length);
                    bArr8[length] = 90;
                    return bArr8;
                }
                byte[] bArr9 = new byte[(length + 2)];
                int i2 = length + 1;
                System.arraycopy(bArr7, 0, bArr9, 0, i2);
                bArr9[i2] = 90;
                return bArr9;
            }
            bArr = this.f11835e;
        }
        return bArr;
    }
}
