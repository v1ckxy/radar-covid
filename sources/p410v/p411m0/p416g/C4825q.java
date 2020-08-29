package p410v.p411m0.p416g;

/* renamed from: v.m0.g.q */
public final class C4825q {

    /* renamed from: a */
    public int f11517a;

    /* renamed from: b */
    public final int[] f11518b = new int[10];

    /* renamed from: a */
    public final int mo11286a() {
        if ((this.f11517a & 128) != 0) {
            return this.f11518b[7];
        }
        return 65535;
    }

    /* renamed from: a */
    public final C4825q mo11287a(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f11518b;
            if (i < iArr.length) {
                this.f11517a = (1 << i) | this.f11517a;
                iArr[i] = i2;
            }
        }
        return this;
    }
}
