package okhttp3.internal.publicsuffix;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p392u.p401r.p403c.C4636f;
import p392u.p401r.p403c.C4638h;
import p410v.p411m0.C4737b;

public final class PublicSuffixDatabase {

    /* renamed from: e */
    public static final byte[] f2661e = {(byte) 42};

    /* renamed from: f */
    public static final List<String> f2662f = C2286e.m5332e("*");

    /* renamed from: g */
    public static final PublicSuffixDatabase f2663g = new PublicSuffixDatabase();

    /* renamed from: h */
    public static final C1013a f2664h = new C1013a(null);

    /* renamed from: a */
    public final AtomicBoolean f2665a = new AtomicBoolean(false);

    /* renamed from: b */
    public final CountDownLatch f2666b = new CountDownLatch(1);

    /* renamed from: c */
    public byte[] f2667c;

    /* renamed from: d */
    public byte[] f2668d;

    /* renamed from: okhttp3.internal.publicsuffix.PublicSuffixDatabase$a */
    public static final class C1013a {
        public /* synthetic */ C1013a(C4636f fVar) {
        }

        /* renamed from: a */
        public static final /* synthetic */ String m2316a(C1013a aVar, byte[] bArr, byte[][] bArr2, int i) {
            int i2;
            int i3;
            boolean z;
            int a;
            byte[] bArr3 = bArr;
            byte[][] bArr4 = bArr2;
            if (aVar != null) {
                int length = bArr3.length;
                int i4 = 0;
                while (i4 < length) {
                    int i5 = (i4 + length) / 2;
                    while (i5 > -1 && bArr3[i5] != ((byte) 10)) {
                        i5--;
                    }
                    int i6 = i5 + 1;
                    int i7 = 1;
                    while (true) {
                        i2 = i6 + i7;
                        if (bArr3[i2] == ((byte) 10)) {
                            break;
                        }
                        i7++;
                    }
                    int i8 = i2 - i6;
                    int i9 = i;
                    boolean z2 = false;
                    int i10 = 0;
                    int i11 = 0;
                    while (true) {
                        if (z2) {
                            i3 = 46;
                            z = false;
                        } else {
                            boolean z3 = z2;
                            i3 = C4737b.m10442a(bArr4[i9][i10], 255);
                            z = z3;
                        }
                        a = i3 - C4737b.m10442a(bArr3[i6 + i11], 255);
                        if (a == 0) {
                            i11++;
                            i10++;
                            if (i11 == i8) {
                                break;
                            } else if (bArr4[i9].length != i10) {
                                z2 = z;
                            } else if (i9 == bArr4.length - 1) {
                                break;
                            } else {
                                i9++;
                                z2 = true;
                                i10 = -1;
                            }
                        } else {
                            break;
                        }
                    }
                    if (a >= 0) {
                        if (a <= 0) {
                            int i12 = i8 - i11;
                            int length2 = bArr4[i9].length - i10;
                            for (int i13 = i9 + 1; i13 < bArr4.length; i13++) {
                                length2 += bArr4[i13].length;
                            }
                            if (length2 >= i12) {
                                if (length2 <= i12) {
                                    Charset charset = StandardCharsets.UTF_8;
                                    C4638h.m10270a((Object) charset, "UTF_8");
                                    return new String(bArr3, i6, i8, charset);
                                }
                            }
                        }
                        i4 = i2 + 1;
                    }
                    length = i6 - 1;
                }
                return null;
            }
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:82:0x012d, code lost:
        if (r7 != null) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x013c, code lost:
        if (r6 != null) goto L_0x0141;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x004e */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0178  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo4367a(java.lang.String r15) {
        /*
            r14 = this;
            r0 = 0
            if (r15 == 0) goto L_0x01db
            java.lang.String r1 = java.net.IDN.toUnicode(r15)
            java.lang.String r2 = "unicodeDomain"
            p392u.p401r.p403c.C4638h.m10270a(r1, r2)
            r2 = 1
            char[] r3 = new char[r2]
            r4 = 46
            r5 = 0
            r3[r5] = r4
            r6 = 6
            java.util.List r1 = p392u.p409w.C4681g.m10313a(r1, r3, r5, r5, r6)
            java.util.concurrent.atomic.AtomicBoolean r3 = r14.f2665a
            boolean r3 = r3.get()
            if (r3 != 0) goto L_0x005d
            java.util.concurrent.atomic.AtomicBoolean r3 = r14.f2665a
            boolean r3 = r3.compareAndSet(r5, r2)
            if (r3 == 0) goto L_0x005d
            r3 = r5
        L_0x002a:
            r14.mo4368a()     // Catch:{  }
            if (r3 == 0) goto L_0x006a
            java.lang.Thread r6 = java.lang.Thread.currentThread()     // Catch:{ InterruptedIOException -> 0x004e, IOException -> 0x0039 }
            r6.interrupt()     // Catch:{ InterruptedIOException -> 0x004e, IOException -> 0x0039 }
            goto L_0x006a
        L_0x0037:
            r15 = move-exception
            goto L_0x0053
        L_0x0039:
            r6 = move-exception
            v.m0.i.f$a r7 = p410v.p411m0.p418i.C4839f.f11548c     // Catch:{ all -> 0x0037 }
            v.m0.i.f r7 = p410v.p411m0.p418i.C4839f.f11546a     // Catch:{ all -> 0x0037 }
            r8 = 5
            java.lang.String r9 = "Failed to read public suffix list"
            r7.mo11298a(r8, r9, r6)     // Catch:{ all -> 0x0037 }
            if (r3 == 0) goto L_0x006a
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            r3.interrupt()
            goto L_0x006a
        L_0x004e:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x0037 }
            r3 = r2
            goto L_0x002a
        L_0x0053:
            if (r3 == 0) goto L_0x005c
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x005c:
            throw r15
        L_0x005d:
            java.util.concurrent.CountDownLatch r3 = r14.f2666b     // Catch:{ InterruptedException -> 0x0063 }
            r3.await()     // Catch:{ InterruptedException -> 0x0063 }
            goto L_0x006a
        L_0x0063:
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            r3.interrupt()
        L_0x006a:
            byte[] r3 = r14.f2667c
            if (r3 == 0) goto L_0x0070
            r3 = r2
            goto L_0x0071
        L_0x0070:
            r3 = r5
        L_0x0071:
            if (r3 == 0) goto L_0x01cf
            int r3 = r1.size()
            byte[][] r6 = new byte[r3][]
            r7 = r5
        L_0x007a:
            if (r7 >= r3) goto L_0x00a1
            java.lang.Object r8 = r1.get(r7)
            java.lang.String r8 = (java.lang.String) r8
            java.nio.charset.Charset r9 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r10 = "UTF_8"
            p392u.p401r.p403c.C4638h.m10270a(r9, r10)
            if (r8 == 0) goto L_0x0099
            byte[] r8 = r8.getBytes(r9)
            java.lang.String r9 = "(this as java.lang.String).getBytes(charset)"
            p392u.p401r.p403c.C4638h.m10270a(r8, r9)
            r6[r7] = r8
            int r7 = r7 + 1
            goto L_0x007a
        L_0x0099:
            u.i r15 = new u.i
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
            r15.<init>(r0)
            throw r15
        L_0x00a1:
            r7 = r5
        L_0x00a2:
            java.lang.String r8 = "publicSuffixListBytes"
            if (r7 >= r3) goto L_0x00ba
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$a r9 = f2664h
            byte[] r10 = r14.f2667c
            if (r10 == 0) goto L_0x00b6
            java.lang.String r9 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.C1013a.m2316a(r9, r10, r6, r7)
            if (r9 == 0) goto L_0x00b3
            goto L_0x00bb
        L_0x00b3:
            int r7 = r7 + 1
            goto L_0x00a2
        L_0x00b6:
            p392u.p401r.p403c.C4638h.m10273b(r8)
            throw r0
        L_0x00ba:
            r9 = r0
        L_0x00bb:
            if (r3 <= r2) goto L_0x00e0
            java.lang.Object r7 = r6.clone()
            byte[][] r7 = (byte[][]) r7
            int r10 = r7.length
            int r10 = r10 - r2
            r11 = r5
        L_0x00c6:
            if (r11 >= r10) goto L_0x00e0
            byte[] r12 = f2661e
            r7[r11] = r12
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$a r12 = f2664h
            byte[] r13 = r14.f2667c
            if (r13 == 0) goto L_0x00dc
            java.lang.String r12 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.C1013a.m2316a(r12, r13, r7, r11)
            if (r12 == 0) goto L_0x00d9
            goto L_0x00e1
        L_0x00d9:
            int r11 = r11 + 1
            goto L_0x00c6
        L_0x00dc:
            p392u.p401r.p403c.C4638h.m10273b(r8)
            throw r0
        L_0x00e0:
            r12 = r0
        L_0x00e1:
            if (r12 == 0) goto L_0x00fd
            int r3 = r3 - r2
            r7 = r5
        L_0x00e5:
            if (r7 >= r3) goto L_0x00fd
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$a r8 = f2664h
            byte[] r10 = r14.f2668d
            if (r10 == 0) goto L_0x00f7
            java.lang.String r8 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.C1013a.m2316a(r8, r10, r6, r7)
            if (r8 == 0) goto L_0x00f4
            goto L_0x00fe
        L_0x00f4:
            int r7 = r7 + 1
            goto L_0x00e5
        L_0x00f7:
            java.lang.String r15 = "publicSuffixExceptionListBytes"
            p392u.p401r.p403c.C4638h.m10273b(r15)
            throw r0
        L_0x00fd:
            r8 = r0
        L_0x00fe:
            r3 = 33
            if (r8 == 0) goto L_0x011b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            char[] r7 = new char[r2]
            r7[r5] = r4
            r8 = 6
            java.util.List r6 = p392u.p409w.C4681g.m10313a(r6, r7, r5, r5, r8)
            goto L_0x014c
        L_0x011b:
            r6 = 6
            if (r9 != 0) goto L_0x0123
            if (r12 != 0) goto L_0x0123
            java.util.List<java.lang.String> r6 = f2662f
            goto L_0x014c
        L_0x0123:
            if (r9 == 0) goto L_0x0130
            char[] r7 = new char[r2]
            r7[r5] = r4
            java.util.List r7 = p392u.p409w.C4681g.m10313a(r9, r7, r5, r5, r6)
            if (r7 == 0) goto L_0x0130
            goto L_0x0132
        L_0x0130:
            u.n.i r7 = p392u.p393n.C4570i.f10779e
        L_0x0132:
            if (r12 == 0) goto L_0x013f
            char[] r8 = new char[r2]
            r8[r5] = r4
            java.util.List r6 = p392u.p409w.C4681g.m10313a(r12, r8, r5, r5, r6)
            if (r6 == 0) goto L_0x013f
            goto L_0x0141
        L_0x013f:
            u.n.i r6 = p392u.p393n.C4570i.f10779e
        L_0x0141:
            int r8 = r7.size()
            int r9 = r6.size()
            if (r8 <= r9) goto L_0x014c
            r6 = r7
        L_0x014c:
            int r7 = r1.size()
            int r8 = r6.size()
            if (r7 != r8) goto L_0x0163
            java.lang.Object r7 = r6.get(r5)
            java.lang.String r7 = (java.lang.String) r7
            char r7 = r7.charAt(r5)
            if (r7 == r3) goto L_0x0163
            return r0
        L_0x0163:
            java.lang.Object r7 = r6.get(r5)
            java.lang.String r7 = (java.lang.String) r7
            char r7 = r7.charAt(r5)
            int r1 = r1.size()
            if (r7 != r3) goto L_0x0178
            int r3 = r6.size()
            goto L_0x017d
        L_0x0178:
            int r3 = r6.size()
            int r3 = r3 + r2
        L_0x017d:
            int r1 = r1 - r3
            char[] r3 = new char[r2]
            r3[r5] = r4
            r4 = 6
            java.util.List r15 = p392u.p409w.C4681g.m10313a(r15, r3, r5, r5, r4)
            if (r15 == 0) goto L_0x01c9
            u.n.f r0 = new u.n.f
            r0.<init>(r15)
            if (r1 < 0) goto L_0x0191
            goto L_0x0192
        L_0x0191:
            r2 = r5
        L_0x0192:
            if (r2 == 0) goto L_0x01b7
            if (r1 != 0) goto L_0x0197
            goto L_0x01a1
        L_0x0197:
            boolean r15 = r0 instanceof p392u.p408v.C4668c
            if (r15 == 0) goto L_0x01a3
            u.v.c r0 = (p392u.p408v.C4668c) r0
            u.v.d r0 = r0.mo10951a(r1)
        L_0x01a1:
            r2 = r0
            goto L_0x01a9
        L_0x01a3:
            u.v.b r15 = new u.v.b
            r15.<init>(r0, r1)
            r2 = r15
        L_0x01a9:
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 62
            java.lang.String r3 = "."
            java.lang.String r15 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5196a(r2, r3, r4, r5, r6, r7, r8, r9)
            return r15
        L_0x01b7:
            java.lang.String r15 = "Requested element count "
            java.lang.String r0 = " is less than zero."
            java.lang.String r15 = p213q.p214a.p215a.p216a.C1965a.m4762b(r15, r1, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r15 = r15.toString()
            r0.<init>(r15)
            throw r0
        L_0x01c9:
            java.lang.String r15 = "$this$asSequence"
            p392u.p401r.p403c.C4638h.m10271a(r15)
            throw r0
        L_0x01cf:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unable to load publicsuffixes.gz resource from the classpath."
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L_0x01db:
            java.lang.String r15 = "domain"
            p392u.p401r.p403c.C4638h.m10271a(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.mo4367a(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0050, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0051, code lost:
        p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5235a((java.io.Closeable) r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0054, code lost:
        throw r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4368a() {
        /*
            r4 = this;
            java.lang.Class<okhttp3.internal.publicsuffix.PublicSuffixDatabase> r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.class
            java.lang.String r1 = "publicsuffixes.gz"
            java.io.InputStream r0 = r0.getResourceAsStream(r1)
            if (r0 == 0) goto L_0x0055
            w.n r1 = new w.n
            w.p r2 = new w.p
            w.b0 r3 = new w.b0
            r3.<init>()
            r2.<init>(r0, r3)
            r1.<init>(r2)
            w.i r0 = p119o.p120a.C0967p0.m2183a(r1)
            int r1 = r0.readInt()     // Catch:{ all -> 0x004e }
            long r1 = (long) r1     // Catch:{ all -> 0x004e }
            byte[] r1 = r0.mo11452e(r1)     // Catch:{ all -> 0x004e }
            int r2 = r0.readInt()     // Catch:{ all -> 0x004e }
            long r2 = (long) r2     // Catch:{ all -> 0x004e }
            byte[] r2 = r0.mo11452e(r2)     // Catch:{ all -> 0x004e }
            r3 = 0
            p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5235a(r0, r3)
            monitor-enter(r4)
            if (r1 == 0) goto L_0x0047
            r4.f2667c = r1     // Catch:{ all -> 0x004b }
            if (r2 == 0) goto L_0x0043
            r4.f2668d = r2     // Catch:{ all -> 0x004b }
            monitor-exit(r4)
            java.util.concurrent.CountDownLatch r0 = r4.f2666b
            r0.countDown()
            return
        L_0x0043:
            p392u.p401r.p403c.C4638h.m10269a()     // Catch:{ all -> 0x004b }
            throw r3
        L_0x0047:
            p392u.p401r.p403c.C4638h.m10269a()     // Catch:{ all -> 0x004b }
            throw r3
        L_0x004b:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x004e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0050 }
        L_0x0050:
            r2 = move-exception
            p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5235a(r0, r1)
            throw r2
        L_0x0055:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.mo4368a():void");
    }
}
