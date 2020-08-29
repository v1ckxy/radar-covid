package p213q.p217b.p355e.p357v;

import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import p213q.p217b.p355e.C4328e;
import p213q.p217b.p355e.p357v.p358a0.C4355b;
import p213q.p217b.p355e.p361w.C4396a;

/* renamed from: q.b.e.v.g */
public final class C4362g {

    /* renamed from: a */
    public final Map<Type, C4328e<?>> f10403a;

    /* renamed from: b */
    public final C4355b f10404b = C4355b.f10396a;

    /* renamed from: q.b.e.v.g$a */
    public class C4363a implements C4383s<T> {

        /* renamed from: a */
        public final /* synthetic */ C4328e f10405a;

        /* renamed from: b */
        public final /* synthetic */ Type f10406b;

        public C4363a(C4362g gVar, C4328e eVar, Type type) {
            this.f10405a = eVar;
            this.f10406b = type;
        }

        /* renamed from: a */
        public T mo10576a() {
            return this.f10405a.mo10536a(this.f10406b);
        }
    }

    /* renamed from: q.b.e.v.g$b */
    public class C4364b implements C4383s<T> {

        /* renamed from: a */
        public final /* synthetic */ C4328e f10407a;

        /* renamed from: b */
        public final /* synthetic */ Type f10408b;

        public C4364b(C4362g gVar, C4328e eVar, Type type) {
            this.f10407a = eVar;
            this.f10408b = type;
        }

        /* renamed from: a */
        public T mo10576a() {
            return this.f10407a.mo10536a(this.f10408b);
        }
    }

    public C4362g(Map<Type, C4328e<?>> map) {
        this.f10403a = map;
    }

    /* renamed from: a */
    public <T> C4383s<T> mo10577a(C4396a<T> aVar) {
        C4383s<T> sVar;
        Type type = aVar.getType();
        Class rawType = aVar.getRawType();
        C4328e eVar = (C4328e) this.f10403a.get(type);
        if (eVar != null) {
            return new C4363a(this, eVar, type);
        }
        C4328e eVar2 = (C4328e) this.f10403a.get(rawType);
        if (eVar2 != null) {
            return new C4364b(this, eVar2, type);
        }
        C4383s<T> sVar2 = null;
        try {
            Constructor declaredConstructor = rawType.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f10404b.mo10575a(declaredConstructor);
            }
            sVar = new C4365h<>(this, declaredConstructor);
        } catch (NoSuchMethodException unused) {
            sVar = null;
        }
        if (sVar != null) {
            return sVar;
        }
        if (Collection.class.isAssignableFrom(rawType)) {
            sVar2 = SortedSet.class.isAssignableFrom(rawType) ? new C4366i<>(this) : EnumSet.class.isAssignableFrom(rawType) ? new C4367j<>(this, type) : Set.class.isAssignableFrom(rawType) ? new C4368k<>(this) : Queue.class.isAssignableFrom(rawType) ? new C4369l<>(this) : new C4370m<>(this);
        } else if (Map.class.isAssignableFrom(rawType)) {
            sVar2 = ConcurrentNavigableMap.class.isAssignableFrom(rawType) ? new C4371n<>(this) : ConcurrentMap.class.isAssignableFrom(rawType) ? new C4357b<>(this) : SortedMap.class.isAssignableFrom(rawType) ? new C4358c<>(this) : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(C4396a.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType())) ? new C4360e<>(this) : new C4359d<>(this);
        }
        if (sVar2 != null) {
            return sVar2;
        }
        return new C4361f(this, rawType, type);
    }

    public String toString() {
        return this.f10403a.toString();
    }
}
