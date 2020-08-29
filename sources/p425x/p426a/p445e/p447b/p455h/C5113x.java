package p425x.p426a.p445e.p447b.p455h;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import p119o.p120a.C0967p0;
import p425x.p426a.p445e.p447b.p455h.C5092j.C5094b;
import p425x.p426a.p469f.C5162c;

/* renamed from: x.a.e.b.h.x */
public final class C5113x extends C5101p implements C5162c {

    /* renamed from: f */
    public final C5112w f12261f;

    /* renamed from: g */
    public final byte[] f12262g;

    /* renamed from: h */
    public final byte[] f12263h;

    /* renamed from: i */
    public final byte[] f12264i;

    /* renamed from: j */
    public final byte[] f12265j;

    /* renamed from: k */
    public volatile C5079a f12266k;

    /* renamed from: x.a.e.b.h.x$b */
    public static class C5115b {

        /* renamed from: a */
        public final C5112w f12267a;

        /* renamed from: b */
        public int f12268b = 0;

        /* renamed from: c */
        public int f12269c = -1;

        /* renamed from: d */
        public byte[] f12270d = null;

        /* renamed from: e */
        public byte[] f12271e = null;

        /* renamed from: f */
        public byte[] f12272f = null;

        /* renamed from: g */
        public byte[] f12273g = null;

        /* renamed from: h */
        public C5079a f12274h = null;

        /* renamed from: i */
        public byte[] f12275i = null;

        public C5115b(C5112w wVar) {
            this.f12267a = wVar;
        }
    }

    public /* synthetic */ C5113x(C5115b bVar, C5114a aVar) {
        int i;
        super(true, bVar.f12267a.f12258f);
        C5112w wVar = bVar.f12267a;
        this.f12261f = wVar;
        if (wVar != null) {
            int i2 = wVar.f12259g;
            byte[] bArr = bVar.f12275i;
            if (bArr != null) {
                int i3 = wVar.f12254b;
                int b = C0967p0.m2225b(bArr, 0);
                if (C0967p0.m2207a(i3, (long) b)) {
                    this.f12262g = C0967p0.m2246c(bArr, 4, i2);
                    int i4 = i2 + 4;
                    this.f12263h = C0967p0.m2246c(bArr, i4, i2);
                    int i5 = i4 + i2;
                    this.f12264i = C0967p0.m2246c(bArr, i5, i2);
                    int i6 = i5 + i2;
                    this.f12265j = C0967p0.m2246c(bArr, i6, i2);
                    int i7 = i6 + i2;
                    try {
                        C5079a aVar2 = (C5079a) C0967p0.m2179a(C0967p0.m2246c(bArr, i7, bArr.length - i7), C5079a.class);
                        if (aVar2.f12157n == b) {
                            this.f12266k = new C5079a(aVar2, bVar.f12267a.f12256d);
                            return;
                        }
                        throw new IllegalStateException("serialized BDS has wrong index");
                    } catch (IOException e) {
                        throw new IllegalArgumentException(e.getMessage(), e);
                    } catch (ClassNotFoundException e2) {
                        throw new IllegalArgumentException(e2.getMessage(), e2);
                    }
                } else {
                    throw new IllegalArgumentException("index out of bounds");
                }
            } else {
                byte[] bArr2 = bVar.f12270d;
                if (bArr2 == null) {
                    this.f12262g = new byte[i2];
                } else if (bArr2.length == i2) {
                    this.f12262g = bArr2;
                } else {
                    throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
                }
                byte[] bArr3 = bVar.f12271e;
                if (bArr3 == null) {
                    this.f12263h = new byte[i2];
                } else if (bArr3.length == i2) {
                    this.f12263h = bArr3;
                } else {
                    throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
                }
                byte[] bArr4 = bVar.f12272f;
                if (bArr4 == null) {
                    this.f12264i = new byte[i2];
                } else if (bArr4.length == i2) {
                    this.f12264i = bArr4;
                } else {
                    throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
                }
                byte[] bArr5 = bVar.f12273g;
                if (bArr5 == null) {
                    this.f12265j = new byte[i2];
                } else if (bArr5.length == i2) {
                    this.f12265j = bArr5;
                } else {
                    throw new IllegalArgumentException("size of root needs to be equal size of digest");
                }
                C5079a aVar3 = bVar.f12274h;
                if (aVar3 == null) {
                    int i8 = bVar.f12268b;
                    C5112w wVar2 = this.f12261f;
                    if (i8 >= (1 << wVar2.f12254b) - 2 || bArr4 == null || bArr2 == null) {
                        C5112w wVar3 = this.f12261f;
                        int i9 = (1 << wVar3.f12254b) - 1;
                        int i10 = bVar.f12268b;
                        C5079a aVar4 = new C5079a(wVar3.mo11762a(), wVar3.f12254b, wVar3.f12255c, i10);
                        aVar4.f12159p = i9;
                        aVar4.f12157n = i10;
                        aVar4.f12158o = true;
                        this.f12266k = aVar4;
                        i = bVar.f12269c;
                        if (i >= 0 && i != this.f12266k.f12159p) {
                            throw new IllegalArgumentException("maxIndex set but not reflected in state");
                        }
                    }
                    C5092j jVar = (C5092j) new C5094b().mo11750b();
                    int i11 = bVar.f12268b;
                    C5095k a = wVar2.mo11762a();
                    int i12 = wVar2.f12254b;
                    aVar3 = new C5079a(a, i12, wVar2.f12255c, (1 << i12) - 1);
                    aVar3.mo11735a(bArr4, bArr2, jVar);
                    while (aVar3.f12157n < i11) {
                        aVar3.mo11736b(bArr4, bArr2, jVar);
                        aVar3.f12158o = false;
                    }
                }
                this.f12266k = aVar3;
                i = bVar.f12269c;
                if (i >= 0) {
                }
            }
        } else {
            throw new NullPointerException("params == null");
        }
    }

    /* renamed from: a */
    public byte[] mo11763a() {
        byte[] a;
        synchronized (this) {
            int i = this.f12261f.f12259g;
            int i2 = i + 4;
            int i3 = i2 + i;
            int i4 = i3 + i;
            byte[] bArr = new byte[(i + i4)];
            C0967p0.m2233b(this.f12266k.f12157n, bArr, 0);
            C0967p0.m2206a(bArr, this.f12262g, 4);
            C0967p0.m2206a(bArr, this.f12263h, i2);
            C0967p0.m2206a(bArr, this.f12264i, i3);
            C0967p0.m2206a(bArr, this.f12265j, i4);
            try {
                C5079a aVar = this.f12266k;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                objectOutputStream.writeObject(aVar);
                objectOutputStream.flush();
                a = C0967p0.m2218a(bArr, byteArrayOutputStream.toByteArray());
            } catch (IOException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("error serializing bds state: ");
                sb.append(e.getMessage());
                throw new RuntimeException(sb.toString());
            }
        }
        return a;
    }

    public byte[] getEncoded() {
        byte[] a;
        synchronized (this) {
            a = mo11763a();
        }
        return a;
    }
}
