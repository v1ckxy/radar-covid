package com.google.gson.internal.bind;

import com.google.gson.Gson;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import p213q.p217b.p355e.C4344s;
import p213q.p217b.p355e.C4345t;
import p213q.p217b.p355e.p357v.C4350a;
import p213q.p217b.p355e.p361w.C4396a;
import p213q.p217b.p355e.p362x.C4397a;
import p213q.p217b.p355e.p362x.C4399b;
import p213q.p217b.p355e.p362x.C4400c;

public final class ArrayTypeAdapter<E> extends C4344s<Object> {

    /* renamed from: c */
    public static final C4345t f1582c = new C4345t() {
        /* renamed from: a */
        public <T> C4344s<T> mo3085a(Gson gson, C4396a<T> aVar) {
            Type type = aVar.getType();
            boolean z = type instanceof GenericArrayType;
            if (!z && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type genericComponentType = z ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
            return new ArrayTypeAdapter(gson, gson.mo3080a(C4396a.get(genericComponentType)), C4350a.m9867c(genericComponentType));
        }
    };

    /* renamed from: a */
    public final Class<E> f1583a;

    /* renamed from: b */
    public final C4344s<E> f1584b;

    public ArrayTypeAdapter(Gson gson, C4344s<E> sVar, Class<E> cls) {
        this.f1584b = new TypeAdapterRuntimeTypeWrapper(gson, sVar, cls);
        this.f1583a = cls;
    }

    /* renamed from: a */
    public Object mo3072a(C4397a aVar) {
        if (aVar.peek() == C4399b.NULL) {
            aVar.mo10644y();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.mo10628a();
        while (aVar.mo10637r()) {
            arrayList.add(this.f1584b.mo3072a(aVar));
        }
        aVar.mo10633k();
        int size = arrayList.size();
        Object newInstance = Array.newInstance(this.f1583a, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    /* renamed from: a */
    public void mo3073a(C4400c cVar, Object obj) {
        if (obj == null) {
            cVar.mo10661o();
            return;
        }
        cVar.mo10656f();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f1584b.mo3073a(cVar, Array.get(obj, i));
        }
        cVar.mo10659h();
    }
}
