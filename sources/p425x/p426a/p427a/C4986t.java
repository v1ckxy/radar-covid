package p425x.p426a.p427a;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p425x.p426a.p469f.C5160a;
import p425x.p426a.p469f.C5163d;

/* renamed from: x.a.a.t */
public abstract class C4986t extends C4983s implements C5163d<C4929d> {

    /* renamed from: e */
    public C4929d[] f11868e;

    /* renamed from: x.a.a.t$a */
    public class C4987a implements Enumeration {

        /* renamed from: a */
        public int f11869a = 0;

        public C4987a() {
        }

        public boolean hasMoreElements() {
            return this.f11869a < C4986t.this.f11868e.length;
        }

        public Object nextElement() {
            int i = this.f11869a;
            C4929d[] dVarArr = C4986t.this.f11868e;
            if (i < dVarArr.length) {
                this.f11869a = i + 1;
                return dVarArr[i];
            }
            throw new NoSuchElementException("ASN1Sequence Enumeration");
        }
    }

    public C4986t() {
        this.f11868e = C4933e.f11770d;
    }

    public C4986t(C4933e eVar) {
        if (eVar != null) {
            this.f11868e = eVar.mo11574a();
            return;
        }
        throw new NullPointerException("'elementVector' cannot be null");
    }

    public C4986t(C4929d[] dVarArr, boolean z) {
        if (z) {
            dVarArr = dVarArr.length < 1 ? C4933e.f11770d : (C4929d[]) dVarArr.clone();
        }
        this.f11868e = dVarArr;
    }

    /* renamed from: a */
    public static C4986t m11342a(Object obj) {
        if (obj == null || (obj instanceof C4986t)) {
            return (C4986t) obj;
        }
        if (obj instanceof C4990u) {
            return m11342a((Object) ((C4990u) obj).mo11569f());
        }
        if (obj instanceof byte[]) {
            try {
                return m11342a((Object) C4983s.m11325a((byte[]) obj));
            } catch (IOException e) {
                StringBuilder a = C1965a.m4756a("failed to construct sequence from byte[]: ");
                a.append(e.getMessage());
                throw new IllegalArgumentException(a.toString());
            }
        } else {
            if (obj instanceof C4929d) {
                C4983s f = ((C4929d) obj).mo11569f();
                if (f instanceof C4986t) {
                    return (C4986t) f;
                }
            }
            StringBuilder a2 = C1965a.m4756a("unknown object in getInstance: ");
            a2.append(obj.getClass().getName());
            throw new IllegalArgumentException(a2.toString());
        }
    }

    /* renamed from: a */
    public boolean mo11549a(C4983s sVar) {
        if (!(sVar instanceof C4986t)) {
            return false;
        }
        C4986t tVar = (C4986t) sVar;
        int size = size();
        if (tVar.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            C4983s f = this.f11868e[i].mo11569f();
            C4983s f2 = tVar.f11868e[i].mo11569f();
            if (f != f2 && !f.mo11549a(f2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public C4929d mo11628e(int i) {
        return this.f11868e[i];
    }

    public int hashCode() {
        int length = this.f11868e.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ this.f11868e[length].mo11569f().hashCode();
        }
    }

    /* renamed from: i */
    public boolean mo11552i() {
        return true;
    }

    public Iterator<C4929d> iterator() {
        return new C5160a(this.f11868e);
    }

    /* renamed from: k */
    public C4983s mo11558k() {
        return new C4927c1(this.f11868e, false);
    }

    /* renamed from: l */
    public C4983s mo11559l() {
        return new C4976p1(this.f11868e, false);
    }

    /* renamed from: m */
    public Enumeration mo11630m() {
        return new C4987a();
    }

    /* renamed from: o */
    public C4929d[] mo11631o() {
        return this.f11868e;
    }

    public int size() {
        return this.f11868e.length;
    }

    public String toString() {
        int size = size();
        if (size == 0) {
            return "[]";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('[');
        int i = 0;
        while (true) {
            stringBuffer.append(this.f11868e[i]);
            i++;
            if (i >= size) {
                stringBuffer.append(']');
                return stringBuffer.toString();
            }
            stringBuffer.append(Objects.ARRAY_ELEMENT_SEPARATOR);
        }
    }
}
