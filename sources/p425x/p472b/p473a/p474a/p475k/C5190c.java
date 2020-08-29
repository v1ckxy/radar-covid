package p425x.p472b.p473a.p474a.p475k;

import java.security.PublicKey;
import p410v.C4877y;

/* renamed from: x.b.a.a.k.c */
public class C5190c implements C4877y {

    /* renamed from: a */
    public final PublicKey f12407a;

    public C5190c(PublicKey publicKey) {
        this.f12407a = publicKey;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f7, code lost:
        p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5235a((java.io.Closeable) r1, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00fa, code lost:
        throw r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p410v.C4720i0 mo11074a(p410v.C4877y.C4878a r12) {
        /*
            r11 = this;
            v.e0 r0 = r12.mo11176g()
            v.i0 r12 = r12.mo11170a(r0)
            boolean r0 = r12.mo11034f()
            if (r0 != 0) goto L_0x000f
            return r12
        L_0x000f:
            v.i0 r0 = r12.f11068n
            if (r0 == 0) goto L_0x0014
            return r12
        L_0x0014:
            v.w r0 = r12.f11065k
            java.lang.String r1 = "signature"
            java.lang.String r0 = r0.mo11366a(r1)
            if (r0 == 0) goto L_0x0120
            java.security.PublicKey r1 = r11.f12407a
            if (r1 == 0) goto L_0x0118
            io.jsonwebtoken.JwtParserBuilder r2 = p116io.jsonwebtoken.Jwts.parserBuilder()     // Catch:{ SignatureException -> 0x010d, ExpiredJwtException -> 0x010b }
            io.jsonwebtoken.JwtParserBuilder r1 = r2.setSigningKey(r1)     // Catch:{ SignatureException -> 0x010d, ExpiredJwtException -> 0x010b }
            io.jsonwebtoken.JwtParser r1 = r1.build()     // Catch:{ SignatureException -> 0x010d, ExpiredJwtException -> 0x010b }
            io.jsonwebtoken.Jws r0 = r1.parseClaimsJws(r0)     // Catch:{ SignatureException -> 0x010d, ExpiredJwtException -> 0x010b }
            java.lang.Object r0 = r0.getBody()     // Catch:{ SignatureException -> 0x010d, ExpiredJwtException -> 0x010b }
            io.jsonwebtoken.Claims r0 = (p116io.jsonwebtoken.Claims) r0     // Catch:{ SignatureException -> 0x010d, ExpiredJwtException -> 0x010b }
            java.lang.String r1 = "content-hash"
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.Object r0 = r0.get(r1, r2)     // Catch:{ SignatureException -> 0x010d, ExpiredJwtException -> 0x010b }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ SignatureException -> 0x010d, ExpiredJwtException -> 0x010b }
            byte[] r0 = p119o.p120a.C0967p0.m2216a(r0)     // Catch:{ SignatureException -> 0x010d, ExpiredJwtException -> 0x010b }
            r1 = 67108864(0x4000000, double:3.31561842E-316)
            v.j0 r3 = r12.f11066l
            r4 = 0
            if (r3 == 0) goto L_0x0107
            w.i r3 = r3.mo10991h()
            w.i r3 = r3.peek()
            w.f r5 = new w.f
            r5.<init>()
            r3.mo11447c(r1)
            w.f r6 = r3.getBuffer()
            long r6 = r6.f11661f
            long r1 = java.lang.Math.min(r1, r6)
        L_0x0068:
            r6 = 0
            int r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            r7 = -1
            if (r6 <= 0) goto L_0x0080
            long r9 = r3.mo11077b(r5, r1)
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x007a
            long r1 = r1 - r9
            goto L_0x0068
        L_0x007a:
            java.io.EOFException r12 = new java.io.EOFException
            r12.<init>()
            throw r12
        L_0x0080:
            v.j0$b r1 = p410v.C4725j0.f11106f
            v.j0 r2 = r12.f11066l
            v.z r2 = r2.mo10990g()
            long r9 = r5.f11661f
            v.j0 r1 = r1.mo11053a(r5, r2, r9)
            long r2 = r1.mo10989f()
            r5 = 2147483647(0x7fffffff, float:NaN)
            long r5 = (long) r5
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 > 0) goto L_0x00fb
            w.i r1 = r1.mo10991h()
            byte[] r5 = r1.mo11451e()     // Catch:{ all -> 0x00f4 }
            p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5235a(r1, r4)
            int r1 = r5.length
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x00d4
            long r6 = (long) r1
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x00b0
            goto L_0x00d4
        L_0x00b0:
            java.io.IOException r12 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "Content-Length ("
            r0.append(r4)
            r0.append(r2)
            java.lang.String r2 = ") and stream length ("
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = ") disagree"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r12.<init>(r0)
            throw r12
        L_0x00d4:
            java.lang.String r1 = "SHA-256"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch:{ NoSuchAlgorithmException -> 0x00ed }
            byte[] r1 = r1.digest(r5)     // Catch:{ NoSuchAlgorithmException -> 0x00ed }
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 == 0) goto L_0x00e5
            return r12
        L_0x00e5:
            x.b.a.a.k.b r12 = new x.b.a.a.k.b
            java.lang.String r0 = "Signature mismatch"
            r12.<init>(r0)
            throw r12
        L_0x00ed:
            r12 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r12)
            throw r0
        L_0x00f4:
            r12 = move-exception
            throw r12     // Catch:{ all -> 0x00f6 }
        L_0x00f6:
            r0 = move-exception
            p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5235a(r1, r12)
            throw r0
        L_0x00fb:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r0 = "Cannot buffer entire body for content length: "
            java.lang.String r0 = p213q.p214a.p215a.p216a.C1965a.m4748a(r0, r2)
            r12.<init>(r0)
            throw r12
        L_0x0107:
            p392u.p401r.p403c.C4638h.m10269a()
            throw r4
        L_0x010b:
            r12 = move-exception
            goto L_0x010e
        L_0x010d:
            r12 = move-exception
        L_0x010e:
            x.b.a.a.k.b r0 = new x.b.a.a.k.b
            java.lang.String r1 = r12.getMessage()
            r0.<init>(r1, r12)
            throw r0
        L_0x0118:
            x.b.a.a.k.b r12 = new x.b.a.a.k.b
            java.lang.String r0 = "Public key not specified"
            r12.<init>(r0)
            throw r12
        L_0x0120:
            x.b.a.a.k.b r12 = new x.b.a.a.k.b
            java.lang.String r0 = "JWS header not found"
            r12.<init>(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p425x.p472b.p473a.p474a.p475k.C5190c.mo11074a(v.y$a):v.i0");
    }
}
