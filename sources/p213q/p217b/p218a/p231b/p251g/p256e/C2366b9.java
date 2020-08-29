package p213q.p217b.p218a.p231b.p251g.p256e;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: q.b.a.b.g.e.b9 */
public final class C2366b9 {

    /* renamed from: a */
    public static final Logger f6339a = Logger.getLogger(C2366b9.class.getName());

    /* renamed from: b */
    public static final Unsafe f6340b = m5481a();

    /* renamed from: c */
    public static final Class<?> f6341c = C2777z4.f7007a;

    /* renamed from: d */
    public static final boolean f6342d = m5494d(Long.TYPE);

    /* renamed from: e */
    public static final boolean f6343e = m5494d(Integer.TYPE);

    /* renamed from: f */
    public static final C2369c f6344f;

    /* renamed from: g */
    public static final boolean f6345g;

    /* renamed from: h */
    public static final boolean f6346h;

    /* renamed from: i */
    public static final long f6347i = ((long) m5487b(byte[].class));

    /* renamed from: j */
    public static final boolean f6348j;

    /* renamed from: q.b.a.b.g.e.b9$a */
    public static final class C2367a extends C2369c {
        public C2367a(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final byte mo7422a(Object obj, long j) {
            if (C2366b9.f6348j) {
                return C2366b9.m5497g(obj, j);
            }
            return C2366b9.m5498h(obj, j);
        }

        /* renamed from: a */
        public final void mo7424a(Object obj, long j, double d) {
            mo7431a(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: a */
        public final void mo7425a(Object obj, long j, float f) {
            mo7430a(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: b */
        public final boolean mo7427b(Object obj, long j) {
            boolean z = true;
            if (C2366b9.f6348j) {
                if (C2366b9.m5497g(obj, j) == 0) {
                    z = false;
                }
                return z;
            }
            if (C2366b9.m5498h(obj, j) == 0) {
                z = false;
            }
            return z;
        }

        /* renamed from: c */
        public final float mo7428c(Object obj, long j) {
            return Float.intBitsToFloat(mo7432e(obj, j));
        }

        /* renamed from: d */
        public final double mo7429d(Object obj, long j) {
            return Double.longBitsToDouble(mo7433f(obj, j));
        }

        /* renamed from: a */
        public final void mo7423a(Object obj, long j, byte b) {
            if (C2366b9.f6348j) {
                C2366b9.m5482a(obj, j, b);
            } else {
                C2366b9.m5490b(obj, j, b);
            }
        }

        /* renamed from: a */
        public final void mo7426a(Object obj, long j, boolean z) {
            if (C2366b9.f6348j) {
                C2366b9.m5482a(obj, j, z ? (byte) 1 : 0);
            } else {
                C2366b9.m5490b(obj, j, z ? (byte) 1 : 0);
            }
        }
    }

    /* renamed from: q.b.a.b.g.e.b9$b */
    public static final class C2368b extends C2369c {
        public C2368b(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final byte mo7422a(Object obj, long j) {
            if (C2366b9.f6348j) {
                return C2366b9.m5497g(obj, j);
            }
            return C2366b9.m5498h(obj, j);
        }

        /* renamed from: a */
        public final void mo7424a(Object obj, long j, double d) {
            mo7431a(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: a */
        public final void mo7425a(Object obj, long j, float f) {
            mo7430a(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: b */
        public final boolean mo7427b(Object obj, long j) {
            boolean z = true;
            if (C2366b9.f6348j) {
                if (C2366b9.m5497g(obj, j) == 0) {
                    z = false;
                }
                return z;
            }
            if (C2366b9.m5498h(obj, j) == 0) {
                z = false;
            }
            return z;
        }

        /* renamed from: c */
        public final float mo7428c(Object obj, long j) {
            return Float.intBitsToFloat(mo7432e(obj, j));
        }

        /* renamed from: d */
        public final double mo7429d(Object obj, long j) {
            return Double.longBitsToDouble(mo7433f(obj, j));
        }

        /* renamed from: a */
        public final void mo7423a(Object obj, long j, byte b) {
            if (C2366b9.f6348j) {
                C2366b9.m5482a(obj, j, b);
            } else {
                C2366b9.m5490b(obj, j, b);
            }
        }

        /* renamed from: a */
        public final void mo7426a(Object obj, long j, boolean z) {
            if (C2366b9.f6348j) {
                C2366b9.m5482a(obj, j, z ? (byte) 1 : 0);
            } else {
                C2366b9.m5490b(obj, j, z ? (byte) 1 : 0);
            }
        }
    }

    /* renamed from: q.b.a.b.g.e.b9$c */
    public static abstract class C2369c {

        /* renamed from: a */
        public Unsafe f6349a;

        public C2369c(Unsafe unsafe) {
            this.f6349a = unsafe;
        }

        /* renamed from: a */
        public abstract byte mo7422a(Object obj, long j);

        /* renamed from: a */
        public abstract void mo7423a(Object obj, long j, byte b);

        /* renamed from: a */
        public abstract void mo7424a(Object obj, long j, double d);

        /* renamed from: a */
        public abstract void mo7425a(Object obj, long j, float f);

        /* renamed from: a */
        public final void mo7430a(Object obj, long j, int i) {
            this.f6349a.putInt(obj, j, i);
        }

        /* renamed from: a */
        public final void mo7431a(Object obj, long j, long j2) {
            this.f6349a.putLong(obj, j, j2);
        }

        /* renamed from: a */
        public abstract void mo7426a(Object obj, long j, boolean z);

        /* renamed from: b */
        public abstract boolean mo7427b(Object obj, long j);

        /* renamed from: c */
        public abstract float mo7428c(Object obj, long j);

        /* renamed from: d */
        public abstract double mo7429d(Object obj, long j);

        /* renamed from: e */
        public final int mo7432e(Object obj, long j) {
            return this.f6349a.getInt(obj, j);
        }

        /* renamed from: f */
        public final long mo7433f(Object obj, long j) {
            return this.f6349a.getLong(obj, j);
        }
    }

    /* renamed from: q.b.a.b.g.e.b9$d */
    public static final class C2370d extends C2369c {
        public C2370d(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final byte mo7422a(Object obj, long j) {
            return this.f6349a.getByte(obj, j);
        }

        /* renamed from: a */
        public final void mo7423a(Object obj, long j, byte b) {
            this.f6349a.putByte(obj, j, b);
        }

        /* renamed from: a */
        public final void mo7424a(Object obj, long j, double d) {
            this.f6349a.putDouble(obj, j, d);
        }

        /* renamed from: a */
        public final void mo7425a(Object obj, long j, float f) {
            this.f6349a.putFloat(obj, j, f);
        }

        /* renamed from: a */
        public final void mo7426a(Object obj, long j, boolean z) {
            this.f6349a.putBoolean(obj, j, z);
        }

        /* renamed from: b */
        public final boolean mo7427b(Object obj, long j) {
            return this.f6349a.getBoolean(obj, j);
        }

        /* renamed from: c */
        public final float mo7428c(Object obj, long j) {
            return this.f6349a.getFloat(obj, j);
        }

        /* renamed from: d */
        public final double mo7429d(Object obj, long j) {
            return this.f6349a.getDouble(obj, j);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:117:0x02e1  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02f3  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02f6  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x016c A[SYNTHETIC, Splitter:B:41:0x016c] */
    static {
        /*
            java.lang.Class<java.lang.Object[]> r1 = java.lang.Object[].class
            java.lang.Class<double[]> r2 = double[].class
            java.lang.Class<float[]> r3 = float[].class
            java.lang.Class<long[]> r4 = long[].class
            java.lang.Class<int[]> r5 = int[].class
            java.lang.Class<boolean[]> r6 = boolean[].class
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            java.lang.Class<q.b.a.b.g.e.b9> r0 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            f6339a = r0
            sun.misc.Unsafe r0 = m5481a()
            f6340b = r0
            java.lang.Class<?> r0 = p213q.p217b.p218a.p231b.p251g.p256e.C2777z4.f7007a
            f6341c = r0
            java.lang.Class r0 = java.lang.Long.TYPE
            boolean r0 = m5494d(r0)
            f6342d = r0
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r0 = m5494d(r0)
            f6343e = r0
            sun.misc.Unsafe r0 = f6340b
            r8 = 0
            if (r0 != 0) goto L_0x003a
            goto L_0x005f
        L_0x003a:
            boolean r0 = p213q.p217b.p218a.p231b.p251g.p256e.C2777z4.m6583a()
            if (r0 == 0) goto L_0x0058
            boolean r0 = f6342d
            if (r0 == 0) goto L_0x004c
            q.b.a.b.g.e.b9$a r8 = new q.b.a.b.g.e.b9$a
            sun.misc.Unsafe r0 = f6340b
            r8.<init>(r0)
            goto L_0x005f
        L_0x004c:
            boolean r0 = f6343e
            if (r0 == 0) goto L_0x005f
            q.b.a.b.g.e.b9$b r8 = new q.b.a.b.g.e.b9$b
            sun.misc.Unsafe r0 = f6340b
            r8.<init>(r0)
            goto L_0x005f
        L_0x0058:
            q.b.a.b.g.e.b9$d r8 = new q.b.a.b.g.e.b9$d
            sun.misc.Unsafe r0 = f6340b
            r8.<init>(r0)
        L_0x005f:
            f6344f = r8
            java.lang.String r0 = "copyMemory"
            sun.misc.Unsafe r8 = f6340b
            java.lang.String r10 = "putLong"
            java.lang.String r11 = "putInt"
            java.lang.String r12 = "getInt"
            java.lang.String r13 = "putByte"
            java.lang.String r14 = "getByte"
            java.lang.String r9 = "com.google.protobuf.UnsafeUtil"
            java.lang.String r15 = "platform method missing - proto runtime falling back to safer methods: "
            r16 = r1
            java.lang.String r1 = "objectFieldOffset"
            r17 = r2
            java.lang.String r2 = "getLong"
            r18 = r3
            r3 = 1
            r19 = 0
            if (r8 != 0) goto L_0x008a
            r20 = r4
        L_0x0084:
            r22 = r5
        L_0x0086:
            r0 = r19
            goto L_0x0160
        L_0x008a:
            java.lang.Class r8 = r8.getClass()     // Catch:{ all -> 0x0137 }
            r20 = r4
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ all -> 0x0135 }
            java.lang.Class<java.lang.reflect.Field> r21 = java.lang.reflect.Field.class
            r4[r19] = r21     // Catch:{ all -> 0x0135 }
            r8.getMethod(r1, r4)     // Catch:{ all -> 0x0135 }
            r4 = 2
            java.lang.Class[] r3 = new java.lang.Class[r4]     // Catch:{ all -> 0x0135 }
            r3[r19] = r7     // Catch:{ all -> 0x0135 }
            java.lang.Class r4 = java.lang.Long.TYPE     // Catch:{ all -> 0x0135 }
            r21 = 1
            r3[r21] = r4     // Catch:{ all -> 0x0135 }
            r8.getMethod(r2, r3)     // Catch:{ all -> 0x0135 }
            java.lang.reflect.Field r3 = m5489b()     // Catch:{ all -> 0x0135 }
            if (r3 != 0) goto L_0x00ae
            goto L_0x0084
        L_0x00ae:
            boolean r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2777z4.m6583a()     // Catch:{ all -> 0x0135 }
            if (r3 == 0) goto L_0x00b9
            r22 = r5
        L_0x00b6:
            r0 = 1
            goto L_0x0160
        L_0x00b9:
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ all -> 0x0135 }
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ all -> 0x0135 }
            r4[r19] = r3     // Catch:{ all -> 0x0135 }
            r8.getMethod(r14, r4)     // Catch:{ all -> 0x0135 }
            r3 = 2
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ all -> 0x0135 }
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ all -> 0x0135 }
            r4[r19] = r3     // Catch:{ all -> 0x0135 }
            java.lang.Class r3 = java.lang.Byte.TYPE     // Catch:{ all -> 0x0135 }
            r22 = r5
            r5 = 1
            r4[r5] = r3     // Catch:{ all -> 0x0133 }
            r8.getMethod(r13, r4)     // Catch:{ all -> 0x0133 }
            java.lang.Class[] r3 = new java.lang.Class[r5]     // Catch:{ all -> 0x0133 }
            java.lang.Class r4 = java.lang.Long.TYPE     // Catch:{ all -> 0x0133 }
            r3[r19] = r4     // Catch:{ all -> 0x0133 }
            r8.getMethod(r12, r3)     // Catch:{ all -> 0x0133 }
            r3 = 2
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ all -> 0x0133 }
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ all -> 0x0133 }
            r4[r19] = r3     // Catch:{ all -> 0x0133 }
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0133 }
            r5 = 1
            r4[r5] = r3     // Catch:{ all -> 0x0133 }
            r8.getMethod(r11, r4)     // Catch:{ all -> 0x0133 }
            java.lang.Class[] r3 = new java.lang.Class[r5]     // Catch:{ all -> 0x0133 }
            java.lang.Class r4 = java.lang.Long.TYPE     // Catch:{ all -> 0x0133 }
            r3[r19] = r4     // Catch:{ all -> 0x0133 }
            r8.getMethod(r2, r3)     // Catch:{ all -> 0x0133 }
            r3 = 2
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ all -> 0x0133 }
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ all -> 0x0133 }
            r4[r19] = r3     // Catch:{ all -> 0x0133 }
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ all -> 0x0133 }
            r5 = 1
            r4[r5] = r3     // Catch:{ all -> 0x0133 }
            r8.getMethod(r10, r4)     // Catch:{ all -> 0x0133 }
            r3 = 3
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ all -> 0x0133 }
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ all -> 0x0133 }
            r4[r19] = r3     // Catch:{ all -> 0x0133 }
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ all -> 0x0133 }
            r5 = 1
            r4[r5] = r3     // Catch:{ all -> 0x0133 }
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ all -> 0x0133 }
            r5 = 2
            r4[r5] = r3     // Catch:{ all -> 0x0133 }
            r8.getMethod(r0, r4)     // Catch:{ all -> 0x0133 }
            r3 = 5
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch:{ all -> 0x0133 }
            r3[r19] = r7     // Catch:{ all -> 0x0133 }
            java.lang.Class r4 = java.lang.Long.TYPE     // Catch:{ all -> 0x0133 }
            r5 = 1
            r3[r5] = r4     // Catch:{ all -> 0x0133 }
            r4 = 2
            r3[r4] = r7     // Catch:{ all -> 0x0133 }
            java.lang.Class r4 = java.lang.Long.TYPE     // Catch:{ all -> 0x0133 }
            r5 = 3
            r3[r5] = r4     // Catch:{ all -> 0x0133 }
            r4 = 4
            java.lang.Class r5 = java.lang.Long.TYPE     // Catch:{ all -> 0x0133 }
            r3[r4] = r5     // Catch:{ all -> 0x0133 }
            r8.getMethod(r0, r3)     // Catch:{ all -> 0x0133 }
            goto L_0x00b6
        L_0x0133:
            r0 = move-exception
            goto L_0x013c
        L_0x0135:
            r0 = move-exception
            goto L_0x013a
        L_0x0137:
            r0 = move-exception
            r20 = r4
        L_0x013a:
            r22 = r5
        L_0x013c:
            java.util.logging.Logger r3 = f6339a
            java.util.logging.Level r4 = java.util.logging.Level.WARNING
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r5 = r0.length()
            int r5 = r5 + 71
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r5)
            r8.append(r15)
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            java.lang.String r5 = "supportsUnsafeByteBufferOperations"
            r3.logp(r4, r9, r5, r0)
            goto L_0x0086
        L_0x0160:
            f6345g = r0
            sun.misc.Unsafe r0 = f6340b
            if (r0 != 0) goto L_0x016c
            r0 = r19
        L_0x0168:
            r21 = 1
            goto L_0x02ac
        L_0x016c:
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x0285 }
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ all -> 0x0281 }
            java.lang.Class<java.lang.reflect.Field> r5 = java.lang.reflect.Field.class
            r4[r19] = r5     // Catch:{ all -> 0x0281 }
            r0.getMethod(r1, r4)     // Catch:{ all -> 0x0281 }
            java.lang.String r1 = "arrayBaseOffset"
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ all -> 0x0281 }
            java.lang.Class<java.lang.Class> r5 = java.lang.Class.class
            r4[r19] = r5     // Catch:{ all -> 0x0281 }
            r0.getMethod(r1, r4)     // Catch:{ all -> 0x0281 }
            java.lang.String r1 = "arrayIndexScale"
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ all -> 0x0281 }
            java.lang.Class<java.lang.Class> r3 = java.lang.Class.class
            r4[r19] = r3     // Catch:{ all -> 0x0285 }
            r0.getMethod(r1, r4)     // Catch:{ all -> 0x0285 }
            r1 = 2
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ all -> 0x0285 }
            r3[r19] = r7     // Catch:{ all -> 0x0285 }
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch:{ all -> 0x0285 }
            r4 = 1
            r3[r4] = r1     // Catch:{ all -> 0x027d }
            r0.getMethod(r12, r3)     // Catch:{ all -> 0x027d }
            r1 = 3
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ all -> 0x027d }
            r3[r19] = r7     // Catch:{ all -> 0x027d }
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch:{ all -> 0x027d }
            r3[r4] = r1     // Catch:{ all -> 0x027d }
            java.lang.Class r1 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0285 }
            r4 = 2
            r3[r4] = r1     // Catch:{ all -> 0x0285 }
            r0.getMethod(r11, r3)     // Catch:{ all -> 0x0285 }
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ all -> 0x0285 }
            r1[r19] = r7     // Catch:{ all -> 0x0285 }
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ all -> 0x0285 }
            r4 = 1
            r1[r4] = r3     // Catch:{ all -> 0x027d }
            r0.getMethod(r2, r1)     // Catch:{ all -> 0x027d }
            r1 = 3
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ all -> 0x027d }
            r2[r19] = r7     // Catch:{ all -> 0x027d }
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch:{ all -> 0x027d }
            r2[r4] = r1     // Catch:{ all -> 0x027d }
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch:{ all -> 0x0285 }
            r3 = 2
            r2[r3] = r1     // Catch:{ all -> 0x0285 }
            r0.getMethod(r10, r2)     // Catch:{ all -> 0x0285 }
            java.lang.String r1 = "getObject"
            java.lang.Class[] r2 = new java.lang.Class[r3]     // Catch:{ all -> 0x0285 }
            r2[r19] = r7     // Catch:{ all -> 0x0285 }
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ all -> 0x0285 }
            r4 = 1
            r2[r4] = r3     // Catch:{ all -> 0x027d }
            r0.getMethod(r1, r2)     // Catch:{ all -> 0x0285 }
            java.lang.String r1 = "putObject"
            r2 = 3
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ all -> 0x0285 }
            r3[r19] = r7     // Catch:{ all -> 0x0285 }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x0285 }
            r4 = 1
            r3[r4] = r2     // Catch:{ all -> 0x027d }
            r2 = 2
            r3[r2] = r7     // Catch:{ all -> 0x0285 }
            r0.getMethod(r1, r3)     // Catch:{ all -> 0x0285 }
            boolean r1 = p213q.p217b.p218a.p231b.p251g.p256e.C2777z4.m6583a()     // Catch:{ all -> 0x0285 }
            if (r1 == 0) goto L_0x01f4
            r0 = 1
            goto L_0x0168
        L_0x01f4:
            java.lang.Class[] r1 = new java.lang.Class[r2]     // Catch:{ all -> 0x0285 }
            r1[r19] = r7     // Catch:{ all -> 0x0285 }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x0285 }
            r3 = 1
            r1[r3] = r2     // Catch:{ all -> 0x0281 }
            r0.getMethod(r14, r1)     // Catch:{ all -> 0x0281 }
            r1 = 3
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ all -> 0x0281 }
            r2[r19] = r7     // Catch:{ all -> 0x0281 }
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch:{ all -> 0x0281 }
            r2[r3] = r1     // Catch:{ all -> 0x0281 }
            java.lang.Class r1 = java.lang.Byte.TYPE     // Catch:{ all -> 0x0285 }
            r3 = 2
            r2[r3] = r1     // Catch:{ all -> 0x0285 }
            r0.getMethod(r13, r2)     // Catch:{ all -> 0x0285 }
            java.lang.String r1 = "getBoolean"
            java.lang.Class[] r2 = new java.lang.Class[r3]     // Catch:{ all -> 0x0285 }
            r2[r19] = r7     // Catch:{ all -> 0x0285 }
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ all -> 0x0285 }
            r4 = 1
            r2[r4] = r3     // Catch:{ all -> 0x027d }
            r0.getMethod(r1, r2)     // Catch:{ all -> 0x0285 }
            java.lang.String r1 = "putBoolean"
            r2 = 3
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ all -> 0x0285 }
            r3[r19] = r7     // Catch:{ all -> 0x0285 }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x0285 }
            r4 = 1
            r3[r4] = r2     // Catch:{ all -> 0x027d }
            java.lang.Class r2 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0285 }
            r4 = 2
            r3[r4] = r2     // Catch:{ all -> 0x0285 }
            r0.getMethod(r1, r3)     // Catch:{ all -> 0x0285 }
            java.lang.String r1 = "getFloat"
            java.lang.Class[] r2 = new java.lang.Class[r4]     // Catch:{ all -> 0x0285 }
            r2[r19] = r7     // Catch:{ all -> 0x0285 }
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ all -> 0x0285 }
            r4 = 1
            r2[r4] = r3     // Catch:{ all -> 0x027d }
            r0.getMethod(r1, r2)     // Catch:{ all -> 0x0285 }
            java.lang.String r1 = "putFloat"
            r2 = 3
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ all -> 0x0285 }
            r3[r19] = r7     // Catch:{ all -> 0x0285 }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x0285 }
            r4 = 1
            r3[r4] = r2     // Catch:{ all -> 0x027d }
            java.lang.Class r2 = java.lang.Float.TYPE     // Catch:{ all -> 0x0285 }
            r4 = 2
            r3[r4] = r2     // Catch:{ all -> 0x0285 }
            r0.getMethod(r1, r3)     // Catch:{ all -> 0x0285 }
            java.lang.String r1 = "getDouble"
            java.lang.Class[] r2 = new java.lang.Class[r4]     // Catch:{ all -> 0x0285 }
            r2[r19] = r7     // Catch:{ all -> 0x0285 }
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ all -> 0x0285 }
            r4 = 1
            r2[r4] = r3     // Catch:{ all -> 0x027d }
            r0.getMethod(r1, r2)     // Catch:{ all -> 0x0285 }
            java.lang.String r1 = "putDouble"
            r2 = 3
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch:{ all -> 0x0285 }
            r2[r19] = r7     // Catch:{ all -> 0x0285 }
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ all -> 0x0285 }
            r21 = 1
            r2[r21] = r3     // Catch:{ all -> 0x027b }
            java.lang.Class r3 = java.lang.Double.TYPE     // Catch:{ all -> 0x027b }
            r4 = 2
            r2[r4] = r3     // Catch:{ all -> 0x027b }
            r0.getMethod(r1, r2)     // Catch:{ all -> 0x027b }
            r0 = r21
            goto L_0x02ac
        L_0x027b:
            r0 = move-exception
            goto L_0x0288
        L_0x027d:
            r0 = move-exception
            r21 = r4
            goto L_0x0288
        L_0x0281:
            r0 = move-exception
            r21 = r3
            goto L_0x0288
        L_0x0285:
            r0 = move-exception
            r21 = 1
        L_0x0288:
            java.util.logging.Logger r1 = f6339a
            java.util.logging.Level r2 = java.util.logging.Level.WARNING
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r3 = r0.length()
            int r3 = r3 + 71
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r4.append(r15)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            java.lang.String r3 = "supportsUnsafeArrayOperations"
            r1.logp(r2, r9, r3, r0)
            r0 = r19
        L_0x02ac:
            f6346h = r0
            java.lang.Class<byte[]> r0 = byte[].class
            int r0 = m5487b(r0)
            long r0 = (long) r0
            f6347i = r0
            m5487b(r6)
            m5491c(r6)
            m5487b(r22)
            m5491c(r22)
            m5487b(r20)
            m5491c(r20)
            m5487b(r18)
            m5491c(r18)
            m5487b(r17)
            m5491c(r17)
            m5487b(r16)
            m5491c(r16)
            java.lang.reflect.Field r0 = m5489b()
            if (r0 == 0) goto L_0x02eb
            q.b.a.b.g.e.b9$c r1 = f6344f
            if (r1 != 0) goto L_0x02e6
            goto L_0x02eb
        L_0x02e6:
            sun.misc.Unsafe r1 = r1.f6349a
            r1.objectFieldOffset(r0)
        L_0x02eb:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x02f6
            r3 = r21
            goto L_0x02f8
        L_0x02f6:
            r3 = r19
        L_0x02f8:
            f6348j = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.<clinit>():void");
    }

    /* renamed from: a */
    public static byte m5478a(byte[] bArr, long j) {
        return f6344f.mo7422a(bArr, f6347i + j);
    }

    /* renamed from: a */
    public static int m5479a(Object obj, long j) {
        return f6344f.mo7432e(obj, j);
    }

    /* renamed from: a */
    public static <T> T m5480a(Class<T> cls) {
        try {
            return f6340b.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: a */
    public static Unsafe m5481a() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C2781z8());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m5482a(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = ((~((int) j)) & 3) << 3;
        int i2 = (255 & b) << i;
        f6344f.mo7430a(obj, j2, i2 | (m5479a(obj, j2) & (~(255 << i))));
    }

    /* renamed from: a */
    public static void m5483a(Object obj, long j, double d) {
        f6344f.mo7424a(obj, j, d);
    }

    /* renamed from: a */
    public static void m5484a(Object obj, long j, long j2) {
        f6344f.mo7431a(obj, j, j2);
    }

    /* renamed from: a */
    public static void m5485a(Object obj, long j, Object obj2) {
        f6344f.f6349a.putObject(obj, j, obj2);
    }

    /* renamed from: a */
    public static void m5486a(byte[] bArr, long j, byte b) {
        f6344f.mo7423a((Object) bArr, f6347i + j, b);
    }

    /* renamed from: b */
    public static int m5487b(Class<?> cls) {
        if (f6346h) {
            return f6344f.f6349a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* renamed from: b */
    public static long m5488b(Object obj, long j) {
        return f6344f.mo7433f(obj, j);
    }

    /* renamed from: b */
    public static void m5490b(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        f6344f.mo7430a(obj, j2, ((255 & b) << i) | (m5479a(obj, j2) & (~(255 << i))));
    }

    /* renamed from: c */
    public static int m5491c(Class<?> cls) {
        if (f6346h) {
            return f6344f.f6349a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* renamed from: c */
    public static boolean m5492c(Object obj, long j) {
        return f6344f.mo7427b(obj, j);
    }

    /* renamed from: d */
    public static float m5493d(Object obj, long j) {
        return f6344f.mo7428c(obj, j);
    }

    /* renamed from: d */
    public static boolean m5494d(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!C2777z4.m6583a()) {
            return false;
        }
        try {
            Class<?> cls3 = f6341c;
            cls3.getMethod("peekLong", new Class[]{cls, Boolean.TYPE});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, Boolean.TYPE});
            cls3.getMethod("pokeInt", new Class[]{cls, Integer.TYPE, Boolean.TYPE});
            cls3.getMethod("peekInt", new Class[]{cls, Boolean.TYPE});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, Integer.TYPE, Integer.TYPE});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, Integer.TYPE, Integer.TYPE});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: e */
    public static double m5495e(Object obj, long j) {
        return f6344f.mo7429d(obj, j);
    }

    /* renamed from: f */
    public static Object m5496f(Object obj, long j) {
        return f6344f.f6349a.getObject(obj, j);
    }

    /* renamed from: g */
    public static byte m5497g(Object obj, long j) {
        return (byte) (m5479a(obj, -4 & j) >>> ((int) (((~j) & 3) << 3)));
    }

    /* renamed from: h */
    public static byte m5498h(Object obj, long j) {
        return (byte) (m5479a(obj, -4 & j) >>> ((int) ((j & 3) << 3)));
    }

    /* renamed from: b */
    public static Field m5489b() {
        Field field;
        Field field2;
        if (C2777z4.m6583a()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }
}
