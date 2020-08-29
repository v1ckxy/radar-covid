package p425x.p426a.p427a;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: x.a.a.s */
public abstract class C4983s extends C4964m {
    /* renamed from: a */
    public static C4983s m11325a(byte[] bArr) {
        C4955j jVar = new C4955j(bArr);
        try {
            C4983s readObject = jVar.readObject();
            if (jVar.available() == 0) {
                return readObject;
            }
            throw new IOException("Extra data detected in stream");
        } catch (ClassCastException unused) {
            throw new IOException("cannot recognise object in stream");
        }
    }

    /* renamed from: a */
    public void mo11597a(OutputStream outputStream) {
        mo11548a(new C4977q(outputStream), true);
    }

    /* renamed from: a */
    public abstract void mo11548a(C4977q qVar, boolean z);

    /* renamed from: a */
    public abstract boolean mo11549a(C4983s sVar);

    /* renamed from: b */
    public final boolean mo11626b(C4983s sVar) {
        return this == sVar || mo11549a(sVar);
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4929d) || !mo11549a(((C4929d) obj).mo11569f())) {
            z = false;
        }
        return z;
    }

    /* renamed from: f */
    public final C4983s mo11569f() {
        return this;
    }

    /* renamed from: h */
    public abstract int mo11550h();

    /* renamed from: i */
    public abstract boolean mo11552i();

    /* renamed from: k */
    public C4983s mo11558k() {
        return this;
    }

    /* renamed from: l */
    public C4983s mo11559l() {
        return this;
    }

    /* renamed from: a */
    public void mo11598a(OutputStream outputStream, String str) {
        C4977q.m11301a(outputStream, str).mo11555a(this, true);
    }
}
