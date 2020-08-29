package p213q.p217b.p317d.p322h.p323e.p333q.p335d;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Map.Entry;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p317d.p322h.p323e.C3913b;
import p213q.p217b.p317d.p322h.p323e.p326k.C3930a;
import p213q.p217b.p317d.p322h.p323e.p330n.C4127a;
import p213q.p217b.p317d.p322h.p323e.p330n.C4128b;
import p213q.p217b.p317d.p322h.p323e.p330n.C4129c;
import p213q.p217b.p317d.p322h.p323e.p330n.C4130d;
import p213q.p217b.p317d.p322h.p323e.p333q.p334c.C4151a;
import p213q.p217b.p317d.p322h.p323e.p333q.p334c.C4153c;

/* renamed from: q.b.d.h.e.q.d.c */
public class C4158c extends C3930a implements C4157b {

    /* renamed from: f */
    public final String f10056f;

    public C4158c(String str, String str2, C4129c cVar, String str3) {
        super(str, str2, cVar, C4127a.POST);
        this.f10056f = str3;
    }

    /* renamed from: a */
    public boolean mo10366a(C4151a aVar, boolean z) {
        File[] b;
        if (z) {
            C4128b a = mo10119a();
            a.f9996d.put("X-CRASHLYTICS-GOOGLE-APP-ID", aVar.f10045b);
            a.f9996d.put("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
            a.f9996d.put("X-CRASHLYTICS-API-CLIENT-VERSION", this.f10056f);
            for (Entry entry : aVar.f10046c.mo10359a().entrySet()) {
                a.f9996d.put((String) entry.getKey(), (String) entry.getValue());
            }
            C4153c cVar = aVar.f10046c;
            a.mo10326a("report[identifier]", cVar.mo10362d());
            String str = "application/octet-stream";
            String str2 = " to report ";
            if (cVar.mo10360b().length == 1) {
                C3913b bVar = C3913b.f9552c;
                StringBuilder a2 = C1965a.m4756a("Adding single file ");
                a2.append(cVar.mo10361c());
                a2.append(str2);
                a2.append(cVar.mo10362d());
                bVar.mo10108a(a2.toString());
                a.mo10327a("report[file]", cVar.mo10361c(), str, cVar.mo10363e());
            } else {
                int i = 0;
                for (File file : cVar.mo10360b()) {
                    C3913b bVar2 = C3913b.f9552c;
                    StringBuilder a3 = C1965a.m4756a("Adding file ");
                    a3.append(file.getName());
                    a3.append(str2);
                    a3.append(cVar.mo10362d());
                    bVar2.mo10108a(a3.toString());
                    StringBuilder sb = new StringBuilder();
                    sb.append("report[file");
                    sb.append(i);
                    sb.append("]");
                    a.mo10327a(sb.toString(), file.getName(), str, file);
                    i++;
                }
            }
            C3913b bVar3 = C3913b.f9552c;
            StringBuilder a4 = C1965a.m4756a("Sending report to: ");
            a4.append(this.f9582a);
            bVar3.mo10108a(a4.toString());
            try {
                C4130d a5 = a.mo10328a();
                int i2 = a5.f9998a;
                C3913b bVar4 = C3913b.f9552c;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Create report request ID: ");
                sb2.append(a5.f10000c.mo11366a("X-REQUEST-ID"));
                bVar4.mo10108a(sb2.toString());
                C3913b bVar5 = C3913b.f9552c;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Result was: ");
                sb3.append(i2);
                bVar5.mo10108a(sb3.toString());
                if (C2286e.m5335f(i2) == 0) {
                    return true;
                }
                return false;
            } catch (IOException e) {
                C3913b bVar6 = C3913b.f9552c;
                if (bVar6.mo10110a(6)) {
                    Log.e(bVar6.f9553a, "Create report HTTP request failed.", e);
                }
                throw new RuntimeException(e);
            }
        } else {
            throw new RuntimeException("An invalid data collection token was used.");
        }
    }
}
