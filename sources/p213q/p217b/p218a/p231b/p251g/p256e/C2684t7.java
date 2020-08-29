package p213q.p217b.p218a.p231b.p251g.p256e;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2492b;
import p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.C2616a;
import sun.misc.Unsafe;

/* renamed from: q.b.a.b.g.e.t7 */
public final class C2684t7<T> implements C2455g8<T> {

    /* renamed from: q */
    public static final int[] f6875q = new int[0];

    /* renamed from: r */
    public static final Unsafe f6876r = C2366b9.m5481a();

    /* renamed from: a */
    public final int[] f6877a;

    /* renamed from: b */
    public final Object[] f6878b;

    /* renamed from: c */
    public final int f6879c;

    /* renamed from: d */
    public final int f6880d;

    /* renamed from: e */
    public final C2619p7 f6881e;

    /* renamed from: f */
    public final boolean f6882f;

    /* renamed from: g */
    public final boolean f6883g;

    /* renamed from: h */
    public final boolean f6884h;

    /* renamed from: i */
    public final int[] f6885i;

    /* renamed from: j */
    public final int f6886j;

    /* renamed from: k */
    public final int f6887k;

    /* renamed from: l */
    public final C2717v7 f6888l;

    /* renamed from: m */
    public final C2779z6 f6889m;

    /* renamed from: n */
    public final C2702u8<?, ?> f6890n;

    /* renamed from: o */
    public final C2731w5<?> f6891o;

    /* renamed from: p */
    public final C2564m7 f6892p;

    public C2684t7(int[] iArr, Object[] objArr, int i, int i2, C2619p7 p7Var, boolean z, int[] iArr2, int i3, int i4, C2717v7 v7Var, C2779z6 z6Var, C2702u8 u8Var, C2731w5 w5Var, C2564m7 m7Var) {
        this.f6877a = iArr;
        this.f6878b = objArr;
        this.f6879c = i;
        this.f6880d = i2;
        boolean z2 = p7Var instanceof C2490i6;
        this.f6883g = z;
        this.f6882f = w5Var != null && (p7Var instanceof C2492b);
        this.f6884h = false;
        this.f6885i = iArr2;
        this.f6886j = i3;
        this.f6887k = i4;
        this.f6888l = v7Var;
        this.f6889m = z6Var;
        this.f6890n = u8Var;
        this.f6891o = w5Var;
        this.f6881e = p7Var;
        this.f6892p = m7Var;
    }

    /* renamed from: a */
    public static Field m6398a(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(C1965a.m4743a(arrays, name.length() + C1965a.m4743a(str, 40)));
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            throw new RuntimeException(C1965a.m4754a(sb, " not found. Known fields are ", arrays));
        }
    }

    /* renamed from: a */
    public static List<?> m6399a(Object obj, long j) {
        return (List) C2366b9.m5496f(obj, j);
    }

    /* renamed from: b */
    public static <T> double m6403b(T t, long j) {
        return ((Double) C2366b9.m5496f(t, j)).doubleValue();
    }

    /* renamed from: c */
    public static <T> float m6404c(T t, long j) {
        return ((Float) C2366b9.m5496f(t, j)).floatValue();
    }

    /* renamed from: d */
    public static <T> int m6405d(T t, long j) {
        return ((Integer) C2366b9.m5496f(t, j)).intValue();
    }

    /* renamed from: e */
    public static <T> long m6406e(T t, long j) {
        return ((Long) C2366b9.m5496f(t, j)).longValue();
    }

    /* renamed from: e */
    public static C2685t8 m6407e(Object obj) {
        C2490i6 i6Var = (C2490i6) obj;
        C2685t8 t8Var = i6Var.zzb;
        if (t8Var != C2685t8.f6893f) {
            return t8Var;
        }
        C2685t8 b = C2685t8.m6439b();
        i6Var.zzb = b;
        return b;
    }

    /* renamed from: f */
    public static <T> boolean m6408f(T t, long j) {
        return ((Boolean) C2366b9.m5496f(t, j)).booleanValue();
    }

    /* renamed from: a */
    public final int mo8012a(int i, int i2) {
        int length = (this.f6877a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f6877a[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0061, code lost:
        r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r9, r5);
        r2 = r2 * 53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0093, code lost:
        r2 = r2 * 53;
        r3 = m6405d(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a8, code lost:
        r2 = r2 * 53;
        r3 = m6406e(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ce, code lost:
        if (r3 != null) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d1, code lost:
        r2 = r2 * 53;
        r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d7, code lost:
        r3 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e0, code lost:
        if (r3 != null) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e2, code lost:
        r7 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e6, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ea, code lost:
        r2 = r2 * 53;
        r3 = ((java.lang.String) p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r9, r5)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fd, code lost:
        r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2546l6.m6111a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0116, code lost:
        r3 = java.lang.Float.floatToIntBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0121, code lost:
        r3 = java.lang.Double.doubleToLongBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0125, code lost:
        r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2546l6.m6110a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0129, code lost:
        r2 = r3 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x012b, code lost:
        r1 = r1 + 3;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo7678a(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.f6877a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r1 >= r0) goto L_0x012f
            int r3 = r8.mo8030d(r1)
            int[] r4 = r8.f6877a
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            r7 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = r3 & r7
            int r3 = r3 >>> 20
            r7 = 37
            switch(r3) {
                case 0: goto L_0x011b;
                case 1: goto L_0x0110;
                case 2: goto L_0x0109;
                case 3: goto L_0x0109;
                case 4: goto L_0x0102;
                case 5: goto L_0x0109;
                case 6: goto L_0x0102;
                case 7: goto L_0x00f7;
                case 8: goto L_0x00ea;
                case 9: goto L_0x00dc;
                case 10: goto L_0x00d1;
                case 11: goto L_0x0102;
                case 12: goto L_0x0102;
                case 13: goto L_0x0102;
                case 14: goto L_0x0109;
                case 15: goto L_0x0102;
                case 16: goto L_0x0109;
                case 17: goto L_0x00ca;
                case 18: goto L_0x00d1;
                case 19: goto L_0x00d1;
                case 20: goto L_0x00d1;
                case 21: goto L_0x00d1;
                case 22: goto L_0x00d1;
                case 23: goto L_0x00d1;
                case 24: goto L_0x00d1;
                case 25: goto L_0x00d1;
                case 26: goto L_0x00d1;
                case 27: goto L_0x00d1;
                case 28: goto L_0x00d1;
                case 29: goto L_0x00d1;
                case 30: goto L_0x00d1;
                case 31: goto L_0x00d1;
                case 32: goto L_0x00d1;
                case 33: goto L_0x00d1;
                case 34: goto L_0x00d1;
                case 35: goto L_0x00d1;
                case 36: goto L_0x00d1;
                case 37: goto L_0x00d1;
                case 38: goto L_0x00d1;
                case 39: goto L_0x00d1;
                case 40: goto L_0x00d1;
                case 41: goto L_0x00d1;
                case 42: goto L_0x00d1;
                case 43: goto L_0x00d1;
                case 44: goto L_0x00d1;
                case 45: goto L_0x00d1;
                case 46: goto L_0x00d1;
                case 47: goto L_0x00d1;
                case 48: goto L_0x00d1;
                case 49: goto L_0x00d1;
                case 50: goto L_0x00d1;
                case 51: goto L_0x00bd;
                case 52: goto L_0x00b0;
                case 53: goto L_0x00a2;
                case 54: goto L_0x009b;
                case 55: goto L_0x008d;
                case 56: goto L_0x0086;
                case 57: goto L_0x007f;
                case 58: goto L_0x0071;
                case 59: goto L_0x0069;
                case 60: goto L_0x005b;
                case 61: goto L_0x0053;
                case 62: goto L_0x004c;
                case 63: goto L_0x0045;
                case 64: goto L_0x003e;
                case 65: goto L_0x0036;
                case 66: goto L_0x002f;
                case 67: goto L_0x0027;
                case 68: goto L_0x0020;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x012b
        L_0x0020:
            boolean r3 = r8.mo8021a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012b
            goto L_0x0061
        L_0x0027:
            boolean r3 = r8.mo8021a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012b
            goto L_0x00a8
        L_0x002f:
            boolean r3 = r8.mo8021a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012b
            goto L_0x004b
        L_0x0036:
            boolean r3 = r8.mo8021a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012b
            goto L_0x00a8
        L_0x003e:
            boolean r3 = r8.mo8021a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012b
            goto L_0x004b
        L_0x0045:
            boolean r3 = r8.mo8021a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012b
        L_0x004b:
            goto L_0x0093
        L_0x004c:
            boolean r3 = r8.mo8021a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012b
            goto L_0x0093
        L_0x0053:
            boolean r3 = r8.mo8021a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012b
            goto L_0x00d1
        L_0x005b:
            boolean r3 = r8.mo8021a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012b
        L_0x0061:
            java.lang.Object r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r9, r5)
            int r2 = r2 * 53
            goto L_0x00d7
        L_0x0069:
            boolean r3 = r8.mo8021a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012b
            goto L_0x00ea
        L_0x0071:
            boolean r3 = r8.mo8021a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012b
            int r2 = r2 * 53
            boolean r3 = m6408f(r9, r5)
            goto L_0x00fd
        L_0x007f:
            boolean r3 = r8.mo8021a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012b
            goto L_0x0093
        L_0x0086:
            boolean r3 = r8.mo8021a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012b
            goto L_0x00a8
        L_0x008d:
            boolean r3 = r8.mo8021a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012b
        L_0x0093:
            int r2 = r2 * 53
            int r3 = m6405d(r9, r5)
            goto L_0x0129
        L_0x009b:
            boolean r3 = r8.mo8021a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012b
            goto L_0x00a8
        L_0x00a2:
            boolean r3 = r8.mo8021a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012b
        L_0x00a8:
            int r2 = r2 * 53
            long r3 = m6406e(r9, r5)
            goto L_0x0125
        L_0x00b0:
            boolean r3 = r8.mo8021a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012b
            int r2 = r2 * 53
            float r3 = m6404c(r9, r5)
            goto L_0x0116
        L_0x00bd:
            boolean r3 = r8.mo8021a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012b
            int r2 = r2 * 53
            double r3 = m6403b((T) r9, r5)
            goto L_0x0121
        L_0x00ca:
            java.lang.Object r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r9, r5)
            if (r3 == 0) goto L_0x00e6
            goto L_0x00e2
        L_0x00d1:
            int r2 = r2 * 53
            java.lang.Object r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r9, r5)
        L_0x00d7:
            int r3 = r3.hashCode()
            goto L_0x0129
        L_0x00dc:
            java.lang.Object r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r9, r5)
            if (r3 == 0) goto L_0x00e6
        L_0x00e2:
            int r7 = r3.hashCode()
        L_0x00e6:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x012b
        L_0x00ea:
            int r2 = r2 * 53
            java.lang.Object r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0129
        L_0x00f7:
            int r2 = r2 * 53
            boolean r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5492c(r9, r5)
        L_0x00fd:
            int r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2546l6.m6111a(r3)
            goto L_0x0129
        L_0x0102:
            int r2 = r2 * 53
            int r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5479a(r9, r5)
            goto L_0x0129
        L_0x0109:
            int r2 = r2 * 53
            long r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5488b(r9, r5)
            goto L_0x0125
        L_0x0110:
            int r2 = r2 * 53
            float r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5493d(r9, r5)
        L_0x0116:
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0129
        L_0x011b:
            int r2 = r2 * 53
            double r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5495e(r9, r5)
        L_0x0121:
            long r3 = java.lang.Double.doubleToLongBits(r3)
        L_0x0125:
            int r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2546l6.m6110a(r3)
        L_0x0129:
            int r3 = r3 + r2
            r2 = r3
        L_0x012b:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x012f:
            int r2 = r2 * 53
            q.b.a.b.g.e.u8<?, ?> r0 = r8.f6890n
            q.b.a.b.g.e.w8 r0 = (p213q.p217b.p218a.p231b.p251g.p256e.C2734w8) r0
            r1 = 0
            if (r0 == 0) goto L_0x015a
            r0 = r9
            q.b.a.b.g.e.i6 r0 = (p213q.p217b.p218a.p231b.p251g.p256e.C2490i6) r0
            q.b.a.b.g.e.t8 r0 = r0.zzb
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            boolean r2 = r8.f6882f
            if (r2 == 0) goto L_0x0159
            int r0 = r0 * 53
            q.b.a.b.g.e.w5<?> r2 = r8.f6891o
            q.b.a.b.g.e.v5 r2 = (p213q.p217b.p218a.p231b.p251g.p256e.C2715v5) r2
            if (r2 == 0) goto L_0x0158
            q.b.a.b.g.e.i6$b r9 = (p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2492b) r9
            q.b.a.b.g.e.x5<q.b.a.b.g.e.i6$e> r9 = r9.zzc
            int r9 = r9.hashCode()
            int r0 = r0 + r9
            goto L_0x0159
        L_0x0158:
            throw r1
        L_0x0159:
            return r0
        L_0x015a:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p251g.p256e.C2684t7.mo7678a(java.lang.Object):int");
    }

    /* renamed from: a */
    public final T mo7679a() {
        return this.f6888l.mo8062a(this.f6881e);
    }

    /* renamed from: a */
    public final boolean mo8022a(T t, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? mo8020a(t, i) : (i3 & i4) != 0;
    }

    /* renamed from: b */
    public final Object mo8023b(int i) {
        return this.f6878b[(i / 3) << 1];
    }

    /* renamed from: b */
    public final void mo8024b(T t, int i) {
        int i2 = this.f6877a[i + 2];
        long j = (long) (1048575 & i2);
        if (j != 1048575) {
            C2366b9.f6344f.mo7430a((Object) t, j, (1 << (i2 >>> 20)) | C2366b9.m5479a((Object) t, j));
        }
    }

    /* renamed from: c */
    public final C2563m6 mo8028c(int i) {
        return (C2563m6) this.f6878b[((i / 3) << 1) + 1];
    }

    /* renamed from: c */
    public final void mo7685c(T t) {
        int i;
        int i2 = this.f6886j;
        while (true) {
            i = this.f6887k;
            if (i2 >= i) {
                break;
            }
            long d = (long) (mo8030d(this.f6885i[i2]) & 1048575);
            Object f = C2366b9.m5496f(t, d);
            if (f != null) {
                C2366b9.m5485a((Object) t, d, this.f6892p.mo7854f(f));
            }
            i2++;
        }
        int length = this.f6885i.length;
        while (i < length) {
            this.f6889m.mo7412a(t, (long) this.f6885i[i]);
            i++;
        }
        if (((C2734w8) this.f6890n) != null) {
            ((C2490i6) t).zzb.f6898e = false;
            if (!this.f6882f) {
                return;
            }
            if (((C2715v5) this.f6891o) != null) {
                ((C2492b) t).zzc.mo8092a();
                return;
            }
            throw null;
        }
        throw null;
    }

    /* renamed from: c */
    public final boolean mo8029c(T t, T t2, int i) {
        return mo8020a(t, i) == mo8020a(t2, i);
    }

    /* renamed from: d */
    public final int mo8030d(int i) {
        return this.f6877a[i + 1];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01ce, code lost:
        if (r0.f6884h != false) goto L_0x0203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01df, code lost:
        if (r0.f6884h != false) goto L_0x0203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01f0, code lost:
        if (r0.f6884h != false) goto L_0x0203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0201, code lost:
        if (r0.f6884h != false) goto L_0x0203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0203, code lost:
        r2.putInt(r1, (long) r8, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0207, code lost:
        r7 = ((p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6260h(r9) + p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6256f(r11)) + r9) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02a1, code lost:
        r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6230a(r11, (p213q.p217b.p218a.p231b.p251g.p256e.C2619p7) p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r1, r12), mo8017a(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02bb, code lost:
        r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6245c(r11, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02cb, code lost:
        r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6249d(r11, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02d7, code lost:
        r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6263k(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x02e3, code lost:
        r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6265m(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x02f3, code lost:
        r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6253e(r11, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0303, code lost:
        r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6244c(r11, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x030f, code lost:
        r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r1, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x031a, code lost:
        r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m5975a(r11, p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r1, r12), mo8017a(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0334, code lost:
        if ((r8 instanceof p213q.p217b.p218a.p231b.p251g.p256e.C2435f5) != false) goto L_0x0336;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0336, code lost:
        r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6229a(r11, (p213q.p217b.p218a.p231b.p251g.p256e.C2435f5) r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x033e, code lost:
        r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6228a(r11, (java.lang.String) r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x034b, code lost:
        r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6252e(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0356, code lost:
        r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6264l(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0361, code lost:
        r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6261i(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0370, code lost:
        r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6239b(r11, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x037f, code lost:
        r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6240b(r11, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x038e, code lost:
        r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6227a(r11, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0399, code lost:
        r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.mo7946b(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x03a4, code lost:
        r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6248d(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x03a8, code lost:
        r7 = r7 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x03a9, code lost:
        r6 = r6 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0476, code lost:
        if ((r3 instanceof p213q.p217b.p218a.p231b.p251g.p256e.C2435f5) != false) goto L_0x0713;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x04f4, code lost:
        if (r0.f6884h != false) goto L_0x05da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0506, code lost:
        if (r0.f6884h != false) goto L_0x05da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0518, code lost:
        if (r0.f6884h != false) goto L_0x05da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x052a, code lost:
        if (r0.f6884h != false) goto L_0x05da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x053c, code lost:
        if (r0.f6884h != false) goto L_0x05da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x054e, code lost:
        if (r0.f6884h != false) goto L_0x05da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0560, code lost:
        if (r0.f6884h != false) goto L_0x05da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0572, code lost:
        if (r0.f6884h != false) goto L_0x05da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0583, code lost:
        if (r0.f6884h != false) goto L_0x05da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x0594, code lost:
        if (r0.f6884h != false) goto L_0x05da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x05a5, code lost:
        if (r0.f6884h != false) goto L_0x05da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x05b6, code lost:
        if (r0.f6884h != false) goto L_0x05da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x05c7, code lost:
        if (r0.f6884h != false) goto L_0x05da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x05d8, code lost:
        if (r0.f6884h != false) goto L_0x05da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x05da, code lost:
        r2.putInt(r1, (long) r11, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x05de, code lost:
        r8 = ((p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6260h(r3) + p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6256f(r12)) + r3) + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x0690, code lost:
        r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6230a(r12, (p213q.p217b.p218a.p231b.p251g.p256e.C2619p7) r2.getObject(r1, r3), mo8017a(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x06a8, code lost:
        r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6245c(r12, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x06b6, code lost:
        r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6249d(r12, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x06c0, code lost:
        r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6263k(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x06ca, code lost:
        r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6265m(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x06d8, code lost:
        r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6253e(r12, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x06e6, code lost:
        r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6244c(r12, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x06f0, code lost:
        r3 = r2.getObject(r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x06f9, code lost:
        r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m5975a(r12, r2.getObject(r1, r3), mo8017a(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x0711, code lost:
        if ((r3 instanceof p213q.p217b.p218a.p231b.p251g.p256e.C2435f5) != false) goto L_0x0713;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x0713, code lost:
        r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6229a(r12, (p213q.p217b.p218a.p231b.p251g.p256e.C2435f5) r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x071a, code lost:
        r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6228a(r12, (java.lang.String) r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x0725, code lost:
        r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6252e(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a1, code lost:
        if ((r8 instanceof p213q.p217b.p218a.p231b.p251g.p256e.C2435f5) != false) goto L_0x0336;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x072e, code lost:
        r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6264l(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x0737, code lost:
        r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6261i(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x0744, code lost:
        r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6239b(r12, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x0751, code lost:
        r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6240b(r12, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x075e, code lost:
        r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6227a(r12, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x0767, code lost:
        r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.mo7946b(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x0770, code lost:
        r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6248d(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x0774, code lost:
        r8 = r8 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x0775, code lost:
        r7 = r7 + 3;
        r3 = 1048575;
        r4 = 267386880;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x011d, code lost:
        if (r0.f6884h != false) goto L_0x0203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x012f, code lost:
        if (r0.f6884h != false) goto L_0x0203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0141, code lost:
        if (r0.f6884h != false) goto L_0x0203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0153, code lost:
        if (r0.f6884h != false) goto L_0x0203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0165, code lost:
        if (r0.f6884h != false) goto L_0x0203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0177, code lost:
        if (r0.f6884h != false) goto L_0x0203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0189, code lost:
        if (r0.f6884h != false) goto L_0x0203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x019b, code lost:
        if (r0.f6884h != false) goto L_0x0203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01ac, code lost:
        if (r0.f6884h != false) goto L_0x0203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01bd, code lost:
        if (r0.f6884h != false) goto L_0x0203;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo7686d(T r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r0.f6883g
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r4 = 267386880(0xff00000, float:2.3665827E-29)
            r5 = 0
            if (r2 == 0) goto L_0x03be
            sun.misc.Unsafe r2 = f6876r
            r6 = 0
            r7 = 0
        L_0x0012:
            int[] r8 = r0.f6877a
            int r8 = r8.length
            if (r6 >= r8) goto L_0x03ad
            int r8 = r0.mo8030d(r6)
            r9 = r8 & r4
            int r9 = r9 >>> 20
            int[] r10 = r0.f6877a
            r11 = r10[r6]
            r8 = r8 & r3
            long r12 = (long) r8
            q.b.a.b.g.e.c6 r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2384c6.DOUBLE_LIST_PACKED
            int r8 = r8.f6415e
            if (r9 < r8) goto L_0x0037
            q.b.a.b.g.e.c6 r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2384c6.SINT64_LIST_PACKED
            int r8 = r8.f6415e
            if (r9 > r8) goto L_0x0037
            int r8 = r6 + 2
            r8 = r10[r8]
            r8 = r8 & r3
            goto L_0x0038
        L_0x0037:
            r8 = 0
        L_0x0038:
            switch(r9) {
                case 0: goto L_0x039e;
                case 1: goto L_0x0393;
                case 2: goto L_0x0384;
                case 3: goto L_0x0375;
                case 4: goto L_0x0366;
                case 5: goto L_0x035b;
                case 6: goto L_0x0350;
                case 7: goto L_0x0345;
                case 8: goto L_0x0328;
                case 9: goto L_0x0314;
                case 10: goto L_0x0309;
                case 11: goto L_0x02f9;
                case 12: goto L_0x02e9;
                case 13: goto L_0x02dd;
                case 14: goto L_0x02d1;
                case 15: goto L_0x02c1;
                case 16: goto L_0x02b1;
                case 17: goto L_0x029b;
                case 18: goto L_0x0291;
                case 19: goto L_0x0287;
                case 20: goto L_0x027d;
                case 21: goto L_0x0273;
                case 22: goto L_0x0269;
                case 23: goto L_0x0291;
                case 24: goto L_0x0287;
                case 25: goto L_0x025f;
                case 26: goto L_0x0255;
                case 27: goto L_0x0247;
                case 28: goto L_0x023d;
                case 29: goto L_0x0233;
                case 30: goto L_0x0229;
                case 31: goto L_0x0287;
                case 32: goto L_0x0291;
                case 33: goto L_0x021f;
                case 34: goto L_0x0215;
                case 35: goto L_0x01f3;
                case 36: goto L_0x01e2;
                case 37: goto L_0x01d1;
                case 38: goto L_0x01c0;
                case 39: goto L_0x01af;
                case 40: goto L_0x019e;
                case 41: goto L_0x018d;
                case 42: goto L_0x017b;
                case 43: goto L_0x0169;
                case 44: goto L_0x0157;
                case 45: goto L_0x0145;
                case 46: goto L_0x0133;
                case 47: goto L_0x0121;
                case 48: goto L_0x010f;
                case 49: goto L_0x0101;
                case 50: goto L_0x00f1;
                case 51: goto L_0x00e9;
                case 52: goto L_0x00e1;
                case 53: goto L_0x00d5;
                case 54: goto L_0x00c9;
                case 55: goto L_0x00bd;
                case 56: goto L_0x00b5;
                case 57: goto L_0x00ad;
                case 58: goto L_0x00a5;
                case 59: goto L_0x0095;
                case 60: goto L_0x008d;
                case 61: goto L_0x0085;
                case 62: goto L_0x0079;
                case 63: goto L_0x006d;
                case 64: goto L_0x0065;
                case 65: goto L_0x005d;
                case 66: goto L_0x0051;
                case 67: goto L_0x0045;
                case 68: goto L_0x003d;
                default: goto L_0x003b;
            }
        L_0x003b:
            goto L_0x03a9
        L_0x003d:
            boolean r8 = r0.mo8021a((T) r1, r11, r6)
            if (r8 == 0) goto L_0x03a9
            goto L_0x02a1
        L_0x0045:
            boolean r8 = r0.mo8021a((T) r1, r11, r6)
            if (r8 == 0) goto L_0x03a9
            long r8 = m6406e(r1, r12)
            goto L_0x02bb
        L_0x0051:
            boolean r8 = r0.mo8021a((T) r1, r11, r6)
            if (r8 == 0) goto L_0x03a9
            int r8 = m6405d(r1, r12)
            goto L_0x02cb
        L_0x005d:
            boolean r8 = r0.mo8021a((T) r1, r11, r6)
            if (r8 == 0) goto L_0x03a9
            goto L_0x02d7
        L_0x0065:
            boolean r8 = r0.mo8021a((T) r1, r11, r6)
            if (r8 == 0) goto L_0x03a9
            goto L_0x02e3
        L_0x006d:
            boolean r8 = r0.mo8021a((T) r1, r11, r6)
            if (r8 == 0) goto L_0x03a9
            int r8 = m6405d(r1, r12)
            goto L_0x02f3
        L_0x0079:
            boolean r8 = r0.mo8021a((T) r1, r11, r6)
            if (r8 == 0) goto L_0x03a9
            int r8 = m6405d(r1, r12)
            goto L_0x0303
        L_0x0085:
            boolean r8 = r0.mo8021a((T) r1, r11, r6)
            if (r8 == 0) goto L_0x03a9
            goto L_0x030f
        L_0x008d:
            boolean r8 = r0.mo8021a((T) r1, r11, r6)
            if (r8 == 0) goto L_0x03a9
            goto L_0x031a
        L_0x0095:
            boolean r8 = r0.mo8021a((T) r1, r11, r6)
            if (r8 == 0) goto L_0x03a9
            java.lang.Object r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r1, r12)
            boolean r9 = r8 instanceof p213q.p217b.p218a.p231b.p251g.p256e.C2435f5
            if (r9 == 0) goto L_0x033e
            goto L_0x0336
        L_0x00a5:
            boolean r8 = r0.mo8021a((T) r1, r11, r6)
            if (r8 == 0) goto L_0x03a9
            goto L_0x034b
        L_0x00ad:
            boolean r8 = r0.mo8021a((T) r1, r11, r6)
            if (r8 == 0) goto L_0x03a9
            goto L_0x0356
        L_0x00b5:
            boolean r8 = r0.mo8021a((T) r1, r11, r6)
            if (r8 == 0) goto L_0x03a9
            goto L_0x0361
        L_0x00bd:
            boolean r8 = r0.mo8021a((T) r1, r11, r6)
            if (r8 == 0) goto L_0x03a9
            int r8 = m6405d(r1, r12)
            goto L_0x0370
        L_0x00c9:
            boolean r8 = r0.mo8021a((T) r1, r11, r6)
            if (r8 == 0) goto L_0x03a9
            long r8 = m6406e(r1, r12)
            goto L_0x037f
        L_0x00d5:
            boolean r8 = r0.mo8021a((T) r1, r11, r6)
            if (r8 == 0) goto L_0x03a9
            long r8 = m6406e(r1, r12)
            goto L_0x038e
        L_0x00e1:
            boolean r8 = r0.mo8021a((T) r1, r11, r6)
            if (r8 == 0) goto L_0x03a9
            goto L_0x0399
        L_0x00e9:
            boolean r8 = r0.mo8021a((T) r1, r11, r6)
            if (r8 == 0) goto L_0x03a9
            goto L_0x03a4
        L_0x00f1:
            q.b.a.b.g.e.m7 r8 = r0.f6892p
            java.lang.Object r9 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r1, r12)
            java.lang.Object r10 = r0.mo8023b(r6)
            int r8 = r8.mo7847a(r11, r9, r10)
            goto L_0x03a8
        L_0x0101:
            java.util.List r8 = m6399a(r1, r12)
            q.b.a.b.g.e.g8 r9 = r0.mo8017a(r6)
            int r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m5991b(r11, r8, r9)
            goto L_0x03a8
        L_0x010f:
            java.lang.Object r9 = r2.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            int r9 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m5997c(r9)
            if (r9 <= 0) goto L_0x03a9
            boolean r10 = r0.f6884h
            if (r10 == 0) goto L_0x0207
            goto L_0x0203
        L_0x0121:
            java.lang.Object r9 = r2.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            int r9 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6009g(r9)
            if (r9 <= 0) goto L_0x03a9
            boolean r10 = r0.f6884h
            if (r10 == 0) goto L_0x0207
            goto L_0x0203
        L_0x0133:
            java.lang.Object r9 = r2.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            int r9 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6015i(r9)
            if (r9 <= 0) goto L_0x03a9
            boolean r10 = r0.f6884h
            if (r10 == 0) goto L_0x0207
            goto L_0x0203
        L_0x0145:
            java.lang.Object r9 = r2.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            int r9 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6012h(r9)
            if (r9 <= 0) goto L_0x03a9
            boolean r10 = r0.f6884h
            if (r10 == 0) goto L_0x0207
            goto L_0x0203
        L_0x0157:
            java.lang.Object r9 = r2.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            int r9 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6000d(r9)
            if (r9 <= 0) goto L_0x03a9
            boolean r10 = r0.f6884h
            if (r10 == 0) goto L_0x0207
            goto L_0x0203
        L_0x0169:
            java.lang.Object r9 = r2.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            int r9 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6006f(r9)
            if (r9 <= 0) goto L_0x03a9
            boolean r10 = r0.f6884h
            if (r10 == 0) goto L_0x0207
            goto L_0x0203
        L_0x017b:
            java.lang.Object r9 = r2.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            int r9 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6018j(r9)
            if (r9 <= 0) goto L_0x03a9
            boolean r10 = r0.f6884h
            if (r10 == 0) goto L_0x0207
            goto L_0x0203
        L_0x018d:
            java.lang.Object r9 = r2.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            int r9 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6012h(r9)
            if (r9 <= 0) goto L_0x03a9
            boolean r10 = r0.f6884h
            if (r10 == 0) goto L_0x0207
            goto L_0x0203
        L_0x019e:
            java.lang.Object r9 = r2.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            int r9 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6015i(r9)
            if (r9 <= 0) goto L_0x03a9
            boolean r10 = r0.f6884h
            if (r10 == 0) goto L_0x0207
            goto L_0x0203
        L_0x01af:
            java.lang.Object r9 = r2.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            int r9 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6003e(r9)
            if (r9 <= 0) goto L_0x03a9
            boolean r10 = r0.f6884h
            if (r10 == 0) goto L_0x0207
            goto L_0x0203
        L_0x01c0:
            java.lang.Object r9 = r2.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            int r9 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m5992b(r9)
            if (r9 <= 0) goto L_0x03a9
            boolean r10 = r0.f6884h
            if (r10 == 0) goto L_0x0207
            goto L_0x0203
        L_0x01d1:
            java.lang.Object r9 = r2.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            int r9 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m5978a(r9)
            if (r9 <= 0) goto L_0x03a9
            boolean r10 = r0.f6884h
            if (r10 == 0) goto L_0x0207
            goto L_0x0203
        L_0x01e2:
            java.lang.Object r9 = r2.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            int r9 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6012h(r9)
            if (r9 <= 0) goto L_0x03a9
            boolean r10 = r0.f6884h
            if (r10 == 0) goto L_0x0207
            goto L_0x0203
        L_0x01f3:
            java.lang.Object r9 = r2.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            int r9 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6015i(r9)
            if (r9 <= 0) goto L_0x03a9
            boolean r10 = r0.f6884h
            if (r10 == 0) goto L_0x0207
        L_0x0203:
            long r12 = (long) r8
            r2.putInt(r1, r12, r9)
        L_0x0207:
            int r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6256f(r11)
            int r10 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6260h(r9)
            int r10 = r10 + r8
            int r10 = r10 + r9
            int r10 = r10 + r7
            r7 = r10
            goto L_0x03a9
        L_0x0215:
            java.util.List r8 = m6399a(r1, r12)
            int r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6002e(r11, r8)
            goto L_0x03a8
        L_0x021f:
            java.util.List r8 = m6399a(r1, r12)
            int r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6014i(r11, r8)
            goto L_0x03a8
        L_0x0229:
            java.util.List r8 = m6399a(r1, r12)
            int r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6005f(r11, r8)
            goto L_0x03a8
        L_0x0233:
            java.util.List r8 = m6399a(r1, r12)
            int r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6011h(r11, r8)
            goto L_0x03a8
        L_0x023d:
            java.util.List r8 = m6399a(r1, r12)
            int r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m5996c(r11, r8)
            goto L_0x03a8
        L_0x0247:
            java.util.List r8 = m6399a(r1, r12)
            q.b.a.b.g.e.g8 r9 = r0.mo8017a(r6)
            int r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m5977a(r11, r8, r9)
            goto L_0x03a8
        L_0x0255:
            java.util.List r8 = m6399a(r1, r12)
            int r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m5976a(r11, r8)
            goto L_0x03a8
        L_0x025f:
            java.util.List r8 = m6399a(r1, r12)
            int r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6022l(r11, r8)
            goto L_0x03a8
        L_0x0269:
            java.util.List r8 = m6399a(r1, r12)
            int r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6008g(r11, r8)
            goto L_0x03a8
        L_0x0273:
            java.util.List r8 = m6399a(r1, r12)
            int r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m5999d(r11, r8)
            goto L_0x03a8
        L_0x027d:
            java.util.List r8 = m6399a(r1, r12)
            int r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m5990b(r11, r8)
            goto L_0x03a8
        L_0x0287:
            java.util.List r8 = m6399a(r1, r12)
            int r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6017j(r11, r8)
            goto L_0x03a8
        L_0x0291:
            java.util.List r8 = m6399a(r1, r12)
            int r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6020k(r11, r8)
            goto L_0x03a8
        L_0x029b:
            boolean r8 = r0.mo8020a((T) r1, r6)
            if (r8 == 0) goto L_0x03a9
        L_0x02a1:
            java.lang.Object r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r1, r12)
            q.b.a.b.g.e.p7 r8 = (p213q.p217b.p218a.p231b.p251g.p256e.C2619p7) r8
            q.b.a.b.g.e.g8 r9 = r0.mo8017a(r6)
            int r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6230a(r11, r8, r9)
            goto L_0x03a8
        L_0x02b1:
            boolean r8 = r0.mo8020a((T) r1, r6)
            if (r8 == 0) goto L_0x03a9
            long r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5488b(r1, r12)
        L_0x02bb:
            int r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6245c(r11, r8)
            goto L_0x03a8
        L_0x02c1:
            boolean r8 = r0.mo8020a((T) r1, r6)
            if (r8 == 0) goto L_0x03a9
            int r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5479a(r1, r12)
        L_0x02cb:
            int r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6249d(r11, r8)
            goto L_0x03a8
        L_0x02d1:
            boolean r8 = r0.mo8020a((T) r1, r6)
            if (r8 == 0) goto L_0x03a9
        L_0x02d7:
            int r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6263k(r11)
            goto L_0x03a8
        L_0x02dd:
            boolean r8 = r0.mo8020a((T) r1, r6)
            if (r8 == 0) goto L_0x03a9
        L_0x02e3:
            int r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6265m(r11)
            goto L_0x03a8
        L_0x02e9:
            boolean r8 = r0.mo8020a((T) r1, r6)
            if (r8 == 0) goto L_0x03a9
            int r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5479a(r1, r12)
        L_0x02f3:
            int r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6253e(r11, r8)
            goto L_0x03a8
        L_0x02f9:
            boolean r8 = r0.mo8020a((T) r1, r6)
            if (r8 == 0) goto L_0x03a9
            int r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5479a(r1, r12)
        L_0x0303:
            int r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6244c(r11, r8)
            goto L_0x03a8
        L_0x0309:
            boolean r8 = r0.mo8020a((T) r1, r6)
            if (r8 == 0) goto L_0x03a9
        L_0x030f:
            java.lang.Object r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r1, r12)
            goto L_0x0336
        L_0x0314:
            boolean r8 = r0.mo8020a((T) r1, r6)
            if (r8 == 0) goto L_0x03a9
        L_0x031a:
            java.lang.Object r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r1, r12)
            q.b.a.b.g.e.g8 r9 = r0.mo8017a(r6)
            int r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m5975a(r11, r8, r9)
            goto L_0x03a8
        L_0x0328:
            boolean r8 = r0.mo8020a((T) r1, r6)
            if (r8 == 0) goto L_0x03a9
            java.lang.Object r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r1, r12)
            boolean r9 = r8 instanceof p213q.p217b.p218a.p231b.p251g.p256e.C2435f5
            if (r9 == 0) goto L_0x033e
        L_0x0336:
            q.b.a.b.g.e.f5 r8 = (p213q.p217b.p218a.p231b.p251g.p256e.C2435f5) r8
            int r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6229a(r11, r8)
            goto L_0x03a8
        L_0x033e:
            java.lang.String r8 = (java.lang.String) r8
            int r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6228a(r11, r8)
            goto L_0x03a8
        L_0x0345:
            boolean r8 = r0.mo8020a((T) r1, r6)
            if (r8 == 0) goto L_0x03a9
        L_0x034b:
            int r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6252e(r11)
            goto L_0x03a8
        L_0x0350:
            boolean r8 = r0.mo8020a((T) r1, r6)
            if (r8 == 0) goto L_0x03a9
        L_0x0356:
            int r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6264l(r11)
            goto L_0x03a8
        L_0x035b:
            boolean r8 = r0.mo8020a((T) r1, r6)
            if (r8 == 0) goto L_0x03a9
        L_0x0361:
            int r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6261i(r11)
            goto L_0x03a8
        L_0x0366:
            boolean r8 = r0.mo8020a((T) r1, r6)
            if (r8 == 0) goto L_0x03a9
            int r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5479a(r1, r12)
        L_0x0370:
            int r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6239b(r11, r8)
            goto L_0x03a8
        L_0x0375:
            boolean r8 = r0.mo8020a((T) r1, r6)
            if (r8 == 0) goto L_0x03a9
            long r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5488b(r1, r12)
        L_0x037f:
            int r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6240b(r11, r8)
            goto L_0x03a8
        L_0x0384:
            boolean r8 = r0.mo8020a((T) r1, r6)
            if (r8 == 0) goto L_0x03a9
            long r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5488b(r1, r12)
        L_0x038e:
            int r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6227a(r11, r8)
            goto L_0x03a8
        L_0x0393:
            boolean r8 = r0.mo8020a((T) r1, r6)
            if (r8 == 0) goto L_0x03a9
        L_0x0399:
            int r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.mo7946b(r11)
            goto L_0x03a8
        L_0x039e:
            boolean r8 = r0.mo8020a((T) r1, r6)
            if (r8 == 0) goto L_0x03a9
        L_0x03a4:
            int r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6248d(r11)
        L_0x03a8:
            int r7 = r7 + r8
        L_0x03a9:
            int r6 = r6 + 3
            goto L_0x0012
        L_0x03ad:
            q.b.a.b.g.e.u8<?, ?> r2 = r0.f6890n
            q.b.a.b.g.e.w8 r2 = (p213q.p217b.p218a.p231b.p251g.p256e.C2734w8) r2
            if (r2 == 0) goto L_0x03bd
            q.b.a.b.g.e.i6 r1 = (p213q.p217b.p218a.p231b.p251g.p256e.C2490i6) r1
            q.b.a.b.g.e.t8 r1 = r1.zzb
            int r1 = r1.mo8032a()
            int r1 = r1 + r7
            return r1
        L_0x03bd:
            throw r5
        L_0x03be:
            sun.misc.Unsafe r2 = f6876r
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r3
        L_0x03c7:
            int[] r10 = r0.f6877a
            int r10 = r10.length
            if (r7 >= r10) goto L_0x077f
            int r10 = r0.mo8030d(r7)
            int[] r11 = r0.f6877a
            r12 = r11[r7]
            r13 = r10 & r4
            int r13 = r13 >>> 20
            r14 = 17
            if (r13 > r14) goto L_0x03f2
            int r14 = r7 + 2
            r11 = r11[r14]
            r14 = r11 & r3
            int r15 = r11 >>> 20
            r16 = 1
            int r15 = r16 << r15
            if (r14 == r6) goto L_0x040b
            long r4 = (long) r14
            int r4 = r2.getInt(r1, r4)
            r9 = r4
            r6 = r14
            goto L_0x040b
        L_0x03f2:
            boolean r4 = r0.f6884h
            if (r4 == 0) goto L_0x0408
            q.b.a.b.g.e.c6 r4 = p213q.p217b.p218a.p231b.p251g.p256e.C2384c6.DOUBLE_LIST_PACKED
            int r4 = r4.f6415e
            if (r13 < r4) goto L_0x0408
            q.b.a.b.g.e.c6 r4 = p213q.p217b.p218a.p231b.p251g.p256e.C2384c6.SINT64_LIST_PACKED
            int r4 = r4.f6415e
            if (r13 > r4) goto L_0x0408
            int r4 = r7 + 2
            r4 = r11[r4]
            r4 = r4 & r3
            goto L_0x0409
        L_0x0408:
            r4 = 0
        L_0x0409:
            r11 = r4
            r15 = 0
        L_0x040b:
            r3 = r3 & r10
            long r3 = (long) r3
            switch(r13) {
                case 0: goto L_0x076c;
                case 1: goto L_0x0763;
                case 2: goto L_0x0756;
                case 3: goto L_0x0749;
                case 4: goto L_0x073c;
                case 5: goto L_0x0733;
                case 6: goto L_0x072a;
                case 7: goto L_0x0721;
                case 8: goto L_0x0707;
                case 9: goto L_0x06f5;
                case 10: goto L_0x06ec;
                case 11: goto L_0x06de;
                case 12: goto L_0x06d0;
                case 13: goto L_0x06c6;
                case 14: goto L_0x06bc;
                case 15: goto L_0x06ae;
                case 16: goto L_0x06a0;
                case 17: goto L_0x068c;
                case 18: goto L_0x0680;
                case 19: goto L_0x0674;
                case 20: goto L_0x0668;
                case 21: goto L_0x065c;
                case 22: goto L_0x0650;
                case 23: goto L_0x0680;
                case 24: goto L_0x0674;
                case 25: goto L_0x0644;
                case 26: goto L_0x0638;
                case 27: goto L_0x0628;
                case 28: goto L_0x061c;
                case 29: goto L_0x0610;
                case 30: goto L_0x0604;
                case 31: goto L_0x0674;
                case 32: goto L_0x0680;
                case 33: goto L_0x05f8;
                case 34: goto L_0x05ec;
                case 35: goto L_0x05ca;
                case 36: goto L_0x05b9;
                case 37: goto L_0x05a8;
                case 38: goto L_0x0597;
                case 39: goto L_0x0586;
                case 40: goto L_0x0575;
                case 41: goto L_0x0564;
                case 42: goto L_0x0552;
                case 43: goto L_0x0540;
                case 44: goto L_0x052e;
                case 45: goto L_0x051c;
                case 46: goto L_0x050a;
                case 47: goto L_0x04f8;
                case 48: goto L_0x04e6;
                case 49: goto L_0x04d6;
                case 50: goto L_0x04c6;
                case 51: goto L_0x04be;
                case 52: goto L_0x04b6;
                case 53: goto L_0x04aa;
                case 54: goto L_0x049e;
                case 55: goto L_0x0492;
                case 56: goto L_0x048a;
                case 57: goto L_0x0482;
                case 58: goto L_0x047a;
                case 59: goto L_0x046a;
                case 60: goto L_0x0462;
                case 61: goto L_0x045a;
                case 62: goto L_0x044e;
                case 63: goto L_0x0442;
                case 64: goto L_0x043a;
                case 65: goto L_0x0432;
                case 66: goto L_0x0426;
                case 67: goto L_0x041a;
                case 68: goto L_0x0412;
                default: goto L_0x0410;
            }
        L_0x0410:
            goto L_0x0775
        L_0x0412:
            boolean r5 = r0.mo8021a((T) r1, r12, r7)
            if (r5 == 0) goto L_0x0775
            goto L_0x0690
        L_0x041a:
            boolean r5 = r0.mo8021a((T) r1, r12, r7)
            if (r5 == 0) goto L_0x0775
            long r3 = m6406e(r1, r3)
            goto L_0x06a8
        L_0x0426:
            boolean r5 = r0.mo8021a((T) r1, r12, r7)
            if (r5 == 0) goto L_0x0775
            int r3 = m6405d(r1, r3)
            goto L_0x06b6
        L_0x0432:
            boolean r3 = r0.mo8021a((T) r1, r12, r7)
            if (r3 == 0) goto L_0x0775
            goto L_0x06c0
        L_0x043a:
            boolean r3 = r0.mo8021a((T) r1, r12, r7)
            if (r3 == 0) goto L_0x0775
            goto L_0x06ca
        L_0x0442:
            boolean r5 = r0.mo8021a((T) r1, r12, r7)
            if (r5 == 0) goto L_0x0775
            int r3 = m6405d(r1, r3)
            goto L_0x06d8
        L_0x044e:
            boolean r5 = r0.mo8021a((T) r1, r12, r7)
            if (r5 == 0) goto L_0x0775
            int r3 = m6405d(r1, r3)
            goto L_0x06e6
        L_0x045a:
            boolean r5 = r0.mo8021a((T) r1, r12, r7)
            if (r5 == 0) goto L_0x0775
            goto L_0x06f0
        L_0x0462:
            boolean r5 = r0.mo8021a((T) r1, r12, r7)
            if (r5 == 0) goto L_0x0775
            goto L_0x06f9
        L_0x046a:
            boolean r5 = r0.mo8021a((T) r1, r12, r7)
            if (r5 == 0) goto L_0x0775
            java.lang.Object r3 = r2.getObject(r1, r3)
            boolean r4 = r3 instanceof p213q.p217b.p218a.p231b.p251g.p256e.C2435f5
            if (r4 == 0) goto L_0x071a
            goto L_0x0713
        L_0x047a:
            boolean r3 = r0.mo8021a((T) r1, r12, r7)
            if (r3 == 0) goto L_0x0775
            goto L_0x0725
        L_0x0482:
            boolean r3 = r0.mo8021a((T) r1, r12, r7)
            if (r3 == 0) goto L_0x0775
            goto L_0x072e
        L_0x048a:
            boolean r3 = r0.mo8021a((T) r1, r12, r7)
            if (r3 == 0) goto L_0x0775
            goto L_0x0737
        L_0x0492:
            boolean r5 = r0.mo8021a((T) r1, r12, r7)
            if (r5 == 0) goto L_0x0775
            int r3 = m6405d(r1, r3)
            goto L_0x0744
        L_0x049e:
            boolean r5 = r0.mo8021a((T) r1, r12, r7)
            if (r5 == 0) goto L_0x0775
            long r3 = m6406e(r1, r3)
            goto L_0x0751
        L_0x04aa:
            boolean r5 = r0.mo8021a((T) r1, r12, r7)
            if (r5 == 0) goto L_0x0775
            long r3 = m6406e(r1, r3)
            goto L_0x075e
        L_0x04b6:
            boolean r3 = r0.mo8021a((T) r1, r12, r7)
            if (r3 == 0) goto L_0x0775
            goto L_0x0767
        L_0x04be:
            boolean r3 = r0.mo8021a((T) r1, r12, r7)
            if (r3 == 0) goto L_0x0775
            goto L_0x0770
        L_0x04c6:
            q.b.a.b.g.e.m7 r5 = r0.f6892p
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.lang.Object r4 = r0.mo8023b(r7)
            int r3 = r5.mo7847a(r12, r3, r4)
            goto L_0x0774
        L_0x04d6:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            q.b.a.b.g.e.g8 r4 = r0.mo8017a(r7)
            int r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m5991b(r12, r3, r4)
            goto L_0x0774
        L_0x04e6:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m5997c(r3)
            if (r3 <= 0) goto L_0x0775
            boolean r4 = r0.f6884h
            if (r4 == 0) goto L_0x05de
            goto L_0x05da
        L_0x04f8:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6009g(r3)
            if (r3 <= 0) goto L_0x0775
            boolean r4 = r0.f6884h
            if (r4 == 0) goto L_0x05de
            goto L_0x05da
        L_0x050a:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6015i(r3)
            if (r3 <= 0) goto L_0x0775
            boolean r4 = r0.f6884h
            if (r4 == 0) goto L_0x05de
            goto L_0x05da
        L_0x051c:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6012h(r3)
            if (r3 <= 0) goto L_0x0775
            boolean r4 = r0.f6884h
            if (r4 == 0) goto L_0x05de
            goto L_0x05da
        L_0x052e:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6000d(r3)
            if (r3 <= 0) goto L_0x0775
            boolean r4 = r0.f6884h
            if (r4 == 0) goto L_0x05de
            goto L_0x05da
        L_0x0540:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6006f(r3)
            if (r3 <= 0) goto L_0x0775
            boolean r4 = r0.f6884h
            if (r4 == 0) goto L_0x05de
            goto L_0x05da
        L_0x0552:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6018j(r3)
            if (r3 <= 0) goto L_0x0775
            boolean r4 = r0.f6884h
            if (r4 == 0) goto L_0x05de
            goto L_0x05da
        L_0x0564:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6012h(r3)
            if (r3 <= 0) goto L_0x0775
            boolean r4 = r0.f6884h
            if (r4 == 0) goto L_0x05de
            goto L_0x05da
        L_0x0575:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6015i(r3)
            if (r3 <= 0) goto L_0x0775
            boolean r4 = r0.f6884h
            if (r4 == 0) goto L_0x05de
            goto L_0x05da
        L_0x0586:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6003e(r3)
            if (r3 <= 0) goto L_0x0775
            boolean r4 = r0.f6884h
            if (r4 == 0) goto L_0x05de
            goto L_0x05da
        L_0x0597:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m5992b(r3)
            if (r3 <= 0) goto L_0x0775
            boolean r4 = r0.f6884h
            if (r4 == 0) goto L_0x05de
            goto L_0x05da
        L_0x05a8:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m5978a(r3)
            if (r3 <= 0) goto L_0x0775
            boolean r4 = r0.f6884h
            if (r4 == 0) goto L_0x05de
            goto L_0x05da
        L_0x05b9:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6012h(r3)
            if (r3 <= 0) goto L_0x0775
            boolean r4 = r0.f6884h
            if (r4 == 0) goto L_0x05de
            goto L_0x05da
        L_0x05ca:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6015i(r3)
            if (r3 <= 0) goto L_0x0775
            boolean r4 = r0.f6884h
            if (r4 == 0) goto L_0x05de
        L_0x05da:
            long r4 = (long) r11
            r2.putInt(r1, r4, r3)
        L_0x05de:
            int r4 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6256f(r12)
            int r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6260h(r3)
            int r5 = r5 + r4
            int r5 = r5 + r3
            int r5 = r5 + r8
            r8 = r5
            goto L_0x0775
        L_0x05ec:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6002e(r12, r3)
            goto L_0x0774
        L_0x05f8:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6014i(r12, r3)
            goto L_0x0774
        L_0x0604:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6005f(r12, r3)
            goto L_0x0774
        L_0x0610:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6011h(r12, r3)
            goto L_0x0774
        L_0x061c:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m5996c(r12, r3)
            goto L_0x0774
        L_0x0628:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            q.b.a.b.g.e.g8 r4 = r0.mo8017a(r7)
            int r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m5977a(r12, r3, r4)
            goto L_0x0774
        L_0x0638:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m5976a(r12, r3)
            goto L_0x0774
        L_0x0644:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6022l(r12, r3)
            goto L_0x0774
        L_0x0650:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6008g(r12, r3)
            goto L_0x0774
        L_0x065c:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m5999d(r12, r3)
            goto L_0x0774
        L_0x0668:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m5990b(r12, r3)
            goto L_0x0774
        L_0x0674:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6017j(r12, r3)
            goto L_0x0774
        L_0x0680:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6020k(r12, r3)
            goto L_0x0774
        L_0x068c:
            r5 = r9 & r15
            if (r5 == 0) goto L_0x0775
        L_0x0690:
            java.lang.Object r3 = r2.getObject(r1, r3)
            q.b.a.b.g.e.p7 r3 = (p213q.p217b.p218a.p231b.p251g.p256e.C2619p7) r3
            q.b.a.b.g.e.g8 r4 = r0.mo8017a(r7)
            int r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6230a(r12, r3, r4)
            goto L_0x0774
        L_0x06a0:
            r5 = r9 & r15
            if (r5 == 0) goto L_0x0775
            long r3 = r2.getLong(r1, r3)
        L_0x06a8:
            int r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6245c(r12, r3)
            goto L_0x0774
        L_0x06ae:
            r5 = r9 & r15
            if (r5 == 0) goto L_0x0775
            int r3 = r2.getInt(r1, r3)
        L_0x06b6:
            int r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6249d(r12, r3)
            goto L_0x0774
        L_0x06bc:
            r3 = r9 & r15
            if (r3 == 0) goto L_0x0775
        L_0x06c0:
            int r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6263k(r12)
            goto L_0x0774
        L_0x06c6:
            r3 = r9 & r15
            if (r3 == 0) goto L_0x0775
        L_0x06ca:
            int r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6265m(r12)
            goto L_0x0774
        L_0x06d0:
            r5 = r9 & r15
            if (r5 == 0) goto L_0x0775
            int r3 = r2.getInt(r1, r3)
        L_0x06d8:
            int r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6253e(r12, r3)
            goto L_0x0774
        L_0x06de:
            r5 = r9 & r15
            if (r5 == 0) goto L_0x0775
            int r3 = r2.getInt(r1, r3)
        L_0x06e6:
            int r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6244c(r12, r3)
            goto L_0x0774
        L_0x06ec:
            r5 = r9 & r15
            if (r5 == 0) goto L_0x0775
        L_0x06f0:
            java.lang.Object r3 = r2.getObject(r1, r3)
            goto L_0x0713
        L_0x06f5:
            r5 = r9 & r15
            if (r5 == 0) goto L_0x0775
        L_0x06f9:
            java.lang.Object r3 = r2.getObject(r1, r3)
            q.b.a.b.g.e.g8 r4 = r0.mo8017a(r7)
            int r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m5975a(r12, r3, r4)
            goto L_0x0774
        L_0x0707:
            r5 = r9 & r15
            if (r5 == 0) goto L_0x0775
            java.lang.Object r3 = r2.getObject(r1, r3)
            boolean r4 = r3 instanceof p213q.p217b.p218a.p231b.p251g.p256e.C2435f5
            if (r4 == 0) goto L_0x071a
        L_0x0713:
            q.b.a.b.g.e.f5 r3 = (p213q.p217b.p218a.p231b.p251g.p256e.C2435f5) r3
            int r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6229a(r12, r3)
            goto L_0x0774
        L_0x071a:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6228a(r12, r3)
            goto L_0x0774
        L_0x0721:
            r3 = r9 & r15
            if (r3 == 0) goto L_0x0775
        L_0x0725:
            int r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6252e(r12)
            goto L_0x0774
        L_0x072a:
            r3 = r9 & r15
            if (r3 == 0) goto L_0x0775
        L_0x072e:
            int r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6264l(r12)
            goto L_0x0774
        L_0x0733:
            r3 = r9 & r15
            if (r3 == 0) goto L_0x0775
        L_0x0737:
            int r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6261i(r12)
            goto L_0x0774
        L_0x073c:
            r5 = r9 & r15
            if (r5 == 0) goto L_0x0775
            int r3 = r2.getInt(r1, r3)
        L_0x0744:
            int r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6239b(r12, r3)
            goto L_0x0774
        L_0x0749:
            r5 = r9 & r15
            if (r5 == 0) goto L_0x0775
            long r3 = r2.getLong(r1, r3)
        L_0x0751:
            int r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6240b(r12, r3)
            goto L_0x0774
        L_0x0756:
            r5 = r9 & r15
            if (r5 == 0) goto L_0x0775
            long r3 = r2.getLong(r1, r3)
        L_0x075e:
            int r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6227a(r12, r3)
            goto L_0x0774
        L_0x0763:
            r3 = r9 & r15
            if (r3 == 0) goto L_0x0775
        L_0x0767:
            int r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.mo7946b(r12)
            goto L_0x0774
        L_0x076c:
            r3 = r9 & r15
            if (r3 == 0) goto L_0x0775
        L_0x0770:
            int r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.m6248d(r12)
        L_0x0774:
            int r8 = r8 + r3
        L_0x0775:
            int r7 = r7 + 3
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r4 = 267386880(0xff00000, float:2.3665827E-29)
            r5 = 0
            goto L_0x03c7
        L_0x077f:
            q.b.a.b.g.e.u8<?, ?> r2 = r0.f6890n
            q.b.a.b.g.e.w8 r2 = (p213q.p217b.p218a.p231b.p251g.p256e.C2734w8) r2
            if (r2 == 0) goto L_0x07ea
            r2 = r1
            q.b.a.b.g.e.i6 r2 = (p213q.p217b.p218a.p231b.p251g.p256e.C2490i6) r2
            q.b.a.b.g.e.t8 r2 = r2.zzb
            int r2 = r2.mo8032a()
            int r2 = r2 + r8
            boolean r3 = r0.f6882f
            if (r3 == 0) goto L_0x07e9
            q.b.a.b.g.e.w5<?> r3 = r0.f6891o
            q.b.a.b.g.e.v5 r3 = (p213q.p217b.p218a.p231b.p251g.p256e.C2715v5) r3
            if (r3 == 0) goto L_0x07e7
            q.b.a.b.g.e.i6$b r1 = (p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2492b) r1
            q.b.a.b.g.e.x5<q.b.a.b.g.e.i6$e> r1 = r1.zzc
            r3 = 0
            r4 = 0
        L_0x079f:
            q.b.a.b.g.e.h8<T, java.lang.Object> r5 = r1.f6958a
            int r5 = r5.mo7710b()
            if (r3 >= r5) goto L_0x07bf
            q.b.a.b.g.e.h8<T, java.lang.Object> r5 = r1.f6958a
            java.util.Map$Entry r5 = r5.mo7708a(r3)
            java.lang.Object r6 = r5.getKey()
            q.b.a.b.g.e.z5 r6 = (p213q.p217b.p218a.p231b.p251g.p256e.C2778z5) r6
            java.lang.Object r5 = r5.getValue()
            int r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2746x5.m6531b(r6, r5)
            int r4 = r4 + r5
            int r3 = r3 + 1
            goto L_0x079f
        L_0x07bf:
            q.b.a.b.g.e.h8<T, java.lang.Object> r1 = r1.f6958a
            java.lang.Iterable r1 = r1.mo7712c()
            java.util.Iterator r1 = r1.iterator()
        L_0x07c9:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x07e5
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r5 = r3.getKey()
            q.b.a.b.g.e.z5 r5 = (p213q.p217b.p218a.p231b.p251g.p256e.C2778z5) r5
            java.lang.Object r3 = r3.getValue()
            int r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2746x5.m6531b(r5, r3)
            int r4 = r4 + r3
            goto L_0x07c9
        L_0x07e5:
            int r2 = r2 + r4
            goto L_0x07e9
        L_0x07e7:
            r1 = 0
            throw r1
        L_0x07e9:
            return r2
        L_0x07ea:
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p251g.p256e.C2684t7.mo7686d(java.lang.Object):int");
    }

    /* renamed from: e */
    public final int mo8031e(int i) {
        return this.f6877a[i + 2];
    }

    /* renamed from: b */
    public final void mo8025b(T t, int i, int i2) {
        C2366b9.f6344f.mo7430a((Object) t, (long) (this.f6877a[i2 + 2] & 1048575), i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02fb, code lost:
        r15 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x04d2, code lost:
        r9 = r9 + 3;
        r4 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x04e0  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x04e6  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8027b(T r17, p213q.p217b.p218a.p231b.p251g.p256e.C2584n9 r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            boolean r3 = r0.f6882f
            r4 = 0
            if (r3 == 0) goto L_0x002a
            q.b.a.b.g.e.w5<?> r3 = r0.f6891o
            q.b.a.b.g.e.v5 r3 = (p213q.p217b.p218a.p231b.p251g.p256e.C2715v5) r3
            if (r3 == 0) goto L_0x0029
            r3 = r1
            q.b.a.b.g.e.i6$b r3 = (p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2492b) r3
            q.b.a.b.g.e.x5<q.b.a.b.g.e.i6$e> r3 = r3.zzc
            q.b.a.b.g.e.h8<T, java.lang.Object> r5 = r3.f6958a
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x002a
            java.util.Iterator r3 = r3.mo8095b()
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            goto L_0x002b
        L_0x0029:
            throw r4
        L_0x002a:
            r3 = r4
        L_0x002b:
            int[] r5 = r0.f6877a
            int r5 = r5.length
            sun.misc.Unsafe r6 = f6876r
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r7
            r9 = 0
            r11 = 0
        L_0x0036:
            if (r9 >= r5) goto L_0x04de
            int r12 = r0.mo8030d(r9)
            int[] r13 = r0.f6877a
            r14 = r13[r9]
            r15 = 267386880(0xff00000, float:2.3665827E-29)
            r15 = r15 & r12
            int r15 = r15 >>> 20
            boolean r4 = r0.f6883g
            r8 = 1
            if (r4 != 0) goto L_0x0061
            r4 = 17
            if (r15 > r4) goto L_0x0061
            int r4 = r9 + 2
            r4 = r13[r4]
            r13 = r4 & r7
            if (r13 == r10) goto L_0x005c
            long r10 = (long) r13
            int r11 = r6.getInt(r1, r10)
            r10 = r13
        L_0x005c:
            int r4 = r4 >>> 20
            int r4 = r8 << r4
            goto L_0x0062
        L_0x0061:
            r4 = 0
        L_0x0062:
            if (r3 != 0) goto L_0x04d7
            r12 = r12 & r7
            long r12 = (long) r12
            switch(r15) {
                case 0: goto L_0x04c4;
                case 1: goto L_0x04b5;
                case 2: goto L_0x04a6;
                case 3: goto L_0x0497;
                case 4: goto L_0x0486;
                case 5: goto L_0x0477;
                case 6: goto L_0x0468;
                case 7: goto L_0x0458;
                case 8: goto L_0x044b;
                case 9: goto L_0x0437;
                case 10: goto L_0x0425;
                case 11: goto L_0x0415;
                case 12: goto L_0x0403;
                case 13: goto L_0x03f3;
                case 14: goto L_0x03e3;
                case 15: goto L_0x03d3;
                case 16: goto L_0x03c3;
                case 17: goto L_0x03af;
                case 18: goto L_0x039f;
                case 19: goto L_0x038f;
                case 20: goto L_0x037f;
                case 21: goto L_0x036f;
                case 22: goto L_0x035f;
                case 23: goto L_0x034f;
                case 24: goto L_0x033f;
                case 25: goto L_0x032f;
                case 26: goto L_0x0320;
                case 27: goto L_0x030d;
                case 28: goto L_0x02fe;
                case 29: goto L_0x02ed;
                case 30: goto L_0x02de;
                case 31: goto L_0x02cf;
                case 32: goto L_0x02c0;
                case 33: goto L_0x02b1;
                case 34: goto L_0x02a2;
                case 35: goto L_0x0293;
                case 36: goto L_0x0284;
                case 37: goto L_0x0275;
                case 38: goto L_0x0266;
                case 39: goto L_0x0257;
                case 40: goto L_0x0248;
                case 41: goto L_0x0239;
                case 42: goto L_0x022a;
                case 43: goto L_0x021b;
                case 44: goto L_0x020c;
                case 45: goto L_0x01fd;
                case 46: goto L_0x01ee;
                case 47: goto L_0x01df;
                case 48: goto L_0x01d0;
                case 49: goto L_0x01bd;
                case 50: goto L_0x01b4;
                case 51: goto L_0x01a2;
                case 52: goto L_0x0190;
                case 53: goto L_0x017e;
                case 54: goto L_0x016c;
                case 55: goto L_0x0158;
                case 56: goto L_0x0146;
                case 57: goto L_0x0134;
                case 58: goto L_0x0122;
                case 59: goto L_0x0113;
                case 60: goto L_0x00fd;
                case 61: goto L_0x00e9;
                case 62: goto L_0x00d8;
                case 63: goto L_0x00c5;
                case 64: goto L_0x00b4;
                case 65: goto L_0x00a3;
                case 66: goto L_0x0092;
                case 67: goto L_0x0081;
                case 68: goto L_0x006c;
                default: goto L_0x0069;
            }
        L_0x0069:
            r15 = 0
            goto L_0x04d2
        L_0x006c:
            boolean r4 = r0.mo8021a((T) r1, r14, r9)
            if (r4 == 0) goto L_0x0069
            java.lang.Object r4 = r6.getObject(r1, r12)
            q.b.a.b.g.e.g8 r8 = r0.mo8017a(r9)
            r12 = r2
            q.b.a.b.g.e.r5 r12 = (p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r12
            r12.mo7987b(r14, r4, r8)
            goto L_0x0069
        L_0x0081:
            boolean r4 = r0.mo8021a((T) r1, r14, r9)
            if (r4 == 0) goto L_0x0069
            long r12 = m6406e(r1, r12)
            r4 = r2
            q.b.a.b.g.e.r5 r4 = (p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r4
            r4.mo7992e(r14, r12)
            goto L_0x0069
        L_0x0092:
            boolean r4 = r0.mo8021a((T) r1, r14, r9)
            if (r4 == 0) goto L_0x0069
            int r4 = m6405d(r1, r12)
            r8 = r2
            q.b.a.b.g.e.r5 r8 = (p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r8
            r8.mo7990d(r14, r4)
            goto L_0x0069
        L_0x00a3:
            boolean r4 = r0.mo8021a((T) r1, r14, r9)
            if (r4 == 0) goto L_0x0069
            long r12 = m6406e(r1, r12)
            r4 = r2
            q.b.a.b.g.e.r5 r4 = (p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r4
            r4.mo7986b(r14, r12)
            goto L_0x0069
        L_0x00b4:
            boolean r4 = r0.mo8021a((T) r1, r14, r9)
            if (r4 == 0) goto L_0x0069
            int r4 = m6405d(r1, r12)
            r8 = r2
            q.b.a.b.g.e.r5 r8 = (p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r8
            r8.mo7979a(r14, r4)
            goto L_0x0069
        L_0x00c5:
            boolean r4 = r0.mo8021a((T) r1, r14, r9)
            if (r4 == 0) goto L_0x0069
            int r4 = m6405d(r1, r12)
            r8 = r2
            q.b.a.b.g.e.r5 r8 = (p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r8
            q.b.a.b.g.e.p5 r8 = r8.f6834a
            r8.mo7944a(r14, r4)
            goto L_0x0069
        L_0x00d8:
            boolean r4 = r0.mo8021a((T) r1, r14, r9)
            if (r4 == 0) goto L_0x0069
            int r4 = m6405d(r1, r12)
            r8 = r2
            q.b.a.b.g.e.r5 r8 = (p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r8
            r8.mo7988c(r14, r4)
            goto L_0x0069
        L_0x00e9:
            boolean r4 = r0.mo8021a((T) r1, r14, r9)
            if (r4 == 0) goto L_0x0069
            java.lang.Object r4 = r6.getObject(r1, r12)
            q.b.a.b.g.e.f5 r4 = (p213q.p217b.p218a.p231b.p251g.p256e.C2435f5) r4
            r8 = r2
            q.b.a.b.g.e.r5 r8 = (p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r8
            r8.mo7983a(r14, r4)
            goto L_0x0069
        L_0x00fd:
            boolean r4 = r0.mo8021a((T) r1, r14, r9)
            if (r4 == 0) goto L_0x0069
            java.lang.Object r4 = r6.getObject(r1, r12)
            q.b.a.b.g.e.g8 r8 = r0.mo8017a(r9)
            r12 = r2
            q.b.a.b.g.e.r5 r12 = (p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r12
            r12.mo7982a(r14, r4, r8)
            goto L_0x0069
        L_0x0113:
            boolean r4 = r0.mo8021a((T) r1, r14, r9)
            if (r4 == 0) goto L_0x0069
            java.lang.Object r4 = r6.getObject(r1, r12)
            m6401a(r14, r4, r2)
            goto L_0x0069
        L_0x0122:
            boolean r4 = r0.mo8021a((T) r1, r14, r9)
            if (r4 == 0) goto L_0x0069
            boolean r4 = m6408f(r1, r12)
            r8 = r2
            q.b.a.b.g.e.r5 r8 = (p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r8
            r8.mo7984a(r14, r4)
            goto L_0x0069
        L_0x0134:
            boolean r4 = r0.mo8021a((T) r1, r14, r9)
            if (r4 == 0) goto L_0x0069
            int r4 = m6405d(r1, r12)
            r8 = r2
            q.b.a.b.g.e.r5 r8 = (p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r8
            r8.mo7985b(r14, r4)
            goto L_0x0069
        L_0x0146:
            boolean r4 = r0.mo8021a((T) r1, r14, r9)
            if (r4 == 0) goto L_0x0069
            long r12 = m6406e(r1, r12)
            r4 = r2
            q.b.a.b.g.e.r5 r4 = (p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r4
            r4.mo7991d(r14, r12)
            goto L_0x0069
        L_0x0158:
            boolean r4 = r0.mo8021a((T) r1, r14, r9)
            if (r4 == 0) goto L_0x0069
            int r4 = m6405d(r1, r12)
            r8 = r2
            q.b.a.b.g.e.r5 r8 = (p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r8
            q.b.a.b.g.e.p5 r8 = r8.f6834a
            r8.mo7944a(r14, r4)
            goto L_0x0069
        L_0x016c:
            boolean r4 = r0.mo8021a((T) r1, r14, r9)
            if (r4 == 0) goto L_0x0069
            long r12 = m6406e(r1, r12)
            r4 = r2
            q.b.a.b.g.e.r5 r4 = (p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r4
            r4.mo7989c(r14, r12)
            goto L_0x0069
        L_0x017e:
            boolean r4 = r0.mo8021a((T) r1, r14, r9)
            if (r4 == 0) goto L_0x0069
            long r12 = m6406e(r1, r12)
            r4 = r2
            q.b.a.b.g.e.r5 r4 = (p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r4
            r4.mo7980a(r14, r12)
            goto L_0x0069
        L_0x0190:
            boolean r4 = r0.mo8021a((T) r1, r14, r9)
            if (r4 == 0) goto L_0x0069
            float r4 = m6404c(r1, r12)
            r8 = r2
            q.b.a.b.g.e.r5 r8 = (p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r8
            r8.mo7978a(r14, r4)
            goto L_0x0069
        L_0x01a2:
            boolean r4 = r0.mo8021a((T) r1, r14, r9)
            if (r4 == 0) goto L_0x0069
            double r12 = m6403b((T) r1, r12)
            r4 = r2
            q.b.a.b.g.e.r5 r4 = (p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r4
            r4.mo7977a(r14, r12)
            goto L_0x0069
        L_0x01b4:
            java.lang.Object r4 = r6.getObject(r1, r12)
            r0.mo8019a(r2, r14, r4, r9)
            goto L_0x0069
        L_0x01bd:
            int[] r4 = r0.f6877a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            q.b.a.b.g.e.g8 r12 = r0.mo8017a(r9)
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m5994b(r4, r8, r2, r12)
            goto L_0x0069
        L_0x01d0:
            int[] r4 = r0.f6877a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6004e(r4, r12, r2, r8)
            goto L_0x0069
        L_0x01df:
            int[] r4 = r0.f6877a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6019j(r4, r12, r2, r8)
            goto L_0x0069
        L_0x01ee:
            int[] r4 = r0.f6877a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6010g(r4, r12, r2, r8)
            goto L_0x0069
        L_0x01fd:
            int[] r4 = r0.f6877a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6023l(r4, r12, r2, r8)
            goto L_0x0069
        L_0x020c:
            int[] r4 = r0.f6877a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6024m(r4, r12, r2, r8)
            goto L_0x0069
        L_0x021b:
            int[] r4 = r0.f6877a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6016i(r4, r12, r2, r8)
            goto L_0x0069
        L_0x022a:
            int[] r4 = r0.f6877a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6025n(r4, r12, r2, r8)
            goto L_0x0069
        L_0x0239:
            int[] r4 = r0.f6877a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6021k(r4, r12, r2, r8)
            goto L_0x0069
        L_0x0248:
            int[] r4 = r0.f6877a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6007f(r4, r12, r2, r8)
            goto L_0x0069
        L_0x0257:
            int[] r4 = r0.f6877a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6013h(r4, r12, r2, r8)
            goto L_0x0069
        L_0x0266:
            int[] r4 = r0.f6877a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6001d(r4, r12, r2, r8)
            goto L_0x0069
        L_0x0275:
            int[] r4 = r0.f6877a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m5998c(r4, r12, r2, r8)
            goto L_0x0069
        L_0x0284:
            int[] r4 = r0.f6877a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m5995b(r4, r12, r2, r8)
            goto L_0x0069
        L_0x0293:
            int[] r4 = r0.f6877a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m5984a(r4, r12, r2, r8)
            goto L_0x0069
        L_0x02a2:
            int[] r4 = r0.f6877a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            r14 = 0
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6004e(r4, r8, r2, r14)
            goto L_0x02fb
        L_0x02b1:
            r14 = 0
            int[] r4 = r0.f6877a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6019j(r4, r8, r2, r14)
            goto L_0x02fb
        L_0x02c0:
            r14 = 0
            int[] r4 = r0.f6877a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6010g(r4, r8, r2, r14)
            goto L_0x02fb
        L_0x02cf:
            r14 = 0
            int[] r4 = r0.f6877a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6023l(r4, r8, r2, r14)
            goto L_0x02fb
        L_0x02de:
            r14 = 0
            int[] r4 = r0.f6877a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6024m(r4, r8, r2, r14)
            goto L_0x02fb
        L_0x02ed:
            r14 = 0
            int[] r4 = r0.f6877a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6016i(r4, r8, r2, r14)
        L_0x02fb:
            r15 = r14
            goto L_0x04d2
        L_0x02fe:
            int[] r4 = r0.f6877a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m5993b(r4, r8, r2)
            goto L_0x0069
        L_0x030d:
            int[] r4 = r0.f6877a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            q.b.a.b.g.e.g8 r12 = r0.mo8017a(r9)
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m5983a(r4, r8, r2, r12)
            goto L_0x0069
        L_0x0320:
            int[] r4 = r0.f6877a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m5982a(r4, r8, r2)
            goto L_0x0069
        L_0x032f:
            int[] r4 = r0.f6877a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            r15 = 0
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6025n(r4, r8, r2, r15)
            goto L_0x04d2
        L_0x033f:
            r15 = 0
            int[] r4 = r0.f6877a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6021k(r4, r8, r2, r15)
            goto L_0x04d2
        L_0x034f:
            r15 = 0
            int[] r4 = r0.f6877a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6007f(r4, r8, r2, r15)
            goto L_0x04d2
        L_0x035f:
            r15 = 0
            int[] r4 = r0.f6877a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6013h(r4, r8, r2, r15)
            goto L_0x04d2
        L_0x036f:
            r15 = 0
            int[] r4 = r0.f6877a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6001d(r4, r8, r2, r15)
            goto L_0x04d2
        L_0x037f:
            r15 = 0
            int[] r4 = r0.f6877a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m5998c(r4, r8, r2, r15)
            goto L_0x04d2
        L_0x038f:
            r15 = 0
            int[] r4 = r0.f6877a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m5995b(r4, r8, r2, r15)
            goto L_0x04d2
        L_0x039f:
            r15 = 0
            int[] r4 = r0.f6877a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m5984a(r4, r8, r2, r15)
            goto L_0x04d2
        L_0x03af:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x04d2
            java.lang.Object r4 = r6.getObject(r1, r12)
            q.b.a.b.g.e.g8 r8 = r0.mo8017a(r9)
            r12 = r2
            q.b.a.b.g.e.r5 r12 = (p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r12
            r12.mo7987b(r14, r4, r8)
            goto L_0x04d2
        L_0x03c3:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x04d2
            long r12 = r6.getLong(r1, r12)
            r4 = r2
            q.b.a.b.g.e.r5 r4 = (p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r4
            r4.mo7992e(r14, r12)
            goto L_0x04d2
        L_0x03d3:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x04d2
            int r4 = r6.getInt(r1, r12)
            r8 = r2
            q.b.a.b.g.e.r5 r8 = (p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r8
            r8.mo7990d(r14, r4)
            goto L_0x04d2
        L_0x03e3:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x04d2
            long r12 = r6.getLong(r1, r12)
            r4 = r2
            q.b.a.b.g.e.r5 r4 = (p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r4
            r4.mo7986b(r14, r12)
            goto L_0x04d2
        L_0x03f3:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x04d2
            int r4 = r6.getInt(r1, r12)
            r8 = r2
            q.b.a.b.g.e.r5 r8 = (p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r8
            r8.mo7979a(r14, r4)
            goto L_0x04d2
        L_0x0403:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x04d2
            int r4 = r6.getInt(r1, r12)
            r8 = r2
            q.b.a.b.g.e.r5 r8 = (p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r8
            q.b.a.b.g.e.p5 r8 = r8.f6834a
            r8.mo7944a(r14, r4)
            goto L_0x04d2
        L_0x0415:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x04d2
            int r4 = r6.getInt(r1, r12)
            r8 = r2
            q.b.a.b.g.e.r5 r8 = (p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r8
            r8.mo7988c(r14, r4)
            goto L_0x04d2
        L_0x0425:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x04d2
            java.lang.Object r4 = r6.getObject(r1, r12)
            q.b.a.b.g.e.f5 r4 = (p213q.p217b.p218a.p231b.p251g.p256e.C2435f5) r4
            r8 = r2
            q.b.a.b.g.e.r5 r8 = (p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r8
            r8.mo7983a(r14, r4)
            goto L_0x04d2
        L_0x0437:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x04d2
            java.lang.Object r4 = r6.getObject(r1, r12)
            q.b.a.b.g.e.g8 r8 = r0.mo8017a(r9)
            r12 = r2
            q.b.a.b.g.e.r5 r12 = (p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r12
            r12.mo7982a(r14, r4, r8)
            goto L_0x04d2
        L_0x044b:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x04d2
            java.lang.Object r4 = r6.getObject(r1, r12)
            m6401a(r14, r4, r2)
            goto L_0x04d2
        L_0x0458:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x04d2
            boolean r4 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5492c(r1, r12)
            r8 = r2
            q.b.a.b.g.e.r5 r8 = (p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r8
            r8.mo7984a(r14, r4)
            goto L_0x04d2
        L_0x0468:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x04d2
            int r4 = r6.getInt(r1, r12)
            r8 = r2
            q.b.a.b.g.e.r5 r8 = (p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r8
            r8.mo7985b(r14, r4)
            goto L_0x04d2
        L_0x0477:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x04d2
            long r12 = r6.getLong(r1, r12)
            r4 = r2
            q.b.a.b.g.e.r5 r4 = (p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r4
            r4.mo7991d(r14, r12)
            goto L_0x04d2
        L_0x0486:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x04d2
            int r4 = r6.getInt(r1, r12)
            r8 = r2
            q.b.a.b.g.e.r5 r8 = (p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r8
            q.b.a.b.g.e.p5 r8 = r8.f6834a
            r8.mo7944a(r14, r4)
            goto L_0x04d2
        L_0x0497:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x04d2
            long r12 = r6.getLong(r1, r12)
            r4 = r2
            q.b.a.b.g.e.r5 r4 = (p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r4
            r4.mo7989c(r14, r12)
            goto L_0x04d2
        L_0x04a6:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x04d2
            long r12 = r6.getLong(r1, r12)
            r4 = r2
            q.b.a.b.g.e.r5 r4 = (p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r4
            r4.mo7980a(r14, r12)
            goto L_0x04d2
        L_0x04b5:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x04d2
            float r4 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5493d(r1, r12)
            r8 = r2
            q.b.a.b.g.e.r5 r8 = (p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r8
            r8.mo7978a(r14, r4)
            goto L_0x04d2
        L_0x04c4:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x04d2
            double r12 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5495e(r1, r12)
            r4 = r2
            q.b.a.b.g.e.r5 r4 = (p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r4
            r4.mo7977a(r14, r12)
        L_0x04d2:
            int r9 = r9 + 3
            r4 = 0
            goto L_0x0036
        L_0x04d7:
            q.b.a.b.g.e.w5<?> r1 = r0.f6891o
            r1.mo8057a(r3)
            r4 = 0
            throw r4
        L_0x04de:
            if (r3 != 0) goto L_0x04e6
            q.b.a.b.g.e.u8<?, ?> r3 = r0.f6890n
            m6402a(r3, (T) r1, r2)
            return
        L_0x04e6:
            q.b.a.b.g.e.w5<?> r1 = r0.f6891o
            r1.mo8058a(r2, r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p251g.p256e.C2684t7.mo8027b(java.lang.Object, q.b.a.b.g.e.n9):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0139, code lost:
        r3 = java.lang.Integer.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0146, code lost:
        r3 = java.lang.Long.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x014a, code lost:
        r12.putObject(r1, r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0159, code lost:
        r12.putObject(r1, r9, r2);
        r2 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0169, code lost:
        r12.putObject(r1, r9, r2);
        r2 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x016e, code lost:
        r12.putInt(r1, r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        return r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo8013a(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, p213q.p217b.p218a.p231b.p251g.p256e.C2362b5 r29) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r2 = r21
            r8 = r22
            r5 = r23
            r9 = r26
            r6 = r28
            r11 = r29
            sun.misc.Unsafe r12 = f6876r
            int[] r7 = r0.f6877a
            int r13 = r6 + 2
            r7 = r7[r13]
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r13
            long r13 = (long) r7
            r7 = 3
            r15 = 1
            switch(r25) {
                case 51: goto L_0x015f;
                case 52: goto L_0x014e;
                case 53: goto L_0x013e;
                case 54: goto L_0x013e;
                case 55: goto L_0x0131;
                case 56: goto L_0x0126;
                case 57: goto L_0x011a;
                case 58: goto L_0x0105;
                case 59: goto L_0x00d6;
                case 60: goto L_0x00b1;
                case 61: goto L_0x00a6;
                case 62: goto L_0x0131;
                case 63: goto L_0x0073;
                case 64: goto L_0x011a;
                case 65: goto L_0x0126;
                case 66: goto L_0x0065;
                case 67: goto L_0x0057;
                case 68: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x0172
        L_0x0028:
            if (r5 != r7) goto L_0x0172
            r2 = r2 & -8
            r7 = r2 | 4
            q.b.a.b.g.e.g8 r2 = r0.mo8017a(r6)
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r7
            r7 = r29
            int r2 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5161a(r2, r3, r4, r5, r6, r7)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x004a
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x004b
        L_0x004a:
            r15 = 0
        L_0x004b:
            java.lang.Object r3 = r11.f6331c
            if (r15 != 0) goto L_0x0051
            goto L_0x014a
        L_0x0051:
            java.lang.Object r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2546l6.m6113a(r15, r3)
            goto L_0x014a
        L_0x0057:
            if (r5 != 0) goto L_0x0172
            int r2 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5274b(r3, r4, r11)
            long r3 = r11.f6330b
            long r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2597o5.m6202a(r3)
            goto L_0x0146
        L_0x0065:
            if (r5 != 0) goto L_0x0172
            int r2 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5166a(r3, r4, r11)
            int r3 = r11.f6329a
            int r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2597o5.m6201a(r3)
            goto L_0x0139
        L_0x0073:
            if (r5 != 0) goto L_0x0172
            int r3 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5166a(r3, r4, r11)
            int r4 = r11.f6329a
            java.lang.Object[] r5 = r0.f6878b
            int r6 = r6 / r7
            int r6 = r6 << r15
            int r6 = r6 + r15
            r5 = r5[r6]
            q.b.a.b.g.e.m6 r5 = (p213q.p217b.p218a.p231b.p251g.p256e.C2563m6) r5
            if (r5 == 0) goto L_0x009c
            boolean r5 = r5.mo7788a(r4)
            if (r5 == 0) goto L_0x008d
            goto L_0x009c
        L_0x008d:
            q.b.a.b.g.e.t8 r1 = m6407e(r17)
            long r4 = (long) r4
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.mo8033a(r2, r4)
            r2 = r3
            goto L_0x0173
        L_0x009c:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r12.putObject(r1, r9, r2)
            r2 = r3
            goto L_0x016e
        L_0x00a6:
            r2 = 2
            if (r5 != r2) goto L_0x0172
            int r2 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5327e(r3, r4, r11)
            java.lang.Object r3 = r11.f6331c
            goto L_0x014a
        L_0x00b1:
            r2 = 2
            if (r5 != r2) goto L_0x0172
            q.b.a.b.g.e.g8 r2 = r0.mo8017a(r6)
            r5 = r20
            int r2 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5162a(r2, r3, r4, r5, r11)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x00c9
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x00ca
        L_0x00c9:
            r15 = 0
        L_0x00ca:
            java.lang.Object r3 = r11.f6331c
            if (r15 != 0) goto L_0x00d0
            goto L_0x014a
        L_0x00d0:
            java.lang.Object r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2546l6.m6113a(r15, r3)
            goto L_0x014a
        L_0x00d6:
            r2 = 2
            if (r5 != r2) goto L_0x0172
            int r2 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5166a(r3, r4, r11)
            int r4 = r11.f6329a
            if (r4 != 0) goto L_0x00e4
            java.lang.String r3 = ""
            goto L_0x014a
        L_0x00e4:
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r24 & r5
            if (r5 == 0) goto L_0x00f8
            int r5 = r2 + r4
            boolean r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2387c9.m5604a(r3, r2, r5)
            if (r5 == 0) goto L_0x00f3
            goto L_0x00f8
        L_0x00f3:
            q.b.a.b.g.e.p6 r1 = p213q.p217b.p218a.p231b.p251g.p256e.C2618p6.m6295f()
            throw r1
        L_0x00f8:
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = p213q.p217b.p218a.p231b.p251g.p256e.C2546l6.f6704a
            r5.<init>(r3, r2, r4, r6)
            r12.putObject(r1, r9, r5)
            int r2 = r2 + r4
            goto L_0x016e
        L_0x0105:
            if (r5 != 0) goto L_0x0172
            int r2 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5274b(r3, r4, r11)
            long r3 = r11.f6330b
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0114
            goto L_0x0115
        L_0x0114:
            r15 = 0
        L_0x0115:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r15)
            goto L_0x014a
        L_0x011a:
            r2 = 5
            if (r5 != r2) goto L_0x0172
            int r2 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5336f(r18, r19)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0159
        L_0x0126:
            if (r5 != r15) goto L_0x0172
            long r2 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5343g(r18, r19)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            goto L_0x0169
        L_0x0131:
            if (r5 != 0) goto L_0x0172
            int r2 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5166a(r3, r4, r11)
            int r3 = r11.f6329a
        L_0x0139:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x014a
        L_0x013e:
            if (r5 != 0) goto L_0x0172
            int r2 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5274b(r3, r4, r11)
            long r3 = r11.f6330b
        L_0x0146:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
        L_0x014a:
            r12.putObject(r1, r9, r3)
            goto L_0x016e
        L_0x014e:
            r2 = 5
            if (r5 != r2) goto L_0x0172
            float r2 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5349i(r18, r19)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
        L_0x0159:
            r12.putObject(r1, r9, r2)
            int r2 = r4 + 4
            goto L_0x016e
        L_0x015f:
            if (r5 != r15) goto L_0x0172
            double r2 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5345h(r18, r19)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
        L_0x0169:
            r12.putObject(r1, r9, r2)
            int r2 = r4 + 8
        L_0x016e:
            r12.putInt(r1, r13, r8)
            goto L_0x0173
        L_0x0172:
            r2 = r4
        L_0x0173:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p251g.p256e.C2684t7.mo8013a(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, q.b.a.b.g.e.b5):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0276, code lost:
        if (r7.f6330b != 0) goto L_0x0278;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0278, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x027a, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x027b, code lost:
        r11.mo7506a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x027e, code lost:
        if (r4 >= r5) goto L_0x03df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0280, code lost:
        r6 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5166a(r3, r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0286, code lost:
        if (r2 != r7.f6329a) goto L_0x03df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0288, code lost:
        r4 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5274b(r3, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0290, code lost:
        if (r7.f6330b == 0) goto L_0x027a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0144, code lost:
        if (r4 == 0) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0146, code lost:
        r11.add(p213q.p217b.p218a.p231b.p251g.p256e.C2435f5.f6525f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x014c, code lost:
        r11.add(p213q.p217b.p218a.p231b.p251g.p256e.C2435f5.m5807a(r3, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0154, code lost:
        if (r1 >= r5) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0156, code lost:
        r4 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5166a(r3, r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x015c, code lost:
        if (r2 != r7.f6329a) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x015e, code lost:
        r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5166a(r3, r4, r7);
        r4 = r7.f6329a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0164, code lost:
        if (r4 < 0) goto L_0x0172;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0168, code lost:
        if (r4 > (r3.length - r1)) goto L_0x016d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x016a, code lost:
        if (r4 != 0) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0171, code lost:
        throw p213q.p217b.p218a.p231b.p251g.p256e.C2618p6.m6290a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0176, code lost:
        throw p213q.p217b.p218a.p231b.p251g.p256e.C2618p6.m6291b();
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01c3  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo8014a(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, p213q.p217b.p218a.p231b.p251g.p256e.C2362b5 r30) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r2 = r21
            r6 = r23
            r8 = r24
            r9 = r28
            r7 = r30
            sun.misc.Unsafe r11 = f6876r
            java.lang.Object r11 = r11.getObject(r1, r9)
            q.b.a.b.g.e.q6 r11 = (p213q.p217b.p218a.p231b.p251g.p256e.C2635q6) r11
            boolean r12 = r11.mo7387a()
            r13 = 1
            if (r12 != 0) goto L_0x0036
            int r12 = r11.size()
            if (r12 != 0) goto L_0x002c
            r12 = 10
            goto L_0x002d
        L_0x002c:
            int r12 = r12 << r13
        L_0x002d:
            q.b.a.b.g.e.q6 r11 = r11.mo7414a(r12)
            sun.misc.Unsafe r12 = f6876r
            r12.putObject(r1, r9, r11)
        L_0x0036:
            r9 = 5
            r10 = 3
            r14 = 0
            r12 = 2
            switch(r27) {
                case 18: goto L_0x03a1;
                case 19: goto L_0x0363;
                case 20: goto L_0x032b;
                case 21: goto L_0x032b;
                case 22: goto L_0x0311;
                case 23: goto L_0x02d2;
                case 24: goto L_0x0293;
                case 25: goto L_0x0242;
                case 26: goto L_0x019b;
                case 27: goto L_0x0181;
                case 28: goto L_0x0136;
                case 29: goto L_0x0311;
                case 30: goto L_0x00fa;
                case 31: goto L_0x0293;
                case 32: goto L_0x02d2;
                case 33: goto L_0x00ba;
                case 34: goto L_0x007a;
                case 35: goto L_0x03a1;
                case 36: goto L_0x0363;
                case 37: goto L_0x032b;
                case 38: goto L_0x032b;
                case 39: goto L_0x0311;
                case 40: goto L_0x02d2;
                case 41: goto L_0x0293;
                case 42: goto L_0x0242;
                case 43: goto L_0x0311;
                case 44: goto L_0x00fa;
                case 45: goto L_0x0293;
                case 46: goto L_0x02d2;
                case 47: goto L_0x00ba;
                case 48: goto L_0x007a;
                case 49: goto L_0x0040;
                default: goto L_0x003e;
            }
        L_0x003e:
            goto L_0x03df
        L_0x0040:
            if (r6 != r10) goto L_0x03df
            q.b.a.b.g.e.g8 r1 = r0.mo8017a(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r22 = r1
            r23 = r18
            r24 = r19
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5161a(r22, r23, r24, r25, r26, r27)
        L_0x005a:
            java.lang.Object r8 = r7.f6331c
            r11.add(r8)
            if (r4 >= r5) goto L_0x03df
            int r8 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5166a(r3, r4, r7)
            int r9 = r7.f6329a
            if (r2 != r9) goto L_0x03df
            r22 = r1
            r23 = r18
            r24 = r8
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5161a(r22, r23, r24, r25, r26, r27)
            goto L_0x005a
        L_0x007a:
            if (r6 != r12) goto L_0x009e
            q.b.a.b.g.e.d7 r11 = (p213q.p217b.p218a.p231b.p251g.p256e.C2402d7) r11
            int r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5166a(r3, r4, r7)
            int r2 = r7.f6329a
            int r2 = r2 + r1
        L_0x0085:
            if (r1 >= r2) goto L_0x0095
            int r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5274b(r3, r1, r7)
            long r4 = r7.f6330b
            long r4 = p213q.p217b.p218a.p231b.p251g.p256e.C2597o5.m6202a(r4)
            r11.mo7528a(r4)
            goto L_0x0085
        L_0x0095:
            if (r1 != r2) goto L_0x0099
            goto L_0x03e0
        L_0x0099:
            q.b.a.b.g.e.p6 r1 = p213q.p217b.p218a.p231b.p251g.p256e.C2618p6.m6290a()
            throw r1
        L_0x009e:
            if (r6 != 0) goto L_0x03df
            q.b.a.b.g.e.d7 r11 = (p213q.p217b.p218a.p231b.p251g.p256e.C2402d7) r11
        L_0x00a2:
            int r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5274b(r3, r4, r7)
            long r8 = r7.f6330b
            long r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2597o5.m6202a(r8)
            r11.mo7528a(r8)
            if (r1 >= r5) goto L_0x03e0
            int r4 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5166a(r3, r1, r7)
            int r6 = r7.f6329a
            if (r2 != r6) goto L_0x03e0
            goto L_0x00a2
        L_0x00ba:
            if (r6 != r12) goto L_0x00de
            q.b.a.b.g.e.j6 r11 = (p213q.p217b.p218a.p231b.p251g.p256e.C2512j6) r11
            int r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5166a(r3, r4, r7)
            int r2 = r7.f6329a
            int r2 = r2 + r1
        L_0x00c5:
            if (r1 >= r2) goto L_0x00d5
            int r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5166a(r3, r1, r7)
            int r4 = r7.f6329a
            int r4 = p213q.p217b.p218a.p231b.p251g.p256e.C2597o5.m6201a(r4)
            r11.mo7797f(r4)
            goto L_0x00c5
        L_0x00d5:
            if (r1 != r2) goto L_0x00d9
            goto L_0x03e0
        L_0x00d9:
            q.b.a.b.g.e.p6 r1 = p213q.p217b.p218a.p231b.p251g.p256e.C2618p6.m6290a()
            throw r1
        L_0x00de:
            if (r6 != 0) goto L_0x03df
            q.b.a.b.g.e.j6 r11 = (p213q.p217b.p218a.p231b.p251g.p256e.C2512j6) r11
        L_0x00e2:
            int r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5166a(r3, r4, r7)
            int r4 = r7.f6329a
            int r4 = p213q.p217b.p218a.p231b.p251g.p256e.C2597o5.m6201a(r4)
            r11.mo7797f(r4)
            if (r1 >= r5) goto L_0x03e0
            int r4 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5166a(r3, r1, r7)
            int r6 = r7.f6329a
            if (r2 != r6) goto L_0x03e0
            goto L_0x00e2
        L_0x00fa:
            if (r6 != r12) goto L_0x0101
            int r2 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5167a(r3, r4, r11, r7)
            goto L_0x0112
        L_0x0101:
            if (r6 != 0) goto L_0x03df
            r2 = r21
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r11
            r7 = r30
            int r2 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5147a(r2, r3, r4, r5, r6, r7)
        L_0x0112:
            q.b.a.b.g.e.i6 r1 = (p213q.p217b.p218a.p231b.p251g.p256e.C2490i6) r1
            q.b.a.b.g.e.t8 r3 = r1.zzb
            q.b.a.b.g.e.t8 r4 = p213q.p217b.p218a.p231b.p251g.p256e.C2685t8.f6893f
            if (r3 != r4) goto L_0x011b
            r3 = 0
        L_0x011b:
            java.lang.Object[] r4 = r0.f6878b
            int r5 = r8 / 3
            int r5 = r5 << r13
            int r5 = r5 + r13
            r4 = r4[r5]
            q.b.a.b.g.e.m6 r4 = (p213q.p217b.p218a.p231b.p251g.p256e.C2563m6) r4
            q.b.a.b.g.e.u8<?, ?> r5 = r0.f6890n
            r6 = r22
            java.lang.Object r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m5980a(r6, r11, r4, r3, r5)
            q.b.a.b.g.e.t8 r3 = (p213q.p217b.p218a.p231b.p251g.p256e.C2685t8) r3
            if (r3 == 0) goto L_0x0133
            r1.zzb = r3
        L_0x0133:
            r1 = r2
            goto L_0x03e0
        L_0x0136:
            if (r6 != r12) goto L_0x03df
            int r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5166a(r3, r4, r7)
            int r4 = r7.f6329a
            if (r4 < 0) goto L_0x017c
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0177
            if (r4 != 0) goto L_0x014c
        L_0x0146:
            q.b.a.b.g.e.f5 r4 = p213q.p217b.p218a.p231b.p251g.p256e.C2435f5.f6525f
            r11.add(r4)
            goto L_0x0154
        L_0x014c:
            q.b.a.b.g.e.f5 r6 = p213q.p217b.p218a.p231b.p251g.p256e.C2435f5.m5807a(r3, r1, r4)
            r11.add(r6)
            int r1 = r1 + r4
        L_0x0154:
            if (r1 >= r5) goto L_0x03e0
            int r4 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5166a(r3, r1, r7)
            int r6 = r7.f6329a
            if (r2 != r6) goto L_0x03e0
            int r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5166a(r3, r4, r7)
            int r4 = r7.f6329a
            if (r4 < 0) goto L_0x0172
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x016d
            if (r4 != 0) goto L_0x014c
            goto L_0x0146
        L_0x016d:
            q.b.a.b.g.e.p6 r1 = p213q.p217b.p218a.p231b.p251g.p256e.C2618p6.m6290a()
            throw r1
        L_0x0172:
            q.b.a.b.g.e.p6 r1 = p213q.p217b.p218a.p231b.p251g.p256e.C2618p6.m6291b()
            throw r1
        L_0x0177:
            q.b.a.b.g.e.p6 r1 = p213q.p217b.p218a.p231b.p251g.p256e.C2618p6.m6290a()
            throw r1
        L_0x017c:
            q.b.a.b.g.e.p6 r1 = p213q.p217b.p218a.p231b.p251g.p256e.C2618p6.m6291b()
            throw r1
        L_0x0181:
            if (r6 != r12) goto L_0x03df
            q.b.a.b.g.e.g8 r1 = r0.mo8017a(r8)
            r22 = r1
            r23 = r21
            r24 = r18
            r25 = r19
            r26 = r20
            r27 = r11
            r28 = r30
            int r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5160a(r22, r23, r24, r25, r26, r27, r28)
            goto L_0x03e0
        L_0x019b:
            if (r6 != r12) goto L_0x03df
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r25 & r8
            int r1 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            java.lang.String r6 = ""
            if (r1 != 0) goto L_0x01e8
            int r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5166a(r3, r4, r7)
            int r4 = r7.f6329a
            if (r4 < 0) goto L_0x01e3
            if (r4 != 0) goto L_0x01b6
        L_0x01b2:
            r11.add(r6)
            goto L_0x01c1
        L_0x01b6:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = p213q.p217b.p218a.p231b.p251g.p256e.C2546l6.f6704a
            r8.<init>(r3, r1, r4, r9)
        L_0x01bd:
            r11.add(r8)
            int r1 = r1 + r4
        L_0x01c1:
            if (r1 >= r5) goto L_0x03e0
            int r4 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5166a(r3, r1, r7)
            int r8 = r7.f6329a
            if (r2 != r8) goto L_0x03e0
            int r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5166a(r3, r4, r7)
            int r4 = r7.f6329a
            if (r4 < 0) goto L_0x01de
            if (r4 != 0) goto L_0x01d6
            goto L_0x01b2
        L_0x01d6:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = p213q.p217b.p218a.p231b.p251g.p256e.C2546l6.f6704a
            r8.<init>(r3, r1, r4, r9)
            goto L_0x01bd
        L_0x01de:
            q.b.a.b.g.e.p6 r1 = p213q.p217b.p218a.p231b.p251g.p256e.C2618p6.m6291b()
            throw r1
        L_0x01e3:
            q.b.a.b.g.e.p6 r1 = p213q.p217b.p218a.p231b.p251g.p256e.C2618p6.m6291b()
            throw r1
        L_0x01e8:
            int r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5166a(r3, r4, r7)
            int r4 = r7.f6329a
            if (r4 < 0) goto L_0x023d
            if (r4 != 0) goto L_0x01f6
        L_0x01f2:
            r11.add(r6)
            goto L_0x0209
        L_0x01f6:
            int r8 = r1 + r4
            boolean r9 = p213q.p217b.p218a.p231b.p251g.p256e.C2387c9.m5604a(r3, r1, r8)
            if (r9 == 0) goto L_0x0238
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = p213q.p217b.p218a.p231b.p251g.p256e.C2546l6.f6704a
            r9.<init>(r3, r1, r4, r10)
        L_0x0205:
            r11.add(r9)
            r1 = r8
        L_0x0209:
            if (r1 >= r5) goto L_0x03e0
            int r4 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5166a(r3, r1, r7)
            int r8 = r7.f6329a
            if (r2 != r8) goto L_0x03e0
            int r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5166a(r3, r4, r7)
            int r4 = r7.f6329a
            if (r4 < 0) goto L_0x0233
            if (r4 != 0) goto L_0x021e
            goto L_0x01f2
        L_0x021e:
            int r8 = r1 + r4
            boolean r9 = p213q.p217b.p218a.p231b.p251g.p256e.C2387c9.m5604a(r3, r1, r8)
            if (r9 == 0) goto L_0x022e
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = p213q.p217b.p218a.p231b.p251g.p256e.C2546l6.f6704a
            r9.<init>(r3, r1, r4, r10)
            goto L_0x0205
        L_0x022e:
            q.b.a.b.g.e.p6 r1 = p213q.p217b.p218a.p231b.p251g.p256e.C2618p6.m6295f()
            throw r1
        L_0x0233:
            q.b.a.b.g.e.p6 r1 = p213q.p217b.p218a.p231b.p251g.p256e.C2618p6.m6291b()
            throw r1
        L_0x0238:
            q.b.a.b.g.e.p6 r1 = p213q.p217b.p218a.p231b.p251g.p256e.C2618p6.m6295f()
            throw r1
        L_0x023d:
            q.b.a.b.g.e.p6 r1 = p213q.p217b.p218a.p231b.p251g.p256e.C2618p6.m6291b()
            throw r1
        L_0x0242:
            r1 = 0
            if (r6 != r12) goto L_0x026a
            q.b.a.b.g.e.d5 r11 = (p213q.p217b.p218a.p231b.p251g.p256e.C2400d5) r11
            int r2 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5166a(r3, r4, r7)
            int r4 = r7.f6329a
            int r4 = r4 + r2
        L_0x024e:
            if (r2 >= r4) goto L_0x0261
            int r2 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5274b(r3, r2, r7)
            long r5 = r7.f6330b
            int r5 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r5 == 0) goto L_0x025c
            r5 = r13
            goto L_0x025d
        L_0x025c:
            r5 = r1
        L_0x025d:
            r11.mo7506a(r5)
            goto L_0x024e
        L_0x0261:
            if (r2 != r4) goto L_0x0265
            goto L_0x0133
        L_0x0265:
            q.b.a.b.g.e.p6 r1 = p213q.p217b.p218a.p231b.p251g.p256e.C2618p6.m6290a()
            throw r1
        L_0x026a:
            if (r6 != 0) goto L_0x03df
            q.b.a.b.g.e.d5 r11 = (p213q.p217b.p218a.p231b.p251g.p256e.C2400d5) r11
            int r4 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5274b(r3, r4, r7)
            long r8 = r7.f6330b
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x027a
        L_0x0278:
            r6 = r13
            goto L_0x027b
        L_0x027a:
            r6 = r1
        L_0x027b:
            r11.mo7506a(r6)
            if (r4 >= r5) goto L_0x03df
            int r6 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5166a(r3, r4, r7)
            int r8 = r7.f6329a
            if (r2 != r8) goto L_0x03df
            int r4 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5274b(r3, r6, r7)
            long r8 = r7.f6330b
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x027a
            goto L_0x0278
        L_0x0293:
            if (r6 != r12) goto L_0x02b3
            q.b.a.b.g.e.j6 r11 = (p213q.p217b.p218a.p231b.p251g.p256e.C2512j6) r11
            int r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5166a(r3, r4, r7)
            int r2 = r7.f6329a
            int r2 = r2 + r1
        L_0x029e:
            if (r1 >= r2) goto L_0x02aa
            int r4 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5336f(r3, r1)
            r11.mo7797f(r4)
            int r1 = r1 + 4
            goto L_0x029e
        L_0x02aa:
            if (r1 != r2) goto L_0x02ae
            goto L_0x03e0
        L_0x02ae:
            q.b.a.b.g.e.p6 r1 = p213q.p217b.p218a.p231b.p251g.p256e.C2618p6.m6290a()
            throw r1
        L_0x02b3:
            if (r6 != r9) goto L_0x03df
            q.b.a.b.g.e.j6 r11 = (p213q.p217b.p218a.p231b.p251g.p256e.C2512j6) r11
            int r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5336f(r18, r19)
            r11.mo7797f(r1)
        L_0x02be:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x03e0
            int r4 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5166a(r3, r1, r7)
            int r6 = r7.f6329a
            if (r2 != r6) goto L_0x03e0
            int r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5336f(r3, r4)
            r11.mo7797f(r1)
            goto L_0x02be
        L_0x02d2:
            if (r6 != r12) goto L_0x02f2
            q.b.a.b.g.e.d7 r11 = (p213q.p217b.p218a.p231b.p251g.p256e.C2402d7) r11
            int r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5166a(r3, r4, r7)
            int r2 = r7.f6329a
            int r2 = r2 + r1
        L_0x02dd:
            if (r1 >= r2) goto L_0x02e9
            long r4 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5343g(r3, r1)
            r11.mo7528a(r4)
            int r1 = r1 + 8
            goto L_0x02dd
        L_0x02e9:
            if (r1 != r2) goto L_0x02ed
            goto L_0x03e0
        L_0x02ed:
            q.b.a.b.g.e.p6 r1 = p213q.p217b.p218a.p231b.p251g.p256e.C2618p6.m6290a()
            throw r1
        L_0x02f2:
            if (r6 != r13) goto L_0x03df
            q.b.a.b.g.e.d7 r11 = (p213q.p217b.p218a.p231b.p251g.p256e.C2402d7) r11
            long r8 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5343g(r18, r19)
            r11.mo7528a(r8)
        L_0x02fd:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x03e0
            int r4 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5166a(r3, r1, r7)
            int r6 = r7.f6329a
            if (r2 != r6) goto L_0x03e0
            long r8 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5343g(r3, r4)
            r11.mo7528a(r8)
            goto L_0x02fd
        L_0x0311:
            if (r6 != r12) goto L_0x0319
            int r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5167a(r3, r4, r11, r7)
            goto L_0x03e0
        L_0x0319:
            if (r6 != 0) goto L_0x03df
            r22 = r18
            r23 = r19
            r24 = r20
            r25 = r11
            r26 = r30
            int r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5147a(r21, r22, r23, r24, r25, r26)
            goto L_0x03e0
        L_0x032b:
            if (r6 != r12) goto L_0x034b
            q.b.a.b.g.e.d7 r11 = (p213q.p217b.p218a.p231b.p251g.p256e.C2402d7) r11
            int r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5166a(r3, r4, r7)
            int r2 = r7.f6329a
            int r2 = r2 + r1
        L_0x0336:
            if (r1 >= r2) goto L_0x0342
            int r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5274b(r3, r1, r7)
            long r4 = r7.f6330b
            r11.mo7528a(r4)
            goto L_0x0336
        L_0x0342:
            if (r1 != r2) goto L_0x0346
            goto L_0x03e0
        L_0x0346:
            q.b.a.b.g.e.p6 r1 = p213q.p217b.p218a.p231b.p251g.p256e.C2618p6.m6290a()
            throw r1
        L_0x034b:
            if (r6 != 0) goto L_0x03df
            q.b.a.b.g.e.d7 r11 = (p213q.p217b.p218a.p231b.p251g.p256e.C2402d7) r11
        L_0x034f:
            int r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5274b(r3, r4, r7)
            long r8 = r7.f6330b
            r11.mo7528a(r8)
            if (r1 >= r5) goto L_0x03e0
            int r4 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5166a(r3, r1, r7)
            int r6 = r7.f6329a
            if (r2 != r6) goto L_0x03e0
            goto L_0x034f
        L_0x0363:
            if (r6 != r12) goto L_0x0382
            q.b.a.b.g.e.d6 r11 = (p213q.p217b.p218a.p231b.p251g.p256e.C2401d6) r11
            int r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5166a(r3, r4, r7)
            int r2 = r7.f6329a
            int r2 = r2 + r1
        L_0x036e:
            if (r1 >= r2) goto L_0x037a
            float r4 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5349i(r3, r1)
            r11.mo7517a(r4)
            int r1 = r1 + 4
            goto L_0x036e
        L_0x037a:
            if (r1 != r2) goto L_0x037d
            goto L_0x03e0
        L_0x037d:
            q.b.a.b.g.e.p6 r1 = p213q.p217b.p218a.p231b.p251g.p256e.C2618p6.m6290a()
            throw r1
        L_0x0382:
            if (r6 != r9) goto L_0x03df
            q.b.a.b.g.e.d6 r11 = (p213q.p217b.p218a.p231b.p251g.p256e.C2401d6) r11
            float r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5349i(r18, r19)
            r11.mo7517a(r1)
        L_0x038d:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x03e0
            int r4 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5166a(r3, r1, r7)
            int r6 = r7.f6329a
            if (r2 != r6) goto L_0x03e0
            float r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5349i(r3, r4)
            r11.mo7517a(r1)
            goto L_0x038d
        L_0x03a1:
            if (r6 != r12) goto L_0x03c0
            q.b.a.b.g.e.t5 r11 = (p213q.p217b.p218a.p231b.p251g.p256e.C2682t5) r11
            int r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5166a(r3, r4, r7)
            int r2 = r7.f6329a
            int r2 = r2 + r1
        L_0x03ac:
            if (r1 >= r2) goto L_0x03b8
            double r4 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5345h(r3, r1)
            r11.mo8001a(r4)
            int r1 = r1 + 8
            goto L_0x03ac
        L_0x03b8:
            if (r1 != r2) goto L_0x03bb
            goto L_0x03e0
        L_0x03bb:
            q.b.a.b.g.e.p6 r1 = p213q.p217b.p218a.p231b.p251g.p256e.C2618p6.m6290a()
            throw r1
        L_0x03c0:
            if (r6 != r13) goto L_0x03df
            q.b.a.b.g.e.t5 r11 = (p213q.p217b.p218a.p231b.p251g.p256e.C2682t5) r11
            double r8 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5345h(r18, r19)
            r11.mo8001a(r8)
        L_0x03cb:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x03e0
            int r4 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5166a(r3, r1, r7)
            int r6 = r7.f6329a
            if (r2 != r6) goto L_0x03e0
            double r8 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5345h(r3, r4)
            r11.mo8001a(r8)
            goto L_0x03cb
        L_0x03df:
            r1 = r4
        L_0x03e0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p251g.p256e.C2684t7.mo8014a(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, q.b.a.b.g.e.b5):int");
    }

    /* renamed from: a */
    public final <K, V> int mo8015a(T t, byte[] bArr, int i, int i2, int i3, long j, C2362b5 b5Var) {
        Unsafe unsafe = f6876r;
        Object obj = this.f6878b[(i3 / 3) << 1];
        Object object = unsafe.getObject(t, j);
        if (this.f6892p.mo7850b(object)) {
            Object e = this.f6892p.mo7853e(obj);
            this.f6892p.mo7848a(e, object);
            unsafe.putObject(t, j, e);
            object = e;
        }
        this.f6892p.mo7852d(obj);
        this.f6892p.mo7849a(object);
        int a = C2286e.m5166a(bArr, i, b5Var);
        int i4 = b5Var.f6329a;
        if (i4 < 0 || i4 > i2 - a) {
            throw C2618p6.m6290a();
        }
        throw null;
    }

    /* JADX WARNING: type inference failed for: r31v0, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r12v0 */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r12v1, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r4v1, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r0v5, types: [int, byte] */
    /* JADX WARNING: type inference failed for: r0v6, types: [int] */
    /* JADX WARNING: type inference failed for: r16v2 */
    /* JADX WARNING: type inference failed for: r16v3 */
    /* JADX WARNING: type inference failed for: r12v3 */
    /* JADX WARNING: type inference failed for: r4v10 */
    /* JADX WARNING: type inference failed for: r12v4 */
    /* JADX WARNING: type inference failed for: r10v4 */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: type inference failed for: r16v4 */
    /* JADX WARNING: type inference failed for: r12v5 */
    /* JADX WARNING: type inference failed for: r10v5 */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* JADX WARNING: type inference failed for: r10v6 */
    /* JADX WARNING: type inference failed for: r0v13, types: [int] */
    /* JADX WARNING: type inference failed for: r1v6, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r4v14 */
    /* JADX WARNING: type inference failed for: r12v6 */
    /* JADX WARNING: type inference failed for: r0v22, types: [int] */
    /* JADX WARNING: type inference failed for: r1v11, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r4v16 */
    /* JADX WARNING: type inference failed for: r12v7 */
    /* JADX WARNING: type inference failed for: r21v1 */
    /* JADX WARNING: type inference failed for: r13v10 */
    /* JADX WARNING: type inference failed for: r4v18 */
    /* JADX WARNING: type inference failed for: r12v8 */
    /* JADX WARNING: type inference failed for: r16v6 */
    /* JADX WARNING: type inference failed for: r13v12 */
    /* JADX WARNING: type inference failed for: r25v0 */
    /* JADX WARNING: type inference failed for: r10v8 */
    /* JADX WARNING: type inference failed for: r25v1 */
    /* JADX WARNING: type inference failed for: r25v2 */
    /* JADX WARNING: type inference failed for: r25v3 */
    /* JADX WARNING: type inference failed for: r2v16, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r5v15, types: [int] */
    /* JADX WARNING: type inference failed for: r2v17, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r25v4 */
    /* JADX WARNING: type inference failed for: r10v12 */
    /* JADX WARNING: type inference failed for: r4v21 */
    /* JADX WARNING: type inference failed for: r12v10 */
    /* JADX WARNING: type inference failed for: r2v19, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r5v19, types: [int] */
    /* JADX WARNING: type inference failed for: r25v5 */
    /* JADX WARNING: type inference failed for: r25v6 */
    /* JADX WARNING: type inference failed for: r1v22, types: [int] */
    /* JADX WARNING: type inference failed for: r2v20, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r12v13 */
    /* JADX WARNING: type inference failed for: r4v25 */
    /* JADX WARNING: type inference failed for: r1v28 */
    /* JADX WARNING: type inference failed for: r10v13 */
    /* JADX WARNING: type inference failed for: r1v29 */
    /* JADX WARNING: type inference failed for: r4v26 */
    /* JADX WARNING: type inference failed for: r13v18 */
    /* JADX WARNING: type inference failed for: r1v30 */
    /* JADX WARNING: type inference failed for: r1v31 */
    /* JADX WARNING: type inference failed for: r1v32 */
    /* JADX WARNING: type inference failed for: r1v33 */
    /* JADX WARNING: type inference failed for: r1v34 */
    /* JADX WARNING: type inference failed for: r4v29 */
    /* JADX WARNING: type inference failed for: r1v35 */
    /* JADX WARNING: type inference failed for: r4v30 */
    /* JADX WARNING: type inference failed for: r10v14 */
    /* JADX WARNING: type inference failed for: r1v37 */
    /* JADX WARNING: type inference failed for: r4v32 */
    /* JADX WARNING: type inference failed for: r4v33 */
    /* JADX WARNING: type inference failed for: r1v39 */
    /* JADX WARNING: type inference failed for: r4v34 */
    /* JADX WARNING: type inference failed for: r22v18 */
    /* JADX WARNING: type inference failed for: r7v9 */
    /* JADX WARNING: type inference failed for: r1v41 */
    /* JADX WARNING: type inference failed for: r7v10 */
    /* JADX WARNING: type inference failed for: r1v43 */
    /* JADX WARNING: type inference failed for: r1v44 */
    /* JADX WARNING: type inference failed for: r22v22 */
    /* JADX WARNING: type inference failed for: r1v45 */
    /* JADX WARNING: type inference failed for: r16v26 */
    /* JADX WARNING: type inference failed for: r4v36 */
    /* JADX WARNING: type inference failed for: r22v23 */
    /* JADX WARNING: type inference failed for: r4v37 */
    /* JADX WARNING: type inference failed for: r16v27 */
    /* JADX WARNING: type inference failed for: r22v24 */
    /* JADX WARNING: type inference failed for: r22v25 */
    /* JADX WARNING: type inference failed for: r1v50 */
    /* JADX WARNING: type inference failed for: r22v26 */
    /* JADX WARNING: type inference failed for: r1v51 */
    /* JADX WARNING: type inference failed for: r22v27 */
    /* JADX WARNING: type inference failed for: r1v52 */
    /* JADX WARNING: type inference failed for: r22v28 */
    /* JADX WARNING: type inference failed for: r1v53 */
    /* JADX WARNING: type inference failed for: r22v29 */
    /* JADX WARNING: type inference failed for: r1v55 */
    /* JADX WARNING: type inference failed for: r1v56 */
    /* JADX WARNING: type inference failed for: r1v57 */
    /* JADX WARNING: type inference failed for: r1v58 */
    /* JADX WARNING: type inference failed for: r4v47 */
    /* JADX WARNING: type inference failed for: r1v60, types: [int] */
    /* JADX WARNING: type inference failed for: r1v61 */
    /* JADX WARNING: type inference failed for: r1v62 */
    /* JADX WARNING: type inference failed for: r4v51 */
    /* JADX WARNING: type inference failed for: r7v13 */
    /* JADX WARNING: type inference failed for: r1v63 */
    /* JADX WARNING: type inference failed for: r7v14 */
    /* JADX WARNING: type inference failed for: r1v64, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r16v41 */
    /* JADX WARNING: type inference failed for: r4v53 */
    /* JADX WARNING: type inference failed for: r1v71 */
    /* JADX WARNING: type inference failed for: r1v72 */
    /* JADX WARNING: type inference failed for: r10v19 */
    /* JADX WARNING: type inference failed for: r10v20, types: [int] */
    /* JADX WARNING: type inference failed for: r28v1 */
    /* JADX WARNING: type inference failed for: r0v100 */
    /* JADX WARNING: type inference failed for: r12v14 */
    /* JADX WARNING: type inference failed for: r12v15 */
    /* JADX WARNING: type inference failed for: r16v45 */
    /* JADX WARNING: type inference failed for: r12v16 */
    /* JADX WARNING: type inference failed for: r4v55 */
    /* JADX WARNING: type inference failed for: r12v17 */
    /* JADX WARNING: type inference failed for: r4v56 */
    /* JADX WARNING: type inference failed for: r12v18 */
    /* JADX WARNING: type inference failed for: r10v22 */
    /* JADX WARNING: type inference failed for: r4v57 */
    /* JADX WARNING: type inference failed for: r10v23 */
    /* JADX WARNING: type inference failed for: r10v24 */
    /* JADX WARNING: type inference failed for: r10v25 */
    /* JADX WARNING: type inference failed for: r4v58 */
    /* JADX WARNING: type inference failed for: r4v59 */
    /* JADX WARNING: type inference failed for: r4v60 */
    /* JADX WARNING: type inference failed for: r13v29 */
    /* JADX WARNING: type inference failed for: r25v12 */
    /* JADX WARNING: type inference failed for: r25v13 */
    /* JADX WARNING: type inference failed for: r4v61 */
    /* JADX WARNING: type inference failed for: r1v73 */
    /* JADX WARNING: type inference failed for: r1v74 */
    /* JADX WARNING: type inference failed for: r1v75 */
    /* JADX WARNING: type inference failed for: r1v76 */
    /* JADX WARNING: type inference failed for: r16v46 */
    /* JADX WARNING: type inference failed for: r4v62 */
    /* JADX WARNING: type inference failed for: r22v40 */
    /* JADX WARNING: type inference failed for: r1v77 */
    /* JADX WARNING: type inference failed for: r1v78 */
    /* JADX WARNING: type inference failed for: r1v79 */
    /* JADX WARNING: type inference failed for: r1v80 */
    /* JADX WARNING: type inference failed for: r1v81 */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02de, code lost:
        r9.putInt(r14, r2, r1);
        r1 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0304, code lost:
        r10 = r4;
        r9.putLong(r30, r2, r23);
        r13 = r13 | r21;
        r0 = r7;
        r1 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0313, code lost:
        r1 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0335, code lost:
        r0 = true;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0353, code lost:
        r0 = r10 + 8;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0355, code lost:
        r13 = r13 | r21;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0358, code lost:
        r4 = r12;
        r6 = r13;
        r5 = r19;
        r13 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x035f, code lost:
        r6 = r34;
        r20 = r0;
        r27 = r9;
        r2 = r10;
        r26 = r22;
        r10 = r1;
        r22 = r16;
        r16 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x041d, code lost:
        if (r0 == r15) goto L_0x0476;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0474, code lost:
        if (r0 == r15) goto L_0x0476;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0476, code lost:
        r10 = r0;
        r25 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0019, code lost:
        r12 = r12;
        r16 = r16;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c8, code lost:
        r6 = r33;
        r8 = r2;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0196, code lost:
        r6 = r33;
        r22 = r8;
        r8 = r5;
        r28 = r4;
        r4 = r1;
        r1 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01c6, code lost:
        r6 = r33;
        r22 = r8;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01cd, code lost:
        r8 = r5;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0262, code lost:
        r22 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0280, code lost:
        r1 = r13 | r21;
        r22 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0282, code lost:
        r3 = r5;
        r13 = r6;
        r2 = r8;
        r4 = r12;
        r5 = r19;
        r16 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x028a, code lost:
        r6 = r1;
        r1 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x028f, code lost:
        r1 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0291, code lost:
        r22 = r8;
        r1 = r1;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r0v5, types: [int, byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte[], code=null, for r31v0, types: [byte[]] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r16v3
      assigns: []
      uses: []
      mth insns count: 662
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 63 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo8016a(T r30, byte[] r31, int r32, int r33, int r34, p213q.p217b.p218a.p231b.p251g.p256e.C2362b5 r35) {
        /*
            r29 = this;
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r35
            sun.misc.Unsafe r9 = f6876r
            r0 = r32
            r1 = r34
            r4 = r12
            r2 = -1
            r3 = 0
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = 0
            r16 = 0
        L_0x0019:
            r17 = 0
            if (r0 >= r13) goto L_0x0523
            int r10 = r0 + 1
            byte r0 = r4[r0]
            if (r0 >= 0) goto L_0x002e
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5152a(r0, r4, r10, r11)
            int r10 = r11.f6329a
            r28 = r10
            r10 = r0
            r0 = r28
        L_0x002e:
            int r8 = r0 >>> 3
            r7 = r0 & 7
            r16 = r0
            r0 = 3
            if (r8 <= r2) goto L_0x0049
            int r3 = r3 / r0
            int r2 = r15.f6879c
            if (r8 < r2) goto L_0x0045
            int r2 = r15.f6880d
            if (r8 > r2) goto L_0x0045
            int r2 = r15.mo8012a(r8, r3)
            goto L_0x0046
        L_0x0045:
            r2 = -1
        L_0x0046:
            r0 = -1
            r3 = 0
            goto L_0x005b
        L_0x0049:
            int r2 = r15.f6879c
            if (r8 < r2) goto L_0x0058
            int r2 = r15.f6880d
            if (r8 > r2) goto L_0x0058
            r3 = 0
            int r2 = r15.mo8012a(r8, r3)
            r0 = -1
            goto L_0x005b
        L_0x0058:
            r3 = 0
            r0 = -1
            r2 = -1
        L_0x005b:
            if (r2 != r0) goto L_0x0072
            r22 = r0
            r18 = r3
            r19 = r5
            r13 = r6
            r26 = r8
            r27 = r9
            r2 = r10
            r10 = r16
            r20 = 1
            r6 = r1
            r16 = r18
            goto L_0x047e
        L_0x0072:
            int[] r1 = r15.f6877a
            int r20 = r2 + 1
            r21 = r4
            r4 = r1[r20]
            r20 = 267386880(0xff00000, float:2.3665827E-29)
            r20 = r4 & r20
            int r3 = r20 >>> 20
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r4 & r13
            long r13 = (long) r0
            r0 = 17
            r23 = r13
            if (r3 > r0) goto L_0x036f
            int r0 = r2 + 2
            r0 = r1[r0]
            int r1 = r0 >>> 20
            r14 = 1
            int r21 = r14 << r1
            r14 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r14
            if (r0 == r5) goto L_0x00b3
            if (r5 == r14) goto L_0x00a6
            long r13 = (long) r5
            r5 = r30
            r25 = r23
            r9.putInt(r5, r13, r6)
            goto L_0x00aa
        L_0x00a6:
            r5 = r30
            r25 = r23
        L_0x00aa:
            long r13 = (long) r0
            int r6 = r9.getInt(r5, r13)
            r14 = r5
            r13 = r6
            r6 = r0
            goto L_0x00b9
        L_0x00b3:
            r14 = r30
            r25 = r23
            r13 = r6
            r6 = r5
        L_0x00b9:
            r0 = 5
            switch(r3) {
                case 0: goto L_0x0337;
                case 1: goto L_0x0315;
                case 2: goto L_0x02e4;
                case 3: goto L_0x02e4;
                case 4: goto L_0x02c4;
                case 5: goto L_0x0295;
                case 6: goto L_0x0265;
                case 7: goto L_0x0236;
                case 8: goto L_0x020d;
                case 9: goto L_0x01d0;
                case 10: goto L_0x01a5;
                case 11: goto L_0x02c4;
                case 12: goto L_0x0160;
                case 13: goto L_0x0265;
                case 14: goto L_0x0295;
                case 15: goto L_0x0148;
                case 16: goto L_0x011f;
                case 17: goto L_0x00d0;
                default: goto L_0x00bd;
            }
        L_0x00bd:
            r19 = r6
            r22 = r8
            r1 = r16
            r0 = 1
            r16 = -1
            r18 = 0
        L_0x00c8:
            r20 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r33
            r8 = r2
            goto L_0x035f
        L_0x00d0:
            r3 = 3
            if (r7 != r3) goto L_0x0112
            int r0 = r8 << 3
            r4 = r0 | 4
            q.b.a.b.g.e.g8 r0 = r15.mo8017a(r2)
            r7 = r16
            r16 = -1
            r1 = r31
            r5 = r2
            r2 = r10
            r18 = 0
            r3 = r33
            r10 = r5
            r5 = r35
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5161a(r0, r1, r2, r3, r4, r5)
            r1 = r13 & r21
            if (r1 != 0) goto L_0x00f7
            java.lang.Object r1 = r11.f6331c
            r2 = r25
            goto L_0x0103
        L_0x00f7:
            r2 = r25
            java.lang.Object r1 = r9.getObject(r14, r2)
            java.lang.Object r4 = r11.f6331c
            java.lang.Object r1 = p213q.p217b.p218a.p231b.p251g.p256e.C2546l6.m6113a(r1, r4)
        L_0x0103:
            r9.putObject(r14, r2, r1)
            r1 = r13 | r21
            r13 = r33
            r5 = r6
            r16 = r7
            r2 = r8
            r3 = r10
            r4 = r12
            goto L_0x028a
        L_0x0112:
            r7 = r16
            r16 = -1
            r18 = 0
            r19 = r6
            r1 = r7
            r22 = r8
            r0 = 1
            goto L_0x00c8
        L_0x011f:
            r5 = r2
            r1 = r16
            r2 = r25
            r16 = -1
            r18 = 0
            if (r7 != 0) goto L_0x0144
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5274b(r12, r10, r11)
            r19 = r6
            long r6 = r11.f6330b
            long r6 = p213q.p217b.p218a.p231b.p251g.p256e.C2597o5.m6202a(r6)
            r4 = r1
            r23 = r6
            r22 = r8
            r20 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r33
            r7 = r0
            r8 = r5
            goto L_0x0304
        L_0x0144:
            r19 = r6
            goto L_0x01c6
        L_0x0148:
            r5 = r2
            r19 = r6
            r1 = r16
            r2 = r25
            r16 = -1
            r18 = 0
            if (r7 != 0) goto L_0x01c6
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5166a(r12, r10, r11)
            int r4 = r11.f6329a
            int r4 = p213q.p217b.p218a.p231b.p251g.p256e.C2597o5.m6201a(r4)
            goto L_0x0196
        L_0x0160:
            r5 = r2
            r19 = r6
            r1 = r16
            r2 = r25
            r16 = -1
            r18 = 0
            if (r7 != 0) goto L_0x01c6
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5166a(r12, r10, r11)
            int r4 = r11.f6329a
            q.b.a.b.g.e.m6 r6 = r15.mo8028c(r5)
            if (r6 == 0) goto L_0x0196
            boolean r6 = r6.mo7788a(r4)
            if (r6 == 0) goto L_0x0180
            goto L_0x0196
        L_0x0180:
            q.b.a.b.g.e.t8 r2 = m6407e(r30)
            long r3 = (long) r4
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2.mo8033a(r1, r3)
            r6 = r33
            r22 = r8
            r20 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r5
            goto L_0x0358
        L_0x0196:
            r6 = r33
            r22 = r8
            r20 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r5
            r28 = r4
            r4 = r1
            r1 = r28
            goto L_0x02de
        L_0x01a5:
            r5 = r2
            r19 = r6
            r1 = r16
            r2 = r25
            r0 = 2
            r16 = -1
            r18 = 0
            if (r7 != r0) goto L_0x01c6
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5327e(r12, r10, r11)
            java.lang.Object r4 = r11.f6331c
            r9.putObject(r14, r2, r4)
            r6 = r33
            r22 = r8
            r20 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r5
            goto L_0x0355
        L_0x01c6:
            r6 = r33
            r22 = r8
            r20 = 1048575(0xfffff, float:1.469367E-39)
        L_0x01cd:
            r8 = r5
            goto L_0x0335
        L_0x01d0:
            r5 = r2
            r19 = r6
            r1 = r16
            r2 = r25
            r0 = 2
            r16 = -1
            r18 = 0
            if (r7 != r0) goto L_0x0206
            q.b.a.b.g.e.g8 r0 = r15.mo8017a(r5)
            r6 = r33
            r20 = 1048575(0xfffff, float:1.469367E-39)
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5162a(r0, r12, r10, r6, r11)
            r4 = r13 & r21
            if (r4 != 0) goto L_0x01f2
            java.lang.Object r4 = r11.f6331c
            goto L_0x01fc
        L_0x01f2:
            java.lang.Object r4 = r9.getObject(r14, r2)
            java.lang.Object r7 = r11.f6331c
            java.lang.Object r4 = p213q.p217b.p218a.p231b.p251g.p256e.C2546l6.m6113a(r4, r7)
        L_0x01fc:
            r9.putObject(r14, r2, r4)
            r2 = r13 | r21
            r22 = r1
            r1 = r2
            goto L_0x0282
        L_0x0206:
            r6 = r33
            r20 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0291
        L_0x020d:
            r5 = r2
            r19 = r6
            r1 = r16
            r2 = r25
            r0 = 2
            r16 = -1
            r18 = 0
            r20 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r33
            if (r7 != r0) goto L_0x0262
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r4
            if (r0 != 0) goto L_0x022a
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5304c(r12, r10, r11)
            goto L_0x022e
        L_0x022a:
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5320d(r12, r10, r11)
        L_0x022e:
            java.lang.Object r4 = r11.f6331c
            r9.putObject(r14, r2, r4)
            r22 = r1
            goto L_0x0280
        L_0x0236:
            r5 = r2
            r19 = r6
            r1 = r16
            r2 = r25
            r16 = -1
            r18 = 0
            r20 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r33
            if (r7 != 0) goto L_0x0262
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5274b(r12, r10, r11)
            r4 = r0
            r22 = r1
            long r0 = r11.f6330b
            r23 = 0
            int r0 = (r0 > r23 ? 1 : (r0 == r23 ? 0 : -1))
            if (r0 == 0) goto L_0x0259
            r10 = 1
            goto L_0x025b
        L_0x0259:
            r10 = r18
        L_0x025b:
            q.b.a.b.g.e.b9$c r0 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.f6344f
            r0.mo7426a(r14, r2, r10)
            r0 = r4
            goto L_0x0280
        L_0x0262:
            r22 = r1
            goto L_0x028f
        L_0x0265:
            r5 = r2
            r19 = r6
            r22 = r16
            r2 = r25
            r16 = -1
            r18 = 0
            r20 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r33
            if (r7 != r0) goto L_0x028f
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5336f(r12, r10)
            r9.putInt(r14, r2, r0)
            int r0 = r10 + 4
        L_0x0280:
            r1 = r13 | r21
        L_0x0282:
            r3 = r5
            r13 = r6
            r2 = r8
            r4 = r12
            r5 = r19
            r16 = r22
        L_0x028a:
            r6 = r1
            r1 = r34
            goto L_0x0019
        L_0x028f:
            r1 = r22
        L_0x0291:
            r22 = r8
            goto L_0x01cd
        L_0x0295:
            r5 = r2
            r19 = r6
            r22 = r16
            r2 = r25
            r0 = 1
            r16 = -1
            r18 = 0
            r20 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r33
            if (r7 != r0) goto L_0x02bc
            long r23 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5343g(r12, r10)
            r0 = r9
            r7 = r22
            r1 = r30
            r22 = r8
            r8 = r5
            r4 = r23
            r0.putLong(r1, r2, r4)
            r1 = r7
            goto L_0x0353
        L_0x02bc:
            r7 = r22
            r22 = r8
            r8 = r5
            r1 = r7
            goto L_0x035f
        L_0x02c4:
            r19 = r6
            r22 = r8
            r4 = r16
            r16 = -1
            r18 = 0
            r20 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r33
            r8 = r2
            r2 = r25
            if (r7 != 0) goto L_0x0313
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5166a(r12, r10, r11)
            int r1 = r11.f6329a
        L_0x02de:
            r9.putInt(r14, r2, r1)
            r1 = r4
            goto L_0x0355
        L_0x02e4:
            r19 = r6
            r22 = r8
            r4 = r16
            r16 = -1
            r18 = 0
            r20 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r33
            r8 = r2
            r2 = r25
            if (r7 != 0) goto L_0x0313
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5274b(r12, r10, r11)
            r32 = r0
            long r0 = r11.f6330b
            r7 = r32
            r23 = r0
        L_0x0304:
            r0 = r9
            r1 = r30
            r10 = r4
            r4 = r23
            r0.putLong(r1, r2, r4)
            r0 = r13 | r21
            r13 = r0
            r0 = r7
            r1 = r10
            goto L_0x0358
        L_0x0313:
            r1 = r4
            goto L_0x0335
        L_0x0315:
            r19 = r6
            r22 = r8
            r1 = r16
            r16 = -1
            r18 = 0
            r20 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r33
            r8 = r2
            r2 = r25
            if (r7 != r0) goto L_0x0335
            float r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5349i(r12, r10)
            q.b.a.b.g.e.b9$c r4 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.f6344f
            r4.mo7425a(r14, r2, r0)
            int r0 = r10 + 4
            goto L_0x0355
        L_0x0335:
            r0 = 1
            goto L_0x035f
        L_0x0337:
            r19 = r6
            r22 = r8
            r1 = r16
            r0 = 1
            r16 = -1
            r18 = 0
            r20 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r33
            r8 = r2
            r2 = r25
            if (r7 != r0) goto L_0x035f
            double r4 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5345h(r12, r10)
            p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5483a(r14, r2, r4)
        L_0x0353:
            int r0 = r10 + 8
        L_0x0355:
            r2 = r13 | r21
            r13 = r2
        L_0x0358:
            r4 = r12
            r6 = r13
            r5 = r19
            r13 = r1
            goto L_0x03c2
        L_0x035f:
            r6 = r34
            r20 = r0
            r27 = r9
            r2 = r10
            r26 = r22
            r10 = r1
            r22 = r16
            r16 = r8
            goto L_0x047e
        L_0x036f:
            r14 = r30
            r22 = r8
            r13 = r16
            r11 = r23
            r0 = 1
            r16 = -1
            r18 = 0
            r20 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r2
            r2 = 27
            if (r3 != r2) goto L_0x03e4
            r1 = 2
            if (r7 != r1) goto L_0x03d1
            java.lang.Object r0 = r9.getObject(r14, r11)
            q.b.a.b.g.e.q6 r0 = (p213q.p217b.p218a.p231b.p251g.p256e.C2635q6) r0
            boolean r1 = r0.mo7387a()
            if (r1 != 0) goto L_0x03a5
            int r1 = r0.size()
            if (r1 != 0) goto L_0x039c
            r1 = 10
            goto L_0x039e
        L_0x039c:
            int r1 = r1 << 1
        L_0x039e:
            q.b.a.b.g.e.q6 r0 = r0.mo7414a(r1)
            r9.putObject(r14, r11, r0)
        L_0x03a5:
            r7 = r0
            q.b.a.b.g.e.g8 r0 = r15.mo8017a(r8)
            r1 = r13
            r2 = r31
            r3 = r10
            r12 = r21
            r4 = r33
            r19 = r5
            r5 = r7
            r21 = r6
            r6 = r35
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5160a(r0, r1, r2, r3, r4, r5, r6)
            r4 = r12
            r5 = r19
            r6 = r21
        L_0x03c2:
            r12 = r31
            r1 = r34
            r11 = r35
            r3 = r8
            r16 = r13
            r2 = r22
            r13 = r33
            goto L_0x0019
        L_0x03d1:
            r19 = r5
            r21 = r6
            r20 = r0
            r27 = r9
            r15 = r10
            r25 = r13
            r26 = r22
            r22 = r16
            r16 = r8
            goto L_0x0447
        L_0x03e4:
            r19 = r5
            r21 = r6
            r2 = 49
            if (r3 > r2) goto L_0x042d
            long r5 = (long) r4
            r23 = r0
            r0 = r29
            r1 = r30
            r2 = r31
            r4 = r3
            r3 = r10
            r32 = r4
            r4 = r33
            r24 = r5
            r5 = r13
            r6 = r22
            r26 = r22
            r22 = r16
            r16 = r8
            r27 = r9
            r15 = r10
            r20 = r23
            r9 = r24
            r23 = r11
            r12 = r35
            r11 = r32
            r25 = r13
            r12 = r23
            r14 = r35
            int r0 = r0.mo8014a((T) r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 != r15) goto L_0x0421
            goto L_0x0476
        L_0x0421:
            r7 = r29
            r11 = r30
            r8 = r35
            r10 = r25
            r9 = r26
            goto L_0x0510
        L_0x042d:
            r20 = r0
            r32 = r3
            r27 = r9
            r15 = r10
            r23 = r11
            r25 = r13
            r26 = r22
            r22 = r16
            r16 = r8
            r0 = 50
            r9 = r32
            if (r9 != r0) goto L_0x045c
            r0 = 2
            if (r7 == r0) goto L_0x0449
        L_0x0447:
            r10 = r15
            goto L_0x0477
        L_0x0449:
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r16
            r6 = r23
            r8 = r35
            r0.mo8015a((T) r1, r2, r3, r4, r5, r6, r8)
            throw r17
        L_0x045c:
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r8 = r4
            r4 = r33
            r5 = r25
            r6 = r26
            r10 = r23
            r12 = r16
            r13 = r35
            int r0 = r0.mo8013a((T) r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 != r15) goto L_0x0421
        L_0x0476:
            r10 = r0
        L_0x0477:
            r6 = r34
            r2 = r10
            r13 = r21
            r10 = r25
        L_0x047e:
            if (r10 != r6) goto L_0x048e
            if (r6 != 0) goto L_0x0483
            goto L_0x048e
        L_0x0483:
            r7 = r29
            r11 = r30
            r0 = r2
            r1 = r6
            r6 = r13
            r5 = r19
            goto L_0x052f
        L_0x048e:
            r7 = r29
            boolean r0 = r7.f6882f
            if (r0 == 0) goto L_0x04e6
            r8 = r35
            q.b.a.b.g.e.u5 r0 = r8.f6332d
            q.b.a.b.g.e.u5 r1 = p213q.p217b.p218a.p231b.p251g.p256e.C2698u5.m6462a()
            if (r0 == r1) goto L_0x04e3
            q.b.a.b.g.e.p7 r0 = r7.f6881e
            q.b.a.b.g.e.u5 r1 = r8.f6332d
            java.util.Map<q.b.a.b.g.e.u5$a, q.b.a.b.g.e.i6$d<?, ?>> r1 = r1.f6915a
            q.b.a.b.g.e.u5$a r3 = new q.b.a.b.g.e.u5$a
            r9 = r26
            r3.<init>(r0, r9)
            java.lang.Object r0 = r1.get(r3)
            q.b.a.b.g.e.i6$d r0 = (p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2494d) r0
            if (r0 != 0) goto L_0x04d5
            q.b.a.b.g.e.t8 r4 = m6407e(r30)
            r0 = r10
            r1 = r31
            r3 = r33
            r5 = r35
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5148a(r0, r1, r2, r3, r4, r5)
            r14 = r30
            r4 = r31
            r12 = r4
            r1 = r6
            r15 = r7
            r11 = r8
            r2 = r9
            r6 = r13
            r3 = r16
            r5 = r19
            r9 = r27
            r13 = r33
            goto L_0x050c
        L_0x04d5:
            r11 = r30
            r0 = r11
            q.b.a.b.g.e.i6$b r0 = (p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2492b) r0
            r0.mo7779a()
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x04e3:
            r11 = r30
            goto L_0x04ea
        L_0x04e6:
            r11 = r30
            r8 = r35
        L_0x04ea:
            r9 = r26
            q.b.a.b.g.e.t8 r4 = m6407e(r30)
            r0 = r10
            r1 = r31
            r3 = r33
            r5 = r35
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5148a(r0, r1, r2, r3, r4, r5)
            r4 = r31
            r12 = r4
            r1 = r6
            r15 = r7
            r2 = r9
            r14 = r11
            r6 = r13
            r3 = r16
            r5 = r19
            r9 = r27
            r13 = r33
        L_0x050b:
            r11 = r8
        L_0x050c:
            r16 = r10
            goto L_0x0019
        L_0x0510:
            r4 = r31
            r12 = r4
            r13 = r33
            r1 = r34
            r15 = r7
            r2 = r9
            r14 = r11
            r3 = r16
            r5 = r19
            r6 = r21
            r9 = r27
            goto L_0x050b
        L_0x0523:
            r19 = r5
            r21 = r6
            r27 = r9
            r11 = r14
            r7 = r15
            r20 = 1
            r10 = r16
        L_0x052f:
            r2 = 1048575(0xfffff, float:1.469367E-39)
            if (r5 == r2) goto L_0x053a
            long r3 = (long) r5
            r5 = r27
            r5.putInt(r11, r3, r6)
        L_0x053a:
            int r3 = r7.f6886j
        L_0x053c:
            int r4 = r7.f6887k
            if (r3 >= r4) goto L_0x05ab
            int[] r4 = r7.f6885i
            r4 = r4[r3]
            q.b.a.b.g.e.u8<?, ?> r5 = r7.f6890n
            int[] r6 = r7.f6877a
            r8 = r6[r4]
            int r8 = r4 + 1
            r6 = r6[r8]
            r6 = r6 & r2
            long r8 = (long) r6
            java.lang.Object r6 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r11, r8)
            if (r6 != 0) goto L_0x0557
            goto L_0x05a8
        L_0x0557:
            java.lang.Object[] r8 = r7.f6878b
            int r4 = r4 / 3
            int r4 = r4 << 1
            int r9 = r4 + 1
            r8 = r8[r9]
            q.b.a.b.g.e.m6 r8 = (p213q.p217b.p218a.p231b.p251g.p256e.C2563m6) r8
            if (r8 != 0) goto L_0x0566
            goto L_0x05a8
        L_0x0566:
            q.b.a.b.g.e.m7 r9 = r7.f6892p
            java.util.Map r6 = r9.mo7849a(r6)
            q.b.a.b.g.e.m7 r9 = r7.f6892p
            java.lang.Object[] r12 = r7.f6878b
            r4 = r12[r4]
            r9.mo7852d(r4)
            java.util.Set r4 = r6.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x057d:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x05a8
            java.lang.Object r6 = r4.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r9 = r6.getValue()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            boolean r9 = r8.mo7788a(r9)
            if (r9 != 0) goto L_0x057d
            q.b.a.b.g.e.w8 r5 = (p213q.p217b.p218a.p231b.p251g.p256e.C2734w8) r5
            if (r5 == 0) goto L_0x05a7
            p213q.p217b.p218a.p231b.p251g.p256e.C2685t8.m6439b()
            r6.getKey()
            r6.getValue()
            throw r17
        L_0x05a7:
            throw r17
        L_0x05a8:
            int r3 = r3 + 1
            goto L_0x053c
        L_0x05ab:
            if (r1 != 0) goto L_0x05b7
            r2 = r33
            if (r0 != r2) goto L_0x05b2
            goto L_0x05bd
        L_0x05b2:
            q.b.a.b.g.e.p6 r0 = p213q.p217b.p218a.p231b.p251g.p256e.C2618p6.m6294e()
            throw r0
        L_0x05b7:
            r2 = r33
            if (r0 > r2) goto L_0x05be
            if (r10 != r1) goto L_0x05be
        L_0x05bd:
            return r0
        L_0x05be:
            q.b.a.b.g.e.p6 r0 = p213q.p217b.p218a.p231b.p251g.p256e.C2618p6.m6294e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p251g.p256e.C2684t7.mo8016a(java.lang.Object, byte[], int, int, int, q.b.a.b.g.e.b5):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
        p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5485a((java.lang.Object) r7, r2, p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r8, r2));
        mo8025b(r7, r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005d, code lost:
        p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.f6344f.mo7430a((java.lang.Object) r7, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009f, code lost:
        p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5485a((java.lang.Object) r7, r2, p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e1, code lost:
        p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5484a((java.lang.Object) r7, r2, p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5488b(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0106, code lost:
        mo8024b(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0109, code lost:
        r0 = r0 + 3;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7683b(T r7, T r8) {
        /*
            r6 = this;
            if (r8 == 0) goto L_0x011c
            r0 = 0
        L_0x0003:
            int[] r1 = r6.f6877a
            int r1 = r1.length
            if (r0 >= r1) goto L_0x010d
            int r1 = r6.mo8030d(r0)
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r1
            long r2 = (long) r2
            int[] r4 = r6.f6877a
            r4 = r4[r0]
            r5 = 267386880(0xff00000, float:2.3665827E-29)
            r1 = r1 & r5
            int r1 = r1 >>> 20
            switch(r1) {
                case 0: goto L_0x00f9;
                case 1: goto L_0x00e9;
                case 2: goto L_0x00db;
                case 3: goto L_0x00d4;
                case 4: goto L_0x00c9;
                case 5: goto L_0x00c2;
                case 6: goto L_0x00b7;
                case 7: goto L_0x00a7;
                case 8: goto L_0x0099;
                case 9: goto L_0x0094;
                case 10: goto L_0x008d;
                case 11: goto L_0x0082;
                case 12: goto L_0x0077;
                case 13: goto L_0x006c;
                case 14: goto L_0x0064;
                case 15: goto L_0x0053;
                case 16: goto L_0x004b;
                case 17: goto L_0x0094;
                case 18: goto L_0x0044;
                case 19: goto L_0x0044;
                case 20: goto L_0x0044;
                case 21: goto L_0x0044;
                case 22: goto L_0x0044;
                case 23: goto L_0x0044;
                case 24: goto L_0x0044;
                case 25: goto L_0x0044;
                case 26: goto L_0x0044;
                case 27: goto L_0x0044;
                case 28: goto L_0x0044;
                case 29: goto L_0x0044;
                case 30: goto L_0x0044;
                case 31: goto L_0x0044;
                case 32: goto L_0x0044;
                case 33: goto L_0x0044;
                case 34: goto L_0x0044;
                case 35: goto L_0x0044;
                case 36: goto L_0x0044;
                case 37: goto L_0x0044;
                case 38: goto L_0x0044;
                case 39: goto L_0x0044;
                case 40: goto L_0x0044;
                case 41: goto L_0x0044;
                case 42: goto L_0x0044;
                case 43: goto L_0x0044;
                case 44: goto L_0x0044;
                case 45: goto L_0x0044;
                case 46: goto L_0x0044;
                case 47: goto L_0x0044;
                case 48: goto L_0x0044;
                case 49: goto L_0x0044;
                case 50: goto L_0x003d;
                case 51: goto L_0x002b;
                case 52: goto L_0x002b;
                case 53: goto L_0x002b;
                case 54: goto L_0x002b;
                case 55: goto L_0x002b;
                case 56: goto L_0x002b;
                case 57: goto L_0x002b;
                case 58: goto L_0x002b;
                case 59: goto L_0x002b;
                case 60: goto L_0x0026;
                case 61: goto L_0x001f;
                case 62: goto L_0x001f;
                case 63: goto L_0x001f;
                case 64: goto L_0x001f;
                case 65: goto L_0x001f;
                case 66: goto L_0x001f;
                case 67: goto L_0x001f;
                case 68: goto L_0x0026;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x0109
        L_0x001f:
            boolean r1 = r6.mo8021a((T) r8, r4, r0)
            if (r1 == 0) goto L_0x0109
            goto L_0x0031
        L_0x0026:
            r6.mo8026b((T) r7, (T) r8, r0)
            goto L_0x0109
        L_0x002b:
            boolean r1 = r6.mo8021a((T) r8, r4, r0)
            if (r1 == 0) goto L_0x0109
        L_0x0031:
            java.lang.Object r1 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r8, r2)
            p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5485a(r7, r2, r1)
            r6.mo8025b((T) r7, r4, r0)
            goto L_0x0109
        L_0x003d:
            q.b.a.b.g.e.m7 r1 = r6.f6892p
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m5986a(r1, r7, r8, r2)
            goto L_0x0109
        L_0x0044:
            q.b.a.b.g.e.z6 r1 = r6.f6889m
            r1.mo7413a(r7, r8, r2)
            goto L_0x0109
        L_0x004b:
            boolean r1 = r6.mo8020a((T) r8, r0)
            if (r1 == 0) goto L_0x0109
            goto L_0x00e1
        L_0x0053:
            boolean r1 = r6.mo8020a((T) r8, r0)
            if (r1 == 0) goto L_0x0109
            int r1 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5479a(r8, r2)
        L_0x005d:
            q.b.a.b.g.e.b9$c r4 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.f6344f
            r4.mo7430a(r7, r2, r1)
            goto L_0x0106
        L_0x0064:
            boolean r1 = r6.mo8020a((T) r8, r0)
            if (r1 == 0) goto L_0x0109
            goto L_0x00e1
        L_0x006c:
            boolean r1 = r6.mo8020a((T) r8, r0)
            if (r1 == 0) goto L_0x0109
            int r1 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5479a(r8, r2)
            goto L_0x005d
        L_0x0077:
            boolean r1 = r6.mo8020a((T) r8, r0)
            if (r1 == 0) goto L_0x0109
            int r1 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5479a(r8, r2)
            goto L_0x005d
        L_0x0082:
            boolean r1 = r6.mo8020a((T) r8, r0)
            if (r1 == 0) goto L_0x0109
            int r1 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5479a(r8, r2)
            goto L_0x005d
        L_0x008d:
            boolean r1 = r6.mo8020a((T) r8, r0)
            if (r1 == 0) goto L_0x0109
            goto L_0x009f
        L_0x0094:
            r6.mo8018a((T) r7, (T) r8, r0)
            goto L_0x0109
        L_0x0099:
            boolean r1 = r6.mo8020a((T) r8, r0)
            if (r1 == 0) goto L_0x0109
        L_0x009f:
            java.lang.Object r1 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r8, r2)
            p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5485a(r7, r2, r1)
            goto L_0x0106
        L_0x00a7:
            boolean r1 = r6.mo8020a((T) r8, r0)
            if (r1 == 0) goto L_0x0109
            boolean r1 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5492c(r8, r2)
            q.b.a.b.g.e.b9$c r4 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.f6344f
            r4.mo7426a(r7, r2, r1)
            goto L_0x0106
        L_0x00b7:
            boolean r1 = r6.mo8020a((T) r8, r0)
            if (r1 == 0) goto L_0x0109
            int r1 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5479a(r8, r2)
            goto L_0x005d
        L_0x00c2:
            boolean r1 = r6.mo8020a((T) r8, r0)
            if (r1 == 0) goto L_0x0109
            goto L_0x00e1
        L_0x00c9:
            boolean r1 = r6.mo8020a((T) r8, r0)
            if (r1 == 0) goto L_0x0109
            int r1 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5479a(r8, r2)
            goto L_0x005d
        L_0x00d4:
            boolean r1 = r6.mo8020a((T) r8, r0)
            if (r1 == 0) goto L_0x0109
            goto L_0x00e1
        L_0x00db:
            boolean r1 = r6.mo8020a((T) r8, r0)
            if (r1 == 0) goto L_0x0109
        L_0x00e1:
            long r4 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5488b(r8, r2)
            p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5484a(r7, r2, r4)
            goto L_0x0106
        L_0x00e9:
            boolean r1 = r6.mo8020a((T) r8, r0)
            if (r1 == 0) goto L_0x0109
            float r1 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5493d(r8, r2)
            q.b.a.b.g.e.b9$c r4 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.f6344f
            r4.mo7425a(r7, r2, r1)
            goto L_0x0106
        L_0x00f9:
            boolean r1 = r6.mo8020a((T) r8, r0)
            if (r1 == 0) goto L_0x0109
            double r4 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5495e(r8, r2)
            p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5483a(r7, r2, r4)
        L_0x0106:
            r6.mo8024b((T) r7, r0)
        L_0x0109:
            int r0 = r0 + 3
            goto L_0x0003
        L_0x010d:
            q.b.a.b.g.e.u8<?, ?> r0 = r6.f6890n
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m5987a(r0, r7, r8)
            boolean r0 = r6.f6882f
            if (r0 == 0) goto L_0x011b
            q.b.a.b.g.e.w5<?> r0 = r6.f6891o
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m5988a(r0, r7, r8)
        L_0x011b:
            return
        L_0x011c:
            r7 = 0
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p251g.p256e.C2684t7.mo7683b(java.lang.Object, java.lang.Object):void");
    }

    /* renamed from: b */
    public final void mo8026b(T t, T t2, int i) {
        int[] iArr = this.f6877a;
        int i2 = iArr[i + 1];
        int i3 = iArr[i];
        long j = (long) (i2 & 1048575);
        if (mo8021a(t2, i3, i)) {
            Object f = C2366b9.m5496f(t, j);
            Object f2 = C2366b9.m5496f(t2, j);
            if (f == null || f2 == null) {
                if (f2 != null) {
                    C2366b9.m5485a((Object) t, j, f2);
                    mo8025b(t, i3, i);
                }
                return;
            }
            C2366b9.m5485a((Object) t, j, C2546l6.m6113a(f, f2));
            mo8025b(t, i3, i);
        }
    }

    /* renamed from: b */
    public final boolean mo7684b(T t) {
        int i;
        int i2;
        T t2 = t;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            boolean z = true;
            if (i5 < this.f6886j) {
                int i6 = this.f6885i[i5];
                int i7 = this.f6877a[i6];
                int d = mo8030d(i6);
                int i8 = this.f6877a[i6 + 2];
                int i9 = i8 & 1048575;
                int i10 = 1 << (i8 >>> 20);
                if (i9 != i3) {
                    if (i9 != 1048575) {
                        i4 = f6876r.getInt(t2, (long) i9);
                    }
                    i = i4;
                    i2 = i9;
                } else {
                    i2 = i3;
                    i = i4;
                }
                if (((268435456 & d) != 0) && !mo8022a(t, i6, i2, i, i10)) {
                    return false;
                }
                int i11 = (267386880 & d) >>> 20;
                if (i11 != 9 && i11 != 17) {
                    if (i11 != 27) {
                        if (i11 == 60 || i11 == 68) {
                            if (mo8021a(t2, i7, i6) && !mo8017a(i6).mo7684b(C2366b9.m5496f(t2, (long) (d & 1048575)))) {
                                return false;
                            }
                        } else if (i11 != 49) {
                            if (i11 == 50 && !this.f6892p.mo7851c(C2366b9.m5496f(t2, (long) (d & 1048575))).isEmpty()) {
                                this.f6892p.mo7852d(mo8023b(i6));
                                throw null;
                            }
                        }
                    }
                    List list = (List) C2366b9.m5496f(t2, (long) (d & 1048575));
                    if (!list.isEmpty()) {
                        C2455g8 a = mo8017a(i6);
                        int i12 = 0;
                        while (true) {
                            if (i12 >= list.size()) {
                                break;
                            } else if (!a.mo7684b(list.get(i12))) {
                                z = false;
                                break;
                            } else {
                                i12++;
                            }
                        }
                    }
                    if (!z) {
                        return false;
                    }
                } else if (mo8022a(t, i6, i2, i, i10) && !mo8017a(i6).mo7684b(C2366b9.m5496f(t2, (long) (d & 1048575)))) {
                    return false;
                }
                i5++;
                i3 = i2;
                i4 = i;
            } else {
                if (this.f6882f) {
                    if (((C2715v5) this.f6891o) == null) {
                        throw null;
                    } else if (!((C2492b) t2).zzc.mo8096c()) {
                        return false;
                    }
                }
                return true;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:162:0x0346  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> p213q.p217b.p218a.p231b.p251g.p256e.C2684t7<T> m6400a(java.lang.Class<T> r33, p213q.p217b.p218a.p231b.p251g.p256e.C2582n7 r34, p213q.p217b.p218a.p231b.p251g.p256e.C2717v7 r35, p213q.p217b.p218a.p231b.p251g.p256e.C2779z6 r36, p213q.p217b.p218a.p231b.p251g.p256e.C2702u8<?, ?> r37, p213q.p217b.p218a.p231b.p251g.p256e.C2731w5<?> r38, p213q.p217b.p218a.p231b.p251g.p256e.C2564m7 r39) {
        /*
            r0 = r34
            boolean r1 = r0 instanceof p213q.p217b.p218a.p231b.p251g.p256e.C2420e8
            if (r1 == 0) goto L_0x041b
            q.b.a.b.g.e.e8 r0 = (p213q.p217b.p218a.p231b.p251g.p256e.C2420e8) r0
            int r1 = r0.f6468d
            r2 = 1
            r1 = r1 & r2
            r3 = 2
            if (r1 != r2) goto L_0x0011
            r1 = r2
            goto L_0x0012
        L_0x0011:
            r1 = r3
        L_0x0012:
            r4 = 0
            if (r1 != r3) goto L_0x0017
            r11 = r2
            goto L_0x0018
        L_0x0017:
            r11 = r4
        L_0x0018:
            java.lang.String r1 = r0.f6466b
            int r3 = r1.length()
            char r5 = r1.charAt(r4)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r6) goto L_0x0032
            r5 = r2
        L_0x0028:
            int r7 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x0033
            r5 = r7
            goto L_0x0028
        L_0x0032:
            r7 = r2
        L_0x0033:
            int r5 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x0052
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x003f:
            int r10 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x004f
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r5 = r5 << r9
            r7 = r7 | r5
            int r9 = r9 + 13
            r5 = r10
            goto L_0x003f
        L_0x004f:
            int r5 = r5 << r9
            r7 = r7 | r5
            r5 = r10
        L_0x0052:
            if (r7 != 0) goto L_0x005f
            int[] r7 = f6875q
            r9 = r4
            r10 = r9
            r12 = r10
            r14 = r12
            r15 = r14
            r13 = r7
            r7 = r15
            goto L_0x0170
        L_0x005f:
            int r7 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x007e
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x006b:
            int r10 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x007b
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r9
            r5 = r5 | r7
            int r9 = r9 + 13
            r7 = r10
            goto L_0x006b
        L_0x007b:
            int r7 = r7 << r9
            r5 = r5 | r7
            r7 = r10
        L_0x007e:
            int r9 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x009d
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x008a:
            int r12 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r6) goto L_0x009a
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r10
            r7 = r7 | r9
            int r10 = r10 + 13
            r9 = r12
            goto L_0x008a
        L_0x009a:
            int r9 = r9 << r10
            r7 = r7 | r9
            r9 = r12
        L_0x009d:
            int r10 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r6) goto L_0x00bc
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00a9:
            int r13 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r6) goto L_0x00b9
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r12
            r9 = r9 | r10
            int r12 = r12 + 13
            r10 = r13
            goto L_0x00a9
        L_0x00b9:
            int r10 = r10 << r12
            r9 = r9 | r10
            r10 = r13
        L_0x00bc:
            int r12 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r6) goto L_0x00db
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00c8:
            int r14 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r6) goto L_0x00d8
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r10 = r10 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00c8
        L_0x00d8:
            int r12 = r12 << r13
            r10 = r10 | r12
            r12 = r14
        L_0x00db:
            int r13 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r6) goto L_0x00fa
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00e7:
            int r15 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r6) goto L_0x00f7
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00e7
        L_0x00f7:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x00fa:
            int r14 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r6) goto L_0x011b
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x0106:
            int r16 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r6) goto L_0x0117
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x0106
        L_0x0117:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x011b:
            int r15 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r6) goto L_0x013e
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x0127:
            int r17 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r6) goto L_0x0139
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x0127
        L_0x0139:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x013e:
            int r16 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r6) goto L_0x0163
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r4 = r16
            r16 = 13
        L_0x014c:
            int r17 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r6) goto L_0x015e
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r16
            r15 = r15 | r4
            int r16 = r16 + 13
            r4 = r17
            goto L_0x014c
        L_0x015e:
            int r4 = r4 << r16
            r15 = r15 | r4
            r16 = r17
        L_0x0163:
            int r4 = r15 + r13
            int r4 = r4 + r14
            int[] r4 = new int[r4]
            int r14 = r5 << 1
            int r14 = r14 + r7
            r7 = r13
            r13 = r4
            r4 = r5
            r5 = r16
        L_0x0170:
            sun.misc.Unsafe r8 = f6876r
            java.lang.Object[] r6 = r0.f6467c
            q.b.a.b.g.e.p7 r2 = r0.f6465a
            java.lang.Class r2 = r2.getClass()
            r18 = r5
            int r5 = r12 * 3
            int[] r5 = new int[r5]
            r17 = 1
            int r12 = r12 << 1
            java.lang.Object[] r12 = new java.lang.Object[r12]
            int r19 = r15 + r7
            r21 = r15
            r7 = r18
            r22 = r19
            r18 = 0
            r20 = 0
        L_0x0192:
            if (r7 >= r3) goto L_0x03ed
            int r23 = r7 + 1
            char r7 = r1.charAt(r7)
            r24 = r3
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r7 < r3) goto L_0x01c6
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r3 = r23
            r23 = 13
        L_0x01a7:
            int r25 = r3 + 1
            char r3 = r1.charAt(r3)
            r26 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r15) goto L_0x01c0
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r23
            r7 = r7 | r3
            int r23 = r23 + 13
            r3 = r25
            r15 = r26
            goto L_0x01a7
        L_0x01c0:
            int r3 = r3 << r23
            r7 = r7 | r3
            r3 = r25
            goto L_0x01ca
        L_0x01c6:
            r26 = r15
            r3 = r23
        L_0x01ca:
            int r15 = r3 + 1
            char r3 = r1.charAt(r3)
            r23 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r15) goto L_0x01fc
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r15 = r23
            r23 = 13
        L_0x01dd:
            int r25 = r15 + 1
            char r15 = r1.charAt(r15)
            r27 = r10
            r10 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r10) goto L_0x01f6
            r10 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r23
            r3 = r3 | r10
            int r23 = r23 + 13
            r15 = r25
            r10 = r27
            goto L_0x01dd
        L_0x01f6:
            int r10 = r15 << r23
            r3 = r3 | r10
            r15 = r25
            goto L_0x0200
        L_0x01fc:
            r27 = r10
            r15 = r23
        L_0x0200:
            r10 = r3 & 255(0xff, float:3.57E-43)
            r23 = r9
            r9 = r3 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L_0x020e
            int r9 = r18 + 1
            r13[r18] = r20
            r18 = r9
        L_0x020e:
            r9 = 51
            r29 = r0
            if (r10 < r9) goto L_0x02af
            int r9 = r15 + 1
            char r15 = r1.charAt(r15)
            r0 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r0) goto L_0x023d
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r31 = 13
        L_0x0223:
            int r32 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r0) goto L_0x0238
            r0 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r0 = r0 << r31
            r15 = r15 | r0
            int r31 = r31 + 13
            r9 = r32
            r0 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0223
        L_0x0238:
            int r0 = r9 << r31
            r15 = r15 | r0
            r9 = r32
        L_0x023d:
            int r0 = r10 + -51
            r31 = r9
            r9 = 9
            if (r0 == r9) goto L_0x025e
            r9 = 17
            if (r0 != r9) goto L_0x024a
            goto L_0x025e
        L_0x024a:
            r9 = 12
            if (r0 != r9) goto L_0x025c
            if (r11 != 0) goto L_0x025c
            int r0 = r20 / 3
            r9 = 1
            int r0 = r0 << r9
            int r0 = r0 + r9
            int r9 = r14 + 1
            r14 = r6[r14]
            r12[r0] = r14
            r14 = r9
        L_0x025c:
            r9 = 1
            goto L_0x026b
        L_0x025e:
            int r0 = r20 / 3
            r9 = 1
            int r0 = r0 << r9
            int r0 = r0 + r9
            int r17 = r14 + 1
            r14 = r6[r14]
            r12[r0] = r14
            r14 = r17
        L_0x026b:
            int r0 = r15 << 1
            r9 = r6[r0]
            boolean r15 = r9 instanceof java.lang.reflect.Field
            if (r15 == 0) goto L_0x0276
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            goto L_0x027e
        L_0x0276:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = m6398a(r2, r9)
            r6[r0] = r9
        L_0x027e:
            r25 = r14
            long r14 = r8.objectFieldOffset(r9)
            int r9 = (int) r14
            int r0 = r0 + 1
            r14 = r6[r0]
            boolean r15 = r14 instanceof java.lang.reflect.Field
            if (r15 == 0) goto L_0x0290
            java.lang.reflect.Field r14 = (java.lang.reflect.Field) r14
            goto L_0x0298
        L_0x0290:
            java.lang.String r14 = (java.lang.String) r14
            java.lang.reflect.Field r14 = m6398a(r2, r14)
            r6[r0] = r14
        L_0x0298:
            long r14 = r8.objectFieldOffset(r14)
            int r0 = (int) r14
            r28 = r1
            r14 = r11
            r30 = r25
            r15 = r31
            r16 = 1
            r1 = r0
            r25 = r12
            r0 = 55296(0xd800, float:7.7486E-41)
            r12 = 0
            goto L_0x03b5
        L_0x02af:
            int r0 = r14 + 1
            r9 = r6[r14]
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = m6398a(r2, r9)
            r14 = 9
            if (r10 == r14) goto L_0x032a
            r14 = 17
            if (r10 != r14) goto L_0x02c3
            goto L_0x032a
        L_0x02c3:
            r14 = 27
            if (r10 == r14) goto L_0x0318
            r14 = 49
            if (r10 != r14) goto L_0x02cc
            goto L_0x0318
        L_0x02cc:
            r14 = 12
            if (r10 == r14) goto L_0x0304
            r14 = 30
            if (r10 == r14) goto L_0x0304
            r14 = 44
            if (r10 != r14) goto L_0x02d9
            goto L_0x0304
        L_0x02d9:
            r14 = 50
            if (r10 != r14) goto L_0x0338
            int r14 = r21 + 1
            r13[r21] = r20
            int r21 = r20 / 3
            r17 = 1
            int r21 = r21 << 1
            int r25 = r0 + 1
            r0 = r6[r0]
            r12[r21] = r0
            r0 = r3 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x02ff
            int r21 = r21 + 1
            int r0 = r25 + 1
            r25 = r6[r25]
            r12[r21] = r25
            r25 = r12
            r21 = r14
            r14 = r11
            goto L_0x033b
        L_0x02ff:
            r21 = r14
            r0 = r25
            goto L_0x0338
        L_0x0304:
            if (r11 != 0) goto L_0x0315
            int r14 = r20 / 3
            r17 = 1
            int r14 = r14 << 1
            int r14 = r14 + 1
            int r25 = r0 + 1
            r0 = r6[r0]
            r12[r14] = r0
            goto L_0x0326
        L_0x0315:
            r17 = 1
            goto L_0x0338
        L_0x0318:
            r17 = 1
            int r14 = r20 / 3
            int r14 = r14 << 1
            int r14 = r14 + 1
            int r25 = r0 + 1
            r0 = r6[r0]
            r12[r14] = r0
        L_0x0326:
            r14 = r11
            r0 = r25
            goto L_0x0339
        L_0x032a:
            r17 = 1
            int r14 = r20 / 3
            int r14 = r14 << 1
            int r14 = r14 + 1
            java.lang.Class r25 = r9.getType()
            r12[r14] = r25
        L_0x0338:
            r14 = r11
        L_0x0339:
            r25 = r12
        L_0x033b:
            long r11 = r8.objectFieldOffset(r9)
            int r9 = (int) r11
            r11 = r3 & 4096(0x1000, float:5.74E-42)
            r12 = 4096(0x1000, float:5.74E-42)
            if (r11 != r12) goto L_0x039a
            r11 = 17
            if (r10 > r11) goto L_0x039a
            int r11 = r15 + 1
            char r12 = r1.charAt(r15)
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r12 < r15) goto L_0x0370
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x0359:
            int r28 = r11 + 1
            char r11 = r1.charAt(r11)
            if (r11 < r15) goto L_0x036b
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r16
            r12 = r12 | r11
            int r16 = r16 + 13
            r11 = r28
            goto L_0x0359
        L_0x036b:
            int r11 = r11 << r16
            r12 = r12 | r11
            r11 = r28
        L_0x0370:
            r16 = 1
            int r17 = r4 << 1
            int r28 = r12 / 32
            int r28 = r28 + r17
            r15 = r6[r28]
            r30 = r0
            boolean r0 = r15 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x0383
            java.lang.reflect.Field r15 = (java.lang.reflect.Field) r15
            goto L_0x038b
        L_0x0383:
            java.lang.String r15 = (java.lang.String) r15
            java.lang.reflect.Field r15 = m6398a(r2, r15)
            r6[r28] = r15
        L_0x038b:
            r28 = r1
            long r0 = r8.objectFieldOffset(r15)
            int r0 = (int) r0
            int r12 = r12 % 32
            r1 = r0
            r15 = r11
            r0 = 55296(0xd800, float:7.7486E-41)
            goto L_0x03a7
        L_0x039a:
            r30 = r0
            r28 = r1
            r0 = 55296(0xd800, float:7.7486E-41)
            r16 = 1
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r12 = 0
        L_0x03a7:
            r11 = 18
            if (r10 < r11) goto L_0x03b5
            r11 = 49
            if (r10 > r11) goto L_0x03b5
            int r11 = r22 + 1
            r13[r22] = r9
            r22 = r11
        L_0x03b5:
            int r11 = r20 + 1
            r5[r20] = r7
            int r7 = r11 + 1
            r0 = r3 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x03c2
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x03c3
        L_0x03c2:
            r0 = 0
        L_0x03c3:
            r3 = r3 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x03ca
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03cb
        L_0x03ca:
            r3 = 0
        L_0x03cb:
            r0 = r0 | r3
            int r3 = r10 << 20
            r0 = r0 | r3
            r0 = r0 | r9
            r5[r11] = r0
            int r20 = r7 + 1
            int r0 = r12 << 20
            r0 = r0 | r1
            r5[r7] = r0
            r11 = r14
            r7 = r15
            r9 = r23
            r3 = r24
            r12 = r25
            r15 = r26
            r10 = r27
            r1 = r28
            r0 = r29
            r14 = r30
            goto L_0x0192
        L_0x03ed:
            r29 = r0
            r23 = r9
            r27 = r10
            r14 = r11
            r25 = r12
            r26 = r15
            q.b.a.b.g.e.t7 r0 = new q.b.a.b.g.e.t7
            r1 = r29
            q.b.a.b.g.e.p7 r10 = r1.f6465a
            r1 = r5
            r5 = r0
            r6 = r1
            r7 = r25
            r8 = r23
            r9 = r27
            r11 = r14
            r12 = r13
            r13 = r26
            r14 = r19
            r15 = r35
            r16 = r36
            r17 = r37
            r18 = r38
            r19 = r39
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r0
        L_0x041b:
            q.b.a.b.g.e.p8 r0 = (p213q.p217b.p218a.p231b.p251g.p256e.C2620p8) r0
            if (r0 == 0) goto L_0x0425
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x0425:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p251g.p256e.C2684t7.m6400a(java.lang.Class, q.b.a.b.g.e.n7, q.b.a.b.g.e.v7, q.b.a.b.g.e.z6, q.b.a.b.g.e.u8, q.b.a.b.g.e.w5, q.b.a.b.g.e.m7):q.b.a.b.g.e.t7");
    }

    /* renamed from: a */
    public final C2455g8 mo8017a(int i) {
        int i2 = (i / 3) << 1;
        Object[] objArr = this.f6878b;
        C2455g8 g8Var = (C2455g8) objArr[i2];
        if (g8Var != null) {
            return g8Var;
        }
        C2455g8 a = C2386c8.f6416c.mo7487a((Class) objArr[i2 + 1]);
        this.f6878b[i2] = a;
        return a;
    }

    /* renamed from: a */
    public static void m6401a(int i, Object obj, C2584n9 n9Var) {
        if (obj instanceof String) {
            String str = (String) obj;
            C2616a aVar = (C2616a) ((C2650r5) n9Var).f6834a;
            aVar.mo7946b((i << 3) | 2);
            aVar.mo7951b(str);
            return;
        }
        C2435f5 f5Var = (C2435f5) obj;
        C2616a aVar2 = (C2616a) ((C2650r5) n9Var).f6834a;
        aVar2.mo7946b((i << 3) | 2);
        aVar2.mo7952b(f5Var);
    }

    /* renamed from: a */
    public static <UT, UB> void m6402a(C2702u8<UT, UB> u8Var, T t, C2584n9 n9Var) {
        if (((C2734w8) u8Var) != null) {
            ((C2490i6) t).zzb.mo8034a(n9Var);
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public final <K, V> void mo8019a(C2584n9 n9Var, int i, Object obj, int i2) {
        if (obj != null) {
            this.f6892p.mo7852d(this.f6878b[(i2 / 3) << 1]);
            Map c = this.f6892p.mo7851c(obj);
            C2650r5 r5Var = (C2650r5) n9Var;
            if (r5Var != null) {
                Iterator it = c.entrySet().iterator();
                if (it.hasNext()) {
                    Entry entry = (Entry) it.next();
                    ((C2616a) r5Var.f6834a).mo7946b((i << 3) | 2);
                    entry.getKey();
                    entry.getValue();
                    throw null;
                }
                return;
            }
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x033a, code lost:
        ((p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r13).mo7987b(r7, p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r12, (long) (r5 & 1048575)), mo8017a(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0358, code lost:
        ((p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r13).mo7992e(r7, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x036c, code lost:
        ((p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r13).mo7990d(r7, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0380, code lost:
        ((p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r13).mo7986b(r7, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0394, code lost:
        ((p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r13).mo7979a(r7, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x03b6, code lost:
        ((p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r13).mo7988c(r7, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x03c4, code lost:
        ((p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r13).mo7983a(r7, (p213q.p217b.p218a.p231b.p251g.p256e.C2435f5) p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r12, (long) (r5 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x03da, code lost:
        ((p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r13).mo7982a(r7, p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r12, (long) (r5 & 1048575)), mo8017a(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x03f2, code lost:
        m6401a(r7, p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r12, (long) (r5 & 1048575)), r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0409, code lost:
        ((p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r13).mo7984a(r7, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x041d, code lost:
        ((p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r13).mo7985b(r7, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0430, code lost:
        ((p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r13).mo7991d(r7, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0451, code lost:
        ((p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r13).mo7989c(r7, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0464, code lost:
        ((p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r13).mo7980a(r7, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0477, code lost:
        ((p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r13).mo7978a(r7, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x048a, code lost:
        ((p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r13).mo7977a(r7, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0099, code lost:
        ((p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r13).f6834a.mo7944a(r7, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ff, code lost:
        ((p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r13).f6834a.mo7944a(r7, r5);
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x049c  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x04a2  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7680a(T r12, p213q.p217b.p218a.p231b.p251g.p256e.C2584n9 r13) {
        /*
            r11 = this;
            r0 = r13
            q.b.a.b.g.e.r5 r0 = (p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r0
            r1 = 0
            if (r0 == 0) goto L_0x04ac
            boolean r0 = r11.f6883g
            if (r0 == 0) goto L_0x04a8
            boolean r0 = r11.f6882f
            if (r0 == 0) goto L_0x002d
            q.b.a.b.g.e.w5<?> r0 = r11.f6891o
            q.b.a.b.g.e.v5 r0 = (p213q.p217b.p218a.p231b.p251g.p256e.C2715v5) r0
            if (r0 == 0) goto L_0x002c
            r0 = r12
            q.b.a.b.g.e.i6$b r0 = (p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2492b) r0
            q.b.a.b.g.e.x5<q.b.a.b.g.e.i6$e> r0 = r0.zzc
            q.b.a.b.g.e.h8<T, java.lang.Object> r2 = r0.f6958a
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x002d
            java.util.Iterator r0 = r0.mo8095b()
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            goto L_0x002e
        L_0x002c:
            throw r1
        L_0x002d:
            r0 = r1
        L_0x002e:
            int[] r2 = r11.f6877a
            int r2 = r2.length
            r3 = 0
            r4 = r3
        L_0x0033:
            if (r4 >= r2) goto L_0x049a
            int r5 = r11.mo8030d(r4)
            int[] r6 = r11.f6877a
            r7 = r6[r4]
            if (r0 != 0) goto L_0x0494
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r8 = r8 & r5
            int r8 = r8 >>> 20
            r9 = 1
            r10 = 1048575(0xfffff, float:1.469367E-39)
            switch(r8) {
                case 0: goto L_0x047e;
                case 1: goto L_0x046b;
                case 2: goto L_0x0458;
                case 3: goto L_0x0445;
                case 4: goto L_0x0437;
                case 5: goto L_0x0424;
                case 6: goto L_0x0411;
                case 7: goto L_0x03fd;
                case 8: goto L_0x03ec;
                case 9: goto L_0x03d4;
                case 10: goto L_0x03be;
                case 11: goto L_0x03aa;
                case 12: goto L_0x039c;
                case 13: goto L_0x0388;
                case 14: goto L_0x0374;
                case 15: goto L_0x0360;
                case 16: goto L_0x034c;
                case 17: goto L_0x0334;
                case 18: goto L_0x0325;
                case 19: goto L_0x0316;
                case 20: goto L_0x0307;
                case 21: goto L_0x02f8;
                case 22: goto L_0x02e9;
                case 23: goto L_0x02da;
                case 24: goto L_0x02cb;
                case 25: goto L_0x02bc;
                case 26: goto L_0x02ad;
                case 27: goto L_0x029a;
                case 28: goto L_0x028b;
                case 29: goto L_0x027c;
                case 30: goto L_0x026d;
                case 31: goto L_0x025e;
                case 32: goto L_0x024f;
                case 33: goto L_0x0240;
                case 34: goto L_0x0231;
                case 35: goto L_0x0222;
                case 36: goto L_0x0213;
                case 37: goto L_0x0204;
                case 38: goto L_0x01f5;
                case 39: goto L_0x01e6;
                case 40: goto L_0x01d7;
                case 41: goto L_0x01c8;
                case 42: goto L_0x01b9;
                case 43: goto L_0x01aa;
                case 44: goto L_0x019b;
                case 45: goto L_0x018c;
                case 46: goto L_0x017d;
                case 47: goto L_0x016e;
                case 48: goto L_0x015f;
                case 49: goto L_0x014c;
                case 50: goto L_0x0141;
                case 51: goto L_0x0133;
                case 52: goto L_0x0125;
                case 53: goto L_0x0117;
                case 54: goto L_0x0109;
                case 55: goto L_0x00f3;
                case 56: goto L_0x00e5;
                case 57: goto L_0x00d7;
                case 58: goto L_0x00c9;
                case 59: goto L_0x00c1;
                case 60: goto L_0x00b9;
                case 61: goto L_0x00b1;
                case 62: goto L_0x00a3;
                case 63: goto L_0x008d;
                case 64: goto L_0x007f;
                case 65: goto L_0x0071;
                case 66: goto L_0x0063;
                case 67: goto L_0x0055;
                case 68: goto L_0x004d;
                default: goto L_0x004b;
            }
        L_0x004b:
            goto L_0x0490
        L_0x004d:
            boolean r6 = r11.mo8021a((T) r12, r7, r4)
            if (r6 == 0) goto L_0x0490
            goto L_0x033a
        L_0x0055:
            boolean r6 = r11.mo8021a((T) r12, r7, r4)
            if (r6 == 0) goto L_0x0490
            r5 = r5 & r10
            long r5 = (long) r5
            long r5 = m6406e(r12, r5)
            goto L_0x0358
        L_0x0063:
            boolean r6 = r11.mo8021a((T) r12, r7, r4)
            if (r6 == 0) goto L_0x0490
            r5 = r5 & r10
            long r5 = (long) r5
            int r5 = m6405d(r12, r5)
            goto L_0x036c
        L_0x0071:
            boolean r6 = r11.mo8021a((T) r12, r7, r4)
            if (r6 == 0) goto L_0x0490
            r5 = r5 & r10
            long r5 = (long) r5
            long r5 = m6406e(r12, r5)
            goto L_0x0380
        L_0x007f:
            boolean r6 = r11.mo8021a((T) r12, r7, r4)
            if (r6 == 0) goto L_0x0490
            r5 = r5 & r10
            long r5 = (long) r5
            int r5 = m6405d(r12, r5)
            goto L_0x0394
        L_0x008d:
            boolean r6 = r11.mo8021a((T) r12, r7, r4)
            if (r6 == 0) goto L_0x0490
            r5 = r5 & r10
            long r5 = (long) r5
            int r5 = m6405d(r12, r5)
        L_0x0099:
            r6 = r13
            q.b.a.b.g.e.r5 r6 = (p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r6
            q.b.a.b.g.e.p5 r6 = r6.f6834a
            r6.mo7944a(r7, r5)
            goto L_0x0490
        L_0x00a3:
            boolean r6 = r11.mo8021a((T) r12, r7, r4)
            if (r6 == 0) goto L_0x0490
            r5 = r5 & r10
            long r5 = (long) r5
            int r5 = m6405d(r12, r5)
            goto L_0x03b6
        L_0x00b1:
            boolean r6 = r11.mo8021a((T) r12, r7, r4)
            if (r6 == 0) goto L_0x0490
            goto L_0x03c4
        L_0x00b9:
            boolean r6 = r11.mo8021a((T) r12, r7, r4)
            if (r6 == 0) goto L_0x0490
            goto L_0x03da
        L_0x00c1:
            boolean r6 = r11.mo8021a((T) r12, r7, r4)
            if (r6 == 0) goto L_0x0490
            goto L_0x03f2
        L_0x00c9:
            boolean r6 = r11.mo8021a((T) r12, r7, r4)
            if (r6 == 0) goto L_0x0490
            r5 = r5 & r10
            long r5 = (long) r5
            boolean r5 = m6408f(r12, r5)
            goto L_0x0409
        L_0x00d7:
            boolean r6 = r11.mo8021a((T) r12, r7, r4)
            if (r6 == 0) goto L_0x0490
            r5 = r5 & r10
            long r5 = (long) r5
            int r5 = m6405d(r12, r5)
            goto L_0x041d
        L_0x00e5:
            boolean r6 = r11.mo8021a((T) r12, r7, r4)
            if (r6 == 0) goto L_0x0490
            r5 = r5 & r10
            long r5 = (long) r5
            long r5 = m6406e(r12, r5)
            goto L_0x0430
        L_0x00f3:
            boolean r6 = r11.mo8021a((T) r12, r7, r4)
            if (r6 == 0) goto L_0x0490
            r5 = r5 & r10
            long r5 = (long) r5
            int r5 = m6405d(r12, r5)
        L_0x00ff:
            r6 = r13
            q.b.a.b.g.e.r5 r6 = (p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r6
            q.b.a.b.g.e.p5 r6 = r6.f6834a
            r6.mo7944a(r7, r5)
            goto L_0x0490
        L_0x0109:
            boolean r6 = r11.mo8021a((T) r12, r7, r4)
            if (r6 == 0) goto L_0x0490
            r5 = r5 & r10
            long r5 = (long) r5
            long r5 = m6406e(r12, r5)
            goto L_0x0451
        L_0x0117:
            boolean r6 = r11.mo8021a((T) r12, r7, r4)
            if (r6 == 0) goto L_0x0490
            r5 = r5 & r10
            long r5 = (long) r5
            long r5 = m6406e(r12, r5)
            goto L_0x0464
        L_0x0125:
            boolean r6 = r11.mo8021a((T) r12, r7, r4)
            if (r6 == 0) goto L_0x0490
            r5 = r5 & r10
            long r5 = (long) r5
            float r5 = m6404c(r12, r5)
            goto L_0x0477
        L_0x0133:
            boolean r6 = r11.mo8021a((T) r12, r7, r4)
            if (r6 == 0) goto L_0x0490
            r5 = r5 & r10
            long r5 = (long) r5
            double r5 = m6403b((T) r12, r5)
            goto L_0x048a
        L_0x0141:
            r5 = r5 & r10
            long r5 = (long) r5
            java.lang.Object r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r12, r5)
            r11.mo8019a(r13, r7, r5, r4)
            goto L_0x0490
        L_0x014c:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            q.b.a.b.g.e.g8 r7 = r11.mo8017a(r4)
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m5994b(r6, r5, r13, r7)
            goto L_0x0490
        L_0x015f:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6004e(r6, r5, r13, r9)
            goto L_0x0490
        L_0x016e:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6019j(r6, r5, r13, r9)
            goto L_0x0490
        L_0x017d:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6010g(r6, r5, r13, r9)
            goto L_0x0490
        L_0x018c:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6023l(r6, r5, r13, r9)
            goto L_0x0490
        L_0x019b:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6024m(r6, r5, r13, r9)
            goto L_0x0490
        L_0x01aa:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6016i(r6, r5, r13, r9)
            goto L_0x0490
        L_0x01b9:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6025n(r6, r5, r13, r9)
            goto L_0x0490
        L_0x01c8:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6021k(r6, r5, r13, r9)
            goto L_0x0490
        L_0x01d7:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6007f(r6, r5, r13, r9)
            goto L_0x0490
        L_0x01e6:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6013h(r6, r5, r13, r9)
            goto L_0x0490
        L_0x01f5:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6001d(r6, r5, r13, r9)
            goto L_0x0490
        L_0x0204:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m5998c(r6, r5, r13, r9)
            goto L_0x0490
        L_0x0213:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m5995b(r6, r5, r13, r9)
            goto L_0x0490
        L_0x0222:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m5984a(r6, r5, r13, r9)
            goto L_0x0490
        L_0x0231:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6004e(r6, r5, r13, r3)
            goto L_0x0490
        L_0x0240:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6019j(r6, r5, r13, r3)
            goto L_0x0490
        L_0x024f:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6010g(r6, r5, r13, r3)
            goto L_0x0490
        L_0x025e:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6023l(r6, r5, r13, r3)
            goto L_0x0490
        L_0x026d:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6024m(r6, r5, r13, r3)
            goto L_0x0490
        L_0x027c:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6016i(r6, r5, r13, r3)
            goto L_0x0490
        L_0x028b:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m5993b(r6, r5, r13)
            goto L_0x0490
        L_0x029a:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            q.b.a.b.g.e.g8 r7 = r11.mo8017a(r4)
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m5983a(r6, r5, r13, r7)
            goto L_0x0490
        L_0x02ad:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m5982a(r6, r5, r13)
            goto L_0x0490
        L_0x02bc:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6025n(r6, r5, r13, r3)
            goto L_0x0490
        L_0x02cb:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6021k(r6, r5, r13, r3)
            goto L_0x0490
        L_0x02da:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6007f(r6, r5, r13, r3)
            goto L_0x0490
        L_0x02e9:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6013h(r6, r5, r13, r3)
            goto L_0x0490
        L_0x02f8:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m6001d(r6, r5, r13, r3)
            goto L_0x0490
        L_0x0307:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m5998c(r6, r5, r13, r3)
            goto L_0x0490
        L_0x0316:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m5995b(r6, r5, r13, r3)
            goto L_0x0490
        L_0x0325:
            r6 = r6[r4]
            r5 = r5 & r10
            long r7 = (long) r5
            java.lang.Object r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r12, r7)
            java.util.List r5 = (java.util.List) r5
            p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m5984a(r6, r5, r13, r3)
            goto L_0x0490
        L_0x0334:
            boolean r6 = r11.mo8020a((T) r12, r4)
            if (r6 == 0) goto L_0x0490
        L_0x033a:
            r5 = r5 & r10
            long r5 = (long) r5
            java.lang.Object r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r12, r5)
            q.b.a.b.g.e.g8 r6 = r11.mo8017a(r4)
            r8 = r13
            q.b.a.b.g.e.r5 r8 = (p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r8
            r8.mo7987b(r7, r5, r6)
            goto L_0x0490
        L_0x034c:
            boolean r6 = r11.mo8020a((T) r12, r4)
            if (r6 == 0) goto L_0x0490
            r5 = r5 & r10
            long r5 = (long) r5
            long r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5488b(r12, r5)
        L_0x0358:
            r8 = r13
            q.b.a.b.g.e.r5 r8 = (p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r8
            r8.mo7992e(r7, r5)
            goto L_0x0490
        L_0x0360:
            boolean r6 = r11.mo8020a((T) r12, r4)
            if (r6 == 0) goto L_0x0490
            r5 = r5 & r10
            long r5 = (long) r5
            int r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5479a(r12, r5)
        L_0x036c:
            r6 = r13
            q.b.a.b.g.e.r5 r6 = (p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r6
            r6.mo7990d(r7, r5)
            goto L_0x0490
        L_0x0374:
            boolean r6 = r11.mo8020a((T) r12, r4)
            if (r6 == 0) goto L_0x0490
            r5 = r5 & r10
            long r5 = (long) r5
            long r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5488b(r12, r5)
        L_0x0380:
            r8 = r13
            q.b.a.b.g.e.r5 r8 = (p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r8
            r8.mo7986b(r7, r5)
            goto L_0x0490
        L_0x0388:
            boolean r6 = r11.mo8020a((T) r12, r4)
            if (r6 == 0) goto L_0x0490
            r5 = r5 & r10
            long r5 = (long) r5
            int r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5479a(r12, r5)
        L_0x0394:
            r6 = r13
            q.b.a.b.g.e.r5 r6 = (p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r6
            r6.mo7979a(r7, r5)
            goto L_0x0490
        L_0x039c:
            boolean r6 = r11.mo8020a((T) r12, r4)
            if (r6 == 0) goto L_0x0490
            r5 = r5 & r10
            long r5 = (long) r5
            int r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5479a(r12, r5)
            goto L_0x0099
        L_0x03aa:
            boolean r6 = r11.mo8020a((T) r12, r4)
            if (r6 == 0) goto L_0x0490
            r5 = r5 & r10
            long r5 = (long) r5
            int r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5479a(r12, r5)
        L_0x03b6:
            r6 = r13
            q.b.a.b.g.e.r5 r6 = (p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r6
            r6.mo7988c(r7, r5)
            goto L_0x0490
        L_0x03be:
            boolean r6 = r11.mo8020a((T) r12, r4)
            if (r6 == 0) goto L_0x0490
        L_0x03c4:
            r5 = r5 & r10
            long r5 = (long) r5
            java.lang.Object r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r12, r5)
            q.b.a.b.g.e.f5 r5 = (p213q.p217b.p218a.p231b.p251g.p256e.C2435f5) r5
            r6 = r13
            q.b.a.b.g.e.r5 r6 = (p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r6
            r6.mo7983a(r7, r5)
            goto L_0x0490
        L_0x03d4:
            boolean r6 = r11.mo8020a((T) r12, r4)
            if (r6 == 0) goto L_0x0490
        L_0x03da:
            r5 = r5 & r10
            long r5 = (long) r5
            java.lang.Object r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r12, r5)
            q.b.a.b.g.e.g8 r6 = r11.mo8017a(r4)
            r8 = r13
            q.b.a.b.g.e.r5 r8 = (p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r8
            r8.mo7982a(r7, r5, r6)
            goto L_0x0490
        L_0x03ec:
            boolean r6 = r11.mo8020a((T) r12, r4)
            if (r6 == 0) goto L_0x0490
        L_0x03f2:
            r5 = r5 & r10
            long r5 = (long) r5
            java.lang.Object r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r12, r5)
            m6401a(r7, r5, r13)
            goto L_0x0490
        L_0x03fd:
            boolean r6 = r11.mo8020a((T) r12, r4)
            if (r6 == 0) goto L_0x0490
            r5 = r5 & r10
            long r5 = (long) r5
            boolean r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5492c(r12, r5)
        L_0x0409:
            r6 = r13
            q.b.a.b.g.e.r5 r6 = (p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r6
            r6.mo7984a(r7, r5)
            goto L_0x0490
        L_0x0411:
            boolean r6 = r11.mo8020a((T) r12, r4)
            if (r6 == 0) goto L_0x0490
            r5 = r5 & r10
            long r5 = (long) r5
            int r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5479a(r12, r5)
        L_0x041d:
            r6 = r13
            q.b.a.b.g.e.r5 r6 = (p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r6
            r6.mo7985b(r7, r5)
            goto L_0x0490
        L_0x0424:
            boolean r6 = r11.mo8020a((T) r12, r4)
            if (r6 == 0) goto L_0x0490
            r5 = r5 & r10
            long r5 = (long) r5
            long r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5488b(r12, r5)
        L_0x0430:
            r8 = r13
            q.b.a.b.g.e.r5 r8 = (p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r8
            r8.mo7991d(r7, r5)
            goto L_0x0490
        L_0x0437:
            boolean r6 = r11.mo8020a((T) r12, r4)
            if (r6 == 0) goto L_0x0490
            r5 = r5 & r10
            long r5 = (long) r5
            int r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5479a(r12, r5)
            goto L_0x00ff
        L_0x0445:
            boolean r6 = r11.mo8020a((T) r12, r4)
            if (r6 == 0) goto L_0x0490
            r5 = r5 & r10
            long r5 = (long) r5
            long r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5488b(r12, r5)
        L_0x0451:
            r8 = r13
            q.b.a.b.g.e.r5 r8 = (p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r8
            r8.mo7989c(r7, r5)
            goto L_0x0490
        L_0x0458:
            boolean r6 = r11.mo8020a((T) r12, r4)
            if (r6 == 0) goto L_0x0490
            r5 = r5 & r10
            long r5 = (long) r5
            long r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5488b(r12, r5)
        L_0x0464:
            r8 = r13
            q.b.a.b.g.e.r5 r8 = (p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r8
            r8.mo7980a(r7, r5)
            goto L_0x0490
        L_0x046b:
            boolean r6 = r11.mo8020a((T) r12, r4)
            if (r6 == 0) goto L_0x0490
            r5 = r5 & r10
            long r5 = (long) r5
            float r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5493d(r12, r5)
        L_0x0477:
            r6 = r13
            q.b.a.b.g.e.r5 r6 = (p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r6
            r6.mo7978a(r7, r5)
            goto L_0x0490
        L_0x047e:
            boolean r6 = r11.mo8020a((T) r12, r4)
            if (r6 == 0) goto L_0x0490
            r5 = r5 & r10
            long r5 = (long) r5
            double r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5495e(r12, r5)
        L_0x048a:
            r8 = r13
            q.b.a.b.g.e.r5 r8 = (p213q.p217b.p218a.p231b.p251g.p256e.C2650r5) r8
            r8.mo7977a(r7, r5)
        L_0x0490:
            int r4 = r4 + 3
            goto L_0x0033
        L_0x0494:
            q.b.a.b.g.e.w5<?> r12 = r11.f6891o
            r12.mo8057a(r0)
            throw r1
        L_0x049a:
            if (r0 != 0) goto L_0x04a2
            q.b.a.b.g.e.u8<?, ?> r0 = r11.f6890n
            m6402a(r0, (T) r12, r13)
            return
        L_0x04a2:
            q.b.a.b.g.e.w5<?> r12 = r11.f6891o
            r12.mo8058a(r13, r0)
            throw r1
        L_0x04a8:
            r11.mo8027b((T) r12, r13)
            return
        L_0x04ac:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p251g.p256e.C2684t7.mo7680a(java.lang.Object, q.b.a.b.g.e.n9):void");
    }

    /* renamed from: a */
    public final void mo8018a(T t, T t2, int i) {
        long j = (long) (this.f6877a[i + 1] & 1048575);
        if (mo8020a(t2, i)) {
            Object f = C2366b9.m5496f(t, j);
            Object f2 = C2366b9.m5496f(t2, j);
            if (f == null || f2 == null) {
                if (f2 != null) {
                    C2366b9.m5485a((Object) t, j, f2);
                    mo8024b(t, i);
                }
                return;
            }
            C2366b9.m5485a((Object) t, j, C2546l6.m6113a(f, f2));
            mo8024b(t, i);
        }
    }

    /* JADX WARNING: type inference failed for: r32v0, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r12v0 */
    /* JADX WARNING: type inference failed for: r2v0, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r12v1, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r0v5, types: [int, byte] */
    /* JADX WARNING: type inference failed for: r16v0, types: [int] */
    /* JADX WARNING: type inference failed for: r12v2 */
    /* JADX WARNING: type inference failed for: r12v3 */
    /* JADX WARNING: type inference failed for: r0v9, types: [int] */
    /* JADX WARNING: type inference failed for: r1v7, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r2v13, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r5v10, types: [int] */
    /* JADX WARNING: type inference failed for: r2v14, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r2v16, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r5v13, types: [int] */
    /* JADX WARNING: type inference failed for: r1v15, types: [int] */
    /* JADX WARNING: type inference failed for: r2v17, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r16v1 */
    /* JADX WARNING: type inference failed for: r3v24, types: [int] */
    /* JADX WARNING: type inference failed for: r16v2 */
    /* JADX WARNING: type inference failed for: r12v6 */
    /* JADX WARNING: type inference failed for: r12v7 */
    /* JADX WARNING: type inference failed for: r12v8 */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02eb, code lost:
        if (r0 == r20) goto L_0x033a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0338, code lost:
        if (r0 == r14) goto L_0x033a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0353, code lost:
        r5 = r15;
        r6 = r21;
        r2 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x001b, code lost:
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00cb, code lost:
        r0 = r23 | r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00fd, code lost:
        r9.putInt(r14, r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0114, code lost:
        r10 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0116, code lost:
        r5 = r6;
        r22 = r13;
        r6 = r0;
        r0 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0137, code lost:
        r1 = r11.f6331c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0141, code lost:
        r10 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0160, code lost:
        r9.putObject(r14, r7, r1);
        r4 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0166, code lost:
        r29 = r13;
        r13 = r4;
        r4 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01a1, code lost:
        r1 = r23 | r22;
        r2 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01c4, code lost:
        r13 = r4;
        r4 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0215, code lost:
        r13 = r0;
        r0 = r23 | r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0219, code lost:
        r1 = r0;
        r0 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x021c, code lost:
        r3 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0234, code lost:
        r2 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0235, code lost:
        r5 = r6;
        r13 = r10;
        r7 = r21;
        r8 = 0;
        r10 = -1;
        r6 = r1;
        r1 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0240, code lost:
        r2 = r3;
        r8 = r4;
        r15 = r6;
        r27 = r9;
        r6 = r23;
        r18 = 0;
        r28 = -1;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r0v5, types: [int, byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte[], code=null, for r32v0, types: [byte[]] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r12v2
      assigns: []
      uses: []
      mth insns count: 439
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARNING: Unknown variable types count: 16 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7681a(T r31, byte[] r32, int r33, int r34, p213q.p217b.p218a.p231b.p251g.p256e.C2362b5 r35) {
        /*
            r30 = this;
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            boolean r0 = r15.f6883g
            if (r0 == 0) goto L_0x038b
            sun.misc.Unsafe r9 = f6876r
            r10 = -1
            r8 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r33
            r5 = r7
            r2 = r8
            r6 = r2
            r1 = r10
        L_0x001b:
            if (r0 >= r13) goto L_0x036f
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002d
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5152a(r0, r12, r3, r11)
            int r3 = r11.f6329a
            r4 = r0
            r16 = r3
            goto L_0x0030
        L_0x002d:
            r16 = r0
            r4 = r3
        L_0x0030:
            int r3 = r16 >>> 3
            r0 = r16 & 7
            if (r3 <= r1) goto L_0x0045
            int r2 = r2 / 3
            int r1 = r15.f6879c
            if (r3 < r1) goto L_0x0053
            int r1 = r15.f6880d
            if (r3 > r1) goto L_0x0053
            int r1 = r15.mo8012a(r3, r2)
            goto L_0x0051
        L_0x0045:
            int r1 = r15.f6879c
            if (r3 < r1) goto L_0x0053
            int r1 = r15.f6880d
            if (r3 > r1) goto L_0x0053
            int r1 = r15.mo8012a(r3, r8)
        L_0x0051:
            r2 = r1
            goto L_0x0054
        L_0x0053:
            r2 = r10
        L_0x0054:
            if (r2 != r10) goto L_0x0062
            r17 = r3
            r2 = r4
            r15 = r5
            r18 = r8
            r27 = r9
            r28 = r10
            goto L_0x0340
        L_0x0062:
            int[] r1 = r15.f6877a
            int r17 = r2 + 1
            r8 = r1[r17]
            r17 = 267386880(0xff00000, float:2.3665827E-29)
            r17 = r8 & r17
            int r10 = r17 >>> 20
            r33 = r3
            r3 = r8 & r7
            r20 = r8
            long r7 = (long) r3
            r3 = 17
            if (r10 > r3) goto L_0x024d
            int r3 = r2 + 2
            r1 = r1[r3]
            int r3 = r1 >>> 20
            r13 = 1
            int r22 = r13 << r3
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r3
            r17 = r4
            if (r1 == r5) goto L_0x009f
            if (r5 == r3) goto L_0x0093
            long r3 = (long) r5
            r9.putInt(r14, r3, r6)
            r3 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0093:
            if (r1 == r3) goto L_0x009b
            long r4 = (long) r1
            int r4 = r9.getInt(r14, r4)
            r6 = r4
        L_0x009b:
            r23 = r6
            r6 = r1
            goto L_0x00a2
        L_0x009f:
            r23 = r6
            r6 = r5
        L_0x00a2:
            r1 = 5
            switch(r10) {
                case 0: goto L_0x021e;
                case 1: goto L_0x01ff;
                case 2: goto L_0x01de;
                case 3: goto L_0x01de;
                case 4: goto L_0x01c9;
                case 5: goto L_0x01a6;
                case 6: goto L_0x018c;
                case 7: goto L_0x016d;
                case 8: goto L_0x0144;
                case 9: goto L_0x011d;
                case 10: goto L_0x0101;
                case 11: goto L_0x01c9;
                case 12: goto L_0x00ee;
                case 13: goto L_0x018c;
                case 14: goto L_0x01a6;
                case 15: goto L_0x00da;
                case 16: goto L_0x00b1;
                default: goto L_0x00a6;
            }
        L_0x00a6:
            r10 = r34
            r4 = r2
            r21 = r3
            r3 = r17
            r17 = r33
            goto L_0x0240
        L_0x00b1:
            if (r0 != 0) goto L_0x00ce
            r4 = r17
            int r10 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5274b(r12, r4, r11)
            long r0 = r11.f6330b
            long r4 = p213q.p217b.p218a.p231b.p251g.p256e.C2597o5.m6202a(r0)
            r0 = r9
            r1 = r31
            r17 = r33
            r13 = r2
            r21 = r3
            r2 = r7
            r0.putLong(r1, r2, r4)
        L_0x00cb:
            r0 = r23 | r22
            goto L_0x0116
        L_0x00ce:
            r21 = r3
            r4 = r17
            r17 = r33
            r10 = r34
            r3 = r4
            r4 = r2
            goto L_0x0240
        L_0x00da:
            r13 = r2
            r21 = r3
            r4 = r17
            r17 = r33
            if (r0 != 0) goto L_0x0141
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5166a(r12, r4, r11)
            int r1 = r11.f6329a
            int r1 = p213q.p217b.p218a.p231b.p251g.p256e.C2597o5.m6201a(r1)
            goto L_0x00fd
        L_0x00ee:
            r13 = r2
            r21 = r3
            r4 = r17
            r17 = r33
            if (r0 != 0) goto L_0x0141
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5166a(r12, r4, r11)
            int r1 = r11.f6329a
        L_0x00fd:
            r9.putInt(r14, r7, r1)
            goto L_0x0114
        L_0x0101:
            r13 = r2
            r21 = r3
            r4 = r17
            r1 = 2
            r17 = r33
            if (r0 != r1) goto L_0x0141
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5327e(r12, r4, r11)
            java.lang.Object r1 = r11.f6331c
            r9.putObject(r14, r7, r1)
        L_0x0114:
            r10 = r0
            goto L_0x00cb
        L_0x0116:
            r5 = r6
            r22 = r13
            r6 = r0
            r0 = r10
            goto L_0x0291
        L_0x011d:
            r13 = r2
            r21 = r3
            r4 = r17
            r1 = 2
            r17 = r33
            if (r0 != r1) goto L_0x0141
            q.b.a.b.g.e.g8 r0 = r15.mo8017a(r13)
            r10 = r34
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5162a(r0, r12, r4, r10, r11)
            java.lang.Object r1 = r9.getObject(r14, r7)
            if (r1 != 0) goto L_0x013a
        L_0x0137:
            java.lang.Object r1 = r11.f6331c
            goto L_0x0160
        L_0x013a:
            java.lang.Object r2 = r11.f6331c
            java.lang.Object r1 = p213q.p217b.p218a.p231b.p251g.p256e.C2546l6.m6113a(r1, r2)
            goto L_0x0160
        L_0x0141:
            r10 = r34
            goto L_0x0166
        L_0x0144:
            r10 = r34
            r13 = r2
            r21 = r3
            r4 = r17
            r1 = 2
            r17 = r33
            if (r0 != r1) goto L_0x0166
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r20 & r0
            if (r0 != 0) goto L_0x015b
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5304c(r12, r4, r11)
            goto L_0x0137
        L_0x015b:
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5320d(r12, r4, r11)
            goto L_0x0137
        L_0x0160:
            r9.putObject(r14, r7, r1)
            r4 = r13
            goto L_0x0215
        L_0x0166:
            r29 = r13
            r13 = r4
            r4 = r29
            goto L_0x021c
        L_0x016d:
            r10 = r34
            r5 = r2
            r21 = r3
            r4 = r17
            r17 = r33
            if (r0 != 0) goto L_0x01c4
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5274b(r12, r4, r11)
            long r1 = r11.f6330b
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0185
            goto L_0x0186
        L_0x0185:
            r13 = 0
        L_0x0186:
            q.b.a.b.g.e.b9$c r1 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.f6344f
            r1.mo7426a(r14, r7, r13)
            goto L_0x01a1
        L_0x018c:
            r10 = r34
            r5 = r2
            r21 = r3
            r4 = r17
            r17 = r33
            if (r0 != r1) goto L_0x01c4
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5336f(r12, r4)
            r9.putInt(r14, r7, r0)
            int r4 = r4 + 4
            r0 = r4
        L_0x01a1:
            r1 = r23 | r22
            r2 = r5
            goto L_0x0235
        L_0x01a6:
            r10 = r34
            r5 = r2
            r21 = r3
            r4 = r17
            r17 = r33
            if (r0 != r13) goto L_0x01c4
            long r24 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5343g(r12, r4)
            r0 = r9
            r1 = r31
            r2 = r7
            r13 = r4
            r7 = r5
            r4 = r24
            r0.putLong(r1, r2, r4)
            int r0 = r13 + 8
            r4 = r7
            goto L_0x0215
        L_0x01c4:
            r13 = r4
            r7 = r5
            r4 = r7
            goto L_0x021c
        L_0x01c9:
            r10 = r34
            r4 = r2
            r21 = r3
            r13 = r17
            r17 = r33
            if (r0 != 0) goto L_0x021c
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5166a(r12, r13, r11)
            int r1 = r11.f6329a
            r9.putInt(r14, r7, r1)
            goto L_0x0215
        L_0x01de:
            r10 = r34
            r4 = r2
            r21 = r3
            r13 = r17
            r17 = r33
            if (r0 != 0) goto L_0x021c
            int r13 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5274b(r12, r13, r11)
            long r2 = r11.f6330b
            r0 = r9
            r1 = r31
            r24 = r2
            r2 = r7
            r7 = r4
            r4 = r24
            r0.putLong(r1, r2, r4)
            r0 = r23 | r22
            r4 = r7
            goto L_0x0219
        L_0x01ff:
            r10 = r34
            r4 = r2
            r21 = r3
            r13 = r17
            r17 = r33
            if (r0 != r1) goto L_0x021c
            float r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5349i(r12, r13)
            q.b.a.b.g.e.b9$c r1 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.f6344f
            r1.mo7425a(r14, r7, r0)
            int r0 = r13 + 4
        L_0x0215:
            r1 = r23 | r22
            r13 = r0
            r0 = r1
        L_0x0219:
            r1 = r0
            r0 = r13
            goto L_0x0234
        L_0x021c:
            r3 = r13
            goto L_0x0240
        L_0x021e:
            r10 = r34
            r4 = r2
            r21 = r3
            r3 = r17
            r17 = r33
            if (r0 != r13) goto L_0x0240
            double r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5345h(r12, r3)
            p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5483a(r14, r7, r0)
            int r0 = r3 + 8
            r1 = r23 | r22
        L_0x0234:
            r2 = r4
        L_0x0235:
            r5 = r6
            r13 = r10
            r7 = r21
            r8 = 0
            r10 = -1
            r6 = r1
            r1 = r17
            goto L_0x001b
        L_0x0240:
            r2 = r3
            r8 = r4
            r15 = r6
            r27 = r9
            r6 = r23
            r18 = 0
            r28 = -1
            goto L_0x0340
        L_0x024d:
            r17 = r33
            r3 = r4
            r1 = 2
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            r2 = 27
            if (r10 != r2) goto L_0x02ab
            if (r0 != r1) goto L_0x029d
            java.lang.Object r0 = r9.getObject(r14, r7)
            q.b.a.b.g.e.q6 r0 = (p213q.p217b.p218a.p231b.p251g.p256e.C2635q6) r0
            boolean r1 = r0.mo7387a()
            if (r1 != 0) goto L_0x0279
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0270
            r1 = 10
            goto L_0x0272
        L_0x0270:
            int r1 = r1 << 1
        L_0x0272:
            q.b.a.b.g.e.q6 r0 = r0.mo7414a(r1)
            r9.putObject(r14, r7, r0)
        L_0x0279:
            r7 = r0
            q.b.a.b.g.e.g8 r0 = r15.mo8017a(r4)
            r1 = r16
            r2 = r32
            r22 = r4
            r4 = r34
            r13 = r5
            r5 = r7
            r7 = r6
            r6 = r35
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5160a(r0, r1, r2, r3, r4, r5, r6)
            r6 = r7
            r5 = r13
        L_0x0291:
            r13 = r34
            r1 = r17
            r7 = r21
            r2 = r22
            r8 = 0
            r10 = -1
            goto L_0x001b
        L_0x029d:
            r22 = r4
            r14 = r3
            r15 = r5
            r21 = r6
            r27 = r9
            r18 = 0
            r28 = -1
            goto L_0x030a
        L_0x02ab:
            r22 = r4
            r13 = r5
            r2 = 49
            if (r10 > r2) goto L_0x02ee
            r5 = r20
            long r4 = (long) r5
            r2 = r0
            r0 = r30
            r1 = r31
            r33 = r2
            r2 = r32
            r20 = r3
            r23 = r4
            r4 = r34
            r5 = r16
            r15 = r6
            r6 = r17
            r25 = r7
            r8 = r21
            r7 = r33
            r21 = r15
            r18 = 0
            r15 = r8
            r8 = r22
            r27 = r9
            r19 = r10
            r28 = -1
            r9 = r23
            r11 = r19
            r15 = r13
            r12 = r25
            r14 = r35
            int r0 = r0.mo8014a((T) r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            r14 = r20
            if (r0 != r14) goto L_0x0353
            goto L_0x033a
        L_0x02ee:
            r33 = r0
            r14 = r3
            r21 = r6
            r25 = r7
            r27 = r9
            r19 = r10
            r15 = r13
            r5 = r20
            r18 = 0
            r28 = -1
            r0 = 50
            r9 = r19
            r7 = r33
            if (r9 != r0) goto L_0x0320
            if (r7 == r1) goto L_0x030c
        L_0x030a:
            r4 = r14
            goto L_0x033b
        L_0x030c:
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r14
            r4 = r34
            r5 = r22
            r6 = r25
            r8 = r35
            r0.mo8015a((T) r1, r2, r3, r4, r5, r6, r8)
            r0 = 0
            throw r0
        L_0x0320:
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r14
            r4 = r34
            r8 = r5
            r5 = r16
            r6 = r17
            r10 = r25
            r12 = r22
            r13 = r35
            int r0 = r0.mo8013a((T) r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 != r14) goto L_0x0353
        L_0x033a:
            r4 = r0
        L_0x033b:
            r2 = r4
            r6 = r21
            r8 = r22
        L_0x0340:
            q.b.a.b.g.e.t8 r4 = m6407e(r31)
            r0 = r16
            r1 = r32
            r3 = r34
            r5 = r35
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5148a(r0, r1, r2, r3, r4, r5)
            r2 = r8
            r5 = r15
            goto L_0x0358
        L_0x0353:
            r5 = r15
            r6 = r21
            r2 = r22
        L_0x0358:
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r1 = r17
            r8 = r18
            r9 = r27
            r10 = r28
            r7 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x001b
        L_0x036f:
            r15 = r5
            r21 = r6
            r1 = r7
            r27 = r9
            if (r15 == r1) goto L_0x0381
            long r1 = (long) r15
            r3 = r31
            r6 = r21
            r4 = r27
            r4.putInt(r3, r1, r6)
        L_0x0381:
            r4 = r34
            if (r0 != r4) goto L_0x0386
            return
        L_0x0386:
            q.b.a.b.g.e.p6 r0 = p213q.p217b.p218a.p231b.p251g.p256e.C2618p6.m6294e()
            throw r0
        L_0x038b:
            r4 = r13
            r3 = r14
            r5 = 0
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r33
            r4 = r34
            r6 = r35
            r0.mo8016a(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p251g.p256e.C2684t7.mo7681a(java.lang.Object, byte[], int, int, q.b.a.b.g.e.b5):void");
    }

    /* renamed from: a */
    public final boolean mo8020a(T t, int i) {
        int[] iArr = this.f6877a;
        int i2 = iArr[i + 2];
        long j = (long) (i2 & 1048575);
        if (j == 1048575) {
            int i3 = iArr[i + 1];
            long j2 = (long) (i3 & 1048575);
            switch ((i3 & 267386880) >>> 20) {
                case 0:
                    return C2366b9.m5495e(t, j2) != 0.0d;
                case 1:
                    return C2366b9.m5493d(t, j2) != 0.0f;
                case 2:
                    return C2366b9.m5488b(t, j2) != 0;
                case 3:
                    return C2366b9.m5488b(t, j2) != 0;
                case 4:
                    return C2366b9.m5479a((Object) t, j2) != 0;
                case 5:
                    return C2366b9.m5488b(t, j2) != 0;
                case 6:
                    return C2366b9.m5479a((Object) t, j2) != 0;
                case 7:
                    return C2366b9.m5492c(t, j2);
                case 8:
                    Object f = C2366b9.m5496f(t, j2);
                    if (f instanceof String) {
                        return !((String) f).isEmpty();
                    }
                    if (f instanceof C2435f5) {
                        return !C2435f5.f6525f.equals(f);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return C2366b9.m5496f(t, j2) != null;
                case 10:
                    return !C2435f5.f6525f.equals(C2366b9.m5496f(t, j2));
                case 11:
                    return C2366b9.m5479a((Object) t, j2) != 0;
                case 12:
                    return C2366b9.m5479a((Object) t, j2) != 0;
                case 13:
                    return C2366b9.m5479a((Object) t, j2) != 0;
                case 14:
                    return C2366b9.m5488b(t, j2) != 0;
                case 15:
                    return C2366b9.m5479a((Object) t, j2) != 0;
                case 16:
                    return C2366b9.m5488b(t, j2) != 0;
                case 17:
                    return C2366b9.m5496f(t, j2) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            return (C2366b9.m5479a((Object) t, j) & (1 << (i2 >>> 20))) != 0;
        }
    }

    /* renamed from: a */
    public final boolean mo8021a(T t, int i, int i2) {
        return C2366b9.m5479a((Object) t, (long) (this.f6877a[i2 + 2] & 1048575)) == i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005c, code lost:
        if (p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m5989a(p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r10, r6), p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r11, r6)) != false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0070, code lost:
        if (p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5488b(r10, r6) == p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5488b(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0082, code lost:
        if (p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5479a((java.lang.Object) r10, r6) == p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5479a((java.lang.Object) r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0096, code lost:
        if (p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5488b(r10, r6) == p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5488b(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a8, code lost:
        if (p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5479a((java.lang.Object) r10, r6) == p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5479a((java.lang.Object) r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ba, code lost:
        if (p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5479a((java.lang.Object) r10, r6) == p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5479a((java.lang.Object) r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cc, code lost:
        if (p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5479a((java.lang.Object) r10, r6) == p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5479a((java.lang.Object) r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e2, code lost:
        if (p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m5989a(p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r10, r6), p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r11, r6)) != false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f8, code lost:
        if (p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m5989a(p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r10, r6), p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r11, r6)) != false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010e, code lost:
        if (p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m5989a(p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r10, r6), p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r11, r6)) != false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0120, code lost:
        if (p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5492c(r10, r6) == p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5492c(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0132, code lost:
        if (p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5479a((java.lang.Object) r10, r6) == p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5479a((java.lang.Object) r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0145, code lost:
        if (p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5488b(r10, r6) == p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5488b(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0156, code lost:
        if (p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5479a((java.lang.Object) r10, r6) == p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5479a((java.lang.Object) r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0169, code lost:
        if (p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5488b(r10, r6) == p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5488b(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x017c, code lost:
        if (p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5488b(r10, r6) == p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5488b(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0195, code lost:
        if (java.lang.Float.floatToIntBits(p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5493d(r10, r6)) == java.lang.Float.floatToIntBits(p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5493d(r11, r6))) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01b0, code lost:
        if (java.lang.Double.doubleToLongBits(p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5495e(r10, r6)) == java.lang.Double.doubleToLongBits(p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5495e(r11, r6))) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01b2, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m5989a(p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r10, r6), p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r11, r6)) != false) goto L_0x01b3;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo7682a(T r10, T r11) {
        /*
            r9 = this;
            int[] r0 = r9.f6877a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            r3 = 1
            if (r2 >= r0) goto L_0x01ba
            int r4 = r9.mo8030d(r2)
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r4 & r5
            long r6 = (long) r6
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r8
            int r4 = r4 >>> 20
            switch(r4) {
                case 0: goto L_0x0198;
                case 1: goto L_0x017f;
                case 2: goto L_0x016c;
                case 3: goto L_0x0159;
                case 4: goto L_0x0148;
                case 5: goto L_0x0135;
                case 6: goto L_0x0124;
                case 7: goto L_0x0112;
                case 8: goto L_0x00fc;
                case 9: goto L_0x00e6;
                case 10: goto L_0x00d0;
                case 11: goto L_0x00be;
                case 12: goto L_0x00ac;
                case 13: goto L_0x009a;
                case 14: goto L_0x0086;
                case 15: goto L_0x0074;
                case 16: goto L_0x0060;
                case 17: goto L_0x004a;
                case 18: goto L_0x003c;
                case 19: goto L_0x003c;
                case 20: goto L_0x003c;
                case 21: goto L_0x003c;
                case 22: goto L_0x003c;
                case 23: goto L_0x003c;
                case 24: goto L_0x003c;
                case 25: goto L_0x003c;
                case 26: goto L_0x003c;
                case 27: goto L_0x003c;
                case 28: goto L_0x003c;
                case 29: goto L_0x003c;
                case 30: goto L_0x003c;
                case 31: goto L_0x003c;
                case 32: goto L_0x003c;
                case 33: goto L_0x003c;
                case 34: goto L_0x003c;
                case 35: goto L_0x003c;
                case 36: goto L_0x003c;
                case 37: goto L_0x003c;
                case 38: goto L_0x003c;
                case 39: goto L_0x003c;
                case 40: goto L_0x003c;
                case 41: goto L_0x003c;
                case 42: goto L_0x003c;
                case 43: goto L_0x003c;
                case 44: goto L_0x003c;
                case 45: goto L_0x003c;
                case 46: goto L_0x003c;
                case 47: goto L_0x003c;
                case 48: goto L_0x003c;
                case 49: goto L_0x003c;
                case 50: goto L_0x003c;
                case 51: goto L_0x001c;
                case 52: goto L_0x001c;
                case 53: goto L_0x001c;
                case 54: goto L_0x001c;
                case 55: goto L_0x001c;
                case 56: goto L_0x001c;
                case 57: goto L_0x001c;
                case 58: goto L_0x001c;
                case 59: goto L_0x001c;
                case 60: goto L_0x001c;
                case 61: goto L_0x001c;
                case 62: goto L_0x001c;
                case 63: goto L_0x001c;
                case 64: goto L_0x001c;
                case 65: goto L_0x001c;
                case 66: goto L_0x001c;
                case 67: goto L_0x001c;
                case 68: goto L_0x001c;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x01b3
        L_0x001c:
            int r4 = r9.mo8031e(r2)
            r4 = r4 & r5
            long r4 = (long) r4
            int r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5479a(r10, r4)
            int r4 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5479a(r11, r4)
            if (r8 != r4) goto L_0x01b2
            java.lang.Object r4 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r10, r6)
            java.lang.Object r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r11, r6)
            boolean r4 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m5989a(r4, r5)
            if (r4 != 0) goto L_0x01b3
            goto L_0x0197
        L_0x003c:
            java.lang.Object r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r10, r6)
            java.lang.Object r4 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r11, r6)
            boolean r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m5989a(r3, r4)
            goto L_0x01b3
        L_0x004a:
            boolean r4 = r9.mo8029c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            java.lang.Object r4 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r10, r6)
            java.lang.Object r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r11, r6)
            boolean r4 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m5989a(r4, r5)
            if (r4 != 0) goto L_0x01b3
            goto L_0x01b2
        L_0x0060:
            boolean r4 = r9.mo8029c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            long r4 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5488b(r10, r6)
            long r6 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5488b(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01b3
            goto L_0x0197
        L_0x0074:
            boolean r4 = r9.mo8029c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            int r4 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5479a(r10, r6)
            int r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5479a(r11, r6)
            if (r4 == r5) goto L_0x01b3
            goto L_0x01b2
        L_0x0086:
            boolean r4 = r9.mo8029c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            long r4 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5488b(r10, r6)
            long r6 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5488b(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01b3
            goto L_0x0197
        L_0x009a:
            boolean r4 = r9.mo8029c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            int r4 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5479a(r10, r6)
            int r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5479a(r11, r6)
            if (r4 == r5) goto L_0x01b3
            goto L_0x01b2
        L_0x00ac:
            boolean r4 = r9.mo8029c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            int r4 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5479a(r10, r6)
            int r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5479a(r11, r6)
            if (r4 == r5) goto L_0x01b3
            goto L_0x0197
        L_0x00be:
            boolean r4 = r9.mo8029c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            int r4 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5479a(r10, r6)
            int r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5479a(r11, r6)
            if (r4 == r5) goto L_0x01b3
            goto L_0x01b2
        L_0x00d0:
            boolean r4 = r9.mo8029c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            java.lang.Object r4 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r10, r6)
            java.lang.Object r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r11, r6)
            boolean r4 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m5989a(r4, r5)
            if (r4 != 0) goto L_0x01b3
            goto L_0x0197
        L_0x00e6:
            boolean r4 = r9.mo8029c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            java.lang.Object r4 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r10, r6)
            java.lang.Object r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r11, r6)
            boolean r4 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m5989a(r4, r5)
            if (r4 != 0) goto L_0x01b3
            goto L_0x01b2
        L_0x00fc:
            boolean r4 = r9.mo8029c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            java.lang.Object r4 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r10, r6)
            java.lang.Object r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r11, r6)
            boolean r4 = p213q.p217b.p218a.p231b.p251g.p256e.C2498i8.m5989a(r4, r5)
            if (r4 != 0) goto L_0x01b3
            goto L_0x0197
        L_0x0112:
            boolean r4 = r9.mo8029c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            boolean r4 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5492c(r10, r6)
            boolean r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5492c(r11, r6)
            if (r4 == r5) goto L_0x01b3
            goto L_0x01b2
        L_0x0124:
            boolean r4 = r9.mo8029c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            int r4 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5479a(r10, r6)
            int r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5479a(r11, r6)
            if (r4 == r5) goto L_0x01b3
            goto L_0x0197
        L_0x0135:
            boolean r4 = r9.mo8029c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            long r4 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5488b(r10, r6)
            long r6 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5488b(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01b3
            goto L_0x01b2
        L_0x0148:
            boolean r4 = r9.mo8029c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            int r4 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5479a(r10, r6)
            int r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5479a(r11, r6)
            if (r4 == r5) goto L_0x01b3
            goto L_0x0197
        L_0x0159:
            boolean r4 = r9.mo8029c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            long r4 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5488b(r10, r6)
            long r6 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5488b(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01b3
            goto L_0x01b2
        L_0x016c:
            boolean r4 = r9.mo8029c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            long r4 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5488b(r10, r6)
            long r6 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5488b(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01b3
            goto L_0x0197
        L_0x017f:
            boolean r4 = r9.mo8029c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            float r4 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5493d(r10, r6)
            int r4 = java.lang.Float.floatToIntBits(r4)
            float r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5493d(r11, r6)
            int r5 = java.lang.Float.floatToIntBits(r5)
            if (r4 == r5) goto L_0x01b3
        L_0x0197:
            goto L_0x01b2
        L_0x0198:
            boolean r4 = r9.mo8029c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            double r4 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5495e(r10, r6)
            long r4 = java.lang.Double.doubleToLongBits(r4)
            double r6 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5495e(r11, r6)
            long r6 = java.lang.Double.doubleToLongBits(r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01b3
        L_0x01b2:
            r3 = r1
        L_0x01b3:
            if (r3 != 0) goto L_0x01b6
            return r1
        L_0x01b6:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x01ba:
            q.b.a.b.g.e.u8<?, ?> r0 = r9.f6890n
            r2 = r0
            q.b.a.b.g.e.w8 r2 = (p213q.p217b.p218a.p231b.p251g.p256e.C2734w8) r2
            r4 = 0
            if (r2 == 0) goto L_0x01f7
            r2 = r10
            q.b.a.b.g.e.i6 r2 = (p213q.p217b.p218a.p231b.p251g.p256e.C2490i6) r2
            q.b.a.b.g.e.t8 r2 = r2.zzb
            q.b.a.b.g.e.w8 r0 = (p213q.p217b.p218a.p231b.p251g.p256e.C2734w8) r0
            if (r0 == 0) goto L_0x01f6
            r0 = r11
            q.b.a.b.g.e.i6 r0 = (p213q.p217b.p218a.p231b.p251g.p256e.C2490i6) r0
            q.b.a.b.g.e.t8 r0 = r0.zzb
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x01d7
            return r1
        L_0x01d7:
            boolean r0 = r9.f6882f
            if (r0 == 0) goto L_0x01f5
            q.b.a.b.g.e.w5<?> r0 = r9.f6891o
            r1 = r0
            q.b.a.b.g.e.v5 r1 = (p213q.p217b.p218a.p231b.p251g.p256e.C2715v5) r1
            if (r1 == 0) goto L_0x01f4
            q.b.a.b.g.e.i6$b r10 = (p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2492b) r10
            q.b.a.b.g.e.x5<q.b.a.b.g.e.i6$e> r10 = r10.zzc
            q.b.a.b.g.e.v5 r0 = (p213q.p217b.p218a.p231b.p251g.p256e.C2715v5) r0
            if (r0 == 0) goto L_0x01f3
            q.b.a.b.g.e.i6$b r11 = (p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2492b) r11
            q.b.a.b.g.e.x5<q.b.a.b.g.e.i6$e> r11 = r11.zzc
            boolean r10 = r10.equals(r11)
            return r10
        L_0x01f3:
            throw r4
        L_0x01f4:
            throw r4
        L_0x01f5:
            return r3
        L_0x01f6:
            throw r4
        L_0x01f7:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p251g.p256e.C2684t7.mo7682a(java.lang.Object, java.lang.Object):boolean");
    }
}
