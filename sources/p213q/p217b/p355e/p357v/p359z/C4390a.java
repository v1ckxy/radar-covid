package p213q.p217b.p355e.p357v.p359z;

import java.io.Reader;
import java.util.Iterator;
import java.util.Map.Entry;
import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p355e.C4329f;
import p213q.p217b.p355e.C4334k;
import p213q.p217b.p355e.C4335l;
import p213q.p217b.p355e.C4337n;
import p213q.p217b.p355e.p362x.C4397a;
import p213q.p217b.p355e.p362x.C4399b;

/* renamed from: q.b.e.v.z.a */
public final class C4390a extends C4397a {

    /* renamed from: y */
    public static final Object f10442y = new Object();

    /* renamed from: u */
    public Object[] f10443u;

    /* renamed from: v */
    public int f10444v;

    /* renamed from: w */
    public String[] f10445w;

    /* renamed from: x */
    public int[] f10446x;

    /* renamed from: q.b.e.v.z.a$a */
    public static class C4391a extends Reader {
        public void close() {
            throw new AssertionError();
        }

        public int read(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    static {
        new C4391a();
    }

    /* renamed from: s */
    private String m9903s() {
        StringBuilder a = C1965a.m4756a(" at path ");
        a.append(mo10635o());
        return a.toString();
    }

    /* renamed from: D */
    public void mo10625D() {
        C4399b peek = peek();
        C4399b bVar = C4399b.NAME;
        String str = Objects.NULL_STRING;
        if (peek == bVar) {
            mo10643x();
            this.f10445w[this.f10444v - 2] = str;
        } else {
            mo10627F();
            int i = this.f10444v;
            if (i > 0) {
                this.f10445w[i - 1] = str;
            }
        }
        int i2 = this.f10444v;
        if (i2 > 0) {
            int[] iArr = this.f10446x;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    /* renamed from: E */
    public final Object mo10626E() {
        return this.f10443u[this.f10444v - 1];
    }

    /* renamed from: F */
    public final Object mo10627F() {
        Object[] objArr = this.f10443u;
        int i = this.f10444v - 1;
        this.f10444v = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    /* renamed from: a */
    public void mo10628a() {
        mo10630a(C4399b.BEGIN_ARRAY);
        mo10629a((Object) ((C4329f) mo10626E()).iterator());
        this.f10446x[this.f10444v - 1] = 0;
    }

    /* renamed from: a */
    public final void mo10629a(Object obj) {
        int i = this.f10444v;
        Object[] objArr = this.f10443u;
        if (i == objArr.length) {
            Object[] objArr2 = new Object[(i * 2)];
            int[] iArr = new int[(i * 2)];
            String[] strArr = new String[(i * 2)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f10446x, 0, iArr, 0, this.f10444v);
            System.arraycopy(this.f10445w, 0, strArr, 0, this.f10444v);
            this.f10443u = objArr2;
            this.f10446x = iArr;
            this.f10445w = strArr;
        }
        Object[] objArr3 = this.f10443u;
        int i2 = this.f10444v;
        this.f10444v = i2 + 1;
        objArr3[i2] = obj;
    }

    /* renamed from: a */
    public final void mo10630a(C4399b bVar) {
        if (peek() != bVar) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected ");
            sb.append(bVar);
            sb.append(" but was ");
            sb.append(peek());
            sb.append(m9903s());
            throw new IllegalStateException(sb.toString());
        }
    }

    public void close() {
        this.f10443u = new Object[]{f10442y};
        this.f10444v = 1;
    }

    /* renamed from: f */
    public void mo10632f() {
        mo10630a(C4399b.BEGIN_OBJECT);
        mo10629a((Object) ((C4335l) mo10626E()).f10383a.entrySet().iterator());
    }

    /* renamed from: k */
    public void mo10633k() {
        mo10630a(C4399b.END_ARRAY);
        mo10627F();
        mo10627F();
        int i = this.f10444v;
        if (i > 0) {
            int[] iArr = this.f10446x;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    /* renamed from: m */
    public void mo10634m() {
        mo10630a(C4399b.END_OBJECT);
        mo10627F();
        mo10627F();
        int i = this.f10444v;
        if (i > 0) {
            int[] iArr = this.f10446x;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    /* renamed from: o */
    public String mo10635o() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = 0;
        while (i < this.f10444v) {
            Object[] objArr = this.f10443u;
            if (objArr[i] instanceof C4329f) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.f10446x[i]);
                    sb.append(']');
                }
            } else if (objArr[i] instanceof C4335l) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('.');
                    String[] strArr = this.f10445w;
                    if (strArr[i] != null) {
                        sb.append(strArr[i]);
                    }
                }
            }
            i++;
        }
        return sb.toString();
    }

    public C4399b peek() {
        if (this.f10444v == 0) {
            return C4399b.END_DOCUMENT;
        }
        Object E = mo10626E();
        if (E instanceof Iterator) {
            boolean z = this.f10443u[this.f10444v - 2] instanceof C4335l;
            Iterator it = (Iterator) E;
            if (!it.hasNext()) {
                return z ? C4399b.END_OBJECT : C4399b.END_ARRAY;
            } else if (z) {
                return C4399b.NAME;
            } else {
                mo10629a(it.next());
                return peek();
            }
        } else if (E instanceof C4335l) {
            return C4399b.BEGIN_OBJECT;
        } else {
            if (E instanceof C4329f) {
                return C4399b.BEGIN_ARRAY;
            }
            if (E instanceof C4337n) {
                Object obj = ((C4337n) E).f10385a;
                if (obj instanceof String) {
                    return C4399b.STRING;
                }
                if (obj instanceof Boolean) {
                    return C4399b.BOOLEAN;
                }
                if (obj instanceof Number) {
                    return C4399b.NUMBER;
                }
                throw new AssertionError();
            } else if (E instanceof C4334k) {
                return C4399b.NULL;
            } else {
                if (E == f10442y) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    /* renamed from: r */
    public boolean mo10637r() {
        C4399b peek = peek();
        return (peek == C4399b.END_OBJECT || peek == C4399b.END_ARRAY) ? false : true;
    }

    /* renamed from: t */
    public boolean mo10638t() {
        mo10630a(C4399b.BOOLEAN);
        boolean f = ((C4337n) mo10627F()).mo10549f();
        int i = this.f10444v;
        if (i > 0) {
            int[] iArr = this.f10446x;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return f;
    }

    public String toString() {
        return C4390a.class.getSimpleName();
    }

    /* renamed from: u */
    public double mo10640u() {
        C4399b peek = peek();
        if (peek == C4399b.NUMBER || peek == C4399b.STRING) {
            C4337n nVar = (C4337n) mo10626E();
            double doubleValue = nVar.f10385a instanceof Number ? nVar.mo10550g().doubleValue() : Double.parseDouble(nVar.mo10551h());
            if (this.f10461f || (!Double.isNaN(doubleValue) && !Double.isInfinite(doubleValue))) {
                mo10627F();
                int i = this.f10444v;
                if (i > 0) {
                    int[] iArr = this.f10446x;
                    int i2 = i - 1;
                    iArr[i2] = iArr[i2] + 1;
                }
                return doubleValue;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("JSON forbids NaN and infinities: ");
            sb.append(doubleValue);
            throw new NumberFormatException(sb.toString());
        }
        StringBuilder a = C1965a.m4756a("Expected ");
        a.append(C4399b.NUMBER);
        a.append(" but was ");
        a.append(peek);
        a.append(m9903s());
        throw new IllegalStateException(a.toString());
    }

    /* renamed from: v */
    public int mo10641v() {
        C4399b peek = peek();
        if (peek == C4399b.NUMBER || peek == C4399b.STRING) {
            C4337n nVar = (C4337n) mo10626E();
            int intValue = nVar.f10385a instanceof Number ? nVar.mo10550g().intValue() : Integer.parseInt(nVar.mo10551h());
            mo10627F();
            int i = this.f10444v;
            if (i > 0) {
                int[] iArr = this.f10446x;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return intValue;
        }
        StringBuilder a = C1965a.m4756a("Expected ");
        a.append(C4399b.NUMBER);
        a.append(" but was ");
        a.append(peek);
        a.append(m9903s());
        throw new IllegalStateException(a.toString());
    }

    /* renamed from: w */
    public long mo10642w() {
        C4399b peek = peek();
        if (peek == C4399b.NUMBER || peek == C4399b.STRING) {
            C4337n nVar = (C4337n) mo10626E();
            long longValue = nVar.f10385a instanceof Number ? nVar.mo10550g().longValue() : Long.parseLong(nVar.mo10551h());
            mo10627F();
            int i = this.f10444v;
            if (i > 0) {
                int[] iArr = this.f10446x;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return longValue;
        }
        StringBuilder a = C1965a.m4756a("Expected ");
        a.append(C4399b.NUMBER);
        a.append(" but was ");
        a.append(peek);
        a.append(m9903s());
        throw new IllegalStateException(a.toString());
    }

    /* renamed from: x */
    public String mo10643x() {
        mo10630a(C4399b.NAME);
        Entry entry = (Entry) ((Iterator) mo10626E()).next();
        String str = (String) entry.getKey();
        this.f10445w[this.f10444v - 1] = str;
        mo10629a(entry.getValue());
        return str;
    }

    /* renamed from: y */
    public void mo10644y() {
        mo10630a(C4399b.NULL);
        mo10627F();
        int i = this.f10444v;
        if (i > 0) {
            int[] iArr = this.f10446x;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    /* renamed from: z */
    public String mo10645z() {
        C4399b peek = peek();
        if (peek == C4399b.STRING || peek == C4399b.NUMBER) {
            String h = ((C4337n) mo10627F()).mo10551h();
            int i = this.f10444v;
            if (i > 0) {
                int[] iArr = this.f10446x;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return h;
        }
        StringBuilder a = C1965a.m4756a("Expected ");
        a.append(C4399b.STRING);
        a.append(" but was ");
        a.append(peek);
        a.append(m9903s());
        throw new IllegalStateException(a.toString());
    }
}
