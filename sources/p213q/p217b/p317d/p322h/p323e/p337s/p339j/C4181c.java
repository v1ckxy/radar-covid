package p213q.p217b.p317d.p322h.p323e.p337s.p339j;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p317d.p322h.p323e.C3913b;
import p213q.p217b.p317d.p322h.p323e.p326k.C3930a;
import p213q.p217b.p317d.p322h.p323e.p326k.C3944g;
import p213q.p217b.p317d.p322h.p323e.p326k.C3970q0;
import p213q.p217b.p317d.p322h.p323e.p330n.C4127a;
import p213q.p217b.p317d.p322h.p323e.p330n.C4128b;
import p213q.p217b.p317d.p322h.p323e.p330n.C4129c;
import p213q.p217b.p317d.p322h.p323e.p330n.C4130d;
import p213q.p217b.p317d.p322h.p323e.p337s.p338i.C4178g;

/* renamed from: q.b.d.h.e.s.j.c */
public class C4181c extends C3930a implements C4182d {

    /* renamed from: f */
    public C3913b f10117f;

    public C4181c(String str, String str2, C4129c cVar) {
        C4127a aVar = C4127a.GET;
        C3913b bVar = C3913b.f9552c;
        super(str, str2, cVar, aVar);
        this.f10117f = bVar;
    }

    /* renamed from: a */
    public final Map<String, String> mo10379a(C4178g gVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", gVar.f10114h);
        hashMap.put("display_version", gVar.f10113g);
        hashMap.put("source", Integer.toString(gVar.f10115i));
        String str = gVar.f10112f;
        if (!C3944g.m9366b(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    /* renamed from: a */
    public final C4128b mo10381a(C4128b bVar, C4178g gVar) {
        mo10382a(bVar, "X-CRASHLYTICS-GOOGLE-APP-ID", gVar.f10107a);
        mo10382a(bVar, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        mo10382a(bVar, "X-CRASHLYTICS-API-CLIENT-VERSION", "17.1.1");
        mo10382a(bVar, "Accept", "application/json");
        mo10382a(bVar, "X-CRASHLYTICS-DEVICE-MODEL", gVar.f10108b);
        mo10382a(bVar, "X-CRASHLYTICS-OS-BUILD-VERSION", gVar.f10109c);
        mo10382a(bVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", gVar.f10110d);
        mo10382a(bVar, "X-CRASHLYTICS-INSTALLATION-ID", ((C3970q0) gVar.f10111e).mo10158a());
        return bVar;
    }

    /* renamed from: a */
    public final void mo10382a(C4128b bVar, String str, String str2) {
        if (str2 != null) {
            bVar.f9996d.put(str, str2);
        }
    }

    /* renamed from: a */
    public JSONObject mo10380a(C4130d dVar) {
        int i = dVar.f9998a;
        C3913b bVar = this.f10117f;
        StringBuilder sb = new StringBuilder();
        sb.append("Settings result was: ");
        sb.append(i);
        bVar.mo10108a(sb.toString());
        if (i == 200 || i == 201 || i == 202 || i == 203) {
            String str = dVar.f9999b;
            try {
                return new JSONObject(str);
            } catch (Exception e) {
                C3913b bVar2 = this.f10117f;
                StringBuilder a = C1965a.m4756a("Failed to parse settings JSON from ");
                a.append(this.f9582a);
                bVar2.mo10109a(a.toString(), e);
                C1965a.m4759a("Settings response ", str, this.f10117f);
                return null;
            }
        } else {
            C3913b bVar3 = this.f10117f;
            StringBuilder a2 = C1965a.m4756a("Failed to retrieve settings from ");
            a2.append(this.f9582a);
            bVar3.mo10111b(a2.toString());
            return null;
        }
    }
}
