package p425x.p426a.p445e.p447b.p455h;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import p119o.p120a.C0967p0;
import p425x.p426a.p469f.C5162c;

/* renamed from: x.a.e.b.h.s */
public final class C5104s extends C5102q implements C5162c {

    /* renamed from: f */
    public final C5103r f12225f;

    /* renamed from: g */
    public final byte[] f12226g;

    /* renamed from: h */
    public final byte[] f12227h;

    /* renamed from: i */
    public final byte[] f12228i;

    /* renamed from: j */
    public final byte[] f12229j;

    /* renamed from: k */
    public volatile long f12230k;

    /* renamed from: l */
    public volatile C5080b f12231l;

    /* renamed from: x.a.e.b.h.s$b */
    public static class C5106b {

        /* renamed from: a */
        public final C5103r f12232a;

        /* renamed from: b */
        public long f12233b = 0;

        /* renamed from: c */
        public long f12234c = -1;

        /* renamed from: d */
        public byte[] f12235d = null;

        /* renamed from: e */
        public byte[] f12236e = null;

        /* renamed from: f */
        public byte[] f12237f = null;

        /* renamed from: g */
        public byte[] f12238g = null;

        /* renamed from: h */
        public C5080b f12239h = null;

        /* renamed from: i */
        public byte[] f12240i = null;

        /* renamed from: j */
        public C5112w f12241j = null;

        public C5106b(C5103r rVar) {
            this.f12232a = rVar;
        }
    }

    public /* synthetic */ C5104s(C5106b bVar, C5105a aVar) {
        super(true, bVar.f12232a.f12222b.f12258f);
        C5103r rVar = bVar.f12232a;
        this.f12225f = rVar;
        if (rVar != null) {
            int i = rVar.f12222b.f12259g;
            byte[] bArr = bVar.f12240i;
            if (bArr == null) {
                this.f12230k = bVar.f12233b;
                byte[] bArr2 = bVar.f12235d;
                if (bArr2 == null) {
                    this.f12226g = new byte[i];
                } else if (bArr2.length == i) {
                    this.f12226g = bArr2;
                } else {
                    throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
                }
                byte[] bArr3 = bVar.f12236e;
                if (bArr3 == null) {
                    this.f12227h = new byte[i];
                } else if (bArr3.length == i) {
                    this.f12227h = bArr3;
                } else {
                    throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
                }
                byte[] bArr4 = bVar.f12237f;
                if (bArr4 == null) {
                    this.f12228i = new byte[i];
                } else if (bArr4.length == i) {
                    this.f12228i = bArr4;
                } else {
                    throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
                }
                byte[] bArr5 = bVar.f12238g;
                if (bArr5 == null) {
                    this.f12229j = new byte[i];
                } else if (bArr5.length == i) {
                    this.f12229j = bArr5;
                } else {
                    throw new IllegalArgumentException("size of root needs to be equal size of digest");
                }
                C5080b bVar2 = bVar.f12239h;
                if (bVar2 == null) {
                    if (!C0967p0.m2207a(this.f12225f.f12223c, bVar.f12233b) || bArr4 == null || bArr2 == null) {
                        bVar2 = new C5080b(bVar.f12234c + 1);
                    } else {
                        bVar2 = new C5080b(this.f12225f, bVar.f12233b, bArr4, bArr2);
                    }
                }
                this.f12231l = bVar2;
                long j = bVar.f12234c;
                if (j >= 0 && j != this.f12231l.f12161f) {
                    throw new IllegalArgumentException("maxIndex set but not reflected in state");
                }
            } else if (bVar.f12241j != null) {
                int i2 = rVar.f12223c;
                int i3 = (i2 + 7) / 8;
                this.f12230k = C0967p0.m2176a(bArr, 0, i3);
                if (C0967p0.m2207a(i2, this.f12230k)) {
                    int i4 = i3 + 0;
                    this.f12226g = C0967p0.m2246c(bArr, i4, i);
                    int i5 = i4 + i;
                    this.f12227h = C0967p0.m2246c(bArr, i5, i);
                    int i6 = i5 + i;
                    this.f12228i = C0967p0.m2246c(bArr, i6, i);
                    int i7 = i6 + i;
                    this.f12229j = C0967p0.m2246c(bArr, i7, i);
                    int i8 = i7 + i;
                    try {
                        this.f12231l = ((C5080b) C0967p0.m2179a(C0967p0.m2246c(bArr, i8, bArr.length - i8), C5080b.class)).mo11738a(bVar.f12241j.f12256d);
                    } catch (IOException e) {
                        throw new IllegalArgumentException(e.getMessage(), e);
                    } catch (ClassNotFoundException e2) {
                        throw new IllegalArgumentException(e2.getMessage(), e2);
                    }
                } else {
                    throw new IllegalArgumentException("index out of bounds");
                }
            } else {
                throw new NullPointerException("xmss == null");
            }
        } else {
            throw new NullPointerException("params == null");
        }
    }

    /* renamed from: a */
    public byte[] mo11759a() {
        byte[] a;
        synchronized (this) {
            int i = this.f12225f.f12222b.f12259g;
            int i2 = (this.f12225f.f12223c + 7) / 8;
            byte[] bArr = new byte[(i2 + i + i + i + i)];
            C0967p0.m2206a(bArr, C0967p0.m2215a(this.f12230k, i2), 0);
            int i3 = i2 + 0;
            C0967p0.m2206a(bArr, this.f12226g, i3);
            int i4 = i3 + i;
            C0967p0.m2206a(bArr, this.f12227h, i4);
            int i5 = i4 + i;
            C0967p0.m2206a(bArr, this.f12228i, i5);
            C0967p0.m2206a(bArr, this.f12229j, i5 + i);
            try {
                C5080b bVar = this.f12231l;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                objectOutputStream.writeObject(bVar);
                objectOutputStream.flush();
                a = C0967p0.m2218a(bArr, byteArrayOutputStream.toByteArray());
            } catch (IOException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("error serializing bds state: ");
                sb.append(e.getMessage());
                throw new IllegalStateException(sb.toString(), e);
            }
        }
        return a;
    }

    public byte[] getEncoded() {
        byte[] a;
        synchronized (this) {
            a = mo11759a();
        }
        return a;
    }
}
