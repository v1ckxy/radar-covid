package p484y;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import p410v.C4690b0;
import p410v.C4690b0.C4691a;
import p410v.C4708f.C4709a;
import p410v.C4716h0;
import p410v.C4725j0;
import p410v.C4873x;
import p484y.C5256c.C5260d;
import p484y.C5268e.C5269a;
import p484y.C5280h.C5281a;

/* renamed from: y.d0 */
public final class C5265d0 {

    /* renamed from: a */
    public final Map<Method, C5270e0<?>> f12552a = new ConcurrentHashMap();

    /* renamed from: b */
    public final C4709a f12553b;

    /* renamed from: c */
    public final C4873x f12554c;

    /* renamed from: d */
    public final List<C5281a> f12555d;

    /* renamed from: e */
    public final List<C5269a> f12556e;

    /* renamed from: f */
    public final boolean f12557f;

    /* renamed from: y.d0$a */
    public class C5266a implements InvocationHandler {

        /* renamed from: a */
        public final C5359z f12558a = C5359z.f12681c;

        /* renamed from: b */
        public final Object[] f12559b = new Object[0];

        /* renamed from: c */
        public final /* synthetic */ Class f12560c;

        public C5266a(Class cls) {
            this.f12560c = cls;
        }

        @Nullable
        public Object invoke(Object obj, Method method, @Nullable Object[] objArr) {
            Object obj2;
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.f12559b;
            }
            if (this.f12558a.f12682a && method.isDefault()) {
                obj2 = this.f12558a.mo12060a(method, this.f12560c, obj, objArr);
            } else {
                C5325k kVar = (C5325k) C5265d0.this.mo11994a(method);
                obj2 = kVar.mo12052a(new C5338u(kVar.f12606a, objArr, kVar.f12607b, kVar.f12608c), objArr);
            }
            return obj2;
        }
    }

    /* renamed from: y.d0$b */
    public static final class C5267b {

        /* renamed from: a */
        public final C5359z f12562a;
        @Nullable

        /* renamed from: b */
        public C4709a f12563b;
        @Nullable

        /* renamed from: c */
        public C4873x f12564c;

        /* renamed from: d */
        public final List<C5281a> f12565d = new ArrayList();

        /* renamed from: e */
        public final List<C5269a> f12566e = new ArrayList();

        public C5267b() {
            C5359z zVar = C5359z.f12681c;
            this.f12562a = zVar;
        }

        /* renamed from: a */
        public C5267b mo12000a(String str) {
            String str2 = "baseUrl == null";
            Objects.requireNonNull(str, str2);
            C4873x b = C4873x.f11615l.mo11409b(str);
            Objects.requireNonNull(b, str2);
            List<String> list = b.f11622g;
            if (p116io.jsonwebtoken.lang.Objects.EMPTY_STRING.equals(list.get(list.size() - 1))) {
                this.f12564c = b;
                return this;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("baseUrl must end in /: ");
            sb.append(b);
            throw new IllegalArgumentException(sb.toString());
        }

        /* renamed from: a */
        public C5265d0 mo12002a() {
            if (this.f12564c != null) {
                C4709a aVar = this.f12563b;
                if (aVar == null) {
                    aVar = new C4690b0(new C4691a());
                }
                C4709a aVar2 = aVar;
                Executor a = this.f12562a.mo12061a();
                ArrayList arrayList = new ArrayList(this.f12566e);
                C5359z zVar = this.f12562a;
                if (zVar != null) {
                    C5286i iVar = new C5286i(a);
                    arrayList.addAll(zVar.f12682a ? Arrays.asList(new C5269a[]{C5273g.f12567a, iVar}) : Collections.singletonList(iVar));
                    ArrayList arrayList2 = new ArrayList(this.f12565d.size() + 1 + (this.f12562a.f12682a ? 1 : 0));
                    arrayList2.add(new C5256c());
                    arrayList2.addAll(this.f12565d);
                    arrayList2.addAll(this.f12562a.f12682a ? Collections.singletonList(C5343v.f12642a) : Collections.emptyList());
                    C5265d0 d0Var = new C5265d0(aVar2, this.f12564c, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), a, false);
                    return d0Var;
                }
                throw null;
            }
            throw new IllegalStateException("Base URL required.");
        }

        /* renamed from: a */
        public C5267b mo12001a(C4690b0 b0Var) {
            this.f12563b = (C4709a) Objects.requireNonNull((C4709a) Objects.requireNonNull(b0Var, "client == null"), "factory == null");
            return this;
        }
    }

    public C5265d0(C4709a aVar, C4873x xVar, List<C5281a> list, List<C5269a> list2, @Nullable Executor executor, boolean z) {
        this.f12553b = aVar;
        this.f12554c = xVar;
        this.f12555d = list;
        this.f12556e = list2;
        this.f12557f = z;
    }

    /* renamed from: a */
    public C5270e0<?> mo11994a(Method method) {
        C5270e0<?> e0Var;
        C5270e0<?> e0Var2 = (C5270e0) this.f12552a.get(method);
        if (e0Var2 != null) {
            return e0Var2;
        }
        synchronized (this.f12552a) {
            e0Var = (C5270e0) this.f12552a.get(method);
            if (e0Var == null) {
                e0Var = C5270e0.m11739a(this, method);
                this.f12552a.put(method, e0Var);
            }
        }
        return e0Var;
    }

    /* renamed from: a */
    public C5268e<?, ?> mo11995a(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f12556e.indexOf(null) + 1;
        int size = this.f12556e.size();
        for (int i = indexOf; i < size; i++) {
            C5268e<?, ?> a = ((C5269a) this.f12556e.get(i)).mo12005a(type, annotationArr, this);
            if (a != null) {
                return a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.f12556e.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(((C5269a) this.f12556e.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public <T> C5280h<C4725j0, T> mo11997b(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f12555d.indexOf(null) + 1;
        int size = this.f12555d.size();
        for (int i = indexOf; i < size; i++) {
            C5280h<C4725j0, T> a = ((C5281a) this.f12555d.get(i)).mo11982a(type, annotationArr, this);
            if (a != null) {
                return a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.f12555d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(((C5281a) this.f12555d.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: c */
    public <T> C5280h<T, String> mo11998c(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.f12555d.size();
        int i = 0;
        while (i < size) {
            if (((C5281a) this.f12555d.get(i)) != null) {
                i++;
            } else {
                throw null;
            }
        }
        return C5260d.f12546a;
    }

    /* renamed from: a */
    public <T> T mo11993a(Class<T> cls) {
        Method[] declaredMethods;
        if (cls.isInterface()) {
            ArrayDeque arrayDeque = new ArrayDeque(1);
            arrayDeque.add(cls);
            while (!arrayDeque.isEmpty()) {
                Class<T> cls2 = (Class) arrayDeque.removeFirst();
                if (cls2.getTypeParameters().length != 0) {
                    StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                    sb.append(cls2.getName());
                    if (cls2 != cls) {
                        sb.append(" which is an interface of ");
                        sb.append(cls.getName());
                    }
                    throw new IllegalArgumentException(sb.toString());
                }
                Collections.addAll(arrayDeque, cls2.getInterfaces());
            }
            if (this.f12557f) {
                C5359z zVar = C5359z.f12681c;
                for (Method method : cls.getDeclaredMethods()) {
                    if (!(zVar.f12682a && method.isDefault()) && !Modifier.isStatic(method.getModifiers())) {
                        mo11994a(method);
                    }
                }
            }
            return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C5266a(cls));
        }
        throw new IllegalArgumentException("API declarations must be interfaces.");
    }

    /* renamed from: a */
    public <T> C5280h<T, C4716h0> mo11996a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int indexOf = this.f12555d.indexOf(null) + 1;
        int size = this.f12555d.size();
        for (int i = indexOf; i < size; i++) {
            C5280h<T, C4716h0> a = ((C5281a) this.f12555d.get(i)).mo11983a(type, annotationArr, annotationArr2, this);
            if (a != null) {
                return a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.f12555d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(((C5281a) this.f12555d.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }
}
