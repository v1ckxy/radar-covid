package com.google.gson;

import p213q.p217b.p355e.C4344s;
import p213q.p217b.p355e.p362x.C4397a;
import p213q.p217b.p355e.p362x.C4399b;
import p213q.p217b.p355e.p362x.C4400c;

public class TypeAdapter$1 extends C4344s<T> {

    /* renamed from: a */
    public final /* synthetic */ C4344s f1569a;

    public TypeAdapter$1(C4344s sVar) {
        this.f1569a = sVar;
    }

    /* renamed from: a */
    public T mo3072a(C4397a aVar) {
        if (aVar.peek() != C4399b.NULL) {
            return this.f1569a.mo3072a(aVar);
        }
        aVar.mo10644y();
        return null;
    }

    /* renamed from: a */
    public void mo3073a(C4400c cVar, T t) {
        if (t == null) {
            cVar.mo10661o();
        } else {
            this.f1569a.mo3073a(cVar, t);
        }
    }
}
