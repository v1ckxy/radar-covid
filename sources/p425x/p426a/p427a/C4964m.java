package p425x.p426a.p427a;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import p425x.p426a.p469f.C5162c;

/* renamed from: x.a.a.m */
public abstract class C4964m implements C4929d, C5162c {
    /* renamed from: a */
    public void mo11597a(OutputStream outputStream) {
        new C4977q(outputStream).mo11618a((C4929d) this);
    }

    /* renamed from: a */
    public byte[] mo11599a(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        mo11598a(byteArrayOutputStream, str);
        return byteArrayOutputStream.toByteArray();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4929d)) {
            return false;
        }
        return mo11569f().mo11626b(((C4929d) obj).mo11569f());
    }

    /* renamed from: f */
    public abstract C4983s mo11569f();

    public byte[] getEncoded() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        mo11597a((OutputStream) byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public int hashCode() {
        return mo11569f().hashCode();
    }

    /* renamed from: a */
    public void mo11598a(OutputStream outputStream, String str) {
        C4977q.m11301a(outputStream, str).mo11555a(mo11569f(), true);
    }
}
