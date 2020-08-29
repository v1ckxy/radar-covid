package p484y;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import javax.annotation.Nullable;
import p213q.p214a.p215a.p216a.C1965a;
import p410v.C4686a0.C4689c;
import p410v.C4716h0;
import p410v.C4870w;
import p423w.C4892f;

/* renamed from: y.y */
public abstract class C5347y<T> {

    /* renamed from: y.y$a */
    public static final class C5348a<T> extends C5347y<T> {

        /* renamed from: a */
        public final Method f12646a;

        /* renamed from: b */
        public final int f12647b;

        /* renamed from: c */
        public final C5280h<T, C4716h0> f12648c;

        public C5348a(Method method, int i, C5280h<T, C4716h0> hVar) {
            this.f12646a = method;
            this.f12647b = i;
            this.f12648c = hVar;
        }

        /* renamed from: a */
        public void mo12059a(C5251a0 a0Var, @Nullable T t) {
            if (t != null) {
                try {
                    a0Var.f12500k = (C4716h0) this.f12648c.mo11984a(t);
                } catch (IOException e) {
                    Method method = this.f12646a;
                    int i = this.f12647b;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unable to convert ");
                    sb.append(t);
                    sb.append(" to RequestBody");
                    throw C5282h0.m11757a(method, e, i, sb.toString(), new Object[0]);
                }
            } else {
                throw C5282h0.m11755a(this.f12646a, this.f12647b, "Body parameter value must not be null.", new Object[0]);
            }
        }
    }

    /* renamed from: y.y$b */
    public static final class C5349b<T> extends C5347y<T> {

        /* renamed from: a */
        public final String f12649a;

        /* renamed from: b */
        public final C5280h<T, String> f12650b;

        /* renamed from: c */
        public final boolean f12651c;

        public C5349b(String str, C5280h<T, String> hVar, boolean z) {
            this.f12649a = (String) Objects.requireNonNull(str, "name == null");
            this.f12650b = hVar;
            this.f12651c = z;
        }

        /* renamed from: a */
        public void mo12059a(C5251a0 a0Var, @Nullable T t) {
            if (t != null) {
                String str = (String) this.f12650b.mo11984a(t);
                if (str != null) {
                    a0Var.mo11976a(this.f12649a, str, this.f12651c);
                }
            }
        }
    }

    /* renamed from: y.y$c */
    public static final class C5350c<T> extends C5347y<Map<String, T>> {

        /* renamed from: a */
        public final Method f12652a;

        /* renamed from: b */
        public final int f12653b;

        /* renamed from: c */
        public final C5280h<T, String> f12654c;

        /* renamed from: d */
        public final boolean f12655d;

        public C5350c(Method method, int i, C5280h<T, String> hVar, boolean z) {
            this.f12652a = method;
            this.f12653b = i;
            this.f12654c = hVar;
            this.f12655d = z;
        }

        /* renamed from: a */
        public void mo12059a(C5251a0 a0Var, @Nullable Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        String str2 = "'.";
                        if (value != null) {
                            String str3 = (String) this.f12654c.mo11984a(value);
                            if (str3 != null) {
                                a0Var.mo11976a(str, str3, this.f12655d);
                            } else {
                                Method method = this.f12652a;
                                int i = this.f12653b;
                                StringBuilder sb = new StringBuilder();
                                sb.append("Field map value '");
                                sb.append(value);
                                sb.append("' converted to null by ");
                                sb.append(this.f12654c.getClass().getName());
                                sb.append(" for key '");
                                sb.append(str);
                                sb.append(str2);
                                throw C5282h0.m11755a(method, i, sb.toString(), new Object[0]);
                            }
                        } else {
                            throw C5282h0.m11755a(this.f12652a, this.f12653b, C1965a.m4752a("Field map contained null value for key '", str, str2), new Object[0]);
                        }
                    } else {
                        throw C5282h0.m11755a(this.f12652a, this.f12653b, "Field map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw C5282h0.m11755a(this.f12652a, this.f12653b, "Field map was null.", new Object[0]);
        }
    }

    /* renamed from: y.y$d */
    public static final class C5351d<T> extends C5347y<T> {

        /* renamed from: a */
        public final String f12656a;

        /* renamed from: b */
        public final C5280h<T, String> f12657b;

        public C5351d(String str, C5280h<T, String> hVar) {
            this.f12656a = (String) Objects.requireNonNull(str, "name == null");
            this.f12657b = hVar;
        }

        /* renamed from: a */
        public void mo12059a(C5251a0 a0Var, @Nullable T t) {
            if (t != null) {
                String str = (String) this.f12657b.mo11984a(t);
                if (str != null) {
                    a0Var.mo11975a(this.f12656a, str);
                }
            }
        }
    }

    /* renamed from: y.y$e */
    public static final class C5352e<T> extends C5347y<T> {

        /* renamed from: a */
        public final Method f12658a;

        /* renamed from: b */
        public final int f12659b;

        /* renamed from: c */
        public final C4870w f12660c;

        /* renamed from: d */
        public final C5280h<T, C4716h0> f12661d;

        public C5352e(Method method, int i, C4870w wVar, C5280h<T, C4716h0> hVar) {
            this.f12658a = method;
            this.f12659b = i;
            this.f12660c = wVar;
            this.f12661d = hVar;
        }

        /* renamed from: a */
        public void mo12059a(C5251a0 a0Var, @Nullable T t) {
            if (t != null) {
                try {
                    a0Var.mo11977a(this.f12660c, (C4716h0) this.f12661d.mo11984a(t));
                } catch (IOException e) {
                    Method method = this.f12658a;
                    int i = this.f12659b;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unable to convert ");
                    sb.append(t);
                    sb.append(" to RequestBody");
                    throw C5282h0.m11755a(method, i, sb.toString(), e);
                }
            }
        }
    }

    /* renamed from: y.y$f */
    public static final class C5353f<T> extends C5347y<Map<String, T>> {

        /* renamed from: a */
        public final Method f12662a;

        /* renamed from: b */
        public final int f12663b;

        /* renamed from: c */
        public final C5280h<T, C4716h0> f12664c;

        /* renamed from: d */
        public final String f12665d;

        public C5353f(Method method, int i, C5280h<T, C4716h0> hVar, String str) {
            this.f12662a = method;
            this.f12663b = i;
            this.f12664c = hVar;
            this.f12665d = str;
        }

        /* renamed from: a */
        public void mo12059a(C5251a0 a0Var, @Nullable Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            a0Var.mo11977a(C4870w.f11611f.mo11383a("Content-Disposition", C1965a.m4752a("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", this.f12665d), (C4716h0) this.f12664c.mo11984a(value));
                        } else {
                            throw C5282h0.m11755a(this.f12662a, this.f12663b, C1965a.m4752a("Part map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw C5282h0.m11755a(this.f12662a, this.f12663b, "Part map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw C5282h0.m11755a(this.f12662a, this.f12663b, "Part map was null.", new Object[0]);
        }
    }

    /* renamed from: y.y$g */
    public static final class C5354g<T> extends C5347y<T> {

        /* renamed from: a */
        public final Method f12666a;

        /* renamed from: b */
        public final int f12667b;

        /* renamed from: c */
        public final String f12668c;

        /* renamed from: d */
        public final C5280h<T, String> f12669d;

        /* renamed from: e */
        public final boolean f12670e;

        public C5354g(Method method, int i, String str, C5280h<T, String> hVar, boolean z) {
            this.f12666a = method;
            this.f12667b = i;
            this.f12668c = (String) Objects.requireNonNull(str, "name == null");
            this.f12669d = hVar;
            this.f12670e = z;
        }

        /* renamed from: a */
        public void mo12059a(C5251a0 a0Var, @Nullable T t) {
            String str;
            int i;
            String str2;
            C5251a0 a0Var2 = a0Var;
            T t2 = t;
            if (t2 != null) {
                String str3 = this.f12668c;
                String str4 = (String) this.f12669d.mo11984a(t2);
                boolean z = this.f12670e;
                if (a0Var2.f12492c != null) {
                    int length = str4.length();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            str = str4;
                            break;
                        }
                        int codePointAt = str4.codePointAt(i2);
                        i = 47;
                        str2 = " \"<>^`{}|\\?#";
                        if (codePointAt < 32 || codePointAt >= 127 || str2.indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                            C4892f fVar = new C4892f();
                            fVar.mo11441a(str4, 0, i2);
                            C4892f fVar2 = null;
                        } else {
                            i2 += Character.charCount(codePointAt);
                        }
                    }
                    C4892f fVar3 = new C4892f();
                    fVar3.mo11441a(str4, 0, i2);
                    C4892f fVar22 = null;
                    while (i2 < length) {
                        int codePointAt2 = str4.codePointAt(i2);
                        if (!z || !(codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13)) {
                            if (codePointAt2 < 32 || codePointAt2 >= 127 || str2.indexOf(codePointAt2) != -1 || (!z && (codePointAt2 == i || codePointAt2 == 37))) {
                                if (fVar22 == null) {
                                    fVar22 = new C4892f();
                                }
                                fVar22.mo11445b(codePointAt2);
                                while (!fVar22.mo11460i()) {
                                    byte readByte = fVar22.readByte() & 255;
                                    fVar3.writeByte(37);
                                    fVar3.writeByte((int) C5251a0.f12488l[(readByte >> 4) & 15]);
                                    fVar3.writeByte((int) C5251a0.f12488l[readByte & 15]);
                                }
                            } else {
                                fVar3.mo11445b(codePointAt2);
                            }
                        }
                        i2 += Character.charCount(codePointAt2);
                        i = 47;
                    }
                    str = fVar3.mo11470r();
                    String str5 = a0Var2.f12492c;
                    StringBuilder sb = new StringBuilder();
                    sb.append(p116io.jsonwebtoken.lang.Objects.ARRAY_START);
                    sb.append(str3);
                    sb.append(p116io.jsonwebtoken.lang.Objects.ARRAY_END);
                    String replace = str5.replace(sb.toString(), str);
                    if (!C5251a0.f12489m.matcher(replace).matches()) {
                        a0Var2.f12492c = replace;
                        return;
                    }
                    throw new IllegalArgumentException(C1965a.m4751a("@Path parameters shouldn't perform path traversal ('.' or '..'): ", str4));
                }
                throw new AssertionError();
            }
            throw C5282h0.m11755a(this.f12666a, this.f12667b, C1965a.m4754a(C1965a.m4756a("Path parameter \""), this.f12668c, "\" value must not be null."), new Object[0]);
        }
    }

    /* renamed from: y.y$h */
    public static final class C5355h<T> extends C5347y<T> {

        /* renamed from: a */
        public final String f12671a;

        /* renamed from: b */
        public final C5280h<T, String> f12672b;

        /* renamed from: c */
        public final boolean f12673c;

        public C5355h(String str, C5280h<T, String> hVar, boolean z) {
            this.f12671a = (String) Objects.requireNonNull(str, "name == null");
            this.f12672b = hVar;
            this.f12673c = z;
        }

        /* renamed from: a */
        public void mo12059a(C5251a0 a0Var, @Nullable T t) {
            if (t != null) {
                String str = (String) this.f12672b.mo11984a(t);
                if (str != null) {
                    a0Var.mo11978b(this.f12671a, str, this.f12673c);
                }
            }
        }
    }

    /* renamed from: y.y$i */
    public static final class C5356i<T> extends C5347y<Map<String, T>> {

        /* renamed from: a */
        public final Method f12674a;

        /* renamed from: b */
        public final int f12675b;

        /* renamed from: c */
        public final C5280h<T, String> f12676c;

        /* renamed from: d */
        public final boolean f12677d;

        public C5356i(Method method, int i, C5280h<T, String> hVar, boolean z) {
            this.f12674a = method;
            this.f12675b = i;
            this.f12676c = hVar;
            this.f12677d = z;
        }

        /* renamed from: a */
        public void mo12059a(C5251a0 a0Var, @Nullable Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        String str2 = "'.";
                        if (value != null) {
                            String str3 = (String) this.f12676c.mo11984a(value);
                            if (str3 != null) {
                                a0Var.mo11978b(str, str3, this.f12677d);
                            } else {
                                Method method = this.f12674a;
                                int i = this.f12675b;
                                StringBuilder sb = new StringBuilder();
                                sb.append("Query map value '");
                                sb.append(value);
                                sb.append("' converted to null by ");
                                sb.append(this.f12676c.getClass().getName());
                                sb.append(" for key '");
                                sb.append(str);
                                sb.append(str2);
                                throw C5282h0.m11755a(method, i, sb.toString(), new Object[0]);
                            }
                        } else {
                            throw C5282h0.m11755a(this.f12674a, this.f12675b, C1965a.m4752a("Query map contained null value for key '", str, str2), new Object[0]);
                        }
                    } else {
                        throw C5282h0.m11755a(this.f12674a, this.f12675b, "Query map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw C5282h0.m11755a(this.f12674a, this.f12675b, "Query map was null", new Object[0]);
        }
    }

    /* renamed from: y.y$j */
    public static final class C5357j<T> extends C5347y<T> {

        /* renamed from: a */
        public final C5280h<T, String> f12678a;

        /* renamed from: b */
        public final boolean f12679b;

        public C5357j(C5280h<T, String> hVar, boolean z) {
            this.f12678a = hVar;
            this.f12679b = z;
        }

        /* renamed from: a */
        public void mo12059a(C5251a0 a0Var, @Nullable T t) {
            if (t != null) {
                a0Var.mo11978b((String) this.f12678a.mo11984a(t), null, this.f12679b);
            }
        }
    }

    /* renamed from: y.y$k */
    public static final class C5358k extends C5347y<C4689c> {

        /* renamed from: a */
        public static final C5358k f12680a = new C5358k();

        /* renamed from: a */
        public void mo12059a(C5251a0 a0Var, @Nullable Object obj) {
            C4689c cVar = (C4689c) obj;
            if (cVar != null) {
                a0Var.f12498i.mo10974a(cVar);
            }
        }
    }

    /* renamed from: a */
    public abstract void mo12059a(C5251a0 a0Var, @Nullable T t);
}
