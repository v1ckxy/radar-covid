package p213q.p217b.p218a.p219a.p222f.p225r;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import p213q.p217b.p218a.p219a.C1967b;
import p213q.p217b.p218a.p219a.p222f.p225r.p226h.C2051b;
import p213q.p217b.p218a.p219a.p222f.p225r.p226h.C2052c.C2054b;
import p213q.p217b.p218a.p219a.p222f.p225r.p226h.C2057f;
import p213q.p217b.p218a.p219a.p222f.p225r.p226h.C2057f.C2058a;
import p213q.p217b.p218a.p219a.p222f.p225r.p226h.C2057f.C2058a.C2059a;
import p213q.p217b.p218a.p219a.p222f.p225r.p226h.C2057f.C2060b;
import p213q.p217b.p218a.p219a.p222f.p229t.C2099a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p365r.p368b.C4427b;
import p390t.p391a.C4547a;

/* renamed from: q.b.a.a.f.r.f */
public final class C2048f implements C4427b<C2057f> {

    /* renamed from: a */
    public final C4547a<C2099a> f5846a;

    public C2048f(C4547a<C2099a> aVar) {
        this.f5846a = aVar;
    }

    public Object get() {
        C2099a aVar = (C2099a) this.f5846a.get();
        HashMap hashMap = new HashMap();
        C1967b bVar = C1967b.DEFAULT;
        C2059a a = C2058a.m4823a();
        a.mo7040a(30000);
        a.mo7042b(86400000);
        hashMap.put(bVar, a.mo7041a());
        C1967b bVar2 = C1967b.HIGHEST;
        C2059a a2 = C2058a.m4823a();
        a2.mo7040a(1000);
        a2.mo7042b(86400000);
        hashMap.put(bVar2, a2.mo7041a());
        C1967b bVar3 = C1967b.VERY_LOW;
        C2059a a3 = C2058a.m4823a();
        a3.mo7040a(86400000);
        a3.mo7042b(86400000);
        Set<C2060b> unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(new C2060b[]{C2060b.NETWORK_UNMETERED, C2060b.DEVICE_IDLE})));
        C2054b bVar4 = (C2054b) a3;
        if (unmodifiableSet != null) {
            bVar4.f5859c = unmodifiableSet;
            hashMap.put(bVar3, bVar4.mo7041a());
            if (aVar == null) {
                throw new NullPointerException("missing required property: clock");
            } else if (hashMap.keySet().size() >= C1967b.values().length) {
                new HashMap();
                C2051b bVar5 = new C2051b(aVar, hashMap);
                C2286e.m5279b(bVar5, "Cannot return null from a non-@Nullable @Provides method");
                return bVar5;
            } else {
                throw new IllegalStateException("Not all priorities have been configured");
            }
        } else {
            throw new NullPointerException("Null flags");
        }
    }
}
