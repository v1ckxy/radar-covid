package p425x.p426a.p445e.p447b.p448a;

import java.util.Arrays;
import p119o.p120a.C0967p0;

/* renamed from: x.a.e.b.a.i */
public class C5051i extends C5048g {

    /* renamed from: e */
    public final C5053k f12084e;

    /* renamed from: f */
    public final C5045e f12085f;

    /* renamed from: g */
    public final byte[] f12086g;

    /* renamed from: h */
    public final byte[] f12087h;

    public C5051i(C5053k kVar, C5045e eVar, byte[] bArr, byte[] bArr2) {
        super(false);
        this.f12084e = kVar;
        this.f12085f = eVar;
        this.f12086g = C0967p0.m2217a(bArr2);
        this.f12087h = C0967p0.m2217a(bArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0050  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p425x.p426a.p445e.p447b.p448a.C5051i m11516a(java.lang.Object r4) {
        /*
            boolean r0 = r4 instanceof p425x.p426a.p445e.p447b.p448a.C5051i
            if (r0 == 0) goto L_0x0007
            x.a.e.b.a.i r4 = (p425x.p426a.p445e.p447b.p448a.C5051i) r4
            return r4
        L_0x0007:
            boolean r0 = r4 instanceof java.io.DataInputStream
            if (r0 == 0) goto L_0x0031
            java.io.DataInputStream r4 = (java.io.DataInputStream) r4
            int r0 = r4.readInt()
            x.a.e.b.a.k r0 = p425x.p426a.p445e.p447b.p448a.C5053k.m11518a(r0)
            int r1 = r4.readInt()
            x.a.e.b.a.e r1 = p425x.p426a.p445e.p447b.p448a.C5045e.m11508a(r1)
            r2 = 16
            byte[] r2 = new byte[r2]
            r4.readFully(r2)
            int r3 = r0.f12099b
            byte[] r3 = new byte[r3]
            r4.readFully(r3)
            x.a.e.b.a.i r4 = new x.a.e.b.a.i
            r4.<init>(r0, r1, r3, r2)
            return r4
        L_0x0031:
            boolean r0 = r4 instanceof byte[]
            if (r0 == 0) goto L_0x0054
            r0 = 0
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch:{ all -> 0x004d }
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x004d }
            byte[] r4 = (byte[]) r4     // Catch:{ all -> 0x004d }
            r2.<init>(r4)     // Catch:{ all -> 0x004d }
            r1.<init>(r2)     // Catch:{ all -> 0x004d }
            x.a.e.b.a.i r4 = m11516a(r1)     // Catch:{ all -> 0x004a }
            r1.close()
            return r4
        L_0x004a:
            r4 = move-exception
            r0 = r1
            goto L_0x004e
        L_0x004d:
            r4 = move-exception
        L_0x004e:
            if (r0 == 0) goto L_0x0053
            r0.close()
        L_0x0053:
            throw r4
        L_0x0054:
            boolean r0 = r4 instanceof java.io.InputStream
            if (r0 == 0) goto L_0x0063
            java.io.InputStream r4 = (java.io.InputStream) r4
            byte[] r4 = p425x.p426a.p469f.p471j.C5173a.m11610a(r4)
            x.a.e.b.a.i r4 = m11516a(r4)
            return r4
        L_0x0063:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "cannot parse "
            java.lang.String r4 = p213q.p214a.p215a.p216a.C1965a.m4750a(r1, r4)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p425x.p426a.p445e.p447b.p448a.C5051i.m11516a(java.lang.Object):x.a.e.b.a.i");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5051i.class != obj.getClass()) {
            return false;
        }
        C5051i iVar = (C5051i) obj;
        if (this.f12084e.equals(iVar.f12084e) && this.f12085f.equals(iVar.f12085f) && Arrays.equals(this.f12086g, iVar.f12086g)) {
            return Arrays.equals(this.f12087h, iVar.f12087h);
        }
        return false;
    }

    public byte[] getEncoded() {
        C5041a aVar = new C5041a();
        aVar.mo11701a(this.f12084e.f12098a);
        aVar.mo11701a(this.f12085f.f12063a);
        aVar.mo11703a(this.f12086g);
        aVar.mo11703a(this.f12087h);
        return aVar.mo11704a();
    }

    public int hashCode() {
        return C0967p0.m2248d(this.f12087h) + ((C0967p0.m2248d(this.f12086g) + ((this.f12085f.hashCode() + (this.f12084e.hashCode() * 31)) * 31)) * 31);
    }
}
