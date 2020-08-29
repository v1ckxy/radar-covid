package p392u.p401r.p403c;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p392u.C4548a;
import p392u.C4553f;
import p392u.p393n.C4568g;
import p392u.p393n.C4571j;
import p392u.p401r.p402b.C4607a;
import p392u.p401r.p402b.C4608b;
import p392u.p401r.p402b.C4609c;
import p392u.p401r.p402b.C4610d;
import p392u.p401r.p402b.C4611e;
import p392u.p401r.p402b.C4612f;
import p392u.p401r.p402b.C4613g;
import p392u.p401r.p402b.C4614h;
import p392u.p401r.p402b.C4615i;
import p392u.p401r.p402b.C4616j;
import p392u.p401r.p402b.C4617k;
import p392u.p401r.p402b.C4618l;
import p392u.p401r.p402b.C4619m;
import p392u.p401r.p402b.C4620n;
import p392u.p401r.p402b.C4621o;
import p392u.p401r.p402b.C4622p;
import p392u.p401r.p402b.C4623q;
import p392u.p401r.p402b.C4624r;
import p392u.p401r.p402b.C4625s;
import p392u.p401r.p402b.C4626t;
import p392u.p401r.p402b.C4627u;
import p392u.p401r.p402b.C4628v;
import p392u.p401r.p402b.C4629w;
import p392u.p407u.C4658b;
import p392u.p409w.C4681g;

/* renamed from: u.r.c.d */
public final class C4634d implements C4658b<Object>, C4633c {

    /* renamed from: b */
    public static final Map<Class<? extends C4548a<?>>, Integer> f10824b;

    /* renamed from: c */
    public static final HashMap<String, String> f10825c;

    /* renamed from: d */
    public static final HashMap<String, String> f10826d;

    /* renamed from: e */
    public static final HashMap<String, String> f10827e;

    /* renamed from: a */
    public final Class<?> f10828a;

    static {
        Map<Class<? extends C4548a<?>>, Integer> map;
        List a = C2286e.m5204a((T[]) new Class[]{C4607a.class, C4618l.class, C4622p.class, C4623q.class, C4624r.class, C4625s.class, C4626t.class, C4627u.class, C4628v.class, C4629w.class, C4608b.class, C4609c.class, C4610d.class, C4611e.class, C4612f.class, C4613g.class, C4614h.class, C4615i.class, C4616j.class, C4617k.class, C4619m.class, C4620n.class, C4621o.class});
        ArrayList arrayList = new ArrayList(C2286e.m5158a((Iterable<? extends T>) a, 10));
        int i = 0;
        for (Object next : a) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList.add(new C4553f((Class) next, Integer.valueOf(i)));
                i = i2;
            } else {
                C2286e.m5338f();
                throw null;
            }
        }
        int size = arrayList.size();
        if (size == 0) {
            map = C4571j.f10780e;
        } else if (size != 1) {
            map = new LinkedHashMap<>(C2286e.m5318d(arrayList.size()));
            C4568g.m10219a((Iterable<? extends C4553f<? extends K, ? extends V>>) arrayList, map);
        } else {
            C4553f fVar = (C4553f) arrayList.get(0);
            if (fVar != null) {
                map = Collections.singletonMap(fVar.f10766e, fVar.f10767f);
                C4638h.m10270a((Object) map, "java.util.Collections.si…(pair.first, pair.second)");
            } else {
                C4638h.m10271a("pair");
                throw null;
            }
        }
        f10824b = map;
        HashMap<String, String> hashMap = new HashMap<>();
        String str = "kotlin.Boolean";
        hashMap.put("boolean", str);
        String str2 = "kotlin.Char";
        hashMap.put("char", str2);
        String str3 = "kotlin.Byte";
        hashMap.put("byte", str3);
        String str4 = "kotlin.Short";
        hashMap.put("short", str4);
        String str5 = "kotlin.Int";
        hashMap.put("int", str5);
        String str6 = "kotlin.Float";
        hashMap.put("float", str6);
        String str7 = "kotlin.Long";
        hashMap.put("long", str7);
        String str8 = "kotlin.Double";
        hashMap.put("double", str8);
        f10825c = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", str);
        hashMap2.put("java.lang.Character", str2);
        hashMap2.put("java.lang.Byte", str3);
        hashMap2.put("java.lang.Short", str4);
        hashMap2.put("java.lang.Integer", str5);
        hashMap2.put("java.lang.Float", str6);
        hashMap2.put("java.lang.Long", str7);
        hashMap2.put("java.lang.Double", str8);
        f10826d = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(f10825c);
        hashMap3.putAll(f10826d);
        Collection<String> values = f10825c.values();
        C4638h.m10270a((Object) values, "primitiveFqNames.values");
        for (String str9 : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            C4638h.m10270a((Object) str9, "kotlinName");
            sb.append(C4681g.m10309a(str9, '.', (String) null, 2));
            sb.append("CompanionObject");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str9);
            sb3.append(".Companion");
            hashMap3.put(sb2, sb3.toString());
        }
        for (Entry entry : f10824b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int intValue = ((Number) entry.getValue()).intValue();
            String name = cls.getName();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("kotlin.Function");
            sb4.append(intValue);
            hashMap3.put(name, sb4.toString());
        }
        f10827e = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2286e.m5318d(hashMap3.size()));
        for (Entry entry2 : hashMap3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), C4681g.m10309a((String) entry2.getValue(), '.', (String) null, 2));
        }
    }

    public C4634d(Class<?> cls) {
        if (cls != null) {
            this.f10828a = cls;
        } else {
            C4638h.m10271a("jClass");
            throw null;
        }
    }

    /* renamed from: a */
    public Class<?> mo10931a() {
        return this.f10828a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C4634d) && C4638h.m10272a((Object) C2286e.m5177a((C4658b<T>) this), (Object) C2286e.m5177a((C4658b) obj));
    }

    public int hashCode() {
        return C2286e.m5177a((C4658b<T>) this).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f10828a.toString());
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }
}
