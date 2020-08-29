package p213q.p217b.p317d.p322h.p323e.p337s;

import org.json.JSONObject;
import p213q.p217b.p317d.p322h.p323e.p326k.C3999x0;
import p213q.p217b.p317d.p322h.p323e.p337s.p338i.C4173b;
import p213q.p217b.p317d.p322h.p323e.p337s.p338i.C4174c;
import p213q.p217b.p317d.p322h.p323e.p337s.p338i.C4175d;
import p213q.p217b.p317d.p322h.p323e.p337s.p338i.C4177f;

/* renamed from: q.b.d.h.e.s.b */
public class C4164b implements C4170g {
    /* renamed from: a */
    public C4177f mo10369a(C3999x0 x0Var, JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        int optInt = jSONObject2.optInt("settings_version", 0);
        int optInt2 = jSONObject2.optInt("cache_duration", 3600);
        JSONObject jSONObject3 = jSONObject2.getJSONObject("app");
        C4173b bVar = new C4173b(jSONObject3.getString("status"), jSONObject3.getString("url"), jSONObject3.getString("reports_url"), jSONObject3.getString("ndk_reports_url"), jSONObject3.optBoolean("update_required", false));
        C4177f fVar = new C4177f(m9635a(x0Var, (long) optInt2, jSONObject2), bVar, new C4175d(jSONObject2.getJSONObject("session").optInt("max_custom_exception_events", 8), 4), new C4174c(jSONObject2.getJSONObject("features").optBoolean("collect_reports", true)), optInt, optInt2);
        return fVar;
    }

    /* renamed from: a */
    public static long m9635a(C3999x0 x0Var, long j, JSONObject jSONObject) {
        String str = "expires_at";
        if (jSONObject.has(str)) {
            return jSONObject.optLong(str);
        }
        if (x0Var != null) {
            return (j * 1000) + System.currentTimeMillis();
        }
        throw null;
    }
}
