package p425x.p426a.p427a;

import java.util.Arrays;
import p119o.p120a.C0967p0;
import p425x.p426a.p469f.p470i.C5170b;

/* renamed from: x.a.a.a */
public abstract class C4917a extends C4983s {

    /* renamed from: e */
    public final boolean f11715e;

    /* renamed from: f */
    public final int f11716f;

    /* renamed from: g */
    public final byte[] f11717g;

    public C4917a(boolean z, int i, byte[] bArr) {
        this.f11715e = z;
        this.f11716f = i;
        this.f11717g = C0967p0.m2217a(bArr);
    }

    /* renamed from: a */
    public void mo11548a(C4977q qVar, boolean z) {
        qVar.mo11621a(z, this.f11715e ? 96 : 64, this.f11716f, this.f11717g);
    }

    /* renamed from: a */
    public boolean mo11549a(C4983s sVar) {
        boolean z = false;
        if (!(sVar instanceof C4917a)) {
            return false;
        }
        C4917a aVar = (C4917a) sVar;
        if (this.f11715e == aVar.f11715e && this.f11716f == aVar.f11716f && Arrays.equals(this.f11717g, aVar.f11717g)) {
            z = true;
        }
        return z;
    }

    /* renamed from: h */
    public int mo11550h() {
        return C4924b2.m11131a(this.f11717g.length) + C4924b2.m11133b(this.f11716f) + this.f11717g.length;
    }

    public int hashCode() {
        return (this.f11715e ^ this.f11716f) ^ C0967p0.m2248d(this.f11717g) ? 1 : 0;
    }

    /* renamed from: i */
    public boolean mo11552i() {
        return this.f11715e;
    }

    public String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        if (this.f11715e) {
            stringBuffer.append("CONSTRUCTED ");
        }
        stringBuffer.append("APPLICATION ");
        stringBuffer.append(Integer.toString(this.f11716f));
        stringBuffer.append("]");
        if (this.f11717g != null) {
            stringBuffer.append(" #");
            str = C5170b.m11606b(this.f11717g);
        } else {
            str = " #null";
        }
        stringBuffer.append(str);
        stringBuffer.append(" ");
        return stringBuffer.toString();
    }
}
