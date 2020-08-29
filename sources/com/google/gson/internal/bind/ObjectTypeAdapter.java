package com.google.gson.internal.bind;

import com.google.gson.Gson;
import java.util.ArrayList;
import p213q.p217b.p355e.C4344s;
import p213q.p217b.p355e.C4345t;
import p213q.p217b.p355e.p357v.C4375r;
import p213q.p217b.p355e.p361w.C4396a;
import p213q.p217b.p355e.p362x.C4397a;
import p213q.p217b.p355e.p362x.C4400c;

public final class ObjectTypeAdapter extends C4344s<Object> {

    /* renamed from: b */
    public static final C4345t f1597b = new C4345t() {
        /* renamed from: a */
        public <T> C4344s<T> mo3085a(Gson gson, C4396a<T> aVar) {
            if (aVar.getRawType() == Object.class) {
                return new ObjectTypeAdapter(gson);
            }
            return null;
        }
    };

    /* renamed from: a */
    public final Gson f1598a;

    public ObjectTypeAdapter(Gson gson) {
        this.f1598a = gson;
    }

    /* renamed from: a */
    public Object mo3072a(C4397a aVar) {
        int ordinal = aVar.peek().ordinal();
        if (ordinal == 0) {
            ArrayList arrayList = new ArrayList();
            aVar.mo10628a();
            while (aVar.mo10637r()) {
                arrayList.add(mo3072a(aVar));
            }
            aVar.mo10633k();
            return arrayList;
        } else if (ordinal == 2) {
            C4375r rVar = new C4375r();
            aVar.mo10632f();
            while (aVar.mo10637r()) {
                rVar.put(aVar.mo10643x(), mo3072a(aVar));
            }
            aVar.mo10634m();
            return rVar;
        } else if (ordinal == 5) {
            return aVar.mo10645z();
        } else {
            if (ordinal == 6) {
                return Double.valueOf(aVar.mo10640u());
            }
            if (ordinal == 7) {
                return Boolean.valueOf(aVar.mo10638t());
            }
            if (ordinal == 8) {
                aVar.mo10644y();
                return null;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public void mo3073a(C4400c cVar, Object obj) {
        if (obj == null) {
            cVar.mo10661o();
            return;
        }
        Gson gson = this.f1598a;
        Class cls = obj.getClass();
        if (gson != null) {
            C4344s a = gson.mo3080a(C4396a.get(cls));
            if (a instanceof ObjectTypeAdapter) {
                cVar.mo10658g();
                cVar.mo10660k();
                return;
            }
            a.mo3073a(cVar, obj);
            return;
        }
        throw null;
    }
}
