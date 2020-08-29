package p213q.p217b.p317d.p322h.p323e.p337s;

import java.util.Locale;
import org.json.JSONObject;
import p213q.p217b.p317d.p322h.p323e.p326k.C3999x0;
import p213q.p217b.p317d.p322h.p323e.p337s.p338i.C4173b;
import p213q.p217b.p317d.p322h.p323e.p337s.p338i.C4174c;
import p213q.p217b.p317d.p322h.p323e.p337s.p338i.C4175d;
import p213q.p217b.p317d.p322h.p323e.p337s.p338i.C4177f;

/* renamed from: q.b.d.h.e.s.h */
public class C4171h implements C4170g {
    /* renamed from: a */
    public C4177f mo10369a(C3999x0 x0Var, JSONObject jSONObject) {
        String str;
        long j;
        JSONObject jSONObject2 = jSONObject;
        int optInt = jSONObject2.optInt("settings_version", 0);
        int optInt2 = jSONObject2.optInt("cache_duration", 3600);
        JSONObject jSONObject3 = jSONObject2.getJSONObject("fabric");
        JSONObject jSONObject4 = jSONObject2.getJSONObject("app");
        String string = jSONObject4.getString("status");
        boolean equals = "new".equals(string);
        String string2 = jSONObject3.getString("bundle_id");
        String string3 = jSONObject3.getString("org_id");
        if (equals) {
            str = "https://update.crashlytics.com/spi/v1/platforms/android/apps";
        } else {
            str = String.format(Locale.US, "https://update.crashlytics.com/spi/v1/platforms/android/apps/%s", new Object[]{string2});
        }
        C4173b bVar = new C4173b(string, str, String.format(Locale.US, "https://reports.crashlytics.com/spi/v1/platforms/android/apps/%s/reports", new Object[]{string2}), String.format(Locale.US, "https://reports.crashlytics.com/sdk-api/v1/platforms/android/apps/%s/minidumps", new Object[]{string2}), string2, string3, jSONObject4.optBoolean("update_required", false), jSONObject4.optInt("report_upload_variant", 0), jSONObject4.optInt("native_report_upload_variant", 0));
        C4175d dVar = new C4175d(8, 4);
        C4174c cVar = new C4174c(jSONObject2.getJSONObject("features").optBoolean("collect_reports", true));
        long j2 = (long) optInt2;
        String str2 = "expires_at";
        if (jSONObject2.has(str2)) {
            j = jSONObject2.optLong(str2);
        } else if (x0Var != null) {
            j = (j2 * 1000) + System.currentTimeMillis();
        } else {
            throw null;
        }
        C4177f fVar = new C4177f(j, bVar, dVar, cVar, optInt, optInt2);
        return fVar;
    }
}
