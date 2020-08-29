package p213q.p217b.p317d.p347l;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p116io.jsonwebtoken.lang.Objects;

/* renamed from: q.b.d.l.z */
public final class C4272z {

    /* renamed from: d */
    public static final long f10277d = TimeUnit.DAYS.toMillis(7);

    /* renamed from: a */
    public final String f10278a;

    /* renamed from: b */
    public final String f10279b;

    /* renamed from: c */
    public final long f10280c;

    public C4272z(String str, String str2, long j) {
        this.f10278a = str;
        this.f10279b = str2;
        this.f10280c = j;
    }

    /* renamed from: a */
    public static String m9765a(String str, String str2, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j);
            return jSONObject.toString();
        } catch (JSONException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(valueOf.length() + 24);
            sb.append("Failed to encode token: ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    /* renamed from: a */
    public static C4272z m9766a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith(Objects.ARRAY_START)) {
            return new C4272z(str, null, 0);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new C4272z(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
        } catch (JSONException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(valueOf.length() + 23);
            sb.append("Failed to parse token: ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }
}
