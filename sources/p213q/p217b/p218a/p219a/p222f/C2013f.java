package p213q.p217b.p218a.p219a.p222f;

import java.util.HashMap;
import java.util.Map;
import p116io.jsonwebtoken.lang.Objects;
import p213q.p217b.p218a.p219a.p222f.C2003a.C2005b;

/* renamed from: q.b.a.a.f.f */
public abstract class C2013f {

    /* renamed from: q.b.a.a.f.f$a */
    public static abstract class C2014a {
        /* renamed from: a */
        public abstract C2014a mo6997a(long j);

        /* renamed from: a */
        public abstract C2014a mo6998a(String str);

        /* renamed from: a */
        public final C2014a mo7014a(String str, String str2) {
            mo7001b().put(str, str2);
            return this;
        }

        /* renamed from: a */
        public abstract C2014a mo6999a(C2012e eVar);

        /* renamed from: a */
        public abstract C2013f mo7000a();

        /* renamed from: b */
        public abstract Map<String, String> mo7001b();

        /* renamed from: b */
        public abstract C2014a mo7002b(long j);
    }

    /* renamed from: a */
    public final String mo7011a(String str) {
        String str2 = (String) ((C2003a) this).f5755f.get(str);
        return str2 == null ? Objects.EMPTY_STRING : str2;
    }

    /* renamed from: b */
    public final int mo7013b(String str) {
        String str2 = (String) ((C2003a) this).f5755f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* renamed from: a */
    public C2014a mo7012a() {
        C2005b bVar = new C2005b();
        C2003a aVar = (C2003a) this;
        bVar.mo6998a(aVar.f5750a);
        bVar.f5757b = aVar.f5751b;
        bVar.mo6999a(aVar.f5752c);
        bVar.mo6997a(aVar.f5753d);
        bVar.mo7002b(aVar.f5754e);
        bVar.f5761f = new HashMap(aVar.f5755f);
        return bVar;
    }
}
