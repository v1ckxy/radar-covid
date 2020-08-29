package p213q.p217b.p317d.p322h.p323e.p326k;

import java.io.File;
import java.nio.charset.Charset;
import org.json.JSONObject;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: q.b.d.h.e.k.t0 */
public class C3991t0 {

    /* renamed from: a */
    public final File f9758a;

    static {
        Charset.forName("UTF-8");
    }

    public C3991t0(File file) {
        this.f9758a = file;
    }

    /* renamed from: b */
    public static C4001y0 m9430b(String str) {
        JSONObject jSONObject = new JSONObject(str);
        C4001y0 y0Var = new C4001y0();
        String str2 = "userId";
        String str3 = null;
        if (!jSONObject.isNull(str2)) {
            str3 = jSONObject.optString(str2, null);
        }
        if (str3 != null) {
            str3 = str3.trim();
            if (str3.length() > 1024) {
                str3 = str3.substring(0, 1024);
            }
        }
        y0Var.f9782a = str3;
        return y0Var;
    }

    /* renamed from: a */
    public File mo10193a(String str) {
        return new File(this.f9758a, C1965a.m4752a(str, "user", ".meta"));
    }
}
