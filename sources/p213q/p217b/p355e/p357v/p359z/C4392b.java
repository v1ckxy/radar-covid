package p213q.p217b.p355e.p357v.p359z;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import p213q.p217b.p355e.C4329f;
import p213q.p217b.p355e.C4332i;
import p213q.p217b.p355e.C4334k;
import p213q.p217b.p355e.C4335l;
import p213q.p217b.p355e.C4337n;
import p213q.p217b.p355e.p362x.C4400c;

/* renamed from: q.b.e.v.z.b */
public final class C4392b extends C4400c {

    /* renamed from: s */
    public static final Writer f10447s = new C4393a();

    /* renamed from: t */
    public static final C4337n f10448t = new C4337n("closed");

    /* renamed from: p */
    public final List<C4332i> f10449p = new ArrayList();

    /* renamed from: q */
    public String f10450q;

    /* renamed from: r */
    public C4332i f10451r = C4334k.f10382a;

    /* renamed from: q.b.e.v.z.b$a */
    public static class C4393a extends Writer {
        public void close() {
            throw new AssertionError();
        }

        public void flush() {
            throw new AssertionError();
        }

        public void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    public C4392b() {
        super(f10447s);
    }

    /* renamed from: a */
    public C4400c mo10650a(boolean z) {
        mo10651a((C4332i) new C4337n(Boolean.valueOf(z)));
        return this;
    }

    /* renamed from: a */
    public final void mo10651a(C4332i iVar) {
        if (this.f10450q != null) {
            if (iVar != null) {
                if (!(iVar instanceof C4334k) || this.f10496m) {
                    C4335l lVar = (C4335l) peek();
                    String str = this.f10450q;
                    if (lVar != null) {
                        lVar.f10383a.put(str, iVar);
                    } else {
                        throw null;
                    }
                }
                this.f10450q = null;
                return;
            }
            throw null;
        } else if (this.f10449p.isEmpty()) {
            this.f10451r = iVar;
        } else {
            C4332i peek = peek();
            if (peek instanceof C4329f) {
                C4329f fVar = (C4329f) peek;
                if (fVar != null) {
                    if (iVar == null) {
                        iVar = C4334k.f10382a;
                    }
                    fVar.f10381e.add(iVar);
                    return;
                }
                throw null;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: b */
    public C4400c mo10652b(String str) {
        if (this.f10449p.isEmpty() || this.f10450q != null) {
            throw new IllegalStateException();
        } else if (peek() instanceof C4335l) {
            this.f10450q = str;
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public void close() {
        if (this.f10449p.isEmpty()) {
            this.f10449p.add(f10448t);
            return;
        }
        throw new IOException("Incomplete document");
    }

    /* renamed from: d */
    public C4400c mo10654d(long j) {
        mo10651a((C4332i) new C4337n((Number) Long.valueOf(j)));
        return this;
    }

    /* renamed from: d */
    public C4400c mo10655d(String str) {
        if (str == null) {
            mo10651a((C4332i) C4334k.f10382a);
            return this;
        }
        mo10651a((C4332i) new C4337n(str));
        return this;
    }

    /* renamed from: f */
    public C4400c mo10656f() {
        C4329f fVar = new C4329f();
        mo10651a((C4332i) fVar);
        this.f10449p.add(fVar);
        return this;
    }

    public void flush() {
    }

    /* renamed from: g */
    public C4400c mo10658g() {
        C4335l lVar = new C4335l();
        mo10651a((C4332i) lVar);
        this.f10449p.add(lVar);
        return this;
    }

    /* renamed from: h */
    public C4400c mo10659h() {
        if (this.f10449p.isEmpty() || this.f10450q != null) {
            throw new IllegalStateException();
        } else if (peek() instanceof C4329f) {
            List<C4332i> list = this.f10449p;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: k */
    public C4400c mo10660k() {
        if (this.f10449p.isEmpty() || this.f10450q != null) {
            throw new IllegalStateException();
        } else if (peek() instanceof C4335l) {
            List<C4332i> list = this.f10449p;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: o */
    public C4400c mo10661o() {
        mo10651a((C4332i) C4334k.f10382a);
        return this;
    }

    public final C4332i peek() {
        List<C4332i> list = this.f10449p;
        return (C4332i) list.get(list.size() - 1);
    }

    /* renamed from: a */
    public C4400c mo10648a(Boolean bool) {
        if (bool == null) {
            mo10651a((C4332i) C4334k.f10382a);
            return this;
        }
        mo10651a((C4332i) new C4337n(bool));
        return this;
    }

    /* renamed from: a */
    public C4400c mo10649a(Number number) {
        if (number == null) {
            mo10651a((C4332i) C4334k.f10382a);
            return this;
        }
        if (!this.f10493j) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                StringBuilder sb = new StringBuilder();
                sb.append("JSON forbids NaN and infinities: ");
                sb.append(number);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        mo10651a((C4332i) new C4337n(number));
        return this;
    }
}
