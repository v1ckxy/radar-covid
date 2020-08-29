package p213q.p217b.p317d.p322h.p323e.p328m;

import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4095d.C4101d.C4102a.C4103a;
import p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4095d.C4101d.C4102a.C4103a.C4104a;
import p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4095d.C4101d.C4102a.C4103a.C4105b;
import p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4095d.C4101d.C4102a.C4103a.C4106c;
import p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4095d.C4101d.C4102a.C4103a.C4107d;
import p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4095d.C4101d.C4102a.C4103a.C4108e;

/* renamed from: q.b.d.h.e.m.l */
public final class C4066l extends C4103a {

    /* renamed from: a */
    public final C4119w<C4108e> f9920a;

    /* renamed from: b */
    public final C4106c f9921b;

    /* renamed from: c */
    public final C4107d f9922c;

    /* renamed from: d */
    public final C4119w<C4104a> f9923d;

    /* renamed from: q.b.d.h.e.m.l$b */
    public static final class C4068b extends C4105b {

        /* renamed from: a */
        public C4119w<C4108e> f9924a;

        /* renamed from: b */
        public C4106c f9925b;

        /* renamed from: c */
        public C4107d f9926c;

        /* renamed from: d */
        public C4119w<C4104a> f9927d;

        /* renamed from: a */
        public C4103a mo10265a() {
            String str = this.f9924a == null ? " threads" : Objects.EMPTY_STRING;
            if (this.f9925b == null) {
                str = C1965a.m4751a(str, " exception");
            }
            if (this.f9926c == null) {
                str = C1965a.m4751a(str, " signal");
            }
            if (this.f9927d == null) {
                str = C1965a.m4751a(str, " binaries");
            }
            if (str.isEmpty()) {
                C4066l lVar = new C4066l(this.f9924a, this.f9925b, this.f9926c, this.f9927d, null);
                return lVar;
            }
            throw new IllegalStateException(C1965a.m4751a("Missing required properties:", str));
        }
    }

    public /* synthetic */ C4066l(C4119w wVar, C4106c cVar, C4107d dVar, C4119w wVar2, C4067a aVar) {
        this.f9920a = wVar;
        this.f9921b = cVar;
        this.f9922c = dVar;
        this.f9923d = wVar2;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4103a)) {
            return false;
        }
        C4066l lVar = (C4066l) ((C4103a) obj);
        if (!this.f9920a.equals(lVar.f9920a) || !this.f9921b.equals(lVar.f9921b) || !this.f9922c.equals(lVar.f9922c) || !this.f9923d.equals(lVar.f9923d)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((((this.f9920a.hashCode() ^ 1000003) * 1000003) ^ this.f9921b.hashCode()) * 1000003) ^ this.f9922c.hashCode()) * 1000003) ^ this.f9923d.hashCode();
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("Execution{threads=");
        a.append(this.f9920a);
        a.append(", exception=");
        a.append(this.f9921b);
        a.append(", signal=");
        a.append(this.f9922c);
        a.append(", binaries=");
        a.append(this.f9923d);
        a.append(Objects.ARRAY_END);
        return a.toString();
    }
}
