package p213q.p217b.p218a.p219a.p222f.p225r.p227i;

import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: q.b.a.a.f.r.i.d */
public abstract class C2077d {

    /* renamed from: a */
    public static final C2077d f5916a;

    static {
        Long valueOf = Long.valueOf(10485760);
        Integer valueOf2 = Integer.valueOf(200);
        Integer valueOf3 = Integer.valueOf(10000);
        Long valueOf4 = Long.valueOf(604800000);
        Integer valueOf5 = Integer.valueOf(81920);
        String str = valueOf == null ? " maxStorageSizeInBytes" : Objects.EMPTY_STRING;
        if (valueOf2 == null) {
            str = C1965a.m4751a(str, " loadBatchSize");
        }
        if (valueOf3 == null) {
            str = C1965a.m4751a(str, " criticalSectionEnterTimeoutMs");
        }
        if (valueOf4 == null) {
            str = C1965a.m4751a(str, " eventCleanUpAge");
        }
        if (valueOf5 == null) {
            str = C1965a.m4751a(str, " maxBlobByteSizePerRow");
        }
        if (str.isEmpty()) {
            C2073a aVar = new C2073a(valueOf.longValue(), valueOf2.intValue(), valueOf3.intValue(), valueOf4.longValue(), valueOf5.intValue(), null);
            f5916a = aVar;
            return;
        }
        throw new IllegalStateException(C1965a.m4751a("Missing required properties:", str));
    }
}
