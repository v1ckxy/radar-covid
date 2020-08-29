package p213q.p217b.p218a.p231b.p259h.p261b;

import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import p116io.jsonwebtoken.lang.Objects;
import p124p.p126b.p127k.C1061o;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2284c;

/* renamed from: q.b.a.b.h.b.b4 */
public final class C2908b4 extends C3185z5 {

    /* renamed from: c */
    public char f7150c = 0;

    /* renamed from: d */
    public long f7151d = -1;

    /* renamed from: e */
    public String f7152e;

    /* renamed from: f */
    public final C2944e4 f7153f = new C2944e4(this, 6, false, false);

    /* renamed from: g */
    public final C2944e4 f7154g = new C2944e4(this, 6, true, false);

    /* renamed from: h */
    public final C2944e4 f7155h = new C2944e4(this, 6, false, true);

    /* renamed from: i */
    public final C2944e4 f7156i = new C2944e4(this, 5, false, false);

    /* renamed from: j */
    public final C2944e4 f7157j = new C2944e4(this, 5, true, false);

    /* renamed from: k */
    public final C2944e4 f7158k = new C2944e4(this, 5, false, true);

    /* renamed from: l */
    public final C2944e4 f7159l = new C2944e4(this, 4, false, false);

    /* renamed from: m */
    public final C2944e4 f7160m = new C2944e4(this, 3, false, false);

    /* renamed from: n */
    public final C2944e4 f7161n = new C2944e4(this, 2, false, false);

    public C2908b4(C2969g5 g5Var) {
        super(g5Var);
    }

    /* renamed from: a */
    public static Object m6745a(String str) {
        if (str == null) {
            return null;
        }
        return new C2932d4(str);
    }

    /* renamed from: a */
    public static String m6746a(boolean z, Object obj) {
        String str = Objects.EMPTY_STRING;
        if (obj == null) {
            return str;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        String str2 = "-";
        int i = 0;
        if (obj instanceof Long) {
            if (!z) {
                return String.valueOf(obj);
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return String.valueOf(obj);
            }
            if (String.valueOf(obj).charAt(0) == '-') {
                str = str2;
            }
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            long round = Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1)));
            long round2 = Math.round(Math.pow(10.0d, (double) valueOf.length()) - 1.0d);
            StringBuilder sb = new StringBuilder(str.length() + str.length() + 43);
            sb.append(str);
            sb.append(round);
            sb.append("...");
            sb.append(str);
            sb.append(round2);
            return sb.toString();
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            if (obj instanceof Throwable) {
                Throwable th = (Throwable) obj;
                StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
                String b = m6748b(C2969g5.class.getCanonicalName());
                StackTraceElement[] stackTrace = th.getStackTrace();
                int length = stackTrace.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i];
                    if (!stackTraceElement.isNativeMethod()) {
                        String className = stackTraceElement.getClassName();
                        if (className != null && m6748b(className).equals(b)) {
                            sb2.append(": ");
                            sb2.append(stackTraceElement);
                            break;
                        }
                    }
                    i++;
                }
                return sb2.toString();
            } else if (obj instanceof C2932d4) {
                return ((C2932d4) obj).f7240a;
            } else {
                if (z) {
                    return str2;
                }
                return String.valueOf(obj);
            }
        }
    }

    /* renamed from: a */
    public static String m6747a(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = Objects.EMPTY_STRING;
        if (str == null) {
            str = str2;
        }
        String a = m6746a(z, obj);
        String a2 = m6746a(z, obj2);
        String a3 = m6746a(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        boolean isEmpty = TextUtils.isEmpty(a);
        String str3 = Objects.ARRAY_ELEMENT_SEPARATOR;
        if (!isEmpty) {
            sb.append(str2);
            sb.append(a);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(a2)) {
            sb.append(str2);
            sb.append(a2);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(a3)) {
            sb.append(str3);
            sb.append(a3);
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static String m6748b(String str) {
        if (TextUtils.isEmpty(str)) {
            return Objects.EMPTY_STRING;
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? str : str.substring(0, lastIndexOf);
    }

    /* renamed from: a */
    public final void mo8303a(int i, String str) {
        Log.println(i, mo8307s(), str);
    }

    /* renamed from: a */
    public final boolean mo8305a(int i) {
        return Log.isLoggable(mo8307s(), i);
    }

    /* renamed from: q */
    public final boolean mo8306q() {
        return false;
    }

    /* renamed from: s */
    public final String mo8307s() {
        String str;
        String str2;
        synchronized (this) {
            if (this.f7152e == null) {
                if (this.f7133a.f7335d != null) {
                    str2 = this.f7133a.f7335d;
                } else {
                    C3010ja jaVar = this.f7133a.f7338g.f7133a.f7337f;
                    str2 = "FA";
                }
                this.f7152e = str2;
            }
            str = this.f7152e;
        }
        return str;
    }

    /* renamed from: t */
    public final C2944e4 mo8308t() {
        return this.f7153f;
    }

    /* renamed from: u */
    public final C2944e4 mo8309u() {
        return this.f7156i;
    }

    /* renamed from: v */
    public final C2944e4 mo8310v() {
        return this.f7158k;
    }

    /* renamed from: w */
    public final C2944e4 mo8311w() {
        return this.f7160m;
    }

    /* renamed from: x */
    public final C2944e4 mo8312x() {
        return this.f7161n;
    }

    /* renamed from: y */
    public final String mo8313y() {
        long j;
        Pair pair;
        C3096r4 r4Var = mo8288l().f7621d;
        r4Var.f7822e.mo8279c();
        r4Var.f7822e.mo8279c();
        long j2 = r4Var.f7822e.mo8667s().getLong(r4Var.f7818a, 0);
        if (j2 == 0) {
            r4Var.mo8703a();
            j = 0;
        } else if (((C2284c) r4Var.f7822e.f7133a.f7345n) != null) {
            j = Math.abs(j2 - System.currentTimeMillis());
        } else {
            throw null;
        }
        long j3 = r4Var.f7821d;
        if (j >= j3) {
            if (j > (j3 << 1)) {
                r4Var.mo8703a();
            } else {
                String string = r4Var.f7822e.mo8667s().getString(r4Var.f7820c, null);
                long j4 = r4Var.f7822e.mo8667s().getLong(r4Var.f7819b, 0);
                r4Var.mo8703a();
                pair = (string == null || j4 <= 0) ? C3063o4.f7616D : new Pair(string, Long.valueOf(j4));
                if (pair != null || pair == C3063o4.f7616D) {
                    return null;
                }
                String valueOf = String.valueOf(pair.second);
                String str = (String) pair.first;
                return C1965a.m4745a(C1965a.m4743a(str, valueOf.length() + 1), valueOf, ":", str);
            }
        }
        pair = null;
        if (pair != null) {
        }
        return null;
    }

    /* renamed from: a */
    public final void mo8304a(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        String str2;
        if (!z && Log.isLoggable(mo8307s(), i)) {
            Log.println(i, mo8307s(), m6747a(false, str, obj, obj2, obj3));
        }
        if (!z2 && i >= 5) {
            C1061o.m2524b(str);
            C3184z4 z4Var = this.f7133a.f7341j;
            if (z4Var == null) {
                str2 = "Scheduler not set. Not logging error/warn";
            } else if (!z4Var.mo8849r()) {
                str2 = "Scheduler not initialized. Not logging error/warn";
            } else {
                if (i < 0) {
                    i = 0;
                }
                if (i >= 9) {
                    i = 8;
                }
                C2896a4 a4Var = new C2896a4(this, i, str, obj, obj2, obj3);
                z4Var.mo8846n();
                C1061o.m2524b(a4Var);
                z4Var.mo8843a(new C2945e5<>(z4Var, a4Var, "Task exception on worker thread"));
            }
            mo8303a(6, str2);
        }
    }
}
