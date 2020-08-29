package p423w;

import java.security.MessageDigest;
import java.util.Arrays;
import p119o.p120a.C0967p0;
import p392u.p401r.p403c.C4636f;
import p392u.p401r.p403c.C4638h;
import p423w.p424c0.C4889a;

/* renamed from: w.x */
public final class C4914x extends C4897j {

    /* renamed from: j */
    public final transient byte[][] f11711j;

    /* renamed from: k */
    public final transient int[] f11712k;

    public /* synthetic */ C4914x(byte[][] bArr, int[] iArr, C4636f fVar) {
        super(C4897j.f11664h.f11668g);
        this.f11711j = bArr;
        this.f11712k = iArr;
    }

    /* renamed from: a */
    public byte mo11495a(int i) {
        C0967p0.m2197a((long) this.f11712k[this.f11711j.length - 1], (long) i, 1);
        int b = mo11545b(i);
        int i2 = b == 0 ? 0 : this.f11712k[b - 1];
        int[] iArr = this.f11712k;
        byte[][] bArr = this.f11711j;
        return bArr[b][(i - i2) + iArr[bArr.length + b]];
    }

    /* renamed from: a */
    public C4897j mo11496a(String str) {
        if (str != null) {
            MessageDigest instance = MessageDigest.getInstance(str);
            int length = this.f11711j.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int[] iArr = this.f11712k;
                int i3 = iArr[length + i];
                int i4 = iArr[i];
                instance.update(this.f11711j[i], i3, i4 - i2);
                i++;
                i2 = i4;
            }
            byte[] digest = instance.digest();
            C4638h.m10270a((Object) digest, "digest.digest()");
            return new C4897j(digest);
        }
        C4638h.m10271a("algorithm");
        throw null;
    }

    /* renamed from: b */
    public final int mo11545b(int i) {
        int binarySearch = Arrays.binarySearch(this.f11712k, 0, this.f11711j.length, i + 1);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4897j) {
            C4897j jVar = (C4897j) obj;
            if (jVar.mo11503g() == mo11503g() && mo11498a(0, jVar, 0, mo11503g())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public String mo11502f() {
        return C4889a.m10938a(mo11547n());
    }

    /* renamed from: g */
    public int mo11503g() {
        return this.f11712k[this.f11711j.length - 1];
    }

    /* renamed from: h */
    public String mo11504h() {
        return C4889a.m10949d(mo11547n());
    }

    public int hashCode() {
        int i = this.f11666e;
        if (i != 0) {
            return i;
        }
        int length = this.f11711j.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.f11712k;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr = this.f11711j[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.f11666e = i3;
        return i3;
    }

    /* renamed from: j */
    public byte[] mo11506j() {
        return mo11546m();
    }

    /* renamed from: k */
    public C4897j mo11507k() {
        return C4889a.m10951f(mo11547n());
    }

    /* renamed from: m */
    public byte[] mo11546m() {
        byte[] bArr = new byte[mo11503g()];
        int length = this.f11711j.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.f11712k;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            C0967p0.m2235b(this.f11711j[i], i4, bArr, i3, i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    /* renamed from: n */
    public final C4897j mo11547n() {
        return new C4897j(mo11546m());
    }

    public String toString() {
        return C4889a.m10952g(mo11547n());
    }

    /* renamed from: a */
    public boolean mo11498a(int i, C4897j jVar, int i2, int i3) {
        int i4;
        if (jVar == null) {
            C4638h.m10271a("other");
            throw null;
        } else if (i < 0 || i > mo11503g() - i3) {
            return false;
        } else {
            int i5 = i3 + i;
            int b = mo11545b(i);
            while (i < i5) {
                if (b == 0) {
                    i4 = 0;
                } else {
                    i4 = this.f11712k[b - 1];
                }
                int[] iArr = this.f11712k;
                int i6 = iArr[b] - i4;
                int min = Math.min(i5, i6 + i4) - i;
                if (!jVar.mo11499a(i2, this.f11711j[b], (i - i4) + iArr[this.f11711j.length + b], min)) {
                    return false;
                }
                i2 += min;
                i += min;
                b++;
            }
            return true;
        }
    }

    /* renamed from: a */
    public boolean mo11499a(int i, byte[] bArr, int i2, int i3) {
        int i4;
        if (bArr == null) {
            C4638h.m10271a("other");
            throw null;
        } else if (i < 0 || i > mo11503g() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        } else {
            int i5 = i3 + i;
            int b = mo11545b(i);
            while (i < i5) {
                if (b == 0) {
                    i4 = 0;
                } else {
                    i4 = this.f11712k[b - 1];
                }
                int[] iArr = this.f11712k;
                int i6 = iArr[b] - i4;
                int min = Math.min(i5, i6 + i4) - i;
                if (!C0967p0.m2210a(this.f11711j[b], (i - i4) + iArr[this.f11711j.length + b], bArr, i2, min)) {
                    return false;
                }
                i2 += min;
                i += min;
                b++;
            }
            return true;
        }
    }

    /* renamed from: a */
    public void mo11497a(C4892f fVar) {
        if (fVar != null) {
            int length = this.f11711j.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int[] iArr = this.f11712k;
                int i3 = iArr[length + i];
                int i4 = iArr[i];
                C4912v vVar = new C4912v(this.f11711j[i], i3, i3 + (i4 - i2), true, false);
                C4912v vVar2 = fVar.f11660e;
                if (vVar2 == null) {
                    vVar.f11707g = vVar;
                    vVar.f11706f = vVar;
                    fVar.f11660e = vVar;
                } else if (vVar2 != null) {
                    C4912v vVar3 = vVar2.f11707g;
                    if (vVar3 != null) {
                        vVar3.mo11542a(vVar);
                    } else {
                        C4638h.m10269a();
                        throw null;
                    }
                } else {
                    C4638h.m10269a();
                    throw null;
                }
                i++;
                i2 = i4;
            }
            fVar.f11661f += (long) mo11503g();
            return;
        }
        C4638h.m10271a("buffer");
        throw null;
    }
}
