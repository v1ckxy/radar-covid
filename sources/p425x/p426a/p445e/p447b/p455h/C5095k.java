package p425x.p426a.p445e.p447b.p455h;

import p119o.p120a.C0967p0;
import p213q.p214a.p215a.p216a.C1965a;
import p425x.p426a.p445e.p447b.p455h.C5092j.C5094b;

/* renamed from: x.a.e.b.h.k */
public final class C5095k {

    /* renamed from: a */
    public final C5097m f12195a;

    /* renamed from: b */
    public final C5088h f12196b;

    /* renamed from: c */
    public byte[] f12197c;

    /* renamed from: d */
    public byte[] f12198d;

    public C5095k(C5097m mVar) {
        if (mVar != null) {
            this.f12195a = mVar;
            int i = mVar.f12203b;
            this.f12196b = new C5088h(mVar.f12208g, i);
            this.f12197c = new byte[i];
            this.f12198d = new byte[i];
            return;
        }
        throw new NullPointerException("params == null");
    }

    /* renamed from: a */
    public final byte[] mo11753a(byte[] bArr, int i, int i2, C5092j jVar) {
        int i3 = this.f12195a.f12203b;
        if (bArr == null) {
            throw new NullPointerException("startHash == null");
        } else if (bArr.length != i3) {
            throw new IllegalArgumentException(C1965a.m4762b("startHash needs to be ", i3, "bytes"));
        } else if (jVar == null) {
            throw new NullPointerException("otsHashAddress == null");
        } else if (jVar.mo11744a() != null) {
            int i4 = i + i2;
            if (i4 > this.f12195a.f12204c - 1) {
                throw new IllegalArgumentException("max chain length must not be greater than w");
            } else if (i2 == 0) {
                return bArr;
            } else {
                byte[] a = mo11753a(bArr, i, i2 - 1, jVar);
                C5094b bVar = (C5094b) ((C5094b) new C5094b().mo11758b(jVar.f12210a)).mo11757a(jVar.f12211b);
                bVar.f12192e = jVar.f12189e;
                bVar.f12193f = jVar.f12190f;
                bVar.f12194g = i4 - 1;
                C5092j jVar2 = (C5092j) ((C5094b) bVar.mo11756a(0)).mo11750b();
                byte[] a2 = this.f12196b.mo11748a(this.f12198d, jVar2.mo11744a());
                C5094b bVar2 = (C5094b) ((C5094b) new C5094b().mo11758b(jVar2.f12210a)).mo11757a(jVar2.f12211b);
                bVar2.f12192e = jVar2.f12189e;
                bVar2.f12193f = jVar2.f12190f;
                bVar2.f12194g = jVar2.f12191g;
                byte[] a3 = this.f12196b.mo11748a(this.f12198d, ((C5092j) ((C5094b) bVar2.mo11756a(1)).mo11750b()).mo11744a());
                byte[] bArr2 = new byte[i3];
                for (int i5 = 0; i5 < i3; i5++) {
                    bArr2[i5] = (byte) (a[i5] ^ a3[i5]);
                }
                C5088h hVar = this.f12196b;
                if (hVar != null) {
                    int length = a2.length;
                    int i6 = hVar.f12182b;
                    if (length != i6) {
                        throw new IllegalArgumentException("wrong key length");
                    } else if (i3 == i6) {
                        return hVar.mo11747a(0, a2, bArr2);
                    } else {
                        throw new IllegalArgumentException("wrong in length");
                    }
                } else {
                    throw null;
                }
            }
        } else {
            throw new NullPointerException("otsHashAddress byte array == null");
        }
    }

    /* renamed from: a */
    public C5098n mo11751a(C5092j jVar) {
        if (jVar != null) {
            byte[][] bArr = new byte[this.f12195a.f12205d][];
            int i = 0;
            while (true) {
                C5097m mVar = this.f12195a;
                if (i >= mVar.f12205d) {
                    return new C5098n(mVar, bArr);
                }
                C5094b bVar = (C5094b) ((C5094b) new C5094b().mo11758b(jVar.f12210a)).mo11757a(jVar.f12211b);
                bVar.f12192e = jVar.f12189e;
                bVar.f12193f = i;
                bVar.f12194g = jVar.f12191g;
                jVar = (C5092j) ((C5094b) bVar.mo11756a(jVar.f12213d)).mo11750b();
                if (i >= 0 && i < this.f12195a.f12205d) {
                    bArr[i] = mo11753a(this.f12196b.mo11748a(this.f12197c, C0967p0.m2215a((long) i, 32)), 0, this.f12195a.f12204c - 1, jVar);
                    i++;
                }
            }
            throw new IllegalArgumentException("index out of bounds");
        }
        throw new NullPointerException("otsHashAddress == null");
    }

    /* renamed from: a */
    public byte[] mo11754a(byte[] bArr, C5092j jVar) {
        C5094b bVar = (C5094b) ((C5094b) new C5094b().mo11758b(jVar.f12210a)).mo11757a(jVar.f12211b);
        bVar.f12192e = jVar.f12189e;
        return this.f12196b.mo11748a(bArr, ((C5092j) bVar.mo11750b()).mo11744a());
    }

    /* renamed from: a */
    public void mo11752a(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            int length = bArr.length;
            int i = this.f12195a.f12203b;
            if (length != i) {
                throw new IllegalArgumentException("size of secretKeySeed needs to be equal to size of digest");
            } else if (bArr2 == null) {
                throw new NullPointerException("publicSeed == null");
            } else if (bArr2.length == i) {
                this.f12197c = bArr;
                this.f12198d = bArr2;
            } else {
                throw new IllegalArgumentException("size of publicSeed needs to be equal to size of digest");
            }
        } else {
            throw new NullPointerException("secretKeySeed == null");
        }
    }
}
