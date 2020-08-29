package p410v.p411m0;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.C4557i;
import p392u.p393n.C4568g;
import p392u.p393n.C4571j;
import p392u.p401r.p403c.C4638h;
import p392u.p409w.C4674a;
import p392u.p409w.C4677c;
import p392u.p409w.C4681g;
import p410v.C4716h0;
import p410v.C4716h0.C4717a;
import p410v.C4720i0;
import p410v.C4725j0;
import p410v.C4725j0.C4727b;
import p410v.C4870w;
import p410v.C4873x;
import p410v.p411m0.p416g.C4792c;
import p423w.C4882a0;
import p423w.C4892f;
import p423w.C4895h;
import p423w.C4896i;
import p423w.C4897j;
import p423w.C4905q;
import p423w.p424c0.C4889a;

/* renamed from: v.m0.b */
public final class C4737b {

    /* renamed from: a */
    public static final byte[] f11140a = new byte[0];

    /* renamed from: b */
    public static final C4870w f11141b = C4870w.f11611f.mo11383a(new String[0]);

    /* renamed from: c */
    public static final C4725j0 f11142c;

    /* renamed from: d */
    public static final C4905q f11143d = C4905q.f11683g.mo11525a(C4897j.f11665i.mo11510b("efbbbf"), C4897j.f11665i.mo11510b("feff"), C4897j.f11665i.mo11510b("fffe"), C4897j.f11665i.mo11510b("0000ffff"), C4897j.f11665i.mo11510b("ffff0000"));

    /* renamed from: e */
    public static final TimeZone f11144e;

    /* renamed from: f */
    public static final C4677c f11145f = new C4677c("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    /* renamed from: v.m0.b$a */
    public static final class C4738a implements ThreadFactory {

        /* renamed from: e */
        public final /* synthetic */ String f11146e;

        /* renamed from: f */
        public final /* synthetic */ boolean f11147f;

        public C4738a(String str, boolean z) {
            this.f11146e = str;
            this.f11147f = z;
        }

        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f11146e);
            thread.setDaemon(this.f11147f);
            return thread;
        }
    }

    static {
        C4727b bVar = C4725j0.f11106f;
        byte[] bArr = f11140a;
        if (bArr != null) {
            C4892f fVar = new C4892f();
            fVar.write(bArr);
            f11142c = bVar.mo11053a(fVar, null, (long) bArr.length);
            C4717a aVar = C4716h0.f11051a;
            byte[] bArr2 = f11140a;
            aVar.mo11031a(bArr2, null, 0, bArr2.length);
            TimeZone timeZone = TimeZone.getTimeZone("GMT");
            if (timeZone != null) {
                f11144e = timeZone;
                return;
            }
            C4638h.m10269a();
            throw null;
        }
        C4638h.m10271a("$this$toResponseBody");
        throw null;
    }

    /* renamed from: a */
    public static final int m10442a(byte b, int i) {
        return b & i;
    }

    /* renamed from: a */
    public static final int m10443a(char c) {
        if ('0' <= c && '9' >= c) {
            return c - '0';
        }
        char c2 = 'a';
        if ('a' > c || 'f' < c) {
            c2 = 'A';
            if ('A' > c || 'F' < c) {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    /* renamed from: a */
    public static /* synthetic */ int m10445a(String str, char c, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return m10444a(str, c, i, i2);
    }

    /* renamed from: a */
    public static /* synthetic */ int m10448a(String str, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return m10447a(str, i, i2);
    }

    /* renamed from: a */
    public static final void m10462a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: a */
    public static final boolean m10467a(String str) {
        if (str != null) {
            return f11145f.mo10964a(str);
        }
        C4638h.m10271a("$this$canParseAsIpAddress");
        throw null;
    }

    /* renamed from: b */
    public static final int m10471b(String str) {
        if (str != null) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt <= 31 || charAt >= 127) {
                    return i;
                }
            }
            return -1;
        }
        C4638h.m10271a("$this$indexOfControlOrNonAscii");
        throw null;
    }

    /* renamed from: b */
    public static final int m10472b(String str, int i) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                int i2 = Integer.MAX_VALUE;
                if (parseLong <= ((long) Integer.MAX_VALUE)) {
                    i2 = parseLong < 0 ? 0 : (int) parseLong;
                }
                return i2;
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    /* renamed from: c */
    public static final String m10477c(String str, int i, int i2) {
        if (str != null) {
            int a = m10447a(str, i, i2);
            String substring = str.substring(a, m10473b(str, a, i2));
            C4638h.m10270a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        C4638h.m10271a("$this$trimSubstring");
        throw null;
    }

    /* renamed from: a */
    public static final boolean m10468a(C4873x xVar, C4873x xVar2) {
        if (xVar == null) {
            C4638h.m10271a("$this$canReuseConnectionFor");
            throw null;
        } else if (xVar2 != null) {
            return C4638h.m10272a((Object) xVar.f11620e, (Object) xVar2.f11620e) && xVar.f11621f == xVar2.f11621f && C4638h.m10272a((Object) xVar.f11617b, (Object) xVar2.f11617b);
        } else {
            C4638h.m10271a("other");
            throw null;
        }
    }

    /* renamed from: b */
    public static final int m10473b(String str, int i, int i2) {
        if (str != null) {
            int i3 = i2 - 1;
            if (i3 >= i) {
                while (true) {
                    char charAt = str.charAt(i3);
                    if (charAt == 9 || charAt == 10 || charAt == 12 || charAt == 13 || charAt == ' ') {
                        if (i3 == i) {
                            break;
                        }
                        i3--;
                    } else {
                        return i3 + 1;
                    }
                }
            }
            return i;
        }
        C4638h.m10271a("$this$indexOfLastNonAsciiWhitespace");
        throw null;
    }

    /* renamed from: b */
    public static final String[] m10476b(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        if (strArr == null) {
            C4638h.m10271a("$this$intersect");
            throw null;
        } else if (strArr2 == null) {
            C4638h.m10271a("other");
            throw null;
        } else if (comparator != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                int length = strArr2.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (comparator.compare(str, strArr2[i]) == 0) {
                        arrayList.add(str);
                        break;
                    } else {
                        i++;
                    }
                }
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new C4557i("null cannot be cast to non-null type kotlin.Array<T>");
        } else {
            C4638h.m10271a("comparator");
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004e, code lost:
        if (r5 == androidx.recyclerview.widget.RecyclerView.FOREVER_NS) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0050, code lost:
        r11.mo11078b().mo11423a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0058, code lost:
        r11.mo11078b().mo11424a(r0 + r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0076, code lost:
        if (r5 != androidx.recyclerview.widget.RecyclerView.FOREVER_NS) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0079, code lost:
        return r12;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m10475b(p423w.C4882a0 r11, int r12, java.util.concurrent.TimeUnit r13) {
        /*
            r0 = 0
            if (r11 == 0) goto L_0x0080
            if (r13 == 0) goto L_0x007a
            long r0 = java.lang.System.nanoTime()
            w.b0 r2 = r11.mo11078b()
            boolean r2 = r2.mo11428d()
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 == 0) goto L_0x0022
            w.b0 r2 = r11.mo11078b()
            long r5 = r2.mo11427c()
            long r5 = r5 - r0
            goto L_0x0023
        L_0x0022:
            r5 = r3
        L_0x0023:
            w.b0 r2 = r11.mo11078b()
            long r7 = (long) r12
            long r12 = r13.toNanos(r7)
            long r12 = java.lang.Math.min(r5, r12)
            long r12 = r12 + r0
            r2.mo11424a(r12)
            w.f r12 = new w.f     // Catch:{ InterruptedIOException -> 0x0073, all -> 0x0061 }
            r12.<init>()     // Catch:{ InterruptedIOException -> 0x0073, all -> 0x0061 }
        L_0x0039:
            r7 = 8192(0x2000, double:4.0474E-320)
            long r7 = r11.mo11077b(r12, r7)     // Catch:{ InterruptedIOException -> 0x0073, all -> 0x0061 }
            r9 = -1
            int r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r13 == 0) goto L_0x004b
            long r7 = r12.f11661f     // Catch:{ InterruptedIOException -> 0x0073, all -> 0x0061 }
            r12.skip(r7)     // Catch:{ InterruptedIOException -> 0x0073, all -> 0x0061 }
            goto L_0x0039
        L_0x004b:
            r12 = 1
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L_0x0058
        L_0x0050:
            w.b0 r11 = r11.mo11078b()
            r11.mo11423a()
            goto L_0x0079
        L_0x0058:
            w.b0 r11 = r11.mo11078b()
            long r0 = r0 + r5
            r11.mo11424a(r0)
            goto L_0x0079
        L_0x0061:
            r12 = move-exception
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            w.b0 r11 = r11.mo11078b()
            if (r13 != 0) goto L_0x006e
            r11.mo11423a()
            goto L_0x0072
        L_0x006e:
            long r0 = r0 + r5
            r11.mo11424a(r0)
        L_0x0072:
            throw r12
        L_0x0073:
            r12 = 0
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L_0x0058
            goto L_0x0050
        L_0x0079:
            return r12
        L_0x007a:
            java.lang.String r11 = "timeUnit"
            p392u.p401r.p403c.C4638h.m10271a(r11)
            throw r0
        L_0x0080:
            java.lang.String r11 = "$this$skipAll"
            p392u.p401r.p403c.C4638h.m10271a(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p410v.p411m0.C4737b.m10475b(w.a0, int, java.util.concurrent.TimeUnit):boolean");
    }

    /* renamed from: b */
    public static final <T> List<T> m10474b(List<? extends T> list) {
        if (list != null) {
            List<T> unmodifiableList = Collections.unmodifiableList(C4568g.m10217a((Collection<? extends T>) list));
            C4638h.m10270a((Object) unmodifiableList, "Collections.unmodifiableList(toMutableList())");
            return unmodifiableList;
        }
        C4638h.m10271a("$this$toImmutableList");
        throw null;
    }

    /* renamed from: a */
    public static final int m10449a(String str, long j, TimeUnit timeUnit) {
        if (str != null) {
            int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            boolean z = true;
            if (i >= 0) {
                if (timeUnit != null) {
                    long millis = timeUnit.toMillis(j);
                    if (millis <= ((long) Integer.MAX_VALUE)) {
                        if (millis == 0 && i > 0) {
                            z = false;
                        }
                        if (z) {
                            return (int) millis;
                        }
                        throw new IllegalArgumentException(C1965a.m4751a(str, " too small.").toString());
                    }
                    throw new IllegalArgumentException(C1965a.m4751a(str, " too large.").toString());
                }
                throw new IllegalStateException("unit == null".toString());
            }
            throw new IllegalStateException(C1965a.m4751a(str, " < 0").toString());
        }
        C4638h.m10271a("name");
        throw null;
    }

    /* renamed from: a */
    public static final void m10463a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        } else {
            C4638h.m10271a("$this$closeQuietly");
            throw null;
        }
    }

    /* renamed from: a */
    public static final void m10465a(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e) {
                throw e;
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        } else {
            C4638h.m10271a("$this$closeQuietly");
            throw null;
        }
    }

    /* renamed from: a */
    public static final int m10444a(String str, char c, int i, int i2) {
        if (str != null) {
            while (i < i2) {
                if (str.charAt(i) == c) {
                    return i;
                }
                i++;
            }
            return i2;
        }
        C4638h.m10271a("$this$delimiterOffset");
        throw null;
    }

    /* renamed from: a */
    public static final int m10450a(String str, String str2, int i, int i2) {
        if (str == null) {
            C4638h.m10271a("$this$delimiterOffset");
            throw null;
        } else if (str2 != null) {
            while (i < i2) {
                if (C4681g.m10316a((CharSequence) str2, str.charAt(i), false, 2)) {
                    return i;
                }
                i++;
            }
            return i2;
        } else {
            C4638h.m10271a("delimiters");
            throw null;
        }
    }

    /* renamed from: a */
    public static final boolean m10469a(C4882a0 a0Var, int i, TimeUnit timeUnit) {
        if (a0Var == null) {
            C4638h.m10271a("$this$discard");
            throw null;
        } else if (timeUnit != null) {
            try {
                return m10475b(a0Var, i, timeUnit);
            } catch (IOException unused) {
                return false;
            }
        } else {
            C4638h.m10271a("timeUnit");
            throw null;
        }
    }

    /* renamed from: a */
    public static final String m10455a(String str, Object... objArr) {
        if (str == null) {
            C4638h.m10271a("format");
            throw null;
        } else if (objArr != null) {
            Locale locale = Locale.US;
            C4638h.m10270a((Object) locale, "Locale.US");
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
            C4638h.m10270a((Object) format, "java.lang.String.format(locale, format, *args)");
            return format;
        } else {
            C4638h.m10271a("args");
            throw null;
        }
    }

    /* renamed from: a */
    public static final boolean m10470a(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        if (strArr == null) {
            C4638h.m10271a("$this$hasIntersection");
            throw null;
        } else if (comparator != null) {
            if (!(strArr.length == 0) && strArr2 != null) {
                if (!(strArr2.length == 0)) {
                    for (String str : strArr) {
                        for (String compare : strArr2) {
                            if (comparator.compare(str, compare) == 0) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        } else {
            C4638h.m10271a("comparator");
            throw null;
        }
    }

    /* renamed from: a */
    public static final long m10454a(C4720i0 i0Var) {
        if (i0Var != null) {
            String a = i0Var.f11065k.mo11366a("Content-Length");
            if (a == null) {
                return -1;
            }
            try {
                return Long.parseLong(a);
            } catch (NumberFormatException unused) {
                return -1;
            }
        } else {
            C4638h.m10271a("$this$headersContentLength");
            throw null;
        }
    }

    @SafeVarargs
    /* renamed from: a */
    public static final <T> List<T> m10458a(T... tArr) {
        if (tArr != null) {
            Object[] objArr = (Object[]) tArr.clone();
            List<T> unmodifiableList = Collections.unmodifiableList(Arrays.asList(Arrays.copyOf(objArr, objArr.length)));
            C4638h.m10270a((Object) unmodifiableList, "Collections.unmodifiable…sList(*elements.clone()))");
            return unmodifiableList;
        }
        C4638h.m10271a("elements");
        throw null;
    }

    /* renamed from: a */
    public static final int m10452a(String[] strArr, String str, Comparator<String> comparator) {
        if (strArr == null) {
            C4638h.m10271a("$this$indexOf");
            throw null;
        } else if (str == null) {
            C4638h.m10271a("value");
            throw null;
        } else if (comparator != null) {
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                if (comparator.compare(strArr[i], str) == 0) {
                    return i;
                }
            }
            return -1;
        } else {
            C4638h.m10271a("comparator");
            throw null;
        }
    }

    /* renamed from: a */
    public static final int m10447a(String str, int i, int i2) {
        if (str != null) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                    return i;
                }
                i++;
            }
            return i2;
        }
        C4638h.m10271a("$this$indexOfFirstNonAsciiWhitespace");
        throw null;
    }

    /* renamed from: a */
    public static final int m10446a(String str, int i) {
        if (str != null) {
            int length = str.length();
            while (i < length) {
                char charAt = str.charAt(i);
                if (charAt != ' ' && charAt != 9) {
                    return i;
                }
                i++;
            }
            return str.length();
        }
        C4638h.m10271a("$this$indexOfNonWhitespace");
        throw null;
    }

    /* renamed from: a */
    public static final void m10464a(Object obj, long j) {
        if (obj != null) {
            long j2 = j / 1000000;
            long j3 = j - (1000000 * j2);
            synchronized (obj) {
                int i = (int) j3;
                if (j2 > 0 || i > 0) {
                    obj.wait(j2, i);
                }
            }
            return;
        }
        C4638h.m10271a("$this$lockAndWaitNanos");
        throw null;
    }

    /* renamed from: a */
    public static final Charset m10457a(C4896i iVar, Charset charset) {
        String str;
        Charset charset2;
        Charset charset3;
        if (iVar == null) {
            C4638h.m10271a("$this$readBomAsCharset");
            throw null;
        } else if (charset != null) {
            int a = iVar.mo11432a(f11143d);
            if (a == -1) {
                return charset;
            }
            if (a == 0) {
                charset2 = StandardCharsets.UTF_8;
                str = "UTF_8";
            } else if (a == 1) {
                charset2 = StandardCharsets.UTF_16BE;
                str = "UTF_16BE";
            } else if (a != 2) {
                if (a == 3) {
                    C4674a aVar = C4674a.f10862d;
                    charset3 = C4674a.f10861c;
                    if (charset3 == null) {
                        charset3 = Charset.forName("UTF-32BE");
                        C4638h.m10270a((Object) charset3, "Charset.forName(\"UTF-32BE\")");
                        C4674a.f10861c = charset3;
                    }
                } else if (a == 4) {
                    C4674a aVar2 = C4674a.f10862d;
                    charset3 = C4674a.f10860b;
                    if (charset3 == null) {
                        charset3 = Charset.forName("UTF-32LE");
                        C4638h.m10270a((Object) charset3, "Charset.forName(\"UTF-32LE\")");
                        C4674a.f10860b = charset3;
                    }
                } else {
                    throw new AssertionError();
                }
                return charset3;
            } else {
                charset2 = StandardCharsets.UTF_16LE;
                str = "UTF_16LE";
            }
            String str2 = str;
            Charset charset4 = charset2;
            C4638h.m10270a((Object) charset4, str2);
            return charset4;
        } else {
            C4638h.m10271a("default");
            throw null;
        }
    }

    /* renamed from: a */
    public static final int m10451a(C4896i iVar) {
        if (iVar != null) {
            return (iVar.readByte() & 255) | ((iVar.readByte() & 255) << 16) | ((iVar.readByte() & 255) << 8);
        }
        C4638h.m10271a("$this$readMedium");
        throw null;
    }

    /* renamed from: a */
    public static final ThreadFactory m10460a(String str, boolean z) {
        if (str != null) {
            return new C4738a(str, z);
        }
        C4638h.m10271a("name");
        throw null;
    }

    /* renamed from: a */
    public static final C4870w m10461a(List<C4792c> list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList(20);
            for (C4792c cVar : list) {
                C4897j jVar = cVar.f11355b;
                C4897j jVar2 = cVar.f11356c;
                if (jVar != null) {
                    String h = C4889a.m10953h(jVar);
                    if (jVar2 != null) {
                        String h2 = C4889a.m10953h(jVar2);
                        if (h == null) {
                            C4638h.m10271a("name");
                            throw null;
                        } else if (h2 != null) {
                            arrayList.add(h);
                            arrayList.add(C4681g.m10328c(h2).toString());
                        } else {
                            C4638h.m10271a("value");
                            throw null;
                        }
                    } else {
                        throw null;
                    }
                } else {
                    throw null;
                }
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return new C4870w((String[]) array, null);
            }
            throw new C4557i("null cannot be cast to non-null type kotlin.Array<T>");
        }
        C4638h.m10271a("$this$toHeaders");
        throw null;
    }

    /* renamed from: a */
    public static final String m10456a(C4873x xVar, boolean z) {
        String str;
        if (xVar != null) {
            if (C4681g.m10318a((CharSequence) xVar.f11620e, (CharSequence) ":", false, 2)) {
                StringBuilder sb = new StringBuilder();
                sb.append('[');
                sb.append(xVar.f11620e);
                sb.append(']');
                str = sb.toString();
            } else {
                str = xVar.f11620e;
            }
            if (!z && xVar.f11621f == C4873x.f11615l.mo11405a(xVar.f11617b)) {
                return str;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(':');
            sb2.append(xVar.f11621f);
            return sb2.toString();
        }
        C4638h.m10271a("$this$toHostHeader");
        throw null;
    }

    /* renamed from: a */
    public static final <K, V> Map<K, V> m10459a(Map<K, ? extends V> map) {
        if (map == null) {
            C4638h.m10271a("$this$toImmutableMap");
            throw null;
        } else if (map.isEmpty()) {
            return C4571j.f10780e;
        } else {
            Map<K, V> unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
            C4638h.m10270a((Object) unmodifiableMap, "Collections.unmodifiableMap(LinkedHashMap(this))");
            return unmodifiableMap;
        }
    }

    /* renamed from: a */
    public static final long m10453a(String str, long j) {
        if (str != null) {
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException unused) {
                return j;
            }
        } else {
            C4638h.m10271a("$this$toLongOrDefault");
            throw null;
        }
    }

    /* renamed from: a */
    public static final void m10466a(C4895h hVar, int i) {
        if (hVar != null) {
            hVar.writeByte((i >>> 16) & 255);
            hVar.writeByte((i >>> 8) & 255);
            hVar.writeByte(i & 255);
            return;
        }
        C4638h.m10271a("$this$writeMedium");
        throw null;
    }
}
