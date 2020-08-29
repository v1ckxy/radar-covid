package p213q.p217b.p355e.p357v;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.HashSet;
import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;

/* renamed from: q.b.e.v.a */
public final class C4350a {

    /* renamed from: a */
    public static final Type[] f10389a = new Type[0];

    /* renamed from: q.b.e.v.a$a */
    public static final class C4351a implements GenericArrayType, Serializable {

        /* renamed from: e */
        public final Type f10390e;

        public C4351a(Type type) {
            this.f10390e = C4350a.m9860a(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C4350a.m9864a(this, (GenericArrayType) obj);
        }

        public Type getGenericComponentType() {
            return this.f10390e;
        }

        public int hashCode() {
            return this.f10390e.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(C4350a.m9868d(this.f10390e));
            sb.append("[]");
            return sb.toString();
        }
    }

    /* renamed from: q.b.e.v.a$b */
    public static final class C4352b implements ParameterizedType, Serializable {

        /* renamed from: e */
        public final Type f10391e;

        /* renamed from: f */
        public final Type f10392f;

        /* renamed from: g */
        public final Type[] f10393g;

        public C4352b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z = true;
                boolean z2 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                if (type == null && !z2) {
                    z = false;
                }
                C2286e.m5251a(z);
            }
            this.f10391e = type == null ? null : C4350a.m9860a(type);
            this.f10392f = C4350a.m9860a(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.f10393g = typeArr2;
            int length = typeArr2.length;
            for (int i = 0; i < length; i++) {
                C2286e.m5179a(this.f10393g[i]);
                C4350a.m9866b(this.f10393g[i]);
                Type[] typeArr3 = this.f10393g;
                typeArr3[i] = C4350a.m9860a(typeArr3[i]);
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C4350a.m9864a(this, (ParameterizedType) obj);
        }

        public Type[] getActualTypeArguments() {
            return (Type[]) this.f10393g.clone();
        }

        public Type getOwnerType() {
            return this.f10391e;
        }

        public Type getRawType() {
            return this.f10392f;
        }

        public int hashCode() {
            int hashCode = Arrays.hashCode(this.f10393g) ^ this.f10392f.hashCode();
            Type type = this.f10391e;
            return hashCode ^ (type != null ? type.hashCode() : 0);
        }

        public String toString() {
            int length = this.f10393g.length;
            if (length == 0) {
                return C4350a.m9868d(this.f10392f);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(C4350a.m9868d(this.f10392f));
            sb.append("<");
            sb.append(C4350a.m9868d(this.f10393g[0]));
            for (int i = 1; i < length; i++) {
                sb.append(Objects.ARRAY_ELEMENT_SEPARATOR);
                sb.append(C4350a.m9868d(this.f10393g[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* renamed from: q.b.e.v.a$c */
    public static final class C4353c implements WildcardType, Serializable {

        /* renamed from: e */
        public final Type f10394e;

        /* renamed from: f */
        public final Type f10395f;

        public C4353c(Type[] typeArr, Type[] typeArr2) {
            Class<Object> cls = Object.class;
            boolean z = true;
            C2286e.m5251a(typeArr2.length <= 1);
            C2286e.m5251a(typeArr.length == 1);
            if (typeArr2.length == 1) {
                C2286e.m5179a(typeArr2[0]);
                C4350a.m9866b(typeArr2[0]);
                if (typeArr[0] != cls) {
                    z = false;
                }
                C2286e.m5251a(z);
                this.f10395f = C4350a.m9860a(typeArr2[0]);
                this.f10394e = cls;
                return;
            }
            C2286e.m5179a(typeArr[0]);
            C4350a.m9866b(typeArr[0]);
            this.f10395f = null;
            this.f10394e = C4350a.m9860a(typeArr[0]);
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C4350a.m9864a(this, (WildcardType) obj);
        }

        public Type[] getLowerBounds() {
            Type type = this.f10395f;
            if (type == null) {
                return C4350a.f10389a;
            }
            return new Type[]{type};
        }

        public Type[] getUpperBounds() {
            return new Type[]{this.f10394e};
        }

        public int hashCode() {
            Type type = this.f10395f;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f10394e.hashCode() + 31);
        }

        public String toString() {
            Type type;
            StringBuilder sb;
            if (this.f10395f != null) {
                sb = C1965a.m4756a("? super ");
                type = this.f10395f;
            } else if (this.f10394e == Object.class) {
                return "?";
            } else {
                sb = C1965a.m4756a("? extends ");
                type = this.f10394e;
            }
            sb.append(C4350a.m9868d(type));
            return sb.toString();
        }
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [q.b.e.v.a$a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Type m9860a(java.lang.reflect.Type r3) {
        /*
            boolean r0 = r3 instanceof java.lang.Class
            if (r0 == 0) goto L_0x001b
            java.lang.Class r3 = (java.lang.Class) r3
            boolean r0 = r3.isArray()
            if (r0 == 0) goto L_0x001a
            q.b.e.v.a$a r0 = new q.b.e.v.a$a
            java.lang.Class r3 = r3.getComponentType()
            java.lang.reflect.Type r3 = m9860a(r3)
            r0.<init>(r3)
            r3 = r0
        L_0x001a:
            return r3
        L_0x001b:
            boolean r0 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L_0x0033
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            q.b.e.v.a$b r0 = new q.b.e.v.a$b
            java.lang.reflect.Type r1 = r3.getOwnerType()
            java.lang.reflect.Type r2 = r3.getRawType()
            java.lang.reflect.Type[] r3 = r3.getActualTypeArguments()
            r0.<init>(r1, r2, r3)
            return r0
        L_0x0033:
            boolean r0 = r3 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x0043
            java.lang.reflect.GenericArrayType r3 = (java.lang.reflect.GenericArrayType) r3
            q.b.e.v.a$a r0 = new q.b.e.v.a$a
            java.lang.reflect.Type r3 = r3.getGenericComponentType()
            r0.<init>(r3)
            return r0
        L_0x0043:
            boolean r0 = r3 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x0057
            java.lang.reflect.WildcardType r3 = (java.lang.reflect.WildcardType) r3
            q.b.e.v.a$c r0 = new q.b.e.v.a$c
            java.lang.reflect.Type[] r1 = r3.getUpperBounds()
            java.lang.reflect.Type[] r3 = r3.getLowerBounds()
            r0.<init>(r1, r3)
            return r0
        L_0x0057:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p355e.p357v.C4350a.m9860a(java.lang.reflect.Type):java.lang.reflect.Type");
    }

    /* renamed from: a */
    public static Type m9861a(Type type, Class<?> cls, Class<?> cls2) {
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
                    return m9861a(cls.getGenericInterfaces()[i], interfaces[i], cls2);
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
                    return m9861a(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: a */
    public static Type m9862a(Type type, Class<?> cls, Type type2) {
        return m9863a(type, cls, type2, new HashSet());
    }

    /* renamed from: a */
    public static boolean m9864a(Type type, Type type2) {
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
            if (!(ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) || !parameterizedType.getRawType().equals(parameterizedType2.getRawType()) || !Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                z = false;
            }
            return z;
        } else if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return m9864a(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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

    /* renamed from: b */
    public static Type m9865b(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        C2286e.m5251a(cls2.isAssignableFrom(cls));
        return m9862a(type, cls, m9861a(type, cls, cls2));
    }

    /* renamed from: b */
    public static void m9866b(Type type) {
        C2286e.m5251a(!(type instanceof Class) || !((Class) type).isPrimitive());
    }

    /* renamed from: c */
    public static Class<?> m9867c(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            C2286e.m5251a(rawType instanceof Class);
            return (Class) rawType;
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(m9867c(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return m9867c(((WildcardType) type).getUpperBounds()[0]);
            }
            String name = type == null ? Objects.NULL_STRING : type.getClass().getName();
            StringBuilder sb = new StringBuilder();
            sb.append("Expected a Class, ParameterizedType, or GenericArrayType, but <");
            sb.append(type);
            sb.append("> is of type ");
            sb.append(name);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: d */
    public static String m9868d(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* JADX WARNING: type inference failed for: r10v2, types: [java.lang.reflect.Type] */
    /* JADX WARNING: type inference failed for: r0v21, types: [q.b.e.v.a$a] */
    /* JADX WARNING: type inference failed for: r10v19 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Type m9863a(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10, java.util.Collection<java.lang.reflect.TypeVariable> r11) {
        /*
        L_0x0000:
            boolean r0 = r10 instanceof java.lang.reflect.TypeVariable
            r1 = 0
            if (r0 == 0) goto L_0x004e
            r0 = r10
            java.lang.reflect.TypeVariable r0 = (java.lang.reflect.TypeVariable) r0
            boolean r2 = r11.contains(r0)
            if (r2 == 0) goto L_0x000f
            return r10
        L_0x000f:
            r11.add(r0)
            java.lang.reflect.GenericDeclaration r10 = r0.getGenericDeclaration()
            boolean r2 = r10 instanceof java.lang.Class
            if (r2 == 0) goto L_0x001d
            java.lang.Class r10 = (java.lang.Class) r10
            goto L_0x001e
        L_0x001d:
            r10 = 0
        L_0x001e:
            if (r10 != 0) goto L_0x0021
            goto L_0x004a
        L_0x0021:
            java.lang.reflect.Type r2 = m9861a(r8, r9, r10)
            boolean r3 = r2 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L_0x004a
            java.lang.reflect.TypeVariable[] r10 = r10.getTypeParameters()
            int r3 = r10.length
        L_0x002e:
            if (r1 >= r3) goto L_0x0044
            r4 = r10[r1]
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x0041
            java.lang.reflect.ParameterizedType r2 = (java.lang.reflect.ParameterizedType) r2
            java.lang.reflect.Type[] r10 = r2.getActualTypeArguments()
            r10 = r10[r1]
            goto L_0x004b
        L_0x0041:
            int r1 = r1 + 1
            goto L_0x002e
        L_0x0044:
            java.util.NoSuchElementException r8 = new java.util.NoSuchElementException
            r8.<init>()
            throw r8
        L_0x004a:
            r10 = r0
        L_0x004b:
            if (r10 != r0) goto L_0x0000
            return r10
        L_0x004e:
            boolean r0 = r10 instanceof java.lang.Class
            if (r0 == 0) goto L_0x006c
            r0 = r10
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r2 = r0.isArray()
            if (r2 == 0) goto L_0x006c
            java.lang.Class r10 = r0.getComponentType()
            java.lang.reflect.Type r8 = m9863a(r8, r9, r10, r11)
            if (r10 != r8) goto L_0x0066
            goto L_0x006b
        L_0x0066:
            q.b.e.v.a$a r0 = new q.b.e.v.a$a
            r0.<init>(r8)
        L_0x006b:
            return r0
        L_0x006c:
            boolean r0 = r10 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x0083
            java.lang.reflect.GenericArrayType r10 = (java.lang.reflect.GenericArrayType) r10
            java.lang.reflect.Type r0 = r10.getGenericComponentType()
            java.lang.reflect.Type r8 = m9863a(r8, r9, r0, r11)
            if (r0 != r8) goto L_0x007d
            goto L_0x0082
        L_0x007d:
            q.b.e.v.a$a r10 = new q.b.e.v.a$a
            r10.<init>(r8)
        L_0x0082:
            return r10
        L_0x0083:
            boolean r0 = r10 instanceof java.lang.reflect.ParameterizedType
            r2 = 1
            if (r0 == 0) goto L_0x00c3
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            java.lang.reflect.Type r0 = r10.getOwnerType()
            java.lang.reflect.Type r3 = m9863a(r8, r9, r0, r11)
            if (r3 == r0) goto L_0x0096
            r0 = r2
            goto L_0x0097
        L_0x0096:
            r0 = r1
        L_0x0097:
            java.lang.reflect.Type[] r4 = r10.getActualTypeArguments()
            int r5 = r4.length
        L_0x009c:
            if (r1 >= r5) goto L_0x00b7
            r6 = r4[r1]
            java.lang.reflect.Type r6 = m9863a(r8, r9, r6, r11)
            r7 = r4[r1]
            if (r6 == r7) goto L_0x00b4
            if (r0 != 0) goto L_0x00b2
            java.lang.Object r0 = r4.clone()
            r4 = r0
            java.lang.reflect.Type[] r4 = (java.lang.reflect.Type[]) r4
            r0 = r2
        L_0x00b2:
            r4[r1] = r6
        L_0x00b4:
            int r1 = r1 + 1
            goto L_0x009c
        L_0x00b7:
            if (r0 == 0) goto L_0x00c2
            java.lang.reflect.Type r8 = r10.getRawType()
            q.b.e.v.a$b r10 = new q.b.e.v.a$b
            r10.<init>(r3, r8, r4)
        L_0x00c2:
            return r10
        L_0x00c3:
            boolean r0 = r10 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x0121
            java.lang.reflect.WildcardType r10 = (java.lang.reflect.WildcardType) r10
            java.lang.reflect.Type[] r0 = r10.getLowerBounds()
            java.lang.reflect.Type[] r3 = r10.getUpperBounds()
            int r4 = r0.length
            if (r4 != r2) goto L_0x00fa
            r3 = r0[r1]
            java.lang.reflect.Type r8 = m9863a(r8, r9, r3, r11)
            r9 = r0[r1]
            if (r8 == r9) goto L_0x0121
            boolean r9 = r8 instanceof java.lang.reflect.WildcardType
            if (r9 == 0) goto L_0x00e9
            java.lang.reflect.WildcardType r8 = (java.lang.reflect.WildcardType) r8
            java.lang.reflect.Type[] r8 = r8.getLowerBounds()
            goto L_0x00ee
        L_0x00e9:
            java.lang.reflect.Type[] r9 = new java.lang.reflect.Type[r2]
            r9[r1] = r8
            r8 = r9
        L_0x00ee:
            q.b.e.v.a$c r9 = new q.b.e.v.a$c
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r2]
            java.lang.Class<java.lang.Object> r11 = java.lang.Object.class
            r10[r1] = r11
            r9.<init>(r10, r8)
            return r9
        L_0x00fa:
            int r0 = r3.length
            if (r0 != r2) goto L_0x0121
            r0 = r3[r1]
            java.lang.reflect.Type r8 = m9863a(r8, r9, r0, r11)     // Catch:{ all -> 0x011f }
            r9 = r3[r1]
            if (r8 == r9) goto L_0x0121
            boolean r9 = r8 instanceof java.lang.reflect.WildcardType
            if (r9 == 0) goto L_0x0112
            java.lang.reflect.WildcardType r8 = (java.lang.reflect.WildcardType) r8
            java.lang.reflect.Type[] r8 = r8.getUpperBounds()
            goto L_0x0117
        L_0x0112:
            java.lang.reflect.Type[] r9 = new java.lang.reflect.Type[r2]
            r9[r1] = r8
            r8 = r9
        L_0x0117:
            q.b.e.v.a$c r9 = new q.b.e.v.a$c
            java.lang.reflect.Type[] r10 = f10389a
            r9.<init>(r8, r10)
            return r9
        L_0x011f:
            r8 = move-exception
            throw r8
        L_0x0121:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p355e.p357v.C4350a.m9863a(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.Collection):java.lang.reflect.Type");
    }
}
