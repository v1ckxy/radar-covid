package p213q.p217b.p218a.p231b.p262i;

import android.content.Context;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p240m.C2133a.C2134a;
import p213q.p217b.p218a.p231b.p239d.p240m.C2133a.C2137d.C2141d;
import p213q.p217b.p218a.p231b.p239d.p240m.C2133a.C2146g;
import p213q.p217b.p218a.p231b.p239d.p248r.C2294b;
import p213q.p217b.p218a.p231b.p251g.p257f.C2810f2;
import p213q.p217b.p218a.p231b.p251g.p257f.C2818h2;
import p213q.p217b.p218a.p231b.p251g.p257f.C2838m2;
import p213q.p217b.p218a.p231b.p251g.p257f.C2842n2;
import p213q.p217b.p218a.p231b.p251g.p257f.C2848p0;
import p213q.p217b.p218a.p231b.p251g.p257f.C2880x0;
import p213q.p217b.p218a.p231b.p262i.p263b.C3191a;
import p213q.p217b.p218a.p231b.p262i.p264c.C3201b;
import p213q.p217b.p218a.p231b.p262i.p265d.C3205a;
import p213q.p217b.p218a.p231b.p262i.p265d.p266b.C3207b;
import p213q.p217b.p218a.p231b.p262i.p265d.p266b.C3209d;

/* renamed from: q.b.a.b.i.a */
public final class C3190a {
    static {
        C2134a<C2848p0, C3191a> aVar = C2880x0.f7105b;
        C2146g<C2848p0> gVar = C2880x0.f7104a;
        String str = "Cannot construct an Api with a null ClientBuilder";
        C1061o.m2525b(aVar, (Object) str);
        String str2 = "Cannot construct an Api with a null ClientKey";
        C1061o.m2525b(gVar, (Object) str2);
        C2134a<C3207b, C3205a> aVar2 = C3209d.f8064c;
        C2146g<C3207b> gVar2 = C3209d.f8063b;
        C1061o.m2525b(aVar2, (Object) str);
        C1061o.m2525b(gVar2, (Object) str2);
        C3209d dVar = C3209d.f8062a;
        C2134a<C2818h2, C2141d> aVar3 = C2810f2.f7041b;
        C2146g<C2818h2> gVar3 = C2810f2.f7040a;
        C1061o.m2525b(aVar3, (Object) str);
        C1061o.m2525b(gVar3, (Object) str2);
    }

    /* renamed from: a */
    public static C3201b m7517a(Context context) {
        C1061o.m2525b(context, (Object) "Context must not be null");
        return new C2842n2(context);
    }

    /* renamed from: b */
    public static boolean m7518b(Context context) {
        if (C2294b.m5363b(context).f6270a.checkCallingOrSelfPermission("com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
            return C2838m2.m6624a(context.getContentResolver(), "gms:nearby:requires_gms_check");
        }
        return true;
    }
}
