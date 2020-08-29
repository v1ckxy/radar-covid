package p425x.p426a.p427a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: x.a.a.f0 */
public class C4938f0 extends C4971o {

    /* renamed from: f */
    public final int f11790f;

    /* renamed from: g */
    public final C4971o[] f11791g;

    /* renamed from: x.a.a.f0$a */
    public class C4939a implements Enumeration {

        /* renamed from: a */
        public int f11792a = 0;

        public C4939a() {
        }

        public boolean hasMoreElements() {
            return this.f11792a < C4938f0.this.f11791g.length;
        }

        public Object nextElement() {
            C4971o[] oVarArr = C4938f0.this.f11791g;
            int i = this.f11792a;
            this.f11792a = i + 1;
            return oVarArr[i];
        }
    }

    public C4938f0(byte[] bArr) {
        super(bArr);
        this.f11791g = null;
        this.f11790f = 1000;
    }

    /* renamed from: a */
    public static C4938f0 m11167a(C4986t tVar) {
        int size = tVar.size();
        C4971o[] oVarArr = new C4971o[size];
        for (int i = 0; i < size; i++) {
            oVarArr[i] = C4971o.m11277a((Object) tVar.mo11628e(i));
        }
        return new C4938f0(oVarArr);
    }

    /* renamed from: a */
    public void mo11548a(C4977q qVar, boolean z) {
        Enumeration m = mo11576m();
        if (z) {
            qVar.f11861a.write(36);
        }
        qVar.f11861a.write(128);
        qVar.mo11617a(m);
        qVar.f11861a.write(0);
        qVar.f11861a.write(0);
    }

    /* renamed from: h */
    public int mo11550h() {
        Enumeration m = mo11576m();
        int i = 0;
        while (m.hasMoreElements()) {
            i += ((C4929d) m.nextElement()).mo11569f().mo11550h();
        }
        return i + 2 + 2;
    }

    /* renamed from: i */
    public boolean mo11552i() {
        return true;
    }

    /* renamed from: m */
    public Enumeration mo11576m() {
        if (this.f11791g != null) {
            return new C4939a();
        }
        Vector vector = new Vector();
        int i = 0;
        while (true) {
            byte[] bArr = this.f11858e;
            if (i >= bArr.length) {
                return vector.elements();
            }
            int min = Math.min(bArr.length, this.f11790f + i) - i;
            byte[] bArr2 = new byte[min];
            System.arraycopy(this.f11858e, i, bArr2, 0, min);
            vector.addElement(new C5003y0(bArr2));
            i += this.f11790f;
        }
    }

    public C4938f0(C4971o[] oVarArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        while (i != oVarArr.length) {
            try {
                byteArrayOutputStream.write(oVarArr[i].f11858e);
                i++;
            } catch (ClassCastException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append(oVarArr[i].getClass().getName());
                sb.append(" found in input should only contain DEROctetString");
                throw new IllegalArgumentException(sb.toString());
            } catch (IOException e) {
                StringBuilder a = C1965a.m4756a("exception converting octets ");
                a.append(e.toString());
                throw new IllegalArgumentException(a.toString());
            }
        }
        super(byteArrayOutputStream.toByteArray());
        this.f11791g = oVarArr;
        this.f11790f = 1000;
    }
}
