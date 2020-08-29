package com.google.gson.internal.bind;

import com.google.gson.Gson;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p355e.C4329f;
import p213q.p217b.p355e.C4332i;
import p213q.p217b.p355e.C4333j;
import p213q.p217b.p355e.C4334k;
import p213q.p217b.p355e.C4335l;
import p213q.p217b.p355e.C4337n;
import p213q.p217b.p355e.C4340q;
import p213q.p217b.p355e.C4344s;
import p213q.p217b.p355e.C4345t;
import p213q.p217b.p355e.p357v.C4350a;
import p213q.p217b.p355e.p357v.C4362g;
import p213q.p217b.p355e.p357v.C4373p;
import p213q.p217b.p355e.p357v.C4383s;
import p213q.p217b.p355e.p357v.p359z.C4390a;
import p213q.p217b.p355e.p357v.p359z.C4392b;
import p213q.p217b.p355e.p361w.C4396a;
import p213q.p217b.p355e.p362x.C4397a;
import p213q.p217b.p355e.p362x.C4397a.C4398a;
import p213q.p217b.p355e.p362x.C4399b;
import p213q.p217b.p355e.p362x.C4400c;

public final class MapTypeAdapterFactory implements C4345t {

    /* renamed from: e */
    public final C4362g f1591e;

    /* renamed from: f */
    public final boolean f1592f;

    public final class Adapter<K, V> extends C4344s<Map<K, V>> {

        /* renamed from: a */
        public final C4344s<K> f1593a;

        /* renamed from: b */
        public final C4344s<V> f1594b;

        /* renamed from: c */
        public final C4383s<? extends Map<K, V>> f1595c;

        public Adapter(Gson gson, Type type, C4344s<K> sVar, Type type2, C4344s<V> sVar2, C4383s<? extends Map<K, V>> sVar3) {
            this.f1593a = new TypeAdapterRuntimeTypeWrapper(gson, sVar, type);
            this.f1594b = new TypeAdapterRuntimeTypeWrapper(gson, sVar2, type2);
            this.f1595c = sVar3;
        }

        /* renamed from: a */
        public Object mo3072a(C4397a aVar) {
            int i;
            C4399b peek = aVar.peek();
            if (peek == C4399b.NULL) {
                aVar.mo10644y();
                return null;
            }
            Map map = (Map) this.f1595c.mo10576a();
            String str = "duplicate key: ";
            if (peek == C4399b.BEGIN_ARRAY) {
                aVar.mo10628a();
                while (aVar.mo10637r()) {
                    aVar.mo10628a();
                    Object a = this.f1593a.mo3072a(aVar);
                    if (map.put(a, this.f1594b.mo3072a(aVar)) == null) {
                        aVar.mo10633k();
                    } else {
                        throw new C4340q(C1965a.m4750a(str, a));
                    }
                }
                aVar.mo10633k();
            } else {
                aVar.mo10632f();
                while (aVar.mo10637r()) {
                    if (((C4398a) C4373p.f10412a) != null) {
                        if (aVar instanceof C4390a) {
                            C4390a aVar2 = (C4390a) aVar;
                            aVar2.mo10630a(C4399b.NAME);
                            Entry entry = (Entry) ((Iterator) aVar2.mo10626E()).next();
                            aVar2.mo10629a(entry.getValue());
                            aVar2.mo10629a((Object) new C4337n((String) entry.getKey()));
                        } else {
                            int i2 = aVar.f10467l;
                            if (i2 == 0) {
                                i2 = aVar.mo10685h();
                            }
                            if (i2 == 13) {
                                i = 9;
                            } else if (i2 == 12) {
                                i = 8;
                            } else if (i2 == 14) {
                                i = 10;
                            } else {
                                StringBuilder a2 = C1965a.m4756a("Expected a name but was ");
                                a2.append(aVar.peek());
                                a2.append(aVar.mo10686s());
                                throw new IllegalStateException(a2.toString());
                            }
                            aVar.f10467l = i;
                        }
                        Object a3 = this.f1593a.mo3072a(aVar);
                        if (map.put(a3, this.f1594b.mo3072a(aVar)) != null) {
                            throw new C4340q(C1965a.m4750a(str, a3));
                        }
                    } else {
                        throw null;
                    }
                }
                aVar.mo10634m();
            }
            return map;
        }

        /* renamed from: a */
        public void mo3073a(C4400c cVar, Object obj) {
            String str;
            Map map = (Map) obj;
            if (map == null) {
                cVar.mo10661o();
                return;
            }
            if (!MapTypeAdapterFactory.this.f1592f) {
                cVar.mo10658g();
                for (Entry entry : map.entrySet()) {
                    cVar.mo10652b(String.valueOf(entry.getKey()));
                    this.f1594b.mo3073a(cVar, entry.getValue());
                }
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i = 0;
                boolean z = false;
                for (Entry entry2 : map.entrySet()) {
                    C4344s<K> sVar = this.f1593a;
                    Object key = entry2.getKey();
                    if (sVar != null) {
                        try {
                            C4392b bVar = new C4392b();
                            sVar.mo3073a(bVar, key);
                            if (bVar.f10449p.isEmpty()) {
                                C4332i iVar = bVar.f10451r;
                                arrayList.add(iVar);
                                arrayList2.add(entry2.getValue());
                                if (iVar != null) {
                                    z |= (iVar instanceof C4329f) || (iVar instanceof C4335l);
                                } else {
                                    throw null;
                                }
                            } else {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Expected one JSON element but was ");
                                sb.append(bVar.f10449p);
                                throw new IllegalStateException(sb.toString());
                            }
                        } catch (IOException e) {
                            throw new C4333j((Throwable) e);
                        }
                    } else {
                        throw null;
                    }
                }
                if (z) {
                    cVar.mo10656f();
                    int size = arrayList.size();
                    while (i < size) {
                        cVar.mo10656f();
                        TypeAdapters.f1646X.mo3073a(cVar, (C4332i) arrayList.get(i));
                        this.f1594b.mo3073a(cVar, arrayList2.get(i));
                        cVar.mo10659h();
                        i++;
                    }
                    cVar.mo10659h();
                    return;
                }
                cVar.mo10658g();
                int size2 = arrayList.size();
                while (i < size2) {
                    C4332i iVar2 = (C4332i) arrayList.get(i);
                    if (iVar2 != null) {
                        if (iVar2 instanceof C4337n) {
                            C4337n c = iVar2.mo10541c();
                            Object obj2 = c.f10385a;
                            if (obj2 instanceof Number) {
                                str = String.valueOf(c.mo10550g());
                            } else if (obj2 instanceof Boolean) {
                                str = Boolean.toString(c.mo10549f());
                            } else if (obj2 instanceof String) {
                                str = c.mo10551h();
                            } else {
                                throw new AssertionError();
                            }
                        } else if (iVar2 instanceof C4334k) {
                            str = Objects.NULL_STRING;
                        } else {
                            throw new AssertionError();
                        }
                        cVar.mo10652b(str);
                        this.f1594b.mo3073a(cVar, arrayList2.get(i));
                        i++;
                    } else {
                        throw null;
                    }
                }
            }
            cVar.mo10660k();
        }
    }

    public MapTypeAdapterFactory(C4362g gVar, boolean z) {
        this.f1591e = gVar;
        this.f1592f = z;
    }

    /* renamed from: a */
    public <T> C4344s<T> mo3085a(Gson gson, C4396a<T> aVar) {
        Type[] typeArr;
        Type type = aVar.getType();
        if (!Map.class.isAssignableFrom(aVar.getRawType())) {
            return null;
        }
        Class c = C4350a.m9867c(type);
        Class<Object> cls = Object.class;
        Class<String> cls2 = String.class;
        if (type == Properties.class) {
            typeArr = new Type[]{cls2, cls2};
        } else {
            Type b = C4350a.m9865b(type, c, Map.class);
            typeArr = b instanceof ParameterizedType ? ((ParameterizedType) b).getActualTypeArguments() : new Type[]{cls, cls};
        }
        Type type2 = typeArr[0];
        Adapter adapter = new Adapter(gson, typeArr[0], (type2 == Boolean.TYPE || type2 == Boolean.class) ? TypeAdapters.f1654f : gson.mo3080a(C4396a.get(type2)), typeArr[1], gson.mo3080a(C4396a.get(typeArr[1])), this.f1591e.mo10577a(aVar));
        return adapter;
    }
}
