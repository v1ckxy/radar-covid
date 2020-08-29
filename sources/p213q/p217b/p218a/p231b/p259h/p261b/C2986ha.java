package p213q.p217b.p218a.p231b.p259h.p261b;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p251g.p256e.C2573n0;
import p213q.p217b.p218a.p231b.p251g.p256e.C2608p0;
import p213q.p217b.p218a.p231b.p251g.p256e.C2608p0.C2609a;

/* renamed from: q.b.a.b.h.b.ha */
public abstract class C2986ha {

    /* renamed from: a */
    public String f7395a;

    /* renamed from: b */
    public int f7396b;

    /* renamed from: c */
    public Boolean f7397c;

    /* renamed from: d */
    public Boolean f7398d;

    /* renamed from: e */
    public Long f7399e;

    /* renamed from: f */
    public Long f7400f;

    public C2986ha(String str, int i) {
        this.f7395a = str;
        this.f7396b = i;
    }

    /* renamed from: a */
    public static Boolean m6984a(long j, C2573n0 n0Var) {
        try {
            return m6988a(new BigDecimal(j), n0Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static Boolean m6985a(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    /* renamed from: a */
    public static Boolean m6986a(String str, C2573n0 n0Var) {
        if (!C3123t9.m7340a(str)) {
            return null;
        }
        try {
            return m6988a(new BigDecimal(str), n0Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static Boolean m6987a(String str, C2608p0 p0Var, C2908b4 b4Var) {
        String str2;
        List<String> list;
        boolean z;
        C1061o.m2524b(p0Var);
        Boolean bool = null;
        if (str == null) {
            return null;
        }
        boolean z2 = true;
        int i = 0;
        if (((p0Var.zzc & 1) != 0) && p0Var.mo7929k() != C2609a.UNKNOWN_MATCH_TYPE) {
            if (p0Var.mo7929k() != C2609a.IN_LIST) {
                if ((p0Var.zzc & 2) == 0) {
                    z2 = false;
                }
                if (!z2) {
                    return null;
                }
            } else if (p0Var.mo7930l() == 0) {
                return null;
            }
            C2609a k = p0Var.mo7929k();
            boolean z3 = p0Var.zzf;
            if (z3 || k == C2609a.REGEXP || k == C2609a.IN_LIST) {
                str2 = p0Var.zze;
            } else {
                str2 = p0Var.zze.toUpperCase(Locale.ENGLISH);
            }
            if (p0Var.mo7930l() == 0) {
                list = null;
            } else {
                list = p0Var.zzg;
                if (!z3) {
                    ArrayList arrayList = new ArrayList(list.size());
                    for (String upperCase : list) {
                        arrayList.add(upperCase.toUpperCase(Locale.ENGLISH));
                    }
                    list = Collections.unmodifiableList(arrayList);
                }
            }
            String str3 = k == C2609a.REGEXP ? str2 : null;
            if (k != C2609a.IN_LIST ? str2 != null : !(list == null || list.size() == 0)) {
                if (!z3 && k != C2609a.REGEXP) {
                    str = str.toUpperCase(Locale.ENGLISH);
                }
                switch (C2938da.f7257a[k.ordinal()]) {
                    case 1:
                        if (!z3) {
                            i = 66;
                        }
                        try {
                            bool = Boolean.valueOf(Pattern.compile(str3, i).matcher(str).matches());
                            break;
                        } catch (PatternSyntaxException unused) {
                            if (b4Var != null) {
                                b4Var.f7156i.mo8433a("Invalid regular expression in REGEXP audience filter. expression", str3);
                                break;
                            }
                        }
                        break;
                    case 2:
                        z = str.startsWith(str2);
                        break;
                    case 3:
                        z = str.endsWith(str2);
                        break;
                    case 4:
                        z = str.contains(str2);
                        break;
                    case 5:
                        z = str.equals(str2);
                        break;
                    case 6:
                        z = list.contains(str);
                        break;
                }
                bool = Boolean.valueOf(z);
            }
        }
        return bool;
    }

    /* renamed from: a */
    public abstract int mo8442a();

    /* renamed from: b */
    public abstract boolean mo8444b();

    /* renamed from: c */
    public abstract boolean mo8445c();

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
        if (((r11.zzc & 16) != 0) == false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x008e, code lost:
        if (r4 != null) goto L_0x0090;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Boolean m6988a(java.math.BigDecimal r10, p213q.p217b.p218a.p231b.p251g.p256e.C2573n0 r11, double r12) {
        /*
            p124p.p126b.p127k.C1061o.m2524b(r11)
            int r0 = r11.zzc
            r1 = 1
            r0 = r0 & r1
            r2 = 0
            if (r0 == 0) goto L_0x000c
            r0 = r1
            goto L_0x000d
        L_0x000c:
            r0 = r2
        L_0x000d:
            r3 = 0
            if (r0 == 0) goto L_0x011c
            q.b.a.b.g.e.n0$b r0 = r11.mo7876k()
            q.b.a.b.g.e.n0$b r4 = p213q.p217b.p218a.p231b.p251g.p256e.C2573n0.C2575b.UNKNOWN_COMPARISON_TYPE
            if (r0 != r4) goto L_0x001a
            goto L_0x011c
        L_0x001a:
            q.b.a.b.g.e.n0$b r0 = r11.mo7876k()
            q.b.a.b.g.e.n0$b r4 = p213q.p217b.p218a.p231b.p251g.p256e.C2573n0.C2575b.BETWEEN
            r5 = 4
            if (r0 != r4) goto L_0x003a
            int r0 = r11.zzc
            r0 = r0 & 8
            if (r0 == 0) goto L_0x002b
            r0 = r1
            goto L_0x002c
        L_0x002b:
            r0 = r2
        L_0x002c:
            if (r0 == 0) goto L_0x0039
            int r0 = r11.zzc
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0036
            r0 = r1
            goto L_0x0037
        L_0x0036:
            r0 = r2
        L_0x0037:
            if (r0 != 0) goto L_0x0045
        L_0x0039:
            return r3
        L_0x003a:
            int r0 = r11.zzc
            r0 = r0 & r5
            if (r0 == 0) goto L_0x0041
            r0 = r1
            goto L_0x0042
        L_0x0041:
            r0 = r2
        L_0x0042:
            if (r0 != 0) goto L_0x0045
            return r3
        L_0x0045:
            q.b.a.b.g.e.n0$b r0 = r11.mo7876k()
            q.b.a.b.g.e.n0$b r4 = r11.mo7876k()
            q.b.a.b.g.e.n0$b r6 = p213q.p217b.p218a.p231b.p251g.p256e.C2573n0.C2575b.BETWEEN
            if (r4 != r6) goto L_0x0074
            java.lang.String r4 = r11.zzg
            boolean r4 = p213q.p217b.p218a.p231b.p259h.p261b.C3123t9.m7340a(r4)
            if (r4 == 0) goto L_0x0073
            java.lang.String r4 = r11.zzh
            boolean r4 = p213q.p217b.p218a.p231b.p259h.p261b.C3123t9.m7340a(r4)
            if (r4 != 0) goto L_0x0062
            goto L_0x0073
        L_0x0062:
            java.math.BigDecimal r4 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0073 }
            java.lang.String r6 = r11.zzg     // Catch:{ NumberFormatException -> 0x0073 }
            r4.<init>(r6)     // Catch:{ NumberFormatException -> 0x0073 }
            java.math.BigDecimal r6 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0073 }
            java.lang.String r11 = r11.zzh     // Catch:{ NumberFormatException -> 0x0073 }
            r6.<init>(r11)     // Catch:{ NumberFormatException -> 0x0073 }
            r11 = r4
            r4 = r3
            goto L_0x0086
        L_0x0073:
            return r3
        L_0x0074:
            java.lang.String r4 = r11.zzf
            boolean r4 = p213q.p217b.p218a.p231b.p259h.p261b.C3123t9.m7340a(r4)
            if (r4 != 0) goto L_0x007d
            return r3
        L_0x007d:
            java.math.BigDecimal r4 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x011c }
            java.lang.String r11 = r11.zzf     // Catch:{ NumberFormatException -> 0x011c }
            r4.<init>(r11)     // Catch:{ NumberFormatException -> 0x011c }
            r11 = r3
            r6 = r11
        L_0x0086:
            q.b.a.b.g.e.n0$b r7 = p213q.p217b.p218a.p231b.p251g.p256e.C2573n0.C2575b.BETWEEN
            if (r0 != r7) goto L_0x008e
            if (r11 == 0) goto L_0x008d
            goto L_0x0090
        L_0x008d:
            return r3
        L_0x008e:
            if (r4 == 0) goto L_0x011c
        L_0x0090:
            int[] r7 = p213q.p217b.p218a.p231b.p259h.p261b.C2938da.f7258b
            int r0 = r0.ordinal()
            r0 = r7[r0]
            r7 = -1
            if (r0 == r1) goto L_0x010f
            r8 = 2
            if (r0 == r8) goto L_0x0102
            r9 = 3
            if (r0 == r9) goto L_0x00b8
            if (r0 == r5) goto L_0x00a5
            goto L_0x011c
        L_0x00a5:
            int r11 = r10.compareTo(r11)
            if (r11 == r7) goto L_0x00b2
            int r10 = r10.compareTo(r6)
            if (r10 == r1) goto L_0x00b2
            goto L_0x00b3
        L_0x00b2:
            r1 = r2
        L_0x00b3:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r1)
            return r10
        L_0x00b8:
            r5 = 0
            int r11 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r11 == 0) goto L_0x00f5
            java.math.BigDecimal r11 = new java.math.BigDecimal
            r11.<init>(r12)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r8)
            java.math.BigDecimal r11 = r11.multiply(r0)
            java.math.BigDecimal r11 = r4.subtract(r11)
            int r11 = r10.compareTo(r11)
            if (r11 != r1) goto L_0x00ef
            java.math.BigDecimal r11 = new java.math.BigDecimal
            r11.<init>(r12)
            java.math.BigDecimal r12 = new java.math.BigDecimal
            r12.<init>(r8)
            java.math.BigDecimal r11 = r11.multiply(r12)
            java.math.BigDecimal r11 = r4.add(r11)
            int r10 = r10.compareTo(r11)
            if (r10 != r7) goto L_0x00ef
            goto L_0x00f0
        L_0x00ef:
            r1 = r2
        L_0x00f0:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r1)
            return r10
        L_0x00f5:
            int r10 = r10.compareTo(r4)
            if (r10 != 0) goto L_0x00fc
            goto L_0x00fd
        L_0x00fc:
            r1 = r2
        L_0x00fd:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r1)
            return r10
        L_0x0102:
            int r10 = r10.compareTo(r4)
            if (r10 != r1) goto L_0x0109
            goto L_0x010a
        L_0x0109:
            r1 = r2
        L_0x010a:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r1)
            return r10
        L_0x010f:
            int r10 = r10.compareTo(r4)
            if (r10 != r7) goto L_0x0116
            goto L_0x0117
        L_0x0116:
            r1 = r2
        L_0x0117:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r1)
            return r10
        L_0x011c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p259h.p261b.C2986ha.m6988a(java.math.BigDecimal, q.b.a.b.g.e.n0, double):java.lang.Boolean");
    }
}
