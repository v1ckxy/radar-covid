package p484y;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Objects;
import javax.annotation.Nullable;
import p116io.jsonwebtoken.lang.Strings;
import p213q.p214a.p215a.p216a.C1965a;
import p410v.C4725j0;
import p423w.C4892f;
import p423w.C4915y;

/* renamed from: y.h0 */
public final class C5282h0 {

    /* renamed from: a */
    public static final Type[] f12574a = new Type[0];

    /* renamed from: y.h0$a */
    public static final class C5283a implements GenericArrayType {

        /* renamed from: e */
        public final Type f12575e;

        public C5283a(Type type) {
            this.f12575e = type;
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C5282h0.m11765a((Type) this, (Type) (GenericArrayType) obj);
        }

        public Type getGenericComponentType() {
            return this.f12575e;
        }

        public int hashCode() {
            return this.f12575e.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(C5282h0.m11770d(this.f12575e));
            sb.append("[]");
            return sb.toString();
        }
    }

    /* renamed from: y.h0$b */
    public static final class C5284b implements ParameterizedType {
        @Nullable

        /* renamed from: e */
        public final Type f12576e;

        /* renamed from: f */
        public final Type f12577f;

        /* renamed from: g */
        public final Type[] f12578g;

        public C5284b(@Nullable Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                boolean z = true;
                boolean z2 = type == null;
                if (((Class) type2).getEnclosingClass() != null) {
                    z = false;
                }
                if (z2 != z) {
                    throw new IllegalArgumentException();
                }
            }
            for (Type type3 : typeArr) {
                Objects.requireNonNull(type3, "typeArgument == null");
                C5282h0.m11764a(type3);
            }
            this.f12576e = type;
            this.f12577f = type2;
            this.f12578g = (Type[]) typeArr.clone();
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C5282h0.m11765a((Type) this, (Type) (ParameterizedType) obj);
        }

        public Type[] getActualTypeArguments() {
            return (Type[]) this.f12578g.clone();
        }

        @Nullable
        public Type getOwnerType() {
            return this.f12576e;
        }

        public Type getRawType() {
            return this.f12577f;
        }

        public int hashCode() {
            int hashCode = Arrays.hashCode(this.f12578g) ^ this.f12577f.hashCode();
            Type type = this.f12576e;
            return hashCode ^ (type != null ? type.hashCode() : 0);
        }

        public String toString() {
            Type[] typeArr = this.f12578g;
            if (typeArr.length == 0) {
                return C5282h0.m11770d(this.f12577f);
            }
            StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
            sb.append(C5282h0.m11770d(this.f12577f));
            sb.append("<");
            sb.append(C5282h0.m11770d(this.f12578g[0]));
            for (int i = 1; i < this.f12578g.length; i++) {
                sb.append(p116io.jsonwebtoken.lang.Objects.ARRAY_ELEMENT_SEPARATOR);
                sb.append(C5282h0.m11770d(this.f12578g[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* renamed from: y.h0$c */
    public static final class C5285c implements WildcardType {

        /* renamed from: e */
        public final Type f12579e;
        @Nullable

        /* renamed from: f */
        public final Type f12580f;

        public C5285c(Type[] typeArr, Type[] typeArr2) {
            Class<Object> cls = Object.class;
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            } else if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            } else if (typeArr2.length == 1) {
                if (typeArr2[0] != null) {
                    C5282h0.m11764a(typeArr2[0]);
                    if (typeArr[0] == cls) {
                        this.f12580f = typeArr2[0];
                        this.f12579e = cls;
                        return;
                    }
                    throw new IllegalArgumentException();
                }
                throw null;
            } else if (typeArr[0] != null) {
                C5282h0.m11764a(typeArr[0]);
                this.f12580f = null;
                this.f12579e = typeArr[0];
            } else {
                throw null;
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C5282h0.m11765a((Type) this, (Type) (WildcardType) obj);
        }

        public Type[] getLowerBounds() {
            Type type = this.f12580f;
            if (type == null) {
                return C5282h0.f12574a;
            }
            return new Type[]{type};
        }

        public Type[] getUpperBounds() {
            return new Type[]{this.f12579e};
        }

        public int hashCode() {
            Type type = this.f12580f;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f12579e.hashCode() + 31);
        }

        public String toString() {
            Type type;
            StringBuilder sb;
            if (this.f12580f != null) {
                sb = C1965a.m4756a("? super ");
                type = this.f12580f;
            } else if (this.f12579e == Object.class) {
                return "?";
            } else {
                sb = C1965a.m4756a("? extends ");
                type = this.f12579e;
            }
            sb.append(C5282h0.m11770d(type));
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static RuntimeException m11755a(Method method, int i, String str, Object... objArr) {
        StringBuilder b = C1965a.m4763b(str, " (parameter #");
        b.append(i + 1);
        b.append(")");
        return m11756a(method, b.toString(), objArr);
    }

    /* renamed from: a */
    public static RuntimeException m11756a(Method method, String str, Object... objArr) {
        return m11758a(method, (Throwable) null, str, objArr);
    }

    /* renamed from: a */
    public static RuntimeException m11757a(Method method, Throwable th, int i, String str, Object... objArr) {
        StringBuilder b = C1965a.m4763b(str, " (parameter #");
        b.append(i + 1);
        b.append(")");
        return m11758a(method, th, b.toString(), objArr);
    }

    /* renamed from: a */
    public static RuntimeException m11758a(Method method, @Nullable Throwable th, String str, Object... objArr) {
        StringBuilder b = C1965a.m4763b(String.format(str, objArr), "\n    for method ");
        b.append(method.getDeclaringClass().getSimpleName());
        b.append(Strings.CURRENT_PATH);
        b.append(method.getName());
        return new IllegalArgumentException(b.toString(), th);
    }

    /* renamed from: a */
    public static Type m11759a(int i, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i < 0 || i >= actualTypeArguments.length) {
            StringBuilder a = C1965a.m4757a("Index ", i, " not in range [0,");
            a.append(actualTypeArguments.length);
            a.append(") for ");
            a.append(parameterizedType);
            throw new IllegalArgumentException(a.toString());
        }
        Type type = actualTypeArguments[i];
        return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
    }

    /* renamed from: a */
    public static Type m11760a(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                if (interfaces[i] == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(interfaces[i])) {
                    return m11760a(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return m11760a(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: a */
    public static C4725j0 m11762a(C4725j0 j0Var) {
        C4892f fVar = new C4892f();
        j0Var.mo10991h().mo11436a((C4915y) fVar);
        return C4725j0.f11106f.mo11053a(fVar, j0Var.mo10990g(), j0Var.mo10989f());
    }

    /* renamed from: a */
    public static void m11763a(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        } else if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        } else if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    /* renamed from: a */
    public static void m11764a(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public static boolean m11765a(Type type, Type type2) {
        boolean z = true;
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            if ((ownerType != ownerType2 && (ownerType == null || !ownerType.equals(ownerType2))) || !parameterizedType.getRawType().equals(parameterizedType2.getRawType()) || !Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                z = false;
            }
            return z;
        } else if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return m11765a(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        } else if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            if (!Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) || !Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                z = false;
            }
            return z;
        } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            if (typeVariable.getGenericDeclaration() != typeVariable2.getGenericDeclaration() || !typeVariable.getName().equals(typeVariable2.getName())) {
                z = false;
            }
            return z;
        }
    }

    /* renamed from: a */
    public static boolean m11766a(Annotation[] annotationArr, Class<? extends Annotation> cls) {
        for (Annotation isInstance : annotationArr) {
            if (cls.isInstance(isInstance)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static Class<?> m11767b(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(m11767b(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return m11767b(((WildcardType) type).getUpperBounds()[0]);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Expected a Class, ParameterizedType, or GenericArrayType, but <");
            sb.append(type);
            sb.append("> is of type ");
            sb.append(type.getClass().getName());
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: b */
    public static Type m11768b(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return m11761a(type, cls, m11760a(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    public static boolean m11769c(@Nullable Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type c : ((ParameterizedType) type).getActualTypeArguments()) {
                if (m11769c(c)) {
                    return true;
                }
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            return m11769c(((GenericArrayType) type).getGenericComponentType());
        } else {
            if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
                return true;
            }
            String name = type == null ? p116io.jsonwebtoken.lang.Objects.NULL_STRING : type.getClass().getName();
            StringBuilder sb = new StringBuilder();
            sb.append("Expected a Class, ParameterizedType, or GenericArrayType, but <");
            sb.append(type);
            sb.append("> is of type ");
            sb.append(name);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: d */
    public static String m11770d(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* JADX WARNING: type inference failed for: r10v2, types: [java.lang.reflect.Type] */
    /* JADX WARNING: type inference failed for: r0v23, types: [y.h0$a] */
    /* JADX WARNING: type inference failed for: r0v26, types: [java.lang.reflect.Type] */
    /* JADX WARNING: type inference failed for: r0v27 */
    /* JADX WARNING: type inference failed for: r0v30 */
    /* JADX WARNING: type inference failed for: r0v34 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0043 A[LOOP:0: B:0:0x0000->B:21:0x0043, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0042 A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Type m11761a(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10) {
        /*
        L_0x0000:
            boolean r0 = r10 instanceof java.lang.reflect.TypeVariable
            r1 = 0
            if (r0 == 0) goto L_0x0045
            java.lang.reflect.TypeVariable r10 = (java.lang.reflect.TypeVariable) r10
            java.lang.reflect.GenericDeclaration r0 = r10.getGenericDeclaration()
            boolean r2 = r0 instanceof java.lang.Class
            if (r2 == 0) goto L_0x0012
            java.lang.Class r0 = (java.lang.Class) r0
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            if (r0 != 0) goto L_0x0016
            goto L_0x003f
        L_0x0016:
            java.lang.reflect.Type r2 = m11760a(r8, r9, r0)
            boolean r3 = r2 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L_0x003f
            java.lang.reflect.TypeVariable[] r0 = r0.getTypeParameters()
        L_0x0022:
            int r3 = r0.length
            if (r1 >= r3) goto L_0x0039
            r3 = r0[r1]
            boolean r3 = r10.equals(r3)
            if (r3 == 0) goto L_0x0036
            java.lang.reflect.ParameterizedType r2 = (java.lang.reflect.ParameterizedType) r2
            java.lang.reflect.Type[] r0 = r2.getActualTypeArguments()
            r0 = r0[r1]
            goto L_0x0040
        L_0x0036:
            int r1 = r1 + 1
            goto L_0x0022
        L_0x0039:
            java.util.NoSuchElementException r8 = new java.util.NoSuchElementException
            r8.<init>()
            throw r8
        L_0x003f:
            r0 = r10
        L_0x0040:
            if (r0 != r10) goto L_0x0043
            return r0
        L_0x0043:
            r10 = r0
            goto L_0x0000
        L_0x0045:
            boolean r0 = r10 instanceof java.lang.Class
            if (r0 == 0) goto L_0x0063
            r0 = r10
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r2 = r0.isArray()
            if (r2 == 0) goto L_0x0063
            java.lang.Class r10 = r0.getComponentType()
            java.lang.reflect.Type r8 = m11761a(r8, r9, r10)
            if (r10 != r8) goto L_0x005d
            goto L_0x0062
        L_0x005d:
            y.h0$a r0 = new y.h0$a
            r0.<init>(r8)
        L_0x0062:
            return r0
        L_0x0063:
            boolean r0 = r10 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x007a
            java.lang.reflect.GenericArrayType r10 = (java.lang.reflect.GenericArrayType) r10
            java.lang.reflect.Type r0 = r10.getGenericComponentType()
            java.lang.reflect.Type r8 = m11761a(r8, r9, r0)
            if (r0 != r8) goto L_0x0074
            goto L_0x0079
        L_0x0074:
            y.h0$a r10 = new y.h0$a
            r10.<init>(r8)
        L_0x0079:
            return r10
        L_0x007a:
            boolean r0 = r10 instanceof java.lang.reflect.ParameterizedType
            r2 = 1
            if (r0 == 0) goto L_0x00bb
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            java.lang.reflect.Type r0 = r10.getOwnerType()
            java.lang.reflect.Type r3 = m11761a(r8, r9, r0)
            if (r3 == r0) goto L_0x008d
            r0 = r2
            goto L_0x008e
        L_0x008d:
            r0 = r1
        L_0x008e:
            java.lang.reflect.Type[] r4 = r10.getActualTypeArguments()
            int r5 = r4.length
        L_0x0093:
            if (r1 >= r5) goto L_0x00ae
            r6 = r4[r1]
            java.lang.reflect.Type r6 = m11761a(r8, r9, r6)
            r7 = r4[r1]
            if (r6 == r7) goto L_0x00ab
            if (r0 != 0) goto L_0x00a9
            java.lang.Object r0 = r4.clone()
            r4 = r0
            java.lang.reflect.Type[] r4 = (java.lang.reflect.Type[]) r4
            r0 = r2
        L_0x00a9:
            r4[r1] = r6
        L_0x00ab:
            int r1 = r1 + 1
            goto L_0x0093
        L_0x00ae:
            if (r0 == 0) goto L_0x00ba
            y.h0$b r8 = new y.h0$b
            java.lang.reflect.Type r9 = r10.getRawType()
            r8.<init>(r3, r9, r4)
            r10 = r8
        L_0x00ba:
            return r10
        L_0x00bb:
            boolean r0 = r10 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x0101
            java.lang.reflect.WildcardType r10 = (java.lang.reflect.WildcardType) r10
            java.lang.reflect.Type[] r0 = r10.getLowerBounds()
            java.lang.reflect.Type[] r3 = r10.getUpperBounds()
            int r4 = r0.length
            if (r4 != r2) goto L_0x00e6
            r3 = r0[r1]
            java.lang.reflect.Type r8 = m11761a(r8, r9, r3)
            r9 = r0[r1]
            if (r8 == r9) goto L_0x0101
            y.h0$c r9 = new y.h0$c
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r2]
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r10[r1] = r0
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r2]
            r0[r1] = r8
            r9.<init>(r10, r0)
            return r9
        L_0x00e6:
            int r0 = r3.length
            if (r0 != r2) goto L_0x0101
            r0 = r3[r1]
            java.lang.reflect.Type r8 = m11761a(r8, r9, r0)     // Catch:{ all -> 0x00ff }
            r9 = r3[r1]
            if (r8 == r9) goto L_0x0101
            y.h0$c r9 = new y.h0$c
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r2]
            r10[r1] = r8
            java.lang.reflect.Type[] r8 = f12574a
            r9.<init>(r10, r8)
            return r9
        L_0x00ff:
            r8 = move-exception
            throw r8
        L_0x0101:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p484y.C5282h0.m11761a(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type):java.lang.reflect.Type");
    }
}
