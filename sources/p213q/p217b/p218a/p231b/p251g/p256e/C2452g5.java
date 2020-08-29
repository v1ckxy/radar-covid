package p213q.p217b.p218a.p231b.p251g.p256e;

import p116io.jsonwebtoken.lang.Objects;

/* renamed from: q.b.a.b.g.e.g5 */
public final class C2452g5 extends C2580n5 {

    /* renamed from: i */
    public final int f6545i;

    /* renamed from: j */
    public final int f6546j;

    public C2452g5(byte[] bArr, int i, int i2) {
        super(bArr);
        C2435f5.m5805a(i, i + i2, bArr.length);
        this.f6545i = i;
        this.f6546j = i2;
    }

    /* renamed from: a */
    public final byte mo7639a(int i) {
        int i2 = this.f6546j;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f6744h[this.f6545i + i];
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i);
        sb2.append(Objects.ARRAY_ELEMENT_SEPARATOR);
        sb2.append(i2);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    /* renamed from: a */
    public final int mo7640a() {
        return this.f6546j;
    }

    /* renamed from: c */
    public final byte mo7643c(int i) {
        return this.f6744h[this.f6545i + i];
    }

    /* renamed from: e */
    public final int mo7677e() {
        return this.f6545i;
    }
}
