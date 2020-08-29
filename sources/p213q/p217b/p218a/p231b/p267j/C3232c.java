package p213q.p217b.p218a.p231b.p267j;

import com.google.android.gms.common.api.Scope;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p240m.C2133a.C2134a;
import p213q.p217b.p218a.p231b.p239d.p240m.C2133a.C2146g;
import p213q.p217b.p218a.p231b.p267j.p268b.C3218a;

/* renamed from: q.b.a.b.j.c */
public final class C3232c {

    /* renamed from: a */
    public static final C2146g<C3218a> f8095a = new C2146g<>();

    /* renamed from: b */
    public static final C2146g<C3218a> f8096b = new C2146g<>();

    /* renamed from: c */
    public static final C2134a<C3218a, C3217a> f8097c = new C3234e();

    /* renamed from: d */
    public static final C2134a<C3218a, C3236g> f8098d = new C3233d();

    static {
        new Scope("profile");
        new Scope("email");
        C2134a<C3218a, C3217a> aVar = f8097c;
        C2146g<C3218a> gVar = f8095a;
        String str = "Cannot construct an Api with a null ClientBuilder";
        C1061o.m2525b(aVar, (Object) str);
        String str2 = "Cannot construct an Api with a null ClientKey";
        C1061o.m2525b(gVar, (Object) str2);
        C2134a<C3218a, C3236g> aVar2 = f8098d;
        C2146g<C3218a> gVar2 = f8096b;
        C1061o.m2525b(aVar2, (Object) str);
        C1061o.m2525b(gVar2, (Object) str2);
    }
}
