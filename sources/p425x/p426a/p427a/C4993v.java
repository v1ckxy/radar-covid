package p425x.p426a.p427a;

import java.util.Enumeration;
import java.util.NoSuchElementException;

/* renamed from: x.a.a.v */
public class C4993v implements Enumeration {

    /* renamed from: a */
    public int f11875a = 0;

    /* renamed from: b */
    public final /* synthetic */ C4996w f11876b;

    public C4993v(C4996w wVar) {
        this.f11876b = wVar;
    }

    public boolean hasMoreElements() {
        return this.f11875a < this.f11876b.f11878e.length;
    }

    public Object nextElement() {
        int i = this.f11875a;
        C4929d[] dVarArr = this.f11876b.f11878e;
        if (i < dVarArr.length) {
            this.f11875a = i + 1;
            return dVarArr[i];
        }
        throw new NoSuchElementException("ASN1Set Enumeration");
    }
}
