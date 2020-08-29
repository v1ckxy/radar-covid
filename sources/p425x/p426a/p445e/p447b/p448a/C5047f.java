package p425x.p426a.p445e.p447b.p448a;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import p425x.p426a.p469f.C5162c;

/* renamed from: x.a.e.b.a.f */
public class C5047f implements C5162c {

    /* renamed from: e */
    public final C5045e f12068e;

    /* renamed from: f */
    public final byte[] f12069f;

    /* renamed from: g */
    public final byte[] f12070g;

    public C5047f(C5045e eVar, byte[] bArr, byte[] bArr2) {
        this.f12068e = eVar;
        this.f12069f = bArr;
        this.f12070g = bArr2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p425x.p426a.p445e.p447b.p448a.C5047f m11509a(java.lang.Object r4) {
        /*
            boolean r0 = r4 instanceof p425x.p426a.p445e.p447b.p448a.C5047f
            if (r0 == 0) goto L_0x0007
            x.a.e.b.a.f r4 = (p425x.p426a.p445e.p447b.p448a.C5047f) r4
            return r4
        L_0x0007:
            boolean r0 = r4 instanceof java.io.DataInputStream
            if (r0 == 0) goto L_0x002c
            java.io.DataInputStream r4 = (java.io.DataInputStream) r4
            int r0 = r4.readInt()
            x.a.e.b.a.e r0 = p425x.p426a.p445e.p447b.p448a.C5045e.m11508a(r0)
            int r1 = r0.f12064b
            byte[] r1 = new byte[r1]
            r4.readFully(r1)
            int r2 = r0.f12066d
            int r3 = r0.f12064b
            int r2 = r2 * r3
            byte[] r2 = new byte[r2]
            r4.readFully(r2)
            x.a.e.b.a.f r4 = new x.a.e.b.a.f
            r4.<init>(r0, r1, r2)
            return r4
        L_0x002c:
            boolean r0 = r4 instanceof byte[]
            if (r0 == 0) goto L_0x004f
            r0 = 0
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch:{ all -> 0x0048 }
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x0048 }
            byte[] r4 = (byte[]) r4     // Catch:{ all -> 0x0048 }
            r2.<init>(r4)     // Catch:{ all -> 0x0048 }
            r1.<init>(r2)     // Catch:{ all -> 0x0048 }
            x.a.e.b.a.f r4 = m11509a(r1)     // Catch:{ all -> 0x0045 }
            r1.close()
            return r4
        L_0x0045:
            r4 = move-exception
            r0 = r1
            goto L_0x0049
        L_0x0048:
            r4 = move-exception
        L_0x0049:
            if (r0 == 0) goto L_0x004e
            r0.close()
        L_0x004e:
            throw r4
        L_0x004f:
            boolean r0 = r4 instanceof java.io.InputStream
            if (r0 == 0) goto L_0x005e
            java.io.InputStream r4 = (java.io.InputStream) r4
            byte[] r4 = p425x.p426a.p469f.p471j.C5173a.m11610a(r4)
            x.a.e.b.a.f r4 = m11509a(r4)
            return r4
        L_0x005e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "cannot parse "
            java.lang.String r4 = p213q.p214a.p215a.p216a.C1965a.m4750a(r1, r4)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p425x.p426a.p445e.p447b.p448a.C5047f.m11509a(java.lang.Object):x.a.e.b.a.f");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5047f.class != obj.getClass()) {
            return false;
        }
        C5047f fVar = (C5047f) obj;
        C5045e eVar = this.f12068e;
        if (eVar == null ? fVar.f12068e != null : !eVar.equals(fVar.f12068e)) {
            return false;
        }
        if (!Arrays.equals(this.f12069f, fVar.f12069f)) {
            return false;
        }
        return Arrays.equals(this.f12070g, fVar.f12070g);
    }

    public byte[] getEncoded() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = this.f12068e.f12063a;
        byteArrayOutputStream.write((byte) (i >>> 24));
        byteArrayOutputStream.write((byte) (i >>> 16));
        byteArrayOutputStream.write((byte) (i >>> 8));
        byteArrayOutputStream.write((byte) i);
        try {
            byteArrayOutputStream.write(this.f12069f);
            try {
                byteArrayOutputStream.write(this.f12070g);
                return byteArrayOutputStream.toByteArray();
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage(), e);
            }
        } catch (Exception e2) {
            throw new RuntimeException(e2.getMessage(), e2);
        }
    }

    public int hashCode() {
        C5045e eVar = this.f12068e;
        return Arrays.hashCode(this.f12070g) + ((Arrays.hashCode(this.f12069f) + ((eVar != null ? eVar.hashCode() : 0) * 31)) * 31);
    }
}
