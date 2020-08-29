package p213q.p217b.p317d.p322h.p323e.p337s.p339j;

import android.util.Log;
import java.io.IOException;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p317d.p322h.p323e.C3913b;
import p213q.p217b.p317d.p322h.p323e.p326k.C3930a;
import p213q.p217b.p317d.p322h.p323e.p326k.C3944g;
import p213q.p217b.p317d.p322h.p323e.p330n.C4127a;
import p213q.p217b.p317d.p322h.p323e.p330n.C4128b;
import p213q.p217b.p317d.p322h.p323e.p330n.C4129c;
import p213q.p217b.p317d.p322h.p323e.p330n.C4130d;
import p213q.p217b.p317d.p322h.p323e.p337s.p338i.C4172a;

/* renamed from: q.b.d.h.e.s.j.a */
public abstract class C4179a extends C3930a {

    /* renamed from: f */
    public final String f10116f;

    public C4179a(String str, String str2, C4129c cVar, C4127a aVar, String str3) {
        super(str, str2, cVar, aVar);
        this.f10116f = str3;
    }

    /* renamed from: a */
    public boolean mo10378a(C4172a aVar, boolean z) {
        if (z) {
            C4128b a = mo10119a();
            a.f9996d.put("X-CRASHLYTICS-ORG-ID", aVar.f10082a);
            a.f9996d.put("X-CRASHLYTICS-GOOGLE-APP-ID", aVar.f10083b);
            a.f9996d.put("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
            a.f9996d.put("X-CRASHLYTICS-API-CLIENT-VERSION", this.f10116f);
            a.mo10326a("org_id", aVar.f10082a);
            a.mo10326a("app[identifier]", aVar.f10084c);
            a.mo10326a("app[name]", aVar.f10088g);
            a.mo10326a("app[display_version]", aVar.f10085d);
            a.mo10326a("app[build_version]", aVar.f10086e);
            a.mo10326a("app[source]", Integer.toString(aVar.f10089h));
            a.mo10326a("app[minimum_sdk_version]", aVar.f10090i);
            a.mo10326a("app[built_sdk_version]", aVar.f10091j);
            if (!C3944g.m9366b(aVar.f10087f)) {
                a.mo10326a("app[instance_identifier]", aVar.f10087f);
            }
            C3913b bVar = C3913b.f9552c;
            StringBuilder a2 = C1965a.m4756a("Sending app info to ");
            a2.append(this.f9582a);
            bVar.mo10108a(a2.toString());
            try {
                C4130d a3 = a.mo10328a();
                int i = a3.f9998a;
                String str = "POST".equalsIgnoreCase(a.f9993a.name()) ? "Create" : "Update";
                C3913b bVar2 = C3913b.f9552c;
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" app request ID: ");
                sb.append(a3.f10000c.mo11366a("X-REQUEST-ID"));
                bVar2.mo10108a(sb.toString());
                C3913b bVar3 = C3913b.f9552c;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Result was ");
                sb2.append(i);
                bVar3.mo10108a(sb2.toString());
                return C2286e.m5335f(i) == 0;
            } catch (IOException e) {
                C3913b bVar4 = C3913b.f9552c;
                if (bVar4.mo10110a(6)) {
                    Log.e(bVar4.f9553a, "HTTP request failed.", e);
                }
                throw new RuntimeException(e);
            }
        } else {
            throw new RuntimeException("An invalid data collection token was used.");
        }
    }
}
