package p425x.p426a.p445e.p467d.p468a;

import p116io.jsonwebtoken.lang.Objects;
import p119o.p120a.C0967p0;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: x.a.e.d.a.b */
public class C5156b {

    /* renamed from: a */
    public int f12342a = 0;

    /* renamed from: b */
    public int f12343b;

    /* JADX WARNING: type inference failed for: r7v1, types: [int] */
    /* JADX WARNING: type inference failed for: r6v2, types: [int] */
    /* JADX WARNING: type inference failed for: r7v2, types: [int] */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r7v3 */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C5156b(byte[] r10) {
        /*
            r9 = this;
            r9.<init>()
            r0 = 0
            r9.f12342a = r0
            int r1 = r10.length
            java.lang.String r2 = "byte array is not an encoded finite field"
            r3 = 4
            if (r1 != r3) goto L_0x005f
            byte r1 = r10[r0]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r3 = 1
            byte r4 = r10[r3]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 8
            r1 = r1 | r4
            r4 = 2
            byte r5 = r10[r4]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 16
            r1 = r1 | r5
            r5 = 3
            byte r10 = r10[r5]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r10 = r10 << 24
            r10 = r10 | r1
            r9.f12343b = r10
            if (r10 != 0) goto L_0x002d
            goto L_0x004e
        L_0x002d:
            int r1 = p119o.p120a.C0967p0.m2167a(r10)
            int r1 = r1 >>> r3
            r5 = r0
        L_0x0033:
            if (r5 >= r1) goto L_0x004d
            int r4 = p119o.p120a.C0967p0.m2169a(r4, r4, r10)
            r6 = r4 ^ 2
            r7 = r6
            r6 = r10
        L_0x003d:
            if (r6 == 0) goto L_0x0047
            int r7 = p119o.p120a.C0967p0.m2168a(r7, r6)
            r8 = r7
            r7 = r6
            r6 = r8
            goto L_0x003d
        L_0x0047:
            if (r7 == r3) goto L_0x004a
            goto L_0x004e
        L_0x004a:
            int r5 = r5 + 1
            goto L_0x0033
        L_0x004d:
            r0 = r3
        L_0x004e:
            if (r0 == 0) goto L_0x0059
            int r10 = r9.f12343b
            int r10 = p119o.p120a.C0967p0.m2167a(r10)
            r9.f12342a = r10
            return
        L_0x0059:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            r10.<init>(r2)
            throw r10
        L_0x005f:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            r10.<init>(r2)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p425x.p426a.p445e.p467d.p468a.C5156b.<init>(byte[]):void");
    }

    /* renamed from: a */
    public int mo11902a(int i) {
        int i2 = (1 << this.f12342a) - 2;
        if (i2 == 0) {
            return 1;
        }
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i2 < 0) {
            i = mo11902a(i);
            i2 = -i2;
        }
        int i3 = 1;
        while (i2 != 0) {
            if ((i2 & 1) == 1) {
                i3 = mo11903a(i3, i);
            }
            i = mo11903a(i, i);
            i2 >>>= 1;
        }
        return i3;
    }

    /* renamed from: a */
    public int mo11903a(int i, int i2) {
        return C0967p0.m2169a(i, i2, this.f12343b);
    }

    /* renamed from: a */
    public byte[] mo11904a() {
        int i = this.f12343b;
        return new byte[]{(byte) i, (byte) (i >>> 8), (byte) (i >>> 16), (byte) (i >>> 24)};
    }

    /* renamed from: b */
    public boolean mo11905b(int i) {
        int i2 = this.f12342a;
        boolean z = false;
        if (i2 == 31) {
            if (i >= 0) {
                z = true;
            }
            return z;
        }
        if (i >= 0 && i < (1 << i2)) {
            z = true;
        }
        return z;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C5156b)) {
            C5156b bVar = (C5156b) obj;
            if (this.f12342a == bVar.f12342a && this.f12343b == bVar.f12343b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f12343b;
    }

    public String toString() {
        String str;
        StringBuilder a = C1965a.m4756a("Finite Field GF(2^");
        a.append(this.f12342a);
        a.append(") = GF(2)[X]/<");
        int i = this.f12343b;
        if (i == 0) {
            str = "0";
        } else {
            String str2 = ((byte) (i & 1)) == 1 ? "1" : Objects.EMPTY_STRING;
            int i2 = i >>> 1;
            int i3 = 1;
            while (i2 != 0) {
                if (((byte) (i2 & 1)) == 1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append("+x^");
                    sb.append(i3);
                    str2 = sb.toString();
                }
                i2 >>>= 1;
                i3++;
            }
            str = str2;
        }
        return C1965a.m4754a(a, str, "> ");
    }
}
