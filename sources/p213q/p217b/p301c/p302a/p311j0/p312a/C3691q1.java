package p213q.p217b.p301c.p302a.p311j0.p312a;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: q.b.c.a.j0.a.q1 */
public final class C3691q1 {

    /* renamed from: a */
    public static final Logger f9135a = Logger.getLogger(C3691q1.class.getName());

    /* renamed from: b */
    public static final Unsafe f9136b = m8819b();

    /* renamed from: c */
    public static final Class<?> f9137c = C3609d.f8981a;

    /* renamed from: d */
    public static final boolean f9138d = m8824d(Long.TYPE);

    /* renamed from: e */
    public static final boolean f9139e = m8824d(Integer.TYPE);

    /* renamed from: f */
    public static final C3696e f9140f;

    /* renamed from: g */
    public static final boolean f9141g;

    /* renamed from: h */
    public static final boolean f9142h;

    /* renamed from: i */
    public static final long f9143i = ((long) m8818b(byte[].class));

    /* renamed from: j */
    public static final long f9144j;

    /* renamed from: k */
    public static final boolean f9145k;

    /* renamed from: q.b.c.a.j0.a.q1$a */
    public class C3692a implements PrivilegedExceptionAction<Unsafe> {
        public Unsafe run() {
            Field[] declaredFields;
            Class<Unsafe> cls = Unsafe.class;
            for (Field field : cls.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (cls.isInstance(obj)) {
                    return (Unsafe) cls.cast(obj);
                }
            }
            return null;
        }
    }

    /* renamed from: q.b.c.a.j0.a.q1$b */
    public static final class C3693b extends C3696e {
        public C3693b(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public byte mo9891a(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public void mo9892a(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public void mo9894a(Object obj, long j, double d) {
            mo9904a(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: a */
        public void mo9895a(Object obj, long j, float f) {
            mo9903a(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: a */
        public boolean mo9897a(Object obj, long j) {
            boolean z = true;
            if (C3691q1.f9145k) {
                if (C3691q1.m8817b(obj, j) == 0) {
                    z = false;
                }
                return z;
            }
            if (C3691q1.m8821c(obj, j) == 0) {
                z = false;
            }
            return z;
        }

        /* renamed from: b */
        public byte mo9898b(Object obj, long j) {
            if (C3691q1.f9145k) {
                return C3691q1.m8817b(obj, j);
            }
            return C3691q1.m8821c(obj, j);
        }

        /* renamed from: c */
        public double mo9899c(Object obj, long j) {
            return Double.longBitsToDouble(mo9908f(obj, j));
        }

        /* renamed from: d */
        public float mo9900d(Object obj, long j) {
            return Float.intBitsToFloat(mo9907e(obj, j));
        }

        /* renamed from: a */
        public void mo9896a(Object obj, long j, boolean z) {
            if (C3691q1.f9145k) {
                C3691q1.m8808a(obj, j, z ? (byte) 1 : 0);
            } else {
                C3691q1.m8820b(obj, j, z ? (byte) 1 : 0);
            }
        }

        /* renamed from: a */
        public void mo9893a(Object obj, long j, byte b) {
            if (C3691q1.f9145k) {
                C3691q1.m8808a(obj, j, b);
            } else {
                C3691q1.m8820b(obj, j, b);
            }
        }
    }

    /* renamed from: q.b.c.a.j0.a.q1$c */
    public static final class C3694c extends C3696e {
        public C3694c(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public byte mo9891a(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public void mo9892a(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public void mo9894a(Object obj, long j, double d) {
            mo9904a(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: a */
        public void mo9895a(Object obj, long j, float f) {
            mo9903a(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: a */
        public boolean mo9897a(Object obj, long j) {
            boolean z = true;
            if (C3691q1.f9145k) {
                if (C3691q1.m8817b(obj, j) == 0) {
                    z = false;
                }
                return z;
            }
            if (C3691q1.m8821c(obj, j) == 0) {
                z = false;
            }
            return z;
        }

        /* renamed from: b */
        public byte mo9898b(Object obj, long j) {
            if (C3691q1.f9145k) {
                return C3691q1.m8817b(obj, j);
            }
            return C3691q1.m8821c(obj, j);
        }

        /* renamed from: c */
        public double mo9899c(Object obj, long j) {
            return Double.longBitsToDouble(mo9908f(obj, j));
        }

        /* renamed from: d */
        public float mo9900d(Object obj, long j) {
            return Float.intBitsToFloat(mo9907e(obj, j));
        }

        /* renamed from: a */
        public void mo9896a(Object obj, long j, boolean z) {
            if (C3691q1.f9145k) {
                C3691q1.m8808a(obj, j, z ? (byte) 1 : 0);
            } else {
                C3691q1.m8820b(obj, j, z ? (byte) 1 : 0);
            }
        }

        /* renamed from: a */
        public void mo9893a(Object obj, long j, byte b) {
            if (C3691q1.f9145k) {
                C3691q1.m8808a(obj, j, b);
            } else {
                C3691q1.m8820b(obj, j, b);
            }
        }
    }

    /* renamed from: q.b.c.a.j0.a.q1$d */
    public static final class C3695d extends C3696e {
        public C3695d(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public byte mo9891a(long j) {
            return this.f9146a.getByte(j);
        }

        /* renamed from: a */
        public void mo9892a(long j, byte[] bArr, long j2, long j3) {
            this.f9146a.copyMemory(null, j, bArr, C3691q1.f9143i + j2, j3);
        }

        /* renamed from: a */
        public void mo9893a(Object obj, long j, byte b) {
            this.f9146a.putByte(obj, j, b);
        }

        /* renamed from: a */
        public void mo9894a(Object obj, long j, double d) {
            this.f9146a.putDouble(obj, j, d);
        }

        /* renamed from: a */
        public void mo9895a(Object obj, long j, float f) {
            this.f9146a.putFloat(obj, j, f);
        }

        /* renamed from: a */
        public void mo9896a(Object obj, long j, boolean z) {
            this.f9146a.putBoolean(obj, j, z);
        }

        /* renamed from: a */
        public boolean mo9897a(Object obj, long j) {
            return this.f9146a.getBoolean(obj, j);
        }

        /* renamed from: b */
        public byte mo9898b(Object obj, long j) {
            return this.f9146a.getByte(obj, j);
        }

        /* renamed from: c */
        public double mo9899c(Object obj, long j) {
            return this.f9146a.getDouble(obj, j);
        }

        /* renamed from: d */
        public float mo9900d(Object obj, long j) {
            return this.f9146a.getFloat(obj, j);
        }
    }

    /* renamed from: q.b.c.a.j0.a.q1$e */
    public static abstract class C3696e {

        /* renamed from: a */
        public Unsafe f9146a;

        public C3696e(Unsafe unsafe) {
            this.f9146a = unsafe;
        }

        /* renamed from: a */
        public abstract byte mo9891a(long j);

        /* renamed from: a */
        public final int mo9901a(Class<?> cls) {
            return this.f9146a.arrayBaseOffset(cls);
        }

        /* renamed from: a */
        public final long mo9902a(Field field) {
            return this.f9146a.objectFieldOffset(field);
        }

        /* renamed from: a */
        public abstract void mo9892a(long j, byte[] bArr, long j2, long j3);

        /* renamed from: a */
        public abstract void mo9893a(Object obj, long j, byte b);

        /* renamed from: a */
        public abstract void mo9894a(Object obj, long j, double d);

        /* renamed from: a */
        public abstract void mo9895a(Object obj, long j, float f);

        /* renamed from: a */
        public final void mo9903a(Object obj, long j, int i) {
            this.f9146a.putInt(obj, j, i);
        }

        /* renamed from: a */
        public final void mo9904a(Object obj, long j, long j2) {
            this.f9146a.putLong(obj, j, j2);
        }

        /* renamed from: a */
        public final void mo9905a(Object obj, long j, Object obj2) {
            this.f9146a.putObject(obj, j, obj2);
        }

        /* renamed from: a */
        public abstract void mo9896a(Object obj, long j, boolean z);

        /* renamed from: a */
        public abstract boolean mo9897a(Object obj, long j);

        /* renamed from: b */
        public abstract byte mo9898b(Object obj, long j);

        /* renamed from: b */
        public final int mo9906b(Class<?> cls) {
            return this.f9146a.arrayIndexScale(cls);
        }

        /* renamed from: c */
        public abstract double mo9899c(Object obj, long j);

        /* renamed from: d */
        public abstract float mo9900d(Object obj, long j);

        /* renamed from: e */
        public final int mo9907e(Object obj, long j) {
            return this.f9146a.getInt(obj, j);
        }

        /* renamed from: f */
        public final long mo9908f(Object obj, long j) {
            return this.f9146a.getLong(obj, j);
        }

        /* renamed from: g */
        public final Object mo9909g(Object obj, long j) {
            return this.f9146a.getObject(obj, j);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:119:0x02c9  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02e2  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x015c A[SYNTHETIC, Splitter:B:41:0x015c] */
    static {
        /*
            java.lang.Class<java.lang.Object[]> r1 = java.lang.Object[].class
            java.lang.Class<double[]> r2 = double[].class
            java.lang.Class<float[]> r3 = float[].class
            java.lang.Class<long[]> r4 = long[].class
            java.lang.Class<int[]> r5 = int[].class
            java.lang.Class<boolean[]> r6 = boolean[].class
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            java.lang.Class<q.b.c.a.j0.a.q1> r0 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            f9135a = r0
            sun.misc.Unsafe r0 = m8819b()
            f9136b = r0
            java.lang.Class<?> r0 = p213q.p217b.p301c.p302a.p311j0.p312a.C3609d.f8981a
            f9137c = r0
            java.lang.Class r0 = java.lang.Long.TYPE
            boolean r0 = m8824d(r0)
            f9138d = r0
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r0 = m8824d(r0)
            f9139e = r0
            sun.misc.Unsafe r0 = f9136b
            r8 = 0
            if (r0 != 0) goto L_0x003a
            goto L_0x005f
        L_0x003a:
            boolean r0 = p213q.p217b.p301c.p302a.p311j0.p312a.C3609d.m8184a()
            if (r0 == 0) goto L_0x0058
            boolean r0 = f9138d
            if (r0 == 0) goto L_0x004c
            q.b.c.a.j0.a.q1$c r8 = new q.b.c.a.j0.a.q1$c
            sun.misc.Unsafe r0 = f9136b
            r8.<init>(r0)
            goto L_0x005f
        L_0x004c:
            boolean r0 = f9139e
            if (r0 == 0) goto L_0x005f
            q.b.c.a.j0.a.q1$b r8 = new q.b.c.a.j0.a.q1$b
            sun.misc.Unsafe r0 = f9136b
            r8.<init>(r0)
            goto L_0x005f
        L_0x0058:
            q.b.c.a.j0.a.q1$d r8 = new q.b.c.a.j0.a.q1$d
            sun.misc.Unsafe r0 = f9136b
            r8.<init>(r0)
        L_0x005f:
            f9140f = r8
            java.lang.String r0 = "copyMemory"
            sun.misc.Unsafe r8 = f9136b
            java.lang.String r10 = "putLong"
            java.lang.String r11 = "putInt"
            java.lang.String r12 = "getInt"
            java.lang.String r13 = "putByte"
            java.lang.String r14 = "getByte"
            java.lang.String r9 = "platform method missing - proto runtime falling back to safer methods: "
            java.lang.String r15 = "objectFieldOffset"
            r16 = r1
            java.lang.String r1 = "getLong"
            r17 = r2
            r2 = 1
            r18 = 0
            if (r8 != 0) goto L_0x0086
            r19 = r3
        L_0x0080:
            r21 = r4
        L_0x0082:
            r0 = r18
            goto L_0x0150
        L_0x0086:
            java.lang.Class r8 = r8.getClass()     // Catch:{ all -> 0x0133 }
            r19 = r3
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ all -> 0x0131 }
            java.lang.Class<java.lang.reflect.Field> r20 = java.lang.reflect.Field.class
            r3[r18] = r20     // Catch:{ all -> 0x0131 }
            r8.getMethod(r15, r3)     // Catch:{ all -> 0x0131 }
            r3 = 2
            java.lang.Class[] r2 = new java.lang.Class[r3]     // Catch:{ all -> 0x0131 }
            r2[r18] = r7     // Catch:{ all -> 0x0131 }
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ all -> 0x0131 }
            r20 = 1
            r2[r20] = r3     // Catch:{ all -> 0x0131 }
            r8.getMethod(r1, r2)     // Catch:{ all -> 0x0131 }
            java.lang.reflect.Field r2 = m8807a()     // Catch:{ all -> 0x0131 }
            if (r2 != 0) goto L_0x00aa
            goto L_0x0080
        L_0x00aa:
            boolean r2 = p213q.p217b.p301c.p302a.p311j0.p312a.C3609d.m8184a()     // Catch:{ all -> 0x0131 }
            if (r2 == 0) goto L_0x00b5
            r21 = r4
        L_0x00b2:
            r0 = 1
            goto L_0x0150
        L_0x00b5:
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ all -> 0x0131 }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x0131 }
            r3[r18] = r2     // Catch:{ all -> 0x0131 }
            r8.getMethod(r14, r3)     // Catch:{ all -> 0x0131 }
            r2 = 2
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ all -> 0x0131 }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x0131 }
            r3[r18] = r2     // Catch:{ all -> 0x0131 }
            java.lang.Class r2 = java.lang.Byte.TYPE     // Catch:{ all -> 0x0131 }
            r21 = r4
            r4 = 1
            r3[r4] = r2     // Catch:{ all -> 0x012f }
            r8.getMethod(r13, r3)     // Catch:{ all -> 0x012f }
            java.lang.Class[] r2 = new java.lang.Class[r4]     // Catch:{ all -> 0x012f }
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ all -> 0x012f }
            r2[r18] = r3     // Catch:{ all -> 0x012f }
            r8.getMethod(r12, r2)     // Catch:{ all -> 0x012f }
            r2 = 2
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ all -> 0x012f }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x012f }
            r3[r18] = r2     // Catch:{ all -> 0x012f }
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch:{ all -> 0x012f }
            r4 = 1
            r3[r4] = r2     // Catch:{ all -> 0x012f }
            r8.getMethod(r11, r3)     // Catch:{ all -> 0x012f }
            java.lang.Class[] r2 = new java.lang.Class[r4]     // Catch:{ all -> 0x012f }
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ all -> 0x012f }
            r2[r18] = r3     // Catch:{ all -> 0x012f }
            r8.getMethod(r1, r2)     // Catch:{ all -> 0x012f }
            r2 = 2
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ all -> 0x012f }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x012f }
            r3[r18] = r2     // Catch:{ all -> 0x012f }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x012f }
            r4 = 1
            r3[r4] = r2     // Catch:{ all -> 0x012f }
            r8.getMethod(r10, r3)     // Catch:{ all -> 0x012f }
            r2 = 3
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ all -> 0x012f }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x012f }
            r3[r18] = r2     // Catch:{ all -> 0x012f }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x012f }
            r4 = 1
            r3[r4] = r2     // Catch:{ all -> 0x012f }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x012f }
            r4 = 2
            r3[r4] = r2     // Catch:{ all -> 0x012f }
            r8.getMethod(r0, r3)     // Catch:{ all -> 0x012f }
            r2 = 5
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch:{ all -> 0x012f }
            r2[r18] = r7     // Catch:{ all -> 0x012f }
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ all -> 0x012f }
            r4 = 1
            r2[r4] = r3     // Catch:{ all -> 0x012f }
            r3 = 2
            r2[r3] = r7     // Catch:{ all -> 0x012f }
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ all -> 0x012f }
            r4 = 3
            r2[r4] = r3     // Catch:{ all -> 0x012f }
            r3 = 4
            java.lang.Class r4 = java.lang.Long.TYPE     // Catch:{ all -> 0x012f }
            r2[r3] = r4     // Catch:{ all -> 0x012f }
            r8.getMethod(r0, r2)     // Catch:{ all -> 0x012f }
            goto L_0x00b2
        L_0x012f:
            r0 = move-exception
            goto L_0x0138
        L_0x0131:
            r0 = move-exception
            goto L_0x0136
        L_0x0133:
            r0 = move-exception
            r19 = r3
        L_0x0136:
            r21 = r4
        L_0x0138:
            java.util.logging.Logger r2 = f9135a
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r9)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r2.log(r3, r0)
            goto L_0x0082
        L_0x0150:
            f9141g = r0
            sun.misc.Unsafe r0 = f9136b
            if (r0 != 0) goto L_0x015c
            r0 = r18
        L_0x0158:
            r20 = 1
            goto L_0x0294
        L_0x015c:
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x0279 }
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ all -> 0x0275 }
            java.lang.Class<java.lang.reflect.Field> r4 = java.lang.reflect.Field.class
            r3[r18] = r4     // Catch:{ all -> 0x0275 }
            r0.getMethod(r15, r3)     // Catch:{ all -> 0x0275 }
            java.lang.String r3 = "arrayBaseOffset"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch:{ all -> 0x0275 }
            java.lang.Class<java.lang.Class> r8 = java.lang.Class.class
            r4[r18] = r8     // Catch:{ all -> 0x0275 }
            r0.getMethod(r3, r4)     // Catch:{ all -> 0x0275 }
            java.lang.String r3 = "arrayIndexScale"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch:{ all -> 0x0275 }
            java.lang.Class<java.lang.Class> r2 = java.lang.Class.class
            r4[r18] = r2     // Catch:{ all -> 0x0279 }
            r0.getMethod(r3, r4)     // Catch:{ all -> 0x0279 }
            r2 = 2
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ all -> 0x0279 }
            r3[r18] = r7     // Catch:{ all -> 0x0279 }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x0279 }
            r4 = 1
            r3[r4] = r2     // Catch:{ all -> 0x0271 }
            r0.getMethod(r12, r3)     // Catch:{ all -> 0x0271 }
            r2 = 3
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ all -> 0x0271 }
            r3[r18] = r7     // Catch:{ all -> 0x0271 }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x0271 }
            r3[r4] = r2     // Catch:{ all -> 0x0271 }
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0279 }
            r4 = 2
            r3[r4] = r2     // Catch:{ all -> 0x0279 }
            r0.getMethod(r11, r3)     // Catch:{ all -> 0x0279 }
            java.lang.Class[] r2 = new java.lang.Class[r4]     // Catch:{ all -> 0x0279 }
            r2[r18] = r7     // Catch:{ all -> 0x0279 }
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ all -> 0x0279 }
            r4 = 1
            r2[r4] = r3     // Catch:{ all -> 0x0271 }
            r0.getMethod(r1, r2)     // Catch:{ all -> 0x0271 }
            r1 = 3
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ all -> 0x0271 }
            r2[r18] = r7     // Catch:{ all -> 0x0271 }
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch:{ all -> 0x0271 }
            r2[r4] = r1     // Catch:{ all -> 0x0271 }
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch:{ all -> 0x0279 }
            r3 = 2
            r2[r3] = r1     // Catch:{ all -> 0x0279 }
            r0.getMethod(r10, r2)     // Catch:{ all -> 0x0279 }
            java.lang.String r1 = "getObject"
            java.lang.Class[] r2 = new java.lang.Class[r3]     // Catch:{ all -> 0x0279 }
            r2[r18] = r7     // Catch:{ all -> 0x0279 }
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ all -> 0x0279 }
            r4 = 1
            r2[r4] = r3     // Catch:{ all -> 0x0271 }
            r0.getMethod(r1, r2)     // Catch:{ all -> 0x0279 }
            java.lang.String r1 = "putObject"
            r2 = 3
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ all -> 0x0279 }
            r3[r18] = r7     // Catch:{ all -> 0x0279 }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x0279 }
            r4 = 1
            r3[r4] = r2     // Catch:{ all -> 0x0271 }
            r2 = 2
            r3[r2] = r7     // Catch:{ all -> 0x0279 }
            r0.getMethod(r1, r3)     // Catch:{ all -> 0x0279 }
            boolean r1 = p213q.p217b.p301c.p302a.p311j0.p312a.C3609d.m8184a()     // Catch:{ all -> 0x0279 }
            if (r1 == 0) goto L_0x01e4
            r0 = 1
            goto L_0x0158
        L_0x01e4:
            java.lang.Class[] r1 = new java.lang.Class[r2]     // Catch:{ all -> 0x0279 }
            r1[r18] = r7     // Catch:{ all -> 0x0279 }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x0279 }
            r3 = 1
            r1[r3] = r2     // Catch:{ all -> 0x026d }
            r0.getMethod(r14, r1)     // Catch:{ all -> 0x026d }
            r1 = 3
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ all -> 0x026d }
            r2[r18] = r7     // Catch:{ all -> 0x026d }
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch:{ all -> 0x026d }
            r2[r3] = r1     // Catch:{ all -> 0x026d }
            java.lang.Class r1 = java.lang.Byte.TYPE     // Catch:{ all -> 0x0279 }
            r3 = 2
            r2[r3] = r1     // Catch:{ all -> 0x0279 }
            r0.getMethod(r13, r2)     // Catch:{ all -> 0x0279 }
            java.lang.String r1 = "getBoolean"
            java.lang.Class[] r2 = new java.lang.Class[r3]     // Catch:{ all -> 0x0279 }
            r2[r18] = r7     // Catch:{ all -> 0x0279 }
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ all -> 0x0279 }
            r4 = 1
            r2[r4] = r3     // Catch:{ all -> 0x0271 }
            r0.getMethod(r1, r2)     // Catch:{ all -> 0x0279 }
            java.lang.String r1 = "putBoolean"
            r2 = 3
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ all -> 0x0279 }
            r3[r18] = r7     // Catch:{ all -> 0x0279 }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x0279 }
            r4 = 1
            r3[r4] = r2     // Catch:{ all -> 0x0271 }
            java.lang.Class r2 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0279 }
            r4 = 2
            r3[r4] = r2     // Catch:{ all -> 0x0279 }
            r0.getMethod(r1, r3)     // Catch:{ all -> 0x0279 }
            java.lang.String r1 = "getFloat"
            java.lang.Class[] r2 = new java.lang.Class[r4]     // Catch:{ all -> 0x0279 }
            r2[r18] = r7     // Catch:{ all -> 0x0279 }
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ all -> 0x0279 }
            r4 = 1
            r2[r4] = r3     // Catch:{ all -> 0x0271 }
            r0.getMethod(r1, r2)     // Catch:{ all -> 0x0279 }
            java.lang.String r1 = "putFloat"
            r2 = 3
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ all -> 0x0279 }
            r3[r18] = r7     // Catch:{ all -> 0x0279 }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x0279 }
            r4 = 1
            r3[r4] = r2     // Catch:{ all -> 0x0271 }
            java.lang.Class r2 = java.lang.Float.TYPE     // Catch:{ all -> 0x0279 }
            r4 = 2
            r3[r4] = r2     // Catch:{ all -> 0x0279 }
            r0.getMethod(r1, r3)     // Catch:{ all -> 0x0279 }
            java.lang.String r1 = "getDouble"
            java.lang.Class[] r2 = new java.lang.Class[r4]     // Catch:{ all -> 0x0279 }
            r2[r18] = r7     // Catch:{ all -> 0x0279 }
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ all -> 0x0279 }
            r4 = 1
            r2[r4] = r3     // Catch:{ all -> 0x0271 }
            r0.getMethod(r1, r2)     // Catch:{ all -> 0x0279 }
            java.lang.String r1 = "putDouble"
            r2 = 3
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch:{ all -> 0x0279 }
            r2[r18] = r7     // Catch:{ all -> 0x0279 }
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ all -> 0x0279 }
            r20 = 1
            r2[r20] = r3     // Catch:{ all -> 0x026b }
            java.lang.Class r3 = java.lang.Double.TYPE     // Catch:{ all -> 0x026b }
            r4 = 2
            r2[r4] = r3     // Catch:{ all -> 0x026b }
            r0.getMethod(r1, r2)     // Catch:{ all -> 0x026b }
            r0 = r20
            goto L_0x0294
        L_0x026b:
            r0 = move-exception
            goto L_0x027c
        L_0x026d:
            r0 = move-exception
            r20 = r3
            goto L_0x027c
        L_0x0271:
            r0 = move-exception
            r20 = r4
            goto L_0x027c
        L_0x0275:
            r0 = move-exception
            r20 = r2
            goto L_0x027c
        L_0x0279:
            r0 = move-exception
            r20 = 1
        L_0x027c:
            java.util.logging.Logger r1 = f9135a
            java.util.logging.Level r2 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.log(r2, r0)
            r0 = r18
        L_0x0294:
            f9142h = r0
            java.lang.Class<byte[]> r0 = byte[].class
            int r0 = m8818b(r0)
            long r0 = (long) r0
            f9143i = r0
            m8818b(r6)
            m8822c(r6)
            m8818b(r5)
            m8822c(r5)
            m8818b(r21)
            m8822c(r21)
            m8818b(r19)
            m8822c(r19)
            m8818b(r17)
            m8822c(r17)
            m8818b(r16)
            m8822c(r16)
            java.lang.reflect.Field r0 = m8807a()
            if (r0 == 0) goto L_0x02d3
            q.b.c.a.j0.a.q1$e r1 = f9140f
            if (r1 != 0) goto L_0x02ce
            goto L_0x02d3
        L_0x02ce:
            long r0 = r1.mo9902a(r0)
            goto L_0x02d5
        L_0x02d3:
            r0 = -1
        L_0x02d5:
            f9144j = r0
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x02e2
            r2 = r20
            goto L_0x02e4
        L_0x02e2:
            r2 = r18
        L_0x02e4:
            f9145k = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.<clinit>():void");
    }

    /* renamed from: a */
    public static byte m8803a(long j) {
        return f9140f.mo9891a(j);
    }

    /* renamed from: a */
    public static byte m8804a(byte[] bArr, long j) {
        return f9140f.mo9898b(bArr, f9143i + j);
    }

    /* renamed from: a */
    public static long m8805a(ByteBuffer byteBuffer) {
        return f9140f.mo9908f(byteBuffer, f9144j);
    }

    /* renamed from: a */
    public static <T> T m8806a(Class<T> cls) {
        try {
            return f9136b.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: a */
    public static Field m8807a() {
        Field field;
        Field field2;
        Field field3 = null;
        if (C3609d.m8184a()) {
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
        if (field != null && field.getType() == Long.TYPE) {
            field3 = field;
        }
        return field3;
    }

    /* renamed from: a */
    public static void m8809a(Object obj, long j, double d) {
        f9140f.mo9894a(obj, j, d);
    }

    /* renamed from: a */
    public static void m8810a(Object obj, long j, float f) {
        f9140f.mo9895a(obj, j, f);
    }

    /* renamed from: a */
    public static void m8811a(Object obj, long j, int i) {
        f9140f.mo9903a(obj, j, i);
    }

    /* renamed from: a */
    public static void m8812a(Object obj, long j, long j2) {
        f9140f.mo9904a(obj, j, j2);
    }

    /* renamed from: a */
    public static void m8813a(Object obj, long j, Object obj2) {
        f9140f.mo9905a(obj, j, obj2);
    }

    /* renamed from: a */
    public static void m8814a(Object obj, long j, boolean z) {
        f9140f.mo9896a(obj, j, z);
    }

    /* renamed from: a */
    public static void m8815a(byte[] bArr, long j, byte b) {
        f9140f.mo9893a((Object) bArr, f9143i + j, b);
    }

    /* renamed from: a */
    public static boolean m8816a(Object obj, long j) {
        return f9140f.mo9897a(obj, j);
    }

    /* renamed from: b */
    public static byte m8817b(Object obj, long j) {
        return (byte) ((m8826f(obj, -4 & j) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    /* renamed from: b */
    public static int m8818b(Class<?> cls) {
        if (f9142h) {
            return f9140f.mo9901a(cls);
        }
        return -1;
    }

    /* renamed from: b */
    public static Unsafe m8819b() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C3692a());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static void m8820b(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        f9140f.mo9903a(obj, j2, ((255 & b) << i) | (m8826f(obj, j2) & (~(255 << i))));
    }

    /* renamed from: c */
    public static byte m8821c(Object obj, long j) {
        return (byte) ((m8826f(obj, -4 & j) >>> ((int) ((j & 3) << 3))) & 255);
    }

    /* renamed from: c */
    public static int m8822c(Class<?> cls) {
        if (f9142h) {
            return f9140f.mo9906b(cls);
        }
        return -1;
    }

    /* renamed from: d */
    public static double m8823d(Object obj, long j) {
        return f9140f.mo9899c(obj, j);
    }

    /* renamed from: d */
    public static boolean m8824d(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!C3609d.m8184a()) {
            return false;
        }
        try {
            Class<?> cls3 = f9137c;
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
    public static float m8825e(Object obj, long j) {
        return f9140f.mo9900d(obj, j);
    }

    /* renamed from: f */
    public static int m8826f(Object obj, long j) {
        return f9140f.mo9907e(obj, j);
    }

    /* renamed from: g */
    public static long m8827g(Object obj, long j) {
        return f9140f.mo9908f(obj, j);
    }

    /* renamed from: h */
    public static Object m8828h(Object obj, long j) {
        return f9140f.mo9909g(obj, j);
    }

    /* renamed from: a */
    public static void m8808a(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = ((~((int) j)) & 3) << 3;
        int i2 = (255 & b) << i;
        f9140f.mo9903a(obj, j2, i2 | (m8826f(obj, j2) & (~(255 << i))));
    }
}
