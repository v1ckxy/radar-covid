package p213q.p217b.p301c.p302a.p311j0.p312a;

import java.nio.ByteBuffer;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;

/* renamed from: q.b.c.a.j0.a.r1 */
public final class C3700r1 {

    /* renamed from: a */
    public static final C3701a f9152a = ((!(C3691q1.f9142h && C3691q1.f9141g) || C3609d.m8184a()) ? new C3702b() : new C3704d());

    /* renamed from: q.b.c.a.j0.a.r1$a */
    public static abstract class C3701a {
        /* renamed from: a */
        public abstract int mo9912a(int i, byte[] bArr, int i2, int i3);

        /* renamed from: a */
        public abstract int mo9913a(CharSequence charSequence, byte[] bArr, int i, int i2);

        /* renamed from: a */
        public final String mo9914a(ByteBuffer byteBuffer, int i, int i2) {
            if ((i | i2 | ((byteBuffer.limit() - i) - i2)) >= 0) {
                int i3 = i + i2;
                char[] cArr = new char[i2];
                int i4 = 0;
                while (r13 < i3) {
                    byte b = byteBuffer.get(r13);
                    if (!C2286e.m5256a(b)) {
                        break;
                    }
                    i = r13 + 1;
                    int i5 = i4 + 1;
                    cArr[i4] = (char) b;
                    i4 = i5;
                }
                int i6 = i4;
                while (r13 < i3) {
                    int i7 = r13 + 1;
                    byte b2 = byteBuffer.get(r13);
                    if (C2286e.m5256a(b2)) {
                        int i8 = i6 + 1;
                        cArr[i6] = (char) b2;
                        while (i7 < i3) {
                            byte b3 = byteBuffer.get(i7);
                            if (!C2286e.m5256a(b3)) {
                                break;
                            }
                            i7++;
                            int i9 = i8 + 1;
                            cArr[i8] = (char) b3;
                            i8 = i9;
                        }
                        r13 = i7;
                        i6 = i8;
                    } else if (C2286e.m5299b(b2)) {
                        if (i7 < i3) {
                            int i10 = i7 + 1;
                            int i11 = i6 + 1;
                            C2286e.m5225a(b2, byteBuffer.get(i7), cArr, i6);
                            r13 = i10;
                            i6 = i11;
                        } else {
                            throw C3606c0.m8176c();
                        }
                    } else if (C2286e.m5313c(b2)) {
                        if (i7 < i3 - 1) {
                            int i12 = i7 + 1;
                            int i13 = i12 + 1;
                            int i14 = i6 + 1;
                            C2286e.m5224a(b2, byteBuffer.get(i7), byteBuffer.get(i12), cArr, i6);
                            r13 = i13;
                            i6 = i14;
                        } else {
                            throw C3606c0.m8176c();
                        }
                    } else if (i7 < i3 - 2) {
                        int i15 = i7 + 1;
                        byte b4 = byteBuffer.get(i7);
                        int i16 = i15 + 1;
                        int i17 = i16 + 1;
                        int i18 = i6 + 1;
                        C2286e.m5223a(b2, b4, byteBuffer.get(i15), byteBuffer.get(i16), cArr, i6);
                        r13 = i17;
                        i6 = i18 + 1;
                    } else {
                        throw C3606c0.m8176c();
                    }
                }
                return new String(cArr, 0, i6);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)}));
        }

        /* renamed from: a */
        public abstract String mo9915a(byte[] bArr, int i, int i2);

        /* renamed from: b */
        public abstract String mo9916b(ByteBuffer byteBuffer, int i, int i2);
    }

    /* renamed from: q.b.c.a.j0.a.r1$b */
    public static final class C3702b extends C3701a {
        /* renamed from: a */
        public int mo9913a(CharSequence charSequence, byte[] bArr, int i, int i2) {
            int i3;
            int length = charSequence.length();
            int i4 = i2 + i;
            int i5 = 0;
            while (i5 < length) {
                int i6 = i5 + i;
                if (i6 >= i4) {
                    break;
                }
                char charAt = charSequence.charAt(i5);
                if (charAt >= 128) {
                    break;
                }
                bArr[i6] = (byte) charAt;
                i5++;
            }
            if (i5 == length) {
                return i + length;
            }
            int i7 = i + i5;
            while (i5 < length) {
                char charAt2 = charSequence.charAt(i5);
                if (charAt2 < 128 && i7 < i4) {
                    i3 = i7 + 1;
                    bArr[i7] = (byte) charAt2;
                } else if (charAt2 < 2048 && i7 <= i4 - 2) {
                    int i8 = i7 + 1;
                    bArr[i7] = (byte) ((charAt2 >>> 6) | 960);
                    i7 = i8 + 1;
                    bArr[i8] = (byte) ((charAt2 & '?') | 128);
                    i5++;
                } else if ((charAt2 < 55296 || 57343 < charAt2) && i7 <= i4 - 3) {
                    int i9 = i7 + 1;
                    bArr[i7] = (byte) ((charAt2 >>> 12) | 480);
                    int i10 = i9 + 1;
                    bArr[i9] = (byte) (((charAt2 >>> 6) & 63) | 128);
                    i3 = i10 + 1;
                    bArr[i10] = (byte) ((charAt2 & '?') | 128);
                } else if (i7 <= i4 - 4) {
                    int i11 = i5 + 1;
                    if (i11 != charSequence.length()) {
                        char charAt3 = charSequence.charAt(i11);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            int i12 = i7 + 1;
                            bArr[i7] = (byte) ((codePoint >>> 18) | 240);
                            int i13 = i12 + 1;
                            bArr[i12] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i14 = i13 + 1;
                            bArr[i13] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i7 = i14 + 1;
                            bArr[i14] = (byte) ((codePoint & 63) | 128);
                            i5 = i11;
                            i5++;
                        } else {
                            i5 = i11;
                        }
                    }
                    throw new C3703c(i5 - 1, length);
                } else {
                    if (55296 <= charAt2 && charAt2 <= 57343) {
                        int i15 = i5 + 1;
                        if (i15 == charSequence.length() || !Character.isSurrogatePair(charAt2, charSequence.charAt(i15))) {
                            throw new C3703c(i5, length);
                        }
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed writing ");
                    sb.append(charAt2);
                    sb.append(" at index ");
                    sb.append(i7);
                    throw new ArrayIndexOutOfBoundsException(sb.toString());
                }
                i7 = i3;
                i5++;
            }
            return i7;
        }

        /* renamed from: a */
        public String mo9915a(byte[] bArr, int i, int i2) {
            if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
                int i3 = i + i2;
                char[] cArr = new char[i2];
                int i4 = 0;
                while (r13 < i3) {
                    byte b = bArr[r13];
                    if (!C2286e.m5256a(b)) {
                        break;
                    }
                    i = r13 + 1;
                    int i5 = i4 + 1;
                    cArr[i4] = (char) b;
                    i4 = i5;
                }
                int i6 = i4;
                while (r13 < i3) {
                    int i7 = r13 + 1;
                    byte b2 = bArr[r13];
                    if (C2286e.m5256a(b2)) {
                        int i8 = i6 + 1;
                        cArr[i6] = (char) b2;
                        while (i7 < i3) {
                            byte b3 = bArr[i7];
                            if (!C2286e.m5256a(b3)) {
                                break;
                            }
                            i7++;
                            int i9 = i8 + 1;
                            cArr[i8] = (char) b3;
                            i8 = i9;
                        }
                        r13 = i7;
                        i6 = i8;
                    } else if (C2286e.m5299b(b2)) {
                        if (i7 < i3) {
                            int i10 = i7 + 1;
                            int i11 = i6 + 1;
                            C2286e.m5225a(b2, bArr[i7], cArr, i6);
                            r13 = i10;
                            i6 = i11;
                        } else {
                            throw C3606c0.m8176c();
                        }
                    } else if (C2286e.m5313c(b2)) {
                        if (i7 < i3 - 1) {
                            int i12 = i7 + 1;
                            int i13 = i12 + 1;
                            int i14 = i6 + 1;
                            C2286e.m5224a(b2, bArr[i7], bArr[i12], cArr, i6);
                            r13 = i13;
                            i6 = i14;
                        } else {
                            throw C3606c0.m8176c();
                        }
                    } else if (i7 < i3 - 2) {
                        int i15 = i7 + 1;
                        byte b4 = bArr[i7];
                        int i16 = i15 + 1;
                        int i17 = i16 + 1;
                        int i18 = i6 + 1;
                        C2286e.m5223a(b2, b4, bArr[i15], bArr[i16], cArr, i6);
                        r13 = i17;
                        i6 = i18 + 1;
                    } else {
                        throw C3606c0.m8176c();
                    }
                }
                return new String(cArr, 0, i6);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
        }

        /* renamed from: b */
        public String mo9916b(ByteBuffer byteBuffer, int i, int i2) {
            return mo9914a(byteBuffer, i, i2);
        }

        /* JADX WARNING: type inference failed for: r3v0 */
        /* JADX WARNING: type inference failed for: r3v2 */
        /* JADX WARNING: type inference failed for: r3v4 */
        /* JADX WARNING: type inference failed for: r12v12 */
        /* JADX WARNING: type inference failed for: r12v13 */
        /* JADX WARNING: type inference failed for: r10v0 */
        /* JADX WARNING: type inference failed for: r12v16 */
        /* JADX WARNING: type inference failed for: r12v21 */
        /* JADX WARNING: type inference failed for: r12v25, types: [byte] */
        /* JADX WARNING: type inference failed for: r12v26 */
        /* JADX WARNING: type inference failed for: r10v1 */
        /* JADX WARNING: type inference failed for: r12v29 */
        /* JADX WARNING: type inference failed for: r3v5 */
        /* JADX WARNING: type inference failed for: r12v33 */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0047, code lost:
            if (r13[r14] > -65) goto L_0x0049;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x0082, code lost:
            if (r13[r14] > -65) goto L_0x0084;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:75:0x00c9, code lost:
            r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3700r1.m8886a(r13, r12, r15);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
            if (r13[r14] > -65) goto L_0x0022;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 4 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo9912a(int r12, byte[] r13, int r14, int r15) {
            /*
                r11 = this;
                r0 = -19
                r1 = -62
                r2 = -16
                r3 = 0
                r4 = -96
                r5 = -32
                r6 = -1
                r7 = -65
                if (r12 == 0) goto L_0x0085
                if (r14 < r15) goto L_0x0013
                return r12
            L_0x0013:
                byte r8 = (byte) r12
                if (r8 >= r5) goto L_0x0023
                if (r8 < r1) goto L_0x0022
                int r12 = r14 + 1
                byte r14 = r13[r14]
                if (r14 <= r7) goto L_0x001f
                goto L_0x0022
            L_0x001f:
                r14 = r12
                goto L_0x0085
            L_0x0022:
                return r6
            L_0x0023:
                if (r8 >= r2) goto L_0x004a
                int r12 = r12 >> 8
                int r12 = ~r12
                byte r12 = (byte) r12
                if (r12 != 0) goto L_0x0039
                int r12 = r14 + 1
                byte r14 = r13[r14]
                if (r12 < r15) goto L_0x0036
                int r12 = p213q.p217b.p301c.p302a.p311j0.p312a.C3700r1.m8882a(r8, r14)
                return r12
            L_0x0036:
                r10 = r14
                r14 = r12
                r12 = r10
            L_0x0039:
                if (r12 > r7) goto L_0x0049
                if (r8 != r5) goto L_0x003f
                if (r12 < r4) goto L_0x0049
            L_0x003f:
                if (r8 != r0) goto L_0x0043
                if (r12 >= r4) goto L_0x0049
            L_0x0043:
                int r12 = r14 + 1
                byte r14 = r13[r14]
                if (r14 <= r7) goto L_0x001f
            L_0x0049:
                return r6
            L_0x004a:
                int r9 = r12 >> 8
                int r9 = ~r9
                byte r9 = (byte) r9
                if (r9 != 0) goto L_0x005e
                int r12 = r14 + 1
                byte r9 = r13[r14]
                if (r12 < r15) goto L_0x005b
                int r12 = p213q.p217b.p301c.p302a.p311j0.p312a.C3700r1.m8882a(r8, r9)
                return r12
            L_0x005b:
                r14 = r12
                r12 = r3
                goto L_0x0061
            L_0x005e:
                int r12 = r12 >> 16
                byte r12 = (byte) r12
            L_0x0061:
                if (r12 != 0) goto L_0x0071
                int r12 = r14 + 1
                byte r14 = r13[r14]
                if (r12 < r15) goto L_0x006e
                int r12 = p213q.p217b.p301c.p302a.p311j0.p312a.C3700r1.m8883a(r8, r9, r14)
                return r12
            L_0x006e:
                r10 = r14
                r14 = r12
                r12 = r10
            L_0x0071:
                if (r9 > r7) goto L_0x0084
                int r8 = r8 << 28
                int r9 = r9 + 112
                int r9 = r9 + r8
                int r8 = r9 >> 30
                if (r8 != 0) goto L_0x0084
                if (r12 > r7) goto L_0x0084
                int r12 = r14 + 1
                byte r14 = r13[r14]
                if (r14 <= r7) goto L_0x001f
            L_0x0084:
                return r6
            L_0x0085:
                if (r14 >= r15) goto L_0x008e
                byte r12 = r13[r14]
                if (r12 < 0) goto L_0x008e
                int r14 = r14 + 1
                goto L_0x0085
            L_0x008e:
                if (r14 < r15) goto L_0x0091
                goto L_0x00ea
            L_0x0091:
                if (r14 < r15) goto L_0x0094
                goto L_0x00ea
            L_0x0094:
                int r12 = r14 + 1
                byte r14 = r13[r14]
                if (r14 >= 0) goto L_0x00eb
                if (r14 >= r5) goto L_0x00a9
                if (r12 < r15) goto L_0x00a0
                r3 = r14
                goto L_0x00ea
            L_0x00a0:
                if (r14 < r1) goto L_0x00e9
                int r14 = r12 + 1
                byte r12 = r13[r12]
                if (r12 <= r7) goto L_0x0091
                goto L_0x00e9
            L_0x00a9:
                if (r14 >= r2) goto L_0x00c5
                int r8 = r15 + -1
                if (r12 < r8) goto L_0x00b0
                goto L_0x00c9
            L_0x00b0:
                int r8 = r12 + 1
                byte r12 = r13[r12]
                if (r12 > r7) goto L_0x00e9
                if (r14 != r5) goto L_0x00ba
                if (r12 < r4) goto L_0x00e9
            L_0x00ba:
                if (r14 != r0) goto L_0x00be
                if (r12 >= r4) goto L_0x00e9
            L_0x00be:
                int r14 = r8 + 1
                byte r12 = r13[r8]
                if (r12 <= r7) goto L_0x0091
                goto L_0x00e9
            L_0x00c5:
                int r8 = r15 + -2
                if (r12 < r8) goto L_0x00ce
            L_0x00c9:
                int r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3700r1.m8886a(r13, r12, r15)
                goto L_0x00ea
            L_0x00ce:
                int r8 = r12 + 1
                byte r12 = r13[r12]
                if (r12 > r7) goto L_0x00e9
                int r14 = r14 << 28
                int r12 = r12 + 112
                int r12 = r12 + r14
                int r12 = r12 >> 30
                if (r12 != 0) goto L_0x00e9
                int r12 = r8 + 1
                byte r14 = r13[r8]
                if (r14 > r7) goto L_0x00e9
                int r14 = r12 + 1
                byte r12 = r13[r12]
                if (r12 <= r7) goto L_0x0091
            L_0x00e9:
                r3 = r6
            L_0x00ea:
                return r3
            L_0x00eb:
                r14 = r12
                goto L_0x0091
            */
            throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p301c.p302a.p311j0.p312a.C3700r1.C3702b.mo9912a(int, byte[], int, int):int");
        }
    }

    /* renamed from: q.b.c.a.j0.a.r1$c */
    public static class C3703c extends IllegalArgumentException {
        public C3703c(int i, int i2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unpaired surrogate at index ");
            sb.append(i);
            sb.append(" of ");
            sb.append(i2);
            super(sb.toString());
        }
    }

    /* renamed from: q.b.c.a.j0.a.r1$d */
    public static final class C3704d extends C3701a {
        /* renamed from: a */
        public int mo9913a(CharSequence charSequence, byte[] bArr, int i, int i2) {
            long j;
            char c;
            long j2;
            long j3;
            CharSequence charSequence2 = charSequence;
            byte[] bArr2 = bArr;
            int i3 = i;
            int i4 = i2;
            long j4 = (long) i3;
            long j5 = ((long) i4) + j4;
            int length = charSequence.length();
            String str = " at index ";
            String str2 = "Failed writing ";
            if (length > i4 || bArr2.length - i4 < i3) {
                StringBuilder a = C1965a.m4756a(str2);
                a.append(charSequence2.charAt(length - 1));
                a.append(str);
                a.append(i3 + i4);
                throw new ArrayIndexOutOfBoundsException(a.toString());
            }
            int i5 = 0;
            while (true) {
                c = 128;
                j2 = 1;
                if (i5 >= length) {
                    break;
                }
                char charAt = charSequence2.charAt(i5);
                if (charAt >= 128) {
                    break;
                }
                long j6 = 1 + j;
                C3691q1.m8815a(bArr2, j, (byte) charAt);
                i5++;
                j4 = j6;
            }
            if (i5 == length) {
                return (int) j;
            }
            while (i5 < length) {
                char charAt2 = charSequence2.charAt(i5);
                if (charAt2 >= c || j >= j5) {
                    if (charAt2 < 2048 && j <= j5 - 2) {
                        long j7 = j + j2;
                        C3691q1.m8815a(bArr2, j, (byte) ((charAt2 >>> 6) | 960));
                        j3 = j7 + j2;
                        C3691q1.m8815a(bArr2, j7, (byte) ((charAt2 & '?') | 128));
                    } else if ((charAt2 < 55296 || 57343 < charAt2) && j <= j5 - 3) {
                        long j8 = j + j2;
                        C3691q1.m8815a(bArr2, j, (byte) ((charAt2 >>> 12) | 480));
                        long j9 = j2 + j8;
                        C3691q1.m8815a(bArr2, j8, (byte) (((charAt2 >>> 6) & 63) | 128));
                        j3 = 1 + j9;
                        C3691q1.m8815a(bArr2, j9, (byte) ((charAt2 & '?') | 128));
                        j2 = 1;
                    } else if (j <= j5 - 4) {
                        int i6 = i5 + 1;
                        if (i6 != length) {
                            char charAt3 = charSequence2.charAt(i6);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                long j10 = j + 1;
                                C3691q1.m8815a(bArr2, j, (byte) ((codePoint >>> 18) | 240));
                                long j11 = 1 + j10;
                                C3691q1.m8815a(bArr2, j10, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j12 = 1 + j11;
                                C3691q1.m8815a(bArr2, j11, (byte) (((codePoint >>> 6) & 63) | 128));
                                j2 = 1;
                                long j13 = j12 + 1;
                                C3691q1.m8815a(bArr2, j12, (byte) ((codePoint & 63) | 128));
                                i5 = i6;
                                c = 128;
                                j = j13;
                            } else {
                                i5 = i6;
                            }
                        }
                        throw new C3703c(i5 - 1, length);
                    } else {
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            int i7 = i5 + 1;
                            if (i7 == length || !Character.isSurrogatePair(charAt2, charSequence2.charAt(i7))) {
                                throw new C3703c(i5, length);
                            }
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append(str2);
                        sb.append(charAt2);
                        sb.append(str);
                        sb.append(j);
                        throw new ArrayIndexOutOfBoundsException(sb.toString());
                    }
                    long j14 = j3;
                    c = 128;
                    j = j14;
                } else {
                    long j15 = j + j2;
                    C3691q1.m8815a(bArr2, j, (byte) charAt2);
                    j = j15;
                }
                i5++;
            }
            return (int) j;
        }

        /* renamed from: a */
        public String mo9915a(byte[] bArr, int i, int i2) {
            if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
                int i3 = i + i2;
                char[] cArr = new char[i2];
                int i4 = 0;
                while (r13 < i3) {
                    byte a = C3691q1.m8804a(bArr, (long) r13);
                    if (!C2286e.m5256a(a)) {
                        break;
                    }
                    i = r13 + 1;
                    int i5 = i4 + 1;
                    cArr[i4] = (char) a;
                    i4 = i5;
                }
                int i6 = i4;
                while (r13 < i3) {
                    int i7 = r13 + 1;
                    byte a2 = C3691q1.m8804a(bArr, (long) r13);
                    if (C2286e.m5256a(a2)) {
                        int i8 = i6 + 1;
                        cArr[i6] = (char) a2;
                        while (i7 < i3) {
                            byte a3 = C3691q1.m8804a(bArr, (long) i7);
                            if (!C2286e.m5256a(a3)) {
                                break;
                            }
                            i7++;
                            int i9 = i8 + 1;
                            cArr[i8] = (char) a3;
                            i8 = i9;
                        }
                        r13 = i7;
                        i6 = i8;
                    } else if (C2286e.m5299b(a2)) {
                        if (i7 < i3) {
                            int i10 = i7 + 1;
                            int i11 = i6 + 1;
                            C2286e.m5225a(a2, C3691q1.m8804a(bArr, (long) i7), cArr, i6);
                            r13 = i10;
                            i6 = i11;
                        } else {
                            throw C3606c0.m8176c();
                        }
                    } else if (C2286e.m5313c(a2)) {
                        if (i7 < i3 - 1) {
                            int i12 = i7 + 1;
                            int i13 = i12 + 1;
                            int i14 = i6 + 1;
                            C2286e.m5224a(a2, C3691q1.m8804a(bArr, (long) i7), C3691q1.m8804a(bArr, (long) i12), cArr, i6);
                            r13 = i13;
                            i6 = i14;
                        } else {
                            throw C3606c0.m8176c();
                        }
                    } else if (i7 < i3 - 2) {
                        int i15 = i7 + 1;
                        byte a4 = C3691q1.m8804a(bArr, (long) i7);
                        int i16 = i15 + 1;
                        int i17 = i16 + 1;
                        int i18 = i6 + 1;
                        C2286e.m5223a(a2, a4, C3691q1.m8804a(bArr, (long) i15), C3691q1.m8804a(bArr, (long) i16), cArr, i6);
                        r13 = i17;
                        i6 = i18 + 1;
                    } else {
                        throw C3606c0.m8176c();
                    }
                }
                return new String(cArr, 0, i6);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
        }

        /* renamed from: b */
        public String mo9916b(ByteBuffer byteBuffer, int i, int i2) {
            long j;
            int i3 = i;
            int i4 = i2;
            if ((i3 | i4 | ((byteBuffer.limit() - i3) - i4)) >= 0) {
                long a = C3691q1.m8805a(byteBuffer) + ((long) i3);
                long j2 = ((long) i4) + a;
                char[] cArr = new char[i4];
                int i5 = 0;
                while (a < j2) {
                    byte a2 = C3691q1.m8803a(a);
                    if (!C2286e.m5256a(a2)) {
                        break;
                    }
                    a++;
                    int i6 = i5 + 1;
                    cArr[i5] = (char) a2;
                    i5 = i6;
                }
                while (true) {
                    int i7 = i5;
                    while (j < j2) {
                        long j3 = j + 1;
                        byte a3 = C3691q1.m8803a(j);
                        if (C2286e.m5256a(a3)) {
                            int i8 = i7 + 1;
                            cArr[i7] = (char) a3;
                            while (j3 < j2) {
                                byte a4 = C3691q1.m8803a(j3);
                                if (!C2286e.m5256a(a4)) {
                                    break;
                                }
                                j3++;
                                int i9 = i8 + 1;
                                cArr[i8] = (char) a4;
                                i8 = i9;
                            }
                            i7 = i8;
                            j = j3;
                        } else if (C2286e.m5299b(a3)) {
                            if (j3 < j2) {
                                j = j3 + 1;
                                int i10 = i7 + 1;
                                C2286e.m5225a(a3, C3691q1.m8803a(j3), cArr, i7);
                                i7 = i10;
                            } else {
                                throw C3606c0.m8176c();
                            }
                        } else if (C2286e.m5313c(a3)) {
                            if (j3 < j2 - 1) {
                                long j4 = j3 + 1;
                                byte a5 = C3691q1.m8803a(j3);
                                long j5 = j4 + 1;
                                byte a6 = C3691q1.m8803a(j4);
                                int i11 = i7 + 1;
                                C2286e.m5224a(a3, a5, a6, cArr, i7);
                                i7 = i11;
                                j = j5;
                            } else {
                                throw C3606c0.m8176c();
                            }
                        } else if (j3 < j2 - 2) {
                            long j6 = j3 + 1;
                            byte a7 = C3691q1.m8803a(j3);
                            long j7 = j6 + 1;
                            byte a8 = C3691q1.m8803a(j6);
                            a = j7 + 1;
                            byte a9 = C3691q1.m8803a(j7);
                            int i12 = i7 + 1;
                            C2286e.m5223a(a3, a7, a8, a9, cArr, i7);
                            i5 = i12 + 1;
                        } else {
                            throw C3606c0.m8176c();
                        }
                    }
                    return new String(cArr, 0, i7);
                }
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)}));
        }

        /* JADX INFO: used method not loaded: q.b.c.a.j0.a.q1.a(byte[], long):null, types can be incorrect */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
            if (p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8804a(r1, r8) > -65) goto L_0x003d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0067, code lost:
            if (p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8804a(r1, r8) > -65) goto L_0x0069;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:92:0x0122, code lost:
            r7 = m8898a(r1, r2, r8, r0);
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo9912a(int r24, byte[] r25, int r26, int r27) {
            /*
                r23 = this;
                r0 = r24
                r1 = r25
                r2 = r26
                r3 = r27
                r4 = r2 | r3
                int r5 = r1.length
                int r5 = r5 - r3
                r4 = r4 | r5
                r5 = 2
                if (r4 < 0) goto L_0x014e
                long r8 = (long) r2
                long r2 = (long) r3
                r4 = -19
                r10 = -62
                r11 = -16
                r12 = 16
                r13 = -96
                r14 = -32
                r15 = -65
                r16 = -1
                r17 = 1
                if (r0 == 0) goto L_0x00b1
                int r19 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r19 < 0) goto L_0x002b
                return r0
            L_0x002b:
                byte r7 = (byte) r0
                if (r7 >= r14) goto L_0x003e
                if (r7 < r10) goto L_0x003d
                long r20 = r8 + r17
                byte r0 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8804a(r1, r8)
                if (r0 <= r15) goto L_0x0039
                goto L_0x003d
            L_0x0039:
                r8 = r20
                goto L_0x00b1
            L_0x003d:
                return r16
            L_0x003e:
                if (r7 >= r11) goto L_0x006a
                int r0 = r0 >> 8
                int r0 = ~r0
                byte r0 = (byte) r0
                if (r0 != 0) goto L_0x0057
                long r20 = r8 + r17
                byte r0 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8804a(r1, r8)
                int r8 = (r20 > r2 ? 1 : (r20 == r2 ? 0 : -1))
                if (r8 < 0) goto L_0x0055
                int r0 = p213q.p217b.p301c.p302a.p311j0.p312a.C3700r1.m8882a(r7, r0)
                return r0
            L_0x0055:
                r8 = r20
            L_0x0057:
                if (r0 > r15) goto L_0x0069
                if (r7 != r14) goto L_0x005d
                if (r0 < r13) goto L_0x0069
            L_0x005d:
                if (r7 != r4) goto L_0x0061
                if (r0 >= r13) goto L_0x0069
            L_0x0061:
                long r20 = r8 + r17
                byte r0 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8804a(r1, r8)
                if (r0 <= r15) goto L_0x0039
            L_0x0069:
                return r16
            L_0x006a:
                int r6 = r0 >> 8
                int r6 = ~r6
                byte r6 = (byte) r6
                if (r6 != 0) goto L_0x0083
                long r21 = r8 + r17
                byte r6 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8804a(r1, r8)
                int r0 = (r21 > r2 ? 1 : (r21 == r2 ? 0 : -1))
                if (r0 < 0) goto L_0x007f
                int r0 = p213q.p217b.p301c.p302a.p311j0.p312a.C3700r1.m8882a(r7, r6)
                return r0
            L_0x007f:
                r8 = r21
                r0 = 0
                goto L_0x0085
            L_0x0083:
                int r0 = r0 >> r12
                byte r0 = (byte) r0
            L_0x0085:
                if (r0 != 0) goto L_0x0098
                long r21 = r8 + r17
                byte r0 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8804a(r1, r8)
                int r8 = (r21 > r2 ? 1 : (r21 == r2 ? 0 : -1))
                if (r8 < 0) goto L_0x0096
                int r0 = p213q.p217b.p301c.p302a.p311j0.p312a.C3700r1.m8883a(r7, r6, r0)
                return r0
            L_0x0096:
                r8 = r21
            L_0x0098:
                if (r6 > r15) goto L_0x00b0
                int r7 = r7 << 28
                int r6 = r6 + 112
                int r6 = r6 + r7
                int r6 = r6 >> 30
                if (r6 != 0) goto L_0x00b0
                if (r0 > r15) goto L_0x00b0
                long r6 = r8 + r17
                byte r0 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8804a(r1, r8)
                if (r0 <= r15) goto L_0x00ae
                goto L_0x00b0
            L_0x00ae:
                r8 = r6
                goto L_0x00b1
            L_0x00b0:
                return r16
            L_0x00b1:
                long r2 = r2 - r8
                int r0 = (int) r2
                if (r0 >= r12) goto L_0x00b7
                r2 = 0
                goto L_0x00ca
            L_0x00b7:
                r6 = r8
                r2 = 0
            L_0x00b9:
                if (r2 >= r0) goto L_0x00c9
                long r21 = r6 + r17
                byte r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8804a(r1, r6)
                if (r3 >= 0) goto L_0x00c4
                goto L_0x00ca
            L_0x00c4:
                int r2 = r2 + 1
                r6 = r21
                goto L_0x00b9
            L_0x00c9:
                r2 = r0
            L_0x00ca:
                int r0 = r0 - r2
                long r2 = (long) r2
                long r8 = r8 + r2
            L_0x00cd:
                r2 = 0
            L_0x00ce:
                if (r0 <= 0) goto L_0x00df
                long r2 = r8 + r17
                byte r6 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8804a(r1, r8)
                if (r6 < 0) goto L_0x00dd
                int r0 = r0 + -1
                r8 = r2
                r2 = r6
                goto L_0x00ce
            L_0x00dd:
                r8 = r2
                r2 = r6
            L_0x00df:
                if (r0 != 0) goto L_0x00e4
                r7 = 0
                goto L_0x014d
            L_0x00e4:
                int r0 = r0 + -1
                if (r2 >= r14) goto L_0x00ff
                if (r0 != 0) goto L_0x00ed
                r7 = r2
                goto L_0x014d
            L_0x00ed:
                int r0 = r0 + -1
                if (r2 < r10) goto L_0x00fc
                long r2 = r8 + r17
                byte r6 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8804a(r1, r8)
                if (r6 <= r15) goto L_0x00fa
                goto L_0x00fc
            L_0x00fa:
                r8 = r2
                goto L_0x00cd
            L_0x00fc:
                r7 = r16
                goto L_0x014d
            L_0x00ff:
                if (r2 >= r11) goto L_0x011f
                if (r0 >= r5) goto L_0x0104
                goto L_0x0122
            L_0x0104:
                int r0 = r0 + -2
                long r6 = r8 + r17
                byte r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8804a(r1, r8)
                if (r3 > r15) goto L_0x00fc
                if (r2 != r14) goto L_0x0112
                if (r3 < r13) goto L_0x00fc
            L_0x0112:
                if (r2 != r4) goto L_0x0116
                if (r3 >= r13) goto L_0x00fc
            L_0x0116:
                long r8 = r6 + r17
                byte r2 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8804a(r1, r6)
                if (r2 <= r15) goto L_0x00cd
                goto L_0x00fc
            L_0x011f:
                r3 = 3
                if (r0 >= r3) goto L_0x0127
            L_0x0122:
                int r7 = m8898a(r1, r2, r8, r0)
                goto L_0x014d
            L_0x0127:
                int r0 = r0 + -3
                long r6 = r8 + r17
                byte r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8804a(r1, r8)
                if (r3 > r15) goto L_0x00fc
                int r2 = r2 << 28
                int r3 = r3 + 112
                int r3 = r3 + r2
                int r2 = r3 >> 30
                if (r2 != 0) goto L_0x00fc
                long r2 = r6 + r17
                byte r6 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8804a(r1, r6)
                if (r6 > r15) goto L_0x00fc
                long r6 = r2 + r17
                byte r2 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8804a(r1, r2)
                if (r2 <= r15) goto L_0x014b
                goto L_0x00fc
            L_0x014b:
                r8 = r6
                goto L_0x00cd
            L_0x014d:
                return r7
            L_0x014e:
                java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
                r4 = 3
                java.lang.Object[] r4 = new java.lang.Object[r4]
                int r1 = r1.length
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r6 = 0
                r4[r6] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r26)
                r2 = 1
                r4[r2] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r27)
                r4[r5] = r1
                java.lang.String r1 = "Array length=%d, index=%d, limit=%d"
                java.lang.String r1 = java.lang.String.format(r1, r4)
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p301c.p302a.p311j0.p312a.C3700r1.C3704d.mo9912a(int, byte[], int, int):int");
        }

        /* renamed from: a */
        public static int m8898a(byte[] bArr, int i, long j, int i2) {
            if (i2 == 0) {
                return C3700r1.m8881a(i);
            }
            if (i2 == 1) {
                return C3700r1.m8882a(i, C3691q1.m8804a(bArr, j));
            }
            if (i2 == 2) {
                return C3700r1.m8883a(i, (int) C3691q1.m8804a(bArr, j), (int) C3691q1.m8804a(bArr, j + 1));
            }
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    public static int m8881a(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* renamed from: a */
    public static int m8882a(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* renamed from: a */
    public static int m8883a(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    /* renamed from: a */
    public static int m8885a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return f9152a.mo9913a(charSequence, bArr, i, i2);
    }

    /* renamed from: a */
    public static /* synthetic */ int m8886a(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            return m8881a((int) b);
        }
        if (i3 == 1) {
            return m8882a(b, bArr[i]);
        }
        if (i3 == 2) {
            return m8883a((int) b, (int) bArr[i], (int) bArr[i + 1]);
        }
        throw new AssertionError();
    }

    /* renamed from: b */
    public static String m8887b(byte[] bArr, int i, int i2) {
        return f9152a.mo9915a(bArr, i, i2);
    }

    /* renamed from: c */
    public static boolean m8888c(byte[] bArr, int i, int i2) {
        return f9152a.mo9912a(0, bArr, i, i2) == 0;
    }

    /* renamed from: a */
    public static int m8884a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new C3703c(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder a = C1965a.m4756a("UTF-8 length does not fit in int: ");
        a.append(((long) i3) + 4294967296L);
        throw new IllegalArgumentException(a.toString());
    }
}
