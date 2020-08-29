package p425x.p426a.p469f.p470i;

/* renamed from: x.a.f.i.c */
public class C5171c {

    /* renamed from: a */
    public final byte[] f12357a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: b */
    public final byte[] f12358b = new byte[128];

    public C5171c() {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f12358b;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = -1;
            i2++;
        }
        while (true) {
            byte[] bArr2 = this.f12357a;
            if (i < bArr2.length) {
                this.f12358b[bArr2[i]] = (byte) i;
                i++;
            } else {
                byte[] bArr3 = this.f12358b;
                bArr3[65] = bArr3[97];
                bArr3[66] = bArr3[98];
                bArr3[67] = bArr3[99];
                bArr3[68] = bArr3[100];
                bArr3[69] = bArr3[101];
                bArr3[70] = bArr3[102];
                return;
            }
        }
    }
}
