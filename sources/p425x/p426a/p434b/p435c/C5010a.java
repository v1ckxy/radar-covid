package p425x.p426a.p434b.p435c;

import p425x.p426a.p434b.C5008a;

/* renamed from: x.a.b.c.a */
public abstract class C5010a implements C5008a {

    /* renamed from: a */
    public final byte[] f11899a = new byte[4];

    /* renamed from: b */
    public int f11900b = 0;

    /* renamed from: c */
    public long f11901c;

    /* renamed from: a */
    public void mo11661a(byte b) {
        byte[] bArr = this.f11899a;
        int i = this.f11900b;
        int i2 = i + 1;
        this.f11900b = i2;
        bArr[i] = b;
        if (i2 == bArr.length) {
            mo11667b(bArr, 0);
            this.f11900b = 0;
        }
        this.f11901c++;
    }

    /* renamed from: a */
    public abstract void mo11665a(long j);

    /* renamed from: a */
    public void mo11662a(byte[] bArr, int i, int i2) {
        int i3 = 0;
        int max = Math.max(0, i2);
        if (this.f11900b != 0) {
            int i4 = 0;
            while (true) {
                if (i4 >= max) {
                    i3 = i4;
                    break;
                }
                byte[] bArr2 = this.f11899a;
                int i5 = this.f11900b;
                int i6 = i5 + 1;
                this.f11900b = i6;
                int i7 = i4 + 1;
                bArr2[i5] = bArr[i4 + i];
                if (i6 == 4) {
                    mo11667b(bArr2, 0);
                    this.f11900b = 0;
                    i3 = i7;
                    break;
                }
                i4 = i7;
            }
        }
        int i8 = ((max - i3) & -4) + i3;
        while (i3 < i8) {
            mo11667b(bArr, i + i3);
            i3 += 4;
        }
        while (i3 < max) {
            byte[] bArr3 = this.f11899a;
            int i9 = this.f11900b;
            this.f11900b = i9 + 1;
            int i10 = i3 + 1;
            bArr3[i9] = bArr[i3 + i];
            i3 = i10;
        }
        this.f11901c += (long) max;
    }

    /* renamed from: b */
    public void mo11666b() {
        long j = this.f11901c << 3;
        byte b = Byte.MIN_VALUE;
        while (true) {
            mo11661a(b);
            if (this.f11900b != 0) {
                b = 0;
            } else {
                mo11665a(j);
                mo11668c();
                return;
            }
        }
    }

    /* renamed from: b */
    public abstract void mo11667b(byte[] bArr, int i);

    /* renamed from: c */
    public abstract void mo11668c();

    /* renamed from: d */
    public void mo11669d() {
        this.f11901c = 0;
        this.f11900b = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.f11899a;
            if (i < bArr.length) {
                bArr[i] = 0;
                i++;
            } else {
                return;
            }
        }
    }
}
