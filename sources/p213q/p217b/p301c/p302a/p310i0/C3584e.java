package p213q.p217b.p301c.p302a.p310i0;

import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p301c.p302a.C3844p;
import p213q.p217b.p301c.p302a.C3844p.C3845a;
import p213q.p217b.p301c.p302a.C3846q;
import p213q.p217b.p301c.p302a.p315m0.p316p0.C3824b;

@Immutable
/* renamed from: q.b.c.a.i0.e */
public class C3584e implements C3846q<C3583d> {

    /* renamed from: q.b.c.a.i0.e$b */
    public static class C3586b extends C3583d {

        /* renamed from: a */
        public final Map<Integer, C3824b> f8965a;

        /* renamed from: b */
        public final int f8966b;

        public /* synthetic */ C3586b(C3844p pVar, C3585a aVar) {
            if (!pVar.mo10047a().isEmpty()) {
                C3845a<P> aVar2 = pVar.f9439b;
                if (aVar2 != null) {
                    this.f8966b = aVar2.f9445e;
                    List<C3845a> a = pVar.mo10047a();
                    HashMap hashMap = new HashMap();
                    for (C3845a aVar3 : a) {
                        if (!aVar3.f9444d.equals(OutputPrefixType.RAW)) {
                            throw new GeneralSecurityException(C1965a.m4753a(C1965a.m4756a("Key "), aVar3.f9445e, " has non raw prefix type"));
                        } else if (((C3583d) aVar3.f9441a).mo9481a().size() <= 1) {
                            hashMap.put(Integer.valueOf(aVar3.f9445e), ((C3583d) aVar3.f9441a).mo9481a().get(Integer.valueOf(((C3583d) aVar3.f9441a).mo9482b())));
                        } else {
                            StringBuilder a2 = C1965a.m4756a("More PRFs than expected in KeyTypeManager for key ");
                            a2.append(aVar3.f9445e);
                            throw new GeneralSecurityException(a2.toString());
                        }
                    }
                    this.f8965a = Collections.unmodifiableMap(hashMap);
                    return;
                }
                throw new GeneralSecurityException("Primary key not set.");
            }
            throw new GeneralSecurityException("No primitives provided.");
        }

        /* renamed from: a */
        public Map<Integer, C3824b> mo9481a() {
            return this.f8965a;
        }

        /* renamed from: b */
        public int mo9482b() {
            return this.f8966b;
        }
    }

    /* renamed from: a */
    public Class<C3583d> mo9457a() {
        return C3583d.class;
    }

    /* renamed from: a */
    public Object mo9458a(C3844p pVar) {
        return new C3586b(pVar, null);
    }
}
