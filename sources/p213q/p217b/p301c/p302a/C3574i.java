package p213q.p217b.p301c.p302a;

import com.google.crypto.tink.proto.KeyData.KeyMaterialType;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3635j;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3706s0;

/* renamed from: q.b.c.a.i */
public abstract class C3574i<KeyProtoT extends C3706s0> {

    /* renamed from: a */
    public final Class<KeyProtoT> f8958a;

    /* renamed from: b */
    public final Map<Class<?>, C3576b<?, KeyProtoT>> f8959b;

    /* renamed from: c */
    public final Class<?> f8960c;

    /* renamed from: q.b.c.a.i$a */
    public static abstract class C3575a<KeyFormatProtoT extends C3706s0, KeyT> {

        /* renamed from: a */
        public final Class<KeyFormatProtoT> f8961a;

        public C3575a(Class<KeyFormatProtoT> cls) {
            this.f8961a = cls;
        }

        /* renamed from: a */
        public abstract KeyT mo9465a(KeyFormatProtoT keyformatprotot);

        /* renamed from: a */
        public abstract KeyFormatProtoT mo9466a(C3635j jVar);

        /* renamed from: b */
        public abstract void mo9467b(KeyFormatProtoT keyformatprotot);
    }

    /* renamed from: q.b.c.a.i$b */
    public static abstract class C3576b<PrimitiveT, KeyT> {

        /* renamed from: a */
        public final Class<PrimitiveT> f8962a;

        public C3576b(Class<PrimitiveT> cls) {
            this.f8962a = cls;
        }

        /* renamed from: a */
        public abstract PrimitiveT mo9464a(KeyT keyt);
    }

    @SafeVarargs
    public C3574i(Class<KeyProtoT> cls, C3576b<?, KeyProtoT>... bVarArr) {
        Class cls2;
        this.f8958a = cls;
        HashMap hashMap = new HashMap();
        int length = bVarArr.length;
        int i = 0;
        while (i < length) {
            C3576b<?, KeyProtoT> bVar = bVarArr[i];
            if (!hashMap.containsKey(bVar.f8962a)) {
                hashMap.put(bVar.f8962a, bVar);
                i++;
            } else {
                StringBuilder a = C1965a.m4756a("KeyTypeManager constructed with duplicate factories for primitive ");
                a.append(bVar.f8962a.getCanonicalName());
                throw new IllegalArgumentException(a.toString());
            }
        }
        if (bVarArr.length > 0) {
            cls2 = bVarArr[0].f8962a;
        } else {
            cls2 = Void.class;
        }
        this.f8960c = cls2;
        this.f8959b = Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    public final <P> P mo9479a(KeyProtoT keyprotot, Class<P> cls) {
        C3576b bVar = (C3576b) this.f8959b.get(cls);
        if (bVar != null) {
            return bVar.mo9464a(keyprotot);
        }
        StringBuilder a = C1965a.m4756a("Requested primitive class ");
        a.append(cls.getCanonicalName());
        a.append(" not supported.");
        throw new IllegalArgumentException(a.toString());
    }

    /* renamed from: a */
    public abstract String mo9459a();

    /* renamed from: a */
    public abstract KeyProtoT mo9460a(C3635j jVar);

    /* renamed from: a */
    public abstract void mo9461a(KeyProtoT keyprotot);

    /* renamed from: b */
    public C3575a<?, KeyProtoT> mo9462b() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    /* renamed from: c */
    public abstract KeyMaterialType mo9463c();

    /* renamed from: d */
    public final Set<Class<?>> mo9480d() {
        return this.f8959b.keySet();
    }
}
