package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import p213q.p217b.p355e.C4344s;
import p213q.p217b.p355e.p361w.C4396a;
import p213q.p217b.p355e.p362x.C4397a;
import p213q.p217b.p355e.p362x.C4400c;

public final class TypeAdapterRuntimeTypeWrapper<T> extends C4344s<T> {

    /* renamed from: a */
    public final Gson f1620a;

    /* renamed from: b */
    public final C4344s<T> f1621b;

    /* renamed from: c */
    public final Type f1622c;

    public TypeAdapterRuntimeTypeWrapper(Gson gson, C4344s<T> sVar, Type type) {
        this.f1620a = gson;
        this.f1621b = sVar;
        this.f1622c = type;
    }

    /* renamed from: a */
    public T mo3072a(C4397a aVar) {
        return this.f1621b.mo3072a(aVar);
    }

    /* renamed from: a */
    public void mo3073a(C4400c cVar, T t) {
        C4344s<T> sVar = this.f1621b;
        Type type = this.f1622c;
        if (t != null && (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class))) {
            type = t.getClass();
        }
        if (type != this.f1622c) {
            sVar = this.f1620a.mo3080a(C4396a.get(type));
            if (sVar instanceof Adapter) {
                C4344s<T> sVar2 = this.f1621b;
                if (!(sVar2 instanceof Adapter)) {
                    sVar = sVar2;
                }
            }
        }
        sVar.mo3073a(cVar, t);
    }
}
