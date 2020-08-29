package p484y;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import p410v.C4870w;
import p410v.C4873x;
import p410v.C4879z;

/* renamed from: y.b0 */
public final class C5254b0 {

    /* renamed from: a */
    public final Method f12506a;

    /* renamed from: b */
    public final C4873x f12507b;

    /* renamed from: c */
    public final String f12508c;
    @Nullable

    /* renamed from: d */
    public final String f12509d;
    @Nullable

    /* renamed from: e */
    public final C4870w f12510e;
    @Nullable

    /* renamed from: f */
    public final C4879z f12511f;

    /* renamed from: g */
    public final boolean f12512g;

    /* renamed from: h */
    public final boolean f12513h;

    /* renamed from: i */
    public final boolean f12514i;

    /* renamed from: j */
    public final C5347y<?>[] f12515j;

    /* renamed from: k */
    public final boolean f12516k;

    /* renamed from: y.b0$a */
    public static final class C5255a {

        /* renamed from: x */
        public static final Pattern f12517x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* renamed from: y */
        public static final Pattern f12518y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* renamed from: a */
        public final C5265d0 f12519a;

        /* renamed from: b */
        public final Method f12520b;

        /* renamed from: c */
        public final Annotation[] f12521c;

        /* renamed from: d */
        public final Annotation[][] f12522d;

        /* renamed from: e */
        public final Type[] f12523e;

        /* renamed from: f */
        public boolean f12524f;

        /* renamed from: g */
        public boolean f12525g;

        /* renamed from: h */
        public boolean f12526h;

        /* renamed from: i */
        public boolean f12527i;

        /* renamed from: j */
        public boolean f12528j;

        /* renamed from: k */
        public boolean f12529k;

        /* renamed from: l */
        public boolean f12530l;

        /* renamed from: m */
        public boolean f12531m;
        @Nullable

        /* renamed from: n */
        public String f12532n;

        /* renamed from: o */
        public boolean f12533o;

        /* renamed from: p */
        public boolean f12534p;

        /* renamed from: q */
        public boolean f12535q;
        @Nullable

        /* renamed from: r */
        public String f12536r;
        @Nullable

        /* renamed from: s */
        public C4870w f12537s;
        @Nullable

        /* renamed from: t */
        public C4879z f12538t;
        @Nullable

        /* renamed from: u */
        public Set<String> f12539u;
        @Nullable

        /* renamed from: v */
        public C5347y<?>[] f12540v;

        /* renamed from: w */
        public boolean f12541w;

        public C5255a(C5265d0 d0Var, Method method) {
            this.f12519a = d0Var;
            this.f12520b = method;
            this.f12521c = method.getAnnotations();
            this.f12523e = method.getGenericParameterTypes();
            this.f12522d = method.getParameterAnnotations();
        }

        /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Class<?>, code=java.lang.Class, for r1v0, types: [java.lang.Class<?>, java.lang.Class] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static java.lang.Class<?> m11710a(java.lang.Class r1) {
            /*
                java.lang.Class r0 = java.lang.Boolean.TYPE
                if (r0 != r1) goto L_0x0007
                java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
                return r1
            L_0x0007:
                java.lang.Class r0 = java.lang.Byte.TYPE
                if (r0 != r1) goto L_0x000e
                java.lang.Class<java.lang.Byte> r1 = java.lang.Byte.class
                return r1
            L_0x000e:
                java.lang.Class r0 = java.lang.Character.TYPE
                if (r0 != r1) goto L_0x0015
                java.lang.Class<java.lang.Character> r1 = java.lang.Character.class
                return r1
            L_0x0015:
                java.lang.Class r0 = java.lang.Double.TYPE
                if (r0 != r1) goto L_0x001c
                java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
                return r1
            L_0x001c:
                java.lang.Class r0 = java.lang.Float.TYPE
                if (r0 != r1) goto L_0x0023
                java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
                return r1
            L_0x0023:
                java.lang.Class r0 = java.lang.Integer.TYPE
                if (r0 != r1) goto L_0x002a
                java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
                return r1
            L_0x002a:
                java.lang.Class r0 = java.lang.Long.TYPE
                if (r0 != r1) goto L_0x0031
                java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
                return r1
            L_0x0031:
                java.lang.Class r0 = java.lang.Short.TYPE
                if (r0 != r1) goto L_0x0037
                java.lang.Class<java.lang.Short> r1 = java.lang.Short.class
            L_0x0037:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p484y.C5254b0.C5255a.m11710a(java.lang.Class):java.lang.Class");
        }

        /* renamed from: a */
        public final void mo11980a(int i, Type type) {
            if (C5282h0.m11769c(type)) {
                throw C5282h0.m11755a(this.f12520b, i, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }

        /* renamed from: a */
        public final void mo11981a(String str, String str2, boolean z) {
            String str3 = this.f12532n;
            if (str3 == null) {
                this.f12532n = str;
                this.f12533o = z;
                if (!str2.isEmpty()) {
                    int indexOf = str2.indexOf(63);
                    if (indexOf != -1 && indexOf < str2.length() - 1) {
                        String substring = str2.substring(indexOf + 1);
                        if (f12517x.matcher(substring).find()) {
                            throw C5282h0.m11756a(this.f12520b, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                        }
                    }
                    this.f12536r = str2;
                    Matcher matcher = f12517x.matcher(str2);
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    while (matcher.find()) {
                        linkedHashSet.add(matcher.group(1));
                    }
                    this.f12539u = linkedHashSet;
                    return;
                }
                return;
            }
            throw C5282h0.m11756a(this.f12520b, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }
    }

    public C5254b0(C5255a aVar) {
        this.f12506a = aVar.f12520b;
        this.f12507b = aVar.f12519a.f12554c;
        this.f12508c = aVar.f12532n;
        this.f12509d = aVar.f12536r;
        this.f12510e = aVar.f12537s;
        this.f12511f = aVar.f12538t;
        this.f12512g = aVar.f12533o;
        this.f12513h = aVar.f12534p;
        this.f12514i = aVar.f12535q;
        this.f12515j = aVar.f12540v;
        this.f12516k = aVar.f12541w;
    }
}
