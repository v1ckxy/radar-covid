package p213q.p217b.p301c.p302a.p311j0.p312a;

import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import p116io.jsonwebtoken.lang.Objects;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3667l0.C3668a;

/* renamed from: q.b.c.a.j0.a.f */
public abstract class C3618f implements C3622f1 {

    /* renamed from: q.b.c.a.j0.a.f$a */
    public static /* synthetic */ class C3619a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f9009a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|(2:21|22)|23|25|26|27|28|(2:29|30)|31|(2:33|34)|35|(2:37|38)|39|(2:41|42)|43|45|46|47|48|49|50|51|52|54) */
        /* JADX WARNING: Can't wrap try/catch for region: R(38:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|(2:21|22)|23|25|26|27|28|(2:29|30)|31|33|34|35|(2:37|38)|39|(2:41|42)|43|45|46|47|48|49|50|51|52|54) */
        /* JADX WARNING: Can't wrap try/catch for region: R(40:0|(2:1|2)|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|25|26|27|28|(2:29|30)|31|33|34|35|(2:37|38)|39|(2:41|42)|43|45|46|47|48|49|50|51|52|54) */
        /* JADX WARNING: Can't wrap try/catch for region: R(43:0|1|2|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|25|26|27|28|29|30|31|33|34|35|(2:37|38)|39|41|42|43|45|46|47|48|49|50|51|52|54) */
        /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0031 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0037 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0045 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x004d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x0077 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x007d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x0083 */
        static {
            /*
                q.b.c.a.j0.a.t1[] r0 = p213q.p217b.p301c.p302a.p311j0.p312a.C3711t1.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9009a = r0
                r1 = 1
                r2 = 7
                q.b.c.a.j0.a.t1 r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3711t1.BOOL     // Catch:{ NoSuchFieldError -> 0x000f }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                r0 = 2
                r3 = 11
                int[] r4 = f9009a     // Catch:{ NoSuchFieldError -> 0x0018 }
                q.b.c.a.j0.a.t1 r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3711t1.BYTES     // Catch:{ NoSuchFieldError -> 0x0018 }
                r4[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                r4 = 3
                int[] r5 = f9009a     // Catch:{ NoSuchFieldError -> 0x0020 }
                q.b.c.a.j0.a.t1 r6 = p213q.p217b.p301c.p302a.p311j0.p312a.C3711t1.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0020 }
                r6 = 0
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x0020 }
            L_0x0020:
                r5 = 4
                r6 = 13
                int[] r7 = f9009a     // Catch:{ NoSuchFieldError -> 0x0029 }
                q.b.c.a.j0.a.t1 r8 = p213q.p217b.p301c.p302a.p311j0.p312a.C3711t1.ENUM     // Catch:{ NoSuchFieldError -> 0x0029 }
                r7[r6] = r5     // Catch:{ NoSuchFieldError -> 0x0029 }
            L_0x0029:
                r7 = 5
                r8 = 6
                int[] r9 = f9009a     // Catch:{ NoSuchFieldError -> 0x0031 }
                q.b.c.a.j0.a.t1 r10 = p213q.p217b.p301c.p302a.p311j0.p312a.C3711t1.FIXED32     // Catch:{ NoSuchFieldError -> 0x0031 }
                r9[r8] = r7     // Catch:{ NoSuchFieldError -> 0x0031 }
            L_0x0031:
                int[] r9 = f9009a     // Catch:{ NoSuchFieldError -> 0x0037 }
                q.b.c.a.j0.a.t1 r10 = p213q.p217b.p301c.p302a.p311j0.p312a.C3711t1.FIXED64     // Catch:{ NoSuchFieldError -> 0x0037 }
                r9[r7] = r8     // Catch:{ NoSuchFieldError -> 0x0037 }
            L_0x0037:
                int[] r7 = f9009a     // Catch:{ NoSuchFieldError -> 0x003d }
                q.b.c.a.j0.a.t1 r8 = p213q.p217b.p301c.p302a.p311j0.p312a.C3711t1.FLOAT     // Catch:{ NoSuchFieldError -> 0x003d }
                r7[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                r1 = 8
                int[] r2 = f9009a     // Catch:{ NoSuchFieldError -> 0x0045 }
                q.b.c.a.j0.a.t1 r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3711t1.INT32     // Catch:{ NoSuchFieldError -> 0x0045 }
                r2[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0045 }
            L_0x0045:
                int[] r2 = f9009a     // Catch:{ NoSuchFieldError -> 0x004d }
                q.b.c.a.j0.a.t1 r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3711t1.INT64     // Catch:{ NoSuchFieldError -> 0x004d }
                r5 = 9
                r2[r0] = r5     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                int[] r0 = f9009a     // Catch:{ NoSuchFieldError -> 0x0055 }
                q.b.c.a.j0.a.t1 r2 = p213q.p217b.p301c.p302a.p311j0.p312a.C3711t1.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0055 }
                r2 = 10
                r0[r2] = r2     // Catch:{ NoSuchFieldError -> 0x0055 }
            L_0x0055:
                r0 = 14
                int[] r2 = f9009a     // Catch:{ NoSuchFieldError -> 0x005d }
                q.b.c.a.j0.a.t1 r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3711t1.SFIXED32     // Catch:{ NoSuchFieldError -> 0x005d }
                r2[r0] = r3     // Catch:{ NoSuchFieldError -> 0x005d }
            L_0x005d:
                r2 = 12
                r3 = 15
                int[] r5 = f9009a     // Catch:{ NoSuchFieldError -> 0x0067 }
                q.b.c.a.j0.a.t1 r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3711t1.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0067 }
                r5[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0067 }
            L_0x0067:
                r5 = 16
                int[] r7 = f9009a     // Catch:{ NoSuchFieldError -> 0x006f }
                q.b.c.a.j0.a.t1 r8 = p213q.p217b.p301c.p302a.p311j0.p312a.C3711t1.SINT32     // Catch:{ NoSuchFieldError -> 0x006f }
                r7[r5] = r6     // Catch:{ NoSuchFieldError -> 0x006f }
            L_0x006f:
                r6 = 17
                int[] r7 = f9009a     // Catch:{ NoSuchFieldError -> 0x0077 }
                q.b.c.a.j0.a.t1 r8 = p213q.p217b.p301c.p302a.p311j0.p312a.C3711t1.SINT64     // Catch:{ NoSuchFieldError -> 0x0077 }
                r7[r6] = r0     // Catch:{ NoSuchFieldError -> 0x0077 }
            L_0x0077:
                int[] r0 = f9009a     // Catch:{ NoSuchFieldError -> 0x007d }
                q.b.c.a.j0.a.t1 r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3711t1.STRING     // Catch:{ NoSuchFieldError -> 0x007d }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x007d }
            L_0x007d:
                int[] r0 = f9009a     // Catch:{ NoSuchFieldError -> 0x0083 }
                q.b.c.a.j0.a.t1 r1 = p213q.p217b.p301c.p302a.p311j0.p312a.C3711t1.UINT32     // Catch:{ NoSuchFieldError -> 0x0083 }
                r0[r2] = r5     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = f9009a     // Catch:{ NoSuchFieldError -> 0x0089 }
                q.b.c.a.j0.a.t1 r1 = p213q.p217b.p301c.p302a.p311j0.p312a.C3711t1.UINT64     // Catch:{ NoSuchFieldError -> 0x0089 }
                r0[r4] = r6     // Catch:{ NoSuchFieldError -> 0x0089 }
            L_0x0089:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p301c.p302a.p311j0.p312a.C3618f.C3619a.<clinit>():void");
        }
    }

    /* renamed from: q.b.c.a.j0.a.f$b */
    public static final class C3620b extends C3618f {

        /* renamed from: a */
        public final boolean f9010a;

        /* renamed from: b */
        public final byte[] f9011b;

        /* renamed from: c */
        public int f9012c;

        /* renamed from: d */
        public int f9013d;

        /* renamed from: e */
        public int f9014e;

        /* renamed from: f */
        public int f9015f;

        public C3620b(ByteBuffer byteBuffer, boolean z) {
            super(null);
            this.f9010a = z;
            this.f9011b = byteBuffer.array();
            this.f9012c = byteBuffer.position() + byteBuffer.arrayOffset();
            this.f9013d = byteBuffer.limit() + byteBuffer.arrayOffset();
        }

        /* renamed from: A */
        public final long mo9559A() {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte t = mo9615t();
                j |= ((long) (t & Byte.MAX_VALUE)) << i;
                if ((t & 128) == 0) {
                    return j;
                }
            }
            throw C3606c0.m8178e();
        }

        /* renamed from: a */
        public int mo9560a() {
            mo9577c(0);
            return mo9620y();
        }

        /* renamed from: a */
        public <T> T mo9561a(Class<T> cls, C3697r rVar) {
            mo9577c(3);
            return mo9576c(C3608c1.f8978c.mo9537a(cls), rVar);
        }

        /* renamed from: a */
        public <T> T mo9562a(C3625g1<T> g1Var, C3697r rVar) {
            mo9577c(3);
            return mo9576c(g1Var, rVar);
        }

        /* renamed from: a */
        public String mo9563a(boolean z) {
            mo9577c(2);
            int y = mo9620y();
            if (y == 0) {
                return Objects.EMPTY_STRING;
            }
            mo9564a(y);
            if (z) {
                byte[] bArr = this.f9011b;
                int i = this.f9012c;
                if (!C3700r1.m8888c(bArr, i, i + y)) {
                    throw C3606c0.m8176c();
                }
            }
            String str = new String(this.f9011b, this.f9012c, y, C3594b0.f8972a);
            this.f9012c += y;
            return str;
        }

        /* renamed from: a */
        public final void mo9564a(int i) {
            if (i < 0 || i > this.f9013d - this.f9012c) {
                throw C3606c0.m8181h();
            }
        }

        /* renamed from: a */
        public void mo9565a(List<Integer> list) {
            int i;
            int i2;
            if (list instanceof C3591a0) {
                C3591a0 a0Var = (C3591a0) list;
                int i3 = this.f9014e & 7;
                if (i3 == 0) {
                    do {
                        a0Var.mo9517e(mo9583e());
                        if (!mo9614s()) {
                            i2 = this.f9012c;
                        } else {
                            return;
                        }
                    } while (mo9620y() == this.f9014e);
                    this.f9012c = i2;
                } else if (i3 == 2) {
                    int y = this.f9012c + mo9620y();
                    while (this.f9012c < y) {
                        a0Var.mo9517e(C3656k.m8448e(mo9620y()));
                    }
                } else {
                    throw C3606c0.m8177d();
                }
            } else {
                int i4 = this.f9014e & 7;
                if (i4 == 0) {
                    do {
                        list.add(Integer.valueOf(mo9583e()));
                        if (!mo9614s()) {
                            i = this.f9012c;
                        } else {
                            return;
                        }
                    } while (mo9620y() == this.f9014e);
                    this.f9012c = i;
                } else if (i4 == 2) {
                    int y2 = this.f9012c + mo9620y();
                    while (this.f9012c < y2) {
                        list.add(Integer.valueOf(C3656k.m8448e(mo9620y())));
                    }
                } else {
                    throw C3606c0.m8177d();
                }
            }
        }

        /* renamed from: a */
        public <T> void mo9566a(List<T> list, C3625g1<T> g1Var, C3697r rVar) {
            int i;
            int i2 = this.f9014e;
            if ((i2 & 7) == 2) {
                do {
                    list.add(mo9580d(g1Var, rVar));
                    if (!mo9614s()) {
                        i = this.f9012c;
                    } else {
                        return;
                    }
                } while (mo9620y() == i2);
                this.f9012c = i;
                return;
            }
            throw C3606c0.m8177d();
        }

        /* renamed from: a */
        public void mo9567a(List<String> list, boolean z) {
            int i;
            int i2;
            if ((this.f9014e & 7) != 2) {
                throw C3606c0.m8177d();
            } else if (!(list instanceof C3627h0) || z) {
                do {
                    list.add(mo9563a(z));
                    if (!mo9614s()) {
                        i = this.f9012c;
                    } else {
                        return;
                    }
                } while (mo9620y() == this.f9014e);
                this.f9012c = i;
            } else {
                C3627h0 h0Var = (C3627h0) list;
                do {
                    h0Var.mo9633a(mo9599l());
                    if (!mo9614s()) {
                        i2 = this.f9012c;
                    } else {
                        return;
                    }
                } while (mo9620y() == this.f9014e);
                this.f9012c = i2;
            }
        }

        /* renamed from: a */
        public <K, V> void mo9568a(Map<K, V> map, C3668a<K, V> aVar, C3697r rVar) {
            mo9577c(2);
            int y = mo9620y();
            mo9564a(y);
            int i = this.f9013d;
            this.f9013d = this.f9012c + y;
            try {
                throw null;
            } catch (Throwable th) {
                this.f9013d = i;
                throw th;
            }
        }

        /* renamed from: b */
        public int mo9569b() {
            return this.f9014e;
        }

        /* renamed from: b */
        public <T> T mo9570b(Class<T> cls, C3697r rVar) {
            mo9577c(2);
            return mo9580d(C3608c1.f8978c.mo9537a(cls), rVar);
        }

        /* renamed from: b */
        public <T> T mo9571b(C3625g1<T> g1Var, C3697r rVar) {
            mo9577c(2);
            return mo9580d(g1Var, rVar);
        }

        /* renamed from: b */
        public final void mo9572b(int i) {
            if (this.f9012c != i) {
                throw C3606c0.m8181h();
            }
        }

        /* renamed from: b */
        public void mo9573b(List<Integer> list) {
            int i;
            int i2;
            if (list instanceof C3591a0) {
                C3591a0 a0Var = (C3591a0) list;
                int i3 = this.f9014e & 7;
                if (i3 == 2) {
                    int y = mo9620y();
                    mo9584e(y);
                    int i4 = this.f9012c + y;
                    while (this.f9012c < i4) {
                        a0Var.mo9517e(mo9617v());
                    }
                } else if (i3 == 5) {
                    do {
                        a0Var.mo9517e(mo9591h());
                        if (!mo9614s()) {
                            i2 = this.f9012c;
                        } else {
                            return;
                        }
                    } while (mo9620y() == this.f9014e);
                    this.f9012c = i2;
                } else {
                    throw C3606c0.m8177d();
                }
            } else {
                int i5 = this.f9014e & 7;
                if (i5 == 2) {
                    int y2 = mo9620y();
                    mo9584e(y2);
                    int i6 = this.f9012c + y2;
                    while (this.f9012c < i6) {
                        list.add(Integer.valueOf(mo9617v()));
                    }
                } else if (i5 == 5) {
                    do {
                        list.add(Integer.valueOf(mo9591h()));
                        if (!mo9614s()) {
                            i = this.f9012c;
                        } else {
                            return;
                        }
                    } while (mo9620y() == this.f9014e);
                    this.f9012c = i;
                } else {
                    throw C3606c0.m8177d();
                }
            }
        }

        /* renamed from: b */
        public <T> void mo9574b(List<T> list, C3625g1<T> g1Var, C3697r rVar) {
            int i;
            int i2 = this.f9014e;
            if ((i2 & 7) == 3) {
                do {
                    list.add(mo9576c(g1Var, rVar));
                    if (!mo9614s()) {
                        i = this.f9012c;
                    } else {
                        return;
                    }
                } while (mo9620y() == i2);
                this.f9012c = i;
                return;
            }
            throw C3606c0.m8177d();
        }

        /* renamed from: c */
        public long mo9575c() {
            mo9577c(0);
            return mo9621z();
        }

        /* renamed from: c */
        public final <T> T mo9576c(C3625g1<T> g1Var, C3697r rVar) {
            int i = this.f9015f;
            this.f9015f = ((this.f9014e >>> 3) << 3) | 4;
            try {
                T a = g1Var.mo9642a();
                g1Var.mo9645a(a, this, rVar);
                g1Var.mo9643a(a);
                if (this.f9014e == this.f9015f) {
                    return a;
                }
                throw C3606c0.m8180g();
            } finally {
                this.f9015f = i;
            }
        }

        /* renamed from: c */
        public final void mo9577c(int i) {
            if ((this.f9014e & 7) != i) {
                throw C3606c0.m8177d();
            }
        }

        /* renamed from: c */
        public void mo9578c(List<Integer> list) {
            int i;
            int i2;
            if (list instanceof C3591a0) {
                C3591a0 a0Var = (C3591a0) list;
                int i3 = this.f9014e & 7;
                if (i3 == 2) {
                    int y = mo9620y();
                    mo9584e(y);
                    int i4 = this.f9012c + y;
                    while (this.f9012c < i4) {
                        a0Var.mo9517e(mo9617v());
                    }
                } else if (i3 == 5) {
                    do {
                        a0Var.mo9517e(mo9607p());
                        if (!mo9614s()) {
                            i2 = this.f9012c;
                        } else {
                            return;
                        }
                    } while (mo9620y() == this.f9014e);
                    this.f9012c = i2;
                } else {
                    throw C3606c0.m8177d();
                }
            } else {
                int i5 = this.f9014e & 7;
                if (i5 == 2) {
                    int y2 = mo9620y();
                    mo9584e(y2);
                    int i6 = this.f9012c + y2;
                    while (this.f9012c < i6) {
                        list.add(Integer.valueOf(mo9617v()));
                    }
                } else if (i5 == 5) {
                    do {
                        list.add(Integer.valueOf(mo9607p()));
                        if (!mo9614s()) {
                            i = this.f9012c;
                        } else {
                            return;
                        }
                    } while (mo9620y() == this.f9014e);
                    this.f9012c = i;
                } else {
                    throw C3606c0.m8177d();
                }
            }
        }

        /* renamed from: d */
        public long mo9579d() {
            mo9577c(1);
            return mo9618w();
        }

        /* renamed from: d */
        public final <T> T mo9580d(C3625g1<T> g1Var, C3697r rVar) {
            int y = mo9620y();
            mo9564a(y);
            int i = this.f9013d;
            int i2 = this.f9012c + y;
            this.f9013d = i2;
            try {
                T a = g1Var.mo9642a();
                g1Var.mo9645a(a, this, rVar);
                g1Var.mo9643a(a);
                if (this.f9012c == i2) {
                    return a;
                }
                throw C3606c0.m8180g();
            } finally {
                this.f9013d = i;
            }
        }

        /* renamed from: d */
        public final void mo9581d(int i) {
            mo9564a(i);
            this.f9012c += i;
        }

        /* renamed from: d */
        public void mo9582d(List<Long> list) {
            int i;
            int i2;
            if (list instanceof C3645j0) {
                C3645j0 j0Var = (C3645j0) list;
                int i3 = this.f9014e & 7;
                if (i3 == 0) {
                    do {
                        j0Var.mo9679a(mo9586f());
                        if (!mo9614s()) {
                            i2 = this.f9012c;
                        } else {
                            return;
                        }
                    } while (mo9620y() == this.f9014e);
                    this.f9012c = i2;
                } else if (i3 == 2) {
                    int y = this.f9012c + mo9620y();
                    while (this.f9012c < y) {
                        j0Var.mo9679a(C3656k.m8444a(mo9621z()));
                    }
                } else {
                    throw C3606c0.m8177d();
                }
            } else {
                int i4 = this.f9014e & 7;
                if (i4 == 0) {
                    do {
                        list.add(Long.valueOf(mo9586f()));
                        if (!mo9614s()) {
                            i = this.f9012c;
                        } else {
                            return;
                        }
                    } while (mo9620y() == this.f9014e);
                    this.f9012c = i;
                } else if (i4 == 2) {
                    int y2 = this.f9012c + mo9620y();
                    while (this.f9012c < y2) {
                        list.add(Long.valueOf(C3656k.m8444a(mo9621z())));
                    }
                } else {
                    throw C3606c0.m8177d();
                }
            }
        }

        /* renamed from: e */
        public int mo9583e() {
            mo9577c(0);
            return C3656k.m8448e(mo9620y());
        }

        /* renamed from: e */
        public final void mo9584e(int i) {
            mo9564a(i);
            if ((i & 3) != 0) {
                throw C3606c0.m8180g();
            }
        }

        /* renamed from: e */
        public void mo9585e(List<Integer> list) {
            int i;
            int i2;
            if (list instanceof C3591a0) {
                C3591a0 a0Var = (C3591a0) list;
                int i3 = this.f9014e & 7;
                if (i3 == 0) {
                    do {
                        a0Var.mo9517e(mo9601m());
                        if (!mo9614s()) {
                            i2 = this.f9012c;
                        } else {
                            return;
                        }
                    } while (mo9620y() == this.f9014e);
                    this.f9012c = i2;
                } else if (i3 == 2) {
                    int y = this.f9012c + mo9620y();
                    while (this.f9012c < y) {
                        a0Var.mo9517e(mo9620y());
                    }
                } else {
                    throw C3606c0.m8177d();
                }
            } else {
                int i4 = this.f9014e & 7;
                if (i4 == 0) {
                    do {
                        list.add(Integer.valueOf(mo9601m()));
                        if (!mo9614s()) {
                            i = this.f9012c;
                        } else {
                            return;
                        }
                    } while (mo9620y() == this.f9014e);
                    this.f9012c = i;
                } else if (i4 == 2) {
                    int y2 = this.f9012c + mo9620y();
                    while (this.f9012c < y2) {
                        list.add(Integer.valueOf(mo9620y()));
                    }
                } else {
                    throw C3606c0.m8177d();
                }
            }
        }

        /* renamed from: f */
        public long mo9586f() {
            mo9577c(0);
            return C3656k.m8444a(mo9621z());
        }

        /* renamed from: f */
        public final void mo9587f(int i) {
            mo9564a(i);
            if ((i & 7) != 0) {
                throw C3606c0.m8180g();
            }
        }

        /* renamed from: f */
        public void mo9588f(List<Boolean> list) {
            int i;
            int i2;
            int i3;
            if (list instanceof C3623g) {
                C3623g gVar = (C3623g) list;
                int i4 = this.f9014e & 7;
                if (i4 == 0) {
                    do {
                        gVar.mo9624a(mo9594i());
                        if (!mo9614s()) {
                            i3 = this.f9012c;
                        } else {
                            return;
                        }
                    } while (mo9620y() == this.f9014e);
                    this.f9012c = i3;
                    return;
                } else if (i4 == 2) {
                    i = this.f9012c + mo9620y();
                    while (this.f9012c < i) {
                        gVar.mo9624a(mo9620y() != 0);
                    }
                } else {
                    throw C3606c0.m8177d();
                }
            } else {
                int i5 = this.f9014e & 7;
                if (i5 == 0) {
                    do {
                        list.add(Boolean.valueOf(mo9594i()));
                        if (!mo9614s()) {
                            i2 = this.f9012c;
                        } else {
                            return;
                        }
                    } while (mo9620y() == this.f9014e);
                    this.f9012c = i2;
                    return;
                } else if (i5 == 2) {
                    i = this.f9012c + mo9620y();
                    while (this.f9012c < i) {
                        list.add(Boolean.valueOf(mo9620y() != 0));
                    }
                } else {
                    throw C3606c0.m8177d();
                }
            }
            mo9572b(i);
        }

        /* renamed from: g */
        public String mo9589g() {
            return mo9563a(false);
        }

        /* renamed from: g */
        public void mo9590g(List<String> list) {
            mo9567a(list, false);
        }

        /* renamed from: h */
        public int mo9591h() {
            mo9577c(5);
            return mo9616u();
        }

        /* renamed from: h */
        public void mo9592h(List<Long> list) {
            int i;
            int i2;
            int i3;
            if (list instanceof C3645j0) {
                C3645j0 j0Var = (C3645j0) list;
                int i4 = this.f9014e & 7;
                if (i4 == 0) {
                    do {
                        j0Var.mo9679a(mo9575c());
                        if (!mo9614s()) {
                            i3 = this.f9012c;
                        } else {
                            return;
                        }
                    } while (mo9620y() == this.f9014e);
                    this.f9012c = i3;
                    return;
                } else if (i4 == 2) {
                    i = this.f9012c + mo9620y();
                    while (this.f9012c < i) {
                        j0Var.mo9679a(mo9621z());
                    }
                } else {
                    throw C3606c0.m8177d();
                }
            } else {
                int i5 = this.f9014e & 7;
                if (i5 == 0) {
                    do {
                        list.add(Long.valueOf(mo9575c()));
                        if (!mo9614s()) {
                            i2 = this.f9012c;
                        } else {
                            return;
                        }
                    } while (mo9620y() == this.f9014e);
                    this.f9012c = i2;
                    return;
                } else if (i5 == 2) {
                    i = this.f9012c + mo9620y();
                    while (this.f9012c < i) {
                        list.add(Long.valueOf(mo9621z()));
                    }
                } else {
                    throw C3606c0.m8177d();
                }
            }
            mo9572b(i);
        }

        /* renamed from: i */
        public void mo9593i(List<String> list) {
            mo9567a(list, true);
        }

        /* renamed from: i */
        public boolean mo9594i() {
            mo9577c(0);
            return mo9620y() != 0;
        }

        /* renamed from: j */
        public int mo9595j() {
            if (mo9614s()) {
                return Integer.MAX_VALUE;
            }
            int y = mo9620y();
            this.f9014e = y;
            if (y == this.f9015f) {
                return Integer.MAX_VALUE;
            }
            return y >>> 3;
        }

        /* renamed from: j */
        public void mo9596j(List<Float> list) {
            int i;
            int i2;
            if (list instanceof C3727x) {
                C3727x xVar = (C3727x) list;
                int i3 = this.f9014e & 7;
                if (i3 == 2) {
                    int y = mo9620y();
                    mo9584e(y);
                    int i4 = this.f9012c + y;
                    while (this.f9012c < i4) {
                        xVar.mo9983a(Float.intBitsToFloat(mo9617v()));
                    }
                } else if (i3 == 5) {
                    do {
                        xVar.mo9983a(readFloat());
                        if (!mo9614s()) {
                            i2 = this.f9012c;
                        } else {
                            return;
                        }
                    } while (mo9620y() == this.f9014e);
                    this.f9012c = i2;
                } else {
                    throw C3606c0.m8177d();
                }
            } else {
                int i5 = this.f9014e & 7;
                if (i5 == 2) {
                    int y2 = mo9620y();
                    mo9584e(y2);
                    int i6 = this.f9012c + y2;
                    while (this.f9012c < i6) {
                        list.add(Float.valueOf(Float.intBitsToFloat(mo9617v())));
                    }
                } else if (i5 == 5) {
                    do {
                        list.add(Float.valueOf(readFloat()));
                        if (!mo9614s()) {
                            i = this.f9012c;
                        } else {
                            return;
                        }
                    } while (mo9620y() == this.f9014e);
                    this.f9012c = i;
                } else {
                    throw C3606c0.m8177d();
                }
            }
        }

        /* renamed from: k */
        public long mo9597k() {
            mo9577c(1);
            return mo9618w();
        }

        /* renamed from: k */
        public void mo9598k(List<C3635j> list) {
            int i;
            if ((this.f9014e & 7) == 2) {
                do {
                    list.add(mo9599l());
                    if (!mo9614s()) {
                        i = this.f9012c;
                    } else {
                        return;
                    }
                } while (mo9620y() == this.f9014e);
                this.f9012c = i;
                return;
            }
            throw C3606c0.m8177d();
        }

        /* renamed from: l */
        public C3635j mo9599l() {
            mo9577c(2);
            int y = mo9620y();
            if (y == 0) {
                return C3635j.f9034f;
            }
            mo9564a(y);
            C3635j b = this.f9010a ? C3635j.m8392b(this.f9011b, this.f9012c, y) : C3635j.m8389a(this.f9011b, this.f9012c, y);
            this.f9012c += y;
            return b;
        }

        /* renamed from: l */
        public void mo9600l(List<Double> list) {
            int i;
            int i2;
            if (list instanceof C3681o) {
                C3681o oVar = (C3681o) list;
                int i3 = this.f9014e & 7;
                if (i3 == 1) {
                    do {
                        oVar.mo9865a(readDouble());
                        if (!mo9614s()) {
                            i2 = this.f9012c;
                        } else {
                            return;
                        }
                    } while (mo9620y() == this.f9014e);
                    this.f9012c = i2;
                } else if (i3 == 2) {
                    int y = mo9620y();
                    mo9587f(y);
                    int i4 = this.f9012c + y;
                    while (this.f9012c < i4) {
                        oVar.mo9865a(Double.longBitsToDouble(mo9619x()));
                    }
                } else {
                    throw C3606c0.m8177d();
                }
            } else {
                int i5 = this.f9014e & 7;
                if (i5 == 1) {
                    do {
                        list.add(Double.valueOf(readDouble()));
                        if (!mo9614s()) {
                            i = this.f9012c;
                        } else {
                            return;
                        }
                    } while (mo9620y() == this.f9014e);
                    this.f9012c = i;
                } else if (i5 == 2) {
                    int y2 = mo9620y();
                    mo9587f(y2);
                    int i6 = this.f9012c + y2;
                    while (this.f9012c < i6) {
                        list.add(Double.valueOf(Double.longBitsToDouble(mo9619x())));
                    }
                } else {
                    throw C3606c0.m8177d();
                }
            }
        }

        /* renamed from: m */
        public int mo9601m() {
            mo9577c(0);
            return mo9620y();
        }

        /* renamed from: m */
        public void mo9602m(List<Long> list) {
            int i;
            int i2;
            int i3;
            if (list instanceof C3645j0) {
                C3645j0 j0Var = (C3645j0) list;
                int i4 = this.f9014e & 7;
                if (i4 == 0) {
                    do {
                        j0Var.mo9679a(mo9609q());
                        if (!mo9614s()) {
                            i3 = this.f9012c;
                        } else {
                            return;
                        }
                    } while (mo9620y() == this.f9014e);
                    this.f9012c = i3;
                    return;
                } else if (i4 == 2) {
                    i = this.f9012c + mo9620y();
                    while (this.f9012c < i) {
                        j0Var.mo9679a(mo9621z());
                    }
                } else {
                    throw C3606c0.m8177d();
                }
            } else {
                int i5 = this.f9014e & 7;
                if (i5 == 0) {
                    do {
                        list.add(Long.valueOf(mo9609q()));
                        if (!mo9614s()) {
                            i2 = this.f9012c;
                        } else {
                            return;
                        }
                    } while (mo9620y() == this.f9014e);
                    this.f9012c = i2;
                    return;
                } else if (i5 == 2) {
                    i = this.f9012c + mo9620y();
                    while (this.f9012c < i) {
                        list.add(Long.valueOf(mo9621z()));
                    }
                } else {
                    throw C3606c0.m8177d();
                }
            }
            mo9572b(i);
        }

        /* renamed from: n */
        public int mo9603n() {
            mo9577c(0);
            return mo9620y();
        }

        /* renamed from: n */
        public void mo9604n(List<Long> list) {
            int i;
            int i2;
            if (list instanceof C3645j0) {
                C3645j0 j0Var = (C3645j0) list;
                int i3 = this.f9014e & 7;
                if (i3 == 1) {
                    do {
                        j0Var.mo9679a(mo9597k());
                        if (!mo9614s()) {
                            i2 = this.f9012c;
                        } else {
                            return;
                        }
                    } while (mo9620y() == this.f9014e);
                    this.f9012c = i2;
                } else if (i3 == 2) {
                    int y = mo9620y();
                    mo9587f(y);
                    int i4 = this.f9012c + y;
                    while (this.f9012c < i4) {
                        j0Var.mo9679a(mo9619x());
                    }
                } else {
                    throw C3606c0.m8177d();
                }
            } else {
                int i5 = this.f9014e & 7;
                if (i5 == 1) {
                    do {
                        list.add(Long.valueOf(mo9597k()));
                        if (!mo9614s()) {
                            i = this.f9012c;
                        } else {
                            return;
                        }
                    } while (mo9620y() == this.f9014e);
                    this.f9012c = i;
                } else if (i5 == 2) {
                    int y2 = mo9620y();
                    mo9587f(y2);
                    int i6 = this.f9012c + y2;
                    while (this.f9012c < i6) {
                        list.add(Long.valueOf(mo9619x()));
                    }
                } else {
                    throw C3606c0.m8177d();
                }
            }
        }

        /* renamed from: o */
        public void mo9605o(List<Long> list) {
            int i;
            int i2;
            if (list instanceof C3645j0) {
                C3645j0 j0Var = (C3645j0) list;
                int i3 = this.f9014e & 7;
                if (i3 == 1) {
                    do {
                        j0Var.mo9679a(mo9579d());
                        if (!mo9614s()) {
                            i2 = this.f9012c;
                        } else {
                            return;
                        }
                    } while (mo9620y() == this.f9014e);
                    this.f9012c = i2;
                } else if (i3 == 2) {
                    int y = mo9620y();
                    mo9587f(y);
                    int i4 = this.f9012c + y;
                    while (this.f9012c < i4) {
                        j0Var.mo9679a(mo9619x());
                    }
                } else {
                    throw C3606c0.m8177d();
                }
            } else {
                int i5 = this.f9014e & 7;
                if (i5 == 1) {
                    do {
                        list.add(Long.valueOf(mo9579d()));
                        if (!mo9614s()) {
                            i = this.f9012c;
                        } else {
                            return;
                        }
                    } while (mo9620y() == this.f9014e);
                    this.f9012c = i;
                } else if (i5 == 2) {
                    int y2 = mo9620y();
                    mo9587f(y2);
                    int i6 = this.f9012c + y2;
                    while (this.f9012c < i6) {
                        list.add(Long.valueOf(mo9619x()));
                    }
                } else {
                    throw C3606c0.m8177d();
                }
            }
        }

        /* renamed from: o */
        public boolean mo9606o() {
            int i;
            if (!mo9614s()) {
                int i2 = this.f9014e;
                int i3 = this.f9015f;
                if (i2 != i3) {
                    int i4 = i2 & 7;
                    if (i4 != 0) {
                        if (i4 == 1) {
                            i = 8;
                        } else if (i4 == 2) {
                            i = mo9620y();
                        } else if (i4 == 3) {
                            this.f9015f = ((i2 >>> 3) << 3) | 4;
                            while (mo9595j() != Integer.MAX_VALUE) {
                                if (!mo9606o()) {
                                    break;
                                }
                            }
                            if (this.f9014e == this.f9015f) {
                                this.f9015f = i3;
                                return true;
                            }
                            throw C3606c0.m8180g();
                        } else if (i4 == 5) {
                            mo9581d(4);
                            return true;
                        } else {
                            throw C3606c0.m8177d();
                        }
                        mo9581d(i);
                        return true;
                    }
                    int i5 = this.f9013d;
                    int i6 = this.f9012c;
                    if (i5 - i6 >= 10) {
                        byte[] bArr = this.f9011b;
                        int i7 = 0;
                        while (true) {
                            if (i7 >= 10) {
                                break;
                            }
                            int i8 = i6 + 1;
                            if (bArr[i6] >= 0) {
                                this.f9012c = i8;
                                break;
                            }
                            i7++;
                            i6 = i8;
                        }
                        return true;
                    }
                    for (int i9 = 0; i9 < 10; i9++) {
                        if (mo9615t() >= 0) {
                            return true;
                        }
                    }
                    throw C3606c0.m8178e();
                }
            }
            return false;
        }

        /* renamed from: p */
        public int mo9607p() {
            mo9577c(5);
            return mo9616u();
        }

        /* renamed from: p */
        public void mo9608p(List<Integer> list) {
            int i;
            int i2;
            int i3;
            if (list instanceof C3591a0) {
                C3591a0 a0Var = (C3591a0) list;
                int i4 = this.f9014e & 7;
                if (i4 == 0) {
                    do {
                        a0Var.mo9517e(mo9603n());
                        if (!mo9614s()) {
                            i3 = this.f9012c;
                        } else {
                            return;
                        }
                    } while (mo9620y() == this.f9014e);
                    this.f9012c = i3;
                    return;
                } else if (i4 == 2) {
                    i = this.f9012c + mo9620y();
                    while (this.f9012c < i) {
                        a0Var.mo9517e(mo9620y());
                    }
                } else {
                    throw C3606c0.m8177d();
                }
            } else {
                int i5 = this.f9014e & 7;
                if (i5 == 0) {
                    do {
                        list.add(Integer.valueOf(mo9603n()));
                        if (!mo9614s()) {
                            i2 = this.f9012c;
                        } else {
                            return;
                        }
                    } while (mo9620y() == this.f9014e);
                    this.f9012c = i2;
                    return;
                } else if (i5 == 2) {
                    i = this.f9012c + mo9620y();
                    while (this.f9012c < i) {
                        list.add(Integer.valueOf(mo9620y()));
                    }
                } else {
                    throw C3606c0.m8177d();
                }
            }
            mo9572b(i);
        }

        /* renamed from: q */
        public long mo9609q() {
            mo9577c(0);
            return mo9621z();
        }

        /* renamed from: q */
        public void mo9610q(List<Integer> list) {
            int i;
            int i2;
            if (list instanceof C3591a0) {
                C3591a0 a0Var = (C3591a0) list;
                int i3 = this.f9014e & 7;
                if (i3 == 0) {
                    do {
                        a0Var.mo9517e(mo9560a());
                        if (!mo9614s()) {
                            i2 = this.f9012c;
                        } else {
                            return;
                        }
                    } while (mo9620y() == this.f9014e);
                    this.f9012c = i2;
                } else if (i3 == 2) {
                    int y = this.f9012c + mo9620y();
                    while (this.f9012c < y) {
                        a0Var.mo9517e(mo9620y());
                    }
                } else {
                    throw C3606c0.m8177d();
                }
            } else {
                int i4 = this.f9014e & 7;
                if (i4 == 0) {
                    do {
                        list.add(Integer.valueOf(mo9560a()));
                        if (!mo9614s()) {
                            i = this.f9012c;
                        } else {
                            return;
                        }
                    } while (mo9620y() == this.f9014e);
                    this.f9012c = i;
                } else if (i4 == 2) {
                    int y2 = this.f9012c + mo9620y();
                    while (this.f9012c < y2) {
                        list.add(Integer.valueOf(mo9620y()));
                    }
                } else {
                    throw C3606c0.m8177d();
                }
            }
        }

        /* renamed from: r */
        public String mo9611r() {
            return mo9563a(true);
        }

        public double readDouble() {
            mo9577c(1);
            return Double.longBitsToDouble(mo9618w());
        }

        public float readFloat() {
            mo9577c(5);
            return Float.intBitsToFloat(mo9616u());
        }

        /* renamed from: s */
        public final boolean mo9614s() {
            return this.f9012c == this.f9013d;
        }

        /* renamed from: t */
        public final byte mo9615t() {
            int i = this.f9012c;
            if (i != this.f9013d) {
                byte[] bArr = this.f9011b;
                this.f9012c = i + 1;
                return bArr[i];
            }
            throw C3606c0.m8181h();
        }

        /* renamed from: u */
        public final int mo9616u() {
            mo9564a(4);
            return mo9617v();
        }

        /* renamed from: v */
        public final int mo9617v() {
            int i = this.f9012c;
            byte[] bArr = this.f9011b;
            this.f9012c = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        /* renamed from: w */
        public final long mo9618w() {
            mo9564a(8);
            return mo9619x();
        }

        /* renamed from: x */
        public final long mo9619x() {
            int i = this.f9012c;
            byte[] bArr = this.f9011b;
            this.f9012c = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        /* renamed from: y */
        public final int mo9620y() {
            byte b;
            int i = this.f9012c;
            int i2 = this.f9013d;
            if (i2 != i) {
                byte[] bArr = this.f9011b;
                int i3 = i + 1;
                byte b2 = bArr[i];
                if (b2 >= 0) {
                    this.f9012c = i3;
                    return b2;
                } else if (i2 - i3 < 9) {
                    return (int) mo9559A();
                } else {
                    int i4 = i3 + 1;
                    byte b3 = b2 ^ (bArr[i3] << 7);
                    if (b3 < 0) {
                        b = b3 ^ Byte.MIN_VALUE;
                    } else {
                        int i5 = i4 + 1;
                        byte b4 = b3 ^ (bArr[i4] << 14);
                        if (b4 >= 0) {
                            b = b4 ^ 16256;
                        } else {
                            i4 = i5 + 1;
                            byte b5 = b4 ^ (bArr[i5] << 21);
                            if (b5 < 0) {
                                b = b5 ^ -2080896;
                            } else {
                                i5 = i4 + 1;
                                byte b6 = bArr[i4];
                                b = (b5 ^ (b6 << 28)) ^ 266354560;
                                if (b6 < 0) {
                                    i4 = i5 + 1;
                                    if (bArr[i5] < 0) {
                                        i5 = i4 + 1;
                                        if (bArr[i4] < 0) {
                                            i4 = i5 + 1;
                                            if (bArr[i5] < 0) {
                                                i5 = i4 + 1;
                                                if (bArr[i4] < 0) {
                                                    i4 = i5 + 1;
                                                    if (bArr[i5] < 0) {
                                                        throw C3606c0.m8178e();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i4 = i5;
                    }
                    this.f9012c = i4;
                    return b;
                }
            } else {
                throw C3606c0.m8181h();
            }
        }

        /* renamed from: z */
        public long mo9621z() {
            long j;
            int i;
            long j2;
            long j3;
            byte b;
            int i2 = this.f9012c;
            int i3 = this.f9013d;
            if (i3 != i2) {
                byte[] bArr = this.f9011b;
                int i4 = i2 + 1;
                byte b2 = bArr[i2];
                if (b2 >= 0) {
                    this.f9012c = i4;
                    return (long) b2;
                } else if (i3 - i4 < 9) {
                    return mo9559A();
                } else {
                    int i5 = i4 + 1;
                    byte b3 = b2 ^ (bArr[i4] << 7);
                    if (b3 < 0) {
                        b = b3 ^ Byte.MIN_VALUE;
                    } else {
                        int i6 = i5 + 1;
                        byte b4 = b3 ^ (bArr[i5] << 14);
                        if (b4 >= 0) {
                            i = i6;
                            j = (long) (b4 ^ 16256);
                        } else {
                            i5 = i6 + 1;
                            byte b5 = b4 ^ (bArr[i6] << 21);
                            if (b5 < 0) {
                                b = b5 ^ -2080896;
                            } else {
                                long j4 = (long) b5;
                                int i7 = i5 + 1;
                                long j5 = j4 ^ (((long) bArr[i5]) << 28);
                                if (j5 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    int i8 = i7 + 1;
                                    long j6 = j5 ^ (((long) bArr[i7]) << 35);
                                    if (j6 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i7 = i8 + 1;
                                        j5 = j6 ^ (((long) bArr[i8]) << 42);
                                        if (j5 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i8 = i7 + 1;
                                            j6 = j5 ^ (((long) bArr[i7]) << 49);
                                            if (j6 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                int i9 = i8 + 1;
                                                long j7 = (j6 ^ (((long) bArr[i8]) << 56)) ^ 71499008037633920L;
                                                if (j7 < 0) {
                                                    i = i9 + 1;
                                                    if (((long) bArr[i9]) < 0) {
                                                        throw C3606c0.m8178e();
                                                    }
                                                } else {
                                                    i = i9;
                                                }
                                                j = j7;
                                            }
                                        }
                                    }
                                    j = j6 ^ j2;
                                }
                                j = j5 ^ j3;
                                i = i7;
                            }
                        }
                        this.f9012c = i;
                        return j;
                    }
                    j = (long) b;
                    this.f9012c = i;
                    return j;
                }
            } else {
                throw C3606c0.m8181h();
            }
        }
    }

    public /* synthetic */ C3618f(C3619a aVar) {
    }
}
