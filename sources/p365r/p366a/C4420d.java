package p365r.p366a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p365r.p366a.C4416a.C4417a;
import p390t.p391a.C4547a;

/* renamed from: r.a.d */
public final class C4420d<T> implements C4416a<T> {

    /* renamed from: a */
    public final Map<String, C4547a<C4417a<?>>> f10522a;

    /* renamed from: r.a.d$a */
    public static final class C4421a extends RuntimeException {
        public C4421a(String str, ClassCastException classCastException) {
            super(str, classCastException);
        }
    }

    public C4420d(Map<Class<?>, C4547a<C4417a<?>>> map, Map<String, C4547a<C4417a<?>>> map2) {
        if (!map.isEmpty()) {
            LinkedHashMap e = C2286e.m5331e(map2.size() + map.size());
            e.putAll(map2);
            for (Entry entry : map.entrySet()) {
                e.put(((Class) entry.getKey()).getName(), entry.getValue());
            }
            map2 = Collections.unmodifiableMap(e);
        }
        this.f10522a = map2;
    }

    /* renamed from: a */
    public void mo3887a(T t) {
        boolean z;
        String str;
        C4547a aVar = (C4547a) this.f10522a.get(t.getClass().getName());
        if (aVar == null) {
            z = false;
        } else {
            C4417a aVar2 = (C4417a) aVar.get();
            try {
                C4416a a = aVar2.mo3888a(t);
                C2286e.m5182a(a, "%s.create(I) should not return null.", (Object) aVar2.getClass());
                a.mo3887a(t);
                z = true;
            } catch (ClassCastException e) {
                throw new C4421a(String.format("%s does not implement AndroidInjector.Factory<%s>", new Object[]{aVar2.getClass().getCanonicalName(), t.getClass().getCanonicalName()}), e);
            }
        }
        if (!z) {
            ArrayList arrayList = new ArrayList();
            for (Class cls = t.getClass(); cls != null; cls = cls.getSuperclass()) {
                if (this.f10522a.containsKey(cls.getCanonicalName())) {
                    arrayList.add(cls.getCanonicalName());
                }
            }
            if (arrayList.isEmpty()) {
                str = String.format("No injector factory bound for Class<%s>", new Object[]{t.getClass().getCanonicalName()});
            } else {
                str = String.format("No injector factory bound for Class<%1$s>. Injector factories were bound for supertypes of %1$s: %2$s. Did you mean to bind an injector factory for the subtype?", new Object[]{t.getClass().getCanonicalName(), arrayList});
            }
            throw new IllegalArgumentException(str);
        }
    }
}
