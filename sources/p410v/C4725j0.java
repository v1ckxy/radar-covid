package p410v;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import p392u.p401r.p403c.C4636f;
import p392u.p401r.p403c.C4638h;
import p410v.p411m0.C4737b;
import p423w.C4896i;

/* renamed from: v.j0 */
public abstract class C4725j0 implements Closeable {

    /* renamed from: f */
    public static final C4727b f11106f = new C4727b(null);

    /* renamed from: e */
    public Reader f11107e;

    /* renamed from: v.j0$a */
    public static final class C4726a extends Reader {

        /* renamed from: e */
        public boolean f11108e;

        /* renamed from: f */
        public Reader f11109f;

        /* renamed from: g */
        public final C4896i f11110g;

        /* renamed from: h */
        public final Charset f11111h;

        public C4726a(C4896i iVar, Charset charset) {
            if (iVar == null) {
                C4638h.m10271a("source");
                throw null;
            } else if (charset != null) {
                this.f11110g = iVar;
                this.f11111h = charset;
            } else {
                C4638h.m10271a("charset");
                throw null;
            }
        }

        public void close() {
            this.f11108e = true;
            Reader reader = this.f11109f;
            if (reader != null) {
                reader.close();
            } else {
                this.f11110g.close();
            }
        }

        public int read(char[] cArr, int i, int i2) {
            if (cArr == null) {
                C4638h.m10271a("cbuf");
                throw null;
            } else if (!this.f11108e) {
                Reader reader = this.f11109f;
                if (reader == null) {
                    reader = new InputStreamReader(this.f11110g.mo11469q(), C4737b.m10457a(this.f11110g, this.f11111h));
                    this.f11109f = reader;
                }
                return reader.read(cArr, i, i2);
            } else {
                throw new IOException("Stream closed");
            }
        }
    }

    /* renamed from: v.j0$b */
    public static final class C4727b {

        /* renamed from: v.j0$b$a */
        public static final class C4728a extends C4725j0 {

            /* renamed from: g */
            public final /* synthetic */ C4896i f11112g;

            /* renamed from: h */
            public final /* synthetic */ C4879z f11113h;

            /* renamed from: i */
            public final /* synthetic */ long f11114i;

            public C4728a(C4896i iVar, C4879z zVar, long j) {
                this.f11112g = iVar;
                this.f11113h = zVar;
                this.f11114i = j;
            }

            /* renamed from: f */
            public long mo10989f() {
                return this.f11114i;
            }

            /* renamed from: g */
            public C4879z mo10990g() {
                return this.f11113h;
            }

            /* renamed from: h */
            public C4896i mo10991h() {
                return this.f11112g;
            }
        }

        public /* synthetic */ C4727b(C4636f fVar) {
        }

        /* renamed from: a */
        public final C4725j0 mo11053a(C4896i iVar, C4879z zVar, long j) {
            if (iVar != null) {
                return new C4728a(iVar, zVar, j);
            }
            C4638h.m10271a("$this$asResponseBody");
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r2 != null) goto L_0x001c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.Reader mo11048a() {
        /*
            r4 = this;
            java.io.Reader r0 = r4.f11107e
            if (r0 == 0) goto L_0x0005
            goto L_0x0021
        L_0x0005:
            v.j0$a r0 = new v.j0$a
            w.i r1 = r4.mo10991h()
            v.z r2 = r4.mo10990g()
            if (r2 == 0) goto L_0x001a
            java.nio.charset.Charset r3 = p392u.p409w.C4674a.f10859a
            java.nio.charset.Charset r2 = r2.mo11411a(r3)
            if (r2 == 0) goto L_0x001a
            goto L_0x001c
        L_0x001a:
            java.nio.charset.Charset r2 = p392u.p409w.C4674a.f10859a
        L_0x001c:
            r0.<init>(r1, r2)
            r4.f11107e = r0
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p410v.C4725j0.mo11048a():java.io.Reader");
    }

    public void close() {
        C4737b.m10463a((Closeable) mo10991h());
    }

    /* renamed from: f */
    public abstract long mo10989f();

    /* renamed from: g */
    public abstract C4879z mo10990g();

    /* renamed from: h */
    public abstract C4896i mo10991h();

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
        p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5235a((java.io.Closeable) r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        throw r2;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo11050k() {
        /*
            r3 = this;
            w.i r0 = r3.mo10991h()
            v.z r1 = r3.mo10990g()     // Catch:{ all -> 0x0022 }
            if (r1 == 0) goto L_0x0013
            java.nio.charset.Charset r2 = p392u.p409w.C4674a.f10859a     // Catch:{ all -> 0x0022 }
            java.nio.charset.Charset r1 = r1.mo11411a(r2)     // Catch:{ all -> 0x0022 }
            if (r1 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            java.nio.charset.Charset r1 = p392u.p409w.C4674a.f10859a     // Catch:{ all -> 0x0022 }
        L_0x0015:
            java.nio.charset.Charset r1 = p410v.p411m0.C4737b.m10457a(r0, r1)     // Catch:{ all -> 0x0022 }
            java.lang.String r1 = r0.mo11438a(r1)     // Catch:{ all -> 0x0022 }
            r2 = 0
            p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5235a(r0, r2)
            return r1
        L_0x0022:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0024 }
        L_0x0024:
            r2 = move-exception
            p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5235a(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p410v.C4725j0.mo11050k():java.lang.String");
    }
}
