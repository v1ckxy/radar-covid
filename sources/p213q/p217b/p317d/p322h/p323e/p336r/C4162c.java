package p213q.p217b.p317d.p322h.p323e.p336r;

import android.content.Context;
import java.util.Collections;
import java.util.Set;
import p213q.p217b.p218a.p219a.C1966a;
import p213q.p217b.p218a.p219a.C1968c;
import p213q.p217b.p218a.p219a.C1969d;
import p213q.p217b.p218a.p219a.p220e.C1970a;
import p213q.p217b.p218a.p219a.p222f.C2006b.C2008b;
import p213q.p217b.p218a.p219a.p222f.C2018i;
import p213q.p217b.p218a.p219a.p222f.C2018i.C2019a;
import p213q.p217b.p218a.p219a.p222f.C2020j;
import p213q.p217b.p218a.p219a.p222f.C2021k;
import p213q.p217b.p218a.p219a.p222f.C2023m;
import p213q.p217b.p218a.p231b.p270l.C3257j;
import p213q.p217b.p317d.p322h.p323e.p326k.C3954j0;
import p213q.p217b.p317d.p322h.p323e.p328m.C4090v;
import p213q.p217b.p317d.p322h.p323e.p328m.p329x.C4125f;

/* renamed from: q.b.d.h.e.r.c */
public class C4162c {

    /* renamed from: b */
    public static final C4125f f10061b = new C4125f();

    /* renamed from: c */
    public static final String f10062c = m9631a("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: d */
    public static final String f10063d = m9631a("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: e */
    public static final C1968c<C4090v, byte[]> f10064e = C4161b.f10060a;

    /* renamed from: a */
    public final C1969d<C4090v> f10065a;

    public C4162c(C1969d<C4090v> dVar, C1968c<C4090v, byte[]> cVar) {
        this.f10065a = dVar;
    }

    /* renamed from: a */
    public static String m9631a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static C4162c m9632a(Context context) {
        C2023m.m4807a(context);
        C2023m a = C2023m.m4806a();
        C1970a aVar = new C1970a(f10062c, f10063d);
        if (a != null) {
            Set unmodifiableSet = Collections.unmodifiableSet(aVar.mo6965a());
            C2019a a2 = C2018i.m4802a();
            a2.mo7005a(aVar.mo6966b());
            C2008b bVar = (C2008b) a2;
            bVar.f5766b = aVar.mo6967c();
            C2020j jVar = new C2020j(unmodifiableSet, bVar.mo7007a(), a);
            C1966a aVar2 = new C1966a("json");
            C1968c<C4090v, byte[]> cVar = f10064e;
            if (jVar.f5785a.contains(aVar2)) {
                C2021k kVar = new C2021k(jVar.f5786b, "FIREBASE_CRASHLYTICS_REPORT", aVar2, cVar, jVar.f5787c);
                return new C4162c(kVar, f10064e);
            }
            throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{aVar2, jVar.f5785a}));
        }
        throw null;
    }

    /* renamed from: a */
    public static /* synthetic */ void m9633a(C3257j jVar, C3954j0 j0Var, Exception exc) {
        if (exc != null) {
            jVar.f8128a.mo8933b(exc);
        } else {
            jVar.f8128a.mo8934b(j0Var);
        }
    }
}
