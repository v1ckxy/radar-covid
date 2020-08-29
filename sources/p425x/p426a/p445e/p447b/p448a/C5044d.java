package p425x.p426a.p445e.p447b.p448a;

import java.io.ByteArrayOutputStream;

/* renamed from: x.a.e.b.a.d */
public class C5044d extends C5048g {

    /* renamed from: e */
    public final int f12056e;

    /* renamed from: f */
    public final C5051i f12057f;

    public C5044d(int i, C5051i iVar) {
        super(false);
        this.f12056e = i;
        this.f12057f = iVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p425x.p426a.p445e.p447b.p448a.C5044d m11507a(java.lang.Object r3) {
        /*
            boolean r0 = r3 instanceof p425x.p426a.p445e.p447b.p448a.C5044d
            if (r0 == 0) goto L_0x0007
            x.a.e.b.a.d r3 = (p425x.p426a.p445e.p447b.p448a.C5044d) r3
            return r3
        L_0x0007:
            boolean r0 = r3 instanceof java.io.DataInputStream
            if (r0 == 0) goto L_0x001c
            r0 = r3
            java.io.DataInputStream r0 = (java.io.DataInputStream) r0
            int r0 = r0.readInt()
            x.a.e.b.a.i r3 = p425x.p426a.p445e.p447b.p448a.C5051i.m11516a(r3)
            x.a.e.b.a.d r1 = new x.a.e.b.a.d
            r1.<init>(r0, r3)
            return r1
        L_0x001c:
            boolean r0 = r3 instanceof byte[]
            if (r0 == 0) goto L_0x003f
            r0 = 0
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch:{ all -> 0x0038 }
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x0038 }
            byte[] r3 = (byte[]) r3     // Catch:{ all -> 0x0038 }
            r2.<init>(r3)     // Catch:{ all -> 0x0038 }
            r1.<init>(r2)     // Catch:{ all -> 0x0038 }
            x.a.e.b.a.d r3 = m11507a(r1)     // Catch:{ all -> 0x0035 }
            r1.close()
            return r3
        L_0x0035:
            r3 = move-exception
            r0 = r1
            goto L_0x0039
        L_0x0038:
            r3 = move-exception
        L_0x0039:
            if (r0 == 0) goto L_0x003e
            r0.close()
        L_0x003e:
            throw r3
        L_0x003f:
            boolean r0 = r3 instanceof java.io.InputStream
            if (r0 == 0) goto L_0x004e
            java.io.InputStream r3 = (java.io.InputStream) r3
            byte[] r3 = p425x.p426a.p469f.p471j.C5173a.m11610a(r3)
            x.a.e.b.a.d r3 = m11507a(r3)
            return r3
        L_0x004e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "cannot parse "
            java.lang.String r3 = p213q.p214a.p215a.p216a.C1965a.m4750a(r1, r3)
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p425x.p426a.p445e.p447b.p448a.C5044d.m11507a(java.lang.Object):x.a.e.b.a.d");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5044d.class != obj.getClass()) {
            return false;
        }
        C5044d dVar = (C5044d) obj;
        if (this.f12056e != dVar.f12056e) {
            return false;
        }
        return this.f12057f.equals(dVar.f12057f);
    }

    public byte[] getEncoded() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = this.f12056e;
        byteArrayOutputStream.write((byte) (i >>> 24));
        byteArrayOutputStream.write((byte) (i >>> 16));
        byteArrayOutputStream.write((byte) (i >>> 8));
        byteArrayOutputStream.write((byte) i);
        try {
            byteArrayOutputStream.write(this.f12057f.getEncoded());
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public int hashCode() {
        return this.f12057f.hashCode() + (this.f12056e * 31);
    }
}
