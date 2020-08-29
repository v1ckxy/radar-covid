package p213q.p217b.p355e.p362x;

import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p355e.p357v.C4373p;

/* renamed from: q.b.e.x.a */
public class C4397a implements Closeable {

    /* renamed from: t */
    public static final char[] f10459t = ")]}'\n".toCharArray();

    /* renamed from: e */
    public final Reader f10460e;

    /* renamed from: f */
    public boolean f10461f = false;

    /* renamed from: g */
    public final char[] f10462g = new char[1024];

    /* renamed from: h */
    public int f10463h = 0;

    /* renamed from: i */
    public int f10464i = 0;

    /* renamed from: j */
    public int f10465j = 0;

    /* renamed from: k */
    public int f10466k = 0;

    /* renamed from: l */
    public int f10467l = 0;

    /* renamed from: m */
    public long f10468m;

    /* renamed from: n */
    public int f10469n;

    /* renamed from: o */
    public String f10470o;

    /* renamed from: p */
    public int[] f10471p;

    /* renamed from: q */
    public int f10472q;

    /* renamed from: r */
    public String[] f10473r;

    /* renamed from: s */
    public int[] f10474s;

    /* renamed from: q.b.e.x.a$a */
    public static class C4398a extends C4373p {
    }

    static {
        C4373p.f10412a = new C4398a();
    }

    public C4397a(Reader reader) {
        int[] iArr = new int[32];
        this.f10471p = iArr;
        this.f10472q = 0;
        this.f10472q = 0 + 1;
        iArr[0] = 6;
        this.f10473r = new String[32];
        this.f10474s = new int[32];
        if (reader != null) {
            this.f10460e = reader;
            return;
        }
        throw new NullPointerException("in == null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004a, code lost:
        mo10684g();
     */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo10674A() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            r2 = r0
        L_0x0003:
            int r3 = r6.f10463h
            int r4 = r3 + r2
            int r5 = r6.f10464i
            if (r4 >= r5) goto L_0x004e
            char[] r4 = r6.f10462g
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L_0x005c
            r4 = 10
            if (r3 == r4) goto L_0x005c
            r4 = 12
            if (r3 == r4) goto L_0x005c
            r4 = 13
            if (r3 == r4) goto L_0x005c
            r4 = 32
            if (r3 == r4) goto L_0x005c
            r4 = 35
            if (r3 == r4) goto L_0x004a
            r4 = 44
            if (r3 == r4) goto L_0x005c
            r4 = 47
            if (r3 == r4) goto L_0x004a
            r4 = 61
            if (r3 == r4) goto L_0x004a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L_0x005c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L_0x005c
            r4 = 58
            if (r3 == r4) goto L_0x005c
            r4 = 59
            if (r3 == r4) goto L_0x004a
            switch(r3) {
                case 91: goto L_0x005c;
                case 92: goto L_0x004a;
                case 93: goto L_0x005c;
                default: goto L_0x0047;
            }
        L_0x0047:
            int r2 = r2 + 1
            goto L_0x0003
        L_0x004a:
            r6.mo10684g()
            goto L_0x005c
        L_0x004e:
            char[] r3 = r6.f10462g
            int r3 = r3.length
            if (r2 >= r3) goto L_0x005e
            int r3 = r2 + 1
            boolean r3 = r6.mo10679a(r3)
            if (r3 == 0) goto L_0x005c
            goto L_0x0003
        L_0x005c:
            r0 = r2
            goto L_0x007e
        L_0x005e:
            if (r1 != 0) goto L_0x006b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L_0x006b:
            char[] r3 = r6.f10462g
            int r4 = r6.f10463h
            r1.append(r3, r4, r2)
            int r3 = r6.f10463h
            int r3 = r3 + r2
            r6.f10463h = r3
            r2 = 1
            boolean r2 = r6.mo10679a(r2)
            if (r2 != 0) goto L_0x0002
        L_0x007e:
            if (r1 != 0) goto L_0x008a
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f10462g
            int r3 = r6.f10463h
            r1.<init>(r2, r3, r0)
            goto L_0x0095
        L_0x008a:
            char[] r2 = r6.f10462g
            int r3 = r6.f10463h
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L_0x0095:
            int r2 = r6.f10463h
            int r2 = r2 + r0
            r6.f10463h = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p355e.p362x.C4397a.mo10674A():java.lang.String");
    }

    /* renamed from: B */
    public final char mo10675B() {
        int i;
        int i2;
        String str = "Unterminated escape sequence";
        if (this.f10463h != this.f10464i || mo10679a(1)) {
            char[] cArr = this.f10462g;
            int i3 = this.f10463h;
            int i4 = i3 + 1;
            this.f10463h = i4;
            char c = cArr[i3];
            if (c == 10) {
                this.f10465j++;
                this.f10466k = i4;
            } else if (!(c == '\"' || c == '\'' || c == '/' || c == '\\')) {
                if (c == 'b') {
                    return 8;
                }
                if (c == 'f') {
                    return 12;
                }
                if (c == 'n') {
                    return 10;
                }
                if (c == 'r') {
                    return 13;
                }
                if (c == 't') {
                    return 9;
                }
                if (c != 'u') {
                    mo10680b("Invalid escape sequence");
                    throw null;
                } else if (i4 + 4 <= this.f10464i || mo10679a(4)) {
                    char c2 = 0;
                    int i5 = this.f10463h;
                    int i6 = i5 + 4;
                    while (i5 < i6) {
                        char c3 = this.f10462g[i5];
                        char c4 = (char) (c2 << 4);
                        if (c3 < '0' || c3 > '9') {
                            if (c3 >= 'a' && c3 <= 'f') {
                                i2 = c3 - 'a';
                            } else if (c3 < 'A' || c3 > 'F') {
                                StringBuilder a = C1965a.m4756a("\\u");
                                a.append(new String(this.f10462g, this.f10463h, 4));
                                throw new NumberFormatException(a.toString());
                            } else {
                                i2 = c3 - 'A';
                            }
                            i = i2 + 10;
                        } else {
                            i = c3 - '0';
                        }
                        c2 = (char) (i + c4);
                        i5++;
                    }
                    this.f10463h += 4;
                    return c2;
                } else {
                    mo10680b(str);
                    throw null;
                }
            }
            return c;
        }
        mo10680b(str);
        throw null;
    }

    /* renamed from: C */
    public final void mo10676C() {
        char c;
        do {
            if (this.f10463h < this.f10464i || mo10679a(1)) {
                char[] cArr = this.f10462g;
                int i = this.f10463h;
                int i2 = i + 1;
                this.f10463h = i2;
                c = cArr[i];
                if (c == 10) {
                    this.f10465j++;
                    this.f10466k = i2;
                    return;
                }
            } else {
                return;
            }
        } while (c != 13);
    }

    /* renamed from: D */
    public void mo10625D() {
        int i;
        char c;
        int i2 = 0;
        do {
            int i3 = this.f10467l;
            if (i3 == 0) {
                i3 = mo10685h();
            }
            if (i3 == 3) {
                mo10682b(1);
            } else if (i3 == 1) {
                mo10682b(3);
            } else if (i3 == 4 || i3 == 2) {
                this.f10472q--;
                i2--;
                this.f10467l = 0;
            } else if (i3 == 14 || i3 == 10) {
                while (true) {
                    i = 0;
                    while (true) {
                        int i4 = this.f10463h + i;
                        if (i4 < this.f10464i) {
                            char c2 = this.f10462g[i4];
                            if (!(c2 == 9 || c2 == 10 || c2 == 12 || c2 == 13 || c2 == ' ')) {
                                if (c2 != '#') {
                                    if (c2 != ',') {
                                        if (!(c2 == '/' || c2 == '=')) {
                                            if (!(c2 == '{' || c2 == '}' || c2 == ':')) {
                                                if (c2 != ';') {
                                                    switch (c2) {
                                                        case '[':
                                                        case ']':
                                                            break;
                                                        case '\\':
                                                            break;
                                                        default:
                                                            i++;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            this.f10463h = i4;
                            if (!mo10679a(1)) {
                            }
                        }
                    }
                }
                mo10684g();
                this.f10463h += i;
                this.f10467l = 0;
            } else {
                if (i3 == 8 || i3 == 12) {
                    c = '\'';
                } else if (i3 == 9 || i3 == 13) {
                    c = '\"';
                } else {
                    if (i3 == 16) {
                        this.f10463h += this.f10469n;
                    }
                    this.f10467l = 0;
                }
                mo10683c(c);
                this.f10467l = 0;
            }
            i2++;
            this.f10467l = 0;
        } while (i2 != 0);
        int[] iArr = this.f10474s;
        int i5 = this.f10472q;
        int i6 = i5 - 1;
        iArr[i6] = iArr[i6] + 1;
        this.f10473r[i5 - 1] = Objects.NULL_STRING;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0051, code lost:
        if (r1 != '/') goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0053, code lost:
        r9.f10463h = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0056, code lost:
        if (r4 != r2) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0058, code lost:
        r9.f10463h = r4 - 1;
        r2 = mo10679a(2);
        r9.f10463h++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0065, code lost:
        if (r2 != false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0067, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
        mo10684g();
        r2 = r9.f10463h;
        r4 = r0[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0071, code lost:
        if (r4 == '*') goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0073, code lost:
        if (r4 == '/') goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0075, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0076, code lost:
        r9.f10463h = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007b, code lost:
        r9.f10463h = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007f, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0085, code lost:
        if ((r9.f10463h + 2) <= r9.f10464i) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008b, code lost:
        if (mo10679a(2) == false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008e, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0090, code lost:
        r1 = r9.f10462g;
        r2 = r9.f10463h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0096, code lost:
        if (r1[r2] != 10) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0098, code lost:
        r9.f10465j++;
        r9.f10466k = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a2, code lost:
        if (r4 >= 2) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b1, code lost:
        if (r9.f10462g[r9.f10463h + r4] == "*/".charAt(r4)) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b3, code lost:
        r9.f10463h++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b9, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00bc, code lost:
        if (r3 == false) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c3, code lost:
        mo10680b("Unterminated comment");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c9, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ca, code lost:
        r9.f10463h = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ce, code lost:
        if (r1 != '#') goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d0, code lost:
        mo10684g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00d8, code lost:
        return r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo10677a(boolean r10) {
        /*
            r9 = this;
            char[] r0 = r9.f10462g
        L_0x0002:
            int r1 = r9.f10463h
        L_0x0004:
            int r2 = r9.f10464i
        L_0x0006:
            r3 = 1
            if (r1 != r2) goto L_0x0030
            r9.f10463h = r1
            boolean r1 = r9.mo10679a(r3)
            if (r1 != 0) goto L_0x002c
            if (r10 != 0) goto L_0x0015
            r10 = -1
            return r10
        L_0x0015:
            java.io.EOFException r10 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            java.lang.StringBuilder r0 = p213q.p214a.p215a.p216a.C1965a.m4756a(r0)
            java.lang.String r1 = r9.mo10686s()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L_0x002c:
            int r1 = r9.f10463h
            int r2 = r9.f10464i
        L_0x0030:
            int r4 = r1 + 1
            char r1 = r0[r1]
            r5 = 10
            if (r1 != r5) goto L_0x0041
            int r1 = r9.f10465j
            int r1 = r1 + r3
            r9.f10465j = r1
            r9.f10466k = r4
            goto L_0x00d9
        L_0x0041:
            r6 = 32
            if (r1 == r6) goto L_0x00d9
            r6 = 13
            if (r1 == r6) goto L_0x00d9
            r6 = 9
            if (r1 != r6) goto L_0x004f
            goto L_0x00d9
        L_0x004f:
            r6 = 47
            if (r1 != r6) goto L_0x00ca
            r9.f10463h = r4
            r7 = 2
            if (r4 != r2) goto L_0x0068
            int r4 = r4 + -1
            r9.f10463h = r4
            boolean r2 = r9.mo10679a(r7)
            int r4 = r9.f10463h
            int r4 = r4 + r3
            r9.f10463h = r4
            if (r2 != 0) goto L_0x0068
            return r1
        L_0x0068:
            r9.mo10684g()
            int r2 = r9.f10463h
            char r4 = r0[r2]
            r8 = 42
            if (r4 == r8) goto L_0x007b
            if (r4 == r6) goto L_0x0076
            return r1
        L_0x0076:
            int r2 = r2 + 1
            r9.f10463h = r2
            goto L_0x00d3
        L_0x007b:
            int r2 = r2 + 1
            r9.f10463h = r2
        L_0x007f:
            int r1 = r9.f10463h
            int r1 = r1 + r7
            int r2 = r9.f10464i
            r4 = 0
            if (r1 <= r2) goto L_0x0090
            boolean r1 = r9.mo10679a(r7)
            if (r1 == 0) goto L_0x008e
            goto L_0x0090
        L_0x008e:
            r3 = r4
            goto L_0x00bc
        L_0x0090:
            char[] r1 = r9.f10462g
            int r2 = r9.f10463h
            char r1 = r1[r2]
            if (r1 != r5) goto L_0x00a2
            int r1 = r9.f10465j
            int r1 = r1 + r3
            r9.f10465j = r1
            int r2 = r2 + 1
            r9.f10466k = r2
            goto L_0x00b3
        L_0x00a2:
            if (r4 >= r7) goto L_0x00bc
            char[] r1 = r9.f10462g
            int r2 = r9.f10463h
            int r2 = r2 + r4
            char r1 = r1[r2]
            java.lang.String r2 = "*/"
            char r2 = r2.charAt(r4)
            if (r1 == r2) goto L_0x00b9
        L_0x00b3:
            int r1 = r9.f10463h
            int r1 = r1 + r3
            r9.f10463h = r1
            goto L_0x007f
        L_0x00b9:
            int r4 = r4 + 1
            goto L_0x00a2
        L_0x00bc:
            if (r3 == 0) goto L_0x00c3
            int r1 = r9.f10463h
            int r1 = r1 + r7
            goto L_0x0004
        L_0x00c3:
            java.lang.String r10 = "Unterminated comment"
            r9.mo10680b(r10)
            r10 = 0
            throw r10
        L_0x00ca:
            r2 = 35
            r9.f10463h = r4
            if (r1 != r2) goto L_0x00d8
            r9.mo10684g()
        L_0x00d3:
            r9.mo10676C()
            goto L_0x0002
        L_0x00d8:
            return r1
        L_0x00d9:
            r1 = r4
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p355e.p362x.C4397a.mo10677a(boolean):int");
    }

    /* renamed from: a */
    public void mo10628a() {
        int i = this.f10467l;
        if (i == 0) {
            i = mo10685h();
        }
        if (i == 3) {
            mo10682b(1);
            this.f10474s[this.f10472q - 1] = 0;
            this.f10467l = 0;
            return;
        }
        StringBuilder a = C1965a.m4756a("Expected BEGIN_ARRAY but was ");
        a.append(peek());
        a.append(mo10686s());
        throw new IllegalStateException(a.toString());
    }

    /* renamed from: a */
    public final boolean mo10678a(char c) {
        if (!(c == 9 || c == 10 || c == 12 || c == 13 || c == ' ')) {
            if (c != '#') {
                if (c != ',') {
                    if (!(c == '/' || c == '=')) {
                        if (!(c == '{' || c == '}' || c == ':')) {
                            if (c != ';') {
                                switch (c) {
                                    case '[':
                                    case ']':
                                        break;
                                    case '\\':
                                        break;
                                    default:
                                        return true;
                                }
                            }
                        }
                    }
                }
            }
            mo10684g();
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo10679a(int i) {
        char[] cArr = this.f10462g;
        int i2 = this.f10466k;
        int i3 = this.f10463h;
        this.f10466k = i2 - i3;
        int i4 = this.f10464i;
        if (i4 != i3) {
            int i5 = i4 - i3;
            this.f10464i = i5;
            System.arraycopy(cArr, i3, cArr, 0, i5);
        } else {
            this.f10464i = 0;
        }
        this.f10463h = 0;
        do {
            Reader reader = this.f10460e;
            int i6 = this.f10464i;
            int read = reader.read(cArr, i6, cArr.length - i6);
            if (read == -1) {
                return false;
            }
            int i7 = this.f10464i + read;
            this.f10464i = i7;
            if (this.f10465j == 0) {
                int i8 = this.f10466k;
                if (i8 == 0 && i7 > 0 && cArr[0] == 65279) {
                    this.f10463h++;
                    this.f10466k = i8 + 1;
                    i++;
                }
            }
        } while (this.f10464i < i);
        return true;
    }

    /* renamed from: b */
    public final IOException mo10680b(String str) {
        StringBuilder a = C1965a.m4756a(str);
        a.append(mo10686s());
        throw new C4401d(a.toString());
    }

    /* renamed from: b */
    public final String mo10681b(char c) {
        char[] cArr = this.f10462g;
        StringBuilder sb = null;
        while (true) {
            int i = this.f10463h;
            int i2 = this.f10464i;
            int i3 = i;
            while (true) {
                if (i < i2) {
                    int i4 = i + 1;
                    char c2 = cArr[i];
                    if (c2 == c) {
                        this.f10463h = i4;
                        int i5 = (i4 - i3) - 1;
                        if (sb == null) {
                            return new String(cArr, i3, i5);
                        }
                        sb.append(cArr, i3, i5);
                        return sb.toString();
                    } else if (c2 == '\\') {
                        this.f10463h = i4;
                        int i6 = (i4 - i3) - 1;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max((i6 + 1) * 2, 16));
                        }
                        sb.append(cArr, i3, i6);
                        sb.append(mo10675B());
                    } else {
                        if (c2 == 10) {
                            this.f10465j++;
                            this.f10466k = i4;
                        }
                        i = i4;
                    }
                } else {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max((i - i3) * 2, 16));
                    }
                    sb.append(cArr, i3, i - i3);
                    this.f10463h = i;
                    if (!mo10679a(1)) {
                        mo10680b("Unterminated string");
                        throw null;
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo10682b(int i) {
        int i2 = this.f10472q;
        int[] iArr = this.f10471p;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(i2 * 2)];
            int[] iArr3 = new int[(i2 * 2)];
            String[] strArr = new String[(i2 * 2)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            System.arraycopy(this.f10474s, 0, iArr3, 0, this.f10472q);
            System.arraycopy(this.f10473r, 0, strArr, 0, this.f10472q);
            this.f10471p = iArr2;
            this.f10474s = iArr3;
            this.f10473r = strArr;
        }
        int[] iArr4 = this.f10471p;
        int i3 = this.f10472q;
        this.f10472q = i3 + 1;
        iArr4[i3] = i;
    }

    /* renamed from: c */
    public final void mo10683c(char c) {
        char[] cArr = this.f10462g;
        while (true) {
            int i = this.f10463h;
            int i2 = this.f10464i;
            while (true) {
                if (i < i2) {
                    int i3 = i + 1;
                    char c2 = cArr[i];
                    if (c2 == c) {
                        this.f10463h = i3;
                        return;
                    } else if (c2 == '\\') {
                        this.f10463h = i3;
                        mo10675B();
                        break;
                    } else {
                        if (c2 == 10) {
                            this.f10465j++;
                            this.f10466k = i3;
                        }
                        i = i3;
                    }
                } else {
                    this.f10463h = i;
                    if (!mo10679a(1)) {
                        mo10680b("Unterminated string");
                        throw null;
                    }
                }
            }
        }
    }

    public void close() {
        this.f10467l = 0;
        this.f10471p[0] = 8;
        this.f10472q = 1;
        this.f10460e.close();
    }

    /* renamed from: f */
    public void mo10632f() {
        int i = this.f10467l;
        if (i == 0) {
            i = mo10685h();
        }
        if (i == 1) {
            mo10682b(3);
            this.f10467l = 0;
            return;
        }
        StringBuilder a = C1965a.m4756a("Expected BEGIN_OBJECT but was ");
        a.append(peek());
        a.append(mo10686s());
        throw new IllegalStateException(a.toString());
    }

    /* renamed from: g */
    public final void mo10684g() {
        if (!this.f10461f) {
            mo10680b("Use JsonReader.setLenient(true) to accept malformed JSON");
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:143:0x01f8, code lost:
        if (r9 == 6) goto L_0x01fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0210, code lost:
        if (mo10678a(r6) != false) goto L_0x018a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0212, code lost:
        if (r9 != 2) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0214, code lost:
        if (r15 == false) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x021a, code lost:
        if (r11 != Long.MIN_VALUE) goto L_0x021e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x021c, code lost:
        if (r16 == false) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0220, code lost:
        if (r11 != 0) goto L_0x0224;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0222, code lost:
        if (r16 != false) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0224, code lost:
        if (r16 == false) goto L_0x0227;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0227, code lost:
        r11 = -r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0228, code lost:
        r0.f10468m = r11;
        r0.f10463h += r19;
        r1 = 15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0233, code lost:
        if (r9 == 2) goto L_0x023b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0236, code lost:
        if (r9 == 4) goto L_0x023b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0239, code lost:
        if (r9 != 7) goto L_0x018a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x023b, code lost:
        r0.f10469n = r19;
        r1 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0241, code lost:
        r6 = r1;
        r0.f10467l = r6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0174 A[RETURN] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo10685h() {
        /*
            r20 = this;
            r0 = r20
            int[] r1 = r0.f10471p
            int r2 = r0.f10472q
            int r3 = r2 + -1
            r3 = r1[r3]
            r7 = 93
            r8 = 59
            r9 = 44
            r10 = 3
            r11 = 6
            r12 = 7
            r13 = 5
            r14 = 2
            r15 = 0
            r5 = 4
            r6 = 0
            r4 = 1
            if (r3 != r4) goto L_0x0020
            int r2 = r2 - r4
            r1[r2] = r14
            goto L_0x00d1
        L_0x0020:
            if (r3 != r14) goto L_0x003a
            int r1 = r0.mo10677a(r4)
            if (r1 == r9) goto L_0x00d1
            if (r1 == r8) goto L_0x0035
            if (r1 != r7) goto L_0x002f
            r0.f10467l = r5
            return r5
        L_0x002f:
            java.lang.String r1 = "Unterminated array"
            r0.mo10680b(r1)
            throw r15
        L_0x0035:
            r20.mo10684g()
            goto L_0x00d1
        L_0x003a:
            if (r3 == r10) goto L_0x02c2
            if (r3 != r13) goto L_0x0040
            goto L_0x02c2
        L_0x0040:
            if (r3 != r5) goto L_0x0074
            int r2 = r2 - r4
            r1[r2] = r13
            int r1 = r0.mo10677a(r4)
            r2 = 58
            if (r1 == r2) goto L_0x00d1
            r2 = 61
            if (r1 != r2) goto L_0x006e
            r20.mo10684g()
            int r1 = r0.f10463h
            int r2 = r0.f10464i
            if (r1 < r2) goto L_0x0060
            boolean r1 = r0.mo10679a(r4)
            if (r1 == 0) goto L_0x00d1
        L_0x0060:
            char[] r1 = r0.f10462g
            int r2 = r0.f10463h
            char r1 = r1[r2]
            r5 = 62
            if (r1 != r5) goto L_0x00d1
            int r2 = r2 + r4
            r0.f10463h = r2
            goto L_0x00d1
        L_0x006e:
            java.lang.String r1 = "Expected ':'"
            r0.mo10680b(r1)
            throw r15
        L_0x0074:
            if (r3 != r11) goto L_0x00b6
            boolean r1 = r0.f10461f
            if (r1 == 0) goto L_0x00ae
            r0.mo10677a(r4)
            int r1 = r0.f10463h
            int r1 = r1 - r4
            r0.f10463h = r1
            char[] r2 = f10459t
            int r5 = r2.length
            int r1 = r1 + r5
            int r5 = r0.f10464i
            if (r1 <= r5) goto L_0x0092
            int r1 = r2.length
            boolean r1 = r0.mo10679a(r1)
            if (r1 != 0) goto L_0x0092
            goto L_0x00ae
        L_0x0092:
            r1 = r6
        L_0x0093:
            char[] r2 = f10459t
            int r5 = r2.length
            if (r1 >= r5) goto L_0x00a8
            char[] r5 = r0.f10462g
            int r15 = r0.f10463h
            int r15 = r15 + r1
            char r5 = r5[r15]
            char r2 = r2[r1]
            if (r5 == r2) goto L_0x00a4
            goto L_0x00ae
        L_0x00a4:
            int r1 = r1 + 1
            r15 = 0
            goto L_0x0093
        L_0x00a8:
            int r1 = r0.f10463h
            int r2 = r2.length
            int r1 = r1 + r2
            r0.f10463h = r1
        L_0x00ae:
            int[] r1 = r0.f10471p
            int r2 = r0.f10472q
            int r2 = r2 - r4
            r1[r2] = r12
            goto L_0x00d1
        L_0x00b6:
            if (r3 != r12) goto L_0x00cd
            int r1 = r0.mo10677a(r6)
            r2 = -1
            if (r1 != r2) goto L_0x00c4
            r1 = 17
        L_0x00c1:
            r0.f10467l = r1
            return r1
        L_0x00c4:
            r20.mo10684g()
            int r1 = r0.f10463h
            int r1 = r1 - r4
            r0.f10463h = r1
            goto L_0x00d1
        L_0x00cd:
            r1 = 8
            if (r3 == r1) goto L_0x02ba
        L_0x00d1:
            int r1 = r0.mo10677a(r4)
            r2 = 34
            if (r1 == r2) goto L_0x02b6
            r2 = 39
            if (r1 == r2) goto L_0x02af
            if (r1 == r9) goto L_0x0297
            if (r1 == r8) goto L_0x0297
            r2 = 91
            if (r1 == r2) goto L_0x0294
            if (r1 == r7) goto L_0x028d
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L_0x028a
            int r1 = r0.f10463h
            int r1 = r1 - r4
            r0.f10463h = r1
            char[] r2 = r0.f10462g
            char r1 = r2[r1]
            r2 = 116(0x74, float:1.63E-43)
            if (r1 == r2) goto L_0x011a
            r2 = 84
            if (r1 != r2) goto L_0x00fd
            goto L_0x011a
        L_0x00fd:
            r2 = 102(0x66, float:1.43E-43)
            if (r1 == r2) goto L_0x0114
            r2 = 70
            if (r1 != r2) goto L_0x0106
            goto L_0x0114
        L_0x0106:
            r2 = 110(0x6e, float:1.54E-43)
            if (r1 == r2) goto L_0x010e
            r2 = 78
            if (r1 != r2) goto L_0x0169
        L_0x010e:
            java.lang.String r1 = "null"
            java.lang.String r2 = "NULL"
            r3 = r12
            goto L_0x011f
        L_0x0114:
            java.lang.String r1 = "false"
            java.lang.String r2 = "FALSE"
            r3 = r11
            goto L_0x011f
        L_0x011a:
            java.lang.String r1 = "true"
            java.lang.String r2 = "TRUE"
            r3 = r13
        L_0x011f:
            int r5 = r1.length()
            r7 = r4
        L_0x0124:
            if (r7 >= r5) goto L_0x014d
            int r8 = r0.f10463h
            int r8 = r8 + r7
            int r9 = r0.f10464i
            if (r8 < r9) goto L_0x0136
            int r8 = r7 + 1
            boolean r8 = r0.mo10679a(r8)
            if (r8 != 0) goto L_0x0136
            goto L_0x0169
        L_0x0136:
            char[] r8 = r0.f10462g
            int r9 = r0.f10463h
            int r9 = r9 + r7
            char r8 = r8[r9]
            char r9 = r1.charAt(r7)
            if (r8 == r9) goto L_0x014a
            char r9 = r2.charAt(r7)
            if (r8 == r9) goto L_0x014a
            goto L_0x0169
        L_0x014a:
            int r7 = r7 + 1
            goto L_0x0124
        L_0x014d:
            int r1 = r0.f10463h
            int r1 = r1 + r5
            int r2 = r0.f10464i
            if (r1 < r2) goto L_0x015c
            int r1 = r5 + 1
            boolean r1 = r0.mo10679a(r1)
            if (r1 == 0) goto L_0x016b
        L_0x015c:
            char[] r1 = r0.f10462g
            int r2 = r0.f10463h
            int r2 = r2 + r5
            char r1 = r1[r2]
            boolean r1 = r0.mo10678a(r1)
            if (r1 == 0) goto L_0x016b
        L_0x0169:
            r3 = r6
            goto L_0x0172
        L_0x016b:
            int r1 = r0.f10463h
            int r1 = r1 + r5
            r0.f10463h = r1
            r0.f10467l = r3
        L_0x0172:
            if (r3 == 0) goto L_0x0175
            return r3
        L_0x0175:
            char[] r1 = r0.f10462g
            int r2 = r0.f10463h
            int r3 = r0.f10464i
            r7 = 0
            r15 = r4
            r5 = r6
            r9 = r5
            r16 = r9
            r11 = r7
        L_0x0183:
            int r6 = r2 + r5
            if (r6 != r3) goto L_0x019d
            int r2 = r1.length
            if (r5 != r2) goto L_0x018d
        L_0x018a:
            r6 = 0
            goto L_0x026d
        L_0x018d:
            int r2 = r5 + 1
            boolean r2 = r0.mo10679a(r2)
            if (r2 != 0) goto L_0x0199
            r19 = r5
            goto L_0x0212
        L_0x0199:
            int r2 = r0.f10463h
            int r3 = r0.f10464i
        L_0x019d:
            int r6 = r2 + r5
            char r6 = r1[r6]
            r13 = 43
            if (r6 == r13) goto L_0x0261
            r13 = 69
            if (r6 == r13) goto L_0x0257
            r13 = 101(0x65, float:1.42E-43)
            if (r6 == r13) goto L_0x0257
            r13 = 45
            if (r6 == r13) goto L_0x024b
            r13 = 46
            if (r6 == r13) goto L_0x0245
            r13 = 48
            if (r6 < r13) goto L_0x020a
            r13 = 57
            if (r6 <= r13) goto L_0x01be
            goto L_0x020a
        L_0x01be:
            if (r9 == r4) goto L_0x01fe
            if (r9 != 0) goto L_0x01c3
            goto L_0x01fe
        L_0x01c3:
            if (r9 != r14) goto L_0x01ed
            int r13 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r13 != 0) goto L_0x01ca
            goto L_0x018a
        L_0x01ca:
            r17 = 10
            long r17 = r17 * r11
            int r6 = r6 + -48
            r19 = r5
            long r4 = (long) r6
            long r17 = r17 - r4
            r4 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r4 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x01e7
            if (r4 != 0) goto L_0x01e5
            int r4 = (r17 > r11 ? 1 : (r17 == r11 ? 0 : -1))
            if (r4 >= 0) goto L_0x01e5
            goto L_0x01e7
        L_0x01e5:
            r4 = 0
            goto L_0x01e8
        L_0x01e7:
            r4 = 1
        L_0x01e8:
            r15 = r15 & r4
            r11 = r17
            r4 = 6
            goto L_0x0206
        L_0x01ed:
            r19 = r5
            if (r9 != r10) goto L_0x01f4
            r4 = 6
            r9 = 4
            goto L_0x0206
        L_0x01f4:
            r4 = 5
            if (r9 == r4) goto L_0x01fb
            r4 = 6
            if (r9 != r4) goto L_0x0206
            goto L_0x01fc
        L_0x01fb:
            r4 = 6
        L_0x01fc:
            r9 = 7
            goto L_0x0206
        L_0x01fe:
            r19 = r5
            r4 = 6
            int r6 = r6 + -48
            int r5 = -r6
            long r11 = (long) r5
            r9 = r14
        L_0x0206:
            r6 = r19
            goto L_0x0267
        L_0x020a:
            r19 = r5
            boolean r1 = r0.mo10678a(r6)
            if (r1 != 0) goto L_0x018a
        L_0x0212:
            if (r9 != r14) goto L_0x0233
            if (r15 == 0) goto L_0x0233
            r1 = -9223372036854775808
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x021e
            if (r16 == 0) goto L_0x0233
        L_0x021e:
            int r1 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x0224
            if (r16 != 0) goto L_0x0233
        L_0x0224:
            if (r16 == 0) goto L_0x0227
            goto L_0x0228
        L_0x0227:
            long r11 = -r11
        L_0x0228:
            r0.f10468m = r11
            int r1 = r0.f10463h
            int r1 = r1 + r19
            r0.f10463h = r1
            r1 = 15
            goto L_0x0241
        L_0x0233:
            if (r9 == r14) goto L_0x023b
            r1 = 4
            if (r9 == r1) goto L_0x023b
            r1 = 7
            if (r9 != r1) goto L_0x018a
        L_0x023b:
            r6 = r19
            r0.f10469n = r6
            r1 = 16
        L_0x0241:
            r6 = r1
            r0.f10467l = r6
            goto L_0x026d
        L_0x0245:
            r6 = r5
            r4 = 6
            if (r9 != r14) goto L_0x018a
            r4 = r10
            goto L_0x0266
        L_0x024b:
            r6 = r5
            r4 = 6
            if (r9 != 0) goto L_0x0253
            r9 = 1
            r16 = 1
            goto L_0x0267
        L_0x0253:
            r5 = 5
            if (r9 != r5) goto L_0x018a
            goto L_0x0266
        L_0x0257:
            r6 = r5
            r4 = 6
            r5 = 5
            if (r9 == r14) goto L_0x025f
            r4 = 4
            if (r9 != r4) goto L_0x018a
        L_0x025f:
            r9 = r5
            goto L_0x0267
        L_0x0261:
            r6 = r5
            r5 = 5
            if (r9 != r5) goto L_0x018a
            r4 = 6
        L_0x0266:
            r9 = r4
        L_0x0267:
            int r5 = r6 + 1
            r4 = 1
            r13 = 5
            goto L_0x0183
        L_0x026d:
            if (r6 == 0) goto L_0x0270
            return r6
        L_0x0270:
            char[] r1 = r0.f10462g
            int r2 = r0.f10463h
            char r1 = r1[r2]
            boolean r1 = r0.mo10678a(r1)
            if (r1 == 0) goto L_0x0283
            r20.mo10684g()
            r1 = 10
            goto L_0x00c1
        L_0x0283:
            java.lang.String r1 = "Expected value"
            r0.mo10680b(r1)
            r1 = 0
            throw r1
        L_0x028a:
            r1 = r4
            goto L_0x00c1
        L_0x028d:
            r1 = r4
            if (r3 != r1) goto L_0x0298
            r2 = 4
            r0.f10467l = r2
            return r2
        L_0x0294:
            r0.f10467l = r10
            return r10
        L_0x0297:
            r1 = r4
        L_0x0298:
            if (r3 == r1) goto L_0x02a4
            if (r3 != r14) goto L_0x029d
            goto L_0x02a4
        L_0x029d:
            java.lang.String r1 = "Unexpected value"
            r0.mo10680b(r1)
            r1 = 0
            throw r1
        L_0x02a4:
            r20.mo10684g()
            int r2 = r0.f10463h
            int r2 = r2 - r1
            r0.f10463h = r2
            r1 = 7
            goto L_0x00c1
        L_0x02af:
            r20.mo10684g()
            r1 = 8
            goto L_0x00c1
        L_0x02b6:
            r1 = 9
            goto L_0x00c1
        L_0x02ba:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "JsonReader is closed"
            r1.<init>(r2)
            throw r1
        L_0x02c2:
            int[] r1 = r0.f10471p
            int r2 = r0.f10472q
            r4 = 1
            int r2 = r2 - r4
            r5 = 4
            r1[r2] = r5
            r1 = 125(0x7d, float:1.75E-43)
            r2 = 5
            if (r3 != r2) goto L_0x02e9
            int r2 = r0.mo10677a(r4)
            if (r2 == r9) goto L_0x02e7
            if (r2 == r8) goto L_0x02e4
            if (r2 != r1) goto L_0x02dd
            r0.f10467l = r14
            return r14
        L_0x02dd:
            java.lang.String r1 = "Unterminated object"
            r0.mo10680b(r1)
            r1 = 0
            throw r1
        L_0x02e4:
            r20.mo10684g()
        L_0x02e7:
            r2 = 1
            goto L_0x02ea
        L_0x02e9:
            r2 = r4
        L_0x02ea:
            int r4 = r0.mo10677a(r2)
            r5 = 34
            if (r4 == r5) goto L_0x0324
            r5 = 39
            if (r4 == r5) goto L_0x031d
            java.lang.String r5 = "Expected name"
            if (r4 == r1) goto L_0x0312
            r20.mo10684g()
            int r1 = r0.f10463h
            int r1 = r1 - r2
            r0.f10463h = r1
            char r1 = (char) r4
            boolean r1 = r0.mo10678a(r1)
            if (r1 == 0) goto L_0x030d
            r1 = 14
            goto L_0x00c1
        L_0x030d:
            r0.mo10680b(r5)
            r1 = 0
            throw r1
        L_0x0312:
            r1 = 0
            r2 = 5
            if (r3 == r2) goto L_0x0319
            r0.f10467l = r14
            return r14
        L_0x0319:
            r0.mo10680b(r5)
            throw r1
        L_0x031d:
            r20.mo10684g()
            r1 = 12
            goto L_0x00c1
        L_0x0324:
            r1 = 13
            goto L_0x00c1
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p355e.p362x.C4397a.mo10685h():int");
    }

    /* renamed from: k */
    public void mo10633k() {
        int i = this.f10467l;
        if (i == 0) {
            i = mo10685h();
        }
        if (i == 4) {
            int i2 = this.f10472q - 1;
            this.f10472q = i2;
            int[] iArr = this.f10474s;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f10467l = 0;
            return;
        }
        StringBuilder a = C1965a.m4756a("Expected END_ARRAY but was ");
        a.append(peek());
        a.append(mo10686s());
        throw new IllegalStateException(a.toString());
    }

    /* renamed from: m */
    public void mo10634m() {
        int i = this.f10467l;
        if (i == 0) {
            i = mo10685h();
        }
        if (i == 2) {
            int i2 = this.f10472q - 1;
            this.f10472q = i2;
            this.f10473r[i2] = null;
            int[] iArr = this.f10474s;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f10467l = 0;
            return;
        }
        StringBuilder a = C1965a.m4756a("Expected END_OBJECT but was ");
        a.append(peek());
        a.append(mo10686s());
        throw new IllegalStateException(a.toString());
    }

    /* renamed from: o */
    public String mo10635o() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = this.f10472q;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.f10471p[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(this.f10474s[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String[] strArr = this.f10473r;
                if (strArr[i2] != null) {
                    sb.append(strArr[i2]);
                }
            }
        }
        return sb.toString();
    }

    public C4399b peek() {
        int i = this.f10467l;
        if (i == 0) {
            i = mo10685h();
        }
        switch (i) {
            case 1:
                return C4399b.BEGIN_OBJECT;
            case 2:
                return C4399b.END_OBJECT;
            case 3:
                return C4399b.BEGIN_ARRAY;
            case 4:
                return C4399b.END_ARRAY;
            case 5:
            case 6:
                return C4399b.BOOLEAN;
            case 7:
                return C4399b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return C4399b.STRING;
            case 12:
            case 13:
            case 14:
                return C4399b.NAME;
            case 15:
            case 16:
                return C4399b.NUMBER;
            case 17:
                return C4399b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: r */
    public boolean mo10637r() {
        int i = this.f10467l;
        if (i == 0) {
            i = mo10685h();
        }
        return (i == 2 || i == 4) ? false : true;
    }

    /* renamed from: s */
    public String mo10686s() {
        int i = this.f10465j + 1;
        int i2 = (this.f10463h - this.f10466k) + 1;
        StringBuilder sb = new StringBuilder();
        sb.append(" at line ");
        sb.append(i);
        sb.append(" column ");
        sb.append(i2);
        sb.append(" path ");
        sb.append(mo10635o());
        return sb.toString();
    }

    /* renamed from: t */
    public boolean mo10638t() {
        int i = this.f10467l;
        if (i == 0) {
            i = mo10685h();
        }
        if (i == 5) {
            this.f10467l = 0;
            int[] iArr = this.f10474s;
            int i2 = this.f10472q - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f10467l = 0;
            int[] iArr2 = this.f10474s;
            int i3 = this.f10472q - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            StringBuilder a = C1965a.m4756a("Expected a boolean but was ");
            a.append(peek());
            a.append(mo10686s());
            throw new IllegalStateException(a.toString());
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(mo10686s());
        return sb.toString();
    }

    /* renamed from: u */
    public double mo10640u() {
        String str;
        int i = this.f10467l;
        if (i == 0) {
            i = mo10685h();
        }
        if (i == 15) {
            this.f10467l = 0;
            int[] iArr = this.f10474s;
            int i2 = this.f10472q - 1;
            iArr[i2] = iArr[i2] + 1;
            return (double) this.f10468m;
        }
        if (i == 16) {
            this.f10470o = new String(this.f10462g, this.f10463h, this.f10469n);
            this.f10463h += this.f10469n;
        } else {
            if (i == 8 || i == 9) {
                str = mo10681b(i == 8 ? '\'' : '\"');
            } else if (i == 10) {
                str = mo10674A();
            } else if (i != 11) {
                StringBuilder a = C1965a.m4756a("Expected a double but was ");
                a.append(peek());
                a.append(mo10686s());
                throw new IllegalStateException(a.toString());
            }
            this.f10470o = str;
        }
        this.f10467l = 11;
        double parseDouble = Double.parseDouble(this.f10470o);
        if (this.f10461f || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
            this.f10470o = null;
            this.f10467l = 0;
            int[] iArr2 = this.f10474s;
            int i3 = this.f10472q - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("JSON forbids NaN and infinities: ");
        sb.append(parseDouble);
        sb.append(mo10686s());
        throw new C4401d(sb.toString());
    }

    /* renamed from: v */
    public int mo10641v() {
        String str;
        int i = this.f10467l;
        if (i == 0) {
            i = mo10685h();
        }
        String str2 = "Expected an int but was ";
        if (i == 15) {
            long j = this.f10468m;
            int i2 = (int) j;
            if (j == ((long) i2)) {
                this.f10467l = 0;
                int[] iArr = this.f10474s;
                int i3 = this.f10472q - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            StringBuilder a = C1965a.m4756a(str2);
            a.append(this.f10468m);
            a.append(mo10686s());
            throw new NumberFormatException(a.toString());
        }
        if (i == 16) {
            this.f10470o = new String(this.f10462g, this.f10463h, this.f10469n);
            this.f10463h += this.f10469n;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                str = mo10674A();
            } else {
                str = mo10681b(i == 8 ? '\'' : '\"');
            }
            this.f10470o = str;
            try {
                int parseInt = Integer.parseInt(this.f10470o);
                this.f10467l = 0;
                int[] iArr2 = this.f10474s;
                int i4 = this.f10472q - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else {
            StringBuilder a2 = C1965a.m4756a(str2);
            a2.append(peek());
            a2.append(mo10686s());
            throw new IllegalStateException(a2.toString());
        }
        this.f10467l = 11;
        double parseDouble = Double.parseDouble(this.f10470o);
        int i5 = (int) parseDouble;
        if (((double) i5) == parseDouble) {
            this.f10470o = null;
            this.f10467l = 0;
            int[] iArr3 = this.f10474s;
            int i6 = this.f10472q - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        }
        StringBuilder a3 = C1965a.m4756a(str2);
        a3.append(this.f10470o);
        a3.append(mo10686s());
        throw new NumberFormatException(a3.toString());
    }

    /* renamed from: w */
    public long mo10642w() {
        String str;
        int i = this.f10467l;
        if (i == 0) {
            i = mo10685h();
        }
        if (i == 15) {
            this.f10467l = 0;
            int[] iArr = this.f10474s;
            int i2 = this.f10472q - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f10468m;
        }
        String str2 = "Expected a long but was ";
        if (i == 16) {
            this.f10470o = new String(this.f10462g, this.f10463h, this.f10469n);
            this.f10463h += this.f10469n;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                str = mo10674A();
            } else {
                str = mo10681b(i == 8 ? '\'' : '\"');
            }
            this.f10470o = str;
            try {
                long parseLong = Long.parseLong(this.f10470o);
                this.f10467l = 0;
                int[] iArr2 = this.f10474s;
                int i3 = this.f10472q - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else {
            StringBuilder a = C1965a.m4756a(str2);
            a.append(peek());
            a.append(mo10686s());
            throw new IllegalStateException(a.toString());
        }
        this.f10467l = 11;
        double parseDouble = Double.parseDouble(this.f10470o);
        long j = (long) parseDouble;
        if (((double) j) == parseDouble) {
            this.f10470o = null;
            this.f10467l = 0;
            int[] iArr3 = this.f10474s;
            int i4 = this.f10472q - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return j;
        }
        StringBuilder a2 = C1965a.m4756a(str2);
        a2.append(this.f10470o);
        a2.append(mo10686s());
        throw new NumberFormatException(a2.toString());
    }

    /* renamed from: x */
    public String mo10643x() {
        String str;
        char c;
        int i = this.f10467l;
        if (i == 0) {
            i = mo10685h();
        }
        if (i == 14) {
            str = mo10674A();
        } else {
            if (i == 12) {
                c = '\'';
            } else if (i == 13) {
                c = '\"';
            } else {
                StringBuilder a = C1965a.m4756a("Expected a name but was ");
                a.append(peek());
                a.append(mo10686s());
                throw new IllegalStateException(a.toString());
            }
            str = mo10681b(c);
        }
        this.f10467l = 0;
        this.f10473r[this.f10472q - 1] = str;
        return str;
    }

    /* renamed from: y */
    public void mo10644y() {
        int i = this.f10467l;
        if (i == 0) {
            i = mo10685h();
        }
        if (i == 7) {
            this.f10467l = 0;
            int[] iArr = this.f10474s;
            int i2 = this.f10472q - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        StringBuilder a = C1965a.m4756a("Expected null but was ");
        a.append(peek());
        a.append(mo10686s());
        throw new IllegalStateException(a.toString());
    }

    /* renamed from: z */
    public String mo10645z() {
        String str;
        char c;
        int i = this.f10467l;
        if (i == 0) {
            i = mo10685h();
        }
        if (i == 10) {
            str = mo10674A();
        } else {
            if (i == 8) {
                c = '\'';
            } else if (i == 9) {
                c = '\"';
            } else if (i == 11) {
                str = this.f10470o;
                this.f10470o = null;
            } else if (i == 15) {
                str = Long.toString(this.f10468m);
            } else if (i == 16) {
                str = new String(this.f10462g, this.f10463h, this.f10469n);
                this.f10463h += this.f10469n;
            } else {
                StringBuilder a = C1965a.m4756a("Expected a string but was ");
                a.append(peek());
                a.append(mo10686s());
                throw new IllegalStateException(a.toString());
            }
            str = mo10681b(c);
        }
        this.f10467l = 0;
        int[] iArr = this.f10474s;
        int i2 = this.f10472q - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }
}
