package p213q.p217b.p301c.p302a.p311j0.p312a;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.C3599e;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3734c;
import sun.misc.Unsafe;

/* renamed from: q.b.c.a.j0.a.u0 */
public final class C3717u0<T> implements C3625g1<T> {

    /* renamed from: r */
    public static final int[] f9177r = new int[0];

    /* renamed from: s */
    public static final Unsafe f9178s = C3691q1.m8819b();

    /* renamed from: a */
    public final int[] f9179a;

    /* renamed from: b */
    public final Object[] f9180b;

    /* renamed from: c */
    public final int f9181c;

    /* renamed from: d */
    public final int f9182d;

    /* renamed from: e */
    public final C3706s0 f9183e;

    /* renamed from: f */
    public final boolean f9184f;

    /* renamed from: g */
    public final boolean f9185g;

    /* renamed from: h */
    public final boolean f9186h;

    /* renamed from: i */
    public final boolean f9187i;

    /* renamed from: j */
    public final int[] f9188j;

    /* renamed from: k */
    public final int f9189k;

    /* renamed from: l */
    public final int f9190l;

    /* renamed from: m */
    public final C3726w0 f9191m;

    /* renamed from: n */
    public final C3630i0 f9192n;

    /* renamed from: o */
    public final C3677m1<?, ?> f9193o;

    /* renamed from: p */
    public final C3705s<?> f9194p;

    /* renamed from: q */
    public final C3679n0 f9195q;

    public C3717u0(int[] iArr, Object[] objArr, int i, int i2, C3706s0 s0Var, boolean z, boolean z2, int[] iArr2, int i3, int i4, C3726w0 w0Var, C3630i0 i0Var, C3677m1<?, ?> m1Var, C3705s<?> sVar, C3679n0 n0Var) {
        this.f9179a = iArr;
        this.f9180b = objArr;
        this.f9181c = i;
        this.f9182d = i2;
        this.f9185g = s0Var instanceof C3731z;
        this.f9186h = z;
        this.f9184f = sVar != null && (s0Var instanceof C3734c);
        this.f9187i = z2;
        this.f9188j = iArr2;
        this.f9189k = i3;
        this.f9190l = i4;
        this.f9191m = w0Var;
        this.f9192n = i0Var;
        this.f9193o = m1Var;
        this.f9194p = sVar;
        this.f9183e = s0Var;
        this.f9195q = n0Var;
    }

    /* renamed from: a */
    public static Field m8913a(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(cls.getName());
            sb.append(" not found. Known fields are ");
            sb.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sb.toString());
        }
    }

    /* renamed from: a */
    public static List<?> m8914a(Object obj, long j) {
        return (List) C3691q1.m8828h(obj, j);
    }

    /* renamed from: b */
    public static <T> boolean m8917b(T t, long j) {
        return ((Boolean) C3691q1.m8828h(t, j)).booleanValue();
    }

    /* renamed from: c */
    public static <T> double m8918c(T t, long j) {
        return ((Double) C3691q1.m8828h(t, j)).doubleValue();
    }

    /* renamed from: d */
    public static <T> float m8919d(T t, long j) {
        return ((Float) C3691q1.m8828h(t, j)).floatValue();
    }

    /* renamed from: e */
    public static <T> int m8920e(T t, long j) {
        return ((Integer) C3691q1.m8828h(t, j)).intValue();
    }

    /* renamed from: f */
    public static long m8921f(int i) {
        return (long) (i & 1048575);
    }

    /* renamed from: f */
    public static <T> long m8922f(T t, long j) {
        return ((Long) C3691q1.m8828h(t, j)).longValue();
    }

    /* renamed from: g */
    public static int m8923g(int i) {
        return (i & 267386880) >>> 20;
    }

    /* renamed from: g */
    public static C3680n1 m8924g(Object obj) {
        C3731z zVar = (C3731z) obj;
        C3680n1 n1Var = zVar.unknownFields;
        if (n1Var != C3680n1.f9117f) {
            return n1Var;
        }
        C3680n1 c = C3680n1.m8772c();
        zVar.unknownFields = c;
        return c;
    }

    /* renamed from: a */
    public T mo9642a() {
        return this.f9191m.mo9982a(this.f9183e);
    }

    /* renamed from: a */
    public final <UT, UB> UB mo9936a(Object obj, int i, UB ub, C3677m1<UT, UB> m1Var) {
        int[] iArr = this.f9179a;
        int i2 = iArr[i];
        Object h = C3691q1.m8828h(obj, m8921f(iArr[i + 1]));
        if (h == null) {
            return ub;
        }
        int i3 = (i / 3) * 2;
        C3599e eVar = (C3599e) this.f9180b[i3 + 1];
        if (eVar == null) {
            return ub;
        }
        Map f = this.f9195q.mo9857f(h);
        this.f9195q.mo9855d(this.f9180b[i3]);
        for (Entry entry : f.entrySet()) {
            if (!eVar.isInRange(((Integer) entry.getValue()).intValue())) {
                if (ub == null) {
                    if (((C3683o1) m1Var) != null) {
                        C3680n1.m8772c();
                    } else {
                        throw null;
                    }
                }
                entry.getKey();
                entry.getValue();
                throw null;
            }
        }
        return ub;
    }

    /* renamed from: a */
    public final C3599e mo9937a(int i) {
        return (C3599e) this.f9180b[((i / 3) * 2) + 1];
    }

    /* renamed from: a */
    public final <E> void mo9941a(Object obj, int i, C3622f1 f1Var, C3625g1<E> g1Var, C3697r rVar) {
        f1Var.mo9566a(this.f9192n.mo9657b(obj, m8921f(i)), g1Var, rVar);
    }

    /* renamed from: a */
    public final <E> void mo9942a(Object obj, long j, C3622f1 f1Var, C3625g1<E> g1Var, C3697r rVar) {
        f1Var.mo9574b(this.f9192n.mo9657b(obj, j), g1Var, rVar);
    }

    /* renamed from: a */
    public void mo9647a(T t, byte[] bArr, int i, int i2, C3612e eVar) {
        if (this.f9186h) {
            mo9949b(t, bArr, i, i2, eVar);
        } else {
            mo9935a(t, bArr, i, i2, 0, eVar);
        }
    }

    /* renamed from: a */
    public final boolean mo9947a(T t, int i, int i2, int i3) {
        if (this.f9186h) {
            return mo9945a(t, i);
        }
        return (i2 & i3) != 0;
    }

    /* renamed from: a */
    public final boolean mo9948a(T t, T t2, int i) {
        return mo9945a(t, i) == mo9945a(t2, i);
    }

    /* renamed from: b */
    public final Object mo9950b(int i) {
        return this.f9180b[(i / 3) * 2];
    }

    /* renamed from: b */
    public final void mo9953b(Object obj, int i, C3622f1 f1Var) {
        if ((536870912 & i) != 0) {
            f1Var.mo9593i(this.f9192n.mo9657b(obj, m8921f(i)));
        } else {
            f1Var.mo9590g(this.f9192n.mo9657b(obj, m8921f(i)));
        }
    }

    /* JADX INFO: used method not loaded: q.b.c.a.j0.a.i1.a(java.lang.Object, java.lang.Object):null, types can be incorrect */
    /* JADX INFO: used method not loaded: q.b.c.a.j0.a.q1.a(java.lang.Object, long):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0041, code lost:
        if (p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8351a(p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r10, r5), p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r11, r5)) != false) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0045, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0068, code lost:
        if (p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8351a(p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r10, r5), p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r11, r5)) != false) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007c, code lost:
        if (p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8827g(r10, r5) == p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8827g(r11, r5)) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008e, code lost:
        if (p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8826f(r10, r5) == p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8826f(r11, r5)) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a2, code lost:
        if (p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8827g(r10, r5) == p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8827g(r11, r5)) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b4, code lost:
        if (p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8826f(r10, r5) == p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8826f(r11, r5)) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c6, code lost:
        if (p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8826f(r10, r5) == p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8826f(r11, r5)) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d8, code lost:
        if (p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8826f(r10, r5) == p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8826f(r11, r5)) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ee, code lost:
        if (p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8351a(p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r10, r5), p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r11, r5)) != false) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0104, code lost:
        if (p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8351a(p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r10, r5), p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r11, r5)) != false) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x011a, code lost:
        if (p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8351a(p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r10, r5), p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r11, r5)) != false) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x012c, code lost:
        if (p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8816a((java.lang.Object) r10, r5) == p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8816a((java.lang.Object) r11, r5)) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x013e, code lost:
        if (p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8826f(r10, r5) == p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8826f(r11, r5)) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0152, code lost:
        if (p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8827g(r10, r5) == p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8827g(r11, r5)) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0163, code lost:
        if (p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8826f(r10, r5) == p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8826f(r11, r5)) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0176, code lost:
        if (p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8827g(r10, r5) == p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8827g(r11, r5)) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0189, code lost:
        if (p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8827g(r10, r5) == p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8827g(r11, r5)) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01a2, code lost:
        if (java.lang.Float.floatToIntBits(p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8825e(r10, r5)) == java.lang.Float.floatToIntBits(p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8825e(r11, r5))) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01bd, code lost:
        if (java.lang.Double.doubleToLongBits(p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8823d(r10, r5)) == java.lang.Double.doubleToLongBits(p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8823d(r11, r5))) goto L_0x01bf;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo9649b(T r10, T r11) {
        /*
            r9 = this;
            int[] r0 = r9.f9179a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            r3 = 1
            if (r2 >= r0) goto L_0x01c6
            int[] r4 = r9.f9179a
            int r5 = r2 + 1
            r4 = r4[r5]
            long r5 = m8921f(r4)
            int r4 = m8923g(r4)
            switch(r4) {
                case 0: goto L_0x01a5;
                case 1: goto L_0x018c;
                case 2: goto L_0x0179;
                case 3: goto L_0x0166;
                case 4: goto L_0x0155;
                case 5: goto L_0x0142;
                case 6: goto L_0x0130;
                case 7: goto L_0x011e;
                case 8: goto L_0x0108;
                case 9: goto L_0x00f2;
                case 10: goto L_0x00dc;
                case 11: goto L_0x00ca;
                case 12: goto L_0x00b8;
                case 13: goto L_0x00a6;
                case 14: goto L_0x0092;
                case 15: goto L_0x0080;
                case 16: goto L_0x006c;
                case 17: goto L_0x0056;
                case 18: goto L_0x0048;
                case 19: goto L_0x0048;
                case 20: goto L_0x0048;
                case 21: goto L_0x0048;
                case 22: goto L_0x0048;
                case 23: goto L_0x0048;
                case 24: goto L_0x0048;
                case 25: goto L_0x0048;
                case 26: goto L_0x0048;
                case 27: goto L_0x0048;
                case 28: goto L_0x0048;
                case 29: goto L_0x0048;
                case 30: goto L_0x0048;
                case 31: goto L_0x0048;
                case 32: goto L_0x0048;
                case 33: goto L_0x0048;
                case 34: goto L_0x0048;
                case 35: goto L_0x0048;
                case 36: goto L_0x0048;
                case 37: goto L_0x0048;
                case 38: goto L_0x0048;
                case 39: goto L_0x0048;
                case 40: goto L_0x0048;
                case 41: goto L_0x0048;
                case 42: goto L_0x0048;
                case 43: goto L_0x0048;
                case 44: goto L_0x0048;
                case 45: goto L_0x0048;
                case 46: goto L_0x0048;
                case 47: goto L_0x0048;
                case 48: goto L_0x0048;
                case 49: goto L_0x0048;
                case 50: goto L_0x0048;
                case 51: goto L_0x001b;
                case 52: goto L_0x001b;
                case 53: goto L_0x001b;
                case 54: goto L_0x001b;
                case 55: goto L_0x001b;
                case 56: goto L_0x001b;
                case 57: goto L_0x001b;
                case 58: goto L_0x001b;
                case 59: goto L_0x001b;
                case 60: goto L_0x001b;
                case 61: goto L_0x001b;
                case 62: goto L_0x001b;
                case 63: goto L_0x001b;
                case 64: goto L_0x001b;
                case 65: goto L_0x001b;
                case 66: goto L_0x001b;
                case 67: goto L_0x001b;
                case 68: goto L_0x001b;
                default: goto L_0x0019;
            }
        L_0x0019:
            goto L_0x01bf
        L_0x001b:
            int[] r4 = r9.f9179a
            int r7 = r2 + 2
            r4 = r4[r7]
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r7
            long r7 = (long) r4
            int r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8826f(r10, r7)
            int r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8826f(r11, r7)
            if (r4 != r7) goto L_0x0032
            r4 = r3
            goto L_0x0033
        L_0x0032:
            r4 = r1
        L_0x0033:
            if (r4 == 0) goto L_0x0045
            java.lang.Object r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r10, r5)
            java.lang.Object r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r11, r5)
            boolean r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8351a(r4, r5)
            if (r4 == 0) goto L_0x0045
            goto L_0x01bf
        L_0x0045:
            r3 = r1
            goto L_0x01bf
        L_0x0048:
            java.lang.Object r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r10, r5)
            java.lang.Object r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r11, r5)
            boolean r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8351a(r3, r4)
            goto L_0x01bf
        L_0x0056:
            boolean r4 = r9.mo9948a((T) r10, (T) r11, r2)
            if (r4 == 0) goto L_0x0045
            java.lang.Object r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r10, r5)
            java.lang.Object r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r11, r5)
            boolean r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8351a(r4, r5)
            if (r4 == 0) goto L_0x0045
            goto L_0x01bf
        L_0x006c:
            boolean r4 = r9.mo9948a((T) r10, (T) r11, r2)
            if (r4 == 0) goto L_0x0045
            long r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8827g(r10, r5)
            long r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8827g(r11, r5)
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x0045
            goto L_0x01bf
        L_0x0080:
            boolean r4 = r9.mo9948a((T) r10, (T) r11, r2)
            if (r4 == 0) goto L_0x0045
            int r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8826f(r10, r5)
            int r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8826f(r11, r5)
            if (r4 != r5) goto L_0x0045
            goto L_0x01bf
        L_0x0092:
            boolean r4 = r9.mo9948a((T) r10, (T) r11, r2)
            if (r4 == 0) goto L_0x0045
            long r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8827g(r10, r5)
            long r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8827g(r11, r5)
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x0045
            goto L_0x01bf
        L_0x00a6:
            boolean r4 = r9.mo9948a((T) r10, (T) r11, r2)
            if (r4 == 0) goto L_0x0045
            int r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8826f(r10, r5)
            int r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8826f(r11, r5)
            if (r4 != r5) goto L_0x0045
            goto L_0x01bf
        L_0x00b8:
            boolean r4 = r9.mo9948a((T) r10, (T) r11, r2)
            if (r4 == 0) goto L_0x0045
            int r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8826f(r10, r5)
            int r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8826f(r11, r5)
            if (r4 != r5) goto L_0x0045
            goto L_0x01bf
        L_0x00ca:
            boolean r4 = r9.mo9948a((T) r10, (T) r11, r2)
            if (r4 == 0) goto L_0x0045
            int r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8826f(r10, r5)
            int r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8826f(r11, r5)
            if (r4 != r5) goto L_0x0045
            goto L_0x01bf
        L_0x00dc:
            boolean r4 = r9.mo9948a((T) r10, (T) r11, r2)
            if (r4 == 0) goto L_0x0045
            java.lang.Object r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r10, r5)
            java.lang.Object r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r11, r5)
            boolean r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8351a(r4, r5)
            if (r4 == 0) goto L_0x0045
            goto L_0x01bf
        L_0x00f2:
            boolean r4 = r9.mo9948a((T) r10, (T) r11, r2)
            if (r4 == 0) goto L_0x0045
            java.lang.Object r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r10, r5)
            java.lang.Object r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r11, r5)
            boolean r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8351a(r4, r5)
            if (r4 == 0) goto L_0x0045
            goto L_0x01bf
        L_0x0108:
            boolean r4 = r9.mo9948a((T) r10, (T) r11, r2)
            if (r4 == 0) goto L_0x0045
            java.lang.Object r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r10, r5)
            java.lang.Object r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r11, r5)
            boolean r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8351a(r4, r5)
            if (r4 == 0) goto L_0x0045
            goto L_0x01bf
        L_0x011e:
            boolean r4 = r9.mo9948a((T) r10, (T) r11, r2)
            if (r4 == 0) goto L_0x0045
            boolean r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8816a(r10, r5)
            boolean r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8816a(r11, r5)
            if (r4 != r5) goto L_0x0045
            goto L_0x01bf
        L_0x0130:
            boolean r4 = r9.mo9948a((T) r10, (T) r11, r2)
            if (r4 == 0) goto L_0x0045
            int r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8826f(r10, r5)
            int r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8826f(r11, r5)
            if (r4 != r5) goto L_0x0045
            goto L_0x01bf
        L_0x0142:
            boolean r4 = r9.mo9948a((T) r10, (T) r11, r2)
            if (r4 == 0) goto L_0x0045
            long r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8827g(r10, r5)
            long r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8827g(r11, r5)
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x0045
            goto L_0x01bf
        L_0x0155:
            boolean r4 = r9.mo9948a((T) r10, (T) r11, r2)
            if (r4 == 0) goto L_0x0045
            int r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8826f(r10, r5)
            int r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8826f(r11, r5)
            if (r4 != r5) goto L_0x0045
            goto L_0x01bf
        L_0x0166:
            boolean r4 = r9.mo9948a((T) r10, (T) r11, r2)
            if (r4 == 0) goto L_0x0045
            long r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8827g(r10, r5)
            long r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8827g(r11, r5)
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x0045
            goto L_0x01bf
        L_0x0179:
            boolean r4 = r9.mo9948a((T) r10, (T) r11, r2)
            if (r4 == 0) goto L_0x0045
            long r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8827g(r10, r5)
            long r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8827g(r11, r5)
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x0045
            goto L_0x01bf
        L_0x018c:
            boolean r4 = r9.mo9948a((T) r10, (T) r11, r2)
            if (r4 == 0) goto L_0x0045
            float r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8825e(r10, r5)
            int r4 = java.lang.Float.floatToIntBits(r4)
            float r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8825e(r11, r5)
            int r5 = java.lang.Float.floatToIntBits(r5)
            if (r4 != r5) goto L_0x0045
            goto L_0x01bf
        L_0x01a5:
            boolean r4 = r9.mo9948a((T) r10, (T) r11, r2)
            if (r4 == 0) goto L_0x0045
            double r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8823d(r10, r5)
            long r7 = java.lang.Double.doubleToLongBits(r7)
            double r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8823d(r11, r5)
            long r4 = java.lang.Double.doubleToLongBits(r4)
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x0045
        L_0x01bf:
            if (r3 != 0) goto L_0x01c2
            return r1
        L_0x01c2:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x01c6:
            q.b.c.a.j0.a.m1<?, ?> r0 = r9.f9193o
            r2 = r0
            q.b.c.a.j0.a.o1 r2 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3683o1) r2
            r4 = 0
            if (r2 == 0) goto L_0x0203
            r2 = r10
            q.b.c.a.j0.a.z r2 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3731z) r2
            q.b.c.a.j0.a.n1 r2 = r2.unknownFields
            q.b.c.a.j0.a.o1 r0 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3683o1) r0
            if (r0 == 0) goto L_0x0202
            r0 = r11
            q.b.c.a.j0.a.z r0 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3731z) r0
            q.b.c.a.j0.a.n1 r0 = r0.unknownFields
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x01e3
            return r1
        L_0x01e3:
            boolean r0 = r9.f9184f
            if (r0 == 0) goto L_0x0201
            q.b.c.a.j0.a.s<?> r0 = r9.f9194p
            r1 = r0
            q.b.c.a.j0.a.t r1 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3709t) r1
            if (r1 == 0) goto L_0x0200
            q.b.c.a.j0.a.z$c r10 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3734c) r10
            q.b.c.a.j0.a.v<q.b.c.a.j0.a.z$e> r10 = r10.f9286e
            q.b.c.a.j0.a.t r0 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3709t) r0
            if (r0 == 0) goto L_0x01ff
            q.b.c.a.j0.a.z$c r11 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3734c) r11
            q.b.c.a.j0.a.v<q.b.c.a.j0.a.z$e> r11 = r11.f9286e
            boolean r10 = r10.equals(r11)
            return r10
        L_0x01ff:
            throw r4
        L_0x0200:
            throw r4
        L_0x0201:
            return r3
        L_0x0202:
            throw r4
        L_0x0203:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p301c.p302a.p311j0.p312a.C3717u0.mo9649b(java.lang.Object, java.lang.Object):boolean");
    }

    /* renamed from: c */
    public int mo9650c(T t) {
        return this.f9186h ? mo9961f(t) : mo9960e(t);
    }

    /* renamed from: c */
    public final C3625g1 mo9956c(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.f9180b;
        C3625g1 g1Var = (C3625g1) objArr[i2];
        if (g1Var != null) {
            return g1Var;
        }
        C3625g1 a = C3608c1.f8978c.mo9537a((Class) objArr[i2 + 1]);
        this.f9180b[i2] = a;
        return a;
    }

    /* renamed from: d */
    public final int mo9958d(int i) {
        if (i < this.f9181c || i > this.f9182d) {
            return -1;
        }
        return mo9931a(i, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005f, code lost:
        r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r9, r5);
        r2 = r2 * 53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0091, code lost:
        r2 = r2 * 53;
        r3 = m8920e(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a6, code lost:
        r2 = r2 * 53;
        r3 = m8922f(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00cc, code lost:
        if (r3 != null) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00cf, code lost:
        r2 = r2 * 53;
        r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d5, code lost:
        r3 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00de, code lost:
        if (r3 != null) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e0, code lost:
        r7 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e4, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e8, code lost:
        r2 = r2 * 53;
        r3 = ((java.lang.String) p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r9, r5)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fb, code lost:
        r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.m8162a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0114, code lost:
        r3 = java.lang.Float.floatToIntBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x011f, code lost:
        r3 = java.lang.Double.doubleToLongBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0123, code lost:
        r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.m8161a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0127, code lost:
        r2 = r3 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0129, code lost:
        r1 = r1 + 3;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo9651d(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.f9179a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r1 >= r0) goto L_0x012d
            int r3 = r8.mo9959e(r1)
            int[] r4 = r8.f9179a
            r4 = r4[r1]
            long r5 = m8921f(r3)
            int r3 = m8923g(r3)
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0119;
                case 1: goto L_0x010e;
                case 2: goto L_0x0107;
                case 3: goto L_0x0107;
                case 4: goto L_0x0100;
                case 5: goto L_0x0107;
                case 6: goto L_0x0100;
                case 7: goto L_0x00f5;
                case 8: goto L_0x00e8;
                case 9: goto L_0x00da;
                case 10: goto L_0x00cf;
                case 11: goto L_0x0100;
                case 12: goto L_0x0100;
                case 13: goto L_0x0100;
                case 14: goto L_0x0107;
                case 15: goto L_0x0100;
                case 16: goto L_0x0107;
                case 17: goto L_0x00c8;
                case 18: goto L_0x00cf;
                case 19: goto L_0x00cf;
                case 20: goto L_0x00cf;
                case 21: goto L_0x00cf;
                case 22: goto L_0x00cf;
                case 23: goto L_0x00cf;
                case 24: goto L_0x00cf;
                case 25: goto L_0x00cf;
                case 26: goto L_0x00cf;
                case 27: goto L_0x00cf;
                case 28: goto L_0x00cf;
                case 29: goto L_0x00cf;
                case 30: goto L_0x00cf;
                case 31: goto L_0x00cf;
                case 32: goto L_0x00cf;
                case 33: goto L_0x00cf;
                case 34: goto L_0x00cf;
                case 35: goto L_0x00cf;
                case 36: goto L_0x00cf;
                case 37: goto L_0x00cf;
                case 38: goto L_0x00cf;
                case 39: goto L_0x00cf;
                case 40: goto L_0x00cf;
                case 41: goto L_0x00cf;
                case 42: goto L_0x00cf;
                case 43: goto L_0x00cf;
                case 44: goto L_0x00cf;
                case 45: goto L_0x00cf;
                case 46: goto L_0x00cf;
                case 47: goto L_0x00cf;
                case 48: goto L_0x00cf;
                case 49: goto L_0x00cf;
                case 50: goto L_0x00cf;
                case 51: goto L_0x00bb;
                case 52: goto L_0x00ae;
                case 53: goto L_0x00a0;
                case 54: goto L_0x0099;
                case 55: goto L_0x008b;
                case 56: goto L_0x0084;
                case 57: goto L_0x007d;
                case 58: goto L_0x006f;
                case 59: goto L_0x0067;
                case 60: goto L_0x0059;
                case 61: goto L_0x0051;
                case 62: goto L_0x004a;
                case 63: goto L_0x0043;
                case 64: goto L_0x003c;
                case 65: goto L_0x0034;
                case 66: goto L_0x002d;
                case 67: goto L_0x0025;
                case 68: goto L_0x001e;
                default: goto L_0x001c;
            }
        L_0x001c:
            goto L_0x0129
        L_0x001e:
            boolean r3 = r8.mo9946a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0129
            goto L_0x005f
        L_0x0025:
            boolean r3 = r8.mo9946a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0129
            goto L_0x00a6
        L_0x002d:
            boolean r3 = r8.mo9946a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0129
            goto L_0x0049
        L_0x0034:
            boolean r3 = r8.mo9946a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0129
            goto L_0x00a6
        L_0x003c:
            boolean r3 = r8.mo9946a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0129
            goto L_0x0049
        L_0x0043:
            boolean r3 = r8.mo9946a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0129
        L_0x0049:
            goto L_0x0091
        L_0x004a:
            boolean r3 = r8.mo9946a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0129
            goto L_0x0091
        L_0x0051:
            boolean r3 = r8.mo9946a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0129
            goto L_0x00cf
        L_0x0059:
            boolean r3 = r8.mo9946a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0129
        L_0x005f:
            java.lang.Object r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r9, r5)
            int r2 = r2 * 53
            goto L_0x00d5
        L_0x0067:
            boolean r3 = r8.mo9946a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0129
            goto L_0x00e8
        L_0x006f:
            boolean r3 = r8.mo9946a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0129
            int r2 = r2 * 53
            boolean r3 = m8917b((T) r9, r5)
            goto L_0x00fb
        L_0x007d:
            boolean r3 = r8.mo9946a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0129
            goto L_0x0091
        L_0x0084:
            boolean r3 = r8.mo9946a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0129
            goto L_0x00a6
        L_0x008b:
            boolean r3 = r8.mo9946a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0129
        L_0x0091:
            int r2 = r2 * 53
            int r3 = m8920e(r9, r5)
            goto L_0x0127
        L_0x0099:
            boolean r3 = r8.mo9946a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0129
            goto L_0x00a6
        L_0x00a0:
            boolean r3 = r8.mo9946a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0129
        L_0x00a6:
            int r2 = r2 * 53
            long r3 = m8922f(r9, r5)
            goto L_0x0123
        L_0x00ae:
            boolean r3 = r8.mo9946a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0129
            int r2 = r2 * 53
            float r3 = m8919d(r9, r5)
            goto L_0x0114
        L_0x00bb:
            boolean r3 = r8.mo9946a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0129
            int r2 = r2 * 53
            double r3 = m8918c(r9, r5)
            goto L_0x011f
        L_0x00c8:
            java.lang.Object r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r9, r5)
            if (r3 == 0) goto L_0x00e4
            goto L_0x00e0
        L_0x00cf:
            int r2 = r2 * 53
            java.lang.Object r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r9, r5)
        L_0x00d5:
            int r3 = r3.hashCode()
            goto L_0x0127
        L_0x00da:
            java.lang.Object r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r9, r5)
            if (r3 == 0) goto L_0x00e4
        L_0x00e0:
            int r7 = r3.hashCode()
        L_0x00e4:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0129
        L_0x00e8:
            int r2 = r2 * 53
            java.lang.Object r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0127
        L_0x00f5:
            int r2 = r2 * 53
            boolean r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8816a(r9, r5)
        L_0x00fb:
            int r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.m8162a(r3)
            goto L_0x0127
        L_0x0100:
            int r2 = r2 * 53
            int r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8826f(r9, r5)
            goto L_0x0127
        L_0x0107:
            int r2 = r2 * 53
            long r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8827g(r9, r5)
            goto L_0x0123
        L_0x010e:
            int r2 = r2 * 53
            float r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8825e(r9, r5)
        L_0x0114:
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0127
        L_0x0119:
            int r2 = r2 * 53
            double r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8823d(r9, r5)
        L_0x011f:
            long r3 = java.lang.Double.doubleToLongBits(r3)
        L_0x0123:
            int r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.m8161a(r3)
        L_0x0127:
            int r3 = r3 + r2
            r2 = r3
        L_0x0129:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x012d:
            int r2 = r2 * 53
            q.b.c.a.j0.a.m1<?, ?> r0 = r8.f9193o
            q.b.c.a.j0.a.o1 r0 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3683o1) r0
            r1 = 0
            if (r0 == 0) goto L_0x0158
            r0 = r9
            q.b.c.a.j0.a.z r0 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3731z) r0
            q.b.c.a.j0.a.n1 r0 = r0.unknownFields
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            boolean r2 = r8.f9184f
            if (r2 == 0) goto L_0x0157
            int r0 = r0 * 53
            q.b.c.a.j0.a.s<?> r2 = r8.f9194p
            q.b.c.a.j0.a.t r2 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3709t) r2
            if (r2 == 0) goto L_0x0156
            q.b.c.a.j0.a.z$c r9 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3734c) r9
            q.b.c.a.j0.a.v<q.b.c.a.j0.a.z$e> r9 = r9.f9286e
            int r9 = r9.hashCode()
            int r0 = r0 + r9
            goto L_0x0157
        L_0x0156:
            throw r1
        L_0x0157:
            return r0
        L_0x0158:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p301c.p302a.p311j0.p312a.C3717u0.mo9651d(java.lang.Object):int");
    }

    /* renamed from: e */
    public final int mo9959e(int i) {
        return this.f9179a[i + 1];
    }

    /* JADX INFO: used method not loaded: q.b.c.a.j0.a.m.f(int, int):null, types can be incorrect */
    /* JADX INFO: used method not loaded: q.b.c.a.j0.a.m.c(int, long):null, types can be incorrect */
    /* JADX INFO: used method not loaded: q.b.c.a.j0.a.m.g(int, int):null, types can be incorrect */
    /* JADX INFO: used method not loaded: q.b.c.a.j0.a.m.g(int, long):null, types can be incorrect */
    /* JADX INFO: used method not loaded: q.b.c.a.j0.a.m.d(int, long):null, types can be incorrect */
    /* JADX INFO: used method not loaded: q.b.c.a.j0.a.m.a(int, float):null, types can be incorrect */
    /* JADX INFO: used method not loaded: q.b.c.a.j0.a.m.a(int, double):null, types can be incorrect */
    /* JADX INFO: used method not loaded: q.b.c.a.j0.a.m.f(int, long):null, types can be incorrect */
    /* JADX INFO: used method not loaded: q.b.c.a.j0.a.m.e(int, long):null, types can be incorrect */
    /* JADX INFO: used method not loaded: q.b.c.a.j0.a.m.e(int, int):null, types can be incorrect */
    /* JADX INFO: used method not loaded: q.b.c.a.j0.a.m.c(int, q.b.c.a.j0.a.j):null, types can be incorrect */
    /* JADX INFO: used method not loaded: q.b.c.a.j0.a.i1.a(int, java.lang.Object, q.b.c.a.j0.a.g1):null, types can be incorrect */
    /* JADX INFO: used method not loaded: q.b.c.a.j0.a.m.b(int, java.lang.String):null, types can be incorrect */
    /* JADX INFO: used method not loaded: q.b.c.a.j0.a.m.b(int, boolean):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01ca, code lost:
        if (r0.f9187i != false) goto L_0x0244;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01dc, code lost:
        if (r0.f9187i != false) goto L_0x0244;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01ed, code lost:
        if (r0.f9187i != false) goto L_0x0244;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01fe, code lost:
        if (r0.f9187i != false) goto L_0x0244;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x020f, code lost:
        if (r0.f9187i != false) goto L_0x0244;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0220, code lost:
        if (r0.f9187i != false) goto L_0x0244;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0231, code lost:
        if (r0.f9187i != false) goto L_0x0244;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0242, code lost:
        if (r0.f9187i != false) goto L_0x0244;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0244, code lost:
        r2.putInt(r1, (long) r10, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0248, code lost:
        r5 = r5 + ((p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8671i(r7) + p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8669h(r8)) + r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02f4, code lost:
        r5 = r5 + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02fb, code lost:
        r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8643b(r8, (p213q.p217b.p301c.p302a.p311j0.p312a.C3706s0) r2.getObject(r1, r13), mo9956c(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0312, code lost:
        r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8663f(r8, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x031f, code lost:
        r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8672i(r8, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0328, code lost:
        r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8658e(r8, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0333, code lost:
        r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8670h(r8, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0341, code lost:
        r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8657e(r8, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x034e, code lost:
        r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8674j(r8, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0357, code lost:
        r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8649c(r8, (p213q.p217b.p301c.p302a.p311j0.p312a.C3635j) r2.getObject(r1, r13));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0366, code lost:
        r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8335a(r8, r2.getObject(r1, r13), mo9956c(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x037d, code lost:
        if ((r7 instanceof p213q.p217b.p301c.p302a.p311j0.p312a.C3635j) != false) goto L_0x037f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x037f, code lost:
        r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8649c(r8, (p213q.p217b.p301c.p302a.p311j0.p312a.C3635j) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0386, code lost:
        r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8642b(r8, (java.lang.String) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x038c, code lost:
        r5 = r5 + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0392, code lost:
        r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8644b(r8, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x03cf, code lost:
        r4 = r4 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c1, code lost:
        if ((r7 instanceof p213q.p217b.p301c.p302a.p311j0.p312a.C3635j) != false) goto L_0x037f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d3, code lost:
        r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8662f(r8, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e0, code lost:
        r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8648c(r8, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f2, code lost:
        r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8666g(r8, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0102, code lost:
        r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8667g(r8, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0112, code lost:
        r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8653d(r8, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x011e, code lost:
        r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8635a(r8, 0.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x012a, code lost:
        r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8634a(r8, 0.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x015e, code lost:
        if (r0.f9187i != false) goto L_0x0244;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0170, code lost:
        if (r0.f9187i != false) goto L_0x0244;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0182, code lost:
        if (r0.f9187i != false) goto L_0x0244;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0194, code lost:
        if (r0.f9187i != false) goto L_0x0244;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01a6, code lost:
        if (r0.f9187i != false) goto L_0x0244;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01b8, code lost:
        if (r0.f9187i != false) goto L_0x0244;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo9960e(T r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            sun.misc.Unsafe r2 = f9178s
            r3 = -1
            r4 = 0
            r5 = 0
            r6 = 0
        L_0x000a:
            int[] r7 = r0.f9179a
            int r7 = r7.length
            if (r4 >= r7) goto L_0x03d3
            int r7 = r0.mo9959e(r4)
            int[] r8 = r0.f9179a
            r8 = r8[r4]
            int r9 = m8923g(r7)
            r10 = 17
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r12 = 1
            if (r9 > r10) goto L_0x0036
            int[] r10 = r0.f9179a
            int r13 = r4 + 2
            r10 = r10[r13]
            r11 = r11 & r10
            int r13 = r10 >>> 20
            int r12 = r12 << r13
            if (r11 == r3) goto L_0x0050
            long r13 = (long) r11
            int r6 = r2.getInt(r1, r13)
            r3 = r11
            goto L_0x0050
        L_0x0036:
            boolean r10 = r0.f9187i
            if (r10 == 0) goto L_0x004e
            q.b.c.a.j0.a.w r10 = p213q.p217b.p301c.p302a.p311j0.p312a.C3724w.DOUBLE_LIST_PACKED
            int r10 = r10.f9271e
            if (r9 < r10) goto L_0x004e
            q.b.c.a.j0.a.w r10 = p213q.p217b.p301c.p302a.p311j0.p312a.C3724w.SINT64_LIST_PACKED
            int r10 = r10.f9271e
            if (r9 > r10) goto L_0x004e
            int[] r10 = r0.f9179a
            int r12 = r4 + 2
            r10 = r10[r12]
            r10 = r10 & r11
            goto L_0x004f
        L_0x004e:
            r10 = 0
        L_0x004f:
            r12 = 0
        L_0x0050:
            long r13 = m8921f(r7)
            r7 = 0
            r15 = r12
            r11 = 0
            switch(r9) {
                case 0: goto L_0x03c9;
                case 1: goto L_0x03c3;
                case 2: goto L_0x03b9;
                case 3: goto L_0x03af;
                case 4: goto L_0x03a5;
                case 5: goto L_0x039f;
                case 6: goto L_0x0399;
                case 7: goto L_0x038e;
                case 8: goto L_0x0373;
                case 9: goto L_0x0362;
                case 10: goto L_0x0353;
                case 11: goto L_0x0346;
                case 12: goto L_0x0339;
                case 13: goto L_0x032f;
                case 14: goto L_0x0324;
                case 15: goto L_0x0317;
                case 16: goto L_0x030a;
                case 17: goto L_0x02f7;
                case 18: goto L_0x02b9;
                case 19: goto L_0x02e9;
                case 20: goto L_0x02dd;
                case 21: goto L_0x02d1;
                case 22: goto L_0x02c5;
                case 23: goto L_0x02b9;
                case 24: goto L_0x02e9;
                case 25: goto L_0x02ad;
                case 26: goto L_0x02a2;
                case 27: goto L_0x0293;
                case 28: goto L_0x0288;
                case 29: goto L_0x027c;
                case 30: goto L_0x026f;
                case 31: goto L_0x02e9;
                case 32: goto L_0x02b9;
                case 33: goto L_0x0262;
                case 34: goto L_0x0255;
                case 35: goto L_0x0234;
                case 36: goto L_0x0223;
                case 37: goto L_0x0212;
                case 38: goto L_0x0201;
                case 39: goto L_0x01f0;
                case 40: goto L_0x01df;
                case 41: goto L_0x01ce;
                case 42: goto L_0x01bc;
                case 43: goto L_0x01aa;
                case 44: goto L_0x0198;
                case 45: goto L_0x0186;
                case 46: goto L_0x0174;
                case 47: goto L_0x0162;
                case 48: goto L_0x0150;
                case 49: goto L_0x0140;
                case 50: goto L_0x0130;
                case 51: goto L_0x0124;
                case 52: goto L_0x0118;
                case 53: goto L_0x0108;
                case 54: goto L_0x00f8;
                case 55: goto L_0x00e8;
                case 56: goto L_0x00da;
                case 57: goto L_0x00cd;
                case 58: goto L_0x00c5;
                case 59: goto L_0x00b5;
                case 60: goto L_0x00ad;
                case 61: goto L_0x00a5;
                case 62: goto L_0x0099;
                case 63: goto L_0x008d;
                case 64: goto L_0x0085;
                case 65: goto L_0x007d;
                case 66: goto L_0x0071;
                case 67: goto L_0x0065;
                case 68: goto L_0x005d;
                default: goto L_0x005b;
            }
        L_0x005b:
            goto L_0x03cf
        L_0x005d:
            boolean r7 = r0.mo9946a((T) r1, r8, r4)
            if (r7 == 0) goto L_0x03cf
            goto L_0x02fb
        L_0x0065:
            boolean r7 = r0.mo9946a((T) r1, r8, r4)
            if (r7 == 0) goto L_0x03cf
            long r9 = m8922f(r1, r13)
            goto L_0x0312
        L_0x0071:
            boolean r7 = r0.mo9946a((T) r1, r8, r4)
            if (r7 == 0) goto L_0x03cf
            int r7 = m8920e(r1, r13)
            goto L_0x031f
        L_0x007d:
            boolean r7 = r0.mo9946a((T) r1, r8, r4)
            if (r7 == 0) goto L_0x03cf
            goto L_0x0328
        L_0x0085:
            boolean r7 = r0.mo9946a((T) r1, r8, r4)
            if (r7 == 0) goto L_0x03cf
            goto L_0x0333
        L_0x008d:
            boolean r7 = r0.mo9946a((T) r1, r8, r4)
            if (r7 == 0) goto L_0x03cf
            int r7 = m8920e(r1, r13)
            goto L_0x0341
        L_0x0099:
            boolean r7 = r0.mo9946a((T) r1, r8, r4)
            if (r7 == 0) goto L_0x03cf
            int r7 = m8920e(r1, r13)
            goto L_0x034e
        L_0x00a5:
            boolean r7 = r0.mo9946a((T) r1, r8, r4)
            if (r7 == 0) goto L_0x03cf
            goto L_0x0357
        L_0x00ad:
            boolean r7 = r0.mo9946a((T) r1, r8, r4)
            if (r7 == 0) goto L_0x03cf
            goto L_0x0366
        L_0x00b5:
            boolean r7 = r0.mo9946a((T) r1, r8, r4)
            if (r7 == 0) goto L_0x03cf
            java.lang.Object r7 = r2.getObject(r1, r13)
            boolean r9 = r7 instanceof p213q.p217b.p301c.p302a.p311j0.p312a.C3635j
            if (r9 == 0) goto L_0x0386
            goto L_0x037f
        L_0x00c5:
            boolean r7 = r0.mo9946a((T) r1, r8, r4)
            if (r7 == 0) goto L_0x03cf
            goto L_0x0392
        L_0x00cd:
            boolean r7 = r0.mo9946a((T) r1, r8, r4)
            if (r7 == 0) goto L_0x03cf
        L_0x00d3:
            r7 = 0
            int r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8662f(r8, r7)
            goto L_0x02f4
        L_0x00da:
            boolean r7 = r0.mo9946a((T) r1, r8, r4)
            if (r7 == 0) goto L_0x03cf
        L_0x00e0:
            r9 = 0
            int r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8648c(r8, r9)
            goto L_0x02f4
        L_0x00e8:
            boolean r7 = r0.mo9946a((T) r1, r8, r4)
            if (r7 == 0) goto L_0x03cf
            int r7 = m8920e(r1, r13)
        L_0x00f2:
            int r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8666g(r8, r7)
            goto L_0x02f4
        L_0x00f8:
            boolean r7 = r0.mo9946a((T) r1, r8, r4)
            if (r7 == 0) goto L_0x03cf
            long r9 = m8922f(r1, r13)
        L_0x0102:
            int r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8667g(r8, r9)
            goto L_0x02f4
        L_0x0108:
            boolean r7 = r0.mo9946a((T) r1, r8, r4)
            if (r7 == 0) goto L_0x03cf
            long r9 = m8922f(r1, r13)
        L_0x0112:
            int r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8653d(r8, r9)
            goto L_0x02f4
        L_0x0118:
            boolean r9 = r0.mo9946a((T) r1, r8, r4)
            if (r9 == 0) goto L_0x03cf
        L_0x011e:
            int r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8635a(r8, r7)
            goto L_0x02f4
        L_0x0124:
            boolean r7 = r0.mo9946a((T) r1, r8, r4)
            if (r7 == 0) goto L_0x03cf
        L_0x012a:
            int r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8634a(r8, r11)
            goto L_0x02f4
        L_0x0130:
            q.b.c.a.j0.a.n0 r7 = r0.f9195q
            java.lang.Object r9 = r2.getObject(r1, r13)
            java.lang.Object r10 = r0.mo9950b(r4)
            int r7 = r7.mo9850a(r8, r9, r10)
            goto L_0x02f4
        L_0x0140:
            java.lang.Object r7 = r2.getObject(r1, r13)
            java.util.List r7 = (java.util.List) r7
            q.b.c.a.j0.a.g1 r9 = r0.mo9956c(r4)
            int r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8337a(r8, r7, r9)
            goto L_0x02f4
        L_0x0150:
            java.lang.Object r7 = r2.getObject(r1, r13)
            java.util.List r7 = (java.util.List) r7
            int r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8375h(r7)
            if (r7 <= 0) goto L_0x03cf
            boolean r9 = r0.f9187i
            if (r9 == 0) goto L_0x0248
            goto L_0x0244
        L_0x0162:
            java.lang.Object r7 = r2.getObject(r1, r13)
            java.util.List r7 = (java.util.List) r7
            int r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8372g(r7)
            if (r7 <= 0) goto L_0x03cf
            boolean r9 = r0.f9187i
            if (r9 == 0) goto L_0x0248
            goto L_0x0244
        L_0x0174:
            java.lang.Object r7 = r2.getObject(r1, r13)
            java.util.List r7 = (java.util.List) r7
            int r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8363d(r7)
            if (r7 <= 0) goto L_0x03cf
            boolean r9 = r0.f9187i
            if (r9 == 0) goto L_0x0248
            goto L_0x0244
        L_0x0186:
            java.lang.Object r7 = r2.getObject(r1, r13)
            java.util.List r7 = (java.util.List) r7
            int r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8360c(r7)
            if (r7 <= 0) goto L_0x03cf
            boolean r9 = r0.f9187i
            if (r9 == 0) goto L_0x0248
            goto L_0x0244
        L_0x0198:
            java.lang.Object r7 = r2.getObject(r1, r13)
            java.util.List r7 = (java.util.List) r7
            int r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8355b(r7)
            if (r7 <= 0) goto L_0x03cf
            boolean r9 = r0.f9187i
            if (r9 == 0) goto L_0x0248
            goto L_0x0244
        L_0x01aa:
            java.lang.Object r7 = r2.getObject(r1, r13)
            java.util.List r7 = (java.util.List) r7
            int r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8378i(r7)
            if (r7 <= 0) goto L_0x03cf
            boolean r9 = r0.f9187i
            if (r9 == 0) goto L_0x0248
            goto L_0x0244
        L_0x01bc:
            java.lang.Object r7 = r2.getObject(r1, r13)
            java.util.List r7 = (java.util.List) r7
            int r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8339a(r7)
            if (r7 <= 0) goto L_0x03cf
            boolean r9 = r0.f9187i
            if (r9 == 0) goto L_0x0248
            goto L_0x0244
        L_0x01ce:
            java.lang.Object r7 = r2.getObject(r1, r13)
            java.util.List r7 = (java.util.List) r7
            int r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8360c(r7)
            if (r7 <= 0) goto L_0x03cf
            boolean r9 = r0.f9187i
            if (r9 == 0) goto L_0x0248
            goto L_0x0244
        L_0x01df:
            java.lang.Object r7 = r2.getObject(r1, r13)
            java.util.List r7 = (java.util.List) r7
            int r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8363d(r7)
            if (r7 <= 0) goto L_0x03cf
            boolean r9 = r0.f9187i
            if (r9 == 0) goto L_0x0248
            goto L_0x0244
        L_0x01f0:
            java.lang.Object r7 = r2.getObject(r1, r13)
            java.util.List r7 = (java.util.List) r7
            int r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8366e(r7)
            if (r7 <= 0) goto L_0x03cf
            boolean r9 = r0.f9187i
            if (r9 == 0) goto L_0x0248
            goto L_0x0244
        L_0x0201:
            java.lang.Object r7 = r2.getObject(r1, r13)
            java.util.List r7 = (java.util.List) r7
            int r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8381j(r7)
            if (r7 <= 0) goto L_0x03cf
            boolean r9 = r0.f9187i
            if (r9 == 0) goto L_0x0248
            goto L_0x0244
        L_0x0212:
            java.lang.Object r7 = r2.getObject(r1, r13)
            java.util.List r7 = (java.util.List) r7
            int r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8369f(r7)
            if (r7 <= 0) goto L_0x03cf
            boolean r9 = r0.f9187i
            if (r9 == 0) goto L_0x0248
            goto L_0x0244
        L_0x0223:
            java.lang.Object r7 = r2.getObject(r1, r13)
            java.util.List r7 = (java.util.List) r7
            int r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8360c(r7)
            if (r7 <= 0) goto L_0x03cf
            boolean r9 = r0.f9187i
            if (r9 == 0) goto L_0x0248
            goto L_0x0244
        L_0x0234:
            java.lang.Object r7 = r2.getObject(r1, r13)
            java.util.List r7 = (java.util.List) r7
            int r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8363d(r7)
            if (r7 <= 0) goto L_0x03cf
            boolean r9 = r0.f9187i
            if (r9 == 0) goto L_0x0248
        L_0x0244:
            long r9 = (long) r10
            r2.putInt(r1, r9, r7)
        L_0x0248:
            int r8 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8669h(r8)
            int r9 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8671i(r7)
            int r9 = r9 + r8
            int r9 = r9 + r7
            int r5 = r5 + r9
            goto L_0x03cf
        L_0x0255:
            java.lang.Object r7 = r2.getObject(r1, r13)
            java.util.List r7 = (java.util.List) r7
            r9 = 0
            int r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8374h(r8, r7, r9)
            goto L_0x02f4
        L_0x0262:
            r7 = 0
            java.lang.Object r9 = r2.getObject(r1, r13)
            java.util.List r9 = (java.util.List) r9
            int r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8371g(r8, r9, r7)
            goto L_0x02f4
        L_0x026f:
            r7 = 0
            java.lang.Object r9 = r2.getObject(r1, r13)
            java.util.List r9 = (java.util.List) r9
            int r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8354b(r8, r9, r7)
            goto L_0x02f4
        L_0x027c:
            r7 = 0
            java.lang.Object r9 = r2.getObject(r1, r13)
            java.util.List r9 = (java.util.List) r9
            int r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8377i(r8, r9, r7)
            goto L_0x02f4
        L_0x0288:
            java.lang.Object r7 = r2.getObject(r1, r13)
            java.util.List r7 = (java.util.List) r7
            int r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8336a(r8, r7)
            goto L_0x02f4
        L_0x0293:
            java.lang.Object r7 = r2.getObject(r1, r13)
            java.util.List r7 = (java.util.List) r7
            q.b.c.a.j0.a.g1 r9 = r0.mo9956c(r4)
            int r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8353b(r8, r7, r9)
            goto L_0x02f4
        L_0x02a2:
            java.lang.Object r7 = r2.getObject(r1, r13)
            java.util.List r7 = (java.util.List) r7
            int r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8352b(r8, r7)
            goto L_0x02f4
        L_0x02ad:
            java.lang.Object r7 = r2.getObject(r1, r13)
            java.util.List r7 = (java.util.List) r7
            r9 = 0
            int r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8338a(r8, r7, r9)
            goto L_0x02f4
        L_0x02b9:
            r7 = 0
            java.lang.Object r9 = r2.getObject(r1, r13)
            java.util.List r9 = (java.util.List) r9
            int r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8362d(r8, r9, r7)
            goto L_0x02f4
        L_0x02c5:
            r7 = 0
            java.lang.Object r9 = r2.getObject(r1, r13)
            java.util.List r9 = (java.util.List) r9
            int r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8365e(r8, r9, r7)
            goto L_0x02f4
        L_0x02d1:
            r7 = 0
            java.lang.Object r9 = r2.getObject(r1, r13)
            java.util.List r9 = (java.util.List) r9
            int r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8380j(r8, r9, r7)
            goto L_0x02f4
        L_0x02dd:
            r7 = 0
            java.lang.Object r9 = r2.getObject(r1, r13)
            java.util.List r9 = (java.util.List) r9
            int r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8368f(r8, r9, r7)
            goto L_0x02f4
        L_0x02e9:
            r7 = 0
            java.lang.Object r9 = r2.getObject(r1, r13)
            java.util.List r9 = (java.util.List) r9
            int r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8359c(r8, r9, r7)
        L_0x02f4:
            int r5 = r5 + r7
            goto L_0x03cf
        L_0x02f7:
            r7 = r6 & r15
            if (r7 == 0) goto L_0x03cf
        L_0x02fb:
            java.lang.Object r7 = r2.getObject(r1, r13)
            q.b.c.a.j0.a.s0 r7 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3706s0) r7
            q.b.c.a.j0.a.g1 r9 = r0.mo9956c(r4)
            int r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8643b(r8, r7, r9)
            goto L_0x02f4
        L_0x030a:
            r7 = r6 & r15
            if (r7 == 0) goto L_0x03cf
            long r9 = r2.getLong(r1, r13)
        L_0x0312:
            int r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8663f(r8, r9)
            goto L_0x02f4
        L_0x0317:
            r7 = r6 & r15
            if (r7 == 0) goto L_0x03cf
            int r7 = r2.getInt(r1, r13)
        L_0x031f:
            int r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8672i(r8, r7)
            goto L_0x02f4
        L_0x0324:
            r7 = r6 & r15
            if (r7 == 0) goto L_0x03cf
        L_0x0328:
            r9 = 0
            int r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8658e(r8, r9)
            goto L_0x02f4
        L_0x032f:
            r7 = r6 & r15
            if (r7 == 0) goto L_0x03cf
        L_0x0333:
            r7 = 0
            int r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8670h(r8, r7)
            goto L_0x02f4
        L_0x0339:
            r7 = r6 & r15
            if (r7 == 0) goto L_0x03cf
            int r7 = r2.getInt(r1, r13)
        L_0x0341:
            int r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8657e(r8, r7)
            goto L_0x02f4
        L_0x0346:
            r7 = r6 & r15
            if (r7 == 0) goto L_0x03cf
            int r7 = r2.getInt(r1, r13)
        L_0x034e:
            int r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8674j(r8, r7)
            goto L_0x02f4
        L_0x0353:
            r7 = r6 & r15
            if (r7 == 0) goto L_0x03cf
        L_0x0357:
            java.lang.Object r7 = r2.getObject(r1, r13)
            q.b.c.a.j0.a.j r7 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3635j) r7
            int r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8649c(r8, r7)
            goto L_0x02f4
        L_0x0362:
            r7 = r6 & r15
            if (r7 == 0) goto L_0x03cf
        L_0x0366:
            java.lang.Object r7 = r2.getObject(r1, r13)
            q.b.c.a.j0.a.g1 r9 = r0.mo9956c(r4)
            int r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8335a(r8, r7, r9)
            goto L_0x02f4
        L_0x0373:
            r7 = r6 & r15
            if (r7 == 0) goto L_0x03cf
            java.lang.Object r7 = r2.getObject(r1, r13)
            boolean r9 = r7 instanceof p213q.p217b.p301c.p302a.p311j0.p312a.C3635j
            if (r9 == 0) goto L_0x0386
        L_0x037f:
            q.b.c.a.j0.a.j r7 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3635j) r7
            int r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8649c(r8, r7)
            goto L_0x038c
        L_0x0386:
            java.lang.String r7 = (java.lang.String) r7
            int r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8642b(r8, r7)
        L_0x038c:
            int r5 = r5 + r7
            goto L_0x03cf
        L_0x038e:
            r7 = r6 & r15
            if (r7 == 0) goto L_0x03cf
        L_0x0392:
            r7 = 1
            int r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8644b(r8, r7)
            goto L_0x02f4
        L_0x0399:
            r7 = r6 & r15
            if (r7 == 0) goto L_0x03cf
            goto L_0x00d3
        L_0x039f:
            r7 = r6 & r15
            if (r7 == 0) goto L_0x03cf
            goto L_0x00e0
        L_0x03a5:
            r7 = r6 & r15
            if (r7 == 0) goto L_0x03cf
            int r7 = r2.getInt(r1, r13)
            goto L_0x00f2
        L_0x03af:
            r7 = r6 & r15
            if (r7 == 0) goto L_0x03cf
            long r9 = r2.getLong(r1, r13)
            goto L_0x0102
        L_0x03b9:
            r7 = r6 & r15
            if (r7 == 0) goto L_0x03cf
            long r9 = r2.getLong(r1, r13)
            goto L_0x0112
        L_0x03c3:
            r9 = r6 & r15
            if (r9 == 0) goto L_0x03cf
            goto L_0x011e
        L_0x03c9:
            r7 = r6 & r15
            if (r7 == 0) goto L_0x03cf
            goto L_0x012a
        L_0x03cf:
            int r4 = r4 + 3
            goto L_0x000a
        L_0x03d3:
            r2 = 0
            q.b.c.a.j0.a.m1<?, ?> r3 = r0.f9193o
            q.b.c.a.j0.a.o1 r3 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3683o1) r3
            r4 = 0
            if (r3 == 0) goto L_0x043e
            r3 = r1
            q.b.c.a.j0.a.z r3 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3731z) r3
            q.b.c.a.j0.a.n1 r3 = r3.unknownFields
            int r3 = r3.mo9862b()
            int r3 = r3 + r5
            boolean r5 = r0.f9184f
            if (r5 == 0) goto L_0x043d
            q.b.c.a.j0.a.s<?> r5 = r0.f9194p
            q.b.c.a.j0.a.t r5 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3709t) r5
            if (r5 == 0) goto L_0x043c
            q.b.c.a.j0.a.z$c r1 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3734c) r1
            q.b.c.a.j0.a.v<q.b.c.a.j0.a.z$e> r1 = r1.f9286e
            r4 = r2
        L_0x03f4:
            q.b.c.a.j0.a.j1<T, java.lang.Object> r5 = r1.f9208a
            int r5 = r5.mo9693b()
            if (r2 >= r5) goto L_0x0414
            q.b.c.a.j0.a.j1<T, java.lang.Object> r5 = r1.f9208a
            java.util.Map$Entry r5 = r5.mo9691a(r2)
            java.lang.Object r6 = r5.getKey()
            q.b.c.a.j0.a.v$a r6 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3719v.C3720a) r6
            java.lang.Object r5 = r5.getValue()
            int r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3719v.m8969c(r6, r5)
            int r4 = r4 + r5
            int r2 = r2 + 1
            goto L_0x03f4
        L_0x0414:
            q.b.c.a.j0.a.j1<T, java.lang.Object> r1 = r1.f9208a
            java.lang.Iterable r1 = r1.mo9695c()
            java.util.Iterator r1 = r1.iterator()
        L_0x041e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x043a
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r5 = r2.getKey()
            q.b.c.a.j0.a.v$a r5 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3719v.C3720a) r5
            java.lang.Object r2 = r2.getValue()
            int r2 = p213q.p217b.p301c.p302a.p311j0.p312a.C3719v.m8969c(r5, r2)
            int r4 = r4 + r2
            goto L_0x041e
        L_0x043a:
            int r3 = r3 + r4
            goto L_0x043d
        L_0x043c:
            throw r4
        L_0x043d:
            return r3
        L_0x043e:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p301c.p302a.p311j0.p312a.C3717u0.mo9960e(java.lang.Object):int");
    }

    /* JADX INFO: used method not loaded: q.b.c.a.j0.a.m.f(int, long):null, types can be incorrect */
    /* JADX INFO: used method not loaded: q.b.c.a.j0.a.m.e(int, long):null, types can be incorrect */
    /* JADX INFO: used method not loaded: q.b.c.a.j0.a.m.e(int, int):null, types can be incorrect */
    /* JADX INFO: used method not loaded: q.b.c.a.j0.a.m.c(int, q.b.c.a.j0.a.j):null, types can be incorrect */
    /* JADX INFO: used method not loaded: q.b.c.a.j0.a.i1.a(int, java.lang.Object, q.b.c.a.j0.a.g1):null, types can be incorrect */
    /* JADX INFO: used method not loaded: q.b.c.a.j0.a.m.b(int, java.lang.String):null, types can be incorrect */
    /* JADX INFO: used method not loaded: q.b.c.a.j0.a.m.b(int, boolean):null, types can be incorrect */
    /* JADX INFO: used method not loaded: q.b.c.a.j0.a.m.f(int, int):null, types can be incorrect */
    /* JADX INFO: used method not loaded: q.b.c.a.j0.a.m.c(int, long):null, types can be incorrect */
    /* JADX INFO: used method not loaded: q.b.c.a.j0.a.m.g(int, int):null, types can be incorrect */
    /* JADX INFO: used method not loaded: q.b.c.a.j0.a.m.g(int, long):null, types can be incorrect */
    /* JADX INFO: used method not loaded: q.b.c.a.j0.a.m.d(int, long):null, types can be incorrect */
    /* JADX INFO: used method not loaded: q.b.c.a.j0.a.m.a(int, float):null, types can be incorrect */
    /* JADX INFO: used method not loaded: q.b.c.a.j0.a.m.a(int, double):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01cc, code lost:
        if (r13.f9187i != false) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01dd, code lost:
        if (r13.f9187i != false) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01ee, code lost:
        if (r13.f9187i != false) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01ff, code lost:
        if (r13.f9187i != false) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0201, code lost:
        r0.putInt(r14, (long) r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0205, code lost:
        r3 = r3 + ((p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8671i(r5) + p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8669h(r6)) + r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x029e, code lost:
        r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8643b(r6, (p213q.p217b.p301c.p302a.p311j0.p312a.C3706s0) p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r14, r7), mo9956c(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02b8, code lost:
        r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8663f(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02c8, code lost:
        r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8672i(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02d4, code lost:
        r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8658e(r6, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02e0, code lost:
        r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8670h(r6, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x02f0, code lost:
        r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8657e(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0300, code lost:
        r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8674j(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x030c, code lost:
        r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r14, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0310, code lost:
        r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8649c(r6, (p213q.p217b.p301c.p302a.p311j0.p312a.C3635j) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x031e, code lost:
        r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8335a(r6, p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r14, r7), mo9956c(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0338, code lost:
        if ((r4 instanceof p213q.p217b.p301c.p302a.p311j0.p312a.C3635j) != false) goto L_0x0310;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x033b, code lost:
        r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8642b(r6, (java.lang.String) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0348, code lost:
        r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8644b(r6, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0353, code lost:
        r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8662f(r6, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x035e, code lost:
        r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8648c(r6, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x036d, code lost:
        r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8666g(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x037c, code lost:
        r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8667g(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x038b, code lost:
        r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8653d(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0396, code lost:
        r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8635a(r6, 0.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x03a1, code lost:
        r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8634a(r6, 0.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x03a7, code lost:
        r3 = r3 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x03a8, code lost:
        r2 = r2 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009f, code lost:
        if ((r4 instanceof p213q.p217b.p301c.p302a.p311j0.p312a.C3635j) != false) goto L_0x0310;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x011b, code lost:
        if (r13.f9187i != false) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x012d, code lost:
        if (r13.f9187i != false) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x013f, code lost:
        if (r13.f9187i != false) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0151, code lost:
        if (r13.f9187i != false) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0163, code lost:
        if (r13.f9187i != false) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0175, code lost:
        if (r13.f9187i != false) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0187, code lost:
        if (r13.f9187i != false) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0199, code lost:
        if (r13.f9187i != false) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01aa, code lost:
        if (r13.f9187i != false) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01bb, code lost:
        if (r13.f9187i != false) goto L_0x0201;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo9961f(T r14) {
        /*
            r13 = this;
            sun.misc.Unsafe r0 = f9178s
            r1 = 0
            r2 = r1
            r3 = r2
        L_0x0005:
            int[] r4 = r13.f9179a
            int r4 = r4.length
            if (r2 >= r4) goto L_0x03ac
            int r4 = r13.mo9959e(r2)
            int r5 = m8923g(r4)
            int[] r6 = r13.f9179a
            r6 = r6[r2]
            long r7 = m8921f(r4)
            q.b.c.a.j0.a.w r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3724w.DOUBLE_LIST_PACKED
            int r4 = r4.f9271e
            if (r5 < r4) goto L_0x0031
            q.b.c.a.j0.a.w r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3724w.SINT64_LIST_PACKED
            int r4 = r4.f9271e
            if (r5 > r4) goto L_0x0031
            int[] r4 = r13.f9179a
            int r9 = r2 + 2
            r4 = r4[r9]
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r9
            goto L_0x0032
        L_0x0031:
            r4 = r1
        L_0x0032:
            r9 = 1
            r10 = 0
            r11 = 0
            switch(r5) {
                case 0: goto L_0x039b;
                case 1: goto L_0x0390;
                case 2: goto L_0x0381;
                case 3: goto L_0x0372;
                case 4: goto L_0x0363;
                case 5: goto L_0x0358;
                case 6: goto L_0x034d;
                case 7: goto L_0x0342;
                case 8: goto L_0x032c;
                case 9: goto L_0x0318;
                case 10: goto L_0x0306;
                case 11: goto L_0x02f6;
                case 12: goto L_0x02e6;
                case 13: goto L_0x02da;
                case 14: goto L_0x02ce;
                case 15: goto L_0x02be;
                case 16: goto L_0x02ae;
                case 17: goto L_0x0298;
                case 18: goto L_0x028e;
                case 19: goto L_0x0284;
                case 20: goto L_0x027a;
                case 21: goto L_0x0270;
                case 22: goto L_0x0266;
                case 23: goto L_0x028e;
                case 24: goto L_0x0284;
                case 25: goto L_0x025c;
                case 26: goto L_0x0252;
                case 27: goto L_0x0244;
                case 28: goto L_0x023a;
                case 29: goto L_0x0230;
                case 30: goto L_0x0226;
                case 31: goto L_0x0284;
                case 32: goto L_0x028e;
                case 33: goto L_0x021c;
                case 34: goto L_0x0212;
                case 35: goto L_0x01f1;
                case 36: goto L_0x01e0;
                case 37: goto L_0x01cf;
                case 38: goto L_0x01be;
                case 39: goto L_0x01ad;
                case 40: goto L_0x019c;
                case 41: goto L_0x018b;
                case 42: goto L_0x0179;
                case 43: goto L_0x0167;
                case 44: goto L_0x0155;
                case 45: goto L_0x0143;
                case 46: goto L_0x0131;
                case 47: goto L_0x011f;
                case 48: goto L_0x010d;
                case 49: goto L_0x00ff;
                case 50: goto L_0x00ef;
                case 51: goto L_0x00e7;
                case 52: goto L_0x00df;
                case 53: goto L_0x00d3;
                case 54: goto L_0x00c7;
                case 55: goto L_0x00bb;
                case 56: goto L_0x00b3;
                case 57: goto L_0x00ab;
                case 58: goto L_0x00a3;
                case 59: goto L_0x0093;
                case 60: goto L_0x008b;
                case 61: goto L_0x0083;
                case 62: goto L_0x0077;
                case 63: goto L_0x006b;
                case 64: goto L_0x0063;
                case 65: goto L_0x005b;
                case 66: goto L_0x004f;
                case 67: goto L_0x0043;
                case 68: goto L_0x003b;
                default: goto L_0x0039;
            }
        L_0x0039:
            goto L_0x03a8
        L_0x003b:
            boolean r4 = r13.mo9946a((T) r14, r6, r2)
            if (r4 == 0) goto L_0x03a8
            goto L_0x029e
        L_0x0043:
            boolean r4 = r13.mo9946a((T) r14, r6, r2)
            if (r4 == 0) goto L_0x03a8
            long r4 = m8922f(r14, r7)
            goto L_0x02b8
        L_0x004f:
            boolean r4 = r13.mo9946a((T) r14, r6, r2)
            if (r4 == 0) goto L_0x03a8
            int r4 = m8920e(r14, r7)
            goto L_0x02c8
        L_0x005b:
            boolean r4 = r13.mo9946a((T) r14, r6, r2)
            if (r4 == 0) goto L_0x03a8
            goto L_0x02d4
        L_0x0063:
            boolean r4 = r13.mo9946a((T) r14, r6, r2)
            if (r4 == 0) goto L_0x03a8
            goto L_0x02e0
        L_0x006b:
            boolean r4 = r13.mo9946a((T) r14, r6, r2)
            if (r4 == 0) goto L_0x03a8
            int r4 = m8920e(r14, r7)
            goto L_0x02f0
        L_0x0077:
            boolean r4 = r13.mo9946a((T) r14, r6, r2)
            if (r4 == 0) goto L_0x03a8
            int r4 = m8920e(r14, r7)
            goto L_0x0300
        L_0x0083:
            boolean r4 = r13.mo9946a((T) r14, r6, r2)
            if (r4 == 0) goto L_0x03a8
            goto L_0x030c
        L_0x008b:
            boolean r4 = r13.mo9946a((T) r14, r6, r2)
            if (r4 == 0) goto L_0x03a8
            goto L_0x031e
        L_0x0093:
            boolean r4 = r13.mo9946a((T) r14, r6, r2)
            if (r4 == 0) goto L_0x03a8
            java.lang.Object r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r14, r7)
            boolean r5 = r4 instanceof p213q.p217b.p301c.p302a.p311j0.p312a.C3635j
            if (r5 == 0) goto L_0x033b
            goto L_0x033a
        L_0x00a3:
            boolean r4 = r13.mo9946a((T) r14, r6, r2)
            if (r4 == 0) goto L_0x03a8
            goto L_0x0348
        L_0x00ab:
            boolean r4 = r13.mo9946a((T) r14, r6, r2)
            if (r4 == 0) goto L_0x03a8
            goto L_0x0353
        L_0x00b3:
            boolean r4 = r13.mo9946a((T) r14, r6, r2)
            if (r4 == 0) goto L_0x03a8
            goto L_0x035e
        L_0x00bb:
            boolean r4 = r13.mo9946a((T) r14, r6, r2)
            if (r4 == 0) goto L_0x03a8
            int r4 = m8920e(r14, r7)
            goto L_0x036d
        L_0x00c7:
            boolean r4 = r13.mo9946a((T) r14, r6, r2)
            if (r4 == 0) goto L_0x03a8
            long r4 = m8922f(r14, r7)
            goto L_0x037c
        L_0x00d3:
            boolean r4 = r13.mo9946a((T) r14, r6, r2)
            if (r4 == 0) goto L_0x03a8
            long r4 = m8922f(r14, r7)
            goto L_0x038b
        L_0x00df:
            boolean r4 = r13.mo9946a((T) r14, r6, r2)
            if (r4 == 0) goto L_0x03a8
            goto L_0x0396
        L_0x00e7:
            boolean r4 = r13.mo9946a((T) r14, r6, r2)
            if (r4 == 0) goto L_0x03a8
            goto L_0x03a1
        L_0x00ef:
            q.b.c.a.j0.a.n0 r4 = r13.f9195q
            java.lang.Object r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r14, r7)
            java.lang.Object r7 = r13.mo9950b(r2)
            int r4 = r4.mo9850a(r6, r5, r7)
            goto L_0x03a7
        L_0x00ff:
            java.util.List r4 = m8914a(r14, r7)
            q.b.c.a.j0.a.g1 r5 = r13.mo9956c(r2)
            int r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8337a(r6, r4, r5)
            goto L_0x03a7
        L_0x010d:
            java.lang.Object r5 = r0.getObject(r14, r7)
            java.util.List r5 = (java.util.List) r5
            int r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8375h(r5)
            if (r5 <= 0) goto L_0x03a8
            boolean r7 = r13.f9187i
            if (r7 == 0) goto L_0x0205
            goto L_0x0201
        L_0x011f:
            java.lang.Object r5 = r0.getObject(r14, r7)
            java.util.List r5 = (java.util.List) r5
            int r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8372g(r5)
            if (r5 <= 0) goto L_0x03a8
            boolean r7 = r13.f9187i
            if (r7 == 0) goto L_0x0205
            goto L_0x0201
        L_0x0131:
            java.lang.Object r5 = r0.getObject(r14, r7)
            java.util.List r5 = (java.util.List) r5
            int r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8363d(r5)
            if (r5 <= 0) goto L_0x03a8
            boolean r7 = r13.f9187i
            if (r7 == 0) goto L_0x0205
            goto L_0x0201
        L_0x0143:
            java.lang.Object r5 = r0.getObject(r14, r7)
            java.util.List r5 = (java.util.List) r5
            int r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8360c(r5)
            if (r5 <= 0) goto L_0x03a8
            boolean r7 = r13.f9187i
            if (r7 == 0) goto L_0x0205
            goto L_0x0201
        L_0x0155:
            java.lang.Object r5 = r0.getObject(r14, r7)
            java.util.List r5 = (java.util.List) r5
            int r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8355b(r5)
            if (r5 <= 0) goto L_0x03a8
            boolean r7 = r13.f9187i
            if (r7 == 0) goto L_0x0205
            goto L_0x0201
        L_0x0167:
            java.lang.Object r5 = r0.getObject(r14, r7)
            java.util.List r5 = (java.util.List) r5
            int r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8378i(r5)
            if (r5 <= 0) goto L_0x03a8
            boolean r7 = r13.f9187i
            if (r7 == 0) goto L_0x0205
            goto L_0x0201
        L_0x0179:
            java.lang.Object r5 = r0.getObject(r14, r7)
            java.util.List r5 = (java.util.List) r5
            int r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8339a(r5)
            if (r5 <= 0) goto L_0x03a8
            boolean r7 = r13.f9187i
            if (r7 == 0) goto L_0x0205
            goto L_0x0201
        L_0x018b:
            java.lang.Object r5 = r0.getObject(r14, r7)
            java.util.List r5 = (java.util.List) r5
            int r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8360c(r5)
            if (r5 <= 0) goto L_0x03a8
            boolean r7 = r13.f9187i
            if (r7 == 0) goto L_0x0205
            goto L_0x0201
        L_0x019c:
            java.lang.Object r5 = r0.getObject(r14, r7)
            java.util.List r5 = (java.util.List) r5
            int r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8363d(r5)
            if (r5 <= 0) goto L_0x03a8
            boolean r7 = r13.f9187i
            if (r7 == 0) goto L_0x0205
            goto L_0x0201
        L_0x01ad:
            java.lang.Object r5 = r0.getObject(r14, r7)
            java.util.List r5 = (java.util.List) r5
            int r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8366e(r5)
            if (r5 <= 0) goto L_0x03a8
            boolean r7 = r13.f9187i
            if (r7 == 0) goto L_0x0205
            goto L_0x0201
        L_0x01be:
            java.lang.Object r5 = r0.getObject(r14, r7)
            java.util.List r5 = (java.util.List) r5
            int r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8381j(r5)
            if (r5 <= 0) goto L_0x03a8
            boolean r7 = r13.f9187i
            if (r7 == 0) goto L_0x0205
            goto L_0x0201
        L_0x01cf:
            java.lang.Object r5 = r0.getObject(r14, r7)
            java.util.List r5 = (java.util.List) r5
            int r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8369f(r5)
            if (r5 <= 0) goto L_0x03a8
            boolean r7 = r13.f9187i
            if (r7 == 0) goto L_0x0205
            goto L_0x0201
        L_0x01e0:
            java.lang.Object r5 = r0.getObject(r14, r7)
            java.util.List r5 = (java.util.List) r5
            int r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8360c(r5)
            if (r5 <= 0) goto L_0x03a8
            boolean r7 = r13.f9187i
            if (r7 == 0) goto L_0x0205
            goto L_0x0201
        L_0x01f1:
            java.lang.Object r5 = r0.getObject(r14, r7)
            java.util.List r5 = (java.util.List) r5
            int r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8363d(r5)
            if (r5 <= 0) goto L_0x03a8
            boolean r7 = r13.f9187i
            if (r7 == 0) goto L_0x0205
        L_0x0201:
            long r7 = (long) r4
            r0.putInt(r14, r7, r5)
        L_0x0205:
            int r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8669h(r6)
            int r6 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8671i(r5)
            int r6 = r6 + r4
            int r6 = r6 + r5
            int r3 = r3 + r6
            goto L_0x03a8
        L_0x0212:
            java.util.List r4 = m8914a(r14, r7)
            int r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8374h(r6, r4, r1)
            goto L_0x03a7
        L_0x021c:
            java.util.List r4 = m8914a(r14, r7)
            int r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8371g(r6, r4, r1)
            goto L_0x03a7
        L_0x0226:
            java.util.List r4 = m8914a(r14, r7)
            int r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8354b(r6, r4, r1)
            goto L_0x03a7
        L_0x0230:
            java.util.List r4 = m8914a(r14, r7)
            int r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8377i(r6, r4, r1)
            goto L_0x03a7
        L_0x023a:
            java.util.List r4 = m8914a(r14, r7)
            int r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8336a(r6, r4)
            goto L_0x03a7
        L_0x0244:
            java.util.List r4 = m8914a(r14, r7)
            q.b.c.a.j0.a.g1 r5 = r13.mo9956c(r2)
            int r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8353b(r6, r4, r5)
            goto L_0x03a7
        L_0x0252:
            java.util.List r4 = m8914a(r14, r7)
            int r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8352b(r6, r4)
            goto L_0x03a7
        L_0x025c:
            java.util.List r4 = m8914a(r14, r7)
            int r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8338a(r6, r4, r1)
            goto L_0x03a7
        L_0x0266:
            java.util.List r4 = m8914a(r14, r7)
            int r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8365e(r6, r4, r1)
            goto L_0x03a7
        L_0x0270:
            java.util.List r4 = m8914a(r14, r7)
            int r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8380j(r6, r4, r1)
            goto L_0x03a7
        L_0x027a:
            java.util.List r4 = m8914a(r14, r7)
            int r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8368f(r6, r4, r1)
            goto L_0x03a7
        L_0x0284:
            java.util.List r4 = m8914a(r14, r7)
            int r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8359c(r6, r4, r1)
            goto L_0x03a7
        L_0x028e:
            java.util.List r4 = m8914a(r14, r7)
            int r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8362d(r6, r4, r1)
            goto L_0x03a7
        L_0x0298:
            boolean r4 = r13.mo9945a((T) r14, r2)
            if (r4 == 0) goto L_0x03a8
        L_0x029e:
            java.lang.Object r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r14, r7)
            q.b.c.a.j0.a.s0 r4 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3706s0) r4
            q.b.c.a.j0.a.g1 r5 = r13.mo9956c(r2)
            int r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8643b(r6, r4, r5)
            goto L_0x03a7
        L_0x02ae:
            boolean r4 = r13.mo9945a((T) r14, r2)
            if (r4 == 0) goto L_0x03a8
            long r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8827g(r14, r7)
        L_0x02b8:
            int r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8663f(r6, r4)
            goto L_0x03a7
        L_0x02be:
            boolean r4 = r13.mo9945a((T) r14, r2)
            if (r4 == 0) goto L_0x03a8
            int r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8826f(r14, r7)
        L_0x02c8:
            int r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8672i(r6, r4)
            goto L_0x03a7
        L_0x02ce:
            boolean r4 = r13.mo9945a((T) r14, r2)
            if (r4 == 0) goto L_0x03a8
        L_0x02d4:
            int r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8658e(r6, r11)
            goto L_0x03a7
        L_0x02da:
            boolean r4 = r13.mo9945a((T) r14, r2)
            if (r4 == 0) goto L_0x03a8
        L_0x02e0:
            int r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8670h(r6, r1)
            goto L_0x03a7
        L_0x02e6:
            boolean r4 = r13.mo9945a((T) r14, r2)
            if (r4 == 0) goto L_0x03a8
            int r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8826f(r14, r7)
        L_0x02f0:
            int r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8657e(r6, r4)
            goto L_0x03a7
        L_0x02f6:
            boolean r4 = r13.mo9945a((T) r14, r2)
            if (r4 == 0) goto L_0x03a8
            int r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8826f(r14, r7)
        L_0x0300:
            int r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8674j(r6, r4)
            goto L_0x03a7
        L_0x0306:
            boolean r4 = r13.mo9945a((T) r14, r2)
            if (r4 == 0) goto L_0x03a8
        L_0x030c:
            java.lang.Object r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r14, r7)
        L_0x0310:
            q.b.c.a.j0.a.j r4 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3635j) r4
            int r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8649c(r6, r4)
            goto L_0x03a7
        L_0x0318:
            boolean r4 = r13.mo9945a((T) r14, r2)
            if (r4 == 0) goto L_0x03a8
        L_0x031e:
            java.lang.Object r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r14, r7)
            q.b.c.a.j0.a.g1 r5 = r13.mo9956c(r2)
            int r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8335a(r6, r4, r5)
            goto L_0x03a7
        L_0x032c:
            boolean r4 = r13.mo9945a((T) r14, r2)
            if (r4 == 0) goto L_0x03a8
            java.lang.Object r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r14, r7)
            boolean r5 = r4 instanceof p213q.p217b.p301c.p302a.p311j0.p312a.C3635j
            if (r5 == 0) goto L_0x033b
        L_0x033a:
            goto L_0x0310
        L_0x033b:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8642b(r6, r4)
            goto L_0x03a7
        L_0x0342:
            boolean r4 = r13.mo9945a((T) r14, r2)
            if (r4 == 0) goto L_0x03a8
        L_0x0348:
            int r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8644b(r6, r9)
            goto L_0x03a7
        L_0x034d:
            boolean r4 = r13.mo9945a((T) r14, r2)
            if (r4 == 0) goto L_0x03a8
        L_0x0353:
            int r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8662f(r6, r1)
            goto L_0x03a7
        L_0x0358:
            boolean r4 = r13.mo9945a((T) r14, r2)
            if (r4 == 0) goto L_0x03a8
        L_0x035e:
            int r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8648c(r6, r11)
            goto L_0x03a7
        L_0x0363:
            boolean r4 = r13.mo9945a((T) r14, r2)
            if (r4 == 0) goto L_0x03a8
            int r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8826f(r14, r7)
        L_0x036d:
            int r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8666g(r6, r4)
            goto L_0x03a7
        L_0x0372:
            boolean r4 = r13.mo9945a((T) r14, r2)
            if (r4 == 0) goto L_0x03a8
            long r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8827g(r14, r7)
        L_0x037c:
            int r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8667g(r6, r4)
            goto L_0x03a7
        L_0x0381:
            boolean r4 = r13.mo9945a((T) r14, r2)
            if (r4 == 0) goto L_0x03a8
            long r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8827g(r14, r7)
        L_0x038b:
            int r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8653d(r6, r4)
            goto L_0x03a7
        L_0x0390:
            boolean r4 = r13.mo9945a((T) r14, r2)
            if (r4 == 0) goto L_0x03a8
        L_0x0396:
            int r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8635a(r6, r10)
            goto L_0x03a7
        L_0x039b:
            boolean r4 = r13.mo9945a((T) r14, r2)
            if (r4 == 0) goto L_0x03a8
        L_0x03a1:
            r4 = 0
            int r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.m8634a(r6, r4)
        L_0x03a7:
            int r3 = r3 + r4
        L_0x03a8:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x03ac:
            q.b.c.a.j0.a.m1<?, ?> r0 = r13.f9193o
            q.b.c.a.j0.a.o1 r0 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3683o1) r0
            if (r0 == 0) goto L_0x03bc
            q.b.c.a.j0.a.z r14 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3731z) r14
            q.b.c.a.j0.a.n1 r14 = r14.unknownFields
            int r14 = r14.mo9862b()
            int r14 = r14 + r3
            return r14
        L_0x03bc:
            r14 = 0
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p301c.p302a.p311j0.p312a.C3717u0.mo9961f(java.lang.Object):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0024, code lost:
        if (r6 != null) goto L_0x0026;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9957c(T r5, T r6, int r7) {
        /*
            r4 = this;
            int[] r0 = r4.f9179a
            int r1 = r7 + 1
            r1 = r0[r1]
            r0 = r0[r7]
            long r1 = m8921f(r1)
            boolean r3 = r4.mo9946a((T) r6, r0, r7)
            if (r3 != 0) goto L_0x0013
            return
        L_0x0013:
            java.lang.Object r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r5, r1)
            java.lang.Object r6 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r6, r1)
            if (r3 == 0) goto L_0x0024
            if (r6 == 0) goto L_0x0024
            java.lang.Object r6 = p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.m8165a(r3, r6)
            goto L_0x0026
        L_0x0024:
            if (r6 == 0) goto L_0x002e
        L_0x0026:
            q.b.c.a.j0.a.q1$e r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.f9140f
            r3.mo9905a(r5, r1, r6)
            r4.mo9952b((T) r5, r0, r7)
        L_0x002e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p301c.p302a.p311j0.p312a.C3717u0.mo9957c(java.lang.Object, java.lang.Object, int):void");
    }

    /* renamed from: a */
    public final boolean mo9945a(T t, int i) {
        boolean z = false;
        if (this.f9186h) {
            int i2 = this.f9179a[i + 1];
            long f = m8921f(i2);
            switch (m8923g(i2)) {
                case 0:
                    if (C3691q1.m8823d(t, f) != 0.0d) {
                        z = true;
                    }
                    return z;
                case 1:
                    if (C3691q1.m8825e(t, f) != 0.0f) {
                        z = true;
                    }
                    return z;
                case 2:
                    if (C3691q1.m8827g(t, f) != 0) {
                        z = true;
                    }
                    return z;
                case 3:
                    if (C3691q1.m8827g(t, f) != 0) {
                        z = true;
                    }
                    return z;
                case 4:
                    if (C3691q1.m8826f(t, f) != 0) {
                        z = true;
                    }
                    return z;
                case 5:
                    if (C3691q1.m8827g(t, f) != 0) {
                        z = true;
                    }
                    return z;
                case 6:
                    if (C3691q1.m8826f(t, f) != 0) {
                        z = true;
                    }
                    return z;
                case 7:
                    return C3691q1.m8816a((Object) t, f);
                case 8:
                    Object h = C3691q1.m8828h(t, f);
                    if (h instanceof String) {
                        return !((String) h).isEmpty();
                    }
                    if (h instanceof C3635j) {
                        return !C3635j.f9034f.equals(h);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (C3691q1.m8828h(t, f) != null) {
                        z = true;
                    }
                    return z;
                case 10:
                    return !C3635j.f9034f.equals(C3691q1.m8828h(t, f));
                case 11:
                    if (C3691q1.m8826f(t, f) != 0) {
                        z = true;
                    }
                    return z;
                case 12:
                    if (C3691q1.m8826f(t, f) != 0) {
                        z = true;
                    }
                    return z;
                case 13:
                    if (C3691q1.m8826f(t, f) != 0) {
                        z = true;
                    }
                    return z;
                case 14:
                    if (C3691q1.m8827g(t, f) != 0) {
                        z = true;
                    }
                    return z;
                case 15:
                    if (C3691q1.m8826f(t, f) != 0) {
                        z = true;
                    }
                    return z;
                case 16:
                    if (C3691q1.m8827g(t, f) != 0) {
                        z = true;
                    }
                    return z;
                case 17:
                    if (C3691q1.m8828h(t, f) != null) {
                        z = true;
                    }
                    return z;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            int i3 = this.f9179a[i + 2];
            if ((C3691q1.m8826f(t, (long) (i3 & 1048575)) & (1 << (i3 >>> 20))) != 0) {
                z = true;
            }
            return z;
        }
    }

    /* renamed from: a */
    public final boolean mo9946a(T t, int i, int i2) {
        return C3691q1.m8826f(t, (long) (this.f9179a[i2 + 2] & 1048575)) == i;
    }

    /* renamed from: b */
    public final boolean mo9648b(T t) {
        int i;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            boolean z = true;
            if (i3 < this.f9189k) {
                int i5 = this.f9188j[i3];
                int i6 = this.f9179a[i5];
                int e = mo9959e(i5);
                if (!this.f9186h) {
                    int i7 = this.f9179a[i5 + 2];
                    int i8 = 1048575 & i7;
                    i = 1 << (i7 >>> 20);
                    if (i8 != i2) {
                        i4 = f9178s.getInt(t, (long) i8);
                        i2 = i8;
                    }
                } else {
                    i = 0;
                }
                if (((268435456 & e) != 0) && !mo9947a(t, i5, i4, i)) {
                    return false;
                }
                int g = m8923g(e);
                if (g != 9 && g != 17) {
                    if (g != 27) {
                        if (g == 60 || g == 68) {
                            if (mo9946a(t, i6, i5) && !mo9956c(i5).mo9648b(C3691q1.m8828h(t, m8921f(e)))) {
                                return false;
                            }
                        } else if (g != 49) {
                            if (g == 50 && !this.f9195q.mo9856e(C3691q1.m8828h(t, m8921f(e))).isEmpty()) {
                                this.f9195q.mo9855d(this.f9180b[(i5 / 3) * 2]);
                                throw null;
                            }
                        }
                    }
                    List list = (List) C3691q1.m8828h(t, m8921f(e));
                    if (!list.isEmpty()) {
                        C3625g1 c = mo9956c(i5);
                        int i9 = 0;
                        while (true) {
                            if (i9 >= list.size()) {
                                break;
                            } else if (!c.mo9648b(list.get(i9))) {
                                z = false;
                                break;
                            } else {
                                i9++;
                            }
                        }
                    }
                    if (!z) {
                        return false;
                    }
                } else if (mo9947a(t, i5, i4, i) && !mo9956c(i5).mo9648b(C3691q1.m8828h(t, m8921f(e)))) {
                    return false;
                }
                i3++;
            } else {
                if (this.f9184f) {
                    if (((C3709t) this.f9194p) == null) {
                        throw null;
                    } else if (!((C3734c) t).f9286e.mo9969b()) {
                        return false;
                    }
                }
                return true;
            }
        }
    }

    /* renamed from: a */
    public void mo9643a(T t) {
        int i;
        int i2 = this.f9189k;
        while (true) {
            i = this.f9190l;
            if (i2 >= i) {
                break;
            }
            long f = m8921f(mo9959e(this.f9188j[i2]));
            Object h = C3691q1.m8828h(t, f);
            if (h != null) {
                C3691q1.f9140f.mo9905a((Object) t, f, this.f9195q.mo9854c(h));
            }
            i2++;
        }
        int length = this.f9188j.length;
        while (i < length) {
            this.f9192n.mo9655a(t, (long) this.f9188j[i]);
            i++;
        }
        if (((C3683o1) this.f9193o) != null) {
            ((C3731z) t).unknownFields.f9122e = false;
            if (!this.f9184f) {
                return;
            }
            if (((C3709t) this.f9194p) != null) {
                ((C3734c) t).f9286e.mo9972d();
                return;
            }
            throw null;
        }
        throw null;
    }

    /* JADX INFO: used method not loaded: q.b.c.a.j0.a.i1.a(int, java.util.List, q.b.c.a.j0.a.b0$e, java.lang.Object, q.b.c.a.j0.a.m1):null, types can be incorrect */
    /* JADX INFO: used method not loaded: q.b.c.a.j0.a.q1.a(java.lang.Object, long, java.lang.Object):null, types can be incorrect */
    /* JADX INFO: used method not loaded: q.b.c.a.j0.a.q1.a(java.lang.Object, long, long):null, types can be incorrect */
    /* JADX INFO: used method not loaded: q.b.c.a.j0.a.q1.a(java.lang.Object, long, int):null, types can be incorrect */
    /* JADX INFO: used method not loaded: q.b.c.a.j0.a.i1.a(int, int, java.lang.Object, q.b.c.a.j0.a.m1):null, types can be incorrect */
    /* JADX INFO: used method not loaded: q.b.c.a.j0.a.m1.a(q.b.c.a.j0.a.f1):null, types can be incorrect */
    /* JADX INFO: used method not loaded: q.b.c.a.j0.a.m1.a(java.lang.Object):null, types can be incorrect */
    /* JADX INFO: used method not loaded: q.b.c.a.j0.a.m1.a(java.lang.Object, q.b.c.a.j0.a.f1):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x029d, code lost:
        r0.mo9565a(r1.mo9657b(r9, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02aa, code lost:
        r0.mo9604n(r1.mo9657b(r9, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02b7, code lost:
        r0.mo9578c(r1.mo9657b(r9, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02cb, code lost:
        r14 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8342a(r1, r2, mo9937a(r3), r14, (p213q.p217b.p301c.p302a.p311j0.p312a.C3677m1) r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02d9, code lost:
        r0.mo9585e(r1.mo9657b(r9, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x030c, code lost:
        r0.mo9588f(r1.mo9657b(r9, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0319, code lost:
        r0.mo9573b(r1.mo9657b(r9, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0326, code lost:
        r0.mo9605o(r1.mo9657b(r9, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0333, code lost:
        r0.mo9608p(r1.mo9657b(r9, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0340, code lost:
        r0.mo9592h(r1.mo9657b(r9, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x034d, code lost:
        r0.mo9602m(r1.mo9657b(r9, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x035a, code lost:
        r0.mo9596j(r1.mo9657b(r9, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0367, code lost:
        r0.mo9600l(r1.mo9657b(r9, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0398, code lost:
        p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8813a((java.lang.Object) r9, r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x03a5, code lost:
        p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8812a((java.lang.Object) r9, r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x03b2, code lost:
        p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8811a((java.lang.Object) r9, r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x03da, code lost:
        r14 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8340a(r1, r2, r14, (p213q.p217b.p301c.p302a.p311j0.p312a.C3677m1) r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0417, code lost:
        p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8813a((java.lang.Object) r9, m8921f(r4), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0483, code lost:
        mo9951b(r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:?, code lost:
        r12.mo9842a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x04a6, code lost:
        if (r14 == null) goto L_0x04a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x04a8, code lost:
        r14 = r12.mo9838a((java.lang.Object) r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x04b1, code lost:
        if (r12.mo9841a(r14, r0) == false) goto L_0x04b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x04b3, code lost:
        r0 = r8.f9189k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x04b7, code lost:
        if (r0 < r8.f9190l) goto L_0x04b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x04b9, code lost:
        mo9936a((java.lang.Object) r9, r8.f9188j[r0], (UB) r14, r12);
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x04c3, code lost:
        if (r14 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01ad, code lost:
        mo9952b(r9, r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0290, code lost:
        r0.mo9582d(r1.mo9657b(r9, r2));
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:172:0x04a3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9645a(T r17, p213q.p217b.p301c.p302a.p311j0.p312a.C3622f1 r18, p213q.p217b.p301c.p302a.p311j0.p312a.C3697r r19) {
        /*
            r16 = this;
            r8 = r16
            r9 = r17
            r0 = r18
            r10 = r19
            r11 = 0
            if (r10 == 0) goto L_0x04df
            q.b.c.a.j0.a.m1<?, ?> r12 = r8.f9193o
            q.b.c.a.j0.a.s<?> r13 = r8.f9194p
            r14 = r11
            r15 = r14
        L_0x0011:
            int r1 = r18.mo9595j()     // Catch:{ all -> 0x04c8 }
            int r3 = r8.mo9958d(r1)     // Catch:{ all -> 0x04c8 }
            if (r3 >= 0) goto L_0x007e
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r2) goto L_0x0037
            int r0 = r8.f9189k
        L_0x0022:
            int r1 = r8.f9190l
            if (r0 >= r1) goto L_0x0030
            int[] r1 = r8.f9188j
            r1 = r1[r0]
            r8.mo9936a(r9, r1, (UB) r14, r12)
            int r0 = r0 + 1
            goto L_0x0022
        L_0x0030:
            if (r14 == 0) goto L_0x04c7
        L_0x0032:
            r12.mo9840a(r9, r14)
            goto L_0x04c7
        L_0x0037:
            boolean r2 = r8.f9184f     // Catch:{ all -> 0x04c8 }
            if (r2 != 0) goto L_0x003d
            r3 = r11
            goto L_0x0044
        L_0x003d:
            q.b.c.a.j0.a.s0 r2 = r8.f9183e     // Catch:{ all -> 0x04c8 }
            java.lang.Object r1 = r13.mo9919a(r10, r2, r1)     // Catch:{ all -> 0x04c8 }
            r3 = r1
        L_0x0044:
            if (r3 == 0) goto L_0x005a
            if (r15 != 0) goto L_0x004d
            q.b.c.a.j0.a.v r1 = r13.mo9920a(r9)     // Catch:{ all -> 0x04c8 }
            r15 = r1
        L_0x004d:
            r1 = r13
            r2 = r18
            r4 = r19
            r5 = r15
            r6 = r14
            r7 = r12
            java.lang.Object r14 = r1.mo9918a(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x04c8 }
            goto L_0x0011
        L_0x005a:
            r12.mo9842a(r0)     // Catch:{ all -> 0x04c8 }
            if (r14 != 0) goto L_0x0064
            java.lang.Object r1 = r12.mo9838a(r9)     // Catch:{ all -> 0x04c8 }
            r14 = r1
        L_0x0064:
            boolean r1 = r12.mo9841a(r14, r0)     // Catch:{ all -> 0x04c8 }
            if (r1 == 0) goto L_0x006b
            goto L_0x0011
        L_0x006b:
            int r0 = r8.f9189k
        L_0x006d:
            int r1 = r8.f9190l
            if (r0 >= r1) goto L_0x007b
            int[] r1 = r8.f9188j
            r1 = r1[r0]
            r8.mo9936a(r9, r1, (UB) r14, r12)
            int r0 = r0 + 1
            goto L_0x006d
        L_0x007b:
            if (r14 == 0) goto L_0x04c7
            goto L_0x0032
        L_0x007e:
            int r4 = r8.mo9959e(r3)     // Catch:{ all -> 0x04c8 }
            int r2 = m8923g(r4)     // Catch:{ a -> 0x04a3 }
            switch(r2) {
                case 0: goto L_0x0478;
                case 1: goto L_0x046c;
                case 2: goto L_0x0462;
                case 3: goto L_0x0458;
                case 4: goto L_0x044e;
                case 5: goto L_0x0444;
                case 6: goto L_0x043a;
                case 7: goto L_0x042e;
                case 8: goto L_0x042a;
                case 9: goto L_0x03fb;
                case 10: goto L_0x03f2;
                case 11: goto L_0x03e9;
                case 12: goto L_0x03c9;
                case 13: goto L_0x03c0;
                case 14: goto L_0x03b7;
                case 15: goto L_0x03aa;
                case 16: goto L_0x039d;
                case 17: goto L_0x036c;
                case 18: goto L_0x035f;
                case 19: goto L_0x0352;
                case 20: goto L_0x0345;
                case 21: goto L_0x0338;
                case 22: goto L_0x032b;
                case 23: goto L_0x031e;
                case 24: goto L_0x0311;
                case 25: goto L_0x0304;
                case 26: goto L_0x02ff;
                case 27: goto L_0x02ed;
                case 28: goto L_0x02de;
                case 29: goto L_0x02d1;
                case 30: goto L_0x02bc;
                case 31: goto L_0x02af;
                case 32: goto L_0x02a2;
                case 33: goto L_0x0295;
                case 34: goto L_0x0288;
                case 35: goto L_0x027c;
                case 36: goto L_0x0270;
                case 37: goto L_0x0264;
                case 38: goto L_0x0258;
                case 39: goto L_0x024c;
                case 40: goto L_0x0240;
                case 41: goto L_0x0234;
                case 42: goto L_0x0228;
                case 43: goto L_0x021c;
                case 44: goto L_0x0209;
                case 45: goto L_0x01fd;
                case 46: goto L_0x01f1;
                case 47: goto L_0x01e5;
                case 48: goto L_0x01d9;
                case 49: goto L_0x01c3;
                case 50: goto L_0x01b2;
                case 51: goto L_0x019f;
                case 52: goto L_0x0191;
                case 53: goto L_0x0183;
                case 54: goto L_0x0175;
                case 55: goto L_0x0167;
                case 56: goto L_0x0159;
                case 57: goto L_0x014b;
                case 58: goto L_0x013d;
                case 59: goto L_0x0139;
                case 60: goto L_0x0105;
                case 61: goto L_0x00fc;
                case 62: goto L_0x00ef;
                case 63: goto L_0x00d6;
                case 64: goto L_0x00c9;
                case 65: goto L_0x00bc;
                case 66: goto L_0x00af;
                case 67: goto L_0x00a2;
                case 68: goto L_0x0091;
                default: goto L_0x0089;
            }     // Catch:{ a -> 0x04a3 }
        L_0x0089:
            if (r14 != 0) goto L_0x0489
            java.lang.Object r1 = r12.mo9837a()     // Catch:{ a -> 0x04a3 }
            goto L_0x0488
        L_0x0091:
            long r4 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
            q.b.c.a.j0.a.g1 r2 = r8.mo9956c(r3)     // Catch:{ a -> 0x04a3 }
            java.lang.Object r2 = r0.mo9562a(r2, r10)     // Catch:{ a -> 0x04a3 }
        L_0x009d:
            p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8813a(r9, r4, r2)     // Catch:{ a -> 0x04a3 }
            goto L_0x01ad
        L_0x00a2:
            long r4 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
            long r6 = r18.mo9586f()     // Catch:{ a -> 0x04a3 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ a -> 0x04a3 }
            goto L_0x009d
        L_0x00af:
            long r4 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
            int r2 = r18.mo9583e()     // Catch:{ a -> 0x04a3 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x04a3 }
            goto L_0x009d
        L_0x00bc:
            long r4 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
            long r6 = r18.mo9597k()     // Catch:{ a -> 0x04a3 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ a -> 0x04a3 }
            goto L_0x009d
        L_0x00c9:
            long r4 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
            int r2 = r18.mo9607p()     // Catch:{ a -> 0x04a3 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x04a3 }
            goto L_0x009d
        L_0x00d6:
            int r2 = r18.mo9560a()     // Catch:{ a -> 0x04a3 }
            q.b.c.a.j0.a.b0$e r5 = r8.mo9937a(r3)     // Catch:{ a -> 0x04a3 }
            if (r5 == 0) goto L_0x00e6
            boolean r5 = r5.isInRange(r2)     // Catch:{ a -> 0x04a3 }
            if (r5 == 0) goto L_0x03da
        L_0x00e6:
            long r4 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x04a3 }
            goto L_0x009d
        L_0x00ef:
            long r4 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
            int r2 = r18.mo9601m()     // Catch:{ a -> 0x04a3 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x04a3 }
            goto L_0x009d
        L_0x00fc:
            long r4 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
            q.b.c.a.j0.a.j r2 = r18.mo9599l()     // Catch:{ a -> 0x04a3 }
            goto L_0x009d
        L_0x0105:
            boolean r2 = r8.mo9946a((T) r9, r1, r3)     // Catch:{ a -> 0x04a3 }
            if (r2 == 0) goto L_0x0125
            long r5 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
            java.lang.Object r2 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r9, r5)     // Catch:{ a -> 0x04a3 }
            q.b.c.a.j0.a.g1 r5 = r8.mo9956c(r3)     // Catch:{ a -> 0x04a3 }
            java.lang.Object r5 = r0.mo9571b(r5, r10)     // Catch:{ a -> 0x04a3 }
            java.lang.Object r2 = p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.m8165a(r2, r5)     // Catch:{ a -> 0x04a3 }
            long r4 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
            goto L_0x009d
        L_0x0125:
            long r4 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
            q.b.c.a.j0.a.g1 r2 = r8.mo9956c(r3)     // Catch:{ a -> 0x04a3 }
            java.lang.Object r2 = r0.mo9571b(r2, r10)     // Catch:{ a -> 0x04a3 }
            p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8813a(r9, r4, r2)     // Catch:{ a -> 0x04a3 }
            r8.mo9951b((T) r9, r3)     // Catch:{ a -> 0x04a3 }
            goto L_0x01ad
        L_0x0139:
            r8.mo9940a(r9, r4, r0)     // Catch:{ a -> 0x04a3 }
            goto L_0x01ad
        L_0x013d:
            long r4 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
            boolean r2 = r18.mo9594i()     // Catch:{ a -> 0x04a3 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ a -> 0x04a3 }
            goto L_0x009d
        L_0x014b:
            long r4 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
            int r2 = r18.mo9591h()     // Catch:{ a -> 0x04a3 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x04a3 }
            goto L_0x009d
        L_0x0159:
            long r4 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
            long r6 = r18.mo9579d()     // Catch:{ a -> 0x04a3 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ a -> 0x04a3 }
            goto L_0x009d
        L_0x0167:
            long r4 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
            int r2 = r18.mo9603n()     // Catch:{ a -> 0x04a3 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x04a3 }
            goto L_0x009d
        L_0x0175:
            long r4 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
            long r6 = r18.mo9575c()     // Catch:{ a -> 0x04a3 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ a -> 0x04a3 }
            goto L_0x009d
        L_0x0183:
            long r4 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
            long r6 = r18.mo9609q()     // Catch:{ a -> 0x04a3 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ a -> 0x04a3 }
            goto L_0x009d
        L_0x0191:
            long r4 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
            float r2 = r18.readFloat()     // Catch:{ a -> 0x04a3 }
            java.lang.Float r2 = java.lang.Float.valueOf(r2)     // Catch:{ a -> 0x04a3 }
            goto L_0x009d
        L_0x019f:
            long r4 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
            double r6 = r18.readDouble()     // Catch:{ a -> 0x04a3 }
            java.lang.Double r2 = java.lang.Double.valueOf(r6)     // Catch:{ a -> 0x04a3 }
            goto L_0x009d
        L_0x01ad:
            r8.mo9952b((T) r9, r1, r3)     // Catch:{ a -> 0x04a3 }
            goto L_0x0011
        L_0x01b2:
            java.lang.Object r4 = r8.mo9950b(r3)     // Catch:{ a -> 0x04a3 }
            r1 = r16
            r2 = r17
            r5 = r19
            r6 = r18
            r1.mo9939a(r2, r3, r4, r5, r6)     // Catch:{ a -> 0x04a3 }
            goto L_0x0011
        L_0x01c3:
            long r4 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
            q.b.c.a.j0.a.g1 r6 = r8.mo9956c(r3)     // Catch:{ a -> 0x04a3 }
            r1 = r16
            r2 = r17
            r3 = r4
            r5 = r18
            r7 = r19
            r1.mo9942a(r2, r3, r5, r6, r7)     // Catch:{ a -> 0x04a3 }
            goto L_0x0011
        L_0x01d9:
            q.b.c.a.j0.a.i0 r1 = r8.f9192n     // Catch:{ a -> 0x04a3 }
            long r2 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
        L_0x01df:
            java.util.List r1 = r1.mo9657b(r9, r2)     // Catch:{ a -> 0x04a3 }
            goto L_0x0290
        L_0x01e5:
            q.b.c.a.j0.a.i0 r1 = r8.f9192n     // Catch:{ a -> 0x04a3 }
            long r2 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
        L_0x01eb:
            java.util.List r1 = r1.mo9657b(r9, r2)     // Catch:{ a -> 0x04a3 }
            goto L_0x029d
        L_0x01f1:
            q.b.c.a.j0.a.i0 r1 = r8.f9192n     // Catch:{ a -> 0x04a3 }
            long r2 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
        L_0x01f7:
            java.util.List r1 = r1.mo9657b(r9, r2)     // Catch:{ a -> 0x04a3 }
            goto L_0x02aa
        L_0x01fd:
            q.b.c.a.j0.a.i0 r1 = r8.f9192n     // Catch:{ a -> 0x04a3 }
            long r2 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
        L_0x0203:
            java.util.List r1 = r1.mo9657b(r9, r2)     // Catch:{ a -> 0x04a3 }
            goto L_0x02b7
        L_0x0209:
            q.b.c.a.j0.a.i0 r2 = r8.f9192n     // Catch:{ a -> 0x04a3 }
            long r4 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
            java.util.List r2 = r2.mo9657b(r9, r4)     // Catch:{ a -> 0x04a3 }
            r0.mo9610q(r2)     // Catch:{ a -> 0x04a3 }
        L_0x0216:
            q.b.c.a.j0.a.b0$e r3 = r8.mo9937a(r3)     // Catch:{ a -> 0x04a3 }
            goto L_0x02cb
        L_0x021c:
            q.b.c.a.j0.a.i0 r1 = r8.f9192n     // Catch:{ a -> 0x04a3 }
            long r2 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
        L_0x0222:
            java.util.List r1 = r1.mo9657b(r9, r2)     // Catch:{ a -> 0x04a3 }
            goto L_0x02d9
        L_0x0228:
            q.b.c.a.j0.a.i0 r1 = r8.f9192n     // Catch:{ a -> 0x04a3 }
            long r2 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
        L_0x022e:
            java.util.List r1 = r1.mo9657b(r9, r2)     // Catch:{ a -> 0x04a3 }
            goto L_0x030c
        L_0x0234:
            q.b.c.a.j0.a.i0 r1 = r8.f9192n     // Catch:{ a -> 0x04a3 }
            long r2 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
        L_0x023a:
            java.util.List r1 = r1.mo9657b(r9, r2)     // Catch:{ a -> 0x04a3 }
            goto L_0x0319
        L_0x0240:
            q.b.c.a.j0.a.i0 r1 = r8.f9192n     // Catch:{ a -> 0x04a3 }
            long r2 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
        L_0x0246:
            java.util.List r1 = r1.mo9657b(r9, r2)     // Catch:{ a -> 0x04a3 }
            goto L_0x0326
        L_0x024c:
            q.b.c.a.j0.a.i0 r1 = r8.f9192n     // Catch:{ a -> 0x04a3 }
            long r2 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
        L_0x0252:
            java.util.List r1 = r1.mo9657b(r9, r2)     // Catch:{ a -> 0x04a3 }
            goto L_0x0333
        L_0x0258:
            q.b.c.a.j0.a.i0 r1 = r8.f9192n     // Catch:{ a -> 0x04a3 }
            long r2 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
        L_0x025e:
            java.util.List r1 = r1.mo9657b(r9, r2)     // Catch:{ a -> 0x04a3 }
            goto L_0x0340
        L_0x0264:
            q.b.c.a.j0.a.i0 r1 = r8.f9192n     // Catch:{ a -> 0x04a3 }
            long r2 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
        L_0x026a:
            java.util.List r1 = r1.mo9657b(r9, r2)     // Catch:{ a -> 0x04a3 }
            goto L_0x034d
        L_0x0270:
            q.b.c.a.j0.a.i0 r1 = r8.f9192n     // Catch:{ a -> 0x04a3 }
            long r2 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
        L_0x0276:
            java.util.List r1 = r1.mo9657b(r9, r2)     // Catch:{ a -> 0x04a3 }
            goto L_0x035a
        L_0x027c:
            q.b.c.a.j0.a.i0 r1 = r8.f9192n     // Catch:{ a -> 0x04a3 }
            long r2 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
        L_0x0282:
            java.util.List r1 = r1.mo9657b(r9, r2)     // Catch:{ a -> 0x04a3 }
            goto L_0x0367
        L_0x0288:
            q.b.c.a.j0.a.i0 r1 = r8.f9192n     // Catch:{ a -> 0x04a3 }
            long r2 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
            goto L_0x01df
        L_0x0290:
            r0.mo9582d(r1)     // Catch:{ a -> 0x04a3 }
            goto L_0x0011
        L_0x0295:
            q.b.c.a.j0.a.i0 r1 = r8.f9192n     // Catch:{ a -> 0x04a3 }
            long r2 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
            goto L_0x01eb
        L_0x029d:
            r0.mo9565a(r1)     // Catch:{ a -> 0x04a3 }
            goto L_0x0011
        L_0x02a2:
            q.b.c.a.j0.a.i0 r1 = r8.f9192n     // Catch:{ a -> 0x04a3 }
            long r2 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
            goto L_0x01f7
        L_0x02aa:
            r0.mo9604n(r1)     // Catch:{ a -> 0x04a3 }
            goto L_0x0011
        L_0x02af:
            q.b.c.a.j0.a.i0 r1 = r8.f9192n     // Catch:{ a -> 0x04a3 }
            long r2 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
            goto L_0x0203
        L_0x02b7:
            r0.mo9578c(r1)     // Catch:{ a -> 0x04a3 }
            goto L_0x0011
        L_0x02bc:
            q.b.c.a.j0.a.i0 r2 = r8.f9192n     // Catch:{ a -> 0x04a3 }
            long r4 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
            java.util.List r2 = r2.mo9657b(r9, r4)     // Catch:{ a -> 0x04a3 }
            r0.mo9610q(r2)     // Catch:{ a -> 0x04a3 }
            goto L_0x0216
        L_0x02cb:
            java.lang.Object r14 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8342a(r1, r2, r3, r14, r12)     // Catch:{ a -> 0x04a3 }
            goto L_0x0011
        L_0x02d1:
            q.b.c.a.j0.a.i0 r1 = r8.f9192n     // Catch:{ a -> 0x04a3 }
            long r2 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
            goto L_0x0222
        L_0x02d9:
            r0.mo9585e(r1)     // Catch:{ a -> 0x04a3 }
            goto L_0x0011
        L_0x02de:
            q.b.c.a.j0.a.i0 r1 = r8.f9192n     // Catch:{ a -> 0x04a3 }
            long r2 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
            java.util.List r1 = r1.mo9657b(r9, r2)     // Catch:{ a -> 0x04a3 }
            r0.mo9598k(r1)     // Catch:{ a -> 0x04a3 }
            goto L_0x0011
        L_0x02ed:
            q.b.c.a.j0.a.g1 r5 = r8.mo9956c(r3)     // Catch:{ a -> 0x04a3 }
            r1 = r16
            r2 = r17
            r3 = r4
            r4 = r18
            r6 = r19
            r1.mo9941a(r2, r3, r4, r5, r6)     // Catch:{ a -> 0x04a3 }
            goto L_0x0011
        L_0x02ff:
            r8.mo9953b(r9, r4, r0)     // Catch:{ a -> 0x04a3 }
            goto L_0x0011
        L_0x0304:
            q.b.c.a.j0.a.i0 r1 = r8.f9192n     // Catch:{ a -> 0x04a3 }
            long r2 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
            goto L_0x022e
        L_0x030c:
            r0.mo9588f(r1)     // Catch:{ a -> 0x04a3 }
            goto L_0x0011
        L_0x0311:
            q.b.c.a.j0.a.i0 r1 = r8.f9192n     // Catch:{ a -> 0x04a3 }
            long r2 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
            goto L_0x023a
        L_0x0319:
            r0.mo9573b(r1)     // Catch:{ a -> 0x04a3 }
            goto L_0x0011
        L_0x031e:
            q.b.c.a.j0.a.i0 r1 = r8.f9192n     // Catch:{ a -> 0x04a3 }
            long r2 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
            goto L_0x0246
        L_0x0326:
            r0.mo9605o(r1)     // Catch:{ a -> 0x04a3 }
            goto L_0x0011
        L_0x032b:
            q.b.c.a.j0.a.i0 r1 = r8.f9192n     // Catch:{ a -> 0x04a3 }
            long r2 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
            goto L_0x0252
        L_0x0333:
            r0.mo9608p(r1)     // Catch:{ a -> 0x04a3 }
            goto L_0x0011
        L_0x0338:
            q.b.c.a.j0.a.i0 r1 = r8.f9192n     // Catch:{ a -> 0x04a3 }
            long r2 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
            goto L_0x025e
        L_0x0340:
            r0.mo9592h(r1)     // Catch:{ a -> 0x04a3 }
            goto L_0x0011
        L_0x0345:
            q.b.c.a.j0.a.i0 r1 = r8.f9192n     // Catch:{ a -> 0x04a3 }
            long r2 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
            goto L_0x026a
        L_0x034d:
            r0.mo9602m(r1)     // Catch:{ a -> 0x04a3 }
            goto L_0x0011
        L_0x0352:
            q.b.c.a.j0.a.i0 r1 = r8.f9192n     // Catch:{ a -> 0x04a3 }
            long r2 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
            goto L_0x0276
        L_0x035a:
            r0.mo9596j(r1)     // Catch:{ a -> 0x04a3 }
            goto L_0x0011
        L_0x035f:
            q.b.c.a.j0.a.i0 r1 = r8.f9192n     // Catch:{ a -> 0x04a3 }
            long r2 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
            goto L_0x0282
        L_0x0367:
            r0.mo9600l(r1)     // Catch:{ a -> 0x04a3 }
            goto L_0x0011
        L_0x036c:
            boolean r1 = r8.mo9945a((T) r9, r3)     // Catch:{ a -> 0x04a3 }
            if (r1 == 0) goto L_0x038c
            long r1 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
            java.lang.Object r1 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r9, r1)     // Catch:{ a -> 0x04a3 }
            q.b.c.a.j0.a.g1 r2 = r8.mo9956c(r3)     // Catch:{ a -> 0x04a3 }
            java.lang.Object r2 = r0.mo9562a(r2, r10)     // Catch:{ a -> 0x04a3 }
            java.lang.Object r1 = p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.m8165a(r1, r2)     // Catch:{ a -> 0x04a3 }
        L_0x0386:
            long r2 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
            goto L_0x0417
        L_0x038c:
            long r1 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
            q.b.c.a.j0.a.g1 r4 = r8.mo9956c(r3)     // Catch:{ a -> 0x04a3 }
            java.lang.Object r4 = r0.mo9562a(r4, r10)     // Catch:{ a -> 0x04a3 }
        L_0x0398:
            p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8813a(r9, r1, r4)     // Catch:{ a -> 0x04a3 }
            goto L_0x0483
        L_0x039d:
            long r1 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
            long r4 = r18.mo9586f()     // Catch:{ a -> 0x04a3 }
        L_0x03a5:
            p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8812a(r9, r1, r4)     // Catch:{ a -> 0x04a3 }
            goto L_0x0483
        L_0x03aa:
            long r1 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
            int r4 = r18.mo9583e()     // Catch:{ a -> 0x04a3 }
        L_0x03b2:
            p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8811a(r9, r1, r4)     // Catch:{ a -> 0x04a3 }
            goto L_0x0483
        L_0x03b7:
            long r1 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
            long r4 = r18.mo9597k()     // Catch:{ a -> 0x04a3 }
            goto L_0x03a5
        L_0x03c0:
            long r1 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
            int r4 = r18.mo9607p()     // Catch:{ a -> 0x04a3 }
            goto L_0x03b2
        L_0x03c9:
            int r2 = r18.mo9560a()     // Catch:{ a -> 0x04a3 }
            q.b.c.a.j0.a.b0$e r5 = r8.mo9937a(r3)     // Catch:{ a -> 0x04a3 }
            if (r5 == 0) goto L_0x03e0
            boolean r5 = r5.isInRange(r2)     // Catch:{ a -> 0x04a3 }
            if (r5 == 0) goto L_0x03da
            goto L_0x03e0
        L_0x03da:
            java.lang.Object r14 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8340a(r1, r2, r14, r12)     // Catch:{ a -> 0x04a3 }
            goto L_0x0011
        L_0x03e0:
            long r4 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
            p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8811a(r9, r4, r2)     // Catch:{ a -> 0x04a3 }
            goto L_0x0483
        L_0x03e9:
            long r1 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
            int r4 = r18.mo9601m()     // Catch:{ a -> 0x04a3 }
            goto L_0x03b2
        L_0x03f2:
            long r1 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
            q.b.c.a.j0.a.j r4 = r18.mo9599l()     // Catch:{ a -> 0x04a3 }
            goto L_0x0398
        L_0x03fb:
            boolean r1 = r8.mo9945a((T) r9, r3)     // Catch:{ a -> 0x04a3 }
            if (r1 == 0) goto L_0x041c
            long r1 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
            java.lang.Object r1 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r9, r1)     // Catch:{ a -> 0x04a3 }
            q.b.c.a.j0.a.g1 r2 = r8.mo9956c(r3)     // Catch:{ a -> 0x04a3 }
            java.lang.Object r2 = r0.mo9571b(r2, r10)     // Catch:{ a -> 0x04a3 }
            java.lang.Object r1 = p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.m8165a(r1, r2)     // Catch:{ a -> 0x04a3 }
            goto L_0x0386
        L_0x0417:
            p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8813a(r9, r2, r1)     // Catch:{ a -> 0x04a3 }
            goto L_0x0011
        L_0x041c:
            long r1 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
            q.b.c.a.j0.a.g1 r4 = r8.mo9956c(r3)     // Catch:{ a -> 0x04a3 }
            java.lang.Object r4 = r0.mo9571b(r4, r10)     // Catch:{ a -> 0x04a3 }
            goto L_0x0398
        L_0x042a:
            r8.mo9940a(r9, r4, r0)     // Catch:{ a -> 0x04a3 }
            goto L_0x0483
        L_0x042e:
            long r1 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
            boolean r4 = r18.mo9594i()     // Catch:{ a -> 0x04a3 }
            p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8814a(r9, r1, r4)     // Catch:{ a -> 0x04a3 }
            goto L_0x0483
        L_0x043a:
            long r1 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
            int r4 = r18.mo9591h()     // Catch:{ a -> 0x04a3 }
            goto L_0x03b2
        L_0x0444:
            long r1 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
            long r4 = r18.mo9579d()     // Catch:{ a -> 0x04a3 }
            goto L_0x03a5
        L_0x044e:
            long r1 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
            int r4 = r18.mo9603n()     // Catch:{ a -> 0x04a3 }
            goto L_0x03b2
        L_0x0458:
            long r1 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
            long r4 = r18.mo9575c()     // Catch:{ a -> 0x04a3 }
            goto L_0x03a5
        L_0x0462:
            long r1 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
            long r4 = r18.mo9609q()     // Catch:{ a -> 0x04a3 }
            goto L_0x03a5
        L_0x046c:
            long r1 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
            float r4 = r18.readFloat()     // Catch:{ a -> 0x04a3 }
            p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8810a(r9, r1, r4)     // Catch:{ a -> 0x04a3 }
            goto L_0x0483
        L_0x0478:
            long r1 = m8921f(r4)     // Catch:{ a -> 0x04a3 }
            double r4 = r18.readDouble()     // Catch:{ a -> 0x04a3 }
            p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8809a(r9, r1, r4)     // Catch:{ a -> 0x04a3 }
        L_0x0483:
            r8.mo9951b((T) r9, r3)     // Catch:{ a -> 0x04a3 }
            goto L_0x0011
        L_0x0488:
            r14 = r1
        L_0x0489:
            boolean r1 = r12.mo9841a(r14, r0)     // Catch:{ a -> 0x04a3 }
            if (r1 != 0) goto L_0x0011
            int r0 = r8.f9189k
        L_0x0491:
            int r1 = r8.f9190l
            if (r0 >= r1) goto L_0x049f
            int[] r1 = r8.f9188j
            r1 = r1[r0]
            r8.mo9936a(r9, r1, (UB) r14, r12)
            int r0 = r0 + 1
            goto L_0x0491
        L_0x049f:
            if (r14 == 0) goto L_0x04c7
            goto L_0x0032
        L_0x04a3:
            r12.mo9842a(r0)     // Catch:{ all -> 0x04c8 }
            if (r14 != 0) goto L_0x04ad
            java.lang.Object r1 = r12.mo9838a(r9)     // Catch:{ all -> 0x04c8 }
            r14 = r1
        L_0x04ad:
            boolean r1 = r12.mo9841a(r14, r0)     // Catch:{ all -> 0x04c8 }
            if (r1 != 0) goto L_0x0011
            int r0 = r8.f9189k
        L_0x04b5:
            int r1 = r8.f9190l
            if (r0 >= r1) goto L_0x04c3
            int[] r1 = r8.f9188j
            r1 = r1[r0]
            r8.mo9936a(r9, r1, (UB) r14, r12)
            int r0 = r0 + 1
            goto L_0x04b5
        L_0x04c3:
            if (r14 == 0) goto L_0x04c7
            goto L_0x0032
        L_0x04c7:
            return
        L_0x04c8:
            r0 = move-exception
            int r1 = r8.f9189k
        L_0x04cb:
            int r2 = r8.f9190l
            if (r1 >= r2) goto L_0x04d9
            int[] r2 = r8.f9188j
            r2 = r2[r1]
            r8.mo9936a(r9, r2, (UB) r14, r12)
            int r1 = r1 + 1
            goto L_0x04cb
        L_0x04d9:
            if (r14 == 0) goto L_0x04de
            r12.mo9840a(r9, r14)
        L_0x04de:
            throw r0
        L_0x04df:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p301c.p302a.p311j0.p312a.C3717u0.mo9645a(java.lang.Object, q.b.c.a.j0.a.f1, q.b.c.a.j0.a.r):void");
    }

    /* JADX INFO: used method not loaded: q.b.c.a.j0.a.q1.e.a(java.lang.Object, long, java.lang.Object):null, types can be incorrect */
    /* JADX INFO: used method not loaded: q.b.c.a.j0.a.q1.e.a(java.lang.Object, long, int):null, types can be incorrect */
    /* JADX INFO: used method not loaded: q.b.c.a.j0.a.q1.a(java.lang.Object, long, long):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
        p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.f9140f.mo9905a((java.lang.Object) r7, r2, p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r8, r2));
        mo9952b(r7, r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0089, code lost:
        p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.f9140f.mo9905a((java.lang.Object) r7, r2, p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b7, code lost:
        p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.f9140f.mo9903a((java.lang.Object) r7, r2, p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8826f(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ce, code lost:
        p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8812a((java.lang.Object) r7, r2, p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8827g(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f3, code lost:
        mo9951b(r7, r0);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9644a(T r7, T r8) {
        /*
            r6 = this;
            if (r8 == 0) goto L_0x0109
            r0 = 0
        L_0x0003:
            int[] r1 = r6.f9179a
            int r2 = r1.length
            if (r0 >= r2) goto L_0x00fa
            int r2 = r0 + 1
            r1 = r1[r2]
            long r2 = m8921f(r1)
            int[] r4 = r6.f9179a
            r4 = r4[r0]
            int r1 = m8923g(r1)
            switch(r1) {
                case 0: goto L_0x00e6;
                case 1: goto L_0x00d6;
                case 2: goto L_0x00c8;
                case 3: goto L_0x00c1;
                case 4: goto L_0x00b1;
                case 5: goto L_0x00aa;
                case 6: goto L_0x00a3;
                case 7: goto L_0x0093;
                case 8: goto L_0x0083;
                case 9: goto L_0x007e;
                case 10: goto L_0x0077;
                case 11: goto L_0x0070;
                case 12: goto L_0x0069;
                case 13: goto L_0x0062;
                case 14: goto L_0x005a;
                case 15: goto L_0x0053;
                case 16: goto L_0x004b;
                case 17: goto L_0x007e;
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
                case 51: goto L_0x0029;
                case 52: goto L_0x0029;
                case 53: goto L_0x0029;
                case 54: goto L_0x0029;
                case 55: goto L_0x0029;
                case 56: goto L_0x0029;
                case 57: goto L_0x0029;
                case 58: goto L_0x0029;
                case 59: goto L_0x0029;
                case 60: goto L_0x0024;
                case 61: goto L_0x001d;
                case 62: goto L_0x001d;
                case 63: goto L_0x001d;
                case 64: goto L_0x001d;
                case 65: goto L_0x001d;
                case 66: goto L_0x001d;
                case 67: goto L_0x001d;
                case 68: goto L_0x0024;
                default: goto L_0x001b;
            }
        L_0x001b:
            goto L_0x00f6
        L_0x001d:
            boolean r1 = r6.mo9946a((T) r8, r4, r0)
            if (r1 == 0) goto L_0x00f6
            goto L_0x002f
        L_0x0024:
            r6.mo9957c(r7, r8, r0)
            goto L_0x00f6
        L_0x0029:
            boolean r1 = r6.mo9946a((T) r8, r4, r0)
            if (r1 == 0) goto L_0x00f6
        L_0x002f:
            java.lang.Object r1 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r8, r2)
            q.b.c.a.j0.a.q1$e r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.f9140f
            r5.mo9905a(r7, r2, r1)
            r6.mo9952b((T) r7, r4, r0)
            goto L_0x00f6
        L_0x003d:
            q.b.c.a.j0.a.n0 r1 = r6.f9195q
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8349a(r1, r7, r8, r2)
            goto L_0x00f6
        L_0x0044:
            q.b.c.a.j0.a.i0 r1 = r6.f9192n
            r1.mo9656a(r7, r8, r2)
            goto L_0x00f6
        L_0x004b:
            boolean r1 = r6.mo9945a((T) r8, r0)
            if (r1 == 0) goto L_0x00f6
            goto L_0x00ce
        L_0x0053:
            boolean r1 = r6.mo9945a((T) r8, r0)
            if (r1 == 0) goto L_0x00f6
            goto L_0x00b7
        L_0x005a:
            boolean r1 = r6.mo9945a((T) r8, r0)
            if (r1 == 0) goto L_0x00f6
            goto L_0x00ce
        L_0x0062:
            boolean r1 = r6.mo9945a((T) r8, r0)
            if (r1 == 0) goto L_0x00f6
            goto L_0x00b7
        L_0x0069:
            boolean r1 = r6.mo9945a((T) r8, r0)
            if (r1 == 0) goto L_0x00f6
            goto L_0x00b7
        L_0x0070:
            boolean r1 = r6.mo9945a((T) r8, r0)
            if (r1 == 0) goto L_0x00f6
            goto L_0x00b7
        L_0x0077:
            boolean r1 = r6.mo9945a((T) r8, r0)
            if (r1 == 0) goto L_0x00f6
            goto L_0x0089
        L_0x007e:
            r6.mo9954b((T) r7, (T) r8, r0)
            goto L_0x00f6
        L_0x0083:
            boolean r1 = r6.mo9945a((T) r8, r0)
            if (r1 == 0) goto L_0x00f6
        L_0x0089:
            java.lang.Object r1 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r8, r2)
            q.b.c.a.j0.a.q1$e r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.f9140f
            r4.mo9905a(r7, r2, r1)
            goto L_0x00f3
        L_0x0093:
            boolean r1 = r6.mo9945a((T) r8, r0)
            if (r1 == 0) goto L_0x00f6
            boolean r1 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8816a(r8, r2)
            q.b.c.a.j0.a.q1$e r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.f9140f
            r4.mo9896a(r7, r2, r1)
            goto L_0x00f3
        L_0x00a3:
            boolean r1 = r6.mo9945a((T) r8, r0)
            if (r1 == 0) goto L_0x00f6
            goto L_0x00b7
        L_0x00aa:
            boolean r1 = r6.mo9945a((T) r8, r0)
            if (r1 == 0) goto L_0x00f6
            goto L_0x00ce
        L_0x00b1:
            boolean r1 = r6.mo9945a((T) r8, r0)
            if (r1 == 0) goto L_0x00f6
        L_0x00b7:
            int r1 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8826f(r8, r2)
            q.b.c.a.j0.a.q1$e r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.f9140f
            r4.mo9903a(r7, r2, r1)
            goto L_0x00f3
        L_0x00c1:
            boolean r1 = r6.mo9945a((T) r8, r0)
            if (r1 == 0) goto L_0x00f6
            goto L_0x00ce
        L_0x00c8:
            boolean r1 = r6.mo9945a((T) r8, r0)
            if (r1 == 0) goto L_0x00f6
        L_0x00ce:
            long r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8827g(r8, r2)
            p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8812a(r7, r2, r4)
            goto L_0x00f3
        L_0x00d6:
            boolean r1 = r6.mo9945a((T) r8, r0)
            if (r1 == 0) goto L_0x00f6
            float r1 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8825e(r8, r2)
            q.b.c.a.j0.a.q1$e r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.f9140f
            r4.mo9895a(r7, r2, r1)
            goto L_0x00f3
        L_0x00e6:
            boolean r1 = r6.mo9945a((T) r8, r0)
            if (r1 == 0) goto L_0x00f6
            double r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8823d(r8, r2)
            p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8809a(r7, r2, r4)
        L_0x00f3:
            r6.mo9951b((T) r7, r0)
        L_0x00f6:
            int r0 = r0 + 3
            goto L_0x0003
        L_0x00fa:
            q.b.c.a.j0.a.m1<?, ?> r0 = r6.f9193o
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8348a(r0, r7, r8)
            boolean r0 = r6.f9184f
            if (r0 == 0) goto L_0x0108
            q.b.c.a.j0.a.s<?> r0 = r6.f9194p
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8350a(r0, r7, r8)
        L_0x0108:
            return
        L_0x0109:
            r7 = 0
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p301c.p302a.p311j0.p312a.C3717u0.mo9644a(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0022, code lost:
        if (r5 != null) goto L_0x0024;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9954b(T r4, T r5, int r6) {
        /*
            r3 = this;
            int[] r0 = r3.f9179a
            int r1 = r6 + 1
            r0 = r0[r1]
            long r0 = m8921f(r0)
            boolean r2 = r3.mo9945a((T) r5, r6)
            if (r2 != 0) goto L_0x0011
            return
        L_0x0011:
            java.lang.Object r2 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r4, r0)
            java.lang.Object r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r5, r0)
            if (r2 == 0) goto L_0x0022
            if (r5 == 0) goto L_0x0022
            java.lang.Object r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.m8165a(r2, r5)
            goto L_0x0024
        L_0x0022:
            if (r5 == 0) goto L_0x002c
        L_0x0024:
            q.b.c.a.j0.a.q1$e r2 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.f9140f
            r2.mo9905a(r4, r0, r5)
            r3.mo9951b((T) r4, r6)
        L_0x002c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p301c.p302a.p311j0.p312a.C3717u0.mo9954b(java.lang.Object, java.lang.Object, int):void");
    }

    /* JADX WARNING: type inference failed for: r31v0, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r12v0 */
    /* JADX WARNING: type inference failed for: r12v1, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r0v3, types: [int, byte] */
    /* JADX WARNING: type inference failed for: r17v0, types: [int] */
    /* JADX WARNING: type inference failed for: r12v2 */
    /* JADX WARNING: type inference failed for: r12v3 */
    /* JADX WARNING: type inference failed for: r0v6, types: [int] */
    /* JADX WARNING: type inference failed for: r1v5, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r2v8, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r5v2, types: [int] */
    /* JADX WARNING: type inference failed for: r2v9, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r2v10, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r5v4, types: [int] */
    /* JADX WARNING: type inference failed for: r1v12, types: [int] */
    /* JADX WARNING: type inference failed for: r2v11, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r17v1 */
    /* JADX WARNING: type inference failed for: r3v19, types: [int] */
    /* JADX WARNING: type inference failed for: r17v2 */
    /* JADX WARNING: type inference failed for: r12v6 */
    /* JADX WARNING: type inference failed for: r12v7 */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0096, code lost:
        r10 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b0, code lost:
        r3 = r11.f9001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00cb, code lost:
        r9.putObject(r14, r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f3, code lost:
        r19 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0109, code lost:
        if (r6 == 0) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x010b, code lost:
        r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5322d((byte[]) r12, r8, r11);
        r1 = r11.f8999a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0111, code lost:
        r9.putInt(r14, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x011f, code lost:
        r6 = r0;
        r9.putLong(r30, r2, r4);
        r0 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0144, code lost:
        r0 = r8 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0146, code lost:
        r19 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0149, code lost:
        r19 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01c7, code lost:
        if (r0 != r15) goto L_0x0223;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x020f, code lost:
        if (r0 != r15) goto L_0x0223;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r0v3, types: [int, byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte[], code=null, for r31v0, types: [byte[]] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r12v2
      assigns: []
      uses: []
      mth insns count: 248
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
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARNING: Unknown variable types count: 15 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo9949b(T r30, byte[] r31, int r32, int r33, p213q.p217b.p301c.p302a.p311j0.p312a.C3612e r34) {
        /*
            r29 = this;
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            sun.misc.Unsafe r9 = f9178s
            r10 = -1
            r16 = 0
            r0 = r32
            r1 = r10
            r2 = r16
        L_0x0014:
            if (r0 >= r13) goto L_0x0237
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0026
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5153a(r0, r12, r3, r11)
            int r3 = r11.f8999a
            r8 = r0
            r17 = r3
            goto L_0x0029
        L_0x0026:
            r17 = r0
            r8 = r3
        L_0x0029:
            int r7 = r17 >>> 3
            r6 = r17 & 7
            if (r7 <= r1) goto L_0x0040
            int r2 = r2 / 3
            int r0 = r15.f9181c
            if (r7 < r0) goto L_0x003e
            int r0 = r15.f9182d
            if (r7 > r0) goto L_0x003e
            int r0 = r15.mo9931a(r7, r2)
            goto L_0x0044
        L_0x003e:
            r4 = r10
            goto L_0x0045
        L_0x0040:
            int r0 = r15.mo9958d(r7)
        L_0x0044:
            r4 = r0
        L_0x0045:
            if (r4 != r10) goto L_0x0052
            r24 = r7
            r2 = r8
            r18 = r9
            r26 = r10
            r19 = r16
            goto L_0x0213
        L_0x0052:
            int[] r0 = r15.f9179a
            int r1 = r4 + 1
            r5 = r0[r1]
            int r3 = m8923g(r5)
            long r1 = m8921f(r5)
            r0 = 17
            r10 = 2
            if (r3 > r0) goto L_0x014c
            r0 = 1
            switch(r3) {
                case 0: goto L_0x0139;
                case 1: goto L_0x0128;
                case 2: goto L_0x0115;
                case 3: goto L_0x0115;
                case 4: goto L_0x0107;
                case 5: goto L_0x00f7;
                case 6: goto L_0x00e7;
                case 7: goto L_0x00cf;
                case 8: goto L_0x00ba;
                case 9: goto L_0x00a0;
                case 10: goto L_0x0099;
                case 11: goto L_0x0107;
                case 12: goto L_0x0090;
                case 13: goto L_0x00e7;
                case 14: goto L_0x00f7;
                case 15: goto L_0x007c;
                case 16: goto L_0x006b;
                default: goto L_0x0069;
            }
        L_0x0069:
            goto L_0x018a
        L_0x006b:
            if (r6 != 0) goto L_0x018a
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5329e(r12, r8, r11)
            long r5 = r11.f9000b
            long r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3656k.m8444a(r5)
            r2 = r1
            r10 = r4
            r4 = r5
            goto L_0x011f
        L_0x007c:
            if (r6 != 0) goto L_0x0096
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5322d(r12, r8, r11)
            int r3 = r11.f8999a
            int r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3656k.m8448e(r3)
            r10 = r4
            r27 = r1
            r1 = r3
            r2 = r27
            goto L_0x0111
        L_0x0090:
            if (r6 != 0) goto L_0x0096
            r2 = r1
            r10 = r4
            goto L_0x010b
        L_0x0096:
            r10 = r4
            goto L_0x0149
        L_0x0099:
            if (r6 != r10) goto L_0x018a
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5169a(r12, r8, r11)
            goto L_0x00b0
        L_0x00a0:
            if (r6 != r10) goto L_0x018a
            q.b.c.a.j0.a.g1 r0 = r15.mo9956c(r4)
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5165a(r0, r12, r8, r13, r11)
            java.lang.Object r3 = r9.getObject(r14, r1)
            if (r3 != 0) goto L_0x00b3
        L_0x00b0:
            java.lang.Object r3 = r11.f9001c
            goto L_0x00cb
        L_0x00b3:
            java.lang.Object r5 = r11.f9001c
            java.lang.Object r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.m8165a(r3, r5)
            goto L_0x00cb
        L_0x00ba:
            if (r6 != r10) goto L_0x018a
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r5
            if (r0 != 0) goto L_0x00c6
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5276b(r12, r8, r11)
            goto L_0x00b0
        L_0x00c6:
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5306c(r12, r8, r11)
            goto L_0x00b0
        L_0x00cb:
            r9.putObject(r14, r1, r3)
            goto L_0x00f3
        L_0x00cf:
            if (r6 != 0) goto L_0x018a
            int r3 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5329e(r12, r8, r11)
            long r5 = r11.f9000b
            r19 = 0
            int r5 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r5 == 0) goto L_0x00de
            goto L_0x00e0
        L_0x00de:
            r0 = r16
        L_0x00e0:
            q.b.c.a.j0.a.q1$e r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.f9140f
            r5.mo9896a(r14, r1, r0)
            r0 = r3
            goto L_0x00f3
        L_0x00e7:
            r0 = 5
            if (r6 != r0) goto L_0x018a
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5273b(r12, r8)
            r9.putInt(r14, r1, r0)
            int r0 = r8 + 4
        L_0x00f3:
            r19 = r4
            goto L_0x0184
        L_0x00f7:
            if (r6 != r0) goto L_0x018a
            long r5 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5307c(r12, r8)
            r0 = r9
            r2 = r1
            r1 = r30
            r10 = r4
            r4 = r5
            r0.putLong(r1, r2, r4)
            goto L_0x0144
        L_0x0107:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x0149
        L_0x010b:
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5322d(r12, r8, r11)
            int r1 = r11.f8999a
        L_0x0111:
            r9.putInt(r14, r2, r1)
            goto L_0x0146
        L_0x0115:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x0149
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5329e(r12, r8, r11)
            long r4 = r11.f9000b
        L_0x011f:
            r6 = r0
            r0 = r9
            r1 = r30
            r0.putLong(r1, r2, r4)
            r0 = r6
            goto L_0x0146
        L_0x0128:
            r2 = r1
            r10 = r4
            r0 = 5
            if (r6 != r0) goto L_0x0149
            float r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5317d(r12, r8)
            q.b.c.a.j0.a.q1$e r1 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.f9140f
            r1.mo9895a(r14, r2, r0)
            int r0 = r8 + 4
            goto L_0x0146
        L_0x0139:
            r2 = r1
            r10 = r4
            if (r6 != r0) goto L_0x0149
            double r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5140a(r12, r8)
            p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8809a(r14, r2, r0)
        L_0x0144:
            int r0 = r8 + 8
        L_0x0146:
            r19 = r10
            goto L_0x0184
        L_0x0149:
            r19 = r10
            goto L_0x018c
        L_0x014c:
            r0 = 27
            if (r3 != r0) goto L_0x0194
            if (r6 != r10) goto L_0x018a
            java.lang.Object r0 = r9.getObject(r14, r1)
            q.b.c.a.j0.a.b0$i r0 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.C3603i) r0
            boolean r3 = r0.mo9531s()
            if (r3 != 0) goto L_0x0170
            int r3 = r0.size()
            if (r3 != 0) goto L_0x0167
            r3 = 10
            goto L_0x0169
        L_0x0167:
            int r3 = r3 * 2
        L_0x0169:
            q.b.c.a.j0.a.b0$i r0 = r0.mo9516b(r3)
            r9.putObject(r14, r1, r0)
        L_0x0170:
            r5 = r0
            q.b.c.a.j0.a.g1 r0 = r15.mo9956c(r4)
            r1 = r17
            r2 = r31
            r3 = r8
            r19 = r4
            r4 = r33
            r6 = r34
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5163a(r0, r1, r2, r3, r4, r5, r6)
        L_0x0184:
            r1 = r7
            r2 = r19
            r10 = -1
            goto L_0x0014
        L_0x018a:
            r19 = r4
        L_0x018c:
            r24 = r7
            r15 = r8
            r18 = r9
            r26 = -1
            goto L_0x01e1
        L_0x0194:
            r19 = r4
            r0 = 49
            if (r3 > r0) goto L_0x01ca
            long r4 = (long) r5
            r0 = r29
            r20 = r1
            r1 = r30
            r2 = r31
            r10 = r3
            r3 = r8
            r22 = r4
            r4 = r33
            r5 = r17
            r32 = r6
            r6 = r7
            r24 = r7
            r7 = r32
            r15 = r8
            r8 = r19
            r18 = r9
            r25 = r10
            r26 = -1
            r9 = r22
            r11 = r25
            r12 = r20
            r14 = r34
            int r0 = r0.mo9933a((T) r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x0212
            goto L_0x0211
        L_0x01ca:
            r20 = r1
            r25 = r3
            r32 = r6
            r24 = r7
            r15 = r8
            r18 = r9
            r26 = -1
            r0 = 50
            r9 = r25
            r7 = r32
            if (r9 != r0) goto L_0x01f7
            if (r7 == r10) goto L_0x01e3
        L_0x01e1:
            r2 = r15
            goto L_0x0213
        L_0x01e3:
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r19
            r6 = r20
            r8 = r34
            r0.mo9934a(r1, r2, r3, r4, r5, r6, r8)
            r0 = 0
            throw r0
        L_0x01f7:
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r8 = r5
            r5 = r17
            r6 = r24
            r10 = r20
            r12 = r19
            r13 = r34
            int r0 = r0.mo9932a((T) r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x0212
        L_0x0211:
            goto L_0x0223
        L_0x0212:
            r2 = r0
        L_0x0213:
            q.b.c.a.j0.a.n1 r4 = m8924g(r30)
            r0 = r17
            r1 = r31
            r3 = r33
            r5 = r34
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5151a(r0, r1, r2, r3, r4, r5)
        L_0x0223:
            r2 = r19
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            r9 = r18
            r1 = r24
            r10 = r26
            goto L_0x0014
        L_0x0237:
            r1 = r13
            if (r0 != r1) goto L_0x023b
            return r0
        L_0x023b:
            q.b.c.a.j0.a.c0 r0 = p213q.p217b.p301c.p302a.p311j0.p312a.C3606c0.m8180g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p301c.p302a.p311j0.p312a.C3717u0.mo9949b(java.lang.Object, byte[], int, int, q.b.c.a.j0.a.e):int");
    }

    /* renamed from: b */
    public final void mo9951b(T t, int i) {
        if (!this.f9186h) {
            int i2 = this.f9179a[i + 2];
            long j = (long) (i2 & 1048575);
            C3691q1.f9140f.mo9903a((Object) t, j, C3691q1.m8826f(t, j) | (1 << (i2 >>> 20)));
        }
    }

    /* renamed from: a */
    public final <K, V> void mo9939a(Object obj, int i, Object obj2, C3697r rVar, C3622f1 f1Var) {
        long f = m8921f(this.f9179a[i + 1]);
        Object h = C3691q1.m8828h(obj, f);
        if (h == null) {
            h = this.f9195q.mo9851a(obj2);
            C3691q1.f9140f.mo9905a(obj, f, h);
        } else if (this.f9195q.mo9853b(h)) {
            Object a = this.f9195q.mo9851a(obj2);
            this.f9195q.mo9852a(a, h);
            C3691q1.f9140f.mo9905a(obj, f, a);
            h = a;
        }
        f1Var.mo9568a(this.f9195q.mo9857f(h), this.f9195q.mo9855d(obj2), rVar);
    }

    /* renamed from: b */
    public final void mo9952b(T t, int i, int i2) {
        C3691q1.f9140f.mo9903a((Object) t, (long) (this.f9179a[i2 + 2] & 1048575), i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x053c  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9955b(T r18, p213q.p217b.p301c.p302a.p311j0.p312a.C3722v1 r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r0.f9184f
            r4 = 0
            if (r3 == 0) goto L_0x0028
            q.b.c.a.j0.a.s<?> r3 = r0.f9194p
            q.b.c.a.j0.a.t r3 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3709t) r3
            if (r3 == 0) goto L_0x0027
            r3 = r1
            q.b.c.a.j0.a.z$c r3 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3734c) r3
            q.b.c.a.j0.a.v<q.b.c.a.j0.a.z$e> r3 = r3.f9286e
            boolean r5 = r3.mo9966a()
            if (r5 != 0) goto L_0x0028
            java.util.Iterator r3 = r3.mo9970c()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x002a
        L_0x0027:
            throw r4
        L_0x0028:
            r3 = r4
            r5 = r3
        L_0x002a:
            r6 = -1
            int[] r7 = r0.f9179a
            int r7 = r7.length
            sun.misc.Unsafe r8 = f9178s
            r10 = 0
            r11 = 0
        L_0x0032:
            if (r10 >= r7) goto L_0x0538
            int r12 = r0.mo9959e(r10)
            int[] r13 = r0.f9179a
            r13 = r13[r10]
            int r14 = m8923g(r12)
            boolean r15 = r0.f9186h
            if (r15 != 0) goto L_0x0065
            r15 = 17
            if (r14 > r15) goto L_0x0065
            int[] r15 = r0.f9179a
            int r16 = r10 + 2
            r15 = r15[r16]
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r15 & r16
            r16 = r5
            if (r9 == r6) goto L_0x005d
            long r4 = (long) r9
            int r11 = r8.getInt(r1, r4)
            r6 = r9
        L_0x005d:
            int r4 = r15 >>> 20
            r5 = 1
            int r4 = r5 << r4
            r5 = r16
            goto L_0x006a
        L_0x0065:
            r16 = r5
            r5 = r16
            r4 = 0
        L_0x006a:
            if (r5 == 0) goto L_0x0088
            q.b.c.a.j0.a.s<?> r9 = r0.f9194p
            int r9 = r9.mo9917a(r5)
            if (r9 > r13) goto L_0x0088
            q.b.c.a.j0.a.s<?> r9 = r0.f9194p
            r9.mo9921a(r2, r5)
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0086
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x006a
        L_0x0086:
            r5 = 0
            goto L_0x006a
        L_0x0088:
            r15 = r5
            r9 = r6
            long r5 = m8921f(r12)
            switch(r14) {
                case 0: goto L_0x0523;
                case 1: goto L_0x0514;
                case 2: goto L_0x0503;
                case 3: goto L_0x04f2;
                case 4: goto L_0x04e1;
                case 5: goto L_0x04d0;
                case 6: goto L_0x04bf;
                case 7: goto L_0x04ad;
                case 8: goto L_0x04a0;
                case 9: goto L_0x048c;
                case 10: goto L_0x0478;
                case 11: goto L_0x0466;
                case 12: goto L_0x0454;
                case 13: goto L_0x0442;
                case 14: goto L_0x0430;
                case 15: goto L_0x0420;
                case 16: goto L_0x0410;
                case 17: goto L_0x03fc;
                case 18: goto L_0x03ec;
                case 19: goto L_0x03dc;
                case 20: goto L_0x03cc;
                case 21: goto L_0x03bc;
                case 22: goto L_0x03ac;
                case 23: goto L_0x039c;
                case 24: goto L_0x038c;
                case 25: goto L_0x037c;
                case 26: goto L_0x036d;
                case 27: goto L_0x035a;
                case 28: goto L_0x034b;
                case 29: goto L_0x033b;
                case 30: goto L_0x032b;
                case 31: goto L_0x031b;
                case 32: goto L_0x030b;
                case 33: goto L_0x02fb;
                case 34: goto L_0x02eb;
                case 35: goto L_0x02db;
                case 36: goto L_0x02cb;
                case 37: goto L_0x02bb;
                case 38: goto L_0x02ab;
                case 39: goto L_0x029b;
                case 40: goto L_0x028b;
                case 41: goto L_0x027b;
                case 42: goto L_0x026b;
                case 43: goto L_0x025b;
                case 44: goto L_0x024b;
                case 45: goto L_0x023b;
                case 46: goto L_0x022b;
                case 47: goto L_0x021b;
                case 48: goto L_0x020b;
                case 49: goto L_0x01f8;
                case 50: goto L_0x01ef;
                case 51: goto L_0x01dd;
                case 52: goto L_0x01cb;
                case 53: goto L_0x01b7;
                case 54: goto L_0x01a3;
                case 55: goto L_0x018f;
                case 56: goto L_0x017b;
                case 57: goto L_0x0167;
                case 58: goto L_0x0153;
                case 59: goto L_0x0144;
                case 60: goto L_0x012e;
                case 61: goto L_0x0118;
                case 62: goto L_0x0104;
                case 63: goto L_0x00f1;
                case 64: goto L_0x00de;
                case 65: goto L_0x00cb;
                case 66: goto L_0x00ba;
                case 67: goto L_0x00a9;
                case 68: goto L_0x0094;
                default: goto L_0x0091;
            }
        L_0x0091:
            r12 = 0
            goto L_0x0531
        L_0x0094:
            boolean r4 = r0.mo9946a((T) r1, r13, r10)
            if (r4 == 0) goto L_0x0091
            java.lang.Object r4 = r8.getObject(r1, r5)
            q.b.c.a.j0.a.g1 r5 = r0.mo9956c(r10)
            r6 = r2
            q.b.c.a.j0.a.n r6 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r6
            r6.mo9848a(r13, r4, r5)
            goto L_0x0091
        L_0x00a9:
            boolean r4 = r0.mo9946a((T) r1, r13, r10)
            if (r4 == 0) goto L_0x0091
            long r4 = m8922f(r1, r5)
            r6 = r2
            q.b.c.a.j0.a.n r6 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r6
            r6.mo9846a(r13, r4)
            goto L_0x0091
        L_0x00ba:
            boolean r4 = r0.mo9946a((T) r1, r13, r10)
            if (r4 == 0) goto L_0x0091
            int r4 = m8920e(r1, r5)
            r5 = r2
            q.b.c.a.j0.a.n r5 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r5
            r5.mo9845a(r13, r4)
            goto L_0x0091
        L_0x00cb:
            boolean r4 = r0.mo9946a((T) r1, r13, r10)
            if (r4 == 0) goto L_0x0091
            long r4 = m8922f(r1, r5)
            r6 = r2
            q.b.c.a.j0.a.n r6 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r6
            q.b.c.a.j0.a.m r6 = r6.f9116a
            r6.mo9801a(r13, r4)
            goto L_0x0091
        L_0x00de:
            boolean r4 = r0.mo9946a((T) r1, r13, r10)
            if (r4 == 0) goto L_0x0091
            int r4 = m8920e(r1, r5)
            r5 = r2
            q.b.c.a.j0.a.n r5 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r5
            q.b.c.a.j0.a.m r5 = r5.f9116a
            r5.mo9800a(r13, r4)
            goto L_0x0091
        L_0x00f1:
            boolean r4 = r0.mo9946a((T) r1, r13, r10)
            if (r4 == 0) goto L_0x0091
            int r4 = m8920e(r1, r5)
            r5 = r2
            q.b.c.a.j0.a.n r5 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r5
            q.b.c.a.j0.a.m r5 = r5.f9116a
            r5.mo9810b(r13, r4)
            goto L_0x0091
        L_0x0104:
            boolean r4 = r0.mo9946a((T) r1, r13, r10)
            if (r4 == 0) goto L_0x0091
            int r4 = m8920e(r1, r5)
            r5 = r2
            q.b.c.a.j0.a.n r5 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r5
            q.b.c.a.j0.a.m r5 = r5.f9116a
            r5.mo9816d(r13, r4)
            goto L_0x0091
        L_0x0118:
            boolean r4 = r0.mo9946a((T) r1, r13, r10)
            if (r4 == 0) goto L_0x0091
            java.lang.Object r4 = r8.getObject(r1, r5)
            q.b.c.a.j0.a.j r4 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3635j) r4
            r5 = r2
            q.b.c.a.j0.a.n r5 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r5
            q.b.c.a.j0.a.m r5 = r5.f9116a
            r5.mo9803a(r13, r4)
            goto L_0x0091
        L_0x012e:
            boolean r4 = r0.mo9946a((T) r1, r13, r10)
            if (r4 == 0) goto L_0x0091
            java.lang.Object r4 = r8.getObject(r1, r5)
            q.b.c.a.j0.a.g1 r5 = r0.mo9956c(r10)
            r6 = r2
            q.b.c.a.j0.a.n r6 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r6
            r6.mo9849b(r13, r4, r5)
            goto L_0x0091
        L_0x0144:
            boolean r4 = r0.mo9946a((T) r1, r13, r10)
            if (r4 == 0) goto L_0x0091
            java.lang.Object r4 = r8.getObject(r1, r5)
            r0.mo9938a(r13, r4, r2)
            goto L_0x0091
        L_0x0153:
            boolean r4 = r0.mo9946a((T) r1, r13, r10)
            if (r4 == 0) goto L_0x0091
            boolean r4 = m8917b((T) r1, r5)
            r5 = r2
            q.b.c.a.j0.a.n r5 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r5
            q.b.c.a.j0.a.m r5 = r5.f9116a
            r5.mo9806a(r13, r4)
            goto L_0x0091
        L_0x0167:
            boolean r4 = r0.mo9946a((T) r1, r13, r10)
            if (r4 == 0) goto L_0x0091
            int r4 = m8920e(r1, r5)
            r5 = r2
            q.b.c.a.j0.a.n r5 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r5
            q.b.c.a.j0.a.m r5 = r5.f9116a
            r5.mo9800a(r13, r4)
            goto L_0x0091
        L_0x017b:
            boolean r4 = r0.mo9946a((T) r1, r13, r10)
            if (r4 == 0) goto L_0x0091
            long r4 = m8922f(r1, r5)
            r6 = r2
            q.b.c.a.j0.a.n r6 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r6
            q.b.c.a.j0.a.m r6 = r6.f9116a
            r6.mo9801a(r13, r4)
            goto L_0x0091
        L_0x018f:
            boolean r4 = r0.mo9946a((T) r1, r13, r10)
            if (r4 == 0) goto L_0x0091
            int r4 = m8920e(r1, r5)
            r5 = r2
            q.b.c.a.j0.a.n r5 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r5
            q.b.c.a.j0.a.m r5 = r5.f9116a
            r5.mo9810b(r13, r4)
            goto L_0x0091
        L_0x01a3:
            boolean r4 = r0.mo9946a((T) r1, r13, r10)
            if (r4 == 0) goto L_0x0091
            long r4 = m8922f(r1, r5)
            r6 = r2
            q.b.c.a.j0.a.n r6 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r6
            q.b.c.a.j0.a.m r6 = r6.f9116a
            r6.mo9811b(r13, r4)
            goto L_0x0091
        L_0x01b7:
            boolean r4 = r0.mo9946a((T) r1, r13, r10)
            if (r4 == 0) goto L_0x0091
            long r4 = m8922f(r1, r5)
            r6 = r2
            q.b.c.a.j0.a.n r6 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r6
            q.b.c.a.j0.a.m r6 = r6.f9116a
            r6.mo9811b(r13, r4)
            goto L_0x0091
        L_0x01cb:
            boolean r4 = r0.mo9946a((T) r1, r13, r10)
            if (r4 == 0) goto L_0x0091
            float r4 = m8919d(r1, r5)
            r5 = r2
            q.b.c.a.j0.a.n r5 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r5
            r5.mo9844a(r13, r4)
            goto L_0x0091
        L_0x01dd:
            boolean r4 = r0.mo9946a((T) r1, r13, r10)
            if (r4 == 0) goto L_0x0091
            double r4 = m8918c(r1, r5)
            r6 = r2
            q.b.c.a.j0.a.n r6 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r6
            r6.mo9843a(r13, r4)
            goto L_0x0091
        L_0x01ef:
            java.lang.Object r4 = r8.getObject(r1, r5)
            r0.mo9944a(r2, r13, r4, r10)
            goto L_0x0091
        L_0x01f8:
            int[] r4 = r0.f9179a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            q.b.c.a.j0.a.g1 r6 = r0.mo9956c(r10)
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8345a(r4, r5, r2, r6)
            goto L_0x0091
        L_0x020b:
            int[] r4 = r0.f9179a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            r12 = 1
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8384l(r4, r5, r2, r12)
            goto L_0x0091
        L_0x021b:
            r12 = 1
            int[] r4 = r0.f9179a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8383k(r4, r5, r2, r12)
            goto L_0x0091
        L_0x022b:
            r12 = 1
            int[] r4 = r0.f9179a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8382j(r4, r5, r2, r12)
            goto L_0x0091
        L_0x023b:
            r12 = 1
            int[] r4 = r0.f9179a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8379i(r4, r5, r2, r12)
            goto L_0x0091
        L_0x024b:
            r12 = 1
            int[] r4 = r0.f9179a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8361c(r4, r5, r2, r12)
            goto L_0x0091
        L_0x025b:
            r12 = 1
            int[] r4 = r0.f9179a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8385m(r4, r5, r2, r12)
            goto L_0x0091
        L_0x026b:
            r12 = 1
            int[] r4 = r0.f9179a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8346a(r4, r5, r2, r12)
            goto L_0x0091
        L_0x027b:
            r12 = 1
            int[] r4 = r0.f9179a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8364d(r4, r5, r2, r12)
            goto L_0x0091
        L_0x028b:
            r12 = 1
            int[] r4 = r0.f9179a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8367e(r4, r5, r2, r12)
            goto L_0x0091
        L_0x029b:
            r12 = 1
            int[] r4 = r0.f9179a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8373g(r4, r5, r2, r12)
            goto L_0x0091
        L_0x02ab:
            r12 = 1
            int[] r4 = r0.f9179a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8386n(r4, r5, r2, r12)
            goto L_0x0091
        L_0x02bb:
            r12 = 1
            int[] r4 = r0.f9179a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8376h(r4, r5, r2, r12)
            goto L_0x0091
        L_0x02cb:
            r12 = 1
            int[] r4 = r0.f9179a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8370f(r4, r5, r2, r12)
            goto L_0x0091
        L_0x02db:
            r12 = 1
            int[] r4 = r0.f9179a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8358b(r4, r5, r2, r12)
            goto L_0x0091
        L_0x02eb:
            int[] r4 = r0.f9179a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            r12 = 0
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8384l(r4, r5, r2, r12)
            goto L_0x0531
        L_0x02fb:
            r12 = 0
            int[] r4 = r0.f9179a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8383k(r4, r5, r2, r12)
            goto L_0x0531
        L_0x030b:
            r12 = 0
            int[] r4 = r0.f9179a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8382j(r4, r5, r2, r12)
            goto L_0x0531
        L_0x031b:
            r12 = 0
            int[] r4 = r0.f9179a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8379i(r4, r5, r2, r12)
            goto L_0x0531
        L_0x032b:
            r12 = 0
            int[] r4 = r0.f9179a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8361c(r4, r5, r2, r12)
            goto L_0x0531
        L_0x033b:
            r12 = 0
            int[] r4 = r0.f9179a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8385m(r4, r5, r2, r12)
            goto L_0x0531
        L_0x034b:
            int[] r4 = r0.f9179a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8344a(r4, r5, r2)
            goto L_0x0091
        L_0x035a:
            int[] r4 = r0.f9179a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            q.b.c.a.j0.a.g1 r6 = r0.mo9956c(r10)
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8357b(r4, r5, r2, r6)
            goto L_0x0091
        L_0x036d:
            int[] r4 = r0.f9179a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8356b(r4, r5, r2)
            goto L_0x0091
        L_0x037c:
            int[] r4 = r0.f9179a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            r12 = 0
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8346a(r4, r5, r2, r12)
            goto L_0x0531
        L_0x038c:
            r12 = 0
            int[] r4 = r0.f9179a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8364d(r4, r5, r2, r12)
            goto L_0x0531
        L_0x039c:
            r12 = 0
            int[] r4 = r0.f9179a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8367e(r4, r5, r2, r12)
            goto L_0x0531
        L_0x03ac:
            r12 = 0
            int[] r4 = r0.f9179a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8373g(r4, r5, r2, r12)
            goto L_0x0531
        L_0x03bc:
            r12 = 0
            int[] r4 = r0.f9179a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8386n(r4, r5, r2, r12)
            goto L_0x0531
        L_0x03cc:
            r12 = 0
            int[] r4 = r0.f9179a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8376h(r4, r5, r2, r12)
            goto L_0x0531
        L_0x03dc:
            r12 = 0
            int[] r4 = r0.f9179a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8370f(r4, r5, r2, r12)
            goto L_0x0531
        L_0x03ec:
            r12 = 0
            int[] r4 = r0.f9179a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8358b(r4, r5, r2, r12)
            goto L_0x0531
        L_0x03fc:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0531
            java.lang.Object r4 = r8.getObject(r1, r5)
            q.b.c.a.j0.a.g1 r5 = r0.mo9956c(r10)
            r6 = r2
            q.b.c.a.j0.a.n r6 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r6
            r6.mo9848a(r13, r4, r5)
            goto L_0x0531
        L_0x0410:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0531
            long r4 = r8.getLong(r1, r5)
            r6 = r2
            q.b.c.a.j0.a.n r6 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r6
            r6.mo9846a(r13, r4)
            goto L_0x0531
        L_0x0420:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0531
            int r4 = r8.getInt(r1, r5)
            r5 = r2
            q.b.c.a.j0.a.n r5 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r5
            r5.mo9845a(r13, r4)
            goto L_0x0531
        L_0x0430:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0531
            long r4 = r8.getLong(r1, r5)
            r6 = r2
            q.b.c.a.j0.a.n r6 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r6
            q.b.c.a.j0.a.m r6 = r6.f9116a
            r6.mo9801a(r13, r4)
            goto L_0x0531
        L_0x0442:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0531
            int r4 = r8.getInt(r1, r5)
            r5 = r2
            q.b.c.a.j0.a.n r5 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r5
            q.b.c.a.j0.a.m r5 = r5.f9116a
            r5.mo9800a(r13, r4)
            goto L_0x0531
        L_0x0454:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0531
            int r4 = r8.getInt(r1, r5)
            r5 = r2
            q.b.c.a.j0.a.n r5 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r5
            q.b.c.a.j0.a.m r5 = r5.f9116a
            r5.mo9810b(r13, r4)
            goto L_0x0531
        L_0x0466:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0531
            int r4 = r8.getInt(r1, r5)
            r5 = r2
            q.b.c.a.j0.a.n r5 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r5
            q.b.c.a.j0.a.m r5 = r5.f9116a
            r5.mo9816d(r13, r4)
            goto L_0x0531
        L_0x0478:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0531
            java.lang.Object r4 = r8.getObject(r1, r5)
            q.b.c.a.j0.a.j r4 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3635j) r4
            r5 = r2
            q.b.c.a.j0.a.n r5 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r5
            q.b.c.a.j0.a.m r5 = r5.f9116a
            r5.mo9803a(r13, r4)
            goto L_0x0531
        L_0x048c:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0531
            java.lang.Object r4 = r8.getObject(r1, r5)
            q.b.c.a.j0.a.g1 r5 = r0.mo9956c(r10)
            r6 = r2
            q.b.c.a.j0.a.n r6 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r6
            r6.mo9849b(r13, r4, r5)
            goto L_0x0531
        L_0x04a0:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0531
            java.lang.Object r4 = r8.getObject(r1, r5)
            r0.mo9938a(r13, r4, r2)
            goto L_0x0531
        L_0x04ad:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0531
            boolean r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8816a(r1, r5)
            r5 = r2
            q.b.c.a.j0.a.n r5 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r5
            q.b.c.a.j0.a.m r5 = r5.f9116a
            r5.mo9806a(r13, r4)
            goto L_0x0531
        L_0x04bf:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0531
            int r4 = r8.getInt(r1, r5)
            r5 = r2
            q.b.c.a.j0.a.n r5 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r5
            q.b.c.a.j0.a.m r5 = r5.f9116a
            r5.mo9800a(r13, r4)
            goto L_0x0531
        L_0x04d0:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0531
            long r4 = r8.getLong(r1, r5)
            r6 = r2
            q.b.c.a.j0.a.n r6 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r6
            q.b.c.a.j0.a.m r6 = r6.f9116a
            r6.mo9801a(r13, r4)
            goto L_0x0531
        L_0x04e1:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0531
            int r4 = r8.getInt(r1, r5)
            r5 = r2
            q.b.c.a.j0.a.n r5 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r5
            q.b.c.a.j0.a.m r5 = r5.f9116a
            r5.mo9810b(r13, r4)
            goto L_0x0531
        L_0x04f2:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0531
            long r4 = r8.getLong(r1, r5)
            r6 = r2
            q.b.c.a.j0.a.n r6 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r6
            q.b.c.a.j0.a.m r6 = r6.f9116a
            r6.mo9811b(r13, r4)
            goto L_0x0531
        L_0x0503:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0531
            long r4 = r8.getLong(r1, r5)
            r6 = r2
            q.b.c.a.j0.a.n r6 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r6
            q.b.c.a.j0.a.m r6 = r6.f9116a
            r6.mo9811b(r13, r4)
            goto L_0x0531
        L_0x0514:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0531
            float r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8825e(r1, r5)
            r5 = r2
            q.b.c.a.j0.a.n r5 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r5
            r5.mo9844a(r13, r4)
            goto L_0x0531
        L_0x0523:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0531
            double r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8823d(r1, r5)
            r6 = r2
            q.b.c.a.j0.a.n r6 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r6
            r6.mo9843a(r13, r4)
        L_0x0531:
            int r10 = r10 + 3
            r6 = r9
            r5 = r15
            r4 = 0
            goto L_0x0032
        L_0x0538:
            r16 = r5
        L_0x053a:
            if (r5 == 0) goto L_0x0551
            q.b.c.a.j0.a.s<?> r4 = r0.f9194p
            r4.mo9921a(r2, r5)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x054f
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            r5 = r4
            goto L_0x053a
        L_0x054f:
            r5 = 0
            goto L_0x053a
        L_0x0551:
            q.b.c.a.j0.a.m1<?, ?> r3 = r0.f9193o
            r0.mo9943a(r3, (T) r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p301c.p302a.p311j0.p312a.C3717u0.mo9955b(java.lang.Object, q.b.c.a.j0.a.v1):void");
    }

    /* renamed from: a */
    public static <T> C3717u0 m8916a(C3690q0 q0Var, C3726w0 w0Var, C3630i0 i0Var, C3677m1 m1Var, C3705s sVar, C3679n0 n0Var) {
        if (q0Var instanceof C3617e1) {
            return m8915a((C3617e1) q0Var, w0Var, i0Var, m1Var, sVar, n0Var);
        }
        if (((C3665k1) q0Var) != null) {
            C3604b1 b1Var = C3604b1.PROTO3;
            throw null;
        }
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:126:0x028e  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x02a8  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02ab  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x035c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> p213q.p217b.p301c.p302a.p311j0.p312a.C3717u0<T> m8915a(p213q.p217b.p301c.p302a.p311j0.p312a.C3617e1 r36, p213q.p217b.p301c.p302a.p311j0.p312a.C3726w0 r37, p213q.p217b.p301c.p302a.p311j0.p312a.C3630i0 r38, p213q.p217b.p301c.p302a.p311j0.p312a.C3677m1<?, ?> r39, p213q.p217b.p301c.p302a.p311j0.p312a.C3705s<?> r40, p213q.p217b.p301c.p302a.p311j0.p312a.C3679n0 r41) {
        /*
            r0 = r36
            int r1 = r0.f9008d
            r2 = 1
            r1 = r1 & r2
            if (r1 != r2) goto L_0x000b
            q.b.c.a.j0.a.b1 r1 = p213q.p217b.p301c.p302a.p311j0.p312a.C3604b1.PROTO2
            goto L_0x000d
        L_0x000b:
            q.b.c.a.j0.a.b1 r1 = p213q.p217b.p301c.p302a.p311j0.p312a.C3604b1.PROTO3
        L_0x000d:
            q.b.c.a.j0.a.b1 r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3604b1.PROTO3
            r4 = 0
            if (r1 != r3) goto L_0x0014
            r11 = r2
            goto L_0x0015
        L_0x0014:
            r11 = r4
        L_0x0015:
            java.lang.String r1 = r0.f9006b
            int r3 = r1.length()
            char r5 = r1.charAt(r4)
            r7 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r7) goto L_0x003c
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r8 = r2
            r9 = 13
        L_0x0029:
            int r10 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r7) goto L_0x0039
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r5 = r5 | r8
            int r9 = r9 + 13
            r8 = r10
            goto L_0x0029
        L_0x0039:
            int r8 = r8 << r9
            r5 = r5 | r8
            goto L_0x003d
        L_0x003c:
            r10 = r2
        L_0x003d:
            int r8 = r10 + 1
            char r9 = r1.charAt(r10)
            if (r9 < r7) goto L_0x005c
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x0049:
            int r12 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r7) goto L_0x0059
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r10
            r9 = r9 | r8
            int r10 = r10 + 13
            r8 = r12
            goto L_0x0049
        L_0x0059:
            int r8 = r8 << r10
            r9 = r9 | r8
            r8 = r12
        L_0x005c:
            if (r9 != 0) goto L_0x0069
            int[] r9 = f9177r
            r6 = r4
            r10 = r6
            r12 = r10
            r13 = r12
            r15 = r13
            r14 = r9
            r9 = r15
            goto L_0x0189
        L_0x0069:
            int r9 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r7) goto L_0x0088
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x0075:
            int r12 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r7) goto L_0x0085
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r10
            r8 = r8 | r9
            int r10 = r10 + 13
            r9 = r12
            goto L_0x0075
        L_0x0085:
            int r9 = r9 << r10
            r8 = r8 | r9
            r9 = r12
        L_0x0088:
            int r10 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r7) goto L_0x00a7
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x0094:
            int r13 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r7) goto L_0x00a4
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r12
            r9 = r9 | r10
            int r12 = r12 + 13
            r10 = r13
            goto L_0x0094
        L_0x00a4:
            int r10 = r10 << r12
            r9 = r9 | r10
            r10 = r13
        L_0x00a7:
            int r12 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r7) goto L_0x00c6
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00b3:
            int r14 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r7) goto L_0x00c3
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r10 = r10 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00b3
        L_0x00c3:
            int r12 = r12 << r13
            r10 = r10 | r12
            r12 = r14
        L_0x00c6:
            int r13 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r7) goto L_0x00e5
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00d2:
            int r15 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r7) goto L_0x00e2
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00d2
        L_0x00e2:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x00e5:
            int r14 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r7) goto L_0x0106
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x00f1:
            int r16 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r7) goto L_0x0102
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x00f1
        L_0x0102:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0106:
            int r15 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r7) goto L_0x0129
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x0112:
            int r17 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r7) goto L_0x0124
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x0112
        L_0x0124:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0129:
            int r16 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r7) goto L_0x014f
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r4 = r16
            r16 = 13
        L_0x0137:
            int r18 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r7) goto L_0x0149
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r16
            r15 = r15 | r4
            int r16 = r16 + 13
            r4 = r18
            goto L_0x0137
        L_0x0149:
            int r4 = r4 << r16
            r15 = r15 | r4
            r4 = r18
            goto L_0x0151
        L_0x014f:
            r4 = r16
        L_0x0151:
            int r16 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r7) goto L_0x0176
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r6 = r16
            r16 = 13
        L_0x015f:
            int r19 = r6 + 1
            char r6 = r1.charAt(r6)
            if (r6 < r7) goto L_0x0171
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r6 = r6 << r16
            r4 = r4 | r6
            int r16 = r16 + 13
            r6 = r19
            goto L_0x015f
        L_0x0171:
            int r6 = r6 << r16
            r4 = r4 | r6
            r16 = r19
        L_0x0176:
            int r6 = r4 + r14
            int r6 = r6 + r15
            int[] r6 = new int[r6]
            int r15 = r8 * 2
            int r15 = r15 + r9
            r9 = r12
            r12 = r15
            r15 = r4
            r4 = r8
            r8 = r16
            r35 = r14
            r14 = r6
            r6 = r35
        L_0x0189:
            sun.misc.Unsafe r2 = f9178s
            java.lang.Object[] r7 = r0.f9007c
            r20 = r8
            q.b.c.a.j0.a.s0 r8 = r0.f9005a
            java.lang.Class r8 = r8.getClass()
            r21 = r12
            int r12 = r13 * 3
            int[] r12 = new int[r12]
            int r13 = r13 * 2
            java.lang.Object[] r13 = new java.lang.Object[r13]
            int r22 = r15 + r6
            r24 = r15
            r6 = r20
            r25 = r22
            r20 = 0
            r23 = 0
        L_0x01ab:
            if (r6 >= r3) goto L_0x03fa
            int r26 = r6 + 1
            char r6 = r1.charAt(r6)
            r27 = r3
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r6 < r3) goto L_0x01df
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r3 = r26
            r26 = 13
        L_0x01c0:
            int r28 = r3 + 1
            char r3 = r1.charAt(r3)
            r29 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r15) goto L_0x01d9
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r26
            r6 = r6 | r3
            int r26 = r26 + 13
            r3 = r28
            r15 = r29
            goto L_0x01c0
        L_0x01d9:
            int r3 = r3 << r26
            r6 = r6 | r3
            r3 = r28
            goto L_0x01e3
        L_0x01df:
            r29 = r15
            r3 = r26
        L_0x01e3:
            int r15 = r3 + 1
            char r3 = r1.charAt(r3)
            r26 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r15) goto L_0x0215
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r15 = r26
            r26 = 13
        L_0x01f6:
            int r28 = r15 + 1
            char r15 = r1.charAt(r15)
            r30 = r11
            r11 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r11) goto L_0x020f
            r11 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r26
            r3 = r3 | r11
            int r26 = r26 + 13
            r15 = r28
            r11 = r30
            goto L_0x01f6
        L_0x020f:
            int r11 = r15 << r26
            r3 = r3 | r11
            r15 = r28
            goto L_0x0219
        L_0x0215:
            r30 = r11
            r15 = r26
        L_0x0219:
            r11 = r3 & 255(0xff, float:3.57E-43)
            r26 = r9
            r9 = r3 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L_0x0227
            int r9 = r20 + 1
            r14[r20] = r23
            r20 = r9
        L_0x0227:
            r9 = 51
            r32 = r10
            if (r11 < r9) goto L_0x02c5
            int r9 = r15 + 1
            char r15 = r1.charAt(r15)
            r10 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r10) goto L_0x0256
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r33 = 13
        L_0x023c:
            int r34 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r10) goto L_0x0251
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r33
            r15 = r15 | r9
            int r33 = r33 + 13
            r9 = r34
            r10 = 55296(0xd800, float:7.7486E-41)
            goto L_0x023c
        L_0x0251:
            int r9 = r9 << r33
            r15 = r15 | r9
            r9 = r34
        L_0x0256:
            int r10 = r11 + -51
            r33 = r9
            r9 = 9
            if (r10 == r9) goto L_0x0278
            r9 = 17
            if (r10 != r9) goto L_0x0263
            goto L_0x0278
        L_0x0263:
            r9 = 12
            if (r10 != r9) goto L_0x0286
            r9 = r5 & 1
            r10 = 1
            if (r9 != r10) goto L_0x0286
            int r9 = r23 / 3
            int r9 = r9 * 2
            int r9 = r9 + r10
            int r10 = r21 + 1
            r21 = r7[r21]
            r13[r9] = r21
            goto L_0x0284
        L_0x0278:
            int r9 = r23 / 3
            int r9 = r9 * 2
            r10 = 1
            int r9 = r9 + r10
            int r10 = r21 + 1
            r21 = r7[r21]
            r13[r9] = r21
        L_0x0284:
            r21 = r10
        L_0x0286:
            int r15 = r15 * 2
            r9 = r7[r15]
            boolean r10 = r9 instanceof java.lang.reflect.Field
            if (r10 == 0) goto L_0x0291
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            goto L_0x0299
        L_0x0291:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = m8913a(r8, r9)
            r7[r15] = r9
        L_0x0299:
            long r9 = r2.objectFieldOffset(r9)
            int r9 = (int) r9
            int r15 = r15 + 1
            r10 = r7[r15]
            r28 = r9
            boolean r9 = r10 instanceof java.lang.reflect.Field
            if (r9 == 0) goto L_0x02ab
            java.lang.reflect.Field r10 = (java.lang.reflect.Field) r10
            goto L_0x02b3
        L_0x02ab:
            java.lang.String r10 = (java.lang.String) r10
            java.lang.reflect.Field r10 = m8913a(r8, r10)
            r7[r15] = r10
        L_0x02b3:
            long r9 = r2.objectFieldOffset(r10)
            int r9 = (int) r9
            r10 = r1
            r19 = r4
            r0 = r9
            r9 = r28
            r31 = r33
            r15 = 0
            r28 = r3
            goto L_0x03c1
        L_0x02c5:
            int r9 = r21 + 1
            r10 = r7[r21]
            java.lang.String r10 = (java.lang.String) r10
            java.lang.reflect.Field r10 = m8913a(r8, r10)
            r0 = 9
            if (r11 == r0) goto L_0x0343
            r0 = 17
            if (r11 != r0) goto L_0x02d9
            goto L_0x0343
        L_0x02d9:
            r0 = 27
            if (r11 == r0) goto L_0x0331
            r0 = 49
            if (r11 != r0) goto L_0x02e2
            goto L_0x0331
        L_0x02e2:
            r0 = 12
            if (r11 == r0) goto L_0x031e
            r0 = 30
            if (r11 == r0) goto L_0x031e
            r0 = 44
            if (r11 != r0) goto L_0x02ef
            goto L_0x031e
        L_0x02ef:
            r0 = 50
            if (r11 != r0) goto L_0x031a
            int r0 = r24 + 1
            r14[r24] = r23
            int r24 = r23 / 3
            int r24 = r24 * 2
            int r28 = r9 + 1
            r9 = r7[r9]
            r13[r24] = r9
            r9 = r3 & 2048(0x800, float:2.87E-42)
            if (r9 == 0) goto L_0x0312
            int r24 = r24 + 1
            int r9 = r28 + 1
            r28 = r7[r28]
            r13[r24] = r28
            r24 = r0
            r28 = r3
            goto L_0x0351
        L_0x0312:
            r24 = r0
            r0 = r4
            r9 = r28
            r28 = r3
            goto L_0x0352
        L_0x031a:
            r28 = r3
            r3 = 1
            goto L_0x0351
        L_0x031e:
            r0 = r5 & 1
            r28 = r3
            r3 = 1
            if (r0 != r3) goto L_0x0351
            int r0 = r23 / 3
            int r0 = r0 * 2
            int r0 = r0 + r3
            int r16 = r9 + 1
            r9 = r7[r9]
            r13[r0] = r9
            goto L_0x033f
        L_0x0331:
            r28 = r3
            r3 = 1
            int r0 = r23 / 3
            int r0 = r0 * 2
            int r0 = r0 + r3
            int r16 = r9 + 1
            r9 = r7[r9]
            r13[r0] = r9
        L_0x033f:
            r0 = r4
            r9 = r16
            goto L_0x0352
        L_0x0343:
            r28 = r3
            r3 = 1
            int r0 = r23 / 3
            int r0 = r0 * 2
            int r0 = r0 + r3
            java.lang.Class r16 = r10.getType()
            r13[r0] = r16
        L_0x0351:
            r0 = r4
        L_0x0352:
            long r3 = r2.objectFieldOffset(r10)
            int r3 = (int) r3
            r4 = r5 & 1
            r10 = 1
            if (r4 != r10) goto L_0x03a9
            r4 = 17
            if (r11 > r4) goto L_0x03a9
            int r4 = r15 + 1
            char r15 = r1.charAt(r15)
            r10 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r10) goto L_0x0385
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r19 = 13
        L_0x036f:
            int r31 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r10) goto L_0x0381
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r19
            r15 = r15 | r4
            int r19 = r19 + 13
            r4 = r31
            goto L_0x036f
        L_0x0381:
            int r4 = r4 << r19
            r15 = r15 | r4
            goto L_0x0387
        L_0x0385:
            r31 = r4
        L_0x0387:
            int r4 = r0 * 2
            int r19 = r15 / 32
            int r19 = r19 + r4
            r4 = r7[r19]
            boolean r10 = r4 instanceof java.lang.reflect.Field
            if (r10 == 0) goto L_0x0396
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            goto L_0x039e
        L_0x0396:
            java.lang.String r4 = (java.lang.String) r4
            java.lang.reflect.Field r4 = m8913a(r8, r4)
            r7[r19] = r4
        L_0x039e:
            r19 = r0
            r10 = r1
            long r0 = r2.objectFieldOffset(r4)
            int r0 = (int) r0
            int r15 = r15 % 32
            goto L_0x03b0
        L_0x03a9:
            r19 = r0
            r10 = r1
            r31 = r15
            r0 = 0
            r15 = 0
        L_0x03b0:
            r1 = 18
            if (r11 < r1) goto L_0x03be
            r1 = 49
            if (r11 > r1) goto L_0x03be
            int r1 = r25 + 1
            r14[r25] = r3
            r25 = r1
        L_0x03be:
            r21 = r9
            r9 = r3
        L_0x03c1:
            int r1 = r23 + 1
            r12[r23] = r6
            int r3 = r1 + 1
            r4 = r28
            r6 = r4 & 512(0x200, float:7.175E-43)
            if (r6 == 0) goto L_0x03d0
            r6 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x03d1
        L_0x03d0:
            r6 = 0
        L_0x03d1:
            r4 = r4 & 256(0x100, float:3.59E-43)
            if (r4 == 0) goto L_0x03d8
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03d9
        L_0x03d8:
            r4 = 0
        L_0x03d9:
            r4 = r4 | r6
            int r6 = r11 << 20
            r4 = r4 | r6
            r4 = r4 | r9
            r12[r1] = r4
            int r23 = r3 + 1
            int r1 = r15 << 20
            r0 = r0 | r1
            r12[r3] = r0
            r0 = r36
            r1 = r10
            r4 = r19
            r9 = r26
            r3 = r27
            r15 = r29
            r11 = r30
            r6 = r31
            r10 = r32
            goto L_0x01ab
        L_0x03fa:
            r26 = r9
            r32 = r10
            r30 = r11
            r29 = r15
            q.b.c.a.j0.a.u0 r0 = new q.b.c.a.j0.a.u0
            r1 = r36
            q.b.c.a.j0.a.s0 r10 = r1.f9005a
            r1 = 0
            r5 = r0
            r6 = r12
            r7 = r13
            r8 = r32
            r9 = r26
            r11 = r30
            r12 = r1
            r13 = r14
            r14 = r29
            r15 = r22
            r16 = r37
            r17 = r38
            r18 = r39
            r19 = r40
            r20 = r41
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p301c.p302a.p311j0.p312a.C3717u0.m8915a(q.b.c.a.j0.a.e1, q.b.c.a.j0.a.w0, q.b.c.a.j0.a.i0, q.b.c.a.j0.a.m1, q.b.c.a.j0.a.s, q.b.c.a.j0.a.n0):q.b.c.a.j0.a.u0");
    }

    /* renamed from: a */
    public final <K, V> int mo9934a(T t, byte[] bArr, int i, int i2, int i3, long j, C3612e eVar) {
        Unsafe unsafe = f9178s;
        Object obj = this.f9180b[(i3 / 3) * 2];
        Object object = unsafe.getObject(t, j);
        if (this.f9195q.mo9853b(object)) {
            Object a = this.f9195q.mo9851a(obj);
            this.f9195q.mo9852a(a, object);
            unsafe.putObject(t, j, a);
            object = a;
        }
        this.f9195q.mo9855d(obj);
        this.f9195q.mo9857f(object);
        int d = C2286e.m5322d(bArr, i, eVar);
        int i4 = eVar.f8999a;
        if (i4 < 0 || i4 > i2 - d) {
            throw C3606c0.m8181h();
        }
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x013b, code lost:
        r3 = java.lang.Integer.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0148, code lost:
        r3 = java.lang.Long.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x014c, code lost:
        r12.putObject(r1, r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x015b, code lost:
        r12.putObject(r1, r9, r2);
        r2 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x016c, code lost:
        r12.putObject(r1, r9, r2);
        r2 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0171, code lost:
        r12.putInt(r1, r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        return r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo9932a(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, p213q.p217b.p301c.p302a.p311j0.p312a.C3612e r29) {
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
            sun.misc.Unsafe r12 = f9178s
            int[] r7 = r0.f9179a
            int r13 = r6 + 2
            r7 = r7[r13]
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r13
            long r13 = (long) r7
            r7 = 3
            r15 = 2
            switch(r25) {
                case 51: goto L_0x0161;
                case 52: goto L_0x0150;
                case 53: goto L_0x0140;
                case 54: goto L_0x0140;
                case 55: goto L_0x0133;
                case 56: goto L_0x0127;
                case 57: goto L_0x011b;
                case 58: goto L_0x0105;
                case 59: goto L_0x00d6;
                case 60: goto L_0x00b2;
                case 61: goto L_0x00a8;
                case 62: goto L_0x0133;
                case 63: goto L_0x0073;
                case 64: goto L_0x011b;
                case 65: goto L_0x0127;
                case 66: goto L_0x0065;
                case 67: goto L_0x0057;
                case 68: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x0175
        L_0x0028:
            if (r5 != r7) goto L_0x0175
            r2 = r2 & -8
            r7 = r2 | 4
            q.b.c.a.j0.a.g1 r2 = r0.mo9956c(r6)
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r7
            r7 = r29
            int r2 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5164a(r2, r3, r4, r5, r6, r7)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x004a
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x004b
        L_0x004a:
            r15 = 0
        L_0x004b:
            java.lang.Object r3 = r11.f9001c
            if (r15 != 0) goto L_0x0051
            goto L_0x014c
        L_0x0051:
            java.lang.Object r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.m8165a(r15, r3)
            goto L_0x014c
        L_0x0057:
            if (r5 != 0) goto L_0x0175
            int r2 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5329e(r3, r4, r11)
            long r3 = r11.f9000b
            long r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3656k.m8444a(r3)
            goto L_0x0148
        L_0x0065:
            if (r5 != 0) goto L_0x0175
            int r2 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5322d(r3, r4, r11)
            int r3 = r11.f8999a
            int r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3656k.m8448e(r3)
            goto L_0x013b
        L_0x0073:
            if (r5 != 0) goto L_0x0175
            int r3 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5322d(r3, r4, r11)
            int r4 = r11.f8999a
            java.lang.Object[] r5 = r0.f9180b
            int r6 = r6 / r7
            int r6 = r6 * r15
            r7 = 1
            int r6 = r6 + r7
            r5 = r5[r6]
            q.b.c.a.j0.a.b0$e r5 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.C3599e) r5
            if (r5 == 0) goto L_0x009b
            boolean r5 = r5.isInRange(r4)
            if (r5 == 0) goto L_0x008e
            goto L_0x009b
        L_0x008e:
            q.b.c.a.j0.a.n1 r1 = m8924g(r17)
            long r4 = (long) r4
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.mo9859a(r2, r4)
            goto L_0x00a5
        L_0x009b:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r12.putObject(r1, r9, r2)
            r12.putInt(r1, r13, r8)
        L_0x00a5:
            r2 = r3
            goto L_0x0176
        L_0x00a8:
            if (r5 != r15) goto L_0x0175
            int r2 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5169a(r3, r4, r11)
            java.lang.Object r3 = r11.f9001c
            goto L_0x014c
        L_0x00b2:
            if (r5 != r15) goto L_0x0175
            q.b.c.a.j0.a.g1 r2 = r0.mo9956c(r6)
            r5 = r20
            int r2 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5165a(r2, r3, r4, r5, r11)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x00c9
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x00ca
        L_0x00c9:
            r15 = 0
        L_0x00ca:
            java.lang.Object r3 = r11.f9001c
            if (r15 != 0) goto L_0x00d0
            goto L_0x014c
        L_0x00d0:
            java.lang.Object r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.m8165a(r15, r3)
            goto L_0x014c
        L_0x00d6:
            if (r5 != r15) goto L_0x0175
            int r2 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5322d(r3, r4, r11)
            int r4 = r11.f8999a
            if (r4 != 0) goto L_0x00e4
            java.lang.String r3 = ""
            goto L_0x014c
        L_0x00e4:
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r24 & r5
            if (r5 == 0) goto L_0x00f8
            int r5 = r2 + r4
            boolean r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3700r1.m8888c(r3, r2, r5)
            if (r5 == 0) goto L_0x00f3
            goto L_0x00f8
        L_0x00f3:
            q.b.c.a.j0.a.c0 r1 = p213q.p217b.p301c.p302a.p311j0.p312a.C3606c0.m8176c()
            throw r1
        L_0x00f8:
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.f8972a
            r5.<init>(r3, r2, r4, r6)
            r12.putObject(r1, r9, r5)
            int r2 = r2 + r4
            goto L_0x0171
        L_0x0105:
            if (r5 != 0) goto L_0x0175
            int r2 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5329e(r3, r4, r11)
            long r3 = r11.f9000b
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0115
            r15 = 1
            goto L_0x0116
        L_0x0115:
            r15 = 0
        L_0x0116:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r15)
            goto L_0x014c
        L_0x011b:
            r2 = 5
            if (r5 != r2) goto L_0x0175
            int r2 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5273b(r18, r19)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x015b
        L_0x0127:
            r2 = 1
            if (r5 != r2) goto L_0x0175
            long r2 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5307c(r18, r19)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            goto L_0x016c
        L_0x0133:
            if (r5 != 0) goto L_0x0175
            int r2 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5322d(r3, r4, r11)
            int r3 = r11.f8999a
        L_0x013b:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x014c
        L_0x0140:
            if (r5 != 0) goto L_0x0175
            int r2 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5329e(r3, r4, r11)
            long r3 = r11.f9000b
        L_0x0148:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
        L_0x014c:
            r12.putObject(r1, r9, r3)
            goto L_0x0171
        L_0x0150:
            r2 = 5
            if (r5 != r2) goto L_0x0175
            float r2 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5317d(r18, r19)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
        L_0x015b:
            r12.putObject(r1, r9, r2)
            int r2 = r4 + 4
            goto L_0x0171
        L_0x0161:
            r2 = 1
            if (r5 != r2) goto L_0x0175
            double r2 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5140a(r18, r19)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
        L_0x016c:
            r12.putObject(r1, r9, r2)
            int r2 = r4 + 8
        L_0x0171:
            r12.putInt(r1, r13, r8)
            goto L_0x0176
        L_0x0175:
            r2 = r4
        L_0x0176:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p301c.p302a.p311j0.p312a.C3717u0.mo9932a(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, q.b.c.a.j0.a.e):int");
    }

    /* JADX WARNING: type inference failed for: r33v0, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r12v0 */
    /* JADX WARNING: type inference failed for: r12v1, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r0v11, types: [int, byte] */
    /* JADX WARNING: type inference failed for: r6v2, types: [int] */
    /* JADX WARNING: type inference failed for: r12v2 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r7v2 */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: type inference failed for: r8v6 */
    /* JADX WARNING: type inference failed for: r0v17, types: [int] */
    /* JADX WARNING: type inference failed for: r1v9, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: type inference failed for: r8v7 */
    /* JADX WARNING: type inference failed for: r5v7, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r8v8 */
    /* JADX WARNING: type inference failed for: r8v9 */
    /* JADX WARNING: type inference failed for: r8v10 */
    /* JADX WARNING: type inference failed for: r8v11 */
    /* JADX WARNING: type inference failed for: r8v12 */
    /* JADX WARNING: type inference failed for: r8v13 */
    /* JADX WARNING: type inference failed for: r8v14, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r8v15 */
    /* JADX WARNING: type inference failed for: r8v16, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r8v17 */
    /* JADX WARNING: type inference failed for: r8v18, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r8v19, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r8v20, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r8v21, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r8v22, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r8v23 */
    /* JADX WARNING: type inference failed for: r8v24, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r1v30, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r8v25 */
    /* JADX WARNING: type inference failed for: r8v26 */
    /* JADX WARNING: type inference failed for: r8v27 */
    /* JADX WARNING: type inference failed for: r8v28 */
    /* JADX WARNING: type inference failed for: r8v29 */
    /* JADX WARNING: type inference failed for: r8v30 */
    /* JADX WARNING: type inference failed for: r8v31 */
    /* JADX WARNING: type inference failed for: r5v10 */
    /* JADX WARNING: type inference failed for: r5v11, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r5v12, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r5v13, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r5v14, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r5v15, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r5v16, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r5v17, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r5v18, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r5v19, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r5v20, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r0v78, types: [int] */
    /* JADX WARNING: type inference failed for: r1v53, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r8v32 */
    /* JADX WARNING: type inference failed for: r4v23 */
    /* JADX WARNING: type inference failed for: r8v33 */
    /* JADX WARNING: type inference failed for: r7v3 */
    /* JADX WARNING: type inference failed for: r4v24 */
    /* JADX WARNING: type inference failed for: r12v7 */
    /* JADX WARNING: type inference failed for: r10v6 */
    /* JADX WARNING: type inference failed for: r4v25 */
    /* JADX WARNING: type inference failed for: r12v10 */
    /* JADX WARNING: type inference failed for: r10v8 */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r4v26 */
    /* JADX WARNING: type inference failed for: r10v9 */
    /* JADX WARNING: type inference failed for: r25v0 */
    /* JADX WARNING: type inference failed for: r7v6 */
    /* JADX WARNING: type inference failed for: r25v1 */
    /* JADX WARNING: type inference failed for: r25v2 */
    /* JADX WARNING: type inference failed for: r25v3 */
    /* JADX WARNING: type inference failed for: r8v38 */
    /* JADX WARNING: type inference failed for: r7v9 */
    /* JADX WARNING: type inference failed for: r25v4 */
    /* JADX WARNING: type inference failed for: r2v38, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r5v23, types: [int] */
    /* JADX WARNING: type inference failed for: r2v39, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r2v40, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r5v26, types: [int] */
    /* JADX WARNING: type inference failed for: r25v5 */
    /* JADX WARNING: type inference failed for: r25v6 */
    /* JADX WARNING: type inference failed for: r1v62, types: [int] */
    /* JADX WARNING: type inference failed for: r2v41, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r7v15 */
    /* JADX WARNING: type inference failed for: r7v16 */
    /* JADX WARNING: type inference failed for: r10v16 */
    /* JADX WARNING: type inference failed for: r7v17 */
    /* JADX WARNING: type inference failed for: r10v17 */
    /* JADX WARNING: type inference failed for: r10v18 */
    /* JADX WARNING: type inference failed for: r10v19, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r10v20 */
    /* JADX WARNING: type inference failed for: r10v21, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r10v22 */
    /* JADX WARNING: type inference failed for: r4v31 */
    /* JADX WARNING: type inference failed for: r10v23 */
    /* JADX WARNING: type inference failed for: r10v24, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r10v25 */
    /* JADX WARNING: type inference failed for: r10v26, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r5v28 */
    /* JADX WARNING: type inference failed for: r10v27 */
    /* JADX WARNING: type inference failed for: r5v29, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r10v28 */
    /* JADX WARNING: type inference failed for: r5v30 */
    /* JADX WARNING: type inference failed for: r10v29 */
    /* JADX WARNING: type inference failed for: r5v31 */
    /* JADX WARNING: type inference failed for: r10v30 */
    /* JADX WARNING: type inference failed for: r5v32, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r5v33, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r5v34 */
    /* JADX WARNING: type inference failed for: r5v35 */
    /* JADX WARNING: type inference failed for: r5v36, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r5v37, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r5v38 */
    /* JADX WARNING: type inference failed for: r5v39, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r10v31 */
    /* JADX WARNING: type inference failed for: r5v40 */
    /* JADX WARNING: type inference failed for: r10v32 */
    /* JADX WARNING: type inference failed for: r5v41, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r10v33 */
    /* JADX WARNING: type inference failed for: r5v42, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r5v43, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r10v34 */
    /* JADX WARNING: type inference failed for: r5v44 */
    /* JADX WARNING: type inference failed for: r1v86, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r10v35 */
    /* JADX WARNING: type inference failed for: r10v36 */
    /* JADX WARNING: type inference failed for: r7v25 */
    /* JADX WARNING: type inference failed for: r6v42 */
    /* JADX WARNING: type inference failed for: r4v45, types: [int] */
    /* JADX WARNING: type inference failed for: r6v43 */
    /* JADX WARNING: type inference failed for: r12v50 */
    /* JADX WARNING: type inference failed for: r4v46 */
    /* JADX WARNING: type inference failed for: r7v28 */
    /* JADX WARNING: type inference failed for: r8v50 */
    /* JADX WARNING: type inference failed for: r5v46 */
    /* JADX WARNING: type inference failed for: r8v51 */
    /* JADX WARNING: type inference failed for: r8v52 */
    /* JADX WARNING: type inference failed for: r8v53 */
    /* JADX WARNING: type inference failed for: r8v54 */
    /* JADX WARNING: type inference failed for: r8v55 */
    /* JADX WARNING: type inference failed for: r8v56 */
    /* JADX WARNING: type inference failed for: r8v57 */
    /* JADX WARNING: type inference failed for: r8v58 */
    /* JADX WARNING: type inference failed for: r8v59 */
    /* JADX WARNING: type inference failed for: r8v60 */
    /* JADX WARNING: type inference failed for: r8v61 */
    /* JADX WARNING: type inference failed for: r8v62 */
    /* JADX WARNING: type inference failed for: r8v63 */
    /* JADX WARNING: type inference failed for: r8v64 */
    /* JADX WARNING: type inference failed for: r8v65 */
    /* JADX WARNING: type inference failed for: r8v66 */
    /* JADX WARNING: type inference failed for: r8v67 */
    /* JADX WARNING: type inference failed for: r8v68 */
    /* JADX WARNING: type inference failed for: r8v69 */
    /* JADX WARNING: type inference failed for: r5v47 */
    /* JADX WARNING: type inference failed for: r5v48 */
    /* JADX WARNING: type inference failed for: r5v49 */
    /* JADX WARNING: type inference failed for: r5v50 */
    /* JADX WARNING: type inference failed for: r5v51 */
    /* JADX WARNING: type inference failed for: r5v52 */
    /* JADX WARNING: type inference failed for: r5v53 */
    /* JADX WARNING: type inference failed for: r5v54 */
    /* JADX WARNING: type inference failed for: r5v55 */
    /* JADX WARNING: type inference failed for: r5v56 */
    /* JADX WARNING: type inference failed for: r5v57 */
    /* JADX WARNING: type inference failed for: r4v47 */
    /* JADX WARNING: type inference failed for: r10v38 */
    /* JADX WARNING: type inference failed for: r25v7 */
    /* JADX WARNING: type inference failed for: r25v8 */
    /* JADX WARNING: type inference failed for: r10v39 */
    /* JADX WARNING: type inference failed for: r10v40 */
    /* JADX WARNING: type inference failed for: r10v41 */
    /* JADX WARNING: type inference failed for: r10v42 */
    /* JADX WARNING: type inference failed for: r10v43 */
    /* JADX WARNING: type inference failed for: r10v44 */
    /* JADX WARNING: type inference failed for: r10v45 */
    /* JADX WARNING: type inference failed for: r10v46 */
    /* JADX WARNING: type inference failed for: r10v47 */
    /* JADX WARNING: type inference failed for: r10v48 */
    /* JADX WARNING: type inference failed for: r10v49 */
    /* JADX WARNING: type inference failed for: r5v58 */
    /* JADX WARNING: type inference failed for: r5v59 */
    /* JADX WARNING: type inference failed for: r5v60 */
    /* JADX WARNING: type inference failed for: r5v61 */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x025e, code lost:
        r7 = r7 + 8;
        r10 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0261, code lost:
        r8 = r8 | r19;
        r10 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0264, code lost:
        r7 = r6;
        r10 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0266, code lost:
        r2 = r7;
        r27 = r9;
        r28 = r12;
        r19 = r13;
        r10 = r20;
        r7 = r6;
        r6 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x04f1, code lost:
        r1 = r0;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x053b, code lost:
        r19 = r6;
        r20 = r8;
        r6 = r4;
        r8 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0572, code lost:
        r1 = r11.f9001c;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x05d1, code lost:
        r1 = java.lang.Long.valueOf(r1);
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x05e6, code lost:
        r2 = r2 + 4;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x05f9, code lost:
        r2 = r2 + 8;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009d, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x013c, code lost:
        r20 = r10;
        r10 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0158, code lost:
        r0 = true;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x019c, code lost:
        r4 = r11.f9001c;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x019e, code lost:
        r9.putObject(r14, r2, r4);
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01d5, code lost:
        r8 = r8 | r19;
        r20 = r10;
        r10 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01dd, code lost:
        r20 = r10;
        r10 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01fc, code lost:
        r20 = r10;
        r10 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0211, code lost:
        r9.putInt(r14, r2, r1);
        r10 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0226, code lost:
        r9.putLong(r32, r2, r4);
        r8 = r8 | r19;
        r0 = r7;
        r10 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0230, code lost:
        r3 = r36;
        r4 = r6;
        r10 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x024a, code lost:
        r0 = r7;
        r10 = r10;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r0v11, types: [int, byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte[], code=null, for r33v0, types: [byte[]] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r12v2
      assigns: []
      uses: []
      mth insns count: 770
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
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0384 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0397  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x062c  */
    /* JADX WARNING: Unknown variable types count: 78 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo9935a(T r32, byte[] r33, int r34, int r35, int r36, p213q.p217b.p301c.p302a.p311j0.p312a.C3612e r37) {
        /*
            r31 = this;
            r15 = r31
            r14 = r32
            r12 = r33
            r13 = r35
            r11 = r37
            sun.misc.Unsafe r9 = f9178s
            r16 = 0
            r0 = -1
            r1 = -1
            r3 = r36
            r10 = r1
            r2 = r16
            r4 = r2
            r8 = r4
            r1 = r0
            r0 = r34
        L_0x001a:
            if (r0 >= r13) goto L_0x065a
            int r4 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002b
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5153a(r0, r12, r4, r11)
            int r4 = r11.f8999a
            r7 = r0
            r6 = r4
            goto L_0x002d
        L_0x002b:
            r6 = r0
            r7 = r4
        L_0x002d:
            int r5 = r6 >>> 3
            r4 = r6 & 7
            if (r5 <= r1) goto L_0x0044
            int r2 = r2 / 3
            int r0 = r15.f9181c
            if (r5 < r0) goto L_0x0042
            int r0 = r15.f9182d
            if (r5 > r0) goto L_0x0042
            int r0 = r15.mo9931a(r5, r2)
            goto L_0x0048
        L_0x0042:
            r0 = -1
            goto L_0x0048
        L_0x0044:
            int r0 = r15.mo9958d(r5)
        L_0x0048:
            r2 = r0
            r17 = 0
            r0 = -1
            if (r2 != r0) goto L_0x005a
            r0 = 1
            r19 = r5
            r2 = r7
            r27 = r9
            r28 = r16
            r7 = r6
            r6 = r3
            goto L_0x0382
        L_0x005a:
            int[] r0 = r15.f9179a
            int r1 = r2 + 1
            r3 = r0[r1]
            int r1 = m8923g(r3)
            long r12 = m8921f(r3)
            r0 = 17
            if (r1 > r0) goto L_0x0274
            int[] r0 = r15.f9179a
            int r19 = r2 + 2
            r0 = r0[r19]
            int r19 = r0 >>> 20
            r20 = 1
            int r19 = r20 << r19
            r20 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r20
            r34 = r3
            if (r0 == r10) goto L_0x0091
            r3 = -1
            r20 = r12
            if (r10 == r3) goto L_0x008a
            long r12 = (long) r10
            r9.putInt(r14, r12, r8)
        L_0x008a:
            long r12 = (long) r0
            int r8 = r9.getInt(r14, r12)
            r10 = r0
            goto L_0x0093
        L_0x0091:
            r20 = r12
        L_0x0093:
            r0 = 5
            switch(r1) {
                case 0: goto L_0x024c;
                case 1: goto L_0x0235;
                case 2: goto L_0x0215;
                case 3: goto L_0x0215;
                case 4: goto L_0x0201;
                case 5: goto L_0x01e2;
                case 6: goto L_0x01c4;
                case 7: goto L_0x01a2;
                case 8: goto L_0x0182;
                case 9: goto L_0x015b;
                case 10: goto L_0x0141;
                case 11: goto L_0x0201;
                case 12: goto L_0x0110;
                case 13: goto L_0x01c4;
                case 14: goto L_0x01e2;
                case 15: goto L_0x00fd;
                case 16: goto L_0x00e0;
                case 17: goto L_0x00a0;
                default: goto L_0x0097;
            }
        L_0x0097:
            r12 = r2
            r13 = r5
            r20 = r10
            r10 = r33
        L_0x009d:
            r0 = 1
            goto L_0x0266
        L_0x00a0:
            r0 = 3
            if (r4 != r0) goto L_0x00da
            int r0 = r5 << 3
            r4 = r0 | 4
            q.b.c.a.j0.a.g1 r0 = r15.mo9956c(r2)
            r1 = r33
            r12 = r2
            r2 = r7
            r3 = r35
            r13 = r5
            r5 = r37
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5164a(r0, r1, r2, r3, r4, r5)
            r1 = r8 & r19
            if (r1 != 0) goto L_0x00c2
            java.lang.Object r1 = r11.f9001c
            r3 = r1
            r1 = r20
            goto L_0x00ce
        L_0x00c2:
            r1 = r20
            java.lang.Object r3 = r9.getObject(r14, r1)
            java.lang.Object r4 = r11.f9001c
            java.lang.Object r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.m8165a(r3, r4)
        L_0x00ce:
            r9.putObject(r14, r1, r3)
            r1 = r8 | r19
            r8 = r1
            r20 = r10
            r10 = r33
            goto L_0x0264
        L_0x00da:
            r12 = r2
            r13 = r5
            r5 = r33
            goto L_0x0158
        L_0x00e0:
            r12 = r2
            r13 = r5
            r1 = r20
            r5 = r33
            if (r4 != 0) goto L_0x0158
            r2 = r1
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5329e(r5, r7, r11)
            r34 = r0
            long r0 = r11.f9000b
            long r0 = p213q.p217b.p301c.p302a.p311j0.p312a.C3656k.m8444a(r0)
            r7 = r34
            r20 = r10
            r10 = r5
            r4 = r0
            goto L_0x0226
        L_0x00fd:
            r12 = r2
            r13 = r5
            r2 = r20
            r5 = r33
            if (r4 != 0) goto L_0x0158
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5322d(r5, r7, r11)
            int r1 = r11.f8999a
            int r1 = p213q.p217b.p301c.p302a.p311j0.p312a.C3656k.m8448e(r1)
            goto L_0x013c
        L_0x0110:
            r12 = r2
            r13 = r5
            r2 = r20
            r5 = r33
            if (r4 != 0) goto L_0x0158
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5322d(r5, r7, r11)
            int r1 = r11.f8999a
            q.b.c.a.j0.a.b0$e r4 = r15.mo9937a(r12)
            if (r4 == 0) goto L_0x013c
            boolean r4 = r4.isInRange(r1)
            if (r4 == 0) goto L_0x012b
            goto L_0x013c
        L_0x012b:
            q.b.c.a.j0.a.n1 r2 = m8924g(r32)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.mo9859a(r6, r1)
            r20 = r10
            r10 = r5
            goto L_0x0264
        L_0x013c:
            r20 = r10
            r10 = r5
            goto L_0x0211
        L_0x0141:
            r12 = r2
            r13 = r5
            r2 = r20
            r5 = r33
            r0 = 2
            if (r4 != r0) goto L_0x0158
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5169a(r5, r7, r11)
            java.lang.Object r1 = r11.f9001c
            r9.putObject(r14, r2, r1)
            r20 = r10
            r10 = r5
            goto L_0x0261
        L_0x0158:
            r0 = 1
            goto L_0x01fc
        L_0x015b:
            r12 = r2
            r13 = r5
            r2 = r20
            r5 = r33
            r0 = 2
            if (r4 != r0) goto L_0x017e
            q.b.c.a.j0.a.g1 r0 = r15.mo9956c(r12)
            r1 = r35
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5165a(r0, r5, r7, r1, r11)
            r4 = r8 & r19
            if (r4 != 0) goto L_0x0173
            goto L_0x019c
        L_0x0173:
            java.lang.Object r4 = r9.getObject(r14, r2)
            java.lang.Object r7 = r11.f9001c
            java.lang.Object r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.m8165a(r4, r7)
            goto L_0x019e
        L_0x017e:
            r1 = r35
            goto L_0x01dd
        L_0x0182:
            r1 = r35
            r12 = r2
            r13 = r5
            r2 = r20
            r5 = r33
            r0 = 2
            if (r4 != r0) goto L_0x01dd
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r34 & r0
            if (r0 != 0) goto L_0x0198
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5276b(r5, r7, r11)
            goto L_0x019c
        L_0x0198:
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5306c(r5, r7, r11)
        L_0x019c:
            java.lang.Object r4 = r11.f9001c
        L_0x019e:
            r9.putObject(r14, r2, r4)
            goto L_0x01d5
        L_0x01a2:
            r1 = r35
            r12 = r2
            r13 = r5
            r2 = r20
            r5 = r33
            if (r4 != 0) goto L_0x01dd
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5329e(r5, r7, r11)
            r34 = r0
            long r0 = r11.f9000b
            int r0 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r0 == 0) goto L_0x01ba
            r0 = 1
            goto L_0x01bc
        L_0x01ba:
            r0 = r16
        L_0x01bc:
            q.b.c.a.j0.a.q1$e r1 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.f9140f
            r1.mo9896a(r14, r2, r0)
            r0 = r34
            goto L_0x01d5
        L_0x01c4:
            r12 = r2
            r13 = r5
            r2 = r20
            r5 = r33
            if (r4 != r0) goto L_0x01dd
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5273b(r5, r7)
            r9.putInt(r14, r2, r0)
            int r0 = r7 + 4
        L_0x01d5:
            r1 = r8 | r19
            r8 = r1
            r20 = r10
            r10 = r5
            goto L_0x0230
        L_0x01dd:
            r20 = r10
            r10 = r5
            goto L_0x009d
        L_0x01e2:
            r12 = r2
            r13 = r5
            r2 = r20
            r5 = r33
            r0 = 1
            if (r4 != r0) goto L_0x01fc
            long r17 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5307c(r5, r7)
            r0 = r9
            r1 = r32
            r20 = r10
            r10 = r5
            r4 = r17
            r0.putLong(r1, r2, r4)
            goto L_0x025e
        L_0x01fc:
            r20 = r10
            r10 = r5
            goto L_0x0266
        L_0x0201:
            r12 = r2
            r13 = r5
            r2 = r20
            r20 = r10
            r10 = r33
            if (r4 != 0) goto L_0x009d
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5322d(r10, r7, r11)
            int r1 = r11.f8999a
        L_0x0211:
            r9.putInt(r14, r2, r1)
            goto L_0x0261
        L_0x0215:
            r12 = r2
            r13 = r5
            r2 = r20
            r20 = r10
            r10 = r33
            if (r4 != 0) goto L_0x009d
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5329e(r10, r7, r11)
            long r4 = r11.f9000b
            r7 = r0
        L_0x0226:
            r0 = r9
            r1 = r32
            r0.putLong(r1, r2, r4)
            r0 = r8 | r19
            r8 = r0
            r0 = r7
        L_0x0230:
            r3 = r36
            r4 = r6
            goto L_0x02ba
        L_0x0235:
            r12 = r2
            r13 = r5
            r2 = r20
            r20 = r10
            r10 = r33
            if (r4 != r0) goto L_0x009d
            float r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5317d(r10, r7)
            q.b.c.a.j0.a.q1$e r1 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.f9140f
            r1.mo9895a(r14, r2, r0)
            int r7 = r7 + 4
        L_0x024a:
            r0 = r7
            goto L_0x0261
        L_0x024c:
            r12 = r2
            r13 = r5
            r2 = r20
            r20 = r10
            r10 = r33
            r0 = 1
            if (r4 != r0) goto L_0x0266
            double r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5140a(r10, r7)
            p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8809a(r14, r2, r0)
        L_0x025e:
            int r7 = r7 + 8
            goto L_0x024a
        L_0x0261:
            r1 = r8 | r19
            r8 = r1
        L_0x0264:
            r7 = r6
            goto L_0x02b7
        L_0x0266:
            r2 = r7
            r27 = r9
            r28 = r12
            r19 = r13
            r10 = r20
            r7 = r6
            r6 = r36
            goto L_0x0382
        L_0x0274:
            r34 = r3
            r20 = r10
            r10 = r33
            r29 = r12
            r12 = r2
            r13 = r5
            r2 = r29
            r0 = 27
            if (r1 != r0) goto L_0x02d1
            r0 = 2
            if (r4 != r0) goto L_0x02c3
            java.lang.Object r0 = r9.getObject(r14, r2)
            q.b.c.a.j0.a.b0$i r0 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.C3603i) r0
            boolean r1 = r0.mo9531s()
            if (r1 != 0) goto L_0x02a5
            int r1 = r0.size()
            if (r1 != 0) goto L_0x029c
            r1 = 10
            goto L_0x029e
        L_0x029c:
            int r1 = r1 * 2
        L_0x029e:
            q.b.c.a.j0.a.b0$i r0 = r0.mo9516b(r1)
            r9.putObject(r14, r2, r0)
        L_0x02a5:
            r5 = r0
            q.b.c.a.j0.a.g1 r0 = r15.mo9956c(r12)
            r1 = r6
            r2 = r33
            r3 = r7
            r4 = r35
            r7 = r6
            r6 = r37
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5163a(r0, r1, r2, r3, r4, r5, r6)
        L_0x02b7:
            r3 = r36
            r4 = r7
        L_0x02ba:
            r2 = r12
            r1 = r13
            r13 = r35
            r12 = r10
            r10 = r20
            goto L_0x001a
        L_0x02c3:
            r0 = 1
            r25 = r6
            r15 = r7
            r26 = r8
            r27 = r9
            r28 = r12
            r19 = r13
            goto L_0x032c
        L_0x02d1:
            r0 = 49
            r5 = r34
            if (r1 > r0) goto L_0x030d
            r19 = r9
            long r9 = (long) r5
            r21 = 1
            r0 = r31
            r5 = r1
            r1 = r32
            r22 = r2
            r2 = r33
            r3 = r7
            r34 = r4
            r4 = r35
            r24 = r5
            r5 = r6
            r25 = r6
            r6 = r13
            r15 = r7
            r7 = r34
            r26 = r8
            r8 = r12
            r27 = r19
            r11 = r24
            r28 = r12
            r19 = r13
            r12 = r22
            r14 = r37
            int r0 = r0.mo9933a((T) r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x030a
            goto L_0x035e
        L_0x030a:
            r7 = r0
            goto L_0x0377
        L_0x030d:
            r24 = r1
            r22 = r2
            r34 = r4
            r25 = r6
            r15 = r7
            r26 = r8
            r27 = r9
            r28 = r12
            r19 = r13
            r9 = 0
            r14 = 1
            r0 = 50
            r10 = r24
            if (r10 != r0) goto L_0x0341
            r0 = 2
            r7 = r34
            if (r7 == r0) goto L_0x032e
            r0 = r14
        L_0x032c:
            r7 = r15
            goto L_0x0379
        L_0x032e:
            r0 = r31
            r1 = r32
            r2 = r33
            r3 = r15
            r4 = r35
            r5 = r28
            r6 = r22
            r8 = r37
            r0.mo9934a(r1, r2, r3, r4, r5, r6, r8)
            throw r9
        L_0x0341:
            r7 = r34
            r0 = r31
            r1 = r32
            r2 = r33
            r8 = r5
            r3 = r15
            r4 = r35
            r5 = r25
            r6 = r19
            r9 = r10
            r10 = r22
            r12 = r28
            r13 = r37
            int r0 = r0.mo9932a((T) r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x0374
        L_0x035e:
            r9 = r31
            r14 = r32
            r8 = r33
            r6 = r35
            r3 = r36
            r11 = r37
            r12 = r19
            r10 = r20
            r7 = r25
        L_0x0370:
            r2 = r28
            goto L_0x064f
        L_0x0374:
            r7 = r0
            r21 = r14
        L_0x0377:
            r0 = r21
        L_0x0379:
            r6 = r36
            r2 = r7
            r10 = r20
            r7 = r25
            r8 = r26
        L_0x0382:
            if (r7 != r6) goto L_0x0391
            if (r6 == 0) goto L_0x0391
            r0 = -1
            r9 = r31
            r14 = r32
            r3 = r6
            r4 = r7
            r6 = r35
            goto L_0x0665
        L_0x0391:
            r9 = r31
            boolean r1 = r9.f9184f
            if (r1 == 0) goto L_0x062c
            r11 = r37
            q.b.c.a.j0.a.r r1 = r11.f9002d
            q.b.c.a.j0.a.r r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3697r.m8878a()
            if (r1 == r3) goto L_0x0629
            q.b.c.a.j0.a.s0 r1 = r9.f9183e
            q.b.c.a.j0.a.m1<?, ?> r3 = r9.f9193o
            q.b.c.a.j0.a.r r4 = r11.f9002d
            java.util.Map<q.b.c.a.j0.a.r$a, q.b.c.a.j0.a.z$f<?, ?>> r4 = r4.f9149a
            q.b.c.a.j0.a.r$a r5 = new q.b.c.a.j0.a.r$a
            r12 = r19
            r5.<init>(r1, r12)
            java.lang.Object r1 = r4.get(r5)
            r13 = r1
            q.b.c.a.j0.a.z$f r13 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3737f) r13
            if (r13 != 0) goto L_0x03d4
            q.b.c.a.j0.a.n1 r4 = m8924g(r32)
            r0 = r7
            r1 = r33
            r3 = r35
            r5 = r37
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5151a(r0, r1, r2, r3, r4, r5)
            r14 = r32
            r19 = r6
            r20 = r8
            r8 = r33
            r6 = r35
            goto L_0x0649
        L_0x03d4:
            r14 = r32
            r1 = r14
            q.b.c.a.j0.a.z$c r1 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3734c) r1
            r1.mo10011a()
            q.b.c.a.j0.a.v<q.b.c.a.j0.a.z$e> r15 = r1.f9286e
            q.b.c.a.j0.a.z$e r4 = r13.f9294c
            boolean r5 = r4.f9290h
            if (r5 == 0) goto L_0x04a3
            boolean r5 = r4.f9291i
            if (r5 == 0) goto L_0x04a3
            q.b.c.a.j0.a.t1 r0 = r4.f9289g
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x0484;
                case 1: goto L_0x0478;
                case 2: goto L_0x046c;
                case 3: goto L_0x046c;
                case 4: goto L_0x0460;
                case 5: goto L_0x0454;
                case 6: goto L_0x0448;
                case 7: goto L_0x043c;
                case 8: goto L_0x03f1;
                case 9: goto L_0x03f1;
                case 10: goto L_0x03f1;
                case 11: goto L_0x03f1;
                case 12: goto L_0x0460;
                case 13: goto L_0x0417;
                case 14: goto L_0x0448;
                case 15: goto L_0x0454;
                case 16: goto L_0x040a;
                case 17: goto L_0x03fd;
                default: goto L_0x03f1;
            }
        L_0x03f1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Type cannot be packed: "
            java.lang.StringBuilder r1 = p213q.p214a.p215a.p216a.C1965a.m4756a(r1)
            q.b.c.a.j0.a.z$e r2 = r13.f9294c
            goto L_0x0496
        L_0x03fd:
            q.b.c.a.j0.a.j0 r0 = new q.b.c.a.j0.a.j0
            r0.<init>()
            r5 = r33
            int r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5342g(r5, r2, r0, r11)
            goto L_0x048f
        L_0x040a:
            r5 = r33
            q.b.c.a.j0.a.a0 r0 = new q.b.c.a.j0.a.a0
            r0.<init>()
            int r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5337f(r5, r2, r0, r11)
            goto L_0x048f
        L_0x0417:
            r5 = r33
            q.b.c.a.j0.a.a0 r0 = new q.b.c.a.j0.a.a0
            r0.<init>()
            int r2 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5347h(r5, r2, r0, r11)
            q.b.c.a.j0.a.n1 r4 = r1.unknownFields
            r34 = r2
            q.b.c.a.j0.a.n1 r2 = p213q.p217b.p301c.p302a.p311j0.p312a.C3680n1.f9117f
            if (r4 != r2) goto L_0x042b
            r4 = 0
        L_0x042b:
            q.b.c.a.j0.a.z$e r2 = r13.f9294c
            q.b.c.a.j0.a.b0$d<?> r2 = r2.f9287e
            java.lang.Object r2 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8341a(r12, r0, r2, r4, r3)
            q.b.c.a.j0.a.n1 r2 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3680n1) r2
            if (r2 == 0) goto L_0x0439
            r1.unknownFields = r2
        L_0x0439:
            r1 = r34
            goto L_0x048f
        L_0x043c:
            r5 = r33
            q.b.c.a.j0.a.g r0 = new q.b.c.a.j0.a.g
            r0.<init>()
            int r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5168a(r5, r2, r0, r11)
            goto L_0x048f
        L_0x0448:
            r5 = r33
            q.b.c.a.j0.a.a0 r0 = new q.b.c.a.j0.a.a0
            r0.<init>()
            int r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5305c(r5, r2, r0, r11)
            goto L_0x048f
        L_0x0454:
            r5 = r33
            q.b.c.a.j0.a.j0 r0 = new q.b.c.a.j0.a.j0
            r0.<init>()
            int r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5321d(r5, r2, r0, r11)
            goto L_0x048f
        L_0x0460:
            r5 = r33
            q.b.c.a.j0.a.a0 r0 = new q.b.c.a.j0.a.a0
            r0.<init>()
            int r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5347h(r5, r2, r0, r11)
            goto L_0x048f
        L_0x046c:
            r5 = r33
            q.b.c.a.j0.a.j0 r0 = new q.b.c.a.j0.a.j0
            r0.<init>()
            int r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5351i(r5, r2, r0, r11)
            goto L_0x048f
        L_0x0478:
            r5 = r33
            q.b.c.a.j0.a.x r0 = new q.b.c.a.j0.a.x
            r0.<init>()
            int r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5328e(r5, r2, r0, r11)
            goto L_0x048f
        L_0x0484:
            r5 = r33
            q.b.c.a.j0.a.o r0 = new q.b.c.a.j0.a.o
            r0.<init>()
            int r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5275b(r5, r2, r0, r11)
        L_0x048f:
            q.b.c.a.j0.a.z$e r2 = r13.f9294c
            r15.mo9968b(r2, r0)
            r0 = r1
            goto L_0x04d0
        L_0x0496:
            q.b.c.a.j0.a.t1 r2 = r2.f9289g
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x04a3:
            r5 = r33
            q.b.c.a.j0.a.z$e r4 = r13.f9294c
            q.b.c.a.j0.a.t1 r4 = r4.f9289g
            r34 = r0
            q.b.c.a.j0.a.t1 r0 = p213q.p217b.p301c.p302a.p311j0.p312a.C3711t1.ENUM
            if (r4 != r0) goto L_0x04e2
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5322d(r5, r2, r11)
            q.b.c.a.j0.a.z$e r2 = r13.f9294c
            q.b.c.a.j0.a.b0$d<?> r2 = r2.f9287e
            int r4 = r11.f8999a
            q.b.c.a.j0.a.b0$c r2 = r2.findValueByNumber(r4)
            if (r2 != 0) goto L_0x04d9
            q.b.c.a.j0.a.n1 r2 = r1.unknownFields
            q.b.c.a.j0.a.n1 r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3680n1.f9117f
            if (r2 != r4) goto L_0x04cb
            q.b.c.a.j0.a.n1 r2 = p213q.p217b.p301c.p302a.p311j0.p312a.C3680n1.m8772c()
            r1.unknownFields = r2
        L_0x04cb:
            int r1 = r11.f8999a
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8340a(r12, r1, r2, r3)
        L_0x04d0:
            r19 = r6
            r20 = r8
            r6 = r35
            r8 = r5
            goto L_0x0649
        L_0x04d9:
            r19 = r6
            r20 = r8
            r6 = r35
            r8 = r5
            goto L_0x05bd
        L_0x04e2:
            int r0 = r4.ordinal()
            switch(r0) {
                case 0: goto L_0x05ea;
                case 1: goto L_0x05d7;
                case 2: goto L_0x05c4;
                case 3: goto L_0x05c4;
                case 4: goto L_0x05b2;
                case 5: goto L_0x05a2;
                case 6: goto L_0x0592;
                case 7: goto L_0x0576;
                case 8: goto L_0x0567;
                case 9: goto L_0x0542;
                case 10: goto L_0x0529;
                case 11: goto L_0x0522;
                case 12: goto L_0x05b2;
                case 13: goto L_0x051a;
                case 14: goto L_0x0592;
                case 15: goto L_0x05a2;
                case 16: goto L_0x0507;
                case 17: goto L_0x04f4;
                default: goto L_0x04e9;
            }
        L_0x04e9:
            r19 = r6
            r20 = r8
            r6 = r35
            r8 = r5
            r0 = 0
        L_0x04f1:
            r1 = r0
            goto L_0x05fd
        L_0x04f4:
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5329e(r5, r2, r11)
            long r1 = r11.f9000b
            long r1 = p213q.p217b.p301c.p302a.p311j0.p312a.C3656k.m8444a(r1)
            r19 = r6
            r20 = r8
            r6 = r35
            r8 = r5
            goto L_0x05d1
        L_0x0507:
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5322d(r5, r2, r11)
            int r1 = r11.f8999a
            int r1 = p213q.p217b.p301c.p302a.p311j0.p312a.C3656k.m8448e(r1)
            r19 = r6
            r20 = r8
            r6 = r35
            r8 = r5
            goto L_0x05bf
        L_0x051a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Shouldn't reach here."
            r0.<init>(r1)
            throw r0
        L_0x0522:
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5169a(r5, r2, r11)
            r4 = r35
            goto L_0x053b
        L_0x0529:
            q.b.c.a.j0.a.c1 r0 = p213q.p217b.p301c.p302a.p311j0.p312a.C3608c1.f8978c
            q.b.c.a.j0.a.s0 r1 = r13.f9293b
            java.lang.Class r1 = r1.getClass()
            q.b.c.a.j0.a.g1 r0 = r0.mo9537a(r1)
            r4 = r35
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5165a(r0, r5, r2, r4, r11)
        L_0x053b:
            r19 = r6
            r20 = r8
            r6 = r4
            r8 = r5
            goto L_0x0572
        L_0x0542:
            r4 = r35
            int r0 = r12 << 3
            r17 = r0 | 4
            q.b.c.a.j0.a.c1 r0 = p213q.p217b.p301c.p302a.p311j0.p312a.C3608c1.f8978c
            q.b.c.a.j0.a.s0 r1 = r13.f9293b
            java.lang.Class r1 = r1.getClass()
            q.b.c.a.j0.a.g1 r0 = r0.mo9537a(r1)
            r1 = r33
            r3 = r35
            r19 = r6
            r6 = r4
            r4 = r17
            r20 = r8
            r8 = r5
            r5 = r37
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5164a(r0, r1, r2, r3, r4, r5)
            goto L_0x0572
        L_0x0567:
            r19 = r6
            r20 = r8
            r6 = r35
            r8 = r5
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5276b(r8, r2, r11)
        L_0x0572:
            java.lang.Object r1 = r11.f9001c
            goto L_0x05fe
        L_0x0576:
            r19 = r6
            r20 = r8
            r6 = r35
            r8 = r5
            int r2 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5329e(r8, r2, r11)
            long r0 = r11.f9000b
            int r0 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r0 == 0) goto L_0x058a
            r0 = r34
            goto L_0x058c
        L_0x058a:
            r0 = r16
        L_0x058c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x04f1
        L_0x0592:
            r19 = r6
            r20 = r8
            r6 = r35
            r8 = r5
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5273b(r8, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x05e6
        L_0x05a2:
            r19 = r6
            r20 = r8
            r6 = r35
            r8 = r5
            long r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5307c(r8, r2)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x05f9
        L_0x05b2:
            r19 = r6
            r20 = r8
            r6 = r35
            r8 = r5
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5322d(r8, r2, r11)
        L_0x05bd:
            int r1 = r11.f8999a
        L_0x05bf:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x05d5
        L_0x05c4:
            r19 = r6
            r20 = r8
            r6 = r35
            r8 = r5
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5329e(r8, r2, r11)
            long r1 = r11.f9000b
        L_0x05d1:
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
        L_0x05d5:
            r2 = r0
            goto L_0x05fd
        L_0x05d7:
            r19 = r6
            r20 = r8
            r6 = r35
            r8 = r5
            float r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5317d(r8, r2)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L_0x05e6:
            int r2 = r2 + 4
            goto L_0x04f1
        L_0x05ea:
            r19 = r6
            r20 = r8
            r6 = r35
            r8 = r5
            double r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5140a(r8, r2)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
        L_0x05f9:
            int r2 = r2 + 8
            goto L_0x04f1
        L_0x05fd:
            r0 = r2
        L_0x05fe:
            q.b.c.a.j0.a.z$e r2 = r13.f9294c
            boolean r3 = r2.f9290h
            if (r3 == 0) goto L_0x0608
            r15.mo9965a(r2, r1)
            goto L_0x0649
        L_0x0608:
            q.b.c.a.j0.a.t1 r2 = r2.f9289g
            int r2 = r2.ordinal()
            r3 = 9
            if (r2 == r3) goto L_0x0617
            r3 = 10
            if (r2 == r3) goto L_0x0617
            goto L_0x0623
        L_0x0617:
            q.b.c.a.j0.a.z$e r2 = r13.f9294c
            java.lang.Object r2 = r15.mo9963a(r2)
            if (r2 == 0) goto L_0x0623
            java.lang.Object r1 = p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.m8165a(r2, r1)
        L_0x0623:
            q.b.c.a.j0.a.z$e r2 = r13.f9294c
            r15.mo9968b(r2, r1)
            goto L_0x0649
        L_0x0629:
            r14 = r32
            goto L_0x0630
        L_0x062c:
            r14 = r32
            r11 = r37
        L_0x0630:
            r20 = r8
            r12 = r19
            r8 = r33
            r19 = r6
            r6 = r35
            q.b.c.a.j0.a.n1 r4 = m8924g(r32)
            r0 = r7
            r1 = r33
            r3 = r35
            r5 = r37
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5151a(r0, r1, r2, r3, r4, r5)
        L_0x0649:
            r3 = r19
            r26 = r20
            goto L_0x0370
        L_0x064f:
            r13 = r6
            r4 = r7
            r15 = r9
            r1 = r12
            r9 = r27
            r12 = r8
            r8 = r26
            goto L_0x001a
        L_0x065a:
            r26 = r8
            r27 = r9
            r20 = r10
            r6 = r13
            r9 = r15
            r1 = -1
            r2 = r0
            r0 = r1
        L_0x0665:
            if (r10 == r0) goto L_0x066d
            long r0 = (long) r10
            r5 = r27
            r5.putInt(r14, r0, r8)
        L_0x066d:
            int r0 = r9.f9189k
        L_0x066f:
            int r1 = r9.f9190l
            if (r0 >= r1) goto L_0x0680
            int[] r1 = r9.f9188j
            r1 = r1[r0]
            q.b.c.a.j0.a.m1<?, ?> r5 = r9.f9193o
            r7 = 0
            r9.mo9936a(r14, r1, (UB) r7, r5)
            int r0 = r0 + 1
            goto L_0x066f
        L_0x0680:
            if (r3 != 0) goto L_0x068a
            if (r2 != r6) goto L_0x0685
            goto L_0x068e
        L_0x0685:
            q.b.c.a.j0.a.c0 r0 = p213q.p217b.p301c.p302a.p311j0.p312a.C3606c0.m8180g()
            throw r0
        L_0x068a:
            if (r2 > r6) goto L_0x068f
            if (r4 != r3) goto L_0x068f
        L_0x068e:
            return r2
        L_0x068f:
            q.b.c.a.j0.a.c0 r0 = p213q.p217b.p301c.p302a.p311j0.p312a.C3606c0.m8180g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p301c.p302a.p311j0.p312a.C3717u0.mo9935a(java.lang.Object, byte[], int, int, int, q.b.c.a.j0.a.e):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:120:0x022b, code lost:
        if (r7.f9000b != 0) goto L_0x0248;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x022e, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x022f, code lost:
        r11.mo9624a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0232, code lost:
        if (r1 >= r5) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0234, code lost:
        r4 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5322d(r3, r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x023a, code lost:
        if (r2 == r7.f8999a) goto L_0x023e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x023e, code lost:
        r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5329e(r3, r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0246, code lost:
        if (r7.f9000b == 0) goto L_0x022e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0248, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0110, code lost:
        if (r4 == 0) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0113, code lost:
        r11.add(p213q.p217b.p301c.p302a.p311j0.p312a.C3635j.m8389a(r3, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011b, code lost:
        if (r1 >= r5) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x011d, code lost:
        r4 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5322d(r3, r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0123, code lost:
        if (r2 == r7.f8999a) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0127, code lost:
        r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5322d(r3, r4, r7);
        r4 = r7.f8999a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012d, code lost:
        if (r4 < 0) goto L_0x0140;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0131, code lost:
        if (r4 > (r3.length - r1)) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0133, code lost:
        if (r4 != 0) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0135, code lost:
        r11.add(p213q.p217b.p301c.p302a.p311j0.p312a.C3635j.f9034f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x013f, code lost:
        throw p213q.p217b.p301c.p302a.p311j0.p312a.C3606c0.m8181h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0144, code lost:
        throw p213q.p217b.p301c.p302a.p311j0.p312a.C3606c0.m8179f();
     */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01d8  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo9933a(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, p213q.p217b.p301c.p302a.p311j0.p312a.C3612e r30) {
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
            sun.misc.Unsafe r11 = f9178s
            java.lang.Object r11 = r11.getObject(r1, r9)
            q.b.c.a.j0.a.b0$i r11 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.C3603i) r11
            boolean r12 = r11.mo9531s()
            r13 = 2
            if (r12 != 0) goto L_0x0036
            int r12 = r11.size()
            if (r12 != 0) goto L_0x002c
            r12 = 10
            goto L_0x002d
        L_0x002c:
            int r12 = r12 * r13
        L_0x002d:
            q.b.c.a.j0.a.b0$i r11 = r11.mo9516b(r12)
            sun.misc.Unsafe r12 = f9178s
            r12.putObject(r1, r9, r11)
        L_0x0036:
            r9 = 5
            r10 = 3
            r14 = 0
            r12 = 1
            switch(r27) {
                case 18: goto L_0x02fd;
                case 19: goto L_0x02d6;
                case 20: goto L_0x02b6;
                case 21: goto L_0x02b6;
                case 22: goto L_0x029c;
                case 23: goto L_0x0273;
                case 24: goto L_0x024a;
                case 25: goto L_0x0217;
                case 26: goto L_0x0169;
                case 27: goto L_0x014f;
                case 28: goto L_0x0102;
                case 29: goto L_0x029c;
                case 30: goto L_0x00c6;
                case 31: goto L_0x024a;
                case 32: goto L_0x0273;
                case 33: goto L_0x00a1;
                case 34: goto L_0x007c;
                case 35: goto L_0x02fd;
                case 36: goto L_0x02d6;
                case 37: goto L_0x02b6;
                case 38: goto L_0x02b6;
                case 39: goto L_0x029c;
                case 40: goto L_0x0273;
                case 41: goto L_0x024a;
                case 42: goto L_0x0217;
                case 43: goto L_0x029c;
                case 44: goto L_0x00c6;
                case 45: goto L_0x024a;
                case 46: goto L_0x0273;
                case 47: goto L_0x00a1;
                case 48: goto L_0x007c;
                case 49: goto L_0x0040;
                default: goto L_0x003e;
            }
        L_0x003e:
            goto L_0x0324
        L_0x0040:
            if (r6 != r10) goto L_0x0324
            q.b.c.a.j0.a.g1 r1 = r0.mo9956c(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r22 = r1
            r23 = r18
            r24 = r19
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5164a(r22, r23, r24, r25, r26, r27)
        L_0x005a:
            java.lang.Object r8 = r7.f9001c
            r11.add(r8)
            if (r4 >= r5) goto L_0x0324
            int r8 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5322d(r3, r4, r7)
            int r9 = r7.f8999a
            if (r2 == r9) goto L_0x006b
            goto L_0x0324
        L_0x006b:
            r22 = r1
            r23 = r18
            r24 = r8
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5164a(r22, r23, r24, r25, r26, r27)
            goto L_0x005a
        L_0x007c:
            if (r6 != r13) goto L_0x0084
            int r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5342g(r3, r4, r11, r7)
            goto L_0x0325
        L_0x0084:
            if (r6 != 0) goto L_0x0324
            q.b.c.a.j0.a.j0 r11 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3645j0) r11
        L_0x0088:
            int r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5329e(r3, r4, r7)
            long r8 = r7.f9000b
            long r8 = p213q.p217b.p301c.p302a.p311j0.p312a.C3656k.m8444a(r8)
            r11.mo9679a(r8)
            if (r1 >= r5) goto L_0x0325
            int r4 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5322d(r3, r1, r7)
            int r6 = r7.f8999a
            if (r2 == r6) goto L_0x0088
            goto L_0x0325
        L_0x00a1:
            if (r6 != r13) goto L_0x00a9
            int r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5337f(r3, r4, r11, r7)
            goto L_0x0325
        L_0x00a9:
            if (r6 != 0) goto L_0x0324
            q.b.c.a.j0.a.a0 r11 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3591a0) r11
        L_0x00ad:
            int r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5322d(r3, r4, r7)
            int r4 = r7.f8999a
            int r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3656k.m8448e(r4)
            r11.mo9517e(r4)
            if (r1 >= r5) goto L_0x0325
            int r4 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5322d(r3, r1, r7)
            int r6 = r7.f8999a
            if (r2 == r6) goto L_0x00ad
            goto L_0x0325
        L_0x00c6:
            if (r6 != r13) goto L_0x00cd
            int r2 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5347h(r3, r4, r11, r7)
            goto L_0x00de
        L_0x00cd:
            if (r6 != 0) goto L_0x0324
            r2 = r21
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r11
            r7 = r30
            int r2 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5149a(r2, r3, r4, r5, r6, r7)
        L_0x00de:
            q.b.c.a.j0.a.z r1 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3731z) r1
            q.b.c.a.j0.a.n1 r3 = r1.unknownFields
            q.b.c.a.j0.a.n1 r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3680n1.f9117f
            if (r3 != r4) goto L_0x00e7
            r3 = 0
        L_0x00e7:
            java.lang.Object[] r4 = r0.f9180b
            int r5 = r8 / 3
            int r5 = r5 * r13
            int r5 = r5 + r12
            r4 = r4[r5]
            q.b.c.a.j0.a.b0$e r4 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.C3599e) r4
            q.b.c.a.j0.a.m1<?, ?> r5 = r0.f9193o
            r6 = r22
            java.lang.Object r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8342a(r6, r11, r4, r3, r5)
            q.b.c.a.j0.a.n1 r3 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3680n1) r3
            if (r3 == 0) goto L_0x00ff
            r1.unknownFields = r3
        L_0x00ff:
            r1 = r2
            goto L_0x0325
        L_0x0102:
            if (r6 != r13) goto L_0x0324
            int r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5322d(r3, r4, r7)
            int r4 = r7.f8999a
            if (r4 < 0) goto L_0x014a
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0145
            if (r4 != 0) goto L_0x0113
            goto L_0x0135
        L_0x0113:
            q.b.c.a.j0.a.j r6 = p213q.p217b.p301c.p302a.p311j0.p312a.C3635j.m8389a(r3, r1, r4)
            r11.add(r6)
            int r1 = r1 + r4
        L_0x011b:
            if (r1 >= r5) goto L_0x0325
            int r4 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5322d(r3, r1, r7)
            int r6 = r7.f8999a
            if (r2 == r6) goto L_0x0127
            goto L_0x0325
        L_0x0127:
            int r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5322d(r3, r4, r7)
            int r4 = r7.f8999a
            if (r4 < 0) goto L_0x0140
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x013b
            if (r4 != 0) goto L_0x0113
        L_0x0135:
            q.b.c.a.j0.a.j r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3635j.f9034f
            r11.add(r4)
            goto L_0x011b
        L_0x013b:
            q.b.c.a.j0.a.c0 r1 = p213q.p217b.p301c.p302a.p311j0.p312a.C3606c0.m8181h()
            throw r1
        L_0x0140:
            q.b.c.a.j0.a.c0 r1 = p213q.p217b.p301c.p302a.p311j0.p312a.C3606c0.m8179f()
            throw r1
        L_0x0145:
            q.b.c.a.j0.a.c0 r1 = p213q.p217b.p301c.p302a.p311j0.p312a.C3606c0.m8181h()
            throw r1
        L_0x014a:
            q.b.c.a.j0.a.c0 r1 = p213q.p217b.p301c.p302a.p311j0.p312a.C3606c0.m8179f()
            throw r1
        L_0x014f:
            if (r6 != r13) goto L_0x0324
            q.b.c.a.j0.a.g1 r1 = r0.mo9956c(r8)
            r22 = r1
            r23 = r21
            r24 = r18
            r25 = r19
            r26 = r20
            r27 = r11
            r28 = r30
            int r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5163a(r22, r23, r24, r25, r26, r27, r28)
            goto L_0x0325
        L_0x0169:
            if (r6 != r13) goto L_0x0324
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r25 & r8
            int r1 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            java.lang.String r6 = ""
            if (r1 != 0) goto L_0x01b8
            int r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5322d(r3, r4, r7)
            int r4 = r7.f8999a
            if (r4 < 0) goto L_0x01b3
            if (r4 != 0) goto L_0x0181
            goto L_0x01a2
        L_0x0181:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.f8972a
            r8.<init>(r3, r1, r4, r9)
        L_0x0188:
            r11.add(r8)
            int r1 = r1 + r4
        L_0x018c:
            if (r1 >= r5) goto L_0x0325
            int r4 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5322d(r3, r1, r7)
            int r8 = r7.f8999a
            if (r2 == r8) goto L_0x0198
            goto L_0x0325
        L_0x0198:
            int r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5322d(r3, r4, r7)
            int r4 = r7.f8999a
            if (r4 < 0) goto L_0x01ae
            if (r4 != 0) goto L_0x01a6
        L_0x01a2:
            r11.add(r6)
            goto L_0x018c
        L_0x01a6:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.f8972a
            r8.<init>(r3, r1, r4, r9)
            goto L_0x0188
        L_0x01ae:
            q.b.c.a.j0.a.c0 r1 = p213q.p217b.p301c.p302a.p311j0.p312a.C3606c0.m8179f()
            throw r1
        L_0x01b3:
            q.b.c.a.j0.a.c0 r1 = p213q.p217b.p301c.p302a.p311j0.p312a.C3606c0.m8179f()
            throw r1
        L_0x01b8:
            int r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5322d(r3, r4, r7)
            int r4 = r7.f8999a
            if (r4 < 0) goto L_0x0212
            if (r4 != 0) goto L_0x01c4
        L_0x01c2:
            r8 = r1
            goto L_0x01ec
        L_0x01c4:
            int r8 = r1 + r4
            boolean r9 = p213q.p217b.p301c.p302a.p311j0.p312a.C3700r1.m8888c(r3, r1, r8)
            if (r9 == 0) goto L_0x020d
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.f8972a
            r9.<init>(r3, r1, r4, r10)
        L_0x01d3:
            r11.add(r9)
        L_0x01d6:
            if (r8 >= r5) goto L_0x020a
            int r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5322d(r3, r8, r7)
            int r4 = r7.f8999a
            if (r2 == r4) goto L_0x01e1
            goto L_0x020a
        L_0x01e1:
            int r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5322d(r3, r1, r7)
            int r4 = r7.f8999a
            if (r4 < 0) goto L_0x0205
            if (r4 != 0) goto L_0x01f0
            goto L_0x01c2
        L_0x01ec:
            r11.add(r6)
            goto L_0x01d6
        L_0x01f0:
            int r8 = r1 + r4
            boolean r9 = p213q.p217b.p301c.p302a.p311j0.p312a.C3700r1.m8888c(r3, r1, r8)
            if (r9 == 0) goto L_0x0200
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.f8972a
            r9.<init>(r3, r1, r4, r10)
            goto L_0x01d3
        L_0x0200:
            q.b.c.a.j0.a.c0 r1 = p213q.p217b.p301c.p302a.p311j0.p312a.C3606c0.m8176c()
            throw r1
        L_0x0205:
            q.b.c.a.j0.a.c0 r1 = p213q.p217b.p301c.p302a.p311j0.p312a.C3606c0.m8179f()
            throw r1
        L_0x020a:
            r1 = r8
            goto L_0x0325
        L_0x020d:
            q.b.c.a.j0.a.c0 r1 = p213q.p217b.p301c.p302a.p311j0.p312a.C3606c0.m8176c()
            throw r1
        L_0x0212:
            q.b.c.a.j0.a.c0 r1 = p213q.p217b.p301c.p302a.p311j0.p312a.C3606c0.m8179f()
            throw r1
        L_0x0217:
            if (r6 != r13) goto L_0x021f
            int r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5168a(r3, r4, r11, r7)
            goto L_0x0325
        L_0x021f:
            if (r6 != 0) goto L_0x0324
            q.b.c.a.j0.a.g r11 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3623g) r11
            int r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5329e(r3, r4, r7)
            long r8 = r7.f9000b
            int r4 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r4 == 0) goto L_0x022e
            goto L_0x0248
        L_0x022e:
            r4 = 0
        L_0x022f:
            r11.mo9624a(r4)
            if (r1 >= r5) goto L_0x0325
            int r4 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5322d(r3, r1, r7)
            int r6 = r7.f8999a
            if (r2 == r6) goto L_0x023e
            goto L_0x0325
        L_0x023e:
            int r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5329e(r3, r4, r7)
            long r8 = r7.f9000b
            int r4 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r4 == 0) goto L_0x022e
        L_0x0248:
            r4 = r12
            goto L_0x022f
        L_0x024a:
            if (r6 != r13) goto L_0x0252
            int r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5305c(r3, r4, r11, r7)
            goto L_0x0325
        L_0x0252:
            if (r6 != r9) goto L_0x0324
            q.b.c.a.j0.a.a0 r11 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3591a0) r11
            int r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5273b(r18, r19)
            r11.mo9517e(r1)
        L_0x025d:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x0325
            int r4 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5322d(r3, r1, r7)
            int r6 = r7.f8999a
            if (r2 == r6) goto L_0x026b
            goto L_0x0325
        L_0x026b:
            int r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5273b(r3, r4)
            r11.mo9517e(r1)
            goto L_0x025d
        L_0x0273:
            if (r6 != r13) goto L_0x027b
            int r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5321d(r3, r4, r11, r7)
            goto L_0x0325
        L_0x027b:
            if (r6 != r12) goto L_0x0324
            q.b.c.a.j0.a.j0 r11 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3645j0) r11
            long r8 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5307c(r18, r19)
            r11.mo9679a(r8)
        L_0x0286:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0325
            int r4 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5322d(r3, r1, r7)
            int r6 = r7.f8999a
            if (r2 == r6) goto L_0x0294
            goto L_0x0325
        L_0x0294:
            long r8 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5307c(r3, r4)
            r11.mo9679a(r8)
            goto L_0x0286
        L_0x029c:
            if (r6 != r13) goto L_0x02a4
            int r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5347h(r3, r4, r11, r7)
            goto L_0x0325
        L_0x02a4:
            if (r6 != 0) goto L_0x0324
            r22 = r18
            r23 = r19
            r24 = r20
            r25 = r11
            r26 = r30
            int r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5149a(r21, r22, r23, r24, r25, r26)
            goto L_0x0325
        L_0x02b6:
            if (r6 != r13) goto L_0x02be
            int r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5351i(r3, r4, r11, r7)
            goto L_0x0325
        L_0x02be:
            if (r6 != 0) goto L_0x0324
            q.b.c.a.j0.a.j0 r11 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3645j0) r11
        L_0x02c2:
            int r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5329e(r3, r4, r7)
            long r8 = r7.f9000b
            r11.mo9679a(r8)
            if (r1 >= r5) goto L_0x0325
            int r4 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5322d(r3, r1, r7)
            int r6 = r7.f8999a
            if (r2 == r6) goto L_0x02c2
            goto L_0x0325
        L_0x02d6:
            if (r6 != r13) goto L_0x02dd
            int r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5328e(r3, r4, r11, r7)
            goto L_0x0325
        L_0x02dd:
            if (r6 != r9) goto L_0x0324
            q.b.c.a.j0.a.x r11 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3727x) r11
            float r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5317d(r18, r19)
            r11.mo9983a(r1)
        L_0x02e8:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x0325
            int r4 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5322d(r3, r1, r7)
            int r6 = r7.f8999a
            if (r2 == r6) goto L_0x02f5
            goto L_0x0325
        L_0x02f5:
            float r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5317d(r3, r4)
            r11.mo9983a(r1)
            goto L_0x02e8
        L_0x02fd:
            if (r6 != r13) goto L_0x0304
            int r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5275b(r3, r4, r11, r7)
            goto L_0x0325
        L_0x0304:
            if (r6 != r12) goto L_0x0324
            q.b.c.a.j0.a.o r11 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3681o) r11
            double r8 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5140a(r18, r19)
            r11.mo9865a(r8)
        L_0x030f:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0325
            int r4 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5322d(r3, r1, r7)
            int r6 = r7.f8999a
            if (r2 == r6) goto L_0x031c
            goto L_0x0325
        L_0x031c:
            double r8 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5140a(r3, r4)
            r11.mo9865a(r8)
            goto L_0x030f
        L_0x0324:
            r1 = r4
        L_0x0325:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p301c.p302a.p311j0.p312a.C3717u0.mo9933a(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, q.b.c.a.j0.a.e):int");
    }

    /* renamed from: a */
    public final void mo9940a(Object obj, int i, C3622f1 f1Var) {
        Object obj2;
        long j;
        if ((536870912 & i) != 0) {
            j = m8921f(i);
            obj2 = f1Var.mo9611r();
        } else if (this.f9185g) {
            j = m8921f(i);
            obj2 = f1Var.mo9589g();
        } else {
            j = m8921f(i);
            obj2 = f1Var.mo9599l();
        }
        C3691q1.f9140f.mo9905a(obj, j, obj2);
    }

    /* renamed from: a */
    public final int mo9931a(int i, int i2) {
        int length = (this.f9179a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f9179a[i4];
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

    /* renamed from: a */
    public final <K, V> void mo9944a(C3722v1 v1Var, int i, Object obj, int i2) {
        if (obj != null) {
            this.f9195q.mo9855d(this.f9180b[(i2 / 3) * 2]);
            Map e = this.f9195q.mo9856e(obj);
            C3678n nVar = (C3678n) v1Var;
            if (nVar.f9116a != null) {
                Iterator it = e.entrySet().iterator();
                if (it.hasNext()) {
                    Entry entry = (Entry) it.next();
                    nVar.f9116a.mo9815c(i, 2);
                    entry.getKey();
                    entry.getValue();
                    throw null;
                }
                return;
            }
            throw null;
        }
    }

    /* renamed from: a */
    public final void mo9938a(int i, Object obj, C3722v1 v1Var) {
        if (obj instanceof String) {
            ((C3678n) v1Var).f9116a.mo9802a(i, (String) obj);
            return;
        }
        ((C3678n) v1Var).f9116a.mo9803a(i, (C3635j) obj);
    }

    /* JADX INFO: used method not loaded: q.b.c.a.j0.a.n.a(int, long):null, types can be incorrect */
    /* JADX INFO: used method not loaded: q.b.c.a.j0.a.n.a(int, int):null, types can be incorrect */
    /* JADX INFO: used method not loaded: q.b.c.a.j0.a.m.a(int, long):null, types can be incorrect */
    /* JADX INFO: used method not loaded: q.b.c.a.j0.a.m.a(int, int):null, types can be incorrect */
    /* JADX INFO: used method not loaded: q.b.c.a.j0.a.m.b(int, int):null, types can be incorrect */
    /* JADX INFO: used method not loaded: q.b.c.a.j0.a.m.d(int, int):null, types can be incorrect */
    /* JADX INFO: used method not loaded: q.b.c.a.j0.a.m.a(int, q.b.c.a.j0.a.j):null, types can be incorrect */
    /* JADX INFO: used method not loaded: q.b.c.a.j0.a.m.a(int, boolean):null, types can be incorrect */
    /* JADX INFO: used method not loaded: q.b.c.a.j0.a.m.b(int, long):null, types can be incorrect */
    /* JADX INFO: used method not loaded: q.b.c.a.j0.a.n.a(int, float):null, types can be incorrect */
    /* JADX INFO: used method not loaded: q.b.c.a.j0.a.n.a(int, double):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0412, code lost:
        ((p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r13).mo9848a(r7, p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, m8921f(r6)), mo9956c(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0434, code lost:
        ((p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r13).mo9846a(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x044a, code lost:
        ((p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r13).mo9845a(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0460, code lost:
        ((p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r13).f9116a.mo9801a(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0478, code lost:
        ((p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r13).f9116a.mo9800a(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0490, code lost:
        ((p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r13).f9116a.mo9810b(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x04a8, code lost:
        ((p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r13).f9116a.mo9816d(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x04b8, code lost:
        ((p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r13).f9116a.mo9803a(r7, (p213q.p217b.p301c.p302a.p311j0.p312a.C3635j) p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, m8921f(r6)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x04d2, code lost:
        ((p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r13).mo9849b(r7, p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, m8921f(r6)), mo9956c(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x04ec, code lost:
        mo9938a(r7, p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, m8921f(r6)), r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0507, code lost:
        ((p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r13).f9116a.mo9806a(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x051f, code lost:
        ((p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r13).f9116a.mo9800a(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0537, code lost:
        ((p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r13).f9116a.mo9801a(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x054f, code lost:
        ((p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r13).f9116a.mo9810b(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0567, code lost:
        ((p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r13).f9116a.mo9811b(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x057f, code lost:
        ((p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r13).f9116a.mo9811b(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0597, code lost:
        ((p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r13).mo9844a(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x05ad, code lost:
        ((p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r13).mo9843a(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x09a3, code lost:
        ((p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r13).mo9848a(r8, p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, m8921f(r7)), mo9956c(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x09c5, code lost:
        ((p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r13).mo9846a(r8, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x09db, code lost:
        ((p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r13).mo9845a(r8, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x09f1, code lost:
        ((p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r13).f9116a.mo9801a(r8, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x0a09, code lost:
        ((p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r13).f9116a.mo9800a(r8, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x0a21, code lost:
        ((p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r13).f9116a.mo9810b(r8, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x0a39, code lost:
        ((p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r13).f9116a.mo9816d(r8, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x0a49, code lost:
        ((p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r13).f9116a.mo9803a(r8, (p213q.p217b.p301c.p302a.p311j0.p312a.C3635j) p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, m8921f(r7)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x0a63, code lost:
        ((p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r13).mo9849b(r8, p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, m8921f(r7)), mo9956c(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x0a7d, code lost:
        mo9938a(r8, p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, m8921f(r7)), r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x0a98, code lost:
        ((p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r13).f9116a.mo9806a(r8, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x0ab0, code lost:
        ((p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r13).f9116a.mo9800a(r8, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x0ac8, code lost:
        ((p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r13).f9116a.mo9801a(r8, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x0adf, code lost:
        ((p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r13).f9116a.mo9810b(r8, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x0af6, code lost:
        ((p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r13).f9116a.mo9811b(r8, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x0b0d, code lost:
        ((p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r13).f9116a.mo9811b(r8, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0b24, code lost:
        ((p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r13).mo9844a(r8, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x0b39, code lost:
        ((p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r13).mo9843a(r8, r9);
     */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x05f9  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:368:0x0b45  */
    /* JADX WARNING: Removed duplicated region for block: B:376:0x05b5 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9646a(T r12, p213q.p217b.p301c.p302a.p311j0.p312a.C3722v1 r13) {
        /*
            r11 = this;
            r0 = r13
            q.b.c.a.j0.a.n r0 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r0
            r1 = 0
            if (r0 == 0) goto L_0x0b63
            q.b.c.a.j0.a.v1$a r0 = p213q.p217b.p301c.p302a.p311j0.p312a.C3722v1.C3723a.ASCENDING
            q.b.c.a.j0.a.v1$a r2 = p213q.p217b.p301c.p302a.p311j0.p312a.C3722v1.C3723a.DESCENDING
            r3 = 0
            r4 = 1
            if (r0 != r2) goto L_0x05cc
            q.b.c.a.j0.a.m1<?, ?> r0 = r11.f9193o
            r11.mo9943a(r0, (T) r12, r13)
            boolean r0 = r11.f9184f
            if (r0 == 0) goto L_0x0060
            q.b.c.a.j0.a.s<?> r0 = r11.f9194p
            q.b.c.a.j0.a.t r0 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3709t) r0
            if (r0 == 0) goto L_0x005f
            r0 = r12
            q.b.c.a.j0.a.z$c r0 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3734c) r0
            q.b.c.a.j0.a.v<q.b.c.a.j0.a.z$e> r0 = r0.f9286e
            boolean r2 = r0.mo9966a()
            if (r2 != 0) goto L_0x0060
            boolean r2 = r0.f9210c
            if (r2 == 0) goto L_0x0045
            q.b.c.a.j0.a.e0$c r2 = new q.b.c.a.j0.a.e0$c
            q.b.c.a.j0.a.j1<T, java.lang.Object> r0 = r0.f9208a
            q.b.c.a.j0.a.j1$c<> r5 = r0.f9051k
            if (r5 != 0) goto L_0x003b
            q.b.c.a.j0.a.j1$c r5 = new q.b.c.a.j0.a.j1$c
            r5.<init>(r1)
            r0.f9051k = r5
        L_0x003b:
            q.b.c.a.j0.a.j1$c<> r0 = r0.f9051k
            java.util.Iterator r0 = r0.iterator()
            r2.<init>(r0)
            goto L_0x0058
        L_0x0045:
            q.b.c.a.j0.a.j1<T, java.lang.Object> r0 = r0.f9208a
            q.b.c.a.j0.a.j1$c<> r2 = r0.f9051k
            if (r2 != 0) goto L_0x0052
            q.b.c.a.j0.a.j1$c r2 = new q.b.c.a.j0.a.j1$c
            r2.<init>(r1)
            r0.f9051k = r2
        L_0x0052:
            q.b.c.a.j0.a.j1$c<> r0 = r0.f9051k
            java.util.Iterator r2 = r0.iterator()
        L_0x0058:
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            goto L_0x0062
        L_0x005f:
            throw r1
        L_0x0060:
            r0 = r1
            r2 = r0
        L_0x0062:
            int[] r5 = r11.f9179a
            int r5 = r5.length
        L_0x0065:
            int r5 = r5 + -3
            if (r5 < 0) goto L_0x05b5
            int r6 = r11.mo9959e(r5)
            int[] r7 = r11.f9179a
            r7 = r7[r5]
        L_0x0071:
            if (r0 == 0) goto L_0x008f
            q.b.c.a.j0.a.s<?> r8 = r11.f9194p
            int r8 = r8.mo9917a(r0)
            if (r8 <= r7) goto L_0x008f
            q.b.c.a.j0.a.s<?> r8 = r11.f9194p
            r8.mo9921a(r13, r0)
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x008d
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            goto L_0x0071
        L_0x008d:
            r0 = r1
            goto L_0x0071
        L_0x008f:
            int r8 = m8923g(r6)
            switch(r8) {
                case 0: goto L_0x059f;
                case 1: goto L_0x0589;
                case 2: goto L_0x0571;
                case 3: goto L_0x0559;
                case 4: goto L_0x0541;
                case 5: goto L_0x0529;
                case 6: goto L_0x0511;
                case 7: goto L_0x04f9;
                case 8: goto L_0x04e6;
                case 9: goto L_0x04cc;
                case 10: goto L_0x04b2;
                case 11: goto L_0x049a;
                case 12: goto L_0x0482;
                case 13: goto L_0x046a;
                case 14: goto L_0x0452;
                case 15: goto L_0x043c;
                case 16: goto L_0x0426;
                case 17: goto L_0x040c;
                case 18: goto L_0x03f9;
                case 19: goto L_0x03e6;
                case 20: goto L_0x03d3;
                case 21: goto L_0x03c0;
                case 22: goto L_0x03ad;
                case 23: goto L_0x039a;
                case 24: goto L_0x0387;
                case 25: goto L_0x0374;
                case 26: goto L_0x0361;
                case 27: goto L_0x034a;
                case 28: goto L_0x0337;
                case 29: goto L_0x0324;
                case 30: goto L_0x0311;
                case 31: goto L_0x02fe;
                case 32: goto L_0x02eb;
                case 33: goto L_0x02d8;
                case 34: goto L_0x02c5;
                case 35: goto L_0x02b2;
                case 36: goto L_0x029f;
                case 37: goto L_0x028c;
                case 38: goto L_0x0279;
                case 39: goto L_0x0266;
                case 40: goto L_0x0253;
                case 41: goto L_0x0240;
                case 42: goto L_0x022d;
                case 43: goto L_0x021a;
                case 44: goto L_0x0207;
                case 45: goto L_0x01f4;
                case 46: goto L_0x01e1;
                case 47: goto L_0x01ce;
                case 48: goto L_0x01bb;
                case 49: goto L_0x01a4;
                case 50: goto L_0x0197;
                case 51: goto L_0x0187;
                case 52: goto L_0x0177;
                case 53: goto L_0x0167;
                case 54: goto L_0x0157;
                case 55: goto L_0x0147;
                case 56: goto L_0x0137;
                case 57: goto L_0x0127;
                case 58: goto L_0x0117;
                case 59: goto L_0x010f;
                case 60: goto L_0x0107;
                case 61: goto L_0x00ff;
                case 62: goto L_0x00ef;
                case 63: goto L_0x00df;
                case 64: goto L_0x00cf;
                case 65: goto L_0x00bf;
                case 66: goto L_0x00af;
                case 67: goto L_0x009f;
                case 68: goto L_0x0097;
                default: goto L_0x0096;
            }
        L_0x0096:
            goto L_0x0065
        L_0x0097:
            boolean r8 = r11.mo9946a((T) r12, r7, r5)
            if (r8 == 0) goto L_0x0065
            goto L_0x0412
        L_0x009f:
            boolean r8 = r11.mo9946a((T) r12, r7, r5)
            if (r8 == 0) goto L_0x0065
            long r8 = m8921f(r6)
            long r8 = m8922f(r12, r8)
            goto L_0x0434
        L_0x00af:
            boolean r8 = r11.mo9946a((T) r12, r7, r5)
            if (r8 == 0) goto L_0x0065
            long r8 = m8921f(r6)
            int r6 = m8920e(r12, r8)
            goto L_0x044a
        L_0x00bf:
            boolean r8 = r11.mo9946a((T) r12, r7, r5)
            if (r8 == 0) goto L_0x0065
            long r8 = m8921f(r6)
            long r8 = m8922f(r12, r8)
            goto L_0x0460
        L_0x00cf:
            boolean r8 = r11.mo9946a((T) r12, r7, r5)
            if (r8 == 0) goto L_0x0065
            long r8 = m8921f(r6)
            int r6 = m8920e(r12, r8)
            goto L_0x0478
        L_0x00df:
            boolean r8 = r11.mo9946a((T) r12, r7, r5)
            if (r8 == 0) goto L_0x0065
            long r8 = m8921f(r6)
            int r6 = m8920e(r12, r8)
            goto L_0x0490
        L_0x00ef:
            boolean r8 = r11.mo9946a((T) r12, r7, r5)
            if (r8 == 0) goto L_0x0065
            long r8 = m8921f(r6)
            int r6 = m8920e(r12, r8)
            goto L_0x04a8
        L_0x00ff:
            boolean r8 = r11.mo9946a((T) r12, r7, r5)
            if (r8 == 0) goto L_0x0065
            goto L_0x04b8
        L_0x0107:
            boolean r8 = r11.mo9946a((T) r12, r7, r5)
            if (r8 == 0) goto L_0x0065
            goto L_0x04d2
        L_0x010f:
            boolean r8 = r11.mo9946a((T) r12, r7, r5)
            if (r8 == 0) goto L_0x0065
            goto L_0x04ec
        L_0x0117:
            boolean r8 = r11.mo9946a((T) r12, r7, r5)
            if (r8 == 0) goto L_0x0065
            long r8 = m8921f(r6)
            boolean r6 = m8917b((T) r12, r8)
            goto L_0x0507
        L_0x0127:
            boolean r8 = r11.mo9946a((T) r12, r7, r5)
            if (r8 == 0) goto L_0x0065
            long r8 = m8921f(r6)
            int r6 = m8920e(r12, r8)
            goto L_0x051f
        L_0x0137:
            boolean r8 = r11.mo9946a((T) r12, r7, r5)
            if (r8 == 0) goto L_0x0065
            long r8 = m8921f(r6)
            long r8 = m8922f(r12, r8)
            goto L_0x0537
        L_0x0147:
            boolean r8 = r11.mo9946a((T) r12, r7, r5)
            if (r8 == 0) goto L_0x0065
            long r8 = m8921f(r6)
            int r6 = m8920e(r12, r8)
            goto L_0x054f
        L_0x0157:
            boolean r8 = r11.mo9946a((T) r12, r7, r5)
            if (r8 == 0) goto L_0x0065
            long r8 = m8921f(r6)
            long r8 = m8922f(r12, r8)
            goto L_0x0567
        L_0x0167:
            boolean r8 = r11.mo9946a((T) r12, r7, r5)
            if (r8 == 0) goto L_0x0065
            long r8 = m8921f(r6)
            long r8 = m8922f(r12, r8)
            goto L_0x057f
        L_0x0177:
            boolean r8 = r11.mo9946a((T) r12, r7, r5)
            if (r8 == 0) goto L_0x0065
            long r8 = m8921f(r6)
            float r6 = m8919d(r12, r8)
            goto L_0x0597
        L_0x0187:
            boolean r8 = r11.mo9946a((T) r12, r7, r5)
            if (r8 == 0) goto L_0x0065
            long r8 = m8921f(r6)
            double r8 = m8918c(r12, r8)
            goto L_0x05ad
        L_0x0197:
            long r8 = m8921f(r6)
            java.lang.Object r6 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r8)
            r11.mo9944a(r13, r7, r6, r5)
            goto L_0x0065
        L_0x01a4:
            int[] r7 = r11.f9179a
            r7 = r7[r5]
            long r8 = m8921f(r6)
            java.lang.Object r6 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r8)
            java.util.List r6 = (java.util.List) r6
            q.b.c.a.j0.a.g1 r8 = r11.mo9956c(r5)
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8345a(r7, r6, r13, r8)
            goto L_0x0065
        L_0x01bb:
            int[] r7 = r11.f9179a
            r7 = r7[r5]
            long r8 = m8921f(r6)
            java.lang.Object r6 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r8)
            java.util.List r6 = (java.util.List) r6
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8384l(r7, r6, r13, r4)
            goto L_0x0065
        L_0x01ce:
            int[] r7 = r11.f9179a
            r7 = r7[r5]
            long r8 = m8921f(r6)
            java.lang.Object r6 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r8)
            java.util.List r6 = (java.util.List) r6
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8383k(r7, r6, r13, r4)
            goto L_0x0065
        L_0x01e1:
            int[] r7 = r11.f9179a
            r7 = r7[r5]
            long r8 = m8921f(r6)
            java.lang.Object r6 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r8)
            java.util.List r6 = (java.util.List) r6
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8382j(r7, r6, r13, r4)
            goto L_0x0065
        L_0x01f4:
            int[] r7 = r11.f9179a
            r7 = r7[r5]
            long r8 = m8921f(r6)
            java.lang.Object r6 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r8)
            java.util.List r6 = (java.util.List) r6
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8379i(r7, r6, r13, r4)
            goto L_0x0065
        L_0x0207:
            int[] r7 = r11.f9179a
            r7 = r7[r5]
            long r8 = m8921f(r6)
            java.lang.Object r6 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r8)
            java.util.List r6 = (java.util.List) r6
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8361c(r7, r6, r13, r4)
            goto L_0x0065
        L_0x021a:
            int[] r7 = r11.f9179a
            r7 = r7[r5]
            long r8 = m8921f(r6)
            java.lang.Object r6 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r8)
            java.util.List r6 = (java.util.List) r6
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8385m(r7, r6, r13, r4)
            goto L_0x0065
        L_0x022d:
            int[] r7 = r11.f9179a
            r7 = r7[r5]
            long r8 = m8921f(r6)
            java.lang.Object r6 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r8)
            java.util.List r6 = (java.util.List) r6
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8346a(r7, r6, r13, r4)
            goto L_0x0065
        L_0x0240:
            int[] r7 = r11.f9179a
            r7 = r7[r5]
            long r8 = m8921f(r6)
            java.lang.Object r6 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r8)
            java.util.List r6 = (java.util.List) r6
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8364d(r7, r6, r13, r4)
            goto L_0x0065
        L_0x0253:
            int[] r7 = r11.f9179a
            r7 = r7[r5]
            long r8 = m8921f(r6)
            java.lang.Object r6 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r8)
            java.util.List r6 = (java.util.List) r6
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8367e(r7, r6, r13, r4)
            goto L_0x0065
        L_0x0266:
            int[] r7 = r11.f9179a
            r7 = r7[r5]
            long r8 = m8921f(r6)
            java.lang.Object r6 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r8)
            java.util.List r6 = (java.util.List) r6
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8373g(r7, r6, r13, r4)
            goto L_0x0065
        L_0x0279:
            int[] r7 = r11.f9179a
            r7 = r7[r5]
            long r8 = m8921f(r6)
            java.lang.Object r6 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r8)
            java.util.List r6 = (java.util.List) r6
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8386n(r7, r6, r13, r4)
            goto L_0x0065
        L_0x028c:
            int[] r7 = r11.f9179a
            r7 = r7[r5]
            long r8 = m8921f(r6)
            java.lang.Object r6 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r8)
            java.util.List r6 = (java.util.List) r6
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8376h(r7, r6, r13, r4)
            goto L_0x0065
        L_0x029f:
            int[] r7 = r11.f9179a
            r7 = r7[r5]
            long r8 = m8921f(r6)
            java.lang.Object r6 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r8)
            java.util.List r6 = (java.util.List) r6
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8370f(r7, r6, r13, r4)
            goto L_0x0065
        L_0x02b2:
            int[] r7 = r11.f9179a
            r7 = r7[r5]
            long r8 = m8921f(r6)
            java.lang.Object r6 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r8)
            java.util.List r6 = (java.util.List) r6
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8358b(r7, r6, r13, r4)
            goto L_0x0065
        L_0x02c5:
            int[] r7 = r11.f9179a
            r7 = r7[r5]
            long r8 = m8921f(r6)
            java.lang.Object r6 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r8)
            java.util.List r6 = (java.util.List) r6
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8384l(r7, r6, r13, r3)
            goto L_0x0065
        L_0x02d8:
            int[] r7 = r11.f9179a
            r7 = r7[r5]
            long r8 = m8921f(r6)
            java.lang.Object r6 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r8)
            java.util.List r6 = (java.util.List) r6
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8383k(r7, r6, r13, r3)
            goto L_0x0065
        L_0x02eb:
            int[] r7 = r11.f9179a
            r7 = r7[r5]
            long r8 = m8921f(r6)
            java.lang.Object r6 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r8)
            java.util.List r6 = (java.util.List) r6
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8382j(r7, r6, r13, r3)
            goto L_0x0065
        L_0x02fe:
            int[] r7 = r11.f9179a
            r7 = r7[r5]
            long r8 = m8921f(r6)
            java.lang.Object r6 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r8)
            java.util.List r6 = (java.util.List) r6
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8379i(r7, r6, r13, r3)
            goto L_0x0065
        L_0x0311:
            int[] r7 = r11.f9179a
            r7 = r7[r5]
            long r8 = m8921f(r6)
            java.lang.Object r6 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r8)
            java.util.List r6 = (java.util.List) r6
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8361c(r7, r6, r13, r3)
            goto L_0x0065
        L_0x0324:
            int[] r7 = r11.f9179a
            r7 = r7[r5]
            long r8 = m8921f(r6)
            java.lang.Object r6 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r8)
            java.util.List r6 = (java.util.List) r6
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8385m(r7, r6, r13, r3)
            goto L_0x0065
        L_0x0337:
            int[] r7 = r11.f9179a
            r7 = r7[r5]
            long r8 = m8921f(r6)
            java.lang.Object r6 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r8)
            java.util.List r6 = (java.util.List) r6
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8344a(r7, r6, r13)
            goto L_0x0065
        L_0x034a:
            int[] r7 = r11.f9179a
            r7 = r7[r5]
            long r8 = m8921f(r6)
            java.lang.Object r6 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r8)
            java.util.List r6 = (java.util.List) r6
            q.b.c.a.j0.a.g1 r8 = r11.mo9956c(r5)
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8357b(r7, r6, r13, r8)
            goto L_0x0065
        L_0x0361:
            int[] r7 = r11.f9179a
            r7 = r7[r5]
            long r8 = m8921f(r6)
            java.lang.Object r6 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r8)
            java.util.List r6 = (java.util.List) r6
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8356b(r7, r6, r13)
            goto L_0x0065
        L_0x0374:
            int[] r7 = r11.f9179a
            r7 = r7[r5]
            long r8 = m8921f(r6)
            java.lang.Object r6 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r8)
            java.util.List r6 = (java.util.List) r6
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8346a(r7, r6, r13, r3)
            goto L_0x0065
        L_0x0387:
            int[] r7 = r11.f9179a
            r7 = r7[r5]
            long r8 = m8921f(r6)
            java.lang.Object r6 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r8)
            java.util.List r6 = (java.util.List) r6
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8364d(r7, r6, r13, r3)
            goto L_0x0065
        L_0x039a:
            int[] r7 = r11.f9179a
            r7 = r7[r5]
            long r8 = m8921f(r6)
            java.lang.Object r6 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r8)
            java.util.List r6 = (java.util.List) r6
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8367e(r7, r6, r13, r3)
            goto L_0x0065
        L_0x03ad:
            int[] r7 = r11.f9179a
            r7 = r7[r5]
            long r8 = m8921f(r6)
            java.lang.Object r6 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r8)
            java.util.List r6 = (java.util.List) r6
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8373g(r7, r6, r13, r3)
            goto L_0x0065
        L_0x03c0:
            int[] r7 = r11.f9179a
            r7 = r7[r5]
            long r8 = m8921f(r6)
            java.lang.Object r6 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r8)
            java.util.List r6 = (java.util.List) r6
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8386n(r7, r6, r13, r3)
            goto L_0x0065
        L_0x03d3:
            int[] r7 = r11.f9179a
            r7 = r7[r5]
            long r8 = m8921f(r6)
            java.lang.Object r6 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r8)
            java.util.List r6 = (java.util.List) r6
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8376h(r7, r6, r13, r3)
            goto L_0x0065
        L_0x03e6:
            int[] r7 = r11.f9179a
            r7 = r7[r5]
            long r8 = m8921f(r6)
            java.lang.Object r6 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r8)
            java.util.List r6 = (java.util.List) r6
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8370f(r7, r6, r13, r3)
            goto L_0x0065
        L_0x03f9:
            int[] r7 = r11.f9179a
            r7 = r7[r5]
            long r8 = m8921f(r6)
            java.lang.Object r6 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r8)
            java.util.List r6 = (java.util.List) r6
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8358b(r7, r6, r13, r3)
            goto L_0x0065
        L_0x040c:
            boolean r8 = r11.mo9945a((T) r12, r5)
            if (r8 == 0) goto L_0x0065
        L_0x0412:
            long r8 = m8921f(r6)
            java.lang.Object r6 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r8)
            q.b.c.a.j0.a.g1 r8 = r11.mo9956c(r5)
            r9 = r13
            q.b.c.a.j0.a.n r9 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r9
            r9.mo9848a(r7, r6, r8)
            goto L_0x0065
        L_0x0426:
            boolean r8 = r11.mo9945a((T) r12, r5)
            if (r8 == 0) goto L_0x0065
            long r8 = m8921f(r6)
            long r8 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8827g(r12, r8)
        L_0x0434:
            r6 = r13
            q.b.c.a.j0.a.n r6 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r6
            r6.mo9846a(r7, r8)
            goto L_0x0065
        L_0x043c:
            boolean r8 = r11.mo9945a((T) r12, r5)
            if (r8 == 0) goto L_0x0065
            long r8 = m8921f(r6)
            int r6 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8826f(r12, r8)
        L_0x044a:
            r8 = r13
            q.b.c.a.j0.a.n r8 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r8
            r8.mo9845a(r7, r6)
            goto L_0x0065
        L_0x0452:
            boolean r8 = r11.mo9945a((T) r12, r5)
            if (r8 == 0) goto L_0x0065
            long r8 = m8921f(r6)
            long r8 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8827g(r12, r8)
        L_0x0460:
            r6 = r13
            q.b.c.a.j0.a.n r6 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r6
            q.b.c.a.j0.a.m r6 = r6.f9116a
            r6.mo9801a(r7, r8)
            goto L_0x0065
        L_0x046a:
            boolean r8 = r11.mo9945a((T) r12, r5)
            if (r8 == 0) goto L_0x0065
            long r8 = m8921f(r6)
            int r6 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8826f(r12, r8)
        L_0x0478:
            r8 = r13
            q.b.c.a.j0.a.n r8 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r8
            q.b.c.a.j0.a.m r8 = r8.f9116a
            r8.mo9800a(r7, r6)
            goto L_0x0065
        L_0x0482:
            boolean r8 = r11.mo9945a((T) r12, r5)
            if (r8 == 0) goto L_0x0065
            long r8 = m8921f(r6)
            int r6 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8826f(r12, r8)
        L_0x0490:
            r8 = r13
            q.b.c.a.j0.a.n r8 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r8
            q.b.c.a.j0.a.m r8 = r8.f9116a
            r8.mo9810b(r7, r6)
            goto L_0x0065
        L_0x049a:
            boolean r8 = r11.mo9945a((T) r12, r5)
            if (r8 == 0) goto L_0x0065
            long r8 = m8921f(r6)
            int r6 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8826f(r12, r8)
        L_0x04a8:
            r8 = r13
            q.b.c.a.j0.a.n r8 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r8
            q.b.c.a.j0.a.m r8 = r8.f9116a
            r8.mo9816d(r7, r6)
            goto L_0x0065
        L_0x04b2:
            boolean r8 = r11.mo9945a((T) r12, r5)
            if (r8 == 0) goto L_0x0065
        L_0x04b8:
            long r8 = m8921f(r6)
            java.lang.Object r6 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r8)
            q.b.c.a.j0.a.j r6 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3635j) r6
            r8 = r13
            q.b.c.a.j0.a.n r8 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r8
            q.b.c.a.j0.a.m r8 = r8.f9116a
            r8.mo9803a(r7, r6)
            goto L_0x0065
        L_0x04cc:
            boolean r8 = r11.mo9945a((T) r12, r5)
            if (r8 == 0) goto L_0x0065
        L_0x04d2:
            long r8 = m8921f(r6)
            java.lang.Object r6 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r8)
            q.b.c.a.j0.a.g1 r8 = r11.mo9956c(r5)
            r9 = r13
            q.b.c.a.j0.a.n r9 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r9
            r9.mo9849b(r7, r6, r8)
            goto L_0x0065
        L_0x04e6:
            boolean r8 = r11.mo9945a((T) r12, r5)
            if (r8 == 0) goto L_0x0065
        L_0x04ec:
            long r8 = m8921f(r6)
            java.lang.Object r6 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r8)
            r11.mo9938a(r7, r6, r13)
            goto L_0x0065
        L_0x04f9:
            boolean r8 = r11.mo9945a((T) r12, r5)
            if (r8 == 0) goto L_0x0065
            long r8 = m8921f(r6)
            boolean r6 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8816a(r12, r8)
        L_0x0507:
            r8 = r13
            q.b.c.a.j0.a.n r8 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r8
            q.b.c.a.j0.a.m r8 = r8.f9116a
            r8.mo9806a(r7, r6)
            goto L_0x0065
        L_0x0511:
            boolean r8 = r11.mo9945a((T) r12, r5)
            if (r8 == 0) goto L_0x0065
            long r8 = m8921f(r6)
            int r6 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8826f(r12, r8)
        L_0x051f:
            r8 = r13
            q.b.c.a.j0.a.n r8 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r8
            q.b.c.a.j0.a.m r8 = r8.f9116a
            r8.mo9800a(r7, r6)
            goto L_0x0065
        L_0x0529:
            boolean r8 = r11.mo9945a((T) r12, r5)
            if (r8 == 0) goto L_0x0065
            long r8 = m8921f(r6)
            long r8 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8827g(r12, r8)
        L_0x0537:
            r6 = r13
            q.b.c.a.j0.a.n r6 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r6
            q.b.c.a.j0.a.m r6 = r6.f9116a
            r6.mo9801a(r7, r8)
            goto L_0x0065
        L_0x0541:
            boolean r8 = r11.mo9945a((T) r12, r5)
            if (r8 == 0) goto L_0x0065
            long r8 = m8921f(r6)
            int r6 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8826f(r12, r8)
        L_0x054f:
            r8 = r13
            q.b.c.a.j0.a.n r8 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r8
            q.b.c.a.j0.a.m r8 = r8.f9116a
            r8.mo9810b(r7, r6)
            goto L_0x0065
        L_0x0559:
            boolean r8 = r11.mo9945a((T) r12, r5)
            if (r8 == 0) goto L_0x0065
            long r8 = m8921f(r6)
            long r8 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8827g(r12, r8)
        L_0x0567:
            r6 = r13
            q.b.c.a.j0.a.n r6 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r6
            q.b.c.a.j0.a.m r6 = r6.f9116a
            r6.mo9811b(r7, r8)
            goto L_0x0065
        L_0x0571:
            boolean r8 = r11.mo9945a((T) r12, r5)
            if (r8 == 0) goto L_0x0065
            long r8 = m8921f(r6)
            long r8 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8827g(r12, r8)
        L_0x057f:
            r6 = r13
            q.b.c.a.j0.a.n r6 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r6
            q.b.c.a.j0.a.m r6 = r6.f9116a
            r6.mo9811b(r7, r8)
            goto L_0x0065
        L_0x0589:
            boolean r8 = r11.mo9945a((T) r12, r5)
            if (r8 == 0) goto L_0x0065
            long r8 = m8921f(r6)
            float r6 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8825e(r12, r8)
        L_0x0597:
            r8 = r13
            q.b.c.a.j0.a.n r8 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r8
            r8.mo9844a(r7, r6)
            goto L_0x0065
        L_0x059f:
            boolean r8 = r11.mo9945a((T) r12, r5)
            if (r8 == 0) goto L_0x0065
            long r8 = m8921f(r6)
            double r8 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8823d(r12, r8)
        L_0x05ad:
            r6 = r13
            q.b.c.a.j0.a.n r6 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r6
            r6.mo9843a(r7, r8)
            goto L_0x0065
        L_0x05b5:
            if (r0 == 0) goto L_0x0b62
            q.b.c.a.j0.a.s<?> r12 = r11.f9194p
            r12.mo9921a(r13, r0)
            boolean r12 = r2.hasNext()
            if (r12 == 0) goto L_0x05ca
            java.lang.Object r12 = r2.next()
            r0 = r12
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            goto L_0x05b5
        L_0x05ca:
            r0 = r1
            goto L_0x05b5
        L_0x05cc:
            boolean r0 = r11.f9186h
            if (r0 == 0) goto L_0x0b5f
            boolean r0 = r11.f9184f
            if (r0 == 0) goto L_0x05f1
            q.b.c.a.j0.a.s<?> r0 = r11.f9194p
            q.b.c.a.j0.a.t r0 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3709t) r0
            if (r0 == 0) goto L_0x05f0
            r0 = r12
            q.b.c.a.j0.a.z$c r0 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3734c) r0
            q.b.c.a.j0.a.v<q.b.c.a.j0.a.z$e> r0 = r0.f9286e
            boolean r2 = r0.mo9966a()
            if (r2 != 0) goto L_0x05f1
            java.util.Iterator r0 = r0.mo9970c()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x05f3
        L_0x05f0:
            throw r1
        L_0x05f1:
            r0 = r1
            r2 = r0
        L_0x05f3:
            int[] r5 = r11.f9179a
            int r5 = r5.length
            r6 = r3
        L_0x05f7:
            if (r6 >= r5) goto L_0x0b43
            int r7 = r11.mo9959e(r6)
            int[] r8 = r11.f9179a
            r8 = r8[r6]
        L_0x0601:
            if (r2 == 0) goto L_0x061f
            q.b.c.a.j0.a.s<?> r9 = r11.f9194p
            int r9 = r9.mo9917a(r2)
            if (r9 > r8) goto L_0x061f
            q.b.c.a.j0.a.s<?> r9 = r11.f9194p
            r9.mo9921a(r13, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x061d
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0601
        L_0x061d:
            r2 = r1
            goto L_0x0601
        L_0x061f:
            int r9 = m8923g(r7)
            switch(r9) {
                case 0: goto L_0x0b2b;
                case 1: goto L_0x0b16;
                case 2: goto L_0x0aff;
                case 3: goto L_0x0ae8;
                case 4: goto L_0x0ad1;
                case 5: goto L_0x0aba;
                case 6: goto L_0x0aa2;
                case 7: goto L_0x0a8a;
                case 8: goto L_0x0a77;
                case 9: goto L_0x0a5d;
                case 10: goto L_0x0a43;
                case 11: goto L_0x0a2b;
                case 12: goto L_0x0a13;
                case 13: goto L_0x09fb;
                case 14: goto L_0x09e3;
                case 15: goto L_0x09cd;
                case 16: goto L_0x09b7;
                case 17: goto L_0x099d;
                case 18: goto L_0x098a;
                case 19: goto L_0x0977;
                case 20: goto L_0x0964;
                case 21: goto L_0x0951;
                case 22: goto L_0x093e;
                case 23: goto L_0x092b;
                case 24: goto L_0x0918;
                case 25: goto L_0x0905;
                case 26: goto L_0x08f2;
                case 27: goto L_0x08db;
                case 28: goto L_0x08c8;
                case 29: goto L_0x08b5;
                case 30: goto L_0x08a2;
                case 31: goto L_0x088f;
                case 32: goto L_0x087c;
                case 33: goto L_0x0869;
                case 34: goto L_0x0856;
                case 35: goto L_0x0843;
                case 36: goto L_0x0830;
                case 37: goto L_0x081d;
                case 38: goto L_0x080a;
                case 39: goto L_0x07f7;
                case 40: goto L_0x07e4;
                case 41: goto L_0x07d1;
                case 42: goto L_0x07be;
                case 43: goto L_0x07ab;
                case 44: goto L_0x0798;
                case 45: goto L_0x0785;
                case 46: goto L_0x0772;
                case 47: goto L_0x075f;
                case 48: goto L_0x074c;
                case 49: goto L_0x0735;
                case 50: goto L_0x0728;
                case 51: goto L_0x0718;
                case 52: goto L_0x0708;
                case 53: goto L_0x06f8;
                case 54: goto L_0x06e8;
                case 55: goto L_0x06d8;
                case 56: goto L_0x06c8;
                case 57: goto L_0x06b8;
                case 58: goto L_0x06a8;
                case 59: goto L_0x06a0;
                case 60: goto L_0x0698;
                case 61: goto L_0x0690;
                case 62: goto L_0x0680;
                case 63: goto L_0x0670;
                case 64: goto L_0x0660;
                case 65: goto L_0x0650;
                case 66: goto L_0x0640;
                case 67: goto L_0x0630;
                case 68: goto L_0x0628;
                default: goto L_0x0626;
            }
        L_0x0626:
            goto L_0x0b3f
        L_0x0628:
            boolean r9 = r11.mo9946a((T) r12, r8, r6)
            if (r9 == 0) goto L_0x0b3f
            goto L_0x09a3
        L_0x0630:
            boolean r9 = r11.mo9946a((T) r12, r8, r6)
            if (r9 == 0) goto L_0x0b3f
            long r9 = m8921f(r7)
            long r9 = m8922f(r12, r9)
            goto L_0x09c5
        L_0x0640:
            boolean r9 = r11.mo9946a((T) r12, r8, r6)
            if (r9 == 0) goto L_0x0b3f
            long r9 = m8921f(r7)
            int r7 = m8920e(r12, r9)
            goto L_0x09db
        L_0x0650:
            boolean r9 = r11.mo9946a((T) r12, r8, r6)
            if (r9 == 0) goto L_0x0b3f
            long r9 = m8921f(r7)
            long r9 = m8922f(r12, r9)
            goto L_0x09f1
        L_0x0660:
            boolean r9 = r11.mo9946a((T) r12, r8, r6)
            if (r9 == 0) goto L_0x0b3f
            long r9 = m8921f(r7)
            int r7 = m8920e(r12, r9)
            goto L_0x0a09
        L_0x0670:
            boolean r9 = r11.mo9946a((T) r12, r8, r6)
            if (r9 == 0) goto L_0x0b3f
            long r9 = m8921f(r7)
            int r7 = m8920e(r12, r9)
            goto L_0x0a21
        L_0x0680:
            boolean r9 = r11.mo9946a((T) r12, r8, r6)
            if (r9 == 0) goto L_0x0b3f
            long r9 = m8921f(r7)
            int r7 = m8920e(r12, r9)
            goto L_0x0a39
        L_0x0690:
            boolean r9 = r11.mo9946a((T) r12, r8, r6)
            if (r9 == 0) goto L_0x0b3f
            goto L_0x0a49
        L_0x0698:
            boolean r9 = r11.mo9946a((T) r12, r8, r6)
            if (r9 == 0) goto L_0x0b3f
            goto L_0x0a63
        L_0x06a0:
            boolean r9 = r11.mo9946a((T) r12, r8, r6)
            if (r9 == 0) goto L_0x0b3f
            goto L_0x0a7d
        L_0x06a8:
            boolean r9 = r11.mo9946a((T) r12, r8, r6)
            if (r9 == 0) goto L_0x0b3f
            long r9 = m8921f(r7)
            boolean r7 = m8917b((T) r12, r9)
            goto L_0x0a98
        L_0x06b8:
            boolean r9 = r11.mo9946a((T) r12, r8, r6)
            if (r9 == 0) goto L_0x0b3f
            long r9 = m8921f(r7)
            int r7 = m8920e(r12, r9)
            goto L_0x0ab0
        L_0x06c8:
            boolean r9 = r11.mo9946a((T) r12, r8, r6)
            if (r9 == 0) goto L_0x0b3f
            long r9 = m8921f(r7)
            long r9 = m8922f(r12, r9)
            goto L_0x0ac8
        L_0x06d8:
            boolean r9 = r11.mo9946a((T) r12, r8, r6)
            if (r9 == 0) goto L_0x0b3f
            long r9 = m8921f(r7)
            int r7 = m8920e(r12, r9)
            goto L_0x0adf
        L_0x06e8:
            boolean r9 = r11.mo9946a((T) r12, r8, r6)
            if (r9 == 0) goto L_0x0b3f
            long r9 = m8921f(r7)
            long r9 = m8922f(r12, r9)
            goto L_0x0af6
        L_0x06f8:
            boolean r9 = r11.mo9946a((T) r12, r8, r6)
            if (r9 == 0) goto L_0x0b3f
            long r9 = m8921f(r7)
            long r9 = m8922f(r12, r9)
            goto L_0x0b0d
        L_0x0708:
            boolean r9 = r11.mo9946a((T) r12, r8, r6)
            if (r9 == 0) goto L_0x0b3f
            long r9 = m8921f(r7)
            float r7 = m8919d(r12, r9)
            goto L_0x0b24
        L_0x0718:
            boolean r9 = r11.mo9946a((T) r12, r8, r6)
            if (r9 == 0) goto L_0x0b3f
            long r9 = m8921f(r7)
            double r9 = m8918c(r12, r9)
            goto L_0x0b39
        L_0x0728:
            long r9 = m8921f(r7)
            java.lang.Object r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r9)
            r11.mo9944a(r13, r8, r7, r6)
            goto L_0x0b3f
        L_0x0735:
            int[] r8 = r11.f9179a
            r8 = r8[r6]
            long r9 = m8921f(r7)
            java.lang.Object r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r9)
            java.util.List r7 = (java.util.List) r7
            q.b.c.a.j0.a.g1 r9 = r11.mo9956c(r6)
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8345a(r8, r7, r13, r9)
            goto L_0x0b3f
        L_0x074c:
            int[] r8 = r11.f9179a
            r8 = r8[r6]
            long r9 = m8921f(r7)
            java.lang.Object r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r9)
            java.util.List r7 = (java.util.List) r7
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8384l(r8, r7, r13, r4)
            goto L_0x0b3f
        L_0x075f:
            int[] r8 = r11.f9179a
            r8 = r8[r6]
            long r9 = m8921f(r7)
            java.lang.Object r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r9)
            java.util.List r7 = (java.util.List) r7
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8383k(r8, r7, r13, r4)
            goto L_0x0b3f
        L_0x0772:
            int[] r8 = r11.f9179a
            r8 = r8[r6]
            long r9 = m8921f(r7)
            java.lang.Object r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r9)
            java.util.List r7 = (java.util.List) r7
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8382j(r8, r7, r13, r4)
            goto L_0x0b3f
        L_0x0785:
            int[] r8 = r11.f9179a
            r8 = r8[r6]
            long r9 = m8921f(r7)
            java.lang.Object r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r9)
            java.util.List r7 = (java.util.List) r7
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8379i(r8, r7, r13, r4)
            goto L_0x0b3f
        L_0x0798:
            int[] r8 = r11.f9179a
            r8 = r8[r6]
            long r9 = m8921f(r7)
            java.lang.Object r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r9)
            java.util.List r7 = (java.util.List) r7
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8361c(r8, r7, r13, r4)
            goto L_0x0b3f
        L_0x07ab:
            int[] r8 = r11.f9179a
            r8 = r8[r6]
            long r9 = m8921f(r7)
            java.lang.Object r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r9)
            java.util.List r7 = (java.util.List) r7
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8385m(r8, r7, r13, r4)
            goto L_0x0b3f
        L_0x07be:
            int[] r8 = r11.f9179a
            r8 = r8[r6]
            long r9 = m8921f(r7)
            java.lang.Object r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r9)
            java.util.List r7 = (java.util.List) r7
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8346a(r8, r7, r13, r4)
            goto L_0x0b3f
        L_0x07d1:
            int[] r8 = r11.f9179a
            r8 = r8[r6]
            long r9 = m8921f(r7)
            java.lang.Object r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r9)
            java.util.List r7 = (java.util.List) r7
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8364d(r8, r7, r13, r4)
            goto L_0x0b3f
        L_0x07e4:
            int[] r8 = r11.f9179a
            r8 = r8[r6]
            long r9 = m8921f(r7)
            java.lang.Object r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r9)
            java.util.List r7 = (java.util.List) r7
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8367e(r8, r7, r13, r4)
            goto L_0x0b3f
        L_0x07f7:
            int[] r8 = r11.f9179a
            r8 = r8[r6]
            long r9 = m8921f(r7)
            java.lang.Object r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r9)
            java.util.List r7 = (java.util.List) r7
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8373g(r8, r7, r13, r4)
            goto L_0x0b3f
        L_0x080a:
            int[] r8 = r11.f9179a
            r8 = r8[r6]
            long r9 = m8921f(r7)
            java.lang.Object r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r9)
            java.util.List r7 = (java.util.List) r7
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8386n(r8, r7, r13, r4)
            goto L_0x0b3f
        L_0x081d:
            int[] r8 = r11.f9179a
            r8 = r8[r6]
            long r9 = m8921f(r7)
            java.lang.Object r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r9)
            java.util.List r7 = (java.util.List) r7
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8376h(r8, r7, r13, r4)
            goto L_0x0b3f
        L_0x0830:
            int[] r8 = r11.f9179a
            r8 = r8[r6]
            long r9 = m8921f(r7)
            java.lang.Object r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r9)
            java.util.List r7 = (java.util.List) r7
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8370f(r8, r7, r13, r4)
            goto L_0x0b3f
        L_0x0843:
            int[] r8 = r11.f9179a
            r8 = r8[r6]
            long r9 = m8921f(r7)
            java.lang.Object r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r9)
            java.util.List r7 = (java.util.List) r7
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8358b(r8, r7, r13, r4)
            goto L_0x0b3f
        L_0x0856:
            int[] r8 = r11.f9179a
            r8 = r8[r6]
            long r9 = m8921f(r7)
            java.lang.Object r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r9)
            java.util.List r7 = (java.util.List) r7
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8384l(r8, r7, r13, r3)
            goto L_0x0b3f
        L_0x0869:
            int[] r8 = r11.f9179a
            r8 = r8[r6]
            long r9 = m8921f(r7)
            java.lang.Object r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r9)
            java.util.List r7 = (java.util.List) r7
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8383k(r8, r7, r13, r3)
            goto L_0x0b3f
        L_0x087c:
            int[] r8 = r11.f9179a
            r8 = r8[r6]
            long r9 = m8921f(r7)
            java.lang.Object r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r9)
            java.util.List r7 = (java.util.List) r7
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8382j(r8, r7, r13, r3)
            goto L_0x0b3f
        L_0x088f:
            int[] r8 = r11.f9179a
            r8 = r8[r6]
            long r9 = m8921f(r7)
            java.lang.Object r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r9)
            java.util.List r7 = (java.util.List) r7
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8379i(r8, r7, r13, r3)
            goto L_0x0b3f
        L_0x08a2:
            int[] r8 = r11.f9179a
            r8 = r8[r6]
            long r9 = m8921f(r7)
            java.lang.Object r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r9)
            java.util.List r7 = (java.util.List) r7
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8361c(r8, r7, r13, r3)
            goto L_0x0b3f
        L_0x08b5:
            int[] r8 = r11.f9179a
            r8 = r8[r6]
            long r9 = m8921f(r7)
            java.lang.Object r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r9)
            java.util.List r7 = (java.util.List) r7
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8385m(r8, r7, r13, r3)
            goto L_0x0b3f
        L_0x08c8:
            int[] r8 = r11.f9179a
            r8 = r8[r6]
            long r9 = m8921f(r7)
            java.lang.Object r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r9)
            java.util.List r7 = (java.util.List) r7
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8344a(r8, r7, r13)
            goto L_0x0b3f
        L_0x08db:
            int[] r8 = r11.f9179a
            r8 = r8[r6]
            long r9 = m8921f(r7)
            java.lang.Object r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r9)
            java.util.List r7 = (java.util.List) r7
            q.b.c.a.j0.a.g1 r9 = r11.mo9956c(r6)
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8357b(r8, r7, r13, r9)
            goto L_0x0b3f
        L_0x08f2:
            int[] r8 = r11.f9179a
            r8 = r8[r6]
            long r9 = m8921f(r7)
            java.lang.Object r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r9)
            java.util.List r7 = (java.util.List) r7
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8356b(r8, r7, r13)
            goto L_0x0b3f
        L_0x0905:
            int[] r8 = r11.f9179a
            r8 = r8[r6]
            long r9 = m8921f(r7)
            java.lang.Object r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r9)
            java.util.List r7 = (java.util.List) r7
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8346a(r8, r7, r13, r3)
            goto L_0x0b3f
        L_0x0918:
            int[] r8 = r11.f9179a
            r8 = r8[r6]
            long r9 = m8921f(r7)
            java.lang.Object r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r9)
            java.util.List r7 = (java.util.List) r7
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8364d(r8, r7, r13, r3)
            goto L_0x0b3f
        L_0x092b:
            int[] r8 = r11.f9179a
            r8 = r8[r6]
            long r9 = m8921f(r7)
            java.lang.Object r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r9)
            java.util.List r7 = (java.util.List) r7
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8367e(r8, r7, r13, r3)
            goto L_0x0b3f
        L_0x093e:
            int[] r8 = r11.f9179a
            r8 = r8[r6]
            long r9 = m8921f(r7)
            java.lang.Object r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r9)
            java.util.List r7 = (java.util.List) r7
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8373g(r8, r7, r13, r3)
            goto L_0x0b3f
        L_0x0951:
            int[] r8 = r11.f9179a
            r8 = r8[r6]
            long r9 = m8921f(r7)
            java.lang.Object r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r9)
            java.util.List r7 = (java.util.List) r7
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8386n(r8, r7, r13, r3)
            goto L_0x0b3f
        L_0x0964:
            int[] r8 = r11.f9179a
            r8 = r8[r6]
            long r9 = m8921f(r7)
            java.lang.Object r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r9)
            java.util.List r7 = (java.util.List) r7
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8376h(r8, r7, r13, r3)
            goto L_0x0b3f
        L_0x0977:
            int[] r8 = r11.f9179a
            r8 = r8[r6]
            long r9 = m8921f(r7)
            java.lang.Object r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r9)
            java.util.List r7 = (java.util.List) r7
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8370f(r8, r7, r13, r3)
            goto L_0x0b3f
        L_0x098a:
            int[] r8 = r11.f9179a
            r8 = r8[r6]
            long r9 = m8921f(r7)
            java.lang.Object r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r9)
            java.util.List r7 = (java.util.List) r7
            p213q.p217b.p301c.p302a.p311j0.p312a.C3634i1.m8358b(r8, r7, r13, r3)
            goto L_0x0b3f
        L_0x099d:
            boolean r9 = r11.mo9945a((T) r12, r6)
            if (r9 == 0) goto L_0x0b3f
        L_0x09a3:
            long r9 = m8921f(r7)
            java.lang.Object r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r9)
            q.b.c.a.j0.a.g1 r9 = r11.mo9956c(r6)
            r10 = r13
            q.b.c.a.j0.a.n r10 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r10
            r10.mo9848a(r8, r7, r9)
            goto L_0x0b3f
        L_0x09b7:
            boolean r9 = r11.mo9945a((T) r12, r6)
            if (r9 == 0) goto L_0x0b3f
            long r9 = m8921f(r7)
            long r9 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8827g(r12, r9)
        L_0x09c5:
            r7 = r13
            q.b.c.a.j0.a.n r7 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r7
            r7.mo9846a(r8, r9)
            goto L_0x0b3f
        L_0x09cd:
            boolean r9 = r11.mo9945a((T) r12, r6)
            if (r9 == 0) goto L_0x0b3f
            long r9 = m8921f(r7)
            int r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8826f(r12, r9)
        L_0x09db:
            r9 = r13
            q.b.c.a.j0.a.n r9 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r9
            r9.mo9845a(r8, r7)
            goto L_0x0b3f
        L_0x09e3:
            boolean r9 = r11.mo9945a((T) r12, r6)
            if (r9 == 0) goto L_0x0b3f
            long r9 = m8921f(r7)
            long r9 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8827g(r12, r9)
        L_0x09f1:
            r7 = r13
            q.b.c.a.j0.a.n r7 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r7
            q.b.c.a.j0.a.m r7 = r7.f9116a
            r7.mo9801a(r8, r9)
            goto L_0x0b3f
        L_0x09fb:
            boolean r9 = r11.mo9945a((T) r12, r6)
            if (r9 == 0) goto L_0x0b3f
            long r9 = m8921f(r7)
            int r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8826f(r12, r9)
        L_0x0a09:
            r9 = r13
            q.b.c.a.j0.a.n r9 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r9
            q.b.c.a.j0.a.m r9 = r9.f9116a
            r9.mo9800a(r8, r7)
            goto L_0x0b3f
        L_0x0a13:
            boolean r9 = r11.mo9945a((T) r12, r6)
            if (r9 == 0) goto L_0x0b3f
            long r9 = m8921f(r7)
            int r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8826f(r12, r9)
        L_0x0a21:
            r9 = r13
            q.b.c.a.j0.a.n r9 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r9
            q.b.c.a.j0.a.m r9 = r9.f9116a
            r9.mo9810b(r8, r7)
            goto L_0x0b3f
        L_0x0a2b:
            boolean r9 = r11.mo9945a((T) r12, r6)
            if (r9 == 0) goto L_0x0b3f
            long r9 = m8921f(r7)
            int r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8826f(r12, r9)
        L_0x0a39:
            r9 = r13
            q.b.c.a.j0.a.n r9 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r9
            q.b.c.a.j0.a.m r9 = r9.f9116a
            r9.mo9816d(r8, r7)
            goto L_0x0b3f
        L_0x0a43:
            boolean r9 = r11.mo9945a((T) r12, r6)
            if (r9 == 0) goto L_0x0b3f
        L_0x0a49:
            long r9 = m8921f(r7)
            java.lang.Object r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r9)
            q.b.c.a.j0.a.j r7 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3635j) r7
            r9 = r13
            q.b.c.a.j0.a.n r9 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r9
            q.b.c.a.j0.a.m r9 = r9.f9116a
            r9.mo9803a(r8, r7)
            goto L_0x0b3f
        L_0x0a5d:
            boolean r9 = r11.mo9945a((T) r12, r6)
            if (r9 == 0) goto L_0x0b3f
        L_0x0a63:
            long r9 = m8921f(r7)
            java.lang.Object r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r9)
            q.b.c.a.j0.a.g1 r9 = r11.mo9956c(r6)
            r10 = r13
            q.b.c.a.j0.a.n r10 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r10
            r10.mo9849b(r8, r7, r9)
            goto L_0x0b3f
        L_0x0a77:
            boolean r9 = r11.mo9945a((T) r12, r6)
            if (r9 == 0) goto L_0x0b3f
        L_0x0a7d:
            long r9 = m8921f(r7)
            java.lang.Object r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r12, r9)
            r11.mo9938a(r8, r7, r13)
            goto L_0x0b3f
        L_0x0a8a:
            boolean r9 = r11.mo9945a((T) r12, r6)
            if (r9 == 0) goto L_0x0b3f
            long r9 = m8921f(r7)
            boolean r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8816a(r12, r9)
        L_0x0a98:
            r9 = r13
            q.b.c.a.j0.a.n r9 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r9
            q.b.c.a.j0.a.m r9 = r9.f9116a
            r9.mo9806a(r8, r7)
            goto L_0x0b3f
        L_0x0aa2:
            boolean r9 = r11.mo9945a((T) r12, r6)
            if (r9 == 0) goto L_0x0b3f
            long r9 = m8921f(r7)
            int r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8826f(r12, r9)
        L_0x0ab0:
            r9 = r13
            q.b.c.a.j0.a.n r9 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r9
            q.b.c.a.j0.a.m r9 = r9.f9116a
            r9.mo9800a(r8, r7)
            goto L_0x0b3f
        L_0x0aba:
            boolean r9 = r11.mo9945a((T) r12, r6)
            if (r9 == 0) goto L_0x0b3f
            long r9 = m8921f(r7)
            long r9 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8827g(r12, r9)
        L_0x0ac8:
            r7 = r13
            q.b.c.a.j0.a.n r7 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r7
            q.b.c.a.j0.a.m r7 = r7.f9116a
            r7.mo9801a(r8, r9)
            goto L_0x0b3f
        L_0x0ad1:
            boolean r9 = r11.mo9945a((T) r12, r6)
            if (r9 == 0) goto L_0x0b3f
            long r9 = m8921f(r7)
            int r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8826f(r12, r9)
        L_0x0adf:
            r9 = r13
            q.b.c.a.j0.a.n r9 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r9
            q.b.c.a.j0.a.m r9 = r9.f9116a
            r9.mo9810b(r8, r7)
            goto L_0x0b3f
        L_0x0ae8:
            boolean r9 = r11.mo9945a((T) r12, r6)
            if (r9 == 0) goto L_0x0b3f
            long r9 = m8921f(r7)
            long r9 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8827g(r12, r9)
        L_0x0af6:
            r7 = r13
            q.b.c.a.j0.a.n r7 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r7
            q.b.c.a.j0.a.m r7 = r7.f9116a
            r7.mo9811b(r8, r9)
            goto L_0x0b3f
        L_0x0aff:
            boolean r9 = r11.mo9945a((T) r12, r6)
            if (r9 == 0) goto L_0x0b3f
            long r9 = m8921f(r7)
            long r9 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8827g(r12, r9)
        L_0x0b0d:
            r7 = r13
            q.b.c.a.j0.a.n r7 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r7
            q.b.c.a.j0.a.m r7 = r7.f9116a
            r7.mo9811b(r8, r9)
            goto L_0x0b3f
        L_0x0b16:
            boolean r9 = r11.mo9945a((T) r12, r6)
            if (r9 == 0) goto L_0x0b3f
            long r9 = m8921f(r7)
            float r7 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8825e(r12, r9)
        L_0x0b24:
            r9 = r13
            q.b.c.a.j0.a.n r9 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r9
            r9.mo9844a(r8, r7)
            goto L_0x0b3f
        L_0x0b2b:
            boolean r9 = r11.mo9945a((T) r12, r6)
            if (r9 == 0) goto L_0x0b3f
            long r9 = m8921f(r7)
            double r9 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8823d(r12, r9)
        L_0x0b39:
            r7 = r13
            q.b.c.a.j0.a.n r7 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3678n) r7
            r7.mo9843a(r8, r9)
        L_0x0b3f:
            int r6 = r6 + 3
            goto L_0x05f7
        L_0x0b43:
            if (r2 == 0) goto L_0x0b59
            q.b.c.a.j0.a.s<?> r3 = r11.f9194p
            r3.mo9921a(r13, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0b57
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0b43
        L_0x0b57:
            r2 = r1
            goto L_0x0b43
        L_0x0b59:
            q.b.c.a.j0.a.m1<?, ?> r0 = r11.f9193o
            r11.mo9943a(r0, (T) r12, r13)
            goto L_0x0b62
        L_0x0b5f:
            r11.mo9955b((T) r12, r13)
        L_0x0b62:
            return
        L_0x0b63:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p301c.p302a.p311j0.p312a.C3717u0.mo9646a(java.lang.Object, q.b.c.a.j0.a.v1):void");
    }

    /* renamed from: a */
    public final <UT, UB> void mo9943a(C3677m1<UT, UB> m1Var, T t, C3722v1 v1Var) {
        if (((C3683o1) m1Var) != null) {
            ((C3731z) t).unknownFields.mo9860a(v1Var);
            return;
        }
        throw null;
    }
}
