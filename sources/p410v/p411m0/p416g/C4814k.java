package p410v.p411m0.p416g;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.p401r.p403c.C4638h;
import p410v.p411m0.C4737b;
import p410v.p411m0.p416g.C4793d.C4794a;
import p423w.C4882a0;
import p423w.C4886b0;
import p423w.C4892f;
import p423w.C4896i;
import p423w.C4897j;
import p423w.p424c0.C4889a;

/* renamed from: v.m0.g.k */
public final class C4814k implements Closeable {

    /* renamed from: i */
    public static final Logger f11465i;

    /* renamed from: j */
    public static final C4814k f11466j = null;

    /* renamed from: e */
    public final C4815a f11467e;

    /* renamed from: f */
    public final C4794a f11468f;

    /* renamed from: g */
    public final C4896i f11469g;

    /* renamed from: h */
    public final boolean f11470h;

    /* renamed from: v.m0.g.k$a */
    public static final class C4815a implements C4882a0 {

        /* renamed from: e */
        public int f11471e;

        /* renamed from: f */
        public int f11472f;

        /* renamed from: g */
        public int f11473g;

        /* renamed from: h */
        public int f11474h;

        /* renamed from: i */
        public int f11475i;

        /* renamed from: j */
        public final C4896i f11476j;

        public C4815a(C4896i iVar) {
            if (iVar != null) {
                this.f11476j = iVar;
            } else {
                C4638h.m10271a("source");
                throw null;
            }
        }

        /* renamed from: b */
        public long mo11077b(C4892f fVar, long j) {
            int i;
            int readInt;
            if (fVar != null) {
                do {
                    int i2 = this.f11474h;
                    if (i2 == 0) {
                        this.f11476j.skip((long) this.f11475i);
                        this.f11475i = 0;
                        if ((this.f11472f & 4) != 0) {
                            return -1;
                        }
                        i = this.f11473g;
                        int a = C4737b.m10451a(this.f11476j);
                        this.f11474h = a;
                        this.f11471e = a;
                        byte readByte = this.f11476j.readByte() & 255;
                        this.f11472f = this.f11476j.readByte() & 255;
                        C4814k kVar = C4814k.f11466j;
                        if (C4814k.f11465i.isLoggable(Level.FINE)) {
                            C4814k kVar2 = C4814k.f11466j;
                            C4814k.f11465i.fine(C4796e.f11382e.mo11205a(true, this.f11473g, this.f11471e, readByte, this.f11472f));
                        }
                        readInt = this.f11476j.readInt() & Integer.MAX_VALUE;
                        this.f11473g = readInt;
                        if (readByte != 9) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(readByte);
                            sb.append(" != TYPE_CONTINUATION");
                            throw new IOException(sb.toString());
                        }
                    } else {
                        long b = this.f11476j.mo11077b(fVar, Math.min(j, (long) i2));
                        if (b == -1) {
                            return -1;
                        }
                        this.f11474h -= (int) b;
                        return b;
                    }
                } while (readInt == i);
                throw new IOException("TYPE_CONTINUATION streamId changed");
            }
            C4638h.m10271a("sink");
            throw null;
        }

        /* renamed from: b */
        public C4886b0 mo11078b() {
            return this.f11476j.mo11078b();
        }

        public void close() {
        }
    }

    /* renamed from: v.m0.g.k$b */
    public interface C4816b {
        /* renamed from: a */
        void mo11222a();

        /* renamed from: a */
        void mo11223a(int i, int i2, int i3, boolean z);

        /* renamed from: a */
        void mo11224a(int i, int i2, List<C4792c> list);

        /* renamed from: a */
        void mo11225a(int i, long j);

        /* renamed from: a */
        void mo11226a(int i, C4790b bVar);

        /* renamed from: a */
        void mo11227a(int i, C4790b bVar, C4897j jVar);

        /* renamed from: a */
        void mo11228a(boolean z, int i, int i2);

        /* renamed from: a */
        void mo11229a(boolean z, int i, int i2, List<C4792c> list);

        /* renamed from: a */
        void mo11230a(boolean z, int i, C4896i iVar, int i2);

        /* renamed from: a */
        void mo11231a(boolean z, C4825q qVar);
    }

    static {
        Logger logger = Logger.getLogger(C4796e.class.getName());
        C4638h.m10270a((Object) logger, "Logger.getLogger(Http2::class.java.name)");
        f11465i = logger;
    }

    public C4814k(C4896i iVar, boolean z) {
        if (iVar != null) {
            this.f11469g = iVar;
            this.f11470h = z;
            C4815a aVar = new C4815a(iVar);
            this.f11467e = aVar;
            this.f11468f = new C4794a(aVar, 4096, 0, 4);
            return;
        }
        C4638h.m10271a("source");
        throw null;
    }

    /* renamed from: a */
    public static final int m10677a(int i, int i2, int i3) {
        if ((i2 & 8) != 0) {
            i--;
        }
        if (i3 <= i) {
            return i - i3;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("PROTOCOL_ERROR padding ");
        sb.append(i3);
        sb.append(" > remaining length ");
        sb.append(i);
        throw new IOException(sb.toString());
    }

    /* renamed from: a */
    public final void mo11246a(C4816b bVar, int i) {
        int readInt = this.f11469g.readInt();
        bVar.mo11223a(i, readInt & Integer.MAX_VALUE, C4737b.m10442a(this.f11469g.readByte(), 255) + 1, (((int) 2147483648L) & readInt) != 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:80:0x019d, code lost:
        throw new java.io.IOException(p213q.p214a.p215a.p216a.C1965a.m4761b("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", r7));
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo11247a(boolean r14, p410v.p411m0.p416g.C4814k.C4816b r15) {
        /*
            r13 = this;
            if (r15 == 0) goto L_0x02b0
            r0 = 0
            w.i r1 = r13.f11469g     // Catch:{ EOFException -> 0x02af }
            r2 = 9
            r1.mo11457h(r2)     // Catch:{ EOFException -> 0x02af }
            w.i r1 = r13.f11469g
            int r1 = p410v.p411m0.C4737b.m10451a(r1)
            r2 = 16384(0x4000, float:2.2959E-41)
            if (r1 > r2) goto L_0x02a3
            w.i r2 = r13.f11469g
            byte r2 = r2.readByte()
            r8 = r2 & 255(0xff, float:3.57E-43)
            r9 = 4
            if (r14 == 0) goto L_0x002e
            if (r8 != r9) goto L_0x0022
            goto L_0x002e
        L_0x0022:
            java.io.IOException r14 = new java.io.IOException
            java.lang.String r15 = "Expected a SETTINGS frame but was "
            java.lang.String r15 = p213q.p214a.p215a.p216a.C1965a.m4761b(r15, r8)
            r14.<init>(r15)
            throw r14
        L_0x002e:
            w.i r14 = r13.f11469g
            byte r14 = r14.readByte()
            r14 = r14 & 255(0xff, float:3.57E-43)
            w.i r2 = r13.f11469g
            int r2 = r2.readInt()
            r10 = 2147483647(0x7fffffff, float:NaN)
            r11 = r2 & r10
            java.util.logging.Logger r2 = f11465i
            java.util.logging.Level r3 = java.util.logging.Level.FINE
            boolean r2 = r2.isLoggable(r3)
            if (r2 == 0) goto L_0x005b
            java.util.logging.Logger r12 = f11465i
            v.m0.g.e r2 = p410v.p411m0.p416g.C4796e.f11382e
            r3 = 1
            r4 = r11
            r5 = r1
            r6 = r8
            r7 = r14
            java.lang.String r2 = r2.mo11205a(r3, r4, r5, r6, r7)
            r12.fine(r2)
        L_0x005b:
            r2 = 5
            r3 = 8
            r4 = 1
            switch(r8) {
                case 0: goto L_0x0264;
                case 1: goto L_0x0231;
                case 2: goto L_0x0212;
                case 3: goto L_0x01d9;
                case 4: goto L_0x0139;
                case 5: goto L_0x010d;
                case 6: goto L_0x00df;
                case 7: goto L_0x0096;
                case 8: goto L_0x006a;
                default: goto L_0x0062;
            }
        L_0x0062:
            w.i r14 = r13.f11469g
            long r0 = (long) r1
            r14.skip(r0)
            goto L_0x02a2
        L_0x006a:
            if (r1 != r9) goto L_0x008a
            w.i r14 = r13.f11469g
            int r14 = r14.readInt()
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r2 = (long) r14
            long r0 = r0 & r2
            r2 = 0
            int r14 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r14 == 0) goto L_0x0082
            r15.mo11225a(r11, r0)
            goto L_0x02a2
        L_0x0082:
            java.io.IOException r14 = new java.io.IOException
            java.lang.String r15 = "windowSizeIncrement was 0"
            r14.<init>(r15)
            throw r14
        L_0x008a:
            java.io.IOException r14 = new java.io.IOException
            java.lang.String r15 = "TYPE_WINDOW_UPDATE length !=4: "
            java.lang.String r15 = p213q.p214a.p215a.p216a.C1965a.m4761b(r15, r1)
            r14.<init>(r15)
            throw r14
        L_0x0096:
            if (r1 < r3) goto L_0x00d3
            if (r11 != 0) goto L_0x00cb
            w.i r14 = r13.f11469g
            int r14 = r14.readInt()
            w.i r0 = r13.f11469g
            int r0 = r0.readInt()
            int r1 = r1 - r3
            v.m0.g.b$a r2 = p410v.p411m0.p416g.C4790b.f11346m
            v.m0.g.b r2 = r2.mo11187a(r0)
            if (r2 == 0) goto L_0x00bf
            w.j r0 = p423w.C4897j.f11664h
            if (r1 <= 0) goto L_0x00ba
            w.i r0 = r13.f11469g
            long r5 = (long) r1
            w.j r0 = r0.mo11446b(r5)
        L_0x00ba:
            r15.mo11227a(r14, r2, r0)
            goto L_0x02a2
        L_0x00bf:
            java.io.IOException r14 = new java.io.IOException
            java.lang.String r15 = "TYPE_GOAWAY unexpected error code: "
            java.lang.String r15 = p213q.p214a.p215a.p216a.C1965a.m4761b(r15, r0)
            r14.<init>(r15)
            throw r14
        L_0x00cb:
            java.io.IOException r14 = new java.io.IOException
            java.lang.String r15 = "TYPE_GOAWAY streamId != 0"
            r14.<init>(r15)
            throw r14
        L_0x00d3:
            java.io.IOException r14 = new java.io.IOException
            java.lang.String r15 = "TYPE_GOAWAY length < 8: "
            java.lang.String r15 = p213q.p214a.p215a.p216a.C1965a.m4761b(r15, r1)
            r14.<init>(r15)
            throw r14
        L_0x00df:
            if (r1 != r3) goto L_0x0101
            if (r11 != 0) goto L_0x00f9
            w.i r1 = r13.f11469g
            int r1 = r1.readInt()
            w.i r2 = r13.f11469g
            int r2 = r2.readInt()
            r14 = r14 & 1
            if (r14 == 0) goto L_0x00f4
            r0 = r4
        L_0x00f4:
            r15.mo11228a(r0, r1, r2)
            goto L_0x02a2
        L_0x00f9:
            java.io.IOException r14 = new java.io.IOException
            java.lang.String r15 = "TYPE_PING streamId != 0"
            r14.<init>(r15)
            throw r14
        L_0x0101:
            java.io.IOException r14 = new java.io.IOException
            java.lang.String r15 = "TYPE_PING length != 8: "
            java.lang.String r15 = p213q.p214a.p215a.p216a.C1965a.m4761b(r15, r1)
            r14.<init>(r15)
            throw r14
        L_0x010d:
            if (r11 == 0) goto L_0x0131
            r2 = r14 & 8
            if (r2 == 0) goto L_0x011b
            w.i r0 = r13.f11469g
            byte r0 = r0.readByte()
            r0 = r0 & 255(0xff, float:3.57E-43)
        L_0x011b:
            w.i r2 = r13.f11469g
            int r2 = r2.readInt()
            r2 = r2 & r10
            int r1 = r1 + -4
            int r1 = m10677a(r1, r14, r0)
            java.util.List r14 = r13.mo11244a(r1, r0, r14, r11)
            r15.mo11224a(r11, r2, r14)
            goto L_0x02a2
        L_0x0131:
            java.io.IOException r14 = new java.io.IOException
            java.lang.String r15 = "PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0"
            r14.<init>(r15)
            throw r14
        L_0x0139:
            if (r11 != 0) goto L_0x01d1
            r14 = r14 & 1
            if (r14 == 0) goto L_0x014e
            if (r1 != 0) goto L_0x0146
            r15.mo11222a()
            goto L_0x02a2
        L_0x0146:
            java.io.IOException r14 = new java.io.IOException
            java.lang.String r15 = "FRAME_SIZE_ERROR ack frame should be empty!"
            r14.<init>(r15)
            throw r14
        L_0x014e:
            int r14 = r1 % 6
            if (r14 != 0) goto L_0x01c5
            v.m0.g.q r14 = new v.m0.g.q
            r14.<init>()
            u.t.c r1 = p392u.p406t.C4656d.m10291b(r0, r1)
            r3 = 6
            u.t.a r1 = p392u.p406t.C4656d.m10290a(r1, r3)
            int r3 = r1.f10839e
            int r5 = r1.f10840f
            int r1 = r1.f10841g
            if (r1 < 0) goto L_0x016b
            if (r3 > r5) goto L_0x01c0
            goto L_0x016d
        L_0x016b:
            if (r3 < r5) goto L_0x01c0
        L_0x016d:
            w.i r6 = r13.f11469g
            short r6 = r6.readShort()
            r7 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r7
            w.i r7 = r13.f11469g
            int r7 = r7.readInt()
            r8 = 2
            if (r6 == r8) goto L_0x01ac
            r8 = 3
            if (r6 == r8) goto L_0x01aa
            r8 = 16384(0x4000, float:2.2959E-41)
            if (r6 == r9) goto L_0x019e
            if (r6 == r2) goto L_0x018a
            goto L_0x01b9
        L_0x018a:
            if (r7 < r8) goto L_0x0192
            r8 = 16777215(0xffffff, float:2.3509886E-38)
            if (r7 > r8) goto L_0x0192
            goto L_0x01b9
        L_0x0192:
            java.io.IOException r14 = new java.io.IOException
            java.lang.String r15 = "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "
            java.lang.String r15 = p213q.p214a.p215a.p216a.C1965a.m4761b(r15, r7)
            r14.<init>(r15)
            throw r14
        L_0x019e:
            r6 = 7
            if (r7 < 0) goto L_0x01a2
            goto L_0x01b9
        L_0x01a2:
            java.io.IOException r14 = new java.io.IOException
            java.lang.String r15 = "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"
            r14.<init>(r15)
            throw r14
        L_0x01aa:
            r6 = r9
            goto L_0x01b9
        L_0x01ac:
            if (r7 == 0) goto L_0x01b9
            if (r7 != r4) goto L_0x01b1
            goto L_0x01b9
        L_0x01b1:
            java.io.IOException r14 = new java.io.IOException
            java.lang.String r15 = "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"
            r14.<init>(r15)
            throw r14
        L_0x01b9:
            r14.mo11287a(r6, r7)
            if (r3 == r5) goto L_0x01c0
            int r3 = r3 + r1
            goto L_0x016d
        L_0x01c0:
            r15.mo11231a(r0, r14)
            goto L_0x02a2
        L_0x01c5:
            java.io.IOException r14 = new java.io.IOException
            java.lang.String r15 = "TYPE_SETTINGS length % 6 != 0: "
            java.lang.String r15 = p213q.p214a.p215a.p216a.C1965a.m4761b(r15, r1)
            r14.<init>(r15)
            throw r14
        L_0x01d1:
            java.io.IOException r14 = new java.io.IOException
            java.lang.String r15 = "TYPE_SETTINGS streamId != 0"
            r14.<init>(r15)
            throw r14
        L_0x01d9:
            if (r1 != r9) goto L_0x0204
            if (r11 == 0) goto L_0x01fc
            w.i r14 = r13.f11469g
            int r14 = r14.readInt()
            v.m0.g.b$a r0 = p410v.p411m0.p416g.C4790b.f11346m
            v.m0.g.b r0 = r0.mo11187a(r14)
            if (r0 == 0) goto L_0x01f0
            r15.mo11226a(r11, r0)
            goto L_0x02a2
        L_0x01f0:
            java.io.IOException r15 = new java.io.IOException
            java.lang.String r0 = "TYPE_RST_STREAM unexpected error code: "
            java.lang.String r14 = p213q.p214a.p215a.p216a.C1965a.m4761b(r0, r14)
            r15.<init>(r14)
            throw r15
        L_0x01fc:
            java.io.IOException r14 = new java.io.IOException
            java.lang.String r15 = "TYPE_RST_STREAM streamId == 0"
            r14.<init>(r15)
            throw r14
        L_0x0204:
            java.io.IOException r14 = new java.io.IOException
            java.lang.String r15 = "TYPE_RST_STREAM length: "
            java.lang.String r0 = " != 4"
            java.lang.String r15 = p213q.p214a.p215a.p216a.C1965a.m4762b(r15, r1, r0)
            r14.<init>(r15)
            throw r14
        L_0x0212:
            if (r1 != r2) goto L_0x0223
            if (r11 == 0) goto L_0x021b
            r13.mo11246a(r15, r11)
            goto L_0x02a2
        L_0x021b:
            java.io.IOException r14 = new java.io.IOException
            java.lang.String r15 = "TYPE_PRIORITY streamId == 0"
            r14.<init>(r15)
            throw r14
        L_0x0223:
            java.io.IOException r14 = new java.io.IOException
            java.lang.String r15 = "TYPE_PRIORITY length: "
            java.lang.String r0 = " != 5"
            java.lang.String r15 = p213q.p214a.p215a.p216a.C1965a.m4762b(r15, r1, r0)
            r14.<init>(r15)
            throw r14
        L_0x0231:
            if (r11 == 0) goto L_0x025c
            r2 = r14 & 1
            if (r2 == 0) goto L_0x0239
            r2 = r4
            goto L_0x023a
        L_0x0239:
            r2 = r0
        L_0x023a:
            r3 = r14 & 8
            if (r3 == 0) goto L_0x0246
            w.i r0 = r13.f11469g
            byte r0 = r0.readByte()
            r0 = r0 & 255(0xff, float:3.57E-43)
        L_0x0246:
            r3 = r14 & 32
            if (r3 == 0) goto L_0x024f
            r13.mo11246a(r15, r11)
            int r1 = r1 + -5
        L_0x024f:
            int r1 = m10677a(r1, r14, r0)
            java.util.List r14 = r13.mo11244a(r1, r0, r14, r11)
            r0 = -1
            r15.mo11229a(r2, r11, r0, r14)
            goto L_0x02a2
        L_0x025c:
            java.io.IOException r14 = new java.io.IOException
            java.lang.String r15 = "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"
            r14.<init>(r15)
            throw r14
        L_0x0264:
            if (r11 == 0) goto L_0x029a
            r2 = r14 & 1
            if (r2 == 0) goto L_0x026c
            r2 = r4
            goto L_0x026d
        L_0x026c:
            r2 = r0
        L_0x026d:
            r3 = r14 & 32
            if (r3 == 0) goto L_0x0273
            r3 = r4
            goto L_0x0274
        L_0x0273:
            r3 = r0
        L_0x0274:
            if (r3 != 0) goto L_0x0292
            r3 = r14 & 8
            if (r3 == 0) goto L_0x0282
            w.i r0 = r13.f11469g
            byte r0 = r0.readByte()
            r0 = r0 & 255(0xff, float:3.57E-43)
        L_0x0282:
            int r14 = m10677a(r1, r14, r0)
            w.i r1 = r13.f11469g
            r15.mo11230a(r2, r11, r1, r14)
            w.i r14 = r13.f11469g
            long r0 = (long) r0
            r14.skip(r0)
            goto L_0x02a2
        L_0x0292:
            java.io.IOException r14 = new java.io.IOException
            java.lang.String r15 = "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"
            r14.<init>(r15)
            throw r14
        L_0x029a:
            java.io.IOException r14 = new java.io.IOException
            java.lang.String r15 = "PROTOCOL_ERROR: TYPE_DATA streamId == 0"
            r14.<init>(r15)
            throw r14
        L_0x02a2:
            return r4
        L_0x02a3:
            java.io.IOException r14 = new java.io.IOException
            java.lang.String r15 = "FRAME_SIZE_ERROR: "
            java.lang.String r15 = p213q.p214a.p215a.p216a.C1965a.m4761b(r15, r1)
            r14.<init>(r15)
            throw r14
        L_0x02af:
            return r0
        L_0x02b0:
            java.lang.String r14 = "handler"
            p392u.p401r.p403c.C4638h.m10271a(r14)
            r14 = 0
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p410v.p411m0.p416g.C4814k.mo11247a(boolean, v.m0.g.k$b):boolean");
    }

    public void close() {
        this.f11469g.close();
    }

    /* renamed from: a */
    public final void mo11245a(C4816b bVar) {
        if (bVar == null) {
            C4638h.m10271a("handler");
            throw null;
        } else if (!this.f11470h) {
            C4897j b = this.f11469g.mo11446b((long) C4796e.f11378a.mo11503g());
            if (f11465i.isLoggable(Level.FINE)) {
                Logger logger = f11465i;
                StringBuilder a = C1965a.m4756a("<< CONNECTION ");
                a.append(b.mo11504h());
                logger.fine(C4737b.m10455a(a.toString(), new Object[0]));
            }
            if (!C4638h.m10272a((Object) C4796e.f11378a, (Object) b)) {
                StringBuilder a2 = C1965a.m4756a("Expected a connection header but was ");
                if (b != null) {
                    a2.append(C4889a.m10953h(b));
                    throw new IOException(a2.toString());
                }
                throw null;
            }
        } else if (!mo11247a(true, bVar)) {
            throw new IOException("Required SETTINGS preface not received");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<p410v.p411m0.p416g.C4792c> mo11244a(int r3, int r4, int r5, int r6) {
        /*
            r2 = this;
            v.m0.g.k$a r0 = r2.f11467e
            r0.f11474h = r3
            r0.f11471e = r3
            r0.f11475i = r4
            r0.f11472f = r5
            r0.f11473g = r6
            v.m0.g.d$a r3 = r2.f11468f
        L_0x000e:
            w.i r4 = r3.f11361b
            boolean r4 = r4.mo11460i()
            if (r4 != 0) goto L_0x0138
            w.i r4 = r3.f11361b
            byte r4 = r4.readByte()
            r5 = 255(0xff, float:3.57E-43)
            int r4 = p410v.p411m0.C4737b.m10442a(r4, r5)
            r5 = 128(0x80, float:1.794E-43)
            if (r4 == r5) goto L_0x0130
            r6 = r4 & 128(0x80, float:1.794E-43)
            r0 = 1
            if (r6 != r5) goto L_0x0082
            r5 = 127(0x7f, float:1.78E-43)
            int r4 = r3.mo11193a(r4, r5)
            int r4 = r4 - r0
            if (r4 < 0) goto L_0x003e
            v.m0.g.d r5 = p410v.p411m0.p416g.C4793d.f11359c
            v.m0.g.c[] r5 = p410v.p411m0.p416g.C4793d.f11357a
            int r5 = r5.length
            int r5 = r5 - r0
            if (r4 > r5) goto L_0x003e
            r5 = r0
            goto L_0x003f
        L_0x003e:
            r5 = 0
        L_0x003f:
            if (r5 == 0) goto L_0x004d
            v.m0.g.d r5 = p410v.p411m0.p416g.C4793d.f11359c
            v.m0.g.c[] r5 = p410v.p411m0.p416g.C4793d.f11357a
            r4 = r5[r4]
            java.util.List<v.m0.g.c> r5 = r3.f11360a
            r5.add(r4)
            goto L_0x000e
        L_0x004d:
            v.m0.g.d r5 = p410v.p411m0.p416g.C4793d.f11359c
            v.m0.g.c[] r5 = p410v.p411m0.p416g.C4793d.f11357a
            int r5 = r5.length
            int r5 = r4 - r5
            int r5 = r3.mo11192a(r5)
            if (r5 < 0) goto L_0x006e
            v.m0.g.c[] r6 = r3.f11362c
            int r1 = r6.length
            if (r5 >= r1) goto L_0x006e
            java.util.List<v.m0.g.c> r4 = r3.f11360a
            r5 = r6[r5]
            if (r5 == 0) goto L_0x0069
            r4.add(r5)
            goto L_0x000e
        L_0x0069:
            p392u.p401r.p403c.C4638h.m10269a()
            r3 = 0
            throw r3
        L_0x006e:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r5 = "Header index too large "
            java.lang.StringBuilder r5 = p213q.p214a.p215a.p216a.C1965a.m4756a(r5)
            int r4 = r4 + r0
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.<init>(r4)
            throw r3
        L_0x0082:
            r5 = -1
            r6 = 64
            if (r4 != r6) goto L_0x009e
            v.m0.g.d r4 = p410v.p411m0.p416g.C4793d.f11359c
            w.j r6 = r3.mo11197b()
            r4.mo11191a(r6)
            w.j r4 = r3.mo11197b()
            v.m0.g.c r0 = new v.m0.g.c
            r0.<init>(r6, r4)
            r3.mo11195a(r5, r0)
            goto L_0x000e
        L_0x009e:
            r1 = r4 & 64
            if (r1 != r6) goto L_0x00bb
            r6 = 63
            int r4 = r3.mo11193a(r4, r6)
            int r4 = r4 - r0
            w.j r4 = r3.mo11198c(r4)
            w.j r6 = r3.mo11197b()
            v.m0.g.c r0 = new v.m0.g.c
            r0.<init>(r4, r6)
            r3.mo11195a(r5, r0)
            goto L_0x000e
        L_0x00bb:
            r5 = r4 & 32
            r6 = 32
            if (r5 != r6) goto L_0x00f5
            r5 = 31
            int r4 = r3.mo11193a(r4, r5)
            r3.f11367h = r4
            if (r4 < 0) goto L_0x00e0
            int r5 = r3.f11366g
            if (r4 > r5) goto L_0x00e0
            int r5 = r3.f11365f
            if (r4 >= r5) goto L_0x000e
            if (r4 != 0) goto L_0x00da
            r3.mo11194a()
            goto L_0x000e
        L_0x00da:
            int r5 = r5 - r4
            r3.mo11196b(r5)
            goto L_0x000e
        L_0x00e0:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r5 = "Invalid dynamic table size update "
            java.lang.StringBuilder r5 = p213q.p214a.p215a.p216a.C1965a.m4756a(r5)
            int r3 = r3.f11367h
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3)
            throw r4
        L_0x00f5:
            r5 = 16
            if (r4 == r5) goto L_0x0117
            if (r4 != 0) goto L_0x00fc
            goto L_0x0117
        L_0x00fc:
            r5 = 15
            int r4 = r3.mo11193a(r4, r5)
            int r4 = r4 - r0
            w.j r4 = r3.mo11198c(r4)
            w.j r5 = r3.mo11197b()
            java.util.List<v.m0.g.c> r6 = r3.f11360a
            v.m0.g.c r0 = new v.m0.g.c
            r0.<init>(r4, r5)
            r6.add(r0)
            goto L_0x000e
        L_0x0117:
            v.m0.g.d r4 = p410v.p411m0.p416g.C4793d.f11359c
            w.j r5 = r3.mo11197b()
            r4.mo11191a(r5)
            w.j r4 = r3.mo11197b()
            java.util.List<v.m0.g.c> r6 = r3.f11360a
            v.m0.g.c r0 = new v.m0.g.c
            r0.<init>(r5, r4)
            r6.add(r0)
            goto L_0x000e
        L_0x0130:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r4 = "index == 0"
            r3.<init>(r4)
            throw r3
        L_0x0138:
            v.m0.g.d$a r3 = r2.f11468f
            java.util.List<v.m0.g.c> r4 = r3.f11360a
            java.util.List r4 = p392u.p393n.C4568g.m10215a(r4)
            java.util.List<v.m0.g.c> r3 = r3.f11360a
            r3.clear()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p410v.p411m0.p416g.C4814k.mo11244a(int, int, int, int):java.util.List");
    }
}
