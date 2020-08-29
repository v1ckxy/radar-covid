package p213q.p217b.p317d.p318f;

import android.os.Bundle;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import p213q.p217b.p218a.p231b.p239d.p246q.C2284c;
import p213q.p217b.p218a.p231b.p251g.p256e.C2462h;
import p213q.p217b.p218a.p231b.p251g.p256e.C2505j;
import p213q.p217b.p218a.p231b.p251g.p256e.C2538l;
import p213q.p217b.p218a.p231b.p251g.p256e.C2555m;
import p213q.p217b.p218a.p231b.p251g.p256e.C2571me;
import p213q.p217b.p218a.p231b.p251g.p256e.C2607p;
import p213q.p217b.p218a.p231b.p251g.p256e.C2627q;
import p213q.p217b.p218a.p231b.p251g.p256e.C2644r;
import p213q.p217b.p218a.p231b.p251g.p256e.C2660s;
import p213q.p217b.p218a.p231b.p251g.p256e.C2676t;
import p213q.p217b.p218a.p231b.p251g.p256e.C2691u;
import p213q.p217b.p218a.p231b.p251g.p256e.C2708v;
import p213q.p217b.p218a.p231b.p251g.p256e.C2755y;
import p213q.p217b.p218a.p231b.p251g.p256e.C2771z;
import p213q.p217b.p218a.p231b.p259h.p261b.C2995i7;

/* renamed from: q.b.d.f.b */
public final class C3880b implements C2995i7 {

    /* renamed from: a */
    public final /* synthetic */ C2462h f9497a;

    public C3880b(C2462h hVar) {
        this.f9497a = hVar;
    }

    /* renamed from: a */
    public final String mo8522a() {
        C2462h hVar = this.f9497a;
        if (hVar != null) {
            C2571me meVar = new C2571me();
            hVar.f6557c.execute(new C2708v(hVar, meVar));
            return meVar.mo7873a(500);
        }
        throw null;
    }

    /* renamed from: b */
    public final String mo8529b() {
        C2462h hVar = this.f9497a;
        if (hVar != null) {
            C2571me meVar = new C2571me();
            hVar.f6557c.execute(new C2691u(hVar, meVar));
            return meVar.mo7873a(500);
        }
        throw null;
    }

    /* renamed from: b */
    public final void mo8530b(String str, String str2, Bundle bundle) {
        this.f9497a.mo7689a(str, str2, bundle);
    }

    /* renamed from: c */
    public final void mo8532c(String str) {
        C2462h hVar = this.f9497a;
        if (hVar != null) {
            hVar.f6557c.execute(new C2644r(hVar, str));
            return;
        }
        throw null;
    }

    /* renamed from: d */
    public final String mo8533d() {
        C2462h hVar = this.f9497a;
        if (hVar != null) {
            C2571me meVar = new C2571me();
            hVar.f6557c.execute(new C2627q(hVar, meVar));
            return meVar.mo7873a(500);
        }
        throw null;
    }

    /* renamed from: e */
    public final long mo8534e() {
        C2462h hVar = this.f9497a;
        if (hVar != null) {
            C2571me meVar = new C2571me();
            hVar.f6557c.execute(new C2660s(hVar, meVar));
            Long l = (Long) C2571me.m6157a(meVar.mo7875b(500), Long.class);
            if (l != null) {
                return l.longValue();
            }
            long nanoTime = System.nanoTime();
            if (((C2284c) hVar.f6556b) != null) {
                long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
                int i = hVar.f6560f + 1;
                hVar.f6560f = i;
                return nextLong + ((long) i);
            }
            throw null;
        }
        throw null;
    }

    /* renamed from: a */
    public final List<Bundle> mo8523a(String str, String str2) {
        C2462h hVar = this.f9497a;
        if (hVar != null) {
            C2571me meVar = new C2571me();
            hVar.f6557c.execute(new C2538l(hVar, str, str2, meVar));
            List<Bundle> list = (List) C2571me.m6157a(meVar.mo7875b(5000), List.class);
            return list == null ? Collections.emptyList() : list;
        }
        throw null;
    }

    /* renamed from: b */
    public final int mo8528b(String str) {
        C2462h hVar = this.f9497a;
        if (hVar != null) {
            C2571me meVar = new C2571me();
            hVar.f6557c.execute(new C2771z(hVar, str, meVar));
            Integer num = (Integer) C2571me.m6157a(meVar.mo7875b(10000), Integer.class);
            if (num == null) {
                return 25;
            }
            return num.intValue();
        }
        throw null;
    }

    /* renamed from: c */
    public final String mo8531c() {
        C2462h hVar = this.f9497a;
        if (hVar != null) {
            C2571me meVar = new C2571me();
            hVar.f6557c.execute(new C2676t(hVar, meVar));
            return meVar.mo7873a(50);
        }
        throw null;
    }

    /* renamed from: a */
    public final Map<String, Object> mo8524a(String str, String str2, boolean z) {
        C2462h hVar = this.f9497a;
        if (hVar != null) {
            C2571me meVar = new C2571me();
            C2755y yVar = new C2755y(hVar, str, str2, z, meVar);
            hVar.f6557c.execute(yVar);
            Bundle b = meVar.mo7875b(5000);
            if (b == null || b.size() == 0) {
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap(b.size());
            for (String str3 : b.keySet()) {
                Object obj = b.get(str3);
                if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                    hashMap.put(str3, obj);
                }
            }
            return hashMap;
        }
        throw null;
    }

    /* renamed from: a */
    public final void mo8525a(Bundle bundle) {
        C2462h hVar = this.f9497a;
        if (hVar != null) {
            hVar.f6557c.execute(new C2505j(hVar, bundle));
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public final void mo8526a(String str) {
        C2462h hVar = this.f9497a;
        if (hVar != null) {
            hVar.f6557c.execute(new C2607p(hVar, str));
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public final void mo8527a(String str, String str2, Bundle bundle) {
        C2462h hVar = this.f9497a;
        if (hVar != null) {
            hVar.f6557c.execute(new C2555m(hVar, str, str2, bundle));
            return;
        }
        throw null;
    }
}
