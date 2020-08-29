package p213q.p217b.p218a.p231b.p251g.p256e;

import p116io.jsonwebtoken.lang.Objects;

/* renamed from: q.b.a.b.g.e.n5 */
public class C2580n5 extends C2435f5 {

    /* renamed from: h */
    public final byte[] f6744h;

    public C2580n5(byte[] bArr) {
        if (bArr != null) {
            this.f6744h = bArr;
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public byte mo7639a(int i) {
        return this.f6744h[i];
    }

    /* renamed from: a */
    public int mo7640a() {
        return this.f6744h.length;
    }

    /* renamed from: a */
    public final C2435f5 mo7641a(int i, int i2) {
        int a = C2435f5.m5805a(0, i2, mo7640a());
        return a == 0 ? C2435f5.f6525f : new C2452g5(this.f6744h, mo7677e(), a);
    }

    /* renamed from: c */
    public byte mo7643c(int i) {
        return this.f6744h[i];
    }

    /* renamed from: e */
    public int mo7677e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2435f5) || mo7640a() != ((C2435f5) obj).mo7640a()) {
            return false;
        }
        if (mo7640a() == 0) {
            return true;
        }
        if (!(obj instanceof C2580n5)) {
            return obj.equals(this);
        }
        C2580n5 n5Var = (C2580n5) obj;
        int i = this.f6527e;
        int i2 = n5Var.f6527e;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int a = mo7640a();
        if (a > n5Var.mo7640a()) {
            int a2 = mo7640a();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(a);
            sb.append(a2);
            throw new IllegalArgumentException(sb.toString());
        } else if (a <= n5Var.mo7640a()) {
            byte[] bArr = this.f6744h;
            byte[] bArr2 = n5Var.f6744h;
            int e = mo7677e() + a;
            int e2 = mo7677e();
            int e3 = n5Var.mo7677e();
            while (true) {
                if (e2 >= e) {
                    break;
                } else if (bArr[e2] != bArr2[e3]) {
                    z = false;
                    break;
                } else {
                    e2++;
                    e3++;
                }
            }
            return z;
        } else {
            int a3 = n5Var.mo7640a();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(a);
            sb2.append(Objects.ARRAY_ELEMENT_SEPARATOR);
            sb2.append(a3);
            throw new IllegalArgumentException(sb2.toString());
        }
    }
}
