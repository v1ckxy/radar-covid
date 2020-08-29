package p213q.p217b.p355e.p357v;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p355e.C4333j;

/* renamed from: q.b.e.v.j */
public class C4367j implements C4383s<T> {

    /* renamed from: a */
    public final /* synthetic */ Type f10410a;

    public C4367j(C4362g gVar, Type type) {
        this.f10410a = type;
    }

    /* renamed from: a */
    public T mo10576a() {
        Type type = this.f10410a;
        String str = "Invalid EnumSet type: ";
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return EnumSet.noneOf((Class) type2);
            }
            StringBuilder a = C1965a.m4756a(str);
            a.append(this.f10410a.toString());
            throw new C4333j(a.toString());
        }
        StringBuilder a2 = C1965a.m4756a(str);
        a2.append(this.f10410a.toString());
        throw new C4333j(a2.toString());
    }
}
