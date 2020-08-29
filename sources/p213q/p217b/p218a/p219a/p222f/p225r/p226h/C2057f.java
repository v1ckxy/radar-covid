package p213q.p217b.p218a.p219a.p222f.p225r.p226h;

import java.util.Collections;
import java.util.Set;
import p213q.p217b.p218a.p219a.C1967b;
import p213q.p217b.p218a.p219a.p222f.p225r.p226h.C2052c.C2054b;

/* renamed from: q.b.a.a.f.r.h.f */
public abstract class C2057f {

    /* renamed from: q.b.a.a.f.r.h.f$a */
    public static abstract class C2058a {

        /* renamed from: q.b.a.a.f.r.h.f$a$a */
        public static abstract class C2059a {
            /* renamed from: a */
            public abstract C2059a mo7040a(long j);

            /* renamed from: a */
            public abstract C2058a mo7041a();

            /* renamed from: b */
            public abstract C2059a mo7042b(long j);
        }

        /* renamed from: a */
        public static C2059a m4823a() {
            C2054b bVar = new C2054b();
            Set<C2060b> emptySet = Collections.emptySet();
            if (emptySet != null) {
                bVar.f5859c = emptySet;
                return bVar;
            }
            throw new NullPointerException("Null flags");
        }
    }

    /* renamed from: q.b.a.a.f.r.h.f$b */
    public enum C2060b {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    /* renamed from: a */
    public long mo7045a(C1967b bVar, long j, int i) {
        C2051b bVar2 = (C2051b) this;
        C2052c cVar = (C2052c) ((C2058a) bVar2.f5853b.get(bVar));
        return Math.min(Math.max(((long) Math.pow(2.0d, (double) (i - 1))) * cVar.f5854a, j - bVar2.f5852a.mo7076a()), cVar.f5855b);
    }
}
