package p213q.p217b.p355e.p361w;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.Map;
import p116io.jsonwebtoken.lang.Objects;
import p213q.p217b.p355e.p357v.C4350a;
import p213q.p217b.p355e.p357v.C4350a.C4351a;
import p213q.p217b.p355e.p357v.C4350a.C4352b;

/* renamed from: q.b.e.w.a */
public class C4396a<T> {
    public final int hashCode;
    public final Class<? super T> rawType;
    public final Type type;

    public C4396a() {
        Type superclassTypeParameter = getSuperclassTypeParameter(getClass());
        this.type = superclassTypeParameter;
        this.rawType = C4350a.m9867c(superclassTypeParameter);
        this.hashCode = this.type.hashCode();
    }

    public C4396a(Type type2) {
        if (type2 != null) {
            Type a = C4350a.m9860a(type2);
            this.type = a;
            this.rawType = C4350a.m9867c(a);
            this.hashCode = this.type.hashCode();
            return;
        }
        throw null;
    }

    public static AssertionError buildUnexpectedTypeError(Type type2, Class<?>... clsArr) {
        StringBuilder sb = new StringBuilder("Unexpected type. Expected one of: ");
        for (Class<?> name : clsArr) {
            sb.append(name.getName());
            sb.append(Objects.ARRAY_ELEMENT_SEPARATOR);
        }
        sb.append("but got: ");
        sb.append(type2.getClass().getName());
        sb.append(", for type token: ");
        sb.append(type2.toString());
        sb.append('.');
        return new AssertionError(sb.toString());
    }

    public static <T> C4396a<T> get(Class<T> cls) {
        return new C4396a<>(cls);
    }

    public static C4396a<?> get(Type type2) {
        return new C4396a<>(type2);
    }

    public static C4396a<?> getArray(Type type2) {
        return new C4396a<>(new C4351a(type2));
    }

    public static C4396a<?> getParameterized(Type type2, Type... typeArr) {
        return new C4396a<>(new C4352b(null, type2, typeArr));
    }

    public static Type getSuperclassTypeParameter(Class<?> cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            return C4350a.m9860a(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        }
        throw new RuntimeException("Missing type parameter.");
    }

    public static boolean isAssignableFrom(Type type2, GenericArrayType genericArrayType) {
        Type genericComponentType = genericArrayType.getGenericComponentType();
        if (!(genericComponentType instanceof ParameterizedType)) {
            return true;
        }
        if (type2 instanceof GenericArrayType) {
            type2 = ((GenericArrayType) type2).getGenericComponentType();
        } else if (type2 instanceof Class) {
            r1 = (Class) type2;
            while (r1.isArray()) {
                r1 = r1.getComponentType();
            }
            type2 = r1;
        }
        return isAssignableFrom(type2, (ParameterizedType) genericComponentType, new HashMap());
    }

    public static boolean isAssignableFrom(Type type2, ParameterizedType parameterizedType, Map<String, Type> map) {
        if (type2 == null) {
            return false;
        }
        if (parameterizedType.equals(type2)) {
            return true;
        }
        Class c = C4350a.m9867c(type2);
        ParameterizedType parameterizedType2 = null;
        if (type2 instanceof ParameterizedType) {
            parameterizedType2 = (ParameterizedType) type2;
        }
        if (parameterizedType2 != null) {
            Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
            TypeVariable[] typeParameters = c.getTypeParameters();
            for (int i = 0; i < actualTypeArguments.length; i++) {
                Type type3 = actualTypeArguments[i];
                TypeVariable typeVariable = typeParameters[i];
                while (type3 instanceof TypeVariable) {
                    type3 = (Type) map.get(((TypeVariable) type3).getName());
                }
                map.put(typeVariable.getName(), type3);
            }
            if (typeEquals(parameterizedType2, parameterizedType, map)) {
                return true;
            }
        }
        for (Type isAssignableFrom : c.getGenericInterfaces()) {
            if (isAssignableFrom(isAssignableFrom, parameterizedType, new HashMap(map))) {
                return true;
            }
        }
        return isAssignableFrom(c.getGenericSuperclass(), parameterizedType, new HashMap(map));
    }

    public static boolean matches(Type type2, Type type3, Map<String, Type> map) {
        return type3.equals(type2) || ((type2 instanceof TypeVariable) && type3.equals(map.get(((TypeVariable) type2).getName())));
    }

    public static boolean typeEquals(ParameterizedType parameterizedType, ParameterizedType parameterizedType2, Map<String, Type> map) {
        if (!parameterizedType.getRawType().equals(parameterizedType2.getRawType())) {
            return false;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
        for (int i = 0; i < actualTypeArguments.length; i++) {
            if (!matches(actualTypeArguments[i], actualTypeArguments2[i], map)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C4396a) && C4350a.m9864a(this.type, ((C4396a) obj).type);
    }

    public final Class<? super T> getRawType() {
        return this.rawType;
    }

    public final Type getType() {
        return this.type;
    }

    public final int hashCode() {
        return this.hashCode;
    }

    @Deprecated
    public boolean isAssignableFrom(Class<?> cls) {
        return isAssignableFrom((Type) cls);
    }

    @Deprecated
    public boolean isAssignableFrom(Type type2) {
        boolean z = false;
        if (type2 == null) {
            return false;
        }
        if (this.type.equals(type2)) {
            return true;
        }
        Type type3 = this.type;
        if (type3 instanceof Class) {
            return this.rawType.isAssignableFrom(C4350a.m9867c(type2));
        }
        if (type3 instanceof ParameterizedType) {
            return isAssignableFrom(type2, (ParameterizedType) type3, new HashMap());
        }
        if (type3 instanceof GenericArrayType) {
            if (this.rawType.isAssignableFrom(C4350a.m9867c(type2)) && isAssignableFrom(type2, (GenericArrayType) this.type)) {
                z = true;
            }
            return z;
        }
        throw buildUnexpectedTypeError(type3, Class.class, ParameterizedType.class, GenericArrayType.class);
    }

    @Deprecated
    public boolean isAssignableFrom(C4396a<?> aVar) {
        return isAssignableFrom(aVar.getType());
    }

    public final String toString() {
        return C4350a.m9868d(this.type);
    }
}
