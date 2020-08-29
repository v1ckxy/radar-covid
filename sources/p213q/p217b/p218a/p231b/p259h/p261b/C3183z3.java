package p213q.p217b.p218a.p231b.p259h.p261b;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import p116io.jsonwebtoken.lang.Objects;
import p124p.p126b.p127k.C1061o;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p231b.p251g.p256e.C2602oa;

/* renamed from: q.b.a.b.h.b.z3 */
public final class C3183z3 extends C3185z5 {

    /* renamed from: c */
    public static final AtomicReference<String[]> f7996c = new AtomicReference<>();

    /* renamed from: d */
    public static final AtomicReference<String[]> f7997d = new AtomicReference<>();

    /* renamed from: e */
    public static final AtomicReference<String[]> f7998e = new AtomicReference<>();

    public C3183z3(C2969g5 g5Var) {
        super(g5Var);
    }

    /* renamed from: a */
    public static String m7493a(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        C1061o.m2524b(strArr);
        C1061o.m2524b(strArr2);
        C1061o.m2524b(atomicReference);
        C1061o.m2507a(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (C3156w9.m7416c(str, strArr[i])) {
                synchronized (atomicReference) {
                    String[] strArr3 = (String[]) atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    if (strArr3[i] == null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(strArr2[i]);
                        sb.append("(");
                        sb.append(strArr[i]);
                        sb.append(")");
                        strArr3[i] = sb.toString();
                    }
                    str2 = strArr3[i];
                }
                return str2;
            }
        }
        return str;
    }

    /* renamed from: a */
    public final String mo8833a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!mo8839s()) {
            return bundle.toString();
        }
        StringBuilder a = C1965a.m4756a("Bundle[{");
        for (String str : bundle.keySet()) {
            if (a.length() != 8) {
                a.append(Objects.ARRAY_ELEMENT_SEPARATOR);
            }
            a.append(mo8837b(str));
            a.append("=");
            if (!C2602oa.m6203b() || !this.f7133a.f7338g.mo8574a(C3069p.f7675E0)) {
                a.append(bundle.get(str));
            } else {
                Object obj = bundle.get(str);
                String str2 = obj instanceof Bundle ? mo8836a(new Object[]{obj}) : obj instanceof Object[] ? mo8836a((Object[]) obj) : obj instanceof ArrayList ? mo8836a(((ArrayList) obj).toArray()) : String.valueOf(obj);
                a.append(str2);
            }
        }
        a.append("}]");
        return a.toString();
    }

    /* renamed from: a */
    public final String mo8834a(String str) {
        if (str == null) {
            return null;
        }
        return !mo8839s() ? str : m7493a(str, C2946e6.f7282b, C2946e6.f7281a, f7996c);
    }

    /* renamed from: a */
    public final String mo8835a(C3047n nVar) {
        String str = null;
        if (nVar == null) {
            return null;
        }
        if (!mo8839s()) {
            return nVar.toString();
        }
        StringBuilder a = C1965a.m4756a("origin=");
        a.append(nVar.f7584g);
        a.append(",name=");
        a.append(mo8834a(nVar.f7582e));
        a.append(",params=");
        C3036m mVar = nVar.f7583f;
        if (mVar != null) {
            str = !mo8839s() ? mVar.toString() : mo8833a(mVar.mo8637b());
        }
        a.append(str);
        return a.toString();
    }

    /* renamed from: a */
    public final String mo8836a(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder a = C1965a.m4756a("[");
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            Bundle bundle = objArr[i];
            String a2 = bundle instanceof Bundle ? mo8833a(bundle) : String.valueOf(bundle);
            if (a2 != null) {
                if (a.length() != 1) {
                    a.append(Objects.ARRAY_ELEMENT_SEPARATOR);
                }
                a.append(a2);
            }
        }
        a.append("]");
        return a.toString();
    }

    /* renamed from: b */
    public final String mo8837b(String str) {
        if (str == null) {
            return null;
        }
        return !mo8839s() ? str : m7493a(str, C2934d6.f7246b, C2934d6.f7245a, f7997d);
    }

    /* renamed from: c */
    public final String mo8838c(String str) {
        if (str == null) {
            return null;
        }
        if (!mo8839s()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return m7493a(str, C2970g6.f7359b, C2970g6.f7358a, f7998e);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("experiment_id");
        sb.append("(");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: q */
    public final boolean mo8306q() {
        return false;
    }

    /* renamed from: s */
    public final boolean mo8839s() {
        C2969g5 g5Var = this.f7133a;
        C3010ja jaVar = g5Var.f7337f;
        return g5Var.mo8475r() && this.f7133a.mo8285i().mo8305a(3);
    }
}
