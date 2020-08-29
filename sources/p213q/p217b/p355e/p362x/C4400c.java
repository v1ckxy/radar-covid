package p213q.p217b.p355e.p362x;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: q.b.e.x.c */
public class C4400c implements Closeable, Flushable {

    /* renamed from: n */
    public static final String[] f10486n = new String[128];

    /* renamed from: o */
    public static final String[] f10487o;

    /* renamed from: e */
    public final Writer f10488e;

    /* renamed from: f */
    public int[] f10489f = new int[32];

    /* renamed from: g */
    public int f10490g = 0;

    /* renamed from: h */
    public String f10491h;

    /* renamed from: i */
    public String f10492i;

    /* renamed from: j */
    public boolean f10493j;

    /* renamed from: k */
    public boolean f10494k;

    /* renamed from: l */
    public String f10495l;

    /* renamed from: m */
    public boolean f10496m;

    static {
        for (int i = 0; i <= 31; i++) {
            f10486n[i] = String.format("\\u%04x", new Object[]{Integer.valueOf(i)});
        }
        String[] strArr = f10486n;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f10487o = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C4400c(Writer writer) {
        mo10689a(6);
        this.f10492i = ":";
        this.f10496m = true;
        if (writer != null) {
            this.f10488e = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    /* renamed from: a */
    public final C4400c mo10687a(int i, int i2, String str) {
        int peek = peek();
        if (peek != i2 && peek != i) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f10495l == null) {
            this.f10490g--;
            if (peek == i2) {
                mo10692m();
            }
            this.f10488e.write(str);
            return this;
        } else {
            StringBuilder a = C1965a.m4756a("Dangling name: ");
            a.append(this.f10495l);
            throw new IllegalStateException(a.toString());
        }
    }

    /* renamed from: a */
    public C4400c mo10648a(Boolean bool) {
        if (bool == null) {
            return mo10661o();
        }
        mo10693r();
        mo10688a();
        this.f10488e.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    /* renamed from: a */
    public C4400c mo10649a(Number number) {
        if (number == null) {
            return mo10661o();
        }
        mo10693r();
        String obj = number.toString();
        if (this.f10493j || (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN"))) {
            mo10688a();
            this.f10488e.append(obj);
            return this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Numeric values must be finite, but was ");
        sb.append(number);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public C4400c mo10650a(boolean z) {
        mo10693r();
        mo10688a();
        this.f10488e.write(z ? "true" : "false");
        return this;
    }

    /* renamed from: a */
    public final void mo10688a() {
        int peek = peek();
        if (peek == 1) {
            mo10690b(2);
        } else if (peek == 2) {
            this.f10488e.append(',');
        } else if (peek != 4) {
            if (peek != 6) {
                if (peek != 7) {
                    throw new IllegalStateException("Nesting problem.");
                } else if (!this.f10493j) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            mo10690b(7);
            return;
        } else {
            this.f10488e.append(this.f10492i);
            mo10690b(5);
            return;
        }
        mo10692m();
    }

    /* renamed from: a */
    public final void mo10689a(int i) {
        int i2 = this.f10490g;
        int[] iArr = this.f10489f;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(i2 * 2)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f10489f = iArr2;
        }
        int[] iArr3 = this.f10489f;
        int i3 = this.f10490g;
        this.f10490g = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: b */
    public C4400c mo10652b(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.f10495l != null) {
            throw new IllegalStateException();
        } else if (this.f10490g != 0) {
            this.f10495l = str;
            return this;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    /* renamed from: b */
    public final void mo10690b(int i) {
        this.f10489f[this.f10490g - 1] = i;
    }

    /* renamed from: c */
    public final void mo10691c(String str) {
        String str2;
        String[] strArr = this.f10494k ? f10487o : f10486n;
        String str3 = "\"";
        this.f10488e.write(str3);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i < i2) {
                this.f10488e.write(str, i, i2 - i);
            }
            this.f10488e.write(str2);
            i = i2 + 1;
        }
        if (i < length) {
            this.f10488e.write(str, i, length - i);
        }
        this.f10488e.write(str3);
    }

    public void close() {
        this.f10488e.close();
        int i = this.f10490g;
        if (i > 1 || (i == 1 && this.f10489f[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f10490g = 0;
    }

    /* renamed from: d */
    public C4400c mo10654d(long j) {
        mo10693r();
        mo10688a();
        this.f10488e.write(Long.toString(j));
        return this;
    }

    /* renamed from: d */
    public C4400c mo10655d(String str) {
        if (str == null) {
            return mo10661o();
        }
        mo10693r();
        mo10688a();
        mo10691c(str);
        return this;
    }

    /* renamed from: f */
    public C4400c mo10656f() {
        mo10693r();
        mo10688a();
        mo10689a(1);
        this.f10488e.write("[");
        return this;
    }

    public void flush() {
        if (this.f10490g != 0) {
            this.f10488e.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: g */
    public C4400c mo10658g() {
        mo10693r();
        mo10688a();
        mo10689a(3);
        this.f10488e.write(Objects.ARRAY_START);
        return this;
    }

    /* renamed from: h */
    public C4400c mo10659h() {
        mo10687a(1, 2, "]");
        return this;
    }

    /* renamed from: k */
    public C4400c mo10660k() {
        mo10687a(3, 5, Objects.ARRAY_END);
        return this;
    }

    /* renamed from: m */
    public final void mo10692m() {
        if (this.f10491h != null) {
            this.f10488e.write("\n");
            int i = this.f10490g;
            for (int i2 = 1; i2 < i; i2++) {
                this.f10488e.write(this.f10491h);
            }
        }
    }

    /* renamed from: o */
    public C4400c mo10661o() {
        if (this.f10495l != null) {
            if (this.f10496m) {
                mo10693r();
            } else {
                this.f10495l = null;
                return this;
            }
        }
        mo10688a();
        this.f10488e.write(Objects.NULL_STRING);
        return this;
    }

    public final int peek() {
        int i = this.f10490g;
        if (i != 0) {
            return this.f10489f[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: r */
    public final void mo10693r() {
        if (this.f10495l != null) {
            int peek = peek();
            if (peek == 5) {
                this.f10488e.write(44);
            } else if (peek != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            mo10692m();
            mo10690b(4);
            mo10691c(this.f10495l);
            this.f10495l = null;
        }
    }
}
