package p425x.p426a.p445e.p447b.p455h;

import java.io.PrintStream;
import p119o.p120a.C0967p0;
import p425x.p426a.p469f.C5162c;

/* renamed from: x.a.e.b.h.y */
public final class C5116y extends C5101p implements C5162c {

    /* renamed from: f */
    public final C5112w f12276f;

    /* renamed from: g */
    public final int f12277g;

    /* renamed from: h */
    public final byte[] f12278h;

    /* renamed from: i */
    public final byte[] f12279i;

    /* renamed from: x.a.e.b.h.y$b */
    public static class C5118b {

        /* renamed from: a */
        public final C5112w f12280a;

        /* renamed from: b */
        public byte[] f12281b = null;

        /* renamed from: c */
        public byte[] f12282c = null;

        /* renamed from: d */
        public byte[] f12283d = null;

        public C5118b(C5112w wVar) {
            this.f12280a = wVar;
        }
    }

    public /* synthetic */ C5116y(C5118b bVar, C5117a aVar) {
        super(false, bVar.f12280a.f12258f);
        C5112w wVar = bVar.f12280a;
        this.f12276f = wVar;
        if (wVar != null) {
            int i = wVar.f12259g;
            byte[] bArr = bVar.f12283d;
            if (bArr == null) {
                C5111v vVar = wVar.f12253a;
                if (vVar != null) {
                    this.f12277g = vVar.mo11741a();
                } else {
                    this.f12277g = 0;
                }
                byte[] bArr2 = bVar.f12281b;
                if (bArr2 == null) {
                    this.f12278h = new byte[i];
                } else if (bArr2.length == i) {
                    this.f12278h = bArr2;
                } else {
                    throw new IllegalArgumentException("length of root must be equal to length of digest");
                }
                byte[] bArr3 = bVar.f12282c;
                if (bArr3 == null) {
                    this.f12279i = new byte[i];
                } else if (bArr3.length == i) {
                    this.f12279i = bArr3;
                } else {
                    throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
                }
            } else if (bArr.length == i + i) {
                this.f12277g = 0;
                this.f12278h = C0967p0.m2246c(bArr, 0, i);
                this.f12279i = C0967p0.m2246c(bArr, i + 0, i);
            } else {
                int i2 = i + 4;
                int i3 = i2 + i;
                if (bArr.length == i3) {
                    this.f12277g = C0967p0.m2225b(bArr, 0);
                    this.f12278h = C0967p0.m2246c(bArr, 4, i);
                    this.f12279i = C0967p0.m2246c(bArr, i2, i);
                    return;
                }
                PrintStream printStream = System.err;
                StringBuilder sb = new StringBuilder();
                sb.append(bArr.length);
                sb.append(" ");
                sb.append(i3);
                printStream.println(sb.toString());
                throw new IllegalArgumentException("public key has wrong size");
            }
        } else {
            throw new NullPointerException("params == null");
        }
    }

    public byte[] getEncoded() {
        byte[] bArr;
        int i = this.f12276f.f12259g;
        int i2 = 0;
        int i3 = this.f12277g;
        if (i3 != 0) {
            bArr = new byte[(i + 4 + i)];
            C0967p0.m2233b(i3, bArr, 0);
            i2 = 4;
        } else {
            bArr = new byte[(i + i)];
        }
        C0967p0.m2206a(bArr, this.f12278h, i2);
        C0967p0.m2206a(bArr, this.f12279i, i2 + i);
        return bArr;
    }
}
