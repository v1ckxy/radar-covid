package p425x.p426a.p445e.p447b.p448a;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import p425x.p426a.p469f.C5162c;

/* renamed from: x.a.e.b.a.j */
public class C5052j implements C5162c {

    /* renamed from: e */
    public final int f12088e;

    /* renamed from: f */
    public final C5047f f12089f;

    /* renamed from: g */
    public final C5053k f12090g;

    /* renamed from: h */
    public final byte[][] f12091h;

    public C5052j(int i, C5047f fVar, C5053k kVar, byte[][] bArr) {
        this.f12088e = i;
        this.f12089f = fVar;
        this.f12090g = kVar;
        this.f12091h = bArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0058  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p425x.p426a.p445e.p447b.p448a.C5052j m11517a(java.lang.Object r7) {
        /*
            boolean r0 = r7 instanceof p425x.p426a.p445e.p447b.p448a.C5052j
            if (r0 == 0) goto L_0x0007
            x.a.e.b.a.j r7 = (p425x.p426a.p445e.p447b.p448a.C5052j) r7
            return r7
        L_0x0007:
            boolean r0 = r7 instanceof java.io.DataInputStream
            if (r0 == 0) goto L_0x0039
            r0 = r7
            java.io.DataInputStream r0 = (java.io.DataInputStream) r0
            int r1 = r0.readInt()
            x.a.e.b.a.f r7 = p425x.p426a.p445e.p447b.p448a.C5047f.m11509a(r7)
            int r2 = r0.readInt()
            x.a.e.b.a.k r2 = p425x.p426a.p445e.p447b.p448a.C5053k.m11518a(r2)
            int r3 = r2.f12100c
            byte[][] r4 = new byte[r3][]
            r5 = 0
        L_0x0023:
            if (r5 >= r3) goto L_0x0033
            int r6 = r2.f12099b
            byte[] r6 = new byte[r6]
            r4[r5] = r6
            r6 = r4[r5]
            r0.readFully(r6)
            int r5 = r5 + 1
            goto L_0x0023
        L_0x0033:
            x.a.e.b.a.j r0 = new x.a.e.b.a.j
            r0.<init>(r1, r7, r2, r4)
            return r0
        L_0x0039:
            boolean r0 = r7 instanceof byte[]
            if (r0 == 0) goto L_0x005c
            r0 = 0
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch:{ all -> 0x0055 }
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x0055 }
            byte[] r7 = (byte[]) r7     // Catch:{ all -> 0x0055 }
            r2.<init>(r7)     // Catch:{ all -> 0x0055 }
            r1.<init>(r2)     // Catch:{ all -> 0x0055 }
            x.a.e.b.a.j r7 = m11517a(r1)     // Catch:{ all -> 0x0052 }
            r1.close()
            return r7
        L_0x0052:
            r7 = move-exception
            r0 = r1
            goto L_0x0056
        L_0x0055:
            r7 = move-exception
        L_0x0056:
            if (r0 == 0) goto L_0x005b
            r0.close()
        L_0x005b:
            throw r7
        L_0x005c:
            boolean r0 = r7 instanceof java.io.InputStream
            if (r0 == 0) goto L_0x006b
            java.io.InputStream r7 = (java.io.InputStream) r7
            byte[] r7 = p425x.p426a.p469f.p471j.C5173a.m11610a(r7)
            x.a.e.b.a.j r7 = m11517a(r7)
            return r7
        L_0x006b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "cannot parse "
            java.lang.String r7 = p213q.p214a.p215a.p216a.C1965a.m4750a(r1, r7)
            r0.<init>(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p425x.p426a.p445e.p447b.p448a.C5052j.m11517a(java.lang.Object):x.a.e.b.a.j");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5052j.class != obj.getClass()) {
            return false;
        }
        C5052j jVar = (C5052j) obj;
        if (this.f12088e != jVar.f12088e) {
            return false;
        }
        C5047f fVar = this.f12089f;
        if (fVar == null ? jVar.f12089f != null : !fVar.equals(jVar.f12089f)) {
            return false;
        }
        C5053k kVar = this.f12090g;
        if (kVar == null ? jVar.f12090g == null : kVar.equals(jVar.f12090g)) {
            return Arrays.deepEquals(this.f12091h, jVar.f12091h);
        }
        return false;
    }

    public byte[] getEncoded() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = this.f12088e;
        byteArrayOutputStream.write((byte) (i >>> 24));
        byteArrayOutputStream.write((byte) (i >>> 16));
        byteArrayOutputStream.write((byte) (i >>> 8));
        byteArrayOutputStream.write((byte) i);
        try {
            byteArrayOutputStream.write(this.f12089f.getEncoded());
            int i2 = this.f12090g.f12098a;
            byteArrayOutputStream.write((byte) (i2 >>> 24));
            byteArrayOutputStream.write((byte) (i2 >>> 16));
            byteArrayOutputStream.write((byte) (i2 >>> 8));
            byteArrayOutputStream.write((byte) i2);
            try {
                for (byte[] write : this.f12091h) {
                    byteArrayOutputStream.write(write);
                }
                return byteArrayOutputStream.toByteArray();
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage(), e);
            }
        } catch (Exception e2) {
            throw new RuntimeException(e2.getMessage(), e2);
        }
    }

    public int hashCode() {
        int i = this.f12088e * 31;
        C5047f fVar = this.f12089f;
        int i2 = 0;
        int hashCode = (i + (fVar != null ? fVar.hashCode() : 0)) * 31;
        C5053k kVar = this.f12090g;
        if (kVar != null) {
            i2 = kVar.hashCode();
        }
        return Arrays.deepHashCode(this.f12091h) + ((hashCode + i2) * 31);
    }
}
