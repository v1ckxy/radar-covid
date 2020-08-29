package p425x.p426a.p427a;

import java.io.IOException;
import java.util.Enumeration;

/* renamed from: x.a.a.x1 */
public class C5001x1 implements Enumeration {

    /* renamed from: a */
    public C4955j f11887a;

    /* renamed from: b */
    public Object f11888b = mo11649a();

    public C5001x1(byte[] bArr) {
        this.f11887a = new C4955j(bArr, true);
    }

    /* renamed from: a */
    public final Object mo11649a() {
        try {
            return this.f11887a.readObject();
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("malformed DER construction: ");
            sb.append(e);
            throw new C4980r(sb.toString(), e);
        }
    }

    public boolean hasMoreElements() {
        return this.f11888b != null;
    }

    public Object nextElement() {
        Object obj = this.f11888b;
        this.f11888b = mo11649a();
        return obj;
    }
}
