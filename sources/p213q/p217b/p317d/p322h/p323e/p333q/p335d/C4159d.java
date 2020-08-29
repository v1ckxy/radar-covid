package p213q.p217b.p317d.p322h.p323e.p333q.p335d;

import java.io.File;
import java.io.IOException;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p317d.p322h.p323e.C3913b;
import p213q.p217b.p317d.p322h.p323e.p326k.C3930a;
import p213q.p217b.p317d.p322h.p323e.p330n.C4127a;
import p213q.p217b.p317d.p322h.p323e.p330n.C4128b;
import p213q.p217b.p317d.p322h.p323e.p330n.C4129c;
import p213q.p217b.p317d.p322h.p323e.p333q.p334c.C4151a;
import p213q.p217b.p317d.p322h.p323e.p333q.p334c.C4153c;

/* renamed from: q.b.d.h.e.q.d.d */
public class C4159d extends C3930a implements C4157b {

    /* renamed from: f */
    public final String f10057f;

    public C4159d(String str, String str2, C4129c cVar, String str3) {
        super(str, str2, cVar, C4127a.POST);
        this.f10057f = str3;
    }

    /* renamed from: a */
    public boolean mo10366a(C4151a aVar, boolean z) {
        File[] b;
        String str;
        String str2;
        if (z) {
            C4128b a = mo10119a();
            String str3 = aVar.f10045b;
            a.f9996d.put("User-Agent", "Crashlytics Android SDK/17.1.1");
            a.f9996d.put("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
            a.f9996d.put("X-CRASHLYTICS-API-CLIENT-VERSION", this.f10057f);
            a.f9996d.put("X-CRASHLYTICS-GOOGLE-APP-ID", str3);
            String str4 = aVar.f10044a;
            C4153c cVar = aVar.f10046c;
            if (str4 != null) {
                a.mo10326a("org_id", str4);
            }
            a.mo10326a("report_id", cVar.mo10362d());
            for (File file : cVar.mo10360b()) {
                if (file.getName().equals("minidump")) {
                    str2 = file.getName();
                    str = "minidump_file";
                } else if (file.getName().equals("metadata")) {
                    str2 = file.getName();
                    str = "crash_meta_file";
                } else if (file.getName().equals("binaryImages")) {
                    str2 = file.getName();
                    str = "binary_images_file";
                } else if (file.getName().equals("session")) {
                    str2 = file.getName();
                    str = "session_meta_file";
                } else if (file.getName().equals("app")) {
                    str2 = file.getName();
                    str = "app_meta_file";
                } else if (file.getName().equals("device")) {
                    str2 = file.getName();
                    str = "device_meta_file";
                } else if (file.getName().equals("os")) {
                    str2 = file.getName();
                    str = "os_meta_file";
                } else if (file.getName().equals("user")) {
                    str2 = file.getName();
                    str = "user_meta_file";
                } else if (file.getName().equals("logs")) {
                    str2 = file.getName();
                    str = "logs_file";
                } else if (file.getName().equals("keys")) {
                    str2 = file.getName();
                    str = "keys_file";
                }
                a.mo10327a(str, str2, "application/octet-stream", file);
            }
            C3913b bVar = C3913b.f9552c;
            StringBuilder a2 = C1965a.m4756a("Sending report to: ");
            a2.append(this.f9582a);
            bVar.mo10108a(a2.toString());
            try {
                int i = a.mo10328a().f9998a;
                C3913b bVar2 = C3913b.f9552c;
                StringBuilder sb = new StringBuilder();
                sb.append("Result was: ");
                sb.append(i);
                bVar2.mo10108a(sb.toString());
                if (C2286e.m5335f(i) == 0) {
                    return true;
                }
                return false;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            throw new RuntimeException("An invalid data collection token was used.");
        }
    }
}
