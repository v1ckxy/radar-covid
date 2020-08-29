package p425x.p426a.p427a;

import java.math.BigInteger;
import java.util.Arrays;
import p119o.p120a.C0967p0;
import p213q.p214a.p215a.p216a.C1965a;
import p425x.p426a.p469f.C5166g;

/* renamed from: x.a.a.k */
public class C4958k extends C4983s {

    /* renamed from: e */
    public final byte[] f11842e;

    /* renamed from: f */
    public final int f11843f;

    public C4958k(long j) {
        this.f11842e = BigInteger.valueOf(j).toByteArray();
        this.f11843f = 0;
    }

    public C4958k(BigInteger bigInteger) {
        this.f11842e = bigInteger.toByteArray();
        this.f11843f = 0;
    }

    public C4958k(byte[] bArr, boolean z) {
        if (!m11233b(bArr)) {
            this.f11842e = z ? C0967p0.m2217a(bArr) : bArr;
            this.f11843f = m11234c(bArr);
            return;
        }
        throw new IllegalArgumentException("malformed integer");
    }

    /* renamed from: a */
    public static int m11230a(byte[] bArr, int i, int i2) {
        int length = bArr.length;
        int max = Math.max(i, length - 4);
        byte b = i2 & bArr[max];
        while (true) {
            max++;
            if (max >= length) {
                return b;
            }
            b = (b << 8) | (bArr[max] & 255);
        }
    }

    /* renamed from: a */
    public static C4958k m11231a(Object obj) {
        if (obj == null || (obj instanceof C4958k)) {
            return (C4958k) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return (C4958k) C4983s.m11325a((byte[]) obj);
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

    /* renamed from: b */
    public static boolean m11233b(byte[] bArr) {
        int length = bArr.length;
        boolean z = true;
        if (length == 0) {
            return true;
        }
        if (length == 1) {
            return false;
        }
        if (bArr[0] != (bArr[1] >> 7) || C5166g.m11599a("org.bouncycastle.asn1.allow_unsafe_integer")) {
            z = false;
        }
        return z;
    }

    /* renamed from: c */
    public static int m11234c(byte[] bArr) {
        int length = bArr.length - 1;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            if (bArr[i] != (bArr[i2] >> 7)) {
                break;
            }
            i = i2;
        }
        return i;
    }

    /* renamed from: a */
    public void mo11548a(C4977q qVar, boolean z) {
        qVar.mo11622a(z, 2, this.f11842e);
    }

    /* renamed from: a */
    public boolean mo11549a(C4983s sVar) {
        if (!(sVar instanceof C4958k)) {
            return false;
        }
        return Arrays.equals(this.f11842e, ((C4958k) sVar).f11842e);
    }

    /* renamed from: h */
    public int mo11550h() {
        return C4924b2.m11131a(this.f11842e.length) + 1 + this.f11842e.length;
    }

    public int hashCode() {
        return C0967p0.m2248d(this.f11842e);
    }

    /* renamed from: i */
    public boolean mo11552i() {
        return false;
    }

    /* renamed from: m */
    public int mo11593m() {
        byte[] bArr = this.f11842e;
        int length = bArr.length;
        int i = this.f11843f;
        if (length - i <= 4) {
            return m11230a(bArr, i, -1);
        }
        throw new ArithmeticException("ASN.1 Integer out of int range");
    }

    /* renamed from: o */
    public long mo11594o() {
        byte[] bArr = this.f11842e;
        int length = bArr.length;
        int i = this.f11843f;
        if (length - i <= 8) {
            int length2 = bArr.length;
            int max = Math.max(i, length2 - 8);
            long j = (long) (-1 & bArr[max]);
            while (true) {
                max++;
                if (max >= length2) {
                    return j;
                }
                j = (j << 8) | ((long) (bArr[max] & 255));
            }
        } else {
            throw new ArithmeticException("ASN.1 Integer out of long range");
        }
    }

    public String toString() {
        return new BigInteger(this.f11842e).toString();
    }

    /* renamed from: a */
    public static C4958k m11232a(C5005z zVar, boolean z) {
        C4983s m = zVar.mo11656m();
        if (z || (m instanceof C4958k)) {
            return m11231a((Object) m);
        }
        return new C4958k(C4971o.m11277a((Object) m).f11858e, true);
    }

    /* renamed from: a */
    public boolean mo11592a(BigInteger bigInteger) {
        return bigInteger != null && m11230a(this.f11842e, this.f11843f, -1) == bigInteger.intValue() && new BigInteger(this.f11842e).equals(bigInteger);
    }
}
