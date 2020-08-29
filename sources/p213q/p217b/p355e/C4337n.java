package p213q.p217b.p355e;

import java.math.BigInteger;
import p213q.p217b.p355e.p357v.C4374q;

/* renamed from: q.b.e.n */
public final class C4337n extends C4332i {

    /* renamed from: b */
    public static final Class<?>[] f10384b = {Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};

    /* renamed from: a */
    public Object f10385a;

    public C4337n(Boolean bool) {
        mo10547a((Object) bool);
    }

    public C4337n(Number number) {
        mo10547a((Object) number);
    }

    public C4337n(String str) {
        mo10547a((Object) str);
    }

    /* renamed from: a */
    public static boolean m9851a(C4337n nVar) {
        Object obj = nVar.f10385a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        if (r0 != false) goto L_0x0036;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo10547a(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof java.lang.Character
            if (r0 == 0) goto L_0x0011
            java.lang.Character r8 = (java.lang.Character) r8
            char r8 = r8.charValue()
            java.lang.String r8 = java.lang.String.valueOf(r8)
        L_0x000e:
            r7.f10385a = r8
            goto L_0x003b
        L_0x0011:
            boolean r0 = r8 instanceof java.lang.Number
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0036
            boolean r0 = r8 instanceof java.lang.String
            if (r0 == 0) goto L_0x001d
        L_0x001b:
            r0 = r2
            goto L_0x0034
        L_0x001d:
            java.lang.Class r0 = r8.getClass()
            java.lang.Class<?>[] r3 = f10384b
            int r4 = r3.length
            r5 = r1
        L_0x0025:
            if (r5 >= r4) goto L_0x0033
            r6 = r3[r5]
            boolean r6 = r6.isAssignableFrom(r0)
            if (r6 == 0) goto L_0x0030
            goto L_0x001b
        L_0x0030:
            int r5 = r5 + 1
            goto L_0x0025
        L_0x0033:
            r0 = r1
        L_0x0034:
            if (r0 == 0) goto L_0x0037
        L_0x0036:
            r1 = r2
        L_0x0037:
            p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5251a(r1)
            goto L_0x000e
        L_0x003b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p355e.C4337n.mo10547a(java.lang.Object):void");
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C4337n.class != obj.getClass()) {
            return false;
        }
        C4337n nVar = (C4337n) obj;
        if (this.f10385a == null) {
            if (nVar.f10385a != null) {
                z = false;
            }
            return z;
        } else if (m9851a(this) && m9851a(nVar)) {
            if (mo10550g().longValue() != nVar.mo10550g().longValue()) {
                z = false;
            }
            return z;
        } else if (!(this.f10385a instanceof Number) || !(nVar.f10385a instanceof Number)) {
            return this.f10385a.equals(nVar.f10385a);
        } else {
            double doubleValue = mo10550g().doubleValue();
            double doubleValue2 = nVar.mo10550g().doubleValue();
            if (doubleValue != doubleValue2 && (!Double.isNaN(doubleValue) || !Double.isNaN(doubleValue2))) {
                z = false;
            }
            return z;
        }
    }

    /* renamed from: f */
    public boolean mo10549f() {
        Object obj = this.f10385a;
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(mo10551h());
    }

    /* renamed from: g */
    public Number mo10550g() {
        Object obj = this.f10385a;
        return obj instanceof String ? new C4374q((String) this.f10385a) : (Number) obj;
    }

    /* renamed from: h */
    public String mo10551h() {
        Object obj = this.f10385a;
        if (obj instanceof Number) {
            return mo10550g().toString();
        }
        return obj instanceof Boolean ? ((Boolean) obj).toString() : (String) obj;
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.f10385a == null) {
            return 31;
        }
        if (m9851a(this)) {
            doubleToLongBits = mo10550g().longValue();
        } else {
            Object obj = this.f10385a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(mo10550g().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }
}
