package com.google.gson.internal.bind;

import com.google.gson.Gson;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import p213q.p217b.p355e.C4344s;
import p213q.p217b.p355e.C4345t;
import p213q.p217b.p355e.p357v.C4350a;
import p213q.p217b.p355e.p357v.C4362g;
import p213q.p217b.p355e.p357v.C4383s;
import p213q.p217b.p355e.p361w.C4396a;
import p213q.p217b.p355e.p362x.C4397a;
import p213q.p217b.p355e.p362x.C4399b;
import p213q.p217b.p355e.p362x.C4400c;

public final class CollectionTypeAdapterFactory implements C4345t {

    /* renamed from: e */
    public final C4362g f1585e;

    public static final class Adapter<E> extends C4344s<Collection<E>> {

        /* renamed from: a */
        public final C4344s<E> f1586a;

        /* renamed from: b */
        public final C4383s<? extends Collection<E>> f1587b;

        public Adapter(Gson gson, Type type, C4344s<E> sVar, C4383s<? extends Collection<E>> sVar2) {
            this.f1586a = new TypeAdapterRuntimeTypeWrapper(gson, sVar, type);
            this.f1587b = sVar2;
        }

        /* renamed from: a */
        public Object mo3072a(C4397a aVar) {
            if (aVar.peek() == C4399b.NULL) {
                aVar.mo10644y();
                return null;
            }
            Collection collection = (Collection) this.f1587b.mo10576a();
            aVar.mo10628a();
            while (aVar.mo10637r()) {
                collection.add(this.f1586a.mo3072a(aVar));
            }
            aVar.mo10633k();
            return collection;
        }

        /* renamed from: a */
        public void mo3073a(C4400c cVar, Object obj) {
            Collection<Object> collection = (Collection) obj;
            if (collection == null) {
                cVar.mo10661o();
                return;
            }
            cVar.mo10656f();
            for (Object a : collection) {
                this.f1586a.mo3073a(cVar, a);
            }
            cVar.mo10659h();
        }
    }

    public CollectionTypeAdapterFactory(C4362g gVar) {
        this.f1585e = gVar;
    }

    /* renamed from: a */
    public <T> C4344s<T> mo3085a(Gson gson, C4396a<T> aVar) {
        Type type = aVar.getType();
        Class rawType = aVar.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type b = C4350a.m9865b(type, rawType, Collection.class);
        if (b instanceof WildcardType) {
            b = ((WildcardType) b).getUpperBounds()[0];
        }
        Type type2 = b instanceof ParameterizedType ? ((ParameterizedType) b).getActualTypeArguments()[0] : Object.class;
        return new Adapter(gson, type2, gson.mo3080a(C4396a.get(type2)), this.f1585e.mo10577a(aVar));
    }
}
