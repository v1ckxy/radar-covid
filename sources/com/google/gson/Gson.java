package com.google.gson;

import com.google.gson.Gson;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.SqlDateTypeAdapter;
import com.google.gson.internal.bind.TimeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p355e.C4320c;
import p213q.p217b.p355e.C4332i;
import p213q.p217b.p355e.C4333j;
import p213q.p217b.p355e.C4334k;
import p213q.p217b.p355e.C4340q;
import p213q.p217b.p355e.C4341r;
import p213q.p217b.p355e.C4344s;
import p213q.p217b.p355e.C4345t;
import p213q.p217b.p355e.p357v.C4362g;
import p213q.p217b.p355e.p357v.C4384t;
import p213q.p217b.p355e.p361w.C4396a;
import p213q.p217b.p355e.p362x.C4397a;
import p213q.p217b.p355e.p362x.C4399b;
import p213q.p217b.p355e.p362x.C4400c;
import p213q.p217b.p355e.p362x.C4401d;

public final class Gson {

    /* renamed from: k */
    public static final C4396a<?> f1555k = C4396a.get(Object.class);

    /* renamed from: a */
    public final ThreadLocal<Map<C4396a<?>, FutureTypeAdapter<?>>> f1556a = new ThreadLocal<>();

    /* renamed from: b */
    public final Map<C4396a<?>, C4344s<?>> f1557b = new ConcurrentHashMap();

    /* renamed from: c */
    public final C4362g f1558c;

    /* renamed from: d */
    public final JsonAdapterAnnotationTypeAdapterFactory f1559d;

    /* renamed from: e */
    public final List<C4345t> f1560e;

    /* renamed from: f */
    public final boolean f1561f;

    /* renamed from: g */
    public final boolean f1562g;

    /* renamed from: h */
    public final boolean f1563h;

    /* renamed from: i */
    public final boolean f1564i;

    /* renamed from: j */
    public final boolean f1565j;

    public static class FutureTypeAdapter<T> extends C4344s<T> {

        /* renamed from: a */
        public C4344s<T> f1568a;

        /* renamed from: a */
        public T mo3072a(C4397a aVar) {
            C4344s<T> sVar = this.f1568a;
            if (sVar != null) {
                return sVar.mo3072a(aVar);
            }
            throw new IllegalStateException();
        }

        /* renamed from: a */
        public void mo3073a(C4400c cVar, T t) {
            C4344s<T> sVar = this.f1568a;
            if (sVar != null) {
                sVar.mo3073a(cVar, t);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public Gson() {
        Excluder excluder = Excluder.f1570j;
        C4320c cVar = C4320c.IDENTITY;
        Map emptyMap = Collections.emptyMap();
        C4341r rVar = C4341r.DEFAULT;
        Collections.emptyList();
        Collections.emptyList();
        List emptyList = Collections.emptyList();
        this.f1558c = new C4362g(emptyMap);
        this.f1561f = false;
        this.f1562g = false;
        this.f1563h = true;
        this.f1564i = false;
        this.f1565j = false;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.f1647Y);
        arrayList.add(ObjectTypeAdapter.f1597b);
        arrayList.add(excluder);
        arrayList.addAll(emptyList);
        arrayList.add(TypeAdapters.f1626D);
        arrayList.add(TypeAdapters.f1661m);
        arrayList.add(TypeAdapters.f1655g);
        arrayList.add(TypeAdapters.f1657i);
        arrayList.add(TypeAdapters.f1659k);
        final C4344s r3 = rVar == C4341r.DEFAULT ? TypeAdapters.f1668t : new C4344s<Number>() {
            /* renamed from: a */
            public Object mo3072a(C4397a aVar) {
                if (aVar.peek() != C4399b.NULL) {
                    return Long.valueOf(aVar.mo10642w());
                }
                aVar.mo10644y();
                return null;
            }

            /* renamed from: a */
            public void mo3073a(C4400c cVar, Object obj) {
                Number number = (Number) obj;
                if (number == null) {
                    cVar.mo10661o();
                } else {
                    cVar.mo10655d(number.toString());
                }
            }
        };
        arrayList.add(new C4345t(Long.TYPE, Long.class, r3) {
            /* renamed from: a */
            public <T> C4344s<T> mo3085a(Gson gson, C4396a<T> aVar) {
                Class rawType = aVar.getRawType();
                if (rawType == r0 || rawType == r1) {
                    return r2;
                }
                return null;
            }

            public String toString() {
                StringBuilder a = C1965a.m4756a("Factory[type=");
                a.append(r1.getName());
                a.append("+");
                a.append(r0.getName());
                a.append(",adapter=");
                a.append(r2);
                a.append("]");
                return a.toString();
            }
        });
        arrayList.add(new C4345t(Double.TYPE, Double.class, new C4344s<Number>(this) {
            /* renamed from: a */
            public Object mo3072a(C4397a aVar) {
                if (aVar.peek() != C4399b.NULL) {
                    return Double.valueOf(aVar.mo10640u());
                }
                aVar.mo10644y();
                return null;
            }

            /* renamed from: a */
            public void mo3073a(C4400c cVar, Object obj) {
                Number number = (Number) obj;
                if (number == null) {
                    cVar.mo10661o();
                    return;
                }
                Gson.m1158a(number.doubleValue());
                cVar.mo10649a(number);
            }
        }) {
            /* renamed from: a */
            public <T> C4344s<T> mo3085a(Gson gson, C4396a<T> aVar) {
                Class rawType = aVar.getRawType();
                if (rawType == r0 || rawType == r1) {
                    return r2;
                }
                return null;
            }

            public String toString() {
                StringBuilder a = C1965a.m4756a("Factory[type=");
                a.append(r1.getName());
                a.append("+");
                a.append(r0.getName());
                a.append(",adapter=");
                a.append(r2);
                a.append("]");
                return a.toString();
            }
        });
        arrayList.add(new C4345t(Float.TYPE, Float.class, new C4344s<Number>(this) {
            /* renamed from: a */
            public Object mo3072a(C4397a aVar) {
                if (aVar.peek() != C4399b.NULL) {
                    return Float.valueOf((float) aVar.mo10640u());
                }
                aVar.mo10644y();
                return null;
            }

            /* renamed from: a */
            public void mo3073a(C4400c cVar, Object obj) {
                Number number = (Number) obj;
                if (number == null) {
                    cVar.mo10661o();
                    return;
                }
                Gson.m1158a((double) number.floatValue());
                cVar.mo10649a(number);
            }
        }) {
            /* renamed from: a */
            public <T> C4344s<T> mo3085a(Gson gson, C4396a<T> aVar) {
                Class rawType = aVar.getRawType();
                if (rawType == r0 || rawType == r1) {
                    return r2;
                }
                return null;
            }

            public String toString() {
                StringBuilder a = C1965a.m4756a("Factory[type=");
                a.append(r1.getName());
                a.append("+");
                a.append(r0.getName());
                a.append(",adapter=");
                a.append(r2);
                a.append("]");
                return a.toString();
            }
        });
        arrayList.add(TypeAdapters.f1672x);
        arrayList.add(TypeAdapters.f1663o);
        arrayList.add(TypeAdapters.f1665q);
        arrayList.add(new C4345t(AtomicLong.class, new TypeAdapter$1(new C4344s<AtomicLong>() {
            /* renamed from: a */
            public Object mo3072a(C4397a aVar) {
                return new AtomicLong(((Number) C4344s.this.mo3072a(aVar)).longValue());
            }

            /* renamed from: a */
            public void mo3073a(C4400c cVar, Object obj) {
                C4344s.this.mo3073a(cVar, Long.valueOf(((AtomicLong) obj).get()));
            }
        })) {
            /* renamed from: a */
            public <T> C4344s<T> mo3085a(Gson gson, C4396a<T> aVar) {
                if (aVar.getRawType() == r1) {
                    return r0;
                }
                return null;
            }

            public String toString() {
                StringBuilder a = C1965a.m4756a("Factory[type=");
                a.append(r1.getName());
                a.append(",adapter=");
                a.append(r0);
                a.append("]");
                return a.toString();
            }
        });
        arrayList.add(new C4345t(AtomicLongArray.class, new TypeAdapter$1(new C4344s<AtomicLongArray>() {
            /* renamed from: a */
            public Object mo3072a(C4397a aVar) {
                ArrayList arrayList = new ArrayList();
                aVar.mo10628a();
                while (aVar.mo10637r()) {
                    arrayList.add(Long.valueOf(((Number) C4344s.this.mo3072a(aVar)).longValue()));
                }
                aVar.mo10633k();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i = 0; i < size; i++) {
                    atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
                }
                return atomicLongArray;
            }

            /* renamed from: a */
            public void mo3073a(C4400c cVar, Object obj) {
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                cVar.mo10656f();
                int length = atomicLongArray.length();
                for (int i = 0; i < length; i++) {
                    C4344s.this.mo3073a(cVar, Long.valueOf(atomicLongArray.get(i)));
                }
                cVar.mo10659h();
            }
        })) {
            /* renamed from: a */
            public <T> C4344s<T> mo3085a(Gson gson, C4396a<T> aVar) {
                if (aVar.getRawType() == r1) {
                    return r0;
                }
                return null;
            }

            public String toString() {
                StringBuilder a = C1965a.m4756a("Factory[type=");
                a.append(r1.getName());
                a.append(",adapter=");
                a.append(r0);
                a.append("]");
                return a.toString();
            }
        });
        arrayList.add(TypeAdapters.f1667s);
        arrayList.add(TypeAdapters.f1674z);
        arrayList.add(TypeAdapters.f1628F);
        arrayList.add(TypeAdapters.f1630H);
        arrayList.add(new C4345t(BigDecimal.class, TypeAdapters.f1624B) {
            /* renamed from: a */
            public <T> C4344s<T> mo3085a(Gson gson, C4396a<T> aVar) {
                if (aVar.getRawType() == r1) {
                    return r0;
                }
                return null;
            }

            public String toString() {
                StringBuilder a = C1965a.m4756a("Factory[type=");
                a.append(r1.getName());
                a.append(",adapter=");
                a.append(r0);
                a.append("]");
                return a.toString();
            }
        });
        arrayList.add(new C4345t(BigInteger.class, TypeAdapters.f1625C) {
            /* renamed from: a */
            public <T> C4344s<T> mo3085a(Gson gson, C4396a<T> aVar) {
                if (aVar.getRawType() == r1) {
                    return r0;
                }
                return null;
            }

            public String toString() {
                StringBuilder a = C1965a.m4756a("Factory[type=");
                a.append(r1.getName());
                a.append(",adapter=");
                a.append(r0);
                a.append("]");
                return a.toString();
            }
        });
        arrayList.add(TypeAdapters.f1632J);
        arrayList.add(TypeAdapters.f1634L);
        arrayList.add(TypeAdapters.f1638P);
        arrayList.add(TypeAdapters.f1640R);
        arrayList.add(TypeAdapters.f1645W);
        arrayList.add(TypeAdapters.f1636N);
        arrayList.add(TypeAdapters.f1652d);
        arrayList.add(DateTypeAdapter.f1588b);
        arrayList.add(TypeAdapters.f1643U);
        arrayList.add(TimeTypeAdapter.f1611b);
        arrayList.add(SqlDateTypeAdapter.f1609b);
        arrayList.add(TypeAdapters.f1641S);
        arrayList.add(ArrayTypeAdapter.f1582c);
        arrayList.add(TypeAdapters.f1650b);
        arrayList.add(new CollectionTypeAdapterFactory(this.f1558c));
        arrayList.add(new MapTypeAdapterFactory(this.f1558c, false));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(this.f1558c);
        this.f1559d = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.f1648Z);
        arrayList.add(new ReflectiveTypeAdapterFactory(this.f1558c, cVar, excluder, this.f1559d));
        this.f1560e = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    public static void m1158a(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            StringBuilder sb = new StringBuilder();
            sb.append(d);
            sb.append(" is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public <T> T mo3075a(Reader reader, Type type) {
        T t;
        C4397a aVar = new C4397a(reader);
        boolean z = this.f1565j;
        aVar.f10461f = z;
        aVar.f10461f = true;
        try {
            aVar.peek();
            t = mo3080a(C4396a.get(type)).mo3072a(aVar);
        } catch (EOFException e) {
            if (1 != 0) {
                t = null;
            } else {
                throw new C4340q((Throwable) e);
            }
        } catch (IllegalStateException e2) {
            throw new C4340q((Throwable) e2);
        } catch (IOException e3) {
            throw new C4340q((Throwable) e3);
        } catch (AssertionError e4) {
            StringBuilder sb = new StringBuilder();
            sb.append("AssertionError (GSON 2.8.5): ");
            sb.append(e4.getMessage());
            throw new AssertionError(sb.toString(), e4);
        } catch (Throwable th) {
            aVar.f10461f = z;
            throw th;
        }
        aVar.f10461f = z;
        if (t != null) {
            try {
                if (aVar.peek() != C4399b.END_DOCUMENT) {
                    throw new C4333j("JSON document was not fully consumed.");
                }
            } catch (C4401d e5) {
                throw new C4340q((Throwable) e5);
            } catch (IOException e6) {
                throw new C4333j((Throwable) e6);
            }
        }
        return t;
    }

    /* renamed from: a */
    public <T> T mo3077a(String str, Type type) {
        if (str == null) {
            return null;
        }
        return mo3075a((Reader) new StringReader(str), type);
    }

    /* renamed from: a */
    public <T> C4344s<T> mo3079a(C4345t tVar, C4396a<T> aVar) {
        if (!this.f1560e.contains(tVar)) {
            tVar = this.f1559d;
        }
        boolean z = false;
        for (C4345t tVar2 : this.f1560e) {
            if (z) {
                C4344s<T> a = tVar2.mo3085a(this, aVar);
                if (a != null) {
                    return a;
                }
            } else if (tVar2 == tVar) {
                z = true;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("GSON cannot serialize ");
        sb.append(aVar);
        throw new IllegalArgumentException(sb.toString());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{serializeNulls:");
        sb.append(this.f1561f);
        sb.append(",factories:");
        sb.append(this.f1560e);
        sb.append(",instanceCreators:");
        sb.append(this.f1558c);
        sb.append(Objects.ARRAY_END);
        return sb.toString();
    }

    /* renamed from: a */
    public <T> T mo3076a(String str, Class<T> cls) {
        Object a = mo3077a(str, (Type) cls);
        Map<Class<?>, Class<?>> map = C4384t.f10436a;
        if (cls != null) {
            Class<T> cls2 = (Class) map.get(cls);
            if (cls2 != null) {
                cls = cls2;
            }
            return cls.cast(a);
        }
        throw null;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=q.b.e.w.a<T>, code=q.b.e.w.a, for r6v0, types: [q.b.e.w.a, java.lang.Object, q.b.e.w.a<T>] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> p213q.p217b.p355e.C4344s<T> mo3080a(p213q.p217b.p355e.p361w.C4396a r6) {
        /*
            r5 = this;
            java.util.Map<q.b.e.w.a<?>, q.b.e.s<?>> r0 = r5.f1557b
            if (r6 != 0) goto L_0x0007
            q.b.e.w.a<?> r1 = f1555k
            goto L_0x0008
        L_0x0007:
            r1 = r6
        L_0x0008:
            java.lang.Object r0 = r0.get(r1)
            q.b.e.s r0 = (p213q.p217b.p355e.C4344s) r0
            if (r0 == 0) goto L_0x0011
            return r0
        L_0x0011:
            java.lang.ThreadLocal<java.util.Map<q.b.e.w.a<?>, com.google.gson.Gson$FutureTypeAdapter<?>>> r0 = r5.f1556a
            java.lang.Object r0 = r0.get()
            java.util.Map r0 = (java.util.Map) r0
            r1 = 0
            if (r0 != 0) goto L_0x0027
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.ThreadLocal<java.util.Map<q.b.e.w.a<?>, com.google.gson.Gson$FutureTypeAdapter<?>>> r1 = r5.f1556a
            r1.set(r0)
            r1 = 1
        L_0x0027:
            java.lang.Object r2 = r0.get(r6)
            com.google.gson.Gson$FutureTypeAdapter r2 = (com.google.gson.Gson.FutureTypeAdapter) r2
            if (r2 == 0) goto L_0x0030
            return r2
        L_0x0030:
            com.google.gson.Gson$FutureTypeAdapter r2 = new com.google.gson.Gson$FutureTypeAdapter     // Catch:{ all -> 0x0083 }
            r2.<init>()     // Catch:{ all -> 0x0083 }
            r0.put(r6, r2)     // Catch:{ all -> 0x0083 }
            java.util.List<q.b.e.t> r3 = r5.f1560e     // Catch:{ all -> 0x0083 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0083 }
        L_0x003e:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0083 }
            if (r4 == 0) goto L_0x006c
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0083 }
            q.b.e.t r4 = (p213q.p217b.p355e.C4345t) r4     // Catch:{ all -> 0x0083 }
            q.b.e.s r4 = r4.mo3085a(r5, r6)     // Catch:{ all -> 0x0083 }
            if (r4 == 0) goto L_0x003e
            q.b.e.s<T> r3 = r2.f1568a     // Catch:{ all -> 0x0083 }
            if (r3 != 0) goto L_0x0066
            r2.f1568a = r4     // Catch:{ all -> 0x0083 }
            java.util.Map<q.b.e.w.a<?>, q.b.e.s<?>> r2 = r5.f1557b     // Catch:{ all -> 0x0083 }
            r2.put(r6, r4)     // Catch:{ all -> 0x0083 }
            r0.remove(r6)
            if (r1 == 0) goto L_0x0065
            java.lang.ThreadLocal<java.util.Map<q.b.e.w.a<?>, com.google.gson.Gson$FutureTypeAdapter<?>>> r6 = r5.f1556a
            r6.remove()
        L_0x0065:
            return r4
        L_0x0066:
            java.lang.AssertionError r2 = new java.lang.AssertionError     // Catch:{ all -> 0x0083 }
            r2.<init>()     // Catch:{ all -> 0x0083 }
            throw r2     // Catch:{ all -> 0x0083 }
        L_0x006c:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0083 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0083 }
            r3.<init>()     // Catch:{ all -> 0x0083 }
            java.lang.String r4 = "GSON (2.8.5) cannot handle "
            r3.append(r4)     // Catch:{ all -> 0x0083 }
            r3.append(r6)     // Catch:{ all -> 0x0083 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0083 }
            r2.<init>(r3)     // Catch:{ all -> 0x0083 }
            throw r2     // Catch:{ all -> 0x0083 }
        L_0x0083:
            r2 = move-exception
            r0.remove(r6)
            if (r1 == 0) goto L_0x008e
            java.lang.ThreadLocal<java.util.Map<q.b.e.w.a<?>, com.google.gson.Gson$FutureTypeAdapter<?>>> r6 = r5.f1556a
            r6.remove()
        L_0x008e:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.Gson.mo3080a(q.b.e.w.a):q.b.e.s");
    }

    /* renamed from: a */
    public C4400c mo3081a(Writer writer) {
        if (this.f1562g) {
            writer.write(")]}'\n");
        }
        C4400c cVar = new C4400c(writer);
        if (this.f1564i) {
            cVar.f10491h = "  ";
            cVar.f10492i = ": ";
        }
        cVar.f10496m = this.f1561f;
        return cVar;
    }

    /* renamed from: a */
    public String mo3078a(Object obj) {
        if (obj == null) {
            C4334k kVar = C4334k.f10382a;
            StringWriter stringWriter = new StringWriter();
            try {
                mo3083a((C4332i) kVar, mo3081a((Writer) stringWriter));
                return stringWriter.toString();
            } catch (IOException e) {
                throw new C4333j((Throwable) e);
            }
        } else {
            Class cls = obj.getClass();
            StringWriter stringWriter2 = new StringWriter();
            try {
                mo3082a(obj, cls, mo3081a((Writer) stringWriter2));
                return stringWriter2.toString();
            } catch (IOException e2) {
                throw new C4333j((Throwable) e2);
            }
        }
    }

    /* renamed from: a */
    public void mo3083a(C4332i iVar, C4400c cVar) {
        boolean z = cVar.f10493j;
        cVar.f10493j = true;
        boolean z2 = cVar.f10494k;
        cVar.f10494k = this.f1563h;
        boolean z3 = cVar.f10496m;
        cVar.f10496m = this.f1561f;
        try {
            TypeAdapters.f1646X.mo3073a(cVar, iVar);
            cVar.f10493j = z;
            cVar.f10494k = z2;
            cVar.f10496m = z3;
        } catch (IOException e) {
            throw new C4333j((Throwable) e);
        } catch (AssertionError e2) {
            StringBuilder sb = new StringBuilder();
            sb.append("AssertionError (GSON 2.8.5): ");
            sb.append(e2.getMessage());
            throw new AssertionError(sb.toString(), e2);
        } catch (Throwable th) {
            cVar.f10493j = z;
            cVar.f10494k = z2;
            cVar.f10496m = z3;
            throw th;
        }
    }

    /* renamed from: a */
    public void mo3082a(Object obj, Type type, C4400c cVar) {
        C4344s a = mo3080a(C4396a.get(type));
        boolean z = cVar.f10493j;
        cVar.f10493j = true;
        boolean z2 = cVar.f10494k;
        cVar.f10494k = this.f1563h;
        boolean z3 = cVar.f10496m;
        cVar.f10496m = this.f1561f;
        try {
            a.mo3073a(cVar, obj);
            cVar.f10493j = z;
            cVar.f10494k = z2;
            cVar.f10496m = z3;
        } catch (IOException e) {
            throw new C4333j((Throwable) e);
        } catch (AssertionError e2) {
            StringBuilder sb = new StringBuilder();
            sb.append("AssertionError (GSON 2.8.5): ");
            sb.append(e2.getMessage());
            throw new AssertionError(sb.toString(), e2);
        } catch (Throwable th) {
            cVar.f10493j = z;
            cVar.f10494k = z2;
            cVar.f10496m = z3;
            throw th;
        }
    }
}
