package p425x.p426a.p427a;

import java.io.IOException;
import java.util.Iterator;
import p116io.jsonwebtoken.lang.Objects;
import p425x.p426a.p469f.C5160a;
import p425x.p426a.p469f.C5163d;

/* renamed from: x.a.a.w */
public abstract class C4996w extends C4983s implements C5163d<C4929d> {

    /* renamed from: e */
    public final C4929d[] f11878e;

    /* renamed from: f */
    public final boolean f11879f;

    public C4996w() {
        this.f11878e = C4933e.f11770d;
        this.f11879f = true;
    }

    public C4996w(C4929d dVar) {
        if (dVar != null) {
            this.f11878e = new C4929d[]{dVar};
            this.f11879f = true;
            return;
        }
        throw new NullPointerException("'element' cannot be null");
    }

    public C4996w(C4933e eVar, boolean z) {
        C4929d[] dVarArr;
        if (eVar != null) {
            boolean z2 = false;
            if (z) {
                int i = eVar.f11772b;
                if (i >= 2) {
                    if (i == 0) {
                        dVarArr = C4933e.f11770d;
                    } else {
                        C4929d[] dVarArr2 = new C4929d[i];
                        System.arraycopy(eVar.f11771a, 0, dVarArr2, 0, i);
                        dVarArr = dVarArr2;
                    }
                    m11369a(dVarArr);
                    this.f11878e = dVarArr;
                    if (z || dVarArr.length < 2) {
                        z2 = true;
                    }
                    this.f11879f = z2;
                    return;
                }
            }
            dVarArr = eVar.mo11574a();
            this.f11878e = dVarArr;
            z2 = true;
            this.f11879f = z2;
            return;
        }
        throw new NullPointerException("'elementVector' cannot be null");
    }

    public C4996w(boolean z, C4929d[] dVarArr) {
        this.f11878e = dVarArr;
        this.f11879f = z || dVarArr.length < 2;
    }

    /* renamed from: a */
    public static void m11369a(C4929d[] dVarArr) {
        int length = dVarArr.length;
        if (length >= 2) {
            C4929d dVar = dVarArr[0];
            C4929d dVar2 = dVarArr[1];
            byte[] a = m11371a(dVar);
            byte[] a2 = m11371a(dVar2);
            if (m11370a(a2, a)) {
                C4929d dVar3 = dVar2;
                dVar2 = dVar;
                dVar = dVar3;
                byte[] bArr = a2;
                a2 = a;
                a = bArr;
            }
            for (int i = 2; i < length; i++) {
                C4929d dVar4 = dVarArr[i];
                byte[] a3 = m11371a(dVar4);
                if (m11370a(a2, a3)) {
                    dVarArr[i - 2] = dVar;
                    dVar = dVar2;
                    a = a2;
                    dVar2 = dVar4;
                    a2 = a3;
                } else if (m11370a(a, a3)) {
                    dVarArr[i - 2] = dVar;
                    dVar = dVar4;
                    a = a3;
                } else {
                    int i2 = i - 1;
                    while (true) {
                        i2--;
                        if (i2 <= 0) {
                            break;
                        }
                        C4929d dVar5 = dVarArr[i2 - 1];
                        if (m11370a(m11371a(dVar5), a3)) {
                            break;
                        }
                        dVarArr[i2] = dVar5;
                    }
                    dVarArr[i2] = dVar4;
                }
            }
            dVarArr[length - 2] = dVar;
            dVarArr[length - 1] = dVar2;
        }
    }

    /* renamed from: a */
    public static boolean m11370a(byte[] bArr, byte[] bArr2) {
        boolean z = false;
        byte b = bArr[0] & -33;
        byte b2 = bArr2[0] & -33;
        if (b != b2) {
            if (b < b2) {
                z = true;
            }
            return z;
        }
        int min = Math.min(bArr.length, bArr2.length) - 1;
        for (int i = 1; i < min; i++) {
            if (bArr[i] != bArr2[i]) {
                if ((bArr[i] & 255) < (bArr2[i] & 255)) {
                    z = true;
                }
                return z;
            }
        }
        if ((bArr[min] & 255) <= (bArr2[min] & 255)) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public static byte[] m11371a(C4929d dVar) {
        try {
            return dVar.mo11569f().mo11599a("DER");
        } catch (IOException unused) {
            throw new IllegalArgumentException("cannot encode object added to SET");
        }
    }

    /* renamed from: a */
    public boolean mo11549a(C4983s sVar) {
        if (!(sVar instanceof C4996w)) {
            return false;
        }
        C4996w wVar = (C4996w) sVar;
        int length = this.f11878e.length;
        if (wVar.f11878e.length != length) {
            return false;
        }
        C4931d1 d1Var = (C4931d1) mo11558k();
        C4931d1 d1Var2 = (C4931d1) wVar.mo11558k();
        for (int i = 0; i < length; i++) {
            C4983s f = d1Var.f11878e[i].mo11569f();
            C4983s f2 = d1Var2.f11878e[i].mo11569f();
            if (f != f2 && !f.mo11549a(f2)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int length = this.f11878e.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i += this.f11878e[length].mo11569f().hashCode();
        }
    }

    /* renamed from: i */
    public boolean mo11552i() {
        return true;
    }

    public Iterator<C4929d> iterator() {
        C4929d[] dVarArr = this.f11878e;
        return new C5160a(dVarArr.length < 1 ? C4933e.f11770d : (C4929d[]) dVarArr.clone());
    }

    /* renamed from: k */
    public C4983s mo11558k() {
        C4929d[] dVarArr;
        if (this.f11879f) {
            dVarArr = this.f11878e;
        } else {
            dVarArr = (C4929d[]) this.f11878e.clone();
            m11369a(dVarArr);
        }
        return new C4931d1(true, dVarArr);
    }

    /* renamed from: l */
    public C4983s mo11559l() {
        return new C4982r1(this.f11879f, this.f11878e);
    }

    public String toString() {
        int length = this.f11878e.length;
        if (length == 0) {
            return "[]";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('[');
        int i = 0;
        while (true) {
            stringBuffer.append(this.f11878e[i]);
            i++;
            if (i >= length) {
                stringBuffer.append(']');
                return stringBuffer.toString();
            }
            stringBuffer.append(Objects.ARRAY_ELEMENT_SEPARATOR);
        }
    }
}
